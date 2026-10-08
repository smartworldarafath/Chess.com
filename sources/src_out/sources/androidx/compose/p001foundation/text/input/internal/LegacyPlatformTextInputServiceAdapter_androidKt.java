package androidx.compose.p001foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.e;
import com.google.inputmethod.ey5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"4\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/text/input/internal/b;", "b", "()Landroidx/compose/foundation/text/input/internal/b;", "Landroid/view/inputmethod/EditorInfo;", "", "d", "(Landroid/view/inputmethod/EditorInfo;)V", "Lkotlin/Function1;", "Landroid/view/View;", "Lcom/google/android/ey5;", "a", "Lkotlin/jvm/functions/Function1;", "c", "()Lkotlin/jvm/functions/Function1;", "setInputMethodManagerFactory", "(Lkotlin/jvm/functions/Function1;)V", "getInputMethodManagerFactory$annotations", "()V", "inputMethodManagerFactory", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LegacyPlatformTextInputServiceAdapter_androidKt {
    private static Function1<? super View, ? extends ey5> a = LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1.a;

    public static final b b() {
        return new AndroidLegacyPlatformTextInputServiceAdapter();
    }

    public static final Function1<View, ey5> c() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(EditorInfo editorInfo) {
        if (e.k()) {
            e.c().x(editorInfo);
        }
    }
}
