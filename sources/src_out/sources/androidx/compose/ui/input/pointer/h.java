package androidx.compose.ui.input.pointer;

import com.google.inputmethod.ne9;
import com.google.inputmethod.qe9;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/h;", "Landroidx/compose/ui/input/pointer/HoverIconModifierNode;", "Lcom/google/android/ne9;", "icon", "", "overrideDescendants", "<init>", "(Lcom/google/android/ne9;Z)V", "Landroidx/compose/ui/input/pointer/j;", "pointerType", "w3", "(I)Z", "", "o3", "(Lcom/google/android/ne9;)V", "", "t", "Ljava/lang/String;", "C3", "()Ljava/lang/String;", "traverseKey", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends HoverIconModifierNode {

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final String traverseKey;

    public h(ne9 ne9Var, boolean z) {
        super(ne9Var, z, null, 4, null);
        this.traverseKey = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // com.google.inputmethod.fhd
    /* JADX INFO: renamed from: C3, reason: from getter */
    public String getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    public void o3(ne9 icon) {
        qe9 qe9VarV3 = v3();
        if (qe9VarV3 != null) {
            qe9VarV3.a(icon);
        }
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    public boolean w3(int pointerType) {
        j.Companion companion = j.INSTANCE;
        return (j.i(pointerType, companion.c()) || j.i(pointerType, companion.a())) ? false : true;
    }
}
