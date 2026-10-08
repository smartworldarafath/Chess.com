package androidx.compose.p001foundation.gestures;

import androidx.compose.p001foundation.MutatePriority;
import androidx.compose.p001foundation.gestures.ScrollingLogic;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import com.google.android.q22;
import com.google.inputmethod.hab;
import com.google.inputmethod.i9b;
import com.google.inputmethod.p9b;
import com.google.inputmethod.qg4;
import com.google.inputmethod.rn8;
import com.google.inputmethod.t04;
import com.google.inputmethod.t3e;
import com.google.inputmethod.tr8;
import com.google.inputmethod.u3e;
import com.google.inputmethod.ve8;
import com.google.inputmethod.we8;
import com.google.inputmethod.zv8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001`\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0014*\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\"\u001a\u00020\u001e*\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010\u0019J\u0011\u0010&\u001a\u00020\u001e*\u00020\u0015¢\u0006\u0004\b&\u0010'J\u0011\u0010(\u001a\u00020\u001e*\u00020\u001e¢\u0006\u0004\b(\u0010\u0019J\u0011\u0010)\u001a\u00020\u0015*\u00020\u001e¢\u0006\u0004\b)\u0010\u0017J\u0011\u0010*\u001a\u00020\u0015*\u00020\u001e¢\u0006\u0004\b*\u0010\u0017J\u0011\u0010+\u001a\u00020\u0014*\u00020\u0015¢\u0006\u0004\b+\u0010'J\u0011\u0010,\u001a\u00020\u0015*\u00020\u0015¢\u0006\u0004\b,\u0010-J\u0011\u0010.\u001a\u00020\u001e*\u00020\u001e¢\u0006\u0004\b.\u0010\u0019J\u0017\u0010/\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001eH\u0016¢\u0006\u0004\b/\u0010\u0019J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u00020\nH\u0086@¢\u0006\u0004\b3\u00104J\u0018\u00106\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\n¢\u0006\u0004\b8\u00109J>\u0010A\u001a\u0002022\b\b\u0002\u0010;\u001a\u00020:2\"\u0010@\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020=\u0012\n\u0012\b\u0012\u0004\u0012\u0002020>\u0012\u0006\u0012\u0004\u0018\u00010?0<H\u0086@¢\u0006\u0004\bA\u0010BJ?\u0010C\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\n¢\u0006\u0004\bE\u00109R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010MR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR$\u0010Z\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bY\u0010Q\u001a\u0004\bK\u00109R\u0016\u0010\\\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010*R\u0016\u0010_\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR \u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010i\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u00109¨\u0006j"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "Lcom/google/android/i9b;", "Lcom/google/android/hab;", "scrollableState", "Lcom/google/android/zv8;", "overscrollEffect", "Lcom/google/android/qg4;", "flingBehavior", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "reverseDirection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "nestedScrollDispatcher", "Lcom/google/android/tr8;", "onScrollChangedDispatcher", "Lkotlin/Function0;", "isScrollableNodeAttached", "<init>", "(Lcom/google/android/hab;Lcom/google/android/zv8;Lcom/google/android/qg4;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Lcom/google/android/tr8;Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/t3e;", "", "F", "(J)F", "E", "(J)J", "newValue", "L", "(JF)J", "Lcom/google/android/p9b;", "Lcom/google/android/rn8;", "delta", "Lcom/google/android/we8;", "source", "x", "(Lcom/google/android/p9b;JI)J", "scroll", "s", "H", "(F)J", "D", "G", "I", "J", "z", "(F)F", "A", "c", "initialVelocity", "isMouseWheel", "", "w", "(JZLcom/google/android/q22;)Ljava/lang/Object;", "available", "a", "(JLcom/google/android/q22;)Ljava/lang/Object;", "C", "()Z", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Lcom/google/android/ve8;", "Lcom/google/android/q22;", "", "block", "B", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "K", "(Lcom/google/android/hab;Landroidx/compose/foundation/gestures/Orientation;Lcom/google/android/zv8;ZLcom/google/android/qg4;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)Z", "v", "Lcom/google/android/hab;", "t", "()Lcom/google/android/hab;", "setScrollableState", "(Lcom/google/android/hab;)V", "b", "Lcom/google/android/zv8;", "Lcom/google/android/qg4;", "d", "Landroidx/compose/foundation/gestures/Orientation;", "e", "Z", "f", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "g", "Lcom/google/android/tr8;", "h", "Lkotlin/jvm/functions/Function0;", "value", "i", "isFlinging", "j", "latestScrollSource", "k", "Lcom/google/android/p9b;", "outerStateScope", "androidx/compose/foundation/gestures/ScrollingLogic$a", "l", "Landroidx/compose/foundation/gestures/ScrollingLogic$a;", "nestedScrollScope", "Lkotlin/Function1;", "m", "Lkotlin/jvm/functions/Function1;", "performScrollForOverscroll", "u", "shouldDispatchOverscroll", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScrollingLogic implements i9b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private hab scrollableState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private zv8 overscrollEffect;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private qg4 flingBehavior;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Orientation orientation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean reverseDirection;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private NestedScrollDispatcher nestedScrollDispatcher;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private tr8 onScrollChangedDispatcher;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Function0<Boolean> isScrollableNodeAttached;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isFlinging;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int latestScrollSource = we8.INSTANCE.b();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private p9b outerStateScope = ScrollableKt.b;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final a nestedScrollScope = new a();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Function1<rn8, rn8> performScrollForOverscroll = new Function1() { // from class: com.google.android.lab
        public final Object invoke(Object obj) {
            return ScrollingLogic.y(this.a, (rn8) obj);
        }
    };

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"androidx/compose/foundation/gestures/ScrollingLogic$a", "Lcom/google/android/ve8;", "Lcom/google/android/rn8;", "offset", "Lcom/google/android/we8;", "source", "b", "(JI)J", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ve8 {
        a() {
        }

        @Override // com.google.inputmethod.ve8
        public long a(long offset, int source) {
            ScrollingLogic.this.latestScrollSource = source;
            zv8 zv8Var = ScrollingLogic.this.overscrollEffect;
            if (zv8Var != null && ScrollingLogic.this.u()) {
                return zv8Var.c(offset, ScrollingLogic.this.latestScrollSource, ScrollingLogic.this.performScrollForOverscroll);
            }
            return ScrollingLogic.this.x(ScrollingLogic.this.outerStateScope, offset, source);
        }

        @Override // com.google.inputmethod.ve8
        public long b(long offset, int source) {
            return ScrollingLogic.this.x(ScrollingLogic.this.outerStateScope, offset, source);
        }
    }

    public ScrollingLogic(hab habVar, zv8 zv8Var, qg4 qg4Var, Orientation orientation, boolean z, NestedScrollDispatcher nestedScrollDispatcher, tr8 tr8Var, Function0<Boolean> function0) {
        this.scrollableState = habVar;
        this.overscrollEffect = zv8Var;
        this.flingBehavior = qg4Var;
        this.orientation = orientation;
        this.reverseDirection = z;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.onScrollChangedDispatcher = tr8Var;
        this.isScrollableNodeAttached = function0;
    }

    private final long E(long j) {
        return this.orientation == Orientation.Horizontal ? t3e.e(j, 0.0f, 0.0f, 1, null) : t3e.e(j, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float F(long j) {
        return this.orientation == Orientation.Horizontal ? t3e.h(j) : t3e.i(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long L(long j, float f) {
        return this.orientation == Orientation.Horizontal ? t3e.e(j, f, 0.0f, 2, null) : t3e.e(j, 0.0f, f, 1, null);
    }

    private final long s(long scroll) {
        return H(z(this.scrollableState.d(z(G(scroll)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u() {
        return this.scrollableState.c() || this.scrollableState.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long x(p9b p9bVar, long j, int i) {
        long jD = this.nestedScrollDispatcher.d(j, i);
        long jP = rn8.p(j, jD);
        long jA = A(H(p9bVar.e(G(A(D(jP))))));
        this.onScrollChangedDispatcher.b0(jA);
        return rn8.q(rn8.q(jD, jA), this.nestedScrollDispatcher.b(jA, rn8.p(jP, jA), i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rn8 y(ScrollingLogic scrollingLogic, rn8 rn8Var) {
        return rn8.d(scrollingLogic.x(scrollingLogic.outerStateScope, rn8Var.getPackedValue(), scrollingLogic.latestScrollSource));
    }

    public final long A(long j) {
        return this.reverseDirection ? rn8.r(j, -1.0f) : j;
    }

    public final Object B(MutatePriority mutatePriority, Function2<? super ve8, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) {
        Object objA = this.scrollableState.a(mutatePriority, new ScrollingLogic$scroll$2(this, function2, null), q22Var);
        return objA == kotlin.coroutines.intrinsics.a.g() ? objA : Unit.a;
    }

    public final boolean C() {
        if (this.scrollableState.b()) {
            return true;
        }
        zv8 zv8Var = this.overscrollEffect;
        return zv8Var != null ? zv8Var.b() : false;
    }

    public final long D(long j) {
        return this.orientation == Orientation.Horizontal ? rn8.g(j, 0.0f, 0.0f, 1, null) : rn8.g(j, 0.0f, 0.0f, 2, null);
    }

    public final float G(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    public final long H(float f) {
        if (f == 0.0f) {
            return rn8.INSTANCE.c();
        }
        if (this.orientation == Orientation.Horizontal) {
            return rn8.e((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
        }
        return rn8.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final float I(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)))) >= 0.7853981633974483d) {
            if (this.orientation == Orientation.Vertical) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (this.orientation == Orientation.Horizontal) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }

    public final long J(float f) {
        if (f == 0.0f) {
            return t3e.INSTANCE.a();
        }
        return this.orientation == Orientation.Horizontal ? u3e.a(f, 0.0f) : u3e.a(0.0f, f);
    }

    public final boolean K(hab scrollableState, Orientation orientation, zv8 overscrollEffect, boolean reverseDirection, qg4 flingBehavior, NestedScrollDispatcher nestedScrollDispatcher) {
        boolean z;
        boolean z2 = true;
        if (Intrinsics.e(this.scrollableState, scrollableState)) {
            z = false;
        } else {
            this.scrollableState = scrollableState;
            z = true;
        }
        this.overscrollEffect = overscrollEffect;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z = true;
        }
        if (this.reverseDirection != reverseDirection) {
            this.reverseDirection = reverseDirection;
        } else {
            z2 = z;
        }
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.inputmethod.i9b
    public Object a(long j, q22<? super t3e> q22Var) throws Throwable {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        ScrollingLogic scrollingLogic;
        Throwable th;
        Ref.LongRef longRef;
        if (q22Var instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) q22Var;
            int i = scrollingLogic$doFlingAnimation$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                scrollingLogic$doFlingAnimation$1.label = i - t04.INVALID_ID;
            } else {
                scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, q22Var);
            }
        } else {
            scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, q22Var);
        }
        Object obj = scrollingLogic$doFlingAnimation$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = scrollingLogic$doFlingAnimation$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longRef = (Ref.LongRef) scrollingLogic$doFlingAnimation$1.L$0;
            try {
                f.b(obj);
                scrollingLogic = this;
                scrollingLogic.isFlinging = false;
                return t3e.b(longRef.element);
            } catch (Throwable th2) {
                th = th2;
                scrollingLogic = this;
                scrollingLogic.isFlinging = false;
                throw th;
            }
        }
        f.b(obj);
        Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = j;
        this.isFlinging = true;
        try {
            MutatePriority mutatePriority = MutatePriority.Default;
            scrollingLogic = this;
            try {
                ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(scrollingLogic, longRef2, j, null);
                scrollingLogic$doFlingAnimation$1.L$0 = longRef2;
                scrollingLogic$doFlingAnimation$1.label = 1;
                if (B(mutatePriority, scrollingLogic$doFlingAnimation$2, scrollingLogic$doFlingAnimation$1) == objG) {
                    return objG;
                }
                longRef = longRef2;
                scrollingLogic.isFlinging = false;
                return t3e.b(longRef.element);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                scrollingLogic.isFlinging = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            scrollingLogic = this;
        }
    }

    @Override // com.google.inputmethod.i9b
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getIsFlinging() {
        return this.isFlinging;
    }

    @Override // com.google.inputmethod.i9b
    public long c(long scroll) {
        return this.scrollableState.b() ? rn8.INSTANCE.c() : s(scroll);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final hab getScrollableState() {
        return this.scrollableState;
    }

    public final boolean v() {
        return this.orientation == Orientation.Vertical;
    }

    public final Object w(long j, boolean z, q22<? super Unit> q22Var) {
        if (z && !ScrollableKt.h(this.flingBehavior)) {
            return Unit.a;
        }
        long jE = E(j);
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
        zv8 zv8Var = this.overscrollEffect;
        if (zv8Var == null || !u()) {
            Object objInvoke = scrollingLogic$onScrollStopped$performFling$1.invoke(t3e.b(jE), q22Var);
            return objInvoke == kotlin.coroutines.intrinsics.a.g() ? objInvoke : Unit.a;
        }
        Object objA = zv8Var.a(jE, scrollingLogic$onScrollStopped$performFling$1, q22Var);
        return objA == kotlin.coroutines.intrinsics.a.g() ? objA : Unit.a;
    }

    public final float z(float f) {
        return this.reverseDirection ? f * (-1) : f;
    }
}
