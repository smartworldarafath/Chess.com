package com.google.inputmethod;

import androidx.compose.ui.graphics.colorspace.c;
import androidx.compose.ui.graphics.colorspace.e;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "width", "height", "Lcom/google/android/nl5;", "config", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", "Lcom/google/android/ml5;", "a", "(IIIZLandroidx/compose/ui/graphics/colorspace/c;)Lcom/google/android/ml5;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ol5 {
    public static final ml5 a(int i, int i2, int i3, boolean z, c cVar) {
        return cl.a(i, i2, i3, z, cVar);
    }

    public static /* synthetic */ ml5 b(int i, int i2, int i3, boolean z, c cVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = nl5.INSTANCE.b();
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        if ((i4 & 16) != 0) {
            cVar = e.a.G();
        }
        return a(i, i2, i3, z, cVar);
    }
}
