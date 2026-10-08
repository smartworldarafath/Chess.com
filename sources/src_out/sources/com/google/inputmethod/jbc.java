package com.google.inputmethod;

import android.content.res.Resources;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "id", "", "c", "(ILandroidx/compose/runtime/d;I)Ljava/lang/String;", "", "", "formatArgs", "d", "(I[Ljava/lang/Object;Landroidx/compose/runtime/d;I)Ljava/lang/String;", "count", "a", "(IILandroidx/compose/runtime/d;I)Ljava/lang/String;", "b", "(II[Ljava/lang/Object;Landroidx/compose/runtime/d;I)Ljava/lang/String;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class jbc {
    public static final String a(int i, int i2, d dVar, int i3) {
        if (e.k()) {
            e.o(1784741530, i3, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:71)");
        }
        String quantityString = ((Resources) dVar.v(AndroidCompositionLocals_androidKt.f())).getQuantityString(i, i2);
        if (e.k()) {
            e.n();
        }
        return quantityString;
    }

    public static final String b(int i, int i2, Object[] objArr, d dVar, int i3) {
        if (e.k()) {
            e.o(523207213, i3, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:85)");
        }
        String quantityString = ((Resources) dVar.v(AndroidCompositionLocals_androidKt.f())).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
        if (e.k()) {
            e.n();
        }
        return quantityString;
    }

    public static final String c(int i, d dVar, int i2) {
        if (e.k()) {
            e.o(1223887937, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:33)");
        }
        String string = ((Resources) dVar.v(AndroidCompositionLocals_androidKt.f())).getString(i);
        if (e.k()) {
            e.n();
        }
        return string;
    }

    public static final String d(int i, Object[] objArr, d dVar, int i2) {
        if (e.k()) {
            e.o(2071230100, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = ((Resources) dVar.v(AndroidCompositionLocals_androidKt.f())).getString(i, Arrays.copyOf(objArr, objArr.length));
        if (e.k()) {
            e.n();
        }
        return string;
    }
}
