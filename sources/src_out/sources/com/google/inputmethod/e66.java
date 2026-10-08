package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Lcom/google/android/r58;", "Lcom/google/android/d66$a;", "", "itemIndex", "b", "(Lcom/google/android/r58;I)I", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e66 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int b(r58<d66.a<T>> r58Var, int i) {
        int size = r58Var.getSize() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = ((size - i2) / 2) + i2;
            int startIndex = r58Var.content[i3].getStartIndex();
            if (startIndex != i) {
                if (startIndex < i) {
                    i2 = i3 + 1;
                    if (i < r58Var.content[i2].getStartIndex()) {
                    }
                } else {
                    size = i3 - 1;
                }
            }
            return i3;
        }
        return i2;
    }
}
