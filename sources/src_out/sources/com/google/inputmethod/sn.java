package com.google.inputmethod;

import android.graphics.BitmapShader;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import androidx.compose.ui.graphics.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001aI\u0010\u0010\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0012\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0018\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001d\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001f\u0010 \u001a7\u0010#\u001a\u0004\u0018\u00010\"2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001d\u001a\u00020\u001aH\u0001¢\u0006\u0004\b#\u0010$\u001a-\u0010&\u001a\u00020%2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002¢\u0006\u0004\b&\u0010'\u001a3\u0010,\u001a\u00060\nj\u0002`\u000b2\n\u0010(\u001a\u00060\nj\u0002`\u000b2\n\u0010)\u001a\u00060\nj\u0002`\u000b2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-*\n\u0010.\"\u00020\n2\u00020\n¨\u0006/"}, d2 = {"Lcom/google/android/rn8;", "from", "to", "", "Lcom/google/android/ei1;", "colors", "", "colorStops", "Lcom/google/android/i5d;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "center", "radius", "d", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "e", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "Lcom/google/android/ml5;", "image", "tileModeX", "tileModeY", "b", "(Lcom/google/android/ml5;II)Landroid/graphics/Shader;", "", "f", "(Ljava/util/List;)I", "numTransparentColors", "", "g", "(Ljava/util/List;I)[I", "stops", "", "h", "(Ljava/util/List;Ljava/util/List;I)[F", "", "i", "(Ljava/util/List;Ljava/util/List;)V", "dst", "src", "Landroidx/compose/ui/graphics/e;", "blendMode", "a", "(Landroid/graphics/Shader;Landroid/graphics/Shader;I)Landroid/graphics/Shader;", "Shader", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class sn {
    public static final Shader a(Shader shader, Shader shader2, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            return new ComposeShader(shader, shader2, a.b(i));
        }
        rn.a();
        return qn.a(shader, shader2, a.a(i));
    }

    public static final Shader b(ml5 ml5Var, int i, int i2) {
        return new BitmapShader(cl.b(ml5Var), so.a(i), so.a(i2));
    }

    public static final Shader c(long j, long j2, List<ei1> list, List<Float> list2, int i) {
        i(list, list2);
        int iF = f(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), g(list, iF), h(list2, list, iF), so.a(i));
    }

    public static final Shader d(long j, float f, List<ei1> list, List<Float> list2, int i) {
        i(list, list2);
        int iF = f(list);
        return new RadialGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, g(list, iF), h(list2, list, iF), so.a(i));
    }

    public static final Shader e(long j, List<ei1> list, List<Float> list2) {
        i(list, list2);
        int iF = f(list);
        return new SweepGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), g(list, iF), h(list2, list, iF));
    }

    public static final int f(List<ei1> list) {
        return 0;
    }

    public static final int[] g(List<ei1> list, int i) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ki1.j(list.get(i2).getValue());
        }
        return iArr;
    }

    public static final float[] h(List<Float> list, List<ei1> list2, int i) {
        if (i == 0) {
            if (list != null) {
                return m.v1(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int iR = m.r(list2);
        int i2 = 1;
        for (int i3 = 1; i3 < iR; i3++) {
            long value = list2.get(i3).getValue();
            float fFloatValue = list != null ? list.get(i3).floatValue() : i3 / m.r(list2);
            int i4 = i2 + 1;
            fArr[i2] = fFloatValue;
            if (ei1.s(value) == 0.0f) {
                i2 += 2;
                fArr[i4] = fFloatValue;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = list != null ? list.get(m.r(list2)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void i(List<ei1> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
