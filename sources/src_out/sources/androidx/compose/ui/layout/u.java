package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0083@\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/layout/u;", "", "", "value", "s", "(I)I", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = s(0);
    private static final int c = s(1);
    private static final int d = s(2);
    private static final int e = s(3);
    private static final int f = s(4);
    private static final int g = s(5);
    private static final int h = s(6);
    private static final int i = s(7);
    private static final int j = s(8);
    private static final int k = s(9);
    private static final int l = s(10);
    private static final int m = s(11);
    private static final int n = s(12);
    private static final int o = s(13);
    private static final int p = s(14);
    private static final int q = s(15);
    private static final int r = s(16);
    private static final int s = s(17);

    /* JADX INFO: renamed from: androidx.compose.ui.layout.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\b¨\u0006+"}, d2 = {"Landroidx/compose/ui/layout/u$a;", "", "<init>", "()V", "Landroidx/compose/ui/layout/u;", "CancelPausedPrecomposition", "I", "b", "()I", "ReuseForceSyncDeactivation", "h", "ReuseScheduleOutOfFrameDeactivation", "i", "ReuseSyncDeactivation", "j", "ReuseDeactivationViaHost", "g", "TookFromPrecomposeMap", "r", "Subcompose", "n", "SubcomposeNew", "p", "SubcomposePausable", "q", "SubcomposeForceReuse", "o", "DeactivateOutOfFrame", "c", "DeactivateOutOfFrameCancelled", "d", "SlotToReusedFromOnDeactivate", "l", "SlotToReusedFromOnReuse", "m", "Reused", "k", "ResumePaused", "f", "PausePaused", "e", "ApplyPaused", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return u.s;
        }

        public final int b() {
            return u.b;
        }

        public final int c() {
            return u.l;
        }

        public final int d() {
            return u.m;
        }

        public final int e() {
            return u.r;
        }

        public final int f() {
            return u.q;
        }

        public final int g() {
            return u.f;
        }

        public final int h() {
            return u.c;
        }

        public final int i() {
            return u.d;
        }

        public final int j() {
            return u.e;
        }

        public final int k() {
            return u.p;
        }

        public final int l() {
            return u.n;
        }

        public final int m() {
            return u.o;
        }

        public final int n() {
            return u.h;
        }

        public final int o() {
            return u.k;
        }

        public final int p() {
            return u.i;
        }

        public final int q() {
            return u.j;
        }

        public final int r() {
            return u.g;
        }

        private Companion() {
        }
    }

    public static int s(int i2) {
        return i2;
    }

    public static final boolean t(int i2, int i3) {
        return i2 == i3;
    }
}
