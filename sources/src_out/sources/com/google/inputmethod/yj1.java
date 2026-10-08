package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/yj1;", "Lcom/google/android/xj1;", "<init>", "()V", "Landroidx/compose/ui/b;", "", "weight", "", "fill", "a", "(Landroidx/compose/ui/b;FZ)Landroidx/compose/ui/b;", "Lcom/google/android/tc$b;", "alignment", "b", "(Landroidx/compose/ui/b;Lcom/google/android/tc$b;)Landroidx/compose/ui/b;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class yj1 implements xj1 {
    public static final yj1 a = new yj1();

    private yj1() {
    }

    @Override // com.google.inputmethod.xj1
    public b a(b bVar, float f, boolean z) {
        if (!(((double) f) > 0.0d)) {
            xw5.a("invalid weight; must be greater than zero");
        }
        return bVar.then(new po6(g.i(f, Float.MAX_VALUE), z));
    }

    @Override // com.google.inputmethod.xj1
    public b b(b bVar, tc.b bVar2) {
        return bVar.then(new lf5(bVar2));
    }
}
