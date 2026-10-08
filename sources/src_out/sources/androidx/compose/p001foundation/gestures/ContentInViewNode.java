package androidx.compose.p001foundation.gestures;

import com.google.android.g41;
import com.google.android.oq2;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.sa2;
import com.google.inputmethod.bs1;
import com.google.inputmethod.cs1;
import com.google.inputmethod.cx5;
import com.google.inputmethod.du0;
import com.google.inputmethod.fu0;
import com.google.inputmethod.g16;
import com.google.inputmethod.gba;
import com.google.inputmethod.hu0;
import com.google.inputmethod.hz1;
import com.google.inputmethod.kj7;
import com.google.inputmethod.q16;
import com.google.inputmethod.r16;
import com.google.inputmethod.r58;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.e;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001UB9\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020\t*\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010%J'\u0010(\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0014H\u0002¢\u0006\u0004\b(\u0010)J\u001c\u0010,\u001a\u00020+*\u00020!2\u0006\u0010*\u001a\u00020!H\u0082\u0002¢\u0006\u0004\b,\u0010-J\u001c\u0010/\u001a\u00020+*\u00020.2\u0006\u0010*\u001a\u00020.H\u0082\u0002¢\u0006\u0004\b/\u0010-J\u0017\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u0010 J \u00102\u001a\u00020\u00162\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0096@¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b4\u0010\u0018J'\u00105\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b5\u00106R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010D\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010<R$\u0010P\u001a\u00020!2\u0006\u0010K\u001a\u00020!8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010<R\u0014\u0010T\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010O¨\u0006V"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/du0;", "Lcom/google/android/bs1;", "Lcom/google/android/kj7;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "", "reverseDirection", "Lcom/google/android/fu0;", "bringIntoViewSpec", "Lkotlin/Function0;", "Lcom/google/android/gba;", "getFocusedRect", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollingLogic;ZLcom/google/android/fu0;Lkotlin/jvm/functions/Function0;)V", "G3", "()Lcom/google/android/fu0;", "Lcom/google/android/g16;", "viewportAdjustmentForReverseScroll", "", "D3", "(J)V", "", "v3", "(Lcom/google/android/fu0;J)F", "z3", "()Lcom/google/android/gba;", "childBounds", "y3", "(Lcom/google/android/gba;)Lcom/google/android/gba;", "Lcom/google/android/q16;", "size", "containerOffset", "B3", "(Lcom/google/android/gba;JJ)Z", "containerSize", "Lcom/google/android/rn8;", "F3", "(Lcom/google/android/gba;JJ)J", "other", "", "w3", "(JJ)I", "Lcom/google/android/tsb;", "x3", "localRect", "r0", "W", "(Lkotlin/jvm/functions/Function0;Lcom/google/android/q22;)Ljava/lang/Object;", "f", "H3", "(Landroidx/compose/foundation/gestures/Orientation;ZLcom/google/android/fu0;)V", "p", "Landroidx/compose/foundation/gestures/Orientation;", "q", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "r", "Z", "s", "Lcom/google/android/fu0;", "t", "Lkotlin/jvm/functions/Function0;", "u", "Q2", "()Z", "shouldAutoInvalidate", "Landroidx/compose/foundation/gestures/g;", "v", "Landroidx/compose/foundation/gestures/g;", "bringIntoViewRequests", "w", "trackingFocusedChild", "value", "x", "J", "getViewportSize-YbymL2g$foundation", "()J", "viewportSize", "y", "isAnimationRunning", "A3", "viewportSizeOrZero", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContentInViewNode extends androidx.compose.ui.b.c implements du0, bs1, kj7 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Orientation orientation;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final ScrollingLogic scrollingLogic;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean reverseDirection;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private fu0 bringIntoViewSpec;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private Function0<gba> getFocusedRect;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean trackingFocusedChild;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean isAnimationRunning;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final g bringIntoViewRequests = new g();

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private long viewportSize = hz1.a;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode$a;", "", "Lkotlin/Function0;", "Lcom/google/android/gba;", "currentBounds", "Lcom/google/android/g41;", "", "continuation", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/google/android/g41;)V", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", "Lcom/google/android/g41;", "()Lcom/google/android/g41;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Function0<gba> currentBounds;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final g41<Unit> continuation;

        public a(Function0<gba> function0, g41<? super Unit> g41Var) {
            this.currentBounds = function0;
            this.continuation = g41Var;
        }

        public final g41<Unit> a() {
            return this.continuation;
        }

        public final Function0<gba> b() {
            return this.currentBounds;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0050  */
        public String toString() {
            String str;
            sa2 sa2Var = this.continuation.getContext().get(sa2.c);
            String strU = sa2Var != null ? sa2Var.U() : null;
            StringBuilder sb = new StringBuilder();
            sb.append("Request@");
            String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            sb.append(string);
            if (strU != null) {
                str = '[' + strU + "](";
                if (str == null) {
                    str = "(";
                }
            } else {
                str = "(";
            }
            sb.append(str);
            sb.append("currentBounds()=");
            sb.append(this.currentBounds.invoke());
            sb.append(", continuation=");
            sb.append(this.continuation);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ContentInViewNode(Orientation orientation, ScrollingLogic scrollingLogic, boolean z, fu0 fu0Var, Function0<gba> function0) {
        this.orientation = orientation;
        this.scrollingLogic = scrollingLogic;
        this.reverseDirection = z;
        this.bringIntoViewSpec = fu0Var;
        this.getFocusedRect = function0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final boolean B3(gba gbaVar, long j, long j2) throws NoWhenBranchMatchedException {
        long jF3 = F3(gbaVar, j, j2);
        return Math.abs(Float.intBitsToFloat((int) (jF3 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jF3 & 4294967295L))) <= 0.5f;
    }

    static /* synthetic */ boolean C3(ContentInViewNode contentInViewNode, gba gbaVar, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = contentInViewNode.A3();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = g16.INSTANCE.b();
        }
        return contentInViewNode.B3(gbaVar, j3, j2);
    }

    private final void D3(long viewportAdjustmentForReverseScroll) {
        fu0 fu0VarG3 = G3();
        if (this.isAnimationRunning) {
            cx5.c("launchAnimation called when previous animation was running");
        }
        rw0.d(L2(), (CoroutineContext) null, CoroutineStart.d, new ContentInViewNode$launchAnimation$2(this, new UpdatableAnimationState(G3().a()), fu0VarG3, viewportAdjustmentForReverseScroll, null), 1, (Object) null);
    }

    static /* synthetic */ void E3(ContentInViewNode contentInViewNode, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = g16.INSTANCE.b();
        }
        contentInViewNode.D3(j);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final long F3(gba childBounds, long containerSize, long containerOffset) throws NoWhenBranchMatchedException {
        long jE = r16.e(containerSize);
        int i = b.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return rn8.e((((long) Float.floatToRawIntBits(G3().b(childBounds.getLeft() - g16.k(containerOffset), childBounds.getRight() - childBounds.getLeft(), Float.intBitsToFloat((int) (jE >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
        }
        return rn8.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(G3().b(childBounds.getTop() - g16.l(containerOffset), childBounds.getBottom() - childBounds.getTop(), Float.intBitsToFloat((int) (jE & 4294967295L))))) & 4294967295L));
    }

    private final fu0 G3() {
        fu0 fu0Var = this.bringIntoViewSpec;
        return fu0Var == null ? (fu0) cs1.a(this, hu0.c()) : fu0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final float v3(fu0 bringIntoViewSpec, long viewportAdjustmentForReverseScroll) throws NoWhenBranchMatchedException {
        long j = this.viewportSize;
        gba gbaVarZ3 = z3();
        if (gbaVarZ3 == null) {
            gbaVarZ3 = this.trackingFocusedChild ? (gba) this.getFocusedRect.invoke() : null;
            if (gbaVarZ3 == null) {
                return 0.0f;
            }
        }
        long jE = r16.e(j);
        int i = b.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return bringIntoViewSpec.b(gbaVarZ3.getTop() - g16.l(viewportAdjustmentForReverseScroll), gbaVarZ3.getBottom() - gbaVarZ3.getTop(), Float.intBitsToFloat((int) (jE & 4294967295L)));
        }
        if (i == 2) {
            return bringIntoViewSpec.b(gbaVarZ3.getLeft() - g16.k(viewportAdjustmentForReverseScroll), gbaVarZ3.getRight() - gbaVarZ3.getLeft(), Float.intBitsToFloat((int) (jE >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final int w3(long j, long j2) throws NoWhenBranchMatchedException {
        int i = b.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return Intrinsics.i((int) (j & 4294967295L), (int) (j2 & 4294967295L));
        }
        if (i == 2) {
            return Intrinsics.i((int) (j >> 32), (int) (j2 >> 32));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final int x3(long j, long j2) throws NoWhenBranchMatchedException {
        int i = b.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return Float.compare(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        }
        if (i == 2) {
            return Float.compare(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final gba y3(gba childBounds) {
        return childBounds.u(rn8.e(F3(childBounds, A3(), g16.INSTANCE.b()) ^ (-9223372034707292160L)));
    }

    private final gba z3() {
        r58 r58Var = this.bringIntoViewRequests.requests;
        int size = r58Var.getSize() - 1;
        Object[] objArr = r58Var.content;
        gba gbaVar = null;
        if (size < objArr.length) {
            while (size >= 0) {
                gba gbaVar2 = (gba) ((a) objArr[size]).b().invoke();
                if (gbaVar2 != null) {
                    if (x3(gbaVar2.k(), r16.e(A3())) > 0) {
                        return gbaVar == null ? gbaVar2 : gbaVar;
                    }
                    gbaVar = gbaVar2;
                }
                size--;
            }
        }
        return gbaVar;
    }

    public final long A3() {
        long j = this.viewportSize;
        return q16.f(j, hz1.a) ? q16.INSTANCE.a() : j;
    }

    public final void H3(Orientation orientation, boolean reverseDirection, fu0 bringIntoViewSpec) {
        this.orientation = orientation;
        this.reverseDirection = reverseDirection;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // com.google.inputmethod.du0
    public Object W(Function0<gba> function0, q22<? super Unit> q22Var) {
        gba gbaVar = (gba) function0.invoke();
        if (gbaVar != null && !C3(this, gbaVar, 0L, 0L, 3, null)) {
            e eVar = new e(kotlin.coroutines.intrinsics.a.d(q22Var), 1);
            eVar.G();
            if (this.bringIntoViewRequests.d(new a(function0, eVar)) && !this.isAnimationRunning) {
                E3(this, 0L, 1, null);
            }
            Object objY = eVar.y();
            if (objY == kotlin.coroutines.intrinsics.a.g()) {
                oq2.c(q22Var);
            }
            return objY == kotlin.coroutines.intrinsics.a.g() ? objY : Unit.a;
        }
        return Unit.a;
    }

    @Override // com.google.inputmethod.kj7
    public void f(long size) {
        long jB;
        long jA3 = A3();
        this.viewportSize = size;
        if (w3(size, jA3) < 0) {
            if (this.reverseDirection) {
                jB = g16.INSTANCE.b();
            } else if (this.orientation == Orientation.Vertical) {
                jB = g16.f((((long) 0) << 32) | (((long) (((int) (jA3 & 4294967295L)) - ((int) (size & 4294967295L)))) & 4294967295L));
            } else {
                jB = g16.f((((long) (((int) (jA3 >> 32)) - ((int) (size >> 32)))) << 32) | (((long) 0) & 4294967295L));
            }
            long j = jB;
            gba gbaVar = (gba) this.getFocusedRect.invoke();
            if (gbaVar != null && !this.isAnimationRunning && !this.trackingFocusedChild && C3(this, gbaVar, jA3, 0L, 2, null)) {
                if (C3(this, gbaVar, 0L, j, 1, null)) {
                    return;
                }
                this.trackingFocusedChild = true;
                D3(j);
            }
        }
    }

    @Override // com.google.inputmethod.du0
    public gba r0(gba localRect) {
        if (q16.f(this.viewportSize, hz1.a)) {
            cx5.c("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return y3(localRect);
    }
}
