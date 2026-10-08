package com.google.inputmethod;

import android.app.PendingIntent;
import android.content.Intent;
import android.widget.RemoteViews;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/widget/RemoteViews;", "Lcom/google/android/bgd;", "translationContext", "Lcom/google/android/xp3;", "element", "", "a", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Lcom/google/android/xp3;)V", "Lcom/google/android/zp3;", "Lcom/google/android/sy5;", "viewDef", "b", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Lcom/google/android/zp3;Lcom/google/android/sy5;)V", "Lcom/google/android/aq3;", "c", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Lcom/google/android/aq3;)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class mw6 {
    public static final void a(RemoteViews remoteViews, TranslationContext translationContext, xp3 xp3Var) {
        b(remoteViews, translationContext, xp3Var, LayoutSelectionKt.d(remoteViews, translationContext, LayoutType.List, xp3Var.getModifier()));
    }

    private static final void b(RemoteViews remoteViews, TranslationContext translationContext, EmittableLazyList emittableLazyList, InsertedViewInfo insertedViewInfo) {
        if (translationContext.getIsLazyCollectionDescendant()) {
            throw new IllegalStateException("Glance does not support nested list views.");
        }
        remoteViews.setPendingIntentTemplate(insertedViewInfo.getMainViewId(), PendingIntent.getActivity(translationContext.getContext(), 0, new Intent(), 184549384, emittableLazyList.getActivityOptions()));
        i.a aVar = new i.a();
        TranslationContext translationContextE = translationContext.e(insertedViewInfo.getMainViewId());
        boolean z = false;
        int i = 0;
        for (Object obj : emittableLazyList.d()) {
            int i2 = i + 1;
            if (i < 0) {
                m.z();
            }
            rp3 rp3Var = (rp3) obj;
            Intrinsics.h(rp3Var, "null cannot be cast to non-null type androidx.glance.appwidget.lazy.EmittableLazyListItem");
            long itemId = ((EmittableLazyListItem) rp3Var).getItemId();
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
        ApplyModifiersKt.e(translationContext, remoteViews, emittableLazyList.getModifier(), insertedViewInfo);
    }

    public static final void c(RemoteViews remoteViews, TranslationContext translationContext, EmittableLazyListItem emittableLazyListItem) {
        if (emittableLazyListItem.d().size() != 1 || !Intrinsics.e(emittableLazyListItem.getAlignment(), Alignment.INSTANCE.b())) {
            throw new IllegalArgumentException("Lazy list items can only have a single child align at the center start of the view. The normalization of the composition tree failed.");
        }
        RemoteViewsTranslatorKt.l(remoteViews, translationContext, (rp3) m.z0(emittableLazyListItem.d()));
    }
}
