package androidx.compose.p001foundation.text;

import androidx.compose.p001foundation.text.CommonContextMenuAreaKt;
import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.s0;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.ContextMenuState;
import com.google.inputmethod.e12;
import com.google.inputmethod.fvc;
import com.google.inputmethod.n12;
import com.google.inputmethod.o58;
import com.google.inputmethod.q12;
import com.google.inputmethod.s6b;
import com.google.inputmethod.sa9;
import com.google.inputmethod.saa;
import com.google.inputmethod.t04;
import com.google.inputmethod.up1;
import com.google.inputmethod.vn3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0080@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Lkotlin/Function0;", "", "content", "d", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "Landroidx/compose/foundation/text/o;", "h", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lcom/google/android/q22;)Ljava/lang/Object;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CommonContextMenuAreaKt {
    public static final void d(final TextFieldSelectionManager textFieldSelectionManager, Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        int i2;
        final Function2<? super d, ? super Integer, Unit> function3;
        d dVarF = dVar.F(1533506138);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(function2) ? 32 : 16;
        }
        if (dVarF.g((i2 & 19) != 18, i2 & 1)) {
            if (e.k()) {
                e.o(1533506138, i2, -1, "androidx.compose.foundation.text.CommonContextMenuArea (CommonContextMenuArea.kt:46)");
            }
            if (up1.isNewContextMenuEnabled) {
                dVarF.y(-885604480);
                sa9.m(textFieldSelectionManager.R(), function2, dVarF, i2 & 112, 0);
                dVarF.u();
                function3 = function2;
            } else {
                dVarF.y(-885475365);
                Object objR = dVarF.R();
                d.Companion companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = new ContextMenuState(null, 1, null);
                    dVarF.L(objR);
                }
                final ContextMenuState contextMenuState = (ContextMenuState) objR;
                Object objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR2);
                }
                final ta2 ta2Var = (ta2) objR2;
                Object objR3 = dVarF.R();
                if (objR3 == companion.a()) {
                    objR3 = s0.e(o.b(o.INSTANCE.a()), null, 2, null);
                    dVarF.L(objR3);
                }
                final o58 o58Var = (o58) objR3;
                Object objR4 = dVarF.R();
                if (objR4 == companion.a()) {
                    objR4 = new Function0() { // from class: com.google.android.hk1
                        public final Object invoke() {
                            return CommonContextMenuAreaKt.e(contextMenuState);
                        }
                    };
                    dVarF.L(objR4);
                }
                Function0 function0 = (Function0) objR4;
                Function1<n12, Unit> function1K = fvc.k(textFieldSelectionManager, contextMenuState, o58Var);
                boolean zY = textFieldSelectionManager.Y();
                boolean zT = dVarF.T(ta2Var) | dVarF.T(textFieldSelectionManager);
                Object objR5 = dVarF.R();
                if (zT || objR5 == companion.a()) {
                    objR5 = new Function0() { // from class: com.google.android.ik1
                        public final Object invoke() {
                            return CommonContextMenuAreaKt.f(ta2Var, o58Var, textFieldSelectionManager);
                        }
                    };
                    dVarF.L(objR5);
                }
                function3 = function2;
                e12.i(contextMenuState, function0, function1K, null, zY, (Function0) objR5, function3, dVarF, ((i2 << 15) & 3670016) | 54, 8);
                dVarF.u();
            }
            if (e.k()) {
                e.n();
            }
        } else {
            function3 = function2;
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.jk1
                public final Object invoke(Object obj, Object obj2) {
                    return CommonContextMenuAreaKt.g(textFieldSelectionManager, function3, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(ContextMenuState contextMenuState) {
        q12.a(contextMenuState);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(ta2 ta2Var, o58 o58Var, TextFieldSelectionManager textFieldSelectionManager) {
        rw0.d(ta2Var, (CoroutineContext) null, CoroutineStart.d, new CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1(o58Var, textFieldSelectionManager, null), 1, (Object) null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(TextFieldSelectionManager textFieldSelectionManager, Function2 function2, int i, d dVar, int i2) {
        d(textFieldSelectionManager, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(TextFieldSelectionManager textFieldSelectionManager, q22<? super o> q22Var) {
        CommonContextMenuAreaKt$getContextMenuItemsAvailability$2 commonContextMenuAreaKt$getContextMenuItemsAvailability$2;
        if (q22Var instanceof CommonContextMenuAreaKt$getContextMenuItemsAvailability$2) {
            commonContextMenuAreaKt$getContextMenuItemsAvailability$2 = (CommonContextMenuAreaKt$getContextMenuItemsAvailability$2) q22Var;
            int i = commonContextMenuAreaKt$getContextMenuItemsAvailability$2.label;
            if ((i & t04.INVALID_ID) != 0) {
                commonContextMenuAreaKt$getContextMenuItemsAvailability$2.label = i - t04.INVALID_ID;
            } else {
                commonContextMenuAreaKt$getContextMenuItemsAvailability$2 = new CommonContextMenuAreaKt$getContextMenuItemsAvailability$2(q22Var);
            }
        } else {
            commonContextMenuAreaKt$getContextMenuItemsAvailability$2 = new CommonContextMenuAreaKt$getContextMenuItemsAvailability$2(q22Var);
        }
        Object obj = commonContextMenuAreaKt$getContextMenuItemsAvailability$2.result;
        Object objG = a.g();
        int i2 = commonContextMenuAreaKt$getContextMenuItemsAvailability$2.label;
        if (i2 == 0) {
            f.b(obj);
            commonContextMenuAreaKt$getContextMenuItemsAvailability$2.L$0 = textFieldSelectionManager;
            commonContextMenuAreaKt$getContextMenuItemsAvailability$2.label = 1;
            if (textFieldSelectionManager.X0(commonContextMenuAreaKt$getContextMenuItemsAvailability$2) == objG) {
                return objG;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            textFieldSelectionManager = (TextFieldSelectionManager) commonContextMenuAreaKt$getContextMenuItemsAvailability$2.L$0;
            f.b(obj);
        }
        return o.b(o.d(textFieldSelectionManager.x(), textFieldSelectionManager.z(), textFieldSelectionManager.y(), textFieldSelectionManager.A(), textFieldSelectionManager.w()));
    }
}
