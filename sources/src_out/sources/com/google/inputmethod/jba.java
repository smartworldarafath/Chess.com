package com.google.inputmethod;

import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.r43;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u0001*\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u000b*\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/android/gba;", "Landroid/graphics/Rect;", "b", "(Lcom/google/android/gba;)Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "c", "(Lcom/google/android/gba;)Landroid/graphics/RectF;", "e", "(Landroid/graphics/Rect;)Lcom/google/android/gba;", "f", "(Landroid/graphics/RectF;)Lcom/google/android/gba;", "Lcom/google/android/k16;", "a", "(Lcom/google/android/k16;)Landroid/graphics/Rect;", "d", "(Landroid/graphics/Rect;)Lcom/google/android/k16;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class jba {
    public static final Rect a(k16 k16Var) {
        return new Rect(k16Var.getLeft(), k16Var.getTop(), k16Var.getRight(), k16Var.getBottom());
    }

    @r43
    public static final Rect b(gba gbaVar) {
        return new Rect((int) gbaVar.getLeft(), (int) gbaVar.getTop(), (int) gbaVar.getRight(), (int) gbaVar.getBottom());
    }

    public static final RectF c(gba gbaVar) {
        return new RectF(gbaVar.getLeft(), gbaVar.getTop(), gbaVar.getRight(), gbaVar.getBottom());
    }

    public static final k16 d(Rect rect) {
        return new k16(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final gba e(Rect rect) {
        return new gba(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final gba f(RectF rectF) {
        return new gba(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
