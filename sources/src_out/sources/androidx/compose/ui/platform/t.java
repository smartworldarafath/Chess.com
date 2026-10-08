package androidx.compose.ui.platform;

import com.google.inputmethod.f43;
import com.google.inputmethod.jf3;
import com.google.inputmethod.q16;
import com.google.inputmethod.r16;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/t;", "", "Lcom/google/android/q16;", "pxSize", "Lcom/google/android/jf3;", "dpSize", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "b", "()J", "getDpSize-MYxV2XQ", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final t d = new t(q16.INSTANCE.a(), jf3.INSTANCE.b(), null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long pxSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long dpSize;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.t$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\nR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/t$a;", "", "<init>", "()V", "Lcom/google/android/q16;", "pxSize", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/platform/t;", "b", "(JLcom/google/android/f43;)Landroidx/compose/ui/platform/t;", "Lcom/google/android/jf3;", "dpSize", "a", "Zero", "Landroidx/compose/ui/platform/t;", "c", "()Landroidx/compose/ui/platform/t;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a(long dpSize, f43 density) {
            return new t(r16.d(density.b1(dpSize)), dpSize, null);
        }

        public final t b(long pxSize, f43 density) {
            return new t(pxSize, density.S(r16.e(pxSize)), null);
        }

        public final t c() {
            return t.d;
        }

        private Companion() {
        }
    }

    public /* synthetic */ t(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getPxSize() {
        return this.pxSize;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t)) {
            return false;
        }
        t tVar = (t) other;
        return q16.f(this.pxSize, tVar.pxSize) && jf3.f(this.dpSize, tVar.dpSize);
    }

    public int hashCode() {
        return (q16.i(this.pxSize) * 31) + jf3.i(this.dpSize);
    }

    private t(long j, long j2) {
        this.pxSize = j;
        this.dpSize = j2;
    }
}
