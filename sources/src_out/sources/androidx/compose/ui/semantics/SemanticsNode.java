package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import com.google.inputmethod.bfb;
import com.google.inputmethod.cfb;
import com.google.inputmethod.efb;
import com.google.inputmethod.gba;
import com.google.inputmethod.hpa;
import com.google.inputmethod.k33;
import com.google.inputmethod.ki8;
import com.google.inputmethod.kn6;
import com.google.inputmethod.ln6;
import com.google.inputmethod.nfb;
import com.google.inputmethod.ni8;
import com.google.inputmethod.q16;
import com.google.inputmethod.r58;
import com.google.inputmethod.rn8;
import com.google.inputmethod.seb;
import com.google.inputmethod.un6;
import com.google.inputmethod.y23;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\u00020\u0014*\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b!\u0010\"J-\u0010(\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010#2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00140%H\u0002¢\u0006\u0004\b(\u0010)J9\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0004\b+\u0010,J3\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0004\b.\u0010/J\u0011\u00101\u001a\u0004\u0018\u000100H\u0000¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0000H\u0000¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010>\u001a\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010AR\u0017\u0010G\u001a\u00020C8\u0006¢\u0006\f\n\u0004\b1\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010:R\u0014\u0010K\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010:R\u0014\u0010M\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010:R\u0011\u0010Q\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010T\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0011\u0010Z\u001a\u00020W8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0011\u0010\\\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b[\u0010SR\u0011\u0010_\u001a\u00020]8F¢\u0006\u0006\u001a\u0004\b^\u0010YR\u0011\u0010a\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b`\u0010SR\u0014\u0010c\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010SR\u0014\u0010e\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bd\u0010:R\u0011\u0010g\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bf\u0010@R\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bk\u0010iR\u0013\u0010n\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\bm\u00104¨\u0006o"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "Landroidx/compose/ui/b$c;", "outerSemanticsNode", "", "mergingEnabled", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lcom/google/android/seb;", "unmergedConfig", "<init>", "(Landroidx/compose/ui/b$c;ZLandroidx/compose/ui/node/LayoutNode;Lcom/google/android/seb;)V", "Lcom/google/android/kn6;", "nodeCoordinates", "Lcom/google/android/gba;", "a", "(Lcom/google/android/kn6;)Lcom/google/android/gba;", "", "unmergedChildren", "mergedConfig", "", "E", "(Ljava/util/List;Lcom/google/android/seb;)V", "list", "includeDeactivatedNodes", "e", "(Landroidx/compose/ui/node/LayoutNode;Ljava/util/List;Z)V", "", "g", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lcom/google/android/bfb;", "i", "()Lcom/google/android/bfb;", "c", "(Ljava/util/List;)V", "Lcom/google/android/hpa;", "role", "Lkotlin/Function1;", "Lcom/google/android/nfb;", "properties", "d", "(Lcom/google/android/hpa;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/semantics/SemanticsNode;", "includeFakeNodes", "F", "(Ljava/util/List;ZZ)Ljava/util/List;", "includeReplacedSemantics", "n", "(ZZZ)Ljava/util/List;", "Landroidx/compose/ui/node/NodeCoordinator;", "f", "()Landroidx/compose/ui/node/NodeCoordinator;", "b", "()Landroidx/compose/ui/semantics/SemanticsNode;", "Landroidx/compose/ui/b$c;", "getOuterSemanticsNode$ui", "()Landroidx/compose/ui/b$c;", "Z", "getMergingEnabled", "()Z", "Landroidx/compose/ui/node/LayoutNode;", "s", "()Landroidx/compose/ui/node/LayoutNode;", "Lcom/google/android/seb;", "z", "()Lcom/google/android/seb;", "Landroidx/compose/ui/semantics/SemanticsNode;", "fakeNodeParent", "", "I", "q", "()I", "id", "B", "isMergingSemanticsOfDescendants", "A", "isFake", "D", "isUnmergedLeafNode", "Lcom/google/android/un6;", "r", "()Lcom/google/android/un6;", "layoutInfo", "x", "()Lcom/google/android/gba;", "touchBoundsInRoot", "y", "unclippedBoundsInRoot", "Lcom/google/android/q16;", "w", "()J", "size", "k", "boundsInRoot", "Lcom/google/android/rn8;", "u", "positionInRoot", "l", "boundsInWindow", "j", "boundsInParent", "C", "isTransparent", "p", "config", "m", "()Ljava/util/List;", "children", "v", "replacedChildren", "t", "parent", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SemanticsNode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final androidx.compose.ui.b.c outerSemanticsNode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean mergingEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final LayoutNode layoutNode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final seb unmergedConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private SemanticsNode fakeNodeParent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int id;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/ui/semantics/SemanticsNode$a", "Lcom/google/android/bfb;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/nfb;", "", "H0", "(Lcom/google/android/nfb;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends androidx.compose.ui.b.c implements bfb {
        final /* synthetic */ Function1<nfb, Unit> p;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super nfb, Unit> function1) {
            this.p = function1;
        }

        @Override // com.google.inputmethod.bfb
        public void H0(nfb nfbVar) {
            this.p.invoke(nfbVar);
        }
    }

    public SemanticsNode(androidx.compose.ui.b.c cVar, boolean z, LayoutNode layoutNode, seb sebVar) {
        this.outerSemanticsNode = cVar;
        this.mergingEnabled = z;
        this.layoutNode = layoutNode;
        this.unmergedConfig = sebVar;
        this.id = layoutNode.getSemanticsId();
    }

    private final boolean B() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    private final void E(List<SemanticsNode> unmergedChildren, seb mergedConfig) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        G(this, unmergedChildren, false, false, 6, null);
        int size = unmergedChildren.size();
        for (int size2 = unmergedChildren.size(); size2 < size; size2++) {
            SemanticsNode semanticsNode = unmergedChildren.get(size2);
            if (!semanticsNode.B()) {
                mergedConfig.t(semanticsNode.unmergedConfig);
                semanticsNode.E(unmergedChildren, mergedConfig);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List G(SemanticsNode semanticsNode, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return semanticsNode.F(list, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v7 */
    private final gba a(kn6 nodeCoordinates) {
        ?? J;
        SemanticsNode semanticsNodeT = t();
        if (semanticsNodeT == null) {
            return gba.INSTANCE.a();
        }
        ki8 ki8VarV0 = semanticsNodeT.layoutNode.getNodes();
        int iA = ni8.a(8);
        if ((ki8VarV0.i() & iA) == 0) {
            J = 0;
            break;
        }
        androidx.compose.ui.b.c head = ki8VarV0.getHead();
        loop0: while (true) {
            if (head != null) {
                if ((head.getKindSet() & iA) != 0) {
                    J = head;
                    r58 r58Var = null;
                    while (J != 0) {
                        if (J instanceof bfb) {
                            if (((bfb) J).o1()) {
                                break loop0;
                            }
                        } else if ((J.getKindSet() & iA) != 0 && (J instanceof k33)) {
                            androidx.compose.ui.b.c cVarN3 = ((k33) J).getDelegate();
                            int i = 0;
                            J = J;
                            while (cVarN3 != null) {
                                if ((cVarN3.getKindSet() & iA) != 0) {
                                    i++;
                                    if (i == 1) {
                                        J = cVarN3;
                                    } else {
                                        if (r58Var == null) {
                                            r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                                        }
                                        if (J != 0) {
                                            r58Var.c(J);
                                            J = 0;
                                        }
                                        r58Var.c(cVarN3);
                                    }
                                }
                                cVarN3 = cVarN3.getChild();
                                J = J;
                            }
                            if (i == 1) {
                            }
                        }
                        J = y23.j(r58Var);
                    }
                }
                if ((head.getAggregateChildKindSet() & iA) != 0) {
                    head = head.getChild();
                }
            }
            J = 0;
            break;
        }
        bfb bfbVar = (bfb) J;
        NodeCoordinator nodeCoordinatorL = bfbVar != null ? y23.l(bfbVar, ni8.a(8)) : null;
        return nodeCoordinatorL == null ? semanticsNodeT.a(nodeCoordinates) : kn6.w(nodeCoordinatorL, nodeCoordinates, false, 2, null);
    }

    private final void c(List<SemanticsNode> unmergedChildren) {
        final hpa hpaVarF = efb.f(this);
        if (hpaVarF != null && this.unmergedConfig.getIsMergingSemanticsOfDescendants() && !unmergedChildren.isEmpty()) {
            unmergedChildren.add(d(hpaVarF, new Function1<nfb, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                {
                    super(1);
                }

                public final void a(nfb nfbVar) {
                    SemanticsPropertiesKt.p0(nfbVar, hpaVarF.getValue());
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((nfb) obj);
                    return Unit.a;
                }
            }));
        }
        seb sebVar = this.unmergedConfig;
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        if (sebVar.d(semanticsProperties.d()) && !unmergedChildren.isEmpty() && this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            List list = (List) SemanticsConfigurationKt.a(this.unmergedConfig, semanticsProperties.d());
            final String str = list != null ? (String) m.B0(list) : null;
            if (str != null) {
                unmergedChildren.add(0, d(null, new Function1<nfb, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(nfb nfbVar) {
                        SemanticsPropertiesKt.b0(nfbVar, str);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((nfb) obj);
                        return Unit.a;
                    }
                }));
            }
        }
    }

    private final SemanticsNode d(hpa role, Function1<? super nfb, Unit> properties) {
        seb sebVar = new seb();
        sebVar.v(false);
        sebVar.u(false);
        properties.invoke(sebVar);
        SemanticsNode semanticsNode = new SemanticsNode(new a(properties), false, new LayoutNode(true, role != null ? efb.g(this) : efb.e(this)), sebVar);
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    private final void e(LayoutNode layoutNode, List<SemanticsNode> list, boolean z) {
        r58<LayoutNode> r58VarK0 = layoutNode.K0();
        LayoutNode[] layoutNodeArr = r58VarK0.content;
        int size = r58VarK0.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            if (layoutNode2.b() && (z || !layoutNode2.getIsDeactivated())) {
                if (layoutNode2.getNodes().p(ni8.a(8))) {
                    list.add(efb.a(layoutNode2, this.mergingEnabled));
                } else {
                    e(layoutNode2, list, z);
                }
            }
        }
    }

    private final List<SemanticsNode> g(List<SemanticsNode> unmergedChildren, List<SemanticsNode> list) {
        G(this, unmergedChildren, false, false, 6, null);
        int size = unmergedChildren.size();
        for (int size2 = unmergedChildren.size(); size2 < size; size2++) {
            SemanticsNode semanticsNode = unmergedChildren.get(size2);
            if (semanticsNode.B()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.getIsClearingSemantics()) {
                semanticsNode.g(unmergedChildren, list);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List h(SemanticsNode semanticsNode, List list, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list2 = new ArrayList();
        }
        return semanticsNode.g(list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    private final com.google.inputmethod.bfb i() {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsNode.i():com.google.android.bfb");
    }

    public static /* synthetic */ List o(SemanticsNode semanticsNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = !semanticsNode.mergingEnabled;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return semanticsNode.n(z, z2, z3);
    }

    public final boolean A() {
        return this.fakeNodeParent != null;
    }

    public final boolean C() {
        NodeCoordinator nodeCoordinatorF = f();
        if (nodeCoordinatorF != null) {
            return nodeCoordinatorF.y3();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean D() {
        if (A() || !v().isEmpty()) {
            return false;
        }
        LayoutNode layoutNodeC0 = this.layoutNode.C0();
        while (layoutNodeC0 != null) {
            seb sebVarG = layoutNodeC0.g();
            if (sebVarG != null && sebVarG.getIsMergingSemanticsOfDescendants()) {
                if (layoutNodeC0 == null) {
                    return true;
                }
                return false;
            }
            layoutNodeC0 = layoutNodeC0.C0();
        }
        layoutNodeC0 = null;
        if (layoutNodeC0 == null) {
            return true;
        }
        return false;
    }

    public final List<SemanticsNode> F(List<SemanticsNode> unmergedChildren, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (A()) {
            return m.p();
        }
        e(this.layoutNode, unmergedChildren, includeDeactivatedNodes);
        if (includeFakeNodes) {
            c(unmergedChildren);
        }
        return unmergedChildren;
    }

    public final SemanticsNode b() {
        return new SemanticsNode(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }

    public final NodeCoordinator f() {
        NodeCoordinator nodeCoordinatorL;
        if (!A()) {
            bfb bfbVarI = i();
            return (bfbVarI == null || (nodeCoordinatorL = y23.l(bfbVarI, ni8.a(8))) == null) ? this.layoutNode.b0() : nodeCoordinatorL;
        }
        SemanticsNode semanticsNodeT = t();
        if (semanticsNodeT != null) {
            return semanticsNodeT.f();
        }
        return null;
    }

    public final gba j() {
        kn6 kn6VarV;
        NodeCoordinator nodeCoordinatorF = f();
        if (nodeCoordinatorF != null) {
            if (!nodeCoordinatorF.b()) {
                nodeCoordinatorF = null;
            }
            if (nodeCoordinatorF != null && (kn6VarV = nodeCoordinatorF.v()) != null) {
                return a(kn6VarV);
            }
        }
        return gba.INSTANCE.a();
    }

    public final gba k() {
        gba gbaVarB;
        NodeCoordinator nodeCoordinatorF = f();
        if (nodeCoordinatorF != null) {
            if (!nodeCoordinatorF.b()) {
                nodeCoordinatorF = null;
            }
            if (nodeCoordinatorF != null && (gbaVarB = ln6.b(nodeCoordinatorF)) != null) {
                return gbaVarB;
            }
        }
        return gba.INSTANCE.a();
    }

    public final gba l() {
        gba gbaVarE;
        NodeCoordinator nodeCoordinatorF = f();
        if (nodeCoordinatorF != null) {
            if (!nodeCoordinatorF.b()) {
                nodeCoordinatorF = null;
            }
            if (nodeCoordinatorF != null && (gbaVarE = ln6.e(nodeCoordinatorF, false, 1, null)) != null) {
                return gbaVarE;
            }
        }
        return gba.INSTANCE.a();
    }

    public final List<SemanticsNode> m() {
        return o(this, false, false, false, 7, null);
    }

    public final List<SemanticsNode> n(boolean includeReplacedSemantics, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (!includeReplacedSemantics && this.unmergedConfig.getIsClearingSemantics()) {
            return m.p();
        }
        ArrayList arrayList = new ArrayList();
        return B() ? h(this, arrayList, null, 2, null) : F(arrayList, includeFakeNodes, includeDeactivatedNodes);
    }

    public final seb p() {
        if (!B()) {
            return this.unmergedConfig;
        }
        seb sebVarF = this.unmergedConfig.f();
        E(new ArrayList(), sebVarF);
        return sebVarF;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final un6 r() {
        return this.layoutNode;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final SemanticsNode t() {
        LayoutNode layoutNodeC0;
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        if (!this.mergingEnabled) {
            layoutNodeC0 = null;
            break;
        }
        layoutNodeC0 = this.layoutNode.C0();
        while (true) {
            if (layoutNodeC0 != null) {
                seb sebVarG = layoutNodeC0.g();
                if (sebVarG != null && sebVarG.getIsMergingSemanticsOfDescendants()) {
                    break;
                }
                layoutNodeC0 = layoutNodeC0.C0();
            } else {
                layoutNodeC0 = null;
                break;
            }
        }
        if (layoutNodeC0 == null) {
            layoutNodeC0 = this.layoutNode.C0();
            while (layoutNodeC0 != null) {
                if (!layoutNodeC0.getNodes().p(ni8.a(8))) {
                    layoutNodeC0 = layoutNodeC0.C0();
                }
            }
            layoutNodeC0 = null;
        }
        if (layoutNodeC0 == null) {
            return null;
        }
        return efb.a(layoutNodeC0, this.mergingEnabled);
    }

    public final long u() {
        NodeCoordinator nodeCoordinatorF = f();
        if (nodeCoordinatorF != null) {
            if (!nodeCoordinatorF.b()) {
                nodeCoordinatorF = null;
            }
            if (nodeCoordinatorF != null) {
                return ln6.h(nodeCoordinatorF);
            }
        }
        return rn8.INSTANCE.c();
    }

    public final List<SemanticsNode> v() {
        return o(this, false, true, false, 4, null);
    }

    public final long w() {
        NodeCoordinator nodeCoordinatorF = f();
        return nodeCoordinatorF != null ? nodeCoordinatorF.a() : q16.INSTANCE.a();
    }

    public final gba x() {
        bfb bfbVarI = i();
        return bfbVarI == null ? this.layoutNode.b0().d4() : cfb.b(bfbVarI.getNode(), cfb.c(this.unmergedConfig), true);
    }

    public final gba y() {
        bfb bfbVarI = i();
        return bfbVarI == null ? cfb.a(this.layoutNode.b0(), false) : cfb.b(bfbVarI.getNode(), cfb.c(this.unmergedConfig), false);
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final seb getUnmergedConfig() {
        return this.unmergedConfig;
    }
}
