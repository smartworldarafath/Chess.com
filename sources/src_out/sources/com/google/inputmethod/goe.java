package com.google.inputmethod;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.graphics.p;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aC\u0010\u0016\u001a\u00020\u0000*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\b*\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a1\u0010\u001a\u001a\u00020\u0013*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a9\u0010\u001d\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#\u001a9\u0010$\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b$\u0010\u001e\u001a9\u0010%\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b%\u0010\u001e\"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010&¨\u0006("}, d2 = {"", "id", "Lcom/google/android/wbc;", "defValue", "b", "(II)I", "Lcom/google/android/ybc;", "c", "Lorg/xmlpull/v1/XmlPullParser;", "", "d", "(Lorg/xmlpull/v1/XmlPullParser;)Z", "Lcom/google/android/zo;", "Landroid/content/res/Resources;", "res", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "Lcom/google/android/pp5$a;", "builder", "nestedGroups", "g", "(Lcom/google/android/zo;Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lcom/google/android/pp5$a;I)I", "j", "(Lorg/xmlpull/v1/XmlPullParser;)Lorg/xmlpull/v1/XmlPullParser;", "a", "(Lcom/google/android/zo;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)Lcom/google/android/pp5$a;", "", "i", "(Lcom/google/android/zo;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Lcom/google/android/pp5$a;)V", "Lcom/google/android/gm1;", "complexColor", "Lcom/google/android/qu0;", "e", "(Lcom/google/android/gm1;)Lcom/google/android/qu0;", "f", "h", "I", "FILL_TYPE_WINDING", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class goe {
    private static final int a = 0;

    public static final pp5.a a(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) throws XmlPullParserException {
        long jI;
        int iZ;
        ColorStateList colorStateListF;
        ap apVar = ap.a;
        TypedArray typedArrayL = androidVectorParser.l(resources, theme, attributeSet, apVar.F());
        boolean zE = androidVectorParser.e(typedArrayL, "autoMirrored", apVar.a(), false);
        float fH = androidVectorParser.h(typedArrayL, "viewportWidth", apVar.H(), 0.0f);
        float fH2 = androidVectorParser.h(typedArrayL, "viewportHeight", apVar.G(), 0.0f);
        if (fH <= 0.0f) {
            throw new XmlPullParserException(typedArrayL.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (fH2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayL.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float fB = androidVectorParser.b(typedArrayL, apVar.I(), 0.0f);
        float fB2 = androidVectorParser.b(typedArrayL, apVar.n(), 0.0f);
        if (typedArrayL.hasValue(apVar.D())) {
            TypedValue typedValue = new TypedValue();
            typedArrayL.getValue(apVar.D(), typedValue);
            jI = (typedValue.type == 2 || (colorStateListF = androidVectorParser.f(typedArrayL, theme, "tint", apVar.D())) == null) ? ei1.INSTANCE.i() : ki1.b(colorStateListF.getDefaultColor());
        } else {
            jI = ei1.INSTANCE.i();
        }
        long j = jI;
        int iD = androidVectorParser.d(typedArrayL, apVar.E(), -1);
        if (iD == -1) {
            iZ = e.INSTANCE.z();
        } else if (iD == 3) {
            iZ = e.INSTANCE.B();
        } else if (iD == 5) {
            iZ = e.INSTANCE.z();
        } else if (iD != 9) {
            switch (iD) {
                case 14:
                    iZ = e.INSTANCE.q();
                    break;
                case 15:
                    iZ = e.INSTANCE.v();
                    break;
                case 16:
                    iZ = e.INSTANCE.t();
                    break;
                default:
                    iZ = e.INSTANCE.z();
                    break;
            }
        } else {
            iZ = e.INSTANCE.y();
        }
        int i = iZ;
        float fI = ff3.i(fB / resources.getDisplayMetrics().density);
        float fI2 = ff3.i(fB2 / resources.getDisplayMetrics().density);
        typedArrayL.recycle();
        return new pp5.a(null, fI, fI2, fH, fH2, j, i, zE, 1, null);
    }

    private static final int b(int i, int i2) {
        if (i == 0) {
            return wbc.INSTANCE.a();
        }
        if (i != 1) {
            return i != 2 ? i2 : wbc.INSTANCE.c();
        }
        return wbc.INSTANCE.b();
    }

    private static final int c(int i, int i2) {
        if (i == 0) {
            return ybc.INSTANCE.b();
        }
        if (i != 1) {
            return i != 2 ? i2 : ybc.INSTANCE.a();
        }
        return ybc.INSTANCE.c();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1 || (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3);
    }

    private static final qu0 e(gm1 gm1Var) {
        if (!gm1Var.l()) {
            return null;
        }
        Shader shaderF = gm1Var.f();
        return shaderF != null ? ru0.a(shaderF) : new SolidColor(ki1.b(gm1Var.e()), null);
    }

    public static final void f(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, pp5.a aVar) {
        ap apVar = ap.a;
        TypedArray typedArrayL = androidVectorParser.l(resources, theme, attributeSet, apVar.b());
        String strJ = androidVectorParser.j(typedArrayL, apVar.c());
        if (strJ == null) {
            strJ = "";
        }
        String str = strJ;
        String strJ2 = androidVectorParser.j(typedArrayL, apVar.d());
        List listE = strJ2 == null ? a3e.e() : y39.c(androidVectorParser.pathParser, strJ2, null, 2, null);
        typedArrayL.recycle();
        pp5.a.b(aVar, str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, listE, 254, null);
    }

    public static final int g(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, pp5.a aVar, int i) throws XmlPullParserException {
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !Intrinsics.e("group", androidVectorParser.getXmlParser().getName())) {
                return i;
            }
            int i2 = i + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                aVar.g();
            }
            return 0;
        }
        String name = androidVectorParser.getXmlParser().getName();
        if (name == null) {
            return i;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals("clip-path")) {
                return i;
            }
            f(androidVectorParser, resources, theme, attributeSet, aVar);
            return i + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals("path")) {
                return i;
            }
            i(androidVectorParser, resources, theme, attributeSet, aVar);
            return i;
        }
        if (iHashCode != 98629247 || !name.equals("group")) {
            return i;
        }
        h(androidVectorParser, resources, theme, attributeSet, aVar);
        return i;
    }

    public static final void h(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, pp5.a aVar) {
        ap apVar = ap.a;
        TypedArray typedArrayL = androidVectorParser.l(resources, theme, attributeSet, apVar.e());
        float fH = androidVectorParser.h(typedArrayL, "rotation", apVar.i(), 0.0f);
        float fC = androidVectorParser.c(typedArrayL, apVar.g(), 0.0f);
        float fC2 = androidVectorParser.c(typedArrayL, apVar.h(), 0.0f);
        float fH2 = androidVectorParser.h(typedArrayL, "scaleX", apVar.j(), 1.0f);
        float fH3 = androidVectorParser.h(typedArrayL, "scaleY", apVar.k(), 1.0f);
        float fH4 = androidVectorParser.h(typedArrayL, "translateX", apVar.l(), 0.0f);
        float fH5 = androidVectorParser.h(typedArrayL, "translateY", apVar.m(), 0.0f);
        String strJ = androidVectorParser.j(typedArrayL, apVar.f());
        if (strJ == null) {
            strJ = "";
        }
        typedArrayL.recycle();
        aVar.a(strJ, fH, fC, fC2, fH2, fH3, fH4, fH5, a3e.e());
    }

    public static final void i(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, pp5.a aVar) throws IllegalArgumentException {
        ap apVar = ap.a;
        TypedArray typedArrayL = androidVectorParser.l(resources, theme, attributeSet, apVar.o());
        if (!fnd.p(androidVectorParser.getXmlParser(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String strJ = androidVectorParser.j(typedArrayL, apVar.r());
        if (strJ == null) {
            strJ = "";
        }
        String str = strJ;
        String strJ2 = androidVectorParser.j(typedArrayL, apVar.s());
        List<? extends u39> listE = strJ2 == null ? a3e.e() : y39.c(androidVectorParser.pathParser, strJ2, null, 2, null);
        gm1 gm1VarG = androidVectorParser.g(typedArrayL, theme, "fillColor", apVar.q(), 0);
        float fH = androidVectorParser.h(typedArrayL, "fillAlpha", apVar.p(), 1.0f);
        int iB = b(androidVectorParser.i(typedArrayL, "strokeLineCap", apVar.v(), -1), wbc.INSTANCE.a());
        int iC = c(androidVectorParser.i(typedArrayL, "strokeLineJoin", apVar.w(), -1), ybc.INSTANCE.b());
        float fH2 = androidVectorParser.h(typedArrayL, "strokeMiterLimit", apVar.x(), 4.0f);
        gm1 gm1VarG2 = androidVectorParser.g(typedArrayL, theme, "strokeColor", apVar.u(), 0);
        float fH3 = androidVectorParser.h(typedArrayL, "strokeAlpha", apVar.t(), 1.0f);
        float fH4 = androidVectorParser.h(typedArrayL, "strokeWidth", apVar.y(), 1.0f);
        float fH5 = androidVectorParser.h(typedArrayL, "trimPathEnd", apVar.z(), 1.0f);
        float fH6 = androidVectorParser.h(typedArrayL, "trimPathOffset", apVar.B(), 0.0f);
        float fH7 = androidVectorParser.h(typedArrayL, "trimPathStart", apVar.C(), 0.0f);
        int i = androidVectorParser.i(typedArrayL, "fillType", apVar.A(), a);
        typedArrayL.recycle();
        aVar.c(listE, i == 0 ? p.INSTANCE.b() : p.INSTANCE.a(), str, e(gm1VarG), fH, e(gm1VarG2), fH3, fH4, iB, iC, fH2, fH7, fH5, fH6);
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
