package com.google.inputmethod;

import android.util.SparseBooleanArray;
import com.google.android.v06;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/util/SparseBooleanArray;", "Lcom/google/android/v06;", "a", "(Landroid/util/SparseBooleanArray;)Lcom/google/android/v06;", "core-ktx"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j0c {

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"com/google/android/j0c$a", "Lcom/google/android/v06;", "", "hasNext", "()Z", "", "nextInt", "()I", "a", "I", "getIndex", "setIndex", "(I)V", "index", "core-ktx"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends v06 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int index;
        final /* synthetic */ SparseBooleanArray b;

        a(SparseBooleanArray sparseBooleanArray) {
            this.b = sparseBooleanArray;
        }

        public boolean hasNext() {
            return this.index < this.b.size();
        }

        public int nextInt() {
            SparseBooleanArray sparseBooleanArray = this.b;
            int i = this.index;
            this.index = i + 1;
            return sparseBooleanArray.keyAt(i);
        }
    }

    public static final v06 a(SparseBooleanArray sparseBooleanArray) {
        return new a(sparseBooleanArray);
    }
}
