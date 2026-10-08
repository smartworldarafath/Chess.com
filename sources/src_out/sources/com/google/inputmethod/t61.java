package com.google.inputmethod;

import androidx.compose.p001foundation.layout.c;
import androidx.compose.p001foundation.layout.o;
import androidx.compose.p002material3.CardElevation;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a{\u0010\u0016\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/p61;", "colors", "Landroidx/compose/material3/CardElevation;", "elevation", "Lcom/google/android/or0;", "border", "Lkotlin/Function1;", "Lcom/google/android/xj1;", "", "content", "c", "(Landroidx/compose/ui/b;Lcom/google/android/xkb;Lcom/google/android/p61;Landroidx/compose/material3/CardElevation;Lcom/google/android/or0;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "Lkotlin/Function0;", "onClick", "", "enabled", "Lcom/google/android/r48;", "interactionSource", "d", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;ZLcom/google/android/xkb;Lcom/google/android/p61;Landroidx/compose/material3/CardElevation;Lcom/google/android/or0;Lcom/google/android/r48;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class t61 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<d, Integer, Unit> {
        final /* synthetic */ ps4<xj1, d, Integer, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        a(ps4<? super xj1, ? super d, ? super Integer, Unit> ps4Var) {
            this.a = ps4Var;
        }

        public final void a(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-97109725, i, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:95)");
            }
            ps4<xj1, d, Integer, Unit> ps4Var = this.a;
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            ej7 ej7VarA = o.a(c.a.k(), tc.INSTANCE.k(), dVar, 0);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarA, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            ps4Var.invoke(yj1.a, dVar, 6);
            dVar.m();
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Function2<d, Integer, Unit> {
        final /* synthetic */ ps4<xj1, d, Integer, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        b(ps4<? super xj1, ? super d, ? super Integer, Unit> ps4Var) {
            this.a = ps4Var;
        }

        public final void a(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1347531112, i, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:159)");
            }
            ps4<xj1, d, Integer, Unit> ps4Var = this.a;
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            ej7 ej7VarA = o.a(c.a.k(), tc.INSTANCE.k(), dVar, 0);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarA, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            ps4Var.invoke(yj1.a, dVar, 6);
            dVar.m();
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:101:0x0119  */
    /* JADX WARN: Code duplicated, block: B:102:0x0134  */
    /* JADX WARN: Code duplicated, block: B:105:0x013c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0140  */
    /* JADX WARN: Code duplicated, block: B:109:0x014c  */
    /* JADX WARN: Code duplicated, block: B:112:0x019f  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:97:0x010b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0114  */
    public static final void c(androidx.compose.ui.b bVar, xkb xkbVar, p61 p61Var, CardElevation cardElevation, BorderStroke borderStroke, final ps4<? super xj1, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i, final int i2) throws NoWhenBranchMatchedException {
        androidx.compose.ui.b bVar2;
        int i3;
        xkb xkbVar2;
        p61 p61Var2;
        CardElevation cardElevationC;
        BorderStroke borderStroke2;
        int i4;
        boolean z;
        final androidx.compose.ui.b bVar3;
        final xkb xkbVar3;
        final p61 p61Var3;
        final CardElevation cardElevation2;
        final BorderStroke borderStroke3;
        s6b s6bVarH;
        androidx.compose.ui.b bVar4;
        xkb xkbVarE;
        p61 p61VarA;
        boolean z2;
        androidx.compose.ui.b bVar5;
        CardElevation cardElevation3;
        BorderStroke borderStroke4;
        xkb xkbVar4;
        d dVarF = dVar.F(1359693790);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            bVar2 = bVar;
        } else if ((i & 6) == 0) {
            bVar2 = bVar;
            i3 = (dVarF.x(bVar2) ? 4 : 2) | i;
        } else {
            bVar2 = bVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                xkbVar2 = xkbVar;
                int i6 = dVarF.x(xkbVar2) ? 32 : 16;
                i3 |= i6;
            } else {
                xkbVar2 = xkbVar;
            }
            i3 |= i6;
        } else {
            xkbVar2 = xkbVar;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                p61Var2 = p61Var;
                int i7 = dVarF.x(p61Var2) ? 256 : 128;
                i3 |= i7;
            } else {
                p61Var2 = p61Var;
            }
            i3 |= i7;
        } else {
            p61Var2 = p61Var;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                cardElevationC = cardElevation;
                int i8 = dVarF.x(cardElevationC) ? 2048 : 1024;
                i3 |= i8;
            } else {
                cardElevationC = cardElevation;
            }
            i3 |= i8;
        } else {
            cardElevationC = cardElevation;
        }
        int i9 = i2 & 16;
        if (i9 == 0) {
            if ((i & 24576) == 0) {
                borderStroke2 = borderStroke;
                i3 |= dVarF.x(borderStroke2) ? 16384 : 8192;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (dVarF.T(ps4Var)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i3 |= i4;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0 || dVarF.t()) {
                    if (i5 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i2 & 2) != 0) {
                        xkbVarE = q61.a.e(dVarF, 6);
                        i3 &= -113;
                    } else {
                        xkbVarE = xkbVar2;
                    }
                    if ((i2 & 4) != 0) {
                        p61VarA = q61.a.a(dVarF, 6);
                        i3 &= -897;
                    } else {
                        p61VarA = p61Var2;
                    }
                    if ((i2 & 8) != 0) {
                        z2 = true;
                        cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        z2 = true;
                    }
                    CardElevation cardElevation4 = cardElevationC;
                    bVar5 = bVar4;
                    cardElevation3 = cardElevation4;
                    if (i9 != 0) {
                        xkbVar4 = xkbVarE;
                        borderStroke4 = null;
                    } else {
                        borderStroke4 = borderStroke;
                        xkbVar4 = xkbVarE;
                    }
                } else {
                    dVarF.q();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    cardElevation3 = cardElevationC;
                    borderStroke4 = borderStroke2;
                    bVar5 = bVar2;
                    xkbVar4 = xkbVar2;
                    p61VarA = p61Var2;
                    z2 = true;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(1359693790, i3, -1, "androidx.compose.material3.Card (Card.kt:86)");
                }
                afc.c(bVar5, xkbVar4, p61VarA.a(z2), p61VarA.b(z2), 0.0f, cardElevation3.f(z2, null, dVarF, ((i3 >> 3) & 896) | 54).getValue().getValue(), borderStroke4, ko1.e(-97109725, z2, new a(ps4Var), dVarF, 54), dVarF, (i3 & 14) | 12582912 | (i3 & 112) | (3670016 & (i3 << 6)), 16);
                dVarF = dVarF;
                if (e.k()) {
                    e.n();
                }
                p61Var3 = p61VarA;
                xkbVar3 = xkbVar4;
                borderStroke3 = borderStroke4;
                cardElevation2 = cardElevation3;
                bVar3 = bVar5;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                xkbVar3 = xkbVar2;
                p61Var3 = p61Var2;
                cardElevation2 = cardElevationC;
                borderStroke3 = borderStroke;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.s61
                    public final Object invoke(Object obj, Object obj2) {
                        return t61.e(bVar3, xkbVar3, p61Var3, cardElevation2, borderStroke3, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        borderStroke2 = borderStroke;
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (dVarF.T(ps4Var)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i2 & 2) != 0) {
                    xkbVarE = q61.a.e(dVarF, 6);
                    i3 &= -113;
                } else {
                    xkbVarE = xkbVar2;
                }
                if ((i2 & 4) != 0) {
                    p61VarA = q61.a.a(dVarF, 6);
                    i3 &= -897;
                } else {
                    p61VarA = p61Var2;
                }
                if ((i2 & 8) != 0) {
                    z2 = true;
                    cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                    i3 &= -7169;
                } else {
                    z2 = true;
                }
                CardElevation cardElevation5 = cardElevationC;
                bVar5 = bVar4;
                cardElevation3 = cardElevation5;
                if (i9 != 0) {
                    xkbVar4 = xkbVarE;
                    borderStroke4 = null;
                } else {
                    borderStroke4 = borderStroke;
                    xkbVar4 = xkbVarE;
                }
            } else {
                if (i5 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i2 & 2) != 0) {
                    xkbVarE = q61.a.e(dVarF, 6);
                    i3 &= -113;
                } else {
                    xkbVarE = xkbVar2;
                }
                if ((i2 & 4) != 0) {
                    p61VarA = q61.a.a(dVarF, 6);
                    i3 &= -897;
                } else {
                    p61VarA = p61Var2;
                }
                if ((i2 & 8) != 0) {
                    z2 = true;
                    cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                    i3 &= -7169;
                } else {
                    z2 = true;
                }
                CardElevation cardElevation6 = cardElevationC;
                bVar5 = bVar4;
                cardElevation3 = cardElevation6;
                if (i9 != 0) {
                    xkbVar4 = xkbVarE;
                    borderStroke4 = null;
                } else {
                    borderStroke4 = borderStroke;
                    xkbVar4 = xkbVarE;
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(1359693790, i3, -1, "androidx.compose.material3.Card (Card.kt:86)");
            }
            afc.c(bVar5, xkbVar4, p61VarA.a(z2), p61VarA.b(z2), 0.0f, cardElevation3.f(z2, null, dVarF, ((i3 >> 3) & 896) | 54).getValue().getValue(), borderStroke4, ko1.e(-97109725, z2, new a(ps4Var), dVarF, 54), dVarF, (i3 & 14) | 12582912 | (i3 & 112) | (3670016 & (i3 << 6)), 16);
            dVarF = dVarF;
            if (e.k()) {
                e.n();
            }
            p61Var3 = p61VarA;
            xkbVar3 = xkbVar4;
            borderStroke3 = borderStroke4;
            cardElevation2 = cardElevation3;
            bVar3 = bVar5;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            xkbVar3 = xkbVar2;
            p61Var3 = p61Var2;
            cardElevation2 = cardElevationC;
            borderStroke3 = borderStroke;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.s61
                public final Object invoke(Object obj, Object obj2) {
                    return t61.e(bVar3, xkbVar3, p61Var3, cardElevation2, borderStroke3, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:101:0x0111  */
    /* JADX WARN: Code duplicated, block: B:102:0x0113  */
    /* JADX WARN: Code duplicated, block: B:105:0x011c  */
    /* JADX WARN: Code duplicated, block: B:107:0x012a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0157  */
    /* JADX WARN: Code duplicated, block: B:124:0x015c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0161  */
    /* JADX WARN: Code duplicated, block: B:130:0x016e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0177  */
    /* JADX WARN: Code duplicated, block: B:134:0x017c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01af  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:149:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:154:0x0240  */
    /* JADX WARN: Code duplicated, block: B:156:0x024c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0261  */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:96:0x0101  */
    /* JADX WARN: Code duplicated, block: B:97:0x0104  */
    public static final void d(final Function0<Unit> function0, androidx.compose.ui.b bVar, boolean z, xkb xkbVar, p61 p61Var, CardElevation cardElevation, BorderStroke borderStroke, r48 r48Var, final ps4<? super xj1, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        androidx.compose.ui.b bVar2;
        int i4;
        boolean z2;
        int i5;
        xkb xkbVarE;
        p61 p61Var2;
        int i6;
        BorderStroke borderStroke2;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        boolean z4;
        d dVar2;
        final CardElevation cardElevation2;
        final androidx.compose.ui.b bVar3;
        final boolean z5;
        final xkb xkbVar2;
        final p61 p61Var3;
        final BorderStroke borderStroke3;
        final r48 r48Var2;
        s6b s6bVarH;
        p61 p61VarA;
        d dVar3;
        CardElevation cardElevationC;
        BorderStroke borderStroke4;
        androidx.compose.ui.b bVar4;
        xkb xkbVar3;
        BorderStroke borderStroke5;
        int i11;
        boolean z6;
        r48 r48Var3;
        r48 r48Var4;
        Object objR;
        d dVarF = dVar.F(2136075085);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.T(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 32 : 16;
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
                    if ((i2 & 8) == 0) {
                        xkbVarE = xkbVar;
                        int i13 = dVarF.x(xkbVarE) ? 2048 : 1024;
                        i3 |= i13;
                    } else {
                        xkbVarE = xkbVar;
                    }
                    i3 |= i13;
                } else {
                    xkbVarE = xkbVar;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        p61Var2 = p61Var;
                        int i14 = dVarF.x(p61Var2) ? 16384 : 8192;
                        i3 |= i14;
                    } else {
                        p61Var2 = p61Var;
                    }
                    i3 |= i14;
                } else {
                    p61Var2 = p61Var;
                }
                if ((196608 & i) != 0) {
                    i3 |= ((i2 & 32) == 0 || !dVarF.x(cardElevation)) ? 65536 : 131072;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    if ((1572864 & i) == 0) {
                        borderStroke2 = borderStroke;
                        if (dVarF.x(borderStroke2)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (dVarF.x(r48Var)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 256) != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 67108864;
                        } else {
                            i10 = 33554432;
                        }
                        i3 |= i10;
                    }
                    z3 = true;
                    if ((38347923 & i3) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (dVarF.g(z4, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0 || dVarF.t()) {
                            if (i12 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                xkbVarE = q61.a.e(dVarF, 6);
                            }
                            if ((i2 & 16) != 0) {
                                p61VarA = q61.a.a(dVarF, 6);
                                i3 &= -57345;
                            } else {
                                p61VarA = p61Var2;
                            }
                            if ((i2 & 32) != 0) {
                                cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                                dVar3 = dVarF;
                                i3 &= -458753;
                            } else {
                                dVar3 = dVarF;
                                cardElevationC = cardElevation;
                            }
                            if (i6 != 0) {
                                borderStroke4 = null;
                            } else {
                                borderStroke4 = borderStroke;
                            }
                            if (i8 != 0) {
                                androidx.compose.ui.b bVar5 = bVar2;
                                i11 = i3;
                                r48Var3 = null;
                                bVar4 = bVar5;
                                xkbVar3 = xkbVarE;
                                borderStroke5 = borderStroke4;
                                z6 = z2;
                            } else {
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarE;
                                borderStroke5 = borderStroke4;
                                i11 = i3;
                                z6 = z2;
                            }
                            dVar3.M();
                            if (e.k()) {
                                e.o(2136075085, i11, -1, "androidx.compose.material3.Card (Card.kt:145)");
                            }
                            if (r48Var3 == null) {
                                dVar3.y(1577885006);
                                objR = dVar3.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = k26.a();
                                    dVar3.L(objR);
                                }
                                r48Var4 = (r48) objR;
                                dVar3.u();
                            } else {
                                dVar3.y(-226195799);
                                dVar3.u();
                                r48Var4 = r48Var3;
                            }
                            dVar2 = dVar3;
                            afc.e(function0, bVar4, z6, xkbVar3, p61VarA.a(z6), p61VarA.b(z6), 0.0f, cardElevationC.f(z6, r48Var4, dVar3, ((i11 >> 6) & 14) | ((i11 >> 9) & 896)).getValue().getValue(), borderStroke5, r48Var4, ko1.e(-1347531112, z3, new b(ps4Var), dVar3, 54), dVar2, (i11 & 8190) | (234881024 & (i11 << 6)), 6, 64);
                            if (e.k()) {
                                e.n();
                            }
                            p61Var3 = p61VarA;
                            cardElevation2 = cardElevationC;
                            r48Var2 = r48Var3;
                            bVar3 = bVar4;
                            z5 = z6;
                            xkbVar2 = xkbVar3;
                            borderStroke3 = borderStroke5;
                        } else {
                            dVarF.q();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            xkbVar3 = xkbVarE;
                            p61VarA = p61Var2;
                            z3 = true;
                            borderStroke5 = borderStroke2;
                            dVar3 = dVarF;
                            bVar4 = bVar2;
                            z6 = z2;
                            cardElevationC = cardElevation;
                            i11 = i3;
                        }
                        r48Var3 = r48Var;
                        dVar3.M();
                        if (e.k()) {
                            e.o(2136075085, i11, -1, "androidx.compose.material3.Card (Card.kt:145)");
                        }
                        if (r48Var3 == null) {
                            dVar3.y(1577885006);
                            objR = dVar3.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = k26.a();
                                dVar3.L(objR);
                            }
                            r48Var4 = (r48) objR;
                            dVar3.u();
                        } else {
                            dVar3.y(-226195799);
                            dVar3.u();
                            r48Var4 = r48Var3;
                        }
                        dVar2 = dVar3;
                        afc.e(function0, bVar4, z6, xkbVar3, p61VarA.a(z6), p61VarA.b(z6), 0.0f, cardElevationC.f(z6, r48Var4, dVar3, ((i11 >> 6) & 14) | ((i11 >> 9) & 896)).getValue().getValue(), borderStroke5, r48Var4, ko1.e(-1347531112, z3, new b(ps4Var), dVar3, 54), dVar2, (i11 & 8190) | (234881024 & (i11 << 6)), 6, 64);
                        if (e.k()) {
                            e.n();
                        }
                        p61Var3 = p61VarA;
                        cardElevation2 = cardElevationC;
                        r48Var2 = r48Var3;
                        bVar3 = bVar4;
                        z5 = z6;
                        xkbVar2 = xkbVar3;
                        borderStroke3 = borderStroke5;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        cardElevation2 = cardElevation;
                        bVar3 = bVar2;
                        z5 = z2;
                        xkbVar2 = xkbVarE;
                        p61Var3 = p61Var2;
                        borderStroke3 = borderStroke;
                        r48Var2 = r48Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.r61
                            public final Object invoke(Object obj, Object obj2) {
                                return t61.f(function0, bVar3, z5, xkbVar2, p61Var3, cardElevation2, borderStroke3, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 1572864;
                borderStroke2 = borderStroke;
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (dVarF.x(r48Var)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i2 & 256) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                z3 = true;
                if ((38347923 & i3) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarE = q61.a.e(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            p61VarA = q61.a.a(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            p61VarA = p61Var2;
                        }
                        if ((i2 & 32) != 0) {
                            cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                            dVar3 = dVarF;
                            i3 &= -458753;
                        } else {
                            dVar3 = dVarF;
                            cardElevationC = cardElevation;
                        }
                        if (i6 != 0) {
                            borderStroke4 = null;
                        } else {
                            borderStroke4 = borderStroke;
                        }
                        if (i8 != 0) {
                            androidx.compose.ui.b bVar6 = bVar2;
                            i11 = i3;
                            r48Var3 = null;
                            bVar4 = bVar6;
                            xkbVar3 = xkbVarE;
                            borderStroke5 = borderStroke4;
                            z6 = z2;
                        } else {
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarE;
                            borderStroke5 = borderStroke4;
                            i11 = i3;
                            z6 = z2;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i12 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarE = q61.a.e(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            p61VarA = q61.a.a(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            p61VarA = p61Var2;
                        }
                        if ((i2 & 32) != 0) {
                            cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                            dVar3 = dVarF;
                            i3 &= -458753;
                        } else {
                            dVar3 = dVarF;
                            cardElevationC = cardElevation;
                        }
                        if (i6 != 0) {
                            borderStroke4 = null;
                        } else {
                            borderStroke4 = borderStroke;
                        }
                        if (i8 != 0) {
                            androidx.compose.ui.b bVar7 = bVar2;
                            i11 = i3;
                            r48Var3 = null;
                            bVar4 = bVar7;
                            xkbVar3 = xkbVarE;
                            borderStroke5 = borderStroke4;
                            z6 = z2;
                        } else {
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarE;
                            borderStroke5 = borderStroke4;
                            i11 = i3;
                            z6 = z2;
                            r48Var3 = r48Var;
                        }
                    }
                    dVar3.M();
                    if (e.k()) {
                        e.o(2136075085, i11, -1, "androidx.compose.material3.Card (Card.kt:145)");
                    }
                    if (r48Var3 == null) {
                        dVar3.y(1577885006);
                        objR = dVar3.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = k26.a();
                            dVar3.L(objR);
                        }
                        r48Var4 = (r48) objR;
                        dVar3.u();
                    } else {
                        dVar3.y(-226195799);
                        dVar3.u();
                        r48Var4 = r48Var3;
                    }
                    dVar2 = dVar3;
                    afc.e(function0, bVar4, z6, xkbVar3, p61VarA.a(z6), p61VarA.b(z6), 0.0f, cardElevationC.f(z6, r48Var4, dVar3, ((i11 >> 6) & 14) | ((i11 >> 9) & 896)).getValue().getValue(), borderStroke5, r48Var4, ko1.e(-1347531112, z3, new b(ps4Var), dVar3, 54), dVar2, (i11 & 8190) | (234881024 & (i11 << 6)), 6, 64);
                    if (e.k()) {
                        e.n();
                    }
                    p61Var3 = p61VarA;
                    cardElevation2 = cardElevationC;
                    r48Var2 = r48Var3;
                    bVar3 = bVar4;
                    z5 = z6;
                    xkbVar2 = xkbVar3;
                    borderStroke3 = borderStroke5;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    cardElevation2 = cardElevation;
                    bVar3 = bVar2;
                    z5 = z2;
                    xkbVar2 = xkbVarE;
                    p61Var3 = p61Var2;
                    borderStroke3 = borderStroke;
                    r48Var2 = r48Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.r61
                        public final Object invoke(Object obj, Object obj2) {
                            return t61.f(function0, bVar3, z5, xkbVar2, p61Var3, cardElevation2, borderStroke3, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    xkbVarE = xkbVar;
                    if (dVarF.x(xkbVarE)) {
                    }
                    i3 |= i13;
                } else {
                    xkbVarE = xkbVar;
                }
                i3 |= i13;
            } else {
                xkbVarE = xkbVar;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    p61Var2 = p61Var;
                    if (dVarF.x(p61Var2)) {
                    }
                    i3 |= i14;
                } else {
                    p61Var2 = p61Var;
                }
                i3 |= i14;
            } else {
                p61Var2 = p61Var;
            }
            if ((196608 & i) != 0) {
                i3 |= ((i2 & 32) == 0 || !dVarF.x(cardElevation)) ? 65536 : 131072;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    borderStroke2 = borderStroke;
                    if (dVarF.x(borderStroke2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (dVarF.x(r48Var)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i2 & 256) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                z3 = true;
                if ((38347923 & i3) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarE = q61.a.e(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            p61VarA = q61.a.a(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            p61VarA = p61Var2;
                        }
                        if ((i2 & 32) != 0) {
                            cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                            dVar3 = dVarF;
                            i3 &= -458753;
                        } else {
                            dVar3 = dVarF;
                            cardElevationC = cardElevation;
                        }
                        if (i6 != 0) {
                            borderStroke4 = null;
                        } else {
                            borderStroke4 = borderStroke;
                        }
                        if (i8 != 0) {
                            androidx.compose.ui.b bVar8 = bVar2;
                            i11 = i3;
                            r48Var3 = null;
                            bVar4 = bVar8;
                            xkbVar3 = xkbVarE;
                            borderStroke5 = borderStroke4;
                            z6 = z2;
                        } else {
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarE;
                            borderStroke5 = borderStroke4;
                            i11 = i3;
                            z6 = z2;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i12 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarE = q61.a.e(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            p61VarA = q61.a.a(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            p61VarA = p61Var2;
                        }
                        if ((i2 & 32) != 0) {
                            cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                            dVar3 = dVarF;
                            i3 &= -458753;
                        } else {
                            dVar3 = dVarF;
                            cardElevationC = cardElevation;
                        }
                        if (i6 != 0) {
                            borderStroke4 = null;
                        } else {
                            borderStroke4 = borderStroke;
                        }
                        if (i8 != 0) {
                            androidx.compose.ui.b bVar9 = bVar2;
                            i11 = i3;
                            r48Var3 = null;
                            bVar4 = bVar9;
                            xkbVar3 = xkbVarE;
                            borderStroke5 = borderStroke4;
                            z6 = z2;
                        } else {
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarE;
                            borderStroke5 = borderStroke4;
                            i11 = i3;
                            z6 = z2;
                            r48Var3 = r48Var;
                        }
                    }
                    dVar3.M();
                    if (e.k()) {
                        e.o(2136075085, i11, -1, "androidx.compose.material3.Card (Card.kt:145)");
                    }
                    if (r48Var3 == null) {
                        dVar3.y(1577885006);
                        objR = dVar3.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = k26.a();
                            dVar3.L(objR);
                        }
                        r48Var4 = (r48) objR;
                        dVar3.u();
                    } else {
                        dVar3.y(-226195799);
                        dVar3.u();
                        r48Var4 = r48Var3;
                    }
                    dVar2 = dVar3;
                    afc.e(function0, bVar4, z6, xkbVar3, p61VarA.a(z6), p61VarA.b(z6), 0.0f, cardElevationC.f(z6, r48Var4, dVar3, ((i11 >> 6) & 14) | ((i11 >> 9) & 896)).getValue().getValue(), borderStroke5, r48Var4, ko1.e(-1347531112, z3, new b(ps4Var), dVar3, 54), dVar2, (i11 & 8190) | (234881024 & (i11 << 6)), 6, 64);
                    if (e.k()) {
                        e.n();
                    }
                    p61Var3 = p61VarA;
                    cardElevation2 = cardElevationC;
                    r48Var2 = r48Var3;
                    bVar3 = bVar4;
                    z5 = z6;
                    xkbVar2 = xkbVar3;
                    borderStroke3 = borderStroke5;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    cardElevation2 = cardElevation;
                    bVar3 = bVar2;
                    z5 = z2;
                    xkbVar2 = xkbVarE;
                    p61Var3 = p61Var2;
                    borderStroke3 = borderStroke;
                    r48Var2 = r48Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.r61
                        public final Object invoke(Object obj, Object obj2) {
                            return t61.f(function0, bVar3, z5, xkbVar2, p61Var3, cardElevation2, borderStroke3, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 1572864;
            borderStroke2 = borderStroke;
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (dVarF.x(r48Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i2 & 256) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            z3 = true;
            if ((38347923 & i3) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        xkbVarE = q61.a.e(dVarF, 6);
                    }
                    if ((i2 & 16) != 0) {
                        p61VarA = q61.a.a(dVarF, 6);
                        i3 &= -57345;
                    } else {
                        p61VarA = p61Var2;
                    }
                    if ((i2 & 32) != 0) {
                        cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                        dVar3 = dVarF;
                        i3 &= -458753;
                    } else {
                        dVar3 = dVarF;
                        cardElevationC = cardElevation;
                    }
                    if (i6 != 0) {
                        borderStroke4 = null;
                    } else {
                        borderStroke4 = borderStroke;
                    }
                    if (i8 != 0) {
                        androidx.compose.ui.b bVar10 = bVar2;
                        i11 = i3;
                        r48Var3 = null;
                        bVar4 = bVar10;
                        xkbVar3 = xkbVarE;
                        borderStroke5 = borderStroke4;
                        z6 = z2;
                    } else {
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarE;
                        borderStroke5 = borderStroke4;
                        i11 = i3;
                        z6 = z2;
                        r48Var3 = r48Var;
                    }
                } else {
                    if (i12 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        xkbVarE = q61.a.e(dVarF, 6);
                    }
                    if ((i2 & 16) != 0) {
                        p61VarA = q61.a.a(dVarF, 6);
                        i3 &= -57345;
                    } else {
                        p61VarA = p61Var2;
                    }
                    if ((i2 & 32) != 0) {
                        cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                        dVar3 = dVarF;
                        i3 &= -458753;
                    } else {
                        dVar3 = dVarF;
                        cardElevationC = cardElevation;
                    }
                    if (i6 != 0) {
                        borderStroke4 = null;
                    } else {
                        borderStroke4 = borderStroke;
                    }
                    if (i8 != 0) {
                        androidx.compose.ui.b bVar11 = bVar2;
                        i11 = i3;
                        r48Var3 = null;
                        bVar4 = bVar11;
                        xkbVar3 = xkbVarE;
                        borderStroke5 = borderStroke4;
                        z6 = z2;
                    } else {
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarE;
                        borderStroke5 = borderStroke4;
                        i11 = i3;
                        z6 = z2;
                        r48Var3 = r48Var;
                    }
                }
                dVar3.M();
                if (e.k()) {
                    e.o(2136075085, i11, -1, "androidx.compose.material3.Card (Card.kt:145)");
                }
                if (r48Var3 == null) {
                    dVar3.y(1577885006);
                    objR = dVar3.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = k26.a();
                        dVar3.L(objR);
                    }
                    r48Var4 = (r48) objR;
                    dVar3.u();
                } else {
                    dVar3.y(-226195799);
                    dVar3.u();
                    r48Var4 = r48Var3;
                }
                dVar2 = dVar3;
                afc.e(function0, bVar4, z6, xkbVar3, p61VarA.a(z6), p61VarA.b(z6), 0.0f, cardElevationC.f(z6, r48Var4, dVar3, ((i11 >> 6) & 14) | ((i11 >> 9) & 896)).getValue().getValue(), borderStroke5, r48Var4, ko1.e(-1347531112, z3, new b(ps4Var), dVar3, 54), dVar2, (i11 & 8190) | (234881024 & (i11 << 6)), 6, 64);
                if (e.k()) {
                    e.n();
                }
                p61Var3 = p61VarA;
                cardElevation2 = cardElevationC;
                r48Var2 = r48Var3;
                bVar3 = bVar4;
                z5 = z6;
                xkbVar2 = xkbVar3;
                borderStroke3 = borderStroke5;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                cardElevation2 = cardElevation;
                bVar3 = bVar2;
                z5 = z2;
                xkbVar2 = xkbVarE;
                p61Var3 = p61Var2;
                borderStroke3 = borderStroke;
                r48Var2 = r48Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.r61
                    public final Object invoke(Object obj, Object obj2) {
                        return t61.f(function0, bVar3, z5, xkbVar2, p61Var3, cardElevation2, borderStroke3, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        bVar2 = bVar;
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
                if ((i2 & 8) == 0) {
                    xkbVarE = xkbVar;
                    if (dVarF.x(xkbVarE)) {
                    }
                    i3 |= i13;
                } else {
                    xkbVarE = xkbVar;
                }
                i3 |= i13;
            } else {
                xkbVarE = xkbVar;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    p61Var2 = p61Var;
                    if (dVarF.x(p61Var2)) {
                    }
                    i3 |= i14;
                } else {
                    p61Var2 = p61Var;
                }
                i3 |= i14;
            } else {
                p61Var2 = p61Var;
            }
            if ((196608 & i) != 0) {
                i3 |= ((i2 & 32) == 0 || !dVarF.x(cardElevation)) ? 65536 : 131072;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    borderStroke2 = borderStroke;
                    if (dVarF.x(borderStroke2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (dVarF.x(r48Var)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i2 & 256) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                z3 = true;
                if ((38347923 & i3) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarE = q61.a.e(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            p61VarA = q61.a.a(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            p61VarA = p61Var2;
                        }
                        if ((i2 & 32) != 0) {
                            cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                            dVar3 = dVarF;
                            i3 &= -458753;
                        } else {
                            dVar3 = dVarF;
                            cardElevationC = cardElevation;
                        }
                        if (i6 != 0) {
                            borderStroke4 = null;
                        } else {
                            borderStroke4 = borderStroke;
                        }
                        if (i8 != 0) {
                            androidx.compose.ui.b bVar12 = bVar2;
                            i11 = i3;
                            r48Var3 = null;
                            bVar4 = bVar12;
                            xkbVar3 = xkbVarE;
                            borderStroke5 = borderStroke4;
                            z6 = z2;
                        } else {
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarE;
                            borderStroke5 = borderStroke4;
                            i11 = i3;
                            z6 = z2;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i12 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarE = q61.a.e(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            p61VarA = q61.a.a(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            p61VarA = p61Var2;
                        }
                        if ((i2 & 32) != 0) {
                            cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                            dVar3 = dVarF;
                            i3 &= -458753;
                        } else {
                            dVar3 = dVarF;
                            cardElevationC = cardElevation;
                        }
                        if (i6 != 0) {
                            borderStroke4 = null;
                        } else {
                            borderStroke4 = borderStroke;
                        }
                        if (i8 != 0) {
                            androidx.compose.ui.b bVar13 = bVar2;
                            i11 = i3;
                            r48Var3 = null;
                            bVar4 = bVar13;
                            xkbVar3 = xkbVarE;
                            borderStroke5 = borderStroke4;
                            z6 = z2;
                        } else {
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarE;
                            borderStroke5 = borderStroke4;
                            i11 = i3;
                            z6 = z2;
                            r48Var3 = r48Var;
                        }
                    }
                    dVar3.M();
                    if (e.k()) {
                        e.o(2136075085, i11, -1, "androidx.compose.material3.Card (Card.kt:145)");
                    }
                    if (r48Var3 == null) {
                        dVar3.y(1577885006);
                        objR = dVar3.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = k26.a();
                            dVar3.L(objR);
                        }
                        r48Var4 = (r48) objR;
                        dVar3.u();
                    } else {
                        dVar3.y(-226195799);
                        dVar3.u();
                        r48Var4 = r48Var3;
                    }
                    dVar2 = dVar3;
                    afc.e(function0, bVar4, z6, xkbVar3, p61VarA.a(z6), p61VarA.b(z6), 0.0f, cardElevationC.f(z6, r48Var4, dVar3, ((i11 >> 6) & 14) | ((i11 >> 9) & 896)).getValue().getValue(), borderStroke5, r48Var4, ko1.e(-1347531112, z3, new b(ps4Var), dVar3, 54), dVar2, (i11 & 8190) | (234881024 & (i11 << 6)), 6, 64);
                    if (e.k()) {
                        e.n();
                    }
                    p61Var3 = p61VarA;
                    cardElevation2 = cardElevationC;
                    r48Var2 = r48Var3;
                    bVar3 = bVar4;
                    z5 = z6;
                    xkbVar2 = xkbVar3;
                    borderStroke3 = borderStroke5;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    cardElevation2 = cardElevation;
                    bVar3 = bVar2;
                    z5 = z2;
                    xkbVar2 = xkbVarE;
                    p61Var3 = p61Var2;
                    borderStroke3 = borderStroke;
                    r48Var2 = r48Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.r61
                        public final Object invoke(Object obj, Object obj2) {
                            return t61.f(function0, bVar3, z5, xkbVar2, p61Var3, cardElevation2, borderStroke3, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 1572864;
            borderStroke2 = borderStroke;
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (dVarF.x(r48Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i2 & 256) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            z3 = true;
            if ((38347923 & i3) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        xkbVarE = q61.a.e(dVarF, 6);
                    }
                    if ((i2 & 16) != 0) {
                        p61VarA = q61.a.a(dVarF, 6);
                        i3 &= -57345;
                    } else {
                        p61VarA = p61Var2;
                    }
                    if ((i2 & 32) != 0) {
                        cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                        dVar3 = dVarF;
                        i3 &= -458753;
                    } else {
                        dVar3 = dVarF;
                        cardElevationC = cardElevation;
                    }
                    if (i6 != 0) {
                        borderStroke4 = null;
                    } else {
                        borderStroke4 = borderStroke;
                    }
                    if (i8 != 0) {
                        androidx.compose.ui.b bVar14 = bVar2;
                        i11 = i3;
                        r48Var3 = null;
                        bVar4 = bVar14;
                        xkbVar3 = xkbVarE;
                        borderStroke5 = borderStroke4;
                        z6 = z2;
                    } else {
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarE;
                        borderStroke5 = borderStroke4;
                        i11 = i3;
                        z6 = z2;
                        r48Var3 = r48Var;
                    }
                } else {
                    if (i12 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        xkbVarE = q61.a.e(dVarF, 6);
                    }
                    if ((i2 & 16) != 0) {
                        p61VarA = q61.a.a(dVarF, 6);
                        i3 &= -57345;
                    } else {
                        p61VarA = p61Var2;
                    }
                    if ((i2 & 32) != 0) {
                        cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                        dVar3 = dVarF;
                        i3 &= -458753;
                    } else {
                        dVar3 = dVarF;
                        cardElevationC = cardElevation;
                    }
                    if (i6 != 0) {
                        borderStroke4 = null;
                    } else {
                        borderStroke4 = borderStroke;
                    }
                    if (i8 != 0) {
                        androidx.compose.ui.b bVar15 = bVar2;
                        i11 = i3;
                        r48Var3 = null;
                        bVar4 = bVar15;
                        xkbVar3 = xkbVarE;
                        borderStroke5 = borderStroke4;
                        z6 = z2;
                    } else {
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarE;
                        borderStroke5 = borderStroke4;
                        i11 = i3;
                        z6 = z2;
                        r48Var3 = r48Var;
                    }
                }
                dVar3.M();
                if (e.k()) {
                    e.o(2136075085, i11, -1, "androidx.compose.material3.Card (Card.kt:145)");
                }
                if (r48Var3 == null) {
                    dVar3.y(1577885006);
                    objR = dVar3.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = k26.a();
                        dVar3.L(objR);
                    }
                    r48Var4 = (r48) objR;
                    dVar3.u();
                } else {
                    dVar3.y(-226195799);
                    dVar3.u();
                    r48Var4 = r48Var3;
                }
                dVar2 = dVar3;
                afc.e(function0, bVar4, z6, xkbVar3, p61VarA.a(z6), p61VarA.b(z6), 0.0f, cardElevationC.f(z6, r48Var4, dVar3, ((i11 >> 6) & 14) | ((i11 >> 9) & 896)).getValue().getValue(), borderStroke5, r48Var4, ko1.e(-1347531112, z3, new b(ps4Var), dVar3, 54), dVar2, (i11 & 8190) | (234881024 & (i11 << 6)), 6, 64);
                if (e.k()) {
                    e.n();
                }
                p61Var3 = p61VarA;
                cardElevation2 = cardElevationC;
                r48Var2 = r48Var3;
                bVar3 = bVar4;
                z5 = z6;
                xkbVar2 = xkbVar3;
                borderStroke3 = borderStroke5;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                cardElevation2 = cardElevation;
                bVar3 = bVar2;
                z5 = z2;
                xkbVar2 = xkbVarE;
                p61Var3 = p61Var2;
                borderStroke3 = borderStroke;
                r48Var2 = r48Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.r61
                    public final Object invoke(Object obj, Object obj2) {
                        return t61.f(function0, bVar3, z5, xkbVar2, p61Var3, cardElevation2, borderStroke3, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                xkbVarE = xkbVar;
                if (dVarF.x(xkbVarE)) {
                }
                i3 |= i13;
            } else {
                xkbVarE = xkbVar;
            }
            i3 |= i13;
        } else {
            xkbVarE = xkbVar;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                p61Var2 = p61Var;
                if (dVarF.x(p61Var2)) {
                }
                i3 |= i14;
            } else {
                p61Var2 = p61Var;
            }
            i3 |= i14;
        } else {
            p61Var2 = p61Var;
        }
        if ((196608 & i) != 0) {
            i3 |= ((i2 & 32) == 0 || !dVarF.x(cardElevation)) ? 65536 : 131072;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            if ((1572864 & i) == 0) {
                borderStroke2 = borderStroke;
                if (dVarF.x(borderStroke2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (dVarF.x(r48Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i2 & 256) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            z3 = true;
            if ((38347923 & i3) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        xkbVarE = q61.a.e(dVarF, 6);
                    }
                    if ((i2 & 16) != 0) {
                        p61VarA = q61.a.a(dVarF, 6);
                        i3 &= -57345;
                    } else {
                        p61VarA = p61Var2;
                    }
                    if ((i2 & 32) != 0) {
                        cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                        dVar3 = dVarF;
                        i3 &= -458753;
                    } else {
                        dVar3 = dVarF;
                        cardElevationC = cardElevation;
                    }
                    if (i6 != 0) {
                        borderStroke4 = null;
                    } else {
                        borderStroke4 = borderStroke;
                    }
                    if (i8 != 0) {
                        androidx.compose.ui.b bVar16 = bVar2;
                        i11 = i3;
                        r48Var3 = null;
                        bVar4 = bVar16;
                        xkbVar3 = xkbVarE;
                        borderStroke5 = borderStroke4;
                        z6 = z2;
                    } else {
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarE;
                        borderStroke5 = borderStroke4;
                        i11 = i3;
                        z6 = z2;
                        r48Var3 = r48Var;
                    }
                } else {
                    if (i12 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        xkbVarE = q61.a.e(dVarF, 6);
                    }
                    if ((i2 & 16) != 0) {
                        p61VarA = q61.a.a(dVarF, 6);
                        i3 &= -57345;
                    } else {
                        p61VarA = p61Var2;
                    }
                    if ((i2 & 32) != 0) {
                        cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                        dVar3 = dVarF;
                        i3 &= -458753;
                    } else {
                        dVar3 = dVarF;
                        cardElevationC = cardElevation;
                    }
                    if (i6 != 0) {
                        borderStroke4 = null;
                    } else {
                        borderStroke4 = borderStroke;
                    }
                    if (i8 != 0) {
                        androidx.compose.ui.b bVar17 = bVar2;
                        i11 = i3;
                        r48Var3 = null;
                        bVar4 = bVar17;
                        xkbVar3 = xkbVarE;
                        borderStroke5 = borderStroke4;
                        z6 = z2;
                    } else {
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarE;
                        borderStroke5 = borderStroke4;
                        i11 = i3;
                        z6 = z2;
                        r48Var3 = r48Var;
                    }
                }
                dVar3.M();
                if (e.k()) {
                    e.o(2136075085, i11, -1, "androidx.compose.material3.Card (Card.kt:145)");
                }
                if (r48Var3 == null) {
                    dVar3.y(1577885006);
                    objR = dVar3.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = k26.a();
                        dVar3.L(objR);
                    }
                    r48Var4 = (r48) objR;
                    dVar3.u();
                } else {
                    dVar3.y(-226195799);
                    dVar3.u();
                    r48Var4 = r48Var3;
                }
                dVar2 = dVar3;
                afc.e(function0, bVar4, z6, xkbVar3, p61VarA.a(z6), p61VarA.b(z6), 0.0f, cardElevationC.f(z6, r48Var4, dVar3, ((i11 >> 6) & 14) | ((i11 >> 9) & 896)).getValue().getValue(), borderStroke5, r48Var4, ko1.e(-1347531112, z3, new b(ps4Var), dVar3, 54), dVar2, (i11 & 8190) | (234881024 & (i11 << 6)), 6, 64);
                if (e.k()) {
                    e.n();
                }
                p61Var3 = p61VarA;
                cardElevation2 = cardElevationC;
                r48Var2 = r48Var3;
                bVar3 = bVar4;
                z5 = z6;
                xkbVar2 = xkbVar3;
                borderStroke3 = borderStroke5;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                cardElevation2 = cardElevation;
                bVar3 = bVar2;
                z5 = z2;
                xkbVar2 = xkbVarE;
                p61Var3 = p61Var2;
                borderStroke3 = borderStroke;
                r48Var2 = r48Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.r61
                    public final Object invoke(Object obj, Object obj2) {
                        return t61.f(function0, bVar3, z5, xkbVar2, p61Var3, cardElevation2, borderStroke3, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 1572864;
        borderStroke2 = borderStroke;
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (dVarF.x(r48Var)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (dVarF.T(ps4Var)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i3 |= i10;
        }
        z3 = true;
        if ((38347923 & i3) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (dVarF.g(z4, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    xkbVarE = q61.a.e(dVarF, 6);
                }
                if ((i2 & 16) != 0) {
                    p61VarA = q61.a.a(dVarF, 6);
                    i3 &= -57345;
                } else {
                    p61VarA = p61Var2;
                }
                if ((i2 & 32) != 0) {
                    cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                    dVar3 = dVarF;
                    i3 &= -458753;
                } else {
                    dVar3 = dVarF;
                    cardElevationC = cardElevation;
                }
                if (i6 != 0) {
                    borderStroke4 = null;
                } else {
                    borderStroke4 = borderStroke;
                }
                if (i8 != 0) {
                    androidx.compose.ui.b bVar18 = bVar2;
                    i11 = i3;
                    r48Var3 = null;
                    bVar4 = bVar18;
                    xkbVar3 = xkbVarE;
                    borderStroke5 = borderStroke4;
                    z6 = z2;
                } else {
                    bVar4 = bVar2;
                    xkbVar3 = xkbVarE;
                    borderStroke5 = borderStroke4;
                    i11 = i3;
                    z6 = z2;
                    r48Var3 = r48Var;
                }
            } else {
                if (i12 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    xkbVarE = q61.a.e(dVarF, 6);
                }
                if ((i2 & 16) != 0) {
                    p61VarA = q61.a.a(dVarF, 6);
                    i3 &= -57345;
                } else {
                    p61VarA = p61Var2;
                }
                if ((i2 & 32) != 0) {
                    cardElevationC = q61.a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dVarF, 1572864, 63);
                    dVar3 = dVarF;
                    i3 &= -458753;
                } else {
                    dVar3 = dVarF;
                    cardElevationC = cardElevation;
                }
                if (i6 != 0) {
                    borderStroke4 = null;
                } else {
                    borderStroke4 = borderStroke;
                }
                if (i8 != 0) {
                    androidx.compose.ui.b bVar19 = bVar2;
                    i11 = i3;
                    r48Var3 = null;
                    bVar4 = bVar19;
                    xkbVar3 = xkbVarE;
                    borderStroke5 = borderStroke4;
                    z6 = z2;
                } else {
                    bVar4 = bVar2;
                    xkbVar3 = xkbVarE;
                    borderStroke5 = borderStroke4;
                    i11 = i3;
                    z6 = z2;
                    r48Var3 = r48Var;
                }
            }
            dVar3.M();
            if (e.k()) {
                e.o(2136075085, i11, -1, "androidx.compose.material3.Card (Card.kt:145)");
            }
            if (r48Var3 == null) {
                dVar3.y(1577885006);
                objR = dVar3.R();
                if (objR == d.INSTANCE.a()) {
                    objR = k26.a();
                    dVar3.L(objR);
                }
                r48Var4 = (r48) objR;
                dVar3.u();
            } else {
                dVar3.y(-226195799);
                dVar3.u();
                r48Var4 = r48Var3;
            }
            dVar2 = dVar3;
            afc.e(function0, bVar4, z6, xkbVar3, p61VarA.a(z6), p61VarA.b(z6), 0.0f, cardElevationC.f(z6, r48Var4, dVar3, ((i11 >> 6) & 14) | ((i11 >> 9) & 896)).getValue().getValue(), borderStroke5, r48Var4, ko1.e(-1347531112, z3, new b(ps4Var), dVar3, 54), dVar2, (i11 & 8190) | (234881024 & (i11 << 6)), 6, 64);
            if (e.k()) {
                e.n();
            }
            p61Var3 = p61VarA;
            cardElevation2 = cardElevationC;
            r48Var2 = r48Var3;
            bVar3 = bVar4;
            z5 = z6;
            xkbVar2 = xkbVar3;
            borderStroke3 = borderStroke5;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            cardElevation2 = cardElevation;
            bVar3 = bVar2;
            z5 = z2;
            xkbVar2 = xkbVarE;
            p61Var3 = p61Var2;
            borderStroke3 = borderStroke;
            r48Var2 = r48Var;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.r61
                public final Object invoke(Object obj, Object obj2) {
                    return t61.f(function0, bVar3, z5, xkbVar2, p61Var3, cardElevation2, borderStroke3, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit e(androidx.compose.ui.b bVar, xkb xkbVar, p61 p61Var, CardElevation cardElevation, BorderStroke borderStroke, ps4 ps4Var, int i, int i2, d dVar, int i3) throws NoWhenBranchMatchedException {
        c(bVar, xkbVar, p61Var, cardElevation, borderStroke, ps4Var, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit f(Function0 function0, androidx.compose.ui.b bVar, boolean z, xkb xkbVar, p61 p61Var, CardElevation cardElevation, BorderStroke borderStroke, r48 r48Var, ps4 ps4Var, int i, int i2, d dVar, int i3) throws NoWhenBranchMatchedException {
        d(function0, bVar, z, xkbVar, p61Var, cardElevation, borderStroke, r48Var, ps4Var, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }
}
