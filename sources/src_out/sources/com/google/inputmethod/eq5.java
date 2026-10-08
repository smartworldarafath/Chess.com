package com.google.inputmethod;

import com.google.android.fh6;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tJ%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/google/android/eq5;", "E", "", "Lcom/google/android/bq5;", "", "fromIndex", "toIndex", "subList", "(II)Lcom/google/android/eq5;", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface eq5<E> extends List<E>, bq5<E>, fh6 {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/google/android/eq5$a;", "E", "Lcom/google/android/eq5;", "Lkotlin/collections/b;", "source", "", "fromIndex", "toIndex", "<init>", "(Lcom/google/android/eq5;II)V", "index", "get", "(I)Ljava/lang/Object;", "subList", "(II)Lcom/google/android/eq5;", "a", "Lcom/google/android/eq5;", "b", "I", "c", "d", "_size", "getSize", "()I", "size", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a<E> extends b<E> implements eq5<E> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final eq5<E> source;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int fromIndex;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int toIndex;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private int _size;

        /* JADX WARN: Multi-variable type inference failed */
        public a(eq5<? extends E> eq5Var, int i, int i2) {
            this.source = eq5Var;
            this.fromIndex = i;
            this.toIndex = i2;
            f47.c(i, i2, eq5Var.size());
            this._size = i2 - i;
        }

        @Override // java.util.List
        public E get(int index) {
            f47.a(index, this._size);
            return this.source.get(this.fromIndex + index);
        }

        /* JADX INFO: renamed from: getSize, reason: from getter */
        public int get_size() {
            return this._size;
        }

        @Override // java.util.List
        public eq5<E> subList(int fromIndex, int toIndex) {
            f47.c(fromIndex, toIndex, this._size);
            eq5<E> eq5Var = this.source;
            int i = this.fromIndex;
            return new a(eq5Var, fromIndex + i, i + toIndex);
        }
    }

    @Override // java.util.List
    default eq5<E> subList(int fromIndex, int toIndex) {
        return new a(this, fromIndex, toIndex);
    }
}
