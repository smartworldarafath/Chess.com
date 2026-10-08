package com.google.inputmethod;

import com.google.android.rg6;
import com.google.inputmethod.w8e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/android/a9e;", "Lcom/google/android/w8e;", "T", "", "Lcom/google/android/rg6;", "clazz", "Lkotlin/Function1;", "Lcom/google/android/oe2;", "initializer", "<init>", "(Lcom/google/android/rg6;Lkotlin/jvm/functions/Function1;)V", "a", "Lcom/google/android/rg6;", "()Lcom/google/android/rg6;", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a9e<T extends w8e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final rg6<T> clazz;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1<CreationExtras, T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public a9e(rg6<T> rg6Var, Function1<? super CreationExtras, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(rg6Var, "clazz");
        Intrinsics.checkNotNullParameter(function1, "initializer");
        this.clazz = rg6Var;
        this.initializer = function1;
    }

    public final rg6<T> a() {
        return this.clazz;
    }

    public final Function1<CreationExtras, T> b() {
        return this.initializer;
    }
}
