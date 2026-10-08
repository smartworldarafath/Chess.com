package com.google.inputmethod;

import android.graphics.Region;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\t\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/android/reb;", "Lcom/google/android/ofb;", "<init>", "()V", "Lcom/google/android/k16;", "rect", "", "a", "(Lcom/google/android/k16;)V", "region", "", "c", "(Lcom/google/android/ofb;)Z", "b", "(Lcom/google/android/k16;)Z", "Landroid/graphics/Region;", "Landroid/graphics/Region;", "getRegion", "()Landroid/graphics/Region;", "getBounds", "()Lcom/google/android/k16;", "bounds", "isEmpty", "()Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class reb implements ofb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Region region = new Region();

    @Override // com.google.inputmethod.ofb
    public void a(k16 rect) {
        this.region.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
    }

    @Override // com.google.inputmethod.ofb
    public boolean b(k16 rect) {
        return this.region.op(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), Region.Op.DIFFERENCE);
    }

    @Override // com.google.inputmethod.ofb
    public boolean c(ofb region) {
        Region region2 = this.region;
        Intrinsics.h(region, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticRegionImpl");
        return region2.op(((reb) region).region, Region.Op.INTERSECT);
    }

    @Override // com.google.inputmethod.ofb
    public k16 getBounds() {
        return jba.d(this.region.getBounds());
    }

    @Override // com.google.inputmethod.ofb
    public boolean isEmpty() {
        return this.region.isEmpty();
    }
}
