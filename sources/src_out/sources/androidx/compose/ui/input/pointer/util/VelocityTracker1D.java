package androidx.compose.ui.input.pointer.util;

import com.google.inputmethod.DataPointAtTime;
import com.google.inputmethod.z3e;
import com.google.inputmethod.zw5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.f;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001/B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0014\u0010\"\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u0016\u0010'\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u0014\u0010*\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010.\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)¨\u00060"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "", "", "isDataDifferential", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "strategy", "<init>", "(ZLandroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;)V", "(Z)V", "", "dataPoints", "time", "", "sampleCount", "", "b", "([F[FI)F", "", "timeMillis", "dataPoint", "", "a", "(JF)V", "c", "()F", "maximumVelocity", "d", "(F)F", "e", "()V", "Z", "()Z", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "I", "minSampleSize", "", "Lcom/google/android/hm2;", "[Lcom/google/android/hm2;", "samples", "index", "f", "[F", "reusableDataPointsArray", "g", "reusableTimeArray", "h", "reusableVelocityCoefficients", "Strategy", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VelocityTracker1D {
    public static final int i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isDataDifferential;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Strategy strategy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int minSampleSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final DataPointAtTime[] samples;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float[] reusableDataPointsArray;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float[] reusableTimeArray;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float[] reusableVelocityCoefficients;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Strategy {
        Lsq2,
        Impulse;

        private static final /* synthetic */ EnumEntries d = kotlin.enums.a.a(a());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[Strategy.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Strategy.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public VelocityTracker1D(boolean z, Strategy strategy) throws NoWhenBranchMatchedException {
        this.isDataDifferential = z;
        this.strategy = strategy;
        if (z && strategy.equals(Strategy.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i2 = a.$EnumSwitchMapping$0[strategy.ordinal()];
        int i3 = 2;
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = 3;
        }
        this.minSampleSize = i3;
        this.samples = new DataPointAtTime[20];
        this.reusableDataPointsArray = new float[20];
        this.reusableTimeArray = new float[20];
        this.reusableVelocityCoefficients = new float[3];
    }

    private final float b(float[] dataPoints, float[] time, int sampleCount) {
        try {
            return z3e.h(time, dataPoints, sampleCount, 2, this.reusableVelocityCoefficients)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void a(long timeMillis, float dataPoint) {
        int i2 = (this.index + 1) % 20;
        this.index = i2;
        z3e.i(this.samples, i2, timeMillis, dataPoint);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final float c() throws NoWhenBranchMatchedException {
        float fE;
        float[] fArr = this.reusableDataPointsArray;
        float[] fArr2 = this.reusableTimeArray;
        int i2 = this.index;
        DataPointAtTime dataPointAtTime = this.samples[i2];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i3 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = this.samples[i2];
            if (dataPointAtTime3 == null) {
                break;
            }
            float time = dataPointAtTime.getTime() - dataPointAtTime3.getTime();
            float fAbs = Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
            DataPointAtTime dataPointAtTime4 = (this.strategy == Strategy.Lsq2 || this.isDataDifferential) ? dataPointAtTime3 : dataPointAtTime;
            if (time > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i3] = dataPointAtTime3.getDataPoint();
            fArr2[i3] = -time;
            if (i2 == 0) {
                i2 = 20;
            }
            i2--;
            i3++;
            if (i3 >= 20) {
                break;
            }
            dataPointAtTime2 = dataPointAtTime4;
        }
        if (i3 < this.minSampleSize) {
            return 0.0f;
        }
        int i4 = a.$EnumSwitchMapping$0[this.strategy.ordinal()];
        if (i4 == 1) {
            fE = z3e.e(fArr, fArr2, i3, this.isDataDifferential);
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fE = b(fArr, fArr2, i3);
        }
        return fE * 1000;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final float d(float maximumVelocity) throws NoWhenBranchMatchedException {
        if (!(maximumVelocity > 0.0f)) {
            zw5.c("maximumVelocity should be a positive value. You specified=" + maximumVelocity);
        }
        float fC = c();
        if (fC == 0.0f || Float.isNaN(fC)) {
            return 0.0f;
        }
        return fC > 0.0f ? g.i(fC, maximumVelocity) : g.d(fC, -maximumVelocity);
    }

    public final void e() {
        f.G(this.samples, (Object) null, 0, 0, 6, (Object) null);
        this.index = 0;
    }

    public /* synthetic */ VelocityTracker1D(boolean z, Strategy strategy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? Strategy.Lsq2 : strategy);
    }

    public VelocityTracker1D(boolean z) {
        this(z, Strategy.Impulse);
    }
}
