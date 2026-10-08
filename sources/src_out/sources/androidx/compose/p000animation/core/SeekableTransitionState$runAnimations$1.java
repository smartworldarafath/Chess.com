package androidx.compose.p000animation.core;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@lq2(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {361, 364}, m = "runAnimations", v = 1)
final class SeekableTransitionState$runAnimations$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SeekableTransitionState<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeekableTransitionState$runAnimations$1(SeekableTransitionState<S> seekableTransitionState, q22<? super SeekableTransitionState$runAnimations$1> q22Var) {
        super(q22Var);
        this.this$0 = seekableTransitionState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= t04.INVALID_ID;
        return this.this$0.Q(this);
    }
}
