package com.google.inputmethod;

import android.graphics.Bitmap;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.google.android.do0, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/do0;", "Lcom/google/android/ko5;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "", "toString", "()Ljava/lang/String;", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BitmapImageProvider implements ko5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Bitmap bitmap;

    public BitmapImageProvider(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public String toString() {
        return "BitmapImageProvider(bitmap=Bitmap(" + this.bitmap.getWidth() + "px x " + this.bitmap.getHeight() + "px))";
    }
}
