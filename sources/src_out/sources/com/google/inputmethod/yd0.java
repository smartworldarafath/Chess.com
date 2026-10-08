package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0090\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0090\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/google/android/yd0;", "Lcom/google/android/py7;", "Lcom/google/android/sy7;", "element", "<init>", "(Lcom/google/android/sy7;)V", "T", "Lcom/google/android/my7;", "key", "b", "(Lcom/google/android/my7;)Ljava/lang/Object;", "", "a", "(Lcom/google/android/my7;)Z", "Lcom/google/android/sy7;", "getElement", "()Lcom/google/android/sy7;", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class yd0 extends py7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private sy7<?> element;

    public yd0(sy7<?> sy7Var) {
        super(null);
        this.element = sy7Var;
    }

    @Override // com.google.inputmethod.py7
    public boolean a(my7<?> key) {
        return key == this.element.getKey();
    }

    @Override // com.google.inputmethod.py7
    public <T> T b(my7<T> key) {
        if (!(key == this.element.getKey())) {
            zw5.c("Check failed.");
        }
        return (T) this.element.getValue();
    }

    public final void c(sy7<?> sy7Var) {
        this.element = sy7Var;
    }
}
