package androidx.p008glance;

import com.google.inputmethod.TextStyle;
import com.google.inputmethod.rp3;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/glance/f;", "Lcom/google/android/rp3;", "<init>", "()V", "", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "h", "(Ljava/lang/String;)V", "text", "Lcom/google/android/uzc;", "b", "Lcom/google/android/uzc;", "d", "()Lcom/google/android/uzc;", "g", "(Lcom/google/android/uzc;)V", "style", "", "c", "I", "()I", "f", "(I)V", "maxLines", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class f implements rp3 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private TextStyle style;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String text = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int maxLines = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final void f(int i) {
        this.maxLines = i;
    }

    public final void g(TextStyle textStyle) {
        this.style = textStyle;
    }

    public final void h(String str) {
        this.text = str;
    }
}
