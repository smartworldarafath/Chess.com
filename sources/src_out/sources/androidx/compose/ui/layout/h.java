package androidx.compose.ui.layout;

import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.kn6;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/layout/h;", "Landroidx/compose/ui/layout/o$a;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "within", "<init>", "(Landroidx/compose/ui/node/LookaheadCapablePlaceable;)V", "Landroidx/compose/ui/layout/s;", "", "defaultValue", "j", "(Landroidx/compose/ui/layout/s;F)F", "b", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "", "r", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "m", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "Lcom/google/android/kn6;", "v", "()Lcom/google/android/kn6;", "coordinates", "getDensity", "()F", "density", "w2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h extends o.a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LookaheadCapablePlaceable within;

    public h(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.within = lookaheadCapablePlaceable;
    }

    @Override // androidx.compose.ui.layout.o.a, com.google.inputmethod.f43
    public float getDensity() {
        return this.within.getDensity();
    }

    @Override // androidx.compose.ui.layout.o.a
    public float j(s sVar, float f) {
        return sVar.b() != null ? ((Number) sVar.b().invoke(this, Float.valueOf(f))).floatValue() : this.within.v1(sVar, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.o.a
    /* JADX INFO: renamed from: m */
    public LayoutDirection getParentLayoutDirection() {
        return this.within.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.o.a
    /* JADX INFO: renamed from: r */
    public int getParentWidth() {
        return this.within.J0();
    }

    @Override // androidx.compose.ui.layout.o.a
    public kn6 v() {
        kn6 kn6VarV = this.within.getIsPlacingForAlignment() ? null : this.within.v();
        if (kn6VarV == null) {
            this.within.getLayoutNode().getLayoutDelegate().H();
        }
        return kn6VarV;
    }

    @Override // androidx.compose.ui.layout.o.a, com.google.inputmethod.hm4
    /* JADX INFO: renamed from: w2 */
    public float getFontScale() {
        return this.within.getFontScale();
    }
}
