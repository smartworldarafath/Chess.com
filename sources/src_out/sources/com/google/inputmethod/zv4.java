package com.google.inputmethod;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/google/android/zv4;", "", "Landroidx/compose/ui/input/pointer/i;", "event", "", "B1", "(Landroidx/compose/ui/input/pointer/i;)Z", "Lcom/google/android/hv5;", "D2", "(Lcom/google/android/hv5;)Z", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface zv4 {
    default boolean B1(PointerInputChange event) {
        return false;
    }

    default boolean D2(IndirectPointerInputChange event) {
        return false;
    }
}
