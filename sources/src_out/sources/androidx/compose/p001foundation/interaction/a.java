package androidx.compose.p001foundation.interaction;

import com.google.inputmethod.i26;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/a;", "Lcom/google/android/i26;", "b", "c", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a extends i26 {

    /* JADX INFO: renamed from: androidx.compose.foundation.interaction.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/interaction/a$a;", "Landroidx/compose/foundation/interaction/a;", "Landroidx/compose/foundation/interaction/a$b;", "press", "<init>", "(Landroidx/compose/foundation/interaction/a$b;)V", "a", "Landroidx/compose/foundation/interaction/a$b;", "()Landroidx/compose/foundation/interaction/a$b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C0016a implements a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final b press;

        public C0016a(b bVar) {
            this.press = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getPress() {
            return this.press;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/interaction/a$b;", "Landroidx/compose/foundation/interaction/a;", "Lcom/google/android/rn8;", "pressPosition", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "()J", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long pressPosition;

        public /* synthetic */ b(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getPressPosition() {
            return this.pressPosition;
        }

        private b(long j) {
            this.pressPosition = j;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/interaction/a$c;", "Landroidx/compose/foundation/interaction/a;", "Landroidx/compose/foundation/interaction/a$b;", "press", "<init>", "(Landroidx/compose/foundation/interaction/a$b;)V", "a", "Landroidx/compose/foundation/interaction/a$b;", "()Landroidx/compose/foundation/interaction/a$b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final b press;

        public c(b bVar) {
            this.press = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getPress() {
            return this.press;
        }
    }
}
