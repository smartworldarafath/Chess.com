package com.google.inputmethod;

import androidx.compose.p001foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.ui.layout.o;
import com.google.android.ta2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a£\u0001\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a3\u0010&\u001a\u00020\u001d*\u00020 2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010'\u001aM\u00100\u001a\b\u0012\u0004\u0012\u00020*0\u0003*\u00020 2\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(2\u0006\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u00101\u001a\u001b\u00104\u001a\u000203*\u00020\"2\u0006\u00102\u001a\u00020\u0004H\u0002¢\u0006\u0004\b4\u00105\u001a\u001b\u00108\u001a\u00020\u0004*\u00020\"2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109\u001a\u001d\u0010;\u001a\u00020\u0004*\u00020\"2\b\b\u0002\u0010:\u001a\u00020\u0004H\u0000¢\u0006\u0004\b;\u0010<\u001a\u0013\u0010=\u001a\u00020\u0004*\u00020\"H\u0002¢\u0006\u0004\b=\u0010>\u001a#\u0010A\u001a\u000203*\u00020 2\u0006\u0010?\u001a\u00020\"2\u0006\u0010@\u001a\u00020\u0004H\u0002¢\u0006\u0004\bA\u0010B\u001a#\u0010E\u001a\u00020\u0004*\u00020 2\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0004H\u0002¢\u0006\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lcom/google/android/wt6;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "", "", "pinnedItems", "Lcom/google/android/cy6;", "itemProvider", "Lcom/google/android/az6;", "resolvedSlots", "Lcom/google/android/kx1;", "constraints", "", "isVertical", "reverseLayout", "Lcom/google/android/g16;", "contentOffset", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "Lcom/google/android/ta2;", "coroutineScope", "isInLookaheadScope", "isLookingAhead", "Lcom/google/android/ky6;", "approachLayoutInfo", "Lcom/google/android/i05;", "graphicsContext", "Lcom/google/android/sy6;", "q", "(Lcom/google/android/wt6;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Lcom/google/android/cy6;Lcom/google/android/az6;JZZJIIIILcom/google/android/ta2;ZZLcom/google/android/ky6;Lcom/google/android/i05;)Lcom/google/android/sy6;", "Lcom/google/android/ly6;", "initialScrollDelta", "", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "k", "(Lcom/google/android/ly6;I[I[IZ)Lcom/google/android/sy6;", "", "Lkotlin/collections/e;", "Lcom/google/android/vy6;", "measuredItems", "itemScrollOffsets", "mainAxisLayoutSize", "minOffset", "maxOffset", "d", "(Lcom/google/android/ly6;[Lkotlin/collections/e;[IIII)Ljava/util/List;", "delta", "", "r", "([II)V", "Lcom/google/android/uzb;", "indexRange", "j", "([IJ)I", "minBound", "h", "([II)I", "g", "([I)I", "indices", "itemCount", "e", "(Lcom/google/android/ly6;[II)V", "item", "lane", "f", "(Lcom/google/android/ly6;II)I", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class py6 {
    private static final List<vy6> d(ly6 ly6Var, e<vy6>[] eVarArr, int[] iArr, int i, int i2, int i3) {
        int size = 0;
        for (e<vy6> eVar : eVarArr) {
            size += eVar.size();
        }
        ArrayList arrayList = new ArrayList(size);
        while (true) {
            for (e<vy6> eVar2 : eVarArr) {
                if (!eVar2.isEmpty()) {
                    int length = eVarArr.length;
                    int i4 = -1;
                    int i5 = Integer.MAX_VALUE;
                    for (int i6 = 0; i6 < length; i6++) {
                        vy6 vy6Var = (vy6) eVarArr[i6].f();
                        int index = vy6Var != null ? vy6Var.getIndex() : Integer.MAX_VALUE;
                        if (i5 > index) {
                            i4 = i6;
                            i5 = index;
                        }
                    }
                    vy6 vy6Var2 = (vy6) eVarArr[i4].removeFirst();
                    if (vy6Var2.getLane() == i4) {
                        long jA = uzb.a(vy6Var2.getLane(), vy6Var2.getSpan());
                        int iJ = j(iArr, jA);
                        int i7 = ly6Var.getResolvedSlots().getPositions()[i4];
                        if (vy6Var2.getMainAxisSize() + iJ >= i2 && iJ <= i3) {
                            vy6Var2.t(iJ, i7, i);
                            arrayList.add(vy6Var2);
                        }
                        int i8 = (int) (jA & 4294967295L);
                        for (int i9 = (int) (jA >> 32); i9 < i8; i9++) {
                            iArr[i9] = vy6Var2.getMainAxisSizeWithSpacings() + iJ;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final void e(ly6 ly6Var, int[] iArr, int i) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            while (true) {
                if (iArr[length] < i && ly6Var.getLaneInfo().a(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = f(ly6Var, iArr[length], length);
                }
            }
            int i3 = iArr[length];
            if (i3 >= 0 && !ly6Var.t(ly6Var.getItemProvider(), i3)) {
                if (ly6Var.getLaneInfo().h(i3) == -2) {
                    int length2 = iArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i4 = -1;
                            break;
                        } else if (iArr[i4] == i3) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    int i5 = i4 + 1;
                    if (i5 <= length) {
                        while (true) {
                            if (iArr[i5] == i3) {
                                iArr[i5] = f(ly6Var, i3, i5);
                            }
                            if (i5 == length) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    length = i4;
                }
                ly6Var.getLaneInfo().m(i3, length);
            }
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    private static final int f(ly6 ly6Var, int i, int i2) {
        return ly6Var.getLaneInfo().f(i, i2);
    }

    private static final int g(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = t04.INVALID_ID;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    public static final int h(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i + 1;
            int i6 = iArr[i4];
            if (i5 <= i6 && i6 < i3) {
                i2 = i4;
                i3 = i6;
            }
        }
        return i2;
    }

    public static /* synthetic */ int i(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = t04.INVALID_ID;
        }
        return h(iArr, i);
    }

    private static final int j(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int iMax = t04.INVALID_ID;
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            iMax = Math.max(iMax, iArr[i2]);
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:329:0x06a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:330:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:331:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:334:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:336:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:337:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:340:0x06cf A[LOOP:23: B:333:0x06b7->B:340:0x06cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:344:0x06da  */
    /* JADX WARN: Code duplicated, block: B:345:0x06df  */
    /* JADX WARN: Code duplicated, block: B:348:0x0700  */
    /* JADX WARN: Code duplicated, block: B:349:0x0703  */
    /* JADX WARN: Code duplicated, block: B:351:0x070f  */
    /* JADX WARN: Code duplicated, block: B:353:0x0718 A[LOOP:21: B:312:0x0665->B:353:0x0718, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:359:0x0741  */
    /* JADX WARN: Code duplicated, block: B:361:0x074d  */
    /* JADX WARN: Code duplicated, block: B:363:0x0752 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:364:0x0754  */
    /* JADX WARN: Code duplicated, block: B:366:0x075b  */
    /* JADX WARN: Code duplicated, block: B:368:0x0769  */
    /* JADX WARN: Code duplicated, block: B:369:0x076b  */
    /* JADX WARN: Code duplicated, block: B:373:0x0771 A[LOOP:25: B:365:0x0759->B:373:0x0771, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:376:0x077c  */
    /* JADX WARN: Code duplicated, block: B:378:0x0780  */
    /* JADX WARN: Code duplicated, block: B:381:0x0786  */
    /* JADX WARN: Code duplicated, block: B:383:0x0791  */
    /* JADX WARN: Code duplicated, block: B:388:0x079a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:391:0x079f  */
    /* JADX WARN: Code duplicated, block: B:393:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:394:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:397:0x07a9 A[LOOP:26: B:390:0x079d->B:397:0x07a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:399:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:401:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:403:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:406:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:409:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:412:0x0846  */
    /* JADX WARN: Code duplicated, block: B:414:0x085e  */
    /* JADX WARN: Code duplicated, block: B:416:0x0864  */
    /* JADX WARN: Code duplicated, block: B:417:0x0866  */
    /* JADX WARN: Code duplicated, block: B:420:0x088b  */
    /* JADX WARN: Code duplicated, block: B:421:0x088e  */
    /* JADX WARN: Code duplicated, block: B:423:0x0892  */
    /* JADX WARN: Code duplicated, block: B:425:0x0899 A[LOOP:27: B:424:0x0897->B:425:0x0899, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:426:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:429:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:431:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:432:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:435:0x08bd A[LOOP:28: B:428:0x08ac->B:435:0x08bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:438:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:440:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:442:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:443:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:446:0x08d4 A[LOOP:29: B:439:0x08c5->B:446:0x08d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:450:0x08db  */
    /* JADX WARN: Code duplicated, block: B:452:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:546:0x06d6 A[EDGE_INSN: B:546:0x06d6->B:342:0x06d6 BREAK  A[LOOP:23: B:333:0x06b7->B:340:0x06cf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:0x06d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x076e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x0776 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x0798 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x074f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x08bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x08c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x08d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x08d2 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0733, code lost:
    
        r13 = r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final com.google.inputmethod.sy6 k(final com.google.inputmethod.ly6 r45, int r46, int[] r47, int[] r48, boolean r49) {
        /*
            Method dump skipped, instruction units count: 2777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.inputmethod.py6.k(com.google.android.ly6, int, int[], int[], boolean):com.google.android.sy6");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(o.a aVar) {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(ly6 ly6Var, final List list, final boolean z, final long j, final wt6 wt6Var, o.a aVar) {
        aVar.k0(new Function1() { // from class: com.google.android.oy6
            public final Object invoke(Object obj) {
                return py6.n(list, z, j, wt6Var, (o.a) obj);
            }
        });
        gn8.a(ly6Var.getState().G());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(List list, boolean z, long j, wt6 wt6Var, o.a aVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((vy6) list.get(i)).s(aVar, z, j, wt6Var.G1());
        }
        return Unit.a;
    }

    private static final boolean o(int[] iArr, int[] iArr2, ly6 ly6Var) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < Math.max(-ly6Var.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean p(int[] iArr, ly6 ly6Var, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (f(ly6Var, iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (f(ly6Var, iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int iH = ly6Var.getLaneInfo().h(0);
        return (iH == 0 || iH == -1 || iH == -2) ? false : true;
    }

    public static final sy6 q(wt6 wt6Var, LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, cy6 cy6Var, az6 az6Var, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4, ta2 ta2Var, boolean z3, boolean z4, ky6 ky6Var, i05 i05Var) {
        int i5;
        int iJ;
        ly6 ly6Var = new ly6(lazyStaggeredGridState, list, cy6Var, az6Var, j, z, wt6Var, i, j2, i3, i4, z2, i2, ta2Var, z3, z4, ky6Var != null ? ky6Var.h() : null, i05Var, null);
        int[] iArrV = lazyStaggeredGridState.V(cy6Var, lazyStaggeredGridState.getScrollPosition().getIndices());
        int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition().getScrollOffsets();
        if (iArrV.length != ly6Var.getLaneCount()) {
            ly6Var.getLaneInfo().j();
            int laneCount = ly6Var.getLaneCount();
            int[] iArr = new int[laneCount];
            int i6 = 0;
            while (i6 < laneCount) {
                if (i6 >= iArrV.length || (iJ = iArrV[i6]) == -1) {
                    iJ = i6 == 0 ? 0 : j(iArr, uzb.a(0, i6)) + 1;
                }
                iArr[i6] = iJ;
                ly6Var.getLaneInfo().m(iArr[i6], i6);
                i6++;
            }
            iArrV = iArr;
        }
        if (scrollOffsets.length != ly6Var.getLaneCount()) {
            int laneCount2 = ly6Var.getLaneCount();
            int[] iArr2 = new int[laneCount2];
            int i7 = 0;
            while (i7 < laneCount2) {
                if (i7 < scrollOffsets.length) {
                    i5 = scrollOffsets[i7];
                } else {
                    i5 = i7 == 0 ? 0 : iArr2[i7 - 1];
                }
                iArr2[i7] = i5;
                i7++;
            }
            scrollOffsets = iArr2;
        }
        return k(ly6Var, Math.round(lazyStaggeredGridState.O(z4)), iArrV, scrollOffsets, true);
    }

    private static final void r(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }
}
