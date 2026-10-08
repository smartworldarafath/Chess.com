package com.google.inputmethod;

import android.os.Bundle;
import com.google.android.bza;
import com.google.android.chb;
import com.google.android.hza;
import com.google.android.kza;
import com.google.android.s53;
import com.google.android.th6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\t\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "Serializable", "Lcom/google/android/th6;", "serializer", "Lcom/google/android/bza;", "configuration", "Lcom/google/android/k0b;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "c", "(Lcom/google/android/th6;Lcom/google/android/bza;)Lcom/google/android/k0b;", "runtime-saveable"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ahb {
    public static final <Serializable> k0b<Serializable, Bundle> c(final th6<Serializable> th6Var, final bza bzaVar) {
        return n0b.e(new Function2() { // from class: com.google.android.ygb
            public final Object invoke(Object obj, Object obj2) {
                return ahb.d(th6Var, bzaVar, (o0b) obj, obj2);
            }
        }, new Function1() { // from class: com.google.android.zgb
            public final Object invoke(Object obj) {
                return ahb.e(th6Var, bzaVar, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(th6 th6Var, bza bzaVar, o0b o0bVar, Object obj) {
        return kza.a((chb) th6Var, obj, bzaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(th6 th6Var, bza bzaVar, Bundle bundle) {
        return hza.a((s53) th6Var, bundle, bzaVar);
    }
}
