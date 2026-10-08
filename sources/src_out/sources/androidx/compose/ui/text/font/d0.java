package androidx.compose.ui.text.font;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/d0;", "", "Landroidx/compose/ui/text/font/l;", "fontFamily", "a", "(Landroidx/compose/ui/text/font/l;)Landroidx/compose/ui/text/font/l;", "Landroidx/compose/ui/text/font/x;", "fontWeight", "b", "(Landroidx/compose/ui/text/font/x;)Landroidx/compose/ui/text/font/x;", "Landroidx/compose/ui/text/font/t;", "fontStyle", "c", "(I)I", "Landroidx/compose/ui/text/font/u;", "fontSynthesis", "d", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.d0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/font/d0$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/d0;", "b", "Landroidx/compose/ui/text/font/d0;", "a", "()Landroidx/compose/ui/text/font/d0;", "Default", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final d0 Default = new C0064a();

        /* JADX INFO: renamed from: androidx.compose.ui.text.font.d0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/text/font/d0$a$a", "Landroidx/compose/ui/text/font/d0;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0064a implements d0 {
            C0064a() {
            }
        }

        private Companion() {
        }

        public final d0 a() {
            return Default;
        }
    }

    default l a(l fontFamily) {
        return fontFamily;
    }

    default FontWeight b(FontWeight fontWeight) {
        return fontWeight;
    }

    default int c(int fontStyle) {
        return fontStyle;
    }

    default int d(int fontSynthesis) {
        return fontSynthesis;
    }
}
