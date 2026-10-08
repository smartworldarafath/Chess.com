package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.semantics.SemanticsProperties;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.inputmethod.ScrollAxisRange;
import com.google.inputmethod.rn8;
import com.google.inputmethod.zw5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "delta"}, k = 3, mv = {2, 1, 0}, xi = 48)
@lq2(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {89}, m = "invokeSuspend", v = 1)
final class ComposeScrollCaptureCallback$scrollTracker$1 extends SuspendLambda implements Function2<Float, q22<? super Float>, Object> {
    /* synthetic */ float F$0;
    boolean Z$0;
    int label;
    final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposeScrollCaptureCallback$scrollTracker$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, q22<? super ComposeScrollCaptureCallback$scrollTracker$1> q22Var) {
        super(2, q22Var);
        this.this$0 = composeScrollCaptureCallback;
    }

    public final Object a(float f, q22<? super Float> q22Var) {
        return create(Float.valueOf(f), q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.this$0, q22Var);
        composeScrollCaptureCallback$scrollTracker$1.F$0 = ((Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((Number) obj).floatValue(), (q22) obj2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        boolean z;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            float f = this.F$0;
            Function2<rn8, q22<? super rn8>, Object> function2C = c.c(this.this$0.node);
            if (function2C == null) {
                zw5.d("Required value was null.");
                throw new KotlinNothingValueException();
            }
            boolean reverseScrolling = ((ScrollAxisRange) this.this$0.node.getUnmergedConfig().i(SemanticsProperties.a.S())).getReverseScrolling();
            if (reverseScrolling) {
                f = -f;
            }
            rn8 rn8VarD = rn8.d(rn8.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L)));
            this.Z$0 = reverseScrolling;
            this.label = 1;
            obj = function2C.invoke(rn8VarD, this);
            if (obj == objG) {
                return objG;
            }
            z = reverseScrolling;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            f.b(obj);
        }
        long packedValue = ((rn8) obj).getPackedValue();
        return ut0.d(z ? -Float.intBitsToFloat((int) (packedValue & 4294967295L)) : Float.intBitsToFloat((int) (packedValue & 4294967295L)));
    }
}
