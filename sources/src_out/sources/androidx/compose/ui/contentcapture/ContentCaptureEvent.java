package androidx.compose.ui.contentcapture;

import com.google.inputmethod.rae;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.contentcapture.b, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006!"}, d2 = {"Landroidx/compose/ui/contentcapture/b;", "", "", "id", "", "timestamp", "Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "type", "Lcom/google/android/rae;", "structureCompat", "<init>", "(IJLandroidx/compose/ui/contentcapture/ContentCaptureEventType;Lcom/google/android/rae;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "J", "getTimestamp", "()J", "c", "Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "()Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "d", "Lcom/google/android/rae;", "()Lcom/google/android/rae;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class ContentCaptureEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final ContentCaptureEventType type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final rae structureCompat;

    public ContentCaptureEvent(int i, long j, ContentCaptureEventType contentCaptureEventType, rae raeVar) {
        this.id = i;
        this.timestamp = j;
        this.type = contentCaptureEventType;
        this.structureCompat = raeVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final rae getStructureCompat() {
        return this.structureCompat;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ContentCaptureEventType getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentCaptureEvent)) {
            return false;
        }
        ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) other;
        return this.id == contentCaptureEvent.id && this.timestamp == contentCaptureEvent.timestamp && this.type == contentCaptureEvent.type && Intrinsics.e(this.structureCompat, contentCaptureEvent.structureCompat);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.id) * 31) + Long.hashCode(this.timestamp)) * 31) + this.type.hashCode()) * 31;
        rae raeVar = this.structureCompat;
        return iHashCode + (raeVar == null ? 0 : raeVar.hashCode());
    }

    public String toString() {
        return "ContentCaptureEvent(id=" + this.id + ", timestamp=" + this.timestamp + ", type=" + this.type + ", structureCompat=" + this.structureCompat + ')';
    }
}
