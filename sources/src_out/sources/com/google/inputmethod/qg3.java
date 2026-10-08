package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/google/android/qg3;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/yg3;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/fz1;", "j", "(Lcom/google/android/fz1;)V", "p", "Lkotlin/jvm/functions/Function1;", "getOnDraw", "()Lkotlin/jvm/functions/Function1;", "m3", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class qg3 extends b.c implements yg3 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function1<? super DrawScope, Unit> onDraw;

    public qg3(Function1<? super DrawScope, Unit> function1) {
        this.onDraw = function1;
    }

    @Override // com.google.inputmethod.yg3
    public void j(fz1 fz1Var) {
        this.onDraw.invoke(fz1Var);
        fz1Var.j1();
    }

    public final void m3(Function1<? super DrawScope, Unit> function1) {
        this.onDraw = function1;
    }
}
