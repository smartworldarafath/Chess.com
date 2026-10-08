package androidx.compose.ui.text;

import com.google.inputmethod.Placeholder;
import com.google.inputmethod.b19;
import com.google.inputmethod.d19;
import com.google.inputmethod.f43;
import com.google.inputmethod.jm;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001au\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u0010*\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"", "text", "Landroidx/compose/ui/text/y;", "style", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "", "Landroidx/compose/ui/text/b$d;", "Landroidx/compose/ui/text/r;", "spanStyles", "Lcom/google/android/v99;", "placeholders", "", "maxLines", "Lcom/google/android/uyc;", "overflow", "Lcom/google/android/b19;", "a", "(Ljava/lang/String;Landroidx/compose/ui/text/y;JLcom/google/android/f43;Landroidx/compose/ui/text/font/l$b;Ljava/util/List;Ljava/util/List;II)Lcom/google/android/b19;", "Lcom/google/android/d19;", "paragraphIntrinsics", "c", "(Lcom/google/android/d19;JII)Lcom/google/android/b19;", "", "d", "(F)I", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    public static final b19 a(String str, TextStyle textStyle, long j, f43 f43Var, androidx.compose.ui.text.font.l.b bVar, List<b.Range<SpanStyle>> list, List<b.Range<Placeholder>> list2, int i, int i2) {
        return jm.b(str, textStyle, list, list2, i, i2, j, f43Var, bVar);
    }

    public static final b19 c(d19 d19Var, long j, int i, int i2) {
        return jm.a(d19Var, i, i2, j);
    }

    public static final int d(float f) {
        return (int) Math.ceil(f);
    }
}
