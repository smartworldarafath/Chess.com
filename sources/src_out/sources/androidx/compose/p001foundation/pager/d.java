package androidx.compose.p001foundation.pager;

import androidx.compose.p004runtime.s0;
import com.google.inputmethod.k0b;
import com.google.inputmethod.k47;
import com.google.inputmethod.o0b;
import com.google.inputmethod.o58;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/pager/d;", "Landroidx/compose/foundation/pager/PagerState;", "", "currentPage", "", "currentPageOffsetFraction", "Lkotlin/Function0;", "updatedPageCount", "<init>", "(IFLkotlin/jvm/functions/Function0;)V", "Lcom/google/android/o58;", "P", "Lcom/google/android/o58;", "J0", "()Lcom/google/android/o58;", "setPageCountState", "(Lcom/google/android/o58;)V", "pageCountState", "O", "()I", "pageCount", "Q", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends PagerState {

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final k0b<d, ?> R = k47.b(new Function2() { // from class: androidx.compose.foundation.pager.a
        public final Object invoke(Object obj, Object obj2) {
            return d.F0((o0b) obj, (d) obj2);
        }
    }, new Function1() { // from class: androidx.compose.foundation.pager.b
        public final Object invoke(Object obj) {
            return d.G0((List) obj);
        }
    });

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private o58<Function0<Integer>> pageCountState;

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/pager/d$a;", "", "<init>", "()V", "Lcom/google/android/k0b;", "Landroidx/compose/foundation/pager/d;", "Saver", "Lcom/google/android/k0b;", "a", "()Lcom/google/android/k0b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k0b<d, ?> a() {
            return d.R;
        }

        private Companion() {
        }
    }

    public d(int i, float f, Function0<Integer> function0) {
        super(i, f);
        this.pageCountState = s0.e(function0, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List F0(o0b o0bVar, d dVar) {
        return m.s(new Object[]{Integer.valueOf(dVar.A()), Float.valueOf(g.n(dVar.B(), -0.5f, 0.5f)), Integer.valueOf(dVar.O())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d G0(final List list) {
        Object obj = list.get(0);
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new d(iIntValue, ((Float) obj2).floatValue(), new Function0() { // from class: androidx.compose.foundation.pager.c
            public final Object invoke() {
                return Integer.valueOf(d.H0(list));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int H0(List list) {
        Object obj = list.get(2);
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) obj).intValue();
    }

    public final o58<Function0<Integer>> J0() {
        return this.pageCountState;
    }

    @Override // androidx.compose.p001foundation.pager.PagerState
    public int O() {
        return ((Number) this.pageCountState.getValue().invoke()).intValue();
    }
}
