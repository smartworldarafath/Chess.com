package com.google.inputmethod;

import androidx.compose.p004runtime.p005internal.AtomicInt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/google/android/es8;", "Lcom/google/android/o41;", "Lkotlin/Function0;", "", "action", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "cancel", "()V", "b", "Lkotlin/jvm/functions/Function0;", "Lcom/google/android/p30;", "c", "Landroidx/compose/runtime/internal/AtomicInt;", "didFireCancellation", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class es8 implements o41 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function0<Unit> action;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AtomicInt didFireCancellation = p30.b(false);

    public es8(Function0<Unit> function0) {
        this.action = function0;
    }

    @Override // com.google.inputmethod.o41
    public void cancel() {
        if (p30.d(this.didFireCancellation, true)) {
            return;
        }
        this.action.invoke();
    }
}
