package com.google.inputmethod;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.focus.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/k07;", "state", "Lcom/google/android/ok4;", "focusManager", "b", "(Landroidx/compose/ui/b;Lcom/google/android/k07;Lcom/google/android/ok4;)Landroidx/compose/ui/b;", "Lcom/google/android/oi6;", "", "keyCode", "", "c", "(Landroid/view/KeyEvent;I)Z", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class zsc {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function1<oi6, Boolean> {
        final /* synthetic */ ok4 a;
        final /* synthetic */ k07 b;

        a(ok4 ok4Var, k07 k07Var) {
            this.a = ok4Var;
            this.b = k07Var;
        }

        public final Boolean a(KeyEvent keyEvent) {
            InputDevice device = keyEvent.getDevice();
            boolean zV = false;
            if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent.getSource() == 33554433) && ri6.e(si6.b(keyEvent), ri6.INSTANCE.a()) && keyEvent.getSource() != 257)) {
                if (zsc.c(keyEvent, 19)) {
                    zV = this.a.v(b.INSTANCE.h());
                } else if (zsc.c(keyEvent, 20)) {
                    zV = this.a.v(b.INSTANCE.a());
                } else if (zsc.c(keyEvent, 21)) {
                    zV = this.a.v(b.INSTANCE.d());
                } else if (zsc.c(keyEvent, 22)) {
                    zV = this.a.v(b.INSTANCE.g());
                } else if (zsc.c(keyEvent, 23)) {
                    hyb keyboardController = this.b.getKeyboardController();
                    if (keyboardController != null) {
                        keyboardController.show();
                    }
                    zV = true;
                }
            }
            return Boolean.valueOf(zV);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((oi6) obj).getNativeKeyEvent());
        }
    }

    public static final androidx.compose.ui.b b(androidx.compose.ui.b bVar, k07 k07Var, ok4 ok4Var) {
        return wi6.b(bVar, new a(ok4Var, k07Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(KeyEvent keyEvent, int i) {
        return lj6.b(si6.a(keyEvent)) == i;
    }
}
