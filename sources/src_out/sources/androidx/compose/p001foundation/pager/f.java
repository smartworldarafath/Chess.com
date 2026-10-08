package androidx.compose.p001foundation.pager;

import com.google.inputmethod.f43;
import com.google.inputmethod.ff3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0002\u0006\bJ#\u0010\u0006\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/pager/f;", "", "Lcom/google/android/f43;", "", "availableSpace", "pageSpacing", "a", "(Lcom/google/android/f43;II)I", "b", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface f {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/pager/f$a;", "Landroidx/compose/foundation/pager/f;", "<init>", "()V", "Lcom/google/android/f43;", "", "availableSpace", "pageSpacing", "a", "(Lcom/google/android/f43;II)I", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements f {
        public static final a a = new a();

        private a() {
        }

        @Override // androidx.compose.p001foundation.pager.f
        public int a(f43 f43Var, int i, int i2) {
            return i;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/pager/f$b;", "Landroidx/compose/foundation/pager/f;", "Lcom/google/android/ff3;", "pageSize", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/f43;", "", "availableSpace", "pageSpacing", "a", "(Lcom/google/android/f43;II)I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "getPageSize-D9Ej5fM", "()F", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float pageSize;

        public /* synthetic */ b(float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }

        @Override // androidx.compose.p001foundation.pager.f
        public int a(f43 f43Var, int i, int i2) {
            return f43Var.O1(this.pageSize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof b) {
                return ff3.k(this.pageSize, ((b) other).pageSize);
            }
            return false;
        }

        public int hashCode() {
            return ff3.l(this.pageSize);
        }

        private b(float f) {
            this.pageSize = f;
        }
    }

    int a(f43 f43Var, int i, int i2);
}
