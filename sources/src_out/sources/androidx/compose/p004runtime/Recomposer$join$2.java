package androidx.compose.p004runtime;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ut0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@lq2(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend", v = 1)
final class Recomposer$join$2 extends SuspendLambda implements Function2<Recomposer.State, q22<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    Recomposer$join$2(q22<? super Recomposer$join$2> q22Var) {
        super(2, q22Var);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Recomposer.State state, q22<? super Boolean> q22Var) {
        return create(state, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(q22Var);
        recomposer$join$2.L$0 = obj;
        return recomposer$join$2;
    }

    public final Object invokeSuspend(Object obj) {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return ut0.a(((Recomposer.State) this.L$0) == Recomposer.State.ShutDown);
    }
}
