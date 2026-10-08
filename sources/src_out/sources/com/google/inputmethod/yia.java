package com.google.inputmethod;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class yia {

    private static class a implements ThreadFactory {
        private String a;
        private int b;

        /* JADX INFO: renamed from: com.google.android.yia$a$a, reason: collision with other inner class name */
        private static class C0133a extends Thread {
            private final int a;

            C0133a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.a = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.a);
                super.run();
            }
        }

        a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0133a(runnable, this.a, this.b);
        }
    }

    private static class b implements Executor {
        private final Handler a;

        b(Handler handler) {
            this.a = (Handler) di9.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.a.post((Runnable) di9.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.a + " is shutting down");
        }
    }

    private static class c<T> implements Runnable {
        private Callable<T> a;
        private oy1<T> b;
        private Handler c;

        class a implements Runnable {
            final /* synthetic */ oy1 a;
            final /* synthetic */ Object b;

            a(oy1 oy1Var, Object obj) {
                this.a = oy1Var;
                this.b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.a.accept(this.b);
            }
        }

        c(Handler handler, Callable<T> callable, oy1<T> oy1Var) {
            this.a = callable;
            this.b = oy1Var;
            this.c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.c.post(new a(this.b, tCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static <T> void c(Executor executor, Callable<T> callable, oy1<T> oy1Var) {
        executor.execute(new c(u21.a(), callable, oy1Var));
    }

    static <T> T d(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
