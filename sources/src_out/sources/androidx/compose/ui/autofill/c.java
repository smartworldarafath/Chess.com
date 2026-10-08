package androidx.compose.ui.autofill;

import com.google.inputmethod.ez1;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/autofill/c;", "", "a", "Lcom/google/android/ek;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: androidx.compose.ui.autofill.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/autofill/c$a;", "", "<init>", "()V", "Landroidx/compose/ui/autofill/c;", "b", "Landroidx/compose/ui/autofill/c;", "getNone", "()Landroidx/compose/ui/autofill/c;", "None", "c", "a", "Text", "d", "getList", "List", "e", "getDate", "Date", "f", "Toggle", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final c None = ez1.a(0);

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final c Text = ez1.a(1);

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final c List = ez1.a(3);

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private static final c Date = ez1.a(4);

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private static final c Toggle = ez1.a(2);

        private Companion() {
        }

        public final c a() {
            return Text;
        }

        public final c b() {
            return Toggle;
        }
    }
}
