package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.ps4;
import com.google.android.rs4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 32\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0019B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJM\u0010\u0010\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011Jy\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f\u0018\u00010\u00142\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00042\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010*\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0011\u00102\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/google/android/op6;", "Lcom/google/android/sq6;", "Lcom/google/android/ct6;", "Lcom/google/android/ip6;", "Lkotlin/Function1;", "", "content", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "key", "Lcom/google/android/wp6;", "Lcom/google/android/q15;", "span", "contentType", "Lcom/google/android/up6;", "m", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lcom/google/android/ps4;)V", "", "count", "Lkotlin/Function2;", "itemContent", "c", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/google/android/rs4;)V", "Lcom/google/android/yq6;", "a", "Lcom/google/android/yq6;", "A", "()Lcom/google/android/yq6;", "spanLayoutProvider", "Lcom/google/android/t48;", "b", "Lcom/google/android/t48;", "z", "()Lcom/google/android/t48;", "intervals", "", "Z", "x", "()Z", "setHasCustomSpans$foundation", "(Z)V", "hasCustomSpans", "Lcom/google/android/n48;", "d", "Lcom/google/android/n48;", "_headerIndexes", "Lcom/google/android/x06;", "y", "()Lcom/google/android/x06;", "headerIndexes", "e", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class op6 extends ct6<ip6> implements sq6 {
    private static final a e = new a(null);
    public static final int f = 8;
    private static final Function2<wp6, Integer, q15> g = new Function2() { // from class: com.google.android.np6
        public final Object invoke(Object obj, Object obj2) {
            return op6.w((wp6) obj, ((Integer) obj2).intValue());
        }
    };

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final yq6 spanLayoutProvider = new yq6(this);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final t48<ip6> intervals = new t48<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean hasCustomSpans;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private n48 _headerIndexes;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/op6$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public op6(Function1<? super sq6, Unit> function1) {
        function1.invoke(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object B(Object obj, int i) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q15 C(Function1 function1, wp6 wp6Var, int i) {
        return (q15) function1.invoke(wp6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object D(Object obj, int i) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(ps4 ps4Var, up6 up6Var, int i, d dVar, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= dVar.x(up6Var) ? 4 : 2;
        }
        if (dVar.g((i2 & 131) != 130, i2 & 1)) {
            if (e.k()) {
                e.o(-291643851, i2, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:55)");
            }
            ps4Var.invoke(up6Var, dVar, Integer.valueOf(i2 & 14));
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q15 w(wp6 wp6Var, int i) {
        return q15.a(wq6.a(1));
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final yq6 getSpanLayoutProvider() {
        return this.spanLayoutProvider;
    }

    @Override // com.google.inputmethod.sq6
    public void c(int count, Function1<? super Integer, ? extends Object> key, Function2<? super wp6, ? super Integer, q15> span, Function1<? super Integer, ? extends Object> contentType, rs4<? super up6, ? super Integer, ? super d, ? super Integer, Unit> itemContent) {
        o().b(count, new ip6(key, span == null ? g : span, contentType, itemContent));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    @Override // com.google.inputmethod.sq6
    public void m(final Object key, final Function1<? super wp6, q15> span, final Object contentType, final ps4<? super up6, ? super d, ? super Integer, Unit> content) {
        o().b(1, new ip6(key != null ? new Function1() { // from class: com.google.android.jp6
            public final Object invoke(Object obj) {
                return op6.B(key, ((Integer) obj).intValue());
            }
        } : null, span != null ? new Function2() { // from class: com.google.android.kp6
            public final Object invoke(Object obj, Object obj2) {
                return op6.C(span, (wp6) obj, ((Integer) obj2).intValue());
            }
        } : g, new Function1() { // from class: com.google.android.lp6
            public final Object invoke(Object obj) {
                return op6.D(contentType, ((Integer) obj).intValue());
            }
        }, ko1.c(-291643851, true, new rs4() { // from class: com.google.android.mp6
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return op6.E(content, (up6) obj, ((Integer) obj2).intValue(), (d) obj3, ((Integer) obj4).intValue());
            }
        })));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }

    public final x06 y() {
        n48 n48Var = this._headerIndexes;
        return n48Var != null ? n48Var : y06.a();
    }

    @Override // com.google.inputmethod.ct6
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public t48<ip6> o() {
        return this.intervals;
    }
}
