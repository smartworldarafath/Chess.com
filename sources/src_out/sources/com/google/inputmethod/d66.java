package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\rJ\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/google/android/d66;", "T", "", "", "index", "Lcom/google/android/d66$a;", "get", "(I)Lcom/google/android/d66$a;", "fromIndex", "toIndex", "Lkotlin/Function1;", "", "block", "a", "(IILkotlin/jvm/functions/Function1;)V", "getSize", "()I", "size", "Lcom/google/android/t48;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d66<T> {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0006\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/android/d66$a;", "T", "", "", "startIndex", "size", "value", "<init>", "(IILjava/lang/Object;)V", "a", "I", "b", "()I", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int startIndex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int size;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final T value;

        public a(int i, int i2, T t) {
            this.startIndex = i;
            this.size = i2;
            this.value = t;
            if (!(i >= 0)) {
                cx5.a("startIndex should be >= 0");
            }
            if (i2 > 0) {
                return;
            }
            cx5.a("size should be > 0");
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getStartIndex() {
            return this.startIndex;
        }

        public final T c() {
            return this.value;
        }
    }

    void a(int fromIndex, int toIndex, Function1<? super a<? extends T>, Unit> block);

    a<T> get(int index);

    int getSize();
}
