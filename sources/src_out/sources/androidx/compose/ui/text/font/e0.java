package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/e0;", "", "Landroidx/compose/ui/text/font/x;", "fontWeight", "Landroidx/compose/ui/text/font/t;", "fontStyle", "Landroid/graphics/Typeface;", "b", "(Landroidx/compose/ui/text/font/x;I)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/y;", "name", "a", "(Landroidx/compose/ui/text/font/y;Landroidx/compose/ui/text/font/x;I)Landroid/graphics/Typeface;", "", "familyName", "weight", "style", "Landroidx/compose/ui/text/font/w$d;", "variationSettings", "Landroid/content/Context;", "context", "c", "(Ljava/lang/String;Landroidx/compose/ui/text/font/x;ILandroidx/compose/ui/text/font/w$d;Landroid/content/Context;)Landroid/graphics/Typeface;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e0 {
    Typeface a(y name, FontWeight fontWeight, int fontStyle);

    Typeface b(FontWeight fontWeight, int fontStyle);

    Typeface c(String familyName, FontWeight weight, int style, w.d variationSettings, Context context);
}
