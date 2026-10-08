package androidx.constraintlayout.compose;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Function0;"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class ConstraintSetForInlineDsl$observer$1 extends Lambda implements Function1<Function0<? extends Unit>, Unit> {
    final /* synthetic */ ConstraintSetForInlineDsl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConstraintSetForInlineDsl$observer$1(ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(1);
        this.this$0 = constraintSetForInlineDsl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "$tmp0");
        function0.invoke();
    }

    public final void b(final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "it");
        if (Intrinsics.e(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
            return;
        }
        Handler handler = this.this$0.handler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            this.this$0.handler = handler;
        }
        handler.post(new Runnable() { // from class: androidx.constraintlayout.compose.d
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintSetForInlineDsl$observer$1.c(function0);
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Function0) obj);
        return Unit.a;
    }
}
