package com.google.inputmethod;

import androidx.datastore.p007core.a;
import androidx.datastore.preferences.core.PreferenceDataStore;
import com.google.android.fc3;
import com.google.android.fec;
import com.google.android.m94;
import com.google.android.ta2;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011JU\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/google/android/ok9;", "", "<init>", "()V", "Lcom/google/android/jia;", "Lcom/google/android/uk9;", "corruptionHandler", "", "Lcom/google/android/gm2;", "migrations", "Lcom/google/android/ta2;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Lcom/google/android/ym2;", "b", "(Lcom/google/android/jia;Ljava/util/List;Lcom/google/android/ta2;Lkotlin/jvm/functions/Function0;)Lcom/google/android/ym2;", "Lcom/google/android/j9c;", "storage", "c", "(Lcom/google/android/j9c;Lcom/google/android/jia;Ljava/util/List;Lcom/google/android/ta2;)Lcom/google/android/ym2;", "datastore-preferences-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ok9 {
    public static final ok9 a = new ok9();

    private ok9() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ym2 d(ok9 ok9Var, jia jiaVar, List list, ta2 ta2Var, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            jiaVar = null;
        }
        if ((i & 2) != 0) {
            list = m.p();
        }
        if ((i & 4) != 0) {
            ta2Var = j.a(fc3.b().plus(fec.b((s) null, 1, (Object) null)));
        }
        return ok9Var.b(jiaVar, list, ta2Var, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File e(Function0 function0) {
        File file = (File) function0.invoke();
        if (Intrinsics.e(m94.x(file), "preferences_pb")) {
            File absoluteFile = file.getAbsoluteFile();
            Intrinsics.checkNotNullExpressionValue(absoluteFile, "getAbsoluteFile(...)");
            return absoluteFile;
        }
        throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
    }

    public final ym2<uk9> b(jia<uk9> corruptionHandler, List<? extends gm2<uk9>> migrations, ta2 scope, final Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return new PreferenceDataStore(c(new n84(wk9.a, null, new Function0() { // from class: com.google.android.nk9
            public final Object invoke() {
                return ok9.e(produceFile);
            }
        }, 2, null), corruptionHandler, migrations, scope));
    }

    public final ym2<uk9> c(j9c<uk9> storage, jia<uk9> corruptionHandler, List<? extends gm2<uk9>> migrations, ta2 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new PreferenceDataStore(a.a.b(storage, corruptionHandler, migrations, scope));
    }
}
