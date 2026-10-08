package androidx.compose.p002material3.pulltorefresh;

import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ut0;
import com.google.inputmethod.eu9;
import com.google.inputmethod.k33;
import com.google.inputmethod.l48;
import com.google.inputmethod.re8;
import com.google.inputmethod.rn8;
import com.google.inputmethod.t04;
import com.google.inputmethod.t3e;
import com.google.inputmethod.tm9;
import com.google.inputmethod.u3e;
import com.google.inputmethod.we8;
import com.google.inputmethod.x23;
import com.google.inputmethod.y23;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.g;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J'\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020%H\u0096@¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0006¢\u0006\u0004\b(\u0010\u001dR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010*\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u0018\"\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER+\u0010L\u001a\u00020\u00132\u0006\u0010G\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010\u0018\"\u0004\bK\u0010BR+\u0010P\u001a\u00020\u00132\u0006\u0010G\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010I\u001a\u0004\bN\u0010\u0018\"\u0004\bO\u0010BR\u0014\u0010R\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0018R\u0014\u0010V\u001a\u00020S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u0018R\u0014\u0010Z\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010,¨\u0006["}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;", "Lcom/google/android/k33;", "Lcom/google/android/re8;", "", "isRefreshing", "Lkotlin/Function0;", "", "onRefresh", "enabled", "Lcom/google/android/eu9;", "state", "Lcom/google/android/ff3;", "threshold", "<init>", "(ZLkotlin/jvm/functions/Function0;ZLcom/google/android/eu9;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/rn8;", "available", "A3", "(J)J", "", "velocity", "I3", "(FLcom/google/android/q22;)Ljava/lang/Object;", "z3", "()F", "y3", "(Lcom/google/android/q22;)Ljava/lang/Object;", "x3", "V2", "()V", "Lcom/google/android/we8;", "source", "v2", "(JI)J", "consumed", "o0", "(JJI)J", "Lcom/google/android/t3e;", "q0", "(JLcom/google/android/q22;)Ljava/lang/Object;", "Q3", "r", "Z", "H3", "()Z", "M3", "(Z)V", "s", "Lkotlin/jvm/functions/Function0;", "getOnRefresh", "()Lkotlin/jvm/functions/Function0;", "L3", "(Lkotlin/jvm/functions/Function0;)V", "t", "getEnabled", "K3", "u", "Lcom/google/android/eu9;", "E3", "()Lcom/google/android/eu9;", "N3", "(Lcom/google/android/eu9;)V", "v", "F", "getThreshold-D9Ej5fM", "O3", "(F)V", "Lcom/google/android/x23;", "w", "Lcom/google/android/x23;", "nestedScrollNode", "<set-?>", "x", "Lcom/google/android/l48;", "G3", "P3", "verticalOffset", "y", "C3", "J3", "distancePulled", "B3", "adjustedDistancePulled", "", "F3", "()I", "thresholdPx", "D3", "progress", "Q2", "shouldAutoInvalidate", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PullToRefreshModifierNode extends k33 implements re8 {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean isRefreshing;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Function0<Unit> onRefresh;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private eu9 state;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private float threshold;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private x23 nestedScrollNode;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final l48 verticalOffset;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final l48 distancePulled;

    public /* synthetic */ PullToRefreshModifierNode(boolean z, Function0 function0, boolean z2, eu9 eu9Var, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, function0, z2, eu9Var, f);
    }

    private final long A3(long available) {
        float fC3;
        if (this.isRefreshing) {
            fC3 = 0.0f;
        } else {
            float fD = g.d(C3() + Float.intBitsToFloat((int) (available & 4294967295L)), 0.0f);
            fC3 = fD - C3();
            J3(fD);
            P3(z3());
        }
        return rn8.e((((long) Float.floatToRawIntBits(fC3)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
    }

    private final float B3() {
        return C3() * 0.5f;
    }

    private final float C3() {
        return this.distancePulled.b();
    }

    private final float D3() {
        return B3() / F3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int F3() {
        return y23.m(this).O1(this.threshold);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float G3() {
        return this.verticalOffset.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I3(float f, q22<? super Float> q22Var) {
        PullToRefreshModifierNode$onRelease$1 pullToRefreshModifierNode$onRelease$1;
        if (q22Var instanceof PullToRefreshModifierNode$onRelease$1) {
            pullToRefreshModifierNode$onRelease$1 = (PullToRefreshModifierNode$onRelease$1) q22Var;
            int i = pullToRefreshModifierNode$onRelease$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                pullToRefreshModifierNode$onRelease$1.label = i - t04.INVALID_ID;
            } else {
                pullToRefreshModifierNode$onRelease$1 = new PullToRefreshModifierNode$onRelease$1(this, q22Var);
            }
        } else {
            pullToRefreshModifierNode$onRelease$1 = new PullToRefreshModifierNode$onRelease$1(this, q22Var);
        }
        Object obj = pullToRefreshModifierNode$onRelease$1.result;
        Object objG = a.g();
        int i2 = pullToRefreshModifierNode$onRelease$1.label;
        if (i2 == 0) {
            f.b(obj);
            if (this.isRefreshing) {
                return ut0.d(0.0f);
            }
            if (B3() > F3()) {
                this.onRefresh.invoke();
            }
            if (C3() == 0.0f || f < 0.0f) {
                f = 0.0f;
            }
            pullToRefreshModifierNode$onRelease$1.F$0 = f;
            pullToRefreshModifierNode$onRelease$1.label = 1;
            if (x3(pullToRefreshModifierNode$onRelease$1) == objG) {
                return objG;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = pullToRefreshModifierNode$onRelease$1.F$0;
            f.b(obj);
        }
        J3(0.0f);
        return ut0.d(f);
    }

    private final void J3(float f) {
        this.distancePulled.p(f);
    }

    private final void P3(float f) {
        this.verticalOffset.p(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x3(q22<? super Unit> q22Var) {
        PullToRefreshModifierNode$animateToHidden$1 pullToRefreshModifierNode$animateToHidden$1;
        if (q22Var instanceof PullToRefreshModifierNode$animateToHidden$1) {
            pullToRefreshModifierNode$animateToHidden$1 = (PullToRefreshModifierNode$animateToHidden$1) q22Var;
            int i = pullToRefreshModifierNode$animateToHidden$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                pullToRefreshModifierNode$animateToHidden$1.label = i - t04.INVALID_ID;
            } else {
                pullToRefreshModifierNode$animateToHidden$1 = new PullToRefreshModifierNode$animateToHidden$1(this, q22Var);
            }
        } else {
            pullToRefreshModifierNode$animateToHidden$1 = new PullToRefreshModifierNode$animateToHidden$1(this, q22Var);
        }
        Object obj = pullToRefreshModifierNode$animateToHidden$1.result;
        Object objG = a.g();
        int i2 = pullToRefreshModifierNode$animateToHidden$1.label;
        try {
            if (i2 == 0) {
                f.b(obj);
                eu9 eu9Var = this.state;
                pullToRefreshModifierNode$animateToHidden$1.label = 1;
                if (eu9Var.b(pullToRefreshModifierNode$animateToHidden$1) == objG) {
                    return objG;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            J3(0.0f);
            P3(0.0f);
            return Unit.a;
        } catch (Throwable th) {
            J3(0.0f);
            P3(0.0f);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y3(q22<? super Unit> q22Var) {
        PullToRefreshModifierNode$animateToThreshold$1 pullToRefreshModifierNode$animateToThreshold$1;
        if (q22Var instanceof PullToRefreshModifierNode$animateToThreshold$1) {
            pullToRefreshModifierNode$animateToThreshold$1 = (PullToRefreshModifierNode$animateToThreshold$1) q22Var;
            int i = pullToRefreshModifierNode$animateToThreshold$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                pullToRefreshModifierNode$animateToThreshold$1.label = i - t04.INVALID_ID;
            } else {
                pullToRefreshModifierNode$animateToThreshold$1 = new PullToRefreshModifierNode$animateToThreshold$1(this, q22Var);
            }
        } else {
            pullToRefreshModifierNode$animateToThreshold$1 = new PullToRefreshModifierNode$animateToThreshold$1(this, q22Var);
        }
        Object obj = pullToRefreshModifierNode$animateToThreshold$1.result;
        Object objG = a.g();
        int i2 = pullToRefreshModifierNode$animateToThreshold$1.label;
        try {
            if (i2 == 0) {
                f.b(obj);
                eu9 eu9Var = this.state;
                pullToRefreshModifierNode$animateToThreshold$1.label = 1;
                if (eu9Var.c(pullToRefreshModifierNode$animateToThreshold$1) == objG) {
                    return objG;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            if (getIsAttached()) {
                J3(F3());
                P3(F3());
            }
            return Unit.a;
        } catch (Throwable th) {
            if (getIsAttached()) {
                J3(F3());
                P3(F3());
            }
            throw th;
        }
    }

    private final float z3() {
        if (B3() <= F3()) {
            return B3();
        }
        float fN = g.n(Math.abs(D3()) - 1.0f, 0.0f, 2.0f);
        return F3() + (F3() * (fN - (((float) Math.pow(fN, 2)) / 4)));
    }

    /* JADX INFO: renamed from: E3, reason: from getter */
    public final eu9 getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: H3, reason: from getter */
    public final boolean getIsRefreshing() {
        return this.isRefreshing;
    }

    public final void K3(boolean z) {
        this.enabled = z;
    }

    public final void L3(Function0<Unit> function0) {
        this.onRefresh = function0;
    }

    public final void M3(boolean z) {
        this.isRefreshing = z;
    }

    public final void N3(eu9 eu9Var) {
        this.state = eu9Var;
    }

    public final void O3(float f) {
        this.threshold = f;
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void Q3() {
        rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new PullToRefreshModifierNode$update$1(this, null), 3, (Object) null);
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        m3(this.nestedScrollNode);
        rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new PullToRefreshModifierNode$onAttach$1(this, null), 3, (Object) null);
        P3(this.isRefreshing ? F3() : 0.0f);
    }

    @Override // com.google.inputmethod.re8
    public long o0(long consumed, long available, int source) {
        if (!this.state.e() && this.enabled && we8.d(source, we8.INSTANCE.b())) {
            long jA3 = A3(available);
            rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new PullToRefreshModifierNode$onPostScroll$1(this, null), 3, (Object) null);
            return jA3;
        }
        return rn8.INSTANCE.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.inputmethod.re8
    public Object q0(long j, q22<? super t3e> q22Var) {
        PullToRefreshModifierNode$onPreFling$1 pullToRefreshModifierNode$onPreFling$1;
        float f;
        if (q22Var instanceof PullToRefreshModifierNode$onPreFling$1) {
            pullToRefreshModifierNode$onPreFling$1 = (PullToRefreshModifierNode$onPreFling$1) q22Var;
            int i = pullToRefreshModifierNode$onPreFling$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                pullToRefreshModifierNode$onPreFling$1.label = i - t04.INVALID_ID;
            } else {
                pullToRefreshModifierNode$onPreFling$1 = new PullToRefreshModifierNode$onPreFling$1(this, q22Var);
            }
        } else {
            pullToRefreshModifierNode$onPreFling$1 = new PullToRefreshModifierNode$onPreFling$1(this, q22Var);
        }
        Object objI3 = pullToRefreshModifierNode$onPreFling$1.result;
        Object objG = a.g();
        int i2 = pullToRefreshModifierNode$onPreFling$1.label;
        if (i2 == 0) {
            f.b(objI3);
            float fI = t3e.i(j);
            pullToRefreshModifierNode$onPreFling$1.F$0 = 0.0f;
            pullToRefreshModifierNode$onPreFling$1.label = 1;
            objI3 = I3(fI, pullToRefreshModifierNode$onPreFling$1);
            if (objI3 == objG) {
                return objG;
            }
            f = 0.0f;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = pullToRefreshModifierNode$onPreFling$1.F$0;
            f.b(objI3);
        }
        return t3e.b(u3e.a(f, ((Number) objI3).floatValue()));
    }

    @Override // com.google.inputmethod.re8
    public long v2(long available, int source) {
        if (!this.state.e() && this.enabled) {
            return (!we8.d(source, we8.INSTANCE.b()) || Float.intBitsToFloat((int) (4294967295L & available)) >= 0.0f) ? rn8.INSTANCE.c() : A3(available);
        }
        return rn8.INSTANCE.c();
    }

    private PullToRefreshModifierNode(boolean z, Function0<Unit> function0, boolean z2, eu9 eu9Var, float f) {
        this.isRefreshing = z;
        this.onRefresh = function0;
        this.enabled = z2;
        this.state = eu9Var;
        this.threshold = f;
        this.nestedScrollNode = NestedScrollNodeKt.c(this, null);
        this.verticalOffset = tm9.a(0.0f);
        this.distancePulled = tm9.a(0.0f);
    }
}
