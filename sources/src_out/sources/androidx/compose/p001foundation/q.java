package androidx.compose.p001foundation;

import com.google.inputmethod.av5;
import com.google.inputmethod.j26;
import com.google.inputmethod.uy7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/q;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/r;", "Lcom/google/android/j26;", "interactionSource", "Lcom/google/android/av5;", "indication", "<init>", "(Lcom/google/android/j26;Lcom/google/android/av5;)V", "d", "()Landroidx/compose/foundation/r;", "node", "", "e", "(Landroidx/compose/foundation/r;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/android/j26;", "Lcom/google/android/av5;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class q extends uy7<r> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final j26 interactionSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final av5 indication;

    public q(j26 j26Var, av5 av5Var) {
        this.interactionSource = j26Var;
        this.indication = av5Var;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public r a() {
        return new r(this.indication.b(this.interactionSource));
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(r node) {
        node.s3(this.indication.b(this.interactionSource));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof q)) {
            return false;
        }
        q qVar = (q) other;
        return Intrinsics.e(this.interactionSource, qVar.interactionSource) && Intrinsics.e(this.indication, qVar.indication);
    }

    public int hashCode() {
        return (this.interactionSource.hashCode() * 31) + this.indication.hashCode();
    }
}
