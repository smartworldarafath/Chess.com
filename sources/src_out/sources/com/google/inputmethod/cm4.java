package com.google.inputmethod;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import com.google.android.ubd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class cm4 {
    static final dd7<String, Typeface> a = new dd7<>(16);
    private static final ExecutorService b = yia.a("fonts-androidx", 10, 10000);
    static final Object c = new Object();
    static final qpb<String, ArrayList<oy1<e>>> d = new qpb<>();

    class a implements Callable<e> {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ zl4 c;
        final /* synthetic */ int d;

        a(String str, Context context, zl4 zl4Var, int i) {
            this.a = str;
            this.b = context;
            this.c = zl4Var;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return cm4.c(this.a, this.b, bm4.a(new Object[]{this.c}), this.d);
        }
    }

    class b implements oy1<e> {
        final /* synthetic */ t21 a;

        b(t21 t21Var) {
            this.a = t21Var;
        }

        @Override // com.google.inputmethod.oy1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.a.b(eVar);
        }
    }

    class c implements Callable<e> {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ List c;
        final /* synthetic */ int d;

        c(String str, Context context, List list, int i) {
            this.a = str;
            this.b = context;
            this.c = list;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return cm4.c(this.a, this.b, this.c, this.d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements oy1<e> {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        @Override // com.google.inputmethod.oy1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (cm4.c) {
                try {
                    qpb<String, ArrayList<oy1<e>>> qpbVar = cm4.d;
                    ArrayList<oy1<e>> arrayList = qpbVar.get(this.a);
                    if (arrayList == null) {
                        return;
                    }
                    qpbVar.remove(this.a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList.get(i).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static String a(List<zl4> list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2).d());
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    private static int b(nm4.a aVar) {
        int i = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        nm4.b[] bVarArrC = aVar.c();
        if (bVarArrC != null && bVarArrC.length != 0) {
            i = 0;
            for (nm4.b bVar : bVarArrC) {
                int iA = bVar.a();
                if (iA != 0) {
                    if (iA < 0) {
                        return -3;
                    }
                    return iA;
                }
            }
        }
        return i;
    }

    static e c(String str, Context context, List<zl4> list, int i) {
        ubd.c("getFontSync");
        try {
            dd7<String, Typeface> dd7Var = a;
            Typeface typefaceD = dd7Var.d(str);
            if (typefaceD != null) {
                e eVar = new e(typefaceD);
                ubd.f();
                return eVar;
            }
            try {
                nm4.a aVarE = yl4.e(context, list, null);
                int iB = b(aVarE);
                if (iB != 0) {
                    e eVar2 = new e(iB);
                    ubd.f();
                    return eVar2;
                }
                Typeface typefaceB = (!aVarE.f() || Build.VERSION.SDK_INT < 29) ? znd.b(context, null, aVarE.c(), i) : znd.c(context, null, aVarE.d(), i);
                if (typefaceB == null) {
                    e eVar3 = new e(-3);
                    ubd.f();
                    return eVar3;
                }
                dd7Var.f(str, typefaceB);
                e eVar4 = new e(typefaceB);
                ubd.f();
                return eVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                e eVar5 = new e(-1);
                ubd.f();
                return eVar5;
            }
        } catch (Throwable th) {
            ubd.f();
            throw th;
        }
    }

    static Typeface d(Context context, List<zl4> list, int i, Executor executor, t21 t21Var) {
        String strA = a(list, i);
        Typeface typefaceD = a.d(strA);
        if (typefaceD != null) {
            t21Var.b(new e(typefaceD));
            return typefaceD;
        }
        b bVar = new b(t21Var);
        synchronized (c) {
            try {
                qpb<String, ArrayList<oy1<e>>> qpbVar = d;
                ArrayList<oy1<e>> arrayList = qpbVar.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList<oy1<e>> arrayList2 = new ArrayList<>();
                arrayList2.add(bVar);
                qpbVar.put(strA, arrayList2);
                c cVar = new c(strA, context, list, i);
                if (executor == null) {
                    executor = b;
                }
                yia.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Typeface e(Context context, zl4 zl4Var, t21 t21Var, int i, int i2) {
        String strA = a(bm4.a(new Object[]{zl4Var}), i);
        Typeface typefaceD = a.d(strA);
        if (typefaceD != null) {
            t21Var.b(new e(typefaceD));
            return typefaceD;
        }
        if (i2 == -1) {
            e eVarC = c(strA, context, bm4.a(new Object[]{zl4Var}), i);
            t21Var.b(eVarC);
            return eVarC.a;
        }
        try {
            e eVar = (e) yia.d(b, new a(strA, context, zl4Var, i), i2);
            t21Var.b(eVar);
            return eVar.a;
        } catch (InterruptedException unused) {
            t21Var.b(new e(-3));
            return null;
        }
    }

    static final class e {
        final Typeface a;
        final int b;

        e(int i) {
            this.a = null;
            this.b = i;
        }

        boolean a() {
            return this.b == 0;
        }

        e(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }
}
