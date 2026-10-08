package com.google.inputmethod;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import java.time.Instant;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0003#$%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0011\u0010\"\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b!\u0010\u001e¨\u0006&"}, d2 = {"Lcom/google/android/z29;", "Lcom/google/android/ve2;", "", "username", "Ljava/lang/CharSequence;", "l", "()Ljava/lang/CharSequence;", "displayName", "g", "typeDisplayName", "k", "Landroid/app/PendingIntent;", "pendingIntent", "Landroid/app/PendingIntent;", "j", "()Landroid/app/PendingIntent;", "Ljava/time/Instant;", "lastUsedTime", "Ljava/time/Instant;", "i", "()Ljava/time/Instant;", "Landroid/graphics/drawable/Icon;", "icon", "Landroid/graphics/drawable/Icon;", "h", "()Landroid/graphics/drawable/Icon;", "", "isAutoSelectAllowed", "Z", "n", "()Z", "isAutoSelectAllowedFromOption", "o", "m", "hasDefaultIcon", "a", "b", "c", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z29 extends ve2 {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/android/z29$a;", "", "<init>", "()V", "Lcom/google/android/z29;", "entry", "Landroid/app/slice/Slice;", "b", "(Lcom/google/android/z29;)Landroid/app/slice/Slice;", "Landroid/app/slice/Slice$Builder;", "sliceBuilder", "", "a", "(Lcom/google/android/z29;Landroid/app/slice/Slice$Builder;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final Slice b(z29 entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec(entry.getType(), 1));
            a.a(entry, builder);
            Slice sliceBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(sliceBuild, "sliceBuilder.build()");
            return sliceBuild;
        }

        public final void a(z29 entry, Slice.Builder sliceBuilder) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(sliceBuilder, "sliceBuilder");
            il0 il0VarB = entry.getBeginGetCredentialOption();
            sliceBuilder.addText(il0VarB.getId(), null, m.e("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID")).addText(entry.getEntryGroupId(), null, m.e("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID")).addText(entry.getIsDefaultIconPreferredAsSingleProvider() ? "true" : "false", null, m.e("androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED")).addText(entry.getAffiliatedDomain(), null, m.e("androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN"));
            CharSequence charSequenceL = entry.l();
            CharSequence charSequenceG = entry.g();
            PendingIntent pendingIntentJ = entry.j();
            CharSequence charSequenceK = entry.k();
            Instant instantI = entry.i();
            sliceBuilder.addText(charSequenceK, null, m.e("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")).addText(charSequenceL, null, m.e("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")).addText(charSequenceG, null, m.e("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")).addText(entry.n() ? "true" : "false", null, m.e("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")).addIcon(entry.h(), null, m.e("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON"));
            try {
                if (entry.m()) {
                    sliceBuilder.addInt(1, null, m.e("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID"));
                }
            } catch (IllegalStateException unused) {
            }
            if (entry.o()) {
                sliceBuilder.addInt(1, null, m.e("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION"));
            }
            if (instantI != null) {
                sliceBuilder.addLong(instantI.toEpochMilli(), null, m.e("androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS"));
            }
            sliceBuilder.addAction(pendingIntentJ, new Slice.Builder(sliceBuilder).addHints(Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT")).build(), null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/android/z29$b;", "", "<init>", "()V", "Lcom/google/android/z29;", "entry", "Landroid/app/slice/Slice;", "b", "(Lcom/google/android/z29;)Landroid/app/slice/Slice;", "Landroid/app/slice/Slice$Builder;", "sliceBuilder", "", "a", "(Lcom/google/android/z29;Landroid/app/slice/Slice$Builder;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {
        public static final b a = new b();

        private b() {
        }

        public static final Slice b(z29 entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec(entry.getType(), 1));
            a.a.a(entry, builder);
            a.a(entry, builder);
            Slice sliceBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(sliceBuild, "sliceBuilder.build()");
            return sliceBuild;
        }

        public final void a(z29 entry, Slice.Builder sliceBuilder) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(sliceBuilder, "sliceBuilder");
            entry.c();
        }
    }

    /* JADX INFO: renamed from: com.google.android.z29$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/z29$c;", "", "<init>", "()V", "Lcom/google/android/z29;", "entry", "Landroid/app/slice/Slice;", "a", "(Lcom/google/android/z29;)Landroid/app/slice/Slice;", "", "TAG", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Slice a(z29 entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return Build.VERSION.SDK_INT >= 35 ? b.b(entry) : a.b(entry);
        }

        private Companion() {
        }
    }

    public final CharSequence g() {
        throw null;
    }

    public final Icon h() {
        throw null;
    }

    public final Instant i() {
        throw null;
    }

    public final PendingIntent j() {
        throw null;
    }

    public final CharSequence k() {
        throw null;
    }

    public final CharSequence l() {
        throw null;
    }

    public final boolean m() {
        throw null;
    }

    public final boolean n() {
        throw null;
    }

    public final boolean o() {
        throw null;
    }
}
