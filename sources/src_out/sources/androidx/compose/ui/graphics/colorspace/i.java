package androidx.compose.ui.graphics.colorspace;

import com.google.inputmethod.gl5;
import com.google.inputmethod.ki1;
import com.google.inputmethod.rh7;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/colorspace/i;", "Landroidx/compose/ui/graphics/colorspace/c;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "f", "(I)F", "e", "", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Lcom/google/android/ei1;", "n", "(FFFFLandroidx/compose/ui/graphics/colorspace/c;)J", "b", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends c {
    private static final float[] f;
    private static final float[] g;
    private static final float[] h;
    private static final float[] i;

    static {
        float[] transform = a.INSTANCE.a().getTransform();
        gl5 gl5Var = gl5.a;
        float[] fArrL = d.l(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.e(transform, gl5Var.b().c(), gl5Var.e().c()));
        f = fArrL;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        g = fArr;
        h = d.k(fArrL);
        i = d.k(fArr);
    }

    public i(String str, int i2) {
        super(str, b.INSTANCE.a(), i2, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float[] b(float[] v) {
        d.n(f, v);
        v[0] = rh7.a(v[0]);
        v[1] = rh7.a(v[1]);
        v[2] = rh7.a(v[2]);
        d.n(g, v);
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float e(int component) {
        return component == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float f(int component) {
        return component == 0 ? 0.0f : -0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long j(float v0, float v1, float v2) {
        if (v0 < 0.0f) {
            v0 = 0.0f;
        }
        if (v0 > 1.0f) {
            v0 = 1.0f;
        }
        if (v1 < -0.5f) {
            v1 = -0.5f;
        }
        if (v1 > 0.5f) {
            v1 = 0.5f;
        }
        if (v2 < -0.5f) {
            v2 = -0.5f;
        }
        float f2 = v2 <= 0.5f ? v2 : 0.5f;
        float[] fArr = i;
        float f3 = (fArr[0] * v0) + (fArr[3] * v1) + (fArr[6] * f2);
        float f4 = (fArr[1] * v0) + (fArr[4] * v1) + (fArr[7] * f2);
        float f5 = (fArr[2] * v0) + (fArr[5] * v1) + (fArr[8] * f2);
        float f6 = f3 * f3 * f3;
        float f7 = f4 * f4 * f4;
        float f8 = f5 * f5 * f5;
        float[] fArr2 = h;
        return (((long) Float.floatToRawIntBits(((fArr2[0] * f6) + (fArr2[3] * f7)) + (fArr2[6] * f8))) << 32) | (((long) Float.floatToRawIntBits((fArr2[1] * f6) + (fArr2[4] * f7) + (fArr2[7] * f8))) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float[] l(float[] v) {
        float f2 = v[0];
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        v[0] = f2;
        float f3 = v[1];
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        v[1] = f3;
        float f4 = v[2];
        float f5 = f4 >= -0.5f ? f4 : -0.5f;
        v[2] = f5 <= 0.5f ? f5 : 0.5f;
        d.n(i, v);
        float f6 = v[0];
        v[0] = f6 * f6 * f6;
        float f7 = v[1];
        v[1] = f7 * f7 * f7;
        float f8 = v[2];
        v[2] = f8 * f8 * f8;
        d.n(h, v);
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float m(float v0, float v1, float v2) {
        if (v0 < 0.0f) {
            v0 = 0.0f;
        }
        if (v0 > 1.0f) {
            v0 = 1.0f;
        }
        if (v1 < -0.5f) {
            v1 = -0.5f;
        }
        if (v1 > 0.5f) {
            v1 = 0.5f;
        }
        if (v2 < -0.5f) {
            v2 = -0.5f;
        }
        float f2 = v2 <= 0.5f ? v2 : 0.5f;
        float[] fArr = i;
        float f3 = (fArr[0] * v0) + (fArr[3] * v1) + (fArr[6] * f2);
        float f4 = (fArr[1] * v0) + (fArr[4] * v1) + (fArr[7] * f2);
        float f5 = (fArr[2] * v0) + (fArr[5] * v1) + (fArr[8] * f2);
        float f6 = f3 * f3 * f3;
        float f7 = f4 * f4 * f4;
        float[] fArr2 = h;
        return (fArr2[2] * f6) + (fArr2[5] * f7) + (fArr2[8] * f5 * f5 * f5);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long n(float x, float y, float z, float a, c colorSpace) {
        float[] fArr = f;
        float f2 = (fArr[0] * x) + (fArr[3] * y) + (fArr[6] * z);
        float f3 = (fArr[1] * x) + (fArr[4] * y) + (fArr[7] * z);
        float f4 = (fArr[2] * x) + (fArr[5] * y) + (fArr[8] * z);
        float fA = rh7.a(f2);
        float fA2 = rh7.a(f3);
        float fA3 = rh7.a(f4);
        float[] fArr2 = g;
        return ki1.a((fArr2[0] * fA) + (fArr2[3] * fA2) + (fArr2[6] * fA3), (fArr2[1] * fA) + (fArr2[4] * fA2) + (fArr2[7] * fA3), (fArr2[2] * fA) + (fArr2[5] * fA2) + (fArr2[8] * fA3), a, colorSpace);
    }
}
