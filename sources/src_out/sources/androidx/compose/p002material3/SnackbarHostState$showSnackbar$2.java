package androidx.compose.p002material3;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@lq2(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", l = {428, 431}, m = "showSnackbar")
final class SnackbarHostState$showSnackbar$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnackbarHostState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnackbarHostState$showSnackbar$2(SnackbarHostState snackbarHostState, q22<? super SnackbarHostState$showSnackbar$2> q22Var) {
        super(q22Var);
        this.this$0 = snackbarHostState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= t04.INVALID_ID;
        return this.this$0.d(null, this);
    }
}
