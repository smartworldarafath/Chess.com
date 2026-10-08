package com.google.inputmethod;

import androidx.compose.p001foundation.lazy.layout.m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/google/android/pe8;", "Lcom/google/android/ot6;", "Lkotlin/ranges/IntRange;", "nearestRange", "Lcom/google/android/ct6;", "intervalContent", "<init>", "(Lkotlin/ranges/IntRange;Lcom/google/android/ct6;)V", "", "key", "", "c", "(Ljava/lang/Object;)I", "index", "d", "(I)Ljava/lang/Object;", "Lcom/google/android/wl8;", "a", "Lcom/google/android/wl8;", "map", "", "b", "[Ljava/lang/Object;", "keys", "I", "keysStartIndex", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class pe8 implements ot6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final wl8<Object> map;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Object[] keys;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int keysStartIndex;

    public pe8(IntRange intRange, ct6<?> ct6Var) {
        d66<Interval> d66VarO = ct6Var.o();
        final int iF = intRange.f();
        if (!(iF >= 0)) {
            cx5.c("negative nearestRange.first");
        }
        final int iMin = Math.min(intRange.i(), d66VarO.getSize() - 1);
        if (iMin < iF) {
            this.map = xl8.a();
            this.keys = new Object[0];
            this.keysStartIndex = 0;
        } else {
            int i = (iMin - iF) + 1;
            this.keys = new Object[i];
            this.keysStartIndex = iF;
            final d58 d58Var = new d58(i);
            d66VarO.a(iF, iMin, new Function1() { // from class: com.google.android.oe8
                public final Object invoke(Object obj) {
                    return pe8.a(iF, iMin, d58Var, this, (d66.a) obj);
                }
            });
            this.map = d58Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0035  */
    public static Unit a(int i, int i2, d58 d58Var, pe8 pe8Var, d66.a aVar) {
        Object objA;
        Function1<Integer, Object> key = ((ct6.a) aVar.c()).getKey();
        int iMax = Math.max(i, aVar.getStartIndex());
        int iMin = Math.min(i2, (aVar.getStartIndex() + aVar.getSize()) - 1);
        if (iMax <= iMin) {
            while (true) {
                if (key == null) {
                    objA = m.a(iMax);
                } else {
                    objA = key.invoke(Integer.valueOf(iMax - aVar.getStartIndex()));
                    if (objA == null) {
                        objA = m.a(iMax);
                    }
                }
                d58Var.u(objA, iMax);
                pe8Var.keys[iMax - pe8Var.keysStartIndex] = objA;
                if (iMax == iMin) {
                    break;
                }
                iMax++;
            }
        }
        return Unit.a;
    }

    @Override // com.google.inputmethod.ot6
    public int c(Object key) {
        wl8<Object> wl8Var = this.map;
        int iB = wl8Var.b(key);
        if (iB >= 0) {
            return wl8Var.values[iB];
        }
        return -1;
    }

    @Override // com.google.inputmethod.ot6
    public Object d(int index) {
        Object[] objArr = this.keys;
        int i = index - this.keysStartIndex;
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }
}
