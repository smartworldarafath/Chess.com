package androidx.datastore.p007core;

import com.google.android.fc3;
import com.google.android.fec;
import com.google.android.ta2;
import com.google.inputmethod.di8;
import com.google.inputmethod.gm2;
import com.google.inputmethod.j9c;
import com.google.inputmethod.jia;
import com.google.inputmethod.mhb;
import com.google.inputmethod.n84;
import com.google.inputmethod.ym2;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J[\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/datastore/core/a;", "", "<init>", "()V", "T", "Lcom/google/android/mhb;", "serializer", "Lcom/google/android/jia;", "corruptionHandler", "", "Lcom/google/android/gm2;", "migrations", "Lcom/google/android/ta2;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Lcom/google/android/ym2;", "a", "(Lcom/google/android/mhb;Lcom/google/android/jia;Ljava/util/List;Lcom/google/android/ta2;Lkotlin/jvm/functions/Function0;)Lcom/google/android/ym2;", "Lcom/google/android/j9c;", "storage", "b", "(Lcom/google/android/j9c;Lcom/google/android/jia;Ljava/util/List;Lcom/google/android/ta2;)Lcom/google/android/ym2;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final a a = new a();

    private a() {
    }

    public static /* synthetic */ ym2 c(a aVar, mhb mhbVar, jia jiaVar, List list, ta2 ta2Var, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            jiaVar = null;
        }
        if ((i & 4) != 0) {
            list = m.p();
        }
        if ((i & 8) != 0) {
            ta2Var = j.a(fc3.b().plus(fec.b((s) null, 1, (Object) null)));
        }
        return aVar.a(mhbVar, jiaVar, list, ta2Var, function0);
    }

    public final <T> ym2<T> a(mhb<T> serializer, jia<T> corruptionHandler, List<? extends gm2<T>> migrations, ta2 scope, Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return b(new n84(serializer, null, produceFile, 2, null), corruptionHandler, migrations, scope);
    }

    public final <T> ym2<T> b(j9c<T> storage, jia<T> corruptionHandler, List<? extends gm2<T>> migrations, ta2 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (corruptionHandler == null) {
            corruptionHandler = (jia<T>) new di8();
        }
        return new DataStoreImpl(storage, m.e(DataMigrationInitializer.INSTANCE.b(migrations)), corruptionHandler, scope);
    }
}
