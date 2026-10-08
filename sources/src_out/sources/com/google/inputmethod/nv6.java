package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u0014\u0010\u001a\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u0014\u0010\u001c\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lcom/google/android/nv6;", "", "", "Lcom/google/android/gv6;", "h", "()Ljava/util/List;", "visibleItemsInfo", "", "g", "()I", "viewportStartOffset", "i", "viewportEndOffset", "d", "totalItemsCount", "Lcom/google/android/q16;", "b", "()J", "viewportSize", "Landroidx/compose/foundation/gestures/Orientation;", "a", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "e", "beforeContentPadding", "c", "afterContentPadding", "f", "mainAxisItemSpacing", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface nv6 {
    default Orientation a() {
        return Orientation.Vertical;
    }

    default long b() {
        return q16.INSTANCE.a();
    }

    default int c() {
        return 0;
    }

    int d();

    default int e() {
        return 0;
    }

    default int f() {
        return 0;
    }

    int g();

    List<gv6> h();

    int i();
}
