package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.e0b;
import com.google.android.u67;
import com.google.inputmethod.dsd;
import com.google.inputmethod.dud;
import com.google.inputmethod.f43;
import com.google.inputmethod.gs1;
import com.google.inputmethod.h67;
import com.google.inputmethod.n17;
import com.google.inputmethod.pp1;
import com.google.inputmethod.qya;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.tya;
import com.google.inputmethod.zw5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aM\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a{\u0010\r\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a[\u0010 \u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!\u001a#\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$\"#\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroid/view/View;", "T", "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Landroidx/compose/ui/b;", "modifier", "", "update", "a", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)V", "onReset", "onRelease", "b", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "d", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;I)Lkotlin/jvm/functions/Function0;", "Lcom/google/android/dud;", "", "compositeKeyHash", "Lcom/google/android/f43;", "density", "Lcom/google/android/n17;", "lifecycleOwner", "Lcom/google/android/e0b;", "savedStateRegistryOwner", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/gs1;", "compositionLocalMap", "g", "(Landroidx/compose/runtime/d;Landroidx/compose/ui/b;ILcom/google/android/f43;Lcom/google/android/n17;Lcom/google/android/e0b;Landroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/gs1;)V", "Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "f", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Lkotlin/jvm/functions/Function1;", "e", "()Lkotlin/jvm/functions/Function1;", "NoOpUpdate", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AndroidView_androidKt {
    private static final Function1<View, Unit> a = new Function1<View, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1
        public final void a(View view) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return Unit.a;
        }
    };

    public static final <T extends View> void a(final Function1<? super Context, ? extends T> function1, androidx.compose.ui.b bVar, Function1<? super T, Unit> function2, androidx.compose.p004runtime.d dVar, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.b bVar2;
        final Function1<? super T, Unit> function3;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1783766393);
        if ((i & 6) == 0) {
            i3 = (dVarF.T(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dVarF.x(bVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= dVarF.T(function2) ? 256 : 128;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                bVar = androidx.compose.ui.b.INSTANCE;
            }
            androidx.compose.ui.b bVar3 = bVar;
            Function1<? super T, Unit> function4 = i5 != 0 ? a : function2;
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1783766393, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:104)");
            }
            b(function1, bVar3, null, a, function4, dVarF, (i3 & 14) | 3072 | (i3 & 112) | (57344 & (i3 << 6)), 4);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            bVar2 = bVar3;
            function3 = function4;
        } else {
            dVarF.q();
            bVar2 = bVar;
            function3 = function2;
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(androidx.compose.p004runtime.d dVar2, int i6) {
                    AndroidView_androidKt.a(function1, bVar2, function3, dVar2, saa.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0092  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:74:0x0101  */
    /* JADX WARN: Code duplicated, block: B:76:0x0115  */
    /* JADX WARN: Code duplicated, block: B:79:0x0121  */
    /* JADX WARN: Code duplicated, block: B:80:0x0125  */
    /* JADX WARN: Code duplicated, block: B:82:0x0145  */
    /* JADX WARN: Code duplicated, block: B:84:0x0159  */
    /* JADX WARN: Code duplicated, block: B:87:0x0165  */
    /* JADX WARN: Code duplicated, block: B:88:0x0169  */
    /* JADX WARN: Code duplicated, block: B:92:0x0189  */
    /* JADX WARN: Code duplicated, block: B:94:0x018f  */
    /* JADX WARN: Code duplicated, block: B:97:0x019a  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final <T extends View> void b(final Function1<? super Context, ? extends T> function1, androidx.compose.ui.b bVar, Function1<? super T, Unit> function2, Function1<? super T, Unit> function3, Function1<? super T, Unit> function4, androidx.compose.p004runtime.d dVar, final int i, final int i2) {
        int i3;
        androidx.compose.ui.b bVar2;
        int i4;
        Function1<? super T, Unit> function5;
        int i5;
        int i6;
        Function1<? super T, Unit> function6;
        int i7;
        int i8;
        Function1<? super T, Unit> function7;
        int i9;
        boolean z;
        androidx.compose.ui.b bVar3;
        final Function1<? super T, Unit> function8;
        final Function1<? super T, Unit> function9;
        s6b s6bVarH;
        int iHashCode;
        androidx.compose.ui.b bVarE;
        f43 f43Var;
        LayoutDirection layoutDirection;
        gs1 gs1VarJ;
        n17 n17Var;
        e0b e0bVar;
        Function0<LayoutNode> function0D;
        Function0<LayoutNode> function0D2;
        androidx.compose.p004runtime.d dVarF = dVar.F(-180024211);
        if ((i & 6) == 0) {
            i3 = (dVarF.T(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function5 = function2;
                    if (dVarF.T(function5)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        function6 = function3;
                        if (dVarF.T(function6)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            function7 = function4;
                            if (dVarF.T(function7)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((i3 & 9363) != 9362) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i3 & 1)) {
                            if (i10 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar2;
                            }
                            if (i4 != 0) {
                                function5 = null;
                            }
                            if (i6 != 0) {
                                function6 = a;
                            }
                            if (i8 != 0) {
                                function7 = a;
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                            }
                            iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                            bVarE = ComposedModifierKt.e(dVarF, d.e(bVar3));
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                            gs1VarJ = dVarF.j();
                            n17Var = (n17) dVarF.v(h67.c());
                            e0bVar = (e0b) dVarF.v(u67.c());
                            if (function5 != null) {
                                dVarF.y(1313917368);
                                function0D2 = d(function1, dVarF, i3 & 14);
                                if (!(dVarF.G() instanceof dsd)) {
                                    pp1.d();
                                }
                                dVarF.o();
                                if (dVarF.getInserting()) {
                                    dVarF.W(function0D2);
                                } else {
                                    dVarF.k();
                                }
                                androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
                                g(dVarC, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                                dud.i(dVarC, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                    public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function10) {
                                        AndroidView_androidKt.f(layoutNode).setResetBlock(function10);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        a((LayoutNode) obj, (Function1) obj2);
                                        return Unit.a;
                                    }
                                });
                                dud.i(dVarC, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                    public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function10) {
                                        AndroidView_androidKt.f(layoutNode).setUpdateBlock(function10);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        a((LayoutNode) obj, (Function1) obj2);
                                        return Unit.a;
                                    }
                                });
                                dud.i(dVarC, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                    public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function10) {
                                        AndroidView_androidKt.f(layoutNode).setReleaseBlock(function10);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        a((LayoutNode) obj, (Function1) obj2);
                                        return Unit.a;
                                    }
                                });
                                dVarF.m();
                                dVarF.u();
                            } else {
                                dVarF.y(1314774735);
                                function0D = d(function1, dVarF, i3 & 14);
                                if (!(dVarF.G() instanceof dsd)) {
                                    pp1.d();
                                }
                                dVarF.J();
                                if (dVarF.getInserting()) {
                                    dVarF.W(function0D);
                                } else {
                                    dVarF.k();
                                }
                                androidx.compose.p004runtime.d dVarC2 = dud.c(dVarF);
                                g(dVarC2, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                                dud.i(dVarC2, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                    public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function10) {
                                        AndroidView_androidKt.f(layoutNode).setUpdateBlock(function10);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        a((LayoutNode) obj, (Function1) obj2);
                                        return Unit.a;
                                    }
                                });
                                dud.i(dVarC2, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                    public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function10) {
                                        AndroidView_androidKt.f(layoutNode).setReleaseBlock(function10);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        a((LayoutNode) obj, (Function1) obj2);
                                        return Unit.a;
                                    }
                                });
                                dVarF.m();
                                dVarF.u();
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                        } else {
                            dVarF.q();
                            bVar3 = bVar2;
                        }
                        function8 = function5;
                        function9 = function7;
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            final androidx.compose.ui.b bVar4 = bVar3;
                            final Function1<? super T, Unit> function10 = function6;
                            s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                public final void invoke(androidx.compose.p004runtime.d dVar2, int i11) {
                                    AndroidView_androidKt.b(function1, bVar4, function8, function10, function9, dVar2, saa.a(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 24576;
                    function7 = function4;
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i10 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function6 = a;
                        }
                        if (i8 != 0) {
                            function7 = a;
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                        }
                        iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                        bVarE = ComposedModifierKt.e(dVarF, d.e(bVar3));
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                        gs1VarJ = dVarF.j();
                        n17Var = (n17) dVarF.v(h67.c());
                        e0bVar = (e0b) dVarF.v(u67.c());
                        if (function5 != null) {
                            dVarF.y(1313917368);
                            function0D2 = d(function1, dVarF, i3 & 14);
                            if (!(dVarF.G() instanceof dsd)) {
                                pp1.d();
                            }
                            dVarF.o();
                            if (dVarF.getInserting()) {
                                dVarF.W(function0D2);
                            } else {
                                dVarF.k();
                            }
                            androidx.compose.p004runtime.d dVarC3 = dud.c(dVarF);
                            g(dVarC3, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                            dud.i(dVarC3, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function11) {
                                    AndroidView_androidKt.f(layoutNode).setResetBlock(function11);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dud.i(dVarC3, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function11) {
                                    AndroidView_androidKt.f(layoutNode).setUpdateBlock(function11);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dud.i(dVarC3, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function11) {
                                    AndroidView_androidKt.f(layoutNode).setReleaseBlock(function11);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dVarF.m();
                            dVarF.u();
                        } else {
                            dVarF.y(1314774735);
                            function0D = d(function1, dVarF, i3 & 14);
                            if (!(dVarF.G() instanceof dsd)) {
                                pp1.d();
                            }
                            dVarF.J();
                            if (dVarF.getInserting()) {
                                dVarF.W(function0D);
                            } else {
                                dVarF.k();
                            }
                            androidx.compose.p004runtime.d dVarC4 = dud.c(dVarF);
                            g(dVarC4, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                            dud.i(dVarC4, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function11) {
                                    AndroidView_androidKt.f(layoutNode).setUpdateBlock(function11);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dud.i(dVarC4, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function11) {
                                    AndroidView_androidKt.f(layoutNode).setReleaseBlock(function11);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dVarF.m();
                            dVarF.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                    }
                    function8 = function5;
                    function9 = function7;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        final androidx.compose.ui.b bVar5 = bVar3;
                        final Function1<? super T, Unit> function11 = function6;
                        s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(androidx.compose.p004runtime.d dVar2, int i11) {
                                AndroidView_androidKt.b(function1, bVar5, function8, function11, function9, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 3072;
                function6 = function3;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        function7 = function4;
                        if (dVarF.T(function7)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i10 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function6 = a;
                        }
                        if (i8 != 0) {
                            function7 = a;
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                        }
                        iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                        bVarE = ComposedModifierKt.e(dVarF, d.e(bVar3));
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                        gs1VarJ = dVarF.j();
                        n17Var = (n17) dVarF.v(h67.c());
                        e0bVar = (e0b) dVarF.v(u67.c());
                        if (function5 != null) {
                            dVarF.y(1313917368);
                            function0D2 = d(function1, dVarF, i3 & 14);
                            if (!(dVarF.G() instanceof dsd)) {
                                pp1.d();
                            }
                            dVarF.o();
                            if (dVarF.getInserting()) {
                                dVarF.W(function0D2);
                            } else {
                                dVarF.k();
                            }
                            androidx.compose.p004runtime.d dVarC5 = dud.c(dVarF);
                            g(dVarC5, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                            dud.i(dVarC5, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function12) {
                                    AndroidView_androidKt.f(layoutNode).setResetBlock(function12);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dud.i(dVarC5, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function12) {
                                    AndroidView_androidKt.f(layoutNode).setUpdateBlock(function12);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dud.i(dVarC5, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function12) {
                                    AndroidView_androidKt.f(layoutNode).setReleaseBlock(function12);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dVarF.m();
                            dVarF.u();
                        } else {
                            dVarF.y(1314774735);
                            function0D = d(function1, dVarF, i3 & 14);
                            if (!(dVarF.G() instanceof dsd)) {
                                pp1.d();
                            }
                            dVarF.J();
                            if (dVarF.getInserting()) {
                                dVarF.W(function0D);
                            } else {
                                dVarF.k();
                            }
                            androidx.compose.p004runtime.d dVarC6 = dud.c(dVarF);
                            g(dVarC6, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                            dud.i(dVarC6, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function12) {
                                    AndroidView_androidKt.f(layoutNode).setUpdateBlock(function12);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dud.i(dVarC6, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function12) {
                                    AndroidView_androidKt.f(layoutNode).setReleaseBlock(function12);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dVarF.m();
                            dVarF.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                    }
                    function8 = function5;
                    function9 = function7;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        final androidx.compose.ui.b bVar6 = bVar3;
                        final Function1<? super T, Unit> function12 = function6;
                        s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(androidx.compose.p004runtime.d dVar2, int i11) {
                                AndroidView_androidKt.b(function1, bVar6, function8, function12, function9, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                function7 = function4;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i10 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = a;
                    }
                    if (i8 != 0) {
                        function7 = a;
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                    bVarE = ComposedModifierKt.e(dVarF, d.e(bVar3));
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                    gs1VarJ = dVarF.j();
                    n17Var = (n17) dVarF.v(h67.c());
                    e0bVar = (e0b) dVarF.v(u67.c());
                    if (function5 != null) {
                        dVarF.y(1313917368);
                        function0D2 = d(function1, dVarF, i3 & 14);
                        if (!(dVarF.G() instanceof dsd)) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0D2);
                        } else {
                            dVarF.k();
                        }
                        androidx.compose.p004runtime.d dVarC7 = dud.c(dVarF);
                        g(dVarC7, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                        dud.i(dVarC7, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function13) {
                                AndroidView_androidKt.f(layoutNode).setResetBlock(function13);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC7, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function13) {
                                AndroidView_androidKt.f(layoutNode).setUpdateBlock(function13);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC7, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function13) {
                                AndroidView_androidKt.f(layoutNode).setReleaseBlock(function13);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dVarF.m();
                        dVarF.u();
                    } else {
                        dVarF.y(1314774735);
                        function0D = d(function1, dVarF, i3 & 14);
                        if (!(dVarF.G() instanceof dsd)) {
                            pp1.d();
                        }
                        dVarF.J();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0D);
                        } else {
                            dVarF.k();
                        }
                        androidx.compose.p004runtime.d dVarC8 = dud.c(dVarF);
                        g(dVarC8, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                        dud.i(dVarC8, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function13) {
                                AndroidView_androidKt.f(layoutNode).setUpdateBlock(function13);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC8, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function13) {
                                AndroidView_androidKt.f(layoutNode).setReleaseBlock(function13);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dVarF.m();
                        dVarF.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                }
                function8 = function5;
                function9 = function7;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    final androidx.compose.ui.b bVar7 = bVar3;
                    final Function1<? super T, Unit> function13 = function6;
                    s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(androidx.compose.p004runtime.d dVar2, int i11) {
                            AndroidView_androidKt.b(function1, bVar7, function8, function13, function9, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 384;
            function5 = function2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    function6 = function3;
                    if (dVarF.T(function6)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        function7 = function4;
                        if (dVarF.T(function7)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i10 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function6 = a;
                        }
                        if (i8 != 0) {
                            function7 = a;
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                        }
                        iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                        bVarE = ComposedModifierKt.e(dVarF, d.e(bVar3));
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                        gs1VarJ = dVarF.j();
                        n17Var = (n17) dVarF.v(h67.c());
                        e0bVar = (e0b) dVarF.v(u67.c());
                        if (function5 != null) {
                            dVarF.y(1313917368);
                            function0D2 = d(function1, dVarF, i3 & 14);
                            if (!(dVarF.G() instanceof dsd)) {
                                pp1.d();
                            }
                            dVarF.o();
                            if (dVarF.getInserting()) {
                                dVarF.W(function0D2);
                            } else {
                                dVarF.k();
                            }
                            androidx.compose.p004runtime.d dVarC9 = dud.c(dVarF);
                            g(dVarC9, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                            dud.i(dVarC9, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function14) {
                                    AndroidView_androidKt.f(layoutNode).setResetBlock(function14);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dud.i(dVarC9, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function14) {
                                    AndroidView_androidKt.f(layoutNode).setUpdateBlock(function14);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dud.i(dVarC9, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function14) {
                                    AndroidView_androidKt.f(layoutNode).setReleaseBlock(function14);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dVarF.m();
                            dVarF.u();
                        } else {
                            dVarF.y(1314774735);
                            function0D = d(function1, dVarF, i3 & 14);
                            if (!(dVarF.G() instanceof dsd)) {
                                pp1.d();
                            }
                            dVarF.J();
                            if (dVarF.getInserting()) {
                                dVarF.W(function0D);
                            } else {
                                dVarF.k();
                            }
                            androidx.compose.p004runtime.d dVarC10 = dud.c(dVarF);
                            g(dVarC10, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                            dud.i(dVarC10, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function14) {
                                    AndroidView_androidKt.f(layoutNode).setUpdateBlock(function14);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dud.i(dVarC10, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function14) {
                                    AndroidView_androidKt.f(layoutNode).setReleaseBlock(function14);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dVarF.m();
                            dVarF.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                    }
                    function8 = function5;
                    function9 = function7;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        final androidx.compose.ui.b bVar8 = bVar3;
                        final Function1<? super T, Unit> function14 = function6;
                        s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(androidx.compose.p004runtime.d dVar2, int i11) {
                                AndroidView_androidKt.b(function1, bVar8, function8, function14, function9, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                function7 = function4;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i10 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = a;
                    }
                    if (i8 != 0) {
                        function7 = a;
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                    bVarE = ComposedModifierKt.e(dVarF, d.e(bVar3));
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                    gs1VarJ = dVarF.j();
                    n17Var = (n17) dVarF.v(h67.c());
                    e0bVar = (e0b) dVarF.v(u67.c());
                    if (function5 != null) {
                        dVarF.y(1313917368);
                        function0D2 = d(function1, dVarF, i3 & 14);
                        if (!(dVarF.G() instanceof dsd)) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0D2);
                        } else {
                            dVarF.k();
                        }
                        androidx.compose.p004runtime.d dVarC11 = dud.c(dVarF);
                        g(dVarC11, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                        dud.i(dVarC11, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function15) {
                                AndroidView_androidKt.f(layoutNode).setResetBlock(function15);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC11, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function15) {
                                AndroidView_androidKt.f(layoutNode).setUpdateBlock(function15);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC11, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function15) {
                                AndroidView_androidKt.f(layoutNode).setReleaseBlock(function15);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dVarF.m();
                        dVarF.u();
                    } else {
                        dVarF.y(1314774735);
                        function0D = d(function1, dVarF, i3 & 14);
                        if (!(dVarF.G() instanceof dsd)) {
                            pp1.d();
                        }
                        dVarF.J();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0D);
                        } else {
                            dVarF.k();
                        }
                        androidx.compose.p004runtime.d dVarC12 = dud.c(dVarF);
                        g(dVarC12, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                        dud.i(dVarC12, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function15) {
                                AndroidView_androidKt.f(layoutNode).setUpdateBlock(function15);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC12, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function15) {
                                AndroidView_androidKt.f(layoutNode).setReleaseBlock(function15);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dVarF.m();
                        dVarF.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                }
                function8 = function5;
                function9 = function7;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    final androidx.compose.ui.b bVar9 = bVar3;
                    final Function1<? super T, Unit> function15 = function6;
                    s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(androidx.compose.p004runtime.d dVar2, int i11) {
                            AndroidView_androidKt.b(function1, bVar9, function8, function15, function9, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            function6 = function3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    function7 = function4;
                    if (dVarF.T(function7)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i10 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = a;
                    }
                    if (i8 != 0) {
                        function7 = a;
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                    bVarE = ComposedModifierKt.e(dVarF, d.e(bVar3));
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                    gs1VarJ = dVarF.j();
                    n17Var = (n17) dVarF.v(h67.c());
                    e0bVar = (e0b) dVarF.v(u67.c());
                    if (function5 != null) {
                        dVarF.y(1313917368);
                        function0D2 = d(function1, dVarF, i3 & 14);
                        if (!(dVarF.G() instanceof dsd)) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0D2);
                        } else {
                            dVarF.k();
                        }
                        androidx.compose.p004runtime.d dVarC13 = dud.c(dVarF);
                        g(dVarC13, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                        dud.i(dVarC13, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function16) {
                                AndroidView_androidKt.f(layoutNode).setResetBlock(function16);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC13, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function16) {
                                AndroidView_androidKt.f(layoutNode).setUpdateBlock(function16);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC13, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function16) {
                                AndroidView_androidKt.f(layoutNode).setReleaseBlock(function16);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dVarF.m();
                        dVarF.u();
                    } else {
                        dVarF.y(1314774735);
                        function0D = d(function1, dVarF, i3 & 14);
                        if (!(dVarF.G() instanceof dsd)) {
                            pp1.d();
                        }
                        dVarF.J();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0D);
                        } else {
                            dVarF.k();
                        }
                        androidx.compose.p004runtime.d dVarC14 = dud.c(dVarF);
                        g(dVarC14, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                        dud.i(dVarC14, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function16) {
                                AndroidView_androidKt.f(layoutNode).setUpdateBlock(function16);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC14, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function16) {
                                AndroidView_androidKt.f(layoutNode).setReleaseBlock(function16);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dVarF.m();
                        dVarF.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                }
                function8 = function5;
                function9 = function7;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    final androidx.compose.ui.b bVar10 = bVar3;
                    final Function1<? super T, Unit> function16 = function6;
                    s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(androidx.compose.p004runtime.d dVar2, int i11) {
                            AndroidView_androidKt.b(function1, bVar10, function8, function16, function9, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            function7 = function4;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i10 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (i4 != 0) {
                    function5 = null;
                }
                if (i6 != 0) {
                    function6 = a;
                }
                if (i8 != 0) {
                    function7 = a;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                }
                iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                bVarE = ComposedModifierKt.e(dVarF, d.e(bVar3));
                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                gs1VarJ = dVarF.j();
                n17Var = (n17) dVarF.v(h67.c());
                e0bVar = (e0b) dVarF.v(u67.c());
                if (function5 != null) {
                    dVarF.y(1313917368);
                    function0D2 = d(function1, dVarF, i3 & 14);
                    if (!(dVarF.G() instanceof dsd)) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0D2);
                    } else {
                        dVarF.k();
                    }
                    androidx.compose.p004runtime.d dVarC15 = dud.c(dVarF);
                    g(dVarC15, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                    dud.i(dVarC15, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function17) {
                            AndroidView_androidKt.f(layoutNode).setResetBlock(function17);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dud.i(dVarC15, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function17) {
                            AndroidView_androidKt.f(layoutNode).setUpdateBlock(function17);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dud.i(dVarC15, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function17) {
                            AndroidView_androidKt.f(layoutNode).setReleaseBlock(function17);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dVarF.m();
                    dVarF.u();
                } else {
                    dVarF.y(1314774735);
                    function0D = d(function1, dVarF, i3 & 14);
                    if (!(dVarF.G() instanceof dsd)) {
                        pp1.d();
                    }
                    dVarF.J();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0D);
                    } else {
                        dVarF.k();
                    }
                    androidx.compose.p004runtime.d dVarC16 = dud.c(dVarF);
                    g(dVarC16, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                    dud.i(dVarC16, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function17) {
                            AndroidView_androidKt.f(layoutNode).setUpdateBlock(function17);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dud.i(dVarC16, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function17) {
                            AndroidView_androidKt.f(layoutNode).setReleaseBlock(function17);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dVarF.m();
                    dVarF.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
            } else {
                dVarF.q();
                bVar3 = bVar2;
            }
            function8 = function5;
            function9 = function7;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final androidx.compose.ui.b bVar11 = bVar3;
                final Function1<? super T, Unit> function17 = function6;
                s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(androidx.compose.p004runtime.d dVar2, int i11) {
                        AndroidView_androidKt.b(function1, bVar11, function8, function17, function9, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        bVar2 = bVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                function5 = function2;
                if (dVarF.T(function5)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    function6 = function3;
                    if (dVarF.T(function6)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        function7 = function4;
                        if (dVarF.T(function7)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i10 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if (i6 != 0) {
                            function6 = a;
                        }
                        if (i8 != 0) {
                            function7 = a;
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                        }
                        iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                        bVarE = ComposedModifierKt.e(dVarF, d.e(bVar3));
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                        gs1VarJ = dVarF.j();
                        n17Var = (n17) dVarF.v(h67.c());
                        e0bVar = (e0b) dVarF.v(u67.c());
                        if (function5 != null) {
                            dVarF.y(1313917368);
                            function0D2 = d(function1, dVarF, i3 & 14);
                            if (!(dVarF.G() instanceof dsd)) {
                                pp1.d();
                            }
                            dVarF.o();
                            if (dVarF.getInserting()) {
                                dVarF.W(function0D2);
                            } else {
                                dVarF.k();
                            }
                            androidx.compose.p004runtime.d dVarC17 = dud.c(dVarF);
                            g(dVarC17, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                            dud.i(dVarC17, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function18) {
                                    AndroidView_androidKt.f(layoutNode).setResetBlock(function18);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dud.i(dVarC17, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function18) {
                                    AndroidView_androidKt.f(layoutNode).setUpdateBlock(function18);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dud.i(dVarC17, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function18) {
                                    AndroidView_androidKt.f(layoutNode).setReleaseBlock(function18);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dVarF.m();
                            dVarF.u();
                        } else {
                            dVarF.y(1314774735);
                            function0D = d(function1, dVarF, i3 & 14);
                            if (!(dVarF.G() instanceof dsd)) {
                                pp1.d();
                            }
                            dVarF.J();
                            if (dVarF.getInserting()) {
                                dVarF.W(function0D);
                            } else {
                                dVarF.k();
                            }
                            androidx.compose.p004runtime.d dVarC18 = dud.c(dVarF);
                            g(dVarC18, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                            dud.i(dVarC18, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function18) {
                                    AndroidView_androidKt.f(layoutNode).setUpdateBlock(function18);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dud.i(dVarC18, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function18) {
                                    AndroidView_androidKt.f(layoutNode).setReleaseBlock(function18);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    a((LayoutNode) obj, (Function1) obj2);
                                    return Unit.a;
                                }
                            });
                            dVarF.m();
                            dVarF.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                    }
                    function8 = function5;
                    function9 = function7;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        final androidx.compose.ui.b bVar12 = bVar3;
                        final Function1<? super T, Unit> function18 = function6;
                        s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(androidx.compose.p004runtime.d dVar2, int i11) {
                                AndroidView_androidKt.b(function1, bVar12, function8, function18, function9, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                function7 = function4;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i10 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = a;
                    }
                    if (i8 != 0) {
                        function7 = a;
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                    bVarE = ComposedModifierKt.e(dVarF, d.e(bVar3));
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                    gs1VarJ = dVarF.j();
                    n17Var = (n17) dVarF.v(h67.c());
                    e0bVar = (e0b) dVarF.v(u67.c());
                    if (function5 != null) {
                        dVarF.y(1313917368);
                        function0D2 = d(function1, dVarF, i3 & 14);
                        if (!(dVarF.G() instanceof dsd)) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0D2);
                        } else {
                            dVarF.k();
                        }
                        androidx.compose.p004runtime.d dVarC19 = dud.c(dVarF);
                        g(dVarC19, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                        dud.i(dVarC19, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function19) {
                                AndroidView_androidKt.f(layoutNode).setResetBlock(function19);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC19, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function19) {
                                AndroidView_androidKt.f(layoutNode).setUpdateBlock(function19);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC19, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function19) {
                                AndroidView_androidKt.f(layoutNode).setReleaseBlock(function19);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dVarF.m();
                        dVarF.u();
                    } else {
                        dVarF.y(1314774735);
                        function0D = d(function1, dVarF, i3 & 14);
                        if (!(dVarF.G() instanceof dsd)) {
                            pp1.d();
                        }
                        dVarF.J();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0D);
                        } else {
                            dVarF.k();
                        }
                        androidx.compose.p004runtime.d dVarC110 = dud.c(dVarF);
                        g(dVarC110, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                        dud.i(dVarC110, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function19) {
                                AndroidView_androidKt.f(layoutNode).setUpdateBlock(function19);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC110, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function19) {
                                AndroidView_androidKt.f(layoutNode).setReleaseBlock(function19);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dVarF.m();
                        dVarF.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                }
                function8 = function5;
                function9 = function7;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    final androidx.compose.ui.b bVar13 = bVar3;
                    final Function1<? super T, Unit> function19 = function6;
                    s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(androidx.compose.p004runtime.d dVar2, int i11) {
                            AndroidView_androidKt.b(function1, bVar13, function8, function19, function9, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            function6 = function3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    function7 = function4;
                    if (dVarF.T(function7)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i10 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = a;
                    }
                    if (i8 != 0) {
                        function7 = a;
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                    bVarE = ComposedModifierKt.e(dVarF, d.e(bVar3));
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                    gs1VarJ = dVarF.j();
                    n17Var = (n17) dVarF.v(h67.c());
                    e0bVar = (e0b) dVarF.v(u67.c());
                    if (function5 != null) {
                        dVarF.y(1313917368);
                        function0D2 = d(function1, dVarF, i3 & 14);
                        if (!(dVarF.G() instanceof dsd)) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0D2);
                        } else {
                            dVarF.k();
                        }
                        androidx.compose.p004runtime.d dVarC111 = dud.c(dVarF);
                        g(dVarC111, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                        dud.i(dVarC111, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function110) {
                                AndroidView_androidKt.f(layoutNode).setResetBlock(function110);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC111, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function110) {
                                AndroidView_androidKt.f(layoutNode).setUpdateBlock(function110);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC111, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function110) {
                                AndroidView_androidKt.f(layoutNode).setReleaseBlock(function110);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dVarF.m();
                        dVarF.u();
                    } else {
                        dVarF.y(1314774735);
                        function0D = d(function1, dVarF, i3 & 14);
                        if (!(dVarF.G() instanceof dsd)) {
                            pp1.d();
                        }
                        dVarF.J();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0D);
                        } else {
                            dVarF.k();
                        }
                        androidx.compose.p004runtime.d dVarC112 = dud.c(dVarF);
                        g(dVarC112, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                        dud.i(dVarC112, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function110) {
                                AndroidView_androidKt.f(layoutNode).setUpdateBlock(function110);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC112, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function110) {
                                AndroidView_androidKt.f(layoutNode).setReleaseBlock(function110);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dVarF.m();
                        dVarF.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                }
                function8 = function5;
                function9 = function7;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    final androidx.compose.ui.b bVar14 = bVar3;
                    final Function1<? super T, Unit> function110 = function6;
                    s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(androidx.compose.p004runtime.d dVar2, int i11) {
                            AndroidView_androidKt.b(function1, bVar14, function8, function110, function9, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            function7 = function4;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i10 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (i4 != 0) {
                    function5 = null;
                }
                if (i6 != 0) {
                    function6 = a;
                }
                if (i8 != 0) {
                    function7 = a;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                }
                iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                bVarE = ComposedModifierKt.e(dVarF, d.e(bVar3));
                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                gs1VarJ = dVarF.j();
                n17Var = (n17) dVarF.v(h67.c());
                e0bVar = (e0b) dVarF.v(u67.c());
                if (function5 != null) {
                    dVarF.y(1313917368);
                    function0D2 = d(function1, dVarF, i3 & 14);
                    if (!(dVarF.G() instanceof dsd)) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0D2);
                    } else {
                        dVarF.k();
                    }
                    androidx.compose.p004runtime.d dVarC113 = dud.c(dVarF);
                    g(dVarC113, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                    dud.i(dVarC113, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function111) {
                            AndroidView_androidKt.f(layoutNode).setResetBlock(function111);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dud.i(dVarC113, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function111) {
                            AndroidView_androidKt.f(layoutNode).setUpdateBlock(function111);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dud.i(dVarC113, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function111) {
                            AndroidView_androidKt.f(layoutNode).setReleaseBlock(function111);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dVarF.m();
                    dVarF.u();
                } else {
                    dVarF.y(1314774735);
                    function0D = d(function1, dVarF, i3 & 14);
                    if (!(dVarF.G() instanceof dsd)) {
                        pp1.d();
                    }
                    dVarF.J();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0D);
                    } else {
                        dVarF.k();
                    }
                    androidx.compose.p004runtime.d dVarC114 = dud.c(dVarF);
                    g(dVarC114, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                    dud.i(dVarC114, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function111) {
                            AndroidView_androidKt.f(layoutNode).setUpdateBlock(function111);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dud.i(dVarC114, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function111) {
                            AndroidView_androidKt.f(layoutNode).setReleaseBlock(function111);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dVarF.m();
                    dVarF.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
            } else {
                dVarF.q();
                bVar3 = bVar2;
            }
            function8 = function5;
            function9 = function7;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final androidx.compose.ui.b bVar15 = bVar3;
                final Function1<? super T, Unit> function111 = function6;
                s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(androidx.compose.p004runtime.d dVar2, int i11) {
                        AndroidView_androidKt.b(function1, bVar15, function8, function111, function9, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        function5 = function2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                function6 = function3;
                if (dVarF.T(function6)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    function7 = function4;
                    if (dVarF.T(function7)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i10 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if (i6 != 0) {
                        function6 = a;
                    }
                    if (i8 != 0) {
                        function7 = a;
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                    }
                    iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                    bVarE = ComposedModifierKt.e(dVarF, d.e(bVar3));
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                    gs1VarJ = dVarF.j();
                    n17Var = (n17) dVarF.v(h67.c());
                    e0bVar = (e0b) dVarF.v(u67.c());
                    if (function5 != null) {
                        dVarF.y(1313917368);
                        function0D2 = d(function1, dVarF, i3 & 14);
                        if (!(dVarF.G() instanceof dsd)) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0D2);
                        } else {
                            dVarF.k();
                        }
                        androidx.compose.p004runtime.d dVarC115 = dud.c(dVarF);
                        g(dVarC115, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                        dud.i(dVarC115, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function112) {
                                AndroidView_androidKt.f(layoutNode).setResetBlock(function112);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC115, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function112) {
                                AndroidView_androidKt.f(layoutNode).setUpdateBlock(function112);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC115, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function112) {
                                AndroidView_androidKt.f(layoutNode).setReleaseBlock(function112);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dVarF.m();
                        dVarF.u();
                    } else {
                        dVarF.y(1314774735);
                        function0D = d(function1, dVarF, i3 & 14);
                        if (!(dVarF.G() instanceof dsd)) {
                            pp1.d();
                        }
                        dVarF.J();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0D);
                        } else {
                            dVarF.k();
                        }
                        androidx.compose.p004runtime.d dVarC116 = dud.c(dVarF);
                        g(dVarC116, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                        dud.i(dVarC116, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function112) {
                                AndroidView_androidKt.f(layoutNode).setUpdateBlock(function112);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dud.i(dVarC116, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function112) {
                                AndroidView_androidKt.f(layoutNode).setReleaseBlock(function112);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((LayoutNode) obj, (Function1) obj2);
                                return Unit.a;
                            }
                        });
                        dVarF.m();
                        dVarF.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                }
                function8 = function5;
                function9 = function7;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    final androidx.compose.ui.b bVar16 = bVar3;
                    final Function1<? super T, Unit> function112 = function6;
                    s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(androidx.compose.p004runtime.d dVar2, int i11) {
                            AndroidView_androidKt.b(function1, bVar16, function8, function112, function9, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            function7 = function4;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i10 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (i4 != 0) {
                    function5 = null;
                }
                if (i6 != 0) {
                    function6 = a;
                }
                if (i8 != 0) {
                    function7 = a;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                }
                iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                bVarE = ComposedModifierKt.e(dVarF, d.e(bVar3));
                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                gs1VarJ = dVarF.j();
                n17Var = (n17) dVarF.v(h67.c());
                e0bVar = (e0b) dVarF.v(u67.c());
                if (function5 != null) {
                    dVarF.y(1313917368);
                    function0D2 = d(function1, dVarF, i3 & 14);
                    if (!(dVarF.G() instanceof dsd)) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0D2);
                    } else {
                        dVarF.k();
                    }
                    androidx.compose.p004runtime.d dVarC117 = dud.c(dVarF);
                    g(dVarC117, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                    dud.i(dVarC117, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function113) {
                            AndroidView_androidKt.f(layoutNode).setResetBlock(function113);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dud.i(dVarC117, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function113) {
                            AndroidView_androidKt.f(layoutNode).setUpdateBlock(function113);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dud.i(dVarC117, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function113) {
                            AndroidView_androidKt.f(layoutNode).setReleaseBlock(function113);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dVarF.m();
                    dVarF.u();
                } else {
                    dVarF.y(1314774735);
                    function0D = d(function1, dVarF, i3 & 14);
                    if (!(dVarF.G() instanceof dsd)) {
                        pp1.d();
                    }
                    dVarF.J();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0D);
                    } else {
                        dVarF.k();
                    }
                    androidx.compose.p004runtime.d dVarC118 = dud.c(dVarF);
                    g(dVarC118, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                    dud.i(dVarC118, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function113) {
                            AndroidView_androidKt.f(layoutNode).setUpdateBlock(function113);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dud.i(dVarC118, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function113) {
                            AndroidView_androidKt.f(layoutNode).setReleaseBlock(function113);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dVarF.m();
                    dVarF.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
            } else {
                dVarF.q();
                bVar3 = bVar2;
            }
            function8 = function5;
            function9 = function7;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final androidx.compose.ui.b bVar17 = bVar3;
                final Function1<? super T, Unit> function113 = function6;
                s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(androidx.compose.p004runtime.d dVar2, int i11) {
                        AndroidView_androidKt.b(function1, bVar17, function8, function113, function9, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        function6 = function3;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                function7 = function4;
                if (dVarF.T(function7)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i10 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (i4 != 0) {
                    function5 = null;
                }
                if (i6 != 0) {
                    function6 = a;
                }
                if (i8 != 0) {
                    function7 = a;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                }
                iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                bVarE = ComposedModifierKt.e(dVarF, d.e(bVar3));
                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                gs1VarJ = dVarF.j();
                n17Var = (n17) dVarF.v(h67.c());
                e0bVar = (e0b) dVarF.v(u67.c());
                if (function5 != null) {
                    dVarF.y(1313917368);
                    function0D2 = d(function1, dVarF, i3 & 14);
                    if (!(dVarF.G() instanceof dsd)) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0D2);
                    } else {
                        dVarF.k();
                    }
                    androidx.compose.p004runtime.d dVarC119 = dud.c(dVarF);
                    g(dVarC119, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                    dud.i(dVarC119, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function114) {
                            AndroidView_androidKt.f(layoutNode).setResetBlock(function114);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dud.i(dVarC119, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function114) {
                            AndroidView_androidKt.f(layoutNode).setUpdateBlock(function114);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dud.i(dVarC119, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function114) {
                            AndroidView_androidKt.f(layoutNode).setReleaseBlock(function114);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dVarF.m();
                    dVarF.u();
                } else {
                    dVarF.y(1314774735);
                    function0D = d(function1, dVarF, i3 & 14);
                    if (!(dVarF.G() instanceof dsd)) {
                        pp1.d();
                    }
                    dVarF.J();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0D);
                    } else {
                        dVarF.k();
                    }
                    androidx.compose.p004runtime.d dVarC1110 = dud.c(dVarF);
                    g(dVarC1110, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                    dud.i(dVarC1110, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function114) {
                            AndroidView_androidKt.f(layoutNode).setUpdateBlock(function114);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dud.i(dVarC1110, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function114) {
                            AndroidView_androidKt.f(layoutNode).setReleaseBlock(function114);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((LayoutNode) obj, (Function1) obj2);
                            return Unit.a;
                        }
                    });
                    dVarF.m();
                    dVarF.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
            } else {
                dVarF.q();
                bVar3 = bVar2;
            }
            function8 = function5;
            function9 = function7;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final androidx.compose.ui.b bVar18 = bVar3;
                final Function1<? super T, Unit> function114 = function6;
                s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(androidx.compose.p004runtime.d dVar2, int i11) {
                        AndroidView_androidKt.b(function1, bVar18, function8, function114, function9, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 24576;
        function7 = function4;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            if (i10 != 0) {
                bVar3 = androidx.compose.ui.b.INSTANCE;
            } else {
                bVar3 = bVar2;
            }
            if (i4 != 0) {
                function5 = null;
            }
            if (i6 != 0) {
                function6 = a;
            }
            if (i8 != 0) {
                function7 = a;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
            }
            iHashCode = Long.hashCode(pp1.b(dVarF, 0));
            bVarE = ComposedModifierKt.e(dVarF, d.e(bVar3));
            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
            layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
            gs1VarJ = dVarF.j();
            n17Var = (n17) dVarF.v(h67.c());
            e0bVar = (e0b) dVarF.v(u67.c());
            if (function5 != null) {
                dVarF.y(1313917368);
                function0D2 = d(function1, dVarF, i3 & 14);
                if (!(dVarF.G() instanceof dsd)) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0D2);
                } else {
                    dVarF.k();
                }
                androidx.compose.p004runtime.d dVarC1111 = dud.c(dVarF);
                g(dVarC1111, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                dud.i(dVarC1111, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                    public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function115) {
                        AndroidView_androidKt.f(layoutNode).setResetBlock(function115);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        a((LayoutNode) obj, (Function1) obj2);
                        return Unit.a;
                    }
                });
                dud.i(dVarC1111, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                    public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function115) {
                        AndroidView_androidKt.f(layoutNode).setUpdateBlock(function115);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        a((LayoutNode) obj, (Function1) obj2);
                        return Unit.a;
                    }
                });
                dud.i(dVarC1111, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                    public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function115) {
                        AndroidView_androidKt.f(layoutNode).setReleaseBlock(function115);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        a((LayoutNode) obj, (Function1) obj2);
                        return Unit.a;
                    }
                });
                dVarF.m();
                dVarF.u();
            } else {
                dVarF.y(1314774735);
                function0D = d(function1, dVarF, i3 & 14);
                if (!(dVarF.G() instanceof dsd)) {
                    pp1.d();
                }
                dVarF.J();
                if (dVarF.getInserting()) {
                    dVarF.W(function0D);
                } else {
                    dVarF.k();
                }
                androidx.compose.p004runtime.d dVarC1112 = dud.c(dVarF);
                g(dVarC1112, bVarE, iHashCode, f43Var, n17Var, e0bVar, layoutDirection, gs1VarJ);
                dud.i(dVarC1112, function7, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                    public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function115) {
                        AndroidView_androidKt.f(layoutNode).setUpdateBlock(function115);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        a((LayoutNode) obj, (Function1) obj2);
                        return Unit.a;
                    }
                });
                dud.i(dVarC1112, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                    public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function115) {
                        AndroidView_androidKt.f(layoutNode).setReleaseBlock(function115);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        a((LayoutNode) obj, (Function1) obj2);
                        return Unit.a;
                    }
                });
                dVarF.m();
                dVarF.u();
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
            bVar3 = bVar2;
        }
        function8 = function5;
        function9 = function7;
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            final androidx.compose.ui.b bVar19 = bVar3;
            final Function1<? super T, Unit> function115 = function6;
            s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(androidx.compose.p004runtime.d dVar2, int i11) {
                    AndroidView_androidKt.b(function1, bVar19, function8, function115, function9, dVar2, saa.a(i | 1), i2);
                }
            });
        }
    }

    private static final <T extends View> Function0<LayoutNode> d(final Function1<? super Context, ? extends T> function1, androidx.compose.p004runtime.d dVar, int i) {
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.o(2030558801, i, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:252)");
        }
        final int iHashCode = Long.hashCode(pp1.b(dVar, 0));
        final Context context = (Context) dVar.v(AndroidCompositionLocals_androidKt.c());
        final androidx.compose.p004runtime.f fVarE = pp1.e(dVar, 0);
        final qya qyaVar = (qya) dVar.v(tya.g());
        final View view = (View) dVar.v(AndroidCompositionLocals_androidKt.g());
        boolean zT = dVar.T(context) | ((((i & 14) ^ 6) > 4 && dVar.x(function1)) || (i & 6) == 4) | dVar.T(fVarE) | dVar.T(qyaVar) | dVar.C(iHashCode) | dVar.T(view);
        Object objR = dVar.R();
        if (zT || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
            Object obj = new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final LayoutNode invoke() {
                    Context context2 = context;
                    Function1<Context, T> function2 = function1;
                    androidx.compose.p004runtime.f fVar = fVarE;
                    qya qyaVar2 = qyaVar;
                    int i2 = iHashCode;
                    KeyEvent.Callback callback = view;
                    Intrinsics.h(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
                    return new ViewFactoryHolder(context2, function2, fVar, qyaVar2, i2, (m) callback).getLayoutNode();
                }
            };
            dVar.L(obj);
            objR = obj;
        }
        Function0<LayoutNode> function0 = (Function0) objR;
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.n();
        }
        return function0;
    }

    public static final Function1<View, Unit> e() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final <T extends View> ViewFactoryHolder<T> f(LayoutNode layoutNode) throws KotlinNothingValueException {
        AndroidViewHolder interopViewFactoryHolder = layoutNode.getInteropViewFactoryHolder();
        if (interopViewFactoryHolder != null) {
            return (ViewFactoryHolder) interopViewFactoryHolder;
        }
        zw5.d("Required value was null.");
        throw new KotlinNothingValueException();
    }

    private static final <T extends View> void g(androidx.compose.p004runtime.d dVar, androidx.compose.ui.b bVar, int i, f43 f43Var, n17 n17Var, e0b e0bVar, LayoutDirection layoutDirection, gs1 gs1Var) {
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        dud.i(dVar, gs1Var, companion.f());
        dud.i(dVar, bVar, new Function2<LayoutNode, androidx.compose.ui.b, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$1
            public final void a(LayoutNode layoutNode, androidx.compose.ui.b bVar2) {
                AndroidView_androidKt.f(layoutNode).setModifier(bVar2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((LayoutNode) obj, (androidx.compose.ui.b) obj2);
                return Unit.a;
            }
        });
        dud.i(dVar, f43Var, new Function2<LayoutNode, f43, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$2
            public final void a(LayoutNode layoutNode, f43 f43Var2) {
                AndroidView_androidKt.f(layoutNode).setDensity(f43Var2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((LayoutNode) obj, (f43) obj2);
                return Unit.a;
            }
        });
        dud.i(dVar, n17Var, new Function2<LayoutNode, n17, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$3
            public final void a(LayoutNode layoutNode, n17 n17Var2) {
                AndroidView_androidKt.f(layoutNode).setLifecycleOwner(n17Var2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((LayoutNode) obj, (n17) obj2);
                return Unit.a;
            }
        });
        dud.i(dVar, e0bVar, new Function2<LayoutNode, e0b, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$4
            public final void a(LayoutNode layoutNode, e0b e0bVar2) {
                AndroidView_androidKt.f(layoutNode).setSavedStateRegistryOwner(e0bVar2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((LayoutNode) obj, (e0b) obj2);
                return Unit.a;
            }
        });
        dud.i(dVar, layoutDirection, new Function2<LayoutNode, LayoutDirection, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$5

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Ltr.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final void a(LayoutNode layoutNode, LayoutDirection layoutDirection2) throws NoWhenBranchMatchedException, KotlinNothingValueException {
                ViewFactoryHolder viewFactoryHolderF = AndroidView_androidKt.f(layoutNode);
                int i2 = a.$EnumSwitchMapping$0[layoutDirection2.ordinal()];
                int i3 = 1;
                if (i2 == 1) {
                    i3 = 0;
                } else if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                viewFactoryHolderF.setLayoutDirection(i3);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException, KotlinNothingValueException {
                a((LayoutNode) obj, (LayoutDirection) obj2);
                return Unit.a;
            }
        });
        dud.i(dVar, Integer.valueOf(i), companion.c());
    }
}
