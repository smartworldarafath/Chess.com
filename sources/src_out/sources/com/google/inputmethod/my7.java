package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0001\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/my7;", "T", "", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "a", "Lkotlin/jvm/functions/Function0;", "getDefaultFactory$ui", "()Lkotlin/jvm/functions/Function0;", "Lcom/google/android/ls9;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class my7<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function0<T> defaultFactory;

    public /* synthetic */ my7(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private my7(Function0<? extends T> function0) {
        this.defaultFactory = function0;
    }
}
