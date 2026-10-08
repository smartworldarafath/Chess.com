package com.google.inputmethod;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bç\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0003\n\u000b\bJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/google/android/tc;", "", "Lcom/google/android/q16;", "size", "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/g16;", "a", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "b", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface tc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.google.android.tc$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR \u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0010\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0013\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u000f\u0010\bR \u0010!\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u0005\u0010\bR \u0010$\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b#\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010+\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u0003\u001a\u0004\b(\u0010)R \u0010-\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010'\u0012\u0004\b,\u0010\u0003\u001a\u0004\b\u001f\u0010)R \u00100\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010'\u0012\u0004\b/\u0010\u0003\u001a\u0004\b.\u0010)R \u00105\u001a\u0002018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00102\u0012\u0004\b4\u0010\u0003\u001a\u0004\b&\u00103R \u00107\u001a\u0002018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b6\u0010\u0003\u001a\u0004\b\u001a\u00103R \u0010:\u001a\u0002018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00102\u0012\u0004\b9\u0010\u0003\u001a\u0004\b\"\u00103¨\u0006;"}, d2 = {"Lcom/google/android/tc$a;", "", "<init>", "()V", "Lcom/google/android/tc;", "b", "Lcom/google/android/tc;", "o", "()Lcom/google/android/tc;", "getTopStart$annotations", "TopStart", "c", "m", "getTopCenter$annotations", "TopCenter", "d", "n", "getTopEnd$annotations", "TopEnd", "e", "h", "getCenterStart$annotations", "CenterStart", "f", "getCenter$annotations", "Center", "g", "getCenterEnd$annotations", "CenterEnd", "getBottomStart$annotations", "BottomStart", "i", "getBottomCenter$annotations", "BottomCenter", "j", "getBottomEnd$annotations", "BottomEnd", "Lcom/google/android/tc$c;", "k", "Lcom/google/android/tc$c;", "l", "()Lcom/google/android/tc$c;", "getTop$annotations", "Top", "getCenterVertically$annotations", "CenterVertically", "a", "getBottom$annotations", "Bottom", "Lcom/google/android/tc$b;", "Lcom/google/android/tc$b;", "()Lcom/google/android/tc$b;", "getStart$annotations", "Start", "getCenterHorizontally$annotations", "CenterHorizontally", "p", "getEnd$annotations", "End", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final tc TopStart = new BiasAlignment(-1.0f, -1.0f);

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final tc TopCenter = new BiasAlignment(0.0f, -1.0f);

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final tc TopEnd = new BiasAlignment(1.0f, -1.0f);

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private static final tc CenterStart = new BiasAlignment(-1.0f, 0.0f);

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private static final tc Center = new BiasAlignment(0.0f, 0.0f);

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private static final tc CenterEnd = new BiasAlignment(1.0f, 0.0f);

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private static final tc BottomStart = new BiasAlignment(-1.0f, 1.0f);

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private static final tc BottomCenter = new BiasAlignment(0.0f, 1.0f);

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private static final tc BottomEnd = new BiasAlignment(1.0f, 1.0f);

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private static final c Top = new BiasAlignment.Vertical(-1.0f);

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private static final c CenterVertically = new BiasAlignment.Vertical(0.0f);

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private static final c Bottom = new BiasAlignment.Vertical(1.0f);

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private static final b Start = new BiasAlignment.Horizontal(-1.0f);

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private static final b CenterHorizontally = new BiasAlignment.Horizontal(0.0f);

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private static final b End = new BiasAlignment.Horizontal(1.0f);

        private Companion() {
        }

        public final c a() {
            return Bottom;
        }

        public final tc b() {
            return BottomCenter;
        }

        public final tc c() {
            return BottomEnd;
        }

        public final tc d() {
            return BottomStart;
        }

        public final tc e() {
            return Center;
        }

        public final tc f() {
            return CenterEnd;
        }

        public final b g() {
            return CenterHorizontally;
        }

        public final tc h() {
            return CenterStart;
        }

        public final c i() {
            return CenterVertically;
        }

        public final b j() {
            return End;
        }

        public final b k() {
            return Start;
        }

        public final c l() {
            return Top;
        }

        public final tc m() {
            return TopCenter;
        }

        public final tc n() {
            return TopEnd;
        }

        public final tc o() {
            return TopStart;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/google/android/tc$b;", "", "", "size", "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "a", "(IILandroidx/compose/ui/unit/LayoutDirection;)I", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        int a(int size, int space, LayoutDirection layoutDirection);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/google/android/tc$c;", "", "", "size", "space", "a", "(II)I", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {
        int a(int size, int space);
    }

    long a(long size, long space, LayoutDirection layoutDirection);
}
