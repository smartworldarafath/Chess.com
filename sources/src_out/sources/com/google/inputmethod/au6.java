package com.google.inputmethod;

import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"$\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00000\nj\b\u0012\u0004\u0012\u00020\u0000`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/google/android/yt6;", "T", "", "firstVisibleIndex", "lastVisibleIndex", "", "positionedItems", "stickingItems", "c", "(IILjava/util/List;Ljava/util/List;)Ljava/util/List;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "a", "Ljava/util/Comparator;", "LazyLayoutMeasuredItemIndexComparator", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class au6 {
    private static final Comparator<yt6> a = new Comparator() { // from class: com.google.android.zt6
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return au6.b((yt6) obj, (yt6) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(yt6 yt6Var, yt6 yt6Var2) {
        return Intrinsics.i(yt6Var.getIndex(), yt6Var2.getIndex());
    }

    public static final <T extends yt6> List<T> c(int i, int i2, List<? extends T> list, List<? extends T> list2) {
        if (list.isEmpty()) {
            return m.p();
        }
        List<T> listB1 = m.B1(list2);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            int index = t.getIndex();
            if (i <= index && index <= i2) {
                listB1.add(t);
            }
        }
        m.F(listB1, a);
        return listB1;
    }
}
