package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.google.inputmethod.ax9;
import com.google.inputmethod.cy9;
import com.google.inputmethod.kx9;
import com.google.inputmethod.sj1;
import com.google.inputmethod.sx9;
import com.google.inputmethod.uv;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class j {
    private static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    private static j c;
    private b0 a;

    class a implements b0.c {
        private final int[] a = {cy9.R, cy9.P, cy9.a};
        private final int[] b = {cy9.o, cy9.B, cy9.t, cy9.p, cy9.q, cy9.s, cy9.r};
        private final int[] c = {cy9.O, cy9.Q, cy9.k, cy9.K, cy9.L, cy9.M, cy9.N};
        private final int[] d = {cy9.w, cy9.i, cy9.v};
        private final int[] e = {cy9.J, cy9.S};
        private final int[] f = {cy9.c, cy9.g, cy9.d, cy9.h};

        a() {
        }

        private boolean f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i) {
            int iC = g0.c(context, ax9.w);
            return new ColorStateList(new int[][]{g0.b, g0.e, g0.c, g0.i}, new int[]{g0.b(context, ax9.u), sj1.k(iC, i), sj1.k(iC, i), i});
        }

        private ColorStateList i(Context context) {
            return h(context, g0.c(context, ax9.t));
        }

        private ColorStateList j(Context context) {
            return h(context, g0.c(context, ax9.u));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListE = g0.e(context, ax9.A);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = g0.b;
                iArr2[0] = g0.b(context, ax9.A);
                iArr[1] = g0.f;
                iArr2[1] = g0.c(context, ax9.v);
                iArr[2] = g0.i;
                iArr2[2] = g0.c(context, ax9.A);
            } else {
                int[] iArr3 = g0.b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = g0.f;
                iArr2[1] = g0.c(context, ax9.v);
                iArr[2] = g0.i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(b0 b0Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableI = b0Var.i(context, cy9.F);
            Drawable drawableI2 = b0Var.i(context, cy9.G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = j.b;
            }
            drawableMutate.setColorFilter(j.e(i, mode));
        }

        @Override // androidx.appcompat.widget.b0.c
        public Drawable a(b0 b0Var, Context context, int i) {
            if (i == cy9.j) {
                return new LayerDrawable(new Drawable[]{b0Var.i(context, cy9.i), b0Var.i(context, cy9.k)});
            }
            if (i == cy9.y) {
                return l(b0Var, context, sx9.i);
            }
            if (i == cy9.x) {
                return l(b0Var, context, sx9.j);
            }
            if (i == cy9.z) {
                return l(b0Var, context, sx9.k);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.b0.c
        public ColorStateList b(Context context, int i) {
            if (i == cy9.m) {
                return uv.a(context, kx9.e);
            }
            if (i == cy9.I) {
                return uv.a(context, kx9.h);
            }
            if (i == cy9.H) {
                return k(context);
            }
            if (i == cy9.f) {
                return j(context);
            }
            if (i == cy9.b) {
                return g(context);
            }
            if (i == cy9.e) {
                return i(context);
            }
            if (i == cy9.D || i == cy9.E) {
                return uv.a(context, kx9.g);
            }
            if (f(this.b, i)) {
                return g0.e(context, ax9.x);
            }
            if (f(this.e, i)) {
                return uv.a(context, kx9.d);
            }
            if (f(this.f, i)) {
                return uv.a(context, kx9.c);
            }
            if (i == cy9.A) {
                return uv.a(context, kx9.f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.b0.c
        public PorterDuff.Mode c(int i) {
            if (i == cy9.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.b0.c
        public boolean d(Context context, int i, Drawable drawable) {
            if (i == cy9.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), g0.c(context, ax9.x), j.b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), g0.c(context, ax9.x), j.b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), g0.c(context, ax9.v), j.b);
                return true;
            }
            if (i != cy9.y && i != cy9.x && i != cy9.z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), g0.b(context, ax9.x), j.b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), g0.c(context, ax9.v), j.b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), g0.c(context, ax9.v), j.b);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0050  */
        /* JADX WARN: Code duplicated, block: B:25:0x0061  */
        /* JADX WARN: Code duplicated, block: B:27:0x0065 A[RETURN] */
        @Override // androidx.appcompat.widget.b0.c
        public boolean e(Context context, int i, Drawable drawable) {
            int i2;
            boolean z;
            int iRound;
            Drawable drawableMutate;
            PorterDuff.Mode mode = j.b;
            if (!f(this.a, i)) {
                if (f(this.c, i)) {
                    i2 = ax9.v;
                } else {
                    if (f(this.d, i)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else {
                        if (i == cy9.u) {
                            iRound = Math.round(40.8f);
                            i2 = 16842800;
                            mode = mode;
                        } else if (i != cy9.l) {
                            i2 = 0;
                            z = false;
                            iRound = -1;
                        }
                        z = true;
                    }
                    mode = mode;
                    iRound = -1;
                    i2 = 16842801;
                    z = true;
                }
                if (z) {
                    return false;
                }
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(j.e(g0.c(context, i2), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            i2 = ax9.x;
            z = true;
            iRound = -1;
            if (z) {
                return false;
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(j.e(g0.c(context, i2), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }
    }

    public static synchronized j b() {
        try {
            if (c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        return b0.k(i, mode);
    }

    public static synchronized void h() {
        if (c == null) {
            j jVar = new j();
            c = jVar;
            jVar.a = b0.g();
            c.a.t(new a());
        }
    }

    static void i(Drawable drawable, i0 i0Var, int[] iArr) {
        b0.v(drawable, i0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i) {
        return this.a.i(context, i);
    }

    synchronized Drawable d(Context context, int i, boolean z) {
        return this.a.j(context, i, z);
    }

    synchronized ColorStateList f(Context context, int i) {
        return this.a.l(context, i);
    }

    public synchronized void g(Context context) {
        this.a.r(context);
    }
}
