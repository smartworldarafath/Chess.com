package com.google.inputmethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u001a\u007f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0015\u001a\u00020\u0003*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/google/android/yt6;", "T", "Lcom/google/android/d9c;", "", "firstVisibleItemIndex", "lastVisibleItemIndex", "", "positionedItems", "Lcom/google/android/x06;", "stickyItems", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "Lkotlin/Function1;", "getAndMeasure", "", "b", "(Lcom/google/android/d9c;IILjava/util/List;Lcom/google/android/x06;IIIILkotlin/jvm/functions/Function1;)Ljava/util/List;", "c", "(Lcom/google/android/yt6;)I", "mainAxisOffset", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class xu6 {
    public static final <T extends yt6> List<T> b(d9c d9cVar, int i, int i2, List<T> list, x06 x06Var, int i3, int i4, int i5, int i6, Function1<? super Integer, ? extends T> function1) {
        d9c d9cVar2 = d9cVar;
        if (d9cVar2 == null || list.isEmpty() || x06Var._size == 0) {
            return m.p();
        }
        x06 x06VarB = d9cVar2.b(i, i2, x06Var);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            T t = list.get(i7);
            if (x06Var.c(t.getIndex())) {
                arrayList2.add(t);
            }
        }
        int[] iArr = x06VarB.content;
        int i8 = x06VarB._size;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = iArr[i9];
            Iterator<T> it = list.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (it.next().getIndex() == i10) {
                    break;
                }
                i11++;
            }
            T tRemove = i11 == -1 ? (yt6) function1.invoke(Integer.valueOf(i10)) : list.remove(i11);
            ArrayList arrayList3 = arrayList2;
            yt6 yt6Var = tRemove;
            int iA = d9cVar2.a(arrayList3, i10, tRemove.l(), i11 == -1 ? t04.INVALID_ID : c(tRemove), i3, i4, i5, i6);
            yt6Var.f(true);
            yt6Var.i(iA, 0, i5, i6);
            arrayList.add(yt6Var);
            i9++;
            d9cVar2 = d9cVar;
            arrayList2 = arrayList3;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(yt6 yt6Var) {
        long jN = yt6Var.n(0);
        return yt6Var.h() ? g16.l(jN) : g16.k(jN);
    }
}
