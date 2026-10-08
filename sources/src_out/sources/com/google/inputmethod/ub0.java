package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b!\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0003R\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u000fR\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u000fR\"\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u000fR\"\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u000fR\"\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u000fR\"\u0010-\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0016¨\u0006."}, d2 = {"Lcom/google/android/ub0;", "", "<init>", "()V", "", "new", "current", "b", "(JJ)J", "", "a", "(II)I", "timeNanos", "", "k", "(J)V", "o", "n", "j", "l", "count", "m", "(I)V", "c", "J", "e", "()J", "setCompositionTimeNanos", "compositionTimeNanos", "i", "setResumeTimeNanos", "resumeTimeNanos", "h", "setPauseTimeNanos", "pauseTimeNanos", "d", "setApplyTimeNanos", "applyTimeNanos", "f", "setMeasureTimeNanos", "measureTimeNanos", "I", "g", "()I", "setNestedPrefetchCount", "nestedPrefetchCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ub0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long compositionTimeNanos;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long resumeTimeNanos;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long pauseTimeNanos;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long applyTimeNanos;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long measureTimeNanos;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int nestedPrefetchCount = -1;

    private final int a(int i, int current) {
        return current == -1 ? i : ((current * 3) + i) / 4;
    }

    private final long b(long j, long current) {
        if (current == 0) {
            return j;
        }
        long j2 = 4;
        return ((current / j2) * ((long) 3)) + (j / j2);
    }

    public final void c() {
        this.measureTimeNanos = 0L;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getApplyTimeNanos() {
        return this.applyTimeNanos;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getCompositionTimeNanos() {
        return this.compositionTimeNanos;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getMeasureTimeNanos() {
        return this.measureTimeNanos;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getNestedPrefetchCount() {
        return this.nestedPrefetchCount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getPauseTimeNanos() {
        return this.pauseTimeNanos;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getResumeTimeNanos() {
        return this.resumeTimeNanos;
    }

    public final void j(long timeNanos) {
        this.applyTimeNanos = b(timeNanos, this.applyTimeNanos);
    }

    public final void k(long timeNanos) {
        this.compositionTimeNanos = b(timeNanos, this.compositionTimeNanos);
    }

    public final void l(long timeNanos) {
        this.measureTimeNanos = b(timeNanos, this.measureTimeNanos);
    }

    public final void m(int count) {
        this.nestedPrefetchCount = a(count, this.nestedPrefetchCount);
    }

    public final void n(long timeNanos) {
        this.pauseTimeNanos = b(timeNanos, this.pauseTimeNanos);
    }

    public final void o(long timeNanos) {
        this.resumeTimeNanos = b(timeNanos, this.resumeTimeNanos);
    }
}
