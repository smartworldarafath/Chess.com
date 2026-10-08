package com.google.inputmethod;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.graphics.n;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/android/c13;", "Lcom/google/android/xkb;", "Lcom/google/android/jf3;", "caretSize", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/tsb;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/graphics/n;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/f43;)Landroidx/compose/ui/graphics/n;", "createOutline", "a", "J", "getCaretSize-MYxV2XQ", "()J", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c13 implements xkb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long caretSize;

    public /* synthetic */ c13(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    @Override // com.google.inputmethod.xkb
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public n mo5createOutlinePq9zytI(long size, LayoutDirection layoutDirection, f43 density) {
        Path pathA = d.a();
        float fX2 = density.x2(jf3.h(this.caretSize));
        float fX3 = density.x2(jf3.g(this.caretSize));
        pathA.b(0.0f, 0.0f);
        float f = 2;
        pathA.c(fX2 / f, 0.0f);
        pathA.c(0.0f, fX3);
        pathA.c((-fX2) / f, 0.0f);
        pathA.close();
        return new n.a(pathA);
    }

    private c13(long j) {
        this.caretSize = j;
    }
}
