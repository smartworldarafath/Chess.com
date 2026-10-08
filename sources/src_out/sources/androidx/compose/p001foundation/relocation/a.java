package androidx.compose.p001foundation.relocation;

import com.google.inputmethod.cu0;
import com.google.inputmethod.uy7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/relocation/a;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/relocation/f;", "Lcom/google/android/cu0;", "requester", "<init>", "(Lcom/google/android/cu0;)V", "d", "()Landroidx/compose/foundation/relocation/f;", "node", "", "e", "(Landroidx/compose/foundation/relocation/f;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/android/cu0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a extends uy7<f> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final cu0 requester;

    public a(cu0 cu0Var) {
        this.requester = cu0Var;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public f a() {
        return new f(this.requester);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(f node) {
        node.n3(this.requester);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof a) && Intrinsics.e(this.requester, ((a) other).requester);
        }
        return true;
    }

    public int hashCode() {
        return this.requester.hashCode();
    }
}
