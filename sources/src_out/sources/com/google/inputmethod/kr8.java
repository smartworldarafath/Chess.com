package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/google/android/kr8;", "Lcom/google/android/fn6;", "Landroidx/compose/ui/b$c;", "Lkotlin/Function1;", "Lcom/google/android/kn6;", "", "callback", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "coordinates", "w", "(Lcom/google/android/kn6;)V", "p", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "m3", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class kr8 extends b.c implements fn6 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function1<? super kn6, Unit> callback;

    public kr8(Function1<? super kn6, Unit> function1) {
        this.callback = function1;
    }

    public final void m3(Function1<? super kn6, Unit> function1) {
        this.callback = function1;
    }

    @Override // com.google.inputmethod.fn6
    public void w(kn6 coordinates) {
        this.callback.invoke(coordinates);
    }
}
