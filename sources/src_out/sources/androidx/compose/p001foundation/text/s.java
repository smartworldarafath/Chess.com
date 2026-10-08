package androidx.compose.p001foundation.text;

import androidx.compose.p001foundation.text.s;
import androidx.compose.p001foundation.text.selection.SelectionGesturesKt;
import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.b;
import androidx.compose.ui.focus.f;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.q22;
import com.google.inputmethod.df9;
import com.google.inputmethod.k07;
import com.google.inputmethod.ne9;
import com.google.inputmethod.pe9;
import com.google.inputmethod.r48;
import com.google.inputmethod.rn8;
import com.google.inputmethod.ugc;
import com.google.inputmethod.wxc;
import com.google.inputmethod.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/b;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "", "enabled", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/k07;", "state", "Landroidx/compose/ui/focus/f;", "focusRequester", "readOnly", "Lcom/google/android/zn8;", "offsetMapping", "c", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLcom/google/android/r48;Lcom/google/android/k07;Landroidx/compose/ui/focus/f;ZLcom/google/android/zn8;)Landroidx/compose/ui/b;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {
        final /* synthetic */ TextFieldSelectionManager a;

        a(TextFieldSelectionManager textFieldSelectionManager) {
            this.a = textFieldSelectionManager;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
            Object objI = SelectionGesturesKt.i(df9Var, this.a.getMouseSelectionObserver(), this.a.getTouchSelectionObserver(), q22Var);
            return objI == kotlin.coroutines.intrinsics.a.g() ? objI : Unit.a;
        }
    }

    public static final b c(b bVar, final TextFieldSelectionManager textFieldSelectionManager, final boolean z, r48 r48Var, final k07 k07Var, final f fVar, final boolean z2, final zn8 zn8Var) {
        return pe9.b(ugc.d(TextFieldPressGestureFilterKt.c(SelectionGesturesKt.r(bVar, new Function1() { // from class: com.google.android.iuc
            public final Object invoke(Object obj) {
                return s.d(k07Var, ((Boolean) obj).booleanValue());
            }
        }), r48Var, z, new Function1() { // from class: com.google.android.juc
            public final Object invoke(Object obj) {
                return s.e(k07Var, fVar, z2, z, textFieldSelectionManager, zn8Var, (rn8) obj);
            }
        }), textFieldSelectionManager.getMouseSelectionObserver(), textFieldSelectionManager.getTouchSelectionObserver(), new a(textFieldSelectionManager)), ne9.INSTANCE.c(), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(k07 k07Var, boolean z) {
        k07Var.M(z);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(k07 k07Var, f fVar, boolean z, boolean z2, TextFieldSelectionManager textFieldSelectionManager, zn8 zn8Var, rn8 rn8Var) {
        CoreTextFieldKt.h0(k07Var, fVar, !z);
        if (k07Var.h() && z2) {
            if (k07Var.g() != HandleState.Selection) {
                wxc wxcVarN = k07Var.n();
                if (wxcVarN != null) {
                    r.INSTANCE.n(rn8Var.getPackedValue(), wxcVarN, k07Var.getProcessor(), zn8Var, k07Var.r());
                    if (k07Var.getTextDelegate().getText().length() > 0) {
                        k07Var.K(HandleState.Cursor);
                    }
                }
            } else {
                textFieldSelectionManager.K(rn8Var);
            }
        }
        return Unit.a;
    }
}
