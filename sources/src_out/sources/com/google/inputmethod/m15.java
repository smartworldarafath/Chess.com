package com.google.inputmethod;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0002\t\u0007J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/google/android/m15;", "", "Lcom/google/android/f43;", "", "availableSize", "spacing", "", "a", "(Lcom/google/android/f43;II)Ljava/util/List;", "b", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface m15 {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/google/android/m15$a;", "Lcom/google/android/m15;", "Lcom/google/android/ff3;", "minSize", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/f43;", "", "availableSize", "spacing", "", "a", "(Lcom/google/android/f43;II)Ljava/util/List;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements m15 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float minSize;

        public /* synthetic */ a(float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }

        @Override // com.google.inputmethod.m15
        public List<Integer> a(f43 f43Var, int i, int i2) {
            return hp6.f(i, Math.max((i + i2) / (f43Var.O1(this.minSize) + i2), 1), i2);
        }

        public boolean equals(Object other) {
            return (other instanceof a) && ff3.k(this.minSize, ((a) other).minSize);
        }

        public int hashCode() {
            return ff3.l(this.minSize);
        }

        private a(float f) {
            this.minSize = f;
            if (ff3.h(f, ff3.i((float) 0)) > 0) {
                return;
            }
            cx5.a("Provided min size should be larger than zero.");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/android/m15$b;", "Lcom/google/android/m15;", "", "count", "<init>", "(I)V", "Lcom/google/android/f43;", "availableSize", "spacing", "", "a", "(Lcom/google/android/f43;II)Ljava/util/List;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements m15 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int count;

        public b(int i) {
            this.count = i;
            if (i > 0) {
                return;
            }
            cx5.a("Provided count should be larger than zero");
        }

        @Override // com.google.inputmethod.m15
        public List<Integer> a(f43 f43Var, int i, int i2) {
            return hp6.f(i, this.count, i2);
        }

        public boolean equals(Object other) {
            return (other instanceof b) && this.count == ((b) other).count;
        }

        public int hashCode() {
            return -this.count;
        }
    }

    List<Integer> a(f43 f43Var, int i, int i2);
}
