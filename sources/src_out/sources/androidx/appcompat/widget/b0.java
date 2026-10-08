package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.y2e;
import com.google.inputmethod.dd7;
import com.google.inputmethod.e0c;
import com.google.inputmethod.ha7;
import com.google.inputmethod.hh3;
import com.google.inputmethod.qpb;
import com.google.inputmethod.s02;
import com.google.inputmethod.tx9;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class b0 {
    private static b0 i;
    private WeakHashMap<Context, e0c<ColorStateList>> a;
    private qpb<String, b> b;
    private e0c<String> c;
    private final WeakHashMap<Context, ha7<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    private TypedValue e;
    private boolean f;
    private c g;
    private static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    private static final a j = new a(6);

    private static class a extends dd7<Integer, PorterDuffColorFilter> {
        public a(int i) {
            super(i);
        }

        private static int m(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter n(int i, PorterDuff.Mode mode) {
            return d(Integer.valueOf(m(i, mode)));
        }

        PorterDuffColorFilter o(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return f(Integer.valueOf(m(i, mode)), porterDuffColorFilter);
        }
    }

    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        Drawable a(b0 b0Var, Context context, int i);

        ColorStateList b(Context context, int i);

        PorterDuff.Mode c(int i);

        boolean d(Context context, int i, Drawable drawable);

        boolean e(Context context, int i, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            ha7<WeakReference<Drawable.ConstantState>> ha7Var = this.d.get(context);
            if (ha7Var == null) {
                ha7Var = new ha7<>();
                this.d.put(context, ha7Var);
            }
            ha7Var.h(j2, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void b(Context context, int i2, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap<>();
        }
        e0c<ColorStateList> e0cVar = this.a.get(context);
        if (e0cVar == null) {
            e0cVar = new e0c<>();
            this.a.put(context, e0cVar);
        }
        e0cVar.a(i2, colorStateList);
    }

    private void c(Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        Drawable drawableI = i(context, tx9.a);
        if (drawableI == null || !p(drawableI)) {
            this.f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable e(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.g;
        Drawable drawableA = cVar == null ? null : cVar.a(this, context, i2);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableA);
        }
        return drawableA;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized b0 g() {
        try {
            if (i == null) {
                b0 b0Var = new b0();
                i = b0Var;
                o(b0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    private synchronized Drawable h(Context context, long j2) {
        ha7<WeakReference<Drawable.ConstantState>> ha7Var = this.d.get(context);
        if (ha7Var == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceD = ha7Var.d(j2);
        if (weakReferenceD != null) {
            Drawable.ConstantState constantState = weakReferenceD.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            ha7Var.i(j2);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter k(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterN;
        a aVar = j;
        porterDuffColorFilterN = aVar.n(i2, mode);
        if (porterDuffColorFilterN == null) {
            porterDuffColorFilterN = new PorterDuffColorFilter(i2, mode);
            aVar.o(i2, mode, porterDuffColorFilterN);
        }
        return porterDuffColorFilterN;
    }

    private ColorStateList m(Context context, int i2) {
        e0c<ColorStateList> e0cVar;
        WeakHashMap<Context, e0c<ColorStateList>> weakHashMap = this.a;
        if (weakHashMap == null || (e0cVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return e0cVar.e(i2);
    }

    private static void o(b0 b0Var) {
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof y2e) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable q(Context context, int i2) {
        int next;
        qpb<String, b> qpbVar = this.b;
        if (qpbVar == null || qpbVar.isEmpty()) {
            return null;
        }
        e0c<String> e0cVar = this.c;
        if (e0cVar != null) {
            String strE = e0cVar.e(i2);
            if ("appcompat_skip_skip".equals(strE) || (strE != null && this.b.get(strE) == null)) {
                return null;
            }
        } else {
            this.c = new e0c<>();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.c.a(i2, name);
                b bVar = this.b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception unused) {
            }
        }
        if (drawableH == null) {
            this.c.a(i2, "appcompat_skip_skip");
        }
        return drawableH;
    }

    private Drawable u(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i2);
        if (colorStateListL != null) {
            Drawable drawableR = hh3.r(drawable.mutate());
            hh3.o(drawableR, colorStateListL);
            PorterDuff.Mode modeN = n(i2);
            if (modeN != null) {
                hh3.p(drawableR, modeN);
            }
            return drawableR;
        }
        c cVar = this.g;
        if ((cVar == null || !cVar.d(context, i2, drawable)) && !w(context, i2, drawable) && z) {
            return null;
        }
        return drawable;
    }

    static void v(Drawable drawable, i0 i0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = i0Var.d;
            if (z || i0Var.c) {
                drawable.setColorFilter(f(z ? i0Var.a : null, i0Var.c ? i0Var.b : h, iArr));
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    public synchronized Drawable i(Context context, int i2) {
        return j(context, i2, false);
    }

    synchronized Drawable j(Context context, int i2, boolean z) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i2);
            if (drawableQ == null) {
                drawableQ = e(context, i2);
            }
            if (drawableQ == null) {
                drawableQ = s02.f(context, i2);
            }
            if (drawableQ != null) {
                drawableQ = u(context, i2, z, drawableQ);
            }
            if (drawableQ != null) {
                z.b(drawableQ);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableQ;
    }

    synchronized ColorStateList l(Context context, int i2) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i2);
        if (colorStateListM == null) {
            c cVar = this.g;
            colorStateListM = cVar == null ? null : cVar.b(context, i2);
            if (colorStateListM != null) {
                b(context, i2, colorStateListM);
            }
        }
        return colorStateListM;
    }

    PorterDuff.Mode n(int i2) {
        c cVar = this.g;
        if (cVar == null) {
            return null;
        }
        return cVar.c(i2);
    }

    public synchronized void r(Context context) {
        ha7<WeakReference<Drawable.ConstantState>> ha7Var = this.d.get(context);
        if (ha7Var != null) {
            ha7Var.a();
        }
    }

    synchronized Drawable s(Context context, m0 m0Var, int i2) {
        try {
            Drawable drawableQ = q(context, i2);
            if (drawableQ == null) {
                drawableQ = m0Var.a(i2);
            }
            if (drawableQ == null) {
                return null;
            }
            return u(context, i2, false, drawableQ);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(c cVar) {
        this.g = cVar;
    }

    boolean w(Context context, int i2, Drawable drawable) {
        c cVar = this.g;
        return cVar != null && cVar.e(context, i2, drawable);
    }
}
