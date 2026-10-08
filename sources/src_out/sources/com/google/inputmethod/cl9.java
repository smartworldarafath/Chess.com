package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/google/android/cl9;", "", "<init>", "()V", "contentType", "Lcom/google/android/ub0;", "a", "(Ljava/lang/Object;)Lcom/google/android/ub0;", "Lcom/google/android/k58;", "Lcom/google/android/k58;", "averagesByContentType", "b", "Ljava/lang/Object;", "lastUsedContentType", "c", "Lcom/google/android/ub0;", "lastUsedAverage", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class cl9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final k58<Object, ub0> averagesByContentType = k4b.c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Object lastUsedContentType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ub0 lastUsedAverage;

    public final ub0 a(Object contentType) {
        ub0 ub0Var = this.lastUsedAverage;
        if (this.lastUsedContentType == contentType && ub0Var != null) {
            return ub0Var;
        }
        k58<Object, ub0> k58Var = this.averagesByContentType;
        ub0 ub0VarE = k58Var.e(contentType);
        if (ub0VarE == null) {
            ub0VarE = new ub0();
            k58Var.x(contentType, ub0VarE);
        }
        ub0 ub0Var2 = ub0VarE;
        this.lastUsedContentType = contentType;
        this.lastUsedAverage = ub0Var2;
        return ub0Var2;
    }
}
