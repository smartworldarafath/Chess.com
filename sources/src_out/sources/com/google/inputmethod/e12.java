package com.google.inputmethod;

import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u001ak\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aC\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/google/android/p12;", "state", "Lkotlin/Function0;", "", "onDismiss", "Lkotlin/Function1;", "Lcom/google/android/n12;", "contextMenuBuilderBlock", "Landroidx/compose/ui/b;", "modifier", "", "enabled", "onOpenGesture", "content", "i", "(Lcom/google/android/p12;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/b;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "f", "(Lcom/google/android/p12;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e12 {
    public static final void f(final ContextMenuState contextMenuState, final Function0<Unit> function0, b bVar, final Function1<? super n12, Unit> function1, d dVar, final int i, final int i2) {
        int i3;
        d dVar2;
        final b bVar2;
        s6b s6bVarH;
        Function2<? super d, ? super Integer, Unit> function2;
        d dVarF = dVar.F(-195055274);
        if ((i & 6) == 0) {
            i3 = (dVarF.x(contextMenuState) ? 4 : 2) | i;
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
            bVar2 = bVar;
            if (e.k()) {
                e.o(-195055274, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenu (ContextMenuArea.kt:73)");
            }
            ContextMenuState.a aVarA = contextMenuState.a();
            if (aVarA instanceof ContextMenuState.a.Open) {
                ContextMenuState.a.Open open = (ContextMenuState.a.Open) aVarA;
                boolean zX = dVarF.x(open);
                Object objR = dVarF.R();
                if (zX || objR == d.INSTANCE.a()) {
                    j12 j12Var = new j12(h16.d(open.getOffset()), (Function2) null, 2, (DefaultConstructorMarker) null);
                    dVarF.L(j12Var);
                    objR = j12Var;
                }
                dVar2 = dVarF;
                a22.r((j12) objR, function0, bVar2, function1, dVar2, i3 & 8176, 0);
                if (e.k()) {
                    e.n();
                }
            } else {
                if (e.k()) {
                    e.n();
                }
                s6bVarH = dVarF.H();
                if (s6bVarH == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: com.google.android.c12
                        public final Object invoke(Object obj, Object obj2) {
                            return e12.g(contextMenuState, function0, bVar2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            s6bVarH.a(function2);
        }
        dVar2 = dVarF;
        dVar2.q();
        bVar2 = bVar;
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            function2 = new Function2() { // from class: com.google.android.d12
                public final Object invoke(Object obj, Object obj2) {
                    return e12.h(contextMenuState, function0, bVar2, function1, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            };
            s6bVarH.a(function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(ContextMenuState contextMenuState, Function0 function0, b bVar, Function1 function1, int i, int i2, d dVar, int i3) {
        f(contextMenuState, function0, bVar, function1, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(ContextMenuState contextMenuState, Function0 function0, b bVar, Function1 function1, int i, int i2, d dVar, int i3) {
        f(contextMenuState, function0, bVar, function1, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0160  */
    /* JADX WARN: Code duplicated, block: B:105:0x016c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0170  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:111:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x0103  */
    /* JADX WARN: Code duplicated, block: B:88:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x012f  */
    public static final void i(final ContextMenuState contextMenuState, final Function0<Unit> function0, final Function1<? super n12, Unit> function1, b bVar, boolean z, Function0<Unit> function2, final Function2<? super d, ? super Integer, Unit> function3, d dVar, final int i, final int i2) {
        int i3;
        Function0<Unit> function4;
        b bVar2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        final Function0<Unit> function5;
        int i7;
        boolean z3;
        final boolean z4;
        final Function0<Unit> function6;
        s6b s6bVarH;
        b bVarA;
        Function0<ComposeUiNode> function0B;
        boolean z5;
        boolean z6;
        boolean z7;
        Object objR;
        Object objR2;
        int i8;
        d dVarF = dVar.F(1195420540);
        if ((i & 6) == 0) {
            i3 = (dVarF.x(contextMenuState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function4 = function0;
            i3 |= dVarF.T(function4) ? 32 : 16;
        } else {
            function4 = function0;
        }
        if ((i & 384) == 0) {
            i3 |= dVarF.T(function1) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        function5 = function2;
                        if (dVarF.T(function5)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((i & 1572864) == 0) {
                        if (dVarF.T(function3)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 599187) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i3 & 1)) {
                        if (i9 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == d.INSTANCE.a()) {
                                objR2 = new Function0() { // from class: com.google.android.z02
                                    public final Object invoke() {
                                        return e12.j();
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            function5 = (Function0) objR2;
                        }
                        if (e.k()) {
                            e.o(1195420540, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.kt:46)");
                        }
                        if (z2) {
                            dVarF.y(-1095188022);
                            if ((458752 & i3) == 131072) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if ((i3 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = z5 | z6;
                            objR = dVarF.R();
                            if (z7 || objR == d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.a12
                                    public final Object invoke(Object obj) {
                                        return e12.k(function5, contextMenuState, (rn8) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            bVarA = g12.a(bVar2, (Function1) objR);
                            dVarF.u();
                        } else {
                            dVarF.y(-1095031162);
                            dVarF.u();
                            bVarA = bVar2;
                        }
                        ej7 ej7VarI = j.i(tc.INSTANCE.o(), true);
                        int iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                        gs1 gs1VarJ = dVarF.j();
                        b bVarE = ComposedModifierKt.e(dVarF, bVarA);
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
                        dud.i(dVarC, ej7VarI, companion.d());
                        dud.i(dVarC, gs1VarJ, companion.f());
                        dud.i(dVarC, Integer.valueOf(iHashCode), companion.c());
                        dud.g(dVarC, companion.a());
                        dud.i(dVarC, bVarE, companion.e());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                        function3.invoke(dVarF, Integer.valueOf((i3 >> 18) & 14));
                        f(contextMenuState, function4, null, function1, dVarF, (i3 & 126) | ((i3 << 3) & 7168), 4);
                        dVarF.m();
                        if (e.k()) {
                            e.n();
                        }
                    } else {
                        dVarF.q();
                    }
                    z4 = z2;
                    function6 = function5;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        final b bVar3 = bVar2;
                        s6bVarH.a(new Function2() { // from class: com.google.android.b12
                            public final Object invoke(Object obj, Object obj2) {
                                return e12.l(contextMenuState, function0, function1, bVar3, z4, function6, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 196608;
                function5 = function2;
                if ((i & 1572864) == 0) {
                    if (dVarF.T(function3)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((i3 & 599187) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    if (i9 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == d.INSTANCE.a()) {
                            objR2 = new Function0() { // from class: com.google.android.z02
                                public final Object invoke() {
                                    return e12.j();
                                }
                            };
                            dVarF.L(objR2);
                        }
                        function5 = (Function0) objR2;
                    }
                    if (e.k()) {
                        e.o(1195420540, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.kt:46)");
                    }
                    if (z2) {
                        dVarF.y(-1095188022);
                        if ((458752 & i3) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if ((i3 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z5 | z6;
                        objR = dVarF.R();
                        if (z7) {
                            objR = new Function1() { // from class: com.google.android.a12
                                public final Object invoke(Object obj) {
                                    return e12.k(function5, contextMenuState, (rn8) obj);
                                }
                            };
                            dVarF.L(objR);
                        } else {
                            objR = new Function1() { // from class: com.google.android.a12
                                public final Object invoke(Object obj) {
                                    return e12.k(function5, contextMenuState, (rn8) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        bVarA = g12.a(bVar2, (Function1) objR);
                        dVarF.u();
                    } else {
                        dVarF.y(-1095031162);
                        dVarF.u();
                        bVarA = bVar2;
                    }
                    ej7 ej7VarI2 = j.i(tc.INSTANCE.o(), true);
                    int iHashCode2 = Long.hashCode(pp1.b(dVarF, 0));
                    gs1 gs1VarJ2 = dVarF.j();
                    b bVarE2 = ComposedModifierKt.e(dVarF, bVarA);
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
                    dud.i(dVarC2, ej7VarI2, companion2.d());
                    dud.i(dVarC2, gs1VarJ2, companion2.f());
                    dud.i(dVarC2, Integer.valueOf(iHashCode2), companion2.c());
                    dud.g(dVarC2, companion2.a());
                    dud.i(dVarC2, bVarE2, companion2.e());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
                    function3.invoke(dVarF, Integer.valueOf((i3 >> 18) & 14));
                    f(contextMenuState, function4, null, function1, dVarF, (i3 & 126) | ((i3 << 3) & 7168), 4);
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                } else {
                    dVarF.q();
                }
                z4 = z2;
                function6 = function5;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    final b bVar4 = bVar2;
                    s6bVarH.a(new Function2() { // from class: com.google.android.b12
                        public final Object invoke(Object obj, Object obj2) {
                            return e12.l(contextMenuState, function0, function1, bVar4, z4, function6, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            z2 = z;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    function5 = function2;
                    if (dVarF.T(function5)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i & 1572864) == 0) {
                    if (dVarF.T(function3)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((i3 & 599187) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    if (i9 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == d.INSTANCE.a()) {
                            objR2 = new Function0() { // from class: com.google.android.z02
                                public final Object invoke() {
                                    return e12.j();
                                }
                            };
                            dVarF.L(objR2);
                        }
                        function5 = (Function0) objR2;
                    }
                    if (e.k()) {
                        e.o(1195420540, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.kt:46)");
                    }
                    if (z2) {
                        dVarF.y(-1095188022);
                        if ((458752 & i3) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if ((i3 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z5 | z6;
                        objR = dVarF.R();
                        if (z7) {
                            objR = new Function1() { // from class: com.google.android.a12
                                public final Object invoke(Object obj) {
                                    return e12.k(function5, contextMenuState, (rn8) obj);
                                }
                            };
                            dVarF.L(objR);
                        } else {
                            objR = new Function1() { // from class: com.google.android.a12
                                public final Object invoke(Object obj) {
                                    return e12.k(function5, contextMenuState, (rn8) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        bVarA = g12.a(bVar2, (Function1) objR);
                        dVarF.u();
                    } else {
                        dVarF.y(-1095031162);
                        dVarF.u();
                        bVarA = bVar2;
                    }
                    ej7 ej7VarI3 = j.i(tc.INSTANCE.o(), true);
                    int iHashCode3 = Long.hashCode(pp1.b(dVarF, 0));
                    gs1 gs1VarJ3 = dVarF.j();
                    b bVarE3 = ComposedModifierKt.e(dVarF, bVarA);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    function0B = companion3.b();
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
                    dud.i(dVarC3, ej7VarI3, companion3.d());
                    dud.i(dVarC3, gs1VarJ3, companion3.f());
                    dud.i(dVarC3, Integer.valueOf(iHashCode3), companion3.c());
                    dud.g(dVarC3, companion3.a());
                    dud.i(dVarC3, bVarE3, companion3.e());
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.a;
                    function3.invoke(dVarF, Integer.valueOf((i3 >> 18) & 14));
                    f(contextMenuState, function4, null, function1, dVarF, (i3 & 126) | ((i3 << 3) & 7168), 4);
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                } else {
                    dVarF.q();
                }
                z4 = z2;
                function6 = function5;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    final b bVar5 = bVar2;
                    s6bVarH.a(new Function2() { // from class: com.google.android.b12
                        public final Object invoke(Object obj, Object obj2) {
                            return e12.l(contextMenuState, function0, function1, bVar5, z4, function6, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            function5 = function2;
            if ((i & 1572864) == 0) {
                if (dVarF.T(function3)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((i3 & 599187) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                if (i9 != 0) {
                    bVar2 = b.INSTANCE;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    objR2 = dVarF.R();
                    if (objR2 == d.INSTANCE.a()) {
                        objR2 = new Function0() { // from class: com.google.android.z02
                            public final Object invoke() {
                                return e12.j();
                            }
                        };
                        dVarF.L(objR2);
                    }
                    function5 = (Function0) objR2;
                }
                if (e.k()) {
                    e.o(1195420540, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.kt:46)");
                }
                if (z2) {
                    dVarF.y(-1095188022);
                    if ((458752 & i3) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if ((i3 & 14) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z5 | z6;
                    objR = dVarF.R();
                    if (z7) {
                        objR = new Function1() { // from class: com.google.android.a12
                            public final Object invoke(Object obj) {
                                return e12.k(function5, contextMenuState, (rn8) obj);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function1() { // from class: com.google.android.a12
                            public final Object invoke(Object obj) {
                                return e12.k(function5, contextMenuState, (rn8) obj);
                            }
                        };
                        dVarF.L(objR);
                    }
                    bVarA = g12.a(bVar2, (Function1) objR);
                    dVarF.u();
                } else {
                    dVarF.y(-1095031162);
                    dVarF.u();
                    bVarA = bVar2;
                }
                ej7 ej7VarI4 = j.i(tc.INSTANCE.o(), true);
                int iHashCode4 = Long.hashCode(pp1.b(dVarF, 0));
                gs1 gs1VarJ4 = dVarF.j();
                b bVarE4 = ComposedModifierKt.e(dVarF, bVarA);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                function0B = companion4.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC4 = dud.c(dVarF);
                dud.i(dVarC4, ej7VarI4, companion4.d());
                dud.i(dVarC4, gs1VarJ4, companion4.f());
                dud.i(dVarC4, Integer.valueOf(iHashCode4), companion4.c());
                dud.g(dVarC4, companion4.a());
                dud.i(dVarC4, bVarE4, companion4.e());
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.a;
                function3.invoke(dVarF, Integer.valueOf((i3 >> 18) & 14));
                f(contextMenuState, function4, null, function1, dVarF, (i3 & 126) | ((i3 << 3) & 7168), 4);
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
            } else {
                dVarF.q();
            }
            z4 = z2;
            function6 = function5;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final b bVar6 = bVar2;
                s6bVarH.a(new Function2() { // from class: com.google.android.b12
                    public final Object invoke(Object obj, Object obj2) {
                        return e12.l(contextMenuState, function0, function1, bVar6, z4, function6, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        bVar2 = bVar;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                if (dVarF.A(z2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    function5 = function2;
                    if (dVarF.T(function5)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i & 1572864) == 0) {
                    if (dVarF.T(function3)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((i3 & 599187) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    if (i9 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == d.INSTANCE.a()) {
                            objR2 = new Function0() { // from class: com.google.android.z02
                                public final Object invoke() {
                                    return e12.j();
                                }
                            };
                            dVarF.L(objR2);
                        }
                        function5 = (Function0) objR2;
                    }
                    if (e.k()) {
                        e.o(1195420540, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.kt:46)");
                    }
                    if (z2) {
                        dVarF.y(-1095188022);
                        if ((458752 & i3) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if ((i3 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z5 | z6;
                        objR = dVarF.R();
                        if (z7) {
                            objR = new Function1() { // from class: com.google.android.a12
                                public final Object invoke(Object obj) {
                                    return e12.k(function5, contextMenuState, (rn8) obj);
                                }
                            };
                            dVarF.L(objR);
                        } else {
                            objR = new Function1() { // from class: com.google.android.a12
                                public final Object invoke(Object obj) {
                                    return e12.k(function5, contextMenuState, (rn8) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        bVarA = g12.a(bVar2, (Function1) objR);
                        dVarF.u();
                    } else {
                        dVarF.y(-1095031162);
                        dVarF.u();
                        bVarA = bVar2;
                    }
                    ej7 ej7VarI5 = j.i(tc.INSTANCE.o(), true);
                    int iHashCode5 = Long.hashCode(pp1.b(dVarF, 0));
                    gs1 gs1VarJ5 = dVarF.j();
                    b bVarE5 = ComposedModifierKt.e(dVarF, bVarA);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    function0B = companion5.b();
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
                    dud.i(dVarC5, ej7VarI5, companion5.d());
                    dud.i(dVarC5, gs1VarJ5, companion5.f());
                    dud.i(dVarC5, Integer.valueOf(iHashCode5), companion5.c());
                    dud.g(dVarC5, companion5.a());
                    dud.i(dVarC5, bVarE5, companion5.e());
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.a;
                    function3.invoke(dVarF, Integer.valueOf((i3 >> 18) & 14));
                    f(contextMenuState, function4, null, function1, dVarF, (i3 & 126) | ((i3 << 3) & 7168), 4);
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                } else {
                    dVarF.q();
                }
                z4 = z2;
                function6 = function5;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    final b bVar7 = bVar2;
                    s6bVarH.a(new Function2() { // from class: com.google.android.b12
                        public final Object invoke(Object obj, Object obj2) {
                            return e12.l(contextMenuState, function0, function1, bVar7, z4, function6, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            function5 = function2;
            if ((i & 1572864) == 0) {
                if (dVarF.T(function3)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((i3 & 599187) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                if (i9 != 0) {
                    bVar2 = b.INSTANCE;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    objR2 = dVarF.R();
                    if (objR2 == d.INSTANCE.a()) {
                        objR2 = new Function0() { // from class: com.google.android.z02
                            public final Object invoke() {
                                return e12.j();
                            }
                        };
                        dVarF.L(objR2);
                    }
                    function5 = (Function0) objR2;
                }
                if (e.k()) {
                    e.o(1195420540, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.kt:46)");
                }
                if (z2) {
                    dVarF.y(-1095188022);
                    if ((458752 & i3) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if ((i3 & 14) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z5 | z6;
                    objR = dVarF.R();
                    if (z7) {
                        objR = new Function1() { // from class: com.google.android.a12
                            public final Object invoke(Object obj) {
                                return e12.k(function5, contextMenuState, (rn8) obj);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function1() { // from class: com.google.android.a12
                            public final Object invoke(Object obj) {
                                return e12.k(function5, contextMenuState, (rn8) obj);
                            }
                        };
                        dVarF.L(objR);
                    }
                    bVarA = g12.a(bVar2, (Function1) objR);
                    dVarF.u();
                } else {
                    dVarF.y(-1095031162);
                    dVarF.u();
                    bVarA = bVar2;
                }
                ej7 ej7VarI6 = j.i(tc.INSTANCE.o(), true);
                int iHashCode6 = Long.hashCode(pp1.b(dVarF, 0));
                gs1 gs1VarJ6 = dVarF.j();
                b bVarE6 = ComposedModifierKt.e(dVarF, bVarA);
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                function0B = companion6.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC6 = dud.c(dVarF);
                dud.i(dVarC6, ej7VarI6, companion6.d());
                dud.i(dVarC6, gs1VarJ6, companion6.f());
                dud.i(dVarC6, Integer.valueOf(iHashCode6), companion6.c());
                dud.g(dVarC6, companion6.a());
                dud.i(dVarC6, bVarE6, companion6.e());
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.a;
                function3.invoke(dVarF, Integer.valueOf((i3 >> 18) & 14));
                f(contextMenuState, function4, null, function1, dVarF, (i3 & 126) | ((i3 << 3) & 7168), 4);
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
            } else {
                dVarF.q();
            }
            z4 = z2;
            function6 = function5;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final b bVar8 = bVar2;
                s6bVarH.a(new Function2() { // from class: com.google.android.b12
                    public final Object invoke(Object obj, Object obj2) {
                        return e12.l(contextMenuState, function0, function1, bVar8, z4, function6, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        z2 = z;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                function5 = function2;
                if (dVarF.T(function5)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i & 1572864) == 0) {
                if (dVarF.T(function3)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((i3 & 599187) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                if (i9 != 0) {
                    bVar2 = b.INSTANCE;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    objR2 = dVarF.R();
                    if (objR2 == d.INSTANCE.a()) {
                        objR2 = new Function0() { // from class: com.google.android.z02
                            public final Object invoke() {
                                return e12.j();
                            }
                        };
                        dVarF.L(objR2);
                    }
                    function5 = (Function0) objR2;
                }
                if (e.k()) {
                    e.o(1195420540, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.kt:46)");
                }
                if (z2) {
                    dVarF.y(-1095188022);
                    if ((458752 & i3) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if ((i3 & 14) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z5 | z6;
                    objR = dVarF.R();
                    if (z7) {
                        objR = new Function1() { // from class: com.google.android.a12
                            public final Object invoke(Object obj) {
                                return e12.k(function5, contextMenuState, (rn8) obj);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function1() { // from class: com.google.android.a12
                            public final Object invoke(Object obj) {
                                return e12.k(function5, contextMenuState, (rn8) obj);
                            }
                        };
                        dVarF.L(objR);
                    }
                    bVarA = g12.a(bVar2, (Function1) objR);
                    dVarF.u();
                } else {
                    dVarF.y(-1095031162);
                    dVarF.u();
                    bVarA = bVar2;
                }
                ej7 ej7VarI7 = j.i(tc.INSTANCE.o(), true);
                int iHashCode7 = Long.hashCode(pp1.b(dVarF, 0));
                gs1 gs1VarJ7 = dVarF.j();
                b bVarE7 = ComposedModifierKt.e(dVarF, bVarA);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                function0B = companion7.b();
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
                dud.i(dVarC7, ej7VarI7, companion7.d());
                dud.i(dVarC7, gs1VarJ7, companion7.f());
                dud.i(dVarC7, Integer.valueOf(iHashCode7), companion7.c());
                dud.g(dVarC7, companion7.a());
                dud.i(dVarC7, bVarE7, companion7.e());
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.a;
                function3.invoke(dVarF, Integer.valueOf((i3 >> 18) & 14));
                f(contextMenuState, function4, null, function1, dVarF, (i3 & 126) | ((i3 << 3) & 7168), 4);
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
            } else {
                dVarF.q();
            }
            z4 = z2;
            function6 = function5;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final b bVar9 = bVar2;
                s6bVarH.a(new Function2() { // from class: com.google.android.b12
                    public final Object invoke(Object obj, Object obj2) {
                        return e12.l(contextMenuState, function0, function1, bVar9, z4, function6, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 196608;
        function5 = function2;
        if ((i & 1572864) == 0) {
            if (dVarF.T(function3)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        if ((i3 & 599187) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dVarF.g(z3, i3 & 1)) {
            if (i9 != 0) {
                bVar2 = b.INSTANCE;
            }
            if (i4 != 0) {
                z2 = true;
            }
            if (i6 != 0) {
                objR2 = dVarF.R();
                if (objR2 == d.INSTANCE.a()) {
                    objR2 = new Function0() { // from class: com.google.android.z02
                        public final Object invoke() {
                            return e12.j();
                        }
                    };
                    dVarF.L(objR2);
                }
                function5 = (Function0) objR2;
            }
            if (e.k()) {
                e.o(1195420540, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.kt:46)");
            }
            if (z2) {
                dVarF.y(-1095188022);
                if ((458752 & i3) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((i3 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z5 | z6;
                objR = dVarF.R();
                if (z7) {
                    objR = new Function1() { // from class: com.google.android.a12
                        public final Object invoke(Object obj) {
                            return e12.k(function5, contextMenuState, (rn8) obj);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function1() { // from class: com.google.android.a12
                        public final Object invoke(Object obj) {
                            return e12.k(function5, contextMenuState, (rn8) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                bVarA = g12.a(bVar2, (Function1) objR);
                dVarF.u();
            } else {
                dVarF.y(-1095031162);
                dVarF.u();
                bVarA = bVar2;
            }
            ej7 ej7VarI8 = j.i(tc.INSTANCE.o(), true);
            int iHashCode8 = Long.hashCode(pp1.b(dVarF, 0));
            gs1 gs1VarJ8 = dVarF.j();
            b bVarE8 = ComposedModifierKt.e(dVarF, bVarA);
            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
            function0B = companion8.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            d dVarC8 = dud.c(dVarF);
            dud.i(dVarC8, ej7VarI8, companion8.d());
            dud.i(dVarC8, gs1VarJ8, companion8.f());
            dud.i(dVarC8, Integer.valueOf(iHashCode8), companion8.c());
            dud.g(dVarC8, companion8.a());
            dud.i(dVarC8, bVarE8, companion8.e());
            BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.a;
            function3.invoke(dVarF, Integer.valueOf((i3 >> 18) & 14));
            f(contextMenuState, function4, null, function1, dVarF, (i3 & 126) | ((i3 << 3) & 7168), 4);
            dVarF.m();
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        z4 = z2;
        function6 = function5;
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            final b bVar10 = bVar2;
            s6bVarH.a(new Function2() { // from class: com.google.android.b12
                public final Object invoke(Object obj, Object obj2) {
                    return e12.l(contextMenuState, function0, function1, bVar10, z4, function6, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j() {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function0 function0, ContextMenuState contextMenuState, rn8 rn8Var) {
        function0.invoke();
        contextMenuState.b(new ContextMenuState.a.Open(rn8Var.getPackedValue(), null));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(ContextMenuState contextMenuState, Function0 function0, Function1 function1, b bVar, boolean z, Function0 function2, Function2 function3, int i, int i2, d dVar, int i3) {
        i(contextMenuState, function0, function1, bVar, z, function2, function3, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }
}
