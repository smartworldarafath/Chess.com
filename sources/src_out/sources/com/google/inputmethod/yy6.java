package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.lazy.layout.f;
import androidx.compose.p001foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "", "reverseScrolling", "Lcom/google/android/tu6;", "a", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;ZLandroidx/compose/runtime/d;I)Lcom/google/android/tu6;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class yy6 {

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"com/google/android/yy6$a", "Lcom/google/android/tu6;", "", "index", "", "c", "(ILcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/nh1;", "e", "()Lcom/google/android/nh1;", "", "b", "()F", "scrollOffset", "d", "maxScrollOffset", "f", "()I", "viewport", "a", "contentPadding", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements tu6 {
        final /* synthetic */ LazyStaggeredGridState a;

        a(LazyStaggeredGridState lazyStaggeredGridState) {
            this.a = lazyStaggeredGridState;
        }

        @Override // com.google.inputmethod.tu6
        public int a() {
            return this.a.B().getBeforeContentPadding() + this.a.B().getAfterContentPadding();
        }

        @Override // com.google.inputmethod.tu6
        public float b() {
            return f.b(this.a.w(), this.a.x());
        }

        @Override // com.google.inputmethod.tu6
        public Object c(int i, q22<? super Unit> q22Var) {
            Object objQ = LazyStaggeredGridState.Q(this.a, i, 0, q22Var, 2, null);
            return objQ == kotlin.coroutines.intrinsics.a.g() ? objQ : Unit.a;
        }

        @Override // com.google.inputmethod.tu6
        public float d() {
            return f.a(this.a.w(), this.a.x(), this.a.c());
        }

        @Override // com.google.inputmethod.tu6
        public CollectionInfo e() {
            return new CollectionInfo(-1, -1);
        }

        @Override // com.google.inputmethod.tu6
        public int f() {
            return (int) (this.a.B().getOrientation() == Orientation.Vertical ? this.a.B().getViewportSize() & 4294967295L : this.a.B().getViewportSize() >> 32);
        }
    }

    public static final tu6 a(LazyStaggeredGridState lazyStaggeredGridState, boolean z, d dVar, int i) {
        if (e.k()) {
            e.o(1629354903, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridSemanticState (LazyStaggeredGridSemantics.kt:31)");
        }
        boolean z2 = ((((i & 14) ^ 6) > 4 && dVar.x(lazyStaggeredGridState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && dVar.A(z)) || (i & 48) == 32);
        Object objR = dVar.R();
        if (z2 || objR == d.INSTANCE.a()) {
            objR = new a(lazyStaggeredGridState);
            dVar.L(objR);
        }
        a aVar = (a) objR;
        if (e.k()) {
            e.n();
        }
        return aVar;
    }
}
