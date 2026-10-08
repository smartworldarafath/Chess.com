package androidx.compose.ui.platform;

import com.google.android.h81;
import com.google.android.p81;
import com.google.android.rw0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "<init>", "()V", "", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "c", "sent", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GlobalSnapshotManager {
    public static final GlobalSnapshotManager a = new GlobalSnapshotManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final AtomicBoolean started = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final AtomicBoolean sent = new AtomicBoolean(false);
    public static final int d = 8;

    private GlobalSnapshotManager() {
    }

    public final void b() {
        if (started.compareAndSet(false, true)) {
            final h81 h81VarB = p81.b(1, (BufferOverflow) null, (Function1) null, 6, (Object) null);
            rw0.d(kotlinx.coroutines.j.a(AndroidUiDispatcher.INSTANCE.b()), (CoroutineContext) null, (CoroutineStart) null, new GlobalSnapshotManager$ensureStarted$1(h81VarB, null), 3, (Object) null);
            androidx.compose.p004runtime.snapshots.g.INSTANCE.j(new Function1<Object, Unit>() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(Object obj) {
                    if (GlobalSnapshotManager.sent.compareAndSet(false, true)) {
                        h81VarB.e(Unit.a);
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(obj);
                    return Unit.a;
                }
            });
        }
    }
}
