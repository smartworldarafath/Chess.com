package androidx.p008glance.p010session;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: renamed from: androidx.glance.session.d, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/glance/session/d;", "", "Lkotlin/time/b;", "initialTimeout", "additionalTime", "idleTimeout", "Landroidx/glance/session/c;", "timeSource", "<init>", "(JJJLandroidx/glance/session/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "d", "Landroidx/glance/session/c;", "()Landroidx/glance/session/c;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TimeoutOptions {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long initialTimeout;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long additionalTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long idleTimeout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final c timeSource;

    public /* synthetic */ TimeoutOptions(long j, long j2, long j3, c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, cVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAdditionalTime() {
        return this.additionalTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getIdleTimeout() {
        return this.idleTimeout;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getInitialTimeout() {
        return this.initialTimeout;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getTimeSource() {
        return this.timeSource;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeoutOptions)) {
            return false;
        }
        TimeoutOptions timeoutOptions = (TimeoutOptions) other;
        return b.p(this.initialTimeout, timeoutOptions.initialTimeout) && b.p(this.additionalTime, timeoutOptions.additionalTime) && b.p(this.idleTimeout, timeoutOptions.idleTimeout) && Intrinsics.e(this.timeSource, timeoutOptions.timeSource);
    }

    public int hashCode() {
        return (((((b.E(this.initialTimeout) * 31) + b.E(this.additionalTime)) * 31) + b.E(this.idleTimeout)) * 31) + this.timeSource.hashCode();
    }

    public String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) b.U(this.initialTimeout)) + ", additionalTime=" + ((Object) b.U(this.additionalTime)) + ", idleTimeout=" + ((Object) b.U(this.idleTimeout)) + ", timeSource=" + this.timeSource + ')';
    }

    private TimeoutOptions(long j, long j2, long j3, c cVar) {
        this.initialTimeout = j;
        this.additionalTime = j2;
        this.idleTimeout = j3;
        this.timeSource = cVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TimeoutOptions(long j, long j2, long j3, c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long jS;
        long jS2;
        long jS3;
        if ((i & 1) != 0) {
            b.a aVar = b.b;
            jS = c.s(45, DurationUnit.d);
        } else {
            jS = j;
        }
        if ((i & 2) != 0) {
            b.a aVar2 = b.b;
            jS2 = c.s(5, DurationUnit.d);
        } else {
            jS2 = j2;
        }
        if ((i & 4) != 0) {
            b.a aVar3 = b.b;
            jS3 = c.s(5, DurationUnit.d);
        } else {
            jS3 = j3;
        }
        this(jS, jS2, jS3, (i & 8) != 0 ? c.INSTANCE.c() : cVar, null);
    }
}
