package com.google.inputmethod;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class z5 extends ClickableSpan {
    private final int a;
    private final r6 b;
    private final int c;

    public z5(int i, r6 r6Var, int i2) {
        this.a = i;
        this.b = r6Var;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.i0(this.c, bundle);
    }
}
