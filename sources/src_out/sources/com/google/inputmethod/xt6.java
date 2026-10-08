package com.google.inputmethod;

import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0010*\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u000f*\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u000f*\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u000f*\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u001d*\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 JH\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\t0$2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'H\u0096\u0001¢\u0006\u0004\b,\u0010-J^\u00100\u001a\u00020+2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\t0$2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020)\u0018\u00010'2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'H\u0096\u0001¢\u0006\u0004\b0\u00101J\u0014\u00102\u001a\u00020\u0015*\u00020\u0010H\u0097\u0001¢\u0006\u0004\b2\u0010\u0017J\u0014\u00103\u001a\u00020\u0015*\u00020\u000fH\u0097\u0001¢\u0006\u0004\b3\u0010\u0012J\u0014\u00104\u001a\u00020\t*\u00020\u0010H\u0097\u0001¢\u0006\u0004\b4\u00105J\u0014\u00106\u001a\u00020\t*\u00020\u000fH\u0097\u0001¢\u0006\u0004\b6\u00107R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\u000b0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR \u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010CR\u0014\u0010J\u001a\u00020G8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020\u00158\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u00158\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bR\u0010P¨\u0006T"}, d2 = {"Lcom/google/android/xt6;", "Lcom/google/android/wt6;", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/ht6;", "itemContentFactory", "Lcom/google/android/scc;", "subcomposeMeasureScope", "<init>", "(Lcom/google/android/ht6;Lcom/google/android/scc;)V", "", "index", "", "Lcom/google/android/dj7;", "C2", "(I)Ljava/util/List;", "Lcom/google/android/b0d;", "Lcom/google/android/ff3;", "U", "(J)F", "O0", "(I)F", "", "P0", "(F)F", "Y", "(F)J", "X", "(I)J", "s1", "Lcom/google/android/jf3;", "Lcom/google/android/tsb;", "b1", "(J)J", "S", "width", "height", "", "Lcom/google/android/uc;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/o$a;", "", "placementBlock", "Lcom/google/android/fj7;", "h2", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Lcom/google/android/fj7;", "Lcom/google/android/mra;", "rulers", "B2", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/google/android/fj7;", "x2", "T1", "O1", "(F)I", "A2", "(J)I", "a", "Lcom/google/android/ht6;", "b", "Lcom/google/android/scc;", "Lcom/google/android/lt6;", "c", "Lcom/google/android/lt6;", "itemProvider", "Lcom/google/android/o48;", "Landroidx/compose/ui/layout/o;", "d", "Lcom/google/android/o48;", "placeablesCache", "e", "measurablesCache", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "G1", "()Z", "isLookingAhead", "getDensity", "()F", "density", "w2", "fontScale", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class xt6 implements wt6, j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ht6 itemContentFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final scc subcomposeMeasureScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final lt6 itemProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final o48<List<o>> placeablesCache = f16.c();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final o48<List<dj7>> measurablesCache = f16.c();

    public xt6(ht6 ht6Var, scc sccVar) {
        this.itemContentFactory = ht6Var;
        this.subcomposeMeasureScope = sccVar;
        this.itemProvider = (lt6) ht6Var.d().invoke();
    }

    @Override // com.google.inputmethod.f43
    public int A2(long j) {
        return this.subcomposeMeasureScope.A2(j);
    }

    @Override // androidx.compose.ui.layout.j
    public fj7 B2(int width, int height, Map<uc, Integer> alignmentLines, Function1<? super mra, Unit> rulers, Function1<? super o.a, Unit> placementBlock) {
        return this.subcomposeMeasureScope.B2(width, height, alignmentLines, rulers, placementBlock);
    }

    @Override // com.google.inputmethod.wt6
    public List<dj7> C2(int index) {
        List<dj7> listB = this.measurablesCache.b(index);
        if (listB != null) {
            return listB;
        }
        Object objD = this.itemProvider.d(index);
        List<dj7> listQ1 = this.subcomposeMeasureScope.q1(objD, this.itemContentFactory.b(index, objD, this.itemProvider.f(index)));
        this.measurablesCache.r(index, listQ1);
        return listQ1;
    }

    @Override // com.google.inputmethod.h66
    public boolean G1() {
        return this.subcomposeMeasureScope.G1();
    }

    @Override // com.google.inputmethod.f43
    public float O0(int i) {
        return this.subcomposeMeasureScope.O0(i);
    }

    @Override // com.google.inputmethod.f43
    public int O1(float f) {
        return this.subcomposeMeasureScope.O1(f);
    }

    @Override // com.google.inputmethod.f43
    public float P0(float f) {
        return this.subcomposeMeasureScope.P0(f);
    }

    @Override // com.google.inputmethod.f43
    public long S(long j) {
        return this.subcomposeMeasureScope.S(j);
    }

    @Override // com.google.inputmethod.f43
    public float T1(long j) {
        return this.subcomposeMeasureScope.T1(j);
    }

    @Override // com.google.inputmethod.hm4
    public float U(long j) {
        return this.subcomposeMeasureScope.U(j);
    }

    @Override // com.google.inputmethod.f43
    public long X(int i) {
        return this.subcomposeMeasureScope.X(i);
    }

    @Override // com.google.inputmethod.f43
    public long Y(float f) {
        return this.subcomposeMeasureScope.Y(f);
    }

    @Override // com.google.inputmethod.f43
    public long b1(long j) {
        return this.subcomposeMeasureScope.b1(j);
    }

    @Override // com.google.inputmethod.f43
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // com.google.inputmethod.h66
    public LayoutDirection getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.j
    public fj7 h2(int width, int height, Map<uc, Integer> alignmentLines, Function1<? super o.a, Unit> placementBlock) {
        return this.subcomposeMeasureScope.h2(width, height, alignmentLines, placementBlock);
    }

    @Override // com.google.inputmethod.hm4
    public long s1(float f) {
        return this.subcomposeMeasureScope.s1(f);
    }

    @Override // com.google.inputmethod.hm4
    /* JADX INFO: renamed from: w2 */
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // com.google.inputmethod.f43
    public float x2(float f) {
        return this.subcomposeMeasureScope.x2(f);
    }
}
