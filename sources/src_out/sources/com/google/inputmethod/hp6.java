package com.google.inputmethod;

import androidx.compose.p001foundation.layout.c;
import androidx.compose.p001foundation.lazy.grid.LazyGridState;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.b;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/google/android/m15;", "columns", "Landroidx/compose/ui/b;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Lcom/google/android/rx8;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/c$n;", "verticalArrangement", "Landroidx/compose/foundation/layout/c$e;", "horizontalArrangement", "Lcom/google/android/qg4;", "flingBehavior", "userScrollEnabled", "Lcom/google/android/zv8;", "overscrollEffect", "Lkotlin/Function1;", "Lcom/google/android/sq6;", "", "content", "c", "(Lcom/google/android/m15;Landroidx/compose/ui/b;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lcom/google/android/rx8;ZLandroidx/compose/foundation/layout/c$n;Landroidx/compose/foundation/layout/c$e;Lcom/google/android/qg4;ZLcom/google/android/zv8;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;III)V", "Lcom/google/android/vq6;", "g", "(Lcom/google/android/m15;Landroidx/compose/foundation/layout/c$e;Landroidx/compose/runtime/d;I)Lcom/google/android/vq6;", "", "gridSize", "slotCount", "spacing", "", "f", "(III)Ljava/util/List;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class hp6 {
    /* JADX WARN: Code duplicated, block: B:100:0x010f  */
    /* JADX WARN: Code duplicated, block: B:103:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x0121  */
    /* JADX WARN: Code duplicated, block: B:109:0x0129  */
    /* JADX WARN: Code duplicated, block: B:111:0x012f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0132  */
    /* JADX WARN: Code duplicated, block: B:114:0x0139  */
    /* JADX WARN: Code duplicated, block: B:117:0x014c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0154  */
    /* JADX WARN: Code duplicated, block: B:124:0x015e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0169  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:161:0x01da  */
    /* JADX WARN: Code duplicated, block: B:163:0x01de  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:168:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:171:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:174:0x0201  */
    /* JADX WARN: Code duplicated, block: B:176:0x021c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0229  */
    /* JADX WARN: Code duplicated, block: B:182:0x027b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0290  */
    /* JADX WARN: Code duplicated, block: B:187:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x0101  */
    /* JADX WARN: Code duplicated, block: B:98:0x010b  */
    public static final void c(final m15 m15Var, b bVar, LazyGridState lazyGridState, rx8 rx8Var, boolean z, c.n nVar, c.e eVar, qg4 qg4Var, boolean z2, zv8 zv8Var, final Function1<? super sq6, Unit> function1, d dVar, final int i, final int i2, final int i3) {
        int i4;
        b bVar2;
        LazyGridState lazyGridState2;
        int i5;
        rx8 rx8Var2;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        c.e eVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z4;
        d dVar2;
        final c.n nVar2;
        final boolean z5;
        final b bVar3;
        final LazyGridState lazyGridState3;
        final rx8 rx8Var3;
        final boolean z6;
        final c.e eVar3;
        final qg4 qg4Var2;
        final zv8 zv8Var2;
        s6b s6bVarH;
        b bVar4;
        LazyGridState lazyGridStateG;
        rx8 rx8VarE;
        c.n nVarD;
        c.e eVarJ;
        qg4 qg4VarA;
        zv8 zv8VarD;
        LazyGridState lazyGridState4;
        rx8 rx8Var4;
        c.n nVar3;
        qg4 qg4Var3;
        boolean z7;
        boolean z8;
        int i14;
        c cVar;
        int i15;
        int i16;
        d dVarF = dVar.F(-2072102870);
        if ((i & 6) == 0) {
            i4 = (dVarF.x(m15Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i17 = i3 & 2;
        if (i17 == 0) {
            if ((i & 48) == 0) {
                bVar2 = bVar;
                i4 |= dVarF.x(bVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i3 & 4) == 0) {
                    lazyGridState2 = lazyGridState;
                    int i18 = dVarF.x(lazyGridState2) ? 256 : 128;
                    i4 |= i18;
                } else {
                    lazyGridState2 = lazyGridState;
                }
                i4 |= i18;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    rx8Var2 = rx8Var;
                    if (dVarF.x(rx8Var2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((i & 24576) == 0) {
                        z3 = z;
                        if (dVarF.A(z3)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                    if ((i & 196608) != 0) {
                        if ((i3 & 32) == 0 || !dVarF.x(nVar)) {
                            i16 = 65536;
                        } else {
                            i16 = 131072;
                        }
                        i4 |= i16;
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                        if ((i & 1572864) == 0) {
                            eVar2 = eVar;
                            if (dVarF.x(eVar2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i4 |= i10;
                        }
                        if ((i & 12582912) != 0) {
                            i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            if (dVarF.A(z2)) {
                                i12 = 67108864;
                            } else {
                                i12 = 33554432;
                            }
                            i4 |= i12;
                        }
                        if ((i & 805306368) != 0) {
                            i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                        }
                        if ((i2 & 6) == 0) {
                            if (dVarF.T(function1)) {
                                i15 = 4;
                            } else {
                                i15 = 2;
                            }
                            i13 = i2 | i15;
                        } else {
                            i13 = i2;
                        }
                        if ((i4 & 306783379) == 306783378 || (i13 & 3) != 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (dVarF.g(z4, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0 || dVarF.t()) {
                                if (i17 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                                    i4 &= -897;
                                } else {
                                    lazyGridStateG = lazyGridState2;
                                }
                                if (i5 != 0) {
                                    rx8VarE = nx8.e(ff3.i(0));
                                } else {
                                    rx8VarE = rx8Var2;
                                }
                                if (i7 != 0) {
                                    z3 = false;
                                }
                                if ((i3 & 32) != 0) {
                                    cVar = c.a;
                                    if (z3) {
                                        nVarD = cVar.d();
                                    } else {
                                        nVarD = cVar.k();
                                    }
                                    i4 &= -458753;
                                } else {
                                    nVarD = nVar;
                                }
                                if (i9 != 0) {
                                    eVarJ = c.a.j();
                                } else {
                                    eVarJ = eVar2;
                                }
                                if ((i3 & 128) != 0) {
                                    qg4VarA = cab.a.a(dVarF, 6);
                                    i4 &= -29360129;
                                } else {
                                    qg4VarA = qg4Var;
                                }
                                boolean z9 = i11 == 0 ? z2 : true;
                                if ((i3 & 512) != 0) {
                                    i4 &= -1879048193;
                                    zv8VarD = cw8.d(dVarF, 0);
                                } else {
                                    zv8VarD = zv8Var;
                                }
                                lazyGridState4 = lazyGridStateG;
                                rx8Var4 = rx8VarE;
                                nVar3 = nVarD;
                                qg4Var3 = qg4VarA;
                                z7 = z3;
                                z8 = z9;
                                i14 = -2072102870;
                            } else {
                                dVarF.q();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                                if ((i3 & 128) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((i3 & 512) != 0) {
                                    i4 &= -1879048193;
                                }
                                nVar3 = nVar;
                                qg4Var3 = qg4Var;
                                z8 = z2;
                                zv8VarD = zv8Var;
                                lazyGridState4 = lazyGridState2;
                                rx8Var4 = rx8Var2;
                                z7 = z3;
                                eVarJ = eVar2;
                                i14 = -2072102870;
                                bVar4 = bVar2;
                            }
                            dVarF.M();
                            if (e.k()) {
                                e.o(i14, i4, i13, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                            }
                            int i19 = i4 >> 3;
                            dVar2 = dVarF;
                            c.e eVar4 = eVarJ;
                            bq6.b(bVar4, lazyGridState4, g(m15Var, eVarJ, dVarF, (i4 & 14) | ((i4 >> 15) & 112)), rx8Var4, z7, true, qg4Var3, z8, zv8VarD, nVar3, eVar4, function1, dVar2, (i19 & 234881024) | (i19 & 14) | 196608 | (i19 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i19) | (29360128 & i19) | ((i4 << 12) & 1879048192), ((i4 >> 18) & 14) | ((i13 << 3) & 112), 0);
                            if (e.k()) {
                                e.n();
                            }
                            bVar3 = bVar4;
                            lazyGridState3 = lazyGridState4;
                            rx8Var3 = rx8Var4;
                            z6 = z7;
                            qg4Var2 = qg4Var3;
                            z5 = z8;
                            zv8Var2 = zv8VarD;
                            nVar2 = nVar3;
                            eVar3 = eVar4;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            nVar2 = nVar;
                            z5 = z2;
                            bVar3 = bVar2;
                            lazyGridState3 = lazyGridState2;
                            rx8Var3 = rx8Var2;
                            z6 = z3;
                            eVar3 = eVar2;
                            qg4Var2 = qg4Var;
                            zv8Var2 = zv8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.fp6
                                public final Object invoke(Object obj, Object obj2) {
                                    return hp6.d(m15Var, bVar3, lazyGridState3, rx8Var3, z6, nVar2, eVar3, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 1572864;
                    eVar2 = eVar;
                    if ((i & 12582912) != 0) {
                        i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (dVarF.A(z2)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i4 |= i12;
                    }
                    if ((i & 805306368) != 0) {
                        i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                    }
                    if ((i2 & 6) == 0) {
                        if (dVarF.T(function1)) {
                            i15 = 4;
                        } else {
                            i15 = 2;
                        }
                        i13 = i2 | i15;
                    } else {
                        i13 = i2;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 4) != 0) {
                                lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyGridStateG = lazyGridState2;
                            }
                            if (i5 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if ((i3 & 32) != 0) {
                                cVar = c.a;
                                if (z3) {
                                    nVarD = cVar.k();
                                } else {
                                    nVarD = cVar.d();
                                }
                                i4 &= -458753;
                            } else {
                                nVarD = nVar;
                            }
                            if (i9 != 0) {
                                eVarJ = c.a.j();
                            } else {
                                eVarJ = eVar2;
                            }
                            if ((i3 & 128) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i4 &= -29360129;
                            } else {
                                qg4VarA = qg4Var;
                            }
                            if (i11 == 0) {
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyGridState4 = lazyGridStateG;
                            rx8Var4 = rx8VarE;
                            nVar3 = nVarD;
                            qg4Var3 = qg4VarA;
                            z7 = z3;
                            z8 = z9;
                            i14 = -2072102870;
                        } else {
                            if (i17 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 4) != 0) {
                                lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyGridStateG = lazyGridState2;
                            }
                            if (i5 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if ((i3 & 32) != 0) {
                                cVar = c.a;
                                if (z3) {
                                    nVarD = cVar.k();
                                } else {
                                    nVarD = cVar.d();
                                }
                                i4 &= -458753;
                            } else {
                                nVarD = nVar;
                            }
                            if (i9 != 0) {
                                eVarJ = c.a.j();
                            } else {
                                eVarJ = eVar2;
                            }
                            if ((i3 & 128) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i4 &= -29360129;
                            } else {
                                qg4VarA = qg4Var;
                            }
                            if (i11 == 0) {
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyGridState4 = lazyGridStateG;
                            rx8Var4 = rx8VarE;
                            nVar3 = nVarD;
                            qg4Var3 = qg4VarA;
                            z7 = z3;
                            z8 = z9;
                            i14 = -2072102870;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(i14, i4, i13, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                        }
                        int i110 = i4 >> 3;
                        dVar2 = dVarF;
                        c.e eVar5 = eVarJ;
                        bq6.b(bVar4, lazyGridState4, g(m15Var, eVarJ, dVarF, (i4 & 14) | ((i4 >> 15) & 112)), rx8Var4, z7, true, qg4Var3, z8, zv8VarD, nVar3, eVar5, function1, dVar2, (i110 & 234881024) | (i110 & 14) | 196608 | (i110 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i110) | (29360128 & i110) | ((i4 << 12) & 1879048192), ((i4 >> 18) & 14) | ((i13 << 3) & 112), 0);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                        lazyGridState3 = lazyGridState4;
                        rx8Var3 = rx8Var4;
                        z6 = z7;
                        qg4Var2 = qg4Var3;
                        z5 = z8;
                        zv8Var2 = zv8VarD;
                        nVar2 = nVar3;
                        eVar3 = eVar5;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        nVar2 = nVar;
                        z5 = z2;
                        bVar3 = bVar2;
                        lazyGridState3 = lazyGridState2;
                        rx8Var3 = rx8Var2;
                        z6 = z3;
                        eVar3 = eVar2;
                        qg4Var2 = qg4Var;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.fp6
                            public final Object invoke(Object obj, Object obj2) {
                                return hp6.d(m15Var, bVar3, lazyGridState3, rx8Var3, z6, nVar2, eVar3, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 24576;
                z3 = z;
                if ((i & 196608) != 0) {
                    if ((i3 & 32) == 0) {
                        i16 = 65536;
                    } else {
                        i16 = 65536;
                    }
                    i4 |= i16;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    if ((i & 1572864) == 0) {
                        eVar2 = eVar;
                        if (dVarF.x(eVar2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                    if ((i & 12582912) != 0) {
                        i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (dVarF.A(z2)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i4 |= i12;
                    }
                    if ((i & 805306368) != 0) {
                        i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                    }
                    if ((i2 & 6) == 0) {
                        if (dVarF.T(function1)) {
                            i15 = 4;
                        } else {
                            i15 = 2;
                        }
                        i13 = i2 | i15;
                    } else {
                        i13 = i2;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 4) != 0) {
                                lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyGridStateG = lazyGridState2;
                            }
                            if (i5 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if ((i3 & 32) != 0) {
                                cVar = c.a;
                                if (z3) {
                                    nVarD = cVar.k();
                                } else {
                                    nVarD = cVar.d();
                                }
                                i4 &= -458753;
                            } else {
                                nVarD = nVar;
                            }
                            if (i9 != 0) {
                                eVarJ = c.a.j();
                            } else {
                                eVarJ = eVar2;
                            }
                            if ((i3 & 128) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i4 &= -29360129;
                            } else {
                                qg4VarA = qg4Var;
                            }
                            if (i11 == 0) {
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyGridState4 = lazyGridStateG;
                            rx8Var4 = rx8VarE;
                            nVar3 = nVarD;
                            qg4Var3 = qg4VarA;
                            z7 = z3;
                            z8 = z9;
                            i14 = -2072102870;
                        } else {
                            if (i17 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 4) != 0) {
                                lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyGridStateG = lazyGridState2;
                            }
                            if (i5 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if ((i3 & 32) != 0) {
                                cVar = c.a;
                                if (z3) {
                                    nVarD = cVar.k();
                                } else {
                                    nVarD = cVar.d();
                                }
                                i4 &= -458753;
                            } else {
                                nVarD = nVar;
                            }
                            if (i9 != 0) {
                                eVarJ = c.a.j();
                            } else {
                                eVarJ = eVar2;
                            }
                            if ((i3 & 128) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i4 &= -29360129;
                            } else {
                                qg4VarA = qg4Var;
                            }
                            if (i11 == 0) {
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyGridState4 = lazyGridStateG;
                            rx8Var4 = rx8VarE;
                            nVar3 = nVarD;
                            qg4Var3 = qg4VarA;
                            z7 = z3;
                            z8 = z9;
                            i14 = -2072102870;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(i14, i4, i13, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                        }
                        int i111 = i4 >> 3;
                        dVar2 = dVarF;
                        c.e eVar6 = eVarJ;
                        bq6.b(bVar4, lazyGridState4, g(m15Var, eVarJ, dVarF, (i4 & 14) | ((i4 >> 15) & 112)), rx8Var4, z7, true, qg4Var3, z8, zv8VarD, nVar3, eVar6, function1, dVar2, (i111 & 234881024) | (i111 & 14) | 196608 | (i111 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i111) | (29360128 & i111) | ((i4 << 12) & 1879048192), ((i4 >> 18) & 14) | ((i13 << 3) & 112), 0);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                        lazyGridState3 = lazyGridState4;
                        rx8Var3 = rx8Var4;
                        z6 = z7;
                        qg4Var2 = qg4Var3;
                        z5 = z8;
                        zv8Var2 = zv8VarD;
                        nVar2 = nVar3;
                        eVar3 = eVar6;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        nVar2 = nVar;
                        z5 = z2;
                        bVar3 = bVar2;
                        lazyGridState3 = lazyGridState2;
                        rx8Var3 = rx8Var2;
                        z6 = z3;
                        eVar3 = eVar2;
                        qg4Var2 = qg4Var;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.fp6
                            public final Object invoke(Object obj, Object obj2) {
                                return hp6.d(m15Var, bVar3, lazyGridState3, rx8Var3, z6, nVar2, eVar3, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 1572864;
                eVar2 = eVar;
                if ((i & 12582912) != 0) {
                    i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.A(z2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                if ((i & 805306368) != 0) {
                    i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                }
                if ((i2 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i13 = i2 | i15;
                } else {
                    i13 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyGridStateG = lazyGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 32) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i4 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i9 != 0) {
                            eVarJ = c.a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i11 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyGridState4 = lazyGridStateG;
                        rx8Var4 = rx8VarE;
                        nVar3 = nVarD;
                        qg4Var3 = qg4VarA;
                        z7 = z3;
                        z8 = z9;
                        i14 = -2072102870;
                    } else {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyGridStateG = lazyGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 32) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i4 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i9 != 0) {
                            eVarJ = c.a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i11 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyGridState4 = lazyGridStateG;
                        rx8Var4 = rx8VarE;
                        nVar3 = nVarD;
                        qg4Var3 = qg4VarA;
                        z7 = z3;
                        z8 = z9;
                        i14 = -2072102870;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i14, i4, i13, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                    }
                    int i112 = i4 >> 3;
                    dVar2 = dVarF;
                    c.e eVar7 = eVarJ;
                    bq6.b(bVar4, lazyGridState4, g(m15Var, eVarJ, dVarF, (i4 & 14) | ((i4 >> 15) & 112)), rx8Var4, z7, true, qg4Var3, z8, zv8VarD, nVar3, eVar7, function1, dVar2, (i112 & 234881024) | (i112 & 14) | 196608 | (i112 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i112) | (29360128 & i112) | ((i4 << 12) & 1879048192), ((i4 >> 18) & 14) | ((i13 << 3) & 112), 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    lazyGridState3 = lazyGridState4;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var2 = qg4Var3;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    nVar2 = nVar3;
                    eVar3 = eVar7;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    nVar2 = nVar;
                    z5 = z2;
                    bVar3 = bVar2;
                    lazyGridState3 = lazyGridState2;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar3 = eVar2;
                    qg4Var2 = qg4Var;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.fp6
                        public final Object invoke(Object obj, Object obj2) {
                            return hp6.d(m15Var, bVar3, lazyGridState3, rx8Var3, z6, nVar2, eVar3, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 3072;
            rx8Var2 = rx8Var;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    z3 = z;
                    if (dVarF.A(z3)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i & 196608) != 0) {
                    if ((i3 & 32) == 0) {
                        i16 = 65536;
                    } else {
                        i16 = 65536;
                    }
                    i4 |= i16;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    if ((i & 1572864) == 0) {
                        eVar2 = eVar;
                        if (dVarF.x(eVar2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                    if ((i & 12582912) != 0) {
                        i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (dVarF.A(z2)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i4 |= i12;
                    }
                    if ((i & 805306368) != 0) {
                        i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                    }
                    if ((i2 & 6) == 0) {
                        if (dVarF.T(function1)) {
                            i15 = 4;
                        } else {
                            i15 = 2;
                        }
                        i13 = i2 | i15;
                    } else {
                        i13 = i2;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 4) != 0) {
                                lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyGridStateG = lazyGridState2;
                            }
                            if (i5 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if ((i3 & 32) != 0) {
                                cVar = c.a;
                                if (z3) {
                                    nVarD = cVar.k();
                                } else {
                                    nVarD = cVar.d();
                                }
                                i4 &= -458753;
                            } else {
                                nVarD = nVar;
                            }
                            if (i9 != 0) {
                                eVarJ = c.a.j();
                            } else {
                                eVarJ = eVar2;
                            }
                            if ((i3 & 128) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i4 &= -29360129;
                            } else {
                                qg4VarA = qg4Var;
                            }
                            if (i11 == 0) {
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyGridState4 = lazyGridStateG;
                            rx8Var4 = rx8VarE;
                            nVar3 = nVarD;
                            qg4Var3 = qg4VarA;
                            z7 = z3;
                            z8 = z9;
                            i14 = -2072102870;
                        } else {
                            if (i17 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 4) != 0) {
                                lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyGridStateG = lazyGridState2;
                            }
                            if (i5 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if ((i3 & 32) != 0) {
                                cVar = c.a;
                                if (z3) {
                                    nVarD = cVar.k();
                                } else {
                                    nVarD = cVar.d();
                                }
                                i4 &= -458753;
                            } else {
                                nVarD = nVar;
                            }
                            if (i9 != 0) {
                                eVarJ = c.a.j();
                            } else {
                                eVarJ = eVar2;
                            }
                            if ((i3 & 128) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i4 &= -29360129;
                            } else {
                                qg4VarA = qg4Var;
                            }
                            if (i11 == 0) {
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyGridState4 = lazyGridStateG;
                            rx8Var4 = rx8VarE;
                            nVar3 = nVarD;
                            qg4Var3 = qg4VarA;
                            z7 = z3;
                            z8 = z9;
                            i14 = -2072102870;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(i14, i4, i13, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                        }
                        int i113 = i4 >> 3;
                        dVar2 = dVarF;
                        c.e eVar8 = eVarJ;
                        bq6.b(bVar4, lazyGridState4, g(m15Var, eVarJ, dVarF, (i4 & 14) | ((i4 >> 15) & 112)), rx8Var4, z7, true, qg4Var3, z8, zv8VarD, nVar3, eVar8, function1, dVar2, (i113 & 234881024) | (i113 & 14) | 196608 | (i113 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i113) | (29360128 & i113) | ((i4 << 12) & 1879048192), ((i4 >> 18) & 14) | ((i13 << 3) & 112), 0);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                        lazyGridState3 = lazyGridState4;
                        rx8Var3 = rx8Var4;
                        z6 = z7;
                        qg4Var2 = qg4Var3;
                        z5 = z8;
                        zv8Var2 = zv8VarD;
                        nVar2 = nVar3;
                        eVar3 = eVar8;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        nVar2 = nVar;
                        z5 = z2;
                        bVar3 = bVar2;
                        lazyGridState3 = lazyGridState2;
                        rx8Var3 = rx8Var2;
                        z6 = z3;
                        eVar3 = eVar2;
                        qg4Var2 = qg4Var;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.fp6
                            public final Object invoke(Object obj, Object obj2) {
                                return hp6.d(m15Var, bVar3, lazyGridState3, rx8Var3, z6, nVar2, eVar3, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 1572864;
                eVar2 = eVar;
                if ((i & 12582912) != 0) {
                    i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.A(z2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                if ((i & 805306368) != 0) {
                    i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                }
                if ((i2 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i13 = i2 | i15;
                } else {
                    i13 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyGridStateG = lazyGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 32) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i4 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i9 != 0) {
                            eVarJ = c.a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i11 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyGridState4 = lazyGridStateG;
                        rx8Var4 = rx8VarE;
                        nVar3 = nVarD;
                        qg4Var3 = qg4VarA;
                        z7 = z3;
                        z8 = z9;
                        i14 = -2072102870;
                    } else {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyGridStateG = lazyGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 32) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i4 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i9 != 0) {
                            eVarJ = c.a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i11 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyGridState4 = lazyGridStateG;
                        rx8Var4 = rx8VarE;
                        nVar3 = nVarD;
                        qg4Var3 = qg4VarA;
                        z7 = z3;
                        z8 = z9;
                        i14 = -2072102870;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i14, i4, i13, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                    }
                    int i114 = i4 >> 3;
                    dVar2 = dVarF;
                    c.e eVar9 = eVarJ;
                    bq6.b(bVar4, lazyGridState4, g(m15Var, eVarJ, dVarF, (i4 & 14) | ((i4 >> 15) & 112)), rx8Var4, z7, true, qg4Var3, z8, zv8VarD, nVar3, eVar9, function1, dVar2, (i114 & 234881024) | (i114 & 14) | 196608 | (i114 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i114) | (29360128 & i114) | ((i4 << 12) & 1879048192), ((i4 >> 18) & 14) | ((i13 << 3) & 112), 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    lazyGridState3 = lazyGridState4;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var2 = qg4Var3;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    nVar2 = nVar3;
                    eVar3 = eVar9;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    nVar2 = nVar;
                    z5 = z2;
                    bVar3 = bVar2;
                    lazyGridState3 = lazyGridState2;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar3 = eVar2;
                    qg4Var2 = qg4Var;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.fp6
                        public final Object invoke(Object obj, Object obj2) {
                            return hp6.d(m15Var, bVar3, lazyGridState3, rx8Var3, z6, nVar2, eVar3, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            z3 = z;
            if ((i & 196608) != 0) {
                if ((i3 & 32) == 0) {
                    i16 = 65536;
                } else {
                    i16 = 65536;
                }
                i4 |= i16;
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                if ((i & 1572864) == 0) {
                    eVar2 = eVar;
                    if (dVarF.x(eVar2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                if ((i & 12582912) != 0) {
                    i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.A(z2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                if ((i & 805306368) != 0) {
                    i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                }
                if ((i2 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i13 = i2 | i15;
                } else {
                    i13 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyGridStateG = lazyGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 32) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i4 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i9 != 0) {
                            eVarJ = c.a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i11 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyGridState4 = lazyGridStateG;
                        rx8Var4 = rx8VarE;
                        nVar3 = nVarD;
                        qg4Var3 = qg4VarA;
                        z7 = z3;
                        z8 = z9;
                        i14 = -2072102870;
                    } else {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyGridStateG = lazyGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 32) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i4 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i9 != 0) {
                            eVarJ = c.a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i11 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyGridState4 = lazyGridStateG;
                        rx8Var4 = rx8VarE;
                        nVar3 = nVarD;
                        qg4Var3 = qg4VarA;
                        z7 = z3;
                        z8 = z9;
                        i14 = -2072102870;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i14, i4, i13, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                    }
                    int i115 = i4 >> 3;
                    dVar2 = dVarF;
                    c.e eVar10 = eVarJ;
                    bq6.b(bVar4, lazyGridState4, g(m15Var, eVarJ, dVarF, (i4 & 14) | ((i4 >> 15) & 112)), rx8Var4, z7, true, qg4Var3, z8, zv8VarD, nVar3, eVar10, function1, dVar2, (i115 & 234881024) | (i115 & 14) | 196608 | (i115 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i115) | (29360128 & i115) | ((i4 << 12) & 1879048192), ((i4 >> 18) & 14) | ((i13 << 3) & 112), 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    lazyGridState3 = lazyGridState4;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var2 = qg4Var3;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    nVar2 = nVar3;
                    eVar3 = eVar10;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    nVar2 = nVar;
                    z5 = z2;
                    bVar3 = bVar2;
                    lazyGridState3 = lazyGridState2;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar3 = eVar2;
                    qg4Var2 = qg4Var;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.fp6
                        public final Object invoke(Object obj, Object obj2) {
                            return hp6.d(m15Var, bVar3, lazyGridState3, rx8Var3, z6, nVar2, eVar3, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 1572864;
            eVar2 = eVar;
            if ((i & 12582912) != 0) {
                i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
            }
            i11 = i3 & 256;
            if (i11 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.A(z2)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i4 |= i12;
            }
            if ((i & 805306368) != 0) {
                i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                if (dVarF.T(function1)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i13 = i2 | i15;
            } else {
                i13 = i2;
            }
            if ((i4 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (dVarF.g(z4, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                        i4 &= -897;
                    } else {
                        lazyGridStateG = lazyGridState2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 32) != 0) {
                        cVar = c.a;
                        if (z3) {
                            nVarD = cVar.k();
                        } else {
                            nVarD = cVar.d();
                        }
                        i4 &= -458753;
                    } else {
                        nVarD = nVar;
                    }
                    if (i9 != 0) {
                        eVarJ = c.a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if ((i3 & 128) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        qg4VarA = qg4Var;
                    }
                    if (i11 == 0) {
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyGridState4 = lazyGridStateG;
                    rx8Var4 = rx8VarE;
                    nVar3 = nVarD;
                    qg4Var3 = qg4VarA;
                    z7 = z3;
                    z8 = z9;
                    i14 = -2072102870;
                } else {
                    if (i17 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                        i4 &= -897;
                    } else {
                        lazyGridStateG = lazyGridState2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 32) != 0) {
                        cVar = c.a;
                        if (z3) {
                            nVarD = cVar.k();
                        } else {
                            nVarD = cVar.d();
                        }
                        i4 &= -458753;
                    } else {
                        nVarD = nVar;
                    }
                    if (i9 != 0) {
                        eVarJ = c.a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if ((i3 & 128) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        qg4VarA = qg4Var;
                    }
                    if (i11 == 0) {
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyGridState4 = lazyGridStateG;
                    rx8Var4 = rx8VarE;
                    nVar3 = nVarD;
                    qg4Var3 = qg4VarA;
                    z7 = z3;
                    z8 = z9;
                    i14 = -2072102870;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(i14, i4, i13, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                }
                int i116 = i4 >> 3;
                dVar2 = dVarF;
                c.e eVar11 = eVarJ;
                bq6.b(bVar4, lazyGridState4, g(m15Var, eVarJ, dVarF, (i4 & 14) | ((i4 >> 15) & 112)), rx8Var4, z7, true, qg4Var3, z8, zv8VarD, nVar3, eVar11, function1, dVar2, (i116 & 234881024) | (i116 & 14) | 196608 | (i116 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i116) | (29360128 & i116) | ((i4 << 12) & 1879048192), ((i4 >> 18) & 14) | ((i13 << 3) & 112), 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
                lazyGridState3 = lazyGridState4;
                rx8Var3 = rx8Var4;
                z6 = z7;
                qg4Var2 = qg4Var3;
                z5 = z8;
                zv8Var2 = zv8VarD;
                nVar2 = nVar3;
                eVar3 = eVar11;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                nVar2 = nVar;
                z5 = z2;
                bVar3 = bVar2;
                lazyGridState3 = lazyGridState2;
                rx8Var3 = rx8Var2;
                z6 = z3;
                eVar3 = eVar2;
                qg4Var2 = qg4Var;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.fp6
                    public final Object invoke(Object obj, Object obj2) {
                        return hp6.d(m15Var, bVar3, lazyGridState3, rx8Var3, z6, nVar2, eVar3, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 48;
        bVar2 = bVar;
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                lazyGridState2 = lazyGridState;
                if (dVarF.x(lazyGridState2)) {
                }
                i4 |= i18;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i4 |= i18;
        } else {
            lazyGridState2 = lazyGridState;
        }
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                rx8Var2 = rx8Var;
                if (dVarF.x(rx8Var2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    z3 = z;
                    if (dVarF.A(z3)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i & 196608) != 0) {
                    if ((i3 & 32) == 0) {
                        i16 = 65536;
                    } else {
                        i16 = 65536;
                    }
                    i4 |= i16;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    if ((i & 1572864) == 0) {
                        eVar2 = eVar;
                        if (dVarF.x(eVar2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                    if ((i & 12582912) != 0) {
                        i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (dVarF.A(z2)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i4 |= i12;
                    }
                    if ((i & 805306368) != 0) {
                        i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                    }
                    if ((i2 & 6) == 0) {
                        if (dVarF.T(function1)) {
                            i15 = 4;
                        } else {
                            i15 = 2;
                        }
                        i13 = i2 | i15;
                    } else {
                        i13 = i2;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 4) != 0) {
                                lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyGridStateG = lazyGridState2;
                            }
                            if (i5 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if ((i3 & 32) != 0) {
                                cVar = c.a;
                                if (z3) {
                                    nVarD = cVar.k();
                                } else {
                                    nVarD = cVar.d();
                                }
                                i4 &= -458753;
                            } else {
                                nVarD = nVar;
                            }
                            if (i9 != 0) {
                                eVarJ = c.a.j();
                            } else {
                                eVarJ = eVar2;
                            }
                            if ((i3 & 128) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i4 &= -29360129;
                            } else {
                                qg4VarA = qg4Var;
                            }
                            if (i11 == 0) {
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyGridState4 = lazyGridStateG;
                            rx8Var4 = rx8VarE;
                            nVar3 = nVarD;
                            qg4Var3 = qg4VarA;
                            z7 = z3;
                            z8 = z9;
                            i14 = -2072102870;
                        } else {
                            if (i17 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 4) != 0) {
                                lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyGridStateG = lazyGridState2;
                            }
                            if (i5 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if ((i3 & 32) != 0) {
                                cVar = c.a;
                                if (z3) {
                                    nVarD = cVar.k();
                                } else {
                                    nVarD = cVar.d();
                                }
                                i4 &= -458753;
                            } else {
                                nVarD = nVar;
                            }
                            if (i9 != 0) {
                                eVarJ = c.a.j();
                            } else {
                                eVarJ = eVar2;
                            }
                            if ((i3 & 128) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i4 &= -29360129;
                            } else {
                                qg4VarA = qg4Var;
                            }
                            if (i11 == 0) {
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyGridState4 = lazyGridStateG;
                            rx8Var4 = rx8VarE;
                            nVar3 = nVarD;
                            qg4Var3 = qg4VarA;
                            z7 = z3;
                            z8 = z9;
                            i14 = -2072102870;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(i14, i4, i13, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                        }
                        int i117 = i4 >> 3;
                        dVar2 = dVarF;
                        c.e eVar12 = eVarJ;
                        bq6.b(bVar4, lazyGridState4, g(m15Var, eVarJ, dVarF, (i4 & 14) | ((i4 >> 15) & 112)), rx8Var4, z7, true, qg4Var3, z8, zv8VarD, nVar3, eVar12, function1, dVar2, (i117 & 234881024) | (i117 & 14) | 196608 | (i117 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i117) | (29360128 & i117) | ((i4 << 12) & 1879048192), ((i4 >> 18) & 14) | ((i13 << 3) & 112), 0);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                        lazyGridState3 = lazyGridState4;
                        rx8Var3 = rx8Var4;
                        z6 = z7;
                        qg4Var2 = qg4Var3;
                        z5 = z8;
                        zv8Var2 = zv8VarD;
                        nVar2 = nVar3;
                        eVar3 = eVar12;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        nVar2 = nVar;
                        z5 = z2;
                        bVar3 = bVar2;
                        lazyGridState3 = lazyGridState2;
                        rx8Var3 = rx8Var2;
                        z6 = z3;
                        eVar3 = eVar2;
                        qg4Var2 = qg4Var;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.fp6
                            public final Object invoke(Object obj, Object obj2) {
                                return hp6.d(m15Var, bVar3, lazyGridState3, rx8Var3, z6, nVar2, eVar3, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 1572864;
                eVar2 = eVar;
                if ((i & 12582912) != 0) {
                    i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.A(z2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                if ((i & 805306368) != 0) {
                    i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                }
                if ((i2 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i13 = i2 | i15;
                } else {
                    i13 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyGridStateG = lazyGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 32) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i4 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i9 != 0) {
                            eVarJ = c.a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i11 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyGridState4 = lazyGridStateG;
                        rx8Var4 = rx8VarE;
                        nVar3 = nVarD;
                        qg4Var3 = qg4VarA;
                        z7 = z3;
                        z8 = z9;
                        i14 = -2072102870;
                    } else {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyGridStateG = lazyGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 32) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i4 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i9 != 0) {
                            eVarJ = c.a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i11 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyGridState4 = lazyGridStateG;
                        rx8Var4 = rx8VarE;
                        nVar3 = nVarD;
                        qg4Var3 = qg4VarA;
                        z7 = z3;
                        z8 = z9;
                        i14 = -2072102870;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i14, i4, i13, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                    }
                    int i118 = i4 >> 3;
                    dVar2 = dVarF;
                    c.e eVar13 = eVarJ;
                    bq6.b(bVar4, lazyGridState4, g(m15Var, eVarJ, dVarF, (i4 & 14) | ((i4 >> 15) & 112)), rx8Var4, z7, true, qg4Var3, z8, zv8VarD, nVar3, eVar13, function1, dVar2, (i118 & 234881024) | (i118 & 14) | 196608 | (i118 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i118) | (29360128 & i118) | ((i4 << 12) & 1879048192), ((i4 >> 18) & 14) | ((i13 << 3) & 112), 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    lazyGridState3 = lazyGridState4;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var2 = qg4Var3;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    nVar2 = nVar3;
                    eVar3 = eVar13;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    nVar2 = nVar;
                    z5 = z2;
                    bVar3 = bVar2;
                    lazyGridState3 = lazyGridState2;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar3 = eVar2;
                    qg4Var2 = qg4Var;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.fp6
                        public final Object invoke(Object obj, Object obj2) {
                            return hp6.d(m15Var, bVar3, lazyGridState3, rx8Var3, z6, nVar2, eVar3, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            z3 = z;
            if ((i & 196608) != 0) {
                if ((i3 & 32) == 0) {
                    i16 = 65536;
                } else {
                    i16 = 65536;
                }
                i4 |= i16;
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                if ((i & 1572864) == 0) {
                    eVar2 = eVar;
                    if (dVarF.x(eVar2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                if ((i & 12582912) != 0) {
                    i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.A(z2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                if ((i & 805306368) != 0) {
                    i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                }
                if ((i2 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i13 = i2 | i15;
                } else {
                    i13 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyGridStateG = lazyGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 32) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i4 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i9 != 0) {
                            eVarJ = c.a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i11 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyGridState4 = lazyGridStateG;
                        rx8Var4 = rx8VarE;
                        nVar3 = nVarD;
                        qg4Var3 = qg4VarA;
                        z7 = z3;
                        z8 = z9;
                        i14 = -2072102870;
                    } else {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyGridStateG = lazyGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 32) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i4 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i9 != 0) {
                            eVarJ = c.a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i11 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyGridState4 = lazyGridStateG;
                        rx8Var4 = rx8VarE;
                        nVar3 = nVarD;
                        qg4Var3 = qg4VarA;
                        z7 = z3;
                        z8 = z9;
                        i14 = -2072102870;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i14, i4, i13, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                    }
                    int i119 = i4 >> 3;
                    dVar2 = dVarF;
                    c.e eVar14 = eVarJ;
                    bq6.b(bVar4, lazyGridState4, g(m15Var, eVarJ, dVarF, (i4 & 14) | ((i4 >> 15) & 112)), rx8Var4, z7, true, qg4Var3, z8, zv8VarD, nVar3, eVar14, function1, dVar2, (i119 & 234881024) | (i119 & 14) | 196608 | (i119 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i119) | (29360128 & i119) | ((i4 << 12) & 1879048192), ((i4 >> 18) & 14) | ((i13 << 3) & 112), 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    lazyGridState3 = lazyGridState4;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var2 = qg4Var3;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    nVar2 = nVar3;
                    eVar3 = eVar14;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    nVar2 = nVar;
                    z5 = z2;
                    bVar3 = bVar2;
                    lazyGridState3 = lazyGridState2;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar3 = eVar2;
                    qg4Var2 = qg4Var;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.fp6
                        public final Object invoke(Object obj, Object obj2) {
                            return hp6.d(m15Var, bVar3, lazyGridState3, rx8Var3, z6, nVar2, eVar3, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 1572864;
            eVar2 = eVar;
            if ((i & 12582912) != 0) {
                i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
            }
            i11 = i3 & 256;
            if (i11 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.A(z2)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i4 |= i12;
            }
            if ((i & 805306368) != 0) {
                i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                if (dVarF.T(function1)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i13 = i2 | i15;
            } else {
                i13 = i2;
            }
            if ((i4 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (dVarF.g(z4, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                        i4 &= -897;
                    } else {
                        lazyGridStateG = lazyGridState2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 32) != 0) {
                        cVar = c.a;
                        if (z3) {
                            nVarD = cVar.k();
                        } else {
                            nVarD = cVar.d();
                        }
                        i4 &= -458753;
                    } else {
                        nVarD = nVar;
                    }
                    if (i9 != 0) {
                        eVarJ = c.a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if ((i3 & 128) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        qg4VarA = qg4Var;
                    }
                    if (i11 == 0) {
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyGridState4 = lazyGridStateG;
                    rx8Var4 = rx8VarE;
                    nVar3 = nVarD;
                    qg4Var3 = qg4VarA;
                    z7 = z3;
                    z8 = z9;
                    i14 = -2072102870;
                } else {
                    if (i17 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                        i4 &= -897;
                    } else {
                        lazyGridStateG = lazyGridState2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 32) != 0) {
                        cVar = c.a;
                        if (z3) {
                            nVarD = cVar.k();
                        } else {
                            nVarD = cVar.d();
                        }
                        i4 &= -458753;
                    } else {
                        nVarD = nVar;
                    }
                    if (i9 != 0) {
                        eVarJ = c.a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if ((i3 & 128) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        qg4VarA = qg4Var;
                    }
                    if (i11 == 0) {
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyGridState4 = lazyGridStateG;
                    rx8Var4 = rx8VarE;
                    nVar3 = nVarD;
                    qg4Var3 = qg4VarA;
                    z7 = z3;
                    z8 = z9;
                    i14 = -2072102870;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(i14, i4, i13, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                }
                int i1110 = i4 >> 3;
                dVar2 = dVarF;
                c.e eVar15 = eVarJ;
                bq6.b(bVar4, lazyGridState4, g(m15Var, eVarJ, dVarF, (i4 & 14) | ((i4 >> 15) & 112)), rx8Var4, z7, true, qg4Var3, z8, zv8VarD, nVar3, eVar15, function1, dVar2, (i1110 & 234881024) | (i1110 & 14) | 196608 | (i1110 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i1110) | (29360128 & i1110) | ((i4 << 12) & 1879048192), ((i4 >> 18) & 14) | ((i13 << 3) & 112), 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
                lazyGridState3 = lazyGridState4;
                rx8Var3 = rx8Var4;
                z6 = z7;
                qg4Var2 = qg4Var3;
                z5 = z8;
                zv8Var2 = zv8VarD;
                nVar2 = nVar3;
                eVar3 = eVar15;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                nVar2 = nVar;
                z5 = z2;
                bVar3 = bVar2;
                lazyGridState3 = lazyGridState2;
                rx8Var3 = rx8Var2;
                z6 = z3;
                eVar3 = eVar2;
                qg4Var2 = qg4Var;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.fp6
                    public final Object invoke(Object obj, Object obj2) {
                        return hp6.d(m15Var, bVar3, lazyGridState3, rx8Var3, z6, nVar2, eVar3, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 3072;
        rx8Var2 = rx8Var;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((i & 24576) == 0) {
                z3 = z;
                if (dVarF.A(z3)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((i & 196608) != 0) {
                if ((i3 & 32) == 0) {
                    i16 = 65536;
                } else {
                    i16 = 65536;
                }
                i4 |= i16;
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                if ((i & 1572864) == 0) {
                    eVar2 = eVar;
                    if (dVarF.x(eVar2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                if ((i & 12582912) != 0) {
                    i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.A(z2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                if ((i & 805306368) != 0) {
                    i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                }
                if ((i2 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i13 = i2 | i15;
                } else {
                    i13 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyGridStateG = lazyGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 32) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i4 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i9 != 0) {
                            eVarJ = c.a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i11 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyGridState4 = lazyGridStateG;
                        rx8Var4 = rx8VarE;
                        nVar3 = nVarD;
                        qg4Var3 = qg4VarA;
                        z7 = z3;
                        z8 = z9;
                        i14 = -2072102870;
                    } else {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyGridStateG = lazyGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 32) != 0) {
                            cVar = c.a;
                            if (z3) {
                                nVarD = cVar.k();
                            } else {
                                nVarD = cVar.d();
                            }
                            i4 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i9 != 0) {
                            eVarJ = c.a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i11 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyGridState4 = lazyGridStateG;
                        rx8Var4 = rx8VarE;
                        nVar3 = nVarD;
                        qg4Var3 = qg4VarA;
                        z7 = z3;
                        z8 = z9;
                        i14 = -2072102870;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(i14, i4, i13, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                    }
                    int i1111 = i4 >> 3;
                    dVar2 = dVarF;
                    c.e eVar16 = eVarJ;
                    bq6.b(bVar4, lazyGridState4, g(m15Var, eVarJ, dVarF, (i4 & 14) | ((i4 >> 15) & 112)), rx8Var4, z7, true, qg4Var3, z8, zv8VarD, nVar3, eVar16, function1, dVar2, (i1111 & 234881024) | (i1111 & 14) | 196608 | (i1111 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i1111) | (29360128 & i1111) | ((i4 << 12) & 1879048192), ((i4 >> 18) & 14) | ((i13 << 3) & 112), 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    lazyGridState3 = lazyGridState4;
                    rx8Var3 = rx8Var4;
                    z6 = z7;
                    qg4Var2 = qg4Var3;
                    z5 = z8;
                    zv8Var2 = zv8VarD;
                    nVar2 = nVar3;
                    eVar3 = eVar16;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    nVar2 = nVar;
                    z5 = z2;
                    bVar3 = bVar2;
                    lazyGridState3 = lazyGridState2;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar3 = eVar2;
                    qg4Var2 = qg4Var;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.fp6
                        public final Object invoke(Object obj, Object obj2) {
                            return hp6.d(m15Var, bVar3, lazyGridState3, rx8Var3, z6, nVar2, eVar3, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 1572864;
            eVar2 = eVar;
            if ((i & 12582912) != 0) {
                i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
            }
            i11 = i3 & 256;
            if (i11 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.A(z2)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i4 |= i12;
            }
            if ((i & 805306368) != 0) {
                i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                if (dVarF.T(function1)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i13 = i2 | i15;
            } else {
                i13 = i2;
            }
            if ((i4 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (dVarF.g(z4, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                        i4 &= -897;
                    } else {
                        lazyGridStateG = lazyGridState2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 32) != 0) {
                        cVar = c.a;
                        if (z3) {
                            nVarD = cVar.k();
                        } else {
                            nVarD = cVar.d();
                        }
                        i4 &= -458753;
                    } else {
                        nVarD = nVar;
                    }
                    if (i9 != 0) {
                        eVarJ = c.a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if ((i3 & 128) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        qg4VarA = qg4Var;
                    }
                    if (i11 == 0) {
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyGridState4 = lazyGridStateG;
                    rx8Var4 = rx8VarE;
                    nVar3 = nVarD;
                    qg4Var3 = qg4VarA;
                    z7 = z3;
                    z8 = z9;
                    i14 = -2072102870;
                } else {
                    if (i17 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                        i4 &= -897;
                    } else {
                        lazyGridStateG = lazyGridState2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 32) != 0) {
                        cVar = c.a;
                        if (z3) {
                            nVarD = cVar.k();
                        } else {
                            nVarD = cVar.d();
                        }
                        i4 &= -458753;
                    } else {
                        nVarD = nVar;
                    }
                    if (i9 != 0) {
                        eVarJ = c.a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if ((i3 & 128) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        qg4VarA = qg4Var;
                    }
                    if (i11 == 0) {
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyGridState4 = lazyGridStateG;
                    rx8Var4 = rx8VarE;
                    nVar3 = nVarD;
                    qg4Var3 = qg4VarA;
                    z7 = z3;
                    z8 = z9;
                    i14 = -2072102870;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(i14, i4, i13, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                }
                int i1112 = i4 >> 3;
                dVar2 = dVarF;
                c.e eVar17 = eVarJ;
                bq6.b(bVar4, lazyGridState4, g(m15Var, eVarJ, dVarF, (i4 & 14) | ((i4 >> 15) & 112)), rx8Var4, z7, true, qg4Var3, z8, zv8VarD, nVar3, eVar17, function1, dVar2, (i1112 & 234881024) | (i1112 & 14) | 196608 | (i1112 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i1112) | (29360128 & i1112) | ((i4 << 12) & 1879048192), ((i4 >> 18) & 14) | ((i13 << 3) & 112), 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
                lazyGridState3 = lazyGridState4;
                rx8Var3 = rx8Var4;
                z6 = z7;
                qg4Var2 = qg4Var3;
                z5 = z8;
                zv8Var2 = zv8VarD;
                nVar2 = nVar3;
                eVar3 = eVar17;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                nVar2 = nVar;
                z5 = z2;
                bVar3 = bVar2;
                lazyGridState3 = lazyGridState2;
                rx8Var3 = rx8Var2;
                z6 = z3;
                eVar3 = eVar2;
                qg4Var2 = qg4Var;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.fp6
                    public final Object invoke(Object obj, Object obj2) {
                        return hp6.d(m15Var, bVar3, lazyGridState3, rx8Var3, z6, nVar2, eVar3, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 24576;
        z3 = z;
        if ((i & 196608) != 0) {
            if ((i3 & 32) == 0) {
                i16 = 65536;
            } else {
                i16 = 65536;
            }
            i4 |= i16;
        }
        i9 = i3 & 64;
        if (i9 != 0) {
            if ((i & 1572864) == 0) {
                eVar2 = eVar;
                if (dVarF.x(eVar2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
            if ((i & 12582912) != 0) {
                i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
            }
            i11 = i3 & 256;
            if (i11 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.A(z2)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i4 |= i12;
            }
            if ((i & 805306368) != 0) {
                i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                if (dVarF.T(function1)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i13 = i2 | i15;
            } else {
                i13 = i2;
            }
            if ((i4 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (dVarF.g(z4, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                        i4 &= -897;
                    } else {
                        lazyGridStateG = lazyGridState2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 32) != 0) {
                        cVar = c.a;
                        if (z3) {
                            nVarD = cVar.k();
                        } else {
                            nVarD = cVar.d();
                        }
                        i4 &= -458753;
                    } else {
                        nVarD = nVar;
                    }
                    if (i9 != 0) {
                        eVarJ = c.a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if ((i3 & 128) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        qg4VarA = qg4Var;
                    }
                    if (i11 == 0) {
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyGridState4 = lazyGridStateG;
                    rx8Var4 = rx8VarE;
                    nVar3 = nVarD;
                    qg4Var3 = qg4VarA;
                    z7 = z3;
                    z8 = z9;
                    i14 = -2072102870;
                } else {
                    if (i17 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                        i4 &= -897;
                    } else {
                        lazyGridStateG = lazyGridState2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 32) != 0) {
                        cVar = c.a;
                        if (z3) {
                            nVarD = cVar.k();
                        } else {
                            nVarD = cVar.d();
                        }
                        i4 &= -458753;
                    } else {
                        nVarD = nVar;
                    }
                    if (i9 != 0) {
                        eVarJ = c.a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if ((i3 & 128) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        qg4VarA = qg4Var;
                    }
                    if (i11 == 0) {
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyGridState4 = lazyGridStateG;
                    rx8Var4 = rx8VarE;
                    nVar3 = nVarD;
                    qg4Var3 = qg4VarA;
                    z7 = z3;
                    z8 = z9;
                    i14 = -2072102870;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(i14, i4, i13, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                }
                int i1113 = i4 >> 3;
                dVar2 = dVarF;
                c.e eVar18 = eVarJ;
                bq6.b(bVar4, lazyGridState4, g(m15Var, eVarJ, dVarF, (i4 & 14) | ((i4 >> 15) & 112)), rx8Var4, z7, true, qg4Var3, z8, zv8VarD, nVar3, eVar18, function1, dVar2, (i1113 & 234881024) | (i1113 & 14) | 196608 | (i1113 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i1113) | (29360128 & i1113) | ((i4 << 12) & 1879048192), ((i4 >> 18) & 14) | ((i13 << 3) & 112), 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
                lazyGridState3 = lazyGridState4;
                rx8Var3 = rx8Var4;
                z6 = z7;
                qg4Var2 = qg4Var3;
                z5 = z8;
                zv8Var2 = zv8VarD;
                nVar2 = nVar3;
                eVar3 = eVar18;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                nVar2 = nVar;
                z5 = z2;
                bVar3 = bVar2;
                lazyGridState3 = lazyGridState2;
                rx8Var3 = rx8Var2;
                z6 = z3;
                eVar3 = eVar2;
                qg4Var2 = qg4Var;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.fp6
                    public final Object invoke(Object obj, Object obj2) {
                        return hp6.d(m15Var, bVar3, lazyGridState3, rx8Var3, z6, nVar2, eVar3, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 1572864;
        eVar2 = eVar;
        if ((i & 12582912) != 0) {
            i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
        }
        i11 = i3 & 256;
        if (i11 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (dVarF.A(z2)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i4 |= i12;
        }
        if ((i & 805306368) != 0) {
            i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            if (dVarF.T(function1)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i13 = i2 | i15;
        } else {
            i13 = i2;
        }
        if ((i4 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (dVarF.g(z4, i4 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i17 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i3 & 4) != 0) {
                    lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                    i4 &= -897;
                } else {
                    lazyGridStateG = lazyGridState2;
                }
                if (i5 != 0) {
                    rx8VarE = nx8.e(ff3.i(0));
                } else {
                    rx8VarE = rx8Var2;
                }
                if (i7 != 0) {
                    z3 = false;
                }
                if ((i3 & 32) != 0) {
                    cVar = c.a;
                    if (z3) {
                        nVarD = cVar.k();
                    } else {
                        nVarD = cVar.d();
                    }
                    i4 &= -458753;
                } else {
                    nVarD = nVar;
                }
                if (i9 != 0) {
                    eVarJ = c.a.j();
                } else {
                    eVarJ = eVar2;
                }
                if ((i3 & 128) != 0) {
                    qg4VarA = cab.a.a(dVarF, 6);
                    i4 &= -29360129;
                } else {
                    qg4VarA = qg4Var;
                }
                if (i11 == 0) {
                }
                if ((i3 & 512) != 0) {
                    i4 &= -1879048193;
                    zv8VarD = cw8.d(dVarF, 0);
                } else {
                    zv8VarD = zv8Var;
                }
                lazyGridState4 = lazyGridStateG;
                rx8Var4 = rx8VarE;
                nVar3 = nVarD;
                qg4Var3 = qg4VarA;
                z7 = z3;
                z8 = z9;
                i14 = -2072102870;
            } else {
                if (i17 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i3 & 4) != 0) {
                    lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(0, 0, dVarF, 0, 3);
                    i4 &= -897;
                } else {
                    lazyGridStateG = lazyGridState2;
                }
                if (i5 != 0) {
                    rx8VarE = nx8.e(ff3.i(0));
                } else {
                    rx8VarE = rx8Var2;
                }
                if (i7 != 0) {
                    z3 = false;
                }
                if ((i3 & 32) != 0) {
                    cVar = c.a;
                    if (z3) {
                        nVarD = cVar.k();
                    } else {
                        nVarD = cVar.d();
                    }
                    i4 &= -458753;
                } else {
                    nVarD = nVar;
                }
                if (i9 != 0) {
                    eVarJ = c.a.j();
                } else {
                    eVarJ = eVar2;
                }
                if ((i3 & 128) != 0) {
                    qg4VarA = cab.a.a(dVarF, 6);
                    i4 &= -29360129;
                } else {
                    qg4VarA = qg4Var;
                }
                if (i11 == 0) {
                }
                if ((i3 & 512) != 0) {
                    i4 &= -1879048193;
                    zv8VarD = cw8.d(dVarF, 0);
                } else {
                    zv8VarD = zv8Var;
                }
                lazyGridState4 = lazyGridStateG;
                rx8Var4 = rx8VarE;
                nVar3 = nVarD;
                qg4Var3 = qg4VarA;
                z7 = z3;
                z8 = z9;
                i14 = -2072102870;
            }
            dVarF.M();
            if (e.k()) {
                e.o(i14, i4, i13, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
            }
            int i1114 = i4 >> 3;
            dVar2 = dVarF;
            c.e eVar19 = eVarJ;
            bq6.b(bVar4, lazyGridState4, g(m15Var, eVarJ, dVarF, (i4 & 14) | ((i4 >> 15) & 112)), rx8Var4, z7, true, qg4Var3, z8, zv8VarD, nVar3, eVar19, function1, dVar2, (i1114 & 234881024) | (i1114 & 14) | 196608 | (i1114 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i1114) | (29360128 & i1114) | ((i4 << 12) & 1879048192), ((i4 >> 18) & 14) | ((i13 << 3) & 112), 0);
            if (e.k()) {
                e.n();
            }
            bVar3 = bVar4;
            lazyGridState3 = lazyGridState4;
            rx8Var3 = rx8Var4;
            z6 = z7;
            qg4Var2 = qg4Var3;
            z5 = z8;
            zv8Var2 = zv8VarD;
            nVar2 = nVar3;
            eVar3 = eVar19;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            nVar2 = nVar;
            z5 = z2;
            bVar3 = bVar2;
            lazyGridState3 = lazyGridState2;
            rx8Var3 = rx8Var2;
            z6 = z3;
            eVar3 = eVar2;
            qg4Var2 = qg4Var;
            zv8Var2 = zv8Var;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.fp6
                public final Object invoke(Object obj, Object obj2) {
                    return hp6.d(m15Var, bVar3, lazyGridState3, rx8Var3, z6, nVar2, eVar3, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(m15 m15Var, b bVar, LazyGridState lazyGridState, rx8 rx8Var, boolean z, c.n nVar, c.e eVar, qg4 qg4Var, boolean z2, zv8 zv8Var, Function1 function1, int i, int i2, int i3, d dVar, int i4) {
        c(m15Var, bVar, lazyGridState, rx8Var, z, nVar, eVar, qg4Var, z2, zv8Var, function1, dVar, saa.a(i | 1), saa.a(i2), i3);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> f(int i, int i2, int i3) {
        int i4 = i - (i3 * (i2 - 1));
        int i5 = i4 / i2;
        int i6 = i4 % i2;
        ArrayList arrayList = new ArrayList(i2);
        int i7 = 0;
        while (i7 < i2) {
            arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
        }
        return arrayList;
    }

    private static final vq6 g(final m15 m15Var, final c.e eVar, d dVar, int i) {
        if (e.k()) {
            e.o(-76500289, i, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:221)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && dVar.x(m15Var)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && dVar.x(eVar)) || (i & 48) == 32);
        Object objR = dVar.R();
        if (z || objR == d.INSTANCE.a()) {
            objR = new s15(new Function2() { // from class: com.google.android.gp6
                public final Object invoke(Object obj, Object obj2) {
                    return hp6.h(m15Var, eVar, (f43) obj, (kx1) obj2);
                }
            });
            dVar.L(objR);
        }
        vq6 vq6Var = (vq6) objR;
        if (e.k()) {
            e.n();
        }
        return vq6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uq6 h(m15 m15Var, c.e eVar, f43 f43Var, kx1 kx1Var) {
        if (!(kx1.l(kx1Var.getValue()) != Integer.MAX_VALUE)) {
            cx5.a("LazyVerticalGrid's width should be bound by parent.");
        }
        int iL = kx1.l(kx1Var.getValue());
        int[] iArrX1 = m.x1(m15Var.a(f43Var, iL, f43Var.O1(eVar.getSpacing())));
        int[] iArr = new int[iArrX1.length];
        eVar.a(f43Var, iL, iArrX1, LayoutDirection.Ltr, iArr);
        return new uq6(iArrX1, iArr);
    }
}
