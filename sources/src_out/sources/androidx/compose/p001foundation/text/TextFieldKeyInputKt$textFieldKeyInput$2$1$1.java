package androidx.compose.p001foundation.text;

import android.view.KeyEvent;
import com.google.inputmethod.auc;
import com.google.inputmethod.oi6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class TextFieldKeyInputKt$textFieldKeyInput$2$1$1 extends FunctionReferenceImpl implements Function1<oi6, Boolean> {
    TextFieldKeyInputKt$textFieldKeyInput$2$1$1(Object obj) {
        super(1, obj, auc.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m(((oi6) obj).getNativeKeyEvent());
    }

    public final Boolean m(KeyEvent keyEvent) {
        return Boolean.valueOf(((auc) ((CallableReference) this).receiver).o(keyEvent));
    }
}
