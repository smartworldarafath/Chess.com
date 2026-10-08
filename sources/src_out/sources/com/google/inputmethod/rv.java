package com.google.inputmethod;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.c;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class rv extends hn1 implements iv {
    private c e;
    private final pi6.a f;

    public rv(Context context, int i) {
        super(context, k(context, i));
        this.f = new pi6.a() { // from class: com.google.android.qv
            @Override // com.google.android.pi6.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.a.l(keyEvent);
            }
        };
        c cVarJ = j();
        cVarJ.V(k(context, i));
        cVarJ.E(null);
    }

    private static int k(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(ax9.B, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // com.google.inputmethod.hn1, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        j().f(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        j().F();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return pi6.b(this.f, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) j().p(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        j().B();
    }

    public c j() {
        if (this.e == null) {
            this.e = c.o(this, this);
        }
        return this.e;
    }

    boolean l(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean m(int i) {
        return j().N(i);
    }

    @Override // com.google.inputmethod.hn1, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        j().A();
        super.onCreate(bundle);
        j().E(bundle);
    }

    @Override // com.google.inputmethod.hn1, android.app.Dialog
    protected void onStop() {
        super.onStop();
        j().K();
    }

    @Override // com.google.inputmethod.iv
    public void onSupportActionModeFinished(t7 t7Var) {
    }

    @Override // com.google.inputmethod.iv
    public void onSupportActionModeStarted(t7 t7Var) {
    }

    @Override // com.google.inputmethod.iv
    public t7 onWindowStartingSupportActionMode(t7.a aVar) {
        return null;
    }

    @Override // com.google.inputmethod.hn1, android.app.Dialog
    public void setContentView(int i) {
        f();
        j().P(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        j().W(charSequence);
    }

    @Override // com.google.inputmethod.hn1, android.app.Dialog
    public void setContentView(View view) {
        f();
        j().Q(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        j().W(getContext().getString(i));
    }

    @Override // com.google.inputmethod.hn1, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        j().R(view, layoutParams);
    }
}
