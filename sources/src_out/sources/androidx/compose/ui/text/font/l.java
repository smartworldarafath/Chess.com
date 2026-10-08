package androidx.compose.ui.text.font;

import com.google.inputmethod.q6c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0002\f\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/l;", "", "", "canLoadSynchronously", "<init>", "(Z)V", "a", "Z", "getCanLoadSynchronously", "()Z", "getCanLoadSynchronously$annotations", "()V", "b", "Landroidx/compose/ui/text/font/j;", "Landroidx/compose/ui/text/font/z;", "Landroidx/compose/ui/text/font/i0;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class l {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final i0 c = new g();
    private static final y d = new y("sans-serif", "FontFamily.SansSerif");
    private static final y e = new y("serif", "FontFamily.Serif");
    private static final y f = new y("monospace", "FontFamily.Monospace");
    private static final y g = new y("cursive", "FontFamily.Cursive");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean canLoadSynchronously;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/font/l$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/i0;", "Default", "Landroidx/compose/ui/text/font/i0;", "b", "()Landroidx/compose/ui/text/font/i0;", "Landroidx/compose/ui/text/font/y;", "SansSerif", "Landroidx/compose/ui/text/font/y;", "d", "()Landroidx/compose/ui/text/font/y;", "Serif", "e", "Monospace", "c", "Cursive", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y a() {
            return l.g;
        }

        public final i0 b() {
            return l.c;
        }

        public final y c() {
            return l.f;
        }

        public final y d() {
            return l.d;
        }

        public final y e() {
            return l.e;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0001\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/l$b;", "", "Landroidx/compose/ui/text/font/l;", "fontFamily", "Landroidx/compose/ui/text/font/x;", "fontWeight", "Landroidx/compose/ui/text/font/t;", "fontStyle", "Landroidx/compose/ui/text/font/u;", "fontSynthesis", "Lcom/google/android/q6c;", "a", "(Landroidx/compose/ui/text/font/l;Landroidx/compose/ui/text/font/x;II)Lcom/google/android/q6c;", "Landroidx/compose/ui/text/font/m;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        static /* synthetic */ q6c b(b bVar, l lVar, FontWeight fontWeight, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i3 & 1) != 0) {
                lVar = null;
            }
            if ((i3 & 2) != 0) {
                fontWeight = FontWeight.INSTANCE.f();
            }
            if ((i3 & 4) != 0) {
                i = t.INSTANCE.b();
            }
            if ((i3 & 8) != 0) {
                i2 = u.INSTANCE.a();
            }
            return bVar.a(lVar, fontWeight, i, i2);
        }

        q6c<Object> a(l fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis);
    }

    public /* synthetic */ l(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    private l(boolean z) {
        this.canLoadSynchronously = z;
    }
}
