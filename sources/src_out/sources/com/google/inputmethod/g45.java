package com.google.inputmethod;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/google/android/g45;", "Lcom/google/android/rg9;", "Lcom/google/android/tc;", "handleReferencePoint", "Lcom/google/android/co8;", "positionProvider", "<init>", "(Lcom/google/android/tc;Lcom/google/android/co8;)V", "Lcom/google/android/k16;", "anchorBounds", "Lcom/google/android/q16;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Lcom/google/android/g16;", "a", "(Lcom/google/android/k16;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "Lcom/google/android/tc;", "b", "Lcom/google/android/co8;", "Lcom/google/android/rn8;", "c", "J", "prevPosition", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g45 implements rg9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final tc handleReferencePoint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final co8 positionProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long prevPosition = rn8.INSTANCE.c();

    public g45(tc tcVar, co8 co8Var) {
        this.handleReferencePoint = tcVar;
        this.positionProvider = co8Var;
    }

    @Override // com.google.inputmethod.rg9
    public long a(k16 anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        long jA = this.positionProvider.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.prevPosition;
        }
        this.prevPosition = jA;
        return g16.o(g16.o(anchorBounds.p(), h16.d(jA)), this.handleReferencePoint.a(popupContentSize, q16.INSTANCE.a(), layoutDirection));
    }
}
