package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.google.android.b0b;
import com.google.android.e0b;
import com.google.android.zza;
import com.google.inputmethod.CreationExtras;
import com.google.inputmethod.j48;
import com.google.inputmethod.k9e;
import com.google.inputmethod.u9e;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class z implements androidx.lifecycle.e, e0b, u9e {
    private final Fragment a;
    private final k9e b;
    private final Runnable c;
    private androidx.lifecycle.b0.c d;
    private androidx.lifecycle.k e = null;
    private b0b f = null;

    z(Fragment fragment, k9e k9eVar, Runnable runnable) {
        this.a = fragment;
        this.b = k9eVar;
        this.c = runnable;
    }

    void a(Lifecycle.Event event) {
        this.e.l(event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b() {
        if (this.e == null) {
            this.e = new androidx.lifecycle.k(this);
            b0b b0bVarA = b0b.a(this);
            this.f = b0bVarA;
            b0bVarA.c();
            this.c.run();
        }
    }

    boolean c() {
        return this.e != null;
    }

    void d(Bundle bundle) {
        this.f.d(bundle);
    }

    void e(Bundle bundle) {
        this.f.e(bundle);
    }

    void f(Lifecycle.State state) {
        this.e.q(state);
    }

    @Override // androidx.lifecycle.e
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.a.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        j48 j48Var = new j48();
        if (application != null) {
            j48Var.c(androidx.lifecycle.b0.a.h, application);
        }
        j48Var.c(androidx.lifecycle.w.a, this.a);
        j48Var.c(androidx.lifecycle.w.b, this);
        if (this.a.getArguments() != null) {
            j48Var.c(androidx.lifecycle.w.c, this.a.getArguments());
        }
        return j48Var;
    }

    @Override // androidx.lifecycle.e
    public androidx.lifecycle.b0.c getDefaultViewModelProviderFactory() {
        Application application;
        androidx.lifecycle.b0.c defaultViewModelProviderFactory = this.a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.a.mDefaultFactory)) {
            this.d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.d == null) {
            Context applicationContext = this.a.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            Fragment fragment = this.a;
            this.d = new androidx.lifecycle.x(application, fragment, fragment.getArguments());
        }
        return this.d;
    }

    public Lifecycle getLifecycle() {
        b();
        return this.e;
    }

    public zza getSavedStateRegistry() {
        b();
        return this.f.b();
    }

    @Override // com.google.inputmethod.u9e
    public k9e getViewModelStore() {
        b();
        return this.b;
    }
}
