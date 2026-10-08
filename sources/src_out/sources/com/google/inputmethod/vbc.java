package com.google.inputmethod;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.sac;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00022\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/rbc;", "string", "", "b", "(ILandroidx/compose/runtime/d;I)Ljava/lang/String;", "", "", "formatArgs", "c", "(I[Ljava/lang/Object;Landroidx/compose/runtime/d;I)Ljava/lang/String;", "a", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class vbc {
    public static final String a(String str, Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    public static final String b(int i, d dVar, int i2) {
        if (e.k()) {
            e.o(-907677715, i2, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)");
        }
        dVar.v(AndroidCompositionLocals_androidKt.b());
        String string = ((Context) dVar.v(AndroidCompositionLocals_androidKt.c())).getResources().getString(i);
        if (e.k()) {
            e.n();
        }
        return string;
    }

    public static final String c(int i, Object[] objArr, d dVar, int i2) {
        if (e.k()) {
            e.o(-1427268608, i2, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:38)");
        }
        String strB = b(i, dVar, i2 & 14);
        Locale localeC = uu1.a((Configuration) dVar.v(AndroidCompositionLocals_androidKt.b())).c(0);
        if (localeC == null) {
            localeC = Locale.getDefault();
        }
        sac sacVar = sac.a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str = String.format(localeC, strB, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        if (e.k()) {
            e.n();
        }
        return str;
    }
}
