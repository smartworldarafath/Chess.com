package com.google.inputmethod;

import androidx.compose.ui.input.pointer.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.we9, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b*\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b&\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b\"\u0010-R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b0\u00104\u001a\u0004\b(\u00105R\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b7\u0010%R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b6\u00101R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b.\u0010%R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b+\u0010%¨\u00068"}, d2 = {"Lcom/google/android/we9;", "", "Lcom/google/android/se9;", "id", "", "uptime", "Lcom/google/android/rn8;", "positionOnScreen", "position", "", "down", "", "pressure", "Landroidx/compose/ui/input/pointer/j;", "type", "activeHover", "", "Lcom/google/android/gd5;", "historical", "scrollDelta", "scaleGestureFactor", "panGestureOffset", "originalEventPosition", "<init>", "(JJJJZFIZLjava/util/List;JFJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "d", "()J", "b", "m", "c", "h", "g", "e", "Z", "()Z", "f", "F", "i", "()F", "I", "l", "Ljava/util/List;", "()Ljava/util/List;", "j", "k", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PointerInputEventData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long uptime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long positionOnScreen;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long position;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean down;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final float pressure;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final boolean activeHover;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final List<HistoricalChange> historical;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final long scrollDelta;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private final float scaleGestureFactor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private final long panGestureOffset;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    private final long originalEventPosition;

    public /* synthetic */ PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, float f2, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, f, i, z2, list, j5, f2, j6, j7);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getActiveHover() {
        return this.activeHover;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDown() {
        return this.down;
    }

    public final List<HistoricalChange> c() {
        return this.historical;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) other;
        return se9.b(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && rn8.j(this.positionOnScreen, pointerInputEventData.positionOnScreen) && rn8.j(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && j.i(this.type, pointerInputEventData.type) && this.activeHover == pointerInputEventData.activeHover && Intrinsics.e(this.historical, pointerInputEventData.historical) && rn8.j(this.scrollDelta, pointerInputEventData.scrollDelta) && Float.compare(this.scaleGestureFactor, pointerInputEventData.scaleGestureFactor) == 0 && rn8.j(this.panGestureOffset, pointerInputEventData.panGestureOffset) && rn8.j(this.originalEventPosition, pointerInputEventData.originalEventPosition);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getPanGestureOffset() {
        return this.panGestureOffset;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getPositionOnScreen() {
        return this.positionOnScreen;
    }

    public int hashCode() {
        return (((((((((((((((((((((((se9.c(this.id) * 31) + Long.hashCode(this.uptime)) * 31) + rn8.o(this.positionOnScreen)) * 31) + rn8.o(this.position)) * 31) + Boolean.hashCode(this.down)) * 31) + Float.hashCode(this.pressure)) * 31) + j.j(this.type)) * 31) + Boolean.hashCode(this.activeHover)) * 31) + this.historical.hashCode()) * 31) + rn8.o(this.scrollDelta)) * 31) + Float.hashCode(this.scaleGestureFactor)) * 31) + rn8.o(this.panGestureOffset)) * 31) + rn8.o(this.originalEventPosition);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getScaleGestureFactor() {
        return this.scaleGestureFactor;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getUptime() {
        return this.uptime;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) se9.d(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) rn8.s(this.positionOnScreen)) + ", position=" + ((Object) rn8.s(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) j.k(this.type)) + ", activeHover=" + this.activeHover + ", historical=" + this.historical + ", scrollDelta=" + ((Object) rn8.s(this.scrollDelta)) + ", scaleGestureFactor=" + this.scaleGestureFactor + ", panGestureOffset=" + ((Object) rn8.s(this.panGestureOffset)) + ", originalEventPosition=" + ((Object) rn8.s(this.originalEventPosition)) + ')';
    }

    private PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List<HistoricalChange> list, long j5, float f2, long j6, long j7) {
        this.id = j;
        this.uptime = j2;
        this.positionOnScreen = j3;
        this.position = j4;
        this.down = z;
        this.pressure = f;
        this.type = i;
        this.activeHover = z2;
        this.historical = list;
        this.scrollDelta = j5;
        this.scaleGestureFactor = f2;
        this.panGestureOffset = j6;
        this.originalEventPosition = j7;
    }
}
