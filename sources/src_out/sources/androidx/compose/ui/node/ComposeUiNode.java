package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.ej7;
import com.google.inputmethod.f43;
import com.google.inputmethod.gs1;
import com.google.inputmethod.p7e;
import com.google.inputmethod.zw5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\ba\u0018\u0000 ,2\u00020\u0001:\u0001-R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010%\u001a\u00020 8&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010+\u001a\u00020&8&@&X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006.À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "", "Lcom/google/android/ej7;", "getMeasurePolicy", "()Lcom/google/android/ej7;", "m", "(Lcom/google/android/ej7;)V", "measurePolicy", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "a", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Lcom/google/android/f43;", "getDensity", "()Lcom/google/android/f43;", "e", "(Lcom/google/android/f43;)V", "density", "Landroidx/compose/ui/b;", "getModifier", "()Landroidx/compose/ui/b;", "j", "(Landroidx/compose/ui/b;)V", "modifier", "Lcom/google/android/p7e;", "getViewConfiguration", "()Lcom/google/android/p7e;", "i", "(Lcom/google/android/p7e;)V", "viewConfiguration", "Lcom/google/android/gs1;", "getCompositionLocalMap", "()Lcom/google/android/gs1;", "o", "(Lcom/google/android/gs1;)V", "compositionLocalMap", "", "getCompositeKeyHash", "()I", "f", "(I)V", "compositeKeyHash", "s1", "Companion", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ComposeUiNode {

    /* JADX INFO: renamed from: s1, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR)\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R)\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R)\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R)\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R)\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R)\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\"\u0010\u0011\u001a\u0004\b#\u0010\u0013R)\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b&\u0010\u0011\u001a\u0004\b\n\u0010\u0013R#\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/ComposeUiNode;", "b", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "Constructor", "c", "g", "VirtualConstructor", "Lkotlin/Function2;", "Landroidx/compose/ui/b;", "", "d", "Lkotlin/jvm/functions/Function2;", "e", "()Lkotlin/jvm/functions/Function2;", "SetModifier", "Lcom/google/android/f43;", "getSetDensity", "SetDensity", "Lcom/google/android/gs1;", "f", "SetResolvedCompositionLocals", "Lcom/google/android/ej7;", "SetMeasurePolicy", "Landroidx/compose/ui/unit/LayoutDirection;", "h", "getSetLayoutDirection", "SetLayoutDirection", "Lcom/google/android/p7e;", "i", "getSetViewConfiguration", "SetViewConfiguration", "", "j", "SetCompositeKeyHash", "Lkotlin/Function1;", "k", "Lkotlin/jvm/functions/Function1;", "a", "()Lkotlin/jvm/functions/Function1;", "ApplyOnDeactivatedNodeAssertion", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final Function0<ComposeUiNode> Constructor = LayoutNode.INSTANCE.a();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final Function0<ComposeUiNode> VirtualConstructor = new Function0<LayoutNode>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LayoutNode invoke() {
                return new LayoutNode(true, 0, 2, null);
            }
        };

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final Function2<ComposeUiNode, androidx.compose.ui.b, Unit> SetModifier = new Function2<ComposeUiNode, androidx.compose.ui.b, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
            public final void a(ComposeUiNode composeUiNode, androidx.compose.ui.b bVar) {
                composeUiNode.j(bVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((ComposeUiNode) obj, (androidx.compose.ui.b) obj2);
                return Unit.a;
            }
        };

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private static final Function2<ComposeUiNode, f43, Unit> SetDensity = new Function2<ComposeUiNode, f43, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
            public final void a(ComposeUiNode composeUiNode, f43 f43Var) {
                composeUiNode.e(f43Var);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((ComposeUiNode) obj, (f43) obj2);
                return Unit.a;
            }
        };

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private static final Function2<ComposeUiNode, gs1, Unit> SetResolvedCompositionLocals = new Function2<ComposeUiNode, gs1, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetResolvedCompositionLocals$1
            public final void a(ComposeUiNode composeUiNode, gs1 gs1Var) {
                composeUiNode.o(gs1Var);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((ComposeUiNode) obj, (gs1) obj2);
                return Unit.a;
            }
        };

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private static final Function2<ComposeUiNode, ej7, Unit> SetMeasurePolicy = new Function2<ComposeUiNode, ej7, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
            public final void a(ComposeUiNode composeUiNode, ej7 ej7Var) {
                composeUiNode.m(ej7Var);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((ComposeUiNode) obj, (ej7) obj2);
                return Unit.a;
            }
        };

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private static final Function2<ComposeUiNode, LayoutDirection, Unit> SetLayoutDirection = new Function2<ComposeUiNode, LayoutDirection, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
            public final void a(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                composeUiNode.a(layoutDirection);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((ComposeUiNode) obj, (LayoutDirection) obj2);
                return Unit.a;
            }
        };

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private static final Function2<ComposeUiNode, p7e, Unit> SetViewConfiguration = new Function2<ComposeUiNode, p7e, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
            public final void a(ComposeUiNode composeUiNode, p7e p7eVar) {
                composeUiNode.i(p7eVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((ComposeUiNode) obj, (p7e) obj2);
                return Unit.a;
            }
        };

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private static final Function2<ComposeUiNode, Integer, Unit> SetCompositeKeyHash = new Function2<ComposeUiNode, Integer, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetCompositeKeyHash$1
            public final void a(ComposeUiNode composeUiNode, int i2) {
                composeUiNode.f(i2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((ComposeUiNode) obj, ((Number) obj2).intValue());
                return Unit.a;
            }
        };

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private static final Function1<ComposeUiNode, Unit> ApplyOnDeactivatedNodeAssertion = new Function1<ComposeUiNode, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1
            public final void a(ComposeUiNode composeUiNode) {
                LayoutNode layoutNode = composeUiNode instanceof LayoutNode ? (LayoutNode) composeUiNode : null;
                boolean z = false;
                if (layoutNode != null && layoutNode.getIsDeactivated()) {
                    z = true;
                }
                if (z) {
                    zw5.c("Apply is called on deactivated node " + composeUiNode);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((ComposeUiNode) obj);
                return Unit.a;
            }
        };

        private Companion() {
        }

        public final Function1<ComposeUiNode, Unit> a() {
            return ApplyOnDeactivatedNodeAssertion;
        }

        public final Function0<ComposeUiNode> b() {
            return Constructor;
        }

        public final Function2<ComposeUiNode, Integer, Unit> c() {
            return SetCompositeKeyHash;
        }

        public final Function2<ComposeUiNode, ej7, Unit> d() {
            return SetMeasurePolicy;
        }

        public final Function2<ComposeUiNode, androidx.compose.ui.b, Unit> e() {
            return SetModifier;
        }

        public final Function2<ComposeUiNode, gs1, Unit> f() {
            return SetResolvedCompositionLocals;
        }

        public final Function0<ComposeUiNode> g() {
            return VirtualConstructor;
        }
    }

    void a(LayoutDirection layoutDirection);

    void e(f43 f43Var);

    void f(int i);

    void i(p7e p7eVar);

    void j(androidx.compose.ui.b bVar);

    void m(ej7 ej7Var);

    void o(gs1 gs1Var);
}
