package com.google.inputmethod;

import androidx.compose.ui.node.LayoutNode;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/x23;", "", "throttleMillis", "debounceMillis", "Lkotlin/Function1;", "Lcom/google/android/nea;", "", "callback", "Lcom/google/android/x23$a;", "a", "(Lcom/google/android/x23;JJLkotlin/jvm/functions/Function1;)Lcom/google/android/x23$a;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ar8 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final x23.a a(x23 x23Var, long j, long j2, Function1<? super nea, Unit> function1) throws KotlinNothingValueException {
        LayoutNode layoutNodeQ = y23.q(x23Var);
        return fo6.b(layoutNodeQ).getRectManager().m(layoutNodeQ.getSemanticsId(), j, j2, x23Var, function1);
    }
}
