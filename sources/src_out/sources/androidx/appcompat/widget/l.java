package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.inputmethod.d1a;
import com.google.inputmethod.pq3;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class l {
    private final EditText a;
    private final pq3 b;

    l(EditText editText) {
        this.a = editText;
        this.b = new pq3(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    boolean c() {
        return this.b.b();
    }

    void d(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, d1a.g0, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(d1a.u0) ? typedArrayObtainStyledAttributes.getBoolean(d1a.u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            f(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    InputConnection e(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.b.c(inputConnection, editorInfo);
    }

    void f(boolean z) {
        this.b.d(z);
    }
}
