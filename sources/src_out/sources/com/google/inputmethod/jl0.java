package com.google.inputmethod;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00112\u00020\u0001:\u0001\tB#\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/android/jl0;", "", "", "Lcom/google/android/il0;", "beginGetCredentialOptions", "Lcom/google/android/y21;", "callingAppInfo", "<init>", "(Ljava/util/List;Lcom/google/android/y21;)V", "a", "Ljava/util/List;", "getBeginGetCredentialOptions", "()Ljava/util/List;", "b", "Lcom/google/android/y21;", "getCallingAppInfo", "()Lcom/google/android/y21;", "c", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class jl0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<il0> beginGetCredentialOptions;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final y21 callingAppInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public jl0(List<? extends il0> list, y21 y21Var) {
        Intrinsics.checkNotNullParameter(list, "beginGetCredentialOptions");
        this.beginGetCredentialOptions = list;
        this.callingAppInfo = y21Var;
    }
}
