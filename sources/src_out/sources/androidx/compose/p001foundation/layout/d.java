package androidx.compose.p001foundation.layout;

import com.google.inputmethod.jz5;
import com.google.inputmethod.uy7;
import com.google.inputmethod.xw5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/d;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/layout/f;", "", "aspectRatio", "", "matchHeightConstraintsFirst", "Lkotlin/Function1;", "Lcom/google/android/jz5;", "", "inspectorInfo", "<init>", "(FZLkotlin/jvm/functions/Function1;)V", "d", "()Landroidx/compose/foundation/layout/f;", "node", "e", "(Landroidx/compose/foundation/layout/f;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "F", "getAspectRatio", "()F", "Z", "getMatchHeightConstraintsFirst", "()Z", "f", "Lkotlin/jvm/functions/Function1;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d extends uy7<f> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float aspectRatio;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean matchHeightConstraintsFirst;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Function1<jz5, Unit> inspectorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public d(float f, boolean z, Function1<? super jz5, Unit> function1) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
        this.inspectorInfo = function1;
        if (f > 0.0f) {
            return;
        }
        xw5.a("aspectRatio " + f + " must be > 0");
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public f a() {
        return new f(this.aspectRatio, this.matchHeightConstraintsFirst);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(f node) {
        node.p3(this.aspectRatio);
        node.q3(this.matchHeightConstraintsFirst);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        d dVar = other instanceof d ? (d) other : null;
        return dVar != null && this.aspectRatio == dVar.aspectRatio && this.matchHeightConstraintsFirst == ((d) other).matchHeightConstraintsFirst;
    }

    public int hashCode() {
        return (Float.hashCode(this.aspectRatio) * 31) + Boolean.hashCode(this.matchHeightConstraintsFirst);
    }
}
