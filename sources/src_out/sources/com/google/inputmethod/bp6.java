package com.google.inputmethod;

import androidx.compose.p001foundation.layout.c;
import androidx.compose.p001foundation.lazy.LazyListState;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u007f\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u007f\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Lcom/google/android/rx8;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/c$e;", "horizontalArrangement", "Lcom/google/android/tc$c;", "verticalAlignment", "Lcom/google/android/qg4;", "flingBehavior", "userScrollEnabled", "Lcom/google/android/zv8;", "overscrollEffect", "Lkotlin/Function1;", "Lcom/google/android/cw6;", "", "content", "e", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/lazy/LazyListState;Lcom/google/android/rx8;ZLandroidx/compose/foundation/layout/c$e;Lcom/google/android/tc$c;Lcom/google/android/qg4;ZLcom/google/android/zv8;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)V", "Landroidx/compose/foundation/layout/c$n;", "verticalArrangement", "Lcom/google/android/tc$b;", "horizontalAlignment", "c", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/lazy/LazyListState;Lcom/google/android/rx8;ZLandroidx/compose/foundation/layout/c$n;Lcom/google/android/tc$b;Lcom/google/android/qg4;ZLcom/google/android/zv8;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class bp6 {
    /* JADX WARN: Code duplicated, block: B:100:0x010d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0117  */
    /* JADX WARN: Code duplicated, block: B:105:0x011d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0120  */
    /* JADX WARN: Code duplicated, block: B:110:0x0133  */
    /* JADX WARN: Code duplicated, block: B:111:0x0136  */
    /* JADX WARN: Code duplicated, block: B:114:0x013f  */
    /* JADX WARN: Code duplicated, block: B:116:0x014f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0187  */
    /* JADX WARN: Code duplicated, block: B:134:0x018a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0190  */
    /* JADX WARN: Code duplicated, block: B:139:0x0199  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:147:0x01af  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:152:0x01be  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:160:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:163:0x01de  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:168:0x0203  */
    /* JADX WARN: Code duplicated, block: B:171:0x024c  */
    /* JADX WARN: Code duplicated, block: B:173:0x025f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0276  */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:97:0x0106 A[ADDED_TO_REGION] */
    public static final void c(b bVar, LazyListState lazyListState, rx8 rx8Var, boolean z, c.n nVar, tc.b bVar2, qg4 qg4Var, boolean z2, zv8 zv8Var, final Function1<? super cw6, Unit> function1, d dVar, final int i, final int i2) {
        int i3;
        LazyListState lazyListStateC;
        rx8 rx8Var2;
        int i4;
        boolean z3;
        int i5;
        c.n nVar2;
        int i6;
        tc.b bVar3;
        int i7;
        qg4 qg4Var2;
        int i8;
        int i9;
        boolean z4;
        d dVar2;
        final b bVar4;
        final boolean z5;
        final LazyListState lazyListState2;
        final rx8 rx8Var3;
        final boolean z6;
        final c.n nVar3;
        final tc.b bVar5;
        final qg4 qg4Var3;
        final zv8 zv8Var2;
        s6b s6bVarH;
        b bVar6;
        rx8 rx8VarE;
        c.n nVarD;
        tc.b bVarK;
        qg4 qg4VarA;
        zv8 zv8VarD;
        LazyListState lazyListState3;
        rx8 rx8Var4;
        c.n nVar4;
        tc.b bVar7;
        boolean z7;
        boolean z8;
        int i10;
        qg4 qg4Var4;
        c cVar;
        int i11;
        d dVarF = dVar.F(53695811);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListStateC = lazyListState;
                int i13 = dVarF.x(lazyListStateC) ? 32 : 16;
                i3 |= i13;
            } else {
                lazyListStateC = lazyListState;
            }
            i3 |= i13;
        } else {
            lazyListStateC = lazyListState;
        }
        int i14 = i2 & 4;
        if (i14 == 0) {
            if ((i & 384) == 0) {
                rx8Var2 = rx8Var;
                i3 |= dVarF.x(rx8Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z;
                    if (dVarF.A(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        nVar2 = nVar;
                        int i15 = dVarF.x(nVar2) ? 16384 : 8192;
                        i3 |= i15;
                    } else {
                        nVar2 = nVar;
                    }
                    i3 |= i15;
                } else {
                    nVar2 = nVar;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        bVar3 = bVar2;
                        if (dVarF.x(bVar3)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            qg4Var2 = qg4Var;
                            int i16 = dVarF.x(qg4Var2) ? 1048576 : 524288;
                            i3 |= i16;
                        } else {
                            qg4Var2 = qg4Var;
                        }
                        i3 |= i16;
                    } else {
                        qg4Var2 = qg4Var;
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                        if ((i & 12582912) == 0) {
                            if (dVarF.A(z2)) {
                                i9 = 8388608;
                            } else {
                                i9 = 4194304;
                            }
                            i3 |= i9;
                        }
                        if ((i & 100663296) != 0) {
                            i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                        }
                        if ((i & 805306368) == 0) {
                            if (dVarF.T(function1)) {
                                i11 = 536870912;
                            } else {
                                i11 = 268435456;
                            }
                            i3 |= i11;
                        }
                        if ((i3 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (dVarF.g(z4, i3 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0 || dVarF.t()) {
                                if (i12 != 0) {
                                    bVar6 = b.INSTANCE;
                                } else {
                                    bVar6 = bVar;
                                }
                                if ((i2 & 2) != 0) {
                                    lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                    i3 &= -113;
                                }
                                if (i14 != 0) {
                                    rx8VarE = nx8.e(ff3.i(0));
                                } else {
                                    rx8VarE = rx8Var2;
                                }
                                if (i4 != 0) {
                                    z3 = false;
                                }
                                if ((i2 & 16) != 0) {
                                    cVar = c.a;
                                    if (z3) {
                                        nVarD = cVar.d();
                                    } else {
                                        nVarD = cVar.k();
                                    }
                                    i3 &= -57345;
                                } else {
                                    nVarD = nVar2;
                                }
                                if (i6 != 0) {
                                    bVarK = tc.INSTANCE.k();
                                } else {
                                    bVarK = bVar3;
                                }
                                if ((i2 & 64) != 0) {
                                    qg4VarA = cab.a.a(dVarF, 6);
                                    i3 &= -3670017;
                                } else {
                                    qg4VarA = qg4Var2;
                                }
                                boolean z9 = i8 == 0 ? z2 : true;
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                    zv8VarD = cw8.d(dVarF, 0);
                                } else {
                                    zv8VarD = zv8Var;
                                }
                                lazyListState3 = lazyListStateC;
                                rx8Var4 = rx8VarE;
                                nVar4 = nVarD;
                                bVar7 = bVarK;
                                z7 = z3;
                                z8 = z9;
                                i10 = 53695811;
                                qg4Var4 = qg4VarA;
                            } else {
                                dVarF.q();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                bVar6 = bVar;
                                z8 = z2;
                                zv8VarD = zv8Var;
                                z7 = z3;
                                nVar4 = nVar2;
                                bVar7 = bVar3;
                                qg4Var4 = qg4Var2;
                                i10 = 53695811;
                                lazyListState3 = lazyListStateC;
                                rx8Var4 = rx8Var2;
                            }
                            dVarF.M();
                            if (e.k()) {
                                e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                            }
                            int i17 = i3 >> 3;
                            dVar2 = dVarF;
                            mv6.b(bVar6, lazyListState3, rx8Var4, z7, true, qg4Var4, z8, zv8VarD, 0, bVar7, nVar4, null, null, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i17) | (3670016 & i17) | (i17 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                            if (e.k()) {
                                e.n();
                            }
                            bVar4 = bVar6;
                            lazyListState2 = lazyListState3;
                            rx8Var3 = rx8Var4;
                            z6 = z7;
                            qg4Var3 = qg4Var4;
                            z5 = z8;
                            zv8Var2 = zv8VarD;
                            bVar5 = bVar7;
                            nVar3 = nVar4;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            bVar4 = bVar;
                            z5 = z2;
                            lazyListState2 = lazyListStateC;
                            rx8Var3 = rx8Var2;
                            z6 = z3;
                            nVar3 = nVar2;
                            bVar5 = bVar3;
                            qg4Var3 = qg4Var2;
                            zv8Var2 = zv8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.zo6
                                public final Object invoke(Object obj, Object obj2) {
                                    return bp6.d(bVar4, lazyListState2, rx8Var3, z6, nVar3, bVar5, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 12582912;
                    if ((i & 100663296) != 0) {
                        i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                    }
                    if ((i & 805306368) == 0) {
                        if (dVarF.T(function1)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (dVarF.g(z4, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                bVar6 = b.INSTANCE;
                            } else {
                                bVar6 = bVar;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                i3 &= -113;
                            }
                            if (i14 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                cVar = c.a;
                                if (z3) {
                                    nVarD = cVar.k();
                                } else {
                                    nVarD = cVar.d();
                                }
                                i3 &= -57345;
                            } else {
                                nVarD = nVar2;
                            }
                            if (i6 != 0) {
                                bVarK = tc.INSTANCE.k();
                            } else {
                                bVarK = bVar3;
                            }
                            if ((i2 & 64) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                qg4VarA = qg4Var2;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyListState3 = lazyListStateC;
                            rx8Var4 = rx8VarE;
                            nVar4 = nVarD;
                            bVar7 = bVarK;
                            z7 = z3;
                            z8 = z9;
                            i10 = 53695811;
                            qg4Var4 = qg4VarA;
                        } else {
                            if (i12 != 0) {
                                bVar6 = b.INSTANCE;
                            } else {
                                bVar6 = bVar;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                i3 &= -113;
                            }
                            if (i14 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                cVar = c.a;
                                if (z3) {
                                    nVarD = cVar.k();
                                } else {
                                    nVarD = cVar.d();
                                }
                                i3 &= -57345;
                            } else {
                                nVarD = nVar2;
                            }
                            if (i6 != 0) {
                                bVarK = tc.INSTANCE.k();
                            } else {
                                bVarK = bVar3;
                            }
                            if ((i2 & 64) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                qg4VarA = qg4Var2;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyListState3 = lazyListStateC;
                            rx8Var4 = rx8VarE;
                            nVar4 = nVarD;
                            bVar7 = bVarK;
                            z7 = z3;
                            z8 = z9;
                            i10 = 53695811;
                            qg4Var4 = qg4VarA;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                        }
                        int i18 = i3 >> 3;
                        dVar2 = dVarF;
                        mv6.b(bVar6, lazyListState3, rx8Var4, z7, true, qg4Var4, z8, zv8VarD, 0, bVar7, nVar4, null, null, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i18) | (3670016 & i18) | (i18 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                        if (e.k()) {
                            e.n();
                        }
                        bVar4 = bVar6;
                        lazyListState2 = lazyListState3;
                        rx8Var3 = rx8Var4;
                        z6 = z7;
                        qg4Var3 = qg4Var4;
                        z5 = z8;
                        zv8Var2 = zv8VarD;
                        bVar5 = bVar7;
                        nVar3 = nVar4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar4 = bVar;
                        z5 = z2;
                        lazyListState2 = lazyListStateC;
                        rx8Var3 = rx8Var2;
                        z6 = z3;
                        nVar3 = nVar2;
                        bVar5 = bVar3;
                        qg4Var3 = qg4Var2;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zo6
                            public final Object invoke(Object obj, Object obj2) {
                                return bp6.d(bVar4, lazyListState2, rx8Var3, z6, nVar3, bVar5, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 196608;
                bVar3 = bVar2;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        qg4Var2 = qg4Var;
                        if (dVarF.x(qg4Var2)) {
                        }
                        i3 |= i16;
                    } else {
                        qg4Var2 = qg4Var;
                    }
                    i3 |= i16;
                } else {
                    qg4Var2 = qg4Var;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    if ((i & 12582912) == 0) {
                        if (dVarF.A(z2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i & 100663296) != 0) {
                        i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                    }
                    if ((i & 805306368) == 0) {
                        if (dVarF.T(function1)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (dVarF.g(z4, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                bVar6 = b.INSTANCE;
                            } else {
                                bVar6 = bVar;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                i3 &= -113;
                            }
                            if (i14 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                cVar = c.a;
                                if (z3) {
                                    nVarD = cVar.k();
                                } else {
                                    nVarD = cVar.d();
                                }
                                i3 &= -57345;
                            } else {
                                nVarD = nVar2;
                            }
                            if (i6 != 0) {
                                bVarK = tc.INSTANCE.k();
                            } else {
                                bVarK = bVar3;
                            }
                            if ((i2 & 64) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                qg4VarA = qg4Var2;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyListState3 = lazyListStateC;
                            rx8Var4 = rx8VarE;
                            nVar4 = nVarD;
                            bVar7 = bVarK;
                            z7 = z3;
                            z8 = z9;
                            i10 = 53695811;
                            qg4Var4 = qg4VarA;
                        } else {
                            if (i12 != 0) {
                                bVar6 = b.INSTANCE;
                            } else {
                                bVar6 = bVar;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                i3 &= -113;
                            }
                            if (i14 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                cVar = c.a;
                                if (z3) {
                                    nVarD = cVar.k();
                                } else {
                                    nVarD = cVar.d();
                                }
                                i3 &= -57345;
                            } else {
                                nVarD = nVar2;
                            }
                            if (i6 != 0) {
                                bVarK = tc.INSTANCE.k();
                            } else {
                                bVarK = bVar3;
                            }
                            if ((i2 & 64) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                qg4VarA = qg4Var2;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyListState3 = lazyListStateC;
                            rx8Var4 = rx8VarE;
                            nVar4 = nVarD;
                            bVar7 = bVarK;
                            z7 = z3;
                            z8 = z9;
                            i10 = 53695811;
                            qg4Var4 = qg4VarA;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                        }
                        int i19 = i3 >> 3;
                        dVar2 = dVarF;
                        mv6.b(bVar6, lazyListState3, rx8Var4, z7, true, qg4Var4, z8, zv8VarD, 0, bVar7, nVar4, null, null, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i19) | (3670016 & i19) | (i19 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                        if (e.k()) {
                            e.n();
                        }
                        bVar4 = bVar6;
                        lazyListState2 = lazyListState3;
                        rx8Var3 = rx8Var4;
                        z6 = z7;
                        qg4Var3 = qg4Var4;
                        z5 = z8;
                        zv8Var2 = zv8VarD;
                        bVar5 = bVar7;
                        nVar3 = nVar4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar4 = bVar;
                        z5 = z2;
                        lazyListState2 = lazyListStateC;
                        rx8Var3 = rx8Var2;
                        z6 = z3;
                        nVar3 = nVar2;
                        bVar5 = bVar3;
                        qg4Var3 = qg4Var2;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zo6
                            public final Object invoke(Object obj, Object obj2) {
                                return bp6.d(bVar4, lazyListState2, rx8Var3, z6, nVar3, bVar5, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 12582912;
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function1)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar6 = b.INSTANCE;
                        } else {
                            bVar6 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i3 &= -57345;
                        } else {
                            nVarD = nVar2;
                        }
                        if (i6 != 0) {
                            bVarK = tc.INSTANCE.k();
                        } else {
                            bVarK = bVar3;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        nVar4 = nVarD;
                        bVar7 = bVarK;
                        z7 = z3;
                        z8 = z9;
                        i10 = 53695811;
                        qg4Var4 = qg4VarA;
                    } else {
                        if (i12 != 0) {
                            bVar6 = b.INSTANCE;
                        } else {
                            bVar6 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i3 &= -57345;
                        } else {
                            nVarD = nVar2;
                        }
                        if (i6 != 0) {
                            bVarK = tc.INSTANCE.k();
                        } else {
                            bVarK = bVar3;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        nVar4 = nVarD;
                        bVar7 = bVarK;
                        z7 = z3;
                        z8 = z9;
                        i10 = 53695811;
                        qg4Var4 = qg4VarA;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                    }
                    int i110 = i3 >> 3;
                    dVar2 = dVarF;
                    mv6.b(bVar6, lazyListState3, rx8Var4, z7, true, qg4Var4, z8, zv8VarD, 0, bVar7, nVar4, null, null, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i110) | (3670016 & i110) | (i110 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                    if (e.k()) {
                        e.n();
                    }
                    bVar4 = bVar6;
                    lazyListState2 = lazyListState3;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var3 = qg4Var4;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    bVar5 = bVar7;
                    nVar3 = nVar4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar4 = bVar;
                    z5 = z2;
                    lazyListState2 = lazyListStateC;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    nVar3 = nVar2;
                    bVar5 = bVar3;
                    qg4Var3 = qg4Var2;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zo6
                        public final Object invoke(Object obj, Object obj2) {
                            return bp6.d(bVar4, lazyListState2, rx8Var3, z6, nVar3, bVar5, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            z3 = z;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    nVar2 = nVar;
                    if (dVarF.x(nVar2)) {
                    }
                    i3 |= i15;
                } else {
                    nVar2 = nVar;
                }
                i3 |= i15;
            } else {
                nVar2 = nVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    bVar3 = bVar2;
                    if (dVarF.x(bVar3)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        qg4Var2 = qg4Var;
                        if (dVarF.x(qg4Var2)) {
                        }
                        i3 |= i16;
                    } else {
                        qg4Var2 = qg4Var;
                    }
                    i3 |= i16;
                } else {
                    qg4Var2 = qg4Var;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    if ((i & 12582912) == 0) {
                        if (dVarF.A(z2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i & 100663296) != 0) {
                        i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                    }
                    if ((i & 805306368) == 0) {
                        if (dVarF.T(function1)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (dVarF.g(z4, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                bVar6 = b.INSTANCE;
                            } else {
                                bVar6 = bVar;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                i3 &= -113;
                            }
                            if (i14 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                cVar = c.a;
                                if (z3) {
                                    nVarD = cVar.k();
                                } else {
                                    nVarD = cVar.d();
                                }
                                i3 &= -57345;
                            } else {
                                nVarD = nVar2;
                            }
                            if (i6 != 0) {
                                bVarK = tc.INSTANCE.k();
                            } else {
                                bVarK = bVar3;
                            }
                            if ((i2 & 64) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                qg4VarA = qg4Var2;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyListState3 = lazyListStateC;
                            rx8Var4 = rx8VarE;
                            nVar4 = nVarD;
                            bVar7 = bVarK;
                            z7 = z3;
                            z8 = z9;
                            i10 = 53695811;
                            qg4Var4 = qg4VarA;
                        } else {
                            if (i12 != 0) {
                                bVar6 = b.INSTANCE;
                            } else {
                                bVar6 = bVar;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                i3 &= -113;
                            }
                            if (i14 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                cVar = c.a;
                                if (z3) {
                                    nVarD = cVar.k();
                                } else {
                                    nVarD = cVar.d();
                                }
                                i3 &= -57345;
                            } else {
                                nVarD = nVar2;
                            }
                            if (i6 != 0) {
                                bVarK = tc.INSTANCE.k();
                            } else {
                                bVarK = bVar3;
                            }
                            if ((i2 & 64) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                qg4VarA = qg4Var2;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyListState3 = lazyListStateC;
                            rx8Var4 = rx8VarE;
                            nVar4 = nVarD;
                            bVar7 = bVarK;
                            z7 = z3;
                            z8 = z9;
                            i10 = 53695811;
                            qg4Var4 = qg4VarA;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                        }
                        int i111 = i3 >> 3;
                        dVar2 = dVarF;
                        mv6.b(bVar6, lazyListState3, rx8Var4, z7, true, qg4Var4, z8, zv8VarD, 0, bVar7, nVar4, null, null, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i111) | (3670016 & i111) | (i111 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                        if (e.k()) {
                            e.n();
                        }
                        bVar4 = bVar6;
                        lazyListState2 = lazyListState3;
                        rx8Var3 = rx8Var4;
                        z6 = z7;
                        qg4Var3 = qg4Var4;
                        z5 = z8;
                        zv8Var2 = zv8VarD;
                        bVar5 = bVar7;
                        nVar3 = nVar4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar4 = bVar;
                        z5 = z2;
                        lazyListState2 = lazyListStateC;
                        rx8Var3 = rx8Var2;
                        z6 = z3;
                        nVar3 = nVar2;
                        bVar5 = bVar3;
                        qg4Var3 = qg4Var2;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zo6
                            public final Object invoke(Object obj, Object obj2) {
                                return bp6.d(bVar4, lazyListState2, rx8Var3, z6, nVar3, bVar5, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 12582912;
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function1)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar6 = b.INSTANCE;
                        } else {
                            bVar6 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i3 &= -57345;
                        } else {
                            nVarD = nVar2;
                        }
                        if (i6 != 0) {
                            bVarK = tc.INSTANCE.k();
                        } else {
                            bVarK = bVar3;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        nVar4 = nVarD;
                        bVar7 = bVarK;
                        z7 = z3;
                        z8 = z9;
                        i10 = 53695811;
                        qg4Var4 = qg4VarA;
                    } else {
                        if (i12 != 0) {
                            bVar6 = b.INSTANCE;
                        } else {
                            bVar6 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i3 &= -57345;
                        } else {
                            nVarD = nVar2;
                        }
                        if (i6 != 0) {
                            bVarK = tc.INSTANCE.k();
                        } else {
                            bVarK = bVar3;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        nVar4 = nVarD;
                        bVar7 = bVarK;
                        z7 = z3;
                        z8 = z9;
                        i10 = 53695811;
                        qg4Var4 = qg4VarA;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                    }
                    int i112 = i3 >> 3;
                    dVar2 = dVarF;
                    mv6.b(bVar6, lazyListState3, rx8Var4, z7, true, qg4Var4, z8, zv8VarD, 0, bVar7, nVar4, null, null, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i112) | (3670016 & i112) | (i112 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                    if (e.k()) {
                        e.n();
                    }
                    bVar4 = bVar6;
                    lazyListState2 = lazyListState3;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var3 = qg4Var4;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    bVar5 = bVar7;
                    nVar3 = nVar4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar4 = bVar;
                    z5 = z2;
                    lazyListState2 = lazyListStateC;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    nVar3 = nVar2;
                    bVar5 = bVar3;
                    qg4Var3 = qg4Var2;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zo6
                        public final Object invoke(Object obj, Object obj2) {
                            return bp6.d(bVar4, lazyListState2, rx8Var3, z6, nVar3, bVar5, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            bVar3 = bVar2;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    qg4Var2 = qg4Var;
                    if (dVarF.x(qg4Var2)) {
                    }
                    i3 |= i16;
                } else {
                    qg4Var2 = qg4Var;
                }
                i3 |= i16;
            } else {
                qg4Var2 = qg4Var;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((i & 12582912) == 0) {
                    if (dVarF.A(z2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function1)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar6 = b.INSTANCE;
                        } else {
                            bVar6 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i3 &= -57345;
                        } else {
                            nVarD = nVar2;
                        }
                        if (i6 != 0) {
                            bVarK = tc.INSTANCE.k();
                        } else {
                            bVarK = bVar3;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        nVar4 = nVarD;
                        bVar7 = bVarK;
                        z7 = z3;
                        z8 = z9;
                        i10 = 53695811;
                        qg4Var4 = qg4VarA;
                    } else {
                        if (i12 != 0) {
                            bVar6 = b.INSTANCE;
                        } else {
                            bVar6 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i3 &= -57345;
                        } else {
                            nVarD = nVar2;
                        }
                        if (i6 != 0) {
                            bVarK = tc.INSTANCE.k();
                        } else {
                            bVarK = bVar3;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        nVar4 = nVarD;
                        bVar7 = bVarK;
                        z7 = z3;
                        z8 = z9;
                        i10 = 53695811;
                        qg4Var4 = qg4VarA;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                    }
                    int i113 = i3 >> 3;
                    dVar2 = dVarF;
                    mv6.b(bVar6, lazyListState3, rx8Var4, z7, true, qg4Var4, z8, zv8VarD, 0, bVar7, nVar4, null, null, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i113) | (3670016 & i113) | (i113 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                    if (e.k()) {
                        e.n();
                    }
                    bVar4 = bVar6;
                    lazyListState2 = lazyListState3;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var3 = qg4Var4;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    bVar5 = bVar7;
                    nVar3 = nVar4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar4 = bVar;
                    z5 = z2;
                    lazyListState2 = lazyListStateC;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    nVar3 = nVar2;
                    bVar5 = bVar3;
                    qg4Var3 = qg4Var2;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zo6
                        public final Object invoke(Object obj, Object obj2) {
                            return bp6.d(bVar4, lazyListState2, rx8Var3, z6, nVar3, bVar5, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 12582912;
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                if (dVarF.T(function1)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i3 |= i11;
            }
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        bVar6 = b.INSTANCE;
                    } else {
                        bVar6 = bVar;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                        i3 &= -113;
                    }
                    if (i14 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        cVar = c.a;
                        if (z3) {
                            nVarD = cVar.k();
                        } else {
                            nVarD = cVar.d();
                        }
                        i3 &= -57345;
                    } else {
                        nVarD = nVar2;
                    }
                    if (i6 != 0) {
                        bVarK = tc.INSTANCE.k();
                    } else {
                        bVarK = bVar3;
                    }
                    if ((i2 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        qg4VarA = qg4Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyListState3 = lazyListStateC;
                    rx8Var4 = rx8VarE;
                    nVar4 = nVarD;
                    bVar7 = bVarK;
                    z7 = z3;
                    z8 = z9;
                    i10 = 53695811;
                    qg4Var4 = qg4VarA;
                } else {
                    if (i12 != 0) {
                        bVar6 = b.INSTANCE;
                    } else {
                        bVar6 = bVar;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                        i3 &= -113;
                    }
                    if (i14 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        cVar = c.a;
                        if (z3) {
                            nVarD = cVar.k();
                        } else {
                            nVarD = cVar.d();
                        }
                        i3 &= -57345;
                    } else {
                        nVarD = nVar2;
                    }
                    if (i6 != 0) {
                        bVarK = tc.INSTANCE.k();
                    } else {
                        bVarK = bVar3;
                    }
                    if ((i2 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        qg4VarA = qg4Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyListState3 = lazyListStateC;
                    rx8Var4 = rx8VarE;
                    nVar4 = nVarD;
                    bVar7 = bVarK;
                    z7 = z3;
                    z8 = z9;
                    i10 = 53695811;
                    qg4Var4 = qg4VarA;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                }
                int i114 = i3 >> 3;
                dVar2 = dVarF;
                mv6.b(bVar6, lazyListState3, rx8Var4, z7, true, qg4Var4, z8, zv8VarD, 0, bVar7, nVar4, null, null, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i114) | (3670016 & i114) | (i114 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                if (e.k()) {
                    e.n();
                }
                bVar4 = bVar6;
                lazyListState2 = lazyListState3;
                rx8Var3 = rx8Var4;
                z6 = z7;
                qg4Var3 = qg4Var4;
                z5 = z8;
                zv8Var2 = zv8VarD;
                bVar5 = bVar7;
                nVar3 = nVar4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar4 = bVar;
                z5 = z2;
                lazyListState2 = lazyListStateC;
                rx8Var3 = rx8Var2;
                z6 = z3;
                nVar3 = nVar2;
                bVar5 = bVar3;
                qg4Var3 = qg4Var2;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.zo6
                    public final Object invoke(Object obj, Object obj2) {
                        return bp6.d(bVar4, lazyListState2, rx8Var3, z6, nVar3, bVar5, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        rx8Var2 = rx8Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z3 = z;
                if (dVarF.A(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    nVar2 = nVar;
                    if (dVarF.x(nVar2)) {
                    }
                    i3 |= i15;
                } else {
                    nVar2 = nVar;
                }
                i3 |= i15;
            } else {
                nVar2 = nVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    bVar3 = bVar2;
                    if (dVarF.x(bVar3)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        qg4Var2 = qg4Var;
                        if (dVarF.x(qg4Var2)) {
                        }
                        i3 |= i16;
                    } else {
                        qg4Var2 = qg4Var;
                    }
                    i3 |= i16;
                } else {
                    qg4Var2 = qg4Var;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    if ((i & 12582912) == 0) {
                        if (dVarF.A(z2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i & 100663296) != 0) {
                        i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                    }
                    if ((i & 805306368) == 0) {
                        if (dVarF.T(function1)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (dVarF.g(z4, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                bVar6 = b.INSTANCE;
                            } else {
                                bVar6 = bVar;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                i3 &= -113;
                            }
                            if (i14 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                cVar = c.a;
                                if (z3) {
                                    nVarD = cVar.k();
                                } else {
                                    nVarD = cVar.d();
                                }
                                i3 &= -57345;
                            } else {
                                nVarD = nVar2;
                            }
                            if (i6 != 0) {
                                bVarK = tc.INSTANCE.k();
                            } else {
                                bVarK = bVar3;
                            }
                            if ((i2 & 64) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                qg4VarA = qg4Var2;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyListState3 = lazyListStateC;
                            rx8Var4 = rx8VarE;
                            nVar4 = nVarD;
                            bVar7 = bVarK;
                            z7 = z3;
                            z8 = z9;
                            i10 = 53695811;
                            qg4Var4 = qg4VarA;
                        } else {
                            if (i12 != 0) {
                                bVar6 = b.INSTANCE;
                            } else {
                                bVar6 = bVar;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                i3 &= -113;
                            }
                            if (i14 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                cVar = c.a;
                                if (z3) {
                                    nVarD = cVar.k();
                                } else {
                                    nVarD = cVar.d();
                                }
                                i3 &= -57345;
                            } else {
                                nVarD = nVar2;
                            }
                            if (i6 != 0) {
                                bVarK = tc.INSTANCE.k();
                            } else {
                                bVarK = bVar3;
                            }
                            if ((i2 & 64) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                qg4VarA = qg4Var2;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyListState3 = lazyListStateC;
                            rx8Var4 = rx8VarE;
                            nVar4 = nVarD;
                            bVar7 = bVarK;
                            z7 = z3;
                            z8 = z9;
                            i10 = 53695811;
                            qg4Var4 = qg4VarA;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                        }
                        int i115 = i3 >> 3;
                        dVar2 = dVarF;
                        mv6.b(bVar6, lazyListState3, rx8Var4, z7, true, qg4Var4, z8, zv8VarD, 0, bVar7, nVar4, null, null, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i115) | (3670016 & i115) | (i115 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                        if (e.k()) {
                            e.n();
                        }
                        bVar4 = bVar6;
                        lazyListState2 = lazyListState3;
                        rx8Var3 = rx8Var4;
                        z6 = z7;
                        qg4Var3 = qg4Var4;
                        z5 = z8;
                        zv8Var2 = zv8VarD;
                        bVar5 = bVar7;
                        nVar3 = nVar4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar4 = bVar;
                        z5 = z2;
                        lazyListState2 = lazyListStateC;
                        rx8Var3 = rx8Var2;
                        z6 = z3;
                        nVar3 = nVar2;
                        bVar5 = bVar3;
                        qg4Var3 = qg4Var2;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zo6
                            public final Object invoke(Object obj, Object obj2) {
                                return bp6.d(bVar4, lazyListState2, rx8Var3, z6, nVar3, bVar5, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 12582912;
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function1)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar6 = b.INSTANCE;
                        } else {
                            bVar6 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i3 &= -57345;
                        } else {
                            nVarD = nVar2;
                        }
                        if (i6 != 0) {
                            bVarK = tc.INSTANCE.k();
                        } else {
                            bVarK = bVar3;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        nVar4 = nVarD;
                        bVar7 = bVarK;
                        z7 = z3;
                        z8 = z9;
                        i10 = 53695811;
                        qg4Var4 = qg4VarA;
                    } else {
                        if (i12 != 0) {
                            bVar6 = b.INSTANCE;
                        } else {
                            bVar6 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i3 &= -57345;
                        } else {
                            nVarD = nVar2;
                        }
                        if (i6 != 0) {
                            bVarK = tc.INSTANCE.k();
                        } else {
                            bVarK = bVar3;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        nVar4 = nVarD;
                        bVar7 = bVarK;
                        z7 = z3;
                        z8 = z9;
                        i10 = 53695811;
                        qg4Var4 = qg4VarA;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                    }
                    int i116 = i3 >> 3;
                    dVar2 = dVarF;
                    mv6.b(bVar6, lazyListState3, rx8Var4, z7, true, qg4Var4, z8, zv8VarD, 0, bVar7, nVar4, null, null, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i116) | (3670016 & i116) | (i116 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                    if (e.k()) {
                        e.n();
                    }
                    bVar4 = bVar6;
                    lazyListState2 = lazyListState3;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var3 = qg4Var4;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    bVar5 = bVar7;
                    nVar3 = nVar4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar4 = bVar;
                    z5 = z2;
                    lazyListState2 = lazyListStateC;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    nVar3 = nVar2;
                    bVar5 = bVar3;
                    qg4Var3 = qg4Var2;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zo6
                        public final Object invoke(Object obj, Object obj2) {
                            return bp6.d(bVar4, lazyListState2, rx8Var3, z6, nVar3, bVar5, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            bVar3 = bVar2;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    qg4Var2 = qg4Var;
                    if (dVarF.x(qg4Var2)) {
                    }
                    i3 |= i16;
                } else {
                    qg4Var2 = qg4Var;
                }
                i3 |= i16;
            } else {
                qg4Var2 = qg4Var;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((i & 12582912) == 0) {
                    if (dVarF.A(z2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function1)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar6 = b.INSTANCE;
                        } else {
                            bVar6 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i3 &= -57345;
                        } else {
                            nVarD = nVar2;
                        }
                        if (i6 != 0) {
                            bVarK = tc.INSTANCE.k();
                        } else {
                            bVarK = bVar3;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        nVar4 = nVarD;
                        bVar7 = bVarK;
                        z7 = z3;
                        z8 = z9;
                        i10 = 53695811;
                        qg4Var4 = qg4VarA;
                    } else {
                        if (i12 != 0) {
                            bVar6 = b.INSTANCE;
                        } else {
                            bVar6 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i3 &= -57345;
                        } else {
                            nVarD = nVar2;
                        }
                        if (i6 != 0) {
                            bVarK = tc.INSTANCE.k();
                        } else {
                            bVarK = bVar3;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        nVar4 = nVarD;
                        bVar7 = bVarK;
                        z7 = z3;
                        z8 = z9;
                        i10 = 53695811;
                        qg4Var4 = qg4VarA;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                    }
                    int i117 = i3 >> 3;
                    dVar2 = dVarF;
                    mv6.b(bVar6, lazyListState3, rx8Var4, z7, true, qg4Var4, z8, zv8VarD, 0, bVar7, nVar4, null, null, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i117) | (3670016 & i117) | (i117 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                    if (e.k()) {
                        e.n();
                    }
                    bVar4 = bVar6;
                    lazyListState2 = lazyListState3;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var3 = qg4Var4;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    bVar5 = bVar7;
                    nVar3 = nVar4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar4 = bVar;
                    z5 = z2;
                    lazyListState2 = lazyListStateC;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    nVar3 = nVar2;
                    bVar5 = bVar3;
                    qg4Var3 = qg4Var2;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zo6
                        public final Object invoke(Object obj, Object obj2) {
                            return bp6.d(bVar4, lazyListState2, rx8Var3, z6, nVar3, bVar5, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 12582912;
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                if (dVarF.T(function1)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i3 |= i11;
            }
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        bVar6 = b.INSTANCE;
                    } else {
                        bVar6 = bVar;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                        i3 &= -113;
                    }
                    if (i14 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        cVar = c.a;
                        if (z3) {
                            nVarD = cVar.k();
                        } else {
                            nVarD = cVar.d();
                        }
                        i3 &= -57345;
                    } else {
                        nVarD = nVar2;
                    }
                    if (i6 != 0) {
                        bVarK = tc.INSTANCE.k();
                    } else {
                        bVarK = bVar3;
                    }
                    if ((i2 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        qg4VarA = qg4Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyListState3 = lazyListStateC;
                    rx8Var4 = rx8VarE;
                    nVar4 = nVarD;
                    bVar7 = bVarK;
                    z7 = z3;
                    z8 = z9;
                    i10 = 53695811;
                    qg4Var4 = qg4VarA;
                } else {
                    if (i12 != 0) {
                        bVar6 = b.INSTANCE;
                    } else {
                        bVar6 = bVar;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                        i3 &= -113;
                    }
                    if (i14 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        cVar = c.a;
                        if (z3) {
                            nVarD = cVar.k();
                        } else {
                            nVarD = cVar.d();
                        }
                        i3 &= -57345;
                    } else {
                        nVarD = nVar2;
                    }
                    if (i6 != 0) {
                        bVarK = tc.INSTANCE.k();
                    } else {
                        bVarK = bVar3;
                    }
                    if ((i2 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        qg4VarA = qg4Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyListState3 = lazyListStateC;
                    rx8Var4 = rx8VarE;
                    nVar4 = nVarD;
                    bVar7 = bVarK;
                    z7 = z3;
                    z8 = z9;
                    i10 = 53695811;
                    qg4Var4 = qg4VarA;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                }
                int i118 = i3 >> 3;
                dVar2 = dVarF;
                mv6.b(bVar6, lazyListState3, rx8Var4, z7, true, qg4Var4, z8, zv8VarD, 0, bVar7, nVar4, null, null, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i118) | (3670016 & i118) | (i118 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                if (e.k()) {
                    e.n();
                }
                bVar4 = bVar6;
                lazyListState2 = lazyListState3;
                rx8Var3 = rx8Var4;
                z6 = z7;
                qg4Var3 = qg4Var4;
                z5 = z8;
                zv8Var2 = zv8VarD;
                bVar5 = bVar7;
                nVar3 = nVar4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar4 = bVar;
                z5 = z2;
                lazyListState2 = lazyListStateC;
                rx8Var3 = rx8Var2;
                z6 = z3;
                nVar3 = nVar2;
                bVar5 = bVar3;
                qg4Var3 = qg4Var2;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.zo6
                    public final Object invoke(Object obj, Object obj2) {
                        return bp6.d(bVar4, lazyListState2, rx8Var3, z6, nVar3, bVar5, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        z3 = z;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                nVar2 = nVar;
                if (dVarF.x(nVar2)) {
                }
                i3 |= i15;
            } else {
                nVar2 = nVar;
            }
            i3 |= i15;
        } else {
            nVar2 = nVar;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                bVar3 = bVar2;
                if (dVarF.x(bVar3)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    qg4Var2 = qg4Var;
                    if (dVarF.x(qg4Var2)) {
                    }
                    i3 |= i16;
                } else {
                    qg4Var2 = qg4Var;
                }
                i3 |= i16;
            } else {
                qg4Var2 = qg4Var;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((i & 12582912) == 0) {
                    if (dVarF.A(z2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function1)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar6 = b.INSTANCE;
                        } else {
                            bVar6 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i3 &= -57345;
                        } else {
                            nVarD = nVar2;
                        }
                        if (i6 != 0) {
                            bVarK = tc.INSTANCE.k();
                        } else {
                            bVarK = bVar3;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        nVar4 = nVarD;
                        bVar7 = bVarK;
                        z7 = z3;
                        z8 = z9;
                        i10 = 53695811;
                        qg4Var4 = qg4VarA;
                    } else {
                        if (i12 != 0) {
                            bVar6 = b.INSTANCE;
                        } else {
                            bVar6 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i3 &= -57345;
                        } else {
                            nVarD = nVar2;
                        }
                        if (i6 != 0) {
                            bVarK = tc.INSTANCE.k();
                        } else {
                            bVarK = bVar3;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        nVar4 = nVarD;
                        bVar7 = bVarK;
                        z7 = z3;
                        z8 = z9;
                        i10 = 53695811;
                        qg4Var4 = qg4VarA;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                    }
                    int i119 = i3 >> 3;
                    dVar2 = dVarF;
                    mv6.b(bVar6, lazyListState3, rx8Var4, z7, true, qg4Var4, z8, zv8VarD, 0, bVar7, nVar4, null, null, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i119) | (3670016 & i119) | (i119 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                    if (e.k()) {
                        e.n();
                    }
                    bVar4 = bVar6;
                    lazyListState2 = lazyListState3;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var3 = qg4Var4;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    bVar5 = bVar7;
                    nVar3 = nVar4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar4 = bVar;
                    z5 = z2;
                    lazyListState2 = lazyListStateC;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    nVar3 = nVar2;
                    bVar5 = bVar3;
                    qg4Var3 = qg4Var2;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zo6
                        public final Object invoke(Object obj, Object obj2) {
                            return bp6.d(bVar4, lazyListState2, rx8Var3, z6, nVar3, bVar5, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 12582912;
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                if (dVarF.T(function1)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i3 |= i11;
            }
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        bVar6 = b.INSTANCE;
                    } else {
                        bVar6 = bVar;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                        i3 &= -113;
                    }
                    if (i14 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        cVar = c.a;
                        if (z3) {
                            nVarD = cVar.k();
                        } else {
                            nVarD = cVar.d();
                        }
                        i3 &= -57345;
                    } else {
                        nVarD = nVar2;
                    }
                    if (i6 != 0) {
                        bVarK = tc.INSTANCE.k();
                    } else {
                        bVarK = bVar3;
                    }
                    if ((i2 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        qg4VarA = qg4Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyListState3 = lazyListStateC;
                    rx8Var4 = rx8VarE;
                    nVar4 = nVarD;
                    bVar7 = bVarK;
                    z7 = z3;
                    z8 = z9;
                    i10 = 53695811;
                    qg4Var4 = qg4VarA;
                } else {
                    if (i12 != 0) {
                        bVar6 = b.INSTANCE;
                    } else {
                        bVar6 = bVar;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                        i3 &= -113;
                    }
                    if (i14 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        cVar = c.a;
                        if (z3) {
                            nVarD = cVar.k();
                        } else {
                            nVarD = cVar.d();
                        }
                        i3 &= -57345;
                    } else {
                        nVarD = nVar2;
                    }
                    if (i6 != 0) {
                        bVarK = tc.INSTANCE.k();
                    } else {
                        bVarK = bVar3;
                    }
                    if ((i2 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        qg4VarA = qg4Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyListState3 = lazyListStateC;
                    rx8Var4 = rx8VarE;
                    nVar4 = nVarD;
                    bVar7 = bVarK;
                    z7 = z3;
                    z8 = z9;
                    i10 = 53695811;
                    qg4Var4 = qg4VarA;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                }
                int i1110 = i3 >> 3;
                dVar2 = dVarF;
                mv6.b(bVar6, lazyListState3, rx8Var4, z7, true, qg4Var4, z8, zv8VarD, 0, bVar7, nVar4, null, null, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1110) | (3670016 & i1110) | (i1110 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                if (e.k()) {
                    e.n();
                }
                bVar4 = bVar6;
                lazyListState2 = lazyListState3;
                rx8Var3 = rx8Var4;
                z6 = z7;
                qg4Var3 = qg4Var4;
                z5 = z8;
                zv8Var2 = zv8VarD;
                bVar5 = bVar7;
                nVar3 = nVar4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar4 = bVar;
                z5 = z2;
                lazyListState2 = lazyListStateC;
                rx8Var3 = rx8Var2;
                z6 = z3;
                nVar3 = nVar2;
                bVar5 = bVar3;
                qg4Var3 = qg4Var2;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.zo6
                    public final Object invoke(Object obj, Object obj2) {
                        return bp6.d(bVar4, lazyListState2, rx8Var3, z6, nVar3, bVar5, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 196608;
        bVar3 = bVar2;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                qg4Var2 = qg4Var;
                if (dVarF.x(qg4Var2)) {
                }
                i3 |= i16;
            } else {
                qg4Var2 = qg4Var;
            }
            i3 |= i16;
        } else {
            qg4Var2 = qg4Var;
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            if ((i & 12582912) == 0) {
                if (dVarF.A(z2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                if (dVarF.T(function1)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i3 |= i11;
            }
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        bVar6 = b.INSTANCE;
                    } else {
                        bVar6 = bVar;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                        i3 &= -113;
                    }
                    if (i14 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        cVar = c.a;
                        if (z3) {
                            nVarD = cVar.k();
                        } else {
                            nVarD = cVar.d();
                        }
                        i3 &= -57345;
                    } else {
                        nVarD = nVar2;
                    }
                    if (i6 != 0) {
                        bVarK = tc.INSTANCE.k();
                    } else {
                        bVarK = bVar3;
                    }
                    if ((i2 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        qg4VarA = qg4Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyListState3 = lazyListStateC;
                    rx8Var4 = rx8VarE;
                    nVar4 = nVarD;
                    bVar7 = bVarK;
                    z7 = z3;
                    z8 = z9;
                    i10 = 53695811;
                    qg4Var4 = qg4VarA;
                } else {
                    if (i12 != 0) {
                        bVar6 = b.INSTANCE;
                    } else {
                        bVar6 = bVar;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                        i3 &= -113;
                    }
                    if (i14 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        cVar = c.a;
                        if (z3) {
                            nVarD = cVar.k();
                        } else {
                            nVarD = cVar.d();
                        }
                        i3 &= -57345;
                    } else {
                        nVarD = nVar2;
                    }
                    if (i6 != 0) {
                        bVarK = tc.INSTANCE.k();
                    } else {
                        bVarK = bVar3;
                    }
                    if ((i2 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        qg4VarA = qg4Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyListState3 = lazyListStateC;
                    rx8Var4 = rx8VarE;
                    nVar4 = nVarD;
                    bVar7 = bVarK;
                    z7 = z3;
                    z8 = z9;
                    i10 = 53695811;
                    qg4Var4 = qg4VarA;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                }
                int i1111 = i3 >> 3;
                dVar2 = dVarF;
                mv6.b(bVar6, lazyListState3, rx8Var4, z7, true, qg4Var4, z8, zv8VarD, 0, bVar7, nVar4, null, null, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1111) | (3670016 & i1111) | (i1111 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                if (e.k()) {
                    e.n();
                }
                bVar4 = bVar6;
                lazyListState2 = lazyListState3;
                rx8Var3 = rx8Var4;
                z6 = z7;
                qg4Var3 = qg4Var4;
                z5 = z8;
                zv8Var2 = zv8VarD;
                bVar5 = bVar7;
                nVar3 = nVar4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar4 = bVar;
                z5 = z2;
                lazyListState2 = lazyListStateC;
                rx8Var3 = rx8Var2;
                z6 = z3;
                nVar3 = nVar2;
                bVar5 = bVar3;
                qg4Var3 = qg4Var2;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.zo6
                    public final Object invoke(Object obj, Object obj2) {
                        return bp6.d(bVar4, lazyListState2, rx8Var3, z6, nVar3, bVar5, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 12582912;
        if ((i & 100663296) != 0) {
            i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            if (dVarF.T(function1)) {
                i11 = 536870912;
            } else {
                i11 = 268435456;
            }
            i3 |= i11;
        }
        if ((i3 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (dVarF.g(z4, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    bVar6 = b.INSTANCE;
                } else {
                    bVar6 = bVar;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                    i3 &= -113;
                }
                if (i14 != 0) {
                    rx8VarE = nx8.e(ff3.i(0));
                } else {
                    rx8VarE = rx8Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if ((i2 & 16) != 0) {
                    cVar = c.a;
                    if (z3) {
                        nVarD = cVar.k();
                    } else {
                        nVarD = cVar.d();
                    }
                    i3 &= -57345;
                } else {
                    nVarD = nVar2;
                }
                if (i6 != 0) {
                    bVarK = tc.INSTANCE.k();
                } else {
                    bVarK = bVar3;
                }
                if ((i2 & 64) != 0) {
                    qg4VarA = cab.a.a(dVarF, 6);
                    i3 &= -3670017;
                } else {
                    qg4VarA = qg4Var2;
                }
                if (i8 == 0) {
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    zv8VarD = cw8.d(dVarF, 0);
                } else {
                    zv8VarD = zv8Var;
                }
                lazyListState3 = lazyListStateC;
                rx8Var4 = rx8VarE;
                nVar4 = nVarD;
                bVar7 = bVarK;
                z7 = z3;
                z8 = z9;
                i10 = 53695811;
                qg4Var4 = qg4VarA;
            } else {
                if (i12 != 0) {
                    bVar6 = b.INSTANCE;
                } else {
                    bVar6 = bVar;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                    i3 &= -113;
                }
                if (i14 != 0) {
                    rx8VarE = nx8.e(ff3.i(0));
                } else {
                    rx8VarE = rx8Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if ((i2 & 16) != 0) {
                    cVar = c.a;
                    if (z3) {
                        nVarD = cVar.k();
                    } else {
                        nVarD = cVar.d();
                    }
                    i3 &= -57345;
                } else {
                    nVarD = nVar2;
                }
                if (i6 != 0) {
                    bVarK = tc.INSTANCE.k();
                } else {
                    bVarK = bVar3;
                }
                if ((i2 & 64) != 0) {
                    qg4VarA = cab.a.a(dVarF, 6);
                    i3 &= -3670017;
                } else {
                    qg4VarA = qg4Var2;
                }
                if (i8 == 0) {
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    zv8VarD = cw8.d(dVarF, 0);
                } else {
                    zv8VarD = zv8Var;
                }
                lazyListState3 = lazyListStateC;
                rx8Var4 = rx8VarE;
                nVar4 = nVarD;
                bVar7 = bVarK;
                z7 = z3;
                z8 = z9;
                i10 = 53695811;
                qg4Var4 = qg4VarA;
            }
            dVarF.M();
            if (e.k()) {
                e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
            }
            int i1112 = i3 >> 3;
            dVar2 = dVarF;
            mv6.b(bVar6, lazyListState3, rx8Var4, z7, true, qg4Var4, z8, zv8VarD, 0, bVar7, nVar4, null, null, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1112) | (3670016 & i1112) | (i1112 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
            if (e.k()) {
                e.n();
            }
            bVar4 = bVar6;
            lazyListState2 = lazyListState3;
            rx8Var3 = rx8Var4;
            z6 = z7;
            qg4Var3 = qg4Var4;
            z5 = z8;
            zv8Var2 = zv8VarD;
            bVar5 = bVar7;
            nVar3 = nVar4;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bVar4 = bVar;
            z5 = z2;
            lazyListState2 = lazyListStateC;
            rx8Var3 = rx8Var2;
            z6 = z3;
            nVar3 = nVar2;
            bVar5 = bVar3;
            qg4Var3 = qg4Var2;
            zv8Var2 = zv8Var;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.zo6
                public final Object invoke(Object obj, Object obj2) {
                    return bp6.d(bVar4, lazyListState2, rx8Var3, z6, nVar3, bVar5, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(b bVar, LazyListState lazyListState, rx8 rx8Var, boolean z, c.n nVar, tc.b bVar2, qg4 qg4Var, boolean z2, zv8 zv8Var, Function1 function1, int i, int i2, d dVar, int i3) {
        c(bVar, lazyListState, rx8Var, z, nVar, bVar2, qg4Var, z2, zv8Var, function1, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0117  */
    /* JADX WARN: Code duplicated, block: B:105:0x011d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0120  */
    /* JADX WARN: Code duplicated, block: B:110:0x0133  */
    /* JADX WARN: Code duplicated, block: B:111:0x0136  */
    /* JADX WARN: Code duplicated, block: B:114:0x013f  */
    /* JADX WARN: Code duplicated, block: B:116:0x014f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0187  */
    /* JADX WARN: Code duplicated, block: B:134:0x018a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0190  */
    /* JADX WARN: Code duplicated, block: B:139:0x0199  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:147:0x01af  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:152:0x01be  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:160:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:163:0x01de  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:168:0x0203  */
    /* JADX WARN: Code duplicated, block: B:171:0x024b  */
    /* JADX WARN: Code duplicated, block: B:173:0x025e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0275  */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:97:0x0106 A[ADDED_TO_REGION] */
    public static final void e(b bVar, LazyListState lazyListState, rx8 rx8Var, boolean z, c.e eVar, tc.c cVar, qg4 qg4Var, boolean z2, zv8 zv8Var, final Function1<? super cw6, Unit> function1, d dVar, final int i, final int i2) {
        int i3;
        LazyListState lazyListStateC;
        rx8 rx8Var2;
        int i4;
        boolean z3;
        int i5;
        c.e eVar2;
        int i6;
        tc.c cVar2;
        int i7;
        qg4 qg4Var2;
        int i8;
        int i9;
        boolean z4;
        d dVar2;
        final b bVar2;
        final boolean z5;
        final LazyListState lazyListState2;
        final rx8 rx8Var3;
        final boolean z6;
        final c.e eVar3;
        final tc.c cVar3;
        final qg4 qg4Var3;
        final zv8 zv8Var2;
        s6b s6bVarH;
        b bVar3;
        rx8 rx8VarE;
        c.e eVarF;
        tc.c cVarL;
        qg4 qg4VarA;
        zv8 zv8VarD;
        LazyListState lazyListState3;
        rx8 rx8Var4;
        c.e eVar4;
        tc.c cVar4;
        boolean z7;
        boolean z8;
        int i10;
        qg4 qg4Var4;
        c cVar5;
        int i11;
        d dVarF = dVar.F(-1884325601);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListStateC = lazyListState;
                int i13 = dVarF.x(lazyListStateC) ? 32 : 16;
                i3 |= i13;
            } else {
                lazyListStateC = lazyListState;
            }
            i3 |= i13;
        } else {
            lazyListStateC = lazyListState;
        }
        int i14 = i2 & 4;
        if (i14 == 0) {
            if ((i & 384) == 0) {
                rx8Var2 = rx8Var;
                i3 |= dVarF.x(rx8Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z;
                    if (dVarF.A(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        eVar2 = eVar;
                        int i15 = dVarF.x(eVar2) ? 16384 : 8192;
                        i3 |= i15;
                    } else {
                        eVar2 = eVar;
                    }
                    i3 |= i15;
                } else {
                    eVar2 = eVar;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        cVar2 = cVar;
                        if (dVarF.x(cVar2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            qg4Var2 = qg4Var;
                            int i16 = dVarF.x(qg4Var2) ? 1048576 : 524288;
                            i3 |= i16;
                        } else {
                            qg4Var2 = qg4Var;
                        }
                        i3 |= i16;
                    } else {
                        qg4Var2 = qg4Var;
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                        if ((i & 12582912) == 0) {
                            if (dVarF.A(z2)) {
                                i9 = 8388608;
                            } else {
                                i9 = 4194304;
                            }
                            i3 |= i9;
                        }
                        if ((i & 100663296) != 0) {
                            i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                        }
                        if ((i & 805306368) == 0) {
                            if (dVarF.T(function1)) {
                                i11 = 536870912;
                            } else {
                                i11 = 268435456;
                            }
                            i3 |= i11;
                        }
                        if ((i3 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (dVarF.g(z4, i3 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0 || dVarF.t()) {
                                if (i12 != 0) {
                                    bVar3 = b.INSTANCE;
                                } else {
                                    bVar3 = bVar;
                                }
                                if ((i2 & 2) != 0) {
                                    lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                    i3 &= -113;
                                }
                                if (i14 != 0) {
                                    rx8VarE = nx8.e(ff3.i(0));
                                } else {
                                    rx8VarE = rx8Var2;
                                }
                                if (i4 != 0) {
                                    z3 = false;
                                }
                                if ((i2 & 16) != 0) {
                                    cVar5 = c.a;
                                    if (z3) {
                                        eVarF = cVar5.f();
                                    } else {
                                        eVarF = cVar5.j();
                                    }
                                    i3 &= -57345;
                                } else {
                                    eVarF = eVar2;
                                }
                                if (i6 != 0) {
                                    cVarL = tc.INSTANCE.l();
                                } else {
                                    cVarL = cVar2;
                                }
                                if ((i2 & 64) != 0) {
                                    qg4VarA = cab.a.a(dVarF, 6);
                                    i3 &= -3670017;
                                } else {
                                    qg4VarA = qg4Var2;
                                }
                                boolean z9 = i8 == 0 ? z2 : true;
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                    zv8VarD = cw8.d(dVarF, 0);
                                } else {
                                    zv8VarD = zv8Var;
                                }
                                lazyListState3 = lazyListStateC;
                                rx8Var4 = rx8VarE;
                                eVar4 = eVarF;
                                cVar4 = cVarL;
                                z7 = z3;
                                z8 = z9;
                                i10 = -1884325601;
                                qg4Var4 = qg4VarA;
                            } else {
                                dVarF.q();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                bVar3 = bVar;
                                z8 = z2;
                                zv8VarD = zv8Var;
                                z7 = z3;
                                eVar4 = eVar2;
                                cVar4 = cVar2;
                                qg4Var4 = qg4Var2;
                                i10 = -1884325601;
                                lazyListState3 = lazyListStateC;
                                rx8Var4 = rx8Var2;
                            }
                            dVarF.M();
                            if (e.k()) {
                                e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                            }
                            int i17 = i3 >> 3;
                            dVar2 = dVarF;
                            mv6.b(bVar3, lazyListState3, rx8Var4, z7, false, qg4Var4, z8, zv8VarD, 0, null, null, cVar4, eVar4, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i17) | (3670016 & i17) | (i17 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                            if (e.k()) {
                                e.n();
                            }
                            bVar2 = bVar3;
                            lazyListState2 = lazyListState3;
                            rx8Var3 = rx8Var4;
                            z6 = z7;
                            qg4Var3 = qg4Var4;
                            z5 = z8;
                            zv8Var2 = zv8VarD;
                            cVar3 = cVar4;
                            eVar3 = eVar4;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            bVar2 = bVar;
                            z5 = z2;
                            lazyListState2 = lazyListStateC;
                            rx8Var3 = rx8Var2;
                            z6 = z3;
                            eVar3 = eVar2;
                            cVar3 = cVar2;
                            qg4Var3 = qg4Var2;
                            zv8Var2 = zv8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.ap6
                                public final Object invoke(Object obj, Object obj2) {
                                    return bp6.f(bVar2, lazyListState2, rx8Var3, z6, eVar3, cVar3, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 12582912;
                    if ((i & 100663296) != 0) {
                        i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                    }
                    if ((i & 805306368) == 0) {
                        if (dVarF.T(function1)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (dVarF.g(z4, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                bVar3 = b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                i3 &= -113;
                            }
                            if (i14 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                cVar5 = c.a;
                                if (z3) {
                                    eVarF = cVar5.j();
                                } else {
                                    eVarF = cVar5.f();
                                }
                                i3 &= -57345;
                            } else {
                                eVarF = eVar2;
                            }
                            if (i6 != 0) {
                                cVarL = tc.INSTANCE.l();
                            } else {
                                cVarL = cVar2;
                            }
                            if ((i2 & 64) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                qg4VarA = qg4Var2;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyListState3 = lazyListStateC;
                            rx8Var4 = rx8VarE;
                            eVar4 = eVarF;
                            cVar4 = cVarL;
                            z7 = z3;
                            z8 = z9;
                            i10 = -1884325601;
                            qg4Var4 = qg4VarA;
                        } else {
                            if (i12 != 0) {
                                bVar3 = b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                i3 &= -113;
                            }
                            if (i14 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                cVar5 = c.a;
                                if (z3) {
                                    eVarF = cVar5.j();
                                } else {
                                    eVarF = cVar5.f();
                                }
                                i3 &= -57345;
                            } else {
                                eVarF = eVar2;
                            }
                            if (i6 != 0) {
                                cVarL = tc.INSTANCE.l();
                            } else {
                                cVarL = cVar2;
                            }
                            if ((i2 & 64) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                qg4VarA = qg4Var2;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyListState3 = lazyListStateC;
                            rx8Var4 = rx8VarE;
                            eVar4 = eVarF;
                            cVar4 = cVarL;
                            z7 = z3;
                            z8 = z9;
                            i10 = -1884325601;
                            qg4Var4 = qg4VarA;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                        }
                        int i18 = i3 >> 3;
                        dVar2 = dVarF;
                        mv6.b(bVar3, lazyListState3, rx8Var4, z7, false, qg4Var4, z8, zv8VarD, 0, null, null, cVar4, eVar4, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i18) | (3670016 & i18) | (i18 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                        if (e.k()) {
                            e.n();
                        }
                        bVar2 = bVar3;
                        lazyListState2 = lazyListState3;
                        rx8Var3 = rx8Var4;
                        z6 = z7;
                        qg4Var3 = qg4Var4;
                        z5 = z8;
                        zv8Var2 = zv8VarD;
                        cVar3 = cVar4;
                        eVar3 = eVar4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        z5 = z2;
                        lazyListState2 = lazyListStateC;
                        rx8Var3 = rx8Var2;
                        z6 = z3;
                        eVar3 = eVar2;
                        cVar3 = cVar2;
                        qg4Var3 = qg4Var2;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.ap6
                            public final Object invoke(Object obj, Object obj2) {
                                return bp6.f(bVar2, lazyListState2, rx8Var3, z6, eVar3, cVar3, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 196608;
                cVar2 = cVar;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        qg4Var2 = qg4Var;
                        if (dVarF.x(qg4Var2)) {
                        }
                        i3 |= i16;
                    } else {
                        qg4Var2 = qg4Var;
                    }
                    i3 |= i16;
                } else {
                    qg4Var2 = qg4Var;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    if ((i & 12582912) == 0) {
                        if (dVarF.A(z2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i & 100663296) != 0) {
                        i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                    }
                    if ((i & 805306368) == 0) {
                        if (dVarF.T(function1)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (dVarF.g(z4, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                bVar3 = b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                i3 &= -113;
                            }
                            if (i14 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                cVar5 = c.a;
                                if (z3) {
                                    eVarF = cVar5.j();
                                } else {
                                    eVarF = cVar5.f();
                                }
                                i3 &= -57345;
                            } else {
                                eVarF = eVar2;
                            }
                            if (i6 != 0) {
                                cVarL = tc.INSTANCE.l();
                            } else {
                                cVarL = cVar2;
                            }
                            if ((i2 & 64) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                qg4VarA = qg4Var2;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyListState3 = lazyListStateC;
                            rx8Var4 = rx8VarE;
                            eVar4 = eVarF;
                            cVar4 = cVarL;
                            z7 = z3;
                            z8 = z9;
                            i10 = -1884325601;
                            qg4Var4 = qg4VarA;
                        } else {
                            if (i12 != 0) {
                                bVar3 = b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                i3 &= -113;
                            }
                            if (i14 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                cVar5 = c.a;
                                if (z3) {
                                    eVarF = cVar5.j();
                                } else {
                                    eVarF = cVar5.f();
                                }
                                i3 &= -57345;
                            } else {
                                eVarF = eVar2;
                            }
                            if (i6 != 0) {
                                cVarL = tc.INSTANCE.l();
                            } else {
                                cVarL = cVar2;
                            }
                            if ((i2 & 64) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                qg4VarA = qg4Var2;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyListState3 = lazyListStateC;
                            rx8Var4 = rx8VarE;
                            eVar4 = eVarF;
                            cVar4 = cVarL;
                            z7 = z3;
                            z8 = z9;
                            i10 = -1884325601;
                            qg4Var4 = qg4VarA;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                        }
                        int i19 = i3 >> 3;
                        dVar2 = dVarF;
                        mv6.b(bVar3, lazyListState3, rx8Var4, z7, false, qg4Var4, z8, zv8VarD, 0, null, null, cVar4, eVar4, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i19) | (3670016 & i19) | (i19 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                        if (e.k()) {
                            e.n();
                        }
                        bVar2 = bVar3;
                        lazyListState2 = lazyListState3;
                        rx8Var3 = rx8Var4;
                        z6 = z7;
                        qg4Var3 = qg4Var4;
                        z5 = z8;
                        zv8Var2 = zv8VarD;
                        cVar3 = cVar4;
                        eVar3 = eVar4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        z5 = z2;
                        lazyListState2 = lazyListStateC;
                        rx8Var3 = rx8Var2;
                        z6 = z3;
                        eVar3 = eVar2;
                        cVar3 = cVar2;
                        qg4Var3 = qg4Var2;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.ap6
                            public final Object invoke(Object obj, Object obj2) {
                                return bp6.f(bVar2, lazyListState2, rx8Var3, z6, eVar3, cVar3, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 12582912;
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function1)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar5 = c.a;
                            if (z3) {
                                eVarF = cVar5.j();
                            } else {
                                eVarF = cVar5.f();
                            }
                            i3 &= -57345;
                        } else {
                            eVarF = eVar2;
                        }
                        if (i6 != 0) {
                            cVarL = tc.INSTANCE.l();
                        } else {
                            cVarL = cVar2;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        eVar4 = eVarF;
                        cVar4 = cVarL;
                        z7 = z3;
                        z8 = z9;
                        i10 = -1884325601;
                        qg4Var4 = qg4VarA;
                    } else {
                        if (i12 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar5 = c.a;
                            if (z3) {
                                eVarF = cVar5.j();
                            } else {
                                eVarF = cVar5.f();
                            }
                            i3 &= -57345;
                        } else {
                            eVarF = eVar2;
                        }
                        if (i6 != 0) {
                            cVarL = tc.INSTANCE.l();
                        } else {
                            cVarL = cVar2;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        eVar4 = eVarF;
                        cVar4 = cVarL;
                        z7 = z3;
                        z8 = z9;
                        i10 = -1884325601;
                        qg4Var4 = qg4VarA;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                    }
                    int i110 = i3 >> 3;
                    dVar2 = dVarF;
                    mv6.b(bVar3, lazyListState3, rx8Var4, z7, false, qg4Var4, z8, zv8VarD, 0, null, null, cVar4, eVar4, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i110) | (3670016 & i110) | (i110 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                    if (e.k()) {
                        e.n();
                    }
                    bVar2 = bVar3;
                    lazyListState2 = lazyListState3;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var3 = qg4Var4;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    cVar3 = cVar4;
                    eVar3 = eVar4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    z5 = z2;
                    lazyListState2 = lazyListStateC;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar3 = eVar2;
                    cVar3 = cVar2;
                    qg4Var3 = qg4Var2;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ap6
                        public final Object invoke(Object obj, Object obj2) {
                            return bp6.f(bVar2, lazyListState2, rx8Var3, z6, eVar3, cVar3, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            z3 = z;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    eVar2 = eVar;
                    if (dVarF.x(eVar2)) {
                    }
                    i3 |= i15;
                } else {
                    eVar2 = eVar;
                }
                i3 |= i15;
            } else {
                eVar2 = eVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    cVar2 = cVar;
                    if (dVarF.x(cVar2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        qg4Var2 = qg4Var;
                        if (dVarF.x(qg4Var2)) {
                        }
                        i3 |= i16;
                    } else {
                        qg4Var2 = qg4Var;
                    }
                    i3 |= i16;
                } else {
                    qg4Var2 = qg4Var;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    if ((i & 12582912) == 0) {
                        if (dVarF.A(z2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i & 100663296) != 0) {
                        i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                    }
                    if ((i & 805306368) == 0) {
                        if (dVarF.T(function1)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (dVarF.g(z4, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                bVar3 = b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                i3 &= -113;
                            }
                            if (i14 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                cVar5 = c.a;
                                if (z3) {
                                    eVarF = cVar5.j();
                                } else {
                                    eVarF = cVar5.f();
                                }
                                i3 &= -57345;
                            } else {
                                eVarF = eVar2;
                            }
                            if (i6 != 0) {
                                cVarL = tc.INSTANCE.l();
                            } else {
                                cVarL = cVar2;
                            }
                            if ((i2 & 64) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                qg4VarA = qg4Var2;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyListState3 = lazyListStateC;
                            rx8Var4 = rx8VarE;
                            eVar4 = eVarF;
                            cVar4 = cVarL;
                            z7 = z3;
                            z8 = z9;
                            i10 = -1884325601;
                            qg4Var4 = qg4VarA;
                        } else {
                            if (i12 != 0) {
                                bVar3 = b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                i3 &= -113;
                            }
                            if (i14 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                cVar5 = c.a;
                                if (z3) {
                                    eVarF = cVar5.j();
                                } else {
                                    eVarF = cVar5.f();
                                }
                                i3 &= -57345;
                            } else {
                                eVarF = eVar2;
                            }
                            if (i6 != 0) {
                                cVarL = tc.INSTANCE.l();
                            } else {
                                cVarL = cVar2;
                            }
                            if ((i2 & 64) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                qg4VarA = qg4Var2;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyListState3 = lazyListStateC;
                            rx8Var4 = rx8VarE;
                            eVar4 = eVarF;
                            cVar4 = cVarL;
                            z7 = z3;
                            z8 = z9;
                            i10 = -1884325601;
                            qg4Var4 = qg4VarA;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                        }
                        int i111 = i3 >> 3;
                        dVar2 = dVarF;
                        mv6.b(bVar3, lazyListState3, rx8Var4, z7, false, qg4Var4, z8, zv8VarD, 0, null, null, cVar4, eVar4, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i111) | (3670016 & i111) | (i111 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                        if (e.k()) {
                            e.n();
                        }
                        bVar2 = bVar3;
                        lazyListState2 = lazyListState3;
                        rx8Var3 = rx8Var4;
                        z6 = z7;
                        qg4Var3 = qg4Var4;
                        z5 = z8;
                        zv8Var2 = zv8VarD;
                        cVar3 = cVar4;
                        eVar3 = eVar4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        z5 = z2;
                        lazyListState2 = lazyListStateC;
                        rx8Var3 = rx8Var2;
                        z6 = z3;
                        eVar3 = eVar2;
                        cVar3 = cVar2;
                        qg4Var3 = qg4Var2;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.ap6
                            public final Object invoke(Object obj, Object obj2) {
                                return bp6.f(bVar2, lazyListState2, rx8Var3, z6, eVar3, cVar3, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 12582912;
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function1)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar5 = c.a;
                            if (z3) {
                                eVarF = cVar5.j();
                            } else {
                                eVarF = cVar5.f();
                            }
                            i3 &= -57345;
                        } else {
                            eVarF = eVar2;
                        }
                        if (i6 != 0) {
                            cVarL = tc.INSTANCE.l();
                        } else {
                            cVarL = cVar2;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        eVar4 = eVarF;
                        cVar4 = cVarL;
                        z7 = z3;
                        z8 = z9;
                        i10 = -1884325601;
                        qg4Var4 = qg4VarA;
                    } else {
                        if (i12 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar5 = c.a;
                            if (z3) {
                                eVarF = cVar5.j();
                            } else {
                                eVarF = cVar5.f();
                            }
                            i3 &= -57345;
                        } else {
                            eVarF = eVar2;
                        }
                        if (i6 != 0) {
                            cVarL = tc.INSTANCE.l();
                        } else {
                            cVarL = cVar2;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        eVar4 = eVarF;
                        cVar4 = cVarL;
                        z7 = z3;
                        z8 = z9;
                        i10 = -1884325601;
                        qg4Var4 = qg4VarA;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                    }
                    int i112 = i3 >> 3;
                    dVar2 = dVarF;
                    mv6.b(bVar3, lazyListState3, rx8Var4, z7, false, qg4Var4, z8, zv8VarD, 0, null, null, cVar4, eVar4, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i112) | (3670016 & i112) | (i112 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                    if (e.k()) {
                        e.n();
                    }
                    bVar2 = bVar3;
                    lazyListState2 = lazyListState3;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var3 = qg4Var4;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    cVar3 = cVar4;
                    eVar3 = eVar4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    z5 = z2;
                    lazyListState2 = lazyListStateC;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar3 = eVar2;
                    cVar3 = cVar2;
                    qg4Var3 = qg4Var2;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ap6
                        public final Object invoke(Object obj, Object obj2) {
                            return bp6.f(bVar2, lazyListState2, rx8Var3, z6, eVar3, cVar3, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            cVar2 = cVar;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    qg4Var2 = qg4Var;
                    if (dVarF.x(qg4Var2)) {
                    }
                    i3 |= i16;
                } else {
                    qg4Var2 = qg4Var;
                }
                i3 |= i16;
            } else {
                qg4Var2 = qg4Var;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((i & 12582912) == 0) {
                    if (dVarF.A(z2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function1)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar5 = c.a;
                            if (z3) {
                                eVarF = cVar5.j();
                            } else {
                                eVarF = cVar5.f();
                            }
                            i3 &= -57345;
                        } else {
                            eVarF = eVar2;
                        }
                        if (i6 != 0) {
                            cVarL = tc.INSTANCE.l();
                        } else {
                            cVarL = cVar2;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        eVar4 = eVarF;
                        cVar4 = cVarL;
                        z7 = z3;
                        z8 = z9;
                        i10 = -1884325601;
                        qg4Var4 = qg4VarA;
                    } else {
                        if (i12 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar5 = c.a;
                            if (z3) {
                                eVarF = cVar5.j();
                            } else {
                                eVarF = cVar5.f();
                            }
                            i3 &= -57345;
                        } else {
                            eVarF = eVar2;
                        }
                        if (i6 != 0) {
                            cVarL = tc.INSTANCE.l();
                        } else {
                            cVarL = cVar2;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        eVar4 = eVarF;
                        cVar4 = cVarL;
                        z7 = z3;
                        z8 = z9;
                        i10 = -1884325601;
                        qg4Var4 = qg4VarA;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                    }
                    int i113 = i3 >> 3;
                    dVar2 = dVarF;
                    mv6.b(bVar3, lazyListState3, rx8Var4, z7, false, qg4Var4, z8, zv8VarD, 0, null, null, cVar4, eVar4, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i113) | (3670016 & i113) | (i113 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                    if (e.k()) {
                        e.n();
                    }
                    bVar2 = bVar3;
                    lazyListState2 = lazyListState3;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var3 = qg4Var4;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    cVar3 = cVar4;
                    eVar3 = eVar4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    z5 = z2;
                    lazyListState2 = lazyListStateC;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar3 = eVar2;
                    cVar3 = cVar2;
                    qg4Var3 = qg4Var2;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ap6
                        public final Object invoke(Object obj, Object obj2) {
                            return bp6.f(bVar2, lazyListState2, rx8Var3, z6, eVar3, cVar3, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 12582912;
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                if (dVarF.T(function1)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i3 |= i11;
            }
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                        i3 &= -113;
                    }
                    if (i14 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        cVar5 = c.a;
                        if (z3) {
                            eVarF = cVar5.j();
                        } else {
                            eVarF = cVar5.f();
                        }
                        i3 &= -57345;
                    } else {
                        eVarF = eVar2;
                    }
                    if (i6 != 0) {
                        cVarL = tc.INSTANCE.l();
                    } else {
                        cVarL = cVar2;
                    }
                    if ((i2 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        qg4VarA = qg4Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyListState3 = lazyListStateC;
                    rx8Var4 = rx8VarE;
                    eVar4 = eVarF;
                    cVar4 = cVarL;
                    z7 = z3;
                    z8 = z9;
                    i10 = -1884325601;
                    qg4Var4 = qg4VarA;
                } else {
                    if (i12 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                        i3 &= -113;
                    }
                    if (i14 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        cVar5 = c.a;
                        if (z3) {
                            eVarF = cVar5.j();
                        } else {
                            eVarF = cVar5.f();
                        }
                        i3 &= -57345;
                    } else {
                        eVarF = eVar2;
                    }
                    if (i6 != 0) {
                        cVarL = tc.INSTANCE.l();
                    } else {
                        cVarL = cVar2;
                    }
                    if ((i2 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        qg4VarA = qg4Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyListState3 = lazyListStateC;
                    rx8Var4 = rx8VarE;
                    eVar4 = eVarF;
                    cVar4 = cVarL;
                    z7 = z3;
                    z8 = z9;
                    i10 = -1884325601;
                    qg4Var4 = qg4VarA;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                }
                int i114 = i3 >> 3;
                dVar2 = dVarF;
                mv6.b(bVar3, lazyListState3, rx8Var4, z7, false, qg4Var4, z8, zv8VarD, 0, null, null, cVar4, eVar4, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i114) | (3670016 & i114) | (i114 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                if (e.k()) {
                    e.n();
                }
                bVar2 = bVar3;
                lazyListState2 = lazyListState3;
                rx8Var3 = rx8Var4;
                z6 = z7;
                qg4Var3 = qg4Var4;
                z5 = z8;
                zv8Var2 = zv8VarD;
                cVar3 = cVar4;
                eVar3 = eVar4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar2 = bVar;
                z5 = z2;
                lazyListState2 = lazyListStateC;
                rx8Var3 = rx8Var2;
                z6 = z3;
                eVar3 = eVar2;
                cVar3 = cVar2;
                qg4Var3 = qg4Var2;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ap6
                    public final Object invoke(Object obj, Object obj2) {
                        return bp6.f(bVar2, lazyListState2, rx8Var3, z6, eVar3, cVar3, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        rx8Var2 = rx8Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z3 = z;
                if (dVarF.A(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    eVar2 = eVar;
                    if (dVarF.x(eVar2)) {
                    }
                    i3 |= i15;
                } else {
                    eVar2 = eVar;
                }
                i3 |= i15;
            } else {
                eVar2 = eVar;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    cVar2 = cVar;
                    if (dVarF.x(cVar2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        qg4Var2 = qg4Var;
                        if (dVarF.x(qg4Var2)) {
                        }
                        i3 |= i16;
                    } else {
                        qg4Var2 = qg4Var;
                    }
                    i3 |= i16;
                } else {
                    qg4Var2 = qg4Var;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    if ((i & 12582912) == 0) {
                        if (dVarF.A(z2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i & 100663296) != 0) {
                        i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                    }
                    if ((i & 805306368) == 0) {
                        if (dVarF.T(function1)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (dVarF.g(z4, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                bVar3 = b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                i3 &= -113;
                            }
                            if (i14 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                cVar5 = c.a;
                                if (z3) {
                                    eVarF = cVar5.j();
                                } else {
                                    eVarF = cVar5.f();
                                }
                                i3 &= -57345;
                            } else {
                                eVarF = eVar2;
                            }
                            if (i6 != 0) {
                                cVarL = tc.INSTANCE.l();
                            } else {
                                cVarL = cVar2;
                            }
                            if ((i2 & 64) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                qg4VarA = qg4Var2;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyListState3 = lazyListStateC;
                            rx8Var4 = rx8VarE;
                            eVar4 = eVarF;
                            cVar4 = cVarL;
                            z7 = z3;
                            z8 = z9;
                            i10 = -1884325601;
                            qg4Var4 = qg4VarA;
                        } else {
                            if (i12 != 0) {
                                bVar3 = b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                                i3 &= -113;
                            }
                            if (i14 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                cVar5 = c.a;
                                if (z3) {
                                    eVarF = cVar5.j();
                                } else {
                                    eVarF = cVar5.f();
                                }
                                i3 &= -57345;
                            } else {
                                eVarF = eVar2;
                            }
                            if (i6 != 0) {
                                cVarL = tc.INSTANCE.l();
                            } else {
                                cVarL = cVar2;
                            }
                            if ((i2 & 64) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                qg4VarA = qg4Var2;
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyListState3 = lazyListStateC;
                            rx8Var4 = rx8VarE;
                            eVar4 = eVarF;
                            cVar4 = cVarL;
                            z7 = z3;
                            z8 = z9;
                            i10 = -1884325601;
                            qg4Var4 = qg4VarA;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                        }
                        int i115 = i3 >> 3;
                        dVar2 = dVarF;
                        mv6.b(bVar3, lazyListState3, rx8Var4, z7, false, qg4Var4, z8, zv8VarD, 0, null, null, cVar4, eVar4, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i115) | (3670016 & i115) | (i115 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                        if (e.k()) {
                            e.n();
                        }
                        bVar2 = bVar3;
                        lazyListState2 = lazyListState3;
                        rx8Var3 = rx8Var4;
                        z6 = z7;
                        qg4Var3 = qg4Var4;
                        z5 = z8;
                        zv8Var2 = zv8VarD;
                        cVar3 = cVar4;
                        eVar3 = eVar4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        z5 = z2;
                        lazyListState2 = lazyListStateC;
                        rx8Var3 = rx8Var2;
                        z6 = z3;
                        eVar3 = eVar2;
                        cVar3 = cVar2;
                        qg4Var3 = qg4Var2;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.ap6
                            public final Object invoke(Object obj, Object obj2) {
                                return bp6.f(bVar2, lazyListState2, rx8Var3, z6, eVar3, cVar3, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 12582912;
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function1)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar5 = c.a;
                            if (z3) {
                                eVarF = cVar5.j();
                            } else {
                                eVarF = cVar5.f();
                            }
                            i3 &= -57345;
                        } else {
                            eVarF = eVar2;
                        }
                        if (i6 != 0) {
                            cVarL = tc.INSTANCE.l();
                        } else {
                            cVarL = cVar2;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        eVar4 = eVarF;
                        cVar4 = cVarL;
                        z7 = z3;
                        z8 = z9;
                        i10 = -1884325601;
                        qg4Var4 = qg4VarA;
                    } else {
                        if (i12 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar5 = c.a;
                            if (z3) {
                                eVarF = cVar5.j();
                            } else {
                                eVarF = cVar5.f();
                            }
                            i3 &= -57345;
                        } else {
                            eVarF = eVar2;
                        }
                        if (i6 != 0) {
                            cVarL = tc.INSTANCE.l();
                        } else {
                            cVarL = cVar2;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        eVar4 = eVarF;
                        cVar4 = cVarL;
                        z7 = z3;
                        z8 = z9;
                        i10 = -1884325601;
                        qg4Var4 = qg4VarA;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                    }
                    int i116 = i3 >> 3;
                    dVar2 = dVarF;
                    mv6.b(bVar3, lazyListState3, rx8Var4, z7, false, qg4Var4, z8, zv8VarD, 0, null, null, cVar4, eVar4, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i116) | (3670016 & i116) | (i116 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                    if (e.k()) {
                        e.n();
                    }
                    bVar2 = bVar3;
                    lazyListState2 = lazyListState3;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var3 = qg4Var4;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    cVar3 = cVar4;
                    eVar3 = eVar4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    z5 = z2;
                    lazyListState2 = lazyListStateC;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar3 = eVar2;
                    cVar3 = cVar2;
                    qg4Var3 = qg4Var2;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ap6
                        public final Object invoke(Object obj, Object obj2) {
                            return bp6.f(bVar2, lazyListState2, rx8Var3, z6, eVar3, cVar3, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            cVar2 = cVar;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    qg4Var2 = qg4Var;
                    if (dVarF.x(qg4Var2)) {
                    }
                    i3 |= i16;
                } else {
                    qg4Var2 = qg4Var;
                }
                i3 |= i16;
            } else {
                qg4Var2 = qg4Var;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((i & 12582912) == 0) {
                    if (dVarF.A(z2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function1)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar5 = c.a;
                            if (z3) {
                                eVarF = cVar5.j();
                            } else {
                                eVarF = cVar5.f();
                            }
                            i3 &= -57345;
                        } else {
                            eVarF = eVar2;
                        }
                        if (i6 != 0) {
                            cVarL = tc.INSTANCE.l();
                        } else {
                            cVarL = cVar2;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        eVar4 = eVarF;
                        cVar4 = cVarL;
                        z7 = z3;
                        z8 = z9;
                        i10 = -1884325601;
                        qg4Var4 = qg4VarA;
                    } else {
                        if (i12 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar5 = c.a;
                            if (z3) {
                                eVarF = cVar5.j();
                            } else {
                                eVarF = cVar5.f();
                            }
                            i3 &= -57345;
                        } else {
                            eVarF = eVar2;
                        }
                        if (i6 != 0) {
                            cVarL = tc.INSTANCE.l();
                        } else {
                            cVarL = cVar2;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        eVar4 = eVarF;
                        cVar4 = cVarL;
                        z7 = z3;
                        z8 = z9;
                        i10 = -1884325601;
                        qg4Var4 = qg4VarA;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                    }
                    int i117 = i3 >> 3;
                    dVar2 = dVarF;
                    mv6.b(bVar3, lazyListState3, rx8Var4, z7, false, qg4Var4, z8, zv8VarD, 0, null, null, cVar4, eVar4, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i117) | (3670016 & i117) | (i117 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                    if (e.k()) {
                        e.n();
                    }
                    bVar2 = bVar3;
                    lazyListState2 = lazyListState3;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var3 = qg4Var4;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    cVar3 = cVar4;
                    eVar3 = eVar4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    z5 = z2;
                    lazyListState2 = lazyListStateC;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar3 = eVar2;
                    cVar3 = cVar2;
                    qg4Var3 = qg4Var2;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ap6
                        public final Object invoke(Object obj, Object obj2) {
                            return bp6.f(bVar2, lazyListState2, rx8Var3, z6, eVar3, cVar3, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 12582912;
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                if (dVarF.T(function1)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i3 |= i11;
            }
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                        i3 &= -113;
                    }
                    if (i14 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        cVar5 = c.a;
                        if (z3) {
                            eVarF = cVar5.j();
                        } else {
                            eVarF = cVar5.f();
                        }
                        i3 &= -57345;
                    } else {
                        eVarF = eVar2;
                    }
                    if (i6 != 0) {
                        cVarL = tc.INSTANCE.l();
                    } else {
                        cVarL = cVar2;
                    }
                    if ((i2 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        qg4VarA = qg4Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyListState3 = lazyListStateC;
                    rx8Var4 = rx8VarE;
                    eVar4 = eVarF;
                    cVar4 = cVarL;
                    z7 = z3;
                    z8 = z9;
                    i10 = -1884325601;
                    qg4Var4 = qg4VarA;
                } else {
                    if (i12 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                        i3 &= -113;
                    }
                    if (i14 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        cVar5 = c.a;
                        if (z3) {
                            eVarF = cVar5.j();
                        } else {
                            eVarF = cVar5.f();
                        }
                        i3 &= -57345;
                    } else {
                        eVarF = eVar2;
                    }
                    if (i6 != 0) {
                        cVarL = tc.INSTANCE.l();
                    } else {
                        cVarL = cVar2;
                    }
                    if ((i2 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        qg4VarA = qg4Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyListState3 = lazyListStateC;
                    rx8Var4 = rx8VarE;
                    eVar4 = eVarF;
                    cVar4 = cVarL;
                    z7 = z3;
                    z8 = z9;
                    i10 = -1884325601;
                    qg4Var4 = qg4VarA;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                }
                int i118 = i3 >> 3;
                dVar2 = dVarF;
                mv6.b(bVar3, lazyListState3, rx8Var4, z7, false, qg4Var4, z8, zv8VarD, 0, null, null, cVar4, eVar4, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i118) | (3670016 & i118) | (i118 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                if (e.k()) {
                    e.n();
                }
                bVar2 = bVar3;
                lazyListState2 = lazyListState3;
                rx8Var3 = rx8Var4;
                z6 = z7;
                qg4Var3 = qg4Var4;
                z5 = z8;
                zv8Var2 = zv8VarD;
                cVar3 = cVar4;
                eVar3 = eVar4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar2 = bVar;
                z5 = z2;
                lazyListState2 = lazyListStateC;
                rx8Var3 = rx8Var2;
                z6 = z3;
                eVar3 = eVar2;
                cVar3 = cVar2;
                qg4Var3 = qg4Var2;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ap6
                    public final Object invoke(Object obj, Object obj2) {
                        return bp6.f(bVar2, lazyListState2, rx8Var3, z6, eVar3, cVar3, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        z3 = z;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                eVar2 = eVar;
                if (dVarF.x(eVar2)) {
                }
                i3 |= i15;
            } else {
                eVar2 = eVar;
            }
            i3 |= i15;
        } else {
            eVar2 = eVar;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                cVar2 = cVar;
                if (dVarF.x(cVar2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    qg4Var2 = qg4Var;
                    if (dVarF.x(qg4Var2)) {
                    }
                    i3 |= i16;
                } else {
                    qg4Var2 = qg4Var;
                }
                i3 |= i16;
            } else {
                qg4Var2 = qg4Var;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((i & 12582912) == 0) {
                    if (dVarF.A(z2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i & 100663296) != 0) {
                    i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function1)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar5 = c.a;
                            if (z3) {
                                eVarF = cVar5.j();
                            } else {
                                eVarF = cVar5.f();
                            }
                            i3 &= -57345;
                        } else {
                            eVarF = eVar2;
                        }
                        if (i6 != 0) {
                            cVarL = tc.INSTANCE.l();
                        } else {
                            cVarL = cVar2;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        eVar4 = eVarF;
                        cVar4 = cVarL;
                        z7 = z3;
                        z8 = z9;
                        i10 = -1884325601;
                        qg4Var4 = qg4VarA;
                    } else {
                        if (i12 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                            i3 &= -113;
                        }
                        if (i14 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            cVar5 = c.a;
                            if (z3) {
                                eVarF = cVar5.j();
                            } else {
                                eVarF = cVar5.f();
                            }
                            i3 &= -57345;
                        } else {
                            eVarF = eVar2;
                        }
                        if (i6 != 0) {
                            cVarL = tc.INSTANCE.l();
                        } else {
                            cVarL = cVar2;
                        }
                        if ((i2 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            qg4VarA = qg4Var2;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyListState3 = lazyListStateC;
                        rx8Var4 = rx8VarE;
                        eVar4 = eVarF;
                        cVar4 = cVarL;
                        z7 = z3;
                        z8 = z9;
                        i10 = -1884325601;
                        qg4Var4 = qg4VarA;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                    }
                    int i119 = i3 >> 3;
                    dVar2 = dVarF;
                    mv6.b(bVar3, lazyListState3, rx8Var4, z7, false, qg4Var4, z8, zv8VarD, 0, null, null, cVar4, eVar4, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i119) | (3670016 & i119) | (i119 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                    if (e.k()) {
                        e.n();
                    }
                    bVar2 = bVar3;
                    lazyListState2 = lazyListState3;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var3 = qg4Var4;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    cVar3 = cVar4;
                    eVar3 = eVar4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    z5 = z2;
                    lazyListState2 = lazyListStateC;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar3 = eVar2;
                    cVar3 = cVar2;
                    qg4Var3 = qg4Var2;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ap6
                        public final Object invoke(Object obj, Object obj2) {
                            return bp6.f(bVar2, lazyListState2, rx8Var3, z6, eVar3, cVar3, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 12582912;
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                if (dVarF.T(function1)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i3 |= i11;
            }
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                        i3 &= -113;
                    }
                    if (i14 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        cVar5 = c.a;
                        if (z3) {
                            eVarF = cVar5.j();
                        } else {
                            eVarF = cVar5.f();
                        }
                        i3 &= -57345;
                    } else {
                        eVarF = eVar2;
                    }
                    if (i6 != 0) {
                        cVarL = tc.INSTANCE.l();
                    } else {
                        cVarL = cVar2;
                    }
                    if ((i2 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        qg4VarA = qg4Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyListState3 = lazyListStateC;
                    rx8Var4 = rx8VarE;
                    eVar4 = eVarF;
                    cVar4 = cVarL;
                    z7 = z3;
                    z8 = z9;
                    i10 = -1884325601;
                    qg4Var4 = qg4VarA;
                } else {
                    if (i12 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                        i3 &= -113;
                    }
                    if (i14 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        cVar5 = c.a;
                        if (z3) {
                            eVarF = cVar5.j();
                        } else {
                            eVarF = cVar5.f();
                        }
                        i3 &= -57345;
                    } else {
                        eVarF = eVar2;
                    }
                    if (i6 != 0) {
                        cVarL = tc.INSTANCE.l();
                    } else {
                        cVarL = cVar2;
                    }
                    if ((i2 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        qg4VarA = qg4Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyListState3 = lazyListStateC;
                    rx8Var4 = rx8VarE;
                    eVar4 = eVarF;
                    cVar4 = cVarL;
                    z7 = z3;
                    z8 = z9;
                    i10 = -1884325601;
                    qg4Var4 = qg4VarA;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                }
                int i1110 = i3 >> 3;
                dVar2 = dVarF;
                mv6.b(bVar3, lazyListState3, rx8Var4, z7, false, qg4Var4, z8, zv8VarD, 0, null, null, cVar4, eVar4, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1110) | (3670016 & i1110) | (i1110 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                if (e.k()) {
                    e.n();
                }
                bVar2 = bVar3;
                lazyListState2 = lazyListState3;
                rx8Var3 = rx8Var4;
                z6 = z7;
                qg4Var3 = qg4Var4;
                z5 = z8;
                zv8Var2 = zv8VarD;
                cVar3 = cVar4;
                eVar3 = eVar4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar2 = bVar;
                z5 = z2;
                lazyListState2 = lazyListStateC;
                rx8Var3 = rx8Var2;
                z6 = z3;
                eVar3 = eVar2;
                cVar3 = cVar2;
                qg4Var3 = qg4Var2;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ap6
                    public final Object invoke(Object obj, Object obj2) {
                        return bp6.f(bVar2, lazyListState2, rx8Var3, z6, eVar3, cVar3, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 196608;
        cVar2 = cVar;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                qg4Var2 = qg4Var;
                if (dVarF.x(qg4Var2)) {
                }
                i3 |= i16;
            } else {
                qg4Var2 = qg4Var;
            }
            i3 |= i16;
        } else {
            qg4Var2 = qg4Var;
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            if ((i & 12582912) == 0) {
                if (dVarF.A(z2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i & 100663296) != 0) {
                i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                if (dVarF.T(function1)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i3 |= i11;
            }
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                        i3 &= -113;
                    }
                    if (i14 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        cVar5 = c.a;
                        if (z3) {
                            eVarF = cVar5.j();
                        } else {
                            eVarF = cVar5.f();
                        }
                        i3 &= -57345;
                    } else {
                        eVarF = eVar2;
                    }
                    if (i6 != 0) {
                        cVarL = tc.INSTANCE.l();
                    } else {
                        cVarL = cVar2;
                    }
                    if ((i2 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        qg4VarA = qg4Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyListState3 = lazyListStateC;
                    rx8Var4 = rx8VarE;
                    eVar4 = eVarF;
                    cVar4 = cVarL;
                    z7 = z3;
                    z8 = z9;
                    i10 = -1884325601;
                    qg4Var4 = qg4VarA;
                } else {
                    if (i12 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                        i3 &= -113;
                    }
                    if (i14 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 16) != 0) {
                        cVar5 = c.a;
                        if (z3) {
                            eVarF = cVar5.j();
                        } else {
                            eVarF = cVar5.f();
                        }
                        i3 &= -57345;
                    } else {
                        eVarF = eVar2;
                    }
                    if (i6 != 0) {
                        cVarL = tc.INSTANCE.l();
                    } else {
                        cVarL = cVar2;
                    }
                    if ((i2 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        qg4VarA = qg4Var2;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyListState3 = lazyListStateC;
                    rx8Var4 = rx8VarE;
                    eVar4 = eVarF;
                    cVar4 = cVarL;
                    z7 = z3;
                    z8 = z9;
                    i10 = -1884325601;
                    qg4Var4 = qg4VarA;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                }
                int i1111 = i3 >> 3;
                dVar2 = dVarF;
                mv6.b(bVar3, lazyListState3, rx8Var4, z7, false, qg4Var4, z8, zv8VarD, 0, null, null, cVar4, eVar4, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1111) | (3670016 & i1111) | (i1111 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                if (e.k()) {
                    e.n();
                }
                bVar2 = bVar3;
                lazyListState2 = lazyListState3;
                rx8Var3 = rx8Var4;
                z6 = z7;
                qg4Var3 = qg4Var4;
                z5 = z8;
                zv8Var2 = zv8VarD;
                cVar3 = cVar4;
                eVar3 = eVar4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar2 = bVar;
                z5 = z2;
                lazyListState2 = lazyListStateC;
                rx8Var3 = rx8Var2;
                z6 = z3;
                eVar3 = eVar2;
                cVar3 = cVar2;
                qg4Var3 = qg4Var2;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ap6
                    public final Object invoke(Object obj, Object obj2) {
                        return bp6.f(bVar2, lazyListState2, rx8Var3, z6, eVar3, cVar3, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 12582912;
        if ((i & 100663296) != 0) {
            i3 |= ((i2 & 256) == 0 || !dVarF.x(zv8Var)) ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            if (dVarF.T(function1)) {
                i11 = 536870912;
            } else {
                i11 = 268435456;
            }
            i3 |= i11;
        }
        if ((i3 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (dVarF.g(z4, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                    i3 &= -113;
                }
                if (i14 != 0) {
                    rx8VarE = nx8.e(ff3.i(0));
                } else {
                    rx8VarE = rx8Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if ((i2 & 16) != 0) {
                    cVar5 = c.a;
                    if (z3) {
                        eVarF = cVar5.j();
                    } else {
                        eVarF = cVar5.f();
                    }
                    i3 &= -57345;
                } else {
                    eVarF = eVar2;
                }
                if (i6 != 0) {
                    cVarL = tc.INSTANCE.l();
                } else {
                    cVarL = cVar2;
                }
                if ((i2 & 64) != 0) {
                    qg4VarA = cab.a.a(dVarF, 6);
                    i3 &= -3670017;
                } else {
                    qg4VarA = qg4Var2;
                }
                if (i8 == 0) {
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    zv8VarD = cw8.d(dVarF, 0);
                } else {
                    zv8VarD = zv8Var;
                }
                lazyListState3 = lazyListStateC;
                rx8Var4 = rx8VarE;
                eVar4 = eVarF;
                cVar4 = cVarL;
                z7 = z3;
                z8 = z9;
                i10 = -1884325601;
                qg4Var4 = qg4VarA;
            } else {
                if (i12 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateC = androidx.compose.p001foundation.lazy.d.c(0, 0, dVarF, 0, 3);
                    i3 &= -113;
                }
                if (i14 != 0) {
                    rx8VarE = nx8.e(ff3.i(0));
                } else {
                    rx8VarE = rx8Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if ((i2 & 16) != 0) {
                    cVar5 = c.a;
                    if (z3) {
                        eVarF = cVar5.j();
                    } else {
                        eVarF = cVar5.f();
                    }
                    i3 &= -57345;
                } else {
                    eVarF = eVar2;
                }
                if (i6 != 0) {
                    cVarL = tc.INSTANCE.l();
                } else {
                    cVarL = cVar2;
                }
                if ((i2 & 64) != 0) {
                    qg4VarA = cab.a.a(dVarF, 6);
                    i3 &= -3670017;
                } else {
                    qg4VarA = qg4Var2;
                }
                if (i8 == 0) {
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    zv8VarD = cw8.d(dVarF, 0);
                } else {
                    zv8VarD = zv8Var;
                }
                lazyListState3 = lazyListStateC;
                rx8Var4 = rx8VarE;
                eVar4 = eVarF;
                cVar4 = cVarL;
                z7 = z3;
                z8 = z9;
                i10 = -1884325601;
                qg4Var4 = qg4VarA;
            }
            dVarF.M();
            if (e.k()) {
                e.o(i10, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
            }
            int i1112 = i3 >> 3;
            dVar2 = dVarF;
            mv6.b(bVar3, lazyListState3, rx8Var4, z7, false, qg4Var4, z8, zv8VarD, 0, null, null, cVar4, eVar4, function1, dVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1112) | (3670016 & i1112) | (i1112 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
            if (e.k()) {
                e.n();
            }
            bVar2 = bVar3;
            lazyListState2 = lazyListState3;
            rx8Var3 = rx8Var4;
            z6 = z7;
            qg4Var3 = qg4Var4;
            z5 = z8;
            zv8Var2 = zv8VarD;
            cVar3 = cVar4;
            eVar3 = eVar4;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bVar2 = bVar;
            z5 = z2;
            lazyListState2 = lazyListStateC;
            rx8Var3 = rx8Var2;
            z6 = z3;
            eVar3 = eVar2;
            cVar3 = cVar2;
            qg4Var3 = qg4Var2;
            zv8Var2 = zv8Var;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ap6
                public final Object invoke(Object obj, Object obj2) {
                    return bp6.f(bVar2, lazyListState2, rx8Var3, z6, eVar3, cVar3, qg4Var3, z5, zv8Var2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(b bVar, LazyListState lazyListState, rx8 rx8Var, boolean z, c.e eVar, tc.c cVar, qg4 qg4Var, boolean z2, zv8 zv8Var, Function1 function1, int i, int i2, d dVar, int i3) {
        e(bVar, lazyListState, rx8Var, z, eVar, cVar, qg4Var, z2, zv8Var, function1, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }
}
