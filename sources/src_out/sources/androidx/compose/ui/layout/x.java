package androidx.compose.ui.layout;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\u0002\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/x;", "", "Landroidx/compose/ui/layout/p;", "a", "()Landroidx/compose/ui/layout/p;", "current", "b", "maximum", "Landroidx/compose/ui/layout/d;", "Landroidx/compose/ui/layout/y;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface x {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: androidx.compose.ui.layout.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\b¨\u0006&"}, d2 = {"Landroidx/compose/ui/layout/x$a;", "", "<init>", "()V", "Landroidx/compose/ui/layout/x;", "b", "Landroidx/compose/ui/layout/x;", "a", "()Landroidx/compose/ui/layout/x;", "CaptionBar", "c", "DisplayCutout", "d", "Ime", "e", "MandatorySystemGestures", "f", "NavigationBars", "g", "StatusBars", "h", "getSystemBars", "SystemBars", "i", "SystemGestures", "j", "TappableElement", "k", "Waterfall", "l", "getSafeDrawing", "SafeDrawing", "m", "getSafeGestures", "SafeGestures", "n", "getSafeContent", "SafeContent", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final x CaptionBar;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final x DisplayCutout;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final x Ime;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private static final x MandatorySystemGestures;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private static final x NavigationBars;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private static final x StatusBars;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private static final x SystemBars;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private static final x SystemGestures;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private static final x TappableElement;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private static final x Waterfall;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private static final x SafeDrawing;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private static final x SafeGestures;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private static final x SafeContent;

        static {
            y yVar = new y("caption bar");
            CaptionBar = yVar;
            y yVar2 = new y("display cutout");
            DisplayCutout = yVar2;
            y yVar3 = new y("ime");
            Ime = yVar3;
            y yVar4 = new y("mandatory system gestures");
            MandatorySystemGestures = yVar4;
            y yVar5 = new y("navigation bars");
            NavigationBars = yVar5;
            y yVar6 = new y("status bars");
            StatusBars = yVar6;
            SystemBars = new d("system bars", new x[]{yVar6, yVar5, yVar});
            y yVar7 = new y("system gestures");
            SystemGestures = yVar7;
            y yVar8 = new y("tappable element");
            TappableElement = yVar8;
            y yVar9 = new y("waterfall");
            Waterfall = yVar9;
            SafeDrawing = new d("safe drawing", new x[]{yVar6, yVar5, yVar, yVar2, yVar3, yVar8});
            SafeGestures = new d("safe gestures", new x[]{yVar4, yVar7, yVar8, yVar9});
            SafeContent = new d("safe content", new x[]{yVar6, yVar5, yVar, yVar3, yVar7, yVar4, yVar8, yVar2, yVar9});
        }

        private Companion() {
        }

        public final x a() {
            return CaptionBar;
        }

        public final x b() {
            return DisplayCutout;
        }

        public final x c() {
            return Ime;
        }

        public final x d() {
            return MandatorySystemGestures;
        }

        public final x e() {
            return NavigationBars;
        }

        public final x f() {
            return StatusBars;
        }

        public final x g() {
            return SystemGestures;
        }

        public final x h() {
            return TappableElement;
        }

        public final x i() {
            return Waterfall;
        }
    }

    /* JADX INFO: renamed from: a */
    p getCurrent();

    /* JADX INFO: renamed from: b */
    p getMaximum();
}
