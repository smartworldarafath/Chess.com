package com.google.inputmethod;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.l0;
import kotlin.collections.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/google/android/em0;", "Lcom/google/android/il0;", "", "", "allowedUserIds", "Landroid/os/Bundle;", "candidateQueryData", "id", "<init>", "(Ljava/util/Set;Landroid/os/Bundle;Ljava/lang/String;)V", "e", "Ljava/util/Set;", "getAllowedUserIds", "()Ljava/util/Set;", "f", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class em0 extends il0 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Set<String> allowedUserIds;

    /* JADX INFO: renamed from: com.google.android.em0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/em0$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "data", "", "id", "Lcom/google/android/em0;", "a", "(Landroid/os/Bundle;Ljava/lang/String;)Lcom/google/android/em0;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final em0 a(Bundle data, String id) {
            Set setE;
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(id, "id");
            ArrayList<String> stringArrayList = data.getStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS");
            if (stringArrayList == null || (setE = m.D1(stringArrayList)) == null) {
                setE = l0.e();
            }
            return new em0(setE, data, id);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em0(Set<String> set, Bundle bundle, String str) {
        super(str, "android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        Intrinsics.checkNotNullParameter(set, "allowedUserIds");
        Intrinsics.checkNotNullParameter(bundle, "candidateQueryData");
        Intrinsics.checkNotNullParameter(str, "id");
        this.allowedUserIds = set;
    }
}
