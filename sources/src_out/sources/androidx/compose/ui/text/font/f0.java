package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import com.google.inputmethod.jod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\fJ9\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/font/f0;", "Landroidx/compose/ui/text/font/e0;", "<init>", "()V", "", "familyName", "Landroidx/compose/ui/text/font/x;", "weight", "Landroidx/compose/ui/text/font/t;", "style", "Landroid/graphics/Typeface;", "e", "(Ljava/lang/String;Landroidx/compose/ui/text/font/x;I)Landroid/graphics/Typeface;", "genericFontFamily", "fontWeight", "fontStyle", "d", "Landroidx/compose/ui/text/font/w$d;", "variationSettings", "Landroid/content/Context;", "context", "c", "(Ljava/lang/String;Landroidx/compose/ui/text/font/x;ILandroidx/compose/ui/text/font/w$d;Landroid/content/Context;)Landroid/graphics/Typeface;", "b", "(Landroidx/compose/ui/text/font/x;I)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/y;", "name", "a", "(Landroidx/compose/ui/text/font/y;Landroidx/compose/ui/text/font/x;I)Landroid/graphics/Typeface;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f0 implements e0 {
    private final Typeface d(String genericFontFamily, FontWeight fontWeight, int fontStyle) {
        t.Companion companion = t.INSTANCE;
        if (t.f(fontStyle, companion.b()) && Intrinsics.e(fontWeight, FontWeight.INSTANCE.f()) && (genericFontFamily == null || genericFontFamily.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(genericFontFamily == null ? Typeface.DEFAULT : Typeface.create(genericFontFamily, 0), fontWeight.q(), t.f(fontStyle, companion.a()));
    }

    private final Typeface e(String familyName, FontWeight weight, int style) {
        if (familyName.length() == 0) {
            return null;
        }
        Typeface typefaceD = d(familyName, weight, style);
        if (Intrinsics.e(typefaceD, jod.a.a(Typeface.DEFAULT, weight.q(), t.f(style, t.INSTANCE.a()))) || Intrinsics.e(typefaceD, d(null, weight, style))) {
            return null;
        }
        return typefaceD;
    }

    @Override // androidx.compose.ui.text.font.e0
    public Typeface a(y name, FontWeight fontWeight, int fontStyle) {
        return d(name.getName(), fontWeight, fontStyle);
    }

    @Override // androidx.compose.ui.text.font.e0
    public Typeface b(FontWeight fontWeight, int fontStyle) {
        return d(null, fontWeight, fontStyle);
    }

    @Override // androidx.compose.ui.text.font.e0
    public Typeface c(String familyName, FontWeight weight, int style, w.d variationSettings, Context context) {
        Typeface typefaceA;
        l.Companion companion = l.INSTANCE;
        if (Intrinsics.e(familyName, companion.d().getName())) {
            typefaceA = a(companion.d(), weight, style);
        } else if (Intrinsics.e(familyName, companion.e().getName())) {
            typefaceA = a(companion.e(), weight, style);
        } else if (Intrinsics.e(familyName, companion.c().getName())) {
            typefaceA = a(companion.c(), weight, style);
        } else {
            typefaceA = Intrinsics.e(familyName, companion.a().getName()) ? a(companion.a(), weight, style) : e(familyName, weight, style);
        }
        return g0.b(typefaceA, variationSettings, context);
    }
}
