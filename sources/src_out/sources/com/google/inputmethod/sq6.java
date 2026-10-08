package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import com.google.android.ps4;
import com.google.android.rs4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001JS\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u007f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0001\u0001\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lcom/google/android/sq6;", "", "key", "Lkotlin/Function1;", "Lcom/google/android/wp6;", "Lcom/google/android/q15;", "span", "contentType", "Lcom/google/android/up6;", "", "content", "m", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lcom/google/android/ps4;)V", "", "count", "Lkotlin/Function2;", "itemContent", "c", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/google/android/rs4;)V", "Lcom/google/android/op6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface sq6 {

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

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void b(sq6 sq6Var, int i, Function1 function1, Function2 function2, Function1 function3, rs4 rs4Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            function2 = null;
        }
        if ((i2 & 8) != 0) {
            function3 = a.a;
        }
        sq6Var.c(i, function1, function2, function3, rs4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void l(sq6 sq6Var, Object obj, Function1 function1, Object obj2, ps4 ps4Var, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            obj2 = null;
        }
        sq6Var.m(obj, function1, obj2, ps4Var);
    }

    void c(int count, Function1<? super Integer, ? extends Object> key, Function2<? super wp6, ? super Integer, q15> span, Function1<? super Integer, ? extends Object> contentType, rs4<? super up6, ? super Integer, ? super d, ? super Integer, Unit> itemContent);

    void m(Object key, Function1<? super wp6, q15> span, Object contentType, ps4<? super up6, ? super d, ? super Integer, Unit> content);
}
