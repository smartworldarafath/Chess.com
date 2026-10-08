package androidx.compose.ui.text.font;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.wa9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {315}, m = "invokeSuspend", v = 1)
final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends SuspendLambda implements Function2<ta2, q22<? super Object>, Object> {
    final /* synthetic */ k $this_loadWithTimeoutOrNull;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$loadWithTimeoutOrNull$2(AsyncFontListLoader asyncFontListLoader, k kVar, q22<? super AsyncFontListLoader$loadWithTimeoutOrNull$2> q22Var) {
        super(2, q22Var);
        this.this$0 = asyncFontListLoader;
        this.$this_loadWithTimeoutOrNull = kVar;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.this$0, this.$this_loadWithTimeoutOrNull, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<Object> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
            return obj;
        }
        kotlin.f.b(obj);
        wa9 wa9Var = this.this$0.platformFontLoader;
        k kVar = this.$this_loadWithTimeoutOrNull;
        this.label = 1;
        Object objB = wa9Var.b(kVar, this);
        return objB == objG ? objG : objB;
    }
}
