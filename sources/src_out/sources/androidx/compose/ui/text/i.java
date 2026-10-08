package androidx.compose.ui.text;

import com.google.inputmethod.Placeholder;
import com.google.inputmethod.ax5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Landroidx/compose/ui/text/b$d;", "Lcom/google/android/v99;", "", "start", "end", "b", "(Ljava/util/List;II)Ljava/util/List;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<b.Range<Placeholder>> b(List<b.Range<Placeholder>> list, int i, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            b.Range<Placeholder> range = list.get(i3);
            if (c.j(i, i2, range.h(), range.f())) {
                if (!(i <= range.h() && range.f() <= i2)) {
                    ax5.a("placeholder can not overlap with paragraph.");
                }
                arrayList.add(new b.Range(range.g(), range.h() - i, range.f() - i));
            }
        }
        return arrayList;
    }
}
