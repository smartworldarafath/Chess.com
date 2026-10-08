package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.google.android.g27, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0004\u0017\u001a\u0015\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/google/android/g27;", "", "Lcom/google/android/g27$a;", "alignment", "Lcom/google/android/g27$d;", "trim", "Lcom/google/android/g27$c;", "mode", "<init>", "(FIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "b", "()F", "I", "d", "c", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LineHeightStyle {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final LineHeightStyle e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final float alignment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int trim;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int mode;

    /* JADX INFO: renamed from: com.google.android.g27$a */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lcom/google/android/g27$a;", "", "", "topRatio", "d", "(F)F", "", "h", "(F)Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final float c = d(0.0f);
        private static final float d = d(0.5f);
        private static final float e = d(-1.0f);
        private static final float f = d(1.0f);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float topRatio;

        /* JADX INFO: renamed from: com.google.android.g27$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/google/android/g27$a$a;", "", "<init>", "()V", "Lcom/google/android/g27$a;", "Center", "F", "a", "()F", "Proportional", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final float a() {
                return a.d;
            }

            public final float b() {
                return a.e;
            }

            private Companion() {
            }
        }

        private /* synthetic */ a(float f2) {
            this.topRatio = f2;
        }

        public static final /* synthetic */ a c(float f2) {
            return new a(f2);
        }

        public static float d(float f2) {
            if (!((0.0f <= f2 && f2 <= 1.0f) || f2 == -1.0f)) {
                ax5.c("topRatio should be in [0..1] range or -1");
            }
            return f2;
        }

        public static boolean e(float f2, Object obj) {
            return (obj instanceof a) && Float.compare(f2, ((a) obj).getTopRatio()) == 0;
        }

        public static final boolean f(float f2, float f3) {
            return Float.compare(f2, f3) == 0;
        }

        public static int g(float f2) {
            return Float.hashCode(f2);
        }

        public static String h(float f2) {
            if (f2 == c) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f2 == d) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f2 == e) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f2 == f) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f2 + ')';
        }

        public boolean equals(Object other) {
            return e(this.topRatio, other);
        }

        public int hashCode() {
            return g(this.topRatio);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final /* synthetic */ float getTopRatio() {
            return this.topRatio;
        }

        public String toString() {
            return h(this.topRatio);
        }
    }

    /* JADX INFO: renamed from: com.google.android.g27$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/g27$b;", "", "<init>", "()V", "Lcom/google/android/g27;", "Default", "Lcom/google/android/g27;", "a", "()Lcom/google/android/g27;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LineHeightStyle a() {
            return LineHeightStyle.e;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.g27$c */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Lcom/google/android/g27$c;", "", "", "value", "e", "(I)I", "", "i", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int c = e(0);
        private static final int d = e(1);
        private static final int e = e(2);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: com.google.android.g27$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/google/android/g27$c$a;", "", "<init>", "()V", "Lcom/google/android/g27$c;", "Fixed", "I", "a", "()I", "Minimum", "b", "Tight", "c", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.c;
            }

            public final int b() {
                return c.d;
            }

            public final int c() {
                return c.e;
            }

            private Companion() {
            }
        }

        private /* synthetic */ c(int i) {
            this.value = i;
        }

        public static final /* synthetic */ c d(int i) {
            return new c(i);
        }

        public static int e(int i) {
            return i;
        }

        public static boolean f(int i, Object obj) {
            return (obj instanceof c) && i == ((c) obj).getValue();
        }

        public static final boolean g(int i, int i2) {
            return i == i2;
        }

        public static int h(int i) {
            return Integer.hashCode(i);
        }

        public static String i(int i) {
            if (g(i, c)) {
                return "LineHeightStyle.Mode.Fixed";
            }
            if (g(i, d)) {
                return "LineHeightStyle.Mode.Minimum";
            }
            return g(i, e) ? "LineHeightStyle.Mode.Tight" : "Invalid";
        }

        public boolean equals(Object other) {
            return f(this.value, other);
        }

        public int hashCode() {
            return h(this.value);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public String toString() {
            return i(this.value);
        }
    }

    /* JADX INFO: renamed from: com.google.android.g27$d */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lcom/google/android/g27$d;", "", "", "value", "d", "(I)I", "", "j", "(I)Ljava/lang/String;", "", "h", "(I)Z", "i", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int c = d(1);
        private static final int d = d(16);
        private static final int e = d(17);
        private static final int f = d(0);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: com.google.android.g27$d$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/google/android/g27$d$a;", "", "<init>", "()V", "Lcom/google/android/g27$d;", "Both", "I", "a", "()I", "None", "b", "", "FlagTrimTop", "FlagTrimBottom", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return d.e;
            }

            public final int b() {
                return d.f;
            }

            private Companion() {
            }
        }

        private /* synthetic */ d(int i) {
            this.value = i;
        }

        public static final /* synthetic */ d c(int i) {
            return new d(i);
        }

        public static int d(int i) {
            return i;
        }

        public static boolean e(int i, Object obj) {
            return (obj instanceof d) && i == ((d) obj).getValue();
        }

        public static final boolean f(int i, int i2) {
            return i == i2;
        }

        public static int g(int i) {
            return Integer.hashCode(i);
        }

        public static final boolean h(int i) {
            return (i & 1) > 0;
        }

        public static final boolean i(int i) {
            return (i & 16) > 0;
        }

        public static String j(int i) {
            if (i == c) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i == d) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i == e) {
                return "LineHeightStyle.Trim.Both";
            }
            return i == f ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object other) {
            return e(this.value, other);
        }

        public int hashCode() {
            return g(this.value);
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public String toString() {
            return j(this.value);
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        e = new LineHeightStyle(a.INSTANCE.b(), d.INSTANCE.a(), c.INSTANCE.a(), defaultConstructorMarker);
    }

    public /* synthetic */ LineHeightStyle(float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i, i2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTrim() {
        return this.trim;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) other;
        return a.f(this.alignment, lineHeightStyle.alignment) && d.f(this.trim, lineHeightStyle.trim) && c.g(this.mode, lineHeightStyle.mode);
    }

    public int hashCode() {
        return (((a.g(this.alignment) * 31) + d.g(this.trim)) * 31) + c.h(this.mode);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.h(this.alignment)) + ", trim=" + ((Object) d.j(this.trim)) + ",mode=" + ((Object) c.i(this.mode)) + ')';
    }

    public /* synthetic */ LineHeightStyle(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i);
    }

    private LineHeightStyle(float f, int i, int i2) {
        this.alignment = f;
        this.trim = i;
        this.mode = i2;
    }

    private LineHeightStyle(float f, int i) {
        this(f, i, c.INSTANCE.a(), null);
    }
}
