package com.google.inputmethod;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aa\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00022\u001a\u0010\u0007\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Original", "Saveable", "Lkotlin/Function2;", "Lcom/google/android/o0b;", "", "save", "Lkotlin/Function1;", "restore", "Lcom/google/android/k0b;", "", "b", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lcom/google/android/k0b;", "runtime-saveable"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k47 {
    public static final <Original, Saveable> k0b<Original, Object> b(final Function2<? super o0b, ? super Original, ? extends List<? extends Saveable>> function2, Function1<? super List<? extends Saveable>, ? extends Original> function1) {
        Function2 function3 = new Function2() { // from class: com.google.android.j47
            public final Object invoke(Object obj, Object obj2) {
                return k47.c(function2, (o0b) obj, obj2);
            }
        };
        Intrinsics.h(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return n0b.e(function3, (Function1) a.f(function1, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(Function2 function2, o0b o0bVar, Object obj) {
        List list = (List) function2.invoke(o0bVar, obj);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            if (obj2 != null && !o0bVar.a(obj2)) {
                throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj2).toString());
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return new ArrayList(list);
    }
}
