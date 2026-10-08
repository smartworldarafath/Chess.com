package androidx.compose.p001foundation.layout;

import com.google.inputmethod.ff3;
import com.google.inputmethod.uy7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/c1;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/layout/e1;", "Lcom/google/android/ff3;", "minWidth", "minHeight", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/layout/e1;", "node", "", "e", "(Landroidx/compose/foundation/layout/e1;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "F", "getMinWidth-D9Ej5fM", "()F", "getMinHeight-D9Ej5fM", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c1 extends uy7<e1> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float minWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float minHeight;

    public /* synthetic */ c1(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e1 a() {
        return new e1(this.minWidth, this.minHeight, null);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(e1 node) {
        node.p3(this.minWidth);
        node.o3(this.minHeight);
    }

    public boolean equals(Object other) {
        if (!(other instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) other;
        return ff3.k(this.minWidth, c1Var.minWidth) && ff3.k(this.minHeight, c1Var.minHeight);
    }

    public int hashCode() {
        return (ff3.l(this.minWidth) * 31) + ff3.l(this.minHeight);
    }

    private c1(float f, float f2) {
        this.minWidth = f;
        this.minHeight = f2;
    }
}
