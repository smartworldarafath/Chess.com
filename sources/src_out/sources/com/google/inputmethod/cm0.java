package com.google.inputmethod;

import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.BeginGetCredentialResponse;
import android.service.credentials.CallingAppInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/android/cm0;", "", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class cm0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.google.android.cm0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ%\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/google/android/cm0$a;", "", "<init>", "()V", "Landroid/service/credentials/BeginGetCredentialResponse$Builder;", "frameworkBuilder", "Lcom/google/android/ofa;", "remoteEntry", "", "f", "(Landroid/service/credentials/BeginGetCredentialResponse$Builder;Lcom/google/android/ofa;)V", "", "Lcom/google/android/p70;", "authenticationActions", "d", "(Landroid/service/credentials/BeginGetCredentialResponse$Builder;Ljava/util/List;)V", "builder", "Lcom/google/android/k7;", "actionEntries", "c", "Lcom/google/android/ve2;", "credentialEntries", "e", "Landroid/service/credentials/BeginGetCredentialRequest;", "request", "Lcom/google/android/jl0;", "b", "(Landroid/service/credentials/BeginGetCredentialRequest;)Lcom/google/android/jl0;", "Lcom/google/android/kl0;", "response", "Landroid/service/credentials/BeginGetCredentialResponse;", "a", "(Lcom/google/android/kl0;)Landroid/service/credentials/BeginGetCredentialResponse;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void c(BeginGetCredentialResponse.Builder builder, List<k7> actionEntries) {
            for (k7 k7Var : actionEntries) {
                zl0.a();
                builder.addAction(yl0.a(k7.INSTANCE.a(k7Var)));
            }
        }

        private final void d(BeginGetCredentialResponse.Builder frameworkBuilder, List<p70> authenticationActions) {
            for (p70 p70Var : authenticationActions) {
                zl0.a();
                frameworkBuilder.addAuthenticationAction(yl0.a(p70.INSTANCE.a(p70Var)));
            }
        }

        private final void e(BeginGetCredentialResponse.Builder builder, List<? extends ve2> credentialEntries) {
            for (ve2 ve2Var : credentialEntries) {
                Slice sliceA = ve2.INSTANCE.a(ve2Var);
                if (sliceA != null) {
                    ml0.a();
                    nl0.a();
                    builder.addCredentialEntry(bm0.a(am0.a(ve2Var.getBeginGetCredentialOption().getId(), ve2Var.getType(), Bundle.EMPTY), sliceA));
                }
            }
        }

        private final void f(BeginGetCredentialResponse.Builder frameworkBuilder, ofa remoteEntry) {
        }

        public final BeginGetCredentialResponse a(kl0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            BeginGetCredentialResponse.Builder builderA = ol0.a();
            e(builderA, response.c());
            c(builderA, response.a());
            d(builderA, response.b());
            response.d();
            f(builderA, null);
            BeginGetCredentialResponse beginGetCredentialResponseBuild = builderA.build();
            Intrinsics.checkNotNullExpressionValue(beginGetCredentialResponseBuild, "frameworkBuilder.build()");
            return beginGetCredentialResponseBuild;
        }

        public final jl0 b(BeginGetCredentialRequest request) {
            y21 y21VarA;
            Intrinsics.checkNotNullParameter(request, "request");
            ArrayList arrayList = new ArrayList();
            List beginGetCredentialOptions = request.getBeginGetCredentialOptions();
            Intrinsics.checkNotNullExpressionValue(beginGetCredentialOptions, "request.beginGetCredentialOptions");
            Iterator it = beginGetCredentialOptions.iterator();
            while (it.hasNext()) {
                BeginGetCredentialOption beginGetCredentialOptionA = tl0.a(it.next());
                il0.Companion companion = il0.INSTANCE;
                String id = beginGetCredentialOptionA.getId();
                Intrinsics.checkNotNullExpressionValue(id, "it.id");
                String type = beginGetCredentialOptionA.getType();
                Intrinsics.checkNotNullExpressionValue(type, "it.type");
                Bundle candidateQueryData = beginGetCredentialOptionA.getCandidateQueryData();
                Intrinsics.checkNotNullExpressionValue(candidateQueryData, "it.candidateQueryData");
                arrayList.add(companion.a(id, type, candidateQueryData));
            }
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
            return new jl0(arrayList, y21VarA);
        }

        private Companion() {
        }
    }
}
