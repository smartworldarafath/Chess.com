package androidx.p008glance.p009appwidget;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.widget.a;
import androidx.p008glance.EmittableButton;
import androidx.p008glance.EmittableImage;
import androidx.p008glance.g;
import androidx.p008glance.layout.Alignment;
import androidx.p008glance.layout.EmittableBox;
import androidx.p008glance.layout.EmittableColumn;
import androidx.p008glance.layout.EmittableRow;
import androidx.p008glance.p009appwidget.translators.ImageTranslatorKt;
import com.google.android.qjd;
import com.google.inputmethod.EmittableCircularProgressIndicator;
import com.google.inputmethod.EmittableLazyListItem;
import com.google.inputmethod.EmittableLazyVerticalGridListItem;
import com.google.inputmethod.EmittableText;
import com.google.inputmethod.InsertedViewInfo;
import com.google.inputmethod.PaddingModifier;
import com.google.inputmethod.RemoteViewsInfo;
import com.google.inputmethod.RemoteViewsRoot;
import com.google.inputmethod.TranslationContext;
import com.google.inputmethod.a0d;
import com.google.inputmethod.ba2;
import com.google.inputmethod.bq3;
import com.google.inputmethod.ca1;
import com.google.inputmethod.eq3;
import com.google.inputmethod.fc1;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fq3;
import com.google.inputmethod.gq3;
import com.google.inputmethod.hq3;
import com.google.inputmethod.jf3;
import com.google.inputmethod.k2a;
import com.google.inputmethod.mw6;
import com.google.inputmethod.mx8;
import com.google.inputmethod.ny;
import com.google.inputmethod.oz6;
import com.google.inputmethod.q27;
import com.google.inputmethod.rp3;
import com.google.inputmethod.sp3;
import com.google.inputmethod.tp3;
import com.google.inputmethod.xc;
import com.google.inputmethod.xhc;
import com.google.inputmethod.xp3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.m;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\u001aP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0018\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0016\u0010\u001b\u001a\u00020\u001a*\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u001e\u001a\u00020\u001d*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010!\u001a\u00020\u001d*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020 H\u0000¢\u0006\u0004\b!\u0010\"\u001a!\u0010$\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010#\u001a\u00020\u0002H\u0000¢\u0006\u0004\b$\u0010%\u001a\u0016\u0010'\u001a\u00020\u0002*\u00020&H\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u0016\u0010*\u001a\u00020\u0002*\u00020)H\u0000ø\u0001\u0000¢\u0006\u0004\b*\u0010(\u001a\u0013\u0010,\u001a\u00020\u0002*\u00020+H\u0000¢\u0006\u0004\b,\u0010-\u001a#\u0010/\u001a\u00020\u001d*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100\u001a#\u00102\u001a\u00020\u001d*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103\u001a#\u00105\u001a\u00020\u001d*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106\u001a\u001d\u00107\u001a\u00020\u001d2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b7\u00108\u001a#\u0010:\u001a\u00020\u001d*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;\u001a#\u0010=\u001a\u00020\u001d*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>\u001a#\u0010@\u001a\u00020\u001d*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010A\u001a1\u0010D\u001a\u00020\u001d*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010C\u001a\u00020B2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0004\bD\u0010E\u001a+\u0010I\u001a\u00020\u001d*\u00020\r2\u0006\u0010F\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\u0002H\u0000¢\u0006\u0004\bI\u0010J\u001a\u0013\u0010K\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\bK\u0010L\"*\u0010U\u001a\u0004\u0018\u00010M8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bI\u0010N\u0012\u0004\bS\u0010T\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R\"\u0018\u0010X\u001a\u00020M*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Y"}, d2 = {"Landroid/content/Context;", "context", "", "appWidgetId", "Lcom/google/android/bga;", "element", "Landroidx/glance/appwidget/LayoutConfiguration;", "layoutConfiguration", "rootViewIndex", "Lcom/google/android/jf3;", "layoutSize", "Landroid/content/ComponentName;", "actionBroadcastReceiver", "Landroid/widget/RemoteViews;", "n", "(Landroid/content/Context;ILcom/google/android/bga;Landroidx/glance/appwidget/LayoutConfiguration;IJLandroid/content/ComponentName;)Landroid/widget/RemoteViews;", "Lcom/google/android/bgd;", "translationContext", "", "Lcom/google/android/rp3;", "children", "m", "(Lcom/google/android/bgd;Ljava/util/List;I)Landroid/widget/RemoteViews;", "views", "c", "(Ljava/util/List;)Landroid/widget/RemoteViews;", "", "k", "(J)Ljava/lang/String;", "", "l", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Lcom/google/android/rp3;)V", "Landroidx/glance/appwidget/e;", "t", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Landroidx/glance/appwidget/e;)V", "layoutId", "f", "(Lcom/google/android/bgd;I)Landroid/widget/RemoteViews;", "Landroidx/glance/layout/a$b;", "j", "(I)I", "Landroidx/glance/layout/a$c;", "i", "Landroidx/glance/layout/a;", "h", "(Landroidx/glance/layout/a;)I", "Landroidx/glance/layout/b;", "p", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Landroidx/glance/layout/b;)V", "Landroidx/glance/layout/d;", "s", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Landroidx/glance/layout/d;)V", "Landroidx/glance/layout/c;", "r", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Landroidx/glance/layout/c;)V", "b", "(Ljava/util/List;)V", "Lcom/google/android/sp3;", "o", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Lcom/google/android/sp3;)V", "Landroidx/glance/d;", "q", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Landroidx/glance/d;)V", "Lcom/google/android/gq3;", "u", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Lcom/google/android/gq3;)V", "Lcom/google/android/sy5;", "parentDef", "g", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Lcom/google/android/sy5;Ljava/util/List;)V", "viewId", "childView", "stableId", "a", "(Landroid/widget/RemoteViews;ILandroid/widget/RemoteViews;I)V", "d", "(Landroid/widget/RemoteViews;)Landroid/widget/RemoteViews;", "", "Ljava/lang/Boolean;", "getForceRtl", "()Ljava/lang/Boolean;", "setForceRtl", "(Ljava/lang/Boolean;)V", "getForceRtl$annotations", "()V", "forceRtl", "e", "(Landroid/content/Context;)Z", "isRtl", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RemoteViewsTranslatorKt {
    private static Boolean a;

    public static final void a(RemoteViews remoteViews, int i, RemoteViews remoteViews2, int i2) {
        if (Build.VERSION.SDK_INT >= 31) {
            l.a.a(remoteViews, i, remoteViews2, i2);
        } else {
            remoteViews.addView(i, remoteViews2);
        }
    }

    private static final void b(List<? extends rp3> list) {
        int i;
        if (list == null || !list.isEmpty()) {
            i = 0;
            for (rp3 rp3Var : list) {
                if ((rp3Var instanceof fq3) && ((fq3) rp3Var).i() && (i = i + 1) < 0) {
                    m.y();
                }
            }
        } else {
            i = 0;
        }
        if (!(i <= 1)) {
            throw new IllegalStateException("When using GlanceModifier.selectableGroup(), no more than one RadioButton may be checked at a time.");
        }
    }

    private static final RemoteViews c(List<? extends RemoteViews> list) {
        int size = list.size();
        if (size == 1) {
            return list.get(0);
        }
        if (size == 2) {
            return new RemoteViews(list.get(0), list.get(1));
        }
        throw new IllegalArgumentException("There must be between 1 and 2 views.");
    }

    private static final RemoteViews d(RemoteViews remoteViews) {
        return k.a.a(remoteViews);
    }

    private static final boolean e(Context context) {
        Boolean bool = a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static final RemoteViews f(TranslationContext translationContext, int i) {
        return new RemoteViews(translationContext.getContext().getPackageName(), i);
    }

    public static final void g(RemoteViews remoteViews, TranslationContext translationContext, InsertedViewInfo insertedViewInfo, List<? extends rp3> list) {
        int i = 0;
        for (Object obj : m.p1(list, 10)) {
            int i2 = i + 1;
            if (i < 0) {
                m.z();
            }
            l(remoteViews, translationContext.d(insertedViewInfo, i), (rp3) obj);
            i = i2;
        }
    }

    public static final int h(Alignment alignment) {
        return i(alignment.getVertical()) | j(alignment.getHorizontal());
    }

    public static final int i(int i) {
        Alignment.c.Companion companion = Alignment.c.INSTANCE;
        if (Alignment.c.g(i, companion.c())) {
            return 48;
        }
        if (Alignment.c.g(i, companion.a())) {
            return 80;
        }
        if (Alignment.c.g(i, companion.b())) {
            return 16;
        }
        Alignment.c.i(i);
        return 48;
    }

    public static final int j(int i) {
        Alignment.b.Companion companion = Alignment.b.INSTANCE;
        if (Alignment.b.g(i, companion.c())) {
            return 8388611;
        }
        if (Alignment.b.g(i, companion.b())) {
            return 8388613;
        }
        if (Alignment.b.g(i, companion.a())) {
            return 1;
        }
        Alignment.b.i(i);
        return 8388611;
    }

    public static final String k(long j) {
        if (j == jf3.INSTANCE.a()) {
            return "Unspecified";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) ff3.m(jf3.h(j)));
        sb.append('x');
        sb.append((Object) ff3.m(jf3.g(j)));
        return sb.toString();
    }

    public static final void l(RemoteViews remoteViews, TranslationContext translationContext, rp3 rp3Var) {
        if (rp3Var instanceof EmittableBox) {
            p(remoteViews, translationContext, (EmittableBox) rp3Var);
            return;
        }
        if (rp3Var instanceof EmittableButton) {
            q(remoteViews, translationContext, (EmittableButton) rp3Var);
            return;
        }
        if (rp3Var instanceof EmittableRow) {
            s(remoteViews, translationContext, (EmittableRow) rp3Var);
            return;
        }
        if (rp3Var instanceof EmittableColumn) {
            r(remoteViews, translationContext, (EmittableColumn) rp3Var);
            return;
        }
        if (rp3Var instanceof EmittableText) {
            a0d.c(remoteViews, translationContext, (EmittableText) rp3Var);
            return;
        }
        if (rp3Var instanceof EmittableLazyListItem) {
            mw6.c(remoteViews, translationContext, (EmittableLazyListItem) rp3Var);
            return;
        }
        if (rp3Var instanceof xp3) {
            mw6.a(remoteViews, translationContext, (xp3) rp3Var);
            return;
        }
        if (rp3Var instanceof sp3) {
            o(remoteViews, translationContext, (sp3) rp3Var);
            return;
        }
        if (rp3Var instanceof tp3) {
            ca1.a(remoteViews, translationContext, (tp3) rp3Var);
            return;
        }
        if (rp3Var instanceof gq3) {
            u(remoteViews, translationContext, (gq3) rp3Var);
            return;
        }
        if (rp3Var instanceof hq3) {
            xhc.a(remoteViews, translationContext, (hq3) rp3Var);
            return;
        }
        if (rp3Var instanceof EmittableImage) {
            ImageTranslatorKt.e(remoteViews, translationContext, (EmittableImage) rp3Var);
            return;
        }
        if (rp3Var instanceof eq3) {
            q27.a(remoteViews, translationContext, (eq3) rp3Var);
            return;
        }
        if (rp3Var instanceof EmittableCircularProgressIndicator) {
            fc1.a(remoteViews, translationContext, (EmittableCircularProgressIndicator) rp3Var);
            return;
        }
        if (rp3Var instanceof bq3) {
            oz6.b(remoteViews, translationContext, (bq3) rp3Var);
            return;
        }
        if (rp3Var instanceof EmittableLazyVerticalGridListItem) {
            oz6.d(remoteViews, translationContext, (EmittableLazyVerticalGridListItem) rp3Var);
            return;
        }
        if (rp3Var instanceof fq3) {
            k2a.a(remoteViews, translationContext, (fq3) rp3Var);
        } else {
            if (rp3Var instanceof EmittableSizeBox) {
                t(remoteViews, translationContext, (EmittableSizeBox) rp3Var);
                return;
            }
            throw new IllegalArgumentException("Unknown element type " + rp3Var.getClass().getCanonicalName());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final RemoteViews m(TranslationContext translationContext, List<? extends rp3> list, int i) throws NoWhenBranchMatchedException {
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(((rp3) it.next()) instanceof EmittableSizeBox)) {
                    rp3 rp3Var = (rp3) m.h1(list);
                    RemoteViewsInfo remoteViewsInfoA = LayoutSelectionKt.a(translationContext, rp3Var.getModifier(), i);
                    RemoteViews remoteViews = remoteViewsInfoA.getRemoteViews();
                    l(remoteViews, translationContext.g(remoteViewsInfoA), rp3Var);
                    return remoteViews;
                }
            }
        }
        Object objZ0 = m.z0(list);
        Intrinsics.h(objZ0, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
        m sizeMode = ((EmittableSizeBox) objZ0).getSizeMode();
        ArrayList arrayList = new ArrayList(m.A(list, 10));
        for (rp3 rp3Var2 : list) {
            Intrinsics.h(rp3Var2, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
            long size = ((EmittableSizeBox) rp3Var2).getSize();
            RemoteViewsInfo remoteViewsInfoA2 = LayoutSelectionKt.a(translationContext, rp3Var2.getModifier(), i);
            RemoteViews remoteViews2 = remoteViewsInfoA2.getRemoteViews();
            l(remoteViews2, translationContext.h(remoteViewsInfoA2, size), rp3Var2);
            arrayList.add(qjd.a(AppWidgetUtilsKt.r(size), remoteViews2));
        }
        if (sizeMode instanceof m.c) {
            return (RemoteViews) ((Pair) m.h1(arrayList)).d();
        }
        boolean z = true;
        if (!(sizeMode instanceof m.b ? true : Intrinsics.e(sizeMode, m.a.a))) {
            throw new NoWhenBranchMatchedException();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return a.a.a(b0.x(arrayList));
        }
        if (arrayList.size() != 1 && arrayList.size() != 2) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("unsupported views size");
        }
        ArrayList arrayList2 = new ArrayList(m.A(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((RemoteViews) ((Pair) it2.next()).d());
        }
        return c(arrayList2);
    }

    public static final RemoteViews n(Context context, int i, RemoteViewsRoot remoteViewsRoot, LayoutConfiguration layoutConfiguration, int i2, long j, ComponentName componentName) {
        return m(new TranslationContext(context, i, e(context), layoutConfiguration, -1, false, null, null, null, j, 0, 0, false, null, componentName, 15840, null), remoteViewsRoot.d(), i2);
    }

    private static final void o(RemoteViews remoteViews, TranslationContext translationContext, sp3 sp3Var) {
        RemoteViews remoteViewsD;
        if (sp3Var.d().isEmpty()) {
            remoteViewsD = sp3Var.i();
        } else {
            if (sp3Var.h() == -1) {
                throw new IllegalStateException("To add children to an `AndroidRemoteViews`, its `containerViewId` must be set.");
            }
            remoteViewsD = d(sp3Var.i());
            remoteViewsD.removeAllViews(sp3Var.h());
            int i = 0;
            for (Object obj : sp3Var.d()) {
                int i2 = i + 1;
                if (i < 0) {
                    m.z();
                }
                rp3 rp3Var = (rp3) obj;
                RemoteViewsInfo remoteViewsInfoA = LayoutSelectionKt.a(translationContext, rp3Var.getModifier(), i);
                RemoteViews remoteViews2 = remoteViewsInfoA.getRemoteViews();
                l(remoteViews2, translationContext.g(remoteViewsInfoA), rp3Var);
                a(remoteViewsD, sp3Var.h(), remoteViews2, i);
                i = i2;
            }
        }
        InsertedViewInfo insertedViewInfoD = LayoutSelectionKt.d(remoteViews, translationContext, LayoutType.Frame, sp3Var.getModifier());
        ApplyModifiersKt.e(translationContext, remoteViews, sp3Var.getModifier(), insertedViewInfoD);
        remoteViews.removeAllViews(insertedViewInfoD.getMainViewId());
        a(remoteViews, insertedViewInfoD.getMainViewId(), remoteViewsD, 0);
    }

    private static final void p(RemoteViews remoteViews, TranslationContext translationContext, EmittableBox emittableBox) {
        InsertedViewInfo insertedViewInfoC = LayoutSelectionKt.c(remoteViews, translationContext, LayoutType.Box, emittableBox.d().size(), emittableBox.getModifier(), Alignment.b.d(emittableBox.getContentAlignment().getHorizontal()), Alignment.c.d(emittableBox.getContentAlignment().getVertical()));
        ApplyModifiersKt.e(translationContext, remoteViews, emittableBox.getModifier(), insertedViewInfoC);
        for (rp3 rp3Var : emittableBox.d()) {
            rp3Var.b(rp3Var.getModifier().a(new xc(emittableBox.getContentAlignment())));
        }
        g(remoteViews, translationContext, insertedViewInfoC, emittableBox.d());
    }

    private static final void q(RemoteViews remoteViews, TranslationContext translationContext, EmittableButton emittableButton) {
        if (Build.VERSION.SDK_INT < 31) {
            throw new IllegalStateException("Buttons in Android R and below are emulated using a EmittableBox containing the text.");
        }
        InsertedViewInfo insertedViewInfoD = LayoutSelectionKt.d(remoteViews, translationContext, LayoutType.Button, emittableButton.getModifier());
        a0d.a(remoteViews, translationContext, insertedViewInfoD.getMainViewId(), emittableButton.getText(), emittableButton.getStyle(), emittableButton.getMaxLines(), 16);
        float f = 16;
        emittableButton.b(ba2.a(ny.a(emittableButton.getModifier(), emittableButton.getEnabled()), ff3.i(f)));
        if (emittableButton.getModifier().foldIn(null, new Function2<PaddingModifier, g.b, PaddingModifier>() { // from class: androidx.glance.appwidget.RemoteViewsTranslatorKt$translateEmittableButton$$inlined$findModifier$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaddingModifier invoke(PaddingModifier paddingModifier, g.b bVar) {
                return bVar instanceof PaddingModifier ? bVar : paddingModifier;
            }
        }) == null) {
            emittableButton.b(mx8.b(emittableButton.getModifier(), ff3.i(f), ff3.i(8)));
        }
        ApplyModifiersKt.e(translationContext, remoteViews, emittableButton.getModifier(), insertedViewInfoD);
    }

    private static final void r(RemoteViews remoteViews, TranslationContext translationContext, EmittableColumn emittableColumn) {
        InsertedViewInfo insertedViewInfoC = LayoutSelectionKt.c(remoteViews, translationContext, (Build.VERSION.SDK_INT < 31 || !RadioButtonKt.a(emittableColumn.getModifier())) ? LayoutType.Column : LayoutType.RadioColumn, emittableColumn.d().size(), emittableColumn.getModifier(), Alignment.b.d(emittableColumn.getHorizontalAlignment()), null);
        a.h(remoteViews, insertedViewInfoC.getMainViewId(), h(new Alignment(emittableColumn.getHorizontalAlignment(), emittableColumn.getVerticalAlignment(), null)));
        ApplyModifiersKt.e(translationContext.a(), remoteViews, emittableColumn.getModifier(), insertedViewInfoC);
        g(remoteViews, translationContext, insertedViewInfoC, emittableColumn.d());
        if (RadioButtonKt.a(emittableColumn.getModifier())) {
            b(emittableColumn.d());
        }
    }

    private static final void s(RemoteViews remoteViews, TranslationContext translationContext, EmittableRow emittableRow) {
        InsertedViewInfo insertedViewInfoC = LayoutSelectionKt.c(remoteViews, translationContext, (Build.VERSION.SDK_INT < 31 || !RadioButtonKt.a(emittableRow.getModifier())) ? LayoutType.Row : LayoutType.RadioRow, emittableRow.d().size(), emittableRow.getModifier(), null, Alignment.c.d(emittableRow.getVerticalAlignment()));
        a.h(remoteViews, insertedViewInfoC.getMainViewId(), h(new Alignment(emittableRow.getHorizontalAlignment(), emittableRow.getVerticalAlignment(), null)));
        ApplyModifiersKt.e(translationContext.a(), remoteViews, emittableRow.getModifier(), insertedViewInfoC);
        g(remoteViews, translationContext, insertedViewInfoC, emittableRow.d());
        if (RadioButtonKt.a(emittableRow.getModifier())) {
            b(emittableRow.d());
        }
    }

    public static final void t(RemoteViews remoteViews, TranslationContext translationContext, EmittableSizeBox emittableSizeBox) {
        if (emittableSizeBox.d().size() <= 1) {
            rp3 rp3Var = (rp3) m.B0(emittableSizeBox.d());
            if (rp3Var != null) {
                l(remoteViews, translationContext, rp3Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Size boxes can only have at most one child " + emittableSizeBox.d().size() + ". The normalization of the composition tree failed.").toString());
    }

    private static final void u(RemoteViews remoteViews, TranslationContext translationContext, gq3 gq3Var) {
        ApplyModifiersKt.e(translationContext, remoteViews, gq3Var.getModifier(), LayoutSelectionKt.d(remoteViews, translationContext, LayoutType.Frame, gq3Var.getModifier()));
    }
}
