package androidx.compose.p001foundation.text.contextmenu.provider;

import com.google.android.lq2;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@lq2(c = "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2", f = "BasicTextContextMenuProvider.kt", l = {130}, m = "invokeSuspend", v = 1)
final class BasicTextContextMenuProvider$showTextContextMenu$2 extends SuspendLambda implements Function1<q22<? super Unit>, Object> {
    final /* synthetic */ BasicTextContextMenuProvider.a $localSession;
    int label;
    final /* synthetic */ BasicTextContextMenuProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicTextContextMenuProvider$showTextContextMenu$2(BasicTextContextMenuProvider basicTextContextMenuProvider, BasicTextContextMenuProvider.a aVar, q22<? super BasicTextContextMenuProvider$showTextContextMenu$2> q22Var) {
        super(1, q22Var);
        this.this$0 = basicTextContextMenuProvider;
        this.$localSession = aVar;
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new BasicTextContextMenuProvider$showTextContextMenu$2(this.this$0, this.$localSession, q22Var);
    }

    public final Object invoke(q22<? super Unit> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                this.this$0.j(this.$localSession);
                BasicTextContextMenuProvider.a aVar = this.$localSession;
                this.label = 1;
                if (aVar.a(this) == objG) {
                    return objG;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            this.this$0.j(null);
            return Unit.a;
        } catch (Throwable th) {
            this.this$0.j(null);
            throw th;
        }
    }
}
