package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLineKt;
import com.google.inputmethod.mf5;
import com.google.inputmethod.rn8;
import com.google.inputmethod.uc;
import com.google.inputmethod.wc;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\b*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0010J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0010J\u001b\u0010\u001b\u001a\u00020\u0019*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H$¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010+\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010.\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\"\u00102\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R\"\u00105\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010#\u001a\u0004\b3\u0010%\"\u0004\b4\u0010'R\"\u00108\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\u0018\u00109\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010;R\u0014\u0010>\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010%R\u0014\u0010@\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010%R$\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011*\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\b/\u0010A\u0082\u0001\u0002CD¨\u0006E"}, d2 = {"Landroidx/compose/ui/node/AlignmentLines;", "", "Lcom/google/android/wc;", "alignmentLinesOwner", "<init>", "(Lcom/google/android/wc;)V", "Lcom/google/android/uc;", "alignmentLine", "", "initialPosition", "Landroidx/compose/ui/node/NodeCoordinator;", "initialCoordinator", "", "c", "(Lcom/google/android/uc;ILandroidx/compose/ui/node/NodeCoordinator;)V", "o", "()V", "", "h", "()Ljava/util/Map;", "i", "(Landroidx/compose/ui/node/NodeCoordinator;Lcom/google/android/uc;)I", "n", "p", "m", "Lcom/google/android/rn8;", "position", "d", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "a", "Lcom/google/android/wc;", "f", "()Lcom/google/android/wc;", "", "b", "Z", "g", "()Z", "setDirty$ui", "(Z)V", "dirty", "getUsedDuringParentMeasurement$ui", "u", "usedDuringParentMeasurement", "l", "t", "usedDuringParentLayout", "e", "getPreviousUsedDuringParentLayout$ui", "q", "previousUsedDuringParentLayout", "getUsedByModifierMeasurement$ui", "s", "usedByModifierMeasurement", "getUsedByModifierLayout$ui", "r", "usedByModifierLayout", "queryOwner", "", "Ljava/util/Map;", "alignmentLineMap", "j", "queried", "k", "required", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap", "Landroidx/compose/ui/node/e;", "Landroidx/compose/ui/node/h;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AlignmentLines {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final wc alignmentLinesOwner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean dirty;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean usedDuringParentMeasurement;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean usedDuringParentLayout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean previousUsedDuringParentLayout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean usedByModifierMeasurement;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean usedByModifierLayout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private wc queryOwner;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Map<uc, Integer> alignmentLineMap;

    public /* synthetic */ AlignmentLines(wc wcVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(wcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(uc alignmentLine, int initialPosition, NodeCoordinator initialCoordinator) {
        float f = initialPosition;
        long jE = rn8.e((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
        while (true) {
            jE = d(initialCoordinator, jE);
            initialCoordinator = initialCoordinator.getWrappedBy();
            Intrinsics.g(initialCoordinator);
            if (Intrinsics.e(initialCoordinator, this.alignmentLinesOwner.h0())) {
                break;
            } else if (e(initialCoordinator).containsKey(alignmentLine)) {
                float fI = i(initialCoordinator, alignmentLine);
                jE = rn8.e((((long) Float.floatToRawIntBits(fI)) << 32) | (((long) Float.floatToRawIntBits(fI)) & 4294967295L));
            }
        }
        int iRound = Math.round(alignmentLine instanceof mf5 ? Float.intBitsToFloat((int) (jE & 4294967295L)) : Float.intBitsToFloat((int) (jE >> 32)));
        Map<uc, Integer> map = this.alignmentLineMap;
        if (map.containsKey(alignmentLine)) {
            iRound = AlignmentLineKt.c(alignmentLine, ((Number) b0.k(this.alignmentLineMap, alignmentLine)).intValue(), iRound);
        }
        map.put(alignmentLine, Integer.valueOf(iRound));
    }

    protected abstract long d(NodeCoordinator nodeCoordinator, long j);

    protected abstract Map<uc, Integer> e(NodeCoordinator nodeCoordinator);

    /* JADX INFO: renamed from: f, reason: from getter */
    public final wc getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getDirty() {
        return this.dirty;
    }

    public final Map<uc, Integer> h() {
        return this.alignmentLineMap;
    }

    protected abstract int i(NodeCoordinator nodeCoordinator, uc ucVar);

    public final boolean j() {
        return this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout;
    }

    public final boolean k() {
        o();
        return this.queryOwner != null;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getUsedDuringParentLayout() {
        return this.usedDuringParentLayout;
    }

    public final void m() {
        this.dirty = true;
        wc wcVarA0 = this.alignmentLinesOwner.a0();
        if (wcVarA0 == null) {
            return;
        }
        if (this.usedDuringParentMeasurement) {
            wcVarA0.T();
        } else if (this.previousUsedDuringParentLayout || this.usedDuringParentLayout) {
            wcVarA0.requestLayout();
        }
        if (this.usedByModifierMeasurement) {
            this.alignmentLinesOwner.T();
        }
        if (this.usedByModifierLayout) {
            this.alignmentLinesOwner.requestLayout();
        }
        wcVarA0.getAlignmentLines().m();
    }

    public final void n() {
        this.alignmentLineMap.clear();
        this.alignmentLinesOwner.t0(new Function1<wc, Unit>() { // from class: androidx.compose.ui.node.AlignmentLines$recalculate$1
            {
                super(1);
            }

            public final void a(wc wcVar) {
                if (wcVar.getPlaceOrder() == Integer.MAX_VALUE) {
                    return;
                }
                if (wcVar.getAlignmentLines().getDirty()) {
                    wcVar.c0();
                }
                Map map = wcVar.getAlignmentLines().alignmentLineMap;
                AlignmentLines alignmentLines = this.this$0;
                for (Map.Entry entry : map.entrySet()) {
                    alignmentLines.c((uc) entry.getKey(), ((Number) entry.getValue()).intValue(), wcVar.h0());
                }
                NodeCoordinator wrappedBy = wcVar.h0().getWrappedBy();
                Intrinsics.g(wrappedBy);
                while (!Intrinsics.e(wrappedBy, this.this$0.getAlignmentLinesOwner().h0())) {
                    Set<uc> setKeySet = this.this$0.e(wrappedBy).keySet();
                    AlignmentLines alignmentLines2 = this.this$0;
                    for (uc ucVar : setKeySet) {
                        alignmentLines2.c(ucVar, alignmentLines2.i(wrappedBy, ucVar), wrappedBy);
                    }
                    wrappedBy = wrappedBy.getWrappedBy();
                    Intrinsics.g(wrappedBy);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((wc) obj);
                return Unit.a;
            }
        });
        this.alignmentLineMap.putAll(e(this.alignmentLinesOwner.h0()));
        this.dirty = false;
    }

    public final void o() {
        wc wcVar;
        AlignmentLines alignmentLinesJ;
        AlignmentLines alignmentLinesJ2;
        if (j()) {
            wcVar = this.alignmentLinesOwner;
        } else {
            wc wcVarA0 = this.alignmentLinesOwner.a0();
            if (wcVarA0 == null) {
                return;
            }
            wcVar = wcVarA0.getAlignmentLines().queryOwner;
            if (wcVar == null || !wcVar.getAlignmentLines().j()) {
                wc wcVar2 = this.queryOwner;
                if (wcVar2 == null || wcVar2.getAlignmentLines().j()) {
                    return;
                }
                wc wcVarA1 = wcVar2.a0();
                if (wcVarA1 != null && (alignmentLinesJ2 = wcVarA1.getAlignmentLines()) != null) {
                    alignmentLinesJ2.o();
                }
                wc wcVarA2 = wcVar2.a0();
                wcVar = (wcVarA2 == null || (alignmentLinesJ = wcVarA2.getAlignmentLines()) == null) ? null : alignmentLinesJ.queryOwner;
            }
        }
        this.queryOwner = wcVar;
    }

    public final void p() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    public final void q(boolean z) {
        this.previousUsedDuringParentLayout = z;
    }

    public final void r(boolean z) {
        this.usedByModifierLayout = z;
    }

    public final void s(boolean z) {
        this.usedByModifierMeasurement = z;
    }

    public final void t(boolean z) {
        this.usedDuringParentLayout = z;
    }

    public final void u(boolean z) {
        this.usedDuringParentMeasurement = z;
    }

    private AlignmentLines(wc wcVar) {
        this.alignmentLinesOwner = wcVar;
        this.dirty = true;
        this.alignmentLineMap = new HashMap();
    }
}
