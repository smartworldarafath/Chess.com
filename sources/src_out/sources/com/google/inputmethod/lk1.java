package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class lk1 implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> a;
    final /* synthetic */ ContextMenuState b;

    public lk1(Function0<Unit> function0, ContextMenuState contextMenuState) {
        this.a = function0;
        this.b = contextMenuState;
    }

    public final void a() {
        this.a.invoke();
        q12.a(this.b);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        a();
        return Unit.a;
    }
}
