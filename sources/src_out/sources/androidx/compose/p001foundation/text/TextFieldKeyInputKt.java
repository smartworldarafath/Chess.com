package androidx.compose.p001foundation.text;

import androidx.compose.p001foundation.text.TextFieldKeyInputKt;
import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import com.google.android.bh6;
import com.google.android.ps4;
import com.google.inputmethod.TextFieldValue;
import com.google.inputmethod.auc;
import com.google.inputmethod.fq2;
import com.google.inputmethod.k07;
import com.google.inputmethod.rsd;
import com.google.inputmethod.wi6;
import com.google.inputmethod.yyc;
import com.google.inputmethod.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ai\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/k07;", "state", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Lcom/google/android/cwc;", "value", "Lkotlin/Function1;", "", "onValueChange", "", "editable", "singleLine", "Lcom/google/android/zn8;", "offsetMapping", "Lcom/google/android/rsd;", "undoManager", "Landroidx/compose/ui/text/input/a;", "imeAction", "b", "(Landroidx/compose/ui/b;Lcom/google/android/k07;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lcom/google/android/cwc;Lkotlin/jvm/functions/Function1;ZZLcom/google/android/zn8;Lcom/google/android/rsd;I)Landroidx/compose/ui/b;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TextFieldKeyInputKt {
    public static final b b(b bVar, final k07 k07Var, final TextFieldSelectionManager textFieldSelectionManager, final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, final boolean z, final boolean z2, final zn8 zn8Var, final rsd rsdVar, final int i) {
        return ComposedModifierKt.c(bVar, null, new ps4() { // from class: com.google.android.buc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TextFieldKeyInputKt.c(k07Var, textFieldSelectionManager, textFieldValue, z, z2, zn8Var, rsdVar, function1, i, (b) obj, (d) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b c(k07 k07Var, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, zn8 zn8Var, rsd rsdVar, Function1 function1, int i, b bVar, d dVar, int i2) {
        dVar.y(851809892);
        if (e.k()) {
            e.o(851809892, i2, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:256)");
        }
        Object objR = dVar.R();
        d.Companion companion = d.INSTANCE;
        if (objR == companion.a()) {
            objR = new yyc();
            dVar.L(objR);
        }
        yyc yycVar = (yyc) objR;
        Object objR2 = dVar.R();
        if (objR2 == companion.a()) {
            objR2 = new fq2();
            dVar.L(objR2);
        }
        auc aucVar = new auc(k07Var, textFieldSelectionManager, textFieldValue, z, z2, yycVar, zn8Var, rsdVar, (fq2) objR2, null, function1, i, 512, null);
        b.Companion companion2 = b.INSTANCE;
        boolean zT = dVar.T(aucVar);
        Object objR3 = dVar.R();
        if (zT || objR3 == companion.a()) {
            objR3 = new TextFieldKeyInputKt$textFieldKeyInput$2$1$1(aucVar);
            dVar.L(objR3);
        }
        b bVarA = wi6.a(companion2, (bh6) objR3);
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return bVarA;
    }
}
