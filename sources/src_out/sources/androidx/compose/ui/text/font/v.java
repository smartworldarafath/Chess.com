package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import com.google.inputmethod.jod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/font/u;", "", "typeface", "Landroidx/compose/ui/text/font/k;", "font", "Landroidx/compose/ui/text/font/x;", "requestedWeight", "Landroidx/compose/ui/text/font/t;", "requestedStyle", "a", "(ILjava/lang/Object;Landroidx/compose/ui/text/font/k;Landroidx/compose/ui/text/font/x;I)Ljava/lang/Object;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public static final Object a(int i, Object obj, k kVar, FontWeight fontWeight, int i2) {
        boolean z;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z2 = false;
        if (!u.k(i) || Intrinsics.e(kVar.getWeight(), fontWeight)) {
            z = false;
        } else {
            FontWeight.Companion companion = FontWeight.INSTANCE;
            if (fontWeight.compareTo(d.a(companion)) < 0 || kVar.getWeight().compareTo(d.a(companion)) >= 0) {
                z = false;
            } else {
                z = true;
            }
        }
        if (u.j(i) && !t.f(i2, kVar.getStyle())) {
            z2 = true;
        }
        if (z2 || z) {
            return jod.a.a((Typeface) obj, z ? fontWeight.q() : kVar.getWeight().q(), z2 ? t.f(i2, t.INSTANCE.a()) : t.f(kVar.getStyle(), t.INSTANCE.a()));
        }
        return obj;
    }
}
