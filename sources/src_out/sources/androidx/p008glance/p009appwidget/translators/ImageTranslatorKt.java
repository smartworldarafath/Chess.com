package androidx.p008glance.p009appwidget.translators;

import android.graphics.Color;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.widget.a;
import androidx.p008glance.EmittableImage;
import androidx.p008glance.ImageKt;
import androidx.p008glance.g;
import androidx.p008glance.p009appwidget.ApplyModifiersKt;
import androidx.p008glance.p009appwidget.LayoutSelectionKt;
import androidx.p008glance.p009appwidget.LayoutType;
import com.google.inputmethod.AndroidResourceImageProvider;
import com.google.inputmethod.BitmapImageProvider;
import com.google.inputmethod.InsertedViewInfo;
import com.google.inputmethod.TintAndAlphaColorFilterParams;
import com.google.inputmethod.TranslationContext;
import com.google.inputmethod.dvd;
import com.google.inputmethod.e02;
import com.google.inputmethod.hi1;
import com.google.inputmethod.ia3;
import com.google.inputmethod.ihe;
import com.google.inputmethod.ki1;
import com.google.inputmethod.ko5;
import com.google.inputmethod.oj5;
import com.google.inputmethod.s8d;
import com.google.inputmethod.ti1;
import com.google.inputmethod.wa5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a.\u0010\u001b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroid/widget/RemoteViews;", "Lcom/google/android/bgd;", "translationContext", "Landroidx/glance/e;", "element", "", "e", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Landroidx/glance/e;)V", "Landroidx/glance/appwidget/LayoutType;", "b", "(Landroidx/glance/e;)Landroidx/glance/appwidget/LayoutType;", "rv", "Lcom/google/android/hi1;", "colorFilterParams", "Lcom/google/android/sy5;", "viewDef", "a", "(Lcom/google/android/bgd;Landroid/widget/RemoteViews;Lcom/google/android/hi1;Lcom/google/android/sy5;)V", "", "viewId", "Lcom/google/android/oj5;", "provider", "d", "(Landroid/widget/RemoteViews;ILcom/google/android/oj5;)V", "Lcom/google/android/ei1;", "notNight", "night", "c", "(Landroid/widget/RemoteViews;IJJ)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ImageTranslatorKt {
    private static final void a(TranslationContext translationContext, RemoteViews remoteViews, hi1 hi1Var, InsertedViewInfo insertedViewInfo) {
        if (hi1Var instanceof s8d) {
            ti1 ti1VarA = ((s8d) hi1Var).a();
            if (Build.VERSION.SDK_INT >= 31) {
                b.a.a(translationContext, remoteViews, ti1VarA, insertedViewInfo.getMainViewId());
                return;
            } else {
                a.d(remoteViews, insertedViewInfo.getMainViewId(), ki1.j(ti1VarA.a(translationContext.getContext())));
                return;
            }
        }
        if (!(hi1Var instanceof TintAndAlphaColorFilterParams)) {
            throw new IllegalArgumentException("An unsupported ColorFilter was used.");
        }
        if (Build.VERSION.SDK_INT > 30) {
            new Throwable();
            return;
        }
        int iJ = ki1.j(((TintAndAlphaColorFilterParams) hi1Var).getColorProvider().a(translationContext.getContext()));
        a.d(remoteViews, insertedViewInfo.getMainViewId(), iJ);
        a.g(remoteViews, insertedViewInfo.getMainViewId(), Color.alpha(iJ));
    }

    private static final LayoutType b(EmittableImage emittableImage) {
        boolean zD = ImageKt.d(emittableImage);
        int contentScale = emittableImage.getContentScale();
        e02.Companion companion = e02.INSTANCE;
        if (e02.g(contentScale, companion.a())) {
            return zD ? LayoutType.ImageCropDecorative : LayoutType.ImageCrop;
        }
        if (e02.g(contentScale, companion.c())) {
            return zD ? LayoutType.ImageFitDecorative : LayoutType.ImageFit;
        }
        if (e02.g(contentScale, companion.b())) {
            return zD ? LayoutType.ImageFillBoundsDecorative : LayoutType.ImageFillBounds;
        }
        e02.i(emittableImage.getContentScale());
        return LayoutType.ImageFit;
    }

    public static final void c(RemoteViews remoteViews, int i, long j, long j2) {
        a.e(remoteViews, i, ki1.j(j), ki1.j(j2));
    }

    private static final void d(RemoteViews remoteViews, int i, oj5 oj5Var) {
        a.a.a(remoteViews, i, oj5Var.a());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    public static final void e(RemoteViews remoteViews, TranslationContext translationContext, EmittableImage emittableImage) {
        boolean z;
        InsertedViewInfo insertedViewInfoD = LayoutSelectionKt.d(remoteViews, translationContext, b(emittableImage), emittableImage.getModifier());
        ko5 provider = emittableImage.getProvider();
        if (provider instanceof AndroidResourceImageProvider) {
            remoteViews.setImageViewResource(insertedViewInfoD.getMainViewId(), ((AndroidResourceImageProvider) provider).getResId());
        } else if (provider instanceof BitmapImageProvider) {
            remoteViews.setImageViewBitmap(insertedViewInfoD.getMainViewId(), ((BitmapImageProvider) provider).getBitmap());
        } else if (provider instanceof dvd) {
            remoteViews.setImageViewUri(insertedViewInfoD.getMainViewId(), ((dvd) provider).a());
        } else {
            if (!(provider instanceof oj5)) {
                throw new IllegalArgumentException("An unsupported ImageProvider type was used.");
            }
            d(remoteViews, insertedViewInfoD.getMainViewId(), (oj5) provider);
        }
        hi1 colorFilterParams = emittableImage.getColorFilterParams();
        if (colorFilterParams != null) {
            a(translationContext, remoteViews, colorFilterParams, insertedViewInfoD);
        }
        ApplyModifiersKt.e(translationContext, remoteViews, emittableImage.getModifier(), insertedViewInfoD);
        if (e02.g(emittableImage.getContentScale(), e02.INSTANCE.c())) {
            ihe iheVar = (ihe) emittableImage.getModifier().foldIn(null, new Function2<ihe, g.b, ihe>() { // from class: androidx.glance.appwidget.translators.ImageTranslatorKt$translateEmittableImage$$inlined$findModifier$1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ihe invoke(ihe iheVar2, g.b bVar) {
                    return bVar instanceof ihe ? bVar : iheVar2;
                }
            });
            ia3 width = iheVar != null ? iheVar.getWidth() : null;
            ia3.e eVar = ia3.e.a;
            if (!Intrinsics.e(width, eVar)) {
                wa5 wa5Var = (wa5) emittableImage.getModifier().foldIn(null, new Function2<wa5, g.b, wa5>() { // from class: androidx.glance.appwidget.translators.ImageTranslatorKt$translateEmittableImage$$inlined$findModifier$2
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final wa5 invoke(wa5 wa5Var2, g.b bVar) {
                        return bVar instanceof wa5 ? bVar : wa5Var2;
                    }
                });
                if (!Intrinsics.e(wa5Var != null ? wa5Var.getHeight() : null, eVar)) {
                    z = false;
                }
            }
            z = true;
        } else {
            z = false;
        }
        a.c(remoteViews, insertedViewInfoD.getMainViewId(), z);
    }
}
