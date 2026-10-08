package androidx.p008glance.p009appwidget;

import com.google.inputmethod.jf3;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/glance/appwidget/m;", "", "a", "b", "c", "Landroidx/glance/appwidget/m$a;", "Landroidx/glance/appwidget/m$b;", "Landroidx/glance/appwidget/m$c;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface m {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/m$a;", "Landroidx/glance/appwidget/m;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements m {
        public static final a a = new a();

        private a() {
        }

        public String toString() {
            return "SizeMode.Exact";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/glance/appwidget/m$b;", "Landroidx/glance/appwidget/m;", "", "Lcom/google/android/jf3;", "sizes", "<init>", "(Ljava/util/Set;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final Set<jf3> sizes;

        public b(Set<jf3> set) {
            this.sizes = set;
            if (set.isEmpty()) {
                throw new IllegalArgumentException("The set of sizes cannot be empty");
            }
        }

        public final Set<jf3> a() {
            return this.sizes;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.e(b.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.h(other, "null cannot be cast to non-null type androidx.glance.appwidget.SizeMode.Responsive");
            return Intrinsics.e(this.sizes, ((b) other).sizes);
        }

        public int hashCode() {
            return this.sizes.hashCode();
        }

        public String toString() {
            return "SizeMode.Responsive(sizes=" + this.sizes + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/m$c;", "Landroidx/glance/appwidget/m;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements m {
        public static final c a = new c();

        private c() {
        }

        public String toString() {
            return "SizeMode.Single";
        }
    }
}
