package androidx.compose.p001foundation.interaction;

import com.google.android.ai4;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.ui4;
import com.google.android.ut0;
import com.google.inputmethod.i26;
import com.google.inputmethod.j26;
import com.google.inputmethod.lk4;
import com.google.inputmethod.mk4;
import com.google.inputmethod.o58;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", f = "FocusInteraction.kt", l = {68}, m = "invokeSuspend", v = 1)
final class FocusInteractionKt$collectIsFocusedAsState$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ o58<Boolean> $isFocused;
    final /* synthetic */ j26 $this_collectIsFocusedAsState;
    int label;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<T> implements ui4 {
        final /* synthetic */ List<lk4> a;
        final /* synthetic */ o58<Boolean> b;

        a(List<lk4> list, o58<Boolean> o58Var) {
            this.a = list;
            this.b = o58Var;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(i26 i26Var, q22<? super Unit> q22Var) {
            if (i26Var instanceof lk4) {
                this.a.add(i26Var);
            } else if (i26Var instanceof mk4) {
                this.a.remove(((mk4) i26Var).getFocus());
            }
            this.b.setValue(ut0.a(!this.a.isEmpty()));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FocusInteractionKt$collectIsFocusedAsState$1$1(j26 j26Var, o58<Boolean> o58Var, q22<? super FocusInteractionKt$collectIsFocusedAsState$1$1> q22Var) {
        super(2, q22Var);
        this.$this_collectIsFocusedAsState = j26Var;
        this.$isFocused = o58Var;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new FocusInteractionKt$collectIsFocusedAsState$1$1(this.$this_collectIsFocusedAsState, this.$isFocused, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ArrayList arrayList = new ArrayList();
            ai4<i26> ai4VarC = this.$this_collectIsFocusedAsState.c();
            a aVar = new a(arrayList, this.$isFocused);
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
