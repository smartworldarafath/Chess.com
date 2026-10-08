package androidx.compose.ui.text;

import com.google.inputmethod.Placeholder;
import com.google.inputmethod.d19;
import com.google.inputmethod.f43;
import com.google.inputmethod.im;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "text", "Landroidx/compose/ui/text/y;", "style", "", "Landroidx/compose/ui/text/b$d;", "Landroidx/compose/ui/text/b$a;", "annotations", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Lcom/google/android/v99;", "placeholders", "Lcom/google/android/d19;", "a", "(Ljava/lang/String;Landroidx/compose/ui/text/y;Ljava/util/List;Lcom/google/android/f43;Landroidx/compose/ui/text/font/l$b;Ljava/util/List;)Lcom/google/android/d19;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {
    public static final d19 a(String str, TextStyle textStyle, List<? extends b.Range<? extends b.a>> list, f43 f43Var, androidx.compose.ui.text.font.l.b bVar, List<b.Range<Placeholder>> list2) {
        return im.a(str, textStyle, list, list2, f43Var, bVar);
    }

    public static /* synthetic */ d19 b(String str, TextStyle textStyle, List list, f43 f43Var, androidx.compose.ui.text.font.l.b bVar, List list2, int i, Object obj) {
        if ((i & 32) != 0) {
            list2 = kotlin.collections.m.p();
        }
        return a(str, textStyle, list, f43Var, bVar, list2);
    }
}
