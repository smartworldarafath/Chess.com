package com.google.inputmethod;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'\"\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0018R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0018R\u0014\u00104\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0018R\u0014\u00106\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0018R\u0014\u00108\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0018R\u0014\u0010:\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0018R\u0016\u0010>\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0018¨\u0006A"}, d2 = {"Lcom/google/android/my8;", "Lcom/google/android/i11;", "Lkotlin/Function0;", "", "itemCount", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "lineIndex", "Lkotlin/Function2;", "", "onItemPrefetched", "", "Lcom/google/android/nu6$b;", "f", "(ILkotlin/jvm/functions/Function2;)Ljava/util/List;", "indexInVisibleLines", "g", "(I)I", "k", "", "q", "(I)Ljava/lang/Object;", "m", "i", "()I", "a", "Lkotlin/jvm/functions/Function0;", "getItemCount", "()Lkotlin/jvm/functions/Function0;", "Lcom/google/android/jz8;", "b", "Lcom/google/android/jz8;", "()Lcom/google/android/jz8;", "s", "(Lcom/google/android/jz8;)V", "layoutInfo", "Lcom/google/android/nu6;", "c", "Lcom/google/android/nu6;", "()Lcom/google/android/nu6;", "t", "(Lcom/google/android/nu6;)V", "state", "d", "totalItemsCount", "", "e", "()Z", "hasVisibleItems", "o", "mainAxisExtraSpaceStart", "p", "mainAxisExtraSpaceEnd", "j", "firstVisibleLineIndex", "n", "lastVisibleLineIndex", "h", "mainAxisViewportSize", "Lcom/google/android/f43;", "getDensity", "()Lcom/google/android/f43;", "density", "l", "visibleLineCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class my8 implements i11 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function0<Integer> itemCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public jz8 layoutInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public nu6 state;

    public my8(Function0<Integer> function0) {
        this.itemCount = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function2 function2, my8 my8Var, nu6.c cVar) {
        function2.invoke(Integer.valueOf(cVar.getIndex()), Integer.valueOf(my8Var.b().getPageSize()));
        return Unit.a;
    }

    public final jz8 b() {
        jz8 jz8Var = this.layoutInfo;
        if (jz8Var != null) {
            return jz8Var;
        }
        Intrinsics.x("layoutInfo");
        return null;
    }

    public final nu6 c() {
        nu6 nu6Var = this.state;
        if (nu6Var != null) {
            return nu6Var;
        }
        Intrinsics.x("state");
        return null;
    }

    @Override // com.google.inputmethod.i11
    public int d() {
        return ((Number) this.itemCount.invoke()).intValue();
    }

    @Override // com.google.inputmethod.i11
    public boolean e() {
        return !b().m().isEmpty();
    }

    @Override // com.google.inputmethod.i11
    public List<nu6.b> f(int lineIndex, final Function2<? super Integer, ? super Integer, Unit> onItemPrefetched) {
        return m.e(c().i(lineIndex, b().getChildConstraints(), true, new Function1() { // from class: com.google.android.ly8
            public final Object invoke(Object obj) {
                return my8.r(onItemPrefetched, this, (nu6.c) obj);
            }
        }));
    }

    @Override // com.google.inputmethod.i11
    public int g(int indexInVisibleLines) {
        return b().getPageSize();
    }

    @Override // com.google.inputmethod.i11
    public f43 getDensity() {
        return b().getDensity();
    }

    @Override // com.google.inputmethod.i11
    public int h() {
        return xy8.a(b());
    }

    @Override // com.google.inputmethod.i11
    public int i() {
        if (b().m().isEmpty()) {
            return -1;
        }
        return d() - 1;
    }

    @Override // com.google.inputmethod.i11
    public int j() {
        if (b().m().isEmpty()) {
            return -1;
        }
        return (int) g.f(((long) ((jj7) m.z0(b().m())).getIndex()) - ((long) b().getBeyondViewportPageCount()), 0L);
    }

    @Override // com.google.inputmethod.i11
    public int k(int indexInVisibleLines) {
        int size = b().y().size();
        int size2 = b().m().size();
        if (indexInVisibleLines < size) {
            return b().y().get(indexInVisibleLines).getIndex();
        }
        if (indexInVisibleLines >= size && indexInVisibleLines < size + size2) {
            return b().m().get(indexInVisibleLines - size).getIndex();
        }
        if (indexInVisibleLines >= size + size2) {
            return b().x().get((indexInVisibleLines - size) - size2).getIndex();
        }
        return -1;
    }

    @Override // com.google.inputmethod.i11
    public int l() {
        return b().y().size() + b().m().size() + b().x().size();
    }

    @Override // com.google.inputmethod.i11
    public int m(int lineIndex) {
        return lineIndex;
    }

    @Override // com.google.inputmethod.i11
    public int n() {
        if (b().m().isEmpty()) {
            return -1;
        }
        return (int) g.k(((long) ((jj7) m.L0(b().m())).getIndex()) + ((long) b().getBeyondViewportPageCount()), ((long) d()) - 1);
    }

    @Override // com.google.inputmethod.i11
    public int o() {
        if (b().m().isEmpty()) {
            return 0;
        }
        return Math.abs(g.j(((jj7) m.z0(b().m())).getOffset() + b().e(), 0));
    }

    @Override // com.google.inputmethod.i11
    public int p() {
        if (b().m().isEmpty()) {
            return 0;
        }
        return Math.abs(((((jj7) m.L0(b().m())).getOffset() + b().getPageSize()) + b().getPageSpacing()) - b().getViewportEndOffset());
    }

    @Override // com.google.inputmethod.i11
    public Object q(int indexInVisibleLines) {
        int size = b().y().size();
        int size2 = b().m().size();
        if (indexInVisibleLines < size) {
            return b().y().get(indexInVisibleLines).getKey();
        }
        if (indexInVisibleLines < size || indexInVisibleLines >= size + size2) {
            return indexInVisibleLines >= size + size2 ? b().x().get((indexInVisibleLines - size) - size2).getKey() : CachedItem.INSTANCE;
        }
        return b().m().get(indexInVisibleLines - size).getKey();
    }

    public final void s(jz8 jz8Var) {
        this.layoutInfo = jz8Var;
    }

    public final void t(nu6 nu6Var) {
        this.state = nu6Var;
    }
}
