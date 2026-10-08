package androidx.compose.p001foundation.lazy;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.inputmethod.av6;
import com.google.inputmethod.d66;
import com.google.inputmethod.fv6;
import com.google.inputmethod.hv6;
import com.google.inputmethod.ko1;
import com.google.inputmethod.lu6;
import com.google.inputmethod.mr6;
import com.google.inputmethod.ot6;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.x06;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b \u0010&R\u0014\u0010'\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/foundation/lazy/c;", "Lcom/google/android/hv6;", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Lcom/google/android/fv6;", "intervalContent", "Lcom/google/android/mr6;", "itemScope", "Lcom/google/android/ot6;", "keyIndexMap", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;Lcom/google/android/fv6;Lcom/google/android/mr6;Lcom/google/android/ot6;)V", "", "index", "", "key", "", "i", "(ILjava/lang/Object;Landroidx/compose/runtime/d;I)V", "d", "(I)Ljava/lang/Object;", "f", "c", "(Ljava/lang/Object;)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Landroidx/compose/foundation/lazy/LazyListState;", "b", "Lcom/google/android/fv6;", "Lcom/google/android/mr6;", "h", "()Lcom/google/android/mr6;", "Lcom/google/android/ot6;", "()Lcom/google/android/ot6;", "itemCount", "Lcom/google/android/x06;", "e", "()Lcom/google/android/x06;", "headerIndexes", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements hv6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LazyListState state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final fv6 intervalContent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final mr6 itemScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ot6 keyIndexMap;

    public c(LazyListState lazyListState, fv6 fv6Var, mr6 mr6Var, ot6 ot6Var) {
        this.state = lazyListState;
        this.intervalContent = fv6Var;
        this.itemScope = mr6Var;
        this.keyIndexMap = ot6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(c cVar, int i, d dVar, int i2) {
        if (dVar.g((i2 & 3) != 2, i2 & 1)) {
            if (e.k()) {
                e.o(-824725566, i2, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:78)");
            }
            d66.a<av6> aVar = cVar.intervalContent.o().get(i);
            aVar.c().a().invoke(cVar.getItemScope(), Integer.valueOf(i - aVar.getStartIndex()), dVar, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(c cVar, int i, Object obj, int i2, d dVar, int i3) {
        cVar.i(i, obj, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    @Override // com.google.inputmethod.lt6
    public int a() {
        return this.intervalContent.p();
    }

    @Override // com.google.inputmethod.hv6
    /* JADX INFO: renamed from: b, reason: from getter */
    public ot6 getKeyIndexMap() {
        return this.keyIndexMap;
    }

    @Override // com.google.inputmethod.lt6
    public int c(Object key) {
        return getKeyIndexMap().c(key);
    }

    @Override // com.google.inputmethod.lt6
    public Object d(int index) {
        Object objD = getKeyIndexMap().d(index);
        return objD == null ? this.intervalContent.q(index) : objD;
    }

    @Override // com.google.inputmethod.hv6
    public x06 e() {
        return this.intervalContent.v();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof c) {
            return Intrinsics.e(this.intervalContent, ((c) other).intervalContent);
        }
        return false;
    }

    @Override // com.google.inputmethod.lt6
    public Object f(int index) {
        return this.intervalContent.n(index);
    }

    @Override // com.google.inputmethod.hv6
    /* JADX INFO: renamed from: h, reason: from getter */
    public mr6 getItemScope() {
        return this.itemScope;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }

    @Override // com.google.inputmethod.lt6
    public void i(final int i, Object obj, d dVar, final int i2) {
        int i3;
        final int i4;
        final Object obj2;
        d dVarF = dVar.F(-462424778);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.C(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.T(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.x(this) ? 256 : 128;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            if (e.k()) {
                e.o(-462424778, i3, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:76)");
            }
            i4 = i;
            obj2 = obj;
            lu6.c(obj2, i4, this.state.getPinnedItems(), ko1.e(-824725566, true, new Function2() { // from class: androidx.compose.foundation.lazy.a
                public final Object invoke(Object obj3, Object obj4) {
                    return c.m(this.a, i, (d) obj3, ((Integer) obj4).intValue());
                }
            }, dVarF, 54), dVarF, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (e.k()) {
                e.n();
            }
        } else {
            i4 = i;
            obj2 = obj;
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: androidx.compose.foundation.lazy.b
                public final Object invoke(Object obj3, Object obj4) {
                    return c.n(this.a, i4, obj2, i2, (d) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }
}
