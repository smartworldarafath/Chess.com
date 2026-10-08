package androidx.compose.p001foundation;

import androidx.compose.p001foundation.interaction.a;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.le1;
import com.google.inputmethod.r48;
import com.google.inputmethod.up1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: renamed from: androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", l = {2239, 2242}, m = "invokeSuspend", v = 1)
final class C0138AbstractClickableNode$handlePressInteraction$2$1$delayJob$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ r48 $interactionSource;
    final /* synthetic */ long $offset;
    Object L$0;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0138AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(AbstractClickableNode abstractClickableNode, long j, r48 r48Var, q22<? super C0138AbstractClickableNode$handlePressInteraction$2$1$delayJob$1> q22Var) {
        super(2, q22Var);
        this.this$0 = abstractClickableNode;
        this.$offset = j;
        this.$interactionSource = r48Var;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0138AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.this$0, this.$offset, this.$interactionSource, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        a.b bVar;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            if (up1.isDelayPressesUsingGestureConsumptionEnabled ? this.this$0.I3(null) : this.this$0.H3()) {
                long jA = le1.a();
                this.label = 1;
                if (DelayKt.b(jA, this) != objG) {
                }
            }
            return objG;
        }
        if (i == 1) {
            f.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (a.b) this.L$0;
            f.b(obj);
        }
        this.this$0.pressInteraction = bVar;
        return Unit.a;
        a.b bVar2 = new a.b(this.$offset, null);
        r48 r48Var = this.$interactionSource;
        this.L$0 = bVar2;
        this.label = 2;
        if (r48Var.a(bVar2, this) != objG) {
            bVar = bVar2;
            this.this$0.pressInteraction = bVar;
            return Unit.a;
        }
        return objG;
    }
}
