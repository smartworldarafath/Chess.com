package com.google.inputmethod;

import androidx.compose.p004runtime.e;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/g81;", "Lcom/google/android/b81;", "a", "(Lcom/google/android/g81;)Lcom/google/android/b81;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d81 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final b81 a(g81 g81Var) throws KotlinNothingValueException {
        b81 b81Var = g81Var instanceof b81 ? (b81) g81Var : null;
        if (b81Var != null) {
            return b81Var;
        }
        e.c("Inconsistent composition");
        throw new KotlinNothingValueException();
    }
}
