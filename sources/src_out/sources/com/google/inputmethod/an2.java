package com.google.inputmethod;

import android.content.Context;
import com.google.android.fc3;
import com.google.android.fec;
import com.google.android.ta2;
import com.google.android.v8a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ay\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t0\u00072\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"T", "", "fileName", "Lcom/google/android/mhb;", "serializer", "Lcom/google/android/jia;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Lcom/google/android/gm2;", "produceMigrations", "Lcom/google/android/ta2;", "scope", "Lcom/google/android/v8a;", "Lcom/google/android/ym2;", "b", "(Ljava/lang/String;Lcom/google/android/mhb;Lcom/google/android/jia;Lkotlin/jvm/functions/Function1;Lcom/google/android/ta2;)Lcom/google/android/v8a;", "datastore"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class an2 {
    public static final <T> v8a<Context, ym2<T>> b(String str, mhb<T> mhbVar, jia<T> jiaVar, Function1<? super Context, ? extends List<? extends gm2<T>>> function1, ta2 ta2Var) {
        Intrinsics.checkNotNullParameter(str, "fileName");
        Intrinsics.checkNotNullParameter(mhbVar, "serializer");
        Intrinsics.checkNotNullParameter(function1, "produceMigrations");
        Intrinsics.checkNotNullParameter(ta2Var, "scope");
        return new in2(str, new mp8(mhbVar), jiaVar, function1, ta2Var, false);
    }

    public static /* synthetic */ v8a c(String str, mhb mhbVar, jia jiaVar, Function1 function1, ta2 ta2Var, int i, Object obj) {
        if ((i & 4) != 0) {
            jiaVar = null;
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: com.google.android.zm2
                public final Object invoke(Object obj2) {
                    return an2.d((Context) obj2);
                }
            };
        }
        if ((i & 16) != 0) {
            ta2Var = j.a(fc3.b().plus(fec.b((s) null, 1, (Object) null)));
        }
        return b(str, mhbVar, jiaVar, function1, ta2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(Context context) {
        Intrinsics.checkNotNullParameter(context, "it");
        return m.p();
    }
}
