package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import com.google.inputmethod.TypefaceRequest;
import com.google.inputmethod.knd;
import com.google.inputmethod.vo;
import com.google.inputmethod.wa9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/b0;", "", "<init>", "()V", "Lcom/google/android/kod;", "typefaceRequest", "Lcom/google/android/wa9;", "platformFontLoader", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/l0$b;", "", "onAsyncCompletion", "createDefaultTypeface", "Landroidx/compose/ui/text/font/l0;", "a", "(Lcom/google/android/kod;Lcom/google/android/wa9;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/font/l0;", "Landroidx/compose/ui/text/font/e0;", "Landroidx/compose/ui/text/font/e0;", "platformTypefaceResolver", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final e0 platformTypefaceResolver = g0.a();

    public l0 a(TypefaceRequest typefaceRequest, wa9 platformFontLoader, Function1<? super l0.b, Unit> onAsyncCompletion, Function1<? super TypefaceRequest, ? extends Object> createDefaultTypeface) {
        Typeface typefaceB;
        l fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null || (fontFamily instanceof g)) {
            typefaceB = this.platformTypefaceResolver.b(typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle());
        } else if (fontFamily instanceof y) {
            typefaceB = this.platformTypefaceResolver.a((y) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle());
        } else {
            if (!(fontFamily instanceof LoadedFontFamily)) {
                return null;
            }
            knd typeface = ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
            Intrinsics.h(typeface, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typefaceB = ((vo) typeface).a(typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle(), typefaceRequest.getFontSynthesis());
        }
        return new l0.b(typefaceB, false, 2, null);
    }
}
