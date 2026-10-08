package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsSortKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.zk1;
import com.google.inputmethod.e16;
import com.google.inputmethod.f16;
import com.google.inputmethod.gba;
import com.google.inputmethod.o48;
import com.google.inputmethod.seb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001aO\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001ag\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00000\tj\b\u0012\u0004\u0012\u00020\u0000`\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00050\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001aS\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00052\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00050\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aS\u0010\u001b\u001a\u00020\u00022:\u0010\u0019\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00180\u00160\tj\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00180\u0016`\n2\u0006\u0010\u001a\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\"*\u0010\"\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00000\u001ej\b\u0012\u0004\u0012\u00020\u0000`\u001f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"&\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Function1;", "", "isVisible", "isFocusableContainer", "", "listToSort", "f", "(Landroidx/compose/ui/semantics/SemanticsNode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ljava/util/List;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "geometryList", "Lcom/google/android/o48;", "containerMapToChildren", "", "b", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/google/android/o48;)V", "parentListToSort", "Lcom/google/android/e16;", "containerChildrenMapping", "d", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/google/android/e16;)Ljava/util/List;", "Lkotlin/Pair;", "Lcom/google/android/gba;", "", "rowGroupings", "node", "c", "(Ljava/util/ArrayList;Landroidx/compose/ui/semantics/SemanticsNode;)Z", "", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "a", "[Ljava/util/Comparator;", "semanticComparators", "Lkotlin/Function2;", "", "Lkotlin/jvm/functions/Function2;", "UnmergedConfigComparator", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SemanticsSortKt {
    private static final Comparator<SemanticsNode>[] a;
    private static final Function2<SemanticsNode, SemanticsNode, Integer> b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        final /* synthetic */ Comparator a;
        final /* synthetic */ Comparator b;

        public a(Comparator comparator, Comparator comparator2) {
            this.a = comparator;
            this.b = comparator2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.a.compare(t, t2);
            return iCompare != 0 ? iCompare : this.b.compare(((SemanticsNode) t).getLayoutNode(), ((SemanticsNode) t2).getLayoutNode());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        final /* synthetic */ Comparator a;

        public b(Comparator comparator) {
            this.a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.a.compare(t, t2);
            return iCompare != 0 ? iCompare : zk1.e(Integer.valueOf(((SemanticsNode) t).getId()), Integer.valueOf(((SemanticsNode) t2).getId()));
        }
    }

    static {
        Comparator<SemanticsNode>[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new b(new a(i == 0 ? androidx.compose.ui.semantics.b.a : androidx.compose.ui.semantics.a.a, LayoutNode.INSTANCE.b()));
            i++;
        }
        a = comparatorArr;
        b = new Function2<SemanticsNode, SemanticsNode, Integer>() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
                seb unmergedConfig = semanticsNode.getUnmergedConfig();
                SemanticsProperties semanticsProperties = SemanticsProperties.a;
                return Integer.valueOf(Float.compare(((Number) unmergedConfig.n(semanticsProperties.R(), new Function0<Float>() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1.1
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue(), ((Number) semanticsNode2.getUnmergedConfig().n(semanticsProperties.R(), new Function0<Float>() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1.2
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue()));
            }
        };
    }

    private static final void b(SemanticsNode semanticsNode, ArrayList<SemanticsNode> arrayList, Function1<? super SemanticsNode, Boolean> function1, Function1<? super SemanticsNode, Boolean> function2, o48<List<SemanticsNode>> o48Var) {
        boolean zBooleanValue = ((Boolean) semanticsNode.getUnmergedConfig().n(SemanticsProperties.a.y(), new Function0<Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Boolean m62invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue();
        if ((zBooleanValue || ((Boolean) function2.invoke(semanticsNode)).booleanValue()) && ((Boolean) function1.invoke(semanticsNode)).booleanValue()) {
            arrayList.add(semanticsNode);
        }
        if (zBooleanValue) {
            o48Var.r(semanticsNode.getId(), f(semanticsNode, function1, function2, semanticsNode.m()));
            return;
        }
        List<SemanticsNode> listM = semanticsNode.m();
        int size = listM.size();
        for (int i = 0; i < size; i++) {
            b(listM.get(i), arrayList, function1, function2, o48Var);
        }
    }

    private static final boolean c(ArrayList<Pair<gba, List<SemanticsNode>>> arrayList, SemanticsNode semanticsNode) {
        float top = semanticsNode.l().getTop();
        float bottom = semanticsNode.l().getBottom();
        boolean z = top >= bottom;
        int iR = m.r(arrayList);
        if (iR >= 0) {
            int i = 0;
            while (true) {
                gba gbaVar = (gba) arrayList.get(i).c();
                boolean z2 = gbaVar.getTop() >= gbaVar.getBottom();
                if (!z && !z2 && Math.max(top, gbaVar.getTop()) < Math.min(bottom, gbaVar.getBottom())) {
                    arrayList.set(i, new Pair<>(gbaVar.p(0.0f, top, Float.POSITIVE_INFINITY, bottom), arrayList.get(i).d()));
                    ((List) arrayList.get(i).d()).add(semanticsNode);
                    return true;
                }
                if (i != iR) {
                    i++;
                }
            }
        }
        return false;
    }

    public static final List<SemanticsNode> d(SemanticsNode semanticsNode, List<SemanticsNode> list, Function1<? super SemanticsNode, Boolean> function1, e16<List<SemanticsNode>> e16Var) {
        int size = 0;
        char c = semanticsNode.r().getLayoutDirection() == LayoutDirection.Rtl ? (char) 1 : (char) 0;
        ArrayList arrayList = new ArrayList(list.size() / 2);
        int iR = m.r(list);
        if (iR >= 0) {
            int i = 0;
            while (true) {
                SemanticsNode semanticsNode2 = list.get(i);
                if (i == 0 || !c(arrayList, semanticsNode2)) {
                    arrayList.add(new Pair(semanticsNode2.l(), m.v(new SemanticsNode[]{semanticsNode2})));
                }
                if (i == iR) {
                    break;
                }
                i++;
            }
        }
        m.F(arrayList, c.a);
        ArrayList arrayList2 = new ArrayList();
        Comparator<SemanticsNode> comparator = a[c ^ 1];
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Pair pair = (Pair) arrayList.get(i2);
            m.F((List) pair.d(), comparator);
            arrayList2.addAll((Collection) pair.d());
        }
        final Function2<SemanticsNode, SemanticsNode, Integer> function2 = b;
        m.F(arrayList2, new Comparator() { // from class: com.google.android.qfb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SemanticsSortKt.e(function2, obj, obj2);
            }
        });
        while (size <= m.r(arrayList2)) {
            List<SemanticsNode> listB = e16Var.b(((SemanticsNode) arrayList2.get(size)).getId());
            if (listB != null) {
                if (((Boolean) function1.invoke(arrayList2.get(size))).booleanValue()) {
                    size++;
                } else {
                    arrayList2.remove(size);
                }
                arrayList2.addAll(size, listB);
                size += listB.size();
            } else {
                size++;
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public static final List<SemanticsNode> f(SemanticsNode semanticsNode, Function1<? super SemanticsNode, Boolean> function1, Function1<? super SemanticsNode, Boolean> function2, List<SemanticsNode> list) {
        o48 o48VarC = f16.c();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            b(list.get(i), arrayList, function1, function2, o48VarC);
        }
        return d(semanticsNode, arrayList, function2, o48VarC);
    }
}
