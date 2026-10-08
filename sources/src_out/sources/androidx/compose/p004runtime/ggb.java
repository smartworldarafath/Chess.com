package androidx.compose.p004runtime;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.lo6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/ggb;", "", "", "<anonymous>", "(Lcom/google/android/ggb;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", f = "PausableComposition.kt", l = {579}, m = "invokeSuspend", v = 1)
final class ggb extends RestrictedSuspendLambda implements Function2<com.google.android.ggb<? super String>, q22<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ComposePausableCompositionException this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ggb(ComposePausableCompositionException composePausableCompositionException, q22<? super ggb> q22Var) {
        super(2, q22Var);
        this.this$0 = composePausableCompositionException;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        ggb ggbVar = new ggb(this.this$0, q22Var);
        ggbVar.L$0 = obj;
        return ggbVar;
    }

    public final Object invoke(com.google.android.ggb<? super String> ggbVar, q22<? super Unit> q22Var) {
        return create(ggbVar, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        com.google.android.ggb ggbVar;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        Object objG = a.g();
        int i6 = this.label;
        if (i6 == 0) {
            f.b(obj);
            i = 0;
            ggbVar = (com.google.android.ggb) this.L$0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = this.I$2;
            int i8 = this.I$1;
            int i9 = this.I$0;
            ggbVar = (com.google.android.ggb) this.L$0;
            f.b(obj);
            i2 = i8;
            i3 = i7;
            i = i9;
        }
        while (i < Math.min(this.this$0.lastOperation + 10, this.this$0.operations._size)) {
            int i10 = i + 1;
            int iE = this.this$0.operations.e(i);
            switch (iE) {
                case 0:
                    str = "up";
                    break;
                case 1:
                    int i11 = i2 + 1;
                    str = "down " + this.this$0.instances.d(i2);
                    i2 = i11;
                    break;
                case 2:
                    str = "remove " + this.this$0.operations.e(i10) + ' ' + this.this$0.operations.e(i + 2);
                    i10 = i + 3;
                    break;
                case 3:
                    str = "move " + this.this$0.operations.e(i10) + ' ' + this.this$0.operations.e(i + 2) + ' ' + this.this$0.operations.e(i + 3);
                    i10 = i + 4;
                    break;
                case 4:
                    str = "clear";
                    break;
                case 5:
                    i4 = i + 2;
                    i5 = i2 + 1;
                    str = "insertBottomUp " + this.this$0.operations.e(i10) + ' ' + this.this$0.instances.d(i2);
                    i10 = i4;
                    i2 = i5;
                    break;
                case 6:
                    i4 = i + 2;
                    i5 = i2 + 1;
                    str = "insertTopDown " + this.this$0.operations.e(i10) + ' ' + this.this$0.instances.d(i2);
                    i10 = i4;
                    i2 = i5;
                    break;
                case 7:
                    Object objD = this.this$0.instances.d(i2);
                    Intrinsics.h(objD, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                    i2 += 2;
                    str = "apply " + ((Function2) kotlin.jvm.internal.a.f(objD, 2));
                    break;
                case 8:
                    str = "reuse " + this.this$0.reused.d(i3);
                    i3++;
                    break;
                case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                    str = "recompose pending";
                    break;
                default:
                    str = "unknown op: " + iE;
                    break;
            }
            String str2 = i + ": " + str;
            this.L$0 = ggbVar;
            this.I$0 = i10;
            this.I$1 = i2;
            this.I$2 = i3;
            this.label = 1;
            if (ggbVar.a(str2, this) == objG) {
                return objG;
            }
            i = i10;
        }
        return Unit.a;
    }
}
