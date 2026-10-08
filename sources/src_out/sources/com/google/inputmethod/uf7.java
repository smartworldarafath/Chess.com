package com.google.inputmethod;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ak\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\t\"\u0004\b\u0000\u0010\u00002&\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u00012\"\u0010\b\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"T", "Lkotlin/Function2;", "Lcom/google/android/o0b;", "", "", "", "save", "Lkotlin/Function1;", "restore", "Lcom/google/android/k0b;", "c", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lcom/google/android/k0b;", "runtime-saveable"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class uf7 {
    public static final <T> k0b<T, Object> c(final Function2<? super o0b, ? super T, ? extends Map<String, ? extends Object>> function2, final Function1<? super Map<String, ? extends Object>, ? extends T> function1) {
        return k47.b(new Function2() { // from class: com.google.android.sf7
            public final Object invoke(Object obj, Object obj2) {
                return uf7.d(function2, (o0b) obj, obj2);
            }
        }, new Function1() { // from class: com.google.android.tf7
            public final Object invoke(Object obj) {
                return uf7.e(function1, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(Function2 function2, o0b o0bVar, Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) function2.invoke(o0bVar, obj)).entrySet()) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(Function1 function1, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.size() % 2 != 0) {
            throw new IllegalStateException("non-zero remainder");
        }
        for (int i = 0; i < list.size(); i += 2) {
            Object obj = list.get(i);
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, list.get(i + 1));
        }
        return function1.invoke(linkedHashMap);
    }
}
