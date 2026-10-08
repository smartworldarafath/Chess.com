package com.google.inputmethod;

import android.os.Build;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.widget.RemoteViews;
import androidx.core.widget.a;
import androidx.p008glance.p009appwidget.ApplyModifiersKt;
import androidx.p008glance.p009appwidget.LayoutSelectionKt;
import androidx.p008glance.p009appwidget.LayoutType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aG\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroid/widget/RemoteViews;", "Lcom/google/android/bgd;", "translationContext", "Lcom/google/android/iq3;", "element", "", "c", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Lcom/google/android/iq3;)V", "", "resId", "", "text", "Lcom/google/android/uzc;", "style", "maxLines", "verticalTextGravity", "a", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;ILjava/lang/String;Lcom/google/android/uzc;II)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a0d {
    public static final void a(RemoteViews remoteViews, TranslationContext translationContext, int i, String str, TextStyle textStyle, int i2, int i3) {
        if (i2 != Integer.MAX_VALUE) {
            a.s(remoteViews, i, i2);
        }
        if (textStyle == null) {
            remoteViews.setTextViewText(i, str);
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        int length = spannableString.length();
        b0d fontSize = textStyle.getFontSize();
        if (fontSize != null) {
            long packedValue = fontSize.getPackedValue();
            if (!b0d.k(packedValue)) {
                throw new IllegalArgumentException("Only Sp is currently supported for font sizes");
            }
            remoteViews.setTextViewTextSize(i, 2, b0d.h(packedValue));
        }
        ArrayList arrayList = new ArrayList();
        textStyle.g();
        textStyle.d();
        textStyle.e();
        textStyle.b();
        textStyle.f();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            spannableString.setSpan((ParcelableSpan) it.next(), 0, length, 17);
        }
        remoteViews.setTextViewText(i, spannableString);
        ti1 color = textStyle.getColor();
        if (color instanceof FixedColorProvider) {
            remoteViews.setTextColor(i, ki1.j(((FixedColorProvider) color).getColor()));
            return;
        }
        if (color instanceof ResourceColorProvider) {
            if (Build.VERSION.SDK_INT >= 31) {
                a.u(remoteViews, i, ((ResourceColorProvider) color).getResId());
                return;
            } else {
                remoteViews.setTextColor(i, ki1.j(color.a(translationContext.getContext())));
                return;
            }
        }
        if (!(color instanceof bq2)) {
            Objects.toString(color);
        } else if (Build.VERSION.SDK_INT < 31) {
            remoteViews.setTextColor(i, ki1.j(color.a(translationContext.getContext())));
        } else {
            bq2 bq2Var = (bq2) color;
            a.t(remoteViews, i, ki1.j(bq2Var.b()), ki1.j(bq2Var.c()));
        }
    }

    public static /* synthetic */ void b(RemoteViews remoteViews, TranslationContext translationContext, int i, String str, TextStyle textStyle, int i2, int i3, int i4, Object obj) {
        if ((i4 & 32) != 0) {
            i3 = 48;
        }
        a(remoteViews, translationContext, i, str, textStyle, i2, i3);
    }

    public static final void c(RemoteViews remoteViews, TranslationContext translationContext, EmittableText emittableText) {
        InsertedViewInfo insertedViewInfoD = LayoutSelectionKt.d(remoteViews, translationContext, LayoutType.Text, emittableText.getModifier());
        b(remoteViews, translationContext, insertedViewInfoD.getMainViewId(), emittableText.getText(), emittableText.getStyle(), emittableText.getMaxLines(), 0, 32, null);
        ApplyModifiersKt.e(translationContext, remoteViews, emittableText.getModifier(), insertedViewInfoD);
    }
}
