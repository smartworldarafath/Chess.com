package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.ps4;
import com.google.android.rs4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ]\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00042\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0013\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0015\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/google/android/fv6;", "Lcom/google/android/ct6;", "Lcom/google/android/av6;", "Lcom/google/android/cw6;", "Lkotlin/Function1;", "", "content", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "count", "", "key", "contentType", "Lkotlin/Function2;", "Lcom/google/android/lr6;", "itemContent", "d", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/google/android/rs4;)V", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/ps4;)V", "k", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/rs4;)V", "Lcom/google/android/t48;", "Lcom/google/android/t48;", "w", "()Lcom/google/android/t48;", "intervals", "Lcom/google/android/n48;", "b", "Lcom/google/android/n48;", "_headerIndexes", "Lcom/google/android/x06;", "v", "()Lcom/google/android/x06;", "headerIndexes", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class fv6 extends ct6<av6> implements cw6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final t48<av6> intervals = new t48<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private n48 _headerIndexes;

    public fv6(Function1<? super cw6, Unit> function1) {
        function1.invoke(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(rs4 rs4Var, int i, lr6 lr6Var, d dVar, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= dVar.x(lr6Var) ? 4 : 2;
        }
        if (dVar.g((i2 & 19) != 18, i2 & 1)) {
            if (e.k()) {
                e.o(-1588696110, i2, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.stickyHeader.<anonymous> (LazyListIntervalContent.kt:70)");
            }
            rs4Var.invoke(lr6Var, Integer.valueOf(i), dVar, Integer.valueOf(i2 & 14));
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object x(Object obj, int i) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object y(Object obj, int i) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(ps4 ps4Var, lr6 lr6Var, int i, d dVar, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= dVar.x(lr6Var) ? 4 : 2;
        }
        if (dVar.g((i2 & 131) != 130, i2 & 1)) {
            if (e.k()) {
                e.o(-857469575, i2, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:56)");
            }
            ps4Var.invoke(lr6Var, dVar, Integer.valueOf(i2 & 14));
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    @Override // com.google.inputmethod.cw6
    public void a(final Object key, final Object contentType, final ps4<? super lr6, ? super d, ? super Integer, Unit> content) {
        o().b(1, new av6(key != null ? new Function1() { // from class: com.google.android.bv6
            public final Object invoke(Object obj) {
                return fv6.x(key, ((Integer) obj).intValue());
            }
        } : null, new Function1() { // from class: com.google.android.cv6
            public final Object invoke(Object obj) {
                return fv6.y(contentType, ((Integer) obj).intValue());
            }
        }, ko1.c(-857469575, true, new rs4() { // from class: com.google.android.dv6
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return fv6.z(content, (lr6) obj, ((Integer) obj2).intValue(), (d) obj3, ((Integer) obj4).intValue());
            }
        })));
    }

    @Override // com.google.inputmethod.cw6
    public void d(int count, Function1<? super Integer, ? extends Object> key, Function1<? super Integer, ? extends Object> contentType, rs4<? super lr6, ? super Integer, ? super d, ? super Integer, Unit> itemContent) {
        o().b(count, new av6(key, contentType, itemContent));
    }

    @Override // com.google.inputmethod.cw6
    public void k(Object key, Object contentType, final rs4<? super lr6, ? super Integer, ? super d, ? super Integer, Unit> content) {
        n48 n48Var = this._headerIndexes;
        if (n48Var == null) {
            n48Var = new n48(0, 1, null);
            this._headerIndexes = n48Var;
        }
        n48Var.k(o().getSize());
        final int size = o().getSize();
        a(key, contentType, ko1.c(-1588696110, true, new ps4() { // from class: com.google.android.ev6
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return fv6.A(content, size, (lr6) obj, (d) obj2, ((Integer) obj3).intValue());
            }
        }));
    }

    public final x06 v() {
        n48 n48Var = this._headerIndexes;
        return n48Var != null ? n48Var : y06.a();
    }

    @Override // com.google.inputmethod.ct6
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public t48<av6> o() {
        return this.intervals;
    }
}
