package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.gestures.snapping.j;
import androidx.compose.p001foundation.layout.c;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.ps4;
import com.google.android.ta2;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0003\u001a\u0085\u0002\u0010-\u001a\u00020,*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2*\u0010(\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$\u0012\u0004\u0012\u00020'0#2\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00190)H\u0000¢\u0006\u0004\b-\u0010.\u001aO\u00103\u001a\b\u0012\u0004\u0012\u0002010\u00192\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002010$H\u0002¢\u0006\u0004\b3\u00104\u001aG\u00106\u001a\b\u0012\u0004\u0012\u0002010\u00192\u0006\u00105\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002010$H\u0002¢\u0006\u0004\b6\u00107\u001aO\u0010;\u001a\u0004\u0018\u0001012\u0006\u00108\u001a\u00020\u00012\f\u00109\u001a\b\u0012\u0004\u0012\u0002010\u00192\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b;\u0010<\u001a{\u0010A\u001a\u000201*\u00020\u00002\u0006\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00012\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00190)H\u0002¢\u0006\u0004\bA\u0010B\u001a\u0093\u0001\u0010L\u001a\b\u0012\u0004\u0012\u0002010K*\u00020\u00002\f\u0010C\u001a\b\u0012\u0004\u0012\u0002010\u00192\f\u0010D\u001a\b\u0012\u0004\u0012\u0002010\u00192\f\u0010E\u001a\b\u0012\u0004\u0012\u0002010\u00192\u0006\u0010F\u001a\u00020\u00012\u0006\u0010G\u001a\u00020\u00012\u0006\u0010H\u001a\u00020\u00012\u0006\u0010I\u001a\u00020\u00012\u0006\u0010J\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0002¢\u0006\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lcom/google/android/wt6;", "", "pageCount", "Lcom/google/android/az8;", "pagerItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenPages", "currentPage", "currentPageOffset", "Lcom/google/android/kx1;", "constraints", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lcom/google/android/tc$c;", "verticalAlignment", "Lcom/google/android/tc$b;", "horizontalAlignment", "", "reverseLayout", "Lcom/google/android/g16;", "visualPageOffset", "pageAvailableSize", "beyondViewportPageCount", "", "pinnedPages", "Landroidx/compose/foundation/gestures/snapping/j;", "snapPosition", "Lcom/google/android/gn8;", "placementScopeInvalidator", "Lcom/google/android/ta2;", "coroutineScope", "Lcom/google/android/f43;", "density", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/o$a;", "", "Lcom/google/android/fj7;", "layout", "Lcom/google/android/o48;", "Landroidx/compose/ui/layout/o;", "placeablesCache", "Lcom/google/android/jz8;", "l", "(Lcom/google/android/wt6;ILcom/google/android/az8;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Lcom/google/android/tc$c;Lcom/google/android/tc$b;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/j;Lcom/google/android/o58;Lcom/google/android/ta2;Lcom/google/android/f43;Lcom/google/android/ps4;Lcom/google/android/o48;)Lcom/google/android/jz8;", "currentLastPage", "pagesCount", "Lcom/google/android/jj7;", "getAndMeasure", "i", "(IIILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "currentFirstPage", "j", "(IILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "viewportSize", "visiblePagesInfo", "itemSize", "f", "(ILjava/util/List;IIILandroidx/compose/foundation/gestures/snapping/j;I)Lcom/google/android/jj7;", "index", "childConstraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "k", "(Lcom/google/android/wt6;IJLcom/google/android/az8;JLandroidx/compose/foundation/gestures/Orientation;Lcom/google/android/tc$b;Lcom/google/android/tc$c;Landroidx/compose/ui/unit/LayoutDirection;ZILcom/google/android/o48;)Lcom/google/android/jj7;", "pages", "extraPagesBefore", "extraPagesAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "pagesScrollOffset", "", "g", "(Lcom/google/android/wt6;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIILandroidx/compose/foundation/gestures/Orientation;ZLcom/google/android/f43;II)Ljava/util/List;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class gz8 {
    private static final jj7 f(int i, List<jj7> list, int i2, int i3, int i4, j jVar, int i5) {
        jj7 jj7Var;
        if (list.isEmpty()) {
            jj7Var = null;
        } else {
            jj7 jj7Var2 = list.get(0);
            jj7 jj7Var3 = jj7Var2;
            float f = -Math.abs(cwb.a(i, i2, i3, i4, jj7Var3.getOffset(), jj7Var3.getIndex(), jVar, i5));
            int iR = m.r(list);
            if (1 <= iR) {
                int i6 = 1;
                while (true) {
                    jj7 jj7Var4 = list.get(i6);
                    jj7 jj7Var5 = jj7Var4;
                    float f2 = -Math.abs(cwb.a(i, i2, i3, i4, jj7Var5.getOffset(), jj7Var5.getIndex(), jVar, i5));
                    if (Float.compare(f, f2) < 0) {
                        f = f2;
                        jj7Var2 = jj7Var4;
                    }
                    if (i6 == iR) {
                        break;
                    }
                    i6++;
                }
            }
            jj7Var = jj7Var2;
        }
        return jj7Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private static final List<jj7> g(wt6 wt6Var, List<jj7> list, List<jj7> list2, List<jj7> list3, int i, int i2, int i3, int i4, int i5, Orientation orientation, boolean z, f43 f43Var, int i6, int i7) throws KotlinNothingValueException {
        int i8 = i5;
        int i9 = i7 + i6;
        int i10 = orientation == Orientation.Vertical ? i2 : i;
        int i11 = 0;
        boolean z2 = i3 < Math.min(i10, i4);
        if (z2) {
            if (!(i8 == 0)) {
                cx5.c("non-zero pagesScrollOffset=" + i8);
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z2) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                cx5.a("No extra pages");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i11 < size) {
                iArr[i11] = i7;
                i11++;
            }
            int[] iArr2 = new int[size];
            c.f fVarE = c.a.a.e(wt6Var.O0(i6));
            if (orientation == Orientation.Vertical) {
                fVarE.arrange(f43Var, i10, iArr, iArr2);
            } else {
                fVarE.a(f43Var, i10, iArr, LayoutDirection.Ltr, iArr2);
            }
            d dVarR0 = f.r0(iArr2);
            if (z) {
                dVarR0 = g.y(dVarR0);
            }
            int iF = dVarR0.f();
            int i12 = dVarR0.i();
            int iJ = dVarR0.j();
            if ((iJ > 0 && iF <= i12) || (iJ < 0 && i12 <= iF)) {
                while (true) {
                    int size2 = iArr2[iF];
                    jj7 jj7Var = list.get(h(iF, z, size));
                    if (z) {
                        size2 = (i10 - size2) - jj7Var.getSize();
                    }
                    jj7Var.h(size2, i, i2);
                    arrayList.add(jj7Var);
                    if (iF == i12) {
                        break;
                    }
                    iF += iJ;
                }
            }
        } else {
            int size3 = list2.size();
            int i13 = i8;
            for (int i14 = 0; i14 < size3; i14++) {
                jj7 jj7Var2 = list2.get(i14);
                i13 -= i9;
                jj7Var2.h(i13, i, i2);
                arrayList.add(jj7Var2);
            }
            int size4 = list.size();
            for (int i15 = 0; i15 < size4; i15++) {
                jj7 jj7Var3 = list.get(i15);
                jj7Var3.h(i8, i, i2);
                arrayList.add(jj7Var3);
                i8 += i9;
            }
            int size5 = list3.size();
            while (i11 < size5) {
                jj7 jj7Var4 = list3.get(i11);
                jj7Var4.h(i8, i, i2);
                arrayList.add(jj7Var4);
                i8 += i9;
                i11++;
            }
        }
        return arrayList;
    }

    private static final int h(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    private static final List<jj7> i(int i, int i2, int i3, List<Integer> list, Function1<? super Integer, jj7> function1) {
        int iMin = Math.min(i3, (i2 - i) - 1) + i;
        int i4 = i + 1;
        ArrayList arrayList = null;
        if (i4 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i4)));
                if (i4 == iMin) {
                    break;
                }
                i4++;
            }
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int iIntValue = list.get(i5).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? m.p() : arrayList;
    }

    private static final List<jj7> j(int i, int i2, List<Integer> list, Function1<? super Integer, jj7> function1) {
        int iMax = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (iMax <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i3)));
                if (i3 == iMax) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int iIntValue = list.get(i4).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? m.p() : arrayList;
    }

    private static final jj7 k(wt6 wt6Var, int i, long j, az8 az8Var, long j2, Orientation orientation, tc.b bVar, tc.c cVar, LayoutDirection layoutDirection, boolean z, int i2, o48<List<o>> o48Var) {
        List<o> list;
        Object objD = az8Var.d(i);
        List<o> listB = o48Var.b(i);
        if (listB != null) {
            list = listB;
        } else {
            List<dj7> listC2 = wt6Var.C2(i);
            int size = listC2.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(listC2.get(i3).r0(j));
            }
            o48Var.r(i, arrayList);
            list = arrayList;
        }
        return new jj7(i, i2, list, j2, objD, orientation, bVar, cVar, layoutDirection, z, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final jz8 l(final wt6 wt6Var, int i, final az8 az8Var, int i2, int i3, int i4, int i5, int i6, int i7, long j, final Orientation orientation, final tc.c cVar, final tc.b bVar, final boolean z, final long j2, final int i8, int i9, List<Integer> list, j jVar, final o58<Unit> o58Var, ta2 ta2Var, f43 f43Var, ps4<? super Integer, ? super Integer, ? super Function1<? super o.a, Unit>, ? extends fj7> ps4Var, final o48<List<o>> o48Var) throws KotlinNothingValueException {
        int i10;
        boolean z2;
        int iMax;
        int i11;
        int i12;
        int i13;
        jj7 jj7Var;
        List<jj7> list2;
        List arrayList;
        List arrayList2;
        int i14;
        if (!(i3 >= 0)) {
            cx5.a("negative beforeContentPadding");
        }
        if (!(i4 >= 0)) {
            cx5.a("negative afterContentPadding");
        }
        int iE = g.e(i8 + i5, 0);
        int iJ = g.j(i9, i);
        Orientation orientation2 = Orientation.Vertical;
        final long jB = nx1.b(0, orientation == orientation2 ? kx1.l(j) : i8, 0, orientation != orientation2 ? kx1.k(j) : i8, 5, null);
        if (i <= 0) {
            return new jz8(m.p(), i8, i5, i4, orientation, -i3, i2 + i4, false, iJ, null, null, 0.0f, 0, false, jVar, (fj7) ps4Var.invoke(Integer.valueOf(kx1.n(j)), Integer.valueOf(kx1.m(j)), new Function1() { // from class: com.google.android.bz8
                public final Object invoke(Object obj) {
                    return gz8.q((o.a) obj);
                }
            }), false, null, null, ta2Var, f43Var, jB, 393216, null);
        }
        int i15 = iJ;
        int i16 = i6;
        int i17 = i7;
        while (i16 > 0 && i17 > 0) {
            i16--;
            i17 -= iE;
        }
        int i18 = i17 * (-1);
        if (i16 >= i) {
            i16 = i - 1;
            i18 = 0;
        }
        e eVar = new e();
        int i19 = -i3;
        int i20 = (i5 < 0 ? i5 : 0) + i19;
        int i21 = i18 + i20;
        int iMax2 = 0;
        while (i21 < 0 && i16 > 0) {
            int i22 = i16 - 1;
            jj7 jj7VarK = k(wt6Var, i22, jB, az8Var, j2, orientation, bVar, cVar, wt6Var.getLayoutDirection(), z, i8, o48Var);
            eVar.add(0, jj7VarK);
            iMax2 = Math.max(iMax2, jj7VarK.getCrossAxisSize());
            i21 += iE;
            i16 = i22;
        }
        if (i21 < i20) {
            i21 = i20;
        }
        int i23 = i21 - i20;
        int i24 = i2 + i4;
        int i25 = i16;
        int iE2 = g.e(i24, 0);
        int i26 = -i23;
        int i27 = i25;
        int i28 = 0;
        boolean z3 = false;
        while (i28 < eVar.size()) {
            if (i26 >= iE2) {
                eVar.remove(i28);
                Unit unit = Unit.a;
                z3 = true;
            } else {
                i27++;
                i26 += iE;
                i28++;
            }
        }
        int i29 = i23;
        int i30 = i27;
        boolean z4 = z3;
        while (i30 < i && (i26 < iE2 || i26 <= 0 || eVar.isEmpty())) {
            int i31 = iE2;
            int i32 = i30;
            int iMax3 = iMax2;
            jj7 jj7VarK2 = k(wt6Var, i32, jB, az8Var, j2, orientation, bVar, cVar, wt6Var.getLayoutDirection(), z, i8, o48Var);
            int i33 = i29;
            int i34 = i - 1;
            i26 += i32 == i34 ? i8 : iE;
            if (i26 > i20 || i32 == i34) {
                iMax3 = Math.max(iMax3, jj7VarK2.getCrossAxisSize());
                eVar.add(jj7VarK2);
                i14 = i25;
                i29 = i33;
            } else {
                i14 = i32 + 1;
                i29 = i33 - iE;
                Unit unit2 = Unit.a;
                z4 = true;
            }
            iMax2 = iMax3;
            i30 = i32 + 1;
            i25 = i14;
            iE2 = i31;
        }
        int i35 = iMax2;
        int i36 = i30;
        int i37 = i29;
        if (i26 < i2) {
            int i38 = i2 - i26;
            i11 = i37 - i38;
            i26 += i38;
            iMax = i35;
            i12 = i25;
            while (i11 < i3 && i12 > 0) {
                int i39 = i12 - 1;
                jj7 jj7VarK3 = k(wt6Var, i39, jB, az8Var, j2, orientation, bVar, cVar, wt6Var.getLayoutDirection(), z, i8, o48Var);
                eVar.add(0, jj7VarK3);
                iMax = Math.max(iMax, jj7VarK3.getCrossAxisSize());
                i11 += iE;
                i36 = i36;
                i12 = i39;
            }
            i10 = i36;
            z2 = false;
            if (i11 < 0) {
                i26 += i11;
                i11 = 0;
            }
        } else {
            i10 = i36;
            z2 = false;
            iMax = i35;
            i11 = i37;
            i12 = i25;
        }
        if (!(i11 >= 0 ? true : z2)) {
            cx5.a("invalid currentFirstPageScrollOffset");
        }
        int i40 = iMax;
        int i41 = -i11;
        jj7 jj7Var2 = (jj7) eVar.first();
        if (i3 > 0 || i5 < 0) {
            int size = eVar.size();
            i13 = i41;
            int i42 = 0;
            while (i42 < size && i11 != 0 && iE <= i11 && i42 != m.r(eVar)) {
                i11 -= iE;
                i42++;
                jj7Var2 = (jj7) eVar.get(i42);
            }
        } else {
            i13 = i41;
        }
        int i43 = i11;
        jj7 jj7Var3 = jj7Var2;
        List<jj7> listJ = j(i12, i15, list, new Function1() { // from class: com.google.android.cz8
            public final Object invoke(Object obj) {
                return gz8.m(wt6Var, jB, az8Var, j2, orientation, bVar, cVar, z, i8, o48Var, ((Integer) obj).intValue());
            }
        });
        int size2 = listJ.size();
        int iMax4 = i40;
        int i44 = 0;
        while (i44 < size2) {
            iMax4 = Math.max(iMax4, listJ.get(i44).getCrossAxisSize());
            i44++;
            listJ = listJ;
        }
        List<jj7> list3 = listJ;
        List<jj7> listI = i(((jj7) eVar.last()).getIndex(), i, i15, list, new Function1() { // from class: com.google.android.dz8
            public final Object invoke(Object obj) {
                return gz8.n(wt6Var, jB, az8Var, j2, orientation, bVar, cVar, z, i8, o48Var, ((Integer) obj).intValue());
            }
        });
        int size3 = listI.size();
        int i45 = 0;
        while (i45 < size3) {
            iMax4 = Math.max(iMax4, listI.get(i45).getCrossAxisSize());
            i45++;
            i15 = i15;
        }
        int i46 = i15;
        boolean z5 = Intrinsics.e(jj7Var3, eVar.first()) && list3.isEmpty() && listI.isEmpty();
        Orientation orientation3 = Orientation.Vertical;
        int iG = nx1.g(j, orientation == orientation3 ? iMax4 : i26);
        if (orientation == orientation3) {
            iMax4 = i26;
        }
        int iF = nx1.f(j, iMax4);
        int i47 = iE;
        int i48 = i10;
        int i49 = i26;
        final List<jj7> listG = g(wt6Var, eVar, list3, listI, iG, iF, i49, i2, i13, orientation, z, wt6Var, i5, i8);
        if (z5) {
            jj7Var = jj7Var3;
            list2 = listG;
        } else {
            ArrayList arrayList3 = new ArrayList(listG.size());
            int size4 = listG.size();
            int i50 = 0;
            while (i50 < size4) {
                jj7 jj7Var4 = listG.get(i50);
                jj7 jj7Var5 = jj7Var4;
                jj7 jj7Var6 = jj7Var3;
                int i51 = i47;
                if (jj7Var5.getIndex() >= ((jj7) eVar.first()).getIndex() && jj7Var5.getIndex() <= ((jj7) eVar.last()).getIndex()) {
                    arrayList3.add(jj7Var4);
                }
                i50++;
                i47 = i51;
                jj7Var3 = jj7Var6;
            }
            jj7Var = jj7Var3;
            list2 = arrayList3;
        }
        int i52 = i47;
        if (list3.isEmpty()) {
            arrayList = m.p();
        } else {
            arrayList = new ArrayList(listG.size());
            int size5 = listG.size();
            for (int i53 = 0; i53 < size5; i53++) {
                jj7 jj7Var7 = listG.get(i53);
                if (jj7Var7.getIndex() < ((jj7) eVar.first()).getIndex()) {
                    arrayList.add(jj7Var7);
                }
            }
        }
        List list4 = arrayList;
        if (listI.isEmpty()) {
            arrayList2 = m.p();
        } else {
            arrayList2 = new ArrayList(listG.size());
            int size6 = listG.size();
            for (int i54 = 0; i54 < size6; i54++) {
                jj7 jj7Var8 = listG.get(i54);
                if (jj7Var8.getIndex() > ((jj7) eVar.last()).getIndex()) {
                    arrayList2.add(jj7Var8);
                }
            }
        }
        List list5 = arrayList2;
        int i55 = i2 + i3 + i4;
        jj7 jj7VarF = f(i55, list2, i3, i4, i8, jVar, i);
        return new jz8(list2, i8, i5, i4, orientation, i19, i24, z, i46, jj7Var, jj7VarF, i52 == 0 ? 0.0f : g.n((jVar.a(i55, i8, i3, i4, jj7VarF != null ? jj7VarF.getIndex() : 0, i) - (jj7VarF != null ? jj7VarF.getOffset() : 0)) / i52, -0.5f, 0.5f), i43, i48 < i || i49 > i2, jVar, (fj7) ps4Var.invoke(Integer.valueOf(iG), Integer.valueOf(iF), new Function1() { // from class: com.google.android.ez8
            public final Object invoke(Object obj) {
                return gz8.o(o58Var, listG, (o.a) obj);
            }
        }), z4, list4, list5, ta2Var, f43Var, jB, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jj7 m(wt6 wt6Var, long j, az8 az8Var, long j2, Orientation orientation, tc.b bVar, tc.c cVar, boolean z, int i, o48 o48Var, int i2) {
        return k(wt6Var, i2, j, az8Var, j2, orientation, bVar, cVar, wt6Var.getLayoutDirection(), z, i, o48Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jj7 n(wt6 wt6Var, long j, az8 az8Var, long j2, Orientation orientation, tc.b bVar, tc.c cVar, boolean z, int i, o48 o48Var, int i2) {
        return k(wt6Var, i2, j, az8Var, j2, orientation, bVar, cVar, wt6Var.getLayoutDirection(), z, i, o48Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(o58 o58Var, final List list, o.a aVar) {
        aVar.k0(new Function1() { // from class: com.google.android.fz8
            public final Object invoke(Object obj) {
                return gz8.p(list, (o.a) obj);
            }
        });
        gn8.a(o58Var);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(List list, o.a aVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((jj7) list.get(i)).g(aVar);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(o.a aVar) {
        return Unit.a;
    }
}
