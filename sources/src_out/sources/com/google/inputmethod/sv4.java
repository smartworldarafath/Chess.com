package com.google.inputmethod;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.graphics.n;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R,\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/google/android/sv4;", "Lcom/google/android/xkb;", "Lkotlin/Function3;", "Landroidx/compose/ui/graphics/Path;", "Lcom/google/android/tsb;", "Landroidx/compose/ui/unit/LayoutDirection;", "", "builder", "<init>", "(Lcom/google/android/ps4;)V", "size", "layoutDirection", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/graphics/n;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/f43;)Landroidx/compose/ui/graphics/n;", "createOutline", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lcom/google/android/ps4;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class sv4 implements xkb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ps4<Path, tsb, LayoutDirection, Unit> builder;

    /* JADX WARN: Multi-variable type inference failed */
    public sv4(ps4<? super Path, ? super tsb, ? super LayoutDirection, Unit> ps4Var) {
        this.builder = ps4Var;
    }

    @Override // com.google.inputmethod.xkb
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public n mo5createOutlinePq9zytI(long size, LayoutDirection layoutDirection, f43 density) {
        Path pathA = d.a();
        this.builder.invoke(pathA, tsb.c(size), layoutDirection);
        pathA.close();
        return new n.a(pathA);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        sv4 sv4Var = other instanceof sv4 ? (sv4) other : null;
        return (sv4Var != null ? sv4Var.builder : null) == this.builder;
    }

    public int hashCode() {
        return this.builder.hashCode();
    }
}
