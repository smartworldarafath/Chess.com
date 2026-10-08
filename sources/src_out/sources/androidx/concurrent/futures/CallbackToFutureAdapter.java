package androidx.concurrent.futures;

import com.google.android.s47;
import com.google.inputmethod.jka;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class CallbackToFutureAdapter {

    static final class FutureGarbageCollectedException extends Throwable {
        FutureGarbageCollectedException(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public static final class a<T> {
        Object a;
        c<T> b;
        private jka<Void> c = jka.y();
        private boolean d;

        a() {
        }

        private void e() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public void a(Runnable runnable, Executor executor) {
            jka<Void> jkaVar = this.c;
            if (jkaVar != null) {
                jkaVar.addListener(runnable, executor);
            }
        }

        void b() {
            this.a = null;
            this.b = null;
            this.c.t(null);
        }

        public boolean c(T t) {
            this.d = true;
            c<T> cVar = this.b;
            boolean z = cVar != null && cVar.b(t);
            if (z) {
                e();
            }
            return z;
        }

        public boolean d() {
            this.d = true;
            c<T> cVar = this.b;
            boolean z = cVar != null && cVar.a(true);
            if (z) {
                e();
            }
            return z;
        }

        public boolean f(Throwable th) {
            this.d = true;
            c<T> cVar = this.b;
            boolean z = cVar != null && cVar.d(th);
            if (z) {
                e();
            }
            return z;
        }

        protected void finalize() {
            jka<Void> jkaVar;
            c<T> cVar = this.b;
            if (cVar != null && !cVar.isDone()) {
                cVar.d(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
            }
            if (this.d || (jkaVar = this.c) == null) {
                return;
            }
            jkaVar.t(null);
        }
    }

    public interface b<T> {
        Object attachCompleter(a<T> aVar) throws Exception;
    }

    private static final class c<T> implements s47<T> {
        final WeakReference<a<T>> a;
        private final AbstractResolvableFuture<T> b = new a();

        class a extends AbstractResolvableFuture<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            protected String q() {
                a<T> aVar = c.this.a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.a + "]";
            }
        }

        c(a<T> aVar) {
            this.a = new WeakReference<>(aVar);
        }

        boolean a(boolean z) {
            return this.b.cancel(z);
        }

        public void addListener(Runnable runnable, Executor executor) {
            this.b.addListener(runnable, executor);
        }

        boolean b(T t) {
            return this.b.t(t);
        }

        public boolean cancel(boolean z) {
            a<T> aVar = this.a.get();
            boolean zCancel = this.b.cancel(z);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        boolean d(Throwable th) {
            return this.b.u(th);
        }

        public T get() throws ExecutionException, InterruptedException {
            return this.b.get();
        }

        public boolean isCancelled() {
            return this.b.isCancelled();
        }

        public boolean isDone() {
            return this.b.isDone();
        }

        public String toString() {
            return this.b.toString();
        }

        public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.b.get(j, timeUnit);
        }
    }

    public static <T> s47<T> a(b<T> bVar) {
        a<T> aVar = new a<>();
        c<T> cVar = new c<>(aVar);
        aVar.b = cVar;
        aVar.a = bVar.getClass();
        try {
            Object objAttachCompleter = bVar.attachCompleter(aVar);
            if (objAttachCompleter == null) {
                return cVar;
            }
            aVar.a = objAttachCompleter;
            return cVar;
        } catch (Exception e) {
            cVar.d(e);
            return cVar;
        }
    }
}
