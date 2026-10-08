package androidx.emoji2.text;

import android.text.TextPaint;
import com.google.inputmethod.r09;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class d implements e.InterfaceC0083e {
    private static final ThreadLocal<StringBuilder> b = new ThreadLocal<>();
    private final TextPaint a;

    d() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.e.InterfaceC0083e
    public boolean a(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i < i2) {
            sbB.append(charSequence.charAt(i));
            i++;
        }
        return r09.a(this.a, sbB.toString());
    }
}
