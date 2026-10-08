package com.google.inputmethod;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.b;
import androidx.compose.ui.graphics.h;
import com.google.android.oda;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u000f\u001a\u00020\n*\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0014\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0003H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001f\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u001eH\u0000¢\u0006\u0004\b\u001f\u0010\f\u001a\u0013\u0010 \u001a\u00020\u0011*\u00020\u0003H\u0000¢\u0006\u0004\b \u0010\u0013\u001a\u001b\u0010!\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0011H\u0000¢\u0006\u0004\b!\u0010\u0015\u001a\u0013\u0010#\u001a\u00020\"*\u00020\u0003H\u0000¢\u0006\u0004\b#\u0010$\u001a\u001b\u0010%\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\"H\u0000¢\u0006\u0004\b%\u0010\f\u001a\u0013\u0010'\u001a\u00020&*\u00020\u0003H\u0000¢\u0006\u0004\b'\u0010$\u001a\u001b\u0010(\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000e\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010\f\u001a\u0013\u0010)\u001a\u00020\u0011*\u00020\u0003H\u0000¢\u0006\u0004\b)\u0010\u0013\u001a\u001b\u0010*\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0011H\u0000¢\u0006\u0004\b*\u0010\u0015\u001a\u0013\u0010,\u001a\u00020+*\u00020\u0003H\u0000¢\u0006\u0004\b,\u0010$\u001a\u001b\u0010-\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000e\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010\f\u001a#\u00100\u001a\u00020\n*\u00020\u00032\u000e\u0010\u000e\u001a\n\u0018\u00010.j\u0004\u0018\u0001`/H\u0000¢\u0006\u0004\b0\u00101\u001a\u001d\u00103\u001a\u00020\n*\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\b3\u00104\"\u0015\u00107\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b5\u00106*8\b\u0007\u0010@\"\u00020\u00032\u00020\u0003B*\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u001c\b;\u0012\u0018\b\u000bB\u0014\b<\u0012\b\b=\u0012\u0004\b\b(>\u0012\u0006\b?\u0012\u0002\b\f¨\u0006A"}, d2 = {"Lcom/google/android/q09;", "a", "()Lcom/google/android/q09;", "Landroid/graphics/Paint;", "b", "(Landroid/graphics/Paint;)Lcom/google/android/q09;", "k", "()Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/e;", "mode", "", "n", "(Landroid/graphics/Paint;I)V", "Landroidx/compose/ui/graphics/h;", "value", "p", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/h;)V", "", "c", "(Landroid/graphics/Paint;)F", "l", "(Landroid/graphics/Paint;F)V", "", "m", "(Landroid/graphics/Paint;Z)V", "Lcom/google/android/ei1;", "d", "(Landroid/graphics/Paint;)J", "o", "(Landroid/graphics/Paint;J)V", "Lcom/google/android/w09;", "x", "j", "w", "Lcom/google/android/wbc;", "g", "(Landroid/graphics/Paint;)I", "t", "Lcom/google/android/ybc;", "h", "u", "i", "v", "Lcom/google/android/ca4;", "e", "q", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "s", "(Landroid/graphics/Paint;Landroid/graphics/Shader;)V", "Lcom/google/android/f39;", "r", "(Landroid/graphics/Paint;Lcom/google/android/f39;)V", "f", "(Lcom/google/android/q09;)Landroid/graphics/Paint;", "nativePaint", "Lcom/google/android/r43;", "message", "Use android.graphics.Paint directly instead", "replaceWith", "Lcom/google/android/kia;", "expression", "android.graphics.Paint", "imports", "NativePaint", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class dm {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final q09 a() {
        return new b();
    }

    public static final q09 b(Paint paint) {
        return new b(paint);
    }

    public static final float c(Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final long d(Paint paint) {
        return ki1.b(paint.getColor());
    }

    public static final int e(Paint paint) {
        return !paint.isFilterBitmap() ? ca4.INSTANCE.c() : ca4.INSTANCE.b();
    }

    public static final Paint f(q09 q09Var) {
        if (!(q09Var instanceof b)) {
            yw5.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + oda.b(q09Var.getClass()).c());
        }
        return ((b) q09Var).getInternalPaint();
    }

    public static final int g(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : a.$EnumSwitchMapping$1[strokeCap.ordinal()];
        if (i == 1) {
            return wbc.INSTANCE.a();
        }
        if (i != 2) {
            return i != 3 ? wbc.INSTANCE.a() : wbc.INSTANCE.c();
        }
        return wbc.INSTANCE.b();
    }

    public static final int h(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : a.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        if (i == 1) {
            return ybc.INSTANCE.b();
        }
        if (i != 2) {
            return i != 3 ? ybc.INSTANCE.b() : ybc.INSTANCE.c();
        }
        return ybc.INSTANCE.a();
    }

    public static final float i(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float j(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final Paint k() {
        return new Paint(7);
    }

    public static final void l(Paint paint, float f) {
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public static final void m(Paint paint, boolean z) {
        paint.setAntiAlias(z);
    }

    public static final void n(Paint paint, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            mne.a.a(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.a.b(i)));
        }
    }

    public static final void o(Paint paint, long j) {
        paint.setColor(ki1.j(j));
    }

    public static final void p(Paint paint, h hVar) {
        paint.setColorFilter(hVar != null ? cj.d(hVar) : null);
    }

    public static final void q(Paint paint, int i) {
        paint.setFilterBitmap(!ca4.e(i, ca4.INSTANCE.c()));
    }

    public static final void r(Paint paint, f39 f39Var) {
        lm lmVar = (lm) f39Var;
        paint.setPathEffect(lmVar != null ? lmVar.getNativePathEffect() : null);
    }

    public static final void s(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void t(Paint paint, int i) {
        Paint.Cap cap;
        wbc.Companion companion = wbc.INSTANCE;
        if (wbc.e(i, companion.c())) {
            cap = Paint.Cap.SQUARE;
        } else if (wbc.e(i, companion.b())) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = wbc.e(i, companion.a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final void u(Paint paint, int i) {
        Paint.Join join;
        ybc.Companion companion = ybc.INSTANCE;
        if (ybc.e(i, companion.b())) {
            join = Paint.Join.MITER;
        } else if (ybc.e(i, companion.a())) {
            join = Paint.Join.BEVEL;
        } else {
            join = ybc.e(i, companion.c()) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void v(Paint paint, float f) {
        paint.setStrokeMiter(f);
    }

    public static final void w(Paint paint, float f) {
        paint.setStrokeWidth(f);
    }

    public static final void x(Paint paint, int i) {
        paint.setStyle(w09.d(i, w09.INSTANCE.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
