package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import com.google.inputmethod.g10;
import com.google.inputmethod.h77;
import com.google.inputmethod.iv;
import com.google.inputmethod.o7;
import com.google.inputmethod.t7;
import com.google.inputmethod.vx;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class c {
    static ExecutorC0007c a = new ExecutorC0007c(new d());
    private static int b = -100;
    private static h77 c = null;
    private static h77 d = null;
    private static Boolean e = null;
    private static boolean f = false;
    private static final g10<WeakReference<c>> g = new g10<>();
    private static final Object h = new Object();
    private static final Object i = new Object();

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.c$c, reason: collision with other inner class name */
    static class ExecutorC0007c implements Executor {
        private final Object a = new Object();
        final Queue<Runnable> b = new ArrayDeque();
        final Executor c;
        Runnable d;

        ExecutorC0007c(Executor executor) {
            this.c = executor;
        }

        public static /* synthetic */ void a(ExecutorC0007c executorC0007c, Runnable runnable) {
            executorC0007c.getClass();
            try {
                runnable.run();
            } finally {
                executorC0007c.b();
            }
        }

        protected void b() {
            synchronized (this.a) {
                try {
                    Runnable runnablePoll = this.b.poll();
                    this.d = runnablePoll;
                    if (runnablePoll != null) {
                        this.c.execute(runnablePoll);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.a) {
                try {
                    this.b.add(new Runnable() { // from class: androidx.appcompat.app.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.ExecutorC0007c.a(this.a, runnable);
                        }
                    });
                    if (this.d == null) {
                        b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static class d implements Executor {
        d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    c() {
    }

    static boolean C(Context context) {
        if (e == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.a(context).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    static void L(c cVar) {
        synchronized (h) {
            M(cVar);
        }
    }

    private static void M(c cVar) {
        synchronized (h) {
            try {
                Iterator<WeakReference<c>> it = g.iterator();
                while (it.hasNext()) {
                    c cVar2 = it.next().get();
                    if (cVar2 == cVar || cVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void O(h77 h77Var) {
        Objects.requireNonNull(h77Var);
        if (Build.VERSION.SDK_INT >= 33) {
            Object objV = v();
            if (objV != null) {
                b.b(objV, a.a(h77Var.h()));
                return;
            }
            return;
        }
        if (h77Var.equals(c)) {
            return;
        }
        synchronized (h) {
            c = h77Var;
            j();
        }
    }

    public static void S(int i2) {
        if ((i2 == -1 || i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) && b != i2) {
            b = i2;
            i();
        }
    }

    static void Y(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (q().f()) {
                    String strB = vx.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void Z(final Context context) {
        if (C(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f) {
                    return;
                }
                a.execute(new Runnable() { // from class: com.google.android.jv
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.c(context);
                    }
                });
                return;
            }
            synchronized (i) {
                try {
                    h77 h77Var = c;
                    if (h77Var == null) {
                        if (d == null) {
                            d = h77.b(vx.b(context));
                        }
                        if (d.f()) {
                        } else {
                            c = d;
                        }
                    } else if (!h77Var.equals(d)) {
                        h77 h77Var2 = c;
                        d = h77Var2;
                        vx.a(context, h77Var2.h());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        Y(context);
        f = true;
    }

    static void e(c cVar) {
        synchronized (h) {
            M(cVar);
            g.add(new WeakReference<>(cVar));
        }
    }

    private static void i() {
        synchronized (h) {
            try {
                Iterator<WeakReference<c>> it = g.iterator();
                while (it.hasNext()) {
                    c cVar = it.next().get();
                    if (cVar != null) {
                        cVar.h();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void j() {
        Iterator<WeakReference<c>> it = g.iterator();
        while (it.hasNext()) {
            c cVar = it.next().get();
            if (cVar != null) {
                cVar.g();
            }
        }
    }

    public static c n(Activity activity, iv ivVar) {
        return new e(activity, ivVar);
    }

    public static c o(Dialog dialog, iv ivVar) {
        return new e(dialog, ivVar);
    }

    public static h77 q() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objV = v();
            if (objV != null) {
                return h77.j(b.a(objV));
            }
        } else {
            h77 h77Var = c;
            if (h77Var != null) {
                return h77Var;
            }
        }
        return h77.e();
    }

    public static int s() {
        return b;
    }

    static Object v() {
        Context contextR;
        Iterator<WeakReference<c>> it = g.iterator();
        while (it.hasNext()) {
            c cVar = it.next().get();
            if (cVar != null && (contextR = cVar.r()) != null) {
                return contextR.getSystemService("locale");
            }
        }
        return null;
    }

    static h77 x() {
        return c;
    }

    static h77 y() {
        return d;
    }

    public abstract void A();

    public abstract void B();

    public abstract void D(Configuration configuration);

    public abstract void E(Bundle bundle);

    public abstract void F();

    public abstract void G(Bundle bundle);

    public abstract void H();

    public abstract void I(Bundle bundle);

    public abstract void J();

    public abstract void K();

    public abstract boolean N(int i2);

    public abstract void P(int i2);

    public abstract void Q(View view);

    public abstract void R(View view, ViewGroup.LayoutParams layoutParams);

    public void T(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void U(Toolbar toolbar);

    public void V(int i2) {
    }

    public abstract void W(CharSequence charSequence);

    public abstract t7 X(t7.a aVar);

    public abstract void f(View view, ViewGroup.LayoutParams layoutParams);

    boolean g() {
        return false;
    }

    public abstract boolean h();

    void k(final Context context) {
        a.execute(new Runnable() { // from class: com.google.android.kv
            @Override // java.lang.Runnable
            public final void run() {
                c.Z(context);
            }
        });
    }

    @Deprecated
    public void l(Context context) {
    }

    public Context m(Context context) {
        l(context);
        return context;
    }

    public abstract <T extends View> T p(int i2);

    public Context r() {
        return null;
    }

    public abstract o7 t();

    public int u() {
        return -100;
    }

    public abstract MenuInflater w();

    public abstract androidx.appcompat.app.a z();
}
