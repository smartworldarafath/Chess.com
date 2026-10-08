package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.input.f;
import androidx.compose.ui.text.x;
import com.google.inputmethod.TextFieldValue;
import com.google.inputmethod.sn3;
import com.google.inputmethod.t04;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "i", "(Landroid/view/inputmethod/EditorInfo;)V", "Landroidx/compose/ui/text/input/b;", "imeOptions", "Lcom/google/android/cwc;", "textFieldValue", "h", "(Landroid/view/inputmethod/EditorInfo;Landroidx/compose/ui/text/input/b;Lcom/google/android/cwc;)V", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "d", "(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;", "", "bits", "flag", "", "g", "(II)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final Executor d(final Choreographer choreographer) {
        return new Executor() { // from class: com.google.android.fxc
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                f.e(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: com.google.android.gxc
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                f.f(runnable, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Runnable runnable, long j) {
        runnable.run();
    }

    private static final boolean g(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final void h(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        int imeAction = imeOptions.getImeAction();
        a.Companion companion = a.INSTANCE;
        int i = 6;
        if (a.m(imeAction, companion.a())) {
            if (!imeOptions.getSingleLine()) {
                i = 0;
            }
        } else if (a.m(imeAction, companion.e())) {
            i = 1;
        } else if (a.m(imeAction, companion.c())) {
            i = 2;
        } else if (a.m(imeAction, companion.d())) {
            i = 5;
        } else if (a.m(imeAction, companion.f())) {
            i = 7;
        } else if (a.m(imeAction, companion.g())) {
            i = 3;
        } else if (a.m(imeAction, companion.h())) {
            i = 4;
        } else if (!a.m(imeAction, companion.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i;
        imeOptions.g();
        int keyboardType = imeOptions.getKeyboardType();
        d.Companion companion2 = d.INSTANCE;
        if (d.n(keyboardType, companion2.h())) {
            editorInfo.inputType = 1;
        } else if (d.n(keyboardType, companion2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= t04.INVALID_ID;
        } else if (d.n(keyboardType, companion2.d())) {
            editorInfo.inputType = 2;
        } else if (d.n(keyboardType, companion2.g())) {
            editorInfo.inputType = 3;
        } else if (d.n(keyboardType, companion2.j())) {
            editorInfo.inputType = 17;
        } else if (d.n(keyboardType, companion2.c())) {
            editorInfo.inputType = 33;
        } else if (d.n(keyboardType, companion2.f())) {
            editorInfo.inputType = 129;
        } else if (d.n(keyboardType, companion2.e())) {
            editorInfo.inputType = 18;
        } else {
            if (!d.n(keyboardType, companion2.b())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (a.m(imeOptions.getImeAction(), companion.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            c.Companion companion3 = c.INSTANCE;
            if (c.i(capitalization, companion3.a())) {
                editorInfo.inputType |= 4096;
            } else if (c.i(capitalization, companion3.e())) {
                editorInfo.inputType |= 8192;
            } else if (c.i(capitalization, companion3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = x.n(textFieldValue.getSelection());
        editorInfo.initialSelEnd = x.i(textFieldValue.getSelection());
        sn3.e(editorInfo, textFieldValue.m());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditorInfo editorInfo) {
        if (androidx.emoji2.text.e.k()) {
            androidx.emoji2.text.e.c().x(editorInfo);
        }
    }
}
