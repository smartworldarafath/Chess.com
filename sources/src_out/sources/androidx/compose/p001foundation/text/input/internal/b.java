package androidx.compose.p001foundation.text.input.internal;

import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager;
import com.google.android.q22;
import com.google.inputmethod.ac9;
import com.google.inputmethod.cx5;
import com.google.inputmethod.hyb;
import com.google.inputmethod.k07;
import com.google.inputmethod.kn6;
import com.google.inputmethod.p7e;
import com.google.inputmethod.zb9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b!\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\u0003R(\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00048\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/text/input/internal/b;", "Lcom/google/android/zb9;", "<init>", "()V", "Landroidx/compose/foundation/text/input/internal/b$a;", "node", "", "j", "(Landroidx/compose/foundation/text/input/internal/b$a;)V", "l", "g", "c", "k", "value", "a", "Landroidx/compose/foundation/text/input/internal/b$a;", "i", "()Landroidx/compose/foundation/text/input/internal/b$a;", "textInputModifierNode", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b implements zb9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private a textInputModifierNode;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u0004\u0018\u00010\u00072\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H&¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/b$a;", "", "Lkotlin/Function2;", "Lcom/google/android/ac9;", "Lcom/google/android/q22;", "", "block", "Lkotlinx/coroutines/s;", "i2", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/s;", "Lcom/google/android/hyb;", "getSoftwareKeyboardController", "()Lcom/google/android/hyb;", "softwareKeyboardController", "Lcom/google/android/kn6;", "h0", "()Lcom/google/android/kn6;", "layoutCoordinates", "Lcom/google/android/k07;", "g1", "()Lcom/google/android/k07;", "legacyTextFieldState", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "J0", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldSelectionManager", "Lcom/google/android/p7e;", "getViewConfiguration", "()Lcom/google/android/p7e;", "viewConfiguration", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        TextFieldSelectionManager J0();

        k07 g1();

        hyb getSoftwareKeyboardController();

        p7e getViewConfiguration();

        kn6 h0();

        s i2(Function2<? super ac9, ? super q22<?>, ? extends Object> block);
    }

    @Override // com.google.inputmethod.zb9
    public final void c() {
        hyb softwareKeyboardController;
        a aVar = this.textInputModifierNode;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.hide();
    }

    @Override // com.google.inputmethod.zb9
    public final void g() {
        hyb softwareKeyboardController;
        a aVar = this.textInputModifierNode;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.show();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    protected final a getTextInputModifierNode() {
        return this.textInputModifierNode;
    }

    public final void j(a node) {
        if (!(this.textInputModifierNode == null)) {
            cx5.c("Expected textInputModifierNode to be null");
        }
        this.textInputModifierNode = node;
    }

    public abstract void k();

    public final void l(a node) {
        if (!(this.textInputModifierNode == node)) {
            cx5.c("Expected textInputModifierNode to be " + node + " but was " + this.textInputModifierNode);
        }
        this.textInputModifierNode = null;
    }
}
