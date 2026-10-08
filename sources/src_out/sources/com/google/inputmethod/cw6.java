package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.ps4;
import com.google.android.rs4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J;\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJa\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/google/android/cw6;", "", "key", "contentType", "Lkotlin/Function1;", "Lcom/google/android/lr6;", "", "content", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/ps4;)V", "", "count", "Lkotlin/Function2;", "itemContent", "d", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/google/android/rs4;)V", "k", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/rs4;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface cw6 {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Function1 {
        public static final a a = new a();

        a() {
        }

        public final Void a(int i) {
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static /* synthetic */ void f(cw6 cw6Var, Object obj, Object obj2, rs4 rs4Var, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        cw6Var.k(obj, obj2, rs4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit g(rs4 rs4Var, lr6 lr6Var, d dVar, int i) {
        if ((i & 6) == 0) {
            i |= dVar.x(lr6Var) ? 4 : 2;
        }
        if (dVar.g((i & 19) != 18, i & 1)) {
            if (e.k()) {
                e.o(1691919627, i, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:148)");
            }
            rs4Var.invoke(lr6Var, 0, dVar, Integer.valueOf((i & 14) | 48));
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void i(cw6 cw6Var, int i, Function1 function1, Function1 function2, rs4 rs4Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            function2 = a.a;
        }
        cw6Var.d(i, function1, function2, rs4Var);
    }

    static /* synthetic */ void j(cw6 cw6Var, Object obj, Object obj2, ps4 ps4Var, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        cw6Var.a(obj, obj2, ps4Var);
    }

    default void a(Object key, Object contentType, ps4<? super lr6, ? super d, ? super Integer, Unit> content) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void d(int count, Function1<? super Integer, ? extends Object> key, Function1<? super Integer, ? extends Object> contentType, rs4<? super lr6, ? super Integer, ? super d, ? super Integer, Unit> itemContent) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void k(Object key, Object contentType, final rs4<? super lr6, ? super Integer, ? super d, ? super Integer, Unit> content) {
        a(key, contentType, ko1.c(1691919627, true, new ps4() { // from class: com.google.android.bw6
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return cw6.g(content, (lr6) obj, (d) obj2, ((Integer) obj3).intValue());
            }
        }));
    }
}
