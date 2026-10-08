package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.google.android.gd5, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nB1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R$\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/google/android/gd5;", "", "", "uptimeMillis", "Lcom/google/android/rn8;", "position", "", "scaleFactor", "panOffset", "<init>", "(JJFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "originalEventPosition", "(JJFJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "a", "J", "e", "()J", "b", "c", "F", "d", "()F", "value", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HistoricalChange {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long uptimeMillis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long position;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float scaleFactor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long panOffset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long originalEventPosition;

    public /* synthetic */ HistoricalChange(long j, long j2, float f, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f, j3, j4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getPanOffset() {
        return this.panOffset;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) rn8.s(this.position)) + ", scaleFactor=" + this.scaleFactor + ", panOffset=" + ((Object) rn8.s(this.panOffset)) + ')';
    }

    public /* synthetic */ HistoricalChange(long j, long j2, float f, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f, j3);
    }

    private HistoricalChange(long j, long j2, float f, long j3) {
        this.uptimeMillis = j;
        this.position = j2;
        this.scaleFactor = f;
        this.panOffset = j3;
        this.originalEventPosition = rn8.INSTANCE.c();
    }

    private HistoricalChange(long j, long j2, float f, long j3, long j4) {
        this(j, j2, f, j3, (DefaultConstructorMarker) null);
        this.originalEventPosition = j4;
    }
}
