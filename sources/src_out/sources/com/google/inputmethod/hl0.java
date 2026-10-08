package com.google.inputmethod;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u00172\u00020\u0001:\u0001\rB/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/google/android/hl0;", "Lcom/google/android/sk0;", "", "requestJson", "Lcom/google/android/y21;", "callingAppInfo", "Landroid/os/Bundle;", "candidateQueryData", "", "clientDataHash", "<init>", "(Ljava/lang/String;Lcom/google/android/y21;Landroid/os/Bundle;[B)V", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;)V", "e", "Ljava/lang/String;", "getRequestJson", "()Ljava/lang/String;", "f", "[B", "getClientDataHash", "()[B", "g", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class hl0 extends sk0 {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String requestJson;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final byte[] clientDataHash;

    /* JADX INFO: renamed from: com.google.android.hl0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/hl0$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "data", "Lcom/google/android/y21;", "callingAppInfo", "Lcom/google/android/hl0;", "a", "(Landroid/os/Bundle;Lcom/google/android/y21;)Lcom/google/android/hl0;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final hl0 a(Bundle data, y21 callingAppInfo) throws FrameworkClassParsingException {
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = data.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                Intrinsics.g(string);
                return new hl0(string, callingAppInfo, data, byteArray);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl0(String str, y21 y21Var, Bundle bundle, byte[] bArr) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, y21Var);
        Intrinsics.checkNotNullParameter(str, "requestJson");
        Intrinsics.checkNotNullParameter(bundle, "candidateQueryData");
        this.requestJson = str;
        this.clientDataHash = bArr;
        if (!tja.INSTANCE.a(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
        a(bundle, str);
    }

    private final void a(Bundle candidateQueryData, String requestJson) {
        candidateQueryData.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
    }
}
