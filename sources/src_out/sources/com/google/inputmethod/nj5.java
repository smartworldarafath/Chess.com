package com.google.inputmethod;

import androidx.compose.p001foundation.BackgroundKt;
import androidx.compose.p001foundation.ClickableKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p002material3.InteractiveComponentSizeKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a_\u0010\u000e\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aU\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a_\u0010\u0012\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a_\u0010\u0016\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/b;", "modifier", "", "enabled", "Lcom/google/android/gj5;", "colors", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/xkb;", "shape", "content", "h", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;ZLcom/google/android/gj5;Lcom/google/android/r48;Lcom/google/android/xkb;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "j", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function0;ZLcom/google/android/xkb;Lcom/google/android/gj5;Lcom/google/android/r48;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "f", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;ZLcom/google/android/xkb;Lcom/google/android/gj5;Lcom/google/android/r48;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/or0;", "border", "l", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;ZLcom/google/android/xkb;Lcom/google/android/gj5;Lcom/google/android/or0;Lcom/google/android/r48;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class nj5 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<d, Integer, Unit> {
        final /* synthetic */ Function2<d, Integer, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super d, ? super Integer, Unit> function2) {
            this.a = function2;
        }

        public final void a(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(669231714, i, -1, "androidx.compose.material3.SurfaceIconButton.<anonymous> (IconButton.kt:708)");
            }
            b bVarU = SizeKt.u(b.INSTANCE, hj5.i(hj5.a, 0, 1, null));
            tc tcVarE = tc.INSTANCE.e();
            Function2<d, Integer, Unit> function2 = this.a;
            ej7 ej7VarI = j.i(tcVarE, false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            b bVarE = ComposedModifierKt.e(dVar, bVarU);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion.b();
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
            dud.i(dVarC, ej7VarI, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            function2.invoke(dVar, 0);
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
    /* JADX WARN: Code duplicated, block: B:101:0x0110  */
    /* JADX WARN: Code duplicated, block: B:104:0x0117  */
    /* JADX WARN: Code duplicated, block: B:107:0x0124  */
    /* JADX WARN: Code duplicated, block: B:109:0x012e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0135  */
    /* JADX WARN: Code duplicated, block: B:114:0x0142  */
    /* JADX WARN: Code duplicated, block: B:117:0x0173  */
    /* JADX WARN: Code duplicated, block: B:119:0x017c  */
    /* JADX WARN: Code duplicated, block: B:122:0x018c  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00da  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:97:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x010a  */
    /* JADX WARN: Code duplicated, block: B:99:0x010d  */
    public static final void f(final Function0<Unit> function0, b bVar, boolean z, xkb xkbVar, gj5 gj5Var, r48 r48Var, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i, final int i2) throws NoWhenBranchMatchedException {
        Function0<Unit> function1;
        int i3;
        b bVar2;
        int i4;
        boolean z2;
        int i5;
        xkb xkbVarD;
        gj5 gj5VarB;
        int i6;
        r48 r48Var2;
        int i7;
        int i8;
        boolean z3;
        d dVar2;
        final b bVar3;
        final boolean z4;
        final xkb xkbVar2;
        final gj5 gj5Var2;
        final r48 r48Var3;
        s6b s6bVarH;
        b bVar4;
        r48 r48Var4;
        gj5 gj5Var3;
        b bVar5;
        d dVarF = dVar.F(947208840);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i & 6) == 0) {
                i3 = (dVarF.T(function1) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
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
                        xkbVarD = xkbVar;
                        int i10 = dVarF.x(xkbVarD) ? 2048 : 1024;
                        i3 |= i10;
                    } else {
                        xkbVarD = xkbVar;
                    }
                    i3 |= i10;
                } else {
                    xkbVarD = xkbVar;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        gj5VarB = gj5Var;
                        int i11 = dVarF.x(gj5VarB) ? 16384 : 8192;
                        i3 |= i11;
                    } else {
                        gj5VarB = gj5Var;
                    }
                    i3 |= i11;
                } else {
                    gj5VarB = gj5Var;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((i & 196608) == 0) {
                        r48Var2 = r48Var;
                        if (dVarF.x(r48Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 64) != 0) {
                        if ((i & 1572864) == 0) {
                            if (dVarF.T(function2)) {
                                i8 = 1048576;
                            } else {
                                i8 = 524288;
                            }
                            i3 |= i8;
                        }
                        if ((599187 & i3) != 599186) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i3 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0 || dVarF.t()) {
                                if (i9 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    xkbVarD = hj5.a.d(dVarF, 6);
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    gj5VarB = hj5.a.b(dVarF, 6);
                                }
                                if (i6 != 0) {
                                    r48Var4 = null;
                                } else {
                                    r48Var4 = r48Var2;
                                }
                                gj5Var3 = gj5VarB;
                                bVar5 = bVar4;
                            } else {
                                dVarF.q();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                z2 = z2;
                                xkbVarD = xkbVarD;
                                r48Var4 = r48Var2;
                                gj5Var3 = gj5VarB;
                                bVar5 = bVar2;
                            }
                            dVarF.M();
                            if (e.k()) {
                                e.o(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                            }
                            int i12 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                            int i13 = i3 << 3;
                            dVar2 = dVarF;
                            l(function1, bVar5, z2, xkbVarD, gj5Var3, null, r48Var4, function2, dVar2, i12 | (3670016 & i13) | (i13 & 29360128));
                            if (e.k()) {
                                e.n();
                            }
                            bVar3 = bVar5;
                            z4 = z2;
                            xkbVar2 = xkbVarD;
                            gj5Var2 = gj5Var3;
                            r48Var3 = r48Var4;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            bVar3 = bVar2;
                            z4 = z2;
                            xkbVar2 = xkbVarD;
                            gj5Var2 = gj5VarB;
                            r48Var3 = r48Var2;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.kj5
                                public final Object invoke(Object obj, Object obj2) {
                                    return nj5.g(function0, bVar3, z4, xkbVar2, gj5Var2, r48Var3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 1572864;
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                xkbVarD = hj5.a.d(dVarF, 6);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                gj5VarB = hj5.a.b(dVarF, 6);
                            }
                            if (i6 != 0) {
                                r48Var4 = null;
                            } else {
                                r48Var4 = r48Var2;
                            }
                            gj5Var3 = gj5VarB;
                            bVar5 = bVar4;
                        } else {
                            if (i9 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                xkbVarD = hj5.a.d(dVarF, 6);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                gj5VarB = hj5.a.b(dVarF, 6);
                            }
                            if (i6 != 0) {
                                r48Var4 = null;
                            } else {
                                r48Var4 = r48Var2;
                            }
                            gj5Var3 = gj5VarB;
                            bVar5 = bVar4;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                        }
                        int i14 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                        int i15 = i3 << 3;
                        dVar2 = dVarF;
                        l(function1, bVar5, z2, xkbVarD, gj5Var3, null, r48Var4, function2, dVar2, i14 | (3670016 & i15) | (i15 & 29360128));
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar5;
                        z4 = z2;
                        xkbVar2 = xkbVarD;
                        gj5Var2 = gj5Var3;
                        r48Var3 = r48Var4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar3 = bVar2;
                        z4 = z2;
                        xkbVar2 = xkbVarD;
                        gj5Var2 = gj5VarB;
                        r48Var3 = r48Var2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.kj5
                            public final Object invoke(Object obj, Object obj2) {
                                return nj5.g(function0, bVar3, z4, xkbVar2, gj5Var2, r48Var3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 196608;
                r48Var2 = r48Var;
                if ((i2 & 64) != 0) {
                    if ((i & 1572864) == 0) {
                        if (dVarF.T(function2)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i3 |= i8;
                    }
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                xkbVarD = hj5.a.d(dVarF, 6);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                gj5VarB = hj5.a.b(dVarF, 6);
                            }
                            if (i6 != 0) {
                                r48Var4 = null;
                            } else {
                                r48Var4 = r48Var2;
                            }
                            gj5Var3 = gj5VarB;
                            bVar5 = bVar4;
                        } else {
                            if (i9 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                xkbVarD = hj5.a.d(dVarF, 6);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                gj5VarB = hj5.a.b(dVarF, 6);
                            }
                            if (i6 != 0) {
                                r48Var4 = null;
                            } else {
                                r48Var4 = r48Var2;
                            }
                            gj5Var3 = gj5VarB;
                            bVar5 = bVar4;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                        }
                        int i16 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                        int i17 = i3 << 3;
                        dVar2 = dVarF;
                        l(function1, bVar5, z2, xkbVarD, gj5Var3, null, r48Var4, function2, dVar2, i16 | (3670016 & i17) | (i17 & 29360128));
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar5;
                        z4 = z2;
                        xkbVar2 = xkbVarD;
                        gj5Var2 = gj5Var3;
                        r48Var3 = r48Var4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar3 = bVar2;
                        z4 = z2;
                        xkbVar2 = xkbVarD;
                        gj5Var2 = gj5VarB;
                        r48Var3 = r48Var2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.kj5
                            public final Object invoke(Object obj, Object obj2) {
                                return nj5.g(function0, bVar3, z4, xkbVar2, gj5Var2, r48Var3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 1572864;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarD = hj5.a.d(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            gj5VarB = hj5.a.b(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        gj5Var3 = gj5VarB;
                        bVar5 = bVar4;
                    } else {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarD = hj5.a.d(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            gj5VarB = hj5.a.b(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        gj5Var3 = gj5VarB;
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                    }
                    int i18 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                    int i19 = i3 << 3;
                    dVar2 = dVarF;
                    l(function1, bVar5, z2, xkbVarD, gj5Var3, null, r48Var4, function2, dVar2, i18 | (3670016 & i19) | (i19 & 29360128));
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar5;
                    z4 = z2;
                    xkbVar2 = xkbVarD;
                    gj5Var2 = gj5Var3;
                    r48Var3 = r48Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    z4 = z2;
                    xkbVar2 = xkbVarD;
                    gj5Var2 = gj5VarB;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.kj5
                        public final Object invoke(Object obj, Object obj2) {
                            return nj5.g(function0, bVar3, z4, xkbVar2, gj5Var2, r48Var3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    xkbVarD = xkbVar;
                    if (dVarF.x(xkbVarD)) {
                    }
                    i3 |= i10;
                } else {
                    xkbVarD = xkbVar;
                }
                i3 |= i10;
            } else {
                xkbVarD = xkbVar;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    gj5VarB = gj5Var;
                    if (dVarF.x(gj5VarB)) {
                    }
                    i3 |= i11;
                } else {
                    gj5VarB = gj5Var;
                }
                i3 |= i11;
            } else {
                gj5VarB = gj5Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((i & 196608) == 0) {
                    r48Var2 = r48Var;
                    if (dVarF.x(r48Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 1572864) == 0) {
                        if (dVarF.T(function2)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i3 |= i8;
                    }
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                xkbVarD = hj5.a.d(dVarF, 6);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                gj5VarB = hj5.a.b(dVarF, 6);
                            }
                            if (i6 != 0) {
                                r48Var4 = null;
                            } else {
                                r48Var4 = r48Var2;
                            }
                            gj5Var3 = gj5VarB;
                            bVar5 = bVar4;
                        } else {
                            if (i9 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                xkbVarD = hj5.a.d(dVarF, 6);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                gj5VarB = hj5.a.b(dVarF, 6);
                            }
                            if (i6 != 0) {
                                r48Var4 = null;
                            } else {
                                r48Var4 = r48Var2;
                            }
                            gj5Var3 = gj5VarB;
                            bVar5 = bVar4;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                        }
                        int i110 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                        int i111 = i3 << 3;
                        dVar2 = dVarF;
                        l(function1, bVar5, z2, xkbVarD, gj5Var3, null, r48Var4, function2, dVar2, i110 | (3670016 & i111) | (i111 & 29360128));
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar5;
                        z4 = z2;
                        xkbVar2 = xkbVarD;
                        gj5Var2 = gj5Var3;
                        r48Var3 = r48Var4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar3 = bVar2;
                        z4 = z2;
                        xkbVar2 = xkbVarD;
                        gj5Var2 = gj5VarB;
                        r48Var3 = r48Var2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.kj5
                            public final Object invoke(Object obj, Object obj2) {
                                return nj5.g(function0, bVar3, z4, xkbVar2, gj5Var2, r48Var3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 1572864;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarD = hj5.a.d(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            gj5VarB = hj5.a.b(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        gj5Var3 = gj5VarB;
                        bVar5 = bVar4;
                    } else {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarD = hj5.a.d(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            gj5VarB = hj5.a.b(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        gj5Var3 = gj5VarB;
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                    }
                    int i112 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                    int i113 = i3 << 3;
                    dVar2 = dVarF;
                    l(function1, bVar5, z2, xkbVarD, gj5Var3, null, r48Var4, function2, dVar2, i112 | (3670016 & i113) | (i113 & 29360128));
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar5;
                    z4 = z2;
                    xkbVar2 = xkbVarD;
                    gj5Var2 = gj5Var3;
                    r48Var3 = r48Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    z4 = z2;
                    xkbVar2 = xkbVarD;
                    gj5Var2 = gj5VarB;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.kj5
                        public final Object invoke(Object obj, Object obj2) {
                            return nj5.g(function0, bVar3, z4, xkbVar2, gj5Var2, r48Var3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            r48Var2 = r48Var;
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    if (dVarF.T(function2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarD = hj5.a.d(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            gj5VarB = hj5.a.b(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        gj5Var3 = gj5VarB;
                        bVar5 = bVar4;
                    } else {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarD = hj5.a.d(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            gj5VarB = hj5.a.b(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        gj5Var3 = gj5VarB;
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                    }
                    int i114 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                    int i115 = i3 << 3;
                    dVar2 = dVarF;
                    l(function1, bVar5, z2, xkbVarD, gj5Var3, null, r48Var4, function2, dVar2, i114 | (3670016 & i115) | (i115 & 29360128));
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar5;
                    z4 = z2;
                    xkbVar2 = xkbVarD;
                    gj5Var2 = gj5Var3;
                    r48Var3 = r48Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    z4 = z2;
                    xkbVar2 = xkbVarD;
                    gj5Var2 = gj5VarB;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.kj5
                        public final Object invoke(Object obj, Object obj2) {
                            return nj5.g(function0, bVar3, z4, xkbVar2, gj5Var2, r48Var3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 1572864;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        xkbVarD = hj5.a.d(dVarF, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        gj5VarB = hj5.a.b(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    gj5Var3 = gj5VarB;
                    bVar5 = bVar4;
                } else {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        xkbVarD = hj5.a.d(dVarF, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        gj5VarB = hj5.a.b(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    gj5Var3 = gj5VarB;
                    bVar5 = bVar4;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                }
                int i116 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                int i117 = i3 << 3;
                dVar2 = dVarF;
                l(function1, bVar5, z2, xkbVarD, gj5Var3, null, r48Var4, function2, dVar2, i116 | (3670016 & i117) | (i117 & 29360128));
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar5;
                z4 = z2;
                xkbVar2 = xkbVarD;
                gj5Var2 = gj5Var3;
                r48Var3 = r48Var4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                z4 = z2;
                xkbVar2 = xkbVarD;
                gj5Var2 = gj5VarB;
                r48Var3 = r48Var2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.kj5
                    public final Object invoke(Object obj, Object obj2) {
                        return nj5.g(function0, bVar3, z4, xkbVar2, gj5Var2, r48Var3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
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
                    xkbVarD = xkbVar;
                    if (dVarF.x(xkbVarD)) {
                    }
                    i3 |= i10;
                } else {
                    xkbVarD = xkbVar;
                }
                i3 |= i10;
            } else {
                xkbVarD = xkbVar;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    gj5VarB = gj5Var;
                    if (dVarF.x(gj5VarB)) {
                    }
                    i3 |= i11;
                } else {
                    gj5VarB = gj5Var;
                }
                i3 |= i11;
            } else {
                gj5VarB = gj5Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((i & 196608) == 0) {
                    r48Var2 = r48Var;
                    if (dVarF.x(r48Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 1572864) == 0) {
                        if (dVarF.T(function2)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i3 |= i8;
                    }
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                xkbVarD = hj5.a.d(dVarF, 6);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                gj5VarB = hj5.a.b(dVarF, 6);
                            }
                            if (i6 != 0) {
                                r48Var4 = null;
                            } else {
                                r48Var4 = r48Var2;
                            }
                            gj5Var3 = gj5VarB;
                            bVar5 = bVar4;
                        } else {
                            if (i9 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                xkbVarD = hj5.a.d(dVarF, 6);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                gj5VarB = hj5.a.b(dVarF, 6);
                            }
                            if (i6 != 0) {
                                r48Var4 = null;
                            } else {
                                r48Var4 = r48Var2;
                            }
                            gj5Var3 = gj5VarB;
                            bVar5 = bVar4;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                        }
                        int i118 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                        int i119 = i3 << 3;
                        dVar2 = dVarF;
                        l(function1, bVar5, z2, xkbVarD, gj5Var3, null, r48Var4, function2, dVar2, i118 | (3670016 & i119) | (i119 & 29360128));
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar5;
                        z4 = z2;
                        xkbVar2 = xkbVarD;
                        gj5Var2 = gj5Var3;
                        r48Var3 = r48Var4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar3 = bVar2;
                        z4 = z2;
                        xkbVar2 = xkbVarD;
                        gj5Var2 = gj5VarB;
                        r48Var3 = r48Var2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.kj5
                            public final Object invoke(Object obj, Object obj2) {
                                return nj5.g(function0, bVar3, z4, xkbVar2, gj5Var2, r48Var3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 1572864;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarD = hj5.a.d(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            gj5VarB = hj5.a.b(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        gj5Var3 = gj5VarB;
                        bVar5 = bVar4;
                    } else {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarD = hj5.a.d(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            gj5VarB = hj5.a.b(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        gj5Var3 = gj5VarB;
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                    }
                    int i1110 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                    int i1111 = i3 << 3;
                    dVar2 = dVarF;
                    l(function1, bVar5, z2, xkbVarD, gj5Var3, null, r48Var4, function2, dVar2, i1110 | (3670016 & i1111) | (i1111 & 29360128));
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar5;
                    z4 = z2;
                    xkbVar2 = xkbVarD;
                    gj5Var2 = gj5Var3;
                    r48Var3 = r48Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    z4 = z2;
                    xkbVar2 = xkbVarD;
                    gj5Var2 = gj5VarB;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.kj5
                        public final Object invoke(Object obj, Object obj2) {
                            return nj5.g(function0, bVar3, z4, xkbVar2, gj5Var2, r48Var3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            r48Var2 = r48Var;
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    if (dVarF.T(function2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarD = hj5.a.d(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            gj5VarB = hj5.a.b(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        gj5Var3 = gj5VarB;
                        bVar5 = bVar4;
                    } else {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarD = hj5.a.d(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            gj5VarB = hj5.a.b(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        gj5Var3 = gj5VarB;
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                    }
                    int i1112 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                    int i1113 = i3 << 3;
                    dVar2 = dVarF;
                    l(function1, bVar5, z2, xkbVarD, gj5Var3, null, r48Var4, function2, dVar2, i1112 | (3670016 & i1113) | (i1113 & 29360128));
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar5;
                    z4 = z2;
                    xkbVar2 = xkbVarD;
                    gj5Var2 = gj5Var3;
                    r48Var3 = r48Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    z4 = z2;
                    xkbVar2 = xkbVarD;
                    gj5Var2 = gj5VarB;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.kj5
                        public final Object invoke(Object obj, Object obj2) {
                            return nj5.g(function0, bVar3, z4, xkbVar2, gj5Var2, r48Var3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 1572864;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        xkbVarD = hj5.a.d(dVarF, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        gj5VarB = hj5.a.b(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    gj5Var3 = gj5VarB;
                    bVar5 = bVar4;
                } else {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        xkbVarD = hj5.a.d(dVarF, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        gj5VarB = hj5.a.b(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    gj5Var3 = gj5VarB;
                    bVar5 = bVar4;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                }
                int i1114 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                int i1115 = i3 << 3;
                dVar2 = dVarF;
                l(function1, bVar5, z2, xkbVarD, gj5Var3, null, r48Var4, function2, dVar2, i1114 | (3670016 & i1115) | (i1115 & 29360128));
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar5;
                z4 = z2;
                xkbVar2 = xkbVarD;
                gj5Var2 = gj5Var3;
                r48Var3 = r48Var4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                z4 = z2;
                xkbVar2 = xkbVarD;
                gj5Var2 = gj5VarB;
                r48Var3 = r48Var2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.kj5
                    public final Object invoke(Object obj, Object obj2) {
                        return nj5.g(function0, bVar3, z4, xkbVar2, gj5Var2, r48Var3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                xkbVarD = xkbVar;
                if (dVarF.x(xkbVarD)) {
                }
                i3 |= i10;
            } else {
                xkbVarD = xkbVar;
            }
            i3 |= i10;
        } else {
            xkbVarD = xkbVar;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                gj5VarB = gj5Var;
                if (dVarF.x(gj5VarB)) {
                }
                i3 |= i11;
            } else {
                gj5VarB = gj5Var;
            }
            i3 |= i11;
        } else {
            gj5VarB = gj5Var;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((i & 196608) == 0) {
                r48Var2 = r48Var;
                if (dVarF.x(r48Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    if (dVarF.T(function2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarD = hj5.a.d(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            gj5VarB = hj5.a.b(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        gj5Var3 = gj5VarB;
                        bVar5 = bVar4;
                    } else {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            xkbVarD = hj5.a.d(dVarF, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            gj5VarB = hj5.a.b(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        gj5Var3 = gj5VarB;
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                    }
                    int i1116 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                    int i1117 = i3 << 3;
                    dVar2 = dVarF;
                    l(function1, bVar5, z2, xkbVarD, gj5Var3, null, r48Var4, function2, dVar2, i1116 | (3670016 & i1117) | (i1117 & 29360128));
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar5;
                    z4 = z2;
                    xkbVar2 = xkbVarD;
                    gj5Var2 = gj5Var3;
                    r48Var3 = r48Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    z4 = z2;
                    xkbVar2 = xkbVarD;
                    gj5Var2 = gj5VarB;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.kj5
                        public final Object invoke(Object obj, Object obj2) {
                            return nj5.g(function0, bVar3, z4, xkbVar2, gj5Var2, r48Var3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 1572864;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        xkbVarD = hj5.a.d(dVarF, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        gj5VarB = hj5.a.b(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    gj5Var3 = gj5VarB;
                    bVar5 = bVar4;
                } else {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        xkbVarD = hj5.a.d(dVarF, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        gj5VarB = hj5.a.b(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    gj5Var3 = gj5VarB;
                    bVar5 = bVar4;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                }
                int i1118 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                int i1119 = i3 << 3;
                dVar2 = dVarF;
                l(function1, bVar5, z2, xkbVarD, gj5Var3, null, r48Var4, function2, dVar2, i1118 | (3670016 & i1119) | (i1119 & 29360128));
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar5;
                z4 = z2;
                xkbVar2 = xkbVarD;
                gj5Var2 = gj5Var3;
                r48Var3 = r48Var4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                z4 = z2;
                xkbVar2 = xkbVarD;
                gj5Var2 = gj5VarB;
                r48Var3 = r48Var2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.kj5
                    public final Object invoke(Object obj, Object obj2) {
                        return nj5.g(function0, bVar3, z4, xkbVar2, gj5Var2, r48Var3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 196608;
        r48Var2 = r48Var;
        if ((i2 & 64) != 0) {
            if ((i & 1572864) == 0) {
                if (dVarF.T(function2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        xkbVarD = hj5.a.d(dVarF, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        gj5VarB = hj5.a.b(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    gj5Var3 = gj5VarB;
                    bVar5 = bVar4;
                } else {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        xkbVarD = hj5.a.d(dVarF, 6);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        gj5VarB = hj5.a.b(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    gj5Var3 = gj5VarB;
                    bVar5 = bVar4;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                }
                int i11110 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                int i11111 = i3 << 3;
                dVar2 = dVarF;
                l(function1, bVar5, z2, xkbVarD, gj5Var3, null, r48Var4, function2, dVar2, i11110 | (3670016 & i11111) | (i11111 & 29360128));
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar5;
                z4 = z2;
                xkbVar2 = xkbVarD;
                gj5Var2 = gj5Var3;
                r48Var3 = r48Var4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                z4 = z2;
                xkbVar2 = xkbVarD;
                gj5Var2 = gj5VarB;
                r48Var3 = r48Var2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.kj5
                    public final Object invoke(Object obj, Object obj2) {
                        return nj5.g(function0, bVar3, z4, xkbVar2, gj5Var2, r48Var3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 1572864;
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dVarF.g(z3, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    xkbVarD = hj5.a.d(dVarF, 6);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    gj5VarB = hj5.a.b(dVarF, 6);
                }
                if (i6 != 0) {
                    r48Var4 = null;
                } else {
                    r48Var4 = r48Var2;
                }
                gj5Var3 = gj5VarB;
                bVar5 = bVar4;
            } else {
                if (i9 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    xkbVarD = hj5.a.d(dVarF, 6);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    gj5VarB = hj5.a.b(dVarF, 6);
                }
                if (i6 != 0) {
                    r48Var4 = null;
                } else {
                    r48Var4 = r48Var2;
                }
                gj5Var3 = gj5VarB;
                bVar5 = bVar4;
            }
            dVarF.M();
            if (e.k()) {
                e.o(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
            }
            int i11112 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
            int i11113 = i3 << 3;
            dVar2 = dVarF;
            l(function1, bVar5, z2, xkbVarD, gj5Var3, null, r48Var4, function2, dVar2, i11112 | (3670016 & i11113) | (i11113 & 29360128));
            if (e.k()) {
                e.n();
            }
            bVar3 = bVar5;
            z4 = z2;
            xkbVar2 = xkbVarD;
            gj5Var2 = gj5Var3;
            r48Var3 = r48Var4;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bVar3 = bVar2;
            z4 = z2;
            xkbVar2 = xkbVarD;
            gj5Var2 = gj5VarB;
            r48Var3 = r48Var2;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.kj5
                public final Object invoke(Object obj, Object obj2) {
                    return nj5.g(function0, bVar3, z4, xkbVar2, gj5Var2, r48Var3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit g(Function0 function0, b bVar, boolean z, xkb xkbVar, gj5 gj5Var, r48 r48Var, Function2 function2, int i, int i2, d dVar, int i3) throws NoWhenBranchMatchedException {
        f(function0, bVar, z, xkbVar, gj5Var, r48Var, function2, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:101:0x010d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0114  */
    /* JADX WARN: Code duplicated, block: B:106:0x011f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0125  */
    /* JADX WARN: Code duplicated, block: B:110:0x012f  */
    /* JADX WARN: Code duplicated, block: B:113:0x013a  */
    /* JADX WARN: Code duplicated, block: B:116:0x016a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0173  */
    /* JADX WARN: Code duplicated, block: B:122:0x0183  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00be  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:97:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0107  */
    /* JADX WARN: Code duplicated, block: B:99:0x010a  */
    public static final void h(final Function0<Unit> function0, b bVar, boolean z, gj5 gj5Var, r48 r48Var, xkb xkbVar, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i, final int i2) throws NoWhenBranchMatchedException {
        Function0<Unit> function1;
        int i3;
        b bVar2;
        int i4;
        boolean z2;
        int i5;
        gj5 gj5VarF;
        int i6;
        r48 r48Var2;
        int i7;
        xkb xkbVarE;
        Function2<? super d, ? super Integer, Unit> function3;
        int i8;
        boolean z3;
        d dVar2;
        final b bVar3;
        final boolean z4;
        final gj5 gj5Var2;
        final r48 r48Var3;
        final xkb xkbVar2;
        s6b s6bVarH;
        b bVar4;
        b bVar5;
        d dVarF = dVar.F(1413012038);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i & 6) == 0) {
                i3 = (dVarF.T(function1) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
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
                        gj5VarF = gj5Var;
                        int i10 = dVarF.x(gj5VarF) ? 2048 : 1024;
                        i3 |= i10;
                    } else {
                        gj5VarF = gj5Var;
                    }
                    i3 |= i10;
                } else {
                    gj5VarF = gj5Var;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        r48Var2 = r48Var;
                        if (dVarF.x(r48Var2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            xkbVarE = xkbVar;
                            int i11 = dVarF.x(xkbVarE) ? 131072 : 65536;
                            i3 |= i11;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        i3 |= i11;
                    } else {
                        xkbVarE = xkbVar;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                        function3 = function2;
                    } else {
                        function3 = function2;
                        if ((i & 1572864) == 0) {
                            if (dVarF.T(function3)) {
                                i8 = 1048576;
                            } else {
                                i8 = 524288;
                            }
                            i3 |= i8;
                        }
                    }
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0 || dVarF.t()) {
                            if (i9 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                gj5VarF = hj5.a.f(dVarF, 6);
                            }
                            if (i6 != 0) {
                                r48Var2 = null;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                bVar5 = bVar4;
                                xkbVarE = hj5.a.e(dVarF, 6);
                            } else {
                                bVar5 = bVar4;
                            }
                        } else {
                            dVarF.q();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            bVar5 = bVar2;
                        }
                        gj5 gj5Var3 = gj5VarF;
                        r48 r48Var4 = r48Var2;
                        boolean z5 = z2;
                        dVarF.M();
                        if (e.k()) {
                            e.o(1413012038, i3, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
                        }
                        int i12 = i3 << 3;
                        dVar2 = dVarF;
                        j(bVar5, function1, z5, xkbVarE, gj5Var3, r48Var4, function3, dVar2, ((i3 >> 3) & 14) | (i12 & 112) | (i3 & 896) | ((i3 >> 6) & 7168) | (57344 & i12) | (i12 & 458752) | (i3 & 3670016));
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar5;
                        z4 = z5;
                        gj5Var2 = gj5Var3;
                        r48Var3 = r48Var4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar3 = bVar2;
                        z4 = z2;
                        gj5Var2 = gj5VarF;
                        r48Var3 = r48Var2;
                    }
                    xkbVar2 = xkbVarE;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.ij5
                            public final Object invoke(Object obj, Object obj2) {
                                return nj5.i(function0, bVar3, z4, gj5Var2, r48Var3, xkbVar2, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                r48Var2 = r48Var;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        xkbVarE = xkbVar;
                        if (dVarF.x(xkbVarE)) {
                        }
                        i3 |= i11;
                    } else {
                        xkbVarE = xkbVar;
                    }
                    i3 |= i11;
                } else {
                    xkbVarE = xkbVar;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i & 1572864) == 0) {
                        if (dVarF.T(function3)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i3 |= i8;
                    }
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            gj5VarF = hj5.a.f(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var2 = null;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            bVar5 = bVar4;
                            xkbVarE = hj5.a.e(dVarF, 6);
                        } else {
                            bVar5 = bVar4;
                        }
                    } else {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            gj5VarF = hj5.a.f(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var2 = null;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            bVar5 = bVar4;
                            xkbVarE = hj5.a.e(dVarF, 6);
                        } else {
                            bVar5 = bVar4;
                        }
                    }
                    gj5 gj5Var4 = gj5VarF;
                    r48 r48Var5 = r48Var2;
                    boolean z6 = z2;
                    dVarF.M();
                    if (e.k()) {
                        e.o(1413012038, i3, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
                    }
                    int i13 = i3 << 3;
                    dVar2 = dVarF;
                    j(bVar5, function1, z6, xkbVarE, gj5Var4, r48Var5, function3, dVar2, ((i3 >> 3) & 14) | (i13 & 112) | (i3 & 896) | ((i3 >> 6) & 7168) | (57344 & i13) | (i13 & 458752) | (i3 & 3670016));
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar5;
                    z4 = z6;
                    gj5Var2 = gj5Var4;
                    r48Var3 = r48Var5;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    z4 = z2;
                    gj5Var2 = gj5VarF;
                    r48Var3 = r48Var2;
                }
                xkbVar2 = xkbVarE;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ij5
                        public final Object invoke(Object obj, Object obj2) {
                            return nj5.i(function0, bVar3, z4, gj5Var2, r48Var3, xkbVar2, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    gj5VarF = gj5Var;
                    if (dVarF.x(gj5VarF)) {
                    }
                    i3 |= i10;
                } else {
                    gj5VarF = gj5Var;
                }
                i3 |= i10;
            } else {
                gj5VarF = gj5Var;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    r48Var2 = r48Var;
                    if (dVarF.x(r48Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        xkbVarE = xkbVar;
                        if (dVarF.x(xkbVarE)) {
                        }
                        i3 |= i11;
                    } else {
                        xkbVarE = xkbVar;
                    }
                    i3 |= i11;
                } else {
                    xkbVarE = xkbVar;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i & 1572864) == 0) {
                        if (dVarF.T(function3)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i3 |= i8;
                    }
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            gj5VarF = hj5.a.f(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var2 = null;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            bVar5 = bVar4;
                            xkbVarE = hj5.a.e(dVarF, 6);
                        } else {
                            bVar5 = bVar4;
                        }
                    } else {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            gj5VarF = hj5.a.f(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var2 = null;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            bVar5 = bVar4;
                            xkbVarE = hj5.a.e(dVarF, 6);
                        } else {
                            bVar5 = bVar4;
                        }
                    }
                    gj5 gj5Var5 = gj5VarF;
                    r48 r48Var6 = r48Var2;
                    boolean z7 = z2;
                    dVarF.M();
                    if (e.k()) {
                        e.o(1413012038, i3, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
                    }
                    int i14 = i3 << 3;
                    dVar2 = dVarF;
                    j(bVar5, function1, z7, xkbVarE, gj5Var5, r48Var6, function3, dVar2, ((i3 >> 3) & 14) | (i14 & 112) | (i3 & 896) | ((i3 >> 6) & 7168) | (57344 & i14) | (i14 & 458752) | (i3 & 3670016));
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar5;
                    z4 = z7;
                    gj5Var2 = gj5Var5;
                    r48Var3 = r48Var6;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    z4 = z2;
                    gj5Var2 = gj5VarF;
                    r48Var3 = r48Var2;
                }
                xkbVar2 = xkbVarE;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ij5
                        public final Object invoke(Object obj, Object obj2) {
                            return nj5.i(function0, bVar3, z4, gj5Var2, r48Var3, xkbVar2, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            r48Var2 = r48Var;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    xkbVarE = xkbVar;
                    if (dVarF.x(xkbVarE)) {
                    }
                    i3 |= i11;
                } else {
                    xkbVarE = xkbVar;
                }
                i3 |= i11;
            } else {
                xkbVarE = xkbVar;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i & 1572864) == 0) {
                    if (dVarF.T(function3)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        gj5VarF = hj5.a.f(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        bVar5 = bVar4;
                        xkbVarE = hj5.a.e(dVarF, 6);
                    } else {
                        bVar5 = bVar4;
                    }
                } else {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        gj5VarF = hj5.a.f(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        bVar5 = bVar4;
                        xkbVarE = hj5.a.e(dVarF, 6);
                    } else {
                        bVar5 = bVar4;
                    }
                }
                gj5 gj5Var6 = gj5VarF;
                r48 r48Var7 = r48Var2;
                boolean z8 = z2;
                dVarF.M();
                if (e.k()) {
                    e.o(1413012038, i3, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
                }
                int i15 = i3 << 3;
                dVar2 = dVarF;
                j(bVar5, function1, z8, xkbVarE, gj5Var6, r48Var7, function3, dVar2, ((i3 >> 3) & 14) | (i15 & 112) | (i3 & 896) | ((i3 >> 6) & 7168) | (57344 & i15) | (i15 & 458752) | (i3 & 3670016));
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar5;
                z4 = z8;
                gj5Var2 = gj5Var6;
                r48Var3 = r48Var7;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                z4 = z2;
                gj5Var2 = gj5VarF;
                r48Var3 = r48Var2;
            }
            xkbVar2 = xkbVarE;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ij5
                    public final Object invoke(Object obj, Object obj2) {
                        return nj5.i(function0, bVar3, z4, gj5Var2, r48Var3, xkbVar2, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
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
                    gj5VarF = gj5Var;
                    if (dVarF.x(gj5VarF)) {
                    }
                    i3 |= i10;
                } else {
                    gj5VarF = gj5Var;
                }
                i3 |= i10;
            } else {
                gj5VarF = gj5Var;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    r48Var2 = r48Var;
                    if (dVarF.x(r48Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        xkbVarE = xkbVar;
                        if (dVarF.x(xkbVarE)) {
                        }
                        i3 |= i11;
                    } else {
                        xkbVarE = xkbVar;
                    }
                    i3 |= i11;
                } else {
                    xkbVarE = xkbVar;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i & 1572864) == 0) {
                        if (dVarF.T(function3)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i3 |= i8;
                    }
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            gj5VarF = hj5.a.f(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var2 = null;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            bVar5 = bVar4;
                            xkbVarE = hj5.a.e(dVarF, 6);
                        } else {
                            bVar5 = bVar4;
                        }
                    } else {
                        if (i9 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            gj5VarF = hj5.a.f(dVarF, 6);
                        }
                        if (i6 != 0) {
                            r48Var2 = null;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            bVar5 = bVar4;
                            xkbVarE = hj5.a.e(dVarF, 6);
                        } else {
                            bVar5 = bVar4;
                        }
                    }
                    gj5 gj5Var7 = gj5VarF;
                    r48 r48Var8 = r48Var2;
                    boolean z9 = z2;
                    dVarF.M();
                    if (e.k()) {
                        e.o(1413012038, i3, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
                    }
                    int i16 = i3 << 3;
                    dVar2 = dVarF;
                    j(bVar5, function1, z9, xkbVarE, gj5Var7, r48Var8, function3, dVar2, ((i3 >> 3) & 14) | (i16 & 112) | (i3 & 896) | ((i3 >> 6) & 7168) | (57344 & i16) | (i16 & 458752) | (i3 & 3670016));
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar5;
                    z4 = z9;
                    gj5Var2 = gj5Var7;
                    r48Var3 = r48Var8;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    z4 = z2;
                    gj5Var2 = gj5VarF;
                    r48Var3 = r48Var2;
                }
                xkbVar2 = xkbVarE;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ij5
                        public final Object invoke(Object obj, Object obj2) {
                            return nj5.i(function0, bVar3, z4, gj5Var2, r48Var3, xkbVar2, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            r48Var2 = r48Var;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    xkbVarE = xkbVar;
                    if (dVarF.x(xkbVarE)) {
                    }
                    i3 |= i11;
                } else {
                    xkbVarE = xkbVar;
                }
                i3 |= i11;
            } else {
                xkbVarE = xkbVar;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i & 1572864) == 0) {
                    if (dVarF.T(function3)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        gj5VarF = hj5.a.f(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        bVar5 = bVar4;
                        xkbVarE = hj5.a.e(dVarF, 6);
                    } else {
                        bVar5 = bVar4;
                    }
                } else {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        gj5VarF = hj5.a.f(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        bVar5 = bVar4;
                        xkbVarE = hj5.a.e(dVarF, 6);
                    } else {
                        bVar5 = bVar4;
                    }
                }
                gj5 gj5Var8 = gj5VarF;
                r48 r48Var9 = r48Var2;
                boolean z10 = z2;
                dVarF.M();
                if (e.k()) {
                    e.o(1413012038, i3, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
                }
                int i17 = i3 << 3;
                dVar2 = dVarF;
                j(bVar5, function1, z10, xkbVarE, gj5Var8, r48Var9, function3, dVar2, ((i3 >> 3) & 14) | (i17 & 112) | (i3 & 896) | ((i3 >> 6) & 7168) | (57344 & i17) | (i17 & 458752) | (i3 & 3670016));
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar5;
                z4 = z10;
                gj5Var2 = gj5Var8;
                r48Var3 = r48Var9;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                z4 = z2;
                gj5Var2 = gj5VarF;
                r48Var3 = r48Var2;
            }
            xkbVar2 = xkbVarE;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ij5
                    public final Object invoke(Object obj, Object obj2) {
                        return nj5.i(function0, bVar3, z4, gj5Var2, r48Var3, xkbVar2, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                gj5VarF = gj5Var;
                if (dVarF.x(gj5VarF)) {
                }
                i3 |= i10;
            } else {
                gj5VarF = gj5Var;
            }
            i3 |= i10;
        } else {
            gj5VarF = gj5Var;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                r48Var2 = r48Var;
                if (dVarF.x(r48Var2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    xkbVarE = xkbVar;
                    if (dVarF.x(xkbVarE)) {
                    }
                    i3 |= i11;
                } else {
                    xkbVarE = xkbVar;
                }
                i3 |= i11;
            } else {
                xkbVarE = xkbVar;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i & 1572864) == 0) {
                    if (dVarF.T(function3)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        gj5VarF = hj5.a.f(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        bVar5 = bVar4;
                        xkbVarE = hj5.a.e(dVarF, 6);
                    } else {
                        bVar5 = bVar4;
                    }
                } else {
                    if (i9 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        gj5VarF = hj5.a.f(dVarF, 6);
                    }
                    if (i6 != 0) {
                        r48Var2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        bVar5 = bVar4;
                        xkbVarE = hj5.a.e(dVarF, 6);
                    } else {
                        bVar5 = bVar4;
                    }
                }
                gj5 gj5Var9 = gj5VarF;
                r48 r48Var10 = r48Var2;
                boolean z11 = z2;
                dVarF.M();
                if (e.k()) {
                    e.o(1413012038, i3, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
                }
                int i18 = i3 << 3;
                dVar2 = dVarF;
                j(bVar5, function1, z11, xkbVarE, gj5Var9, r48Var10, function3, dVar2, ((i3 >> 3) & 14) | (i18 & 112) | (i3 & 896) | ((i3 >> 6) & 7168) | (57344 & i18) | (i18 & 458752) | (i3 & 3670016));
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar5;
                z4 = z11;
                gj5Var2 = gj5Var9;
                r48Var3 = r48Var10;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                z4 = z2;
                gj5Var2 = gj5VarF;
                r48Var3 = r48Var2;
            }
            xkbVar2 = xkbVarE;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ij5
                    public final Object invoke(Object obj, Object obj2) {
                        return nj5.i(function0, bVar3, z4, gj5Var2, r48Var3, xkbVar2, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        r48Var2 = r48Var;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                xkbVarE = xkbVar;
                if (dVarF.x(xkbVarE)) {
                }
                i3 |= i11;
            } else {
                xkbVarE = xkbVar;
            }
            i3 |= i11;
        } else {
            xkbVarE = xkbVar;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
            function3 = function2;
        } else {
            function3 = function2;
            if ((i & 1572864) == 0) {
                if (dVarF.T(function3)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
        }
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dVarF.g(z3, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    gj5VarF = hj5.a.f(dVarF, 6);
                }
                if (i6 != 0) {
                    r48Var2 = null;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    bVar5 = bVar4;
                    xkbVarE = hj5.a.e(dVarF, 6);
                } else {
                    bVar5 = bVar4;
                }
            } else {
                if (i9 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    gj5VarF = hj5.a.f(dVarF, 6);
                }
                if (i6 != 0) {
                    r48Var2 = null;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    bVar5 = bVar4;
                    xkbVarE = hj5.a.e(dVarF, 6);
                } else {
                    bVar5 = bVar4;
                }
            }
            gj5 gj5Var10 = gj5VarF;
            r48 r48Var11 = r48Var2;
            boolean z12 = z2;
            dVarF.M();
            if (e.k()) {
                e.o(1413012038, i3, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
            }
            int i19 = i3 << 3;
            dVar2 = dVarF;
            j(bVar5, function1, z12, xkbVarE, gj5Var10, r48Var11, function3, dVar2, ((i3 >> 3) & 14) | (i19 & 112) | (i3 & 896) | ((i3 >> 6) & 7168) | (57344 & i19) | (i19 & 458752) | (i3 & 3670016));
            if (e.k()) {
                e.n();
            }
            bVar3 = bVar5;
            z4 = z12;
            gj5Var2 = gj5Var10;
            r48Var3 = r48Var11;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bVar3 = bVar2;
            z4 = z2;
            gj5Var2 = gj5VarF;
            r48Var3 = r48Var2;
        }
        xkbVar2 = xkbVarE;
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ij5
                public final Object invoke(Object obj, Object obj2) {
                    return nj5.i(function0, bVar3, z4, gj5Var2, r48Var3, xkbVar2, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit i(Function0 function0, b bVar, boolean z, gj5 gj5Var, r48 r48Var, xkb xkbVar, Function2 function2, int i, int i2, d dVar, int i3) throws NoWhenBranchMatchedException {
        h(function0, bVar, z, gj5Var, r48Var, xkbVar, function2, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    private static final void j(final b bVar, final Function0<Unit> function0, final boolean z, final xkb xkbVar, final gj5 gj5Var, final r48 r48Var, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        int i2;
        r48 r48Var2;
        d dVarF = dVar.F(-1134296466);
        if ((i & 6) == 0) {
            i2 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.A(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dVarF.x(xkbVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dVarF.x(gj5Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dVarF.x(r48Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= dVarF.T(function2) ? 1048576 : 524288;
        }
        if (dVarF.g((599187 & i2) != 599186, i2 & 1)) {
            if (e.k()) {
                e.o(-1134296466, i2, -1, "androidx.compose.material3.IconButtonImpl (IconButton.kt:171)");
            }
            if (r48Var == null) {
                dVarF.y(977045485);
                Object objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = k26.a();
                    dVarF.L(objR);
                }
                r48Var2 = (r48) objR;
                dVarF.u();
            } else {
                dVarF.y(862800938);
                dVarF.u();
                r48Var2 = r48Var;
            }
            int i3 = i2;
            b bVarC = va1.c(ClickableKt.m(BackgroundKt.c(ff1.a(SizeKt.u(InteractiveComponentSizeKt.h(bVar), hj5.i(hj5.a, 0, 1, null)), xkbVar), gj5Var.a(z), xkbVar), r48Var2, xoa.e(false, 0.0f, 0L, 7, null), z, null, hpa.j(hpa.INSTANCE.a()), function0, 8, null), null, 1, null);
            ej7 ej7VarI = j.i(tc.INSTANCE.e(), false);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            b bVarE = ComposedModifierKt.e(dVarF, bVarC);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarI, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            fs1.c(cz1.a().d(ei1.l(gj5Var.b(z))), function2, dVarF, os9.i | ((i3 >> 15) & 112));
            dVarF.m();
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.jj5
                public final Object invoke(Object obj, Object obj2) {
                    return nj5.k(bVar, function0, z, xkbVar, gj5Var, r48Var, function2, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(b bVar, Function0 function0, boolean z, xkb xkbVar, gj5 gj5Var, r48 r48Var, Function2 function2, int i, d dVar, int i2) {
        j(bVar, function0, z, xkbVar, gj5Var, r48Var, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    private static final void l(final Function0<Unit> function0, final b bVar, final boolean z, final xkb xkbVar, final gj5 gj5Var, final BorderStroke borderStroke, final r48 r48Var, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        int i2;
        d dVar2;
        d dVarF = dVar.F(-171935091);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.x(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.A(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dVarF.x(xkbVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dVarF.x(gj5Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dVarF.x(borderStroke) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= dVarF.x(r48Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= dVarF.T(function2) ? 8388608 : 4194304;
        }
        if (dVarF.g((4793491 & i2) != 4793490, i2 & 1)) {
            if (e.k()) {
                e.o(-171935091, i2, -1, "androidx.compose.material3.SurfaceIconButton (IconButton.kt:698)");
            }
            Object objR = dVarF.R();
            if (objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.lj5
                    public final Object invoke(Object obj) {
                        return nj5.m((nfb) obj);
                    }
                };
                dVarF.L(objR);
            }
            int i3 = i2 << 9;
            dVar2 = dVarF;
            afc.e(function0, afb.d(bVar, false, (Function1) objR, 1, null), z, xkbVar, gj5Var.a(z), gj5Var.b(z), 0.0f, 0.0f, borderStroke, r48Var, ko1.e(669231714, true, new a(function2), dVarF, 54), dVar2, (i2 & 8078) | (234881024 & i3) | (i3 & 1879048192), 6, 192);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar2 = dVarF;
            dVar2.q();
        }
        s6b s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.mj5
                public final Object invoke(Object obj, Object obj2) {
                    return nj5.n(function0, bVar, z, xkbVar, gj5Var, borderStroke, r48Var, function2, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(nfb nfbVar) {
        SemanticsPropertiesKt.p0(nfbVar, hpa.INSTANCE.a());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function0 function0, b bVar, boolean z, xkb xkbVar, gj5 gj5Var, BorderStroke borderStroke, r48 r48Var, Function2 function2, int i, d dVar, int i2) {
        l(function0, bVar, z, xkbVar, gj5Var, borderStroke, r48Var, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }
}
