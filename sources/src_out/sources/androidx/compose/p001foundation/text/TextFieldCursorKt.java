package androidx.compose.p001foundation.text;

import androidx.compose.p001foundation.text.TextFieldCursorKt;
import androidx.compose.p001foundation.text.input.internal.CursorAnimationState;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.a0;
import androidx.compose.ui.text.x;
import com.google.android.ps4;
import com.google.inputmethod.SolidColor;
import com.google.inputmethod.TextFieldValue;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.fz1;
import com.google.inputmethod.gba;
import com.google.inputmethod.k07;
import com.google.inputmethod.qu0;
import com.google.inputmethod.rn8;
import com.google.inputmethod.ssc;
import com.google.inputmethod.vn3;
import com.google.inputmethod.wxc;
import com.google.inputmethod.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a;\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/k07;", "state", "Lcom/google/android/cwc;", "value", "Lcom/google/android/zn8;", "offsetMapping", "Lcom/google/android/qu0;", "cursorBrush", "", "enabled", "c", "(Landroidx/compose/ui/b;Lcom/google/android/k07;Lcom/google/android/cwc;Lcom/google/android/zn8;Lcom/google/android/qu0;Z)Landroidx/compose/ui/b;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TextFieldCursorKt {
    public static final b c(b bVar, final k07 k07Var, final TextFieldValue textFieldValue, final zn8 zn8Var, final qu0 qu0Var, boolean z) {
        return z ? ComposedModifierKt.c(bVar, null, new ps4() { // from class: com.google.android.qsc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TextFieldCursorKt.d(qu0Var, k07Var, textFieldValue, zn8Var, (b) obj, (d) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null) : bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b d(final qu0 qu0Var, final k07 k07Var, final TextFieldValue textFieldValue, final zn8 zn8Var, b bVar, d dVar, int i) {
        b bVarD;
        dVar.y(-84507373);
        if (e.k()) {
            e.o(-84507373, i, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:46)");
        }
        boolean zBooleanValue = ((Boolean) dVar.v(CompositionLocalsKt.f())).booleanValue();
        boolean zA = dVar.A(zBooleanValue);
        Object objR = dVar.R();
        if (zA || objR == d.INSTANCE.a()) {
            objR = new CursorAnimationState(zBooleanValue);
            dVar.L(objR);
        }
        final CursorAnimationState cursorAnimationState = (CursorAnimationState) objR;
        boolean z = ((qu0Var instanceof SolidColor) && ((SolidColor) qu0Var).getValue() == 16) ? false : true;
        if (((a0) dVar.v(CompositionLocalsKt.v())).b() && k07Var.h() && x.h(textFieldValue.getSelection()) && z) {
            dVar.y(-707487962);
            androidx.compose.ui.text.b text = textFieldValue.getText();
            x xVarB = x.b(textFieldValue.getSelection());
            boolean zT = dVar.T(cursorAnimationState);
            Object objR2 = dVar.R();
            if (zT || objR2 == d.INSTANCE.a()) {
                objR2 = new TextFieldCursorKt$cursor$1$1$1(cursorAnimationState, null);
                dVar.L(objR2);
            }
            vn3.f(text, xVarB, (Function2) objR2, dVar, 0);
            boolean zT2 = dVar.T(cursorAnimationState) | dVar.T(zn8Var) | dVar.x(textFieldValue) | dVar.T(k07Var) | dVar.x(qu0Var);
            Object objR3 = dVar.R();
            if (zT2 || objR3 == d.INSTANCE.a()) {
                Object obj = new Function1() { // from class: com.google.android.rsc
                    public final Object invoke(Object obj2) {
                        return TextFieldCursorKt.e(cursorAnimationState, zn8Var, textFieldValue, k07Var, qu0Var, (fz1) obj2);
                    }
                };
                dVar.L(obj);
                objR3 = obj;
            }
            bVarD = c.d(bVar, (Function1) objR3);
            dVar.u();
        } else {
            dVar.y(-705473241);
            dVar.u();
            bVarD = b.INSTANCE;
        }
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return bVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(CursorAnimationState cursorAnimationState, zn8 zn8Var, TextFieldValue textFieldValue, k07 k07Var, qu0 qu0Var, fz1 fz1Var) {
        gba gbaVar;
        TextLayoutResult value;
        fz1Var.j1();
        float fD = cursorAnimationState.d();
        if (fD != 0.0f) {
            int iB = zn8Var.b(x.n(textFieldValue.getSelection()));
            wxc wxcVarN = k07Var.n();
            if (wxcVarN == null || (value = wxcVarN.getValue()) == null || (gbaVar = value.e(iB)) == null) {
                gbaVar = new gba(0.0f, 0.0f, 0.0f, 0.0f);
            }
            float fD2 = g.d((float) Math.floor(fz1Var.x2(ssc.a())), 1.0f);
            float f = fD2 / 2;
            float fD3 = g.d(g.i(gbaVar.getLeft() + f, Float.intBitsToFloat((int) (fz1Var.d() >> 32)) - f), f);
            float fFloor = ((int) fD2) % 2 == 1 ? ((float) Math.floor(fD3)) + 0.5f : (float) Math.rint(fD3);
            DrawScope.y0(fz1Var, qu0Var, rn8.e((((long) Float.floatToRawIntBits(gbaVar.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloor)) << 32)), rn8.e((((long) Float.floatToRawIntBits(gbaVar.getBottom())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloor)) << 32)), fD2, 0, null, fD, null, 0, 432, null);
        }
        return Unit.a;
    }
}
