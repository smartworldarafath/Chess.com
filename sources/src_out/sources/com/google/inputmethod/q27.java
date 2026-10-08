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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/widget/RemoteViews;", "Lcom/google/android/bgd;", "translationContext", "Lcom/google/android/eq3;", "element", "", "a", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Lcom/google/android/eq3;)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q27 {
    public static final void a(RemoteViews remoteViews, TranslationContext translationContext, eq3 eq3Var) {
        InsertedViewInfo insertedViewInfoD = LayoutSelectionKt.d(remoteViews, translationContext, LayoutType.LinearProgressIndicator, eq3Var.getModifier());
        remoteViews.setProgressBar(insertedViewInfoD.getMainViewId(), 100, (int) (eq3Var.f() * 100), eq3Var.e());
        if (Build.VERSION.SDK_INT >= 31) {
            ti1 ti1VarD = eq3Var.d();
            if (ti1VarD instanceof FixedColorProvider) {
                a.p(remoteViews, insertedViewInfoD.getMainViewId(), ColorStateList.valueOf(ki1.j(((FixedColorProvider) ti1VarD).getColor())));
            } else if (ti1VarD instanceof ResourceColorProvider) {
                a.o(remoteViews, insertedViewInfoD.getMainViewId(), ((ResourceColorProvider) ti1VarD).getResId());
            } else if (ti1VarD instanceof bq2) {
                bq2 bq2Var = (bq2) ti1VarD;
                a.q(remoteViews, insertedViewInfoD.getMainViewId(), ColorStateList.valueOf(ki1.j(bq2Var.b())), ColorStateList.valueOf(ki1.j(bq2Var.c())));
            } else {
                Objects.toString(ti1VarD);
            }
            ti1 ti1VarC = eq3Var.c();
            if (ti1VarC instanceof FixedColorProvider) {
                a.m(remoteViews, insertedViewInfoD.getMainViewId(), ColorStateList.valueOf(ki1.j(((FixedColorProvider) ti1VarC).getColor())));
            } else if (ti1VarC instanceof ResourceColorProvider) {
                a.l(remoteViews, insertedViewInfoD.getMainViewId(), ((ResourceColorProvider) ti1VarC).getResId());
            } else if (ti1VarC instanceof bq2) {
                bq2 bq2Var2 = (bq2) ti1VarC;
                a.n(remoteViews, insertedViewInfoD.getMainViewId(), ColorStateList.valueOf(ki1.j(bq2Var2.b())), ColorStateList.valueOf(ki1.j(bq2Var2.c())));
            } else {
                Objects.toString(ti1VarC);
            }
        }
        ApplyModifiersKt.e(translationContext, remoteViews, eq3Var.getModifier(), insertedViewInfoD);
    }
}
