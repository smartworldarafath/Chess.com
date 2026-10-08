package com.google.inputmethod;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import com.google.android.oda;
import com.google.android.ph6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"5\u0010\u0010\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00018@@@X\u0081\u008e\u0002¢\u0006\u0018\n\u0004\b\t\u0010\u0003\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lcom/google/android/d73;", "b", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getDesignInfoDataKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "DesignInfoDataKey", "Lcom/google/android/nfb;", "<set-?>", "c", "getDesignInfoProvider", "(Lcom/google/android/nfb;)Lcom/google/android/d73;", "a", "(Lcom/google/android/nfb;Lcom/google/android/d73;)V", "getDesignInfoProvider$annotations", "(Lcom/google/android/nfb;)V", "designInfoProvider", "compose_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class s9d {
    static final /* synthetic */ ph6<Object>[] a = {oda.g(new MutablePropertyReference1Impl(oda.d(s9d.class, "compose_release"), "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;"))};
    private static final SemanticsPropertyKey<d73> b;
    private static final SemanticsPropertyKey c;

    static {
        SemanticsPropertyKey<d73> semanticsPropertyKey = new SemanticsPropertyKey<>("DesignInfoProvider", (Function2) null, 2, (DefaultConstructorMarker) null);
        b = semanticsPropertyKey;
        c = semanticsPropertyKey;
    }

    public static final void a(nfb nfbVar, d73 d73Var) {
        Intrinsics.checkNotNullParameter(nfbVar, "<this>");
        Intrinsics.checkNotNullParameter(d73Var, "<set-?>");
        c.e(nfbVar, a[0], d73Var);
    }
}
