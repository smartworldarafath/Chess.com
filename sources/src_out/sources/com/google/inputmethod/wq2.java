package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/wq2;", "T", "Lcom/google/android/vq2;", "Lcom/google/android/zg4;", "floatDecaySpec", "<init>", "(Lcom/google/android/zg4;)V", "Lcom/google/android/ur;", "V", "Lcom/google/android/tjd;", "typeConverter", "Lcom/google/android/h3e;", "a", "(Lcom/google/android/tjd;)Lcom/google/android/h3e;", "Lcom/google/android/zg4;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class wq2<T> implements vq2<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final zg4 floatDecaySpec;

    public wq2(zg4 zg4Var) {
        this.floatDecaySpec = zg4Var;
    }

    @Override // com.google.inputmethod.vq2
    public <V extends ur> h3e<V> a(tjd<T, V> typeConverter) {
        return new l3e(this.floatDecaySpec);
    }
}
