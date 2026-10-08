package com.google.inputmethod;

import android.view.KeyEvent;
import androidx.compose.p001foundation.text.KeyCommand;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/android/zi6;", "a", "Lcom/google/android/zi6;", "()Lcom/google/android/zi6;", "platformDefaultKeyMapping", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class bj6 {
    private static final zi6 a = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/google/android/bj6$a", "Lcom/google/android/zi6;", "Lcom/google/android/oi6;", "event", "Landroidx/compose/foundation/text/KeyCommand;", "a", "(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/KeyCommand;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements zi6 {
        a() {
        }

        @Override // com.google.inputmethod.zi6
        public KeyCommand a(KeyEvent event) {
            int iA = dj6.a(event);
            cj6.Companion companion = cj6.INSTANCE;
            KeyCommand keyCommand = null;
            if (cj6.j(iA, companion.b())) {
                long jA = si6.a(event);
                ii6.Companion companion2 = ii6.INSTANCE;
                if (ii6.T(jA, companion2.k())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (ii6.T(jA, companion2.l())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (ii6.T(jA, companion2.m())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (ii6.T(jA, companion2.j())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (cj6.j(iA, companion.a())) {
                long jA2 = si6.a(event);
                ii6.Companion companion3 = ii6.INSTANCE;
                if (ii6.T(jA2, companion3.k())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (ii6.T(jA2, companion3.l())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (ii6.T(jA2, companion3.m())) {
                    keyCommand = KeyCommand.HOME;
                } else if (ii6.T(jA2, companion3.j())) {
                    keyCommand = KeyCommand.END;
                } else if (ii6.T(jA2, companion3.d())) {
                    keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                }
            }
            return keyCommand == null ? aj6.b().a(event) : keyCommand;
        }
    }

    public static final zi6 a() {
        return a;
    }
}
