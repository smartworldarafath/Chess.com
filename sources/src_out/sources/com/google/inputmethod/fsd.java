package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/google/android/fsd;", "", "b", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface fsd {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Lcom/google/android/fsd$a;", "", "", "description", "f", "(Ljava/lang/String;)Ljava/lang/String;", "j", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String c = f("Fine");
        private static final String d = f("Coarse");
        private static final String e = f("Blunt");
        private static final String f = f("None");

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String description;

        /* JADX INFO: renamed from: com.google.android.fsd$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/google/android/fsd$a$a;", "", "<init>", "()V", "Lcom/google/android/fsd$a;", "Fine", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Coarse", "b", "Blunt", "a", "None", "d", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String a() {
                return a.e;
            }

            public final String b() {
                return a.d;
            }

            public final String c() {
                return a.c;
            }

            public final String d() {
                return a.f;
            }

            private Companion() {
            }
        }

        private /* synthetic */ a(String str) {
            this.description = str;
        }

        public static final /* synthetic */ a e(String str) {
            return new a(str);
        }

        private static String f(String str) {
            return str;
        }

        public static boolean g(String str, Object obj) {
            return (obj instanceof a) && Intrinsics.e(str, ((a) obj).getDescription());
        }

        public static final boolean h(String str, String str2) {
            return Intrinsics.e(str, str2);
        }

        public static int i(String str) {
            return str.hashCode();
        }

        public static String j(String str) {
            return str;
        }

        public boolean equals(Object other) {
            return g(this.description, other);
        }

        public int hashCode() {
            return i(this.description);
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final /* synthetic */ String getDescription() {
            return this.description;
        }

        public String toString() {
            return j(this.description);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Lcom/google/android/fsd$b;", "", "", "description", "e", "(Ljava/lang/String;)Ljava/lang/String;", "h", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String c = e("Flat");
        private static final String d = e("Tabletop");
        private static final String e = e("Book");

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String description;

        /* JADX INFO: renamed from: com.google.android.fsd$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/google/android/fsd$b$a;", "", "<init>", "()V", "Lcom/google/android/fsd$b;", "Flat", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Tabletop", "c", "Book", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String a() {
                return b.e;
            }

            public final String b() {
                return b.c;
            }

            public final String c() {
                return b.d;
            }

            private Companion() {
            }
        }

        private /* synthetic */ b(String str) {
            this.description = str;
        }

        public static final /* synthetic */ b d(String str) {
            return new b(str);
        }

        private static String e(String str) {
            return str;
        }

        public static boolean f(String str, Object obj) {
            return (obj instanceof b) && Intrinsics.e(str, ((b) obj).getDescription());
        }

        public static int g(String str) {
            return str.hashCode();
        }

        public static String h(String str) {
            return str;
        }

        public boolean equals(Object other) {
            return f(this.description, other);
        }

        public int hashCode() {
            return g(this.description);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final /* synthetic */ String getDescription() {
            return this.description;
        }

        public String toString() {
            return h(this.description);
        }
    }
}
