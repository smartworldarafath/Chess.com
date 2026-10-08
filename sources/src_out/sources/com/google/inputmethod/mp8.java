package com.google.inputmethod;

import com.google.android.bw0;
import com.google.android.cw0;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0014\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/google/android/mp8;", "T", "Lcom/google/android/lp8;", "Lcom/google/android/mhb;", "delegate", "<init>", "(Lcom/google/android/mhb;)V", "Lcom/google/android/cw0;", "source", "a", "(Lcom/google/android/cw0;Lcom/google/android/q22;)Ljava/lang/Object;", "t", "Lcom/google/android/bw0;", "sink", "", "b", "(Ljava/lang/Object;Lcom/google/android/bw0;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/mhb;", "getDefaultValue", "()Ljava/lang/Object;", "defaultValue", "datastore"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class mp8<T> implements lp8<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final mhb<T> delegate;

    public mp8(mhb<T> mhbVar) {
        Intrinsics.checkNotNullParameter(mhbVar, "delegate");
        this.delegate = mhbVar;
    }

    @Override // com.google.inputmethod.lp8
    public Object a(cw0 cw0Var, q22<? super T> q22Var) {
        return this.delegate.readFrom(cw0Var.G2(), q22Var);
    }

    @Override // com.google.inputmethod.lp8
    public Object b(T t, bw0 bw0Var, q22<? super Unit> q22Var) {
        Object objWriteTo = this.delegate.writeTo(t, bw0Var.F2(), q22Var);
        return objWriteTo == a.g() ? objWriteTo : Unit.a;
    }

    @Override // com.google.inputmethod.lp8
    public T getDefaultValue() {
        return this.delegate.getDefaultValue();
    }
}
