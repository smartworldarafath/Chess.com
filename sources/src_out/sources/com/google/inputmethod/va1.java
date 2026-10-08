package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/b;", "Lkotlin/Function1;", "Lcom/google/android/nfb;", "", "properties", "b", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/b;", "e", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class va1 {
    public static final b b(b bVar, Function1<? super nfb, Unit> function1) {
        return bVar.then(new za1(function1));
    }

    public static /* synthetic */ b c(b bVar, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: com.google.android.ua1
                public final Object invoke(Object obj2) {
                    return va1.d((nfb) obj2);
                }
            };
        }
        return b(bVar, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(nfb nfbVar) {
        return Unit.a;
    }

    public static final b e(b bVar, Function1<? super nfb, Unit> function1) {
        return bVar.then(new b29(function1));
    }
}
