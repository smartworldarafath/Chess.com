package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/google/android/ah3;", "", "Lkotlin/Function1;", "Lcom/google/android/fz1;", "", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "setBlock$ui", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ah3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Function1<? super fz1, Unit> block;

    public ah3(Function1<? super fz1, Unit> function1) {
        this.block = function1;
    }

    public final Function1<fz1, Unit> a() {
        return this.block;
    }
}
