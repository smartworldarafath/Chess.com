package com.google.inputmethod;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/lt6;", "Lcom/google/android/mu6;", "pinnedItemList", "Lcom/google/android/us6;", "beyondBoundsInfo", "", "", "a", "(Lcom/google/android/lt6;Lcom/google/android/mu6;Lcom/google/android/us6;)Ljava/util/List;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class at6 {
    public static final List<Integer> a(lt6 lt6Var, mu6 mu6Var, us6 us6Var) {
        if (!us6Var.d() && mu6Var.isEmpty()) {
            return m.p();
        }
        ArrayList arrayList = new ArrayList();
        IntRange intRange = us6Var.d() ? new IntRange(us6Var.c(), Math.min(us6Var.b(), lt6Var.a() - 1)) : IntRange.e.a();
        int size = mu6Var.size();
        for (int i = 0; i < size; i++) {
            mu6.a aVar = mu6Var.get(i);
            int iA = mt6.a(lt6Var, aVar.getKey(), aVar.getIndex());
            int iF = intRange.f();
            if ((iA > intRange.i() || iF > iA) && iA >= 0 && iA < lt6Var.a()) {
                arrayList.add(Integer.valueOf(iA));
            }
        }
        int iF2 = intRange.f();
        int i2 = intRange.i();
        if (iF2 <= i2) {
            while (true) {
                arrayList.add(Integer.valueOf(iF2));
                if (iF2 == i2) {
                    break;
                }
                iF2++;
            }
        }
        return arrayList;
    }
}
