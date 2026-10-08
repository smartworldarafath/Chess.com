package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.lazy.LazyListState;
import androidx.compose.p001foundation.lazy.layout.f;
import androidx.compose.p004runtime.p0;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "state", "", "isVertical", "Lcom/google/android/tu6;", "a", "(Landroidx/compose/foundation/lazy/LazyListState;Z)Lcom/google/android/tu6;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class wu6 {

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000e\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\r¨\u0006\u0018"}, d2 = {"com/google/android/wu6$a", "Lcom/google/android/tu6;", "", "index", "", "c", "(ILcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/nh1;", "e", "()Lcom/google/android/nh1;", "a", "Lcom/google/android/q6c;", "h", "()I", "totalItemsCount", "", "b", "()F", "scrollOffset", "d", "maxScrollOffset", "f", "viewport", "contentPadding", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements tu6 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final q6c totalItemsCount;
        final /* synthetic */ LazyListState b;
        final /* synthetic */ boolean c;

        a(final LazyListState lazyListState, boolean z) {
            this.b = lazyListState;
            this.c = z;
            this.totalItemsCount = p0.e(new Function0() { // from class: com.google.android.uu6
                public final Object invoke() {
                    return Integer.valueOf(wu6.a.i(lazyListState));
                }
            });
        }

        private final int h() {
            return ((Number) this.totalItemsCount.getValue()).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(LazyListState lazyListState) {
            return lazyListState.C().getTotalItemsCount();
        }

        @Override // com.google.inputmethod.tu6
        public int a() {
            return this.b.C().e() + this.b.C().getAfterContentPadding();
        }

        @Override // com.google.inputmethod.tu6
        public float b() {
            return f.b(this.b.x(), this.b.y());
        }

        @Override // com.google.inputmethod.tu6
        public Object c(int i, q22<? super Unit> q22Var) {
            Object objS = LazyListState.S(this.b, i, 0, q22Var, 2, null);
            return objS == kotlin.coroutines.intrinsics.a.g() ? objS : Unit.a;
        }

        @Override // com.google.inputmethod.tu6
        public float d() {
            return f.a(this.b.x(), this.b.y(), this.b.c());
        }

        @Override // com.google.inputmethod.tu6
        public CollectionInfo e() {
            return this.c ? new CollectionInfo(h(), 1) : new CollectionInfo(1, h());
        }

        @Override // com.google.inputmethod.tu6
        public int f() {
            return (int) (this.b.C().getOrientation() == Orientation.Vertical ? this.b.C().b() & 4294967295L : this.b.C().b() >> 32);
        }
    }

    public static final tu6 a(LazyListState lazyListState, boolean z) {
        return new a(lazyListState, z);
    }
}
