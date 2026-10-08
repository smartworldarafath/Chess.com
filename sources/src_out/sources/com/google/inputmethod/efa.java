package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.bza;
import com.google.android.th6;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "T", "", "inputs", "Lcom/google/android/th6;", "serializer", "Lcom/google/android/bza;", "configuration", "Lkotlin/Function0;", "init", "a", "([Ljava/lang/Object;Lcom/google/android/th6;Lcom/google/android/bza;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;II)Ljava/lang/Object;", "runtime-saveable"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class efa {
    public static final <T> T a(Object[] objArr, th6<T> th6Var, bza bzaVar, Function0<? extends T> function0, d dVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            bzaVar = bza.e;
        }
        if (e.k()) {
            e.o(1261607160, i, -1, "androidx.compose.runtime.saveable.rememberSerializable (RememberSerializable.kt:93)");
        }
        T t = (T) dfa.j(Arrays.copyOf(objArr, objArr.length), ahb.c(th6Var, bzaVar), null, function0, dVar, (i & 7168) | 384, 0);
        if (e.k()) {
            e.n();
        }
        return t;
    }
}
