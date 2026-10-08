package com.google.inputmethod;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.t;
import androidx.compose.ui.text.font.u;
import com.google.android.kqd;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001bJ\u0015\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u0010\u001bJ\u0015\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u0010\"J\u0015\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010\u0010J\u0015\u0010=\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0006¢\u0006\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010@¨\u0006B"}, d2 = {"Lcom/google/android/fs3;", "", "<init>", "()V", "", "q", "", "p", "()Ljava/lang/String;", "Landroidx/compose/ui/text/r;", "spanStyle", "d", "(Landroidx/compose/ui/text/r;)V", "Lcom/google/android/ei1;", "color", "m", "(J)V", "Lcom/google/android/b0d;", "textUnit", "j", "Landroidx/compose/ui/text/font/x;", "fontWeight", "e", "(Landroidx/compose/ui/text/font/x;)V", "Landroidx/compose/ui/text/font/t;", "fontStyle", "o", "(I)V", "Landroidx/compose/ui/text/font/u;", "fontSynthesis", "l", "Lcom/google/android/wg0;", "baselineShift", "k", "(F)V", "Lcom/google/android/hwc;", "textGeometricTransform", "h", "(Lcom/google/android/hwc;)V", "Lcom/google/android/wrc;", "textDecoration", "g", "(Lcom/google/android/wrc;)V", "Lcom/google/android/nkb;", "shadow", "f", "(Lcom/google/android/nkb;)V", "", "byte", "a", "(B)V", "", "int", "c", "", "float", "b", "Lcom/google/android/kqd;", "uLong", "n", "string", "i", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "Landroid/os/Parcel;", "parcel", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class fs3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Parcel parcel = Parcel.obtain();

    public final void a(byte b) {
        this.parcel.writeByte(b);
    }

    public final void b(float f) {
        this.parcel.writeFloat(f);
    }

    public final void c(int i) {
        this.parcel.writeInt(i);
    }

    public final void d(SpanStyle spanStyle) {
        long jG = spanStyle.g();
        ei1.Companion companion = ei1.INSTANCE;
        if (!ei1.r(jG, companion.i())) {
            a((byte) 1);
            m(spanStyle.g());
        }
        long fontSize = spanStyle.getFontSize();
        b0d.Companion companion2 = b0d.INSTANCE;
        if (!b0d.e(fontSize, companion2.a())) {
            a((byte) 2);
            j(spanStyle.getFontSize());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            a((byte) 3);
            e(fontWeight);
        }
        t fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            int value = fontStyle.getValue();
            a((byte) 4);
            o(value);
        }
        u fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            int value2 = fontSynthesis.getValue();
            a((byte) 5);
            l(value2);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            a((byte) 6);
            i(fontFeatureSettings);
        }
        if (!b0d.e(spanStyle.getLetterSpacing(), companion2.a())) {
            a((byte) 7);
            j(spanStyle.getLetterSpacing());
        }
        wg0 baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            float multiplier = baselineShift.getMultiplier();
            a((byte) 8);
            k(multiplier);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            a((byte) 9);
            h(textGeometricTransform);
        }
        if (!ei1.r(spanStyle.getBackground(), companion.i())) {
            a((byte) 10);
            m(spanStyle.getBackground());
        }
        wrc textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            a((byte) 11);
            g(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            a((byte) 12);
            f(shadow);
        }
    }

    public final void e(FontWeight fontWeight) {
        c(fontWeight.q());
    }

    public final void f(Shadow shadow) {
        m(shadow.getColor());
        b(Float.intBitsToFloat((int) (shadow.getOffset() >> 32)));
        b(Float.intBitsToFloat((int) (shadow.getOffset() & 4294967295L)));
        b(shadow.getBlurRadius());
    }

    public final void g(wrc textDecoration) {
        c(textDecoration.getMask());
    }

    public final void h(TextGeometricTransform textGeometricTransform) {
        b(textGeometricTransform.getScaleX());
        b(textGeometricTransform.getSkewX());
    }

    public final void i(String string) {
        this.parcel.writeString(string);
    }

    public final void j(long textUnit) {
        long jG = b0d.g(textUnit);
        d0d.Companion companion = d0d.INSTANCE;
        byte b = 0;
        if (!d0d.g(jG, companion.c())) {
            if (d0d.g(jG, companion.b())) {
                b = 1;
            } else if (d0d.g(jG, companion.a())) {
                b = 2;
            }
        }
        a(b);
        if (d0d.g(b0d.g(textUnit), companion.c())) {
            return;
        }
        b(b0d.h(textUnit));
    }

    public final void k(float baselineShift) {
        b(baselineShift);
    }

    public final void l(int fontSynthesis) {
        u.Companion companion = u.INSTANCE;
        byte b = 0;
        if (!u.h(fontSynthesis, companion.b())) {
            if (u.h(fontSynthesis, companion.a())) {
                b = 1;
            } else if (u.h(fontSynthesis, companion.d())) {
                b = 2;
            } else if (u.h(fontSynthesis, companion.c())) {
                b = 3;
            }
        }
        a(b);
    }

    public final void m(long color) {
        n(kqd.c(ej.b(color)));
    }

    public final void n(long uLong) {
        this.parcel.writeLong(uLong);
    }

    public final void o(int fontStyle) {
        t.Companion companion = t.INSTANCE;
        byte b = 0;
        if (!t.f(fontStyle, companion.b()) && t.f(fontStyle, companion.a())) {
            b = 1;
        }
        a(b);
    }

    public final String p() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void q() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }
}
