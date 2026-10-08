package androidx.p008glance.p010session;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@lq2(c = "androidx.glance.session.GlobalSnapshotManagerKt", f = "GlobalSnapshotManager.kt", l = {89}, m = "globalSnapshotMonitor")
final class GlobalSnapshotManagerKt$globalSnapshotMonitor$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    GlobalSnapshotManagerKt$globalSnapshotMonitor$1(q22<? super GlobalSnapshotManagerKt$globalSnapshotMonitor$1> q22Var) {
        super(q22Var);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= t04.INVALID_ID;
        return GlobalSnapshotManagerKt.a(this);
    }
}
