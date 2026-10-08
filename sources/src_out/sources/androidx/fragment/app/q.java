package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0018J/\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u0013J\u001d\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b \u0010\u0013J\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0013J\u001d\u0010!\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b!\u0010\u0013J%\u0010#\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b#\u0010\u0018J\u001d\u0010$\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b$\u0010\u0013J\u001d\u0010%\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0013J\u001d\u0010&\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b&\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010*¨\u0006,"}, d2 = {"Landroidx/fragment/app/q;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/fragment/app/FragmentManager$l;", "cb", "", "recursive", "", "o", "(Landroidx/fragment/app/FragmentManager$l;Z)V", "p", "(Landroidx/fragment/app/FragmentManager$l;)V", "Landroidx/fragment/app/Fragment;", "f", "onlyRecursive", "g", "(Landroidx/fragment/app/Fragment;Z)V", "b", "Landroid/os/Bundle;", "savedInstanceState", "h", "(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V", "c", "a", "Landroid/view/View;", "v", "m", "(Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V", "k", "i", "l", "outState", "j", "n", "d", "e", "Landroidx/fragment/app/FragmentManager;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/fragment/app/q$a;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "lifecycleCallbacks", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FragmentManager fragmentManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final CopyOnWriteArrayList<a> lifecycleCallbacks;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/q$a;", "", "Landroidx/fragment/app/FragmentManager$l;", "callback", "", "recursive", "<init>", "(Landroidx/fragment/app/FragmentManager$l;Z)V", "a", "Landroidx/fragment/app/FragmentManager$l;", "()Landroidx/fragment/app/FragmentManager$l;", "b", "Z", "()Z", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final FragmentManager.l callback;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean recursive;

        public a(FragmentManager.l lVar, boolean z) {
            Intrinsics.checkNotNullParameter(lVar, "callback");
            this.callback = lVar;
            this.recursive = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FragmentManager.l getCallback() {
            return this.callback;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getRecursive() {
            return this.recursive;
        }
    }

    public q(FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.fragmentManager = fragmentManager;
        this.lifecycleCallbacks = new CopyOnWriteArrayList<>();
    }

    public final void a(Fragment f, Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentH0 = this.fragmentManager.H0();
        if (fragmentH0 != null) {
            FragmentManager parentFragmentManager = fragmentH0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.G0().a(f, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentActivityCreated(this.fragmentManager, f, savedInstanceState);
            }
        }
    }

    public final void b(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Context context = this.fragmentManager.E0().getContext();
        Fragment fragmentH0 = this.fragmentManager.H0();
        if (fragmentH0 != null) {
            FragmentManager parentFragmentManager = fragmentH0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.G0().b(f, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentAttached(this.fragmentManager, f, context);
            }
        }
    }

    public final void c(Fragment f, Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentH0 = this.fragmentManager.H0();
        if (fragmentH0 != null) {
            FragmentManager parentFragmentManager = fragmentH0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.G0().c(f, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentCreated(this.fragmentManager, f, savedInstanceState);
            }
        }
    }

    public final void d(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentH0 = this.fragmentManager.H0();
        if (fragmentH0 != null) {
            FragmentManager parentFragmentManager = fragmentH0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.G0().d(f, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentDestroyed(this.fragmentManager, f);
            }
        }
    }

    public final void e(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentH0 = this.fragmentManager.H0();
        if (fragmentH0 != null) {
            FragmentManager parentFragmentManager = fragmentH0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.G0().e(f, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentDetached(this.fragmentManager, f);
            }
        }
    }

    public final void f(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentH0 = this.fragmentManager.H0();
        if (fragmentH0 != null) {
            FragmentManager parentFragmentManager = fragmentH0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.G0().f(f, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentPaused(this.fragmentManager, f);
            }
        }
    }

    public final void g(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Context context = this.fragmentManager.E0().getContext();
        Fragment fragmentH0 = this.fragmentManager.H0();
        if (fragmentH0 != null) {
            FragmentManager parentFragmentManager = fragmentH0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.G0().g(f, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentPreAttached(this.fragmentManager, f, context);
            }
        }
    }

    public final void h(Fragment f, Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentH0 = this.fragmentManager.H0();
        if (fragmentH0 != null) {
            FragmentManager parentFragmentManager = fragmentH0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.G0().h(f, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentPreCreated(this.fragmentManager, f, savedInstanceState);
            }
        }
    }

    public final void i(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentH0 = this.fragmentManager.H0();
        if (fragmentH0 != null) {
            FragmentManager parentFragmentManager = fragmentH0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.G0().i(f, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentResumed(this.fragmentManager, f);
            }
        }
    }

    public final void j(Fragment f, Bundle outState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        Fragment fragmentH0 = this.fragmentManager.H0();
        if (fragmentH0 != null) {
            FragmentManager parentFragmentManager = fragmentH0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.G0().j(f, outState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentSaveInstanceState(this.fragmentManager, f, outState);
            }
        }
    }

    public final void k(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentH0 = this.fragmentManager.H0();
        if (fragmentH0 != null) {
            FragmentManager parentFragmentManager = fragmentH0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.G0().k(f, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentStarted(this.fragmentManager, f);
            }
        }
    }

    public final void l(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentH0 = this.fragmentManager.H0();
        if (fragmentH0 != null) {
            FragmentManager parentFragmentManager = fragmentH0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.G0().l(f, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentStopped(this.fragmentManager, f);
            }
        }
    }

    public final void m(Fragment f, View v, Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(v, "v");
        Fragment fragmentH0 = this.fragmentManager.H0();
        if (fragmentH0 != null) {
            FragmentManager parentFragmentManager = fragmentH0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.G0().m(f, v, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentViewCreated(this.fragmentManager, f, v, savedInstanceState);
            }
        }
    }

    public final void n(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentH0 = this.fragmentManager.H0();
        if (fragmentH0 != null) {
            FragmentManager parentFragmentManager = fragmentH0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.G0().n(f, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentViewDestroyed(this.fragmentManager, f);
            }
        }
    }

    public final void o(FragmentManager.l cb, boolean recursive) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        this.lifecycleCallbacks.add(new a(cb, recursive));
    }

    public final void p(FragmentManager.l cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        synchronized (this.lifecycleCallbacks) {
            try {
                int size = this.lifecycleCallbacks.size();
                for (int i = 0; i < size; i++) {
                    if (this.lifecycleCallbacks.get(i).getCallback() == cb) {
                        this.lifecycleCallbacks.remove(i);
                        break;
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
