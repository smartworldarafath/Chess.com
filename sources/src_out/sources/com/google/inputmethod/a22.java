package com.google.inputmethod;

import androidx.compose.p001foundation.BackgroundKt;
import androidx.compose.p001foundation.ClickableKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.IntrinsicKt;
import androidx.compose.p001foundation.layout.IntrinsicSize;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.c;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p001foundation.layout.o;
import androidx.compose.p001foundation.layout.t0;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001aC\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aK\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0014\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aW\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u001a\u0010'\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/google/android/rg9;", "popupPositionProvider", "Lkotlin/Function0;", "", "onDismiss", "Landroidx/compose/ui/b;", "modifier", "Lkotlin/Function1;", "Lcom/google/android/n12;", "contextMenuBuilderBlock", "r", "(Lcom/google/android/rg9;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/f12;", "colors", "q", "(Lcom/google/android/rg9;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;Lcom/google/android/f12;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)V", "k", "(Landroidx/compose/ui/b;Lcom/google/android/f12;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/xj1;", "content", "i", "(Lcom/google/android/f12;Landroidx/compose/ui/b;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "", "label", "", "enabled", "Lcom/google/android/ei1;", "leadingIcon", "onClick", "n", "(Ljava/lang/String;ZLcom/google/android/f12;Landroidx/compose/ui/b;Lcom/google/android/ps4;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/sg9;", "a", "Lcom/google/android/sg9;", "DefaultPopupProperties", "b", "Lcom/google/android/f12;", "v", "()Lcom/google/android/f12;", "DefaultContextMenuColors", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a22 {
    private static final sg9 a = new sg9(true, false, false, false, false, 30, null);
    private static final ContextMenuColors b;

    static {
        ei1.Companion companion = ei1.INSTANCE;
        b = new ContextMenuColors(companion.j(), companion.a(), companion.a(), ei1.p(companion.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ei1.p(companion.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x0141  */
    /* JADX WARN: Code duplicated, block: B:50:0x0145  */
    /* JADX WARN: Code duplicated, block: B:53:0x014f  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void i(ContextMenuColors contextMenuColors, b bVar, final ps4<? super xj1, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i, final int i2) {
        ContextMenuColors contextMenuColors2;
        int i3;
        b bVar2;
        boolean z;
        b bVar3;
        s6b s6bVarH;
        Function0<ComposeUiNode> function0B;
        int i4;
        d dVarF = dVar.F(-527864079);
        if ((i & 6) == 0) {
            contextMenuColors2 = contextMenuColors;
            i3 = (dVarF.x(contextMenuColors2) ? 4 : 2) | i;
        } else {
            contextMenuColors2 = contextMenuColors;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (dVarF.T(ps4Var)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i5 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (e.k()) {
                    e.o(-527864079, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.kt:153)");
                }
                o12 o12Var = o12.a;
                b bVarI = h9b.i(nx8.p(IntrinsicKt.b(BackgroundKt.d(rkb.g(bVar3, o12Var.j(), lqa.d(o12Var.c()), false, 0L, 0L, 28, null), contextMenuColors2.getBackgroundColor(), null, 2, null), IntrinsicSize.Max), 0.0f, o12Var.k(), 1, null), h9b.d(0, dVarF, 0, 1), false, null, false, 14, null);
                int i6 = (i3 << 3) & 7168;
                ej7 ej7VarA = o.a(c.a.k(), tc.INSTANCE.k(), dVarF, 0);
                int iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                gs1 gs1VarJ = dVarF.j();
                b bVarE = ComposedModifierKt.e(dVarF, bVarI);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                function0B = companion.b();
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
                dud.i(dVarC, ej7VarA, companion.d());
                dud.i(dVarC, gs1VarJ, companion.f());
                dud.i(dVarC, Integer.valueOf(iHashCode), companion.c());
                dud.g(dVarC, companion.a());
                dud.i(dVarC, bVarE, companion.e());
                ps4Var.invoke(yj1.a, dVarF, Integer.valueOf(((i6 >> 6) & 112) | 6));
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
            } else {
                dVarF.q();
                bVar3 = bVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final ContextMenuColors contextMenuColors3 = contextMenuColors2;
                final b bVar4 = bVar3;
                s6bVarH.a(new Function2() { // from class: com.google.android.w12
                    public final Object invoke(Object obj, Object obj2) {
                        return a22.j(contextMenuColors3, bVar4, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        bVar2 = bVar;
        if ((i & 384) == 0) {
            if (dVarF.T(ps4Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            if (i5 != 0) {
                bVar3 = b.INSTANCE;
            } else {
                bVar3 = bVar2;
            }
            if (e.k()) {
                e.o(-527864079, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.kt:153)");
            }
            o12 o12Var2 = o12.a;
            b bVarI2 = h9b.i(nx8.p(IntrinsicKt.b(BackgroundKt.d(rkb.g(bVar3, o12Var2.j(), lqa.d(o12Var2.c()), false, 0L, 0L, 28, null), contextMenuColors2.getBackgroundColor(), null, 2, null), IntrinsicSize.Max), 0.0f, o12Var2.k(), 1, null), h9b.d(0, dVarF, 0, 1), false, null, false, 14, null);
            int i7 = (i3 << 3) & 7168;
            ej7 ej7VarA2 = o.a(c.a.k(), tc.INSTANCE.k(), dVarF, 0);
            int iHashCode2 = Long.hashCode(pp1.b(dVarF, 0));
            gs1 gs1VarJ2 = dVarF.j();
            b bVarE2 = ComposedModifierKt.e(dVarF, bVarI2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            function0B = companion2.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            d dVarC2 = dud.c(dVarF);
            dud.i(dVarC2, ej7VarA2, companion2.d());
            dud.i(dVarC2, gs1VarJ2, companion2.f());
            dud.i(dVarC2, Integer.valueOf(iHashCode2), companion2.c());
            dud.g(dVarC2, companion2.a());
            dud.i(dVarC2, bVarE2, companion2.e());
            ps4Var.invoke(yj1.a, dVarF, Integer.valueOf(((i7 >> 6) & 112) | 6));
            dVarF.m();
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
            bVar3 = bVar2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            final ContextMenuColors contextMenuColors4 = contextMenuColors2;
            final b bVar5 = bVar3;
            s6bVarH.a(new Function2() { // from class: com.google.android.w12
                public final Object invoke(Object obj, Object obj2) {
                    return a22.j(contextMenuColors4, bVar5, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(ContextMenuColors contextMenuColors, b bVar, ps4 ps4Var, int i, int i2, d dVar, int i3) {
        i(contextMenuColors, bVar, ps4Var, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    public static final void k(b bVar, ContextMenuColors contextMenuColors, final Function1<? super n12, Unit> function1, d dVar, final int i, final int i2) {
        int i3;
        final b bVar2;
        final ContextMenuColors contextMenuColors2;
        d dVarF = dVar.F(-625529233);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dVarF.x(contextMenuColors) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= dVarF.T(function1) ? 256 : 128;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                bVar = b.INSTANCE;
            }
            b bVar3 = bVar;
            if (i5 != 0) {
                contextMenuColors = b;
            }
            final ContextMenuColors contextMenuColors3 = contextMenuColors;
            if (e.k()) {
                e.o(-625529233, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumnBuilder (ContextMenuUi.kt:132)");
            }
            i(contextMenuColors3, bVar3, ko1.e(-250345048, true, new ps4() { // from class: com.google.android.u12
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return a22.l(function1, contextMenuColors3, (xj1) obj, (d) obj2, ((Integer) obj3).intValue());
                }
            }, dVarF, 54), dVarF, ((i3 >> 3) & 14) | 384 | ((i3 << 3) & 112), 0);
            if (e.k()) {
                e.n();
            }
            contextMenuColors2 = contextMenuColors3;
            bVar2 = bVar3;
        } else {
            dVarF.q();
            bVar2 = bVar;
            contextMenuColors2 = contextMenuColors;
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.v12
                public final Object invoke(Object obj, Object obj2) {
                    return a22.m(bVar2, contextMenuColors2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function1 function1, ContextMenuColors contextMenuColors, xj1 xj1Var, d dVar, int i) {
        if (dVar.g((i & 17) != 16, i & 1)) {
            if (e.k()) {
                e.o(-250345048, i, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumnBuilder.<anonymous> (ContextMenuUi.kt:134)");
            }
            Object objR = dVar.R();
            if (objR == d.INSTANCE.a()) {
                objR = new n12(xo1.a.d());
                dVar.L(objR);
            }
            n12 n12Var = (n12) objR;
            n12Var.e();
            function1.invoke(n12Var);
            n12Var.c(contextMenuColors, dVar, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(b bVar, ContextMenuColors contextMenuColors, Function1 function1, int i, int i2, d dVar, int i3) {
        k(bVar, contextMenuColors, function1, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0227  */
    /* JADX WARN: Code duplicated, block: B:101:0x022c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0243  */
    /* JADX WARN: Code duplicated, block: B:105:0x0248  */
    /* JADX WARN: Code duplicated, block: B:108:0x027d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0283  */
    /* JADX WARN: Code duplicated, block: B:113:0x0290  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x0154  */
    /* JADX WARN: Code duplicated, block: B:86:0x0160  */
    /* JADX WARN: Code duplicated, block: B:87:0x0164  */
    /* JADX WARN: Code duplicated, block: B:90:0x0196  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f3  */
    public static final void n(final String str, final boolean z, final ContextMenuColors contextMenuColors, b bVar, ps4<? super ei1, ? super d, ? super Integer, Unit> ps4Var, final Function0<Unit> function0, d dVar, final int i, final int i2) {
        String str2;
        int i3;
        b bVar2;
        int i4;
        ps4<? super ei1, ? super d, ? super Integer, Unit> ps4Var2;
        int i5;
        int i6;
        boolean z2;
        d dVar2;
        final b bVar3;
        final ps4<? super ei1, ? super d, ? super Integer, Unit> ps4Var3;
        s6b s6bVarH;
        b bVar4;
        o12 o12Var;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objR;
        ComposeUiNode.Companion companion;
        Function0<ComposeUiNode> function0B;
        Function0<ComposeUiNode> function0B2;
        long disabledIconColor;
        long disabledTextColor;
        int i7;
        d dVarF = dVar.F(-2001167027);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (dVarF.x(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dVarF.A(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= dVarF.x(contextMenuColors) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    ps4Var2 = ps4Var;
                    if (dVarF.T(ps4Var2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((196608 & i) == 0) {
                    if (dVarF.T(function0)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i6 = i3;
                if ((74899 & i6) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i6 & 1)) {
                    if (i8 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        ps4Var2 = null;
                    }
                    if (e.k()) {
                        e.o(-2001167027, i6, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.kt:191)");
                    }
                    o12Var = o12.a;
                    tc.c cVarH = o12Var.h();
                    c.f fVarR = c.a.r(o12Var.f());
                    if ((i6 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((458752 & i6) == 131072) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z3 | z4;
                    objR = dVarF.R();
                    if (z5 || objR == d.INSTANCE.a()) {
                        objR = new Function0() { // from class: com.google.android.x12
                            public final Object invoke() {
                                return a22.o(z, function0);
                            }
                        };
                        dVarF.L(objR);
                    }
                    b bVar5 = bVar4;
                    b bVarP = nx8.p(SizeKt.w(SizeKt.h(ClickableKt.q(bVar5, z, str2, null, null, (Function0) objR, 12, null), 0.0f, 1, null), o12Var.b(), o12Var.i(), o12Var.a(), o12Var.i()), o12Var.f(), 0.0f, 2, null);
                    ej7 ej7VarB = t0.b(fVarR, cVarH, dVarF, 54);
                    int iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                    gs1 gs1VarJ = dVarF.j();
                    b bVarE = ComposedModifierKt.e(dVarF, bVarP);
                    companion = ComposeUiNode.INSTANCE;
                    function0B = companion.b();
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
                    dud.i(dVarC, ej7VarB, companion.d());
                    dud.i(dVarC, gs1VarJ, companion.f());
                    dud.i(dVarC, Integer.valueOf(iHashCode), companion.c());
                    dud.g(dVarC, companion.a());
                    dud.i(dVarC, bVarE, companion.e());
                    ira iraVar = ira.a;
                    if (ps4Var2 == null) {
                        dVarF.y(-1597947094);
                        dVarF.u();
                    } else {
                        dVarF.y(-1597947093);
                        b bVarP2 = SizeKt.p(b.INSTANCE, o12Var.g(), 0.0f, o12Var.g(), o12Var.g(), 2, null);
                        ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
                        int iHashCode2 = Long.hashCode(pp1.b(dVarF, 0));
                        gs1 gs1VarJ2 = dVarF.j();
                        b bVarE2 = ComposedModifierKt.e(dVarF, bVarP2);
                        function0B2 = companion.b();
                        if (dVarF.G() == null) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0B2);
                        } else {
                            dVarF.k();
                        }
                        d dVarC2 = dud.c(dVarF);
                        dud.i(dVarC2, ej7VarI, companion.d());
                        dud.i(dVarC2, gs1VarJ2, companion.f());
                        dud.i(dVarC2, Integer.valueOf(iHashCode2), companion.c());
                        dud.g(dVarC2, companion.a());
                        dud.i(dVarC2, bVarE2, companion.e());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                        if (z) {
                            disabledIconColor = contextMenuColors.getIconColor();
                        } else {
                            disabledIconColor = contextMenuColors.getDisabledIconColor();
                        }
                        ps4Var2.invoke(ei1.l(disabledIconColor), dVarF, 0);
                        dVarF.m();
                        dVarF.u();
                    }
                    if (z) {
                        disabledTextColor = contextMenuColors.getTextColor();
                    } else {
                        disabledTextColor = contextMenuColors.getDisabledTextColor();
                    }
                    ps4<? super ei1, ? super d, ? super Integer, Unit> ps4Var4 = ps4Var2;
                    dVar2 = dVarF;
                    mi0.q(str, iraVar.a(b.INSTANCE, 1.0f, true), o12Var.l(disabledTextColor), null, 0, false, 1, 0, null, null, dVar2, (i6 & 14) | 1572864, 952);
                    dVar2.m();
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar5;
                    ps4Var3 = ps4Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    ps4Var3 = ps4Var2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.y12
                        public final Object invoke(Object obj, Object obj2) {
                            return a22.p(str, z, contextMenuColors, bVar3, ps4Var3, function0, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            ps4Var2 = ps4Var;
            if ((196608 & i) == 0) {
                if (dVarF.T(function0)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i6 = i3;
            if ((74899 & i6) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i6 & 1)) {
                if (i8 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    ps4Var2 = null;
                }
                if (e.k()) {
                    e.o(-2001167027, i6, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.kt:191)");
                }
                o12Var = o12.a;
                tc.c cVarH2 = o12Var.h();
                c.f fVarR2 = c.a.r(o12Var.f());
                if ((i6 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((458752 & i6) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z3 | z4;
                objR = dVarF.R();
                if (z5) {
                    objR = new Function0() { // from class: com.google.android.x12
                        public final Object invoke() {
                            return a22.o(z, function0);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function0() { // from class: com.google.android.x12
                        public final Object invoke() {
                            return a22.o(z, function0);
                        }
                    };
                    dVarF.L(objR);
                }
                b bVar6 = bVar4;
                b bVarP3 = nx8.p(SizeKt.w(SizeKt.h(ClickableKt.q(bVar6, z, str2, null, null, (Function0) objR, 12, null), 0.0f, 1, null), o12Var.b(), o12Var.i(), o12Var.a(), o12Var.i()), o12Var.f(), 0.0f, 2, null);
                ej7 ej7VarB2 = t0.b(fVarR2, cVarH2, dVarF, 54);
                int iHashCode3 = Long.hashCode(pp1.b(dVarF, 0));
                gs1 gs1VarJ3 = dVarF.j();
                b bVarE3 = ComposedModifierKt.e(dVarF, bVarP3);
                companion = ComposeUiNode.INSTANCE;
                function0B = companion.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC3 = dud.c(dVarF);
                dud.i(dVarC3, ej7VarB2, companion.d());
                dud.i(dVarC3, gs1VarJ3, companion.f());
                dud.i(dVarC3, Integer.valueOf(iHashCode3), companion.c());
                dud.g(dVarC3, companion.a());
                dud.i(dVarC3, bVarE3, companion.e());
                ira iraVar2 = ira.a;
                if (ps4Var2 == null) {
                    dVarF.y(-1597947094);
                    dVarF.u();
                } else {
                    dVarF.y(-1597947093);
                    b bVarP4 = SizeKt.p(b.INSTANCE, o12Var.g(), 0.0f, o12Var.g(), o12Var.g(), 2, null);
                    ej7 ej7VarI2 = j.i(tc.INSTANCE.o(), false);
                    int iHashCode4 = Long.hashCode(pp1.b(dVarF, 0));
                    gs1 gs1VarJ4 = dVarF.j();
                    b bVarE4 = ComposedModifierKt.e(dVarF, bVarP4);
                    function0B2 = companion.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B2);
                    } else {
                        dVarF.k();
                    }
                    d dVarC4 = dud.c(dVarF);
                    dud.i(dVarC4, ej7VarI2, companion.d());
                    dud.i(dVarC4, gs1VarJ4, companion.f());
                    dud.i(dVarC4, Integer.valueOf(iHashCode4), companion.c());
                    dud.g(dVarC4, companion.a());
                    dud.i(dVarC4, bVarE4, companion.e());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
                    if (z) {
                        disabledIconColor = contextMenuColors.getIconColor();
                    } else {
                        disabledIconColor = contextMenuColors.getDisabledIconColor();
                    }
                    ps4Var2.invoke(ei1.l(disabledIconColor), dVarF, 0);
                    dVarF.m();
                    dVarF.u();
                }
                if (z) {
                    disabledTextColor = contextMenuColors.getTextColor();
                } else {
                    disabledTextColor = contextMenuColors.getDisabledTextColor();
                }
                ps4<? super ei1, ? super d, ? super Integer, Unit> ps4Var5 = ps4Var2;
                dVar2 = dVarF;
                mi0.q(str, iraVar2.a(b.INSTANCE, 1.0f, true), o12Var.l(disabledTextColor), null, 0, false, 1, 0, null, null, dVar2, (i6 & 14) | 1572864, 952);
                dVar2.m();
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar6;
                ps4Var3 = ps4Var5;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                ps4Var3 = ps4Var2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.y12
                    public final Object invoke(Object obj, Object obj2) {
                        return a22.p(str, z, contextMenuColors, bVar3, ps4Var3, function0, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        bVar2 = bVar;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                ps4Var2 = ps4Var;
                if (dVarF.T(ps4Var2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((196608 & i) == 0) {
                if (dVarF.T(function0)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i6 = i3;
            if ((74899 & i6) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i6 & 1)) {
                if (i8 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    ps4Var2 = null;
                }
                if (e.k()) {
                    e.o(-2001167027, i6, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.kt:191)");
                }
                o12Var = o12.a;
                tc.c cVarH3 = o12Var.h();
                c.f fVarR3 = c.a.r(o12Var.f());
                if ((i6 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((458752 & i6) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z3 | z4;
                objR = dVarF.R();
                if (z5) {
                    objR = new Function0() { // from class: com.google.android.x12
                        public final Object invoke() {
                            return a22.o(z, function0);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function0() { // from class: com.google.android.x12
                        public final Object invoke() {
                            return a22.o(z, function0);
                        }
                    };
                    dVarF.L(objR);
                }
                b bVar7 = bVar4;
                b bVarP5 = nx8.p(SizeKt.w(SizeKt.h(ClickableKt.q(bVar7, z, str2, null, null, (Function0) objR, 12, null), 0.0f, 1, null), o12Var.b(), o12Var.i(), o12Var.a(), o12Var.i()), o12Var.f(), 0.0f, 2, null);
                ej7 ej7VarB3 = t0.b(fVarR3, cVarH3, dVarF, 54);
                int iHashCode5 = Long.hashCode(pp1.b(dVarF, 0));
                gs1 gs1VarJ5 = dVarF.j();
                b bVarE5 = ComposedModifierKt.e(dVarF, bVarP5);
                companion = ComposeUiNode.INSTANCE;
                function0B = companion.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC5 = dud.c(dVarF);
                dud.i(dVarC5, ej7VarB3, companion.d());
                dud.i(dVarC5, gs1VarJ5, companion.f());
                dud.i(dVarC5, Integer.valueOf(iHashCode5), companion.c());
                dud.g(dVarC5, companion.a());
                dud.i(dVarC5, bVarE5, companion.e());
                ira iraVar3 = ira.a;
                if (ps4Var2 == null) {
                    dVarF.y(-1597947094);
                    dVarF.u();
                } else {
                    dVarF.y(-1597947093);
                    b bVarP6 = SizeKt.p(b.INSTANCE, o12Var.g(), 0.0f, o12Var.g(), o12Var.g(), 2, null);
                    ej7 ej7VarI3 = j.i(tc.INSTANCE.o(), false);
                    int iHashCode6 = Long.hashCode(pp1.b(dVarF, 0));
                    gs1 gs1VarJ6 = dVarF.j();
                    b bVarE6 = ComposedModifierKt.e(dVarF, bVarP6);
                    function0B2 = companion.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B2);
                    } else {
                        dVarF.k();
                    }
                    d dVarC6 = dud.c(dVarF);
                    dud.i(dVarC6, ej7VarI3, companion.d());
                    dud.i(dVarC6, gs1VarJ6, companion.f());
                    dud.i(dVarC6, Integer.valueOf(iHashCode6), companion.c());
                    dud.g(dVarC6, companion.a());
                    dud.i(dVarC6, bVarE6, companion.e());
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.a;
                    if (z) {
                        disabledIconColor = contextMenuColors.getIconColor();
                    } else {
                        disabledIconColor = contextMenuColors.getDisabledIconColor();
                    }
                    ps4Var2.invoke(ei1.l(disabledIconColor), dVarF, 0);
                    dVarF.m();
                    dVarF.u();
                }
                if (z) {
                    disabledTextColor = contextMenuColors.getTextColor();
                } else {
                    disabledTextColor = contextMenuColors.getDisabledTextColor();
                }
                ps4<? super ei1, ? super d, ? super Integer, Unit> ps4Var6 = ps4Var2;
                dVar2 = dVarF;
                mi0.q(str, iraVar3.a(b.INSTANCE, 1.0f, true), o12Var.l(disabledTextColor), null, 0, false, 1, 0, null, null, dVar2, (i6 & 14) | 1572864, 952);
                dVar2.m();
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar7;
                ps4Var3 = ps4Var6;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                ps4Var3 = ps4Var2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.y12
                    public final Object invoke(Object obj, Object obj2) {
                        return a22.p(str, z, contextMenuColors, bVar3, ps4Var3, function0, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        ps4Var2 = ps4Var;
        if ((196608 & i) == 0) {
            if (dVarF.T(function0)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        i6 = i3;
        if ((74899 & i6) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (dVarF.g(z2, i6 & 1)) {
            if (i8 != 0) {
                bVar4 = b.INSTANCE;
            } else {
                bVar4 = bVar2;
            }
            if (i4 != 0) {
                ps4Var2 = null;
            }
            if (e.k()) {
                e.o(-2001167027, i6, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.kt:191)");
            }
            o12Var = o12.a;
            tc.c cVarH4 = o12Var.h();
            c.f fVarR4 = c.a.r(o12Var.f());
            if ((i6 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((458752 & i6) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z3 | z4;
            objR = dVarF.R();
            if (z5) {
                objR = new Function0() { // from class: com.google.android.x12
                    public final Object invoke() {
                        return a22.o(z, function0);
                    }
                };
                dVarF.L(objR);
            } else {
                objR = new Function0() { // from class: com.google.android.x12
                    public final Object invoke() {
                        return a22.o(z, function0);
                    }
                };
                dVarF.L(objR);
            }
            b bVar8 = bVar4;
            b bVarP7 = nx8.p(SizeKt.w(SizeKt.h(ClickableKt.q(bVar8, z, str2, null, null, (Function0) objR, 12, null), 0.0f, 1, null), o12Var.b(), o12Var.i(), o12Var.a(), o12Var.i()), o12Var.f(), 0.0f, 2, null);
            ej7 ej7VarB4 = t0.b(fVarR4, cVarH4, dVarF, 54);
            int iHashCode7 = Long.hashCode(pp1.b(dVarF, 0));
            gs1 gs1VarJ7 = dVarF.j();
            b bVarE7 = ComposedModifierKt.e(dVarF, bVarP7);
            companion = ComposeUiNode.INSTANCE;
            function0B = companion.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            d dVarC7 = dud.c(dVarF);
            dud.i(dVarC7, ej7VarB4, companion.d());
            dud.i(dVarC7, gs1VarJ7, companion.f());
            dud.i(dVarC7, Integer.valueOf(iHashCode7), companion.c());
            dud.g(dVarC7, companion.a());
            dud.i(dVarC7, bVarE7, companion.e());
            ira iraVar4 = ira.a;
            if (ps4Var2 == null) {
                dVarF.y(-1597947094);
                dVarF.u();
            } else {
                dVarF.y(-1597947093);
                b bVarP8 = SizeKt.p(b.INSTANCE, o12Var.g(), 0.0f, o12Var.g(), o12Var.g(), 2, null);
                ej7 ej7VarI4 = j.i(tc.INSTANCE.o(), false);
                int iHashCode8 = Long.hashCode(pp1.b(dVarF, 0));
                gs1 gs1VarJ8 = dVarF.j();
                b bVarE8 = ComposedModifierKt.e(dVarF, bVarP8);
                function0B2 = companion.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B2);
                } else {
                    dVarF.k();
                }
                d dVarC8 = dud.c(dVarF);
                dud.i(dVarC8, ej7VarI4, companion.d());
                dud.i(dVarC8, gs1VarJ8, companion.f());
                dud.i(dVarC8, Integer.valueOf(iHashCode8), companion.c());
                dud.g(dVarC8, companion.a());
                dud.i(dVarC8, bVarE8, companion.e());
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.a;
                if (z) {
                    disabledIconColor = contextMenuColors.getIconColor();
                } else {
                    disabledIconColor = contextMenuColors.getDisabledIconColor();
                }
                ps4Var2.invoke(ei1.l(disabledIconColor), dVarF, 0);
                dVarF.m();
                dVarF.u();
            }
            if (z) {
                disabledTextColor = contextMenuColors.getTextColor();
            } else {
                disabledTextColor = contextMenuColors.getDisabledTextColor();
            }
            ps4<? super ei1, ? super d, ? super Integer, Unit> ps4Var7 = ps4Var2;
            dVar2 = dVarF;
            mi0.q(str, iraVar4.a(b.INSTANCE, 1.0f, true), o12Var.l(disabledTextColor), null, 0, false, 1, 0, null, null, dVar2, (i6 & 14) | 1572864, 952);
            dVar2.m();
            if (e.k()) {
                e.n();
            }
            bVar3 = bVar8;
            ps4Var3 = ps4Var7;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bVar3 = bVar2;
            ps4Var3 = ps4Var2;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.y12
                public final Object invoke(Object obj, Object obj2) {
                    return a22.p(str, z, contextMenuColors, bVar3, ps4Var3, function0, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(boolean z, Function0 function0) {
        if (z) {
            function0.invoke();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(String str, boolean z, ContextMenuColors contextMenuColors, b bVar, ps4 ps4Var, Function0 function0, int i, int i2, d dVar, int i3) {
        n(str, z, contextMenuColors, bVar, ps4Var, function0, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void q(final rg9 rg9Var, final Function0<Unit> function0, b bVar, final ContextMenuColors contextMenuColors, final Function1<? super n12, Unit> function1, d dVar, final int i, final int i2) {
        int i3;
        final b bVar2;
        boolean z;
        s6b s6bVarH;
        final b bVar3;
        int i4;
        int i5;
        d dVarF = dVar.F(-305401220);
        if ((i & 6) == 0) {
            i3 = (dVarF.x(rg9Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dVarF.T(function0) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (dVarF.x(contextMenuColors)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if (dVarF.T(function1)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i6 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (e.k()) {
                    e.o(-305401220, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.kt:117)");
                }
                AndroidPopup_androidKt.a(rg9Var, function0, a, ko1.e(-1271367778, true, new Function2() { // from class: com.google.android.s12
                    public final Object invoke(Object obj, Object obj2) {
                        return a22.t(bVar3, contextMenuColors, function1, (d) obj, ((Integer) obj2).intValue());
                    }
                }, dVarF, 54), dVarF, (i3 & 14) | 3456 | (i3 & 112), 0);
                if (e.k()) {
                    e.n();
                }
                bVar2 = bVar3;
            } else {
                dVarF.q();
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.t12
                    public final Object invoke(Object obj, Object obj2) {
                        return a22.u(rg9Var, function0, bVar2, contextMenuColors, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        if ((i & 3072) == 0) {
            if (dVarF.x(contextMenuColors)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i & 24576) == 0) {
            if (dVarF.T(function1)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            if (i6 != 0) {
                bVar3 = b.INSTANCE;
            } else {
                bVar3 = bVar2;
            }
            if (e.k()) {
                e.o(-305401220, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.kt:117)");
            }
            AndroidPopup_androidKt.a(rg9Var, function0, a, ko1.e(-1271367778, true, new Function2() { // from class: com.google.android.s12
                public final Object invoke(Object obj, Object obj2) {
                    return a22.t(bVar3, contextMenuColors, function1, (d) obj, ((Integer) obj2).intValue());
                }
            }, dVarF, 54), dVarF, (i3 & 14) | 3456 | (i3 & 112), 0);
            if (e.k()) {
                e.n();
            }
            bVar2 = bVar3;
        } else {
            dVarF.q();
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.t12
                public final Object invoke(Object obj, Object obj2) {
                    return a22.u(rg9Var, function0, bVar2, contextMenuColors, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void r(rg9 rg9Var, Function0<Unit> function0, b bVar, Function1<? super n12, Unit> function1, d dVar, final int i, final int i2) {
        int i3;
        Function0<Unit> function2;
        final Function1<? super n12, Unit> function3;
        final rg9 rg9Var2;
        final b bVar2;
        d dVarF = dVar.F(307841774);
        if ((i & 6) == 0) {
            i3 = (dVarF.x(rg9Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dVarF.T(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= dVarF.x(bVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= dVarF.T(function1) ? 2048 : 1024;
        }
        if (dVarF.g((i3 & 1171) != 1170, i3 & 1)) {
            if (i4 != 0) {
                bVar = b.INSTANCE;
            }
            b bVar3 = bVar;
            if (e.k()) {
                e.o(307841774, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.kt:99)");
            }
            function2 = function0;
            q(rg9Var, function2, bVar3, b22.b(dVarF, 0), function1, dVarF, (i3 & 1022) | ((i3 << 3) & 57344), 0);
            rg9Var2 = rg9Var;
            function3 = function1;
            if (e.k()) {
                e.n();
            }
            bVar2 = bVar3;
        } else {
            function2 = function0;
            function3 = function1;
            rg9Var2 = rg9Var;
            dVarF.q();
            bVar2 = bVar;
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            final Function0<Unit> function4 = function2;
            s6bVarH.a(new Function2() { // from class: com.google.android.z12
                public final Object invoke(Object obj, Object obj2) {
                    return a22.s(rg9Var2, function4, bVar2, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(rg9 rg9Var, Function0 function0, b bVar, Function1 function1, int i, int i2, d dVar, int i3) {
        r(rg9Var, function0, bVar, function1, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(b bVar, ContextMenuColors contextMenuColors, Function1 function1, d dVar, int i) {
        if (dVar.g((i & 3) != 2, i & 1)) {
            if (e.k()) {
                e.o(-1271367778, i, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.kt:123)");
            }
            k(bVar, contextMenuColors, function1, dVar, 0, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(rg9 rg9Var, Function0 function0, b bVar, ContextMenuColors contextMenuColors, Function1 function1, int i, int i2, d dVar, int i3) {
        q(rg9Var, function0, bVar, contextMenuColors, function1, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    public static final ContextMenuColors v() {
        return b;
    }
}
