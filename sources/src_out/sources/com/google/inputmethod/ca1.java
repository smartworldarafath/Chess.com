package com.google.inputmethod;

import android.os.Build;
import android.widget.RemoteViews;
import androidx.p008glance.p009appwidget.LayoutSelectionKt;
import androidx.p008glance.p009appwidget.LayoutType;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/widget/RemoteViews;", "Lcom/google/android/bgd;", "translationContext", "Lcom/google/android/tp3;", "element", "", "a", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Lcom/google/android/tp3;)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ca1 {
    public static final void a(RemoteViews remoteViews, TranslationContext translationContext, tp3 tp3Var) {
        int i = Build.VERSION.SDK_INT;
        InsertedViewInfo insertedViewInfoD = LayoutSelectionKt.d(remoteViews, translationContext, i >= 31 ? LayoutType.CheckBox : LayoutType.CheckBoxBackport, tp3Var.getModifier());
        if (i >= 31) {
            ns1.a.a(remoteViews, gyd.b(remoteViews, translationContext, fy9.a, 0, null, 12, null), tp3Var.i());
            tp3Var.j();
            throw null;
        }
        int iB = gyd.b(remoteViews, translationContext, fy9.b, 0, null, 12, null);
        gyd.b(remoteViews, translationContext, fy9.c, 0, null, 12, null);
        insertedViewInfoD.getMainViewId();
        gyd.d(remoteViews, iB, tp3Var.i());
        tp3Var.j();
        throw null;
    }
}
