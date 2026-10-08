package com.google.inputmethod;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.widget.a;
import androidx.p008glance.layout.Alignment;
import androidx.p008glance.p009appwidget.ApplyModifiersKt;
import androidx.p008glance.p009appwidget.LayoutConfiguration;
import androidx.p008glance.p009appwidget.LayoutSelectionKt;
import androidx.p008glance.p009appwidget.LayoutType;
import androidx.p008glance.p009appwidget.RemoteViewsTranslatorKt;
import androidx.p008glance.p009appwidget.g;
import androidx.p008glance.p009appwidget.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/widget/RemoteViews;", "Lcom/google/android/bgd;", "translationContext", "Lcom/google/android/bq3;", "element", "", "b", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Lcom/google/android/bq3;)V", "Lcom/google/android/sy5;", "viewDef", "c", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Lcom/google/android/bq3;Lcom/google/android/sy5;)V", "Lcom/google/android/dq3;", "d", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Lcom/google/android/dq3;)V", "Lcom/google/android/n15;", "Landroidx/glance/appwidget/LayoutType;", "a", "(Lcom/google/android/n15;)Landroidx/glance/appwidget/LayoutType;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class oz6 {
    private static final LayoutType a(n15 n15Var) {
        if (Intrinsics.e(n15Var, new n15.b(1))) {
            return LayoutType.VerticalGridOneColumn;
        }
        if (Intrinsics.e(n15Var, new n15.b(2))) {
            return LayoutType.VerticalGridTwoColumns;
        }
        if (Intrinsics.e(n15Var, new n15.b(3))) {
            return LayoutType.VerticalGridThreeColumns;
        }
        if (Intrinsics.e(n15Var, new n15.b(4))) {
            return LayoutType.VerticalGridFourColumns;
        }
        return Intrinsics.e(n15Var, new n15.b(5)) ? LayoutType.VerticalGridFiveColumns : LayoutType.VerticalGridAutoFit;
    }

    public static final void b(RemoteViews remoteViews, TranslationContext translationContext, bq3 bq3Var) {
        c(remoteViews, translationContext, bq3Var, LayoutSelectionKt.d(remoteViews, translationContext, a(bq3Var.i()), bq3Var.getModifier()));
    }

    private static final void c(RemoteViews remoteViews, TranslationContext translationContext, bq3 bq3Var, InsertedViewInfo insertedViewInfo) {
        int count;
        if (translationContext.getIsLazyCollectionDescendant()) {
            throw new IllegalStateException("Glance does not support nested list views.");
        }
        n15 n15VarI = bq3Var.i();
        if ((n15VarI instanceof n15.b) && (1 > (count = ((n15.b) n15VarI).getCount()) || count >= 6)) {
            throw new IllegalArgumentException("Only counts from 1 to 5 are supported.");
        }
        remoteViews.setPendingIntentTemplate(insertedViewInfo.getMainViewId(), PendingIntent.getActivity(translationContext.getContext(), 0, new Intent(), 184549384, bq3Var.h()));
        i.a aVar = new i.a();
        TranslationContext translationContextE = translationContext.e(insertedViewInfo.getMainViewId());
        boolean z = false;
        int i = 0;
        for (Object obj : bq3Var.d()) {
            int i2 = i + 1;
            if (i < 0) {
                m.z();
            }
            rp3 rp3Var = (rp3) obj;
            Intrinsics.h(rp3Var, "null cannot be cast to non-null type androidx.glance.appwidget.lazy.EmittableLazyVerticalGridListItem");
            long itemId = ((EmittableLazyVerticalGridListItem) rp3Var).getItemId();
            TranslationContext translationContextF = translationContextE.f(i, 1048576);
            List listE = m.e(rp3Var);
            LayoutConfiguration layoutConfiguration = translationContext.getLayoutConfiguration();
            aVar.a(itemId, RemoteViewsTranslatorKt.m(translationContextF, listE, layoutConfiguration != null ? layoutConfiguration.c(rp3Var) : -1));
            z = z || itemId > -4611686018427387904L;
            i = i2;
        }
        aVar.c(z);
        aVar.d(LayoutSelectionKt.b());
        g.a(remoteViews, translationContext.getContext(), translationContext.getAppWidgetId(), insertedViewInfo.getMainViewId(), RemoteViewsTranslatorKt.k(translationContext.getLayoutSize()), aVar.b());
        if (Build.VERSION.SDK_INT >= 31 && (n15VarI instanceof n15.a)) {
            a.b(remoteViews, insertedViewInfo.getMainViewId(), ((n15.a) n15VarI).a(), 1);
        }
        ApplyModifiersKt.e(translationContext, remoteViews, bq3Var.getModifier(), insertedViewInfo);
    }

    public static final void d(RemoteViews remoteViews, TranslationContext translationContext, EmittableLazyVerticalGridListItem emittableLazyVerticalGridListItem) {
        if (emittableLazyVerticalGridListItem.d().size() != 1 || !Intrinsics.e(emittableLazyVerticalGridListItem.getAlignment(), Alignment.INSTANCE.b())) {
            throw new IllegalArgumentException("Lazy vertical grid items can only have a single child align at the center start of the view. The normalization of the composition tree failed.");
        }
        RemoteViewsTranslatorKt.l(remoteViews, translationContext, (rp3) m.z0(emittableLazyVerticalGridListItem.d()));
    }
}
