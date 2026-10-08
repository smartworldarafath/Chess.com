package androidx.compose.ui.scrollcapture;

import com.google.android.q22;
import com.google.android.sh7;
import com.google.android.ut0;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0017\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R0\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/ui/scrollcapture/RelativeScroller;", "", "", "viewportSize", "Lkotlin/Function2;", "", "Lcom/google/android/q22;", "scrollBy", "<init>", "(ILkotlin/jvm/functions/Function2;)V", "delta", "", "e", "(FLcom/google/android/q22;)Ljava/lang/Object;", "d", "()V", "min", "max", "f", "(IILcom/google/android/q22;)Ljava/lang/Object;", "offset", "c", "(I)I", "g", "a", "I", "b", "Lkotlin/jvm/functions/Function2;", "value", "F", "()F", "scrollAmount", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class RelativeScroller {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int viewportSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function2<Float, q22<? super Float>, Object> scrollBy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float scrollAmount;

    /* JADX WARN: Multi-variable type inference failed */
    public RelativeScroller(int i, Function2<? super Float, ? super q22<? super Float>, ? extends Object> function2) {
        this.viewportSize = i;
        this.scrollBy = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(float f, q22<? super Unit> q22Var) {
        RelativeScroller$scrollBy$1 relativeScroller$scrollBy$1;
        if (q22Var instanceof RelativeScroller$scrollBy$1) {
            relativeScroller$scrollBy$1 = (RelativeScroller$scrollBy$1) q22Var;
            int i = relativeScroller$scrollBy$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                relativeScroller$scrollBy$1.label = i - t04.INVALID_ID;
            } else {
                relativeScroller$scrollBy$1 = new RelativeScroller$scrollBy$1(this, q22Var);
            }
        } else {
            relativeScroller$scrollBy$1 = new RelativeScroller$scrollBy$1(this, q22Var);
        }
        Object objInvoke = relativeScroller$scrollBy$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = relativeScroller$scrollBy$1.label;
        if (i2 == 0) {
            f.b(objInvoke);
            Function2<Float, q22<? super Float>, Object> function2 = this.scrollBy;
            Float fD = ut0.d(f);
            relativeScroller$scrollBy$1.label = 1;
            objInvoke = function2.invoke(fD, relativeScroller$scrollBy$1);
            if (objInvoke == objG) {
                return objG;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(objInvoke);
        }
        this.scrollAmount += ((Number) objInvoke).floatValue();
        return Unit.a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getScrollAmount() {
        return this.scrollAmount;
    }

    public final int c(int offset) {
        return g.o(offset - sh7.d(this.scrollAmount), 0, this.viewportSize);
    }

    public final void d() {
        this.scrollAmount = 0.0f;
    }

    public final Object f(int i, int i2, q22<? super Unit> q22Var) {
        Object objG;
        if (i > i2) {
            throw new IllegalArgumentException(("Expected min=" + i + " ≤ max=" + i2).toString());
        }
        int i3 = i2 - i;
        int i4 = this.viewportSize;
        if (i3 <= i4) {
            float f = i;
            float f2 = this.scrollAmount;
            return ((f < f2 || ((float) i2) > f2 + ((float) i4)) && (objG = g((float) ((i + (i3 / 2)) - (i4 / 2)), q22Var)) == kotlin.coroutines.intrinsics.a.g()) ? objG : Unit.a;
        }
        throw new IllegalArgumentException(("Expected range (" + i3 + ") to be ≤ viewportSize=" + this.viewportSize).toString());
    }

    public final Object g(float f, q22<? super Unit> q22Var) {
        Object objE = e(f - this.scrollAmount, q22Var);
        return objE == kotlin.coroutines.intrinsics.a.g() ? objE : Unit.a;
    }
}
