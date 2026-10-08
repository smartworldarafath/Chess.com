package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/google/android/n0e;", "Lcom/google/android/zn8;", "delegate", "", "originalLength", "transformedLength", "<init>", "(Lcom/google/android/zn8;II)V", "offset", "b", "(I)I", "a", "Lcom/google/android/zn8;", "c", "I", "d", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n0e implements zn8 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final zn8 delegate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int originalLength;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int transformedLength;

    public n0e(zn8 zn8Var, int i, int i2) {
        this.delegate = zn8Var;
        this.originalLength = i;
        this.transformedLength = i2;
    }

    @Override // com.google.inputmethod.zn8
    public int a(int offset) {
        int iA = this.delegate.a(offset);
        if (offset >= 0 && offset <= this.transformedLength) {
            o0e.h(iA, this.originalLength, offset);
        }
        return iA;
    }

    @Override // com.google.inputmethod.zn8
    public int b(int offset) {
        int iB = this.delegate.b(offset);
        if (offset >= 0 && offset <= this.originalLength) {
            o0e.g(iB, this.transformedLength, offset);
        }
        return iB;
    }
}
