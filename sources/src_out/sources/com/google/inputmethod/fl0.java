package com.google.inputmethod;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/fl0;", "Lcom/google/android/sk0;", "", "type", "Landroid/os/Bundle;", "candidateQueryData", "Lcom/google/android/y21;", "callingAppInfo", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Lcom/google/android/y21;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class fl0 extends sk0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl0(String str, Bundle bundle, y21 y21Var) {
        super(str, bundle, y21Var);
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(bundle, "candidateQueryData");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
