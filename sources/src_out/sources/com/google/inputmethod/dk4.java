package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/android/dk4;", "Lcom/google/android/ik4;", "Landroidx/compose/ui/b$c;", "Lkotlin/Function1;", "Lcom/google/android/dl4;", "", "onFocusChanged", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "focusState", "J", "(Lcom/google/android/dl4;)V", "p", "Lkotlin/jvm/functions/Function1;", "getOnFocusChanged", "()Lkotlin/jvm/functions/Function1;", "m3", "q", "Lcom/google/android/dl4;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class dk4 extends b.c implements ik4 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function1<? super dl4, Unit> onFocusChanged;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private dl4 focusState;

    public dk4(Function1<? super dl4, Unit> function1) {
        this.onFocusChanged = function1;
    }

    @Override // com.google.inputmethod.ik4
    public void J(dl4 focusState) {
        if (Intrinsics.e(this.focusState, focusState)) {
            return;
        }
        this.focusState = focusState;
        this.onFocusChanged.invoke(focusState);
    }

    public final void m3(Function1<? super dl4, Unit> function1) {
        this.onFocusChanged = function1;
    }
}
