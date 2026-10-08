package com.google.inputmethod;

import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginCreateCredentialResponse;
import android.service.credentials.CallingAppInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/android/el0;", "", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class el0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.google.android.el0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/google/android/el0$a;", "", "<init>", "()V", "Landroid/service/credentials/BeginCreateCredentialResponse$Builder;", "frameworkBuilder", "Lcom/google/android/ofa;", "remoteEntry", "", "d", "(Landroid/service/credentials/BeginCreateCredentialResponse$Builder;Lcom/google/android/ofa;)V", "", "Lcom/google/android/hd2;", "createEntries", "c", "(Landroid/service/credentials/BeginCreateCredentialResponse$Builder;Ljava/util/List;)V", "Landroid/service/credentials/BeginCreateCredentialRequest;", "request", "Lcom/google/android/sk0;", "b", "(Landroid/service/credentials/BeginCreateCredentialRequest;)Lcom/google/android/sk0;", "Lcom/google/android/tk0;", "response", "Landroid/service/credentials/BeginCreateCredentialResponse;", "a", "(Lcom/google/android/tk0;)Landroid/service/credentials/BeginCreateCredentialResponse;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void c(BeginCreateCredentialResponse.Builder frameworkBuilder, List<hd2> createEntries) {
            Iterator<T> it = createEntries.iterator();
            while (it.hasNext()) {
                Slice sliceB = hd2.INSTANCE.b((hd2) it.next());
                if (sliceB != null) {
                    frameworkBuilder.addCreateEntry(al0.a(sliceB));
                }
            }
        }

        private final void d(BeginCreateCredentialResponse.Builder frameworkBuilder, ofa remoteEntry) {
        }

        public final BeginCreateCredentialResponse a(tk0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            BeginCreateCredentialResponse.Builder builderA = bl0.a();
            c(builderA, response.a());
            response.b();
            d(builderA, null);
            BeginCreateCredentialResponse beginCreateCredentialResponseBuild = builderA.build();
            Intrinsics.checkNotNullExpressionValue(beginCreateCredentialResponseBuild, "frameworkBuilder.build()");
            return beginCreateCredentialResponseBuild;
        }

        public final sk0 b(BeginCreateCredentialRequest request) {
            y21 y21VarA;
            Intrinsics.checkNotNullParameter(request, "request");
            sk0.Companion companion = sk0.INSTANCE;
            String type = request.getType();
            Intrinsics.checkNotNullExpressionValue(type, "request.type");
            Bundle data = request.getData();
            Intrinsics.checkNotNullExpressionValue(data, "request.data");
            CallingAppInfo callingAppInfo = request.getCallingAppInfo();
            if (callingAppInfo != null) {
                y21.Companion companion2 = y21.INSTANCE;
                String packageName = callingAppInfo.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "it.packageName");
                SigningInfo signingInfo = callingAppInfo.getSigningInfo();
                Intrinsics.checkNotNullExpressionValue(signingInfo, "it.signingInfo");
                y21VarA = companion2.a(packageName, signingInfo, callingAppInfo.getOrigin());
            } else {
                y21VarA = null;
            }
            return companion.a(type, data, y21VarA);
        }

        private Companion() {
        }
    }
}
