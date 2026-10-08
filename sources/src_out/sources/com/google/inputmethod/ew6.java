package com.google.inputmethod;

import androidx.compose.p001foundation.lazy.LazyListState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "state", "Lcom/google/android/p9b;", "scrollScope", "Lcom/google/android/qu6;", "a", "(Landroidx/compose/foundation/lazy/LazyListState;Lcom/google/android/p9b;)Lcom/google/android/qu6;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ew6 {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001a"}, d2 = {"com/google/android/ew6$a", "Lcom/google/android/qu6;", "Lcom/google/android/p9b;", "", "index", "offset", "", "d", "(II)V", "targetIndex", "targetOffset", "f", "(II)I", "", "pixels", "e", "(F)F", "b", "()I", "firstVisibleItemIndex", "g", "firstVisibleItemScrollOffset", "c", "lastVisibleItemIndex", "a", "itemCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements qu6, p9b {
        private final /* synthetic */ p9b a;
        final /* synthetic */ LazyListState b;

        a(p9b p9bVar, LazyListState lazyListState) {
            this.b = lazyListState;
            this.a = p9bVar;
        }

        @Override // com.google.inputmethod.qu6
        public int a() {
            return this.b.C().getTotalItemsCount();
        }

        @Override // com.google.inputmethod.qu6
        public int b() {
            return this.b.x();
        }

        @Override // com.google.inputmethod.qu6
        public int c() {
            gv6 gv6Var = (gv6) m.N0(this.b.C().h());
            if (gv6Var != null) {
                return gv6Var.getIndex();
            }
            return 0;
        }

        @Override // com.google.inputmethod.qu6
        public void d(int index, int offset) {
            this.b.W(index, offset, true);
        }

        @Override // com.google.inputmethod.p9b
        public float e(float pixels) {
            return this.a.e(pixels);
        }

        @Override // com.google.inputmethod.qu6
        public int f(int targetIndex, int targetOffset) {
            gv6 gv6Var;
            nv6 nv6VarC = this.b.C();
            int iA = 0;
            if (nv6VarC.h().isEmpty()) {
                return 0;
            }
            int iB = b();
            if (targetIndex > c() || iB > targetIndex) {
                iA = (ov6.a(nv6VarC) * (targetIndex - b())) - g();
            } else {
                List<gv6> listH = nv6VarC.h();
                int size = listH.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        gv6Var = null;
                        break;
                    }
                    gv6Var = listH.get(i);
                    if (gv6Var.getIndex() == targetIndex) {
                        break;
                    }
                    i++;
                }
                gv6 gv6Var2 = gv6Var;
                if (gv6Var2 != null) {
                    iA = gv6Var2.getOffset();
                }
            }
            return iA + targetOffset;
        }

        @Override // com.google.inputmethod.qu6
        public int g() {
            return this.b.y();
        }
    }

    public static final qu6 a(LazyListState lazyListState, p9b p9bVar) {
        return new a(p9bVar, lazyListState);
    }
}
