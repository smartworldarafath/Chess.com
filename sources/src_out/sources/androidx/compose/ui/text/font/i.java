package androidx.compose.ui.text.font;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/h93;", "familyName", "Landroidx/compose/ui/text/font/x;", "weight", "Landroidx/compose/ui/text/font/t;", "style", "Landroidx/compose/ui/text/font/w$d;", "variationSettings", "Landroidx/compose/ui/text/font/k;", "a", "(Ljava/lang/String;Landroidx/compose/ui/text/font/x;ILandroidx/compose/ui/text/font/w$d;)Landroidx/compose/ui/text/font/k;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    public static final k a(String str, FontWeight fontWeight, int i, w.d dVar) {
        return new Font(str, fontWeight, i, dVar, null);
    }

    public static /* synthetic */ k b(String str, FontWeight fontWeight, int i, w.d dVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.f();
        }
        if ((i2 & 4) != 0) {
            i = t.INSTANCE.b();
        }
        if ((i2 & 8) != 0) {
            dVar = new w.d(new w.a[0]);
        }
        return a(str, fontWeight, i, dVar);
    }
}
