package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000f\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\u0018"}, d2 = {"Lcom/google/android/t06;", "", "", "first", "second", "b", "(II)J", "", "packedValue", "c", "(J)J", "", "h", "(J)Ljava/lang/String;", "g", "(J)I", "other", "", "d", "(JLjava/lang/Object;)Z", "a", "J", "e", "f", "collection"}, k = 1, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public final class t06 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long packedValue;

    private /* synthetic */ t06(long j) {
        this.packedValue = j;
    }

    public static final /* synthetic */ t06 a(long j) {
        return new t06(j);
    }

    public static long b(int i, int i2) {
        return c((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    public static long c(long j) {
        return j;
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof t06) && j == ((t06) obj).getPackedValue();
    }

    public static final int e(long j) {
        return (int) (j >> 32);
    }

    public static final int f(long j) {
        return (int) (j & 4294967295L);
    }

    public static int g(long j) {
        return Long.hashCode(j);
    }

    public static String h(long j) {
        return '(' + e(j) + ", " + f(j) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.packedValue, obj);
    }

    public int hashCode() {
        return g(this.packedValue);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return h(this.packedValue);
    }
}
