package androidx.compose.p001foundation;

import com.google.inputmethod.av5;
import com.google.inputmethod.hpa;
import com.google.inputmethod.r48;
import com.google.inputmethod.uy7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u007f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)R\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010-R\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010&¨\u00062"}, d2 = {"Landroidx/compose/foundation/f;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/CombinedClickableNode;", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/av5;", "indicationNodeFactory", "", "useLocalIndication", "enabled", "", "onClickLabel", "Lcom/google/android/hpa;", "role", "Lkotlin/Function0;", "", "onClick", "onLongClickLabel", "onLongClick", "onDoubleClick", "hapticFeedbackEnabled", "<init>", "(Lcom/google/android/r48;Lcom/google/android/av5;ZZLjava/lang/String;Lcom/google/android/hpa;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/CombinedClickableNode;", "node", "e", "(Landroidx/compose/foundation/CombinedClickableNode;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/android/r48;", "Lcom/google/android/av5;", "f", "Z", "g", "h", "Ljava/lang/String;", "i", "Lcom/google/android/hpa;", "j", "Lkotlin/jvm/functions/Function0;", "k", "l", "m", "n", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f extends uy7<CombinedClickableNode> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final r48 interactionSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final av5 indicationNodeFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean useLocalIndication;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String onClickLabel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final hpa role;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Function0<Unit> onClick;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String onLongClickLabel;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Function0<Unit> onLongClick;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Function0<Unit> onDoubleClick;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean hapticFeedbackEnabled;

    public /* synthetic */ f(r48 r48Var, av5 av5Var, boolean z, boolean z2, String str, hpa hpaVar, Function0 function0, String str2, Function0 function1, Function0 function2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(r48Var, av5Var, z, z2, str, hpaVar, function0, str2, function1, function2, z3);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public CombinedClickableNode a() {
        return new CombinedClickableNode(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.hapticFeedbackEnabled, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.onClickLabel, this.role, null);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(CombinedClickableNode node) {
        node.H4(this.hapticFeedbackEnabled);
        node.I4(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.onClickLabel, this.role);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || f.class != other.getClass()) {
            return false;
        }
        f fVar = (f) other;
        return Intrinsics.e(this.interactionSource, fVar.interactionSource) && Intrinsics.e(this.indicationNodeFactory, fVar.indicationNodeFactory) && this.useLocalIndication == fVar.useLocalIndication && this.enabled == fVar.enabled && Intrinsics.e(this.onClickLabel, fVar.onClickLabel) && Intrinsics.e(this.role, fVar.role) && this.onClick == fVar.onClick && Intrinsics.e(this.onLongClickLabel, fVar.onLongClickLabel) && this.onLongClick == fVar.onLongClick && this.onDoubleClick == fVar.onDoubleClick && this.hapticFeedbackEnabled == fVar.hapticFeedbackEnabled;
    }

    public int hashCode() {
        r48 r48Var = this.interactionSource;
        int iHashCode = (r48Var != null ? r48Var.hashCode() : 0) * 31;
        av5 av5Var = this.indicationNodeFactory;
        int iHashCode2 = (((((iHashCode + (av5Var != null ? av5Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.useLocalIndication)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        String str = this.onClickLabel;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        hpa hpaVar = this.role;
        int iN = (((iHashCode3 + (hpaVar != null ? hpa.n(hpaVar.getValue()) : 0)) * 31) + this.onClick.hashCode()) * 31;
        String str2 = this.onLongClickLabel;
        int iHashCode4 = (iN + (str2 != null ? str2.hashCode() : 0)) * 31;
        Function0<Unit> function0 = this.onLongClick;
        int iHashCode5 = (iHashCode4 + (function0 != null ? function0.hashCode() : 0)) * 31;
        Function0<Unit> function1 = this.onDoubleClick;
        return ((iHashCode5 + (function1 != null ? function1.hashCode() : 0)) * 31) + Boolean.hashCode(this.hapticFeedbackEnabled);
    }

    private f(r48 r48Var, av5 av5Var, boolean z, boolean z2, String str, hpa hpaVar, Function0<Unit> function0, String str2, Function0<Unit> function1, Function0<Unit> function2, boolean z3) {
        this.interactionSource = r48Var;
        this.indicationNodeFactory = av5Var;
        this.useLocalIndication = z;
        this.enabled = z2;
        this.onClickLabel = str;
        this.role = hpaVar;
        this.onClick = function0;
        this.onLongClickLabel = str2;
        this.onLongClick = function1;
        this.onDoubleClick = function2;
        this.hapticFeedbackEnabled = z3;
    }
}
