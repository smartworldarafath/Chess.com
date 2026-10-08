package com.google.inputmethod;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.font.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001as\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "", "a", "(F)I", "Lcom/google/android/asc;", "current", "Landroidx/compose/ui/text/b;", "text", "Landroidx/compose/ui/text/y;", "style", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "", "softWrap", "Lcom/google/android/uyc;", "overflow", "maxLines", "minLines", "", "Landroidx/compose/ui/text/b$d;", "Lcom/google/android/v99;", "placeholders", "b", "(Lcom/google/android/asc;Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/y;Lcom/google/android/f43;Landroidx/compose/ui/text/font/l$b;ZIIILjava/util/List;)Lcom/google/android/asc;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class csc {
    public static final int a(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final asc b(asc ascVar, b bVar, TextStyle textStyle, f43 f43Var, l.b bVar2, boolean z, int i, int i2, int i3, List<b.Range<Placeholder>> list) {
        boolean z2;
        int i4;
        int i5;
        int i6;
        List<b.Range<Placeholder>> list2;
        if (Intrinsics.e(ascVar.getText(), bVar) && Intrinsics.e(ascVar.getStyle(), textStyle)) {
            z2 = z;
            if (ascVar.getSoftWrap() == z2) {
                i4 = i;
                if (uyc.g(ascVar.getOverflow(), i4)) {
                    i5 = i2;
                    if (ascVar.getMaxLines() == i5) {
                        i6 = i3;
                        if (ascVar.getMinLines() == i6 && Intrinsics.e(ascVar.getDensity(), f43Var)) {
                            list2 = list;
                            if (Intrinsics.e(ascVar.h(), list2)) {
                                bVar2 = bVar2;
                                if (ascVar.getFontFamilyResolver() == bVar2) {
                                    return ascVar;
                                }
                            } else {
                                bVar2 = bVar2;
                            }
                        } else {
                            bVar2 = bVar2;
                            list2 = list;
                        }
                    } else {
                        bVar2 = bVar2;
                        i6 = i3;
                        list2 = list;
                    }
                } else {
                    bVar2 = bVar2;
                    i5 = i2;
                    i6 = i3;
                    list2 = list;
                }
            }
            return new asc(bVar, textStyle, i5, i6, z2, i4, f43Var, bVar2, list2, null);
        }
        z2 = z;
        i4 = i;
        i5 = i2;
        i6 = i3;
        list2 = list;
        return new asc(bVar, textStyle, i5, i6, z2, i4, f43Var, bVar2, list2, null);
    }

    public static /* synthetic */ asc c(asc ascVar, b bVar, TextStyle textStyle, f43 f43Var, l.b bVar2, boolean z, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 32) != 0) {
            z = true;
        }
        if ((i4 & 64) != 0) {
            i = uyc.INSTANCE.a();
        }
        if ((i4 & 128) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i4 & 256) != 0) {
            i3 = 1;
        }
        return b(ascVar, bVar, textStyle, f43Var, bVar2, z, i, i2, i3, list);
    }
}
