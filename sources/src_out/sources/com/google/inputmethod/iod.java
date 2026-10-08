package com.google.inputmethod;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import androidx.emoji2.text.e;
import androidx.emoji2.text.m;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class iod extends zq3 {
    private static Paint g;
    private TextPaint f;

    public iod(m mVar) {
        super(mVar);
    }

    private TextPaint c(CharSequence charSequence, int i, int i2, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    if (!(characterStyle instanceof MetricAffectingSpan)) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    private static Paint e() {
        if (g == null) {
            TextPaint textPaint = new TextPaint();
            g = textPaint;
            textPaint.setColor(e.c().e());
            g.setStyle(Paint.Style.FILL);
        }
        return g;
    }

    void d(Canvas canvas, TextPaint textPaint, float f, float f2, float f3, float f4) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f, f3, f2, f4, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaintC = c(charSequence, i, i2, paint);
        if (textPaintC != null && textPaintC.bgColor != 0) {
            d(canvas, textPaintC, f, f + b(), i3, i5);
        }
        Paint paint2 = textPaintC;
        if (e.c().l()) {
            canvas.drawRect(f, i3, f + b(), i5, e());
        }
        m mVarA = a();
        float f2 = i4;
        if (paint2 == null) {
            paint2 = paint;
        }
        mVarA.a(canvas, f, f2, paint2);
    }
}
