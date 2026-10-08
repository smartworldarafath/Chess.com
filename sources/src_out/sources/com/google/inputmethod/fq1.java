package com.google.inputmethod;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/fq1;", "", "", "Lcom/google/android/iq1;", "frames", "", "hasSourceInformation", "<init>", "(Ljava/util/List;Z)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "()Z", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class fq1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<ComposeStackTraceFrame> frames;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean hasSourceInformation;

    public fq1(List<ComposeStackTraceFrame> list, boolean z) {
        this.frames = list;
        this.hasSourceInformation = z;
    }

    public final List<ComposeStackTraceFrame> a() {
        return this.frames;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasSourceInformation() {
        return this.hasSourceInformation;
    }
}
