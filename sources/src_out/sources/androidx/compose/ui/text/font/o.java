package androidx.compose.ui.text.font;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "resId", "Landroidx/compose/ui/text/font/x;", "weight", "Landroidx/compose/ui/text/font/t;", "style", "Landroidx/compose/ui/text/font/r;", "loadingStrategy", "Landroidx/compose/ui/text/font/k;", "a", "(ILandroidx/compose/ui/text/font/x;II)Landroidx/compose/ui/text/font/k;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {
    public static final k a(int i, FontWeight fontWeight, int i2, int i3) {
        return new ResourceFont(i, fontWeight, i2, new w.d(new w.a[0]), i3, null);
    }

    public static /* synthetic */ k b(int i, FontWeight fontWeight, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.f();
        }
        if ((i4 & 4) != 0) {
            i2 = t.INSTANCE.b();
        }
        if ((i4 & 8) != 0) {
            i3 = r.INSTANCE.b();
        }
        return a(i, fontWeight, i2, i3);
    }
}
