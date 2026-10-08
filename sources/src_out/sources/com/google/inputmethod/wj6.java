package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/android/wj6;", "T", "", "value", "Lcom/google/android/vl3;", "easing", "<init>", "(Ljava/lang/Object;Lcom/google/android/vl3;)V", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lcom/google/android/vl3;", "()Lcom/google/android/vl3;", "c", "(Lcom/google/android/vl3;)V", "Lcom/google/android/zj6$a;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class wj6<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final T value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private vl3 easing;

    public /* synthetic */ wj6(Object obj, vl3 vl3Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, vl3Var);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final vl3 getEasing() {
        return this.easing;
    }

    public final T b() {
        return this.value;
    }

    public final void c(vl3 vl3Var) {
        this.easing = vl3Var;
    }

    private wj6(T t, vl3 vl3Var) {
        this.value = t;
        this.easing = vl3Var;
    }
}
