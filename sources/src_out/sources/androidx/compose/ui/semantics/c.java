package androidx.compose.ui.semantics;

import com.google.inputmethod.gba;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u000026\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002`\u0006B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJC\u0010\t\u001a\u00020\u000b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0016¢\u0006\u0004\b\t\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/semantics/c;", "Ljava/util/Comparator;", "Lkotlin/Pair;", "Lcom/google/android/gba;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "<init>", "()V", "a", "b", "", "(Lkotlin/Pair;Lkotlin/Pair;)I", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c implements Comparator<Pair<? extends gba, ? extends List<SemanticsNode>>> {
    public static final c a = new c();

    private c() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Pair<gba, ? extends List<SemanticsNode>> a2, Pair<gba, ? extends List<SemanticsNode>> b) {
        int iCompare = Float.compare(((gba) a2.c()).getTop(), ((gba) b.c()).getTop());
        return iCompare != 0 ? iCompare : Float.compare(((gba) a2.c()).getBottom(), ((gba) b.c()).getBottom());
    }
}
