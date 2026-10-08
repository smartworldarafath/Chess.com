package androidx.compose.ui.graphics;

import com.google.inputmethod.dqa;
import com.google.inputmethod.eqa;
import com.google.inputmethod.gba;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/n;", "", "<init>", "()V", "Lcom/google/android/gba;", "a", "()Lcom/google/android/gba;", "bounds", "b", "c", "Landroidx/compose/ui/graphics/n$a;", "Landroidx/compose/ui/graphics/n$b;", "Landroidx/compose/ui/graphics/n$c;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class n {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/n$a;", "Landroidx/compose/ui/graphics/n;", "Landroidx/compose/ui/graphics/Path;", "path", "<init>", "(Landroidx/compose/ui/graphics/Path;)V", "a", "Landroidx/compose/ui/graphics/Path;", "b", "()Landroidx/compose/ui/graphics/Path;", "Lcom/google/android/gba;", "()Lcom/google/android/gba;", "bounds", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Path path;

        public a(Path path) {
            super(null);
            this.path = path;
        }

        @Override // androidx.compose.ui.graphics.n
        /* JADX INFO: renamed from: a */
        public gba getRect() {
            return this.path.getBounds();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Path getPath() {
            return this.path;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/n$b;", "Landroidx/compose/ui/graphics/n;", "Lcom/google/android/gba;", "rect", "<init>", "(Lcom/google/android/gba;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lcom/google/android/gba;", "b", "()Lcom/google/android/gba;", "bounds", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final gba rect;

        public b(gba gbaVar) {
            super(null);
            this.rect = gbaVar;
        }

        @Override // androidx.compose.ui.graphics.n
        /* JADX INFO: renamed from: a, reason: from getter */
        public gba getRect() {
            return this.rect;
        }

        public final gba b() {
            return this.rect;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && Intrinsics.e(this.rect, ((b) other).rect);
        }

        public int hashCode() {
            return this.rect.hashCode();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/n$c;", "Landroidx/compose/ui/graphics/n;", "Lcom/google/android/dqa;", "roundRect", "<init>", "(Lcom/google/android/dqa;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lcom/google/android/dqa;", "b", "()Lcom/google/android/dqa;", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/Path;", "c", "()Landroidx/compose/ui/graphics/Path;", "roundRectPath", "Lcom/google/android/gba;", "()Lcom/google/android/gba;", "bounds", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final dqa roundRect;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Path roundRectPath;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(dqa dqaVar) {
            Path path = null;
            super(path);
            this.roundRect = dqaVar;
            if (!eqa.g(dqaVar)) {
                Path pathA = d.a();
                Path.p(pathA, dqaVar, null, 2, null);
                path = pathA;
            }
            this.roundRectPath = path;
        }

        @Override // androidx.compose.ui.graphics.n
        /* JADX INFO: renamed from: a */
        public gba getRect() {
            return eqa.f(this.roundRect);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final dqa getRoundRect() {
            return this.roundRect;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Path getRoundRectPath() {
            return this.roundRectPath;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && Intrinsics.e(this.roundRect, ((c) other).roundRect);
        }

        public int hashCode() {
            return this.roundRect.hashCode();
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract gba getRect();

    private n() {
    }
}
