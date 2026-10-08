package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/android/u17;", "Lcom/google/android/pma;", "Lcom/google/android/bf7;", "delegate", "<init>", "(Lcom/google/android/bf7;)V", "", "d", "()V", "b", "a", "Lcom/google/android/bf7;", "getDelegate", "()Lcom/google/android/bf7;", "", "c", "()Z", "isRetainingExitedValues", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u17 implements pma {
    public static final int b = bf7.e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final bf7 delegate;

    public u17(bf7 bf7Var) {
        this.delegate = bf7Var;
        bf7Var.d();
    }

    public final void a() {
        this.delegate.b();
    }

    public final void b() {
        this.delegate.d();
    }

    public final boolean c() {
        return this.delegate.c();
    }

    public final void d() {
        this.delegate.e();
    }

    public /* synthetic */ u17(bf7 bf7Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new bf7() : bf7Var);
    }
}
