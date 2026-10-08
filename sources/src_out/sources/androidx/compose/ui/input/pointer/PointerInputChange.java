package androidx.compose.ui.input.pointer;

import com.google.inputmethod.HistoricalChange;
import com.google.inputmethod.rn8;
import com.google.inputmethod.se9;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.i, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b.\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJw\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b#\u0010$J\u0081\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b-\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b7\u0010,R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b9\u0010,R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u00102R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b/\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b?\u0010,R\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b@\u00106R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b:\u0010,R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010AR\"\u0010\u001a\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010*\u001a\u0004\b8\u0010,\"\u0004\bC\u0010DR\"\u0010H\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u00100\u001a\u0004\bE\u00102\"\u0004\bF\u0010GR\"\u0010K\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u00100\u001a\u0004\bI\u00102\"\u0004\bJ\u0010GR$\u0010R\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178F¢\u0006\u0006\u001a\u0004\b3\u0010SR\u0011\u0010T\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bL\u00102¨\u0006U"}, d2 = {"Landroidx/compose/ui/input/pointer/i;", "", "Lcom/google/android/se9;", "id", "", "uptimeMillis", "Lcom/google/android/rn8;", "position", "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", "Landroidx/compose/ui/input/pointer/j;", "type", "scrollDelta", "scaleFactor", "panOffset", "<init>", "(JJJZFJJZZIJFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Lcom/google/android/gd5;", "historical", "originalEventPosition", "(JJJZFJJZZILjava/util/List;JFJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "a", "()V", "currentTime", "currentPosition", "currentPressed", "previousTime", "b", "(JJJZJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/i;", "d", "(JJJZFJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/i;", "", "toString", "()Ljava/lang/String;", "J", "f", "()J", "p", "c", "i", "Z", "j", "()Z", "e", "F", "k", "()F", "getPreviousUptimeMillis", "g", "l", "h", "m", "I", "o", "()I", "n", "getScaleFactor", "Ljava/util/List;", "_historical", "setOriginalEventPosition-k-4lQ0M$ui", "(J)V", "getDownChange$ui", "setDownChange$ui", "(Z)V", "downChange", "getPositionChange$ui", "setPositionChange$ui", "positionChange", "q", "Landroidx/compose/ui/input/pointer/i;", "getConsumedDelegate$ui", "()Landroidx/compose/ui/input/pointer/i;", "setConsumedDelegate$ui", "(Landroidx/compose/ui/input/pointer/i;)V", "consumedDelegate", "()Ljava/util/List;", "isConsumed", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PointerInputChange {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long uptimeMillis;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long position;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean pressed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final float pressure;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final long previousUptimeMillis;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final long previousPosition;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final boolean previousPressed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final long scrollDelta;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private final float scaleFactor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private final long panOffset;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private List<HistoricalChange> _historical;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private long originalEventPosition;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean downChange;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean positionChange;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private PointerInputChange consumedDelegate;

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, f2, j7);
    }

    public static /* synthetic */ PointerInputChange c(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List list, long j6, int i2, Object obj) {
        long j7;
        long j8 = (i2 & 1) != 0 ? pointerInputChange.id : j;
        long j9 = (i2 & 2) != 0 ? pointerInputChange.uptimeMillis : j2;
        long j10 = (i2 & 4) != 0 ? pointerInputChange.position : j3;
        boolean z3 = (i2 & 8) != 0 ? pointerInputChange.pressed : z;
        long j11 = (i2 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j4;
        long j12 = (i2 & 32) != 0 ? pointerInputChange.previousPosition : j5;
        boolean z4 = (i2 & 64) != 0 ? pointerInputChange.previousPressed : z2;
        int i3 = (i2 & 128) != 0 ? pointerInputChange.type : i;
        if ((i2 & 512) != 0) {
            j7 = pointerInputChange.scrollDelta;
            j8 = j8;
        } else {
            j7 = j6;
        }
        return pointerInputChange.b(j8, j9, j10, z3, j11, j12, z4, i3, list, j7);
    }

    public final void a() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            this.downChange = true;
            this.positionChange = true;
        } else if (pointerInputChange != null) {
            pointerInputChange.a();
        }
    }

    public final PointerInputChange b(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, List<HistoricalChange> historical, long scrollDelta) {
        PointerInputChange pointerInputChangeD = d(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, historical, scrollDelta);
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            pointerInputChange = this;
        }
        pointerInputChangeD.consumedDelegate = pointerInputChange;
        return pointerInputChangeD;
    }

    public final PointerInputChange d(long id, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, List<HistoricalChange> historical, long scrollDelta) {
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, historical, scrollDelta, this.scaleFactor, this.panOffset, this.originalEventPosition, null);
        PointerInputChange pointerInputChange2 = this.consumedDelegate;
        if (pointerInputChange2 == null) {
            pointerInputChange2 = this;
        }
        pointerInputChange.consumedDelegate = pointerInputChange2;
        return pointerInputChange;
    }

    public final List<HistoricalChange> e() {
        List<HistoricalChange> list = this._historical;
        return list == null ? m.p() : list;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getPanOffset() {
        return this.panOffset;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getPressed() {
        return this.pressed;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean q() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange != null) {
            return pointerInputChange.q();
        }
        return this.downChange || this.positionChange;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) se9.d(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) rn8.s(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) rn8.s(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + q() + ", type=" + ((Object) j.k(this.type)) + ", historical=" + e() + ", scrollDelta=" + ((Object) rn8.s(this.scrollDelta)) + ", scaleFactor=" + this.scaleFactor + ", panOffset=" + ((Object) rn8.s(this.panOffset)) + ')';
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, float f2, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, (List<HistoricalChange>) list, j6, f2, j7, j8);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.id = j;
        this.uptimeMillis = j2;
        this.position = j3;
        this.pressed = z;
        this.pressure = f;
        this.previousUptimeMillis = j4;
        this.previousPosition = j5;
        this.previousPressed = z2;
        this.type = i;
        this.scrollDelta = j6;
        this.scaleFactor = f2;
        this.panOffset = j7;
        this.originalEventPosition = rn8.INSTANCE.c();
        this.downChange = z3;
        this.positionChange = z3;
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, (i2 & 512) != 0 ? j.INSTANCE.d() : i, (i2 & 1024) != 0 ? rn8.INSTANCE.c() : j6, (i2 & 2048) != 0 ? 1.0f : f2, (i2 & 4096) != 0 ? rn8.INSTANCE.c() : j7, null);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List<HistoricalChange> list, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, f2, j7, null);
        this._historical = list;
        this.originalEventPosition = j8;
    }
}
