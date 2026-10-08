package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010 ¨\u0006\""}, d2 = {"Lcom/google/android/rbd;", "", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lcom/google/android/rn8;", "initialPositionChange", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "touchSlop", "a", "(F)J", "f", "(J)F", "b", "positionChange", "", "shouldCommit", "c", "(JFZ)J", "initialPositionAccumulator", "", "g", "(J)V", "delta", "e", "(J)Z", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "i", "(Landroidx/compose/foundation/gestures/Orientation;)V", "J", "totalPositionChange", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class rbd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Orientation orientation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long totalPositionChange;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Horizontal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Vertical.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ rbd(Orientation orientation, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, j);
    }

    private final long a(float touchSlop) {
        if (this.orientation == null) {
            long j = this.totalPositionChange;
            return rn8.p(this.totalPositionChange, rn8.r(rn8.h(j, rn8.k(j)), touchSlop));
        }
        float f = f(this.totalPositionChange) - (Math.signum(f(this.totalPositionChange)) * touchSlop);
        float fB = b(this.totalPositionChange);
        if (this.orientation == Orientation.Horizontal) {
            return rn8.e((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
        }
        return rn8.e((((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public static /* synthetic */ long d(rbd rbdVar, long j, float f, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return rbdVar.c(j, f, z);
    }

    public static /* synthetic */ void h(rbd rbdVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = rn8.INSTANCE.c();
        }
        rbdVar.g(j);
    }

    public final float b(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j & 4294967295L : j >> 32));
    }

    public final long c(long positionChange, float touchSlop, boolean shouldCommit) {
        long jQ;
        if (shouldCommit) {
            jQ = rn8.q(this.totalPositionChange, positionChange);
            this.totalPositionChange = jQ;
        } else {
            jQ = rn8.q(this.totalPositionChange, positionChange);
        }
        return (this.orientation == null ? rn8.k(jQ) : Math.abs(f(jQ))) >= touchSlop ? a(touchSlop) : rn8.INSTANCE.b();
    }

    public final boolean e(long delta) {
        long jQ = rn8.q(this.totalPositionChange, delta);
        double dAtan2 = ((double) (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (jQ & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jQ >> 32))))) * 180)) / 3.141592653589793d;
        Orientation orientation = this.orientation;
        int i = orientation == null ? -1 : a.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i != 1) {
            return i == 2 && dAtan2 > 30.0d;
        }
        return dAtan2 < 30.0d;
    }

    public final float f(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    public final void g(long initialPositionAccumulator) {
        this.totalPositionChange = initialPositionAccumulator;
    }

    public final void i(Orientation orientation) {
        this.orientation = orientation;
    }

    private rbd(Orientation orientation, long j) {
        this.orientation = orientation;
        this.totalPositionChange = j;
    }

    public /* synthetic */ rbd(Orientation orientation, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orientation, (i & 2) != 0 ? rn8.INSTANCE.c() : j, null);
    }
}
