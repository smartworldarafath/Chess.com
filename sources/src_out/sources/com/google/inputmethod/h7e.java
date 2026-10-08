package com.google.inputmethod;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.v;
import com.google.android.h7e;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.lp, reason: from Kotlin metadata */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aY\u0010\f\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0087\u0001\u0010\u0010\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0014\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/google/android/h7e;", "T", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "factory", "Landroidx/compose/ui/b;", "modifier", "Lkotlin/Function1;", "", "update", "k", "(Lcom/google/android/ps4;Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)V", "onReset", "onRelease", "l", "(Lcom/google/android/ps4;Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)V", "Landroid/view/View;", "binding", "y", "(Landroid/view/View;Lcom/google/android/h7e;)V", "x", "(Landroid/view/View;)Lcom/google/android/h7e;", "viewGroup", "Landroidx/fragment/app/FragmentContainerView;", "action", "w", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "ui-viewbinding"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h7e {
    public static final <T extends com.google.android.h7e> void k(final ps4<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> ps4Var, b bVar, Function1<? super T, Unit> function1, d dVar, final int i, final int i2) {
        int i3;
        final b bVar2;
        final Function1<? super T, Unit> function2;
        Function1<? super T, Unit> function3;
        d dVarF = dVar.F(-1985291610);
        if ((i & 6) == 0) {
            i3 = (dVarF.T(ps4Var) ? 4 : 2) | i;
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
            i3 |= dVarF.T(function1) ? 256 : 128;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                bVar = b.INSTANCE;
            }
            b bVar3 = bVar;
            if (i5 != 0) {
                Object objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1() { // from class: com.google.android.bp
                        public final Object invoke(Object obj) {
                            return h7e.m((h7e) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                function3 = (Function1) objR;
            } else {
                function3 = function1;
            }
            if (e.k()) {
                e.o(-1985291610, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:77)");
            }
            l(ps4Var, bVar3, null, null, function3, dVarF, (i3 & 14) | 384 | (i3 & 112) | (57344 & (i3 << 6)), 8);
            if (e.k()) {
                e.n();
            }
            bVar2 = bVar3;
            function2 = function3;
        } else {
            dVarF.q();
            bVar2 = bVar;
            function2 = function1;
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.cp
                public final Object invoke(Object obj, Object obj2) {
                    return h7e.n(ps4Var, bVar2, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0149  */
    /* JADX WARN: Code duplicated, block: B:102:0x0153  */
    /* JADX WARN: Code duplicated, block: B:104:0x0163  */
    /* JADX WARN: Code duplicated, block: B:106:0x016b  */
    /* JADX WARN: Code duplicated, block: B:110:0x017c  */
    /* JADX WARN: Code duplicated, block: B:111:0x017f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0191  */
    /* JADX WARN: Code duplicated, block: B:116:0x0199  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:124:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01de  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:135:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x0129  */
    /* JADX WARN: Code duplicated, block: B:92:0x012c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0135  */
    /* JADX WARN: Code duplicated, block: B:97:0x013d  */
    public static final <T extends com.google.android.h7e> void l(final ps4<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> ps4Var, b bVar, Function1<? super T, Unit> function1, Function1<? super T, Unit> function2, Function1<? super T, Unit> function3, d dVar, final int i, final int i2) {
        int i3;
        b bVar2;
        int i4;
        int i5;
        int i6;
        Function1<? super T, Unit> function4;
        int i7;
        int i8;
        final Function1<? super T, Unit> function5;
        int i9;
        boolean z;
        final Function1<? super T, Unit> function6;
        final b bVar3;
        final Function1<? super T, Unit> function7;
        final Function1<? super T, Unit> function8;
        s6b s6bVarH;
        b bVar4;
        Function1 function9;
        final Function1<? super T, Unit> function10;
        final Function1<? super T, Unit> function11;
        View view;
        boolean zX;
        Object objR;
        final Fragment fragment;
        final Context context;
        boolean z2;
        boolean z3;
        Object objR2;
        boolean zX2;
        Object objR3;
        boolean z4;
        boolean zT;
        Object objR4;
        boolean z5;
        Object objR5;
        Object objR6;
        Object objR7;
        d dVarF = dVar.F(509101952);
        if ((i & 6) == 0) {
            i3 = (dVarF.T(ps4Var) ? 4 : 2) | i;
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
                    if (dVarF.T(function1)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        function4 = function2;
                        if (dVarF.T(function4)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            function5 = function3;
                            if (dVarF.T(function5)) {
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
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            function9 = null;
                            if (i4 != 0) {
                                function10 = null;
                            } else {
                                function10 = function1;
                            }
                            if (i6 != 0) {
                                objR7 = dVarF.R();
                                if (objR7 == d.INSTANCE.a()) {
                                    objR7 = new Function1() { // from class: com.google.android.dp
                                        public final Object invoke(Object obj) {
                                            return h7e.o((h7e) obj);
                                        }
                                    };
                                    dVarF.L(objR7);
                                }
                                function11 = (Function1) objR7;
                            } else {
                                function11 = function4;
                            }
                            if (i8 != 0) {
                                objR6 = dVarF.R();
                                if (objR6 == d.INSTANCE.a()) {
                                    objR6 = new Function1() { // from class: com.google.android.ep
                                        public final Object invoke(Object obj) {
                                            return h7e.p((h7e) obj);
                                        }
                                    };
                                    dVarF.L(objR6);
                                }
                                function5 = (Function1) objR6;
                            }
                            if (e.k()) {
                                e.o(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                            }
                            view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                            zX = dVarF.x(view);
                            objR = dVarF.R();
                            if (zX || objR == d.INSTANCE.a()) {
                                try {
                                    objR = k8e.a(view);
                                } catch (IllegalStateException unused) {
                                    objR = null;
                                }
                                dVarF.L(objR);
                            }
                            fragment = (Fragment) objR;
                            context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                            boolean zT2 = dVarF.T(fragment);
                            if ((i3 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            z3 = z2 | zT2;
                            objR2 = dVarF.R();
                            if (z3 || objR2 == d.INSTANCE.a()) {
                                objR2 = new Function1() { // from class: com.google.android.fp
                                    public final Object invoke(Object obj) {
                                        return h7e.q(fragment, ps4Var, (Context) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            Function1 function12 = (Function1) objR2;
                            if (function10 == null) {
                                dVarF.y(1128074792);
                            } else {
                                dVarF.y(1128074793);
                                zX2 = dVarF.x(function10);
                                objR3 = dVarF.R();
                                if (zX2 || objR3 == d.INSTANCE.a()) {
                                    objR3 = new Function1() { // from class: com.google.android.gp
                                        public final Object invoke(Object obj) {
                                            return h7e.r(function10, (View) obj);
                                        }
                                    };
                                    dVarF.L(objR3);
                                }
                                function9 = (Function1) objR3;
                            }
                            dVarF.u();
                            if ((i3 & 7168) == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            zT = z4 | dVarF.T(fragment) | dVarF.T(context);
                            objR4 = dVarF.R();
                            if (zT || objR4 == d.INSTANCE.a()) {
                                objR4 = new Function1() { // from class: com.google.android.hp
                                    public final Object invoke(Object obj) {
                                        return h7e.s(function11, fragment, context, (View) obj);
                                    }
                                };
                                dVarF.L(objR4);
                            }
                            Function1 function13 = (Function1) objR4;
                            z5 = (57344 & i3) == 16384;
                            objR5 = dVarF.R();
                            if (z5 || objR5 == d.INSTANCE.a()) {
                                objR5 = new Function1() { // from class: com.google.android.ip
                                    public final Object invoke(Object obj) {
                                        return h7e.u(function5, (View) obj);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            Function1<? super T, Unit> function14 = function11;
                            AndroidView_androidKt.b(function12, bVar4, function9, function13, (Function1) objR5, dVarF, i3 & 112, 0);
                            if (e.k()) {
                                e.n();
                            }
                            function7 = function14;
                            function6 = function10;
                            bVar3 = bVar4;
                        } else {
                            dVarF.q();
                            function6 = function1;
                            bVar3 = bVar2;
                            function7 = function4;
                        }
                        function8 = function5;
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.jp
                                public final Object invoke(Object obj, Object obj2) {
                                    return h7e.v(ps4Var, bVar3, function6, function7, function8, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 24576;
                    function5 = function3;
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i10 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        function9 = null;
                        if (i4 != 0) {
                            function10 = null;
                        } else {
                            function10 = function1;
                        }
                        if (i6 != 0) {
                            objR7 = dVarF.R();
                            if (objR7 == d.INSTANCE.a()) {
                                objR7 = new Function1() { // from class: com.google.android.dp
                                    public final Object invoke(Object obj) {
                                        return h7e.o((h7e) obj);
                                    }
                                };
                                dVarF.L(objR7);
                            }
                            function11 = (Function1) objR7;
                        } else {
                            function11 = function4;
                        }
                        if (i8 != 0) {
                            objR6 = dVarF.R();
                            if (objR6 == d.INSTANCE.a()) {
                                objR6 = new Function1() { // from class: com.google.android.ep
                                    public final Object invoke(Object obj) {
                                        return h7e.p((h7e) obj);
                                    }
                                };
                                dVarF.L(objR6);
                            }
                            function5 = (Function1) objR6;
                        }
                        if (e.k()) {
                            e.o(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                        }
                        view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                        zX = dVarF.x(view);
                        objR = dVarF.R();
                        if (zX) {
                            objR = k8e.a(view);
                            dVarF.L(objR);
                        } else {
                            objR = k8e.a(view);
                            dVarF.L(objR);
                        }
                        fragment = (Fragment) objR;
                        context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                        boolean zT3 = dVarF.T(fragment);
                        if ((i3 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = z2 | zT3;
                        objR2 = dVarF.R();
                        if (z3) {
                            objR2 = new Function1() { // from class: com.google.android.fp
                                public final Object invoke(Object obj) {
                                    return h7e.q(fragment, ps4Var, (Context) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.fp
                                public final Object invoke(Object obj) {
                                    return h7e.q(fragment, ps4Var, (Context) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        Function1 function15 = (Function1) objR2;
                        if (function10 == null) {
                            dVarF.y(1128074792);
                        } else {
                            dVarF.y(1128074793);
                            zX2 = dVarF.x(function10);
                            objR3 = dVarF.R();
                            if (zX2) {
                                objR3 = new Function1() { // from class: com.google.android.gp
                                    public final Object invoke(Object obj) {
                                        return h7e.r(function10, (View) obj);
                                    }
                                };
                                dVarF.L(objR3);
                            } else {
                                objR3 = new Function1() { // from class: com.google.android.gp
                                    public final Object invoke(Object obj) {
                                        return h7e.r(function10, (View) obj);
                                    }
                                };
                                dVarF.L(objR3);
                            }
                            function9 = (Function1) objR3;
                        }
                        dVarF.u();
                        if ((i3 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zT = z4 | dVarF.T(fragment) | dVarF.T(context);
                        objR4 = dVarF.R();
                        if (zT) {
                            objR4 = new Function1() { // from class: com.google.android.hp
                                public final Object invoke(Object obj) {
                                    return h7e.s(function11, fragment, context, (View) obj);
                                }
                            };
                            dVarF.L(objR4);
                        } else {
                            objR4 = new Function1() { // from class: com.google.android.hp
                                public final Object invoke(Object obj) {
                                    return h7e.s(function11, fragment, context, (View) obj);
                                }
                            };
                            dVarF.L(objR4);
                        }
                        Function1 function16 = (Function1) objR4;
                        if ((57344 & i3) == 16384) {
                        }
                        objR5 = dVarF.R();
                        if (z5) {
                            objR5 = new Function1() { // from class: com.google.android.ip
                                public final Object invoke(Object obj) {
                                    return h7e.u(function5, (View) obj);
                                }
                            };
                            dVarF.L(objR5);
                        } else {
                            objR5 = new Function1() { // from class: com.google.android.ip
                                public final Object invoke(Object obj) {
                                    return h7e.u(function5, (View) obj);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        Function1<? super T, Unit> function17 = function11;
                        AndroidView_androidKt.b(function15, bVar4, function9, function16, (Function1) objR5, dVarF, i3 & 112, 0);
                        if (e.k()) {
                            e.n();
                        }
                        function7 = function17;
                        function6 = function10;
                        bVar3 = bVar4;
                    } else {
                        dVarF.q();
                        function6 = function1;
                        bVar3 = bVar2;
                        function7 = function4;
                    }
                    function8 = function5;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.jp
                            public final Object invoke(Object obj, Object obj2) {
                                return h7e.v(ps4Var, bVar3, function6, function7, function8, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 3072;
                function4 = function2;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        function5 = function3;
                        if (dVarF.T(function5)) {
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
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        function9 = null;
                        if (i4 != 0) {
                            function10 = null;
                        } else {
                            function10 = function1;
                        }
                        if (i6 != 0) {
                            objR7 = dVarF.R();
                            if (objR7 == d.INSTANCE.a()) {
                                objR7 = new Function1() { // from class: com.google.android.dp
                                    public final Object invoke(Object obj) {
                                        return h7e.o((h7e) obj);
                                    }
                                };
                                dVarF.L(objR7);
                            }
                            function11 = (Function1) objR7;
                        } else {
                            function11 = function4;
                        }
                        if (i8 != 0) {
                            objR6 = dVarF.R();
                            if (objR6 == d.INSTANCE.a()) {
                                objR6 = new Function1() { // from class: com.google.android.ep
                                    public final Object invoke(Object obj) {
                                        return h7e.p((h7e) obj);
                                    }
                                };
                                dVarF.L(objR6);
                            }
                            function5 = (Function1) objR6;
                        }
                        if (e.k()) {
                            e.o(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                        }
                        view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                        zX = dVarF.x(view);
                        objR = dVarF.R();
                        if (zX) {
                            objR = k8e.a(view);
                            dVarF.L(objR);
                        } else {
                            objR = k8e.a(view);
                            dVarF.L(objR);
                        }
                        fragment = (Fragment) objR;
                        context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                        boolean zT4 = dVarF.T(fragment);
                        if ((i3 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = z2 | zT4;
                        objR2 = dVarF.R();
                        if (z3) {
                            objR2 = new Function1() { // from class: com.google.android.fp
                                public final Object invoke(Object obj) {
                                    return h7e.q(fragment, ps4Var, (Context) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.fp
                                public final Object invoke(Object obj) {
                                    return h7e.q(fragment, ps4Var, (Context) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        Function1 function18 = (Function1) objR2;
                        if (function10 == null) {
                            dVarF.y(1128074792);
                        } else {
                            dVarF.y(1128074793);
                            zX2 = dVarF.x(function10);
                            objR3 = dVarF.R();
                            if (zX2) {
                                objR3 = new Function1() { // from class: com.google.android.gp
                                    public final Object invoke(Object obj) {
                                        return h7e.r(function10, (View) obj);
                                    }
                                };
                                dVarF.L(objR3);
                            } else {
                                objR3 = new Function1() { // from class: com.google.android.gp
                                    public final Object invoke(Object obj) {
                                        return h7e.r(function10, (View) obj);
                                    }
                                };
                                dVarF.L(objR3);
                            }
                            function9 = (Function1) objR3;
                        }
                        dVarF.u();
                        if ((i3 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zT = z4 | dVarF.T(fragment) | dVarF.T(context);
                        objR4 = dVarF.R();
                        if (zT) {
                            objR4 = new Function1() { // from class: com.google.android.hp
                                public final Object invoke(Object obj) {
                                    return h7e.s(function11, fragment, context, (View) obj);
                                }
                            };
                            dVarF.L(objR4);
                        } else {
                            objR4 = new Function1() { // from class: com.google.android.hp
                                public final Object invoke(Object obj) {
                                    return h7e.s(function11, fragment, context, (View) obj);
                                }
                            };
                            dVarF.L(objR4);
                        }
                        Function1 function19 = (Function1) objR4;
                        if ((57344 & i3) == 16384) {
                        }
                        objR5 = dVarF.R();
                        if (z5) {
                            objR5 = new Function1() { // from class: com.google.android.ip
                                public final Object invoke(Object obj) {
                                    return h7e.u(function5, (View) obj);
                                }
                            };
                            dVarF.L(objR5);
                        } else {
                            objR5 = new Function1() { // from class: com.google.android.ip
                                public final Object invoke(Object obj) {
                                    return h7e.u(function5, (View) obj);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        Function1<? super T, Unit> function110 = function11;
                        AndroidView_androidKt.b(function18, bVar4, function9, function19, (Function1) objR5, dVarF, i3 & 112, 0);
                        if (e.k()) {
                            e.n();
                        }
                        function7 = function110;
                        function6 = function10;
                        bVar3 = bVar4;
                    } else {
                        dVarF.q();
                        function6 = function1;
                        bVar3 = bVar2;
                        function7 = function4;
                    }
                    function8 = function5;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.jp
                            public final Object invoke(Object obj, Object obj2) {
                                return h7e.v(ps4Var, bVar3, function6, function7, function8, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                function5 = function3;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i10 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    function9 = null;
                    if (i4 != 0) {
                        function10 = null;
                    } else {
                        function10 = function1;
                    }
                    if (i6 != 0) {
                        objR7 = dVarF.R();
                        if (objR7 == d.INSTANCE.a()) {
                            objR7 = new Function1() { // from class: com.google.android.dp
                                public final Object invoke(Object obj) {
                                    return h7e.o((h7e) obj);
                                }
                            };
                            dVarF.L(objR7);
                        }
                        function11 = (Function1) objR7;
                    } else {
                        function11 = function4;
                    }
                    if (i8 != 0) {
                        objR6 = dVarF.R();
                        if (objR6 == d.INSTANCE.a()) {
                            objR6 = new Function1() { // from class: com.google.android.ep
                                public final Object invoke(Object obj) {
                                    return h7e.p((h7e) obj);
                                }
                            };
                            dVarF.L(objR6);
                        }
                        function5 = (Function1) objR6;
                    }
                    if (e.k()) {
                        e.o(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                    }
                    view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                    zX = dVarF.x(view);
                    objR = dVarF.R();
                    if (zX) {
                        objR = k8e.a(view);
                        dVarF.L(objR);
                    } else {
                        objR = k8e.a(view);
                        dVarF.L(objR);
                    }
                    fragment = (Fragment) objR;
                    context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                    boolean zT5 = dVarF.T(fragment);
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | zT5;
                    objR2 = dVarF.R();
                    if (z3) {
                        objR2 = new Function1() { // from class: com.google.android.fp
                            public final Object invoke(Object obj) {
                                return h7e.q(fragment, ps4Var, (Context) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.fp
                            public final Object invoke(Object obj) {
                                return h7e.q(fragment, ps4Var, (Context) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    Function1 function111 = (Function1) objR2;
                    if (function10 == null) {
                        dVarF.y(1128074792);
                    } else {
                        dVarF.y(1128074793);
                        zX2 = dVarF.x(function10);
                        objR3 = dVarF.R();
                        if (zX2) {
                            objR3 = new Function1() { // from class: com.google.android.gp
                                public final Object invoke(Object obj) {
                                    return h7e.r(function10, (View) obj);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1() { // from class: com.google.android.gp
                                public final Object invoke(Object obj) {
                                    return h7e.r(function10, (View) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        function9 = (Function1) objR3;
                    }
                    dVarF.u();
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zT = z4 | dVarF.T(fragment) | dVarF.T(context);
                    objR4 = dVarF.R();
                    if (zT) {
                        objR4 = new Function1() { // from class: com.google.android.hp
                            public final Object invoke(Object obj) {
                                return h7e.s(function11, fragment, context, (View) obj);
                            }
                        };
                        dVarF.L(objR4);
                    } else {
                        objR4 = new Function1() { // from class: com.google.android.hp
                            public final Object invoke(Object obj) {
                                return h7e.s(function11, fragment, context, (View) obj);
                            }
                        };
                        dVarF.L(objR4);
                    }
                    Function1 function112 = (Function1) objR4;
                    if ((57344 & i3) == 16384) {
                    }
                    objR5 = dVarF.R();
                    if (z5) {
                        objR5 = new Function1() { // from class: com.google.android.ip
                            public final Object invoke(Object obj) {
                                return h7e.u(function5, (View) obj);
                            }
                        };
                        dVarF.L(objR5);
                    } else {
                        objR5 = new Function1() { // from class: com.google.android.ip
                            public final Object invoke(Object obj) {
                                return h7e.u(function5, (View) obj);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    Function1<? super T, Unit> function113 = function11;
                    AndroidView_androidKt.b(function111, bVar4, function9, function112, (Function1) objR5, dVarF, i3 & 112, 0);
                    if (e.k()) {
                        e.n();
                    }
                    function7 = function113;
                    function6 = function10;
                    bVar3 = bVar4;
                } else {
                    dVarF.q();
                    function6 = function1;
                    bVar3 = bVar2;
                    function7 = function4;
                }
                function8 = function5;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.jp
                        public final Object invoke(Object obj, Object obj2) {
                            return h7e.v(ps4Var, bVar3, function6, function7, function8, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 384;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    function4 = function2;
                    if (dVarF.T(function4)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        function5 = function3;
                        if (dVarF.T(function5)) {
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
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        function9 = null;
                        if (i4 != 0) {
                            function10 = null;
                        } else {
                            function10 = function1;
                        }
                        if (i6 != 0) {
                            objR7 = dVarF.R();
                            if (objR7 == d.INSTANCE.a()) {
                                objR7 = new Function1() { // from class: com.google.android.dp
                                    public final Object invoke(Object obj) {
                                        return h7e.o((h7e) obj);
                                    }
                                };
                                dVarF.L(objR7);
                            }
                            function11 = (Function1) objR7;
                        } else {
                            function11 = function4;
                        }
                        if (i8 != 0) {
                            objR6 = dVarF.R();
                            if (objR6 == d.INSTANCE.a()) {
                                objR6 = new Function1() { // from class: com.google.android.ep
                                    public final Object invoke(Object obj) {
                                        return h7e.p((h7e) obj);
                                    }
                                };
                                dVarF.L(objR6);
                            }
                            function5 = (Function1) objR6;
                        }
                        if (e.k()) {
                            e.o(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                        }
                        view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                        zX = dVarF.x(view);
                        objR = dVarF.R();
                        if (zX) {
                            objR = k8e.a(view);
                            dVarF.L(objR);
                        } else {
                            objR = k8e.a(view);
                            dVarF.L(objR);
                        }
                        fragment = (Fragment) objR;
                        context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                        boolean zT6 = dVarF.T(fragment);
                        if ((i3 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = z2 | zT6;
                        objR2 = dVarF.R();
                        if (z3) {
                            objR2 = new Function1() { // from class: com.google.android.fp
                                public final Object invoke(Object obj) {
                                    return h7e.q(fragment, ps4Var, (Context) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.fp
                                public final Object invoke(Object obj) {
                                    return h7e.q(fragment, ps4Var, (Context) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        Function1 function114 = (Function1) objR2;
                        if (function10 == null) {
                            dVarF.y(1128074792);
                        } else {
                            dVarF.y(1128074793);
                            zX2 = dVarF.x(function10);
                            objR3 = dVarF.R();
                            if (zX2) {
                                objR3 = new Function1() { // from class: com.google.android.gp
                                    public final Object invoke(Object obj) {
                                        return h7e.r(function10, (View) obj);
                                    }
                                };
                                dVarF.L(objR3);
                            } else {
                                objR3 = new Function1() { // from class: com.google.android.gp
                                    public final Object invoke(Object obj) {
                                        return h7e.r(function10, (View) obj);
                                    }
                                };
                                dVarF.L(objR3);
                            }
                            function9 = (Function1) objR3;
                        }
                        dVarF.u();
                        if ((i3 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zT = z4 | dVarF.T(fragment) | dVarF.T(context);
                        objR4 = dVarF.R();
                        if (zT) {
                            objR4 = new Function1() { // from class: com.google.android.hp
                                public final Object invoke(Object obj) {
                                    return h7e.s(function11, fragment, context, (View) obj);
                                }
                            };
                            dVarF.L(objR4);
                        } else {
                            objR4 = new Function1() { // from class: com.google.android.hp
                                public final Object invoke(Object obj) {
                                    return h7e.s(function11, fragment, context, (View) obj);
                                }
                            };
                            dVarF.L(objR4);
                        }
                        Function1 function115 = (Function1) objR4;
                        if ((57344 & i3) == 16384) {
                        }
                        objR5 = dVarF.R();
                        if (z5) {
                            objR5 = new Function1() { // from class: com.google.android.ip
                                public final Object invoke(Object obj) {
                                    return h7e.u(function5, (View) obj);
                                }
                            };
                            dVarF.L(objR5);
                        } else {
                            objR5 = new Function1() { // from class: com.google.android.ip
                                public final Object invoke(Object obj) {
                                    return h7e.u(function5, (View) obj);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        Function1<? super T, Unit> function116 = function11;
                        AndroidView_androidKt.b(function114, bVar4, function9, function115, (Function1) objR5, dVarF, i3 & 112, 0);
                        if (e.k()) {
                            e.n();
                        }
                        function7 = function116;
                        function6 = function10;
                        bVar3 = bVar4;
                    } else {
                        dVarF.q();
                        function6 = function1;
                        bVar3 = bVar2;
                        function7 = function4;
                    }
                    function8 = function5;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.jp
                            public final Object invoke(Object obj, Object obj2) {
                                return h7e.v(ps4Var, bVar3, function6, function7, function8, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                function5 = function3;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i10 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    function9 = null;
                    if (i4 != 0) {
                        function10 = null;
                    } else {
                        function10 = function1;
                    }
                    if (i6 != 0) {
                        objR7 = dVarF.R();
                        if (objR7 == d.INSTANCE.a()) {
                            objR7 = new Function1() { // from class: com.google.android.dp
                                public final Object invoke(Object obj) {
                                    return h7e.o((h7e) obj);
                                }
                            };
                            dVarF.L(objR7);
                        }
                        function11 = (Function1) objR7;
                    } else {
                        function11 = function4;
                    }
                    if (i8 != 0) {
                        objR6 = dVarF.R();
                        if (objR6 == d.INSTANCE.a()) {
                            objR6 = new Function1() { // from class: com.google.android.ep
                                public final Object invoke(Object obj) {
                                    return h7e.p((h7e) obj);
                                }
                            };
                            dVarF.L(objR6);
                        }
                        function5 = (Function1) objR6;
                    }
                    if (e.k()) {
                        e.o(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                    }
                    view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                    zX = dVarF.x(view);
                    objR = dVarF.R();
                    if (zX) {
                        objR = k8e.a(view);
                        dVarF.L(objR);
                    } else {
                        objR = k8e.a(view);
                        dVarF.L(objR);
                    }
                    fragment = (Fragment) objR;
                    context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                    boolean zT7 = dVarF.T(fragment);
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | zT7;
                    objR2 = dVarF.R();
                    if (z3) {
                        objR2 = new Function1() { // from class: com.google.android.fp
                            public final Object invoke(Object obj) {
                                return h7e.q(fragment, ps4Var, (Context) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.fp
                            public final Object invoke(Object obj) {
                                return h7e.q(fragment, ps4Var, (Context) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    Function1 function117 = (Function1) objR2;
                    if (function10 == null) {
                        dVarF.y(1128074792);
                    } else {
                        dVarF.y(1128074793);
                        zX2 = dVarF.x(function10);
                        objR3 = dVarF.R();
                        if (zX2) {
                            objR3 = new Function1() { // from class: com.google.android.gp
                                public final Object invoke(Object obj) {
                                    return h7e.r(function10, (View) obj);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1() { // from class: com.google.android.gp
                                public final Object invoke(Object obj) {
                                    return h7e.r(function10, (View) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        function9 = (Function1) objR3;
                    }
                    dVarF.u();
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zT = z4 | dVarF.T(fragment) | dVarF.T(context);
                    objR4 = dVarF.R();
                    if (zT) {
                        objR4 = new Function1() { // from class: com.google.android.hp
                            public final Object invoke(Object obj) {
                                return h7e.s(function11, fragment, context, (View) obj);
                            }
                        };
                        dVarF.L(objR4);
                    } else {
                        objR4 = new Function1() { // from class: com.google.android.hp
                            public final Object invoke(Object obj) {
                                return h7e.s(function11, fragment, context, (View) obj);
                            }
                        };
                        dVarF.L(objR4);
                    }
                    Function1 function118 = (Function1) objR4;
                    if ((57344 & i3) == 16384) {
                    }
                    objR5 = dVarF.R();
                    if (z5) {
                        objR5 = new Function1() { // from class: com.google.android.ip
                            public final Object invoke(Object obj) {
                                return h7e.u(function5, (View) obj);
                            }
                        };
                        dVarF.L(objR5);
                    } else {
                        objR5 = new Function1() { // from class: com.google.android.ip
                            public final Object invoke(Object obj) {
                                return h7e.u(function5, (View) obj);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    Function1<? super T, Unit> function119 = function11;
                    AndroidView_androidKt.b(function117, bVar4, function9, function118, (Function1) objR5, dVarF, i3 & 112, 0);
                    if (e.k()) {
                        e.n();
                    }
                    function7 = function119;
                    function6 = function10;
                    bVar3 = bVar4;
                } else {
                    dVarF.q();
                    function6 = function1;
                    bVar3 = bVar2;
                    function7 = function4;
                }
                function8 = function5;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.jp
                        public final Object invoke(Object obj, Object obj2) {
                            return h7e.v(ps4Var, bVar3, function6, function7, function8, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            function4 = function2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    function5 = function3;
                    if (dVarF.T(function5)) {
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
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    function9 = null;
                    if (i4 != 0) {
                        function10 = null;
                    } else {
                        function10 = function1;
                    }
                    if (i6 != 0) {
                        objR7 = dVarF.R();
                        if (objR7 == d.INSTANCE.a()) {
                            objR7 = new Function1() { // from class: com.google.android.dp
                                public final Object invoke(Object obj) {
                                    return h7e.o((h7e) obj);
                                }
                            };
                            dVarF.L(objR7);
                        }
                        function11 = (Function1) objR7;
                    } else {
                        function11 = function4;
                    }
                    if (i8 != 0) {
                        objR6 = dVarF.R();
                        if (objR6 == d.INSTANCE.a()) {
                            objR6 = new Function1() { // from class: com.google.android.ep
                                public final Object invoke(Object obj) {
                                    return h7e.p((h7e) obj);
                                }
                            };
                            dVarF.L(objR6);
                        }
                        function5 = (Function1) objR6;
                    }
                    if (e.k()) {
                        e.o(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                    }
                    view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                    zX = dVarF.x(view);
                    objR = dVarF.R();
                    if (zX) {
                        objR = k8e.a(view);
                        dVarF.L(objR);
                    } else {
                        objR = k8e.a(view);
                        dVarF.L(objR);
                    }
                    fragment = (Fragment) objR;
                    context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                    boolean zT8 = dVarF.T(fragment);
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | zT8;
                    objR2 = dVarF.R();
                    if (z3) {
                        objR2 = new Function1() { // from class: com.google.android.fp
                            public final Object invoke(Object obj) {
                                return h7e.q(fragment, ps4Var, (Context) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.fp
                            public final Object invoke(Object obj) {
                                return h7e.q(fragment, ps4Var, (Context) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    Function1 function1110 = (Function1) objR2;
                    if (function10 == null) {
                        dVarF.y(1128074792);
                    } else {
                        dVarF.y(1128074793);
                        zX2 = dVarF.x(function10);
                        objR3 = dVarF.R();
                        if (zX2) {
                            objR3 = new Function1() { // from class: com.google.android.gp
                                public final Object invoke(Object obj) {
                                    return h7e.r(function10, (View) obj);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1() { // from class: com.google.android.gp
                                public final Object invoke(Object obj) {
                                    return h7e.r(function10, (View) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        function9 = (Function1) objR3;
                    }
                    dVarF.u();
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zT = z4 | dVarF.T(fragment) | dVarF.T(context);
                    objR4 = dVarF.R();
                    if (zT) {
                        objR4 = new Function1() { // from class: com.google.android.hp
                            public final Object invoke(Object obj) {
                                return h7e.s(function11, fragment, context, (View) obj);
                            }
                        };
                        dVarF.L(objR4);
                    } else {
                        objR4 = new Function1() { // from class: com.google.android.hp
                            public final Object invoke(Object obj) {
                                return h7e.s(function11, fragment, context, (View) obj);
                            }
                        };
                        dVarF.L(objR4);
                    }
                    Function1 function1111 = (Function1) objR4;
                    if ((57344 & i3) == 16384) {
                    }
                    objR5 = dVarF.R();
                    if (z5) {
                        objR5 = new Function1() { // from class: com.google.android.ip
                            public final Object invoke(Object obj) {
                                return h7e.u(function5, (View) obj);
                            }
                        };
                        dVarF.L(objR5);
                    } else {
                        objR5 = new Function1() { // from class: com.google.android.ip
                            public final Object invoke(Object obj) {
                                return h7e.u(function5, (View) obj);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    Function1<? super T, Unit> function1112 = function11;
                    AndroidView_androidKt.b(function1110, bVar4, function9, function1111, (Function1) objR5, dVarF, i3 & 112, 0);
                    if (e.k()) {
                        e.n();
                    }
                    function7 = function1112;
                    function6 = function10;
                    bVar3 = bVar4;
                } else {
                    dVarF.q();
                    function6 = function1;
                    bVar3 = bVar2;
                    function7 = function4;
                }
                function8 = function5;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.jp
                        public final Object invoke(Object obj, Object obj2) {
                            return h7e.v(ps4Var, bVar3, function6, function7, function8, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            function5 = function3;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i10 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                function9 = null;
                if (i4 != 0) {
                    function10 = null;
                } else {
                    function10 = function1;
                }
                if (i6 != 0) {
                    objR7 = dVarF.R();
                    if (objR7 == d.INSTANCE.a()) {
                        objR7 = new Function1() { // from class: com.google.android.dp
                            public final Object invoke(Object obj) {
                                return h7e.o((h7e) obj);
                            }
                        };
                        dVarF.L(objR7);
                    }
                    function11 = (Function1) objR7;
                } else {
                    function11 = function4;
                }
                if (i8 != 0) {
                    objR6 = dVarF.R();
                    if (objR6 == d.INSTANCE.a()) {
                        objR6 = new Function1() { // from class: com.google.android.ep
                            public final Object invoke(Object obj) {
                                return h7e.p((h7e) obj);
                            }
                        };
                        dVarF.L(objR6);
                    }
                    function5 = (Function1) objR6;
                }
                if (e.k()) {
                    e.o(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                }
                view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                zX = dVarF.x(view);
                objR = dVarF.R();
                if (zX) {
                    objR = k8e.a(view);
                    dVarF.L(objR);
                } else {
                    objR = k8e.a(view);
                    dVarF.L(objR);
                }
                fragment = (Fragment) objR;
                context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                boolean zT9 = dVarF.T(fragment);
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | zT9;
                objR2 = dVarF.R();
                if (z3) {
                    objR2 = new Function1() { // from class: com.google.android.fp
                        public final Object invoke(Object obj) {
                            return h7e.q(fragment, ps4Var, (Context) obj);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function1() { // from class: com.google.android.fp
                        public final Object invoke(Object obj) {
                            return h7e.q(fragment, ps4Var, (Context) obj);
                        }
                    };
                    dVarF.L(objR2);
                }
                Function1 function1113 = (Function1) objR2;
                if (function10 == null) {
                    dVarF.y(1128074792);
                } else {
                    dVarF.y(1128074793);
                    zX2 = dVarF.x(function10);
                    objR3 = dVarF.R();
                    if (zX2) {
                        objR3 = new Function1() { // from class: com.google.android.gp
                            public final Object invoke(Object obj) {
                                return h7e.r(function10, (View) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.gp
                            public final Object invoke(Object obj) {
                                return h7e.r(function10, (View) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    function9 = (Function1) objR3;
                }
                dVarF.u();
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zT = z4 | dVarF.T(fragment) | dVarF.T(context);
                objR4 = dVarF.R();
                if (zT) {
                    objR4 = new Function1() { // from class: com.google.android.hp
                        public final Object invoke(Object obj) {
                            return h7e.s(function11, fragment, context, (View) obj);
                        }
                    };
                    dVarF.L(objR4);
                } else {
                    objR4 = new Function1() { // from class: com.google.android.hp
                        public final Object invoke(Object obj) {
                            return h7e.s(function11, fragment, context, (View) obj);
                        }
                    };
                    dVarF.L(objR4);
                }
                Function1 function1114 = (Function1) objR4;
                if ((57344 & i3) == 16384) {
                }
                objR5 = dVarF.R();
                if (z5) {
                    objR5 = new Function1() { // from class: com.google.android.ip
                        public final Object invoke(Object obj) {
                            return h7e.u(function5, (View) obj);
                        }
                    };
                    dVarF.L(objR5);
                } else {
                    objR5 = new Function1() { // from class: com.google.android.ip
                        public final Object invoke(Object obj) {
                            return h7e.u(function5, (View) obj);
                        }
                    };
                    dVarF.L(objR5);
                }
                Function1<? super T, Unit> function1115 = function11;
                AndroidView_androidKt.b(function1113, bVar4, function9, function1114, (Function1) objR5, dVarF, i3 & 112, 0);
                if (e.k()) {
                    e.n();
                }
                function7 = function1115;
                function6 = function10;
                bVar3 = bVar4;
            } else {
                dVarF.q();
                function6 = function1;
                bVar3 = bVar2;
                function7 = function4;
            }
            function8 = function5;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.jp
                    public final Object invoke(Object obj, Object obj2) {
                        return h7e.v(ps4Var, bVar3, function6, function7, function8, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        bVar2 = bVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                if (dVarF.T(function1)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    function4 = function2;
                    if (dVarF.T(function4)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        function5 = function3;
                        if (dVarF.T(function5)) {
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
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        function9 = null;
                        if (i4 != 0) {
                            function10 = null;
                        } else {
                            function10 = function1;
                        }
                        if (i6 != 0) {
                            objR7 = dVarF.R();
                            if (objR7 == d.INSTANCE.a()) {
                                objR7 = new Function1() { // from class: com.google.android.dp
                                    public final Object invoke(Object obj) {
                                        return h7e.o((h7e) obj);
                                    }
                                };
                                dVarF.L(objR7);
                            }
                            function11 = (Function1) objR7;
                        } else {
                            function11 = function4;
                        }
                        if (i8 != 0) {
                            objR6 = dVarF.R();
                            if (objR6 == d.INSTANCE.a()) {
                                objR6 = new Function1() { // from class: com.google.android.ep
                                    public final Object invoke(Object obj) {
                                        return h7e.p((h7e) obj);
                                    }
                                };
                                dVarF.L(objR6);
                            }
                            function5 = (Function1) objR6;
                        }
                        if (e.k()) {
                            e.o(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                        }
                        view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                        zX = dVarF.x(view);
                        objR = dVarF.R();
                        if (zX) {
                            objR = k8e.a(view);
                            dVarF.L(objR);
                        } else {
                            objR = k8e.a(view);
                            dVarF.L(objR);
                        }
                        fragment = (Fragment) objR;
                        context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                        boolean zT10 = dVarF.T(fragment);
                        if ((i3 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = z2 | zT10;
                        objR2 = dVarF.R();
                        if (z3) {
                            objR2 = new Function1() { // from class: com.google.android.fp
                                public final Object invoke(Object obj) {
                                    return h7e.q(fragment, ps4Var, (Context) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.fp
                                public final Object invoke(Object obj) {
                                    return h7e.q(fragment, ps4Var, (Context) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        Function1 function1116 = (Function1) objR2;
                        if (function10 == null) {
                            dVarF.y(1128074792);
                        } else {
                            dVarF.y(1128074793);
                            zX2 = dVarF.x(function10);
                            objR3 = dVarF.R();
                            if (zX2) {
                                objR3 = new Function1() { // from class: com.google.android.gp
                                    public final Object invoke(Object obj) {
                                        return h7e.r(function10, (View) obj);
                                    }
                                };
                                dVarF.L(objR3);
                            } else {
                                objR3 = new Function1() { // from class: com.google.android.gp
                                    public final Object invoke(Object obj) {
                                        return h7e.r(function10, (View) obj);
                                    }
                                };
                                dVarF.L(objR3);
                            }
                            function9 = (Function1) objR3;
                        }
                        dVarF.u();
                        if ((i3 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zT = z4 | dVarF.T(fragment) | dVarF.T(context);
                        objR4 = dVarF.R();
                        if (zT) {
                            objR4 = new Function1() { // from class: com.google.android.hp
                                public final Object invoke(Object obj) {
                                    return h7e.s(function11, fragment, context, (View) obj);
                                }
                            };
                            dVarF.L(objR4);
                        } else {
                            objR4 = new Function1() { // from class: com.google.android.hp
                                public final Object invoke(Object obj) {
                                    return h7e.s(function11, fragment, context, (View) obj);
                                }
                            };
                            dVarF.L(objR4);
                        }
                        Function1 function1117 = (Function1) objR4;
                        if ((57344 & i3) == 16384) {
                        }
                        objR5 = dVarF.R();
                        if (z5) {
                            objR5 = new Function1() { // from class: com.google.android.ip
                                public final Object invoke(Object obj) {
                                    return h7e.u(function5, (View) obj);
                                }
                            };
                            dVarF.L(objR5);
                        } else {
                            objR5 = new Function1() { // from class: com.google.android.ip
                                public final Object invoke(Object obj) {
                                    return h7e.u(function5, (View) obj);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        Function1<? super T, Unit> function1118 = function11;
                        AndroidView_androidKt.b(function1116, bVar4, function9, function1117, (Function1) objR5, dVarF, i3 & 112, 0);
                        if (e.k()) {
                            e.n();
                        }
                        function7 = function1118;
                        function6 = function10;
                        bVar3 = bVar4;
                    } else {
                        dVarF.q();
                        function6 = function1;
                        bVar3 = bVar2;
                        function7 = function4;
                    }
                    function8 = function5;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.jp
                            public final Object invoke(Object obj, Object obj2) {
                                return h7e.v(ps4Var, bVar3, function6, function7, function8, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                function5 = function3;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i10 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    function9 = null;
                    if (i4 != 0) {
                        function10 = null;
                    } else {
                        function10 = function1;
                    }
                    if (i6 != 0) {
                        objR7 = dVarF.R();
                        if (objR7 == d.INSTANCE.a()) {
                            objR7 = new Function1() { // from class: com.google.android.dp
                                public final Object invoke(Object obj) {
                                    return h7e.o((h7e) obj);
                                }
                            };
                            dVarF.L(objR7);
                        }
                        function11 = (Function1) objR7;
                    } else {
                        function11 = function4;
                    }
                    if (i8 != 0) {
                        objR6 = dVarF.R();
                        if (objR6 == d.INSTANCE.a()) {
                            objR6 = new Function1() { // from class: com.google.android.ep
                                public final Object invoke(Object obj) {
                                    return h7e.p((h7e) obj);
                                }
                            };
                            dVarF.L(objR6);
                        }
                        function5 = (Function1) objR6;
                    }
                    if (e.k()) {
                        e.o(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                    }
                    view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                    zX = dVarF.x(view);
                    objR = dVarF.R();
                    if (zX) {
                        objR = k8e.a(view);
                        dVarF.L(objR);
                    } else {
                        objR = k8e.a(view);
                        dVarF.L(objR);
                    }
                    fragment = (Fragment) objR;
                    context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                    boolean zT11 = dVarF.T(fragment);
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | zT11;
                    objR2 = dVarF.R();
                    if (z3) {
                        objR2 = new Function1() { // from class: com.google.android.fp
                            public final Object invoke(Object obj) {
                                return h7e.q(fragment, ps4Var, (Context) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.fp
                            public final Object invoke(Object obj) {
                                return h7e.q(fragment, ps4Var, (Context) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    Function1 function1119 = (Function1) objR2;
                    if (function10 == null) {
                        dVarF.y(1128074792);
                    } else {
                        dVarF.y(1128074793);
                        zX2 = dVarF.x(function10);
                        objR3 = dVarF.R();
                        if (zX2) {
                            objR3 = new Function1() { // from class: com.google.android.gp
                                public final Object invoke(Object obj) {
                                    return h7e.r(function10, (View) obj);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1() { // from class: com.google.android.gp
                                public final Object invoke(Object obj) {
                                    return h7e.r(function10, (View) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        function9 = (Function1) objR3;
                    }
                    dVarF.u();
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zT = z4 | dVarF.T(fragment) | dVarF.T(context);
                    objR4 = dVarF.R();
                    if (zT) {
                        objR4 = new Function1() { // from class: com.google.android.hp
                            public final Object invoke(Object obj) {
                                return h7e.s(function11, fragment, context, (View) obj);
                            }
                        };
                        dVarF.L(objR4);
                    } else {
                        objR4 = new Function1() { // from class: com.google.android.hp
                            public final Object invoke(Object obj) {
                                return h7e.s(function11, fragment, context, (View) obj);
                            }
                        };
                        dVarF.L(objR4);
                    }
                    Function1 function11110 = (Function1) objR4;
                    if ((57344 & i3) == 16384) {
                    }
                    objR5 = dVarF.R();
                    if (z5) {
                        objR5 = new Function1() { // from class: com.google.android.ip
                            public final Object invoke(Object obj) {
                                return h7e.u(function5, (View) obj);
                            }
                        };
                        dVarF.L(objR5);
                    } else {
                        objR5 = new Function1() { // from class: com.google.android.ip
                            public final Object invoke(Object obj) {
                                return h7e.u(function5, (View) obj);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    Function1<? super T, Unit> function11111 = function11;
                    AndroidView_androidKt.b(function1119, bVar4, function9, function11110, (Function1) objR5, dVarF, i3 & 112, 0);
                    if (e.k()) {
                        e.n();
                    }
                    function7 = function11111;
                    function6 = function10;
                    bVar3 = bVar4;
                } else {
                    dVarF.q();
                    function6 = function1;
                    bVar3 = bVar2;
                    function7 = function4;
                }
                function8 = function5;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.jp
                        public final Object invoke(Object obj, Object obj2) {
                            return h7e.v(ps4Var, bVar3, function6, function7, function8, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            function4 = function2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    function5 = function3;
                    if (dVarF.T(function5)) {
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
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    function9 = null;
                    if (i4 != 0) {
                        function10 = null;
                    } else {
                        function10 = function1;
                    }
                    if (i6 != 0) {
                        objR7 = dVarF.R();
                        if (objR7 == d.INSTANCE.a()) {
                            objR7 = new Function1() { // from class: com.google.android.dp
                                public final Object invoke(Object obj) {
                                    return h7e.o((h7e) obj);
                                }
                            };
                            dVarF.L(objR7);
                        }
                        function11 = (Function1) objR7;
                    } else {
                        function11 = function4;
                    }
                    if (i8 != 0) {
                        objR6 = dVarF.R();
                        if (objR6 == d.INSTANCE.a()) {
                            objR6 = new Function1() { // from class: com.google.android.ep
                                public final Object invoke(Object obj) {
                                    return h7e.p((h7e) obj);
                                }
                            };
                            dVarF.L(objR6);
                        }
                        function5 = (Function1) objR6;
                    }
                    if (e.k()) {
                        e.o(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                    }
                    view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                    zX = dVarF.x(view);
                    objR = dVarF.R();
                    if (zX) {
                        objR = k8e.a(view);
                        dVarF.L(objR);
                    } else {
                        objR = k8e.a(view);
                        dVarF.L(objR);
                    }
                    fragment = (Fragment) objR;
                    context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                    boolean zT12 = dVarF.T(fragment);
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | zT12;
                    objR2 = dVarF.R();
                    if (z3) {
                        objR2 = new Function1() { // from class: com.google.android.fp
                            public final Object invoke(Object obj) {
                                return h7e.q(fragment, ps4Var, (Context) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.fp
                            public final Object invoke(Object obj) {
                                return h7e.q(fragment, ps4Var, (Context) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    Function1 function11112 = (Function1) objR2;
                    if (function10 == null) {
                        dVarF.y(1128074792);
                    } else {
                        dVarF.y(1128074793);
                        zX2 = dVarF.x(function10);
                        objR3 = dVarF.R();
                        if (zX2) {
                            objR3 = new Function1() { // from class: com.google.android.gp
                                public final Object invoke(Object obj) {
                                    return h7e.r(function10, (View) obj);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1() { // from class: com.google.android.gp
                                public final Object invoke(Object obj) {
                                    return h7e.r(function10, (View) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        function9 = (Function1) objR3;
                    }
                    dVarF.u();
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zT = z4 | dVarF.T(fragment) | dVarF.T(context);
                    objR4 = dVarF.R();
                    if (zT) {
                        objR4 = new Function1() { // from class: com.google.android.hp
                            public final Object invoke(Object obj) {
                                return h7e.s(function11, fragment, context, (View) obj);
                            }
                        };
                        dVarF.L(objR4);
                    } else {
                        objR4 = new Function1() { // from class: com.google.android.hp
                            public final Object invoke(Object obj) {
                                return h7e.s(function11, fragment, context, (View) obj);
                            }
                        };
                        dVarF.L(objR4);
                    }
                    Function1 function11113 = (Function1) objR4;
                    if ((57344 & i3) == 16384) {
                    }
                    objR5 = dVarF.R();
                    if (z5) {
                        objR5 = new Function1() { // from class: com.google.android.ip
                            public final Object invoke(Object obj) {
                                return h7e.u(function5, (View) obj);
                            }
                        };
                        dVarF.L(objR5);
                    } else {
                        objR5 = new Function1() { // from class: com.google.android.ip
                            public final Object invoke(Object obj) {
                                return h7e.u(function5, (View) obj);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    Function1<? super T, Unit> function11114 = function11;
                    AndroidView_androidKt.b(function11112, bVar4, function9, function11113, (Function1) objR5, dVarF, i3 & 112, 0);
                    if (e.k()) {
                        e.n();
                    }
                    function7 = function11114;
                    function6 = function10;
                    bVar3 = bVar4;
                } else {
                    dVarF.q();
                    function6 = function1;
                    bVar3 = bVar2;
                    function7 = function4;
                }
                function8 = function5;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.jp
                        public final Object invoke(Object obj, Object obj2) {
                            return h7e.v(ps4Var, bVar3, function6, function7, function8, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            function5 = function3;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i10 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                function9 = null;
                if (i4 != 0) {
                    function10 = null;
                } else {
                    function10 = function1;
                }
                if (i6 != 0) {
                    objR7 = dVarF.R();
                    if (objR7 == d.INSTANCE.a()) {
                        objR7 = new Function1() { // from class: com.google.android.dp
                            public final Object invoke(Object obj) {
                                return h7e.o((h7e) obj);
                            }
                        };
                        dVarF.L(objR7);
                    }
                    function11 = (Function1) objR7;
                } else {
                    function11 = function4;
                }
                if (i8 != 0) {
                    objR6 = dVarF.R();
                    if (objR6 == d.INSTANCE.a()) {
                        objR6 = new Function1() { // from class: com.google.android.ep
                            public final Object invoke(Object obj) {
                                return h7e.p((h7e) obj);
                            }
                        };
                        dVarF.L(objR6);
                    }
                    function5 = (Function1) objR6;
                }
                if (e.k()) {
                    e.o(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                }
                view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                zX = dVarF.x(view);
                objR = dVarF.R();
                if (zX) {
                    objR = k8e.a(view);
                    dVarF.L(objR);
                } else {
                    objR = k8e.a(view);
                    dVarF.L(objR);
                }
                fragment = (Fragment) objR;
                context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                boolean zT13 = dVarF.T(fragment);
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | zT13;
                objR2 = dVarF.R();
                if (z3) {
                    objR2 = new Function1() { // from class: com.google.android.fp
                        public final Object invoke(Object obj) {
                            return h7e.q(fragment, ps4Var, (Context) obj);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function1() { // from class: com.google.android.fp
                        public final Object invoke(Object obj) {
                            return h7e.q(fragment, ps4Var, (Context) obj);
                        }
                    };
                    dVarF.L(objR2);
                }
                Function1 function11115 = (Function1) objR2;
                if (function10 == null) {
                    dVarF.y(1128074792);
                } else {
                    dVarF.y(1128074793);
                    zX2 = dVarF.x(function10);
                    objR3 = dVarF.R();
                    if (zX2) {
                        objR3 = new Function1() { // from class: com.google.android.gp
                            public final Object invoke(Object obj) {
                                return h7e.r(function10, (View) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.gp
                            public final Object invoke(Object obj) {
                                return h7e.r(function10, (View) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    function9 = (Function1) objR3;
                }
                dVarF.u();
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zT = z4 | dVarF.T(fragment) | dVarF.T(context);
                objR4 = dVarF.R();
                if (zT) {
                    objR4 = new Function1() { // from class: com.google.android.hp
                        public final Object invoke(Object obj) {
                            return h7e.s(function11, fragment, context, (View) obj);
                        }
                    };
                    dVarF.L(objR4);
                } else {
                    objR4 = new Function1() { // from class: com.google.android.hp
                        public final Object invoke(Object obj) {
                            return h7e.s(function11, fragment, context, (View) obj);
                        }
                    };
                    dVarF.L(objR4);
                }
                Function1 function11116 = (Function1) objR4;
                if ((57344 & i3) == 16384) {
                }
                objR5 = dVarF.R();
                if (z5) {
                    objR5 = new Function1() { // from class: com.google.android.ip
                        public final Object invoke(Object obj) {
                            return h7e.u(function5, (View) obj);
                        }
                    };
                    dVarF.L(objR5);
                } else {
                    objR5 = new Function1() { // from class: com.google.android.ip
                        public final Object invoke(Object obj) {
                            return h7e.u(function5, (View) obj);
                        }
                    };
                    dVarF.L(objR5);
                }
                Function1<? super T, Unit> function11117 = function11;
                AndroidView_androidKt.b(function11115, bVar4, function9, function11116, (Function1) objR5, dVarF, i3 & 112, 0);
                if (e.k()) {
                    e.n();
                }
                function7 = function11117;
                function6 = function10;
                bVar3 = bVar4;
            } else {
                dVarF.q();
                function6 = function1;
                bVar3 = bVar2;
                function7 = function4;
            }
            function8 = function5;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.jp
                    public final Object invoke(Object obj, Object obj2) {
                        return h7e.v(ps4Var, bVar3, function6, function7, function8, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                function4 = function2;
                if (dVarF.T(function4)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    function5 = function3;
                    if (dVarF.T(function5)) {
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
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    function9 = null;
                    if (i4 != 0) {
                        function10 = null;
                    } else {
                        function10 = function1;
                    }
                    if (i6 != 0) {
                        objR7 = dVarF.R();
                        if (objR7 == d.INSTANCE.a()) {
                            objR7 = new Function1() { // from class: com.google.android.dp
                                public final Object invoke(Object obj) {
                                    return h7e.o((h7e) obj);
                                }
                            };
                            dVarF.L(objR7);
                        }
                        function11 = (Function1) objR7;
                    } else {
                        function11 = function4;
                    }
                    if (i8 != 0) {
                        objR6 = dVarF.R();
                        if (objR6 == d.INSTANCE.a()) {
                            objR6 = new Function1() { // from class: com.google.android.ep
                                public final Object invoke(Object obj) {
                                    return h7e.p((h7e) obj);
                                }
                            };
                            dVarF.L(objR6);
                        }
                        function5 = (Function1) objR6;
                    }
                    if (e.k()) {
                        e.o(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                    }
                    view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                    zX = dVarF.x(view);
                    objR = dVarF.R();
                    if (zX) {
                        objR = k8e.a(view);
                        dVarF.L(objR);
                    } else {
                        objR = k8e.a(view);
                        dVarF.L(objR);
                    }
                    fragment = (Fragment) objR;
                    context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                    boolean zT14 = dVarF.T(fragment);
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | zT14;
                    objR2 = dVarF.R();
                    if (z3) {
                        objR2 = new Function1() { // from class: com.google.android.fp
                            public final Object invoke(Object obj) {
                                return h7e.q(fragment, ps4Var, (Context) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.fp
                            public final Object invoke(Object obj) {
                                return h7e.q(fragment, ps4Var, (Context) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    Function1 function11118 = (Function1) objR2;
                    if (function10 == null) {
                        dVarF.y(1128074792);
                    } else {
                        dVarF.y(1128074793);
                        zX2 = dVarF.x(function10);
                        objR3 = dVarF.R();
                        if (zX2) {
                            objR3 = new Function1() { // from class: com.google.android.gp
                                public final Object invoke(Object obj) {
                                    return h7e.r(function10, (View) obj);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1() { // from class: com.google.android.gp
                                public final Object invoke(Object obj) {
                                    return h7e.r(function10, (View) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        function9 = (Function1) objR3;
                    }
                    dVarF.u();
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zT = z4 | dVarF.T(fragment) | dVarF.T(context);
                    objR4 = dVarF.R();
                    if (zT) {
                        objR4 = new Function1() { // from class: com.google.android.hp
                            public final Object invoke(Object obj) {
                                return h7e.s(function11, fragment, context, (View) obj);
                            }
                        };
                        dVarF.L(objR4);
                    } else {
                        objR4 = new Function1() { // from class: com.google.android.hp
                            public final Object invoke(Object obj) {
                                return h7e.s(function11, fragment, context, (View) obj);
                            }
                        };
                        dVarF.L(objR4);
                    }
                    Function1 function11119 = (Function1) objR4;
                    if ((57344 & i3) == 16384) {
                    }
                    objR5 = dVarF.R();
                    if (z5) {
                        objR5 = new Function1() { // from class: com.google.android.ip
                            public final Object invoke(Object obj) {
                                return h7e.u(function5, (View) obj);
                            }
                        };
                        dVarF.L(objR5);
                    } else {
                        objR5 = new Function1() { // from class: com.google.android.ip
                            public final Object invoke(Object obj) {
                                return h7e.u(function5, (View) obj);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    Function1<? super T, Unit> function111110 = function11;
                    AndroidView_androidKt.b(function11118, bVar4, function9, function11119, (Function1) objR5, dVarF, i3 & 112, 0);
                    if (e.k()) {
                        e.n();
                    }
                    function7 = function111110;
                    function6 = function10;
                    bVar3 = bVar4;
                } else {
                    dVarF.q();
                    function6 = function1;
                    bVar3 = bVar2;
                    function7 = function4;
                }
                function8 = function5;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.jp
                        public final Object invoke(Object obj, Object obj2) {
                            return h7e.v(ps4Var, bVar3, function6, function7, function8, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            function5 = function3;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i10 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                function9 = null;
                if (i4 != 0) {
                    function10 = null;
                } else {
                    function10 = function1;
                }
                if (i6 != 0) {
                    objR7 = dVarF.R();
                    if (objR7 == d.INSTANCE.a()) {
                        objR7 = new Function1() { // from class: com.google.android.dp
                            public final Object invoke(Object obj) {
                                return h7e.o((h7e) obj);
                            }
                        };
                        dVarF.L(objR7);
                    }
                    function11 = (Function1) objR7;
                } else {
                    function11 = function4;
                }
                if (i8 != 0) {
                    objR6 = dVarF.R();
                    if (objR6 == d.INSTANCE.a()) {
                        objR6 = new Function1() { // from class: com.google.android.ep
                            public final Object invoke(Object obj) {
                                return h7e.p((h7e) obj);
                            }
                        };
                        dVarF.L(objR6);
                    }
                    function5 = (Function1) objR6;
                }
                if (e.k()) {
                    e.o(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                }
                view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                zX = dVarF.x(view);
                objR = dVarF.R();
                if (zX) {
                    objR = k8e.a(view);
                    dVarF.L(objR);
                } else {
                    objR = k8e.a(view);
                    dVarF.L(objR);
                }
                fragment = (Fragment) objR;
                context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                boolean zT15 = dVarF.T(fragment);
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | zT15;
                objR2 = dVarF.R();
                if (z3) {
                    objR2 = new Function1() { // from class: com.google.android.fp
                        public final Object invoke(Object obj) {
                            return h7e.q(fragment, ps4Var, (Context) obj);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function1() { // from class: com.google.android.fp
                        public final Object invoke(Object obj) {
                            return h7e.q(fragment, ps4Var, (Context) obj);
                        }
                    };
                    dVarF.L(objR2);
                }
                Function1 function111111 = (Function1) objR2;
                if (function10 == null) {
                    dVarF.y(1128074792);
                } else {
                    dVarF.y(1128074793);
                    zX2 = dVarF.x(function10);
                    objR3 = dVarF.R();
                    if (zX2) {
                        objR3 = new Function1() { // from class: com.google.android.gp
                            public final Object invoke(Object obj) {
                                return h7e.r(function10, (View) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.gp
                            public final Object invoke(Object obj) {
                                return h7e.r(function10, (View) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    function9 = (Function1) objR3;
                }
                dVarF.u();
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zT = z4 | dVarF.T(fragment) | dVarF.T(context);
                objR4 = dVarF.R();
                if (zT) {
                    objR4 = new Function1() { // from class: com.google.android.hp
                        public final Object invoke(Object obj) {
                            return h7e.s(function11, fragment, context, (View) obj);
                        }
                    };
                    dVarF.L(objR4);
                } else {
                    objR4 = new Function1() { // from class: com.google.android.hp
                        public final Object invoke(Object obj) {
                            return h7e.s(function11, fragment, context, (View) obj);
                        }
                    };
                    dVarF.L(objR4);
                }
                Function1 function111112 = (Function1) objR4;
                if ((57344 & i3) == 16384) {
                }
                objR5 = dVarF.R();
                if (z5) {
                    objR5 = new Function1() { // from class: com.google.android.ip
                        public final Object invoke(Object obj) {
                            return h7e.u(function5, (View) obj);
                        }
                    };
                    dVarF.L(objR5);
                } else {
                    objR5 = new Function1() { // from class: com.google.android.ip
                        public final Object invoke(Object obj) {
                            return h7e.u(function5, (View) obj);
                        }
                    };
                    dVarF.L(objR5);
                }
                Function1<? super T, Unit> function111113 = function11;
                AndroidView_androidKt.b(function111111, bVar4, function9, function111112, (Function1) objR5, dVarF, i3 & 112, 0);
                if (e.k()) {
                    e.n();
                }
                function7 = function111113;
                function6 = function10;
                bVar3 = bVar4;
            } else {
                dVarF.q();
                function6 = function1;
                bVar3 = bVar2;
                function7 = function4;
            }
            function8 = function5;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.jp
                    public final Object invoke(Object obj, Object obj2) {
                        return h7e.v(ps4Var, bVar3, function6, function7, function8, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        function4 = function2;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                function5 = function3;
                if (dVarF.T(function5)) {
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
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                function9 = null;
                if (i4 != 0) {
                    function10 = null;
                } else {
                    function10 = function1;
                }
                if (i6 != 0) {
                    objR7 = dVarF.R();
                    if (objR7 == d.INSTANCE.a()) {
                        objR7 = new Function1() { // from class: com.google.android.dp
                            public final Object invoke(Object obj) {
                                return h7e.o((h7e) obj);
                            }
                        };
                        dVarF.L(objR7);
                    }
                    function11 = (Function1) objR7;
                } else {
                    function11 = function4;
                }
                if (i8 != 0) {
                    objR6 = dVarF.R();
                    if (objR6 == d.INSTANCE.a()) {
                        objR6 = new Function1() { // from class: com.google.android.ep
                            public final Object invoke(Object obj) {
                                return h7e.p((h7e) obj);
                            }
                        };
                        dVarF.L(objR6);
                    }
                    function5 = (Function1) objR6;
                }
                if (e.k()) {
                    e.o(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
                }
                view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                zX = dVarF.x(view);
                objR = dVarF.R();
                if (zX) {
                    objR = k8e.a(view);
                    dVarF.L(objR);
                } else {
                    objR = k8e.a(view);
                    dVarF.L(objR);
                }
                fragment = (Fragment) objR;
                context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                boolean zT16 = dVarF.T(fragment);
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | zT16;
                objR2 = dVarF.R();
                if (z3) {
                    objR2 = new Function1() { // from class: com.google.android.fp
                        public final Object invoke(Object obj) {
                            return h7e.q(fragment, ps4Var, (Context) obj);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function1() { // from class: com.google.android.fp
                        public final Object invoke(Object obj) {
                            return h7e.q(fragment, ps4Var, (Context) obj);
                        }
                    };
                    dVarF.L(objR2);
                }
                Function1 function111114 = (Function1) objR2;
                if (function10 == null) {
                    dVarF.y(1128074792);
                } else {
                    dVarF.y(1128074793);
                    zX2 = dVarF.x(function10);
                    objR3 = dVarF.R();
                    if (zX2) {
                        objR3 = new Function1() { // from class: com.google.android.gp
                            public final Object invoke(Object obj) {
                                return h7e.r(function10, (View) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.gp
                            public final Object invoke(Object obj) {
                                return h7e.r(function10, (View) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    function9 = (Function1) objR3;
                }
                dVarF.u();
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zT = z4 | dVarF.T(fragment) | dVarF.T(context);
                objR4 = dVarF.R();
                if (zT) {
                    objR4 = new Function1() { // from class: com.google.android.hp
                        public final Object invoke(Object obj) {
                            return h7e.s(function11, fragment, context, (View) obj);
                        }
                    };
                    dVarF.L(objR4);
                } else {
                    objR4 = new Function1() { // from class: com.google.android.hp
                        public final Object invoke(Object obj) {
                            return h7e.s(function11, fragment, context, (View) obj);
                        }
                    };
                    dVarF.L(objR4);
                }
                Function1 function111115 = (Function1) objR4;
                if ((57344 & i3) == 16384) {
                }
                objR5 = dVarF.R();
                if (z5) {
                    objR5 = new Function1() { // from class: com.google.android.ip
                        public final Object invoke(Object obj) {
                            return h7e.u(function5, (View) obj);
                        }
                    };
                    dVarF.L(objR5);
                } else {
                    objR5 = new Function1() { // from class: com.google.android.ip
                        public final Object invoke(Object obj) {
                            return h7e.u(function5, (View) obj);
                        }
                    };
                    dVarF.L(objR5);
                }
                Function1<? super T, Unit> function111116 = function11;
                AndroidView_androidKt.b(function111114, bVar4, function9, function111115, (Function1) objR5, dVarF, i3 & 112, 0);
                if (e.k()) {
                    e.n();
                }
                function7 = function111116;
                function6 = function10;
                bVar3 = bVar4;
            } else {
                dVarF.q();
                function6 = function1;
                bVar3 = bVar2;
                function7 = function4;
            }
            function8 = function5;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.jp
                    public final Object invoke(Object obj, Object obj2) {
                        return h7e.v(ps4Var, bVar3, function6, function7, function8, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        function5 = function3;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            if (i10 != 0) {
                bVar4 = b.INSTANCE;
            } else {
                bVar4 = bVar2;
            }
            function9 = null;
            if (i4 != 0) {
                function10 = null;
            } else {
                function10 = function1;
            }
            if (i6 != 0) {
                objR7 = dVarF.R();
                if (objR7 == d.INSTANCE.a()) {
                    objR7 = new Function1() { // from class: com.google.android.dp
                        public final Object invoke(Object obj) {
                            return h7e.o((h7e) obj);
                        }
                    };
                    dVarF.L(objR7);
                }
                function11 = (Function1) objR7;
            } else {
                function11 = function4;
            }
            if (i8 != 0) {
                objR6 = dVarF.R();
                if (objR6 == d.INSTANCE.a()) {
                    objR6 = new Function1() { // from class: com.google.android.ep
                        public final Object invoke(Object obj) {
                            return h7e.p((h7e) obj);
                        }
                    };
                    dVarF.L(objR6);
                }
                function5 = (Function1) objR6;
            }
            if (e.k()) {
                e.o(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)");
            }
            view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
            zX = dVarF.x(view);
            objR = dVarF.R();
            if (zX) {
                objR = k8e.a(view);
                dVarF.L(objR);
            } else {
                objR = k8e.a(view);
                dVarF.L(objR);
            }
            fragment = (Fragment) objR;
            context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
            boolean zT17 = dVarF.T(fragment);
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2 | zT17;
            objR2 = dVarF.R();
            if (z3) {
                objR2 = new Function1() { // from class: com.google.android.fp
                    public final Object invoke(Object obj) {
                        return h7e.q(fragment, ps4Var, (Context) obj);
                    }
                };
                dVarF.L(objR2);
            } else {
                objR2 = new Function1() { // from class: com.google.android.fp
                    public final Object invoke(Object obj) {
                        return h7e.q(fragment, ps4Var, (Context) obj);
                    }
                };
                dVarF.L(objR2);
            }
            Function1 function111117 = (Function1) objR2;
            if (function10 == null) {
                dVarF.y(1128074792);
            } else {
                dVarF.y(1128074793);
                zX2 = dVarF.x(function10);
                objR3 = dVarF.R();
                if (zX2) {
                    objR3 = new Function1() { // from class: com.google.android.gp
                        public final Object invoke(Object obj) {
                            return h7e.r(function10, (View) obj);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function1() { // from class: com.google.android.gp
                        public final Object invoke(Object obj) {
                            return h7e.r(function10, (View) obj);
                        }
                    };
                    dVarF.L(objR3);
                }
                function9 = (Function1) objR3;
            }
            dVarF.u();
            if ((i3 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            zT = z4 | dVarF.T(fragment) | dVarF.T(context);
            objR4 = dVarF.R();
            if (zT) {
                objR4 = new Function1() { // from class: com.google.android.hp
                    public final Object invoke(Object obj) {
                        return h7e.s(function11, fragment, context, (View) obj);
                    }
                };
                dVarF.L(objR4);
            } else {
                objR4 = new Function1() { // from class: com.google.android.hp
                    public final Object invoke(Object obj) {
                        return h7e.s(function11, fragment, context, (View) obj);
                    }
                };
                dVarF.L(objR4);
            }
            Function1 function111118 = (Function1) objR4;
            if ((57344 & i3) == 16384) {
            }
            objR5 = dVarF.R();
            if (z5) {
                objR5 = new Function1() { // from class: com.google.android.ip
                    public final Object invoke(Object obj) {
                        return h7e.u(function5, (View) obj);
                    }
                };
                dVarF.L(objR5);
            } else {
                objR5 = new Function1() { // from class: com.google.android.ip
                    public final Object invoke(Object obj) {
                        return h7e.u(function5, (View) obj);
                    }
                };
                dVarF.L(objR5);
            }
            Function1<? super T, Unit> function111119 = function11;
            AndroidView_androidKt.b(function111117, bVar4, function9, function111118, (Function1) objR5, dVarF, i3 & 112, 0);
            if (e.k()) {
                e.n();
            }
            function7 = function111119;
            function6 = function10;
            bVar3 = bVar4;
        } else {
            dVarF.q();
            function6 = function1;
            bVar3 = bVar2;
            function7 = function4;
        }
        function8 = function5;
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.jp
                public final Object invoke(Object obj, Object obj2) {
                    return h7e.v(ps4Var, bVar3, function6, function7, function8, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(com.google.android.h7e h7eVar) {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(ps4 ps4Var, b bVar, Function1 function1, int i, int i2, d dVar, int i3) {
        k(ps4Var, bVar, function1, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(com.google.android.h7e h7eVar) {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(com.google.android.h7e h7eVar) {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View q(Fragment fragment, ps4 ps4Var, Context context) {
        LayoutInflater layoutInflaterFrom;
        if (fragment == null || (layoutInflaterFrom = fragment.getLayoutInflater()) == null) {
            layoutInflaterFrom = LayoutInflater.from(context);
        }
        com.google.android.h7e h7eVar = (com.google.android.h7e) ps4Var.invoke(layoutInflaterFrom, new FrameLayout(context), Boolean.FALSE);
        View root = h7eVar.getRoot();
        y(root, h7eVar);
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function1 function1, View view) {
        function1.invoke(x(view));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function1 function1, Fragment fragment, Context context, View view) {
        FragmentManager childFragmentManager;
        function1.invoke(x(view));
        final FragmentManager supportFragmentManager = null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            if (fragment == null || (childFragmentManager = fragment.getChildFragmentManager()) == null) {
                FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                if (fragmentActivity != null) {
                    supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                }
            } else {
                supportFragmentManager = childFragmentManager;
            }
            w(viewGroup, new Function1() { // from class: com.google.android.kp
                public final Object invoke(Object obj) {
                    return h7e.t(supportFragmentManager, (FragmentContainerView) obj);
                }
            });
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(FragmentManager fragmentManager, FragmentContainerView fragmentContainerView) {
        Fragment fragmentP0 = fragmentManager != null ? fragmentManager.p0(fragmentContainerView.getId()) : null;
        if (fragmentP0 != null && !fragmentManager.Y0()) {
            v vVarS = fragmentManager.s();
            Intrinsics.checkNotNullExpressionValue(vVarS, "beginTransaction()");
            vVarS.q(fragmentP0);
            vVarS.k();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Function1 function1, View view) {
        function1.invoke(x(view));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(ps4 ps4Var, b bVar, Function1 function1, Function1 function2, Function1 function3, int i, int i2, d dVar, int i3) {
        l(ps4Var, bVar, function1, function2, function3, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    private static final void w(ViewGroup viewGroup, Function1<? super FragmentContainerView, Unit> function1) {
        if (viewGroup instanceof FragmentContainerView) {
            function1.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.f(childAt, "getChildAt(index)");
            if (childAt instanceof ViewGroup) {
                w((ViewGroup) childAt, function1);
            }
        }
    }

    private static final <T extends com.google.android.h7e> T x(View view) {
        Object tag = view.getTag(zy9.a);
        Intrinsics.h(tag, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
        return (T) tag;
    }

    private static final <T extends com.google.android.h7e> void y(View view, T t) {
        view.setTag(zy9.a, t);
    }
}
