package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0004R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/google/android/m9;", "I", "", "<init>", "()V", "input", "Lcom/google/android/w8;", "options", "", "a", "(Ljava/lang/Object;Lcom/google/android/w8;)V", "c", "Lcom/google/android/l9;", "Lcom/google/android/l9;", "getLauncher", "()Lcom/google/android/l9;", "b", "(Lcom/google/android/l9;)V", "launcher", "activity-compose"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m9<I> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private l9<I> launcher;

    public final void a(I input, w8 options) {
        l9<I> l9Var = this.launcher;
        if (l9Var == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
        l9Var.b(input, options);
    }

    public final void b(l9<I> l9Var) {
        this.launcher = l9Var;
    }

    public final void c() {
        l9<I> l9Var = this.launcher;
        if (l9Var == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
        l9Var.c();
    }
}
