package com.google.inputmethod;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\t\u001a\u00020\b2\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0018\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0006*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u001f\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"", "", "", "", "restoredValues", "Lkotlin/Function1;", "", "canBeSaved", "Lcom/google/android/qya;", "c", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Lcom/google/android/qya;", "", "f", "(Ljava/lang/CharSequence;)Z", "K", "V", "Lcom/google/android/k58;", "h", "(Ljava/util/Map;)Lcom/google/android/k58;", "Lcom/google/android/ks9;", "a", "Lcom/google/android/ks9;", "g", "()Lcom/google/android/ks9;", "LocalSaveableStateRegistry", "runtime-saveable"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class tya {
    private static final ks9<qya> a = fs1.j(new Function0() { // from class: com.google.android.sya
        public final Object invoke() {
            return tya.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final qya b() {
        return null;
    }

    public static final qya c(Map<String, ? extends List<? extends Object>> map, Function1<Object, Boolean> function1) {
        return new rya(map, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt.b(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final ks9<qya> g() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> k58<K, V> h(Map<K, ? extends V> map) {
        k58<K, V> k58Var = new k58<>(map.size());
        k58Var.t(map);
        return k58Var;
    }
}
