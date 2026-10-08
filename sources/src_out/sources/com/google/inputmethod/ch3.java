package com.google.inputmethod;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.graphics.drawscope.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/android/ch3;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroidx/compose/ui/graphics/drawscope/b;", "drawStyle", "<init>", "(Landroidx/compose/ui/graphics/drawscope/b;)V", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "Landroidx/compose/ui/graphics/drawscope/b;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/b;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ch3 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final b drawStyle;

    public ch3(b bVar) {
        this.drawStyle = bVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) throws NoWhenBranchMatchedException {
        if (textPaint != null) {
            b bVar = this.drawStyle;
            if (Intrinsics.e(bVar, c.b)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(bVar instanceof Stroke)) {
                throw new NoWhenBranchMatchedException();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(((Stroke) this.drawStyle).getWidth());
            textPaint.setStrokeMiter(((Stroke) this.drawStyle).getMiter());
            textPaint.setStrokeJoin(dh3.b(((Stroke) this.drawStyle).getJoin()));
            textPaint.setStrokeCap(dh3.a(((Stroke) this.drawStyle).getCap()));
            f39 pathEffect = ((Stroke) this.drawStyle).getPathEffect();
            textPaint.setPathEffect(pathEffect != null ? mm.c(pathEffect) : null);
        }
    }
}
