package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/b;", "b", "(Landroidx/compose/ui/b;)Landroidx/compose/ui/b;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class kq9 {
    public static final b b(b bVar) {
        return afb.c(bVar, true, new Function1() { // from class: com.google.android.jq9
            public final Object invoke(Object obj) {
                return kq9.c((nfb) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(nfb nfbVar) {
        SemanticsPropertiesKt.o0(nfbVar, ProgressBarRangeInfo.INSTANCE.a());
        return Unit.a;
    }
}
