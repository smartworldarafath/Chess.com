package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.layout.c;
import androidx.compose.p001foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.b;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/google/android/v4c;", "columns", "Landroidx/compose/ui/b;", "modifier", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Lcom/google/android/rx8;", "contentPadding", "", "reverseLayout", "Lcom/google/android/ff3;", "verticalItemSpacing", "Landroidx/compose/foundation/layout/c$e;", "horizontalArrangement", "Lcom/google/android/qg4;", "flingBehavior", "userScrollEnabled", "Lcom/google/android/zv8;", "overscrollEffect", "Lkotlin/Function1;", "Lcom/google/android/wy6;", "", "content", "c", "(Lcom/google/android/v4c;Landroidx/compose/ui/b;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lcom/google/android/rx8;ZFLandroidx/compose/foundation/layout/c$e;Lcom/google/android/qg4;ZLcom/google/android/zv8;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;III)V", "Lcom/google/android/zq6;", "e", "(Lcom/google/android/v4c;Landroidx/compose/foundation/layout/c$e;Lcom/google/android/rx8;Landroidx/compose/runtime/d;I)Lcom/google/android/zq6;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class yx6 {
    /* JADX WARN: Code duplicated, block: B:100:0x0111  */
    /* JADX WARN: Code duplicated, block: B:103:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x0123  */
    /* JADX WARN: Code duplicated, block: B:109:0x012b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0131  */
    /* JADX WARN: Code duplicated, block: B:112:0x0134  */
    /* JADX WARN: Code duplicated, block: B:114:0x013b  */
    /* JADX WARN: Code duplicated, block: B:117:0x014c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0154  */
    /* JADX WARN: Code duplicated, block: B:124:0x015e  */
    /* JADX WARN: Code duplicated, block: B:126:0x016c  */
    /* JADX WARN: Code duplicated, block: B:139:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x019c  */
    /* JADX WARN: Code duplicated, block: B:141:0x019f  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:150:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:152:0x01be  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:159:0x01da  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:166:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:168:0x0203  */
    /* JADX WARN: Code duplicated, block: B:171:0x0211  */
    /* JADX WARN: Code duplicated, block: B:174:0x026c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0280  */
    /* JADX WARN: Code duplicated, block: B:179:0x0299  */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:93:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x0103  */
    /* JADX WARN: Code duplicated, block: B:98:0x010d  */
    public static final void c(final v4c v4cVar, b bVar, LazyStaggeredGridState lazyStaggeredGridState, rx8 rx8Var, boolean z, float f, c.e eVar, qg4 qg4Var, boolean z2, zv8 zv8Var, final Function1<? super wy6, Unit> function1, d dVar, final int i, final int i2, final int i3) {
        int i4;
        b bVar2;
        LazyStaggeredGridState lazyStaggeredGridState2;
        int i5;
        rx8 rx8Var2;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z4;
        d dVar2;
        final float f2;
        final boolean z5;
        final b bVar3;
        final LazyStaggeredGridState lazyStaggeredGridState3;
        final rx8 rx8Var3;
        final boolean z6;
        final c.e eVar2;
        final qg4 qg4Var2;
        final zv8 zv8Var2;
        s6b s6bVarH;
        b bVar4;
        LazyStaggeredGridState lazyStaggeredGridStateB;
        rx8 rx8VarE;
        float fI;
        c.e eVarR;
        qg4 qg4VarA;
        zv8 zv8VarD;
        LazyStaggeredGridState lazyStaggeredGridState4;
        float f3;
        qg4 qg4Var3;
        boolean z7;
        boolean z8;
        int i16;
        d dVarF = dVar.F(-578931208);
        if ((i & 6) == 0) {
            i4 = (dVarF.x(v4cVar) ? 4 : 2) | i;
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
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                    int i18 = dVarF.x(lazyStaggeredGridState2) ? 256 : 128;
                    i4 |= i18;
                } else {
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                }
                i4 |= i18;
            } else {
                lazyStaggeredGridState2 = lazyStaggeredGridState;
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
                    i9 = i3 & 32;
                    if (i9 != 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (dVarF.B(f)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 64;
                    if (i11 != 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (dVarF.x(eVar)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i4 |= i12;
                    }
                    if ((i & 12582912) != 0) {
                        i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
                    }
                    i13 = i3 & 256;
                    if (i13 != 0) {
                        if ((i & 100663296) == 0) {
                            if (dVarF.A(z2)) {
                                i14 = 67108864;
                            } else {
                                i14 = 33554432;
                            }
                            i4 |= i14;
                        }
                        if ((i & 805306368) != 0) {
                            i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                        }
                        if ((i2 & 6) == 0) {
                            if (dVarF.T(function1)) {
                                i16 = 4;
                            } else {
                                i16 = 2;
                            }
                            i15 = i2 | i16;
                        } else {
                            i15 = i2;
                        }
                        if ((i4 & 306783379) == 306783378 || (i15 & 3) != 2) {
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
                                    lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                                    i4 &= -897;
                                } else {
                                    lazyStaggeredGridStateB = lazyStaggeredGridState2;
                                }
                                if (i5 != 0) {
                                    rx8VarE = nx8.e(ff3.i(0));
                                } else {
                                    rx8VarE = rx8Var2;
                                }
                                if (i7 != 0) {
                                    z3 = false;
                                }
                                if (i9 != 0) {
                                    fI = ff3.i(0);
                                } else {
                                    fI = f;
                                }
                                if (i11 != 0) {
                                    eVarR = c.a.r(ff3.i(0));
                                } else {
                                    eVarR = eVar;
                                }
                                if ((i3 & 128) != 0) {
                                    qg4VarA = cab.a.a(dVarF, 6);
                                    i4 &= -29360129;
                                } else {
                                    qg4VarA = qg4Var;
                                }
                                boolean z9 = i13 == 0 ? z2 : true;
                                if ((i3 & 512) != 0) {
                                    i4 &= -1879048193;
                                    zv8VarD = cw8.d(dVarF, 0);
                                } else {
                                    zv8VarD = zv8Var;
                                }
                                lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                                f3 = fI;
                                qg4Var3 = qg4VarA;
                                z7 = z9;
                                z8 = z3;
                            } else {
                                dVarF.q();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 128) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((i3 & 512) != 0) {
                                    i4 &= -1879048193;
                                }
                                f3 = f;
                                qg4Var3 = qg4Var;
                                z7 = z2;
                                zv8VarD = zv8Var;
                                bVar4 = bVar2;
                                lazyStaggeredGridState4 = lazyStaggeredGridState2;
                                rx8VarE = rx8Var2;
                                z8 = z3;
                                eVarR = eVar;
                            }
                            dVarF.M();
                            if (e.k()) {
                                e.o(-578931208, i4, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                            }
                            int i19 = i4 >> 3;
                            int i20 = i4 << 3;
                            dVar2 = dVarF;
                            rx8 rx8Var4 = rx8VarE;
                            iy6.b(lazyStaggeredGridState4, Orientation.Vertical, e(v4cVar, eVarR, rx8VarE, dVarF, (i4 & 14) | ((i4 >> 15) & 112) | (i19 & 896)), bVar4, rx8Var4, z8, qg4Var3, z7, zv8VarD, f3, eVarR.getSpacing(), function1, dVar2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i20) | (i20 & 458752) | (3670016 & i19) | (29360128 & i19) | (i19 & 234881024) | ((i4 << 12) & 1879048192), (i15 << 3) & 112, 0);
                            if (e.k()) {
                                e.n();
                            }
                            eVar2 = eVarR;
                            lazyStaggeredGridState3 = lazyStaggeredGridState4;
                            bVar3 = bVar4;
                            rx8Var3 = rx8Var4;
                            z6 = z8;
                            qg4Var2 = qg4Var3;
                            z5 = z7;
                            zv8Var2 = zv8VarD;
                            f2 = f3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            f2 = f;
                            z5 = z2;
                            bVar3 = bVar2;
                            lazyStaggeredGridState3 = lazyStaggeredGridState2;
                            rx8Var3 = rx8Var2;
                            z6 = z3;
                            eVar2 = eVar;
                            qg4Var2 = qg4Var;
                            zv8Var2 = zv8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.wx6
                                public final Object invoke(Object obj, Object obj2) {
                                    return yx6.d(v4cVar, bVar3, lazyStaggeredGridState3, rx8Var3, z6, f2, eVar2, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 100663296;
                    if ((i & 805306368) != 0) {
                        i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                    }
                    if ((i2 & 6) == 0) {
                        if (dVarF.T(function1)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
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
                                lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyStaggeredGridStateB = lazyStaggeredGridState2;
                            }
                            if (i5 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f;
                            }
                            if (i11 != 0) {
                                eVarR = c.a.r(ff3.i(0));
                            } else {
                                eVarR = eVar;
                            }
                            if ((i3 & 128) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i4 &= -29360129;
                            } else {
                                qg4VarA = qg4Var;
                            }
                            if (i13 == 0) {
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                            f3 = fI;
                            qg4Var3 = qg4VarA;
                            z7 = z9;
                            z8 = z3;
                        } else {
                            if (i17 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 4) != 0) {
                                lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyStaggeredGridStateB = lazyStaggeredGridState2;
                            }
                            if (i5 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f;
                            }
                            if (i11 != 0) {
                                eVarR = c.a.r(ff3.i(0));
                            } else {
                                eVarR = eVar;
                            }
                            if ((i3 & 128) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i4 &= -29360129;
                            } else {
                                qg4VarA = qg4Var;
                            }
                            if (i13 == 0) {
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                            f3 = fI;
                            qg4Var3 = qg4VarA;
                            z7 = z9;
                            z8 = z3;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(-578931208, i4, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                        }
                        int i110 = i4 >> 3;
                        int i21 = i4 << 3;
                        dVar2 = dVarF;
                        rx8 rx8Var5 = rx8VarE;
                        iy6.b(lazyStaggeredGridState4, Orientation.Vertical, e(v4cVar, eVarR, rx8VarE, dVarF, (i4 & 14) | ((i4 >> 15) & 112) | (i110 & 896)), bVar4, rx8Var5, z8, qg4Var3, z7, zv8VarD, f3, eVarR.getSpacing(), function1, dVar2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i21) | (i21 & 458752) | (3670016 & i110) | (29360128 & i110) | (i110 & 234881024) | ((i4 << 12) & 1879048192), (i15 << 3) & 112, 0);
                        if (e.k()) {
                            e.n();
                        }
                        eVar2 = eVarR;
                        lazyStaggeredGridState3 = lazyStaggeredGridState4;
                        bVar3 = bVar4;
                        rx8Var3 = rx8Var5;
                        z6 = z8;
                        qg4Var2 = qg4Var3;
                        z5 = z7;
                        zv8Var2 = zv8VarD;
                        f2 = f3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        f2 = f;
                        z5 = z2;
                        bVar3 = bVar2;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        rx8Var3 = rx8Var2;
                        z6 = z3;
                        eVar2 = eVar;
                        qg4Var2 = qg4Var;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.wx6
                            public final Object invoke(Object obj, Object obj2) {
                                return yx6.d(v4cVar, bVar3, lazyStaggeredGridState3, rx8Var3, z6, f2, eVar2, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 24576;
                z3 = z;
                i9 = i3 & 32;
                if (i9 != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (dVarF.B(f)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 64;
                if (i11 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.x(eVar)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i4 |= i12;
                }
                if ((i & 12582912) != 0) {
                    i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
                }
                i13 = i3 & 256;
                if (i13 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.A(z2)) {
                            i14 = 67108864;
                        } else {
                            i14 = 33554432;
                        }
                        i4 |= i14;
                    }
                    if ((i & 805306368) != 0) {
                        i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                    }
                    if ((i2 & 6) == 0) {
                        if (dVarF.T(function1)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
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
                                lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyStaggeredGridStateB = lazyStaggeredGridState2;
                            }
                            if (i5 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f;
                            }
                            if (i11 != 0) {
                                eVarR = c.a.r(ff3.i(0));
                            } else {
                                eVarR = eVar;
                            }
                            if ((i3 & 128) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i4 &= -29360129;
                            } else {
                                qg4VarA = qg4Var;
                            }
                            if (i13 == 0) {
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                            f3 = fI;
                            qg4Var3 = qg4VarA;
                            z7 = z9;
                            z8 = z3;
                        } else {
                            if (i17 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 4) != 0) {
                                lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyStaggeredGridStateB = lazyStaggeredGridState2;
                            }
                            if (i5 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f;
                            }
                            if (i11 != 0) {
                                eVarR = c.a.r(ff3.i(0));
                            } else {
                                eVarR = eVar;
                            }
                            if ((i3 & 128) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i4 &= -29360129;
                            } else {
                                qg4VarA = qg4Var;
                            }
                            if (i13 == 0) {
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                            f3 = fI;
                            qg4Var3 = qg4VarA;
                            z7 = z9;
                            z8 = z3;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(-578931208, i4, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                        }
                        int i111 = i4 >> 3;
                        int i22 = i4 << 3;
                        dVar2 = dVarF;
                        rx8 rx8Var6 = rx8VarE;
                        iy6.b(lazyStaggeredGridState4, Orientation.Vertical, e(v4cVar, eVarR, rx8VarE, dVarF, (i4 & 14) | ((i4 >> 15) & 112) | (i111 & 896)), bVar4, rx8Var6, z8, qg4Var3, z7, zv8VarD, f3, eVarR.getSpacing(), function1, dVar2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i22) | (i22 & 458752) | (3670016 & i111) | (29360128 & i111) | (i111 & 234881024) | ((i4 << 12) & 1879048192), (i15 << 3) & 112, 0);
                        if (e.k()) {
                            e.n();
                        }
                        eVar2 = eVarR;
                        lazyStaggeredGridState3 = lazyStaggeredGridState4;
                        bVar3 = bVar4;
                        rx8Var3 = rx8Var6;
                        z6 = z8;
                        qg4Var2 = qg4Var3;
                        z5 = z7;
                        zv8Var2 = zv8VarD;
                        f2 = f3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        f2 = f;
                        z5 = z2;
                        bVar3 = bVar2;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        rx8Var3 = rx8Var2;
                        z6 = z3;
                        eVar2 = eVar;
                        qg4Var2 = qg4Var;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.wx6
                            public final Object invoke(Object obj, Object obj2) {
                                return yx6.d(v4cVar, bVar3, lazyStaggeredGridState3, rx8Var3, z6, f2, eVar2, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 100663296;
                if ((i & 805306368) != 0) {
                    i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                }
                if ((i2 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
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
                            lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyStaggeredGridStateB = lazyStaggeredGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f;
                        }
                        if (i11 != 0) {
                            eVarR = c.a.r(ff3.i(0));
                        } else {
                            eVarR = eVar;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i13 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                        f3 = fI;
                        qg4Var3 = qg4VarA;
                        z7 = z9;
                        z8 = z3;
                    } else {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyStaggeredGridStateB = lazyStaggeredGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f;
                        }
                        if (i11 != 0) {
                            eVarR = c.a.r(ff3.i(0));
                        } else {
                            eVarR = eVar;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i13 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                        f3 = fI;
                        qg4Var3 = qg4VarA;
                        z7 = z9;
                        z8 = z3;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-578931208, i4, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                    }
                    int i112 = i4 >> 3;
                    int i23 = i4 << 3;
                    dVar2 = dVarF;
                    rx8 rx8Var7 = rx8VarE;
                    iy6.b(lazyStaggeredGridState4, Orientation.Vertical, e(v4cVar, eVarR, rx8VarE, dVarF, (i4 & 14) | ((i4 >> 15) & 112) | (i112 & 896)), bVar4, rx8Var7, z8, qg4Var3, z7, zv8VarD, f3, eVarR.getSpacing(), function1, dVar2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i23) | (i23 & 458752) | (3670016 & i112) | (29360128 & i112) | (i112 & 234881024) | ((i4 << 12) & 1879048192), (i15 << 3) & 112, 0);
                    if (e.k()) {
                        e.n();
                    }
                    eVar2 = eVarR;
                    lazyStaggeredGridState3 = lazyStaggeredGridState4;
                    bVar3 = bVar4;
                    rx8Var3 = rx8Var7;
                    z6 = z8;
                    qg4Var2 = qg4Var3;
                    z5 = z7;
                    zv8Var2 = zv8VarD;
                    f2 = f3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    f2 = f;
                    z5 = z2;
                    bVar3 = bVar2;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar2 = eVar;
                    qg4Var2 = qg4Var;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.wx6
                        public final Object invoke(Object obj, Object obj2) {
                            return yx6.d(v4cVar, bVar3, lazyStaggeredGridState3, rx8Var3, z6, f2, eVar2, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
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
                i9 = i3 & 32;
                if (i9 != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (dVarF.B(f)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 64;
                if (i11 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.x(eVar)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i4 |= i12;
                }
                if ((i & 12582912) != 0) {
                    i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
                }
                i13 = i3 & 256;
                if (i13 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.A(z2)) {
                            i14 = 67108864;
                        } else {
                            i14 = 33554432;
                        }
                        i4 |= i14;
                    }
                    if ((i & 805306368) != 0) {
                        i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                    }
                    if ((i2 & 6) == 0) {
                        if (dVarF.T(function1)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
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
                                lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyStaggeredGridStateB = lazyStaggeredGridState2;
                            }
                            if (i5 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f;
                            }
                            if (i11 != 0) {
                                eVarR = c.a.r(ff3.i(0));
                            } else {
                                eVarR = eVar;
                            }
                            if ((i3 & 128) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i4 &= -29360129;
                            } else {
                                qg4VarA = qg4Var;
                            }
                            if (i13 == 0) {
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                            f3 = fI;
                            qg4Var3 = qg4VarA;
                            z7 = z9;
                            z8 = z3;
                        } else {
                            if (i17 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 4) != 0) {
                                lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyStaggeredGridStateB = lazyStaggeredGridState2;
                            }
                            if (i5 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f;
                            }
                            if (i11 != 0) {
                                eVarR = c.a.r(ff3.i(0));
                            } else {
                                eVarR = eVar;
                            }
                            if ((i3 & 128) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i4 &= -29360129;
                            } else {
                                qg4VarA = qg4Var;
                            }
                            if (i13 == 0) {
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                            f3 = fI;
                            qg4Var3 = qg4VarA;
                            z7 = z9;
                            z8 = z3;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(-578931208, i4, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                        }
                        int i113 = i4 >> 3;
                        int i24 = i4 << 3;
                        dVar2 = dVarF;
                        rx8 rx8Var8 = rx8VarE;
                        iy6.b(lazyStaggeredGridState4, Orientation.Vertical, e(v4cVar, eVarR, rx8VarE, dVarF, (i4 & 14) | ((i4 >> 15) & 112) | (i113 & 896)), bVar4, rx8Var8, z8, qg4Var3, z7, zv8VarD, f3, eVarR.getSpacing(), function1, dVar2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i24) | (i24 & 458752) | (3670016 & i113) | (29360128 & i113) | (i113 & 234881024) | ((i4 << 12) & 1879048192), (i15 << 3) & 112, 0);
                        if (e.k()) {
                            e.n();
                        }
                        eVar2 = eVarR;
                        lazyStaggeredGridState3 = lazyStaggeredGridState4;
                        bVar3 = bVar4;
                        rx8Var3 = rx8Var8;
                        z6 = z8;
                        qg4Var2 = qg4Var3;
                        z5 = z7;
                        zv8Var2 = zv8VarD;
                        f2 = f3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        f2 = f;
                        z5 = z2;
                        bVar3 = bVar2;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        rx8Var3 = rx8Var2;
                        z6 = z3;
                        eVar2 = eVar;
                        qg4Var2 = qg4Var;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.wx6
                            public final Object invoke(Object obj, Object obj2) {
                                return yx6.d(v4cVar, bVar3, lazyStaggeredGridState3, rx8Var3, z6, f2, eVar2, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 100663296;
                if ((i & 805306368) != 0) {
                    i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                }
                if ((i2 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
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
                            lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyStaggeredGridStateB = lazyStaggeredGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f;
                        }
                        if (i11 != 0) {
                            eVarR = c.a.r(ff3.i(0));
                        } else {
                            eVarR = eVar;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i13 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                        f3 = fI;
                        qg4Var3 = qg4VarA;
                        z7 = z9;
                        z8 = z3;
                    } else {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyStaggeredGridStateB = lazyStaggeredGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f;
                        }
                        if (i11 != 0) {
                            eVarR = c.a.r(ff3.i(0));
                        } else {
                            eVarR = eVar;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i13 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                        f3 = fI;
                        qg4Var3 = qg4VarA;
                        z7 = z9;
                        z8 = z3;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-578931208, i4, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                    }
                    int i114 = i4 >> 3;
                    int i25 = i4 << 3;
                    dVar2 = dVarF;
                    rx8 rx8Var9 = rx8VarE;
                    iy6.b(lazyStaggeredGridState4, Orientation.Vertical, e(v4cVar, eVarR, rx8VarE, dVarF, (i4 & 14) | ((i4 >> 15) & 112) | (i114 & 896)), bVar4, rx8Var9, z8, qg4Var3, z7, zv8VarD, f3, eVarR.getSpacing(), function1, dVar2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i25) | (i25 & 458752) | (3670016 & i114) | (29360128 & i114) | (i114 & 234881024) | ((i4 << 12) & 1879048192), (i15 << 3) & 112, 0);
                    if (e.k()) {
                        e.n();
                    }
                    eVar2 = eVarR;
                    lazyStaggeredGridState3 = lazyStaggeredGridState4;
                    bVar3 = bVar4;
                    rx8Var3 = rx8Var9;
                    z6 = z8;
                    qg4Var2 = qg4Var3;
                    z5 = z7;
                    zv8Var2 = zv8VarD;
                    f2 = f3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    f2 = f;
                    z5 = z2;
                    bVar3 = bVar2;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar2 = eVar;
                    qg4Var2 = qg4Var;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.wx6
                        public final Object invoke(Object obj, Object obj2) {
                            return yx6.d(v4cVar, bVar3, lazyStaggeredGridState3, rx8Var3, z6, f2, eVar2, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            z3 = z;
            i9 = i3 & 32;
            if (i9 != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (dVarF.B(f)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i4 |= i10;
            }
            i11 = i3 & 64;
            if (i11 != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.x(eVar)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i4 |= i12;
            }
            if ((i & 12582912) != 0) {
                i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
            }
            i13 = i3 & 256;
            if (i13 != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.A(z2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i4 |= i14;
                }
                if ((i & 805306368) != 0) {
                    i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                }
                if ((i2 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
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
                            lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyStaggeredGridStateB = lazyStaggeredGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f;
                        }
                        if (i11 != 0) {
                            eVarR = c.a.r(ff3.i(0));
                        } else {
                            eVarR = eVar;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i13 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                        f3 = fI;
                        qg4Var3 = qg4VarA;
                        z7 = z9;
                        z8 = z3;
                    } else {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyStaggeredGridStateB = lazyStaggeredGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f;
                        }
                        if (i11 != 0) {
                            eVarR = c.a.r(ff3.i(0));
                        } else {
                            eVarR = eVar;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i13 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                        f3 = fI;
                        qg4Var3 = qg4VarA;
                        z7 = z9;
                        z8 = z3;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-578931208, i4, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                    }
                    int i115 = i4 >> 3;
                    int i26 = i4 << 3;
                    dVar2 = dVarF;
                    rx8 rx8Var10 = rx8VarE;
                    iy6.b(lazyStaggeredGridState4, Orientation.Vertical, e(v4cVar, eVarR, rx8VarE, dVarF, (i4 & 14) | ((i4 >> 15) & 112) | (i115 & 896)), bVar4, rx8Var10, z8, qg4Var3, z7, zv8VarD, f3, eVarR.getSpacing(), function1, dVar2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i26) | (i26 & 458752) | (3670016 & i115) | (29360128 & i115) | (i115 & 234881024) | ((i4 << 12) & 1879048192), (i15 << 3) & 112, 0);
                    if (e.k()) {
                        e.n();
                    }
                    eVar2 = eVarR;
                    lazyStaggeredGridState3 = lazyStaggeredGridState4;
                    bVar3 = bVar4;
                    rx8Var3 = rx8Var10;
                    z6 = z8;
                    qg4Var2 = qg4Var3;
                    z5 = z7;
                    zv8Var2 = zv8VarD;
                    f2 = f3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    f2 = f;
                    z5 = z2;
                    bVar3 = bVar2;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar2 = eVar;
                    qg4Var2 = qg4Var;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.wx6
                        public final Object invoke(Object obj, Object obj2) {
                            return yx6.d(v4cVar, bVar3, lazyStaggeredGridState3, rx8Var3, z6, f2, eVar2, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 100663296;
            if ((i & 805306368) != 0) {
                i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                if (dVarF.T(function1)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i15 = i2 | i16;
            } else {
                i15 = i2;
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
                        lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                        i4 &= -897;
                    } else {
                        lazyStaggeredGridStateB = lazyStaggeredGridState2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f;
                    }
                    if (i11 != 0) {
                        eVarR = c.a.r(ff3.i(0));
                    } else {
                        eVarR = eVar;
                    }
                    if ((i3 & 128) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        qg4VarA = qg4Var;
                    }
                    if (i13 == 0) {
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                    f3 = fI;
                    qg4Var3 = qg4VarA;
                    z7 = z9;
                    z8 = z3;
                } else {
                    if (i17 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                        i4 &= -897;
                    } else {
                        lazyStaggeredGridStateB = lazyStaggeredGridState2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f;
                    }
                    if (i11 != 0) {
                        eVarR = c.a.r(ff3.i(0));
                    } else {
                        eVarR = eVar;
                    }
                    if ((i3 & 128) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        qg4VarA = qg4Var;
                    }
                    if (i13 == 0) {
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                    f3 = fI;
                    qg4Var3 = qg4VarA;
                    z7 = z9;
                    z8 = z3;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-578931208, i4, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                }
                int i116 = i4 >> 3;
                int i27 = i4 << 3;
                dVar2 = dVarF;
                rx8 rx8Var11 = rx8VarE;
                iy6.b(lazyStaggeredGridState4, Orientation.Vertical, e(v4cVar, eVarR, rx8VarE, dVarF, (i4 & 14) | ((i4 >> 15) & 112) | (i116 & 896)), bVar4, rx8Var11, z8, qg4Var3, z7, zv8VarD, f3, eVarR.getSpacing(), function1, dVar2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i27) | (i27 & 458752) | (3670016 & i116) | (29360128 & i116) | (i116 & 234881024) | ((i4 << 12) & 1879048192), (i15 << 3) & 112, 0);
                if (e.k()) {
                    e.n();
                }
                eVar2 = eVarR;
                lazyStaggeredGridState3 = lazyStaggeredGridState4;
                bVar3 = bVar4;
                rx8Var3 = rx8Var11;
                z6 = z8;
                qg4Var2 = qg4Var3;
                z5 = z7;
                zv8Var2 = zv8VarD;
                f2 = f3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                f2 = f;
                z5 = z2;
                bVar3 = bVar2;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                rx8Var3 = rx8Var2;
                z6 = z3;
                eVar2 = eVar;
                qg4Var2 = qg4Var;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.wx6
                    public final Object invoke(Object obj, Object obj2) {
                        return yx6.d(v4cVar, bVar3, lazyStaggeredGridState3, rx8Var3, z6, f2, eVar2, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 48;
        bVar2 = bVar;
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                lazyStaggeredGridState2 = lazyStaggeredGridState;
                if (dVarF.x(lazyStaggeredGridState2)) {
                }
                i4 |= i18;
            } else {
                lazyStaggeredGridState2 = lazyStaggeredGridState;
            }
            i4 |= i18;
        } else {
            lazyStaggeredGridState2 = lazyStaggeredGridState;
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
                i9 = i3 & 32;
                if (i9 != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (dVarF.B(f)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 64;
                if (i11 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.x(eVar)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i4 |= i12;
                }
                if ((i & 12582912) != 0) {
                    i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
                }
                i13 = i3 & 256;
                if (i13 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.A(z2)) {
                            i14 = 67108864;
                        } else {
                            i14 = 33554432;
                        }
                        i4 |= i14;
                    }
                    if ((i & 805306368) != 0) {
                        i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                    }
                    if ((i2 & 6) == 0) {
                        if (dVarF.T(function1)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
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
                                lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyStaggeredGridStateB = lazyStaggeredGridState2;
                            }
                            if (i5 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f;
                            }
                            if (i11 != 0) {
                                eVarR = c.a.r(ff3.i(0));
                            } else {
                                eVarR = eVar;
                            }
                            if ((i3 & 128) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i4 &= -29360129;
                            } else {
                                qg4VarA = qg4Var;
                            }
                            if (i13 == 0) {
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                            f3 = fI;
                            qg4Var3 = qg4VarA;
                            z7 = z9;
                            z8 = z3;
                        } else {
                            if (i17 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 4) != 0) {
                                lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyStaggeredGridStateB = lazyStaggeredGridState2;
                            }
                            if (i5 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f;
                            }
                            if (i11 != 0) {
                                eVarR = c.a.r(ff3.i(0));
                            } else {
                                eVarR = eVar;
                            }
                            if ((i3 & 128) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i4 &= -29360129;
                            } else {
                                qg4VarA = qg4Var;
                            }
                            if (i13 == 0) {
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                zv8VarD = cw8.d(dVarF, 0);
                            } else {
                                zv8VarD = zv8Var;
                            }
                            lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                            f3 = fI;
                            qg4Var3 = qg4VarA;
                            z7 = z9;
                            z8 = z3;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(-578931208, i4, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                        }
                        int i117 = i4 >> 3;
                        int i28 = i4 << 3;
                        dVar2 = dVarF;
                        rx8 rx8Var12 = rx8VarE;
                        iy6.b(lazyStaggeredGridState4, Orientation.Vertical, e(v4cVar, eVarR, rx8VarE, dVarF, (i4 & 14) | ((i4 >> 15) & 112) | (i117 & 896)), bVar4, rx8Var12, z8, qg4Var3, z7, zv8VarD, f3, eVarR.getSpacing(), function1, dVar2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i28) | (i28 & 458752) | (3670016 & i117) | (29360128 & i117) | (i117 & 234881024) | ((i4 << 12) & 1879048192), (i15 << 3) & 112, 0);
                        if (e.k()) {
                            e.n();
                        }
                        eVar2 = eVarR;
                        lazyStaggeredGridState3 = lazyStaggeredGridState4;
                        bVar3 = bVar4;
                        rx8Var3 = rx8Var12;
                        z6 = z8;
                        qg4Var2 = qg4Var3;
                        z5 = z7;
                        zv8Var2 = zv8VarD;
                        f2 = f3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        f2 = f;
                        z5 = z2;
                        bVar3 = bVar2;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        rx8Var3 = rx8Var2;
                        z6 = z3;
                        eVar2 = eVar;
                        qg4Var2 = qg4Var;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.wx6
                            public final Object invoke(Object obj, Object obj2) {
                                return yx6.d(v4cVar, bVar3, lazyStaggeredGridState3, rx8Var3, z6, f2, eVar2, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 100663296;
                if ((i & 805306368) != 0) {
                    i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                }
                if ((i2 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
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
                            lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyStaggeredGridStateB = lazyStaggeredGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f;
                        }
                        if (i11 != 0) {
                            eVarR = c.a.r(ff3.i(0));
                        } else {
                            eVarR = eVar;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i13 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                        f3 = fI;
                        qg4Var3 = qg4VarA;
                        z7 = z9;
                        z8 = z3;
                    } else {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyStaggeredGridStateB = lazyStaggeredGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f;
                        }
                        if (i11 != 0) {
                            eVarR = c.a.r(ff3.i(0));
                        } else {
                            eVarR = eVar;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i13 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                        f3 = fI;
                        qg4Var3 = qg4VarA;
                        z7 = z9;
                        z8 = z3;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-578931208, i4, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                    }
                    int i118 = i4 >> 3;
                    int i29 = i4 << 3;
                    dVar2 = dVarF;
                    rx8 rx8Var13 = rx8VarE;
                    iy6.b(lazyStaggeredGridState4, Orientation.Vertical, e(v4cVar, eVarR, rx8VarE, dVarF, (i4 & 14) | ((i4 >> 15) & 112) | (i118 & 896)), bVar4, rx8Var13, z8, qg4Var3, z7, zv8VarD, f3, eVarR.getSpacing(), function1, dVar2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i29) | (i29 & 458752) | (3670016 & i118) | (29360128 & i118) | (i118 & 234881024) | ((i4 << 12) & 1879048192), (i15 << 3) & 112, 0);
                    if (e.k()) {
                        e.n();
                    }
                    eVar2 = eVarR;
                    lazyStaggeredGridState3 = lazyStaggeredGridState4;
                    bVar3 = bVar4;
                    rx8Var3 = rx8Var13;
                    z6 = z8;
                    qg4Var2 = qg4Var3;
                    z5 = z7;
                    zv8Var2 = zv8VarD;
                    f2 = f3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    f2 = f;
                    z5 = z2;
                    bVar3 = bVar2;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar2 = eVar;
                    qg4Var2 = qg4Var;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.wx6
                        public final Object invoke(Object obj, Object obj2) {
                            return yx6.d(v4cVar, bVar3, lazyStaggeredGridState3, rx8Var3, z6, f2, eVar2, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            z3 = z;
            i9 = i3 & 32;
            if (i9 != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (dVarF.B(f)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i4 |= i10;
            }
            i11 = i3 & 64;
            if (i11 != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.x(eVar)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i4 |= i12;
            }
            if ((i & 12582912) != 0) {
                i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
            }
            i13 = i3 & 256;
            if (i13 != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.A(z2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i4 |= i14;
                }
                if ((i & 805306368) != 0) {
                    i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                }
                if ((i2 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
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
                            lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyStaggeredGridStateB = lazyStaggeredGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f;
                        }
                        if (i11 != 0) {
                            eVarR = c.a.r(ff3.i(0));
                        } else {
                            eVarR = eVar;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i13 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                        f3 = fI;
                        qg4Var3 = qg4VarA;
                        z7 = z9;
                        z8 = z3;
                    } else {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyStaggeredGridStateB = lazyStaggeredGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f;
                        }
                        if (i11 != 0) {
                            eVarR = c.a.r(ff3.i(0));
                        } else {
                            eVarR = eVar;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i13 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                        f3 = fI;
                        qg4Var3 = qg4VarA;
                        z7 = z9;
                        z8 = z3;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-578931208, i4, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                    }
                    int i119 = i4 >> 3;
                    int i210 = i4 << 3;
                    dVar2 = dVarF;
                    rx8 rx8Var14 = rx8VarE;
                    iy6.b(lazyStaggeredGridState4, Orientation.Vertical, e(v4cVar, eVarR, rx8VarE, dVarF, (i4 & 14) | ((i4 >> 15) & 112) | (i119 & 896)), bVar4, rx8Var14, z8, qg4Var3, z7, zv8VarD, f3, eVarR.getSpacing(), function1, dVar2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i210) | (i210 & 458752) | (3670016 & i119) | (29360128 & i119) | (i119 & 234881024) | ((i4 << 12) & 1879048192), (i15 << 3) & 112, 0);
                    if (e.k()) {
                        e.n();
                    }
                    eVar2 = eVarR;
                    lazyStaggeredGridState3 = lazyStaggeredGridState4;
                    bVar3 = bVar4;
                    rx8Var3 = rx8Var14;
                    z6 = z8;
                    qg4Var2 = qg4Var3;
                    z5 = z7;
                    zv8Var2 = zv8VarD;
                    f2 = f3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    f2 = f;
                    z5 = z2;
                    bVar3 = bVar2;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar2 = eVar;
                    qg4Var2 = qg4Var;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.wx6
                        public final Object invoke(Object obj, Object obj2) {
                            return yx6.d(v4cVar, bVar3, lazyStaggeredGridState3, rx8Var3, z6, f2, eVar2, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 100663296;
            if ((i & 805306368) != 0) {
                i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                if (dVarF.T(function1)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i15 = i2 | i16;
            } else {
                i15 = i2;
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
                        lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                        i4 &= -897;
                    } else {
                        lazyStaggeredGridStateB = lazyStaggeredGridState2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f;
                    }
                    if (i11 != 0) {
                        eVarR = c.a.r(ff3.i(0));
                    } else {
                        eVarR = eVar;
                    }
                    if ((i3 & 128) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        qg4VarA = qg4Var;
                    }
                    if (i13 == 0) {
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                    f3 = fI;
                    qg4Var3 = qg4VarA;
                    z7 = z9;
                    z8 = z3;
                } else {
                    if (i17 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                        i4 &= -897;
                    } else {
                        lazyStaggeredGridStateB = lazyStaggeredGridState2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f;
                    }
                    if (i11 != 0) {
                        eVarR = c.a.r(ff3.i(0));
                    } else {
                        eVarR = eVar;
                    }
                    if ((i3 & 128) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        qg4VarA = qg4Var;
                    }
                    if (i13 == 0) {
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                    f3 = fI;
                    qg4Var3 = qg4VarA;
                    z7 = z9;
                    z8 = z3;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-578931208, i4, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                }
                int i1110 = i4 >> 3;
                int i211 = i4 << 3;
                dVar2 = dVarF;
                rx8 rx8Var15 = rx8VarE;
                iy6.b(lazyStaggeredGridState4, Orientation.Vertical, e(v4cVar, eVarR, rx8VarE, dVarF, (i4 & 14) | ((i4 >> 15) & 112) | (i1110 & 896)), bVar4, rx8Var15, z8, qg4Var3, z7, zv8VarD, f3, eVarR.getSpacing(), function1, dVar2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i211) | (i211 & 458752) | (3670016 & i1110) | (29360128 & i1110) | (i1110 & 234881024) | ((i4 << 12) & 1879048192), (i15 << 3) & 112, 0);
                if (e.k()) {
                    e.n();
                }
                eVar2 = eVarR;
                lazyStaggeredGridState3 = lazyStaggeredGridState4;
                bVar3 = bVar4;
                rx8Var3 = rx8Var15;
                z6 = z8;
                qg4Var2 = qg4Var3;
                z5 = z7;
                zv8Var2 = zv8VarD;
                f2 = f3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                f2 = f;
                z5 = z2;
                bVar3 = bVar2;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                rx8Var3 = rx8Var2;
                z6 = z3;
                eVar2 = eVar;
                qg4Var2 = qg4Var;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.wx6
                    public final Object invoke(Object obj, Object obj2) {
                        return yx6.d(v4cVar, bVar3, lazyStaggeredGridState3, rx8Var3, z6, f2, eVar2, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
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
            i9 = i3 & 32;
            if (i9 != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (dVarF.B(f)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i4 |= i10;
            }
            i11 = i3 & 64;
            if (i11 != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.x(eVar)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i4 |= i12;
            }
            if ((i & 12582912) != 0) {
                i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
            }
            i13 = i3 & 256;
            if (i13 != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.A(z2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i4 |= i14;
                }
                if ((i & 805306368) != 0) {
                    i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
                }
                if ((i2 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
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
                            lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyStaggeredGridStateB = lazyStaggeredGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f;
                        }
                        if (i11 != 0) {
                            eVarR = c.a.r(ff3.i(0));
                        } else {
                            eVarR = eVar;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i13 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                        f3 = fI;
                        qg4Var3 = qg4VarA;
                        z7 = z9;
                        z8 = z3;
                    } else {
                        if (i17 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                            i4 &= -897;
                        } else {
                            lazyStaggeredGridStateB = lazyStaggeredGridState2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f;
                        }
                        if (i11 != 0) {
                            eVarR = c.a.r(ff3.i(0));
                        } else {
                            eVarR = eVar;
                        }
                        if ((i3 & 128) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            qg4VarA = qg4Var;
                        }
                        if (i13 == 0) {
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            zv8VarD = cw8.d(dVarF, 0);
                        } else {
                            zv8VarD = zv8Var;
                        }
                        lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                        f3 = fI;
                        qg4Var3 = qg4VarA;
                        z7 = z9;
                        z8 = z3;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-578931208, i4, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                    }
                    int i1111 = i4 >> 3;
                    int i212 = i4 << 3;
                    dVar2 = dVarF;
                    rx8 rx8Var16 = rx8VarE;
                    iy6.b(lazyStaggeredGridState4, Orientation.Vertical, e(v4cVar, eVarR, rx8VarE, dVarF, (i4 & 14) | ((i4 >> 15) & 112) | (i1111 & 896)), bVar4, rx8Var16, z8, qg4Var3, z7, zv8VarD, f3, eVarR.getSpacing(), function1, dVar2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i212) | (i212 & 458752) | (3670016 & i1111) | (29360128 & i1111) | (i1111 & 234881024) | ((i4 << 12) & 1879048192), (i15 << 3) & 112, 0);
                    if (e.k()) {
                        e.n();
                    }
                    eVar2 = eVarR;
                    lazyStaggeredGridState3 = lazyStaggeredGridState4;
                    bVar3 = bVar4;
                    rx8Var3 = rx8Var16;
                    z6 = z8;
                    qg4Var2 = qg4Var3;
                    z5 = z7;
                    zv8Var2 = zv8VarD;
                    f2 = f3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    f2 = f;
                    z5 = z2;
                    bVar3 = bVar2;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    rx8Var3 = rx8Var2;
                    z6 = z3;
                    eVar2 = eVar;
                    qg4Var2 = qg4Var;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.wx6
                        public final Object invoke(Object obj, Object obj2) {
                            return yx6.d(v4cVar, bVar3, lazyStaggeredGridState3, rx8Var3, z6, f2, eVar2, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 100663296;
            if ((i & 805306368) != 0) {
                i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                if (dVarF.T(function1)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i15 = i2 | i16;
            } else {
                i15 = i2;
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
                        lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                        i4 &= -897;
                    } else {
                        lazyStaggeredGridStateB = lazyStaggeredGridState2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f;
                    }
                    if (i11 != 0) {
                        eVarR = c.a.r(ff3.i(0));
                    } else {
                        eVarR = eVar;
                    }
                    if ((i3 & 128) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        qg4VarA = qg4Var;
                    }
                    if (i13 == 0) {
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                    f3 = fI;
                    qg4Var3 = qg4VarA;
                    z7 = z9;
                    z8 = z3;
                } else {
                    if (i17 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                        i4 &= -897;
                    } else {
                        lazyStaggeredGridStateB = lazyStaggeredGridState2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f;
                    }
                    if (i11 != 0) {
                        eVarR = c.a.r(ff3.i(0));
                    } else {
                        eVarR = eVar;
                    }
                    if ((i3 & 128) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        qg4VarA = qg4Var;
                    }
                    if (i13 == 0) {
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                    f3 = fI;
                    qg4Var3 = qg4VarA;
                    z7 = z9;
                    z8 = z3;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-578931208, i4, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                }
                int i1112 = i4 >> 3;
                int i213 = i4 << 3;
                dVar2 = dVarF;
                rx8 rx8Var17 = rx8VarE;
                iy6.b(lazyStaggeredGridState4, Orientation.Vertical, e(v4cVar, eVarR, rx8VarE, dVarF, (i4 & 14) | ((i4 >> 15) & 112) | (i1112 & 896)), bVar4, rx8Var17, z8, qg4Var3, z7, zv8VarD, f3, eVarR.getSpacing(), function1, dVar2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i213) | (i213 & 458752) | (3670016 & i1112) | (29360128 & i1112) | (i1112 & 234881024) | ((i4 << 12) & 1879048192), (i15 << 3) & 112, 0);
                if (e.k()) {
                    e.n();
                }
                eVar2 = eVarR;
                lazyStaggeredGridState3 = lazyStaggeredGridState4;
                bVar3 = bVar4;
                rx8Var3 = rx8Var17;
                z6 = z8;
                qg4Var2 = qg4Var3;
                z5 = z7;
                zv8Var2 = zv8VarD;
                f2 = f3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                f2 = f;
                z5 = z2;
                bVar3 = bVar2;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                rx8Var3 = rx8Var2;
                z6 = z3;
                eVar2 = eVar;
                qg4Var2 = qg4Var;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.wx6
                    public final Object invoke(Object obj, Object obj2) {
                        return yx6.d(v4cVar, bVar3, lazyStaggeredGridState3, rx8Var3, z6, f2, eVar2, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 24576;
        z3 = z;
        i9 = i3 & 32;
        if (i9 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (dVarF.B(f)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        }
        i11 = i3 & 64;
        if (i11 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (dVarF.x(eVar)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i4 |= i12;
        }
        if ((i & 12582912) != 0) {
            i4 |= ((i3 & 128) == 0 || !dVarF.x(qg4Var)) ? 4194304 : 8388608;
        }
        i13 = i3 & 256;
        if (i13 != 0) {
            if ((i & 100663296) == 0) {
                if (dVarF.A(z2)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i4 |= i14;
            }
            if ((i & 805306368) != 0) {
                i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                if (dVarF.T(function1)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i15 = i2 | i16;
            } else {
                i15 = i2;
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
                        lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                        i4 &= -897;
                    } else {
                        lazyStaggeredGridStateB = lazyStaggeredGridState2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f;
                    }
                    if (i11 != 0) {
                        eVarR = c.a.r(ff3.i(0));
                    } else {
                        eVarR = eVar;
                    }
                    if ((i3 & 128) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        qg4VarA = qg4Var;
                    }
                    if (i13 == 0) {
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                    f3 = fI;
                    qg4Var3 = qg4VarA;
                    z7 = z9;
                    z8 = z3;
                } else {
                    if (i17 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                        i4 &= -897;
                    } else {
                        lazyStaggeredGridStateB = lazyStaggeredGridState2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f;
                    }
                    if (i11 != 0) {
                        eVarR = c.a.r(ff3.i(0));
                    } else {
                        eVarR = eVar;
                    }
                    if ((i3 & 128) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        qg4VarA = qg4Var;
                    }
                    if (i13 == 0) {
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                        zv8VarD = cw8.d(dVarF, 0);
                    } else {
                        zv8VarD = zv8Var;
                    }
                    lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                    f3 = fI;
                    qg4Var3 = qg4VarA;
                    z7 = z9;
                    z8 = z3;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-578931208, i4, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                }
                int i1113 = i4 >> 3;
                int i214 = i4 << 3;
                dVar2 = dVarF;
                rx8 rx8Var18 = rx8VarE;
                iy6.b(lazyStaggeredGridState4, Orientation.Vertical, e(v4cVar, eVarR, rx8VarE, dVarF, (i4 & 14) | ((i4 >> 15) & 112) | (i1113 & 896)), bVar4, rx8Var18, z8, qg4Var3, z7, zv8VarD, f3, eVarR.getSpacing(), function1, dVar2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i214) | (i214 & 458752) | (3670016 & i1113) | (29360128 & i1113) | (i1113 & 234881024) | ((i4 << 12) & 1879048192), (i15 << 3) & 112, 0);
                if (e.k()) {
                    e.n();
                }
                eVar2 = eVarR;
                lazyStaggeredGridState3 = lazyStaggeredGridState4;
                bVar3 = bVar4;
                rx8Var3 = rx8Var18;
                z6 = z8;
                qg4Var2 = qg4Var3;
                z5 = z7;
                zv8Var2 = zv8VarD;
                f2 = f3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                f2 = f;
                z5 = z2;
                bVar3 = bVar2;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                rx8Var3 = rx8Var2;
                z6 = z3;
                eVar2 = eVar;
                qg4Var2 = qg4Var;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.wx6
                    public final Object invoke(Object obj, Object obj2) {
                        return yx6.d(v4cVar, bVar3, lazyStaggeredGridState3, rx8Var3, z6, f2, eVar2, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 100663296;
        if ((i & 805306368) != 0) {
            i4 |= ((i3 & 512) == 0 || !dVarF.x(zv8Var)) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            if (dVarF.T(function1)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i2 | i16;
        } else {
            i15 = i2;
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
                    lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                    i4 &= -897;
                } else {
                    lazyStaggeredGridStateB = lazyStaggeredGridState2;
                }
                if (i5 != 0) {
                    rx8VarE = nx8.e(ff3.i(0));
                } else {
                    rx8VarE = rx8Var2;
                }
                if (i7 != 0) {
                    z3 = false;
                }
                if (i9 != 0) {
                    fI = ff3.i(0);
                } else {
                    fI = f;
                }
                if (i11 != 0) {
                    eVarR = c.a.r(ff3.i(0));
                } else {
                    eVarR = eVar;
                }
                if ((i3 & 128) != 0) {
                    qg4VarA = cab.a.a(dVarF, 6);
                    i4 &= -29360129;
                } else {
                    qg4VarA = qg4Var;
                }
                if (i13 == 0) {
                }
                if ((i3 & 512) != 0) {
                    i4 &= -1879048193;
                    zv8VarD = cw8.d(dVarF, 0);
                } else {
                    zv8VarD = zv8Var;
                }
                lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                f3 = fI;
                qg4Var3 = qg4VarA;
                z7 = z9;
                z8 = z3;
            } else {
                if (i17 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i3 & 4) != 0) {
                    lazyStaggeredGridStateB = androidx.compose.p001foundation.lazy.staggeredgrid.d.b(0, 0, dVarF, 0, 3);
                    i4 &= -897;
                } else {
                    lazyStaggeredGridStateB = lazyStaggeredGridState2;
                }
                if (i5 != 0) {
                    rx8VarE = nx8.e(ff3.i(0));
                } else {
                    rx8VarE = rx8Var2;
                }
                if (i7 != 0) {
                    z3 = false;
                }
                if (i9 != 0) {
                    fI = ff3.i(0);
                } else {
                    fI = f;
                }
                if (i11 != 0) {
                    eVarR = c.a.r(ff3.i(0));
                } else {
                    eVarR = eVar;
                }
                if ((i3 & 128) != 0) {
                    qg4VarA = cab.a.a(dVarF, 6);
                    i4 &= -29360129;
                } else {
                    qg4VarA = qg4Var;
                }
                if (i13 == 0) {
                }
                if ((i3 & 512) != 0) {
                    i4 &= -1879048193;
                    zv8VarD = cw8.d(dVarF, 0);
                } else {
                    zv8VarD = zv8Var;
                }
                lazyStaggeredGridState4 = lazyStaggeredGridStateB;
                f3 = fI;
                qg4Var3 = qg4VarA;
                z7 = z9;
                z8 = z3;
            }
            dVarF.M();
            if (e.k()) {
                e.o(-578931208, i4, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
            }
            int i1114 = i4 >> 3;
            int i215 = i4 << 3;
            dVar2 = dVarF;
            rx8 rx8Var19 = rx8VarE;
            iy6.b(lazyStaggeredGridState4, Orientation.Vertical, e(v4cVar, eVarR, rx8VarE, dVarF, (i4 & 14) | ((i4 >> 15) & 112) | (i1114 & 896)), bVar4, rx8Var19, z8, qg4Var3, z7, zv8VarD, f3, eVarR.getSpacing(), function1, dVar2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i215) | (i215 & 458752) | (3670016 & i1114) | (29360128 & i1114) | (i1114 & 234881024) | ((i4 << 12) & 1879048192), (i15 << 3) & 112, 0);
            if (e.k()) {
                e.n();
            }
            eVar2 = eVarR;
            lazyStaggeredGridState3 = lazyStaggeredGridState4;
            bVar3 = bVar4;
            rx8Var3 = rx8Var19;
            z6 = z8;
            qg4Var2 = qg4Var3;
            z5 = z7;
            zv8Var2 = zv8VarD;
            f2 = f3;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            f2 = f;
            z5 = z2;
            bVar3 = bVar2;
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            rx8Var3 = rx8Var2;
            z6 = z3;
            eVar2 = eVar;
            qg4Var2 = qg4Var;
            zv8Var2 = zv8Var;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.wx6
                public final Object invoke(Object obj, Object obj2) {
                    return yx6.d(v4cVar, bVar3, lazyStaggeredGridState3, rx8Var3, z6, f2, eVar2, qg4Var2, z5, zv8Var2, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(v4c v4cVar, b bVar, LazyStaggeredGridState lazyStaggeredGridState, rx8 rx8Var, boolean z, float f, c.e eVar, qg4 qg4Var, boolean z2, zv8 zv8Var, Function1 function1, int i, int i2, int i3, d dVar, int i4) {
        c(v4cVar, bVar, lazyStaggeredGridState, rx8Var, z, f, eVar, qg4Var, z2, zv8Var, function1, dVar, saa.a(i | 1), saa.a(i2), i3);
        return Unit.a;
    }

    private static final zq6 e(final v4c v4cVar, final c.e eVar, final rx8 rx8Var, d dVar, int i) {
        if (e.k()) {
            e.o(-1267076841, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:134)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && dVar.x(v4cVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && dVar.x(eVar)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && dVar.x(rx8Var)) || (i & 384) == 256);
        Object objR = dVar.R();
        if (z || objR == d.INSTANCE.a()) {
            objR = new zy6(new Function2() { // from class: com.google.android.xx6
                public final Object invoke(Object obj, Object obj2) {
                    return yx6.f(rx8Var, v4cVar, eVar, (f43) obj, (kx1) obj2);
                }
            });
            dVar.L(objR);
        }
        zq6 zq6Var = (zq6) objR;
        if (e.k()) {
            e.n();
        }
        return zq6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final az6 f(rx8 rx8Var, v4c v4cVar, c.e eVar, f43 f43Var, kx1 kx1Var) {
        if (!(kx1.l(kx1Var.getValue()) != Integer.MAX_VALUE)) {
            cx5.a("LazyVerticalStaggeredGrid's width should be bound by parent.");
        }
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        int iL = kx1.l(kx1Var.getValue()) - f43Var.O1(ff3.i(nx8.k(rx8Var, layoutDirection) + nx8.j(rx8Var, layoutDirection)));
        int[] iArrA = v4cVar.a(f43Var, iL, f43Var.O1(eVar.getSpacing()));
        int[] iArr = new int[iArrA.length];
        eVar.a(f43Var, iL, iArrA, layoutDirection, iArr);
        return new az6(iArr, iArrA);
    }
}
