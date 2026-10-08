package com.google.inputmethod;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Lcom/google/android/u9e;", "viewModelStoreOwner", "", "b", "(Landroid/view/View;Lcom/google/android/u9e;)V", "a", "(Landroid/view/View;)Lcom/google/android/u9e;", "lifecycle-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class jbe {
    public static final u9e a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(hy9.a);
            u9e u9eVar = tag instanceof u9e ? (u9e) tag : null;
            if (u9eVar != null) {
                return u9eVar;
            }
            Object objA = cbe.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final void b(View view, u9e u9eVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(hy9.a, u9eVar);
    }
}
