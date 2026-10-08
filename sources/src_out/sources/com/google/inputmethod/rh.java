package com.google.inputmethod;

import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/google/android/seb;", "", "d", "(Lcom/google/android/seb;)Z", "e", "f", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class rh {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(seb sebVar) {
        k58<SemanticsPropertyKey<?>, Object> k58VarQ = sebVar.q();
        SemanticsActions semanticsActions = SemanticsActions.a;
        return k58VarQ.b(semanticsActions.k()) || sebVar.q().b(semanticsActions.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(seb sebVar) {
        return sebVar.q().b(SemanticsProperties.a.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(seb sebVar) {
        k58<SemanticsPropertyKey<?>, Object> k58VarQ = sebVar.q();
        SemanticsActions semanticsActions = SemanticsActions.a;
        if (k58VarQ.b(semanticsActions.k()) || sebVar.q().b(semanticsActions.m())) {
            return true;
        }
        k58<SemanticsPropertyKey<?>, Object> k58VarQ2 = sebVar.q();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        return k58VarQ2.b(semanticsProperties.e()) || sebVar.q().b(semanticsProperties.c());
    }
}
