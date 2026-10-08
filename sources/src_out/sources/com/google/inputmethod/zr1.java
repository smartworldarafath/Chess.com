package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH ¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\u0082\u0001\u0001\u0011¨\u0006\u0012"}, d2 = {"Lcom/google/android/zr1;", "T", "", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/os9;", "value", "Lcom/google/android/c1e;", "previous", "b", "(Lcom/google/android/os9;Lcom/google/android/c1e;)Lcom/google/android/c1e;", "a", "Lcom/google/android/c1e;", "()Lcom/google/android/c1e;", "defaultValueHolder", "Lcom/google/android/ks9;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class zr1<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final c1e<T> defaultValueHolder;

    public /* synthetic */ zr1(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    public c1e<T> a() {
        return this.defaultValueHolder;
    }

    public abstract c1e<T> b(os9<T> value, c1e<T> previous);

    private zr1(Function0<? extends T> function0) {
        this.defaultValueHolder = new nz6(function0);
    }
}
