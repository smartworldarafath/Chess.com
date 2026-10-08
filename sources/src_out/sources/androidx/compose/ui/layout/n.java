package androidx.compose.ui.layout;

import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.kn6;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/layout/n;", "Landroidx/compose/ui/layout/o$a;", "Landroidx/compose/ui/node/m;", "owner", "<init>", "(Landroidx/compose/ui/node/m;)V", "b", "Landroidx/compose/ui/node/m;", "getOwner", "()Landroidx/compose/ui/node/m;", "", "r", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "m", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "Lcom/google/android/kn6;", "v", "()Lcom/google/android/kn6;", "coordinates", "", "getDensity", "()F", "density", "w2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n extends o.a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final androidx.compose.ui.node.m owner;

    public n(androidx.compose.ui.node.m mVar) {
        this.owner = mVar;
    }

    @Override // androidx.compose.ui.layout.o.a, com.google.inputmethod.f43
    public float getDensity() {
        return this.owner.getDensity().getDensity();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.o.a
    /* JADX INFO: renamed from: m */
    public LayoutDirection getParentLayoutDirection() {
        return this.owner.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.o.a
    /* JADX INFO: renamed from: r */
    public int getParentWidth() {
        return this.owner.getRoot().I0();
    }

    @Override // androidx.compose.ui.layout.o.a
    public kn6 v() {
        return this.owner.getRoot().x0();
    }

    @Override // androidx.compose.ui.layout.o.a, com.google.inputmethod.hm4
    /* JADX INFO: renamed from: w2 */
    public float getFontScale() {
        return this.owner.getDensity().getFontScale();
    }
}
