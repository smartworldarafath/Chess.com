package androidx.compose.p004runtime;

import androidx.compose.p004runtime.snapshots.SnapshotStateList;
import com.google.inputmethod.SnapshotStateMap;
import com.google.inputmethod.bxb;
import com.google.inputmethod.o58;
import com.google.inputmethod.q6c;
import kotlin.Metadata;
import kotlin.collections.f;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0013\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"T", "value", "Lcom/google/android/bxb;", "policy", "Lcom/google/android/o58;", "d", "(Ljava/lang/Object;Lcom/google/android/bxb;)Lcom/google/android/o58;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "a", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "elements", "b", "([Ljava/lang/Object;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "K", "V", "Lcom/google/android/kxb;", "c", "()Lcom/google/android/kxb;", "newValue", "Lcom/google/android/q6c;", "f", "(Ljava/lang/Object;Landroidx/compose/runtime/d;I)Lcom/google/android/q6c;", "runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class s0 {
    public static final <T> SnapshotStateList<T> a() {
        return new SnapshotStateList<>();
    }

    public static final <T> SnapshotStateList<T> b(T... tArr) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(f.w1(tArr));
        return snapshotStateList;
    }

    public static final <K, V> SnapshotStateMap<K, V> c() {
        return new SnapshotStateMap<>();
    }

    public static final <T> o58<T> d(T t, bxb<T> bxbVar) {
        return t0.a(t, bxbVar);
    }

    public static /* synthetic */ o58 e(Object obj, bxb bxbVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            bxbVar = p0.t();
        }
        return p0.i(obj, bxbVar);
    }

    public static final <T> q6c<T> f(T t, d dVar, int i) {
        if (e.k()) {
            e.o(-1058319986, i, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:340)");
        }
        Object objR = dVar.R();
        if (objR == d.INSTANCE.a()) {
            objR = e(t, null, 2, null);
            dVar.L(objR);
        }
        o58 o58Var = (o58) objR;
        o58Var.setValue(t);
        if (e.k()) {
            e.n();
        }
        return o58Var;
    }
}
