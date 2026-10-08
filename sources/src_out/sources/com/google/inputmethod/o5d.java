package com.google.inputmethod;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"", "a", "(Landroidx/compose/runtime/d;I)Z", "is24HourFormat", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class o5d {
    public static final boolean a(d dVar, int i) {
        if (e.k()) {
            e.o(-972868615, i, -1, "androidx.compose.material3.<get-is24HourFormat> (TimeFormat.android.kt:24)");
        }
        boolean zIs24HourFormat = DateFormat.is24HourFormat((Context) dVar.v(AndroidCompositionLocals_androidKt.c()));
        if (e.k()) {
            e.n();
        }
        return zIs24HourFormat;
    }
}
