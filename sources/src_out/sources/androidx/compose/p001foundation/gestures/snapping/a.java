package androidx.compose.p001foundation.gestures.snapping;

import com.google.inputmethod.AnimationState;
import com.google.inputmethod.ur;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B#\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u000bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/a;", "T", "Lcom/google/android/ur;", "V", "", "remainingOffset", "Lcom/google/android/nr;", "currentAnimationState", "<init>", "(Ljava/lang/Object;Lcom/google/android/nr;)V", "a", "()Ljava/lang/Object;", "b", "()Lcom/google/android/nr;", "Ljava/lang/Object;", "getRemainingOffset", "Lcom/google/android/nr;", "c", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a<T, V extends ur> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final T remainingOffset;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AnimationState<T, V> currentAnimationState;

    public a(T t, AnimationState<T, V> animationState) {
        this.remainingOffset = t;
        this.currentAnimationState = animationState;
    }

    public final T a() {
        return this.remainingOffset;
    }

    public final AnimationState<T, V> b() {
        return this.currentAnimationState;
    }

    public final AnimationState<T, V> c() {
        return this.currentAnimationState;
    }
}
