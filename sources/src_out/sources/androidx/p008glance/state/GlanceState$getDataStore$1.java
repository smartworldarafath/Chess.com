package androidx.p008glance.state;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@lq2(c = "androidx.glance.state.GlanceState", f = "GlanceStateDefinition.kt", l = {181, 142}, m = "getDataStore")
final class GlanceState$getDataStore$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GlanceState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlanceState$getDataStore$1(GlanceState glanceState, q22<? super GlanceState$getDataStore$1> q22Var) {
        super(q22Var);
        this.this$0 = glanceState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= t04.INVALID_ID;
        return this.this$0.d(null, null, null, this);
    }
}
