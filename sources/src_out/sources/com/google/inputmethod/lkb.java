package com.google.inputmethod;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a\"\u0004\b\u0018\u0010\u001bR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/google/android/lkb;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Lcom/google/android/jkb;", "shaderBrush", "", "alpha", "<init>", "(Lcom/google/android/jkb;F)V", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "Lcom/google/android/jkb;", "getShaderBrush", "()Lcom/google/android/jkb;", "b", "F", "getAlpha", "()F", "Lcom/google/android/tsb;", "<set-?>", "c", "Lcom/google/android/o58;", "()J", "(J)V", "size", "Lcom/google/android/q6c;", "Landroid/graphics/Shader;", "d", "Lcom/google/android/q6c;", "shaderState", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lkb extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final jkb shaderBrush;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float alpha;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final o58 size = s0.e(tsb.c(tsb.INSTANCE.a()), null, 2, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final q6c<Shader> shaderState = p0.e(new Function0() { // from class: com.google.android.kkb
        public final Object invoke() {
            return lkb.d(this.a);
        }
    });

    public lkb(jkb jkbVar, float f) {
        this.shaderBrush = jkbVar;
        this.alpha = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader d(lkb lkbVar) {
        if (lkbVar.b() == 9205357640488583168L || tsb.n(lkbVar.b())) {
            return null;
        }
        return lkbVar.shaderBrush.b(lkbVar.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        return ((tsb) this.size.getValue()).getPackedValue();
    }

    public final void c(long j) {
        this.size.setValue(tsb.c(j));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        qo.a(textPaint, this.alpha);
        textPaint.setShader(this.shaderState.getValue());
    }
}
