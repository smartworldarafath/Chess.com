package androidx.compose.p000animation;

import androidx.compose.ui.graphics.colorspace.c;
import androidx.compose.ui.graphics.colorspace.e;
import com.google.inputmethod.ei1;
import com.google.inputmethod.ki1;
import com.google.inputmethod.tjd;
import com.google.inputmethod.tr;
import com.google.inputmethod.w2e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\",\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"-\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0000*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/graphics/colorspace/c;", "Lcom/google/android/tjd;", "Lcom/google/android/ei1;", "Lcom/google/android/tr;", "a", "Lkotlin/jvm/functions/Function1;", "ColorToVector", "Lcom/google/android/ei1$a;", "(Lcom/google/android/ei1$a;)Lkotlin/jvm/functions/Function1;", "VectorConverter", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ColorVectorConverterKt {
    private static final Function1<c, tjd<ei1, tr>> a = new Function1<c, tjd<ei1, tr>>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final tjd<ei1, tr> invoke(final c cVar) {
            return w2e.K(new Function1<ei1, tr>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
                public final tr a(long j) {
                    long jN = ei1.n(j, e.a.D());
                    return new tr(ei1.s(jN), ei1.w(jN), ei1.v(jN), ei1.t(jN));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return a(((ei1) obj).getValue());
                }
            }, new Function1<tr, ei1>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
                {
                    super(1);
                }

                public final long a(tr trVar) {
                    float v2 = trVar.getV2();
                    if (v2 < 0.0f) {
                        v2 = 0.0f;
                    }
                    if (v2 > 1.0f) {
                        v2 = 1.0f;
                    }
                    float v3 = trVar.getV3();
                    if (v3 < -0.5f) {
                        v3 = -0.5f;
                    }
                    if (v3 > 0.5f) {
                        v3 = 0.5f;
                    }
                    float v4 = trVar.getV4();
                    float f = v4 >= -0.5f ? v4 : -0.5f;
                    float f2 = f <= 0.5f ? f : 0.5f;
                    float v1 = trVar.getV1();
                    float f3 = v1 >= 0.0f ? v1 : 0.0f;
                    return ei1.n(ki1.a(v2, v3, f2, f3 <= 1.0f ? f3 : 1.0f, e.a.D()), cVar);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return ei1.l(a((tr) obj));
                }
            });
        }
    };

    public static final Function1<c, tjd<ei1, tr>> a(ei1.Companion companion) {
        return a;
    }
}
