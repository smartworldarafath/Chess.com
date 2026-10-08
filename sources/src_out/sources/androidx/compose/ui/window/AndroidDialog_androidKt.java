package androidx.compose.ui.window;

import android.view.View;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.afb;
import com.google.inputmethod.dfa;
import com.google.inputmethod.dj7;
import com.google.inputmethod.dud;
import com.google.inputmethod.ej7;
import com.google.inputmethod.f43;
import com.google.inputmethod.fj7;
import com.google.inputmethod.gs1;
import com.google.inputmethod.jd3;
import com.google.inputmethod.kd3;
import com.google.inputmethod.ko1;
import com.google.inputmethod.kx1;
import com.google.inputmethod.nfb;
import com.google.inputmethod.pp1;
import com.google.inputmethod.q6c;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.vn3;
import com.google.inputmethod.x93;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Lcom/google/android/x93;", "properties", "content", "a", "(Lkotlin/jvm/functions/Function0;Lcom/google/android/x93;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "Landroidx/compose/ui/b;", "modifier", "c", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "currentContent", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AndroidDialog_androidKt {
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:52:0x011c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0132  */
    /* JADX WARN: Code duplicated, block: B:56:0x0134  */
    /* JADX WARN: Code duplicated, block: B:60:0x013d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0154  */
    /* JADX WARN: Code duplicated, block: B:68:0x0167  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0175  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void a(final Function0<Unit> function0, x93 x93Var, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, androidx.compose.p004runtime.d dVar, final int i, final int i2) {
        int i3;
        x93 x93Var2;
        int i4;
        boolean z;
        final x93 x93Var3;
        s6b s6bVarH;
        View view;
        f43 f43Var;
        final LayoutDirection layoutDirection;
        androidx.compose.p004runtime.f fVarE;
        final q6c q6cVarR;
        Object objR;
        androidx.compose.p004runtime.d.Companion companion;
        UUID uuid;
        boolean zX;
        Object objR2;
        final DialogWrapper dialogWrapper;
        boolean zT;
        Object objR3;
        boolean z2;
        boolean zC;
        Object objR4;
        int i5;
        androidx.compose.p004runtime.d dVarF = dVar.F(826668973);
        if ((i & 6) == 0) {
            i3 = (dVarF.T(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                x93Var2 = x93Var;
                i3 |= dVarF.x(x93Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (dVarF.T(function2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i4 = i3;
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i4 & 1)) {
                if (i6 != 0) {
                    x93Var3 = new x93(false, false, false, 7, null);
                } else {
                    x93Var3 = x93Var2;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(826668973, i4, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:249)");
                }
                view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                fVarE = pp1.e(dVarF, 0);
                q6cVarR = p0.r(function2, dVarF, (i4 >> 6) & 14);
                Object[] objArr = new Object[0];
                objR = dVarF.R();
                companion = androidx.compose.p004runtime.d.INSTANCE;
                if (objR == companion.a()) {
                    objR = new Function0<UUID>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1$1
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final UUID invoke() {
                            return UUID.randomUUID();
                        }
                    };
                    dVarF.L(objR);
                }
                uuid = (UUID) dfa.l(objArr, (Function0) objR, dVarF, 48);
                zX = dVarF.x(view) | dVarF.x(f43Var) | dVarF.C(x93Var3.getWindowType()) | dVarF.x(x93Var3.getWindowToken());
                objR2 = dVarF.R();
                if (zX || objR2 == companion.a()) {
                    DialogWrapper dialogWrapper2 = new DialogWrapper(function0, x93Var3, view, layoutDirection, f43Var, uuid);
                    dialogWrapper2.o(fVarE, ko1.c(-1338939603, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(androidx.compose.p004runtime.d dVar2, int i7) {
                            if (!dVar2.g((i7 & 3) != 2, i7 & 1)) {
                                dVar2.q();
                                return;
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-1338939603, i7, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:265)");
                            }
                            androidx.compose.ui.b.Companion companion2 = androidx.compose.ui.b.INSTANCE;
                            Object objR5 = dVar2.R();
                            if (objR5 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR5 = new Function1<nfb, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1
                                    public final void a(nfb nfbVar) {
                                        SemanticsPropertiesKt.h(nfbVar);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        a((nfb) obj);
                                        return Unit.a;
                                    }
                                };
                                dVar2.L(objR5);
                            }
                            AndroidDialog_androidKt.c(afb.d(companion2, false, (Function1) objR5, 1, null), AndroidDialog_androidKt.b(q6cVarR), dVar2, 0, 0);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                        }
                    }));
                    dVarF.L(dialogWrapper2);
                    objR2 = dialogWrapper2;
                }
                dialogWrapper = (DialogWrapper) objR2;
                zT = dVarF.T(dialogWrapper);
                objR3 = dVarF.R();
                if (zT || objR3 == companion.a()) {
                    objR3 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1

                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                        public static final class a implements jd3 {
                            final /* synthetic */ DialogWrapper a;

                            public a(DialogWrapper dialogWrapper) {
                                this.a = dialogWrapper;
                            }

                            @Override // com.google.inputmethod.jd3
                            public void dispose() {
                                this.a.dismiss();
                                this.a.n();
                            }
                        }

                        {
                            super(1);
                        }

                        public final jd3 invoke(kd3 kd3Var) {
                            dialogWrapper.show();
                            return new a(dialogWrapper);
                        }
                    };
                    dVarF.L(objR3);
                }
                vn3.c(dialogWrapper, (Function1) objR3, dVarF, 0);
                boolean zT2 = dVarF.T(dialogWrapper);
                if ((i4 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zC = zT2 | z2 | ((i4 & 112) == 32) | dVarF.C(layoutDirection.ordinal());
                objR4 = dVarF.R();
                if (zC || objR4 == companion.a()) {
                    objR4 = new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                        public /* bridge */ /* synthetic */ Object invoke() throws NoWhenBranchMatchedException {
                            m73invoke();
                            return Unit.a;
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m73invoke() throws NoWhenBranchMatchedException {
                            dialogWrapper.r(function0, x93Var3, layoutDirection);
                        }
                    };
                    dVarF.L(objR4);
                }
                vn3.i((Function0) objR4, dVarF, 0);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
            } else {
                dVarF.q();
                x93Var3 = x93Var2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(androidx.compose.p004runtime.d dVar2, int i7) {
                        AndroidDialog_androidKt.a(function0, x93Var3, function2, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        x93Var2 = x93Var;
        if ((i & 384) == 0) {
            if (dVarF.T(function2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        i4 = i3;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i4 & 1)) {
            if (i6 != 0) {
                x93Var3 = new x93(false, false, false, 7, null);
            } else {
                x93Var3 = x93Var2;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(826668973, i4, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:249)");
            }
            view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
            layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
            fVarE = pp1.e(dVarF, 0);
            q6cVarR = p0.r(function2, dVarF, (i4 >> 6) & 14);
            Object[] objArr2 = new Object[0];
            objR = dVarF.R();
            companion = androidx.compose.p004runtime.d.INSTANCE;
            if (objR == companion.a()) {
                objR = new Function0<UUID>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1$1
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final UUID invoke() {
                        return UUID.randomUUID();
                    }
                };
                dVarF.L(objR);
            }
            uuid = (UUID) dfa.l(objArr2, (Function0) objR, dVarF, 48);
            zX = dVarF.x(view) | dVarF.x(f43Var) | dVarF.C(x93Var3.getWindowType()) | dVarF.x(x93Var3.getWindowToken());
            objR2 = dVarF.R();
            if (zX) {
                DialogWrapper dialogWrapper3 = new DialogWrapper(function0, x93Var3, view, layoutDirection, f43Var, uuid);
                dialogWrapper3.o(fVarE, ko1.c(-1338939603, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(androidx.compose.p004runtime.d dVar2, int i7) {
                        if (!dVar2.g((i7 & 3) != 2, i7 & 1)) {
                            dVar2.q();
                            return;
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1338939603, i7, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:265)");
                        }
                        androidx.compose.ui.b.Companion companion2 = androidx.compose.ui.b.INSTANCE;
                        Object objR5 = dVar2.R();
                        if (objR5 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR5 = new Function1<nfb, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1
                                public final void a(nfb nfbVar) {
                                    SemanticsPropertiesKt.h(nfbVar);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    a((nfb) obj);
                                    return Unit.a;
                                }
                            };
                            dVar2.L(objR5);
                        }
                        AndroidDialog_androidKt.c(afb.d(companion2, false, (Function1) objR5, 1, null), AndroidDialog_androidKt.b(q6cVarR), dVar2, 0, 0);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                    }
                }));
                dVarF.L(dialogWrapper3);
                objR2 = dialogWrapper3;
            } else {
                DialogWrapper dialogWrapper4 = new DialogWrapper(function0, x93Var3, view, layoutDirection, f43Var, uuid);
                dialogWrapper4.o(fVarE, ko1.c(-1338939603, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(androidx.compose.p004runtime.d dVar2, int i7) {
                        if (!dVar2.g((i7 & 3) != 2, i7 & 1)) {
                            dVar2.q();
                            return;
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1338939603, i7, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:265)");
                        }
                        androidx.compose.ui.b.Companion companion2 = androidx.compose.ui.b.INSTANCE;
                        Object objR5 = dVar2.R();
                        if (objR5 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR5 = new Function1<nfb, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1
                                public final void a(nfb nfbVar) {
                                    SemanticsPropertiesKt.h(nfbVar);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    a((nfb) obj);
                                    return Unit.a;
                                }
                            };
                            dVar2.L(objR5);
                        }
                        AndroidDialog_androidKt.c(afb.d(companion2, false, (Function1) objR5, 1, null), AndroidDialog_androidKt.b(q6cVarR), dVar2, 0, 0);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                    }
                }));
                dVarF.L(dialogWrapper4);
                objR2 = dialogWrapper4;
            }
            dialogWrapper = (DialogWrapper) objR2;
            zT = dVarF.T(dialogWrapper);
            objR3 = dVarF.R();
            if (zT) {
                objR3 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1

                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class a implements jd3 {
                        final /* synthetic */ DialogWrapper a;

                        public a(DialogWrapper dialogWrapper) {
                            this.a = dialogWrapper;
                        }

                        @Override // com.google.inputmethod.jd3
                        public void dispose() {
                            this.a.dismiss();
                            this.a.n();
                        }
                    }

                    {
                        super(1);
                    }

                    public final jd3 invoke(kd3 kd3Var) {
                        dialogWrapper.show();
                        return new a(dialogWrapper);
                    }
                };
                dVarF.L(objR3);
            } else {
                objR3 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1

                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class a implements jd3 {
                        final /* synthetic */ DialogWrapper a;

                        public a(DialogWrapper dialogWrapper) {
                            this.a = dialogWrapper;
                        }

                        @Override // com.google.inputmethod.jd3
                        public void dispose() {
                            this.a.dismiss();
                            this.a.n();
                        }
                    }

                    {
                        super(1);
                    }

                    public final jd3 invoke(kd3 kd3Var) {
                        dialogWrapper.show();
                        return new a(dialogWrapper);
                    }
                };
                dVarF.L(objR3);
            }
            vn3.c(dialogWrapper, (Function1) objR3, dVarF, 0);
            boolean zT3 = dVarF.T(dialogWrapper);
            if ((i4 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            zC = zT3 | z2 | ((i4 & 112) == 32) | dVarF.C(layoutDirection.ordinal());
            objR4 = dVarF.R();
            if (zC) {
                objR4 = new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    public /* bridge */ /* synthetic */ Object invoke() throws NoWhenBranchMatchedException {
                        m73invoke();
                        return Unit.a;
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m73invoke() throws NoWhenBranchMatchedException {
                        dialogWrapper.r(function0, x93Var3, layoutDirection);
                    }
                };
                dVarF.L(objR4);
            } else {
                objR4 = new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    public /* bridge */ /* synthetic */ Object invoke() throws NoWhenBranchMatchedException {
                        m73invoke();
                        return Unit.a;
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m73invoke() throws NoWhenBranchMatchedException {
                        dialogWrapper.r(function0, x93Var3, layoutDirection);
                    }
                };
                dVarF.L(objR4);
            }
            vn3.i((Function0) objR4, dVarF, 0);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
            x93Var3 = x93Var2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(androidx.compose.p004runtime.d dVar2, int i7) {
                    AndroidDialog_androidKt.a(function0, x93Var3, function2, dVar2, saa.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Function2<androidx.compose.p004runtime.d, Integer, Unit> b(q6c<? extends Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit>> q6cVar) {
        return q6cVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final androidx.compose.ui.b bVar, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, androidx.compose.p004runtime.d dVar, final int i, final int i2) {
        int i3;
        androidx.compose.p004runtime.d dVarF = dVar.F(1090521195);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dVarF.T(function2) ? 32 : 16;
        }
        if (dVarF.g((i3 & 19) != 18, i3 & 1)) {
            if (i4 != 0) {
                bVar = androidx.compose.ui.b.INSTANCE;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1090521195, i3, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:752)");
            }
            Object objR = dVarF.R();
            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new ej7() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1
                    @Override // com.google.inputmethod.ej7
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
                        final ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int iN = 0;
                        int iM = 0;
                        for (int i5 = 0; i5 < size; i5++) {
                            o oVarR0 = list.get(i5).r0(j);
                            iN = Math.max(iN, oVarR0.getWidth());
                            iM = Math.max(iM, oVarR0.getHeight());
                            arrayList.add(oVarR0);
                        }
                        if (list.isEmpty()) {
                            iN = kx1.n(j);
                            iM = kx1.m(j);
                        }
                        return j.Q1(jVar, iN, iM, null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((o.a) obj);
                                return Unit.a;
                            }

                            public final void invoke(o.a aVar) {
                                List<o> list2 = arrayList;
                                int size2 = list2.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    o.a.L(aVar, list2.get(i6), 0, 0, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                dVarF.L(objR);
            }
            ej7 ej7Var = (ej7) objR;
            int i5 = ((i3 >> 3) & 14) | 384 | ((i3 << 3) & 112);
            int iHashCode = Long.hashCode(pp1.b(dVarF, 0));
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVar);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion.b();
            int i6 = ((i5 << 6) & 896) | 6;
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7Var, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            dud.i(dVarC, Integer.valueOf(iHashCode), companion.c());
            dud.g(dVarC, companion.a());
            dud.i(dVarC, bVarE, companion.e());
            function2.invoke(dVarF, Integer.valueOf((i6 >> 6) & 14));
            dVarF.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(androidx.compose.p004runtime.d dVar2, int i7) {
                    AndroidDialog_androidKt.c(bVar, function2, dVar2, saa.a(i | 1), i2);
                }
            });
        }
    }
}
