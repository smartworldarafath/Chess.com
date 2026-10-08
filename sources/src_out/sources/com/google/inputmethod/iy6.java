package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.lazy.layout.f;
import androidx.compose.p001foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt;
import androidx.compose.p001foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u008b\u0001\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0001¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lcom/google/android/zq6;", "slots", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/rx8;", "contentPadding", "", "reverseLayout", "Lcom/google/android/qg4;", "flingBehavior", "userScrollEnabled", "Lcom/google/android/zv8;", "overscrollEffect", "Lcom/google/android/ff3;", "mainAxisSpacing", "crossAxisSpacing", "Lkotlin/Function1;", "Lcom/google/android/wy6;", "", "content", "b", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Lcom/google/android/zq6;Landroidx/compose/ui/b;Lcom/google/android/rx8;ZLcom/google/android/qg4;ZLcom/google/android/zv8;FFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;III)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class iy6 {
    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:102:0x0125  */
    /* JADX WARN: Code duplicated, block: B:104:0x012f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0132  */
    /* JADX WARN: Code duplicated, block: B:107:0x0137  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:112:0x0147  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a  */
    /* JADX WARN: Code duplicated, block: B:117:0x015e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0167  */
    /* JADX WARN: Code duplicated, block: B:124:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x017b  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:152:0x01db  */
    /* JADX WARN: Code duplicated, block: B:154:0x01df  */
    /* JADX WARN: Code duplicated, block: B:155:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:161:0x021c  */
    /* JADX WARN: Code duplicated, block: B:164:0x027d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0298  */
    /* JADX WARN: Code duplicated, block: B:169:0x0317  */
    /* JADX WARN: Code duplicated, block: B:171:0x0327  */
    /* JADX WARN: Code duplicated, block: B:174:0x033a  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    public static final void b(final LazyStaggeredGridState lazyStaggeredGridState, final Orientation orientation, final zq6 zq6Var, b bVar, rx8 rx8Var, boolean z, qg4 qg4Var, boolean z2, final zv8 zv8Var, float f, float f2, final Function1<? super wy6, Unit> function1, d dVar, final int i, final int i2, final int i3) {
        int i4;
        b bVar2;
        int i5;
        rx8 rx8Var2;
        int i6;
        int i7;
        boolean z3;
        int i8;
        qg4 qg4VarA;
        int i9;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z5;
        final float f3;
        d dVar2;
        final qg4 qg4Var2;
        final boolean z6;
        final rx8 rx8Var3;
        final boolean z7;
        final b bVar3;
        final float f4;
        s6b s6bVarH;
        b bVar4;
        rx8 rx8VarE;
        int i18;
        int i19;
        b bVar5;
        int i20;
        Object objR;
        Orientation orientation2;
        b bVarB;
        int i21;
        int i22;
        int i23;
        d dVarF = dVar.F(-1904835166);
        if ((i & 6) == 0) {
            i4 = (dVarF.x(lazyStaggeredGridState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= dVarF.C(orientation.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? dVarF.x(zq6Var) : dVarF.T(zq6Var) ? 256 : 128;
        }
        int i24 = i3 & 8;
        if (i24 == 0) {
            if ((i & 3072) == 0) {
                bVar2 = bVar;
                i4 |= dVarF.x(bVar2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    rx8Var2 = rx8Var;
                    if (dVarF.x(rx8Var2)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                    z3 = z;
                } else {
                    z3 = z;
                    if ((i & 196608) == 0) {
                        if (dVarF.A(z3)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                }
                if ((i & 1572864) == 0) {
                    qg4VarA = qg4Var;
                    if ((i3 & 64) == 0 || !dVarF.x(qg4VarA)) {
                        i23 = 524288;
                    } else {
                        i23 = 1048576;
                    }
                    i4 |= i23;
                } else {
                    qg4VarA = qg4Var;
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                    z4 = z2;
                } else {
                    z4 = z2;
                    if ((i & 12582912) == 0) {
                        if (dVarF.A(z4)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i4 |= i10;
                    }
                }
                if ((i & 100663296) == 0) {
                    if (dVarF.x(zv8Var)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i4 |= i22;
                }
                i11 = i3 & 512;
                if (i11 != 0) {
                    if ((i & 805306368) == 0) {
                        if (dVarF.B(f)) {
                            i12 = 536870912;
                        } else {
                            i12 = 268435456;
                        }
                        i4 |= i12;
                    }
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                        i14 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.B(f2)) {
                            i15 = 4;
                        } else {
                            i15 = 2;
                        }
                        i14 = i2 | i15;
                    } else {
                        i14 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        if (dVarF.T(function1)) {
                            i21 = 32;
                        } else {
                            i21 = 16;
                        }
                        i14 |= i21;
                    }
                    i16 = i14;
                    i17 = i4;
                    if ((i17 & 306783379) == 306783378 || (i16 & 19) != 18) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i17 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0 || dVarF.t()) {
                            if (i24 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i5 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if ((i3 & 64) != 0) {
                                qg4VarA = cab.a.a(dVarF, 6);
                                i18 = i17 & (-3670017);
                            } else {
                                i18 = i17;
                            }
                            z4 = i9 == 0 ? z4 : true;
                            if (i11 != 0) {
                                f = ff3.i(0);
                            } else {
                                f = f;
                            }
                            if (i13 != 0) {
                                boolean z8 = z3;
                                i19 = i18;
                                z3 = z8;
                                bVar5 = bVar4;
                                qg4VarA = qg4VarA;
                                rx8Var2 = rx8VarE;
                                f2 = ff3.i(0);
                            } else {
                                boolean z9 = z3;
                                i19 = i18;
                                z3 = z9;
                                bVar5 = bVar4;
                                qg4VarA = qg4VarA;
                                rx8Var2 = rx8VarE;
                                f2 = f2;
                            }
                        } else {
                            dVarF.q();
                            i19 = (i3 & 64) != 0 ? i17 & (-3670017) : i17;
                            bVar5 = bVar2;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(-1904835166, i19, i16, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                        }
                        i20 = i19 & 14;
                        Function0<cy6> function0C = LazyStaggeredGridItemProviderKt.c(lazyStaggeredGridState, function1, dVarF, (i16 & 112) | i20);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                            dVarF.L(objR);
                        }
                        int i25 = i19 >> 6;
                        int i26 = i19 >> 12;
                        int i27 = i19;
                        float f5 = f;
                        vt6 vt6VarF = qy6.f(lazyStaggeredGridState, function0C, rx8Var2, z3, orientation, f5, f2, (ta2) objR, zq6Var, (i05) dVarF.v(CompositionLocalsKt.j()), dVarF, (i25 & 7168) | (i25 & 896) | i20 | ((i19 << 9) & 57344) | (i26 & 458752) | ((i16 << 18) & 3670016) | ((i19 << 18) & 234881024));
                        rx8 rx8Var4 = rx8Var2;
                        float f6 = f2;
                        tu6 tu6VarA = yy6.a(lazyStaggeredGridState, z3, dVarF, (i26 & 112) | i20);
                        if (z4) {
                            dVarF.y(-1834596342);
                            orientation2 = orientation;
                            bVarB = ws6.b(b.INSTANCE, tx6.a(lazyStaggeredGridState, dVarF, i20), lazyStaggeredGridState.getBeyondBoundsInfo(), z3, orientation2);
                            dVarF.u();
                        } else {
                            orientation2 = orientation;
                            dVarF.y(-1834291488);
                            dVarF.u();
                            bVarB = b.INSTANCE;
                        }
                        boolean z10 = z3;
                        boolean z11 = z4;
                        qg4 qg4Var3 = qg4VarA;
                        ut6.f(function0C, x9b.c(f.c(bVar5.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), function0C, tu6VarA, orientation2, z11, z10, dVarF, ((i27 << 6) & 7168) | ((i27 >> 9) & 57344) | (i27 & 458752)).then(bVarB).then(lazyStaggeredGridState.z().getModifier()), lazyStaggeredGridState, orientation, zv8Var, z11, z10, qg4Var3, lazyStaggeredGridState.getMutableInteractionSource(), null, 128, null), lazyStaggeredGridState.getPrefetchState(), vt6VarF, dVarF, 0, 0);
                        if (e.k()) {
                            e.n();
                        }
                        dVar2 = dVarF;
                        z7 = z10;
                        qg4Var2 = qg4Var3;
                        bVar3 = bVar5;
                        z6 = z11;
                        rx8Var3 = rx8Var4;
                        f4 = f5;
                        f3 = f6;
                    } else {
                        dVarF.q();
                        f3 = f2;
                        dVar2 = dVarF;
                        qg4Var2 = qg4VarA;
                        z6 = z4;
                        rx8Var3 = rx8Var2;
                        z7 = z3;
                        bVar3 = bVar2;
                        f4 = f;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.hy6
                            public final Object invoke(Object obj, Object obj2) {
                                return iy6.c(lazyStaggeredGridState, orientation, zq6Var, bVar3, rx8Var3, z7, qg4Var2, z6, zv8Var, f4, f3, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i14 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.B(f2)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i2 | i15;
                } else {
                    i14 = i2;
                }
                if ((i2 & 48) == 0) {
                    if (dVarF.T(function1)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i14 |= i21;
                }
                i16 = i14;
                i17 = i4;
                if ((i17 & 306783379) == 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dVarF.g(z5, i17 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i18 = i17 & (-3670017);
                        } else {
                            i18 = i17;
                        }
                        if (i9 == 0) {
                        }
                        if (i11 != 0) {
                            f = ff3.i(0);
                        } else {
                            f = f;
                        }
                        if (i13 != 0) {
                            boolean z12 = z3;
                            i19 = i18;
                            z3 = z12;
                            bVar5 = bVar4;
                            qg4VarA = qg4VarA;
                            rx8Var2 = rx8VarE;
                            f2 = ff3.i(0);
                        } else {
                            boolean z13 = z3;
                            i19 = i18;
                            z3 = z13;
                            bVar5 = bVar4;
                            qg4VarA = qg4VarA;
                            rx8Var2 = rx8VarE;
                            f2 = f2;
                        }
                    } else {
                        if (i24 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i18 = i17 & (-3670017);
                        } else {
                            i18 = i17;
                        }
                        if (i9 == 0) {
                        }
                        if (i11 != 0) {
                            f = ff3.i(0);
                        } else {
                            f = f;
                        }
                        if (i13 != 0) {
                            boolean z14 = z3;
                            i19 = i18;
                            z3 = z14;
                            bVar5 = bVar4;
                            qg4VarA = qg4VarA;
                            rx8Var2 = rx8VarE;
                            f2 = ff3.i(0);
                        } else {
                            boolean z15 = z3;
                            i19 = i18;
                            z3 = z15;
                            bVar5 = bVar4;
                            qg4VarA = qg4VarA;
                            rx8Var2 = rx8VarE;
                            f2 = f2;
                        }
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-1904835166, i19, i16, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                    }
                    i20 = i19 & 14;
                    Function0<cy6> function0C2 = LazyStaggeredGridItemProviderKt.c(lazyStaggeredGridState, function1, dVarF, (i16 & 112) | i20);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR);
                    }
                    int i28 = i19 >> 6;
                    int i29 = i19 >> 12;
                    int i210 = i19;
                    float f7 = f;
                    vt6 vt6VarF2 = qy6.f(lazyStaggeredGridState, function0C2, rx8Var2, z3, orientation, f7, f2, (ta2) objR, zq6Var, (i05) dVarF.v(CompositionLocalsKt.j()), dVarF, (i28 & 7168) | (i28 & 896) | i20 | ((i19 << 9) & 57344) | (i29 & 458752) | ((i16 << 18) & 3670016) | ((i19 << 18) & 234881024));
                    rx8 rx8Var5 = rx8Var2;
                    float f8 = f2;
                    tu6 tu6VarA2 = yy6.a(lazyStaggeredGridState, z3, dVarF, (i29 & 112) | i20);
                    if (z4) {
                        dVarF.y(-1834596342);
                        orientation2 = orientation;
                        bVarB = ws6.b(b.INSTANCE, tx6.a(lazyStaggeredGridState, dVarF, i20), lazyStaggeredGridState.getBeyondBoundsInfo(), z3, orientation2);
                        dVarF.u();
                    } else {
                        orientation2 = orientation;
                        dVarF.y(-1834291488);
                        dVarF.u();
                        bVarB = b.INSTANCE;
                    }
                    boolean z16 = z3;
                    boolean z17 = z4;
                    qg4 qg4Var4 = qg4VarA;
                    ut6.f(function0C2, x9b.c(f.c(bVar5.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), function0C2, tu6VarA2, orientation2, z17, z16, dVarF, ((i210 << 6) & 7168) | ((i210 >> 9) & 57344) | (i210 & 458752)).then(bVarB).then(lazyStaggeredGridState.z().getModifier()), lazyStaggeredGridState, orientation, zv8Var, z17, z16, qg4Var4, lazyStaggeredGridState.getMutableInteractionSource(), null, 128, null), lazyStaggeredGridState.getPrefetchState(), vt6VarF2, dVarF, 0, 0);
                    if (e.k()) {
                        e.n();
                    }
                    dVar2 = dVarF;
                    z7 = z16;
                    qg4Var2 = qg4Var4;
                    bVar3 = bVar5;
                    z6 = z17;
                    rx8Var3 = rx8Var5;
                    f4 = f7;
                    f3 = f8;
                } else {
                    dVarF.q();
                    f3 = f2;
                    dVar2 = dVarF;
                    qg4Var2 = qg4VarA;
                    z6 = z4;
                    rx8Var3 = rx8Var2;
                    z7 = z3;
                    bVar3 = bVar2;
                    f4 = f;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.hy6
                        public final Object invoke(Object obj, Object obj2) {
                            return iy6.c(lazyStaggeredGridState, orientation, zq6Var, bVar3, rx8Var3, z7, qg4Var2, z6, zv8Var, f4, f3, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            rx8Var2 = rx8Var;
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
                z3 = z;
            } else {
                z3 = z;
                if ((i & 196608) == 0) {
                    if (dVarF.A(z3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            if ((i & 1572864) == 0) {
                qg4VarA = qg4Var;
                if ((i3 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i4 |= i23;
            } else {
                qg4VarA = qg4Var;
            }
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
                z4 = z2;
            } else {
                z4 = z2;
                if ((i & 12582912) == 0) {
                    if (dVarF.A(z4)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
            }
            if ((i & 100663296) == 0) {
                if (dVarF.x(zv8Var)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i4 |= i22;
            }
            i11 = i3 & 512;
            if (i11 != 0) {
                if ((i & 805306368) == 0) {
                    if (dVarF.B(f)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i14 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.B(f2)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i2 | i15;
                } else {
                    i14 = i2;
                }
                if ((i2 & 48) == 0) {
                    if (dVarF.T(function1)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i14 |= i21;
                }
                i16 = i14;
                i17 = i4;
                if ((i17 & 306783379) == 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dVarF.g(z5, i17 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i18 = i17 & (-3670017);
                        } else {
                            i18 = i17;
                        }
                        if (i9 == 0) {
                        }
                        if (i11 != 0) {
                            f = ff3.i(0);
                        } else {
                            f = f;
                        }
                        if (i13 != 0) {
                            boolean z18 = z3;
                            i19 = i18;
                            z3 = z18;
                            bVar5 = bVar4;
                            qg4VarA = qg4VarA;
                            rx8Var2 = rx8VarE;
                            f2 = ff3.i(0);
                        } else {
                            boolean z19 = z3;
                            i19 = i18;
                            z3 = z19;
                            bVar5 = bVar4;
                            qg4VarA = qg4VarA;
                            rx8Var2 = rx8VarE;
                            f2 = f2;
                        }
                    } else {
                        if (i24 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i18 = i17 & (-3670017);
                        } else {
                            i18 = i17;
                        }
                        if (i9 == 0) {
                        }
                        if (i11 != 0) {
                            f = ff3.i(0);
                        } else {
                            f = f;
                        }
                        if (i13 != 0) {
                            boolean z110 = z3;
                            i19 = i18;
                            z3 = z110;
                            bVar5 = bVar4;
                            qg4VarA = qg4VarA;
                            rx8Var2 = rx8VarE;
                            f2 = ff3.i(0);
                        } else {
                            boolean z111 = z3;
                            i19 = i18;
                            z3 = z111;
                            bVar5 = bVar4;
                            qg4VarA = qg4VarA;
                            rx8Var2 = rx8VarE;
                            f2 = f2;
                        }
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-1904835166, i19, i16, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                    }
                    i20 = i19 & 14;
                    Function0<cy6> function0C3 = LazyStaggeredGridItemProviderKt.c(lazyStaggeredGridState, function1, dVarF, (i16 & 112) | i20);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR);
                    }
                    int i211 = i19 >> 6;
                    int i212 = i19 >> 12;
                    int i213 = i19;
                    float f9 = f;
                    vt6 vt6VarF3 = qy6.f(lazyStaggeredGridState, function0C3, rx8Var2, z3, orientation, f9, f2, (ta2) objR, zq6Var, (i05) dVarF.v(CompositionLocalsKt.j()), dVarF, (i211 & 7168) | (i211 & 896) | i20 | ((i19 << 9) & 57344) | (i212 & 458752) | ((i16 << 18) & 3670016) | ((i19 << 18) & 234881024));
                    rx8 rx8Var6 = rx8Var2;
                    float f10 = f2;
                    tu6 tu6VarA3 = yy6.a(lazyStaggeredGridState, z3, dVarF, (i212 & 112) | i20);
                    if (z4) {
                        dVarF.y(-1834596342);
                        orientation2 = orientation;
                        bVarB = ws6.b(b.INSTANCE, tx6.a(lazyStaggeredGridState, dVarF, i20), lazyStaggeredGridState.getBeyondBoundsInfo(), z3, orientation2);
                        dVarF.u();
                    } else {
                        orientation2 = orientation;
                        dVarF.y(-1834291488);
                        dVarF.u();
                        bVarB = b.INSTANCE;
                    }
                    boolean z112 = z3;
                    boolean z113 = z4;
                    qg4 qg4Var5 = qg4VarA;
                    ut6.f(function0C3, x9b.c(f.c(bVar5.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), function0C3, tu6VarA3, orientation2, z113, z112, dVarF, ((i213 << 6) & 7168) | ((i213 >> 9) & 57344) | (i213 & 458752)).then(bVarB).then(lazyStaggeredGridState.z().getModifier()), lazyStaggeredGridState, orientation, zv8Var, z113, z112, qg4Var5, lazyStaggeredGridState.getMutableInteractionSource(), null, 128, null), lazyStaggeredGridState.getPrefetchState(), vt6VarF3, dVarF, 0, 0);
                    if (e.k()) {
                        e.n();
                    }
                    dVar2 = dVarF;
                    z7 = z112;
                    qg4Var2 = qg4Var5;
                    bVar3 = bVar5;
                    z6 = z113;
                    rx8Var3 = rx8Var6;
                    f4 = f9;
                    f3 = f10;
                } else {
                    dVarF.q();
                    f3 = f2;
                    dVar2 = dVarF;
                    qg4Var2 = qg4VarA;
                    z6 = z4;
                    rx8Var3 = rx8Var2;
                    z7 = z3;
                    bVar3 = bVar2;
                    f4 = f;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.hy6
                        public final Object invoke(Object obj, Object obj2) {
                            return iy6.c(lazyStaggeredGridState, orientation, zq6Var, bVar3, rx8Var3, z7, qg4Var2, z6, zv8Var, f4, f3, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 805306368;
            i13 = i3 & 1024;
            if (i13 != 0) {
                i14 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.B(f2)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i14 = i2 | i15;
            } else {
                i14 = i2;
            }
            if ((i2 & 48) == 0) {
                if (dVarF.T(function1)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i14 |= i21;
            }
            i16 = i14;
            i17 = i4;
            if ((i17 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (dVarF.g(z5, i17 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i24 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i18 = i17 & (-3670017);
                    } else {
                        i18 = i17;
                    }
                    if (i9 == 0) {
                    }
                    if (i11 != 0) {
                        f = ff3.i(0);
                    } else {
                        f = f;
                    }
                    if (i13 != 0) {
                        boolean z114 = z3;
                        i19 = i18;
                        z3 = z114;
                        bVar5 = bVar4;
                        qg4VarA = qg4VarA;
                        rx8Var2 = rx8VarE;
                        f2 = ff3.i(0);
                    } else {
                        boolean z115 = z3;
                        i19 = i18;
                        z3 = z115;
                        bVar5 = bVar4;
                        qg4VarA = qg4VarA;
                        rx8Var2 = rx8VarE;
                        f2 = f2;
                    }
                } else {
                    if (i24 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i18 = i17 & (-3670017);
                    } else {
                        i18 = i17;
                    }
                    if (i9 == 0) {
                    }
                    if (i11 != 0) {
                        f = ff3.i(0);
                    } else {
                        f = f;
                    }
                    if (i13 != 0) {
                        boolean z116 = z3;
                        i19 = i18;
                        z3 = z116;
                        bVar5 = bVar4;
                        qg4VarA = qg4VarA;
                        rx8Var2 = rx8VarE;
                        f2 = ff3.i(0);
                    } else {
                        boolean z117 = z3;
                        i19 = i18;
                        z3 = z117;
                        bVar5 = bVar4;
                        qg4VarA = qg4VarA;
                        rx8Var2 = rx8VarE;
                        f2 = f2;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-1904835166, i19, i16, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                }
                i20 = i19 & 14;
                Function0<cy6> function0C4 = LazyStaggeredGridItemProviderKt.c(lazyStaggeredGridState, function1, dVarF, (i16 & 112) | i20);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR);
                }
                int i214 = i19 >> 6;
                int i215 = i19 >> 12;
                int i216 = i19;
                float f11 = f;
                vt6 vt6VarF4 = qy6.f(lazyStaggeredGridState, function0C4, rx8Var2, z3, orientation, f11, f2, (ta2) objR, zq6Var, (i05) dVarF.v(CompositionLocalsKt.j()), dVarF, (i214 & 7168) | (i214 & 896) | i20 | ((i19 << 9) & 57344) | (i215 & 458752) | ((i16 << 18) & 3670016) | ((i19 << 18) & 234881024));
                rx8 rx8Var7 = rx8Var2;
                float f12 = f2;
                tu6 tu6VarA4 = yy6.a(lazyStaggeredGridState, z3, dVarF, (i215 & 112) | i20);
                if (z4) {
                    dVarF.y(-1834596342);
                    orientation2 = orientation;
                    bVarB = ws6.b(b.INSTANCE, tx6.a(lazyStaggeredGridState, dVarF, i20), lazyStaggeredGridState.getBeyondBoundsInfo(), z3, orientation2);
                    dVarF.u();
                } else {
                    orientation2 = orientation;
                    dVarF.y(-1834291488);
                    dVarF.u();
                    bVarB = b.INSTANCE;
                }
                boolean z118 = z3;
                boolean z119 = z4;
                qg4 qg4Var6 = qg4VarA;
                ut6.f(function0C4, x9b.c(f.c(bVar5.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), function0C4, tu6VarA4, orientation2, z119, z118, dVarF, ((i216 << 6) & 7168) | ((i216 >> 9) & 57344) | (i216 & 458752)).then(bVarB).then(lazyStaggeredGridState.z().getModifier()), lazyStaggeredGridState, orientation, zv8Var, z119, z118, qg4Var6, lazyStaggeredGridState.getMutableInteractionSource(), null, 128, null), lazyStaggeredGridState.getPrefetchState(), vt6VarF4, dVarF, 0, 0);
                if (e.k()) {
                    e.n();
                }
                dVar2 = dVarF;
                z7 = z118;
                qg4Var2 = qg4Var6;
                bVar3 = bVar5;
                z6 = z119;
                rx8Var3 = rx8Var7;
                f4 = f11;
                f3 = f12;
            } else {
                dVarF.q();
                f3 = f2;
                dVar2 = dVarF;
                qg4Var2 = qg4VarA;
                z6 = z4;
                rx8Var3 = rx8Var2;
                z7 = z3;
                bVar3 = bVar2;
                f4 = f;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.hy6
                    public final Object invoke(Object obj, Object obj2) {
                        return iy6.c(lazyStaggeredGridState, orientation, zq6Var, bVar3, rx8Var3, z7, qg4Var2, z6, zv8Var, f4, f3, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 3072;
        bVar2 = bVar;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                rx8Var2 = rx8Var;
                if (dVarF.x(rx8Var2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
                z3 = z;
            } else {
                z3 = z;
                if ((i & 196608) == 0) {
                    if (dVarF.A(z3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            if ((i & 1572864) == 0) {
                qg4VarA = qg4Var;
                if ((i3 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i4 |= i23;
            } else {
                qg4VarA = qg4Var;
            }
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
                z4 = z2;
            } else {
                z4 = z2;
                if ((i & 12582912) == 0) {
                    if (dVarF.A(z4)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
            }
            if ((i & 100663296) == 0) {
                if (dVarF.x(zv8Var)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i4 |= i22;
            }
            i11 = i3 & 512;
            if (i11 != 0) {
                if ((i & 805306368) == 0) {
                    if (dVarF.B(f)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i14 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.B(f2)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i2 | i15;
                } else {
                    i14 = i2;
                }
                if ((i2 & 48) == 0) {
                    if (dVarF.T(function1)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i14 |= i21;
                }
                i16 = i14;
                i17 = i4;
                if ((i17 & 306783379) == 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dVarF.g(z5, i17 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i18 = i17 & (-3670017);
                        } else {
                            i18 = i17;
                        }
                        if (i9 == 0) {
                        }
                        if (i11 != 0) {
                            f = ff3.i(0);
                        } else {
                            f = f;
                        }
                        if (i13 != 0) {
                            boolean z1110 = z3;
                            i19 = i18;
                            z3 = z1110;
                            bVar5 = bVar4;
                            qg4VarA = qg4VarA;
                            rx8Var2 = rx8VarE;
                            f2 = ff3.i(0);
                        } else {
                            boolean z1111 = z3;
                            i19 = i18;
                            z3 = z1111;
                            bVar5 = bVar4;
                            qg4VarA = qg4VarA;
                            rx8Var2 = rx8VarE;
                            f2 = f2;
                        }
                    } else {
                        if (i24 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i5 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 64) != 0) {
                            qg4VarA = cab.a.a(dVarF, 6);
                            i18 = i17 & (-3670017);
                        } else {
                            i18 = i17;
                        }
                        if (i9 == 0) {
                        }
                        if (i11 != 0) {
                            f = ff3.i(0);
                        } else {
                            f = f;
                        }
                        if (i13 != 0) {
                            boolean z1112 = z3;
                            i19 = i18;
                            z3 = z1112;
                            bVar5 = bVar4;
                            qg4VarA = qg4VarA;
                            rx8Var2 = rx8VarE;
                            f2 = ff3.i(0);
                        } else {
                            boolean z1113 = z3;
                            i19 = i18;
                            z3 = z1113;
                            bVar5 = bVar4;
                            qg4VarA = qg4VarA;
                            rx8Var2 = rx8VarE;
                            f2 = f2;
                        }
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-1904835166, i19, i16, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                    }
                    i20 = i19 & 14;
                    Function0<cy6> function0C5 = LazyStaggeredGridItemProviderKt.c(lazyStaggeredGridState, function1, dVarF, (i16 & 112) | i20);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR);
                    }
                    int i217 = i19 >> 6;
                    int i218 = i19 >> 12;
                    int i219 = i19;
                    float f13 = f;
                    vt6 vt6VarF5 = qy6.f(lazyStaggeredGridState, function0C5, rx8Var2, z3, orientation, f13, f2, (ta2) objR, zq6Var, (i05) dVarF.v(CompositionLocalsKt.j()), dVarF, (i217 & 7168) | (i217 & 896) | i20 | ((i19 << 9) & 57344) | (i218 & 458752) | ((i16 << 18) & 3670016) | ((i19 << 18) & 234881024));
                    rx8 rx8Var8 = rx8Var2;
                    float f14 = f2;
                    tu6 tu6VarA5 = yy6.a(lazyStaggeredGridState, z3, dVarF, (i218 & 112) | i20);
                    if (z4) {
                        dVarF.y(-1834596342);
                        orientation2 = orientation;
                        bVarB = ws6.b(b.INSTANCE, tx6.a(lazyStaggeredGridState, dVarF, i20), lazyStaggeredGridState.getBeyondBoundsInfo(), z3, orientation2);
                        dVarF.u();
                    } else {
                        orientation2 = orientation;
                        dVarF.y(-1834291488);
                        dVarF.u();
                        bVarB = b.INSTANCE;
                    }
                    boolean z1114 = z3;
                    boolean z1115 = z4;
                    qg4 qg4Var7 = qg4VarA;
                    ut6.f(function0C5, x9b.c(f.c(bVar5.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), function0C5, tu6VarA5, orientation2, z1115, z1114, dVarF, ((i219 << 6) & 7168) | ((i219 >> 9) & 57344) | (i219 & 458752)).then(bVarB).then(lazyStaggeredGridState.z().getModifier()), lazyStaggeredGridState, orientation, zv8Var, z1115, z1114, qg4Var7, lazyStaggeredGridState.getMutableInteractionSource(), null, 128, null), lazyStaggeredGridState.getPrefetchState(), vt6VarF5, dVarF, 0, 0);
                    if (e.k()) {
                        e.n();
                    }
                    dVar2 = dVarF;
                    z7 = z1114;
                    qg4Var2 = qg4Var7;
                    bVar3 = bVar5;
                    z6 = z1115;
                    rx8Var3 = rx8Var8;
                    f4 = f13;
                    f3 = f14;
                } else {
                    dVarF.q();
                    f3 = f2;
                    dVar2 = dVarF;
                    qg4Var2 = qg4VarA;
                    z6 = z4;
                    rx8Var3 = rx8Var2;
                    z7 = z3;
                    bVar3 = bVar2;
                    f4 = f;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.hy6
                        public final Object invoke(Object obj, Object obj2) {
                            return iy6.c(lazyStaggeredGridState, orientation, zq6Var, bVar3, rx8Var3, z7, qg4Var2, z6, zv8Var, f4, f3, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 805306368;
            i13 = i3 & 1024;
            if (i13 != 0) {
                i14 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.B(f2)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i14 = i2 | i15;
            } else {
                i14 = i2;
            }
            if ((i2 & 48) == 0) {
                if (dVarF.T(function1)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i14 |= i21;
            }
            i16 = i14;
            i17 = i4;
            if ((i17 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (dVarF.g(z5, i17 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i24 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i18 = i17 & (-3670017);
                    } else {
                        i18 = i17;
                    }
                    if (i9 == 0) {
                    }
                    if (i11 != 0) {
                        f = ff3.i(0);
                    } else {
                        f = f;
                    }
                    if (i13 != 0) {
                        boolean z1116 = z3;
                        i19 = i18;
                        z3 = z1116;
                        bVar5 = bVar4;
                        qg4VarA = qg4VarA;
                        rx8Var2 = rx8VarE;
                        f2 = ff3.i(0);
                    } else {
                        boolean z1117 = z3;
                        i19 = i18;
                        z3 = z1117;
                        bVar5 = bVar4;
                        qg4VarA = qg4VarA;
                        rx8Var2 = rx8VarE;
                        f2 = f2;
                    }
                } else {
                    if (i24 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i18 = i17 & (-3670017);
                    } else {
                        i18 = i17;
                    }
                    if (i9 == 0) {
                    }
                    if (i11 != 0) {
                        f = ff3.i(0);
                    } else {
                        f = f;
                    }
                    if (i13 != 0) {
                        boolean z1118 = z3;
                        i19 = i18;
                        z3 = z1118;
                        bVar5 = bVar4;
                        qg4VarA = qg4VarA;
                        rx8Var2 = rx8VarE;
                        f2 = ff3.i(0);
                    } else {
                        boolean z1119 = z3;
                        i19 = i18;
                        z3 = z1119;
                        bVar5 = bVar4;
                        qg4VarA = qg4VarA;
                        rx8Var2 = rx8VarE;
                        f2 = f2;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-1904835166, i19, i16, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                }
                i20 = i19 & 14;
                Function0<cy6> function0C6 = LazyStaggeredGridItemProviderKt.c(lazyStaggeredGridState, function1, dVarF, (i16 & 112) | i20);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR);
                }
                int i2110 = i19 >> 6;
                int i2111 = i19 >> 12;
                int i2112 = i19;
                float f15 = f;
                vt6 vt6VarF6 = qy6.f(lazyStaggeredGridState, function0C6, rx8Var2, z3, orientation, f15, f2, (ta2) objR, zq6Var, (i05) dVarF.v(CompositionLocalsKt.j()), dVarF, (i2110 & 7168) | (i2110 & 896) | i20 | ((i19 << 9) & 57344) | (i2111 & 458752) | ((i16 << 18) & 3670016) | ((i19 << 18) & 234881024));
                rx8 rx8Var9 = rx8Var2;
                float f16 = f2;
                tu6 tu6VarA6 = yy6.a(lazyStaggeredGridState, z3, dVarF, (i2111 & 112) | i20);
                if (z4) {
                    dVarF.y(-1834596342);
                    orientation2 = orientation;
                    bVarB = ws6.b(b.INSTANCE, tx6.a(lazyStaggeredGridState, dVarF, i20), lazyStaggeredGridState.getBeyondBoundsInfo(), z3, orientation2);
                    dVarF.u();
                } else {
                    orientation2 = orientation;
                    dVarF.y(-1834291488);
                    dVarF.u();
                    bVarB = b.INSTANCE;
                }
                boolean z11110 = z3;
                boolean z11111 = z4;
                qg4 qg4Var8 = qg4VarA;
                ut6.f(function0C6, x9b.c(f.c(bVar5.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), function0C6, tu6VarA6, orientation2, z11111, z11110, dVarF, ((i2112 << 6) & 7168) | ((i2112 >> 9) & 57344) | (i2112 & 458752)).then(bVarB).then(lazyStaggeredGridState.z().getModifier()), lazyStaggeredGridState, orientation, zv8Var, z11111, z11110, qg4Var8, lazyStaggeredGridState.getMutableInteractionSource(), null, 128, null), lazyStaggeredGridState.getPrefetchState(), vt6VarF6, dVarF, 0, 0);
                if (e.k()) {
                    e.n();
                }
                dVar2 = dVarF;
                z7 = z11110;
                qg4Var2 = qg4Var8;
                bVar3 = bVar5;
                z6 = z11111;
                rx8Var3 = rx8Var9;
                f4 = f15;
                f3 = f16;
            } else {
                dVarF.q();
                f3 = f2;
                dVar2 = dVarF;
                qg4Var2 = qg4VarA;
                z6 = z4;
                rx8Var3 = rx8Var2;
                z7 = z3;
                bVar3 = bVar2;
                f4 = f;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.hy6
                    public final Object invoke(Object obj, Object obj2) {
                        return iy6.c(lazyStaggeredGridState, orientation, zq6Var, bVar3, rx8Var3, z7, qg4Var2, z6, zv8Var, f4, f3, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 24576;
        rx8Var2 = rx8Var;
        i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= 196608;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 196608) == 0) {
                if (dVarF.A(z3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
        }
        if ((i & 1572864) == 0) {
            qg4VarA = qg4Var;
            if ((i3 & 64) == 0) {
                i23 = 524288;
            } else {
                i23 = 524288;
            }
            i4 |= i23;
        } else {
            qg4VarA = qg4Var;
        }
        i9 = i3 & 128;
        if (i9 != 0) {
            i4 |= 12582912;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i & 12582912) == 0) {
                if (dVarF.A(z4)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
        }
        if ((i & 100663296) == 0) {
            if (dVarF.x(zv8Var)) {
                i22 = 67108864;
            } else {
                i22 = 33554432;
            }
            i4 |= i22;
        }
        i11 = i3 & 512;
        if (i11 != 0) {
            if ((i & 805306368) == 0) {
                if (dVarF.B(f)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
                i14 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.B(f2)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i14 = i2 | i15;
            } else {
                i14 = i2;
            }
            if ((i2 & 48) == 0) {
                if (dVarF.T(function1)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i14 |= i21;
            }
            i16 = i14;
            i17 = i4;
            if ((i17 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (dVarF.g(z5, i17 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i24 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i18 = i17 & (-3670017);
                    } else {
                        i18 = i17;
                    }
                    if (i9 == 0) {
                    }
                    if (i11 != 0) {
                        f = ff3.i(0);
                    } else {
                        f = f;
                    }
                    if (i13 != 0) {
                        boolean z11112 = z3;
                        i19 = i18;
                        z3 = z11112;
                        bVar5 = bVar4;
                        qg4VarA = qg4VarA;
                        rx8Var2 = rx8VarE;
                        f2 = ff3.i(0);
                    } else {
                        boolean z11113 = z3;
                        i19 = i18;
                        z3 = z11113;
                        bVar5 = bVar4;
                        qg4VarA = qg4VarA;
                        rx8Var2 = rx8VarE;
                        f2 = f2;
                    }
                } else {
                    if (i24 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i5 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 64) != 0) {
                        qg4VarA = cab.a.a(dVarF, 6);
                        i18 = i17 & (-3670017);
                    } else {
                        i18 = i17;
                    }
                    if (i9 == 0) {
                    }
                    if (i11 != 0) {
                        f = ff3.i(0);
                    } else {
                        f = f;
                    }
                    if (i13 != 0) {
                        boolean z11114 = z3;
                        i19 = i18;
                        z3 = z11114;
                        bVar5 = bVar4;
                        qg4VarA = qg4VarA;
                        rx8Var2 = rx8VarE;
                        f2 = ff3.i(0);
                    } else {
                        boolean z11115 = z3;
                        i19 = i18;
                        z3 = z11115;
                        bVar5 = bVar4;
                        qg4VarA = qg4VarA;
                        rx8Var2 = rx8VarE;
                        f2 = f2;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-1904835166, i19, i16, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                }
                i20 = i19 & 14;
                Function0<cy6> function0C7 = LazyStaggeredGridItemProviderKt.c(lazyStaggeredGridState, function1, dVarF, (i16 & 112) | i20);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR);
                }
                int i2113 = i19 >> 6;
                int i2114 = i19 >> 12;
                int i2115 = i19;
                float f17 = f;
                vt6 vt6VarF7 = qy6.f(lazyStaggeredGridState, function0C7, rx8Var2, z3, orientation, f17, f2, (ta2) objR, zq6Var, (i05) dVarF.v(CompositionLocalsKt.j()), dVarF, (i2113 & 7168) | (i2113 & 896) | i20 | ((i19 << 9) & 57344) | (i2114 & 458752) | ((i16 << 18) & 3670016) | ((i19 << 18) & 234881024));
                rx8 rx8Var10 = rx8Var2;
                float f18 = f2;
                tu6 tu6VarA7 = yy6.a(lazyStaggeredGridState, z3, dVarF, (i2114 & 112) | i20);
                if (z4) {
                    dVarF.y(-1834596342);
                    orientation2 = orientation;
                    bVarB = ws6.b(b.INSTANCE, tx6.a(lazyStaggeredGridState, dVarF, i20), lazyStaggeredGridState.getBeyondBoundsInfo(), z3, orientation2);
                    dVarF.u();
                } else {
                    orientation2 = orientation;
                    dVarF.y(-1834291488);
                    dVarF.u();
                    bVarB = b.INSTANCE;
                }
                boolean z11116 = z3;
                boolean z11117 = z4;
                qg4 qg4Var9 = qg4VarA;
                ut6.f(function0C7, x9b.c(f.c(bVar5.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), function0C7, tu6VarA7, orientation2, z11117, z11116, dVarF, ((i2115 << 6) & 7168) | ((i2115 >> 9) & 57344) | (i2115 & 458752)).then(bVarB).then(lazyStaggeredGridState.z().getModifier()), lazyStaggeredGridState, orientation, zv8Var, z11117, z11116, qg4Var9, lazyStaggeredGridState.getMutableInteractionSource(), null, 128, null), lazyStaggeredGridState.getPrefetchState(), vt6VarF7, dVarF, 0, 0);
                if (e.k()) {
                    e.n();
                }
                dVar2 = dVarF;
                z7 = z11116;
                qg4Var2 = qg4Var9;
                bVar3 = bVar5;
                z6 = z11117;
                rx8Var3 = rx8Var10;
                f4 = f17;
                f3 = f18;
            } else {
                dVarF.q();
                f3 = f2;
                dVar2 = dVarF;
                qg4Var2 = qg4VarA;
                z6 = z4;
                rx8Var3 = rx8Var2;
                z7 = z3;
                bVar3 = bVar2;
                f4 = f;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.hy6
                    public final Object invoke(Object obj, Object obj2) {
                        return iy6.c(lazyStaggeredGridState, orientation, zq6Var, bVar3, rx8Var3, z7, qg4Var2, z6, zv8Var, f4, f3, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 805306368;
        i13 = i3 & 1024;
        if (i13 != 0) {
            i14 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (dVarF.B(f2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i14 = i2 | i15;
        } else {
            i14 = i2;
        }
        if ((i2 & 48) == 0) {
            if (dVarF.T(function1)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i14 |= i21;
        }
        i16 = i14;
        i17 = i4;
        if ((i17 & 306783379) == 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (dVarF.g(z5, i17 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i24 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i5 != 0) {
                    rx8VarE = nx8.e(ff3.i(0));
                } else {
                    rx8VarE = rx8Var2;
                }
                if (i7 != 0) {
                    z3 = false;
                }
                if ((i3 & 64) != 0) {
                    qg4VarA = cab.a.a(dVarF, 6);
                    i18 = i17 & (-3670017);
                } else {
                    i18 = i17;
                }
                if (i9 == 0) {
                }
                if (i11 != 0) {
                    f = ff3.i(0);
                } else {
                    f = f;
                }
                if (i13 != 0) {
                    boolean z11118 = z3;
                    i19 = i18;
                    z3 = z11118;
                    bVar5 = bVar4;
                    qg4VarA = qg4VarA;
                    rx8Var2 = rx8VarE;
                    f2 = ff3.i(0);
                } else {
                    boolean z11119 = z3;
                    i19 = i18;
                    z3 = z11119;
                    bVar5 = bVar4;
                    qg4VarA = qg4VarA;
                    rx8Var2 = rx8VarE;
                    f2 = f2;
                }
            } else {
                if (i24 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i5 != 0) {
                    rx8VarE = nx8.e(ff3.i(0));
                } else {
                    rx8VarE = rx8Var2;
                }
                if (i7 != 0) {
                    z3 = false;
                }
                if ((i3 & 64) != 0) {
                    qg4VarA = cab.a.a(dVarF, 6);
                    i18 = i17 & (-3670017);
                } else {
                    i18 = i17;
                }
                if (i9 == 0) {
                }
                if (i11 != 0) {
                    f = ff3.i(0);
                } else {
                    f = f;
                }
                if (i13 != 0) {
                    boolean z111110 = z3;
                    i19 = i18;
                    z3 = z111110;
                    bVar5 = bVar4;
                    qg4VarA = qg4VarA;
                    rx8Var2 = rx8VarE;
                    f2 = ff3.i(0);
                } else {
                    boolean z111111 = z3;
                    i19 = i18;
                    z3 = z111111;
                    bVar5 = bVar4;
                    qg4VarA = qg4VarA;
                    rx8Var2 = rx8VarE;
                    f2 = f2;
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(-1904835166, i19, i16, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
            }
            i20 = i19 & 14;
            Function0<cy6> function0C8 = LazyStaggeredGridItemProviderKt.c(lazyStaggeredGridState, function1, dVarF, (i16 & 112) | i20);
            objR = dVarF.R();
            if (objR == d.INSTANCE.a()) {
                objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                dVarF.L(objR);
            }
            int i2116 = i19 >> 6;
            int i2117 = i19 >> 12;
            int i2118 = i19;
            float f19 = f;
            vt6 vt6VarF8 = qy6.f(lazyStaggeredGridState, function0C8, rx8Var2, z3, orientation, f19, f2, (ta2) objR, zq6Var, (i05) dVarF.v(CompositionLocalsKt.j()), dVarF, (i2116 & 7168) | (i2116 & 896) | i20 | ((i19 << 9) & 57344) | (i2117 & 458752) | ((i16 << 18) & 3670016) | ((i19 << 18) & 234881024));
            rx8 rx8Var11 = rx8Var2;
            float f110 = f2;
            tu6 tu6VarA8 = yy6.a(lazyStaggeredGridState, z3, dVarF, (i2117 & 112) | i20);
            if (z4) {
                dVarF.y(-1834596342);
                orientation2 = orientation;
                bVarB = ws6.b(b.INSTANCE, tx6.a(lazyStaggeredGridState, dVarF, i20), lazyStaggeredGridState.getBeyondBoundsInfo(), z3, orientation2);
                dVarF.u();
            } else {
                orientation2 = orientation;
                dVarF.y(-1834291488);
                dVarF.u();
                bVarB = b.INSTANCE;
            }
            boolean z111112 = z3;
            boolean z111113 = z4;
            qg4 qg4Var10 = qg4VarA;
            ut6.f(function0C8, x9b.c(f.c(bVar5.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), function0C8, tu6VarA8, orientation2, z111113, z111112, dVarF, ((i2118 << 6) & 7168) | ((i2118 >> 9) & 57344) | (i2118 & 458752)).then(bVarB).then(lazyStaggeredGridState.z().getModifier()), lazyStaggeredGridState, orientation, zv8Var, z111113, z111112, qg4Var10, lazyStaggeredGridState.getMutableInteractionSource(), null, 128, null), lazyStaggeredGridState.getPrefetchState(), vt6VarF8, dVarF, 0, 0);
            if (e.k()) {
                e.n();
            }
            dVar2 = dVarF;
            z7 = z111112;
            qg4Var2 = qg4Var10;
            bVar3 = bVar5;
            z6 = z111113;
            rx8Var3 = rx8Var11;
            f4 = f19;
            f3 = f110;
        } else {
            dVarF.q();
            f3 = f2;
            dVar2 = dVarF;
            qg4Var2 = qg4VarA;
            z6 = z4;
            rx8Var3 = rx8Var2;
            z7 = z3;
            bVar3 = bVar2;
            f4 = f;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.hy6
                public final Object invoke(Object obj, Object obj2) {
                    return iy6.c(lazyStaggeredGridState, orientation, zq6Var, bVar3, rx8Var3, z7, qg4Var2, z6, zv8Var, f4, f3, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LazyStaggeredGridState lazyStaggeredGridState, Orientation orientation, zq6 zq6Var, b bVar, rx8 rx8Var, boolean z, qg4 qg4Var, boolean z2, zv8 zv8Var, float f, float f2, Function1 function1, int i, int i2, int i3, d dVar, int i4) {
        b(lazyStaggeredGridState, orientation, zq6Var, bVar, rx8Var, z, qg4Var, z2, zv8Var, f, f2, function1, dVar, saa.a(i | 1), saa.a(i2), i3);
        return Unit.a;
    }
}
