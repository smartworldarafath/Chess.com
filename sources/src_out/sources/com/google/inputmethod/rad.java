package com.google.inputmethod;

import androidx.compose.p001foundation.layout.c;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.sh7;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJK\u0010\u0019\u001a\u00020\u0018*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010 \u001a\u00020\u0018*\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010#\u001a\u00020\b*\u00020!2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\"0\u001b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J)\u0010&\u001a\u00020\b*\u00020!2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\"0\u001b2\u0006\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010$J)\u0010'\u001a\u00020\b*\u00020!2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\"0\u001b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010$J)\u0010(\u001a\u00020\b*\u00020!2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\"0\u001b2\u0006\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/google/android/rad;", "Lcom/google/android/ej7;", "Lcom/google/android/hh4;", "scrolledOffset", "Landroidx/compose/foundation/layout/c$n;", "titleVerticalArrangement", "Lcom/google/android/tc$b;", "titleHorizontalAlignment", "", "titleBottomPadding", "Lcom/google/android/ff3;", "height", "<init>", "(Lcom/google/android/hh4;Landroidx/compose/foundation/layout/c$n;Lcom/google/android/tc$b;IFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/kx1;", "constraints", "layoutHeight", "maxLayoutHeight", "Landroidx/compose/ui/layout/o;", "navigationIconPlaceable", "titlePlaceable", "actionIconsPlaceable", "titleBaseline", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;JIILandroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;I)Lcom/google/android/fj7;", "", "Lcom/google/android/dj7;", "measurables", "measure-3p2s80s", "(Landroidx/compose/ui/layout/j;Ljava/util/List;J)Lcom/google/android/fj7;", "measure", "Lcom/google/android/h66;", "Lcom/google/android/f66;", "minIntrinsicWidth", "(Lcom/google/android/h66;Ljava/util/List;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "a", "Lcom/google/android/hh4;", "getScrolledOffset", "()Lcom/google/android/hh4;", "Landroidx/compose/foundation/layout/c$n;", "getTitleVerticalArrangement", "()Landroidx/compose/foundation/layout/c$n;", "c", "Lcom/google/android/tc$b;", "getTitleHorizontalAlignment", "()Lcom/google/android/tc$b;", "d", "I", "getTitleBottomPadding", "()I", "e", "F", "getHeight-D9Ej5fM", "()F", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class rad implements ej7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final hh4 scrolledOffset;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final c.n titleVerticalArrangement;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final tc.b titleHorizontalAlignment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int titleBottomPadding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float height;

    public /* synthetic */ rad(hh4 hh4Var, c.n nVar, tc.b bVar, int i, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(hh4Var, nVar, bVar, i, f);
    }

    private final fj7 b(final j jVar, final long j, final int i, final int i2, final o oVar, final o oVar2, final o oVar3, final int i3) {
        return j.Q1(jVar, kx1.l(j), i, null, new Function1() { // from class: com.google.android.qad
            public final Object invoke(Object obj) {
                return rad.c(oVar, i, oVar2, oVar3, j, jVar, this, i3, i2, (o.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0068  */
    /* JADX WARN: Code duplicated, block: B:14:0x0072  */
    /* JADX WARN: Code duplicated, block: B:16:0x007d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX WARN: Code duplicated, block: B:19:0x0088  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    public static final Unit c(o oVar, int i, o oVar2, o oVar3, long j, j jVar, rad radVar, int i2, int i3, o.a aVar) {
        int iL;
        c.n nVar;
        c cVar;
        boolean zE;
        int i4;
        int i5;
        int height;
        int height2;
        int height3;
        o.a.L(aVar, oVar, 0, (i - oVar.getHeight()) / 2, 0.0f, 4, null);
        int iMax = Math.max(jVar.O1(zu.k), oVar.getWidth());
        int width = oVar3.getWidth();
        int iA = radVar.titleHorizontalAlignment.a(oVar2.getWidth(), kx1.l(j), LayoutDirection.Ltr);
        if (iA >= iMax) {
            if (oVar2.getWidth() + iA > kx1.l(j) - width) {
                iL = (kx1.l(j) - width) - (oVar2.getWidth() + iA);
            }
            int i6 = iA;
            nVar = radVar.titleVerticalArrangement;
            cVar = c.a;
            if (Intrinsics.e(nVar, cVar.e())) {
                zE = Intrinsics.e(nVar, cVar.d());
                i4 = 0;
                if (zE) {
                    i5 = radVar.titleBottomPadding;
                    if (i5 == 0) {
                        height3 = i - oVar2.getHeight();
                    } else {
                        height = i5 - (oVar2.getHeight() - i2);
                        height2 = oVar2.getHeight() + height;
                        if (height2 > i3) {
                            height -= height2 - i3;
                        }
                        height3 = (i - oVar2.getHeight()) - Math.max(0, height);
                    }
                }
                o.a.L(aVar, oVar2, i6, i4, 0.0f, 4, null);
                o.a.L(aVar, oVar3, kx1.l(j) - oVar3.getWidth(), (i - oVar3.getHeight()) / 2, 0.0f, 4, null);
                return Unit.a;
            }
            height3 = (i - oVar2.getHeight()) / 2;
            i4 = height3;
            o.a.L(aVar, oVar2, i6, i4, 0.0f, 4, null);
            o.a.L(aVar, oVar3, kx1.l(j) - oVar3.getWidth(), (i - oVar3.getHeight()) / 2, 0.0f, 4, null);
            return Unit.a;
        }
        iL = iMax - iA;
        iA += iL;
        int i7 = iA;
        nVar = radVar.titleVerticalArrangement;
        cVar = c.a;
        if (Intrinsics.e(nVar, cVar.e())) {
            zE = Intrinsics.e(nVar, cVar.d());
            i4 = 0;
            if (zE) {
                i5 = radVar.titleBottomPadding;
                if (i5 == 0) {
                    height3 = i - oVar2.getHeight();
                } else {
                    height = i5 - (oVar2.getHeight() - i2);
                    height2 = oVar2.getHeight() + height;
                    if (height2 > i3) {
                        height -= height2 - i3;
                    }
                    height3 = (i - oVar2.getHeight()) - Math.max(0, height);
                }
            }
            o.a.L(aVar, oVar2, i7, i4, 0.0f, 4, null);
            o.a.L(aVar, oVar3, kx1.l(j) - oVar3.getWidth(), (i - oVar3.getHeight()) / 2, 0.0f, 4, null);
            return Unit.a;
        }
        height3 = (i - oVar2.getHeight()) / 2;
        i4 = height3;
        o.a.L(aVar, oVar2, i7, i4, 0.0f, 4, null);
        o.a.L(aVar, oVar3, kx1.l(j) - oVar3.getWidth(), (i - oVar3.getHeight()) / 2, 0.0f, 4, null);
        return Unit.a;
    }

    @Override // com.google.inputmethod.ej7
    public int maxIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i) {
        Integer num;
        int iO1 = h66Var.O1(this.height);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(list.get(0).W(i));
            int iR = m.r(list);
            int i2 = 1;
            if (1 <= iR) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).W(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iR) {
                        break;
                    }
                    i2++;
                }
            }
            num = numValueOf;
        }
        return Math.max(iO1, num != null ? num.intValue() : 0);
    }

    @Override // com.google.inputmethod.ej7
    public int maxIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i) {
        int size = list.size();
        int iQ0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iQ0 += list.get(i2).q0(i);
        }
        return iQ0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.ej7
    /* JADX INFO: renamed from: measure-3p2s80s */
    public fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) throws KotlinNothingValueException {
        int iE;
        int i;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            dj7 dj7Var = list.get(i2);
            if (Intrinsics.e(pn6.a(dj7Var), "navigationIcon")) {
                o oVarR0 = dj7Var.r0(kx1.d(j, 0, 0, 0, 0, 14, null));
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    dj7 dj7Var2 = list.get(i3);
                    if (Intrinsics.e(pn6.a(dj7Var2), "actionIcons")) {
                        o oVarR1 = dj7Var2.r0(kx1.d(j, 0, 0, 0, 0, 14, null));
                        int iL = kx1.l(j) == Integer.MAX_VALUE ? kx1.l(j) : g.e((kx1.l(j) - oVarR0.getWidth()) - oVarR1.getWidth(), 0);
                        int size3 = list.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            dj7 dj7Var3 = list.get(i4);
                            if (Intrinsics.e(pn6.a(dj7Var3), "title")) {
                                o oVarR2 = dj7Var3.r0(kx1.d(j, 0, iL, 0, 0, 12, null));
                                int iJ = oVarR2.J(AlignmentLineKt.b()) != Integer.MIN_VALUE ? oVarR2.J(AlignmentLineKt.b()) : 0;
                                float fInvoke = this.scrolledOffset.invoke();
                                int iD = Float.isNaN(fInvoke) ? 0 : sh7.d(fInvoke);
                                int iMax = Math.max(jVar.O1(this.height), oVarR2.getHeight());
                                if (kx1.k(j) == Integer.MAX_VALUE) {
                                    iE = iMax;
                                    i = iE;
                                } else {
                                    iE = g.e(iD + iMax, 0);
                                    i = iMax;
                                }
                                return this.b(jVar, j, iE, i, oVarR0, oVarR2, oVarR1, iJ);
                            }
                            i4++;
                            this = this;
                        }
                        m47.f("Collection contains no element matching the predicate.");
                        throw new KotlinNothingValueException();
                    }
                    i3++;
                    this = this;
                }
                m47.f("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
        }
        m47.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // com.google.inputmethod.ej7
    public int minIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i) {
        Integer num;
        int iO1 = h66Var.O1(this.height);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(list.get(0).d0(i));
            int iR = m.r(list);
            int i2 = 1;
            if (1 <= iR) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).d0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iR) {
                        break;
                    }
                    i2++;
                }
            }
            num = numValueOf;
        }
        return Math.max(iO1, num != null ? num.intValue() : 0);
    }

    @Override // com.google.inputmethod.ej7
    public int minIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i) {
        int size = list.size();
        int iO0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iO0 += list.get(i2).o0(i);
        }
        return iO0;
    }

    private rad(hh4 hh4Var, c.n nVar, tc.b bVar, int i, float f) {
        this.scrolledOffset = hh4Var;
        this.titleVerticalArrangement = nVar;
        this.titleHorizontalAlignment = bVar;
        this.titleBottomPadding = i;
        this.height = f;
    }
}
