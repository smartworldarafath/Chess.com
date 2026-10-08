package androidx.compose.p001foundation.gestures;

import androidx.compose.p001foundation.MutatePriority;
import androidx.compose.p001foundation.gestures.ScrollableKt;
import androidx.compose.ui.input.pointer.j;
import com.google.android.q22;
import com.google.inputmethod.bab;
import com.google.inputmethod.f43;
import com.google.inputmethod.fu0;
import com.google.inputmethod.hab;
import com.google.inputmethod.p9b;
import com.google.inputmethod.qg4;
import com.google.inputmethod.r48;
import com.google.inputmethod.rn8;
import com.google.inputmethod.rz7;
import com.google.inputmethod.t04;
import com.google.inputmethod.zv8;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001aO\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001ae\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001c\u0010\u0017\u001a\u00020\u0015*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018\"&\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00050\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"\u001a\u0010)\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u001a\u0010/\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0018\u00102\u001a\u00020\u0005*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/hab;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Lcom/google/android/qg4;", "flingBehavior", "Lcom/google/android/r48;", "interactionSource", "k", "(Landroidx/compose/ui/b;Lcom/google/android/hab;Landroidx/compose/foundation/gestures/Orientation;ZZLcom/google/android/qg4;Lcom/google/android/r48;)Landroidx/compose/ui/b;", "Lcom/google/android/zv8;", "overscrollEffect", "Lcom/google/android/fu0;", "bringIntoViewSpec", "j", "(Landroidx/compose/ui/b;Lcom/google/android/hab;Landroidx/compose/foundation/gestures/Orientation;Lcom/google/android/zv8;ZZLcom/google/android/qg4;Lcom/google/android/r48;Lcom/google/android/fu0;)Landroidx/compose/ui/b;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "Lcom/google/android/rn8;", "offset", "n", "(Landroidx/compose/foundation/gestures/ScrollingLogic;JLcom/google/android/q22;)Ljava/lang/Object;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/j;", "a", "Lkotlin/jvm/functions/Function1;", "f", "()Lkotlin/jvm/functions/Function1;", "CanDragCalculation", "Lcom/google/android/p9b;", "b", "Lcom/google/android/p9b;", "NoOpScrollScope", "Lcom/google/android/rz7;", "c", "Lcom/google/android/rz7;", "g", "()Lcom/google/android/rz7;", "DefaultScrollMotionDurationScale", "Lcom/google/android/f43;", "d", "Lcom/google/android/f43;", "i", "()Lcom/google/android/f43;", "UnityDensity", "h", "(Lcom/google/android/qg4;)Z", "shouldBeTriggeredByMouseWheel", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ScrollableKt {
    private static final Function1<j, Boolean> a = new Function1() { // from class: com.google.android.dab
        public final Object invoke(Object obj) {
            return Boolean.valueOf(ScrollableKt.b((j) obj));
        }
    };
    private static final p9b b = new b();
    private static final rz7 c = new a();
    private static final f43 d = new c();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/ScrollableKt$a", "Lcom/google/android/rz7;", "", "B0", "()F", "scaleFactor", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements rz7 {
        a() {
        }

        @Override // com.google.inputmethod.rz7
        public float B0() {
            return 1.0f;
        }

        public /* bridge */ <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) rz7.a.a(this, r, function2);
        }

        public /* bridge */ <E extends CoroutineContext.Element> E get(CoroutineContext.b<E> bVar) {
            return (E) rz7.a.b(this, bVar);
        }

        public /* bridge */ CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
            return rz7.a.c(this, bVar);
        }

        public /* bridge */ CoroutineContext plus(CoroutineContext coroutineContext) {
            return rz7.a.d(this, coroutineContext);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/ScrollableKt$b", "Lcom/google/android/p9b;", "", "pixels", "e", "(F)F", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements p9b {
        b() {
        }

        @Override // com.google.inputmethod.p9b
        public float e(float pixels) {
            return pixels;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"androidx/compose/foundation/gestures/ScrollableKt$c", "Lcom/google/android/f43;", "", "getDensity", "()F", "density", "w2", "fontScale", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements f43 {
        c() {
        }

        @Override // com.google.inputmethod.f43
        public float getDensity() {
            return 1.0f;
        }

        @Override // com.google.inputmethod.hm4
        /* JADX INFO: renamed from: w2 */
        public float getFontScale() {
            return 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(j jVar) {
        return !(jVar == null ? false : j.i(jVar.getValue(), j.INSTANCE.b()));
    }

    public static final Function1<j, Boolean> f() {
        return a;
    }

    public static final rz7 g() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(qg4 qg4Var) {
        return !(qg4Var instanceof bab);
    }

    public static final f43 i() {
        return d;
    }

    public static final androidx.compose.ui.b j(androidx.compose.ui.b bVar, hab habVar, Orientation orientation, zv8 zv8Var, boolean z, boolean z2, qg4 qg4Var, r48 r48Var, fu0 fu0Var) {
        return bVar.then(new r(habVar, orientation, zv8Var, z, z2, qg4Var, r48Var, fu0Var));
    }

    public static final androidx.compose.ui.b k(androidx.compose.ui.b bVar, hab habVar, Orientation orientation, boolean z, boolean z2, qg4 qg4Var, r48 r48Var) {
        return l(bVar, habVar, orientation, null, z, z2, qg4Var, r48Var, null, 128, null);
    }

    public static /* synthetic */ androidx.compose.ui.b l(androidx.compose.ui.b bVar, hab habVar, Orientation orientation, zv8 zv8Var, boolean z, boolean z2, qg4 qg4Var, r48 r48Var, fu0 fu0Var, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return j(bVar, habVar, orientation, zv8Var, z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : qg4Var, (i & 64) != 0 ? null : r48Var, (i & 128) != 0 ? null : fu0Var);
    }

    public static /* synthetic */ androidx.compose.ui.b m(androidx.compose.ui.b bVar, hab habVar, Orientation orientation, boolean z, boolean z2, qg4 qg4Var, r48 r48Var, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        return k(bVar, habVar, orientation, z3, z2, (i & 16) != 0 ? null : qg4Var, (i & 32) != 0 ? null : r48Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object n(ScrollingLogic scrollingLogic, long j, q22<? super rn8> q22Var) {
        ScrollableKt$semanticsScrollBy$1 scrollableKt$semanticsScrollBy$1;
        Ref.FloatRef floatRef;
        ScrollingLogic scrollingLogic2;
        if (q22Var instanceof ScrollableKt$semanticsScrollBy$1) {
            scrollableKt$semanticsScrollBy$1 = (ScrollableKt$semanticsScrollBy$1) q22Var;
            int i = scrollableKt$semanticsScrollBy$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                scrollableKt$semanticsScrollBy$1.label = i - t04.INVALID_ID;
            } else {
                scrollableKt$semanticsScrollBy$1 = new ScrollableKt$semanticsScrollBy$1(q22Var);
            }
        } else {
            scrollableKt$semanticsScrollBy$1 = new ScrollableKt$semanticsScrollBy$1(q22Var);
        }
        Object obj = scrollableKt$semanticsScrollBy$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = scrollableKt$semanticsScrollBy$1.label;
        if (i2 == 0) {
            f.b(obj);
            floatRef = new Ref.FloatRef();
            MutatePriority mutatePriority = MutatePriority.Default;
            ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(scrollingLogic, j, floatRef, null);
            scrollableKt$semanticsScrollBy$1.L$0 = scrollingLogic;
            scrollableKt$semanticsScrollBy$1.L$1 = floatRef;
            scrollableKt$semanticsScrollBy$1.label = 1;
            if (scrollingLogic.B(mutatePriority, scrollableKt$semanticsScrollBy$2, scrollableKt$semanticsScrollBy$1) == objG) {
                return objG;
            }
            scrollingLogic2 = scrollingLogic;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.FloatRef floatRef2 = (Ref.FloatRef) scrollableKt$semanticsScrollBy$1.L$1;
            ScrollingLogic scrollingLogic3 = (ScrollingLogic) scrollableKt$semanticsScrollBy$1.L$0;
            f.b(obj);
            floatRef = floatRef2;
            scrollingLogic2 = scrollingLogic3;
        }
        return rn8.d(scrollingLogic2.H(floatRef.element));
    }
}
