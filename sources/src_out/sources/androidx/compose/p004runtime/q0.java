package androidx.compose.p004runtime;

import com.google.inputmethod.IntRef;
import com.google.inputmethod.bxb;
import com.google.inputmethod.pxb;
import com.google.inputmethod.q6c;
import com.google.inputmethod.r58;
import com.google.inputmethod.x43;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\" \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0014"}, d2 = {"T", "Lkotlin/Function0;", "calculation", "Lcom/google/android/q6c;", "d", "(Lkotlin/jvm/functions/Function0;)Lcom/google/android/q6c;", "Lcom/google/android/bxb;", "policy", "c", "(Lcom/google/android/bxb;Lkotlin/jvm/functions/Function0;)Lcom/google/android/q6c;", "Lcom/google/android/r58;", "Lcom/google/android/x43;", "b", "()Lcom/google/android/r58;", "Lcom/google/android/pxb;", "Lcom/google/android/m16;", "a", "Lcom/google/android/pxb;", "calculationBlockNestedLevel", "derivedStateObservers", "runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class q0 {
    private static final pxb<IntRef> a = new pxb<>();
    private static final pxb<r58<x43>> b = new pxb<>();

    public static final r58<x43> b() {
        pxb<r58<x43>> pxbVar = b;
        r58<x43> r58VarA = pxbVar.a();
        if (r58VarA != null) {
            return r58VarA;
        }
        r58<x43> r58Var = new r58<>(new x43[0], 0);
        pxbVar.b(r58Var);
        return r58Var;
    }

    public static final <T> q6c<T> c(bxb<T> bxbVar, Function0<? extends T> function0) {
        return new i(function0, bxbVar);
    }

    public static final <T> q6c<T> d(Function0<? extends T> function0) {
        return new i(function0, null);
    }
}
