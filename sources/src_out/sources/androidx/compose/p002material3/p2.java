package androidx.compose.p002material3;

import android.content.res.Configuration;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/l2;", "a", "(Landroidx/compose/runtime/d;I)I", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class p2 {
    public static final int a(d dVar, int i) {
        if (e.k()) {
            e.o(-721362352, i, -1, "androidx.compose.material3.defaultTimePickerLayoutType (TimePicker.android.kt:26)");
        }
        Configuration configuration = (Configuration) dVar.v(AndroidCompositionLocals_androidKt.b());
        int iA = configuration.screenHeightDp < configuration.screenWidthDp ? l2.INSTANCE.a() : l2.INSTANCE.b();
        if (e.k()) {
            e.n();
        }
        return iA;
    }
}
