package com.google.inputmethod;

import android.graphics.Paint;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/ybc;", "Landroid/graphics/Paint$Join;", "b", "(I)Landroid/graphics/Paint$Join;", "Lcom/google/android/wbc;", "Landroid/graphics/Paint$Cap;", "a", "(I)Landroid/graphics/Paint$Cap;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class dh3 {
    public static final Paint.Cap a(int i) {
        wbc.Companion companion = wbc.INSTANCE;
        if (wbc.e(i, companion.a())) {
            return Paint.Cap.BUTT;
        }
        if (wbc.e(i, companion.b())) {
            return Paint.Cap.ROUND;
        }
        return wbc.e(i, companion.c()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    public static final Paint.Join b(int i) {
        ybc.Companion companion = ybc.INSTANCE;
        if (ybc.e(i, companion.b())) {
            return Paint.Join.MITER;
        }
        if (ybc.e(i, companion.c())) {
            return Paint.Join.ROUND;
        }
        return ybc.e(i, companion.a()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
