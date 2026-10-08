package androidx.compose.ui.text.font;

import com.google.android.lq2;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@lq2(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {282}, m = "invokeSuspend", v = 1)
final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements Function1<q22<? super Object>, Object> {
    final /* synthetic */ k $font;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, k kVar, q22<? super AsyncFontListLoader$load$2$typeface$1> q22Var) {
        super(1, q22Var);
        this.this$0 = asyncFontListLoader;
        this.$font = kVar;
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new AsyncFontListLoader$load$2$typeface$1(this.this$0, this.$font, q22Var);
    }

    public final Object invoke(q22<Object> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
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
        AsyncFontListLoader asyncFontListLoader = this.this$0;
        k kVar = this.$font;
        this.label = 1;
        Object objQ = asyncFontListLoader.q(kVar, this);
        return objQ == objG ? objG : objQ;
    }
}
