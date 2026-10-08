package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import com.google.android.q22;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/font/a0;", "Landroidx/compose/ui/text/font/b$a;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/compose/ui/text/font/b;", "font", "Landroid/graphics/Typeface;", "b", "(Landroid/content/Context;Landroidx/compose/ui/text/font/b;)Landroid/graphics/Typeface;", "a", "(Landroid/content/Context;Landroidx/compose/ui/text/font/b;Lcom/google/android/q22;)Ljava/lang/Object;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a0 implements b.a {
    public static final a0 a = new a0();

    private a0() {
    }

    @Override // androidx.compose.ui.text.font.b.a
    public Object a(Context context, b bVar, q22<? super Typeface> q22Var) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }

    @Override // androidx.compose.ui.text.font.b.a
    public Typeface b(Context context, b font) {
        Font hVar = font instanceof Font ? (Font) font : null;
        if (hVar != null) {
            return hVar.f(context);
        }
        return null;
    }
}
