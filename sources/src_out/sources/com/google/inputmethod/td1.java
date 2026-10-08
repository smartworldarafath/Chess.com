package com.google.inputmethod;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0006B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/google/android/td1;", "", "", "requestType", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "requestBundle", "c", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class td1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String requestType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Bundle requestBundle;

    public td1(String str) {
        Intrinsics.checkNotNullParameter(str, "requestType");
        this.requestType = str;
        Bundle bundle = new Bundle();
        this.requestBundle = bundle;
        if (Intrinsics.e(str, "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE") || Intrinsics.e(str, "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            if (Intrinsics.e(str, "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
                bundle.putBoolean("androidx.credentials.BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST", true);
            }
        } else {
            throw new IllegalArgumentException("The request type " + str + " is not supported.");
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bundle getRequestBundle() {
        return this.requestBundle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRequestType() {
        return this.requestType;
    }

    public /* synthetic */ td1(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE" : str);
    }
}
