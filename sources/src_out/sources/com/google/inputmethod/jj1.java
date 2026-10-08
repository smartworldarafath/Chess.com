package com.google.inputmethod;

import android.graphics.ColorSpace;
import androidx.compose.ui.graphics.colorspace.c;
import androidx.compose.ui.graphics.colorspace.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/android/jj1;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", "Landroid/graphics/ColorSpace;", "a", "(Landroidx/compose/ui/graphics/colorspace/c;)Landroid/graphics/ColorSpace;", "", "id", "b", "(I)Landroidx/compose/ui/graphics/colorspace/c;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class jj1 {
    public static final jj1 a = new jj1();

    private jj1() {
    }

    public static final ColorSpace a(c colorSpace) {
        e eVar = e.a;
        if (Intrinsics.e(colorSpace, eVar.q())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (Intrinsics.e(colorSpace, eVar.r())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    public static final c b(int id) {
        if (id == ColorSpace.Named.BT2020_HLG.ordinal()) {
            return e.a.q();
        }
        return id == ColorSpace.Named.BT2020_PQ.ordinal() ? e.a.r() : e.a.I();
    }
}
