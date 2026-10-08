package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/google/android/rp1;", "Lcom/google/android/uc0;", "Lcom/google/android/wc0;", "info", "<init>", "(Lcom/google/android/wc0;)V", "", "e", "()V", "Lkotlin/Function0;", "d", "Lkotlin/jvm/functions/Function0;", "getCurrentOnBackCompleted", "()Lkotlin/jvm/functions/Function0;", "k", "(Lkotlin/jvm/functions/Function0;)V", "currentOnBackCompleted", "activity-compose"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class rp1 extends uc0 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function0<Unit> currentOnBackCompleted;

    public rp1(BackHandlerInfo backHandlerInfo) {
        super(backHandlerInfo);
        this.currentOnBackCompleted = new Function0() { // from class: com.google.android.qp1
            public final Object invoke() {
                return rp1.j();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j() {
        return Unit.a;
    }

    @Override // com.google.inputmethod.uc0
    public void e() {
        this.currentOnBackCompleted.invoke();
    }

    public final void k(Function0<Unit> function0) {
        this.currentOnBackCompleted = function0;
    }
}
