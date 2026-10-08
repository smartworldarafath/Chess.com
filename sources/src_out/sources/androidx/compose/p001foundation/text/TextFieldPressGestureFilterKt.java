package androidx.compose.p001foundation.text;

import androidx.compose.p001foundation.text.TextFieldPressGestureFilterKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.ps4;
import com.google.android.ta2;
import com.google.inputmethod.jd3;
import com.google.inputmethod.kd3;
import com.google.inputmethod.o58;
import com.google.inputmethod.q6c;
import com.google.inputmethod.r48;
import com.google.inputmethod.rn8;
import com.google.inputmethod.ugc;
import com.google.inputmethod.vn3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/r48;", "interactionSource", "", "enabled", "Lkotlin/Function1;", "Lcom/google/android/rn8;", "", "onTap", "c", "(Landroidx/compose/ui/b;Lcom/google/android/r48;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/b;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TextFieldPressGestureFilterKt {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/foundation/text/TextFieldPressGestureFilterKt$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements jd3 {
        final /* synthetic */ o58 a;
        final /* synthetic */ r48 b;

        public a(o58 o58Var, r48 r48Var) {
            this.a = o58Var;
            this.b = r48Var;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            androidx.compose.foundation.interaction.a.b bVar = (androidx.compose.foundation.interaction.a.b) this.a.getValue();
            if (bVar != null) {
                androidx.compose.p001foundation.interaction.a.C0016a c0016a = new androidx.compose.p001foundation.interaction.a.C0016a(bVar);
                r48 r48Var = this.b;
                if (r48Var != null) {
                    r48Var.b(c0016a);
                }
                this.a.setValue(null);
            }
        }
    }

    public static final b c(b bVar, final r48 r48Var, boolean z, final Function1<? super rn8, Unit> function1) {
        return z ? ComposedModifierKt.c(bVar, null, new ps4() { // from class: com.google.android.luc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TextFieldPressGestureFilterKt.d(function1, r48Var, (b) obj, (d) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null) : bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b d(Function1 function1, final r48 r48Var, b bVar, d dVar, int i) {
        dVar.y(-102778667);
        if (e.k()) {
            e.o(-102778667, i, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
        }
        Object objR = dVar.R();
        d.Companion companion = d.INSTANCE;
        if (objR == companion.a()) {
            objR = vn3.k(EmptyCoroutineContext.a, dVar);
            dVar.L(objR);
        }
        ta2 ta2Var = (ta2) objR;
        Object objR2 = dVar.R();
        if (objR2 == companion.a()) {
            objR2 = s0.e(null, null, 2, null);
            dVar.L(objR2);
        }
        final o58 o58Var = (o58) objR2;
        q6c q6cVarR = p0.r(function1, dVar, 0);
        boolean zX = dVar.x(r48Var);
        Object objR3 = dVar.R();
        if (zX || objR3 == companion.a()) {
            objR3 = new Function1() { // from class: com.google.android.muc
                public final Object invoke(Object obj) {
                    return TextFieldPressGestureFilterKt.e(o58Var, r48Var, (kd3) obj);
                }
            };
            dVar.L(objR3);
        }
        vn3.c(r48Var, (Function1) objR3, dVar, 0);
        b.Companion companion2 = b.INSTANCE;
        boolean zT = dVar.T(ta2Var) | dVar.x(r48Var) | dVar.x(q6cVarR);
        Object objR4 = dVar.R();
        if (zT || objR4 == companion.a()) {
            objR4 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1(ta2Var, o58Var, r48Var, q6cVarR);
            dVar.L(objR4);
        }
        b bVarC = ugc.c(companion2, r48Var, (PointerInputEventHandler) objR4);
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return bVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 e(o58 o58Var, r48 r48Var, kd3 kd3Var) {
        return new a(o58Var, r48Var);
    }
}
