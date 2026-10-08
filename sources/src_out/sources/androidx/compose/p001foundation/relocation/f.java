package androidx.compose.p001foundation.relocation;

import androidx.compose.ui.b;
import com.google.inputmethod.cu0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/relocation/f;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/cu0;", "requester", "<init>", "(Lcom/google/android/cu0;)V", "", "m3", "()V", "V2", "n3", "W2", "p", "Lcom/google/android/cu0;", "", "q", "Z", "Q2", "()Z", "shouldAutoInvalidate", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends b.c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private cu0 requester;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    public f(cu0 cu0Var) {
        this.requester = cu0Var;
    }

    private final void m3() {
        cu0 cu0Var = this.requester;
        if (cu0Var instanceof BringIntoViewRequesterImpl) {
            Intrinsics.h(cu0Var, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((BringIntoViewRequesterImpl) cu0Var).e().s(this);
        }
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        n3(this.requester);
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        m3();
    }

    public final void n3(cu0 requester) {
        m3();
        if (requester instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) requester).e().c(this);
        }
        this.requester = requester;
    }
}
