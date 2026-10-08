package androidx.compose.p002material3;

import androidx.compose.p004runtime.d;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.material3.k0, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u001c\u0010\b\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\fR-\u0010\b\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/k0;", "T", "", "key", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Landroidx/compose/material3/FadeInFadeOutTransition;", "transition", "<init>", "(Ljava/lang/Object;Lcom/google/android/ps4;)V", "a", "()Ljava/lang/Object;", "b", "()Lcom/google/android/ps4;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "c", "Lcom/google/android/ps4;", "getTransition", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class FadeInFadeOutAnimationItem<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final T key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final ps4<Function2<? super d, ? super Integer, Unit>, d, Integer, Unit> transition;

    public FadeInFadeOutAnimationItem(T t, ps4<? super Function2<? super d, ? super Integer, Unit>, ? super d, ? super Integer, Unit> ps4Var) {
        this.key = t;
        this.transition = ps4Var;
    }

    public final T a() {
        return this.key;
    }

    public final ps4<Function2<? super d, ? super Integer, Unit>, d, Integer, Unit> b() {
        return this.transition;
    }

    public final T c() {
        return this.key;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) other;
        return Intrinsics.e(this.key, fadeInFadeOutAnimationItem.key) && Intrinsics.e(this.transition, fadeInFadeOutAnimationItem.transition);
    }

    public int hashCode() {
        T t = this.key;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.transition.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }
}
