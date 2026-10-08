package androidx.compose.p000animation;

import com.google.inputmethod.LookaheadAnimationVisualDebugConfig;
import com.google.inputmethod.ei1;
import com.google.inputmethod.fs1;
import com.google.inputmethod.ks9;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\"'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008@X\u0080\u0084\u0002¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005\"'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00008@X\u0080\u0084\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0003\u0012\u0004\b\n\u0010\u0007\u001a\u0004\b\u0002\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/google/android/ks9;", "Lcom/google/android/ra7;", "a", "Lkotlin/Lazy;", "b", "()Lcom/google/android/ks9;", "getLocalLookaheadAnimationVisualDebugConfig$annotations", "()V", "LocalLookaheadAnimationVisualDebugConfig", "Lcom/google/android/ei1;", "getLocalLookaheadAnimationVisualDebugColor$annotations", "LocalLookaheadAnimationVisualDebugColor", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CompositionLocalsKt {
    private static final Lazy a = c.b(new Function0<ks9<LookaheadAnimationVisualDebugConfig>>() { // from class: androidx.compose.animation.CompositionLocalsKt$LocalLookaheadAnimationVisualDebugConfig$2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ks9<LookaheadAnimationVisualDebugConfig> invoke() {
            return fs1.j(new Function0<LookaheadAnimationVisualDebugConfig>() { // from class: androidx.compose.animation.CompositionLocalsKt$LocalLookaheadAnimationVisualDebugConfig$2.1
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final LookaheadAnimationVisualDebugConfig invoke() {
                    return new LookaheadAnimationVisualDebugConfig(false, 0L, 0L, 0L, false, 30, null);
                }
            });
        }
    });
    private static final Lazy b = c.b(new Function0<ks9<ei1>>() { // from class: androidx.compose.animation.CompositionLocalsKt$LocalLookaheadAnimationVisualDebugColor$2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ks9<ei1> invoke() {
            return fs1.j(new Function0<ei1>() { // from class: androidx.compose.animation.CompositionLocalsKt$LocalLookaheadAnimationVisualDebugColor$2.1
                public final long b() {
                    return ei1.INSTANCE.i();
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    return ei1.l(b());
                }
            });
        }
    });

    public static final ks9<ei1> a() {
        return (ks9) b.getValue();
    }

    public static final ks9<LookaheadAnimationVisualDebugConfig> b() {
        return (ks9) a.getValue();
    }
}
