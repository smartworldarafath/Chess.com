package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/google/android/c77;", "", "<init>", "()V", "Lcom/google/android/u9e;", "viewModelStoreOwner", "Lcom/google/android/os9;", "d", "(Lcom/google/android/u9e;)Lcom/google/android/os9;", "Lcom/google/android/ks9;", "b", "Lcom/google/android/ks9;", "LocalViewModelStoreOwner", "c", "(Landroidx/compose/runtime/d;I)Lcom/google/android/u9e;", "current", "lifecycle-viewmodel-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c77 {
    public static final c77 a = new c77();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final ks9<u9e> LocalViewModelStoreOwner = fs1.h(null, new Function0() { // from class: com.google.android.b77
        public final Object invoke() {
            return c77.b();
        }
    }, 1, null);
    public static final int c = 0;

    private c77() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u9e b() {
        return null;
    }

    public final u9e c(d dVar, int i) {
        if (e.k()) {
            e.o(-584162872, i, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:35)");
        }
        u9e u9eVarA = (u9e) dVar.v(LocalViewModelStoreOwner);
        if (u9eVarA == null) {
            dVar.y(1260197608);
            u9eVarA = d77.a(dVar, 0);
        } else {
            dVar.y(1260196492);
        }
        dVar.u();
        if (e.k()) {
            e.n();
        }
        return u9eVarA;
    }

    public final os9<u9e> d(u9e viewModelStoreOwner) {
        return LocalViewModelStoreOwner.d(viewModelStoreOwner);
    }
}
