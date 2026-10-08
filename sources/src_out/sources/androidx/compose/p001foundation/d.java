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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/foundation/d;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/e;", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/av5;", "indicationNodeFactory", "", "useLocalIndication", "enabled", "", "onClickLabel", "Lcom/google/android/hpa;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(Lcom/google/android/r48;Lcom/google/android/av5;ZZLjava/lang/String;Lcom/google/android/hpa;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/e;", "node", "e", "(Landroidx/compose/foundation/e;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/android/r48;", "Lcom/google/android/av5;", "f", "Z", "g", "h", "Ljava/lang/String;", "i", "Lcom/google/android/hpa;", "j", "Lkotlin/jvm/functions/Function0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d extends uy7<e> {

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

    public /* synthetic */ d(r48 r48Var, av5 av5Var, boolean z, boolean z2, String str, hpa hpaVar, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(r48Var, av5Var, z, z2, str, hpaVar, function0);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e a() {
        return new e(this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.onClickLabel, this.role, this.onClick, null);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(e node) {
        node.r4(this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.onClickLabel, this.role, this.onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || d.class != other.getClass()) {
            return false;
        }
        d dVar = (d) other;
        return Intrinsics.e(this.interactionSource, dVar.interactionSource) && Intrinsics.e(this.indicationNodeFactory, dVar.indicationNodeFactory) && this.useLocalIndication == dVar.useLocalIndication && this.enabled == dVar.enabled && Intrinsics.e(this.onClickLabel, dVar.onClickLabel) && Intrinsics.e(this.role, dVar.role) && this.onClick == dVar.onClick;
    }

    public int hashCode() {
        r48 r48Var = this.interactionSource;
        int iHashCode = (r48Var != null ? r48Var.hashCode() : 0) * 31;
        av5 av5Var = this.indicationNodeFactory;
        int iHashCode2 = (((((iHashCode + (av5Var != null ? av5Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.useLocalIndication)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        String str = this.onClickLabel;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        hpa hpaVar = this.role;
        return ((iHashCode3 + (hpaVar != null ? hpa.n(hpaVar.getValue()) : 0)) * 31) + this.onClick.hashCode();
    }

    private d(r48 r48Var, av5 av5Var, boolean z, boolean z2, String str, hpa hpaVar, Function0<Unit> function0) {
        this.interactionSource = r48Var;
        this.indicationNodeFactory = av5Var;
        this.useLocalIndication = z;
        this.enabled = z2;
        this.onClickLabel = str;
        this.role = hpaVar;
        this.onClick = function0;
    }
}
