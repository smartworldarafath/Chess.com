package com.google.inputmethod;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class fod {
    private ConcurrentHashMap<Long, dm4.b> a = new ConcurrentHashMap<>();

    class a implements b<nm4.b> {
        a() {
        }

        @Override // com.google.android.fod.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(nm4.b bVar) {
            return bVar.f();
        }

        @Override // com.google.android.fod.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(nm4.b bVar) {
            return bVar.g();
        }
    }

    private interface b<T> {
        int a(T t);

        boolean b(T t);
    }

    fod() {
    }

    private static <T> T e(T[] tArr, int i, b<T> bVar) {
        return (T) f(tArr, (i & 1) == 0 ? 400 : 700, (i & 2) != 0, bVar);
    }

    private static <T> T f(T[] tArr, int i, boolean z, b<T> bVar) {
        T t = null;
        int i2 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(bVar.a(t2) - i) * 2) + (bVar.b(t2) == z ? 0 : 1);
            if (t == null || i2 > iAbs) {
                t = t2;
                i2 = iAbs;
            }
        }
        return t;
    }

    public Typeface a(Context context, dm4.b bVar, Resources resources, int i) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, nm4.b[] bVarArr, int i) {
        throw null;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, List<nm4.b[]> list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File fileD = god.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (god.b(fileD, resources, i)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    protected nm4.b g(nm4.b[] bVarArr, int i) {
        return (nm4.b) e(bVarArr, i, new a());
    }
}
