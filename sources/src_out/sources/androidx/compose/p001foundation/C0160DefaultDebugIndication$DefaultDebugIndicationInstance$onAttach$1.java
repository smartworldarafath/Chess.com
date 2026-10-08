package androidx.compose.p001foundation;

import com.google.android.ai4;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.ui4;
import com.google.inputmethod.i26;
import com.google.inputmethod.lk4;
import com.google.inputmethod.mk4;
import com.google.inputmethod.yf5;
import com.google.inputmethod.zf5;
import com.google.inputmethod.zg3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", l = {228}, m = "invokeSuspend", v = 1)
final class C0160DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    int label;
    final /* synthetic */ DefaultDebugIndication.DefaultDebugIndicationInstance this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1$a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<T> implements ui4 {
        final /* synthetic */ Ref.IntRef a;
        final /* synthetic */ Ref.IntRef b;
        final /* synthetic */ Ref.IntRef c;
        final /* synthetic */ DefaultDebugIndication.DefaultDebugIndicationInstance d;

        a(Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3, DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance) {
            this.a = intRef;
            this.b = intRef2;
            this.c = intRef3;
            this.d = defaultDebugIndicationInstance;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(i26 i26Var, q22<? super Unit> q22Var) {
            boolean z = true;
            if (i26Var instanceof androidx.compose.foundation.interaction.a.b) {
                this.a.element++;
            } else if (i26Var instanceof androidx.compose.foundation.interaction.a.c) {
                this.a.element--;
            } else if (i26Var instanceof androidx.compose.p001foundation.interaction.a.C0016a) {
                this.a.element--;
            } else if (i26Var instanceof yf5) {
                this.b.element++;
            } else if (i26Var instanceof zf5) {
                this.b.element--;
            } else if (i26Var instanceof lk4) {
                this.c.element++;
            } else if (i26Var instanceof mk4) {
                this.c.element--;
            }
            boolean z2 = false;
            boolean z3 = this.a.element > 0;
            boolean z4 = this.b.element > 0;
            boolean z5 = this.c.element > 0;
            if (this.d.isPressed != z3) {
                this.d.isPressed = z3;
                z2 = true;
            }
            if (this.d.isHovered != z4) {
                this.d.isHovered = z4;
                z2 = true;
            }
            if (this.d.isFocused != z5) {
                this.d.isFocused = z5;
            } else {
                z = z2;
            }
            if (z) {
                zg3.a(this.d);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0160DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance, q22<? super C0160DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1> q22Var) {
        super(2, q22Var);
        this.this$0 = defaultDebugIndicationInstance;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0160DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this.this$0, q22Var);
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
            Ref.IntRef intRef2 = new Ref.IntRef();
            Ref.IntRef intRef3 = new Ref.IntRef();
            ai4<i26> ai4VarC = this.this$0.interactionSource.c();
            a aVar = new a(intRef, intRef2, intRef3, this.this$0);
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
