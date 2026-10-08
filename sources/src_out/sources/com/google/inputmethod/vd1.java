package com.google.inputmethod;

import android.content.pm.SigningInfo;
import android.service.credentials.ClearCredentialStateRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/android/vd1;", "", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class vd1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.google.android.vd1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/vd1$a;", "", "<init>", "()V", "Landroid/service/credentials/ClearCredentialStateRequest;", "request", "Lcom/google/android/rs9;", "a", "(Landroid/service/credentials/ClearCredentialStateRequest;)Lcom/google/android/rs9;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final rs9 a(ClearCredentialStateRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            y21.Companion companion = y21.INSTANCE;
            String packageName = request.getCallingAppInfo().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "request.callingAppInfo.packageName");
            SigningInfo signingInfo = request.getCallingAppInfo().getSigningInfo();
            Intrinsics.checkNotNullExpressionValue(signingInfo, "request.callingAppInfo.signingInfo");
            return new rs9(companion.a(packageName, signingInfo, request.getCallingAppInfo().getOrigin()));
        }

        private Companion() {
        }
    }
}
