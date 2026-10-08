package androidx.datastore.preferences;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.inputmethod.uk9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/uk9;", "prefs", "", "<anonymous>", "(Lcom/google/android/uk9;)Z"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class SharedPreferencesMigrationKt$getShouldRunMigration$1 extends SuspendLambda implements Function2<uk9, q22<? super Boolean>, Object> {
    final /* synthetic */ Set<String> $keysToMigrate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedPreferencesMigrationKt$getShouldRunMigration$1(Set<String> set, q22<? super SharedPreferencesMigrationKt$getShouldRunMigration$1> q22Var) {
        super(2, q22Var);
        this.$keysToMigrate = set;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(uk9 uk9Var, q22<? super Boolean> q22Var) {
        return create(uk9Var, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1 = new SharedPreferencesMigrationKt$getShouldRunMigration$1(this.$keysToMigrate, q22Var);
        sharedPreferencesMigrationKt$getShouldRunMigration$1.L$0 = obj;
        return sharedPreferencesMigrationKt$getShouldRunMigration$1;
    }

    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Set<uk9.a<?>> setKeySet = ((uk9) this.L$0).a().keySet();
        ArrayList arrayList = new ArrayList(m.A(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((uk9.a) it.next()).getName());
        }
        boolean z = true;
        if (this.$keysToMigrate != SharedPreferencesMigrationKt.c()) {
            Set<String> set = this.$keysToMigrate;
            if ((set instanceof Collection) && set.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (!arrayList.contains((String) it2.next())) {
                    }
                }
                z = false;
            }
        }
        return ut0.a(z);
    }
}
