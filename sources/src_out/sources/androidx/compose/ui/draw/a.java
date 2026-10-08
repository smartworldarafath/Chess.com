package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.r;
import com.google.inputmethod.xkb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/draw/a;", "", "Lcom/google/android/xkb;", "shape", "c", "(Lcom/google/android/xkb;)Lcom/google/android/xkb;", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final xkb b = c(r.a());
    private static final xkb c = c(null);

    /* JADX INFO: renamed from: androidx.compose.ui.draw.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/draw/a$a;", "", "<init>", "()V", "Landroidx/compose/ui/draw/a;", "Rectangle", "Lcom/google/android/xkb;", "a", "()Lcom/google/android/xkb;", "Unbounded", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final xkb a() {
            return a.b;
        }

        public final xkb b() {
            return a.c;
        }

        private Companion() {
        }
    }

    public static xkb c(xkb xkbVar) {
        return xkbVar;
    }

    public static final boolean d(xkb xkbVar, xkb xkbVar2) {
        return Intrinsics.e(xkbVar, xkbVar2);
    }
}
