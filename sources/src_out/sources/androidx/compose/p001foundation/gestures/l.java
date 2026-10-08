package androidx.compose.p001foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/gestures/l;", "", "<init>", "()V", "c", "d", "a", "b", "Landroidx/compose/foundation/gestures/l$a;", "Landroidx/compose/foundation/gestures/l$b;", "Landroidx/compose/foundation/gestures/l$c;", "Landroidx/compose/foundation/gestures/l$d;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/l$a;", "Landroidx/compose/foundation/gestures/l;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends l {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/gestures/l$b;", "Landroidx/compose/foundation/gestures/l;", "Lcom/google/android/rn8;", "delta", "", "isIndirectPointerEvent", "<init>", "(JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "()J", "b", "Z", "()Z", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long delta;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isIndirectPointerEvent;

        public /* synthetic */ b(long j, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, z);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getDelta() {
            return this.delta;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsIndirectPointerEvent() {
            return this.isIndirectPointerEvent;
        }

        private b(long j, boolean z) {
            super(null);
            this.delta = j;
            this.isIndirectPointerEvent = z;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/l$c;", "Landroidx/compose/foundation/gestures/l;", "Lcom/google/android/rn8;", "startPoint", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "()J", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long startPoint;

        public /* synthetic */ c(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getStartPoint() {
            return this.startPoint;
        }

        private c(long j) {
            super(null);
            this.startPoint = j;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/gestures/l$d;", "Landroidx/compose/foundation/gestures/l;", "Lcom/google/android/t3e;", "velocity", "", "isIndirectPointerEvent", "<init>", "(JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "()J", "b", "Z", "()Z", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long velocity;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isIndirectPointerEvent;

        public /* synthetic */ d(long j, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, z);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getVelocity() {
            return this.velocity;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsIndirectPointerEvent() {
            return this.isIndirectPointerEvent;
        }

        private d(long j, boolean z) {
            super(null);
            this.velocity = j;
            this.isIndirectPointerEvent = z;
        }
    }

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private l() {
    }
}
