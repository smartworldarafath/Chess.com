package com.google.inputmethod;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a#\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\r\u001a\u00020\u000b*\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a)\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u000b*\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u00020\u000b*\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/google/android/f12;", "b", "(Landroidx/compose/runtime/d;I)Lcom/google/android/f12;", "", "backgroundStyleId", "foregroundStyleId", "a", "(IILandroidx/compose/runtime/d;I)Lcom/google/android/f12;", "Landroid/content/Context;", "resId", "attrId", "Lcom/google/android/ei1;", "defaultColor", "e", "(Landroid/content/Context;IIJ)J", "Landroid/content/res/ColorStateList;", "f", "(Landroid/content/Context;II)Landroid/content/res/ColorStateList;", "d", "(Landroid/content/res/ColorStateList;J)J", "c", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b22 {
    public static final ContextMenuColors a(int i, int i2, d dVar, int i3) {
        if (e.k()) {
            e.o(1689505294, i3, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:41)");
        }
        Context context = (Context) dVar.v(AndroidCompositionLocals_androidKt.c());
        Object obj = (Configuration) dVar.v(AndroidCompositionLocals_androidKt.b());
        boolean zX = dVar.x(obj) | dVar.x(context);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            long jE = e(context, i, R.attr.colorBackground, a22.v().getBackgroundColor());
            ColorStateList colorStateListF = f(context, i2, R.attr.textColorPrimary);
            long jD = d(colorStateListF, a22.v().getTextColor());
            long jC = c(colorStateListF, a22.v().getDisabledTextColor());
            Object contextMenuColors = new ContextMenuColors(jE, jD, jD, jC, jC, null);
            dVar.L(contextMenuColors);
            objR = contextMenuColors;
        }
        ContextMenuColors contextMenuColors2 = (ContextMenuColors) objR;
        if (e.k()) {
            e.n();
        }
        return contextMenuColors2;
    }

    public static final ContextMenuColors b(d dVar, int i) {
        if (e.k()) {
            e.o(1428061410, i, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:32)");
        }
        ContextMenuColors contextMenuColorsA = a(R.style.Widget.PopupMenu, R.style.TextAppearance.Widget.PopupMenu.Large, dVar, 54);
        if (e.k()) {
            e.n();
        }
        return contextMenuColorsA;
    }

    private static final long c(ColorStateList colorStateList, long j) {
        int iJ = ki1.j(j);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iJ)) : null;
        return (numValueOf == null || numValueOf.intValue() == iJ) ? j : ki1.b(numValueOf.intValue());
    }

    private static final long d(ColorStateList colorStateList, long j) {
        int iJ = ki1.j(j);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iJ)) : null;
        return (numValueOf == null || numValueOf.intValue() == iJ) ? j : ki1.b(numValueOf.intValue());
    }

    private static final long e(Context context, int i, int i2, long j) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
        int iJ = ki1.j(j);
        int color = typedArrayObtainStyledAttributes.getColor(0, iJ);
        typedArrayObtainStyledAttributes.recycle();
        return color == iJ ? j : ki1.b(color);
    }

    private static final ColorStateList f(Context context, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList;
    }
}
