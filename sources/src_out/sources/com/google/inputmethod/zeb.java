package com.google.inputmethod;

import androidx.p008glance.g;
import androidx.p008glance.semantics.SemanticsConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/g;", "Lkotlin/Function1;", "Lcom/google/android/mfb;", "", "properties", "a", "(Landroidx/glance/g;Lkotlin/jvm/functions/Function1;)Landroidx/glance/g;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class zeb {
    public static final g a(g gVar, Function1<? super mfb, Unit> function1) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        function1.invoke(semanticsConfiguration);
        return gVar.a(new SemanticsModifier(semanticsConfiguration));
    }
}
