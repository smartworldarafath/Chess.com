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
import kotlin.Unit;
import kotlin.collections.e;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0011\u001a\u0095\u0002\u0010/\u001a\u00020.2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020\u000e2*\u0010-\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)\u0012\u0004\u0012\u00020,0(H\u0000¢\u0006\u0004\b/\u00100\u001aI\u00103\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0018012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001bH\u0002¢\u0006\u0004\b3\u00104\u001a;\u00106\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u00105\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001bH\u0002¢\u0006\u0004\b6\u00107\u001a\u0093\u0001\u0010@\u001a\b\u0012\u0004\u0012\u00020\u0018012\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b@\u0010A¨\u0006B"}, d2 = {"", "itemsCount", "Lcom/google/android/wv6;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Lcom/google/android/kx1;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/c$n;", "verticalArrangement", "Landroidx/compose/foundation/layout/c$e;", "horizontalArrangement", "reverseLayout", "Lcom/google/android/f43;", "density", "Landroidx/compose/foundation/lazy/layout/d;", "Lcom/google/android/vv6;", "itemAnimator", "beyondBoundsItemCount", "", "pinnedItems", "hasLookaheadOccurred", "isLookingAhead", "Lcom/google/android/ta2;", "coroutineScope", "Lcom/google/android/gn8;", "placementScopeInvalidator", "Lcom/google/android/i05;", "graphicsContext", "Lcom/google/android/d9c;", "stickyItemsPlacement", "shouldRunItemAnimation", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/o$a;", "", "Lcom/google/android/fj7;", "layout", "Lcom/google/android/uv6;", "i", "(ILcom/google/android/wv6;IIIIIIFJZLandroidx/compose/foundation/layout/c$n;Landroidx/compose/foundation/layout/c$e;ZLcom/google/android/f43;Landroidx/compose/foundation/lazy/layout/d;ILjava/util/List;ZZLcom/google/android/ta2;Lcom/google/android/o58;Lcom/google/android/i05;Lcom/google/android/d9c;ZLcom/google/android/ps4;)Lcom/google/android/uv6;", "", "visibleItems", "g", "(Ljava/util/List;Lcom/google/android/wv6;IILjava/util/List;)Ljava/util/List;", "currentFirstItemIndex", "h", "(ILcom/google/android/wv6;ILjava/util/List;)Ljava/util/List;", "items", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "e", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/c$n;Landroidx/compose/foundation/layout/c$e;ZLcom/google/android/f43;)Ljava/util/List;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class tv6 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private static final List<vv6> e(List<vv6> list, List<vv6> list2, List<vv6> list3, int i, int i2, int i3, int i4, int i5, boolean z, c.n nVar, c.e eVar, boolean z2, f43 f43Var) throws KotlinNothingValueException {
        int i6 = z ? i2 : i;
        int i7 = 0;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3) {
            if (!(i5 == 0)) {
                cx5.c("non-zero itemsScrollOffset");
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z3) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                cx5.a("no extra items");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i7 < size) {
                iArr[i7] = list.get(f(i7, z2, size)).getSize();
                i7++;
            }
            int[] iArr2 = new int[size];
            if (z) {
                if (nVar == null) {
                    cx5.b("null verticalArrangement when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                nVar.arrange(f43Var, i6, iArr, iArr2);
            } else {
                if (eVar == null) {
                    cx5.b("null horizontalArrangement when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                eVar.a(f43Var, i6, iArr, LayoutDirection.Ltr, iArr2);
            }
            d dVarR0 = f.r0(iArr2);
            if (z2) {
                dVarR0 = g.y(dVarR0);
            }
            int iF = dVarR0.f();
            int i8 = dVarR0.i();
            int iJ = dVarR0.j();
            if ((iJ > 0 && iF <= i8) || (iJ < 0 && i8 <= iF)) {
                while (true) {
                    int size2 = iArr2[iF];
                    vv6 vv6Var = list.get(f(iF, z2, size));
                    if (z2) {
                        size2 = (i6 - size2) - vv6Var.getSize();
                    }
                    vv6Var.q(size2, i, i2);
                    arrayList.add(vv6Var);
                    if (iF == i8) {
                        break;
                    }
                    iF += iJ;
                }
            }
        } else {
            int size3 = list2.size();
            int mainAxisSizeWithSpacings = i5;
            for (int i9 = 0; i9 < size3; i9++) {
                vv6 vv6Var2 = list2.get(i9);
                mainAxisSizeWithSpacings -= vv6Var2.getMainAxisSizeWithSpacings();
                vv6Var2.q(mainAxisSizeWithSpacings, i, i2);
                arrayList.add(vv6Var2);
            }
            int size4 = list.size();
            int mainAxisSizeWithSpacings2 = i5;
            for (int i10 = 0; i10 < size4; i10++) {
                vv6 vv6Var3 = list.get(i10);
                vv6Var3.q(mainAxisSizeWithSpacings2, i, i2);
                arrayList.add(vv6Var3);
                mainAxisSizeWithSpacings2 += vv6Var3.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            while (i7 < size5) {
                vv6 vv6Var4 = list3.get(i7);
                vv6Var4.q(mainAxisSizeWithSpacings2, i, i2);
                arrayList.add(vv6Var4);
                mainAxisSizeWithSpacings2 += vv6Var4.getMainAxisSizeWithSpacings();
                i7++;
            }
        }
        return arrayList;
    }

    private static final int f(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    private static final List<vv6> g(List<vv6> list, wv6 wv6Var, int i, int i2, List<Integer> list2) {
        wv6 wv6Var2;
        wv6 wv6Var3;
        int iMin = Math.min(((vv6) m.L0(list)).getIndex() + i2, i - 1);
        int index = ((vv6) m.L0(list)).getIndex() + 1;
        ArrayList arrayList = null;
        if (index <= iMin) {
            int i3 = index;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                wv6Var2 = wv6Var;
                arrayList.add(wv6.f(wv6Var2, i3, 0L, 2, null));
                if (i3 == iMin) {
                    break;
                }
                i3++;
                wv6Var = wv6Var2;
            }
        } else {
            wv6Var2 = wv6Var;
        }
        if (arrayList != null && ((vv6) m.L0(arrayList)).getIndex() > iMin) {
            iMin = ((vv6) m.L0(arrayList)).getIndex();
        }
        int size = list2.size();
        int i4 = 0;
        while (i4 < size) {
            int iIntValue = list2.get(i4).intValue();
            if (iIntValue > iMin) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                wv6Var3 = wv6Var2;
                arrayList.add(wv6.f(wv6Var3, iIntValue, 0L, 2, null));
            } else {
                wv6Var3 = wv6Var2;
            }
            i4++;
            wv6Var2 = wv6Var3;
        }
        return arrayList == null ? m.p() : arrayList;
    }

    private static final List<vv6> h(int i, wv6 wv6Var, int i2, List<Integer> list) {
        wv6 wv6Var2;
        int iMax = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (iMax <= i3) {
            int i4 = i3;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                wv6Var2 = wv6Var;
                arrayList.add(wv6.f(wv6Var2, i4, 0L, 2, null));
                if (i4 == iMax) {
                    break;
                }
                i4--;
                wv6Var = wv6Var2;
            }
        } else {
            wv6Var2 = wv6Var;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i5 = size - 1;
                int iIntValue = list.get(size).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(wv6.f(wv6Var2, iIntValue, 0L, 2, null));
                }
                if (i5 < 0) {
                    break;
                }
                size = i5;
            }
        }
        return arrayList == null ? m.p() : arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:155:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:170:0x0411  */
    public static final uv6 i(int i, wv6 wv6Var, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, c.n nVar, c.e eVar, boolean z2, f43 f43Var, androidx.compose.p001foundation.lazy.layout.d<vv6> dVar, int i8, List<Integer> list, boolean z3, boolean z4, ta2 ta2Var, final o58<Unit> o58Var, i05 i05Var, d9c d9cVar, boolean z5, ps4<? super Integer, ? super Integer, ? super Function1<? super o.a, Unit>, ? extends fj7> ps4Var) throws KotlinNothingValueException {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        wv6 wv6Var2;
        int i14;
        int iMax;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        List<vv6> list2;
        int i20;
        final wv6 wv6Var3;
        int i21;
        final boolean z6;
        int i22;
        Integer numValueOf;
        if (!(i3 >= 0)) {
            cx5.a("invalid beforeContentPadding");
        }
        if (!(i4 >= 0)) {
            cx5.a("invalid afterContentPadding");
        }
        if (i <= 0) {
            int iN = kx1.n(j);
            int iM = kx1.m(j);
            dVar.m(0, iN, iM, new ArrayList(), wv6Var.i(), wv6Var, z, z4, 1, z3, 0, 0, ta2Var, i05Var);
            if (!z4) {
                long jI = dVar.i();
                if (!q16.f(jI, q16.INSTANCE.a())) {
                    iN = nx1.g(j, (int) (jI >> 32));
                    iM = nx1.f(j, (int) (jI & 4294967295L));
                }
            }
            return new uv6(null, 0, false, 0.0f, (fj7) ps4Var.invoke(Integer.valueOf(iN), Integer.valueOf(iM), new Function1() { // from class: com.google.android.pv6
                public final Object invoke(Object obj) {
                    return tv6.j((o.a) obj);
                }
            }), 0.0f, false, ta2Var, f43Var, wv6Var.getChildConstraints(), m.p(), -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5, null);
        }
        int i23 = i6;
        if (i23 >= i) {
            i23 = i - 1;
            i9 = 0;
        } else {
            i9 = i7;
        }
        int iRound = Math.round(f);
        int i24 = i9 - iRound;
        if (i23 == 0 && i24 < 0) {
            iRound += i24;
            i24 = 0;
        }
        int i25 = iRound;
        e eVar2 = new e();
        int i26 = -i3;
        int i27 = (i5 < 0 ? i5 : 0) + i26;
        int mainAxisSizeWithSpacings = i24 + i27;
        int iMax2 = 0;
        while (mainAxisSizeWithSpacings < 0 && i23 > 0) {
            int i28 = i23 - 1;
            e eVar3 = eVar2;
            vv6 vv6VarF = wv6.f(wv6Var, i28, 0L, 2, null);
            eVar3.add(0, vv6VarF);
            iMax2 = Math.max(iMax2, vv6VarF.getCrossAxisSize());
            mainAxisSizeWithSpacings = vv6VarF.getMainAxisSizeWithSpacings() + mainAxisSizeWithSpacings;
            i23 = i28;
            eVar2 = eVar3;
            i27 = i27;
            i26 = i26;
            i25 = i25;
        }
        int i29 = mainAxisSizeWithSpacings;
        e eVar4 = eVar2;
        int i30 = i26;
        int i31 = iMax2;
        int i32 = i25;
        int i33 = i27;
        if (i29 < i33) {
            i11 = i32 - (i33 - i29);
            i10 = i33;
        } else {
            i10 = i29;
            i11 = i32;
        }
        int i34 = i10 - i33;
        int i35 = i2 + i4;
        int iE = g.e(i35, 0);
        int mainAxisSizeWithSpacings2 = -i34;
        int i36 = i23;
        int i37 = 0;
        boolean z7 = false;
        while (i37 < eVar4.size()) {
            if (mainAxisSizeWithSpacings2 >= iE) {
                eVar4.remove(i37);
                Unit unit = Unit.a;
                z7 = true;
            } else {
                i36++;
                mainAxisSizeWithSpacings2 += ((vv6) eVar4.get(i37)).getMainAxisSizeWithSpacings();
                i37++;
            }
        }
        int i38 = i23;
        int i39 = i35;
        int i40 = i31;
        int i41 = i36;
        int mainAxisSizeWithSpacings3 = mainAxisSizeWithSpacings2;
        int mainAxisSizeWithSpacings4 = i34;
        while (i41 < i && (mainAxisSizeWithSpacings3 < iE || mainAxisSizeWithSpacings3 <= 0 || eVar4.isEmpty())) {
            int i42 = i40;
            int i43 = iE;
            int i44 = i38;
            int i45 = i39;
            vv6 vv6VarF2 = wv6.f(wv6Var, i41, 0L, 2, null);
            int i46 = i41;
            mainAxisSizeWithSpacings3 += vv6VarF2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings3 > i33 || i46 == i - 1) {
                int iMax3 = Math.max(i42, vv6VarF2.getCrossAxisSize());
                eVar4.add(vv6VarF2);
                i38 = i44;
                i40 = iMax3;
            } else {
                mainAxisSizeWithSpacings4 -= vv6VarF2.getMainAxisSizeWithSpacings();
                Unit unit2 = Unit.a;
                i40 = i42;
                z7 = true;
                i38 = i46 + 1;
            }
            i41 = i46 + 1;
            i39 = i45;
            iE = i43;
        }
        int i47 = i39;
        int i48 = i41;
        int i49 = i38;
        int iMax4 = i40;
        if (mainAxisSizeWithSpacings3 < i2) {
            int i50 = i2 - mainAxisSizeWithSpacings3;
            int i51 = mainAxisSizeWithSpacings3 + i50;
            int i52 = i49;
            int mainAxisSizeWithSpacings5 = mainAxisSizeWithSpacings4 - i50;
            while (mainAxisSizeWithSpacings5 < i3 && i52 > 0) {
                i52--;
                int i53 = mainAxisSizeWithSpacings5;
                vv6 vv6VarF3 = wv6.f(wv6Var, i52, 0L, 2, null);
                eVar4.add(0, vv6VarF3);
                iMax4 = Math.max(iMax4, vv6VarF3.getCrossAxisSize());
                mainAxisSizeWithSpacings5 = i53 + vv6VarF3.getMainAxisSizeWithSpacings();
                i48 = i48;
                i51 = i51;
            }
            int i54 = mainAxisSizeWithSpacings5;
            int i55 = i51;
            i13 = i48;
            wv6Var2 = wv6Var;
            i14 = i50 + i11;
            if (i54 < 0) {
                i14 += i54;
                iMax = iMax4;
                i16 = i52;
                i12 = i55 + i54;
                i15 = 0;
            } else {
                iMax = iMax4;
                i15 = i54;
                i16 = i52;
                i12 = i55;
            }
        } else {
            i12 = mainAxisSizeWithSpacings3;
            i13 = i48;
            wv6Var2 = wv6Var;
            i14 = i11;
            iMax = iMax4;
            i15 = mainAxisSizeWithSpacings4;
            i16 = i49;
        }
        float f2 = (sh7.a(Math.round(f)) != sh7.a(i14) || Math.abs(Math.round(f)) < Math.abs(i14)) ? f : i14;
        float f3 = f - f2;
        float f4 = 0.0f;
        if (z4 && i14 > i11 && f3 <= 0.0f) {
            f4 = (i14 - i11) + f3;
        }
        if (!(i15 >= 0)) {
            cx5.a("negative currentFirstItemScrollOffset");
        }
        int i56 = -i15;
        vv6 vv6Var = (vv6) eVar4.first();
        if (i3 > 0 || i5 < 0) {
            int size = eVar4.size();
            int i57 = 0;
            while (true) {
                if (i57 >= size) {
                    i17 = i15;
                    i18 = i56;
                    break;
                }
                i18 = i56;
                int mainAxisSizeWithSpacings6 = ((vv6) eVar4.get(i57)).getMainAxisSizeWithSpacings();
                if (i15 == 0 || mainAxisSizeWithSpacings6 > i15) {
                    i17 = i15;
                    break;
                }
                i17 = i15;
                if (i57 == m.r(eVar4)) {
                    break;
                }
                i15 = i17 - mainAxisSizeWithSpacings6;
                i57++;
                vv6Var = (vv6) eVar4.get(i57);
                i56 = i18;
            }
            i19 = i17;
        } else {
            i19 = i15;
            i18 = i56;
        }
        vv6 vv6Var2 = vv6Var;
        List<vv6> listH = h(i16, wv6Var2, i8, list);
        int size2 = listH.size();
        for (int i58 = 0; i58 < size2; i58++) {
            iMax = Math.max(iMax, listH.get(i58).getCrossAxisSize());
        }
        List<vv6> listG = g(eVar4, wv6Var2, i, i8, list);
        int size3 = listG.size();
        for (int i59 = 0; i59 < size3; i59++) {
            iMax = Math.max(iMax, listG.get(i59).getCrossAxisSize());
        }
        boolean z8 = Intrinsics.e(vv6Var2, eVar4.first()) && listH.isEmpty() && listG.isEmpty();
        int iG = nx1.g(j, z ? iMax : i12);
        if (z) {
            iMax = i12;
        }
        int iF = nx1.f(j, iMax);
        float f5 = f2;
        int i60 = i12;
        List<vv6> listE = e(eVar4, listH, listG, iG, iF, i60, i2, i18, z, nVar, eVar, z2, f43Var);
        int iG2 = iG;
        if (!up1.isSkipItemPlacementAnimationFixEnabled || z5) {
            list2 = listE;
            i20 = i60;
            int i61 = i19;
            dVar.m((int) f5, iG2, iF, list2, wv6Var.i(), wv6Var, z, z4, 1, z3, i61, i20, ta2Var, i05Var);
            wv6Var3 = wv6Var;
            i21 = i61;
            z6 = z4;
        } else {
            i21 = i19;
            wv6Var3 = wv6Var;
            z6 = z4;
            list2 = listE;
            i20 = i60;
        }
        if (z6) {
            i22 = iF;
        } else {
            long jI2 = dVar.i();
            if (q16.f(jI2, q16.INSTANCE.a())) {
                i22 = iF;
            } else {
                int i62 = z ? iF : iG2;
                iG2 = nx1.g(j, Math.max(iG2, (int) (jI2 >> 32)));
                int iF2 = nx1.f(j, Math.max(iF, (int) (jI2 & 4294967295L)));
                int i63 = z ? iF2 : iG2;
                if (i63 != i62) {
                    int size4 = list2.size();
                    for (int i64 = 0; i64 < size4; i64++) {
                        list2.get(i64).r(i63);
                    }
                }
                i22 = iF2;
            }
        }
        int i65 = iG2;
        vv6 vv6Var3 = (vv6) eVar4.f();
        int index = vv6Var3 != null ? vv6Var3.getIndex() : 0;
        vv6 vv6Var4 = (vv6) eVar4.j();
        final List<vv6> list3 = list2;
        final List listB = xu6.b(d9cVar, index, vv6Var4 != null ? vv6Var4.getIndex() : 0, list3, wv6Var3.h(), i3, i4, i65, i22, new Function1() { // from class: com.google.android.qv6
            public final Object invoke(Object obj) {
                return tv6.k(wv6Var3, ((Integer) obj).intValue());
            }
        });
        Integer numValueOf2 = null;
        if (z8) {
            vv6 vv6Var5 = (vv6) m.B0(list3);
            if (vv6Var5 != null) {
                numValueOf = Integer.valueOf(vv6Var5.getIndex());
            } else {
                numValueOf = null;
            }
        } else {
            vv6 vv6Var6 = (vv6) eVar4.f();
            if (vv6Var6 != null) {
                numValueOf = Integer.valueOf(vv6Var6.getIndex());
            } else {
                numValueOf = null;
            }
        }
        if (z8) {
            vv6 vv6Var7 = (vv6) m.N0(list3);
            if (vv6Var7 != null) {
                numValueOf2 = Integer.valueOf(vv6Var7.getIndex());
            }
        } else {
            vv6 vv6Var8 = (vv6) eVar4.j();
            if (vv6Var8 != null) {
                numValueOf2 = Integer.valueOf(vv6Var8.getIndex());
            }
        }
        return new uv6(vv6Var2, i21, i13 < i || i20 > i2, f5, (fj7) ps4Var.invoke(Integer.valueOf(i65), Integer.valueOf(i22), new Function1() { // from class: com.google.android.rv6
            public final Object invoke(Object obj) {
                return tv6.l(o58Var, list3, listB, z6, (o.a) obj);
            }
        }), f4, z7, ta2Var, f43Var, wv6Var3.getChildConstraints(), au6.c(numValueOf != null ? numValueOf.intValue() : 0, numValueOf2 != null ? numValueOf2.intValue() : 0, list3, listB), i30, i47, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(o.a aVar) {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vv6 k(wv6 wv6Var, int i) {
        return wv6.f(wv6Var, i, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(o58 o58Var, final List list, final List list2, final boolean z, o.a aVar) {
        aVar.k0(new Function1() { // from class: com.google.android.sv6
            public final Object invoke(Object obj) {
                return tv6.m(list, list2, z, (o.a) obj);
            }
        });
        gn8.a(o58Var);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(List list, List list2, boolean z, o.a aVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((vv6) list.get(i)).p(aVar, z);
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((vv6) list2.get(i2)).p(aVar, z);
        }
        return Unit.a;
    }
}
