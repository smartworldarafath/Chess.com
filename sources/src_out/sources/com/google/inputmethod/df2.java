package com.google.inputmethod;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import androidx.credentials.CredentialProviderFrameworkImpl;
import androidx.credentials.b;
import androidx.credentials.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\bJ'\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR*\u0010!\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R.\u0010&\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00068G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010%R.\u0010*\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00068G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010%¨\u0006+"}, d2 = {"Lcom/google/android/df2;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/google/android/ze2;", "g", "()Lcom/google/android/ze2;", "f", "", "", "classNames", "e", "(Ljava/util/List;Landroid/content/Context;)Lcom/google/android/ze2;", "a", "(Landroid/content/Context;)Ljava/util/List;", "request", "", "shouldFallbackToPreU", "b", "(Ljava/lang/Object;Z)Lcom/google/android/ze2;", "c", "(Z)Lcom/google/android/ze2;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<set-?>", "Z", "getTestMode", "()Z", "setTestMode", "(Z)V", "testMode", "Lcom/google/android/ze2;", "getTestPostUProvider", "setTestPostUProvider", "(Lcom/google/android/ze2;)V", "testPostUProvider", "d", "getTestPreUProvider", "setTestPreUProvider", "testPreUProvider", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class df2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean testMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ze2 testPostUProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private ze2 testPreUProvider;

    public df2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final List<String> a(Context context) throws PackageManager.NameNotFoundException {
        String string;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            Intrinsics.g(serviceInfoArr);
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        return m.y1(arrayList);
    }

    public static /* synthetic */ ze2 d(df2 df2Var, Object obj, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        return df2Var.b(obj, z);
    }

    private final ze2 e(List<String> classNames, Context context) {
        Iterator<String> it = classNames.iterator();
        ze2 ze2Var = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName(it.next()).getConstructor(Context.class).newInstance(context);
                Intrinsics.h(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                ze2 ze2Var2 = (ze2) objNewInstance;
                if (!ze2Var2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (ze2Var != null) {
                        return null;
                    }
                    ze2Var = ze2Var2;
                }
            } catch (Throwable unused) {
            }
        }
        return ze2Var;
    }

    private final ze2 f() {
        if (!this.testMode) {
            CredentialProviderFrameworkImpl credentialProviderFrameworkImpl = new CredentialProviderFrameworkImpl(this.context);
            if (credentialProviderFrameworkImpl.isAvailableOnDevice()) {
                return credentialProviderFrameworkImpl;
            }
            return null;
        }
        ze2 ze2Var = this.testPostUProvider;
        if (ze2Var == null) {
            return null;
        }
        Intrinsics.g(ze2Var);
        if (ze2Var.isAvailableOnDevice()) {
            return this.testPostUProvider;
        }
        return null;
    }

    private final ze2 g() throws PackageManager.NameNotFoundException {
        if (!this.testMode) {
            List<String> listA = a(this.context);
            if (listA.isEmpty()) {
                return null;
            }
            return e(listA, this.context);
        }
        ze2 ze2Var = this.testPreUProvider;
        if (ze2Var == null) {
            return null;
        }
        Intrinsics.g(ze2Var);
        if (ze2Var.isAvailableOnDevice()) {
            return this.testPreUProvider;
        }
        return null;
    }

    public final ze2 b(Object request, boolean shouldFallbackToPreU) {
        Intrinsics.checkNotNullParameter(request, "request");
        if ((request instanceof pd2) || Intrinsics.e(request, "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return g();
        }
        if (request instanceof d) {
            for (b bVar : ((d) request).a()) {
                if ((bVar instanceof sw4) || (bVar instanceof kw4)) {
                    return g();
                }
            }
        }
        return c(shouldFallbackToPreU);
    }

    public final ze2 c(boolean shouldFallbackToPreU) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ze2 ze2VarF = f();
            return (ze2VarF == null && shouldFallbackToPreU) ? g() : ze2VarF;
        }
        if (i <= 33) {
            return g();
        }
        return null;
    }
}
