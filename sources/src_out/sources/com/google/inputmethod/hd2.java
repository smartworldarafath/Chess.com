package com.google.inputmethod;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.time.Instant;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u00020\u0001:\u0003\u0003\u0005\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0017\u0010#\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u000e\u0010'¨\u0006("}, d2 = {"Lcom/google/android/hd2;", "", "", "a", "Ljava/lang/CharSequence;", "b", "()Ljava/lang/CharSequence;", "accountName", "Landroid/app/PendingIntent;", "Landroid/app/PendingIntent;", "g", "()Landroid/app/PendingIntent;", "pendingIntent", "Landroid/graphics/drawable/Icon;", "c", "Landroid/graphics/drawable/Icon;", "e", "()Landroid/graphics/drawable/Icon;", "icon", "d", "description", "Ljava/time/Instant;", "Ljava/time/Instant;", "f", "()Ljava/time/Instant;", "lastUsedTime", "", "", "", "Ljava/util/Map;", "credentialCountInformationMap", "", "Z", "h", "()Z", "isAutoSelectAllowed", "Lcom/google/android/mn0;", "biometricPromptData", "Lcom/google/android/mn0;", "()Lcom/google/android/mn0;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class hd2 {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CharSequence accountName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final PendingIntent pendingIntent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Icon icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final CharSequence description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Instant lastUsedTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Map<String, Integer> credentialCountInformationMap;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isAutoSelectAllowed;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/hd2$a;", "", "<init>", "()V", "Lcom/google/android/hd2;", "createEntry", "Landroid/app/slice/Slice;", "b", "(Lcom/google/android/hd2;)Landroid/app/slice/Slice;", "Landroid/app/slice/Slice$Builder;", "a", "(Lcom/google/android/hd2;)Landroid/app/slice/Slice$Builder;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final Slice b(hd2 createEntry) {
            Intrinsics.checkNotNullParameter(createEntry, "createEntry");
            Slice sliceBuild = a.a(createEntry).build();
            Intrinsics.checkNotNullExpressionValue(sliceBuild, "sliceBuilder.build()");
            return sliceBuild;
        }

        public final Slice.Builder a(hd2 createEntry) {
            Intrinsics.checkNotNullParameter(createEntry, "createEntry");
            CharSequence accountName = createEntry.getAccountName();
            Icon icon = createEntry.getIcon();
            CharSequence description = createEntry.getDescription();
            Instant lastUsedTime = createEntry.getLastUsedTime();
            Map<String, Integer> map = createEntry.credentialCountInformationMap;
            PendingIntent pendingIntent = createEntry.getPendingIntent();
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec("CreateEntry", 1));
            String str = createEntry.getIsAutoSelectAllowed() ? "true" : "false";
            builder.addText(accountName, null, m.e("androidx.credentials.provider.createEntry.SLICE_HINT_USER_PROVIDER_ACCOUNT_NAME"));
            if (lastUsedTime != null) {
                builder.addLong(lastUsedTime.toEpochMilli(), null, m.e("androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS"));
            }
            if (description != null) {
                builder.addText(description, null, m.e("androidx.credentials.provider.createEntry.SLICE_HINT_NOTE"));
            }
            if (icon != null) {
                builder.addIcon(icon, null, m.e("androidx.credentials.provider.createEntry.SLICE_HINT_PROFILE_ICON"));
            }
            Companion companion = hd2.INSTANCE;
            if (companion.a(map) != null) {
                builder.addBundle(companion.a(map), null, m.e("androidx.credentials.provider.createEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION"));
            }
            builder.addAction(pendingIntent, new Slice.Builder(builder).addHints(Collections.singletonList("androidx.credentials.provider.createEntry.SLICE_HINT_PENDING_INTENT")).build(), null).addText(str, null, m.e("androidx.credentials.provider.createEntry.SLICE_HINT_AUTO_SELECT_ALLOWED"));
            return builder;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/android/hd2$b;", "", "<init>", "()V", "Lcom/google/android/hd2;", "createEntry", "Landroid/app/slice/Slice$Builder;", "sliceBuilder", "", "a", "(Lcom/google/android/hd2;Landroid/app/slice/Slice$Builder;)V", "Landroid/app/slice/Slice;", "b", "(Lcom/google/android/hd2;)Landroid/app/slice/Slice;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {
        public static final b a = new b();

        private b() {
        }

        private final void a(hd2 createEntry, Slice.Builder sliceBuilder) {
            createEntry.c();
        }

        public static final Slice b(hd2 createEntry) {
            Intrinsics.checkNotNullParameter(createEntry, "createEntry");
            Slice.Builder builderA = a.a.a(createEntry);
            a.a(createEntry, builderA);
            Slice sliceBuild = builderA.build();
            Intrinsics.checkNotNullExpressionValue(sliceBuild, "sliceBuilder.build()");
            return sliceBuild;
        }
    }

    /* JADX INFO: renamed from: com.google.android.hd2$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u0014\u0010 \u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0011R\u0014\u0010!\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0011R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0011R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0011R\u0014\u0010%\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0011R\u0014\u0010&\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0011R\u0014\u0010'\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0011R\u0014\u0010(\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u0011R\u0014\u0010)\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0011R\u0014\u0010*\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/google/android/hd2$c;", "", "<init>", "()V", "Lcom/google/android/hd2;", "createEntry", "Landroid/app/slice/Slice;", "b", "(Lcom/google/android/hd2;)Landroid/app/slice/Slice;", "", "", "", "credentialCountInformationMap", "Landroid/os/Bundle;", "a", "(Ljava/util/Map;)Landroid/os/Bundle;", "AUTO_SELECT_FALSE_STRING", "Ljava/lang/String;", "AUTO_SELECT_TRUE_STRING", "DESCRIPTION_MAX_CHAR_LIMIT", "I", "EXTRA_CREATE_ACCOUNT_NAME_PREFIX", "EXTRA_CREATE_CREDENTIAL_COUNT_INFO_PREFIX", "EXTRA_CREATE_DESCRIPTION_PREFIX", "EXTRA_CREATE_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX", "EXTRA_CREATE_ENTRY_LAST_USED_TIME_PREFIX", "EXTRA_CREATE_ENTRY_PENDING_INTENT_PREFIX", "EXTRA_CREATE_ENTRY_SIZE", "EXTRA_CREATE_TYPE_ICON_PREFIX", "REVISION_ID", "SLICE_HINT_ACCOUNT_NAME", "SLICE_HINT_ALLOWED_AUTHENTICATORS", "SLICE_HINT_AUTO_SELECT_ALLOWED", "SLICE_HINT_BIOMETRIC_PROMPT_DATA", "SLICE_HINT_CREDENTIAL_COUNT_INFORMATION", "SLICE_HINT_CRYPTO_OP_ID", "SLICE_HINT_ICON", "SLICE_HINT_LAST_USED_TIME_MILLIS", "SLICE_HINT_NOTE", "SLICE_HINT_PENDING_INTENT", "SLICE_SPEC_TYPE", "TAG", "TYPE_TOTAL_CREDENTIAL", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bundle a(Map<String, Integer> credentialCountInformationMap) {
            Intrinsics.checkNotNullParameter(credentialCountInformationMap, "credentialCountInformationMap");
            Bundle bundle = new Bundle();
            boolean z = false;
            for (Map.Entry<String, Integer> entry : credentialCountInformationMap.entrySet()) {
                if (entry.getValue() != null) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    Intrinsics.g(value);
                    bundle.putInt(key, value.intValue());
                    z = true;
                }
            }
            if (z) {
                return bundle;
            }
            return null;
        }

        public final Slice b(hd2 createEntry) {
            Intrinsics.checkNotNullParameter(createEntry, "createEntry");
            return Build.VERSION.SDK_INT >= 35 ? b.b(createEntry) : a.b(createEntry);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CharSequence getAccountName() {
        return this.accountName;
    }

    public final mn0 c() {
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CharSequence getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Instant getLastUsedTime() {
        return this.lastUsedTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }
}
