package com.google.inputmethod;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.PublicKey;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.collections.l0;
import kotlin.collections.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\u0018\u0000 &2\u00020\u0001:\u0001\u0015BK\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0014R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\f\u0010$R\u001a\u0010\r\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b\r\u0010$¨\u0006'"}, d2 = {"Lcom/google/android/npb;", "", "", "Landroid/content/pm/Signature;", "signingCertificateHistory", "apkContentsSigners", "", "Ljava/security/PublicKey;", "publicKeys", "", "schemeVersion", "", "hasPastSigningCertificates", "hasMultipleSigners", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/Collection;IZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/util/List;", "getSigningCertificateHistory", "()Ljava/util/List;", "b", "getApkContentsSigners", "c", "Ljava/util/Collection;", "getPublicKeys", "()Ljava/util/Collection;", "d", "I", "getSchemeVersion", "e", "Z", "()Z", "f", "g", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class npb {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<Signature> signingCertificateHistory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<Signature> apkContentsSigners;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Collection<PublicKey> publicKeys;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int schemeVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean hasPastSigningCertificates;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean hasMultipleSigners;

    /* JADX INFO: renamed from: com.google.android.npb$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/npb$a;", "", "<init>", "()V", "Landroid/content/pm/SigningInfo;", "signingInfo", "Lcom/google/android/npb;", "a", "(Landroid/content/pm/SigningInfo;)Lcom/google/android/npb;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final npb a(SigningInfo signingInfo) {
            List listP;
            Set setE;
            List listP2;
            Intrinsics.checkNotNullParameter(signingInfo, "signingInfo");
            Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
            if (apkContentsSigners == null || (listP = f.k0(apkContentsSigners)) == null) {
                listP = m.p();
            }
            List list = listP;
            int i = Build.VERSION.SDK_INT;
            if (i < 35 || (setE = signingInfo.getPublicKeys()) == null) {
                setE = l0.e();
            }
            Collection collection = setE;
            int schemeVersion = i >= 35 ? signingInfo.getSchemeVersion() : 0;
            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            if (signingCertificateHistory == null || (listP2 = f.k0(signingCertificateHistory)) == null) {
                listP2 = m.p();
            }
            return new npb(listP2, list, collection, schemeVersion, signingInfo.hasPastSigningCertificates(), signingInfo.hasMultipleSigners());
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public npb(List<? extends Signature> list, List<? extends Signature> list2, Collection<? extends PublicKey> collection, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "signingCertificateHistory");
        Intrinsics.checkNotNullParameter(list2, "apkContentsSigners");
        Intrinsics.checkNotNullParameter(collection, "publicKeys");
        this.signingCertificateHistory = list;
        this.apkContentsSigners = list2;
        this.publicKeys = collection;
        this.schemeVersion = i;
        this.hasPastSigningCertificates = z;
        this.hasMultipleSigners = z2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof npb)) {
            return false;
        }
        npb npbVar = (npb) other;
        return Intrinsics.e(this.signingCertificateHistory, npbVar.signingCertificateHistory) && Intrinsics.e(this.apkContentsSigners, npbVar.apkContentsSigners) && Intrinsics.e(this.publicKeys, npbVar.publicKeys) && this.schemeVersion == npbVar.schemeVersion && this.hasPastSigningCertificates == npbVar.hasPastSigningCertificates && this.hasMultipleSigners == npbVar.hasMultipleSigners;
    }

    public int hashCode() {
        return (((((((((this.signingCertificateHistory.hashCode() * 31) + this.apkContentsSigners.hashCode()) * 31) + this.publicKeys.hashCode()) * 31) + this.schemeVersion) * 31) + Boolean.hashCode(this.hasPastSigningCertificates)) * 31) + Boolean.hashCode(this.hasMultipleSigners);
    }
}
