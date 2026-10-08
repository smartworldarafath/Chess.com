package com.google.inputmethod;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class br3 implements TextWatcher {
    private final EditText a;
    private final boolean b;
    private e.f c;
    private int d = Integer.MAX_VALUE;
    private int e = 0;
    private boolean f = true;

    static class a extends e.f implements Runnable {
        private final Reference<EditText> a;

        a(EditText editText) {
            this.a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            Handler handler;
            super.b();
            EditText editText = this.a.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            br3.c(this.a.get(), 1);
        }
    }

    br3(EditText editText, boolean z) {
        this.a = editText;
        this.b = z;
    }

    static void c(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            e.c().r(editableText);
            sq3.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean e() {
        if (this.f) {
            return (this.b || e.k()) ? false : true;
        }
        return true;
    }

    e.f a() {
        if (this.c == null) {
            this.c = new a(this.a);
        }
        return this.c;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    public boolean b() {
        return this.f;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void d(boolean z) {
        if (this.f != z) {
            if (this.c != null) {
                e.c().w(this.c);
            }
            this.f = z;
            if (z) {
                c(this.a, e.c().g());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.a.isInEditMode() || e() || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iG = e.c().g();
        if (iG != 0) {
            if (iG == 1) {
                e.c().u((Spannable) charSequence, i, i + i3, this.d, this.e);
                return;
            } else if (iG != 3) {
                return;
            }
        }
        e.c().v(a());
    }
}
