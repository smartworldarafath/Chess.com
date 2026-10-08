package androidx.compose.p002material3;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/material3/f0;", "", "", "name", "e", "(Ljava/lang/String;)Ljava/lang/String;", "i", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String c = e("PrimaryNotEditable");
    private static final String d = e("PrimaryEditable");
    private static final String e = e("SecondaryEditable");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: androidx.compose.material3.f0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/material3/f0$a;", "", "<init>", "()V", "Landroidx/compose/material3/f0;", "PrimaryNotEditable", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "PrimaryEditable", "a", "SecondaryEditable", "c", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return f0.d;
        }

        public final String b() {
            return f0.c;
        }

        public final String c() {
            return f0.e;
        }

        private Companion() {
        }
    }

    private /* synthetic */ f0(String str) {
        this.name = str;
    }

    public static final /* synthetic */ f0 d(String str) {
        return new f0(str);
    }

    private static String e(String str) {
        return str;
    }

    public static boolean f(String str, Object obj) {
        return (obj instanceof f0) && Intrinsics.e(str, ((f0) obj).getName());
    }

    public static final boolean g(String str, String str2) {
        return Intrinsics.e(str, str2);
    }

    public static int h(String str) {
        return str.hashCode();
    }

    public static String i(String str) {
        return str;
    }

    public boolean equals(Object other) {
        return f(this.name, other);
    }

    public int hashCode() {
        return h(this.name);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final /* synthetic */ String getName() {
        return this.name;
    }

    public String toString() {
        return i(this.name);
    }
}
