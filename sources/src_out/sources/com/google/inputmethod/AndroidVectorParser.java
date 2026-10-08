package com.google.inputmethod;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.google.android.zo, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J/\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020!¢\u0006\u0004\b\"\u0010#J%\u0010%\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001e¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J%\u0010,\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u001e¢\u0006\u0004\b,\u0010&J?\u0010.\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J7\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u0017\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020!2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010>\u001a\u0004\b:\u00106\"\u0004\b?\u0010\u000bR\u0014\u0010B\u001a\u00020@8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b%\u0010A¨\u0006C"}, d2 = {"Lcom/google/android/zo;", "", "Lorg/xmlpull/v1/XmlPullParser;", "xmlParser", "", "config", "<init>", "(Lorg/xmlpull/v1/XmlPullParser;I)V", "resConfig", "", "m", "(I)V", "Landroid/content/res/Resources;", "res", "Landroid/content/res/Resources$Theme;", "theme", "Landroid/util/AttributeSet;", "set", "", "attrs", "Landroid/content/res/TypedArray;", "l", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;", "typedArray", "", "attrName", "resId", "defaultValue", "i", "(Landroid/content/res/TypedArray;Ljava/lang/String;II)I", "", "h", "(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F", "", "e", "(Landroid/content/res/TypedArray;Ljava/lang/String;IZ)Z", "index", "c", "(Landroid/content/res/TypedArray;IF)F", "d", "(Landroid/content/res/TypedArray;II)I", "j", "(Landroid/content/res/TypedArray;I)Ljava/lang/String;", "defValue", "b", "Lcom/google/android/gm1;", "g", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Lcom/google/android/gm1;", "Landroid/content/res/ColorStateList;", "f", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Landroid/content/res/ColorStateList;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/xmlpull/v1/XmlPullParser;", "k", "()Lorg/xmlpull/v1/XmlPullParser;", "I", "setConfig", "Lcom/google/android/y39;", "Lcom/google/android/y39;", "pathParser", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AndroidVectorParser {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final XmlPullParser xmlParser;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final y39 pathParser;

    public AndroidVectorParser(XmlPullParser xmlPullParser, int i) {
        this.xmlParser = xmlPullParser;
        this.config = i;
        this.pathParser = new y39();
    }

    private final void m(int resConfig) {
        this.config = resConfig | this.config;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getConfig() {
        return this.config;
    }

    public final float b(TypedArray typedArray, int index, float defValue) {
        float dimension = typedArray.getDimension(index, defValue);
        m(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float c(TypedArray typedArray, int index, float defaultValue) {
        float f = typedArray.getFloat(index, defaultValue);
        m(typedArray.getChangingConfigurations());
        return f;
    }

    public final int d(TypedArray typedArray, int index, int defaultValue) {
        int i = typedArray.getInt(index, defaultValue);
        m(typedArray.getChangingConfigurations());
        return i;
    }

    public final boolean e(TypedArray typedArray, String attrName, int resId, boolean defaultValue) {
        boolean zE = fnd.e(typedArray, this.xmlParser, attrName, resId, defaultValue);
        m(typedArray.getChangingConfigurations());
        return zE;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) other;
        return Intrinsics.e(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config;
    }

    public final ColorStateList f(TypedArray typedArray, Resources.Theme theme, String attrName, int resId) {
        ColorStateList colorStateListG = fnd.g(typedArray, this.xmlParser, theme, attrName, resId);
        m(typedArray.getChangingConfigurations());
        return colorStateListG;
    }

    public final gm1 g(TypedArray typedArray, Resources.Theme theme, String attrName, int resId, int defaultValue) {
        gm1 gm1VarI = fnd.i(typedArray, this.xmlParser, theme, attrName, resId, defaultValue);
        m(typedArray.getChangingConfigurations());
        return gm1VarI;
    }

    public final float h(TypedArray typedArray, String attrName, int resId, float defaultValue) {
        float fJ = fnd.j(typedArray, this.xmlParser, attrName, resId, defaultValue);
        m(typedArray.getChangingConfigurations());
        return fJ;
    }

    public int hashCode() {
        return (this.xmlParser.hashCode() * 31) + Integer.hashCode(this.config);
    }

    public final int i(TypedArray typedArray, String attrName, int resId, int defaultValue) {
        int iK = fnd.k(typedArray, this.xmlParser, attrName, resId, defaultValue);
        m(typedArray.getChangingConfigurations());
        return iK;
    }

    public final String j(TypedArray typedArray, int index) {
        String string = typedArray.getString(index);
        m(typedArray.getChangingConfigurations());
        return string;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    public final TypedArray l(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        TypedArray typedArrayQ = fnd.q(res, theme, set, attrs);
        m(typedArrayQ.getChangingConfigurations());
        return typedArrayQ;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.xmlParser + ", config=" + this.config + ')';
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i2 & 2) != 0 ? 0 : i);
    }
}
