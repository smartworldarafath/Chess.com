package com.google.inputmethod;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class j00 extends unc {
    private static volatile j00 c;
    private static final Executor d = new Executor() { // from class: com.google.android.h00
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            j00.h().d(runnable);
        }
    };
    private static final Executor e = new Executor() { // from class: com.google.android.i00
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            j00.h().a(runnable);
        }
    };
    private unc a;
    private final unc b;

    private j00() {
        i03 i03Var = new i03();
        this.b = i03Var;
        this.a = i03Var;
    }

    public static Executor g() {
        return e;
    }

    public static j00 h() {
        if (c != null) {
            return c;
        }
        synchronized (j00.class) {
            try {
                if (c == null) {
                    c = new j00();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public static Executor i() {
        return d;
    }

    @Override // com.google.inputmethod.unc
    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    @Override // com.google.inputmethod.unc
    public boolean c() {
        return this.a.c();
    }

    @Override // com.google.inputmethod.unc
    public void d(Runnable runnable) {
        this.a.d(runnable);
    }
}
