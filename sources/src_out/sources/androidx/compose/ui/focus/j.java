package androidx.compose.ui.focus;

import androidx.compose.ui.platform.CompositionLocalsKt;
import com.google.inputmethod.bs1;
import com.google.inputmethod.cs1;
import com.google.inputmethod.hy5;
import com.google.inputmethod.jy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\f"}, d2 = {"Landroidx/compose/ui/focus/j;", "", "", "value", "e", "(I)I", "Lcom/google/android/bs1;", "node", "", "d", "(ILcom/google/android/bs1;)Z", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = e(1);
    private static final int c = e(0);
    private static final int d = e(2);

    /* JADX INFO: renamed from: androidx.compose.ui.focus.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/j$a;", "", "<init>", "()V", "Landroidx/compose/ui/focus/j;", "Always", "I", "a", "()I", "SystemDefined", "c", "Never", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return j.b;
        }

        public final int b() {
            return j.d;
        }

        public final int c() {
            return j.c;
        }

        private Companion() {
        }
    }

    public static final boolean d(int i, bs1 bs1Var) {
        if (f(i, b)) {
            return true;
        }
        if (f(i, c)) {
            return !hy5.f(((jy5) cs1.a(bs1Var, CompositionLocalsKt.l())).a(), hy5.INSTANCE.b());
        }
        if (f(i, d)) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    private static int e(int i) {
        return i;
    }

    public static final boolean f(int i, int i2) {
        return i == i2;
    }
}
