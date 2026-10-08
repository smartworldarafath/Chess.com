package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.node.c;
import com.google.android.ps4;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.google.android.yn6, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R:\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/google/android/yn6;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/b$c;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "Lcom/google/android/kx1;", "Lcom/google/android/fj7;", "measureBlock", "<init>", "(Lcom/google/android/ps4;)V", "measurable", "constraints", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "", "toString", "()Ljava/lang/String;", "p", "Lcom/google/android/ps4;", "getMeasureBlock", "()Lcom/google/android/ps4;", "m3", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LayoutModifierImpl extends b.c implements c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    private ps4<? super j, ? super dj7, ? super kx1, ? extends fj7> measureBlock;

    public LayoutModifierImpl(ps4<? super j, ? super dj7, ? super kx1, ? extends fj7> ps4Var) {
        this.measureBlock = ps4Var;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        return (fj7) this.measureBlock.invoke(jVar, dj7Var, kx1.a(j));
    }

    public final void m3(ps4<? super j, ? super dj7, ? super kx1, ? extends fj7> ps4Var) {
        this.measureBlock = ps4Var;
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
    }
}
