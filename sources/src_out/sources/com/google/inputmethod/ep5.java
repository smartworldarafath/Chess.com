package com.google.inputmethod;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/ml5$a;", "Landroid/content/res/Resources;", "res", "", "id", "Lcom/google/android/ml5;", "a", "(Lcom/google/android/ml5$a;Landroid/content/res/Resources;I)Lcom/google/android/ml5;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ep5 {
    public static final ml5 a(ml5.Companion companion, Resources resources, int i) {
        Drawable drawable = resources.getDrawable(i, null);
        Intrinsics.h(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return cl.c(((BitmapDrawable) drawable).getBitmap());
    }
}
