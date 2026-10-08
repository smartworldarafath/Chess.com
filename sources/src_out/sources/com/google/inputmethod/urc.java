package com.google.inputmethod;

import androidx.compose.ui.b;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001au\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012 \b\u0002\u0010\u0007\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032 \b\u0002\u0010\b\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/p9d;", "requester", "Lkotlin/Function1;", "Lcom/google/android/q22;", "", "", "onShow", "onHide", "Lcom/google/android/kn6;", "Lcom/google/android/gba;", "computeContentBounds", "a", "(Landroidx/compose/ui/b;Lcom/google/android/p9d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/b;", "rootContentBounds", "localCoordinates", "destinationCoordinates", "b", "(Lcom/google/android/gba;Lcom/google/android/kn6;Lcom/google/android/kn6;)Lcom/google/android/gba;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class urc {
    public static final b a(b bVar, p9d p9dVar, Function1<? super q22<? super Unit>, ? extends Object> function1, Function1<? super q22<? super Unit>, ? extends Object> function2, Function1<? super kn6, gba> function3) {
        return bVar.then(new trc(p9dVar, function1, function2, function3));
    }

    public static final gba b(gba gbaVar, kn6 kn6Var, kn6 kn6Var2) {
        if (!kn6Var.b() || !kn6Var2.b()) {
            return gba.INSTANCE.a();
        }
        return kba.c(kn6Var2.Q(ln6.f(kn6Var), gbaVar.m()), gbaVar.k());
    }
}
