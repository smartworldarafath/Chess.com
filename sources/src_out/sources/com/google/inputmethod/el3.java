package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/el3;", "T", "Lcom/google/android/ks9;", "Lcom/google/android/bxb;", "policy", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lcom/google/android/bxb;Lkotlin/jvm/functions/Function0;)V", "value", "Lcom/google/android/os9;", "c", "(Ljava/lang/Object;)Lcom/google/android/os9;", "b", "Lcom/google/android/bxb;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class el3<T> extends ks9<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final bxb<T> policy;

    public el3(bxb<T> bxbVar, Function0<? extends T> function0) {
        super(function0);
        this.policy = bxbVar;
    }

    @Override // com.google.inputmethod.ks9
    public os9<T> c(T value) {
        return new os9<>(this, value, value == null, this.policy, null, null, true);
    }
}
