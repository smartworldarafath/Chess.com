package com.google.inputmethod;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class bod extends aod {
    protected final Class<?> g;
    protected final Constructor<?> h;
    protected final Method i;
    protected final Method j;
    protected final Method k;
    protected final Method l;
    protected final Method m;

    public bod() {
        Class<?> clsU;
        Constructor<?> constructorV;
        Method methodR;
        Method methodS;
        Method methodW;
        Method methodQ;
        Method methodT;
        try {
            clsU = u();
            constructorV = v(clsU);
            methodR = r(clsU);
            methodS = s(clsU);
            methodW = w(clsU);
            methodQ = q(clsU);
            methodT = t(clsU);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            clsU = null;
            constructorV = null;
            methodR = null;
            methodS = null;
            methodW = null;
            methodQ = null;
            methodT = null;
        }
        this.g = clsU;
        this.h = constructorV;
        this.i = methodR;
        this.j = methodS;
        this.k = methodW;
        this.l = methodQ;
        this.m = methodT;
    }

    private Object k() {
        try {
            return this.h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void l(Object obj) {
        try {
            this.l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean m(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean n(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p() {
        return this.i != null;
    }

    @Override // com.google.inputmethod.aod, com.google.inputmethod.fod
    public Typeface a(Context context, dm4.b bVar, Resources resources, int i) {
        if (!p()) {
            return super.a(context, bVar, resources, i);
        }
        Object objK = k();
        if (objK == null) {
            return null;
        }
        dm4.c[] cVarArrA = bVar.a();
        int length = cVarArrA.length;
        int i2 = 0;
        while (i2 < length) {
            dm4.c cVar = cVarArrA[i2];
            Context context2 = context;
            if (!m(context2, objK, cVar.a(), cVar.c(), cVar.e(), cVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d()))) {
                l(objK);
                return null;
            }
            i2++;
            context = context2;
        }
        if (o(objK)) {
            return i(objK);
        }
        return null;
    }

    @Override // com.google.inputmethod.fod
    public Typeface b(Context context, CancellationSignal cancellationSignal, nm4.b[] bVarArr, int i) {
        Typeface typefaceI;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!p()) {
            nm4.b bVarG = g(bVarArr, i);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarG.d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarG.f()).setItalic(bVarG.g()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapF = god.f(context, bVarArr, cancellationSignal);
        Object objK = k();
        if (objK == null) {
            return null;
        }
        int length = bVarArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            nm4.b bVar = bVarArr[i2];
            ByteBuffer byteBuffer = mapF.get(bVar.d());
            if (byteBuffer == null) {
                obj = objK;
            } else {
                boolean zN = n(objK, byteBuffer, bVar.c(), bVar.f(), bVar.g() ? 1 : 0);
                obj = objK;
                if (!zN) {
                    l(obj);
                    return null;
                }
                z = true;
            }
            i2++;
            objK = obj;
            z = z;
        }
        Object obj2 = objK;
        if (!z) {
            l(obj2);
            return null;
        }
        if (o(obj2) && (typefaceI = i(obj2)) != null) {
            return Typeface.create(typefaceI, i);
        }
        return null;
    }

    @Override // com.google.inputmethod.fod
    public /* bridge */ /* synthetic */ Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i) {
        return super.c(context, cancellationSignal, list, i);
    }

    @Override // com.google.inputmethod.fod
    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        if (!p()) {
            return super.d(context, resources, i, str, i2);
        }
        Object objK = k();
        if (objK == null) {
            return null;
        }
        if (!m(context, objK, str, 0, -1, -1, null)) {
            l(objK);
            return null;
        }
        if (o(objK)) {
            return i(objK);
        }
        return null;
    }

    protected Typeface i(Object obj) {
        throw null;
    }

    protected Method q(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", null);
    }

    protected Method r(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    protected Method s(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method t(Class<?> cls) throws NoSuchMethodException {
        throw null;
    }

    protected Class<?> u() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> v(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(null);
    }

    protected Method w(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", null);
    }
}
