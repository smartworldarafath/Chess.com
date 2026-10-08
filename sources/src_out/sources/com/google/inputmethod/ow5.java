package com.google.inputmethod;

import androidx.lifecycle.b0;
import com.google.android.hf6;
import com.google.android.j9e;
import com.google.android.rg6;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/android/ow5;", "Landroidx/lifecycle/b0$c;", "", "Lcom/google/android/a9e;", "initializers", "<init>", "([Lcom/google/android/a9e;)V", "Lcom/google/android/w8e;", "VM", "Ljava/lang/Class;", "modelClass", "Lcom/google/android/oe2;", "extras", "create", "(Ljava/lang/Class;Lcom/google/android/oe2;)Lcom/google/android/w8e;", "b", "[Lcom/google/android/a9e;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ow5 implements b0.c {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final a9e<?>[] initializers;

    public ow5(a9e<?>... a9eVarArr) {
        Intrinsics.checkNotNullParameter(a9eVarArr, "initializers");
        this.initializers = a9eVarArr;
    }

    @Override // androidx.lifecycle.b0.c
    public <VM extends w8e> VM create(Class<VM> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        j9e j9eVar = j9e.a;
        rg6 rg6VarE = hf6.e(modelClass);
        a9e<?>[] a9eVarArr = this.initializers;
        return (VM) j9eVar.b(rg6VarE, extras, (a9e[]) Arrays.copyOf(a9eVarArr, a9eVarArr.length));
    }
}
