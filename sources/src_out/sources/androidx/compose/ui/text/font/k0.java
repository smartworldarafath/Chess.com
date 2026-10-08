package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/font/k0;", "", "<init>", "()V", "Landroid/graphics/Typeface;", "typeface", "Landroidx/compose/ui/text/font/w$d;", "variationSettings", "Landroid/content/Context;", "context", "a", "(Landroid/graphics/Typeface;Landroidx/compose/ui/text/font/w$d;Landroid/content/Context;)Landroid/graphics/Typeface;", "Ljava/lang/ThreadLocal;", "Landroid/graphics/Paint;", "b", "Ljava/lang/ThreadLocal;", "threadLocalPaint", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class k0 {
    public static final k0 a = new k0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static ThreadLocal<Paint> threadLocalPaint = new ThreadLocal<>();

    private k0() {
    }

    public final Typeface a(Typeface typeface, w.d variationSettings, Context context) {
        if (typeface == null) {
            return null;
        }
        if (variationSettings.b().isEmpty()) {
            return typeface;
        }
        Paint paint = threadLocalPaint.get();
        if (paint == null) {
            paint = new Paint();
            threadLocalPaint.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(c0.e(variationSettings, context));
        return paint.getTypeface();
    }
}
