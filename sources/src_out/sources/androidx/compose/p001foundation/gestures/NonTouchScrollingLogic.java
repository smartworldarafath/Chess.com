package androidx.compose.p001foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.e;
import com.google.android.fec;
import com.google.android.q22;
import com.google.inputmethod.f43;
import com.google.inputmethod.fa3;
import com.google.inputmethod.t04;
import com.google.inputmethod.t3e;
import com.google.inputmethod.ve8;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0007*\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0014\u001a\u00020\u00072\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R6\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\n\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e\"\u0004\b\u001f\u0010\u000eR\"\u0010&\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010+\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/foundation/gestures/NonTouchScrollingLogic;", "", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "Lkotlin/Function2;", "Lcom/google/android/t3e;", "Lcom/google/android/q22;", "", "onScrollStopped", "Lcom/google/android/f43;", "density", "<init>", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Lkotlin/jvm/functions/Function2;Lcom/google/android/f43;)V", "g", "(Lcom/google/android/f43;)V", "Landroidx/compose/ui/input/pointer/e;", "a", "(Landroidx/compose/ui/input/pointer/e;)V", "Lcom/google/android/ve8;", "block", "h", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "d", "()Landroidx/compose/foundation/gestures/ScrollingLogic;", "b", "Lkotlin/jvm/functions/Function2;", "c", "()Lkotlin/jvm/functions/Function2;", "Lcom/google/android/f43;", "()Lcom/google/android/f43;", "setDensity", "", "Z", "f", "()Z", "setScrolling$foundation", "(Z)V", "isScrolling", "Lcom/google/android/fa3;", "e", "Lcom/google/android/fa3;", "()Lcom/google/android/fa3;", "velocityTracker", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class NonTouchScrollingLogic {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ScrollingLogic scrollingLogic;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function2<t3e, q22<? super Unit>, Object> onScrollStopped;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private f43 density;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isScrolling;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final fa3 velocityTracker = new fa3();

    /* JADX WARN: Multi-variable type inference failed */
    public NonTouchScrollingLogic(ScrollingLogic scrollingLogic, Function2<? super t3e, ? super q22<? super Unit>, ? extends Object> function2, f43 f43Var) {
        this.scrollingLogic = scrollingLogic;
        this.onScrollStopped = function2;
        this.density = f43Var;
    }

    public final void a(e eVar) {
        List<PointerInputChange> listC = eVar.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            listC.get(i).a();
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    protected final f43 getDensity() {
        return this.density;
    }

    protected final Function2<t3e, q22<? super Unit>, Object> c() {
        return this.onScrollStopped;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    protected final ScrollingLogic getScrollingLogic() {
        return this.scrollingLogic;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final fa3 getVelocityTracker() {
        return this.velocityTracker;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsScrolling() {
        return this.isScrolling;
    }

    public final void g(f43 density) {
        this.density = density;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Function2<? super ve8, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) {
        NonTouchScrollingLogic$userScroll$1 nonTouchScrollingLogic$userScroll$1;
        if (q22Var instanceof NonTouchScrollingLogic$userScroll$1) {
            nonTouchScrollingLogic$userScroll$1 = (NonTouchScrollingLogic$userScroll$1) q22Var;
            int i = nonTouchScrollingLogic$userScroll$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                nonTouchScrollingLogic$userScroll$1.label = i - t04.INVALID_ID;
            } else {
                nonTouchScrollingLogic$userScroll$1 = new NonTouchScrollingLogic$userScroll$1(this, q22Var);
            }
        } else {
            nonTouchScrollingLogic$userScroll$1 = new NonTouchScrollingLogic$userScroll$1(this, q22Var);
        }
        Object obj = nonTouchScrollingLogic$userScroll$1.result;
        Object objG = a.g();
        int i2 = nonTouchScrollingLogic$userScroll$1.label;
        if (i2 == 0) {
            f.b(obj);
            this.isScrolling = true;
            NonTouchScrollingLogic$userScroll$2 nonTouchScrollingLogic$userScroll$2 = new NonTouchScrollingLogic$userScroll$2(this, function2, null);
            nonTouchScrollingLogic$userScroll$1.label = 1;
            if (fec.c(nonTouchScrollingLogic$userScroll$2, nonTouchScrollingLogic$userScroll$1) == objG) {
                return objG;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        this.isScrolling = false;
        return Unit.a;
    }
}
