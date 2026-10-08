package androidx.compose.p001foundation.pager;

import androidx.compose.p000animation.core.SuspendAnimationKt;
import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.pager.j;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.inputmethod.dfa;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fj7;
import com.google.inputmethod.jz8;
import com.google.inputmethod.k0b;
import com.google.inputmethod.kr;
import com.google.inputmethod.nx1;
import com.google.inputmethod.p9b;
import com.google.inputmethod.qu6;
import com.google.inputmethod.uc;
import com.google.inputmethod.wy8;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.collections.m;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000_\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\n*\u0001$\u001a1\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\n\u001a\u00020\t*\u00020\u0006H\u0080@¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\t*\u00020\u0006H\u0080@¢\u0006\u0004\b\f\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0012\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001aL\u0010\u001c\u001a\u00020\t*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001d\"\u001a\u0010#\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u001a\u0010,\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"", "initialPage", "", "initialPageOffsetFraction", "Lkotlin/Function0;", "pageCount", "Landroidx/compose/foundation/pager/PagerState;", "n", "(IFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;II)Landroidx/compose/foundation/pager/PagerState;", "", "h", "(Landroidx/compose/foundation/pager/PagerState;Lcom/google/android/q22;)Ljava/lang/Object;", "i", "Lcom/google/android/wy8;", "", "j", "(Lcom/google/android/wy8;I)J", "Lcom/google/android/jz8;", "k", "(Lcom/google/android/jz8;I)J", "Lcom/google/android/qu6;", "targetPage", "targetPageOffsetToSnappedPosition", "Lcom/google/android/kr;", "animationSpec", "Lkotlin/Function2;", "Lcom/google/android/p9b;", "updateTargetPage", "f", "(Lcom/google/android/qu6;IFLcom/google/android/kr;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/ff3;", "a", "F", "l", "()F", "DefaultPositionThreshold", "androidx/compose/foundation/pager/j$b", "b", "Landroidx/compose/foundation/pager/j$b;", "UnitDensity", "c", "Lcom/google/android/jz8;", "m", "()Lcom/google/android/jz8;", "EmptyLayoutInfo", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {
    private static final float a = ff3.i(56);
    private static final b b;
    private static final jz8 c;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"androidx/compose/foundation/pager/j$a", "Lcom/google/android/fj7;", "", "l", "()V", "", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "Lcom/google/android/uc;", "c", "Ljava/util/Map;", "j", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements fj7 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int height;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Map<uc, Integer> alignmentLines = b0.j();

        a() {
        }

        @Override // com.google.inputmethod.fj7
        /* JADX INFO: renamed from: getHeight, reason: from getter */
        public int getB() {
            return this.height;
        }

        @Override // com.google.inputmethod.fj7
        /* JADX INFO: renamed from: getWidth, reason: from getter */
        public int getA() {
            return this.width;
        }

        @Override // com.google.inputmethod.fj7
        public Map<uc, Integer> j() {
            return this.alignmentLines;
        }

        @Override // com.google.inputmethod.fj7
        public void l() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"androidx/compose/foundation/pager/j$b", "Lcom/google/android/f43;", "", "a", "F", "getDensity", "()F", "density", "b", "w2", "fontScale", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements f43 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float density = 1.0f;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float fontScale = 1.0f;

        b() {
        }

        @Override // com.google.inputmethod.f43
        public float getDensity() {
            return this.density;
        }

        @Override // com.google.inputmethod.hm4
        /* JADX INFO: renamed from: w2, reason: from getter */
        public float getFontScale() {
            return this.fontScale;
        }
    }

    static {
        b bVar = new b();
        b = bVar;
        c = new jz8(m.p(), 0, 0, 0, Orientation.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, androidx.compose.foundation.gestures.snapping.j.b.a, new a(), false, null, null, kotlinx.coroutines.j.a(EmptyCoroutineContext.a), bVar, nx1.b(0, 0, 0, 0, 15, null), 393216, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(final qu6 qu6Var, int i, float f, kr<Float> krVar, Function2<? super p9b, ? super Integer, Unit> function2, q22<? super Unit> q22Var) {
        function2.invoke(qu6Var, ut0.e(i));
        boolean z = i > qu6Var.b();
        int iC = (qu6Var.c() - qu6Var.b()) + 1;
        if (((z && i > qu6Var.c()) || (!z && i < qu6Var.b())) && Math.abs(i - qu6Var.b()) >= 3) {
            qu6Var.d(z ? g.e(i - iC, qu6Var.b()) : g.j(iC + i, qu6Var.b()), 0);
        }
        float fH = qu6.h(qu6Var, i, 0, 2, null) + f;
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        Object objM = SuspendAnimationKt.m(0.0f, fH, 0.0f, krVar, new Function2() { // from class: com.google.android.yz8
            public final Object invoke(Object obj, Object obj2) {
                return j.g(floatRef, qu6Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        }, q22Var, 4, null);
        return objM == kotlin.coroutines.intrinsics.a.g() ? objM : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Ref.FloatRef floatRef, qu6 qu6Var, float f, float f2) {
        floatRef.element += qu6Var.e(f - floatRef.element);
        return Unit.a;
    }

    public static final Object h(PagerState pagerState, q22<? super Unit> q22Var) {
        Object objP;
        return (pagerState.A() + 1 >= pagerState.O() || (objP = PagerState.p(pagerState, pagerState.A() + 1, 0.0f, null, q22Var, 6, null)) != kotlin.coroutines.intrinsics.a.g()) ? Unit.a : objP;
    }

    public static final Object i(PagerState pagerState, q22<? super Unit> q22Var) {
        Object objP;
        return (pagerState.A() + (-1) < 0 || (objP = PagerState.p(pagerState, pagerState.A() + (-1), 0.0f, null, q22Var, 6, null)) != kotlin.coroutines.intrinsics.a.g()) ? Unit.a : objP;
    }

    public static final long j(wy8 wy8Var, int i) {
        long jN = (((((long) i) * ((long) (wy8Var.getPageSpacing() + wy8Var.getPageSize()))) + ((long) wy8Var.e())) + ((long) wy8Var.getAfterContentPadding())) - ((long) wy8Var.getPageSpacing());
        int iB = (int) (wy8Var.getOrientation() == Orientation.Horizontal ? wy8Var.b() >> 32 : wy8Var.b() & 4294967295L);
        return g.f(jN - ((long) (iB - g.o(wy8Var.getSnapPosition().a(iB, wy8Var.getPageSize(), wy8Var.e(), wy8Var.getAfterContentPadding(), i - 1, i), 0, iB))), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(jz8 jz8Var, int i) {
        int iB = (int) (jz8Var.getOrientation() == Orientation.Horizontal ? jz8Var.b() >> 32 : jz8Var.b() & 4294967295L);
        return g.o(jz8Var.getSnapPosition().a(iB, jz8Var.getPageSize(), jz8Var.e(), jz8Var.getAfterContentPadding(), 0, i), 0, iB);
    }

    public static final float l() {
        return a;
    }

    public static final jz8 m() {
        return c;
    }

    public static final PagerState n(final int i, final float f, final Function0<Integer> function0, d dVar, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            f = 0.0f;
        }
        if (e.k()) {
            e.o(-1210768637, i2, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:93)");
        }
        Object[] objArr = new Object[0];
        k0b<d, ?> k0bVarA = d.INSTANCE.a();
        boolean z = true;
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && dVar.C(i)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && dVar.B(f)) || (i2 & 48) == 32);
        if ((((i2 & 896) ^ 384) <= 256 || !dVar.x(function0)) && (i2 & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objR = dVar.R();
        if (z3 || objR == d.INSTANCE.a()) {
            objR = new Function0() { // from class: com.google.android.xz8
                public final Object invoke() {
                    return j.o(i, f, function0);
                }
            };
            dVar.L(objR);
        }
        d dVar2 = (d) dfa.k(objArr, k0bVarA, (Function0) objR, dVar, 0);
        dVar2.J0().setValue(function0);
        if (e.k()) {
            e.n();
        }
        return dVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d o(int i, float f, Function0 function0) {
        return new d(i, f, function0);
    }
}
