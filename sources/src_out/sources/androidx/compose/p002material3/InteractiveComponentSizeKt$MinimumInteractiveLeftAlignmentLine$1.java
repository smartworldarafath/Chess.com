package androidx.compose.p002material3;

import com.google.android.sh7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class InteractiveComponentSizeKt$MinimumInteractiveLeftAlignmentLine$1 extends FunctionReferenceImpl implements Function2<Integer, Integer, Integer> {
    public static final InteractiveComponentSizeKt$MinimumInteractiveLeftAlignmentLine$1 a = new InteractiveComponentSizeKt$MinimumInteractiveLeftAlignmentLine$1();

    InteractiveComponentSizeKt$MinimumInteractiveLeftAlignmentLine$1() {
        super(2, sh7.class, "min", "min(II)I", 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m(((Number) obj).intValue(), ((Number) obj2).intValue());
    }

    public final Integer m(int i, int i2) {
        return Integer.valueOf(Math.min(i, i2));
    }
}
