package com.google.inputmethod;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class mla {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    private static final WeakHashMap<b, SparseArray<a>> b = new WeakHashMap<>(0);
    private static final Object c = new Object();

    private static class a {
        final ColorStateList a;
        final Configuration b;
        final int c;

        a(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.a = colorStateList;
            this.b = configuration;
            this.c = theme == null ? 0 : theme.hashCode();
        }
    }

    private static final class b {
        final Resources a;
        final Resources.Theme b;

        b(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.a.equals(bVar.a) && mm8.a(this.b, bVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return mm8.b(this.a, this.b);
        }
    }

    public static abstract class c {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i, Handler handler) {
            e(handler).post(new Runnable() { // from class: com.google.android.ola
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f(i);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: com.google.android.nla
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.g(typeface);
                }
            });
        }

        public abstract void f(int i);

        public abstract void g(Typeface typeface);
    }

    public static final class d {

        static class a {
            private static final Object a = new Object();
            private static Method b;
            private static boolean c;

            static void a(Resources.Theme theme) {
                synchronized (a) {
                    if (!c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        c = true;
                    }
                    Method method = b;
                    if (method != null) {
                        try {
                            method.invoke(theme, null);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            b = null;
                        }
                    }
                }
            }
        }

        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private static void a(b bVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            try {
                WeakHashMap<b, SparseArray<a>> weakHashMap = b;
                SparseArray<a> sparseArray = weakHashMap.get(bVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(bVar, sparseArray);
                }
                sparseArray.append(i, new a(colorStateList, bVar.a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList b(com.google.android.mla.b r5, int r6) {
        /*
            java.lang.Object r0 = com.google.inputmethod.mla.c
            monitor-enter(r0)
            java.util.WeakHashMap<com.google.android.mla$b, android.util.SparseArray<com.google.android.mla$a>> r1 = com.google.inputmethod.mla.b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            com.google.android.mla$a r2 = (com.google.android.mla.a) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.inputmethod.mla.b(com.google.android.mla$b, int):android.content.res.ColorStateList");
    }

    public static Typeface c(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i, new TypedValue(), 0, null, null, false, true);
    }

    public static int d(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getColor(i, theme);
    }

    public static ColorStateList e(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        b bVar = new b(resources, theme);
        ColorStateList colorStateListB = b(bVar, i);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListL = l(resources, i, theme);
        if (colorStateListL == null) {
            return resources.getColorStateList(i, theme);
        }
        a(bVar, i, colorStateListL, theme);
        return colorStateListL;
    }

    public static Drawable f(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getDrawable(i, theme);
    }

    public static Drawable g(Resources resources, int i, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getDrawableForDensity(i, i2, theme);
    }

    public static Typeface h(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface i(Context context, int i, TypedValue typedValue, int i2, c cVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i, typedValue, i2, cVar, null, true, false);
    }

    public static void j(Context context, int i, c cVar, Handler handler) throws Resources.NotFoundException {
        di9.g(cVar);
        if (context.isRestricted()) {
            cVar.c(-4, handler);
        } else {
            n(context, i, new TypedValue(), 0, cVar, handler, false, false);
        }
    }

    private static TypedValue k() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList l(Resources resources, int i, Resources.Theme theme) {
        if (m(resources, i)) {
            return null;
        }
        try {
            return qj1.a(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean m(Resources resources, int i) {
        TypedValue typedValueK = k();
        resources.getValue(i, typedValueK, true);
        int i2 = typedValueK.type;
        return i2 >= 28 && i2 <= 31;
    }

    private static Typeface n(Context context, int i, TypedValue typedValue, int i2, c cVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceO = o(context, resources, typedValue, i, i2, cVar, handler, z, z2);
        if (typefaceO != null || cVar != null || z2) {
            return typefaceO;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    private static Typeface o(Context context, Resources resources, TypedValue typedValue, int i, int i2, c cVar, Handler handler, boolean z, boolean z2) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (cVar != null) {
                cVar.c(-3, handler);
            }
            return null;
        }
        Typeface typefaceG = znd.g(resources, i, string, typedValue.assetCookie, i2);
        if (typefaceG != null) {
            if (cVar != null) {
                cVar.d(typefaceG, handler);
            }
            return typefaceG;
        }
        if (z2) {
            return null;
        }
        try {
            if (string.toLowerCase().endsWith(".xml")) {
                dm4.a aVarB = dm4.b(resources.getXml(i), resources);
                if (aVarB != null) {
                    return znd.d(context, aVarB, resources, i, string, typedValue.assetCookie, i2, cVar, handler, z);
                }
                if (cVar != null) {
                    cVar.c(-3, handler);
                }
                return null;
            }
            Typeface typefaceE = znd.e(context, resources, i, string, typedValue.assetCookie, i2);
            if (cVar != null) {
                if (typefaceE != null) {
                    cVar.d(typefaceE, handler);
                    return typefaceE;
                }
                cVar.c(-3, handler);
            }
            return typefaceE;
        } catch (IOException | XmlPullParserException unused) {
            if (cVar != null) {
                cVar.c(-3, handler);
            }
            return null;
        }
    }
}
