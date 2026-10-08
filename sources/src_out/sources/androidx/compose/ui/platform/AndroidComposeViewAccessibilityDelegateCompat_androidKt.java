package androidx.compose.ui.platform;

import android.content.res.Resources;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsSortKt;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.ng1;
import com.google.inputmethod.AccessibilityAction;
import com.google.inputmethod.ProgressBarRangeInfo;
import com.google.inputmethod.e16;
import com.google.inputmethod.ffb;
import com.google.inputmethod.hpa;
import com.google.inputmethod.ifb;
import com.google.inputmethod.m48;
import com.google.inputmethod.seb;
import com.google.inputmethod.xz9;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a)\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u000f\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u0002*\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u001b\u0010!\u001a\u00020\u0002*\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\u0002*\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010\u001d\u001a!\u0010'\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030$2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(\"\u0018\u0010*\u001a\u00020\u0002*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001d¨\u0006+"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "", "selector", "p", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/LayoutNode;", "Lcom/google/android/e16;", "Lcom/google/android/ffb;", "currentSemanticsNodes", "Lcom/google/android/m48;", "outputBeforeMap", "outputAfterMap", "Landroid/content/res/Resources;", "resources", "", "w", "(Lcom/google/android/e16;Lcom/google/android/m48;Lcom/google/android/m48;Landroid/content/res/Resources;)V", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "u", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroid/content/res/Resources;)Z", "Landroidx/compose/ui/text/b;", "s", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/text/b;", "", "r", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroid/content/res/Resources;)Ljava/lang/String;", "m", "q", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "n", "Lcom/google/android/seb;", "oldConfig", "v", "(Landroidx/compose/ui/semantics/SemanticsNode;Lcom/google/android/seb;)Z", "o", "Lcom/google/android/y5;", "", "other", "l", "(Lcom/google/android/y5;Ljava/lang/Object;)Z", "t", "isRtl", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!Intrinsics.e(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.a() != null || accessibilityAction2.a() == null) {
            return accessibilityAction.a() == null || accessibilityAction2.a() != null;
        }
        return false;
    }

    private static final String m(SemanticsNode semanticsNode, Resources resources) {
        seb sebVarP = semanticsNode.b().p();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        Collection collection = (Collection) SemanticsConfigurationKt.a(sebVarP, semanticsProperties.d());
        if (collection != null && !collection.isEmpty()) {
            return null;
        }
        Collection collection2 = (Collection) SemanticsConfigurationKt.a(sebVarP, semanticsProperties.L());
        if (collection2 != null && !collection2.isEmpty()) {
            return null;
        }
        CharSequence charSequence = (CharSequence) SemanticsConfigurationKt.a(sebVarP, semanticsProperties.g());
        if (charSequence == null || charSequence.length() == 0) {
            return resources.getString(xz9.h);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(SemanticsNode semanticsNode) {
        return !semanticsNode.p().d(SemanticsProperties.a.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(SemanticsNode semanticsNode) {
        seb unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        if (unmergedConfig.d(semanticsProperties.g()) && !Intrinsics.e(SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.j()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode layoutNodeP = p(semanticsNode.getLayoutNode(), new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
            /* JADX WARN: Code duplicated, block: B:9:0x001a  */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(LayoutNode layoutNode) {
                boolean z;
                seb sebVarG = layoutNode.g();
                if (sebVarG != null) {
                    z = sebVarG.getIsMergingSemanticsOfDescendants() && sebVarG.d(SemanticsProperties.a.g());
                }
                return Boolean.valueOf(z);
            }
        });
        if (layoutNodeP != null) {
            seb sebVarG = layoutNodeP.g();
            if (!(sebVarG != null ? Intrinsics.e(SemanticsConfigurationKt.a(sebVarG, semanticsProperties.j()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutNode p(LayoutNode layoutNode, Function1<? super LayoutNode, Boolean> function1) {
        for (LayoutNode layoutNodeC0 = layoutNode.C0(); layoutNodeC0 != null; layoutNodeC0 = layoutNodeC0.C0()) {
            if (((Boolean) function1.invoke(layoutNodeC0)).booleanValue()) {
                return layoutNodeC0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(SemanticsNode semanticsNode) {
        seb unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(unmergedConfig, semanticsProperties.Q());
        hpa hpaVar = (hpa) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.F());
        boolean z = toggleableState != null;
        if (((Boolean) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.H())) != null) {
            if (!(hpaVar != null ? hpa.m(hpaVar.getValue(), hpa.INSTANCE.h()) : false)) {
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final String r(SemanticsNode semanticsNode, Resources resources) throws NoWhenBranchMatchedException {
        seb unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        Object objA = SemanticsConfigurationKt.a(unmergedConfig, semanticsProperties.J());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.Q());
        hpa hpaVar = (hpa) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.F());
        int iO = 0;
        if (toggleableState != null) {
            int i = a.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i == 1) {
                if ((hpaVar == null ? false : hpa.m(hpaVar.getValue(), hpa.INSTANCE.g())) && objA == null) {
                    objA = resources.getString(xz9.j);
                }
            } else if (i == 2) {
                if ((hpaVar == null ? false : hpa.m(hpaVar.getValue(), hpa.INSTANCE.g())) && objA == null) {
                    objA = resources.getString(xz9.i);
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (objA == null) {
                    objA = resources.getString(xz9.e);
                }
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.H());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(hpaVar == null ? false : hpa.m(hpaVar.getValue(), hpa.INSTANCE.h())) && objA == null) {
                objA = zBooleanValue ? resources.getString(xz9.g) : resources.getString(xz9.f);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.E());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.a()) {
                if (objA == null) {
                    ng1<Float> ng1VarC = progressBarRangeInfo.c();
                    float current = ((((Number) ng1VarC.e()).floatValue() - ((Number) ng1VarC.c()).floatValue()) > 0.0f ? 1 : ((((Number) ng1VarC.e()).floatValue() - ((Number) ng1VarC.c()).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (progressBarRangeInfo.getCurrent() - ((Number) ng1VarC.c()).floatValue()) / (((Number) ng1VarC.e()).floatValue() - ((Number) ng1VarC.c()).floatValue());
                    if (current < 0.0f) {
                        current = 0.0f;
                    }
                    if (current > 1.0f) {
                        current = 1.0f;
                    }
                    if (!(current == 0.0f)) {
                        iO = (current == 1.0f ? 1 : 0) != 0 ? 100 : kotlin.ranges.g.o(Math.round(current * 100), 1, 99);
                    }
                    objA = resources.getString(xz9.m, Integer.valueOf(iO));
                }
            } else if (objA == null) {
                objA = resources.getString(xz9.d);
            }
        }
        if (semanticsNode.getUnmergedConfig().d(semanticsProperties.g())) {
            objA = m(semanticsNode, resources);
        }
        return (String) objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.b s(SemanticsNode semanticsNode) {
        seb unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        androidx.compose.ui.text.b bVar = (androidx.compose.ui.text.b) SemanticsConfigurationKt.a(unmergedConfig, semanticsProperties.g());
        List list = (List) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.L());
        return bVar == null ? list != null ? (androidx.compose.ui.text.b) kotlin.collections.m.B0(list) : null : bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(SemanticsNode semanticsNode) {
        return semanticsNode.r().getLayoutDirection() == LayoutDirection.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(SemanticsNode semanticsNode, Resources resources) {
        List list = (List) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsProperties.a.d());
        return !ifb.g(semanticsNode) && (semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || (semanticsNode.D() && ((list != null ? (String) kotlin.collections.m.B0(list) : null) != null || s(semanticsNode) != null || r(semanticsNode, resources) != null || q(semanticsNode))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(SemanticsNode semanticsNode, seb sebVar) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = sebVar.iterator();
        while (it.hasNext()) {
            if (!semanticsNode.p().d(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(final e16<ffb> e16Var, m48 m48Var, m48 m48Var2, final Resources resources) {
        m48Var.j();
        m48Var2.j();
        ffb ffbVarB = e16Var.b(-1);
        SemanticsNode semanticsNode = ffbVarB != null ? ffbVarB.getSemanticsNode() : null;
        Intrinsics.g(semanticsNode);
        List<SemanticsNode> listF = SemanticsSortKt.f(semanticsNode, new Function1<SemanticsNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(SemanticsNode semanticsNode2) {
                return Boolean.valueOf(e16Var.a(semanticsNode2.getId()));
            }
        }, new Function1<SemanticsNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(SemanticsNode semanticsNode2) {
                return Boolean.valueOf(AndroidComposeViewAccessibilityDelegateCompat_androidKt.u(semanticsNode2, resources));
            }
        }, kotlin.collections.m.e(semanticsNode));
        int iR = kotlin.collections.m.r(listF);
        int i = 1;
        if (1 > iR) {
            return;
        }
        while (true) {
            int id = listF.get(i - 1).getId();
            int id2 = listF.get(i).getId();
            m48Var.u(id, id2);
            m48Var2.u(id2, id);
            if (i == iR) {
                return;
            } else {
                i++;
            }
        }
    }
}
