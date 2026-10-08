package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.e;
import com.google.android.rg6;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aS\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/android/w8e;", "VM", "Lcom/google/android/rg6;", "modelClass", "Lcom/google/android/u9e;", "viewModelStoreOwner", "", "key", "Landroidx/lifecycle/b0$c;", "factory", "Lcom/google/android/oe2;", "extras", "b", "(Lcom/google/android/rg6;Lcom/google/android/u9e;Ljava/lang/String;Landroidx/lifecycle/b0$c;Lcom/google/android/oe2;Landroidx/compose/runtime/d;II)Lcom/google/android/w8e;", "a", "(Lcom/google/android/u9e;Lcom/google/android/rg6;Ljava/lang/String;Landroidx/lifecycle/b0$c;Lcom/google/android/oe2;)Lcom/google/android/w8e;", "lifecycle-viewmodel-compose"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/lifecycle/viewmodel/compose/ViewModelKt")
final /* synthetic */ class d9e {
    public static final <VM extends w8e> VM a(u9e u9eVar, rg6<VM> rg6Var, String str, b0.c cVar, CreationExtras creationExtras) {
        b0 b0VarA;
        if (cVar != null) {
            b0VarA = b0.INSTANCE.a(u9eVar.getViewModelStore(), cVar, creationExtras);
        } else {
            b0VarA = u9eVar instanceof e ? b0.INSTANCE.a(u9eVar.getViewModelStore(), ((e) u9eVar).getDefaultViewModelProviderFactory(), creationExtras) : b0.Companion.d(b0.INSTANCE, u9eVar, null, null, 6, null);
        }
        return str != null ? (VM) b0VarA.c(str, rg6Var) : (VM) b0VarA.a(rg6Var);
    }

    public static final <VM extends w8e> VM b(rg6<VM> rg6Var, u9e u9eVar, String str, b0.c cVar, CreationExtras creationExtras, d dVar, int i, int i2) {
        if ((i2 & 2) != 0 && (u9eVar = c77.a.c(dVar, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            cVar = null;
        }
        if ((i2 & 16) != 0) {
            creationExtras = u9eVar instanceof e ? ((e) u9eVar).getDefaultViewModelCreationExtras() : CreationExtras.b.c;
        }
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.o(1673618944, i, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:105)");
        }
        VM vm = (VM) b9e.a(u9eVar, rg6Var, str, cVar, creationExtras);
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.n();
        }
        return vm;
    }
}
