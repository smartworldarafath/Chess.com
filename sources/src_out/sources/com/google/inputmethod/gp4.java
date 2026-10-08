package com.google.inputmethod;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "requestKey", "Landroid/os/Bundle;", "result", "", "b", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V", "Lkotlin/Function2;", "listener", "c", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class gp4 {
    public static final void b(Fragment fragment, String str, Bundle bundle) {
        fragment.getParentFragmentManager().C1(str, bundle);
    }

    public static final void c(Fragment fragment, String str, final Function2<? super String, ? super Bundle, Unit> function2) {
        fragment.getParentFragmentManager().D1(str, fragment, new up4() { // from class: com.google.android.ep4
            @Override // com.google.inputmethod.up4
            public final void a(String str2, Bundle bundle) {
                gp4.d(function2, str2, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function2 function2, String str, Bundle bundle) {
        function2.invoke(str, bundle);
    }
}
