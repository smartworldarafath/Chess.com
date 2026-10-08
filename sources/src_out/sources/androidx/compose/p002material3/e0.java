package androidx.compose.p002material3;

import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/e0;", "Landroidx/compose/ui/b$c;", "Lkotlin/Function0;", "", "updateStateOnAttach", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "V2", "()V", "p", "Lkotlin/jvm/functions/Function0;", "getUpdateStateOnAttach", "()Lkotlin/jvm/functions/Function0;", "m3", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class e0 extends b.c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function0<Unit> updateStateOnAttach;

    public e0(Function0<Unit> function0) {
        this.updateStateOnAttach = function0;
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        this.updateStateOnAttach.invoke();
    }

    public final void m3(Function0<Unit> function0) {
        this.updateStateOnAttach = function0;
    }
}
