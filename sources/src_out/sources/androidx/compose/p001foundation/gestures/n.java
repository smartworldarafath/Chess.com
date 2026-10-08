package androidx.compose.p001foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/n;", "", "<init>", "()V", "c", "b", "a", "Landroidx/compose/foundation/gestures/n$a;", "Landroidx/compose/foundation/gestures/n$b;", "Landroidx/compose/foundation/gestures/n$c;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/n$a;", "Landroidx/compose/foundation/gestures/n;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends n {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/n$b;", "Landroidx/compose/foundation/gestures/n;", "Landroidx/compose/ui/input/pointer/i;", "finalUpChange", "<init>", "(Landroidx/compose/ui/input/pointer/i;)V", "a", "Landroidx/compose/ui/input/pointer/i;", "()Landroidx/compose/ui/input/pointer/i;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PointerInputChange finalUpChange;

        public b(PointerInputChange pointerInputChange) {
            super(null);
            this.finalUpChange = pointerInputChange;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PointerInputChange getFinalUpChange() {
            return this.finalUpChange;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/n$c;", "Landroidx/compose/foundation/gestures/n;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends n {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private n() {
    }
}
