package com.google.inputmethod;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RemoteViews;
import androidx.core.widget.a;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u0011\u001a\u00020\u0010*\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a;\u0010\u0018\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lcom/google/android/ff3;", "Landroid/content/Context;", "context", "", "e", "(FLandroid/content/Context;)I", "Landroid/util/DisplayMetrics;", "displayMetrics", "f", "(FLandroid/util/DisplayMetrics;)I", "c", "(ILandroid/util/DisplayMetrics;)F", "Landroid/widget/RemoteViews;", "viewId", "", "enabled", "", "d", "(Landroid/widget/RemoteViews;IZ)V", "Lcom/google/android/bgd;", "translationContext", "viewStubId", "layoutId", "inflatedId", "a", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;IILjava/lang/Integer;)I", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class gyd {
    public static final int a(RemoteViews remoteViews, TranslationContext translationContext, int i, int i2, Integer num) {
        if (i == -1) {
            throw new IllegalArgumentException("viewStubId must not be View.NO_ID");
        }
        int iIntValue = num != null ? num.intValue() : translationContext.v();
        if (iIntValue != -1) {
            a.B(remoteViews, i, iIntValue);
        }
        if (i2 != 0) {
            a.C(remoteViews, i, i2);
        }
        remoteViews.setViewVisibility(i, 0);
        return iIntValue;
    }

    public static /* synthetic */ int b(RemoteViews remoteViews, TranslationContext translationContext, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            num = null;
        }
        return a(remoteViews, translationContext, i, i2, num);
    }

    public static final float c(int i, DisplayMetrics displayMetrics) {
        return ff3.i(i / displayMetrics.density);
    }

    public static final void d(RemoteViews remoteViews, int i, boolean z) {
        remoteViews.setBoolean(i, "setEnabled", z);
    }

    public static final int e(float f, Context context) {
        return f(f, context.getResources().getDisplayMetrics());
    }

    public static final int f(float f, DisplayMetrics displayMetrics) {
        return (int) TypedValue.applyDimension(1, f, displayMetrics);
    }
}
