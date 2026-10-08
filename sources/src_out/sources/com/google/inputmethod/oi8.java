package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.c;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\b\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001b\"\u001c\u0010 \u001a\u00020\u0015*\u0006\u0012\u0002\b\u00030\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/ui/b$b;", "element", "", "f", "(Landroidx/compose/ui/b$b;)I", "Landroidx/compose/ui/b$c;", "node", "g", "(Landroidx/compose/ui/b$c;)I", "", "d", "(Landroidx/compose/ui/b$c;)V", "a", "e", "remainingSet", "phase", "b", "(Landroidx/compose/ui/b$c;II)V", "selfKindSet", "c", "Lcom/google/android/tk4;", "", "j", "(Lcom/google/android/tk4;)Z", "h", "Lcom/google/android/d58;", "", "Lcom/google/android/d58;", "classToKindSetMap", "Lcom/google/android/ni8;", "i", "(I)Z", "includeSelfInTraversal", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class oi8 {
    private static final d58<Object> a = xl8.b();

    public static final void a(b.c cVar) {
        if (!cVar.getIsAttached()) {
            zw5.c("autoInvalidateInsertedNode called on unattached node");
        }
        b(cVar, -1, 1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final void b(b.c cVar, int i, int i2) throws KotlinNothingValueException {
        if (!(cVar instanceof k33)) {
            c(cVar, i & cVar.getKindSet(), i2);
            return;
        }
        k33 k33Var = (k33) cVar;
        c(cVar, k33Var.getSelfKindSet() & i, i2);
        int i3 = (~k33Var.getSelfKindSet()) & i;
        for (b.c cVarN3 = k33Var.getDelegate(); cVarN3 != null; cVarN3 = cVarN3.getChild()) {
            b(cVarN3, i3, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    private static final void c(b.c cVar, int i, int i2) throws KotlinNothingValueException {
        if (i2 != 0 || cVar.getShouldAutoInvalidate()) {
            if ((ni8.a(2) & i) != 0 && (cVar instanceof c)) {
                bo6.b((c) cVar);
                if (i2 == 2) {
                    y23.l(cVar, ni8.a(2)).G3();
                }
            }
            if ((ni8.a(128) & i) != 0 && i2 != 2) {
                y23.q(cVar).T0();
            }
            if ((ni8.a(4194304) & i) != 0 && i2 != 2) {
                LayoutNode.I1(y23.q(cVar), false, 1, null);
            }
            if ((ni8.a(256) & i) != 0 && (cVar instanceof dz4)) {
                if (i2 == 1) {
                    LayoutNode layoutNodeQ = y23.q(cVar);
                    layoutNodeQ.R1(layoutNodeQ.getGloballyPositionedObservers() + 1);
                } else if (i2 == 2) {
                    LayoutNode layoutNodeQ2 = y23.q(cVar);
                    layoutNodeQ2.R1(layoutNodeQ2.getGloballyPositionedObservers() - 1);
                }
                if (i2 != 2) {
                    y23.q(cVar).U0();
                }
            }
            if ((ni8.a(4) & i) != 0 && (cVar instanceof yg3)) {
                zg3.a((yg3) cVar);
            }
            if ((ni8.a(8) & i) != 0 && (cVar instanceof bfb)) {
                y23.q(cVar).e2(true);
            }
            if ((ni8.a(64) & i) != 0 && (cVar instanceof x19)) {
                y19.a((x19) cVar);
            }
            if ((ni8.a(2048) & i) != 0 && (cVar instanceof tk4)) {
                tk4 tk4Var = (tk4) cVar;
                if (j(tk4Var)) {
                    uk4.a(tk4Var);
                }
            }
            if ((ni8.a(4096) & i) != 0 && (cVar instanceof ik4)) {
                jk4.a((ik4) cVar);
            }
            if ((i & ni8.a(2097152)) != 0 && (cVar instanceof mv5) && i2 == 2) {
                ((mv5) cVar).z2();
            }
        }
    }

    public static final void d(b.c cVar) {
        if (!cVar.getIsAttached()) {
            zw5.c("autoInvalidateRemovedNode called on unattached node");
        }
        b(cVar, -1, 2);
    }

    public static final void e(b.c cVar) {
        if (!cVar.getIsAttached()) {
            zw5.c("autoInvalidateUpdatedNode called on unattached node");
        }
        b(cVar, -1, 0);
    }

    public static final int f(b.InterfaceC0050b interfaceC0050b) {
        int iA = ni8.a(1);
        if (interfaceC0050b instanceof g) {
            iA |= ni8.a(2);
        }
        if (interfaceC0050b instanceof xg3) {
            iA |= ni8.a(4);
        }
        if (interfaceC0050b instanceof yeb) {
            iA |= ni8.a(8);
        }
        if (interfaceC0050b instanceof af9) {
            iA |= ni8.a(16);
        }
        if ((interfaceC0050b instanceof ny7) || (interfaceC0050b instanceof sy7)) {
            iA |= ni8.a(32);
        }
        if (interfaceC0050b instanceof gk4) {
            iA |= ni8.a(4096);
        }
        if (interfaceC0050b instanceof qk4) {
            iA |= ni8.a(2048);
        }
        if (interfaceC0050b instanceof wq8) {
            iA |= ni8.a(256);
        }
        if (interfaceC0050b instanceof w19) {
            iA |= ni8.a(64);
        }
        if (interfaceC0050b instanceof ir8) {
            iA |= ni8.a(4194304);
        }
        if (interfaceC0050b instanceof pr8) {
            iA |= ni8.a(128);
        }
        return interfaceC0050b instanceof au0 ? ni8.a(524288) | iA : iA;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0104  */
    /* JADX WARN: Code duplicated, block: B:76:0x010f  */
    /* JADX WARN: Code duplicated, block: B:79:0x011a  */
    public static final int g(b.c cVar) {
        int iA;
        if (cVar.getKindSet() != 0) {
            return cVar.getKindSet();
        }
        d58<Object> d58Var = a;
        Object objB = ja.b(cVar);
        int iB = d58Var.b(objB);
        if (iB >= 0) {
            return d58Var.values[iB];
        }
        int iA2 = ni8.a(1);
        if (cVar instanceof c) {
            iA2 |= ni8.a(2);
        }
        if (cVar instanceof yg3) {
            iA2 |= ni8.a(4);
        }
        if (cVar instanceof bfb) {
            iA2 |= ni8.a(8);
        }
        if (cVar instanceof bf9) {
            iA2 |= ni8.a(16);
        }
        if (cVar instanceof qy7) {
            iA2 |= ni8.a(32);
        }
        if (cVar instanceof x19) {
            iA2 |= ni8.a(64);
        }
        if (cVar instanceof kr8) {
            iA = ni8.a(4194304);
        } else {
            if (!(cVar instanceof fn6)) {
                if (cVar instanceof kj7) {
                    iA = ni8.a(128);
                }
                if (cVar instanceof dz4) {
                    iA2 |= ni8.a(256);
                }
                if (cVar instanceof ApproachLayoutModifierNode) {
                    iA2 |= ni8.a(512);
                }
                if (cVar instanceof FocusTargetNode) {
                    iA2 |= ni8.a(1024);
                }
                if (cVar instanceof tk4) {
                    iA2 |= ni8.a(2048);
                }
                if (cVar instanceof ik4) {
                    iA2 |= ni8.a(4096);
                }
                if (cVar instanceof xi6) {
                    iA2 |= ni8.a(8192);
                }
                if (cVar instanceof aqa) {
                    iA2 |= ni8.a(16384);
                }
                if (cVar instanceof bs1) {
                    iA2 |= ni8.a(32768);
                }
                if (cVar instanceof gyb) {
                    iA2 |= ni8.a(131072);
                }
                if (cVar instanceof fhd) {
                    iA2 |= ni8.a(262144);
                }
                if (cVar instanceof au0) {
                    iA2 |= ni8.a(524288);
                }
                if (cVar instanceof ltd) {
                    iA2 |= ni8.a(1048576);
                }
                if (cVar instanceof mv5) {
                    iA2 |= ni8.a(2097152);
                }
                if (cVar instanceof im0) {
                    iA2 |= ni8.a(8388608);
                }
                d58Var.u(objB, iA2);
                return iA2;
            }
            iA2 |= ni8.a(128);
            iA = ni8.a(4194304);
        }
        iA2 |= iA;
        if (cVar instanceof dz4) {
            iA2 |= ni8.a(256);
        }
        if (cVar instanceof ApproachLayoutModifierNode) {
            iA2 |= ni8.a(512);
        }
        if (cVar instanceof FocusTargetNode) {
            iA2 |= ni8.a(1024);
        }
        if (cVar instanceof tk4) {
            iA2 |= ni8.a(2048);
        }
        if (cVar instanceof ik4) {
            iA2 |= ni8.a(4096);
        }
        if (cVar instanceof xi6) {
            iA2 |= ni8.a(8192);
        }
        if (cVar instanceof aqa) {
            iA2 |= ni8.a(16384);
        }
        if (cVar instanceof bs1) {
            iA2 |= ni8.a(32768);
        }
        if (cVar instanceof gyb) {
            iA2 |= ni8.a(131072);
        }
        if (cVar instanceof fhd) {
            iA2 |= ni8.a(262144);
        }
        if (cVar instanceof au0) {
            iA2 |= ni8.a(524288);
        }
        if (cVar instanceof ltd) {
            iA2 |= ni8.a(1048576);
        }
        if (cVar instanceof mv5) {
            iA2 |= ni8.a(2097152);
        }
        if (cVar instanceof im0) {
            iA2 |= ni8.a(8388608);
        }
        d58Var.u(objB, iA2);
        return iA2;
    }

    public static final int h(b.c cVar) {
        if (!(cVar instanceof k33)) {
            return g(cVar);
        }
        k33 k33Var = (k33) cVar;
        int iO3 = k33Var.getSelfKindSet();
        for (b.c cVarN3 = k33Var.getDelegate(); cVarN3 != null; cVarN3 = cVarN3.getChild()) {
            iO3 |= h(cVarN3);
        }
        return iO3;
    }

    public static final boolean i(int i) {
        return ((ni8.a(128) & i) != 0) | ((i & ni8.a(4194304)) != 0);
    }

    private static final boolean j(tk4 tk4Var) {
        z31 z31Var = z31.b;
        z31Var.r();
        tk4Var.m2(z31Var);
        return z31Var.q();
    }
}
