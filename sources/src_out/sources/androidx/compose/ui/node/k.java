package androidx.compose.ui.node;

import com.google.inputmethod.dj7;
import com.google.inputmethod.gj7;
import com.google.inputmethod.h66;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/h66;", "scope", "", "Lcom/google/android/dj7;", "a", "(Lcom/google/android/h66;)Ljava/util/List;", "Landroidx/compose/ui/node/LayoutNode;", "", "b", "(Landroidx/compose/ui/node/LayoutNode;)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final List<List<dj7>> a(h66 h66Var) throws NoWhenBranchMatchedException {
        Intrinsics.h(h66Var, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        LayoutNode layoutNode = ((gj7) h66Var).getLayoutNode();
        boolean zB = b(layoutNode);
        List<LayoutNode> listW = layoutNode.W();
        ArrayList arrayList = new ArrayList(listW.size());
        int size = listW.size();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = listW.get(i);
            arrayList.add(zB ? layoutNode2.P() : layoutNode2.Q());
        }
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final boolean b(LayoutNode layoutNode) throws NoWhenBranchMatchedException {
        int i = a.$EnumSwitchMapping$0[layoutNode.i0().ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        LayoutNode layoutNodeC0 = layoutNode.C0();
        if (layoutNodeC0 != null) {
            return b(layoutNodeC0);
        }
        throw new IllegalArgumentException("no parent for idle node");
    }
}
