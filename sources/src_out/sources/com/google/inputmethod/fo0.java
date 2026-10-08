package com.google.inputmethod;

import androidx.compose.ui.graphics.painter.BitmapPainter;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/ml5;", "image", "Lcom/google/android/g16;", "srcOffset", "Lcom/google/android/q16;", "srcSize", "Lcom/google/android/ca4;", "filterQuality", "Landroidx/compose/ui/graphics/painter/a;", "a", "(Lcom/google/android/ml5;JJI)Landroidx/compose/ui/graphics/painter/a;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class fo0 {
    public static final BitmapPainter a(ml5 ml5Var, long j, long j2, int i) {
        BitmapPainter bitmapPainter = new BitmapPainter(ml5Var, j, j2, null);
        bitmapPainter.o(i);
        return bitmapPainter;
    }

    public static /* synthetic */ BitmapPainter b(ml5 ml5Var, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = g16.INSTANCE.b();
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = q16.c((((long) ml5Var.getHeight()) & 4294967295L) | (((long) ml5Var.getWidth()) << 32));
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            i = ca4.INSTANCE.b();
        }
        return a(ml5Var, j3, j4, i);
    }
}
