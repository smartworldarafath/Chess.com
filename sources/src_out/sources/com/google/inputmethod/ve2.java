package com.google.inputmethod;

import android.app.slice.Slice;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00152\u00020\u0001:\u0003\u0003\t\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0003\u0010\u0011R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u000e\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/google/android/ve2;", "", "", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "type", "Lcom/google/android/il0;", "b", "Lcom/google/android/il0;", "()Lcom/google/android/il0;", "beginGetCredentialOption", "", "c", "Ljava/lang/CharSequence;", "d", "()Ljava/lang/CharSequence;", "entryGroupId", "", "Z", "f", "()Z", "isDefaultIconPreferredAsSingleProvider", "affiliatedDomain", "Lcom/google/android/mn0;", "biometricPromptData", "Lcom/google/android/mn0;", "()Lcom/google/android/mn0;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ve2 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final il0 beginGetCredentialOption;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final CharSequence entryGroupId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isDefaultIconPreferredAsSingleProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final CharSequence affiliatedDomain;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/ve2$a;", "", "<init>", "()V", "Lcom/google/android/ve2;", "entry", "Landroid/app/slice/Slice;", "a", "(Lcom/google/android/ve2;)Landroid/app/slice/Slice;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final Slice a(ve2 entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (entry instanceof z29) {
                return z29.INSTANCE.a((z29) entry);
            }
            if (entry instanceof lt9) {
                return lt9.INSTANCE.a((lt9) entry);
            }
            if (entry instanceof li2) {
                return li2.INSTANCE.a((li2) entry);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/ve2$b;", "", "<init>", "()V", "Lcom/google/android/ve2;", "entry", "Landroid/app/slice/Slice;", "a", "(Lcom/google/android/ve2;)Landroid/app/slice/Slice;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public static final b a = new b();

        private b() {
        }

        public static final Slice a(ve2 entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (entry instanceof z29) {
                return z29.INSTANCE.a((z29) entry);
            }
            if (entry instanceof lt9) {
                return lt9.INSTANCE.a((lt9) entry);
            }
            if (entry instanceof li2) {
                return li2.INSTANCE.a((li2) entry);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.ve2$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u000bR\u0014\u0010!\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\u000bR\u0014\u0010\"\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u000bR\u0014\u0010#\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\u000bR\u0014\u0010$\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\u000bR\u0014\u0010%\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\u000bR\u0014\u0010&\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\u000bR\u0014\u0010'\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\u000bR\u0014\u0010(\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\u000bR\u0014\u0010)\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010\u000bR\u0014\u0010*\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010\u000bR\u0014\u0010+\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010\u000bR\u0014\u0010,\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010\u000bR\u0014\u0010-\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010\u000bR\u0014\u0010.\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010\u000bR\u0014\u0010/\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010\u000bR\u0014\u00100\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010\u000b¨\u00061"}, d2 = {"Lcom/google/android/ve2$c;", "", "<init>", "()V", "Lcom/google/android/ve2;", "entry", "Landroid/app/slice/Slice;", "a", "(Lcom/google/android/ve2;)Landroid/app/slice/Slice;", "", "EXTRA_CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_PREFIX", "Ljava/lang/String;", "EXTRA_CREDENTIAL_ENTRY_ENTRY_GROUP_ID_PREFIX", "EXTRA_CREDENTIAL_ENTRY_ENTRY_TYPE_PREFIX", "EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX", "EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX", "EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX", "EXTRA_CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_PREFIX", "EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_PREFIX", "EXTRA_CREDENTIAL_ENTRY_OPTION_DATA_PREFIX", "EXTRA_CREDENTIAL_ENTRY_OPTION_ID_PREFIX", "EXTRA_CREDENTIAL_ENTRY_OPTION_TYPE_PREFIX", "EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX", "EXTRA_CREDENTIAL_ENTRY_SIZE", "EXTRA_CREDENTIAL_SUBTITLE_PREFIX", "EXTRA_CREDENTIAL_TITLE_PREFIX", "EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX", "EXTRA_CREDENTIAL_TYPE_ICON_PREFIX", "FALSE_STRING", "", "REVISION_ID", "I", "SLICE_HINT_AFFILIATED_DOMAIN", "SLICE_HINT_ALLOWED_AUTHENTICATORS", "SLICE_HINT_AUTO_ALLOWED", "SLICE_HINT_AUTO_SELECT_FROM_OPTION", "SLICE_HINT_BIOMETRIC_PROMPT_DATA", "SLICE_HINT_CRYPTO_OP_ID", "SLICE_HINT_DEDUPLICATION_ID", "SLICE_HINT_DEFAULT_ICON_RES_ID", "SLICE_HINT_ICON", "SLICE_HINT_IS_DEFAULT_ICON_PREFERRED", "SLICE_HINT_LAST_USED_TIME_MILLIS", "SLICE_HINT_OPTION_ID", "SLICE_HINT_PENDING_INTENT", "SLICE_HINT_SUBTITLE", "SLICE_HINT_TITLE", "SLICE_HINT_TYPE_DISPLAY_NAME", "TRUE_STRING", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Slice a(ve2 entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return Build.VERSION.SDK_INT >= 35 ? b.a(entry) : a.a(entry);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CharSequence getAffiliatedDomain() {
        return this.affiliatedDomain;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final il0 getBeginGetCredentialOption() {
        return this.beginGetCredentialOption;
    }

    public final mn0 c() {
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CharSequence getEntryGroupId() {
        return this.entryGroupId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsDefaultIconPreferredAsSingleProvider() {
        return this.isDefaultIconPreferredAsSingleProvider;
    }
}
