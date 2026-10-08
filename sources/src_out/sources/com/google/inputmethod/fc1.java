package com.google.inputmethod;

import android.content.res.ColorStateList;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.widget.a;
import androidx.p008glance.p009appwidget.ApplyModifiersKt;
import androidx.p008glance.p009appwidget.LayoutSelectionKt;
import androidx.p008glance.p009appwidget.LayoutType;
import java.util.Objects;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/widget/RemoteViews;", "Lcom/google/android/bgd;", "translationContext", "Lcom/google/android/vp3;", "element", "", "a", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Lcom/google/android/vp3;)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class fc1 {
    public static final void a(RemoteViews remoteViews, TranslationContext translationContext, EmittableCircularProgressIndicator emittableCircularProgressIndicator) {
        InsertedViewInfo insertedViewInfoD = LayoutSelectionKt.d(remoteViews, translationContext, LayoutType.CircularProgressIndicator, emittableCircularProgressIndicator.getModifier());
        remoteViews.setProgressBar(insertedViewInfoD.getMainViewId(), 0, 0, true);
        if (Build.VERSION.SDK_INT >= 31) {
            ti1 color = emittableCircularProgressIndicator.getColor();
            if (color instanceof FixedColorProvider) {
                a.j(remoteViews, insertedViewInfoD.getMainViewId(), ColorStateList.valueOf(ki1.j(((FixedColorProvider) color).getColor())));
            } else if (color instanceof ResourceColorProvider) {
                a.i(remoteViews, insertedViewInfoD.getMainViewId(), ((ResourceColorProvider) color).getResId());
            } else if (color instanceof bq2) {
                bq2 bq2Var = (bq2) color;
                a.k(remoteViews, insertedViewInfoD.getMainViewId(), ColorStateList.valueOf(ki1.j(bq2Var.b())), ColorStateList.valueOf(ki1.j(bq2Var.c())));
            } else {
                Objects.toString(color);
            }
        }
        ApplyModifiersKt.e(translationContext, remoteViews, emittableCircularProgressIndicator.getModifier(), insertedViewInfoD);
    }
}
