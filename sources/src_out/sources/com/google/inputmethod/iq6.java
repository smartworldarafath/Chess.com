package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.layout.c;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.ps4;
import com.google.android.sh7;
import com.google.android.ta2;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.e;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.d;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u001aÙ\u0002\u00105\u001a\u0002042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2$\u0010+\u001a \u0012\u0004\u0012\u00020\u0000\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0*0\u001d0)2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000)2\b\u0010.\u001a\u0004\u0018\u00010-2*\u00103\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010)\u0012\u0004\u0012\u0002020/H\u0000¢\u0006\u0004\b5\u00106\u001aM\u0010;\u001a\b\u0012\u0004\u0012\u0002080\u001d2\u0006\u00107\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00102\f\u00109\u001a\b\u0012\u0004\u0012\u0002080\u001d2\b\u0010:\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b;\u0010<\u001a\u0093\u0001\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001a0E2\f\u0010=\u001a\b\u0012\u0004\u0012\u0002080\u001d2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bF\u0010G\u001a-\u0010K\u001a\u000201\"\u0004\b\u0000\u0010H*\b\u0012\u0004\u0012\u00028\u00000E2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000IH\u0002¢\u0006\u0004\bK\u0010L¨\u0006M"}, d2 = {"", "itemsCount", "Lcom/google/android/nq6;", "measuredLineProvider", "Lcom/google/android/lq6;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "Lcom/google/android/kx1;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/c$n;", "verticalArrangement", "Landroidx/compose/foundation/layout/c$e;", "horizontalArrangement", "reverseLayout", "Lcom/google/android/f43;", "density", "Landroidx/compose/foundation/lazy/layout/d;", "Lcom/google/android/kq6;", "itemAnimator", "slotsPerLine", "", "pinnedItems", "isInLookaheadScope", "isLookingAhead", "Lcom/google/android/cq6;", "approachLayoutInfo", "Lcom/google/android/ta2;", "coroutineScope", "Lcom/google/android/gn8;", "placementScopeInvalidator", "Lcom/google/android/i05;", "graphicsContext", "Lkotlin/Function1;", "Lkotlin/Pair;", "prefetchInfoRetriever", "lineIndexProvider", "Lcom/google/android/d9c;", "stickyItemsScrollBehavior", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/o$a;", "", "Lcom/google/android/fj7;", "layout", "Lcom/google/android/jq6;", "i", "(ILcom/google/android/nq6;Lcom/google/android/lq6;IIIIIIFJZLandroidx/compose/foundation/layout/c$n;Landroidx/compose/foundation/layout/c$e;ZLcom/google/android/f43;Landroidx/compose/foundation/lazy/layout/d;ILjava/util/List;ZZLcom/google/android/cq6;Lcom/google/android/ta2;Lcom/google/android/o58;Lcom/google/android/i05;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/google/android/d9c;Lcom/google/android/ps4;)Lcom/google/android/jq6;", "lastVisibleItemIndex", "Lcom/google/android/mq6;", "visibleLines", "lastApproachLayoutInfo", "h", "(IILcom/google/android/nq6;ZLjava/util/List;Lcom/google/android/cq6;)Ljava/util/List;", "lines", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "", "f", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/c$n;Landroidx/compose/foundation/layout/c$e;ZLcom/google/android/f43;)Ljava/util/List;", "T", "", "arr", "e", "(Ljava/util/List;[Ljava/lang/Object;)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class iq6 {
    private static final <T> void e(List<T> list, T[] tArr) {
        for (T t : tArr) {
            list.add(t);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private static final List<kq6> f(List<mq6> list, List<kq6> list2, List<kq6> list3, int i, int i2, int i3, int i4, int i5, boolean z, c.n nVar, c.e eVar, boolean z2, f43 f43Var) throws KotlinNothingValueException {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3) {
            if (!(i5 == 0)) {
                cx5.c("non-zero firstLineScrollOffset");
            }
        }
        int size = list.size();
        int length = 0;
        for (int i7 = 0; i7 < size; i7++) {
            length += list.get(i7).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z3) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                cx5.a("no items");
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i8 = 0; i8 < size2; i8++) {
                iArr[i8] = list.get(g(i8, z2, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            if (z) {
                if (nVar == null) {
                    cx5.b("null verticalArrangement");
                    throw new KotlinNothingValueException();
                }
                nVar.arrange(f43Var, i6, iArr, iArr2);
            } else {
                if (eVar == null) {
                    cx5.b("null horizontalArrangement");
                    throw new KotlinNothingValueException();
                }
                eVar.a(f43Var, i6, iArr, LayoutDirection.Ltr, iArr2);
            }
            d dVarR0 = f.r0(iArr2);
            if (z2) {
                dVarR0 = g.y(dVarR0);
            }
            int iF = dVarR0.f();
            int i9 = dVarR0.i();
            int iJ = dVarR0.j();
            if ((iJ > 0 && iF <= i9) || (iJ < 0 && i9 <= iF)) {
                while (true) {
                    int mainAxisSize = iArr2[iF];
                    mq6 mq6Var = list.get(g(iF, z2, size2));
                    if (z2) {
                        mainAxisSize = (i6 - mainAxisSize) - mq6Var.getMainAxisSize();
                    }
                    e(arrayList, mq6Var.f(mainAxisSize, i, i2));
                    if (iF == i9) {
                        break;
                    }
                    iF += iJ;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int mainAxisSizeWithSpacings = i5;
                while (true) {
                    int i10 = size3 - 1;
                    kq6 kq6Var = list2.get(size3);
                    mainAxisSizeWithSpacings -= kq6Var.getMainAxisSizeWithSpacings();
                    kq6Var.i(mainAxisSizeWithSpacings, 0, i, i2);
                    arrayList.add(kq6Var);
                    if (i10 < 0) {
                        break;
                    }
                    size3 = i10;
                }
            }
            int size4 = list.size();
            int mainAxisSizeWithSpacings2 = i5;
            for (int i11 = 0; i11 < size4; i11++) {
                mq6 mq6Var2 = list.get(i11);
                e(arrayList, mq6Var2.f(mainAxisSizeWithSpacings2, i, i2));
                mainAxisSizeWithSpacings2 += mq6Var2.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i12 = 0; i12 < size5; i12++) {
                kq6 kq6Var2 = list3.get(i12);
                kq6Var2.i(mainAxisSizeWithSpacings2, 0, i, i2);
                arrayList.add(kq6Var2);
                mainAxisSizeWithSpacings2 += kq6Var2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int g(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    private static final List<mq6> h(int i, int i2, nq6 nq6Var, boolean z, List<mq6> list, cq6 cq6Var) {
        pp6 pp6Var;
        int index;
        int iMin;
        ArrayList arrayList = null;
        if (z && cq6Var != null && !cq6Var.h().isEmpty()) {
            List<pp6> listH = cq6Var.h();
            int size = listH.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    pp6Var = null;
                    break;
                }
                if (listH.get(size).getIndex() > i && (size == 0 || listH.get(size - 1).getIndex() <= i)) {
                    pp6Var = listH.get(size);
                    break;
                }
            }
            pp6 pp6Var2 = (pp6) m.L0(cq6Var.h());
            mq6 mq6Var = (mq6) m.N0(list);
            int index2 = mq6Var != null ? mq6Var.getIndex() + 1 : 0;
            if (pp6Var != null && (index = pp6Var.getIndex()) <= (iMin = Math.min(pp6Var2.getIndex(), i2 - 1))) {
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                                kq6[] items = arrayList.get(i3).getItems();
                                int length = items.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= length) {
                                        i3++;
                                    } else if (items[i4].getIndex() != index) {
                                        i4++;
                                    }
                                }
                            } else {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                mq6 mq6VarC = nq6Var.c(index2);
                                index2++;
                                arrayList.add(mq6VarC);
                            }
                        }
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        mq6 mq6VarC2 = nq6Var.c(index2);
                        index2++;
                        arrayList.add(mq6VarC2);
                    }
                    if (index == iMin) {
                        break;
                    }
                    index++;
                }
            }
        }
        return arrayList == null ? m.p() : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:188:0x0412  */
    public static final jq6 i(int i, final nq6 nq6Var, final lq6 lq6Var, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, c.n nVar, c.e eVar, boolean z2, f43 f43Var, androidx.compose.p001foundation.lazy.layout.d<kq6> dVar, int i8, List<Integer> list, boolean z3, final boolean z4, cq6 cq6Var, ta2 ta2Var, final o58<Unit> o58Var, i05 i05Var, Function1<? super Integer, ? extends List<Pair<Integer, kx1>>> function1, Function1<? super Integer, Integer> function2, d9c d9cVar, ps4<? super Integer, ? super Integer, ? super Function1<? super o.a, Unit>, ? extends fj7> ps4Var) {
        int i9;
        e eVarA1;
        int i10;
        kq6[] items;
        kq6 kq6Var;
        kq6[] items2;
        kq6 kq6Var2;
        int i11;
        int i12;
        int i13 = i;
        boolean z5 = true;
        if (!(i3 >= 0)) {
            cx5.a("negative beforeContentPadding");
        }
        if (!(i4 >= 0)) {
            cx5.a("negative afterContentPadding");
        }
        if (i13 <= 0) {
            int iN = kx1.n(j);
            int iM = kx1.m(j);
            dVar.m(0, iN, iM, new ArrayList(), lq6Var.g(), lq6Var, z, z4, i8, z3, 0, 0, ta2Var, i05Var);
            if (!z4) {
                long jI = dVar.i();
                if (!q16.f(jI, q16.INSTANCE.a())) {
                    iN = nx1.g(j, (int) (jI >> 32));
                    iM = nx1.f(j, (int) (jI & 4294967295L));
                }
            }
            return new jq6(null, 0, false, 0.0f, (fj7) ps4Var.invoke(Integer.valueOf(iN), Integer.valueOf(iM), new Function1() { // from class: com.google.android.eq6
                public final Object invoke(Object obj) {
                    return iq6.j((o.a) obj);
                }
            }), 0.0f, false, ta2Var, f43Var, i8, function1, function2, m.p(), -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
        }
        int iRound = Math.round(f);
        int i14 = i7 - iRound;
        if (i6 == 0 && i14 < 0) {
            iRound += i14;
            i14 = 0;
        }
        e eVar2 = new e();
        int i15 = -i3;
        int i16 = (i5 < 0 ? i5 : 0) + i15;
        int mainAxisSizeWithSpacings = i14 + i16;
        int i17 = i6;
        while (mainAxisSizeWithSpacings < 0 && i17 > 0) {
            i17--;
            mq6 mq6VarC = nq6Var.c(i17);
            eVar2.add(0, mq6VarC);
            mainAxisSizeWithSpacings += mq6VarC.getMainAxisSizeWithSpacings();
        }
        if (mainAxisSizeWithSpacings < i16) {
            iRound -= i16 - mainAxisSizeWithSpacings;
            mainAxisSizeWithSpacings = i16;
        }
        int mainAxisSizeWithSpacings2 = mainAxisSizeWithSpacings - i16;
        int i18 = i2 + i4;
        int i19 = i17;
        int iE = g.e(i18, 0);
        int mainAxisSizeWithSpacings3 = -mainAxisSizeWithSpacings2;
        int i20 = i19;
        int i21 = 0;
        boolean z6 = false;
        while (i21 < eVar2.size()) {
            if (mainAxisSizeWithSpacings3 >= iE) {
                eVar2.remove(i21);
                Unit unit = Unit.a;
                z6 = true;
            } else {
                i20++;
                mainAxisSizeWithSpacings3 += ((mq6) eVar2.get(i21)).getMainAxisSizeWithSpacings();
                i21++;
            }
        }
        int i22 = i19;
        boolean z7 = z6;
        int i23 = i20;
        while (i23 < i13 && (mainAxisSizeWithSpacings3 < iE || mainAxisSizeWithSpacings3 <= 0 || eVar2.isEmpty())) {
            mq6 mq6VarC2 = nq6Var.c(i23);
            if (mq6VarC2.e()) {
                break;
            }
            mainAxisSizeWithSpacings3 += mq6VarC2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings3 <= i16) {
                i11 = iE;
                i12 = i16;
                if (((kq6) f.Q0(mq6VarC2.getItems())).getIndex() != i - 1) {
                    mainAxisSizeWithSpacings2 -= mq6VarC2.getMainAxisSizeWithSpacings();
                    Unit unit2 = Unit.a;
                    i22 = i23 + 1;
                    z7 = true;
                }
                i23++;
                i13 = i;
                iE = i11;
                i16 = i12;
            } else {
                i11 = iE;
                i12 = i16;
            }
            eVar2.add(mq6VarC2);
            i23++;
            i13 = i;
            iE = i11;
            i16 = i12;
        }
        if (mainAxisSizeWithSpacings3 < i2) {
            int i24 = i2 - mainAxisSizeWithSpacings3;
            mainAxisSizeWithSpacings2 -= i24;
            mainAxisSizeWithSpacings3 += i24;
            while (mainAxisSizeWithSpacings2 < i3 && i22 > 0) {
                i22--;
                mq6 mq6VarC3 = nq6Var.c(i22);
                eVar2.add(0, mq6VarC3);
                mainAxisSizeWithSpacings2 += mq6VarC3.getMainAxisSizeWithSpacings();
            }
            i9 = i24 + iRound;
            if (mainAxisSizeWithSpacings2 < 0) {
                i9 += mainAxisSizeWithSpacings2;
                mainAxisSizeWithSpacings3 += mainAxisSizeWithSpacings2;
                mainAxisSizeWithSpacings2 = 0;
            }
        } else {
            i9 = iRound;
        }
        float f2 = (sh7.a(Math.round(f)) != sh7.a(i9) || Math.abs(Math.round(f)) < Math.abs(i9)) ? f : i9;
        float f3 = f - f2;
        float f4 = 0.0f;
        if (z4 && i9 > iRound && f3 <= 0.0f) {
            f4 = (i9 - iRound) + f3;
        }
        float f5 = f4;
        if (!(mainAxisSizeWithSpacings2 >= 0)) {
            cx5.a("negative initial offset");
        }
        int i25 = -mainAxisSizeWithSpacings2;
        mq6 mq6Var = (mq6) eVar2.f();
        int index = (mq6Var == null || (items2 = mq6Var.getItems()) == null || (kq6Var2 = (kq6) f.p0(items2)) == null) ? 0 : kq6Var2.getIndex();
        mq6 mq6Var2 = (mq6) eVar2.j();
        int index2 = (mq6Var2 == null || (items = mq6Var2.getItems()) == null || (kq6Var = (kq6) f.T0(items)) == null) ? 0 : kq6Var.getIndex();
        int size = list.size();
        List listP = null;
        List listP2 = null;
        int i26 = 0;
        while (i26 < size) {
            int i27 = size;
            int iIntValue = list.get(i26).intValue();
            if (iIntValue >= 0 && iIntValue < index) {
                int iE2 = nq6Var.e(iIntValue);
                kq6 kq6VarA = lq6Var.a(iIntValue, 0, iE2, nq6Var.a(0, iE2));
                if (listP2 == null) {
                    listP2 = new ArrayList();
                }
                List list2 = listP2;
                list2.add(kq6VarA);
                listP2 = list2;
            }
            i26++;
            size = i27;
            index = index;
        }
        int i28 = index;
        if (listP2 == null) {
            listP2 = m.p();
        }
        int i29 = index2;
        List<mq6> listH = h(i29, i, nq6Var, z4, eVar2, cq6Var);
        int i30 = i;
        nq6 nq6Var2 = nq6Var;
        int size2 = list.size();
        int i31 = 0;
        while (i31 < size2) {
            int i32 = size2;
            int iIntValue2 = list.get(i31).intValue();
            int i33 = i31;
            if (i29 + 1 <= iIntValue2 && iIntValue2 < i30) {
                if (z4) {
                    int size3 = listH.size();
                    int i34 = 0;
                    while (true) {
                        if (i34 < size3) {
                            int i35 = i34;
                            kq6[] items3 = listH.get(i34).getItems();
                            int i36 = size3;
                            int length = items3.length;
                            int i37 = 0;
                            while (true) {
                                if (i37 < length) {
                                    int i38 = i37;
                                    if (items3[i37].getIndex() != iIntValue2) {
                                        i37 = i38 + 1;
                                    }
                                } else {
                                    i34 = i35 + 1;
                                    size3 = i36;
                                }
                            }
                        }
                    }
                }
                int iE3 = nq6Var2.e(iIntValue2);
                kq6 kq6VarA2 = lq6Var.a(iIntValue2, 0, iE3, nq6Var2.a(0, iE3));
                if (listP == null) {
                    listP = new ArrayList();
                }
                List list3 = listP;
                list3.add(kq6VarA2);
                listP = list3;
            }
            i31 = i33 + 1;
            i30 = i;
            nq6Var2 = nq6Var;
            size2 = i32;
            eVar2 = eVar2;
            listH = listH;
        }
        e eVar3 = eVar2;
        List<mq6> list4 = listH;
        if (listP == null) {
            listP = m.p();
        }
        List list5 = listP;
        if (i3 > 0 || i5 < 0) {
            int size4 = eVar3.size();
            int i39 = 0;
            while (true) {
                eVarA1 = eVar3;
                if (i39 >= size4) {
                    break;
                }
                int mainAxisSizeWithSpacings4 = ((mq6) eVarA1.get(i39)).getMainAxisSizeWithSpacings();
                if (mainAxisSizeWithSpacings2 == 0 || mainAxisSizeWithSpacings4 > mainAxisSizeWithSpacings2 || i39 == m.r(eVarA1)) {
                    break;
                }
                mainAxisSizeWithSpacings2 -= mainAxisSizeWithSpacings4;
                i39++;
                mq6Var = (mq6) eVarA1.get(i39);
                eVar3 = eVarA1;
            }
        } else {
            eVarA1 = eVar3;
        }
        int i40 = mainAxisSizeWithSpacings2;
        mq6 mq6Var3 = mq6Var;
        int iL = z ? kx1.l(j) : nx1.g(j, mainAxisSizeWithSpacings3);
        int iF = z ? nx1.f(j, mainAxisSizeWithSpacings3) : kx1.k(j);
        if (!list4.isEmpty()) {
            eVarA1 = m.a1(eVarA1, list4);
        }
        e eVar4 = eVarA1;
        int i41 = iF;
        float f6 = f2;
        int i42 = mainAxisSizeWithSpacings3;
        final List<kq6> listF = f(eVar4, listP2, list5, iL, i41, i42, i2, i25, z, nVar, eVar, z2, f43Var);
        dVar.m((int) f6, iL, i41, listF, lq6Var.g(), lq6Var, z, z4, i8, z3, i40, i42, ta2Var, i05Var);
        if (z4) {
            i10 = i41;
        } else {
            long jI2 = dVar.i();
            if (q16.f(jI2, q16.INSTANCE.a())) {
                i10 = i41;
            } else {
                int i43 = z ? i41 : iL;
                iL = nx1.g(j, Math.max(iL, (int) (jI2 >> 32)));
                int iF2 = nx1.f(j, Math.max(i41, (int) (jI2 & 4294967295L)));
                int i44 = z ? iF2 : iL;
                if (i44 != i43) {
                    int size5 = listF.size();
                    for (int i45 = 0; i45 < size5; i45++) {
                        listF.get(i45).u(i44);
                    }
                }
                i10 = iF2;
            }
        }
        int i46 = iL;
        final List listB = xu6.b(d9cVar, i28, i29, listF, lq6Var.f(), i3, i4, i46, i10, new Function1() { // from class: com.google.android.fq6
            public final Object invoke(Object obj) {
                return iq6.k(nq6Var, lq6Var, ((Integer) obj).intValue());
            }
        });
        if (i29 == i - 1 && i42 <= i2) {
            z5 = false;
        }
        return new jq6(mq6Var3, i40, z5, f6, (fj7) ps4Var.invoke(Integer.valueOf(i46), Integer.valueOf(i10), new Function1() { // from class: com.google.android.gq6
            public final Object invoke(Object obj) {
                return iq6.l(o58Var, listF, listB, z4, (o.a) obj);
            }
        }), f5, z7, ta2Var, f43Var, i8, function1, function2, au6.c(i28, i29, listF, listB), i15, i18, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(o.a aVar) {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kq6 k(nq6 nq6Var, lq6 lq6Var, int i) {
        int iE = nq6Var.e(i);
        return lq6Var.a(i, 0, iE, nq6Var.a(0, iE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(o58 o58Var, final List list, final List list2, final boolean z, o.a aVar) {
        aVar.k0(new Function1() { // from class: com.google.android.hq6
            public final Object invoke(Object obj) {
                return iq6.m(list, list2, z, (o.a) obj);
            }
        });
        gn8.a(o58Var);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(List list, List list2, boolean z, o.a aVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((kq6) list.get(i)).s(aVar, z);
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((kq6) list2.get(i2)).s(aVar, z);
        }
        return Unit.a;
    }
}
