package com.google.inputmethod;

import androidx.compose.p004runtime.e;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\t\u001a\u00020\b*\u00020\u00042\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u000e\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u0011\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/google/android/mg;", "Lcom/google/android/t27;", "c", "(Lcom/google/android/mg;)Lcom/google/android/t27;", "Lcom/google/android/hub;", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "handle", "Lcom/google/android/pg;", "a", "(Lcom/google/android/hub;J)Lcom/google/android/pg;", "Lcom/google/android/t27;", "e", "()Lcom/google/android/t27;", "NullAnchor", "b", "d", "LazyAnchor", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u27 {
    private static final t27 a = new t27(-1);
    private static final t27 b = new t27(0);

    public static final pg a(hub hubVar, long j) {
        return new pg(b(hubVar, v15.b(j)), b(hubVar, v15.a(j)));
    }

    private static final t27 b(hub hubVar, int i) {
        if (i != -1) {
            return i != 0 ? hubVar.d(i) : b;
        }
        return a;
    }

    public static final t27 c(mg mgVar) {
        t27 t27Var = mgVar instanceof t27 ? (t27) mgVar : null;
        if (t27Var != null) {
            return t27Var;
        }
        e.c("Inconsistent composition");
        throw new KotlinNothingValueException();
    }

    public static final t27 d() {
        return b;
    }

    public static final t27 e() {
        return a;
    }
}
