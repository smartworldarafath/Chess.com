package androidx.compose.p001foundation.layout;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import com.google.inputmethod.dj7;
import com.google.inputmethod.f66;
import com.google.inputmethod.fj7;
import com.google.inputmethod.h66;
import com.google.inputmethod.kx1;
import com.google.inputmethod.q16;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\n*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\n*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\n*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\n*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ#\u0010\u0018\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ#\u0010\"\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010\u001fJ#\u0010#\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010\u001fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Landroidx/compose/foundation/layout/f;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/b$c;", "", "aspectRatio", "", "matchHeightConstraintsFirst", "<init>", "(FZ)V", "Lcom/google/android/kx1;", "Lcom/google/android/q16;", "n3", "(J)J", "enforceConstraints", "s3", "(JZ)J", "r3", "u3", "t3", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "Lcom/google/android/h66;", "Lcom/google/android/f66;", "", "height", "z", "(Lcom/google/android/h66;Lcom/google/android/f66;I)I", "t", "width", "m", "i", "p", "F", "getAspectRatio", "()F", "p3", "(F)V", "q", "Z", "getMatchHeightConstraintsFirst", "()Z", "q3", "(Z)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f extends b.c implements c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float aspectRatio;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean matchHeightConstraintsFirst;

    public f(float f, boolean z) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
    }

    private final long n3(long j) {
        if (this.matchHeightConstraintsFirst) {
            long jR3 = r3(j, true);
            q16.Companion companion = q16.INSTANCE;
            if (!q16.f(jR3, companion.a())) {
                return jR3;
            }
            long jS3 = s3(j, true);
            if (!q16.f(jS3, companion.a())) {
                return jS3;
            }
            long jT3 = t3(j, true);
            if (!q16.f(jT3, companion.a())) {
                return jT3;
            }
            long jU3 = u3(j, true);
            if (!q16.f(jU3, companion.a())) {
                return jU3;
            }
            long jR4 = r3(j, false);
            if (!q16.f(jR4, companion.a())) {
                return jR4;
            }
            long jS4 = s3(j, false);
            if (!q16.f(jS4, companion.a())) {
                return jS4;
            }
            long jT4 = t3(j, false);
            if (!q16.f(jT4, companion.a())) {
                return jT4;
            }
            long jU4 = u3(j, false);
            if (!q16.f(jU4, companion.a())) {
                return jU4;
            }
        } else {
            long jS5 = s3(j, true);
            q16.Companion companion2 = q16.INSTANCE;
            if (!q16.f(jS5, companion2.a())) {
                return jS5;
            }
            long jR5 = r3(j, true);
            if (!q16.f(jR5, companion2.a())) {
                return jR5;
            }
            long jU5 = u3(j, true);
            if (!q16.f(jU5, companion2.a())) {
                return jU5;
            }
            long jT5 = t3(j, true);
            if (!q16.f(jT5, companion2.a())) {
                return jT5;
            }
            long jS6 = s3(j, false);
            if (!q16.f(jS6, companion2.a())) {
                return jS6;
            }
            long jR6 = r3(j, false);
            if (!q16.f(jR6, companion2.a())) {
                return jR6;
            }
            long jU6 = u3(j, false);
            if (!q16.f(jU6, companion2.a())) {
                return jU6;
            }
            long jT6 = t3(j, false);
            if (!q16.f(jT6, companion2.a())) {
                return jT6;
            }
        }
        return q16.INSTANCE.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o3(o oVar, o.a aVar) {
        o.a.L(aVar, oVar, 0, 0, 0.0f, 4, null);
        return Unit.a;
    }

    private final long r3(long j, boolean z) {
        int iRound;
        int iK = kx1.k(j);
        return (iK == Integer.MAX_VALUE || (iRound = Math.round(((float) iK) * this.aspectRatio)) <= 0 || (z && !AspectRatioKt.c(j, iRound, iK))) ? q16.INSTANCE.a() : q16.c((((long) iRound) << 32) | (((long) iK) & 4294967295L));
    }

    private final long s3(long j, boolean z) {
        int iRound;
        int iL = kx1.l(j);
        return (iL == Integer.MAX_VALUE || (iRound = Math.round(((float) iL) / this.aspectRatio)) <= 0 || (z && !AspectRatioKt.c(j, iL, iRound))) ? q16.INSTANCE.a() : q16.c((((long) iL) << 32) | (((long) iRound) & 4294967295L));
    }

    private final long t3(long j, boolean z) {
        int iM = kx1.m(j);
        int iRound = Math.round(iM * this.aspectRatio);
        return (iRound <= 0 || (z && !AspectRatioKt.c(j, iRound, iM))) ? q16.INSTANCE.a() : q16.c((((long) iRound) << 32) | (((long) iM) & 4294967295L));
    }

    private final long u3(long j, boolean z) {
        int iN = kx1.n(j);
        int iRound = Math.round(iN / this.aspectRatio);
        return (iRound <= 0 || (z && !AspectRatioKt.c(j, iN, iRound))) ? q16.INSTANCE.a() : q16.c((((long) iN) << 32) | (((long) iRound) & 4294967295L));
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        long jN3 = n3(j);
        if (!q16.f(jN3, q16.INSTANCE.a())) {
            j = kx1.INSTANCE.c((int) (jN3 >> 32), (int) (jN3 & 4294967295L));
        }
        final o oVarR0 = dj7Var.r0(j);
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: androidx.compose.foundation.layout.e
            public final Object invoke(Object obj) {
                return f.o3(oVarR0, (o.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.c
    public int i(h66 h66Var, f66 f66Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.aspectRatio) : f66Var.W(i);
    }

    @Override // androidx.compose.ui.node.c
    public int m(h66 h66Var, f66 f66Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.aspectRatio) : f66Var.d0(i);
    }

    public final void p3(float f) {
        this.aspectRatio = f;
    }

    public final void q3(boolean z) {
        this.matchHeightConstraintsFirst = z;
    }

    @Override // androidx.compose.ui.node.c
    public int t(h66 h66Var, f66 f66Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.aspectRatio) : f66Var.q0(i);
    }

    @Override // androidx.compose.ui.node.c
    public int z(h66 h66Var, f66 f66Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.aspectRatio) : f66Var.o0(i);
    }
}
