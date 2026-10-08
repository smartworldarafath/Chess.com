package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.iq1, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/google/android/iq1;", "", "", "groupKey", "Lcom/google/android/gzb;", "sourceInfo", "groupOffset", "<init>", "(ILcom/google/android/gzb;Ljava/lang/Integer;)V", "a", "(ILcom/google/android/gzb;Ljava/lang/Integer;)Lcom/google/android/iq1;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "c", "b", "Lcom/google/android/gzb;", "e", "()Lcom/google/android/gzb;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ComposeStackTraceFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int groupKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final gzb sourceInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final Integer groupOffset;

    public ComposeStackTraceFrame(int i, gzb gzbVar, Integer num) {
        this.groupKey = i;
        this.sourceInfo = gzbVar;
        this.groupOffset = num;
    }

    public static /* synthetic */ ComposeStackTraceFrame b(ComposeStackTraceFrame composeStackTraceFrame, int i, gzb gzbVar, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = composeStackTraceFrame.groupKey;
        }
        if ((i2 & 2) != 0) {
            gzbVar = composeStackTraceFrame.sourceInfo;
        }
        if ((i2 & 4) != 0) {
            num = composeStackTraceFrame.groupOffset;
        }
        return composeStackTraceFrame.a(i, gzbVar, num);
    }

    public final ComposeStackTraceFrame a(int groupKey, gzb sourceInfo, Integer groupOffset) {
        return new ComposeStackTraceFrame(groupKey, sourceInfo, groupOffset);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getGroupKey() {
        return this.groupKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getGroupOffset() {
        return this.groupOffset;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final gzb getSourceInfo() {
        return this.sourceInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposeStackTraceFrame)) {
            return false;
        }
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) other;
        return this.groupKey == composeStackTraceFrame.groupKey && Intrinsics.e(this.sourceInfo, composeStackTraceFrame.sourceInfo) && Intrinsics.e(this.groupOffset, composeStackTraceFrame.groupOffset);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.groupKey) * 31;
        gzb gzbVar = this.sourceInfo;
        int iHashCode2 = (iHashCode + (gzbVar == null ? 0 : gzbVar.hashCode())) * 31;
        Integer num = this.groupOffset;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.groupKey + ", sourceInfo=" + this.sourceInfo + ", groupOffset=" + this.groupOffset + ')';
    }
}
