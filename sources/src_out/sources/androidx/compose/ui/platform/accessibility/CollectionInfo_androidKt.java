package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import com.google.inputmethod.CollectionInfo;
import com.google.inputmethod.m47;
import com.google.inputmethod.oh1;
import com.google.inputmethod.r6;
import com.google.inputmethod.rn8;
import com.google.inputmethod.seb;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\n \u0011*\u0004\u0018\u00010\u00160\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001b\u001a\u00020\b*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Lcom/google/android/r6;", "info", "", "d", "(Landroidx/compose/ui/semantics/SemanticsNode;Lcom/google/android/r6;)V", "e", "", "b", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "", "items", "a", "(Ljava/util/List;)Z", "Lcom/google/android/nh1;", "Lcom/google/android/r6$g;", "kotlin.jvm.PlatformType", "f", "(Lcom/google/android/nh1;)Lcom/google/android/r6$g;", "Lcom/google/android/oh1;", "itemNode", "Lcom/google/android/r6$h;", "g", "(Lcom/google/android/oh1;Landroidx/compose/ui/semantics/SemanticsNode;)Lcom/google/android/r6$h;", "c", "(Lcom/google/android/nh1;)Z", "isLazyCollection", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CollectionInfo_androidKt {
    private static final boolean a(List<SemanticsNode> list) {
        List listP;
        long packedValue;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            listP = m.p();
        } else {
            ArrayList arrayList = new ArrayList();
            SemanticsNode semanticsNode = list.get(0);
            int iR = m.r(list);
            int i = 0;
            while (i < iR) {
                i++;
                SemanticsNode semanticsNode2 = list.get(i);
                SemanticsNode semanticsNode3 = semanticsNode2;
                SemanticsNode semanticsNode4 = semanticsNode;
                arrayList.add(rn8.d(rn8.e((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (semanticsNode4.k().h() >> 32)) - Float.intBitsToFloat((int) (semanticsNode3.k().h() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (semanticsNode4.k().h() & 4294967295L)) - Float.intBitsToFloat((int) (semanticsNode3.k().h() & 4294967295L))))) & 4294967295L))));
                semanticsNode = semanticsNode2;
            }
            listP = arrayList;
        }
        if (listP.size() == 1) {
            packedValue = ((rn8) m.z0(listP)).getPackedValue();
        } else {
            if (listP.isEmpty()) {
                m47.g("Empty collection can't be reduced.");
            }
            Object objZ0 = m.z0(listP);
            int iR2 = m.r(listP);
            if (1 <= iR2) {
                int i2 = 1;
                while (true) {
                    objZ0 = rn8.d(rn8.q(((rn8) objZ0).getPackedValue(), ((rn8) listP.get(i2)).getPackedValue()));
                    if (i2 == iR2) {
                        break;
                    }
                    i2++;
                }
            }
            packedValue = ((rn8) objZ0).getPackedValue();
        }
        return Float.intBitsToFloat((int) (4294967295L & packedValue)) < Float.intBitsToFloat((int) (packedValue >> 32));
    }

    public static final boolean b(SemanticsNode semanticsNode) {
        seb sebVarP = semanticsNode.p();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        return (SemanticsConfigurationKt.a(sebVarP, semanticsProperties.a()) == null && SemanticsConfigurationKt.a(semanticsNode.p(), semanticsProperties.G()) == null) ? false : true;
    }

    private static final boolean c(CollectionInfo collectionInfo) {
        return collectionInfo.getRowCount() < 0 || collectionInfo.getColumnCount() < 0;
    }

    public static final void d(SemanticsNode semanticsNode, r6 r6Var) {
        seb sebVarP = semanticsNode.p();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.a(sebVarP, semanticsProperties.a());
        if (collectionInfo != null) {
            r6Var.v0(f(collectionInfo));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.a(semanticsNode.p(), semanticsProperties.G()) != null) {
            List<SemanticsNode> listV = semanticsNode.v();
            int size = listV.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode2 = listV.get(i);
                if (semanticsNode2.p().d(SemanticsProperties.a.H())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zA = a(arrayList);
        r6Var.v0(r6.g.b(zA ? 1 : arrayList.size(), zA ? arrayList.size() : 1, false, 0));
    }

    public static final void e(SemanticsNode semanticsNode, r6 r6Var) {
        seb sebVarP = semanticsNode.p();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        oh1 oh1Var = (oh1) SemanticsConfigurationKt.a(sebVarP, semanticsProperties.b());
        if (oh1Var != null) {
            r6Var.w0(g(oh1Var, semanticsNode));
        }
        SemanticsNode semanticsNodeT = semanticsNode.t();
        if (semanticsNodeT == null || SemanticsConfigurationKt.a(semanticsNodeT.p(), semanticsProperties.G()) == null) {
            return;
        }
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.a(semanticsNodeT.p(), semanticsProperties.a());
        if ((collectionInfo == null || !c(collectionInfo)) && semanticsNode.p().d(semanticsProperties.H())) {
            ArrayList arrayList = new ArrayList();
            List<SemanticsNode> listV = semanticsNodeT.v();
            int size = listV.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsNode semanticsNode2 = listV.get(i2);
                if (semanticsNode2.p().d(SemanticsProperties.a.H())) {
                    arrayList.add(semanticsNode2);
                    if (semanticsNode2.getLayoutNode().D0() < semanticsNode.getLayoutNode().D0()) {
                        i++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zA = a(arrayList);
            r6.h hVarB = r6.h.b(zA ? 0 : i, 1, zA ? i : 0, 1, false, ((Boolean) semanticsNode.p().n(SemanticsProperties.a.H(), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1
                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final Boolean m60invoke() {
                    return Boolean.FALSE;
                }
            })).booleanValue());
            if (hVarB != null) {
                r6Var.w0(hVarB);
            }
        }
    }

    private static final r6.g f(CollectionInfo collectionInfo) {
        return r6.g.b(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), false, 0);
    }

    private static final r6.h g(oh1 oh1Var, SemanticsNode semanticsNode) {
        return r6.h.b(oh1Var.getRowIndex(), oh1Var.getRowSpan(), oh1Var.getColumnIndex(), oh1Var.getColumnSpan(), false, ((Boolean) semanticsNode.p().n(SemanticsProperties.a.H(), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$toAccessibilityCollectionItemInfo$1
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Boolean m61invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue());
    }
}
