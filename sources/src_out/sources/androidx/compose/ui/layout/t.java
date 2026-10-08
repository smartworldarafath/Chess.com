package androidx.compose.ui.layout;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/layout/o$a;", "", "useGreater", "", "Landroidx/compose/ui/layout/s;", "rulers", "", "defaultValue", "b", "(Landroidx/compose/ui/layout/o$a;Z[Landroidx/compose/ui/layout/s;F)F", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    public static final float b(o.a aVar, boolean z, s[] sVarArr, float f) {
        float f2 = Float.NaN;
        for (s sVar : sVarArr) {
            float fJ = aVar.j(sVar, Float.NaN);
            if (Float.isNaN(f2)) {
                f2 = fJ;
            } else if (z == (fJ > f2)) {
                f2 = fJ;
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }
}
