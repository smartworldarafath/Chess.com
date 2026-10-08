package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/google/android/us6;", "", "<init>", "()V", "", "start", "end", "Lcom/google/android/us6$a;", "a", "(II)Lcom/google/android/us6$a;", "interval", "", "e", "(Lcom/google/android/us6$a;)V", "", "d", "()Z", "Lcom/google/android/r58;", "Lcom/google/android/r58;", "beyondBoundsItems", "c", "()I", "b", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class us6 {
    public static final int b = r58.d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final r58<Interval> beyondBoundsItems = new r58<>(new Interval[16], 0);

    /* JADX INFO: renamed from: com.google.android.us6$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/google/android/us6$a;", "", "", "start", "end", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Interval {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int start;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int end;

        public Interval(int i, int i2) {
            this.start = i;
            this.end = i2;
            if (!(i >= 0)) {
                cx5.a("negative start index");
            }
            if (i2 >= i) {
                return;
            }
            cx5.a("end index greater than start");
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) other;
            return this.start == interval.start && this.end == interval.end;
        }

        public int hashCode() {
            return (Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end);
        }

        public String toString() {
            return "Interval(start=" + this.start + ", end=" + this.end + ')';
        }
    }

    public final Interval a(int start, int end) {
        Interval interval = new Interval(start, end);
        this.beyondBoundsItems.c(interval);
        return interval;
    }

    public final int b() {
        int end = this.beyondBoundsItems.n().getEnd();
        r58<Interval> r58Var = this.beyondBoundsItems;
        Interval[] intervalArr = r58Var.content;
        int size = r58Var.getSize();
        for (int i = 0; i < size; i++) {
            Interval interval = intervalArr[i];
            if (interval.getEnd() > end) {
                end = interval.getEnd();
            }
        }
        return end;
    }

    public final int c() {
        int start = this.beyondBoundsItems.n().getStart();
        r58<Interval> r58Var = this.beyondBoundsItems;
        Interval[] intervalArr = r58Var.content;
        int size = r58Var.getSize();
        for (int i = 0; i < size; i++) {
            Interval interval = intervalArr[i];
            if (interval.getStart() < start) {
                start = interval.getStart();
            }
        }
        if (!(start >= 0)) {
            cx5.a("negative minIndex");
        }
        return start;
    }

    public final boolean d() {
        return this.beyondBoundsItems.getSize() != 0;
    }

    public final void e(Interval interval) {
        this.beyondBoundsItems.s(interval);
    }
}
