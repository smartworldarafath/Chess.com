package com.google.inputmethod;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class rz4 {
    private static a a(a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        return z ? new a(i, i3, i2) : new a(i, i2);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayQ = fnd.q(resources, theme, attributeSet, x0a.F);
        float fJ = fnd.j(typedArrayQ, xmlPullParser, "startX", x0a.O, 0.0f);
        float fJ2 = fnd.j(typedArrayQ, xmlPullParser, "startY", x0a.P, 0.0f);
        float fJ3 = fnd.j(typedArrayQ, xmlPullParser, "endX", x0a.Q, 0.0f);
        float fJ4 = fnd.j(typedArrayQ, xmlPullParser, "endY", x0a.R, 0.0f);
        float fJ5 = fnd.j(typedArrayQ, xmlPullParser, "centerX", x0a.J, 0.0f);
        float fJ6 = fnd.j(typedArrayQ, xmlPullParser, "centerY", x0a.K, 0.0f);
        int iK = fnd.k(typedArrayQ, xmlPullParser, "type", x0a.I, 0);
        int iF = fnd.f(typedArrayQ, xmlPullParser, "startColor", x0a.G, 0);
        boolean zP = fnd.p(xmlPullParser, "centerColor");
        int iF2 = fnd.f(typedArrayQ, xmlPullParser, "centerColor", x0a.N, 0);
        int iF3 = fnd.f(typedArrayQ, xmlPullParser, "endColor", x0a.H, 0);
        int iK2 = fnd.k(typedArrayQ, xmlPullParser, "tileMode", x0a.M, 0);
        float fJ7 = fnd.j(typedArrayQ, xmlPullParser, "gradientRadius", x0a.L, 0.0f);
        typedArrayQ.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iF, iF3, zP, iF2);
        if (iK != 1) {
            return iK != 2 ? new LinearGradient(fJ, fJ2, fJ3, fJ4, aVarA.a, aVarA.b, d(iK2)) : new SweepGradient(fJ5, fJ6, aVarA.a, aVarA.b);
        }
        if (fJ7 > 0.0f) {
            return new RadialGradient(fJ5, fJ6, fJ7, aVarA.a, aVarA.b, d(iK2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    private static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayQ = fnd.q(resources, theme, attributeSet, x0a.S);
                boolean zHasValue = typedArrayQ.hasValue(x0a.T);
                boolean zHasValue2 = typedArrayQ.hasValue(x0a.U);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayQ.getColor(x0a.T, 0);
                float f = typedArrayQ.getFloat(x0a.U, 0.0f);
                typedArrayQ.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    private static Shader.TileMode d(int i) {
        if (i != 1) {
            return i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    static final class a {
        final int[] a;
        final float[] b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i = 0; i < size; i++) {
                this.a[i] = list.get(i).intValue();
                this.b[i] = list2.get(i).floatValue();
            }
        }

        a(int i, int i2) {
            this.a = new int[]{i, i2};
            this.b = new float[]{0.0f, 1.0f};
        }

        a(int i, int i2, int i3) {
            this.a = new int[]{i, i2, i3};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
