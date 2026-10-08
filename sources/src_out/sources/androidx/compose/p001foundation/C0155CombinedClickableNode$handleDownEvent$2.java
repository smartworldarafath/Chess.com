package androidx.compose.p001foundation;

import androidx.compose.ui.platform.CompositionLocalsKt;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.c65;
import com.google.inputmethod.cs1;
import com.google.inputmethod.e65;
import com.google.inputmethod.p7e;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.s;

/* JADX INFO: renamed from: androidx.compose.foundation.CombinedClickableNode$handleDownEvent$2, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.CombinedClickableNode$handleDownEvent$2", f = "Clickable.kt", l = {1318}, m = "invokeSuspend", v = 1)
final class C0155CombinedClickableNode$handleDownEvent$2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    int label;
    final /* synthetic */ CombinedClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0155CombinedClickableNode$handleDownEvent$2(CombinedClickableNode combinedClickableNode, q22<? super C0155CombinedClickableNode$handleDownEvent$2> q22Var) {
        super(2, q22Var);
        this.this$0 = combinedClickableNode;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0155CombinedClickableNode$handleDownEvent$2(this.this$0, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            long jF = ((p7e) cs1.a(this.this$0, CompositionLocalsKt.u())).f();
            this.label = 1;
            if (DelayKt.b(jF, this) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        Function0 function0 = this.this$0.onLongClick;
        if (function0 != null) {
            function0.invoke();
        }
        if (this.this$0.getHapticFeedbackEnabled()) {
            ((c65) cs1.a(this.this$0, CompositionLocalsKt.k())).a(e65.INSTANCE.f());
        }
        this.this$0.indirectLongPressTriggered = true;
        s sVar = this.this$0.indirectTapJob;
        if (sVar != null) {
            s.a.a(sVar, (CancellationException) null, 1, (Object) null);
        }
        this.this$0.indirectTapJob = null;
        this.this$0.indirectLongPressJob = null;
        return Unit.a;
    }
}
