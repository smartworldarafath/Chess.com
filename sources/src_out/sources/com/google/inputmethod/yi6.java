package com.google.inputmethod;

import android.view.KeyEvent;
import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fR0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/google/android/yi6;", "Lcom/google/android/xi6;", "Landroidx/compose/ui/b$c;", "Lkotlin/Function1;", "Lcom/google/android/oi6;", "", "onEvent", "onPreEvent", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "event", "n2", "(Landroid/view/KeyEvent;)Z", "t0", "p", "Lkotlin/jvm/functions/Function1;", "getOnEvent", "()Lkotlin/jvm/functions/Function1;", "m3", "(Lkotlin/jvm/functions/Function1;)V", "q", "getOnPreEvent", "n3", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class yi6 extends b.c implements xi6 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function1<? super oi6, Boolean> onEvent;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private Function1<? super oi6, Boolean> onPreEvent;

    public yi6(Function1<? super oi6, Boolean> function1, Function1<? super oi6, Boolean> function2) {
        this.onEvent = function1;
        this.onPreEvent = function2;
    }

    public final void m3(Function1<? super oi6, Boolean> function1) {
        this.onEvent = function1;
    }

    @Override // com.google.inputmethod.xi6
    public boolean n2(KeyEvent event) {
        Function1<? super oi6, Boolean> function1 = this.onEvent;
        if (function1 != null) {
            return ((Boolean) function1.invoke(oi6.a(event))).booleanValue();
        }
        return false;
    }

    public final void n3(Function1<? super oi6, Boolean> function1) {
        this.onPreEvent = function1;
    }

    @Override // com.google.inputmethod.xi6
    public boolean t0(KeyEvent event) {
        Function1<? super oi6, Boolean> function1 = this.onPreEvent;
        if (function1 != null) {
            return ((Boolean) function1.invoke(oi6.a(event))).booleanValue();
        }
        return false;
    }
}
