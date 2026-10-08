package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import com.google.inputmethod.r58;
import com.google.inputmethod.y23;
import java.util.Comparator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/k;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/Comparator;", "<init>", "()V", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lcom/google/android/r58;", "b", "(Landroidx/compose/ui/node/LayoutNode;)Lcom/google/android/r58;", "a", "", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)I", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class k implements Comparator<FocusTargetNode> {
    public static final k a = new k();

    private k() {
    }

    private final r58<LayoutNode> b(LayoutNode layoutNode) {
        r58<LayoutNode> r58Var = new r58<>(new LayoutNode[16], 0);
        while (layoutNode != null) {
            r58Var.b(0, layoutNode);
            layoutNode = layoutNode.C0();
        }
        return r58Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(FocusTargetNode a2, FocusTargetNode b) throws KotlinNothingValueException {
        int i = 0;
        if (!i.g(a2) || !i.g(b)) {
            if (i.g(a2)) {
                return -1;
            }
            return i.g(b) ? 1 : 0;
        }
        LayoutNode layoutNodeQ = y23.q(a2);
        LayoutNode layoutNodeQ2 = y23.q(b);
        if (Intrinsics.e(layoutNodeQ, layoutNodeQ2)) {
            return 0;
        }
        r58<LayoutNode> r58VarB = b(layoutNodeQ);
        r58<LayoutNode> r58VarB2 = b(layoutNodeQ2);
        int iMin = Math.min(r58VarB.getSize() - 1, r58VarB2.getSize() - 1);
        if (iMin >= 0) {
            while (Intrinsics.e(r58VarB.content[i], r58VarB2.content[i])) {
                if (i != iMin) {
                    i++;
                }
            }
            return Intrinsics.i(r58VarB.content[i].D0(), r58VarB2.content[i].D0());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
