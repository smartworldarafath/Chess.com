package com.google.inputmethod;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.end, reason: from Kotlin metadata */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/content/res/TypedArray;", "", "index", "", "a", "(Landroid/content/res/TypedArray;I)V", "Landroid/graphics/drawable/Drawable;", "b", "(Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;", "core-ktx"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TypedArray {
    private static final void a(android.content.res.TypedArray typedArray, int i) {
        if (!typedArray.hasValue(i)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final Drawable b(android.content.res.TypedArray typedArray, int i) {
        a(typedArray, i);
        Drawable drawable = typedArray.getDrawable(i);
        Intrinsics.g(drawable);
        return drawable;
    }
}
