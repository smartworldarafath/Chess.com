package com.google.inputmethod;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.b;
import com.google.android.sh7;
import com.google.android.zk1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0016H&¢\u0006\u0004\b\u001a\u0010\u001bR0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\bR\u0018\u0010#\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/google/android/nba;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/dz4;", "Lkotlin/Function1;", "Lcom/google/android/kn6;", "Lcom/google/android/gba;", "rect", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Rect;", "newRect", "", "q3", "(Landroid/graphics/Rect;)V", "layoutCoordinates", "m3", "(Lcom/google/android/kn6;Lcom/google/android/gba;)Landroid/graphics/Rect;", "coordinates", "D", "(Lcom/google/android/kn6;)V", "W2", "()V", "Lcom/google/android/r58;", "n3", "()Lcom/google/android/r58;", "rects", "s3", "(Lcom/google/android/r58;)V", "p", "Lkotlin/jvm/functions/Function1;", "o3", "()Lkotlin/jvm/functions/Function1;", "r3", "q", "Landroid/graphics/Rect;", "androidRect", "Landroid/view/View;", "p3", "()Landroid/view/View;", "view", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class nba extends b.c implements dz4 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function1<? super kn6, gba> rect;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private Rect androidRect;

    public nba(Function1<? super kn6, gba> function1) {
        this.rect = function1;
    }

    private final Rect m3(kn6 layoutCoordinates, gba rect) {
        kn6 kn6VarF = ln6.f(layoutCoordinates);
        long jQ = kn6VarF.Q(layoutCoordinates, rect.m());
        long jQ2 = kn6VarF.Q(layoutCoordinates, rect.n());
        long jQ3 = kn6VarF.Q(layoutCoordinates, rect.f());
        long jQ4 = kn6VarF.Q(layoutCoordinates, rect.g());
        int i = (int) (jQ >> 32);
        int i2 = (int) (jQ2 >> 32);
        int i3 = (int) (jQ3 >> 32);
        int i4 = (int) (jQ4 >> 32);
        int i5 = (int) (jQ & 4294967295L);
        int i6 = (int) (jQ2 & 4294967295L);
        int i7 = (int) (jQ3 & 4294967295L);
        int i8 = (int) (jQ4 & 4294967295L);
        return new Rect(sh7.d(zk1.n(Float.intBitsToFloat(i), new float[]{Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)})), sh7.d(zk1.n(Float.intBitsToFloat(i5), new float[]{Float.intBitsToFloat(i6), Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)})), sh7.d(zk1.k(Float.intBitsToFloat(i), new float[]{Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)})), sh7.d(zk1.k(Float.intBitsToFloat(i5), new float[]{Float.intBitsToFloat(i6), Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)})));
    }

    private final void q3(Rect newRect) {
        r58<Rect> r58VarN3 = n3();
        Rect rect = this.androidRect;
        if (rect != null) {
            r58VarN3.s(rect);
        }
        if (newRect != null && !newRect.isEmpty()) {
            r58VarN3.c(newRect);
        }
        s3(r58VarN3);
        this.androidRect = newRect;
    }

    @Override // com.google.inputmethod.dz4
    public void D(kn6 coordinates) {
        Rect rectM3;
        if (o3() == null) {
            gba gbaVarB = ln6.b(coordinates);
            rectM3 = new Rect(sh7.d(gbaVarB.getLeft()), sh7.d(gbaVarB.getTop()), sh7.d(gbaVarB.getRight()), sh7.d(gbaVarB.getBottom()));
        } else {
            Function1<kn6, gba> function1O3 = o3();
            Intrinsics.g(function1O3);
            rectM3 = m3(coordinates, (gba) function1O3.invoke(coordinates));
        }
        q3(rectM3);
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        super.W2();
        q3(null);
    }

    public abstract r58<Rect> n3();

    public Function1<kn6, gba> o3() {
        return this.rect;
    }

    protected final View p3() {
        return z23.a(this);
    }

    public void r3(Function1<? super kn6, gba> function1) {
        this.rect = function1;
    }

    public abstract void s3(r58<Rect> rects);
}
