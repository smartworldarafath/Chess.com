package androidx.compose.p004runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/snapshots/h;", "", "<init>", "()V", "", "a", "b", "Landroidx/compose/runtime/snapshots/h$a;", "Landroidx/compose/runtime/snapshots/h$b;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class h {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/snapshots/h$a;", "Landroidx/compose/runtime/snapshots/h;", "Landroidx/compose/runtime/snapshots/g;", "snapshot", "<init>", "(Landroidx/compose/runtime/snapshots/g;)V", "", "a", "()V", "Landroidx/compose/runtime/snapshots/g;", "getSnapshot", "()Landroidx/compose/runtime/snapshots/g;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final g snapshot;

        public a(g gVar) {
            super(null);
            this.snapshot = gVar;
        }

        @Override // androidx.compose.p004runtime.snapshots.h
        public void a() throws SnapshotApplyConflictException {
            this.snapshot.d();
            throw new SnapshotApplyConflictException(this.snapshot);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/snapshots/h$b;", "Landroidx/compose/runtime/snapshots/h;", "<init>", "()V", "", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends h {
        public static final b a = new b();

        private b() {
            super(null);
        }

        @Override // androidx.compose.p004runtime.snapshots.h
        public void a() {
        }
    }

    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a();

    private h() {
    }
}
