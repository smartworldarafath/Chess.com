package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/android/vp6;", "Lcom/google/android/up6;", "<init>", "()V", "Landroidx/compose/ui/b;", "Lcom/google/android/xa4;", "", "fadeInSpec", "Lcom/google/android/g16;", "placementSpec", "fadeOutSpec", "a", "(Landroidx/compose/ui/b;Lcom/google/android/xa4;Lcom/google/android/xa4;Lcom/google/android/xa4;)Landroidx/compose/ui/b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class vp6 implements up6 {
    public static final vp6 a = new vp6();

    private vp6() {
    }

    @Override // com.google.inputmethod.up6
    public b a(b bVar, xa4<Float> xa4Var, xa4<g16> xa4Var2, xa4<Float> xa4Var3) {
        return (xa4Var == null && xa4Var2 == null && xa4Var3 == null) ? bVar : bVar.then(new LazyLayoutAnimateItemElement(xa4Var, xa4Var2, xa4Var3));
    }
}
