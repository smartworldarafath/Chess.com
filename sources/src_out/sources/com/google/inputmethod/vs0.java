package com.google.inputmethod;

import androidx.compose.p002material3.SheetState;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.l;
import androidx.compose.ui.graphics.m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/b;", "Landroidx/compose/material3/SheetState;", "state", "e", "(Landroidx/compose/ui/b;Landroidx/compose/material3/SheetState;)Landroidx/compose/ui/b;", "c", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class vs0 {
    public static final b c(b bVar, final SheetState sheetState) {
        return l.c(bVar, new Function1() { // from class: com.google.android.us0
            public final Object invoke(Object obj) {
                return vs0.d(sheetState, (m) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(SheetState sheetState, m mVar) {
        float fX = sheetState.h().x();
        float fE = sheetState.h().p().e();
        float f = fX < fE ? fE - fX : 0.0f;
        mVar.M(f > 0.0f ? 1 / ((Float.intBitsToFloat((int) (mVar.getSize() & 4294967295L)) + f) / Float.intBitsToFloat((int) (mVar.getSize() & 4294967295L))) : 1.0f);
        mVar.i0(xdd.a(0.5f, 0.0f));
        return Unit.a;
    }

    public static final b e(b bVar, final SheetState sheetState) {
        return l.c(bVar, new Function1() { // from class: com.google.android.ts0
            public final Object invoke(Object obj) {
                return vs0.f(sheetState, (m) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(SheetState sheetState, m mVar) {
        float fX = sheetState.h().x();
        float fE = sheetState.h().p().e();
        float f = fX < fE ? fE - fX : 0.0f;
        mVar.M(f > 0.0f ? (Float.intBitsToFloat((int) (mVar.getSize() & 4294967295L)) + f) / Float.intBitsToFloat((int) (4294967295L & mVar.getSize())) : 1.0f);
        mVar.i0(xdd.a(0.5f, 0.0f));
        return Unit.a;
    }
}
