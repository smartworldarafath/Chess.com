package androidx.compose.ui.text;

import com.google.inputmethod.e37;
import com.google.inputmethod.myc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0002\t\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/f;", "Landroidx/compose/ui/text/b$a;", "<init>", "()V", "Lcom/google/android/e37;", "a", "()Lcom/google/android/e37;", "linkInteractionListener", "Lcom/google/android/myc;", "b", "()Lcom/google/android/myc;", "styles", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class f implements androidx.compose.ui.text.b.a {
    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract e37 getLinkInteractionListener();

    /* JADX INFO: renamed from: b */
    public abstract myc getStyles();

    private f() {
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/f$a;", "Landroidx/compose/ui/text/f;", "", "tag", "Lcom/google/android/myc;", "styles", "Lcom/google/android/e37;", "linkInteractionListener", "<init>", "(Ljava/lang/String;Lcom/google/android/myc;Lcom/google/android/e37;)V", "c", "(Ljava/lang/String;Lcom/google/android/myc;Lcom/google/android/e37;)Landroidx/compose/ui/text/f$a;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "b", "Lcom/google/android/myc;", "()Lcom/google/android/myc;", "Lcom/google/android/e37;", "()Lcom/google/android/e37;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final String tag;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final myc styles;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final e37 linkInteractionListener;

        public a(String str, myc mycVar, e37 e37Var) {
            super(null);
            this.tag = str;
            this.styles = mycVar;
            this.linkInteractionListener = e37Var;
        }

        public static /* synthetic */ a d(a aVar, String str, myc mycVar, e37 e37Var, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.tag;
            }
            if ((i & 2) != 0) {
                mycVar = aVar.getStyles();
            }
            if ((i & 4) != 0) {
                e37Var = aVar.getLinkInteractionListener();
            }
            return aVar.c(str, mycVar, e37Var);
        }

        @Override // androidx.compose.ui.text.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public e37 getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        @Override // androidx.compose.ui.text.f
        /* JADX INFO: renamed from: b, reason: from getter */
        public myc getStyles() {
            return this.styles;
        }

        public final a c(String tag, myc styles, e37 linkInteractionListener) {
            return new a(tag, styles, linkInteractionListener);
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return Intrinsics.e(this.tag, aVar.tag) && Intrinsics.e(getStyles(), aVar.getStyles()) && Intrinsics.e(getLinkInteractionListener(), aVar.getLinkInteractionListener());
        }

        public int hashCode() {
            int iHashCode = this.tag.hashCode() * 31;
            myc styles = getStyles();
            int iHashCode2 = (iHashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            e37 linkInteractionListener = getLinkInteractionListener();
            return iHashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.tag + ')';
        }

        public /* synthetic */ a(String str, myc mycVar, e37 e37Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : mycVar, e37Var);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/f$b;", "Landroidx/compose/ui/text/f;", "", "url", "Lcom/google/android/myc;", "styles", "Lcom/google/android/e37;", "linkInteractionListener", "<init>", "(Ljava/lang/String;Lcom/google/android/myc;Lcom/google/android/e37;)V", "c", "(Ljava/lang/String;Lcom/google/android/myc;Lcom/google/android/e37;)Landroidx/compose/ui/text/f$b;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "b", "Lcom/google/android/myc;", "()Lcom/google/android/myc;", "Lcom/google/android/e37;", "()Lcom/google/android/e37;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final String url;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final myc styles;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final e37 linkInteractionListener;

        public b(String str, myc mycVar, e37 e37Var) {
            super(null);
            this.url = str;
            this.styles = mycVar;
            this.linkInteractionListener = e37Var;
        }

        public static /* synthetic */ b d(b bVar, String str, myc mycVar, e37 e37Var, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.url;
            }
            if ((i & 2) != 0) {
                mycVar = bVar.getStyles();
            }
            if ((i & 4) != 0) {
                e37Var = bVar.getLinkInteractionListener();
            }
            return bVar.c(str, mycVar, e37Var);
        }

        @Override // androidx.compose.ui.text.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public e37 getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        @Override // androidx.compose.ui.text.f
        /* JADX INFO: renamed from: b, reason: from getter */
        public myc getStyles() {
            return this.styles;
        }

        public final b c(String url, myc styles, e37 linkInteractionListener) {
            return new b(url, styles, linkInteractionListener);
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Intrinsics.e(this.url, bVar.url) && Intrinsics.e(getStyles(), bVar.getStyles()) && Intrinsics.e(getLinkInteractionListener(), bVar.getLinkInteractionListener());
        }

        public int hashCode() {
            int iHashCode = this.url.hashCode() * 31;
            myc styles = getStyles();
            int iHashCode2 = (iHashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            e37 linkInteractionListener = getLinkInteractionListener();
            return iHashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.url + ')';
        }

        public /* synthetic */ b(String str, myc mycVar, e37 e37Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : mycVar, (i & 4) != 0 ? null : e37Var);
        }
    }
}
