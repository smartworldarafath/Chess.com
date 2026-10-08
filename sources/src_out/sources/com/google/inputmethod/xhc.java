package com.google.inputmethod;

import android.os.Build;
import android.widget.RemoteViews;
import androidx.p008glance.p009appwidget.LayoutSelectionKt;
import androidx.p008glance.p009appwidget.LayoutType;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/widget/RemoteViews;", "Lcom/google/android/bgd;", "translationContext", "Lcom/google/android/hq3;", "element", "", "a", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Lcom/google/android/hq3;)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class xhc {
    public static final void a(RemoteViews remoteViews, TranslationContext translationContext, hq3 hq3Var) {
        int i = Build.VERSION.SDK_INT;
        LayoutType layoutType = i >= 31 ? LayoutType.Swtch : LayoutType.SwtchBackport;
        translationContext.getContext();
        InsertedViewInfo insertedViewInfoD = LayoutSelectionKt.d(remoteViews, translationContext, layoutType, hq3Var.getModifier());
        if (i >= 31) {
            insertedViewInfoD.getMainViewId();
            ns1.a.a(remoteViews, insertedViewInfoD.getMainViewId(), hq3Var.i());
            hq3Var.j();
            throw null;
        }
        gyd.b(remoteViews, translationContext, fy9.M0, 0, null, 12, null);
        int iB = gyd.b(remoteViews, translationContext, fy9.N0, 0, null, 12, null);
        int iB2 = gyd.b(remoteViews, translationContext, fy9.O0, 0, null, 12, null);
        gyd.d(remoteViews, iB, hq3Var.i());
        gyd.d(remoteViews, iB2, hq3Var.i());
        hq3Var.j();
        throw null;
    }
}
