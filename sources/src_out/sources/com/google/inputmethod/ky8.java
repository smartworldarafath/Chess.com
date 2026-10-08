package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/google/android/ky8;", "Lcom/google/android/h11;", "Lcom/google/android/bt6;", "cacheWindow", "Lcom/google/android/nu6;", "state", "Lkotlin/Function0;", "", "itemCount", "<init>", "(Lcom/google/android/bt6;Lcom/google/android/nu6;Lkotlin/jvm/functions/Function0;)V", "", "delta", "Lcom/google/android/jz8;", "layoutInfo", "", "C", "(FLcom/google/android/jz8;)V", "D", "(Lcom/google/android/jz8;)V", "p", "Lcom/google/android/bt6;", "getCacheWindow", "()Lcom/google/android/bt6;", "q", "Lcom/google/android/nu6;", "getState", "()Lcom/google/android/nu6;", "r", "Lkotlin/jvm/functions/Function0;", "getItemCount", "()Lkotlin/jvm/functions/Function0;", "Lcom/google/android/my8;", "s", "Lcom/google/android/my8;", "cacheWindowScope", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ky8 extends h11 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final bt6 cacheWindow;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final nu6 state;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Function0<Integer> itemCount;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final my8 cacheWindowScope;

    public ky8(bt6 bt6Var, nu6 nu6Var, Function0<Integer> function0) {
        super(bt6Var, false);
        this.cacheWindow = bt6Var;
        this.state = nu6Var;
        this.itemCount = function0;
        this.cacheWindowScope = new my8(function0);
    }

    public final void C(float delta, jz8 layoutInfo) {
        this.cacheWindowScope.s(layoutInfo);
        this.cacheWindowScope.t(this.state);
        t(this.cacheWindowScope, -delta);
    }

    public final void D(jz8 layoutInfo) {
        this.cacheWindowScope.s(layoutInfo);
        this.cacheWindowScope.t(this.state);
        u(this.cacheWindowScope);
    }
}
