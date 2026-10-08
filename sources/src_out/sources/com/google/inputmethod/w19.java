package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/google/android/w19;", "Landroidx/compose/ui/b$b;", "Lcom/google/android/f43;", "", "parentData", "r", "(Lcom/google/android/f43;Ljava/lang/Object;)Ljava/lang/Object;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface w19 extends b.InterfaceC0050b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(w19 w19Var, Function1<? super b.InterfaceC0050b, Boolean> function1) {
            return w19.super.all(function1);
        }

        @Deprecated
        public static <R> R b(w19 w19Var, R r, Function2<? super R, ? super b.InterfaceC0050b, ? extends R> function2) {
            return (R) w19.super.foldIn(r, function2);
        }

        @Deprecated
        public static b c(w19 w19Var, b bVar) {
            return w19.super.then(bVar);
        }
    }

    Object r(f43 f43Var, Object obj);
}
