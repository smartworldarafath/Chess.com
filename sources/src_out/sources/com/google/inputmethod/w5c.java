package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\b\b\u0001\u0010\t*\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/google/android/w5c;", "T", "Lcom/google/android/kr;", "animationSpec", "", "startDelayNanos", "<init>", "(Lcom/google/android/kr;J)V", "Lcom/google/android/ur;", "V", "Lcom/google/android/tjd;", "converter", "Lcom/google/android/f3e;", "a", "(Lcom/google/android/tjd;)Lcom/google/android/f3e;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/kr;", "getAnimationSpec", "()Lcom/google/android/kr;", "b", "J", "getStartDelayNanos", "()J", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class w5c<T> implements kr<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final kr<T> animationSpec;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long startDelayNanos;

    public w5c(kr<T> krVar, long j) {
        this.animationSpec = krVar;
        this.startDelayNanos = j;
    }

    @Override // com.google.inputmethod.kr
    public <V extends ur> f3e<V> a(tjd<T, V> converter) {
        return new x5c(this.animationSpec.a(converter), this.startDelayNanos);
    }

    public boolean equals(Object other) {
        if (!(other instanceof w5c)) {
            return false;
        }
        w5c w5cVar = (w5c) other;
        return w5cVar.startDelayNanos == this.startDelayNanos && Intrinsics.e(w5cVar.animationSpec, this.animationSpec);
    }

    public int hashCode() {
        return (this.animationSpec.hashCode() * 31) + Long.hashCode(this.startDelayNanos);
    }
}
