package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0007J#\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/google/android/v4c;", "", "Lcom/google/android/f43;", "", "availableSize", "spacing", "", "a", "(Lcom/google/android/f43;II)[I", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface v4c {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/android/v4c$a;", "Lcom/google/android/v4c;", "", "count", "<init>", "(I)V", "Lcom/google/android/f43;", "availableSize", "spacing", "", "a", "(Lcom/google/android/f43;II)[I", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements v4c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int count;

        public a(int i) {
            this.count = i;
            if (i > 0) {
                return;
            }
            cx5.a("grid with no rows/columns");
        }

        @Override // com.google.inputmethod.v4c
        public int[] a(f43 f43Var, int i, int i2) {
            return vx6.b(i, this.count, i2);
        }

        public boolean equals(Object other) {
            return (other instanceof a) && this.count == ((a) other).count;
        }

        public int hashCode() {
            return -this.count;
        }
    }

    int[] a(f43 f43Var, int i, int i2);
}
