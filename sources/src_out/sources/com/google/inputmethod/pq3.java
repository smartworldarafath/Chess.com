package com.google.inputmethod;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class pq3 {
    private final b a;
    private int b = Integer.MAX_VALUE;
    private int c = 0;

    private static class a extends b {
        private final EditText a;
        private final br3 b;

        a(EditText editText, boolean z) {
            this.a = editText;
            br3 br3Var = new br3(editText, z);
            this.b = br3Var;
            editText.addTextChangedListener(br3Var);
            editText.setEditableFactory(qq3.getInstance());
        }

        @Override // com.google.android.pq3.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof tq3) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new tq3(keyListener);
        }

        @Override // com.google.android.pq3.b
        boolean b() {
            return this.b.b();
        }

        @Override // com.google.android.pq3.b
        InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof rq3 ? inputConnection : new rq3(this.a, inputConnection, editorInfo);
        }

        @Override // com.google.android.pq3.b
        void d(boolean z) {
            this.b.d(z);
        }
    }

    static class b {
        b() {
        }

        KeyListener a(KeyListener keyListener) {
            throw null;
        }

        boolean b() {
            throw null;
        }

        InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        void d(boolean z) {
            throw null;
        }
    }

    public pq3(EditText editText, boolean z) {
        di9.h(editText, "editText cannot be null");
        this.a = new a(editText, z);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.a.a(keyListener);
    }

    public boolean b() {
        return this.a.b();
    }

    public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.a.c(inputConnection, editorInfo);
    }

    public void d(boolean z) {
        this.a.d(z);
    }
}
