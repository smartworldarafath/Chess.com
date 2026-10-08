package com.google.inputmethod;

import androidx.compose.p001foundation.text.contextmenu.gestures.RightClickGesturesKt;
import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/b;", "Lkotlin/Function1;", "Lcom/google/android/rn8;", "", "onOpenGesture", "a", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/b;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g12 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {
        final /* synthetic */ Function1<rn8, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super rn8, Unit> function1) {
            this.a = function1;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
            Object objC = RightClickGesturesKt.c(df9Var, this.a, q22Var);
            return objC == kotlin.coroutines.intrinsics.a.g() ? objC : Unit.a;
        }
    }

    public static final b a(b bVar, Function1<? super rn8, Unit> function1) {
        return ugc.c(bVar, h12.a, new a(function1));
    }
}
