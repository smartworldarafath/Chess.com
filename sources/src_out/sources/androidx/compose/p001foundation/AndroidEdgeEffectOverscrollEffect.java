package androidx.compose.p001foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.p001foundation.gestures.ForEachGestureKt;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.sh7;
import com.google.inputmethod.atb;
import com.google.inputmethod.cc0;
import com.google.inputmethod.cm;
import com.google.inputmethod.df9;
import com.google.inputmethod.f43;
import com.google.inputmethod.ki1;
import com.google.inputmethod.km3;
import com.google.inputmethod.o58;
import com.google.inputmethod.q16;
import com.google.inputmethod.rn8;
import com.google.inputmethod.rx8;
import com.google.inputmethod.se9;
import com.google.inputmethod.tsb;
import com.google.inputmethod.ugc;
import com.google.inputmethod.we8;
import com.google.inputmethod.wgc;
import com.google.inputmethod.x23;
import com.google.inputmethod.zv8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0017J3\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J<\u0010'\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!2\"\u0010&\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0$\u0012\u0006\u0012\u0004\u0018\u00010%0#H\u0096@¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\fH\u0000¢\u0006\u0004\b/\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00100R\u0016\u00103\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00105R \u0010<\u001a\b\u0012\u0004\u0012\u00020\f078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R(\u0010D\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b=\u0010>\u0012\u0004\bC\u0010\u000e\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010>R\u0016\u0010G\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00102R\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00102R\u0014\u0010L\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010KR\u001a\u0010Q\u001a\u00020M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010@¨\u0006S"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Lcom/google/android/zv8;", "Landroid/content/Context;", "context", "Lcom/google/android/f43;", "density", "Lcom/google/android/ei1;", "glowColor", "Lcom/google/android/rx8;", "glowDrawPadding", "<init>", "(Landroid/content/Context;Lcom/google/android/f43;JLcom/google/android/rx8;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "g", "()V", "Lcom/google/android/rn8;", "delta", "", "o", "(J)Z", "scroll", "", "n", "(J)F", "k", "l", "m", "Lcom/google/android/we8;", "source", "Lkotlin/Function1;", "performScroll", "c", "(JILkotlin/jvm/functions/Function1;)J", "Lcom/google/android/t3e;", "velocity", "Lkotlin/Function2;", "Lcom/google/android/q22;", "", "performFling", "a", "(JLkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/tsb;", "size", "p", "(J)V", "h", "()J", "j", "Lcom/google/android/f43;", "b", "J", "pointerPosition", "Landroidx/compose/foundation/k;", "Landroidx/compose/foundation/k;", "edgeEffectWrapper", "Lcom/google/android/o58;", "d", "Lcom/google/android/o58;", "i", "()Lcom/google/android/o58;", "redrawSignal", "e", "Z", "getInvalidationEnabled$foundation", "()Z", "setInvalidationEnabled$foundation", "(Z)V", "getInvalidationEnabled$foundation$annotations", "invalidationEnabled", "f", "scrollCycleInProgress", "containerSize", "Lcom/google/android/se9;", "pointerId", "Lcom/google/android/wgc;", "Lcom/google/android/wgc;", "pointerInputNode", "Lcom/google/android/x23;", "Lcom/google/android/x23;", "F", "()Lcom/google/android/x23;", "node", "isInProgress", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidEdgeEffectOverscrollEffect implements zv8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final f43 density;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long pointerPosition;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final k edgeEffectWrapper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final o58<Unit> redrawSignal;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean invalidationEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean scrollCycleInProgress;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long containerSize;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long pointerId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final wgc pointerInputNode;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final x23 node;

    public /* synthetic */ AndroidEdgeEffectOverscrollEffect(Context context, f43 f43Var, long j, rx8 rx8Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, f43Var, j, rx8Var);
    }

    private final void g() {
        boolean z;
        k kVar = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = kVar.topEffect;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = kVar.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = kVar.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = kVar.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            j();
        }
    }

    private final float k(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (h() >> 32));
        int i = (int) (scroll & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        EdgeEffect edgeEffectG = this.edgeEffectWrapper.g();
        km3 km3Var = km3.a;
        return km3Var.c(edgeEffectG) == 0.0f ? (-km3Var.e(edgeEffectG, -fIntBitsToFloat2, 1 - fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.containerSize & 4294967295L)) : Float.intBitsToFloat(i);
    }

    private final float l(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (h() & 4294967295L));
        int i = (int) (scroll >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect edgeEffectI = this.edgeEffectWrapper.i();
        km3 km3Var = km3.a;
        return km3Var.c(edgeEffectI) == 0.0f ? km3Var.e(edgeEffectI, fIntBitsToFloat2, 1 - fIntBitsToFloat) * Float.intBitsToFloat((int) (this.containerSize >> 32)) : Float.intBitsToFloat(i);
    }

    private final float m(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (h() & 4294967295L));
        int i = (int) (scroll >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect edgeEffectK = this.edgeEffectWrapper.k();
        km3 km3Var = km3.a;
        return km3Var.c(edgeEffectK) == 0.0f ? (-km3Var.e(edgeEffectK, -fIntBitsToFloat2, fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.containerSize >> 32)) : Float.intBitsToFloat(i);
    }

    private final float n(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (h() >> 32));
        int i = (int) (scroll & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        EdgeEffect edgeEffectM = this.edgeEffectWrapper.m();
        km3 km3Var = km3.a;
        return km3Var.c(edgeEffectM) == 0.0f ? km3Var.e(edgeEffectM, fIntBitsToFloat2, fIntBitsToFloat) * Float.intBitsToFloat((int) (this.containerSize & 4294967295L)) : Float.intBitsToFloat(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    private final boolean o(long delta) {
        boolean zS;
        if (this.edgeEffectWrapper.s()) {
            int i = (int) (delta >> 32);
            if (Float.intBitsToFloat(i) < 0.0f) {
                km3.a.f(this.edgeEffectWrapper.i(), Float.intBitsToFloat(i));
                zS = this.edgeEffectWrapper.s();
            } else {
                zS = false;
            }
        } else {
            zS = false;
        }
        if (this.edgeEffectWrapper.v()) {
            int i2 = (int) (delta >> 32);
            if (Float.intBitsToFloat(i2) > 0.0f) {
                km3.a.f(this.edgeEffectWrapper.k(), Float.intBitsToFloat(i2));
                zS = zS || this.edgeEffectWrapper.v();
            }
        }
        if (this.edgeEffectWrapper.z()) {
            int i3 = (int) (delta & 4294967295L);
            if (Float.intBitsToFloat(i3) < 0.0f) {
                km3.a.f(this.edgeEffectWrapper.m(), Float.intBitsToFloat(i3));
                zS = zS || this.edgeEffectWrapper.z();
            }
        }
        if (this.edgeEffectWrapper.p()) {
            int i4 = (int) (delta & 4294967295L);
            if (Float.intBitsToFloat(i4) > 0.0f) {
                km3.a.f(this.edgeEffectWrapper.g(), Float.intBitsToFloat(i4));
                return zS || this.edgeEffectWrapper.p();
            }
        }
        return zS;
    }

    @Override // com.google.inputmethod.zv8
    /* JADX INFO: renamed from: F, reason: from getter */
    public x23 getNode() {
        return this.node;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r14.invoke(r12, r0) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0134, code lost:
    
        if (r15 == r1) goto L50;
     */
    @Override // com.google.inputmethod.zv8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r12, kotlin.jvm.functions.Function2<? super com.google.inputmethod.t3e, ? super com.google.android.q22<? super com.google.inputmethod.t3e>, ? extends java.lang.Object> r14, com.google.android.q22<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.AndroidEdgeEffectOverscrollEffect.a(long, kotlin.jvm.functions.Function2, com.google.android.q22):java.lang.Object");
    }

    @Override // com.google.inputmethod.zv8
    public boolean b() {
        k kVar = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = kVar.topEffect;
        if (edgeEffect != null && km3.a.c(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = kVar.bottomEffect;
        if (edgeEffect2 != null && km3.a.c(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = kVar.leftEffect;
        if (edgeEffect3 != null && km3.a.c(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = kVar.rightEffect;
        return (edgeEffect4 == null || km3.a.c(edgeEffect4) == 0.0f) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x022a  */
    /* JADX WARN: Code duplicated, block: B:105:0x022f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0237  */
    /* JADX WARN: Code duplicated, block: B:108:0x023b  */
    /* JADX WARN: Code duplicated, block: B:110:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0242  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b8 A[PHI: r11
  0x00b8: PHI (r11v9 float) = (r11v8 float), (r11v12 float) binds: [B:43:0x00e9, B:32:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:58:0x0132 A[PHI: r14
  0x0132: PHI (r14v9 float) = (r14v8 float), (r14v12 float) binds: [B:67:0x0162, B:56:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.inputmethod.zv8
    public long c(long delta, int source, Function1<? super rn8, rn8> performScroll) {
        float fK;
        float fIntBitsToFloat;
        float fM;
        float fIntBitsToFloat2;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        if (tsb.n(this.containerSize)) {
            return ((rn8) performScroll.invoke(rn8.d(delta))).getPackedValue();
        }
        if (!this.scrollCycleInProgress) {
            if (this.edgeEffectWrapper.u()) {
                l(rn8.INSTANCE.c());
            }
            if (this.edgeEffectWrapper.x()) {
                m(rn8.INSTANCE.c());
            }
            if (this.edgeEffectWrapper.B()) {
                n(rn8.INSTANCE.c());
            }
            if (this.edgeEffectWrapper.r()) {
                k(rn8.INSTANCE.c());
            }
            this.scrollCycleInProgress = true;
        }
        float fC = cm.c(source);
        long jR = rn8.r(delta, fC);
        int i2 = (int) (delta & 4294967295L);
        if (Float.intBitsToFloat(i2) == 0.0f) {
            fIntBitsToFloat = 0.0f;
        } else if (this.edgeEffectWrapper.B() && Float.intBitsToFloat(i2) < 0.0f) {
            fK = n(jR);
            if (!this.edgeEffectWrapper.B()) {
                this.edgeEffectWrapper.m().finish();
            }
            if (fK == Float.intBitsToFloat((int) (jR & 4294967295L))) {
                fIntBitsToFloat = Float.intBitsToFloat(i2);
            } else {
                fIntBitsToFloat = fK / fC;
            }
        } else if (!this.edgeEffectWrapper.r() || Float.intBitsToFloat(i2) <= 0.0f) {
            fIntBitsToFloat = 0.0f;
        } else {
            fK = k(jR);
            if (!this.edgeEffectWrapper.r()) {
                this.edgeEffectWrapper.g().finish();
            }
            if (fK == Float.intBitsToFloat((int) (jR & 4294967295L))) {
                fIntBitsToFloat = Float.intBitsToFloat(i2);
            } else {
                fIntBitsToFloat = fK / fC;
            }
        }
        int i3 = (int) (delta >> 32);
        if (Float.intBitsToFloat(i3) == 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (this.edgeEffectWrapper.u() && Float.intBitsToFloat(i3) < 0.0f) {
            fM = l(jR);
            if (!this.edgeEffectWrapper.u()) {
                this.edgeEffectWrapper.i().finish();
            }
            if (fM == Float.intBitsToFloat((int) (jR >> 32))) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i3);
            } else {
                fIntBitsToFloat2 = fM / fC;
            }
        } else if (!this.edgeEffectWrapper.x() || Float.intBitsToFloat(i3) <= 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fM = m(jR);
            if (!this.edgeEffectWrapper.x()) {
                this.edgeEffectWrapper.k().finish();
            }
            if (fM == Float.intBitsToFloat((int) (jR >> 32))) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i3);
            } else {
                fIntBitsToFloat2 = fM / fC;
            }
        }
        long jE = rn8.e((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
        rn8.Companion companion = rn8.INSTANCE;
        if (!rn8.j(jE, companion.c())) {
            j();
        }
        long jP = rn8.p(delta, jE);
        long packedValue = ((rn8) performScroll.invoke(rn8.d(jP))).getPackedValue();
        long jP2 = rn8.p(jP, packedValue);
        if ((Float.intBitsToFloat((int) (jP >> 32)) != 0.0f || Float.intBitsToFloat((int) (jP & 4294967295L)) != 0.0f) && (Float.intBitsToFloat((int) (packedValue >> 32)) != 0.0f || Float.intBitsToFloat((int) (packedValue & 4294967295L)) != 0.0f)) {
            k kVar = this.edgeEffectWrapper;
            if (kVar.u() || kVar.B() || kVar.x() || kVar.r()) {
                g();
            }
        }
        if (we8.d(source, we8.INSTANCE.b())) {
            int i4 = (int) (jP2 >> 32);
            if (Float.intBitsToFloat(i4) > 0.5f) {
                l(jP2);
            } else {
                if (Float.intBitsToFloat(i4) < -0.5f) {
                    m(jP2);
                } else {
                    z2 = false;
                }
                i = (int) (jP2 & 4294967295L);
                if (Float.intBitsToFloat(i) > 0.5f) {
                    n(jP2);
                } else {
                    if (Float.intBitsToFloat(i) < -0.5f) {
                        k(jP2);
                    } else {
                        z3 = false;
                    }
                    if (!z2 || z3) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            }
            z2 = true;
            i = (int) (jP2 & 4294967295L);
            if (Float.intBitsToFloat(i) > 0.5f) {
                n(jP2);
            } else {
                if (Float.intBitsToFloat(i) < -0.5f) {
                    k(jP2);
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                z = true;
            }
            z3 = true;
            if (z2) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!rn8.j(jP, companion.c())) {
            z = o(delta) || z;
        }
        if (z) {
            j();
        }
        return rn8.q(jE, packedValue);
    }

    public final long h() {
        long jB = this.pointerPosition;
        if ((9223372034707292159L & jB) == 9205357640488583168L) {
            jB = atb.b(this.containerSize);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32)) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        return rn8.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jB & 4294967295L)) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public final o58<Unit> i() {
        return this.redrawSignal;
    }

    public final void j() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(Unit.a);
        }
    }

    public final void p(long size) {
        boolean zH = tsb.h(this.containerSize, tsb.INSTANCE.b());
        boolean zH2 = tsb.h(size, this.containerSize);
        this.containerSize = size;
        if (!zH2) {
            k kVar = this.edgeEffectWrapper;
            int iD = sh7.d(Float.intBitsToFloat((int) (size >> 32)));
            kVar.C(q16.c((((long) sh7.d(Float.intBitsToFloat((int) (size & 4294967295L)))) & 4294967295L) | (((long) iD) << 32)));
        }
        if (zH || zH2) {
            return;
        }
        g();
    }

    private AndroidEdgeEffectOverscrollEffect(Context context, f43 f43Var, long j, rx8 rx8Var) {
        this.density = f43Var;
        this.pointerPosition = rn8.INSTANCE.b();
        k kVar = new k(context, ki1.j(j));
        this.edgeEffectWrapper = kVar;
        this.redrawSignal = p0.i(Unit.a, p0.k());
        this.invalidationEnabled = true;
        this.containerSize = tsb.INSTANCE.b();
        this.pointerId = se9.a(-1L);
        wgc wgcVarA = ugc.a(new PointerInputEventHandler() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1

            /* JADX INFO: renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "", "<anonymous>", "(Lcom/google/android/cc0;)V"}, k = 3, mv = {2, 1, 0})
            @lq2(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", l = {788, 792}, m = "invokeSuspend", v = 1)
            static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, q22<? super AnonymousClass1> q22Var) {
                    super(2, q22Var);
                    this.this$0 = androidEdgeEffectOverscrollEffect;
                }

                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(cc0 cc0Var, q22<? super Unit> q22Var) {
                    return create(cc0Var, q22Var).invokeSuspend(Unit.a);
                }

                public final q22<Unit> create(Object obj, q22<?> q22Var) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, q22Var);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: Code duplicated, block: B:26:0x0093  */
                /* JADX WARN: Code duplicated, block: B:29:0x00a9 A[LOOP:1: B:25:0x0091->B:29:0x00a9, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:44:0x00ad A[EDGE_INSN: B:44:0x00ad->B:31:0x00ad BREAK  A[LOOP:1: B:25:0x0091->B:29:0x00a9], SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005e -> B:18:0x0061). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                    /*
                        Method dump skipped, instruction units count: 224
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
                Object objD = ForEachGestureKt.d(df9Var, new AnonymousClass1(this.a, null), q22Var);
                return objD == a.g() ? objD : Unit.a;
            }
        });
        this.pointerInputNode = wgcVarA;
        this.node = Build.VERSION.SDK_INT >= 31 ? new v(wgcVarA, this, kVar) : new m(wgcVarA, this, kVar, rx8Var);
    }
}
