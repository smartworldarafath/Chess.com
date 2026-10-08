package androidx.compose.p000animation;

import androidx.compose.p000animation.AnimateBoundsModifierKt;
import androidx.compose.ui.b;
import com.google.inputmethod.ct0;
import com.google.inputmethod.gba;
import com.google.inputmethod.it0;
import com.google.inputmethod.kce;
import com.google.inputmethod.kx1;
import com.google.inputmethod.lr;
import com.google.inputmethod.q16;
import com.google.inputmethod.wa7;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a7\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/wa7;", "lookaheadScope", "modifier", "Lcom/google/android/it0;", "boundsTransform", "", "animateMotionFrameOfReference", "c", "(Landroidx/compose/ui/b;Lcom/google/android/wa7;Landroidx/compose/ui/b;Lcom/google/android/it0;Z)Landroidx/compose/ui/b;", "a", "Lcom/google/android/it0;", "DefaultBoundsTransform", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AnimateBoundsModifierKt {
    private static final it0 a = new it0() { // from class: com.google.android.rq
        @Override // com.google.inputmethod.it0
        public final xa4 a(gba gbaVar, gba gbaVar2) {
            return AnimateBoundsModifierKt.b(gbaVar, gbaVar2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final xa4 b(gba gbaVar, gba gbaVar2) {
        return lr.i(1.0f, 400.0f, kce.g(gba.INSTANCE));
    }

    public static final b c(b bVar, wa7 wa7Var, b bVar2, it0 it0Var, boolean z) {
        return bVar.then(new ct0(wa7Var, it0Var, new Function2<q16, kx1, kx1>() { // from class: androidx.compose.animation.AnimateBoundsModifierKt$animateBounds$1
            public final long a(long j, long j2) {
                return j2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return kx1.a(a(((q16) obj).getPackedValue(), ((kx1) obj2).getValue()));
            }
        }, z)).then(bVar2).then(new ct0(wa7Var, it0Var, new Function2<q16, kx1, kx1>() { // from class: androidx.compose.animation.AnimateBoundsModifierKt$animateBounds$2
            public final long a(long j, long j2) {
                return kx1.INSTANCE.c((int) (j >> 32), (int) (j & 4294967295L));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return kx1.a(a(((q16) obj).getPackedValue(), ((kx1) obj2).getValue()));
            }
        }, z));
    }

    public static /* synthetic */ b d(b bVar, wa7 wa7Var, b bVar2, it0 it0Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar2 = b.INSTANCE;
        }
        if ((i & 4) != 0) {
            it0Var = a;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return c(bVar, wa7Var, bVar2, it0Var, z);
    }
}
