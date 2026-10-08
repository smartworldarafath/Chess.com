package androidx.compose.p000animation;

import com.google.inputmethod.jtb;
import com.google.inputmethod.q16;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00062\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R/\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/animation/i;", "Lcom/google/android/jtb;", "", "clip", "Lkotlin/Function2;", "Lcom/google/android/q16;", "Lcom/google/android/xa4;", "sizeAnimationSpec", "<init>", "(ZLkotlin/jvm/functions/Function2;)V", "initialSize", "targetSize", "a", "(JJ)Lcom/google/android/xa4;", "Z", "b", "()Z", "Lkotlin/jvm/functions/Function2;", "getSizeAnimationSpec", "()Lkotlin/jvm/functions/Function2;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i implements jtb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean clip;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function2<q16, q16, xa4<q16>> sizeAnimationSpec;

    /* JADX WARN: Multi-variable type inference failed */
    public i(boolean z, Function2<? super q16, ? super q16, ? extends xa4<q16>> function2) {
        this.clip = z;
        this.sizeAnimationSpec = function2;
    }

    @Override // com.google.inputmethod.jtb
    public xa4<q16> a(long initialSize, long targetSize) {
        return (xa4) this.sizeAnimationSpec.invoke(q16.b(initialSize), q16.b(targetSize));
    }

    @Override // com.google.inputmethod.jtb
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }
}
