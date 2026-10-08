package com.google.inputmethod;

import android.os.Parcel;
import android.os.Process;
import androidx.datastore.p007core.DirectBootUsageException;
import com.google.android.ox3;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "parentDirPath", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "c", "(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;", "", "", "a", "(Ljava/lang/Throwable;)Z", "", "b", "()I", "datastore-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class va3 {
    public static final boolean a(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            Intrinsics.checkNotNullExpressionValue(method, "getMethod(...)");
            Object objInvoke = method.invoke(null, "sys.user." + b() + ".ce_available", "false");
            Intrinsics.h(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return Intrinsics.e((String) objInvoke, "true");
        } catch (Throwable th2) {
            ox3.a(th, th2);
            return false;
        }
    }

    private static final int b() {
        try {
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
            Process.myUserHandle().writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return parcelObtain.readInt();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static final Exception c(String str, Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "exception");
        if (a(exc) || str == null) {
            return exc;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return exc;
        } catch (IOException unused) {
            return new DirectBootUsageException(exc);
        } finally {
            file.delete();
        }
    }
}
