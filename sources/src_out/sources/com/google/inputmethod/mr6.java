package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJC\u0010\u0015\u001a\u00020\n*\u00020\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/google/android/mr6;", "Lcom/google/android/lr6;", "<init>", "()V", "", "width", "height", "", "g", "(II)V", "Landroidx/compose/ui/b;", "", "fraction", "f", "(Landroidx/compose/ui/b;F)Landroidx/compose/ui/b;", "e", "Lcom/google/android/xa4;", "fadeInSpec", "Lcom/google/android/g16;", "placementSpec", "fadeOutSpec", "a", "(Landroidx/compose/ui/b;Lcom/google/android/xa4;Lcom/google/android/xa4;Lcom/google/android/xa4;)Landroidx/compose/ui/b;", "Lcom/google/android/q48;", "Lcom/google/android/q48;", "maxWidthState", "b", "maxHeightState", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class mr6 implements lr6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private q48 maxWidthState = mwb.a(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private q48 maxHeightState = mwb.a(Integer.MAX_VALUE);

    @Override // com.google.inputmethod.lr6
    public b a(b bVar, xa4<Float> xa4Var, xa4<g16> xa4Var2, xa4<Float> xa4Var3) {
        return (xa4Var == null && xa4Var2 == null && xa4Var3 == null) ? bVar : bVar.then(new LazyLayoutAnimateItemElement(xa4Var, xa4Var2, xa4Var3));
    }

    @Override // com.google.inputmethod.lr6
    public b e(b bVar, float f) {
        return bVar.then(new d29(f, null, this.maxHeightState, "fillParentMaxHeight", 2, null));
    }

    @Override // com.google.inputmethod.lr6
    public b f(b bVar, float f) {
        return bVar.then(new d29(f, this.maxWidthState, null, "fillParentMaxWidth", 4, null));
    }

    public final void g(int width, int height) {
        this.maxWidthState.f(width);
        this.maxHeightState.f(height);
    }
}
