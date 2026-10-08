package com.google.inputmethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/android/xp3;", "Lcom/google/android/zp3;", "<init>", "()V", "Lcom/google/android/rp3;", "copy", "()Lcom/google/android/rp3;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class xp3 extends EmittableLazyList {
    @Override // com.google.inputmethod.rp3
    public rp3 copy() {
        xp3 xp3Var = new xp3();
        xp3Var.b(getModifier());
        xp3Var.k(getHorizontalAlignment());
        xp3Var.j(getActivityOptions());
        List<rp3> listD = xp3Var.d();
        List<rp3> listD2 = d();
        ArrayList arrayList = new ArrayList(m.A(listD2, 10));
        Iterator<T> it = listD2.iterator();
        while (it.hasNext()) {
            arrayList.add(((rp3) it.next()).copy());
        }
        listD.addAll(arrayList);
        return xp3Var;
    }
}
