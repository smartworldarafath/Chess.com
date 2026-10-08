package androidx.p008glance;

import com.google.inputmethod.e02;
import com.google.inputmethod.gi1;
import com.google.inputmethod.ko5;
import com.google.inputmethod.ti1;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/glance/b;", "Landroidx/glance/g$b;", "a", "b", "Landroidx/glance/b$a;", "Landroidx/glance/b$b;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface b extends g.b {

    /* JADX INFO: renamed from: androidx.glance.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/glance/b$a;", "Landroidx/glance/b;", "Lcom/google/android/ti1;", "colorProvider", "<init>", "(Lcom/google/android/ti1;)V", "", "toString", "()Ljava/lang/String;", "b", "Lcom/google/android/ti1;", "()Lcom/google/android/ti1;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BackgroundModifier implements b {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final ti1 colorProvider;

        public BackgroundModifier(ti1 ti1Var) {
            this.colorProvider = ti1Var;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ti1 getColorProvider() {
            return this.colorProvider;
        }

        public String toString() {
            return "BackgroundModifier(colorProvider=" + this.colorProvider + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.glance.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0006\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/glance/b$b;", "Landroidx/glance/b;", "", "toString", "()Ljava/lang/String;", "Lcom/google/android/ko5;", "b", "Lcom/google/android/ko5;", "d", "()Lcom/google/android/ko5;", "imageProvider", "Lcom/google/android/e02;", "c", "I", "()I", "contentScale", "Lcom/google/android/gi1;", "Lcom/google/android/gi1;", "()Lcom/google/android/gi1;", "colorFilter", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BackgroundModifier implements b {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final ko5 imageProvider;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final int contentScale;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        private final gi1 colorFilter;

        /* JADX INFO: renamed from: b, reason: from getter */
        public final gi1 getColorFilter() {
            return this.colorFilter;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getContentScale() {
            return this.contentScale;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ko5 getImageProvider() {
            return this.imageProvider;
        }

        public String toString() {
            return "BackgroundModifier(colorFilter=" + this.colorFilter + ", imageProvider=" + this.imageProvider + ", contentScale=" + ((Object) e02.i(this.contentScale)) + ')';
        }
    }
}
