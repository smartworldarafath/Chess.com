package androidx.compose.p001foundation.gestures;

import androidx.compose.p000animation.core.SuspendAnimationKt;
import androidx.compose.p001foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.e;
import androidx.compose.ui.input.pointer.g;
import com.google.android.h81;
import com.google.android.p81;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.android.ut0;
import com.google.inputmethod.AnimationState;
import com.google.inputmethod.e9b;
import com.google.inputmethod.em3;
import com.google.inputmethod.f43;
import com.google.inputmethod.jr;
import com.google.inputmethod.lr;
import com.google.inputmethod.m08;
import com.google.inputmethod.or;
import com.google.inputmethod.qr;
import com.google.inputmethod.rn8;
import com.google.inputmethod.t04;
import com.google.inputmethod.t3e;
import com.google.inputmethod.ve8;
import com.google.inputmethod.we8;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001EBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J,\u0010$\u001a\u00020\t*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0082@¢\u0006\u0004\b$\u0010%JL\u0010/\u001a\u00020\t*\u00020&2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020(0'2\u0006\u0010*\u001a\u00020!2\u0006\u0010,\u001a\u00020+2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00140-H\u0082@¢\u0006\u0004\b/\u00100J\u001b\u00102\u001a\u00020!*\u00020&2\u0006\u00101\u001a\u00020!H\u0002¢\u0006\u0004\b2\u00103J'\u00106\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00105\u001a\u0002042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\t2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006F"}, d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;", "Landroidx/compose/foundation/gestures/NonTouchScrollingLogic;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "Lcom/google/android/e9b;", "mouseWheelScrollConfig", "Lkotlin/Function2;", "Lcom/google/android/t3e;", "Lcom/google/android/q22;", "", "", "onScrollStopped", "Lcom/google/android/f43;", "density", "<init>", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Lcom/google/android/e9b;Lkotlin/jvm/functions/Function2;Lcom/google/android/f43;)V", "Landroidx/compose/ui/input/pointer/e;", "pointerEvent", "Lcom/google/android/q16;", "bounds", "", "y", "(Landroidx/compose/ui/input/pointer/e;J)Z", "Lcom/google/android/h81;", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$a;", "B", "(Lcom/google/android/h81;)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$a;", "Lcom/google/android/rn8;", "scrollDelta", "u", "(Landroidx/compose/foundation/gestures/ScrollingLogic;J)Z", "D", "(Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$a;)V", "", "threshold", "speed", "w", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$a;FFLcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/ve8;", "Lcom/google/android/nr;", "Lcom/google/android/qr;", "animationState", "targetValue", "", "durationMillis", "Lkotlin/Function1;", "shouldCancelAnimation", "s", "(Lcom/google/android/ve8;Lcom/google/android/nr;FILkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "delta", "v", "(Lcom/google/android/ve8;F)F", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "z", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "Lcom/google/android/ta2;", "coroutineScope", "A", "(Lcom/google/android/ta2;)V", "f", "Lcom/google/android/e9b;", "g", "Lcom/google/android/h81;", "channel", "Lkotlinx/coroutines/s;", "h", "Lkotlinx/coroutines/s;", "receivingMouseWheelEventsJob", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MouseWheelScrollingLogic extends NonTouchScrollingLogic {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final e9b mouseWheelScrollConfig;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final h81<MouseWheelScrollDelta> channel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private s receivingMouseWheelEventsJob;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$a;", "", "Lcom/google/android/rn8;", "value", "", "timeMillis", "", "shouldApplyImmediately", "<init>", "(JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "f", "(Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$a;)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$a;", "a", "(JJZ)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "J", "e", "()J", "b", "d", "c", "Z", "()Z", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MouseWheelScrollDelta {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final long value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final long timeMillis;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final boolean shouldApplyImmediately;

        public /* synthetic */ MouseWheelScrollDelta(long j, long j2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z);
        }

        public static /* synthetic */ MouseWheelScrollDelta b(MouseWheelScrollDelta mouseWheelScrollDelta, long j, long j2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = mouseWheelScrollDelta.value;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = mouseWheelScrollDelta.timeMillis;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                z = mouseWheelScrollDelta.shouldApplyImmediately;
            }
            return mouseWheelScrollDelta.a(j3, j4, z);
        }

        public final MouseWheelScrollDelta a(long value, long timeMillis, boolean shouldApplyImmediately) {
            return new MouseWheelScrollDelta(value, timeMillis, shouldApplyImmediately, null);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getShouldApplyImmediately() {
            return this.shouldApplyImmediately;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getTimeMillis() {
            return this.timeMillis;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MouseWheelScrollDelta)) {
                return false;
            }
            MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) other;
            return rn8.j(this.value, mouseWheelScrollDelta.value) && this.timeMillis == mouseWheelScrollDelta.timeMillis && this.shouldApplyImmediately == mouseWheelScrollDelta.shouldApplyImmediately;
        }

        public final MouseWheelScrollDelta f(MouseWheelScrollDelta other) {
            return new MouseWheelScrollDelta(rn8.q(this.value, other.value), Math.max(this.timeMillis, other.timeMillis), this.shouldApplyImmediately, null);
        }

        public int hashCode() {
            return (((rn8.o(this.value) * 31) + Long.hashCode(this.timeMillis)) * 31) + Boolean.hashCode(this.shouldApplyImmediately);
        }

        public String toString() {
            return "MouseWheelScrollDelta(value=" + ((Object) rn8.s(this.value)) + ", timeMillis=" + this.timeMillis + ", shouldApplyImmediately=" + this.shouldApplyImmediately + ')';
        }

        private MouseWheelScrollDelta(long j, long j2, boolean z) {
            this.value = j;
            this.timeMillis = j2;
            this.shouldApplyImmediately = z;
        }
    }

    public MouseWheelScrollingLogic(ScrollingLogic scrollingLogic, e9b e9bVar, Function2<? super t3e, ? super q22<? super Unit>, ? extends Object> function2, f43 f43Var) {
        super(scrollingLogic, function2, f43Var);
        this.mouseWheelScrollConfig = e9bVar;
        this.channel = p81.b(Integer.MAX_VALUE, (BufferOverflow) null, (Function1) null, 6, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MouseWheelScrollDelta B(final h81<MouseWheelScrollDelta> h81Var) {
        MouseWheelScrollDelta mouseWheelScrollDeltaF = null;
        for (MouseWheelScrollDelta mouseWheelScrollDelta : NonTouchScrollingLogicKt.b(new Function0() { // from class: com.google.android.k08
            public final Object invoke() {
                return MouseWheelScrollingLogic.C(h81Var);
            }
        })) {
            mouseWheelScrollDeltaF = mouseWheelScrollDeltaF == null ? mouseWheelScrollDelta : mouseWheelScrollDeltaF.f(mouseWheelScrollDelta);
        }
        return mouseWheelScrollDeltaF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MouseWheelScrollDelta C(h81 h81Var) {
        return (MouseWheelScrollDelta) a.f(h81Var.s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(MouseWheelScrollDelta scrollDelta) {
        getVelocityTracker().a(scrollDelta.getTimeMillis(), scrollDelta.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(final ve8 ve8Var, AnimationState<Float, qr> animationState, float f, int i, final Function1<? super Float, Boolean> function1, q22<? super Unit> q22Var) {
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = animationState.getValue().floatValue();
        Object objX = SuspendAnimationKt.x(animationState, ut0.d(f), lr.l(i, 0, em3.e(), 2, null), true, new Function1() { // from class: com.google.android.l08
            public final Object invoke(Object obj) {
                return MouseWheelScrollingLogic.t(floatRef, this, ve8Var, function1, (jr) obj);
            }
        }, q22Var);
        return objX == kotlin.coroutines.intrinsics.a.g() ? objX : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Ref.FloatRef floatRef, MouseWheelScrollingLogic mouseWheelScrollingLogic, ve8 ve8Var, Function1 function1, jr jrVar) {
        float fFloatValue = ((Number) jrVar.e()).floatValue() - floatRef.element;
        if (!m08.d(fFloatValue)) {
            if (!m08.d(fFloatValue - mouseWheelScrollingLogic.v(ve8Var, fFloatValue))) {
                jrVar.a();
                return Unit.a;
            }
            floatRef.element += fFloatValue;
        }
        if (((Boolean) function1.invoke(Float.valueOf(floatRef.element))).booleanValue()) {
            jrVar.a();
        }
        return Unit.a;
    }

    private final boolean u(ScrollingLogic scrollingLogic, long j) {
        float fI = scrollingLogic.I(scrollingLogic.A(j));
        if (fI == 0.0f) {
            return false;
        }
        return fI > 0.0f ? scrollingLogic.getScrollableState().c() : scrollingLogic.getScrollableState().f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float v(ve8 ve8Var, float f) {
        ScrollingLogic scrollingLogic = getScrollingLogic();
        return scrollingLogic.G(scrollingLogic.A(ve8Var.b(scrollingLogic.H(scrollingLogic.z(f)), we8.INSTANCE.b())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010b, code lost:
    
        if (r0.invoke(r1, r9) == r10) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(androidx.compose.p001foundation.gestures.ScrollingLogic r23, androidx.compose.p001foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta r24, float r25, float r26, com.google.android.q22<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.MouseWheelScrollingLogic.w(androidx.compose.foundation.gestures.ScrollingLogic, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$a, float, float, com.google.android.q22):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object x(MouseWheelScrollingLogic mouseWheelScrollingLogic, Ref.ObjectRef<MouseWheelScrollDelta> objectRef, Ref.FloatRef floatRef, ScrollingLogic scrollingLogic, Ref.ObjectRef<AnimationState<Float, qr>> objectRef2, long j, q22<? super Boolean> q22Var) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;
        Ref.FloatRef floatRef2;
        ScrollingLogic scrollingLogic2;
        Ref.ObjectRef<AnimationState<Float, qr>> objectRef3;
        Ref.ObjectRef<MouseWheelScrollDelta> objectRef4;
        MouseWheelScrollingLogic mouseWheelScrollingLogic2 = mouseWheelScrollingLogic;
        if (q22Var instanceof MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = (MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) q22Var;
            int i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label = i - t04.INVALID_ID;
            } else {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1(q22Var);
            }
        } else {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1(q22Var);
        }
        Object objE = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label;
        boolean z = false;
        if (i2 == 0) {
            f.b(objE);
            if (j < 0) {
                return ut0.a(false);
            }
            MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2(mouseWheelScrollingLogic2, null);
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$0 = mouseWheelScrollingLogic2;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$1 = objectRef;
            floatRef2 = floatRef;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$2 = floatRef2;
            scrollingLogic2 = scrollingLogic;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$3 = scrollingLogic2;
            objectRef3 = objectRef2;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$4 = objectRef3;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label = 1;
            objE = TimeoutKt.e(j, mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2, mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1);
            if (objE == objG) {
                return objG;
            }
            objectRef4 = objectRef;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.ObjectRef<AnimationState<Float, qr>> objectRef5 = (Ref.ObjectRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$4;
            ScrollingLogic scrollingLogic3 = (ScrollingLogic) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$3;
            Ref.FloatRef floatRef3 = (Ref.FloatRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$2;
            objectRef4 = (Ref.ObjectRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$1;
            MouseWheelScrollingLogic mouseWheelScrollingLogic3 = (MouseWheelScrollingLogic) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$0;
            f.b(objE);
            objectRef3 = objectRef5;
            scrollingLogic2 = scrollingLogic3;
            floatRef2 = floatRef3;
            mouseWheelScrollingLogic2 = mouseWheelScrollingLogic3;
        }
        MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) objE;
        if (mouseWheelScrollDelta != null) {
            MouseWheelScrollDelta mouseWheelScrollDeltaB = MouseWheelScrollDelta.b(mouseWheelScrollDelta, 0L, 0L, ((MouseWheelScrollDelta) objectRef4.element).getShouldApplyImmediately(), 3, null);
            objectRef4.element = mouseWheelScrollDeltaB;
            floatRef2.element = scrollingLogic2.I(scrollingLogic2.A(mouseWheelScrollDeltaB.getValue()));
            objectRef3.element = or.c(0.0f, 0.0f, 0L, 0L, false, 30, null);
            mouseWheelScrollingLogic2.D(mouseWheelScrollDelta);
            z = !m08.d(floatRef2.element);
        }
        return ut0.a(z);
    }

    private final boolean y(e pointerEvent, long bounds) {
        long jB = this.mouseWheelScrollConfig.b(getDensity(), pointerEvent, bounds);
        if (u(getScrollingLogic(), jB)) {
            return a.j(this.channel.e(new MouseWheelScrollDelta(jB, ((PointerInputChange) m.z0(pointerEvent.c())).getUptimeMillis(), !this.mouseWheelScrollConfig.a() || this.mouseWheelScrollConfig.c(pointerEvent), null)));
        }
        return getIsScrolling();
    }

    public void A(ta2 coroutineScope) {
        if (this.receivingMouseWheelEventsJob == null) {
            this.receivingMouseWheelEventsJob = rw0.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MouseWheelScrollingLogic$startReceivingEvents$1(this, null), 3, (Object) null);
        }
    }

    public void z(e pointerEvent, PointerEventPass pass, long bounds) {
        if (g.o(pointerEvent.getType(), g.INSTANCE.l())) {
            List<PointerInputChange> listC = pointerEvent.c();
            int size = listC.size();
            for (int i = 0; i < size; i++) {
                if (listC.get(i).q()) {
                    return;
                }
            }
            if (pass == PointerEventPass.Initial && getIsScrolling()) {
                y(pointerEvent, bounds);
                a(pointerEvent);
            }
            if (pass == PointerEventPass.Main && !getIsScrolling() && y(pointerEvent, bounds)) {
                a(pointerEvent);
            }
        }
    }
}
