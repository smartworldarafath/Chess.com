package androidx.compose.p001foundation.text.selection;

import android.content.Context;
import androidx.compose.p001foundation.t;
import androidx.compose.p001foundation.text.TextContextMenuItems;
import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.p001foundation.u;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.x;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.android.ut0;
import com.google.inputmethod.brc;
import com.google.inputmethod.d22;
import com.google.inputmethod.f43;
import com.google.inputmethod.fvc;
import com.google.inputmethod.jf1;
import com.google.inputmethod.jf3;
import com.google.inputmethod.lf1;
import com.google.inputmethod.lrc;
import com.google.inputmethod.o58;
import com.google.inputmethod.q16;
import com.google.inputmethod.rn8;
import com.google.inputmethod.rrc;
import com.google.inputmethod.zn8;
import com.google.inputmethod.zyc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\n\u001a\u00020\t*\u00020\u0001H\u0080@¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\t*\u00020\u00012\u0006\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/b;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "z", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)Landroidx/compose/ui/b;", "Lcom/google/android/ta2;", "coroutineScope", "m", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lcom/google/android/ta2;)Landroidx/compose/ui/b;", "", "x", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lcom/google/android/q22;)Ljava/lang/Object;", "isStartHandle", "y", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Z)Z", "Lcom/google/android/q16;", "magnifierSize", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TextFieldSelectionManager_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final b A(final TextFieldSelectionManager textFieldSelectionManager, b bVar, d dVar, int i) {
        dVar.y(1980580247);
        if (e.k()) {
            e.o(1980580247, i, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:54)");
        }
        final f43 f43Var = (f43) dVar.v(CompositionLocalsKt.g());
        Object objR = dVar.R();
        d.Companion companion = d.INSTANCE;
        if (objR == companion.a()) {
            objR = s0.e(q16.b(q16.INSTANCE.a()), null, 2, null);
            dVar.L(objR);
        }
        final o58 o58Var = (o58) objR;
        boolean zT = dVar.T(textFieldSelectionManager);
        Object objR2 = dVar.R();
        if (zT || objR2 == companion.a()) {
            objR2 = new Function0() { // from class: com.google.android.lvc
                public final Object invoke() {
                    return TextFieldSelectionManager_androidKt.D(textFieldSelectionManager, o58Var);
                }
            };
            dVar.L(objR2);
        }
        Function0 function0 = (Function0) objR2;
        boolean zX = dVar.x(f43Var);
        Object objR3 = dVar.R();
        if (zX || objR3 == companion.a()) {
            objR3 = new Function1() { // from class: com.google.android.mvc
                public final Object invoke(Object obj) {
                    return TextFieldSelectionManager_androidKt.E(f43Var, o58Var, (Function0) obj);
                }
            };
            dVar.L(objR3);
        }
        b bVarH = SelectionMagnifierKt.h(bVar, function0, (Function1) objR3);
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return bVarH;
    }

    private static final long B(o58<q16> o58Var) {
        return o58Var.getValue().getPackedValue();
    }

    private static final void C(o58<q16> o58Var, long j) {
        o58Var.setValue(q16.b(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rn8 D(TextFieldSelectionManager textFieldSelectionManager, o58 o58Var) {
        return rn8.d(fvc.j(textFieldSelectionManager, B(o58Var)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b E(final f43 f43Var, final o58 o58Var, final Function0 function0) {
        return t.f(b.INSTANCE, new Function1() { // from class: com.google.android.qvc
            public final Object invoke(Object obj) {
                return TextFieldSelectionManager_androidKt.F(function0, (f43) obj);
            }
        }, null, new Function1() { // from class: com.google.android.rvc
            public final Object invoke(Object obj) {
                return TextFieldSelectionManager_androidKt.G(f43Var, o58Var, (jf3) obj);
            }
        }, 0.0f, true, 0L, 0.0f, 0.0f, false, u.INSTANCE.a(), 490, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rn8 F(Function0 function0, f43 f43Var) {
        return (rn8) function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(f43 f43Var, o58 o58Var, jf3 jf3Var) {
        C(o58Var, q16.c((((long) f43Var.O1(jf3.h(jf3Var.getPackedValue()))) << 32) | (((long) f43Var.O1(jf3.g(jf3Var.getPackedValue()))) & 4294967295L)));
        return Unit.a;
    }

    public static final b m(b bVar, final TextFieldSelectionManager textFieldSelectionManager, final ta2 ta2Var) {
        return lrc.a(bVar, new Function2() { // from class: com.google.android.jvc
            public final Object invoke(Object obj, Object obj2) {
                return TextFieldSelectionManager_androidKt.n(textFieldSelectionManager, ta2Var, (brc) obj, (Context) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(final TextFieldSelectionManager textFieldSelectionManager, final ta2 ta2Var, brc brcVar, final Context context) {
        boolean zX = textFieldSelectionManager.X();
        androidx.compose.ui.text.b bVarO0 = textFieldSelectionManager.o0();
        x xVarB = null;
        String text = bVarO0 != null ? bVarO0.getText() : null;
        x latestSelection = textFieldSelectionManager.getLatestSelection();
        if (latestSelection != null) {
            long packedValue = latestSelection.getPackedValue();
            zn8 offsetMapping = textFieldSelectionManager.getOffsetMapping();
            xVarB = x.b(zyc.b(offsetMapping.b(x.n(packedValue)), offsetMapping.b(x.i(packedValue))));
        }
        c.f(brcVar, context, zX, text, xVarB, textFieldSelectionManager.getPlatformSelectionBehaviors(), new Function1() { // from class: com.google.android.kvc
            public final Object invoke(Object obj) {
                return TextFieldSelectionManager_androidKt.o(textFieldSelectionManager, ta2Var, context, (brc) obj);
            }
        });
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(final TextFieldSelectionManager textFieldSelectionManager, ta2 ta2Var, Context context, brc brcVar) {
        brcVar.d();
        v(brcVar, ta2Var, context, TextContextMenuItems.a, textFieldSelectionManager.y(), new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1(textFieldSelectionManager, null));
        v(brcVar, ta2Var, context, TextContextMenuItems.b, textFieldSelectionManager.x(), new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2(textFieldSelectionManager, null));
        v(brcVar, ta2Var, context, TextContextMenuItems.c, textFieldSelectionManager.z(), new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3(textFieldSelectionManager, null));
        s(brcVar, context, TextContextMenuItems.d, textFieldSelectionManager.A(), new Function0() { // from class: com.google.android.nvc
            public final Object invoke() {
                return Boolean.valueOf(TextFieldSelectionManager_androidKt.p(textFieldSelectionManager));
            }
        }, new Function0() { // from class: com.google.android.ovc
            public final Object invoke() {
                return TextFieldSelectionManager_androidKt.q(textFieldSelectionManager);
            }
        });
        u(brcVar, context, TextContextMenuItems.e, textFieldSelectionManager.w(), null, new Function0() { // from class: com.google.android.pvc
            public final Object invoke() {
                return TextFieldSelectionManager_androidKt.r(textFieldSelectionManager);
            }
        }, 8, null);
        brcVar.d();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(TextFieldSelectionManager textFieldSelectionManager) {
        return !textFieldSelectionManager.m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.y0();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.v();
        return Unit.a;
    }

    private static final void s(brc brcVar, Context context, TextContextMenuItems textContextMenuItems, boolean z, final Function0<Boolean> function0, final Function0<Unit> function1) {
        d22.d(brcVar, context.getResources(), textContextMenuItems, z, new Function1() { // from class: com.google.android.hvc
            public final Object invoke(Object obj) {
                return TextFieldSelectionManager_androidKt.t(function1, function0, (rrc) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function0 function0, Function0 function1, rrc rrcVar) {
        function0.invoke();
        if (function1 != null ? ((Boolean) function1.invoke()).booleanValue() : true) {
            rrcVar.close();
        }
        return Unit.a;
    }

    static /* synthetic */ void u(brc brcVar, Context context, TextContextMenuItems textContextMenuItems, boolean z, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        s(brcVar, context, textContextMenuItems, z, function0, function1);
    }

    private static final void v(brc brcVar, final ta2 ta2Var, Context context, TextContextMenuItems textContextMenuItems, boolean z, final Function1<? super q22<? super Unit>, ? extends Object> function1) {
        u(brcVar, context, textContextMenuItems, z, null, new Function0() { // from class: com.google.android.ivc
            public final Object invoke() {
                return TextFieldSelectionManager_androidKt.w(ta2Var, function1);
            }
        }, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(ta2 ta2Var, Function1 function1) {
        rw0.d(ta2Var, (CoroutineContext) null, CoroutineStart.d, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1(function1, null), 1, (Object) null);
        return Unit.a;
    }

    public static final Object x(TextFieldSelectionManager textFieldSelectionManager, q22<? super Boolean> q22Var) {
        jf1 clipboard = textFieldSelectionManager.getClipboard();
        return ut0.a(clipboard != null ? lf1.a(clipboard) : false);
    }

    public static final boolean y(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        return fvc.s(textFieldSelectionManager, z);
    }

    public static final b z(b bVar, final TextFieldSelectionManager textFieldSelectionManager) {
        return !t.d(0, 1, null) ? bVar : ComposedModifierKt.c(bVar, null, new ps4() { // from class: com.google.android.gvc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TextFieldSelectionManager_androidKt.A(textFieldSelectionManager, (b) obj, (d) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }
}
