package androidx.compose.p002material3;

import com.google.android.ai4;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.ui4;
import com.google.inputmethod.bo6;
import com.google.inputmethod.i26;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: androidx.compose.material3.ThumbNode$onAttach$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.ThumbNode$onAttach$1", f = "Switch.kt", l = {227}, m = "invokeSuspend")
final class C0208ThumbNode$onAttach$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    int label;
    final /* synthetic */ ThumbNode this$0;

    /* JADX INFO: renamed from: androidx.compose.material3.ThumbNode$onAttach$1$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a<T> implements ui4 {
        final /* synthetic */ Ref.IntRef a;
        final /* synthetic */ ThumbNode b;

        a(Ref.IntRef intRef, ThumbNode thumbNode) {
            this.a = intRef;
            this.b = thumbNode;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(i26 i26Var, q22<? super Unit> q22Var) {
            if (i26Var instanceof androidx.compose.foundation.interaction.a.b) {
                this.a.element++;
            } else if (i26Var instanceof androidx.compose.foundation.interaction.a.c) {
                this.a.element--;
            } else if (i26Var instanceof androidx.compose.p001foundation.interaction.a.C0016a) {
                this.a.element--;
            }
            boolean z = this.a.element > 0;
            if (this.b.isPressed != z) {
                this.b.isPressed = z;
                bo6.b(this.b);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0208ThumbNode$onAttach$1(ThumbNode thumbNode, q22<? super C0208ThumbNode$onAttach$1> q22Var) {
        super(2, q22Var);
        this.this$0 = thumbNode;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0208ThumbNode$onAttach$1(this.this$0, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Ref.IntRef intRef = new Ref.IntRef();
            ai4<i26> ai4VarC = this.this$0.getInteractionSource().c();
            a aVar = new a(intRef, this.this$0);
            this.label = 1;
            if (ai4VarC.collect(aVar, this) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return Unit.a;
    }
}
