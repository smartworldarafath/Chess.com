package com.google.inputmethod;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lcom/google/android/hc9;", "", "Landroidx/compose/ui/input/pointer/i;", "event", "Lcom/google/android/rn8;", "offset", "", "c", "(Landroidx/compose/ui/input/pointer/i;J)V", "", "timeMillis", "position", "b", "(JJ)V", "Lcom/google/android/t3e;", "maximumVelocity", "a", "(J)J", "d", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface hc9 {
    long a(long maximumVelocity);

    void b(long timeMillis, long position);

    void c(PointerInputChange event, long offset);

    void d();
}
