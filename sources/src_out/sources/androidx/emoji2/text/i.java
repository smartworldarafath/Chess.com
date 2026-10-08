package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import com.google.inputmethod.di9;
import com.google.inputmethod.god;
import com.google.inputmethod.nm4;
import com.google.inputmethod.xbd;
import com.google.inputmethod.zl4;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class i extends e.c {
    private static final a k = new a();

    public static class a {
        public Typeface a(Context context, nm4.b bVar) throws PackageManager.NameNotFoundException {
            return nm4.a(context, null, new nm4.b[]{bVar});
        }

        public nm4.a b(Context context, zl4 zl4Var) throws PackageManager.NameNotFoundException {
            return nm4.b(context, null, zl4Var);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements e.h {
        private final Context a;
        private final zl4 b;
        private final a c;
        private final Object d = new Object();
        private Handler e;
        private Executor f;
        private ThreadPoolExecutor g;
        e.i h;
        private ContentObserver i;
        private Runnable j;

        b(Context context, zl4 zl4Var, a aVar) {
            di9.h(context, "Context cannot be null");
            di9.h(zl4Var, "FontRequest cannot be null");
            this.a = context.getApplicationContext();
            this.b = zl4Var;
            this.c = aVar;
        }

        private void b() {
            synchronized (this.d) {
                try {
                    this.h = null;
                    ContentObserver contentObserver = this.i;
                    if (contentObserver != null) {
                        this.c.c(this.a, contentObserver);
                        this.i = null;
                    }
                    Handler handler = this.e;
                    if (handler != null) {
                        handler.removeCallbacks(this.j);
                    }
                    this.e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f = null;
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private nm4.b e() {
            try {
                nm4.a aVarB = this.c.b(this.a, this.b);
                if (aVarB.e() == 0) {
                    nm4.b[] bVarArrC = aVarB.c();
                    if (bVarArrC == null || bVarArrC.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrC[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.e() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        @Override // androidx.emoji2.text.e.h
        public void a(e.i iVar) {
            di9.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.d) {
                this.h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    try {
                        nm4.b bVarE = e();
                        int iA = bVarE.a();
                        if (iA == 2) {
                            synchronized (this.d) {
                            }
                        }
                        if (iA != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iA + ")");
                        }
                        try {
                            xbd.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.c.a(this.a, bVarE);
                            ByteBuffer byteBufferE = god.e(this.a, null, bVarE.d());
                            if (byteBufferE == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            l lVarB = l.b(typefaceA, byteBufferE);
                            xbd.b();
                            synchronized (this.d) {
                                try {
                                    e.i iVar = this.h;
                                    if (iVar != null) {
                                        iVar.b(lVarB);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            b();
                        } catch (Throwable th2) {
                            xbd.b();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        synchronized (this.d) {
                            try {
                                e.i iVar2 = this.h;
                                if (iVar2 != null) {
                                    iVar2.a(th3);
                                }
                                b();
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }

        void d() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    if (this.f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("emojiCompat");
                        this.g = threadPoolExecutorB;
                        this.f = threadPoolExecutorB;
                    }
                    this.f.execute(new Runnable() { // from class: androidx.emoji2.text.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.d) {
                this.f = executor;
            }
        }
    }

    public i(Context context, zl4 zl4Var) {
        super(new b(context, zl4Var, k));
    }

    public i c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
