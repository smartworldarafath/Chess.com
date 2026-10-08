package com.google.inputmethod;

import androidx.compose.p001foundation.pager.PagerState;
import com.google.android.sh7;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "state", "Lcom/google/android/p9b;", "scrollScope", "Lcom/google/android/qu6;", "a", "(Landroidx/compose/foundation/pager/PagerState;Lcom/google/android/p9b;)Lcom/google/android/qu6;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class oz8 {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001a"}, d2 = {"com/google/android/oz8$a", "Lcom/google/android/qu6;", "Lcom/google/android/p9b;", "", "index", "offset", "", "d", "(II)V", "targetIndex", "targetOffset", "f", "(II)I", "", "pixels", "e", "(F)F", "b", "()I", "firstVisibleItemIndex", "g", "firstVisibleItemScrollOffset", "c", "lastVisibleItemIndex", "a", "itemCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements qu6, p9b {
        private final /* synthetic */ p9b a;
        final /* synthetic */ PagerState b;

        a(p9b p9bVar, PagerState pagerState) {
            this.b = pagerState;
            this.a = p9bVar;
        }

        @Override // com.google.inputmethod.qu6
        public int a() {
            return this.b.O();
        }

        @Override // com.google.inputmethod.qu6
        public int b() {
            return this.b.getFirstVisiblePage();
        }

        @Override // com.google.inputmethod.qu6
        public int c() {
            return ((yx8) m.L0(this.b.J().m())).getIndex();
        }

        @Override // com.google.inputmethod.qu6
        public void d(int index, int offset) {
            float fQ = this.b.Q();
            this.b.y0(index, fQ != 0.0f ? offset / fQ : 0.0f, true);
        }

        @Override // com.google.inputmethod.p9b
        public float e(float pixels) {
            return this.a.e(pixels);
        }

        @Override // com.google.inputmethod.qu6
        public int f(int targetIndex, int targetOffset) {
            return (int) (g.q(nz8.a(this.b) + ((long) sh7.d((((targetIndex - this.b.A()) * this.b.Q()) - (this.b.B() * this.b.Q())) + targetOffset)), this.b.getMinScrollOffset(), this.b.getMaxScrollOffset()) - nz8.a(this.b));
        }

        @Override // com.google.inputmethod.qu6
        public int g() {
            return this.b.getFirstVisiblePageOffset();
        }
    }

    public static final qu6 a(PagerState pagerState, p9b p9bVar) {
        return new a(p9bVar, pagerState);
    }
}
