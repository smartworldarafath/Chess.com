package com.google.inputmethod;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class yj8 {
    private static final Object a = new Object();
    private static final Object b = new Object();

    static Bundle a(vj8.b bVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = bVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.h() : 0);
        bundle.putCharSequence("title", bVar.h());
        bundle.putParcelable("actionIntent", bVar.a());
        Bundle bundle2 = bVar.c() != null ? new Bundle(bVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(bVar.e()));
        bundle.putBoolean("showsUserInterface", bVar.g());
        bundle.putInt("semanticAction", bVar.f());
        return bundle;
    }

    private static Bundle b(pfa pfaVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", pfaVar.i());
        bundle.putCharSequence("label", pfaVar.h());
        bundle.putCharSequenceArray("choices", pfaVar.e());
        bundle.putBoolean("allowFreeFormInput", pfaVar.c());
        bundle.putBundle("extras", pfaVar.g());
        Set<String> setD = pfaVar.d();
        if (setD != null && !setD.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setD.size());
            Iterator<String> it = setD.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(pfa[] pfaVarArr) {
        if (pfaVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[pfaVarArr.length];
        for (int i = 0; i < pfaVarArr.length; i++) {
            bundleArr[i] = b(pfaVarArr[i]);
        }
        return bundleArr;
    }
}
