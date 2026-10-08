package androidx.datastore.preferences;

import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.inputmethod.fmb;
import com.google.inputmethod.h58;
import com.google.inputmethod.uk9;
import com.google.inputmethod.xk9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/fmb;", "sharedPrefs", "Lcom/google/android/uk9;", "currentData", "<anonymous>", "(Lcom/google/android/fmb;Lcom/google/android/uk9;)Lcom/google/android/uk9;"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends SuspendLambda implements ps4<fmb, uk9, q22<? super uk9>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    SharedPreferencesMigrationKt$getMigrationFunction$1(q22<? super SharedPreferencesMigrationKt$getMigrationFunction$1> q22Var) {
        super(3, q22Var);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(fmb fmbVar, uk9 uk9Var, q22<? super uk9> q22Var) {
        SharedPreferencesMigrationKt$getMigrationFunction$1 sharedPreferencesMigrationKt$getMigrationFunction$1 = new SharedPreferencesMigrationKt$getMigrationFunction$1(q22Var);
        sharedPreferencesMigrationKt$getMigrationFunction$1.L$0 = fmbVar;
        sharedPreferencesMigrationKt$getMigrationFunction$1.L$1 = uk9Var;
        return sharedPreferencesMigrationKt$getMigrationFunction$1.invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        fmb fmbVar = (fmb) this.L$0;
        uk9 uk9Var = (uk9) this.L$1;
        Set<uk9.a<?>> setKeySet = uk9Var.a().keySet();
        ArrayList arrayList = new ArrayList(m.A(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((uk9.a) it.next()).getName());
        }
        Map<String, Object> mapB = fmbVar.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : mapB.entrySet()) {
            if (!arrayList.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        h58 h58VarD = uk9Var.d();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Boolean) {
                h58VarD.l(xk9.a(str), value);
            } else if (value instanceof Float) {
                h58VarD.l(xk9.d(str), value);
            } else if (value instanceof Integer) {
                h58VarD.l(xk9.e(str), value);
            } else if (value instanceof Long) {
                h58VarD.l(xk9.f(str), value);
            } else if (value instanceof String) {
                h58VarD.l(xk9.g(str), value);
            } else if (value instanceof Set) {
                uk9.a<Set<String>> aVarH = xk9.h(str);
                Intrinsics.h(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                h58VarD.l(aVarH, (Set) value);
            }
        }
        return h58VarD.e();
    }
}
