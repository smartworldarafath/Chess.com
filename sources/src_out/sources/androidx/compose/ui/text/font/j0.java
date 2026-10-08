package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import com.google.inputmethod.f43;
import com.google.inputmethod.k43;
import com.google.inputmethod.ok;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/j0;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/w$d;", "Landroid/content/Context;", "context", "", "Landroid/graphics/fonts/FontVariationAxis;", "b", "(Landroidx/compose/ui/text/font/w$d;Landroid/content/Context;)[Landroid/graphics/fonts/FontVariationAxis;", "Landroid/content/res/AssetManager;", "assetManager", "", "path", "variationSettings", "Landroid/graphics/Typeface;", "a", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroid/content/Context;Landroidx/compose/ui/text/font/w$d;)Landroid/graphics/Typeface;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j0 {
    public static final j0 a = new j0();

    private j0() {
    }

    private final FontVariationAxis[] b(w.d dVar, Context context) {
        f43 f43VarA;
        if (context != null) {
            f43VarA = ok.a(context);
        } else {
            if (dVar.getNeedsDensity()) {
                throw new IllegalStateException("Required density, but not provided");
            }
            f43VarA = k43.a(1.0f, 1.0f);
        }
        return c0.d(dVar, f43VarA, c0.c(context));
    }

    public final Typeface a(AssetManager assetManager, String path, Context context, w.d variationSettings) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(assetManager, path).setFontVariationSettings(b(variationSettings, context)).build();
    }
}
