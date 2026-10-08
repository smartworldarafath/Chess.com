package com.google.inputmethod;

import android.view.KeyEvent;
import androidx.compose.p001foundation.text.KeyCommand;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/google/android/cj6;", "systemShortcutModifiers", "Lcom/google/android/zi6;", "a", "(I)Lcom/google/android/zi6;", "Lcom/google/android/zi6;", "b", "()Lcom/google/android/zi6;", "defaultKeyMapping", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class aj6 {
    private static final zi6 a = new b(a(cj6.INSTANCE.c()));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/google/android/aj6$a", "Lcom/google/android/zi6;", "Lcom/google/android/oi6;", "event", "Landroidx/compose/foundation/text/KeyCommand;", "a", "(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/KeyCommand;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements zi6 {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // com.google.inputmethod.zi6
        public KeyCommand a(KeyEvent event) {
            int iA = dj6.a(event);
            int i = this.a;
            cj6.Companion companion = cj6.INSTANCE;
            if (cj6.j(iA, cj6.k(i, companion.f()))) {
                if (ii6.T(si6.a(event), ii6.INSTANCE.P())) {
                    return KeyCommand.REDO;
                }
                return null;
            }
            if (cj6.j(iA, this.a)) {
                long jA = si6.a(event);
                ii6.Companion companion2 = ii6.INSTANCE;
                if (ii6.T(jA, companion2.e()) || ii6.T(jA, companion2.r()) || ii6.T(jA, companion2.C())) {
                    return KeyCommand.COPY;
                }
                if (ii6.T(jA, companion2.M())) {
                    return KeyCommand.PASTE;
                }
                if (ii6.T(jA, companion2.N())) {
                    return KeyCommand.CUT;
                }
                if (ii6.T(jA, companion2.a())) {
                    return KeyCommand.SELECT_ALL;
                }
                if (ii6.T(jA, companion2.O())) {
                    return KeyCommand.REDO;
                }
                if (ii6.T(jA, companion2.P())) {
                    return KeyCommand.UNDO;
                }
                return null;
            }
            if (cj6.j(iA, companion.f())) {
                long jA2 = si6.a(event);
                ii6.Companion companion3 = ii6.INSTANCE;
                if (ii6.T(jA2, companion3.k()) || ii6.T(jA2, companion3.y())) {
                    return KeyCommand.SELECT_LEFT_CHAR;
                }
                if (ii6.T(jA2, companion3.l()) || ii6.T(jA2, companion3.z())) {
                    return KeyCommand.SELECT_RIGHT_CHAR;
                }
                if (ii6.T(jA2, companion3.m()) || ii6.T(jA2, companion3.A())) {
                    return KeyCommand.SELECT_UP;
                }
                if (ii6.T(jA2, companion3.j()) || ii6.T(jA2, companion3.x())) {
                    return KeyCommand.SELECT_DOWN;
                }
                if (ii6.T(jA2, companion3.I()) || ii6.T(jA2, companion3.G())) {
                    return KeyCommand.SELECT_PAGE_UP;
                }
                if (ii6.T(jA2, companion3.H()) || ii6.T(jA2, companion3.F())) {
                    return KeyCommand.SELECT_PAGE_DOWN;
                }
                if (ii6.T(jA2, companion3.u()) || ii6.T(jA2, companion3.E())) {
                    return KeyCommand.SELECT_LINE_START;
                }
                if (ii6.T(jA2, companion3.t()) || ii6.T(jA2, companion3.D())) {
                    return KeyCommand.SELECT_LINE_END;
                }
                if (ii6.T(jA2, companion3.r()) || ii6.T(jA2, companion3.C())) {
                    return KeyCommand.PASTE;
                }
                return null;
            }
            if (!cj6.j(iA, companion.e())) {
                return null;
            }
            long jA3 = si6.a(event);
            ii6.Companion companion4 = ii6.INSTANCE;
            if (ii6.T(jA3, companion4.k()) || ii6.T(jA3, companion4.y())) {
                return KeyCommand.LEFT_CHAR;
            }
            if (ii6.T(jA3, companion4.l()) || ii6.T(jA3, companion4.z())) {
                return KeyCommand.RIGHT_CHAR;
            }
            if (ii6.T(jA3, companion4.m()) || ii6.T(jA3, companion4.A())) {
                return KeyCommand.UP;
            }
            if (ii6.T(jA3, companion4.j()) || ii6.T(jA3, companion4.x())) {
                return KeyCommand.DOWN;
            }
            if (ii6.T(jA3, companion4.i())) {
                return KeyCommand.CENTER;
            }
            if (ii6.T(jA3, companion4.I()) || ii6.T(jA3, companion4.G())) {
                return KeyCommand.PAGE_UP;
            }
            if (ii6.T(jA3, companion4.H()) || ii6.T(jA3, companion4.F())) {
                return KeyCommand.PAGE_DOWN;
            }
            if (ii6.T(jA3, companion4.u()) || ii6.T(jA3, companion4.E())) {
                return KeyCommand.LINE_START;
            }
            if (ii6.T(jA3, companion4.t()) || ii6.T(jA3, companion4.D())) {
                return KeyCommand.LINE_END;
            }
            if (ii6.T(jA3, companion4.n()) || ii6.T(jA3, companion4.B())) {
                return KeyCommand.NEW_LINE;
            }
            if (ii6.T(jA3, companion4.d())) {
                return KeyCommand.DELETE_PREV_CHAR;
            }
            if (ii6.T(jA3, companion4.h())) {
                return KeyCommand.DELETE_NEXT_CHAR;
            }
            if (ii6.T(jA3, companion4.J())) {
                return KeyCommand.PASTE;
            }
            if (ii6.T(jA3, companion4.g())) {
                return KeyCommand.CUT;
            }
            if (ii6.T(jA3, companion4.f())) {
                return KeyCommand.COPY;
            }
            if (ii6.T(jA3, companion4.L())) {
                return KeyCommand.TAB;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/google/android/aj6$b", "Lcom/google/android/zi6;", "Lcom/google/android/oi6;", "event", "Landroidx/compose/foundation/text/KeyCommand;", "a", "(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/KeyCommand;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements zi6 {
        final /* synthetic */ zi6 a;

        b(zi6 zi6Var) {
            this.a = zi6Var;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004b  */
        @Override // com.google.inputmethod.zi6
        public KeyCommand a(KeyEvent event) {
            KeyCommand keyCommand;
            int iA = dj6.a(event);
            long jA = si6.a(event);
            ii6.Companion companion = ii6.INSTANCE;
            KeyCommand keyCommand2 = null;
            if (ii6.T(jA, companion.d())) {
                cj6.Companion companion2 = cj6.INSTANCE;
                if (cj6.j(iA, companion2.e()) || cj6.j(iA, companion2.f()) || cj6.j(iA, companion2.g())) {
                    keyCommand = KeyCommand.DELETE_PREV_CHAR;
                } else if (cj6.j(iA, companion2.c()) || cj6.j(iA, companion2.d())) {
                    keyCommand = KeyCommand.DELETE_PREV_WORD;
                } else {
                    keyCommand = null;
                }
            } else if (ii6.T(jA, companion.n()) || ii6.T(jA, companion.B())) {
                cj6.Companion companion3 = cj6.INSTANCE;
                if (cj6.j(iA, companion3.e()) || cj6.j(iA, companion3.f()) || cj6.j(iA, companion3.c()) || cj6.j(iA, companion3.d())) {
                    keyCommand = KeyCommand.NEW_LINE;
                } else {
                    keyCommand = null;
                }
            } else {
                keyCommand = null;
            }
            if (keyCommand != null) {
                return keyCommand;
            }
            int iA2 = dj6.a(event);
            cj6.Companion companion4 = cj6.INSTANCE;
            if (cj6.j(iA2, companion4.d())) {
                long jA2 = si6.a(event);
                if (ii6.T(jA2, companion.k()) || ii6.T(jA2, companion.y())) {
                    keyCommand2 = KeyCommand.SELECT_LEFT_WORD;
                } else if (ii6.T(jA2, companion.l()) || ii6.T(jA2, companion.z())) {
                    keyCommand2 = KeyCommand.SELECT_RIGHT_WORD;
                } else if (ii6.T(jA2, companion.m()) || ii6.T(jA2, companion.A())) {
                    keyCommand2 = KeyCommand.SELECT_PREV_PARAGRAPH;
                } else if (ii6.T(jA2, companion.j()) || ii6.T(jA2, companion.x())) {
                    keyCommand2 = KeyCommand.SELECT_NEXT_PARAGRAPH;
                }
            } else if (cj6.j(iA2, companion4.c())) {
                long jA3 = si6.a(event);
                if (ii6.T(jA3, companion.k()) || ii6.T(jA3, companion.y())) {
                    keyCommand2 = KeyCommand.LEFT_WORD;
                } else if (ii6.T(jA3, companion.l()) || ii6.T(jA3, companion.z())) {
                    keyCommand2 = KeyCommand.RIGHT_WORD;
                } else if (ii6.T(jA3, companion.m()) || ii6.T(jA3, companion.A())) {
                    keyCommand2 = KeyCommand.PREV_PARAGRAPH;
                } else if (ii6.T(jA3, companion.j()) || ii6.T(jA3, companion.x())) {
                    keyCommand2 = KeyCommand.NEXT_PARAGRAPH;
                } else if (ii6.T(jA3, companion.q())) {
                    keyCommand2 = KeyCommand.DELETE_PREV_CHAR;
                } else if (ii6.T(jA3, companion.h())) {
                    keyCommand2 = KeyCommand.DELETE_NEXT_WORD;
                } else if (ii6.T(jA3, companion.c())) {
                    keyCommand2 = KeyCommand.DESELECT;
                }
            } else if (cj6.j(iA2, companion4.f())) {
                long jA4 = si6.a(event);
                if (ii6.T(jA4, companion.u()) || ii6.T(jA4, companion.E())) {
                    keyCommand2 = KeyCommand.SELECT_LINE_START;
                } else if (ii6.T(jA4, companion.t()) || ii6.T(jA4, companion.D())) {
                    keyCommand2 = KeyCommand.SELECT_LINE_END;
                }
            } else if (cj6.j(iA2, companion4.a()) && ii6.T(si6.a(event), companion.h())) {
                keyCommand2 = KeyCommand.DELETE_TO_LINE_END;
            }
            return keyCommand2 == null ? this.a.a(event) : keyCommand2;
        }
    }

    public static final zi6 a(int i) {
        return new a(i);
    }

    public static final zi6 b() {
        return a;
    }
}
