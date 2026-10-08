package androidx.compose.p002material3;

import androidx.compose.p004runtime.snapshots.SnapshotStateList;
import com.google.android.ai4;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.ui4;
import com.google.inputmethod.ag3;
import com.google.inputmethod.i26;
import com.google.inputmethod.j26;
import com.google.inputmethod.lk4;
import com.google.inputmethod.mk4;
import com.google.inputmethod.yf3;
import com.google.inputmethod.yf5;
import com.google.inputmethod.zf3;
import com.google.inputmethod.zf5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.material3.CardElevation$animateElevation$1$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.CardElevation$animateElevation$1$1", f = "Card.kt", l = {670}, m = "invokeSuspend")
final class C0167CardElevation$animateElevation$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ j26 $interactionSource;
    final /* synthetic */ SnapshotStateList<i26> $interactions;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.CardElevation$animateElevation$1$1$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a<T> implements ui4 {
        final /* synthetic */ SnapshotStateList<i26> a;

        a(SnapshotStateList<i26> snapshotStateList) {
            this.a = snapshotStateList;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(i26 i26Var, q22<? super Unit> q22Var) {
            if (i26Var instanceof yf5) {
                this.a.add(i26Var);
            } else if (i26Var instanceof zf5) {
                this.a.remove(((zf5) i26Var).getEnter());
            } else if (i26Var instanceof lk4) {
                this.a.add(i26Var);
            } else if (i26Var instanceof mk4) {
                this.a.remove(((mk4) i26Var).getFocus());
            } else if (i26Var instanceof androidx.compose.foundation.interaction.a.b) {
                this.a.add(i26Var);
            } else if (i26Var instanceof androidx.compose.foundation.interaction.a.c) {
                this.a.remove(((androidx.compose.foundation.interaction.a.c) i26Var).getPress());
            } else if (i26Var instanceof androidx.compose.p001foundation.interaction.a.C0016a) {
                this.a.remove(((androidx.compose.p001foundation.interaction.a.C0016a) i26Var).getPress());
            } else if (i26Var instanceof zf3) {
                this.a.add(i26Var);
            } else if (i26Var instanceof ag3) {
                this.a.remove(((ag3) i26Var).getStart());
            } else if (i26Var instanceof yf3) {
                this.a.remove(((yf3) i26Var).getStart());
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0167CardElevation$animateElevation$1$1(j26 j26Var, SnapshotStateList<i26> snapshotStateList, q22<? super C0167CardElevation$animateElevation$1$1> q22Var) {
        super(2, q22Var);
        this.$interactionSource = j26Var;
        this.$interactions = snapshotStateList;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0167CardElevation$animateElevation$1$1(this.$interactionSource, this.$interactions, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ai4<i26> ai4VarC = this.$interactionSource.c();
            a aVar = new a(this.$interactions);
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
