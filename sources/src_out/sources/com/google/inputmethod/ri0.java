package com.google.inputmethod;

import androidx.compose.p001foundation.MutatorMutex;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/google/android/ri0;", "", "<init>", "()V", "Landroidx/compose/foundation/MutatorMutex;", "b", "Landroidx/compose/foundation/MutatorMutex;", "a", "()Landroidx/compose/foundation/MutatorMutex;", "GlobalMutatorMutex", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ri0 {
    public static final ri0 a = new ri0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final MutatorMutex GlobalMutatorMutex = new MutatorMutex();

    private ri0() {
    }

    public final MutatorMutex a() {
        return GlobalMutatorMutex;
    }
}
