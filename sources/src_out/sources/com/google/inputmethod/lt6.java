package com.google.inputmethod;

import androidx.compose.p001foundation.lazy.layout.m;
import androidx.compose.p004runtime.d;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/google/android/lt6;", "", "", "index", "key", "", "i", "(ILjava/lang/Object;Landroidx/compose/runtime/d;I)V", "f", "(I)Ljava/lang/Object;", "d", "c", "(Ljava/lang/Object;)I", "a", "()I", "itemCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface lt6 {
    int a();

    default int c(Object key) {
        return -1;
    }

    default Object d(int index) {
        return m.a(index);
    }

    default Object f(int index) {
        return null;
    }

    void i(int i, Object obj, d dVar, int i2);
}
