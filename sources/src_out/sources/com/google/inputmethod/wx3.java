package com.google.inputmethod;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/android/wx3;", "Lcom/google/android/nba;", "Lkotlin/Function1;", "Lcom/google/android/kn6;", "Lcom/google/android/gba;", "rect", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/r58;", "Landroid/graphics/Rect;", "n3", "()Lcom/google/android/r58;", "rects", "", "s3", "(Lcom/google/android/r58;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class wx3 extends nba {
    public wx3(Function1<? super kn6, gba> function1) {
        super(function1);
    }

    @Override // com.google.inputmethod.nba
    public r58<Rect> n3() {
        r58<Rect> r58Var = new r58<>(new Rect[16], 0);
        r58Var.f(r58Var.getSize(), p3().getSystemGestureExclusionRects());
        return r58Var;
    }

    @Override // com.google.inputmethod.nba
    public void s3(r58<Rect> rects) {
        p3().setSystemGestureExclusionRects(rects.i());
    }
}
