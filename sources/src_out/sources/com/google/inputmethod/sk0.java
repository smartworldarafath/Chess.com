package com.google.inputmethod;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u0000 \u00162\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/google/android/sk0;", "", "", "type", "Landroid/os/Bundle;", "candidateQueryData", "Lcom/google/android/y21;", "callingAppInfo", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Lcom/google/android/y21;)V", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "b", "Landroid/os/Bundle;", "getCandidateQueryData", "()Landroid/os/Bundle;", "c", "Lcom/google/android/y21;", "getCallingAppInfo", "()Lcom/google/android/y21;", "d", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class sk0 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Bundle candidateQueryData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final y21 callingAppInfo;

    /* JADX INFO: renamed from: com.google.android.sk0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/android/sk0$a;", "", "<init>", "()V", "", "type", "Landroid/os/Bundle;", "candidateQueryData", "Lcom/google/android/y21;", "callingAppInfo", "Lcom/google/android/sk0;", "a", "(Ljava/lang/String;Landroid/os/Bundle;Lcom/google/android/y21;)Lcom/google/android/sk0;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final sk0 a(String type, Bundle candidateQueryData, y21 callingAppInfo) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
            try {
                if (Intrinsics.e(type, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return gl0.INSTANCE.a(candidateQueryData, callingAppInfo);
                }
                return Intrinsics.e(type, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL") ? hl0.INSTANCE.a(candidateQueryData, callingAppInfo) : new fl0(type, candidateQueryData, callingAppInfo);
            } catch (FrameworkClassParsingException unused) {
                return new fl0(type, candidateQueryData, callingAppInfo);
            }
        }

        private Companion() {
        }
    }

    public sk0(String str, Bundle bundle, y21 y21Var) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(bundle, "candidateQueryData");
        this.type = str;
        this.candidateQueryData = bundle;
        this.callingAppInfo = y21Var;
    }
}
