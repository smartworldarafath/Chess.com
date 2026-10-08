package com.google.inputmethod;

import androidx.compose.p001foundation.layout.j;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/tc;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Lcom/google/android/rt0;", "", "content", "d", "(Landroidx/compose/ui/b;Lcom/google/android/tc;ZLcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class qt0 {
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00da  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void d(b bVar, tc tcVar, boolean z, final ps4<? super rt0, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i, final int i2) {
        b bVar2;
        int i3;
        tc tcVar2;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        b bVar3;
        tc tcVarO;
        s6b s6bVarH;
        final ej7 ej7VarI;
        boolean zX;
        Object objR;
        int i6;
        d dVarF = dVar.F(380139498);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            bVar2 = bVar;
        } else if ((i & 6) == 0) {
            bVar2 = bVar;
            i3 = (dVarF.x(bVar2) ? 4 : 2) | i;
        } else {
            bVar2 = bVar;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                tcVar2 = tcVar;
                i3 |= dVarF.x(tcVar2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i3 & 1171) != 1170) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    if (i7 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i8 != 0) {
                        tcVarO = tc.INSTANCE.o();
                    } else {
                        tcVarO = tcVar2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if (e.k()) {
                        e.o(380139498, i3, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
                    }
                    ej7VarI = j.i(tcVarO, z2);
                    zX = dVarF.x(ej7VarI) | ((i3 & 7168) == 2048);
                    objR = dVarF.R();
                    if (zX || objR == d.INSTANCE.a()) {
                        objR = new Function2() { // from class: com.google.android.nt0
                            public final Object invoke(Object obj, Object obj2) {
                                return qt0.e(ej7VarI, ps4Var, (scc) obj, (kx1) obj2);
                            }
                        };
                        dVarF.L(objR);
                    }
                    SubcomposeLayoutKt.a(bVar3, (Function2) objR, dVarF, i3 & 14, 0);
                    if (e.k()) {
                        e.n();
                    }
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    tcVarO = tcVar2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    final b bVar4 = bVar3;
                    final tc tcVar3 = tcVarO;
                    final boolean z4 = z2;
                    s6bVarH.a(new Function2() { // from class: com.google.android.ot0
                        public final Object invoke(Object obj, Object obj2) {
                            return qt0.g(bVar4, tcVar3, z4, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if (dVarF.T(ps4Var)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                if (i7 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (i8 != 0) {
                    tcVarO = tc.INSTANCE.o();
                } else {
                    tcVarO = tcVar2;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if (e.k()) {
                    e.o(380139498, i3, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
                }
                ej7VarI = j.i(tcVarO, z2);
                zX = dVarF.x(ej7VarI) | ((i3 & 7168) == 2048);
                objR = dVarF.R();
                if (zX) {
                    objR = new Function2() { // from class: com.google.android.nt0
                        public final Object invoke(Object obj, Object obj2) {
                            return qt0.e(ej7VarI, ps4Var, (scc) obj, (kx1) obj2);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function2() { // from class: com.google.android.nt0
                        public final Object invoke(Object obj, Object obj2) {
                            return qt0.e(ej7VarI, ps4Var, (scc) obj, (kx1) obj2);
                        }
                    };
                    dVarF.L(objR);
                }
                SubcomposeLayoutKt.a(bVar3, (Function2) objR, dVarF, i3 & 14, 0);
                if (e.k()) {
                    e.n();
                }
            } else {
                dVarF.q();
                bVar3 = bVar2;
                tcVarO = tcVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final b bVar5 = bVar3;
                final tc tcVar4 = tcVarO;
                final boolean z5 = z2;
                s6bVarH.a(new Function2() { // from class: com.google.android.ot0
                    public final Object invoke(Object obj, Object obj2) {
                        return qt0.g(bVar5, tcVar4, z5, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        tcVar2 = tcVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (dVarF.A(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (dVarF.T(ps4Var)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                if (i7 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (i8 != 0) {
                    tcVarO = tc.INSTANCE.o();
                } else {
                    tcVarO = tcVar2;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if (e.k()) {
                    e.o(380139498, i3, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
                }
                ej7VarI = j.i(tcVarO, z2);
                zX = dVarF.x(ej7VarI) | ((i3 & 7168) == 2048);
                objR = dVarF.R();
                if (zX) {
                    objR = new Function2() { // from class: com.google.android.nt0
                        public final Object invoke(Object obj, Object obj2) {
                            return qt0.e(ej7VarI, ps4Var, (scc) obj, (kx1) obj2);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function2() { // from class: com.google.android.nt0
                        public final Object invoke(Object obj, Object obj2) {
                            return qt0.e(ej7VarI, ps4Var, (scc) obj, (kx1) obj2);
                        }
                    };
                    dVarF.L(objR);
                }
                SubcomposeLayoutKt.a(bVar3, (Function2) objR, dVarF, i3 & 14, 0);
                if (e.k()) {
                    e.n();
                }
            } else {
                dVarF.q();
                bVar3 = bVar2;
                tcVarO = tcVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final b bVar6 = bVar3;
                final tc tcVar5 = tcVarO;
                final boolean z6 = z2;
                s6bVarH.a(new Function2() { // from class: com.google.android.ot0
                    public final Object invoke(Object obj, Object obj2) {
                        return qt0.g(bVar6, tcVar5, z6, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if (dVarF.T(ps4Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dVarF.g(z3, i3 & 1)) {
            if (i7 != 0) {
                bVar3 = b.INSTANCE;
            } else {
                bVar3 = bVar2;
            }
            if (i8 != 0) {
                tcVarO = tc.INSTANCE.o();
            } else {
                tcVarO = tcVar2;
            }
            if (i4 != 0) {
                z2 = false;
            }
            if (e.k()) {
                e.o(380139498, i3, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
            }
            ej7VarI = j.i(tcVarO, z2);
            zX = dVarF.x(ej7VarI) | ((i3 & 7168) == 2048);
            objR = dVarF.R();
            if (zX) {
                objR = new Function2() { // from class: com.google.android.nt0
                    public final Object invoke(Object obj, Object obj2) {
                        return qt0.e(ej7VarI, ps4Var, (scc) obj, (kx1) obj2);
                    }
                };
                dVarF.L(objR);
            } else {
                objR = new Function2() { // from class: com.google.android.nt0
                    public final Object invoke(Object obj, Object obj2) {
                        return qt0.e(ej7VarI, ps4Var, (scc) obj, (kx1) obj2);
                    }
                };
                dVarF.L(objR);
            }
            SubcomposeLayoutKt.a(bVar3, (Function2) objR, dVarF, i3 & 14, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
            bVar3 = bVar2;
            tcVarO = tcVar2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            final b bVar7 = bVar3;
            final tc tcVar6 = tcVarO;
            final boolean z7 = z2;
            s6bVarH.a(new Function2() { // from class: com.google.android.ot0
                public final Object invoke(Object obj, Object obj2) {
                    return qt0.g(bVar7, tcVar6, z7, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fj7 e(ej7 ej7Var, final ps4 ps4Var, scc sccVar, kx1 kx1Var) {
        final BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = new BoxWithConstraintsScopeImpl(sccVar, kx1Var.getValue(), null);
        return ej7Var.mo0measure3p2s80s(sccVar, sccVar.q1(Unit.a, ko1.c(-431986394, true, new Function2() { // from class: com.google.android.pt0
            public final Object invoke(Object obj, Object obj2) {
                return qt0.f(ps4Var, boxWithConstraintsScopeImpl, (d) obj, ((Integer) obj2).intValue());
            }
        })), kx1Var.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(ps4 ps4Var, BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, d dVar, int i) {
        if (dVar.g((i & 3) != 2, i & 1)) {
            if (e.k()) {
                e.o(-431986394, i, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:66)");
            }
            ps4Var.invoke(boxWithConstraintsScopeImpl, dVar, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(b bVar, tc tcVar, boolean z, ps4 ps4Var, int i, int i2, d dVar, int i3) {
        d(bVar, tcVar, z, ps4Var, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }
}
