package androidx.fragment.app;

import com.google.android.rg6;
import com.google.inputmethod.CreationExtras;
import com.google.inputmethod.k9e;
import com.google.inputmethod.u9e;
import com.google.inputmethod.w8e;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/google/android/w8e;", "VM", "Landroidx/fragment/app/Fragment;", "Lcom/google/android/rg6;", "viewModelClass", "Lkotlin/Function0;", "Lcom/google/android/k9e;", "storeProducer", "Lcom/google/android/oe2;", "extrasProducer", "Landroidx/lifecycle/b0$c;", "factoryProducer", "Lkotlin/Lazy;", "b", "(Landroidx/fragment/app/Fragment;Lcom/google/android/rg6;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "Lcom/google/android/u9e;", "owner", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FragmentViewModelLazyKt {
    public static final <VM extends w8e> Lazy<VM> b(final Fragment fragment, rg6<VM> rg6Var, Function0<? extends k9e> function0, Function0<? extends CreationExtras> function1, Function0<? extends androidx.lifecycle.b0.c> function2) {
        if (function2 == null) {
            function2 = new Function0<androidx.lifecycle.b0.c>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final androidx.lifecycle.b0.c invoke() {
                    return fragment.getDefaultViewModelProviderFactory();
                }
            };
        }
        return new androidx.lifecycle.a0(rg6Var, function0, function2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u9e c(Lazy<? extends u9e> lazy) {
        return (u9e) lazy.getValue();
    }
}
