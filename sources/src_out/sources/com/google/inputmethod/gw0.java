package com.google.inputmethod;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.r43;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/google/android/gw0;", "", "<init>", "()V", "", "codename", "buildCodename", "", "b", "(Ljava/lang/String;Ljava/lang/String;)Z", "d", "()Z", "a", "", "I", "R_EXTENSION_INT", "c", "S_EXTENSION_INT", "T_EXTENSION_INT", "e", "AD_SERVICES_EXTENSION_INT", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class gw0 {
    public static final gw0 a = new gw0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final int R_EXTENSION_INT;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final int S_EXTENSION_INT;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final int T_EXTENSION_INT;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final int AD_SERVICES_EXTENSION_INT;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/gw0$a;", "", "<init>", "()V", "", "extension", "a", "(I)I", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public static final a a = new a();

        private a() {
        }

        public final int a(int extension) {
            return SdkExtensions.getExtensionVersion(extension);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        R_EXTENSION_INT = i >= 30 ? a.a.a(30) : 0;
        S_EXTENSION_INT = i >= 30 ? a.a.a(31) : 0;
        T_EXTENSION_INT = i >= 30 ? a.a.a(33) : 0;
        AD_SERVICES_EXTENSION_INT = i >= 30 ? a.a.a(1000000) : 0;
    }

    private gw0() {
    }

    public static final boolean a() {
        return Build.VERSION.SDK_INT >= 36 && fw0.a() >= 3600001;
    }

    public static final boolean b(String codename, String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (Intrinsics.e("REL", buildCodename)) {
            return false;
        }
        Integer numC = c(buildCodename);
        Integer numC2 = c(codename);
        if (numC != null && numC2 != null) {
            return numC.intValue() >= numC2.intValue();
        }
        if (numC != null || numC2 != null) {
            return numC != null;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String upperCase2 = codename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    private static final Integer c(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return Intrinsics.e(upperCase, "BAKLAVA") ? 0 : null;
    }

    @r43
    public static final boolean d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return true;
        }
        if (i < 33) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(str, "CODENAME");
        return b("UpsideDownCake", str);
    }
}
