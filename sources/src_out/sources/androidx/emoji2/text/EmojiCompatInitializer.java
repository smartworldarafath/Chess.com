package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleInitializer;
import com.google.android.mw5;
import com.google.inputmethod.n17;
import com.google.inputmethod.ux2;
import com.google.inputmethod.xbd;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class EmojiCompatInitializer implements mw5<Boolean> {

    class a implements ux2 {
        final /* synthetic */ Lifecycle a;

        a(Lifecycle lifecycle) {
            this.a = lifecycle;
        }

        @Override // com.google.inputmethod.ux2
        public void onResume(n17 n17Var) {
            EmojiCompatInitializer.this.c();
            this.a.g(this);
        }
    }

    static class b extends e.c {
        protected b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    static class c implements e.h {
        private final Context a;

        class a extends e.i {
            final /* synthetic */ e.i a;
            final /* synthetic */ ThreadPoolExecutor b;

            a(e.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.a = iVar;
                this.b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th) {
                try {
                    this.a.a(th);
                } finally {
                    this.b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.e.i
            public void b(l lVar) {
                try {
                    this.a.b(lVar);
                } finally {
                    this.b.shutdown();
                }
            }
        }

        c(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.h
        public void a(final e.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c(iVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(e.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                i iVarA = androidx.emoji2.text.c.a(this.a);
                if (iVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                iVarA.c(threadPoolExecutor);
                iVarA.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                xbd.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.k()) {
                    e.c().n();
                }
            } finally {
                xbd.b();
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean create(Context context) {
        e.j(new b(context));
        b(context);
        return Boolean.TRUE;
    }

    void b(Context context) {
        Lifecycle lifecycleRegistry = ((n17) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycleRegistry();
        lifecycleRegistry.c(new a(lifecycleRegistry));
    }

    void c() {
        androidx.emoji2.text.b.c().postDelayed(new d(), 500L);
    }

    public List<Class<? extends mw5<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
