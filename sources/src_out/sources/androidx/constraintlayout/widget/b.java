package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import com.google.inputmethod.mx1;
import com.google.inputmethod.v0a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class b {
    private final ConstraintLayout a;
    c b;
    int c = -1;
    int d = -1;
    private SparseArray<a> e = new SparseArray<>();
    private SparseArray<c> f = new SparseArray<>();

    static class a {
        int a;
        ArrayList<C0069b> b = new ArrayList<>();
        int c;
        c d;

        a(Context context, XmlPullParser xmlPullParser) {
            this.c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), v0a.X8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == v0a.Y8) {
                    this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == v0a.Z8) {
                    this.c = typedArrayObtainStyledAttributes.getResourceId(index, this.c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    context.getResources().getResourceName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        c cVar = new c();
                        this.d = cVar;
                        cVar.n(context, this.c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(C0069b c0069b) {
            this.b.add(c0069b);
        }

        public int b(float f, float f2) {
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i).a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    static class C0069b {
        float a;
        float b;
        float c;
        float d;
        int e;
        c f;

        C0069b(Context context, XmlPullParser xmlPullParser) {
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), v0a.C9);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == v0a.D9) {
                    this.e = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                    context.getResources().getResourceName(this.e);
                    if ("layout".equals(resourceTypeName)) {
                        c cVar = new c();
                        this.f = cVar;
                        cVar.n(context, this.e);
                    }
                } else if (index == v0a.E9) {
                    this.d = typedArrayObtainStyledAttributes.getDimension(index, this.d);
                } else if (index == v0a.F9) {
                    this.b = typedArrayObtainStyledAttributes.getDimension(index, this.b);
                } else if (index == v0a.G9) {
                    this.c = typedArrayObtainStyledAttributes.getDimension(index, this.c);
                } else if (index == v0a.H9) {
                    this.a = typedArrayObtainStyledAttributes.getDimension(index, this.a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a(float f, float f2) {
            if (!Float.isNaN(this.a) && f < this.a) {
                return false;
            }
            if (!Float.isNaN(this.b) && f2 < this.b) {
                return false;
            }
            if (Float.isNaN(this.c) || f <= this.c) {
                return Float.isNaN(this.d) || f2 <= this.d;
            }
            return false;
        }
    }

    b(Context context, ConstraintLayout constraintLayout, int i) {
        this.a = constraintLayout;
        a(context, i);
    }

    private void a(Context context, int i) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                a aVar2 = new a(context, xml);
                                this.e.put(aVar2.a, aVar2);
                                aVar = aVar2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                C0069b c0069b = new C0069b(context, xml);
                                if (aVar != null) {
                                    aVar.a(c0069b);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        c cVar = new c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                cVar.F(context, xmlPullParser);
                this.f.put(identifier, cVar);
                return;
            }
        }
    }

    public void c(mx1 mx1Var) {
    }

    public void d(int i, float f, float f2) {
        int iB;
        int i2 = this.c;
        if (i2 != i) {
            this.c = i;
            a aVar = this.e.get(i);
            int iB2 = aVar.b(f, f2);
            c cVar = iB2 == -1 ? aVar.d : aVar.b.get(iB2).f;
            if (iB2 != -1) {
                int i3 = aVar.b.get(iB2).e;
            }
            if (cVar == null) {
                return;
            }
            this.d = iB2;
            cVar.i(this.a);
            return;
        }
        a aVarValueAt = i == -1 ? this.e.valueAt(0) : this.e.get(i2);
        int i4 = this.d;
        if ((i4 == -1 || !aVarValueAt.b.get(i4).a(f, f2)) && this.d != (iB = aVarValueAt.b(f, f2))) {
            c cVar2 = iB == -1 ? this.b : aVarValueAt.b.get(iB).f;
            if (iB != -1) {
                int i5 = aVarValueAt.b.get(iB).e;
            }
            if (cVar2 == null) {
                return;
            }
            this.d = iB;
            cVar2.i(this.a);
        }
    }
}
