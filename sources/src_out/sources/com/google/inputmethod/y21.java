package com.google.inputmethod;

import android.content.pm.SigningInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 \"2\u00020\u0001:\u0001\u0013B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00078G@BX\u0086.¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/google/android/y21;", "", "", "packageName", "origin", "Lcom/google/android/npb;", "signingInfoCompat", "Landroid/content/pm/SigningInfo;", "signingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/npb;Landroid/content/pm/SigningInfo;)V", "(Ljava/lang/String;Landroid/content/pm/SigningInfo;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "b", "getOrigin$credentials_release", "c", "Lcom/google/android/npb;", "getSigningInfoCompat", "()Lcom/google/android/npb;", "<set-?>", "d", "Landroid/content/pm/SigningInfo;", "getSigningInfo", "()Landroid/content/pm/SigningInfo;", "e", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y21 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String packageName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String origin;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final npb signingInfoCompat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private SigningInfo signingInfo;

    /* JADX INFO: renamed from: com.google.android.y21$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/google/android/y21$a;", "", "<init>", "()V", "", "packageName", "Landroid/content/pm/SigningInfo;", "signingInfo", "origin", "Lcom/google/android/y21;", "a", "(Ljava/lang/String;Landroid/content/pm/SigningInfo;Ljava/lang/String;)Lcom/google/android/y21;", "EXTRA_CREDENTIAL_REQUEST_ORIGIN", "Ljava/lang/String;", "EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME", "EXTRA_CREDENTIAL_REQUEST_SIGNATURES", "EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y21 a(String packageName, SigningInfo signingInfo, String origin) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(signingInfo, "signingInfo");
            return new y21(packageName, signingInfo, origin);
        }

        private Companion() {
        }
    }

    private y21(String str, String str2, npb npbVar, SigningInfo signingInfo) {
        this.packageName = str;
        this.origin = str2;
        this.signingInfoCompat = npbVar;
        Intrinsics.g(signingInfo);
        this.signingInfo = signingInfo;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("packageName must not be empty");
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof y21)) {
            return false;
        }
        y21 y21Var = (y21) other;
        return Intrinsics.e(this.packageName, y21Var.packageName) && Intrinsics.e(this.origin, y21Var.origin) && Intrinsics.e(this.signingInfoCompat, y21Var.signingInfoCompat);
    }

    public int hashCode() {
        int iHashCode = this.packageName.hashCode() * 31;
        String str = this.origin;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.signingInfoCompat.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y21(String str, SigningInfo signingInfo, String str2) {
        this(str, str2, npb.INSTANCE.a(signingInfo), signingInfo);
        Intrinsics.checkNotNullParameter(str, "packageName");
        Intrinsics.checkNotNullParameter(signingInfo, "signingInfo");
    }
}
