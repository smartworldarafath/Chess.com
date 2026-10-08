package androidx.compose.p001foundation.lazy.layout;

import com.google.inputmethod.AnimationState;
import com.google.inputmethod.qr;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "", "itemOffset", "Lcom/google/android/nr;", "", "Lcom/google/android/qr;", "previousAnimation", "<init>", "(ILcom/google/android/nr;)V", "I", "a", "()I", "Lcom/google/android/nr;", "b", "()Lcom/google/android/nr;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ItemFoundInScroll extends CancellationException {
    private final int itemOffset;
    private final AnimationState<Float, qr> previousAnimation;

    public ItemFoundInScroll(int i, AnimationState<Float, qr> animationState) {
        this.itemOffset = i;
        this.previousAnimation = animationState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getItemOffset() {
        return this.itemOffset;
    }

    public final AnimationState<Float, qr> b() {
        return this.previousAnimation;
    }
}
