package com.google.inputmethod;

import android.os.Trace;
import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.gestures.snapping.j;
import androidx.compose.p001foundation.pager.PagerKt;
import androidx.compose.p001foundation.pager.PagerState;
import androidx.compose.p001foundation.pager.f;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.ps4;
import com.google.android.ta2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0000H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a)\u0010$\u001a\u00020#*\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lkotlin/Function0;", "Lcom/google/android/az8;", "itemProviderLambda", "Landroidx/compose/foundation/pager/PagerState;", "state", "Lcom/google/android/rx8;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "beyondViewportPageCount", "Lcom/google/android/ff3;", "pageSpacing", "Landroidx/compose/foundation/pager/f;", "pageSize", "Lcom/google/android/tc$b;", "horizontalAlignment", "Lcom/google/android/tc$c;", "verticalAlignment", "Landroidx/compose/foundation/gestures/snapping/j;", "snapPosition", "Lcom/google/android/ta2;", "coroutineScope", "pageCount", "Lcom/google/android/vt6;", "c", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Lcom/google/android/rx8;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/f;Lcom/google/android/tc$b;Lcom/google/android/tc$c;Landroidx/compose/foundation/gestures/snapping/j;Lcom/google/android/ta2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;II)Lcom/google/android/vt6;", "Lcom/google/android/wt6;", "Lcom/google/android/h11;", "cacheWindowLogic", "", "Lcom/google/android/yx8;", "visiblePagesList", "", "b", "(Lcom/google/android/wt6;Lcom/google/android/h11;Ljava/util/List;)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class iz8 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements vt6 {
        final /* synthetic */ PagerState a;
        final /* synthetic */ Orientation b;
        final /* synthetic */ rx8 c;
        final /* synthetic */ boolean d;
        final /* synthetic */ float e;
        final /* synthetic */ f f;
        final /* synthetic */ Function0<az8> g;
        final /* synthetic */ Function0<Integer> h;
        final /* synthetic */ tc.c i;
        final /* synthetic */ tc.b j;
        final /* synthetic */ int k;
        final /* synthetic */ j l;
        final /* synthetic */ ta2 m;

        a(PagerState pagerState, Orientation orientation, rx8 rx8Var, boolean z, float f, f fVar, Function0<az8> function0, Function0<Integer> function1, tc.c cVar, tc.b bVar, int i, j jVar, ta2 ta2Var) {
            this.a = pagerState;
            this.b = orientation;
            this.c = rx8Var;
            this.d = z;
            this.e = f;
            this.f = fVar;
            this.g = function0;
            this.h = function1;
            this.i = cVar;
            this.j = bVar;
            this.k = i;
            this.l = jVar;
            this.m = ta2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fj7 c(wt6 wt6Var, long j, int i, int i2, int i3, int i4, Function1 function1) {
            return wt6Var.h2(nx1.g(j, i3 + i), nx1.f(j, i4 + i2), b0.j(), function1);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        @Override // com.google.inputmethod.vt6
        public final fj7 a(final wt6 wt6Var, final long j) throws KotlinNothingValueException {
            int i;
            long jF;
            gn8.a(this.a.L());
            Orientation orientation = this.b;
            Orientation orientation2 = Orientation.Vertical;
            boolean z = orientation == orientation2;
            fa1.a(j, z ? orientation2 : Orientation.Horizontal);
            int iO1 = z ? wt6Var.O1(this.c.b(wt6Var.getLayoutDirection())) : wt6Var.O1(nx8.k(this.c, wt6Var.getLayoutDirection()));
            int iO2 = z ? wt6Var.O1(this.c.c(wt6Var.getLayoutDirection())) : wt6Var.O1(nx8.j(this.c, wt6Var.getLayoutDirection()));
            int iO3 = wt6Var.O1(this.c.getTop());
            int iO4 = wt6Var.O1(this.c.getBottom());
            final int i2 = iO3 + iO4;
            final int i3 = iO1 + iO2;
            int i4 = z ? i2 : i3;
            if (z && !this.d) {
                i = iO3;
            } else if (z && this.d) {
                i = iO4;
            } else {
                i = (z || this.d) ? iO2 : iO1;
            }
            int i5 = i4 - i;
            long jI = nx1.i(j, -i3, -i2);
            this.a.r0(wt6Var);
            int iO5 = wt6Var.O1(this.e);
            int iK = z ? kx1.k(j) - i2 : kx1.l(j) - i3;
            if (!this.d || iK > 0) {
                jF = g16.f((((long) iO1) << 32) | (((long) iO3) & 4294967295L));
            } else {
                if (!z) {
                    iO1 += iK;
                }
                if (z) {
                    iO3 += iK;
                }
                jF = g16.f((((long) iO3) & 4294967295L) | (((long) iO1) << 32));
            }
            long j2 = jF;
            int iE = g.e(this.f.a(wt6Var, iK, iO5), 0);
            this.a.s0(nx1.b(0, this.b == orientation2 ? kx1.l(jI) : iE, 0, this.b != orientation2 ? kx1.k(jI) : iE, 5, null));
            az8 az8Var = (az8) this.g.invoke();
            int i6 = iK + i + i5;
            androidx.compose.p004runtime.snapshots.g.Companion companion = androidx.compose.p004runtime.snapshots.g.INSTANCE;
            PagerState pagerState = this.a;
            j jVar = this.l;
            androidx.compose.p004runtime.snapshots.g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            androidx.compose.p004runtime.snapshots.g gVarE = companion.e(gVarD);
            try {
                int iF0 = pagerState.f0(az8Var, pagerState.A());
                int i7 = PagerKt.i(jVar, i6, iE, iO5, i, i5, pagerState.A(), pagerState.B(), pagerState.O());
                Unit unit = Unit.a;
                companion.l(gVarD, gVarE, function1G);
                int i8 = iK;
                int i9 = i;
                jz8 jz8VarL = gz8.l(wt6Var, ((Number) this.h.invoke()).intValue(), az8Var, i8, i9, i5, iO5, iF0, i7, jI, this.b, this.i, this.j, this.d, j2, iE, this.k, at6.a(az8Var, this.a.getPinnedPages(), this.a.getBeyondBoundsInfo()), this.l, this.a.T(), this.m, wt6Var, new ps4() { // from class: com.google.android.hz8
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return iz8.a.c(wt6Var, j, i3, i2, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (Function1) obj3);
                    }
                }, f16.c());
                PagerState.r(this.a, jz8VarL, wt6Var.G1(), false, 4, null);
                iz8.b(wt6Var, this.a.getCacheWindowLogic(), jz8VarL.m());
                return jz8VarL;
            } catch (Throwable th) {
                companion.l(gVarD, gVarE, function1G);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(wt6 wt6Var, h11 h11Var, List<? extends yx8> list) {
        Trace.beginSection("compose:pager:cache_window:keepAroundItems");
        try {
            if (h11Var.n() && !list.isEmpty()) {
                int index = ((yx8) m.z0(list)).getIndex();
                int index2 = ((yx8) m.L0(list)).getIndex();
                for (int prefetchWindowStartLine = h11Var.getPrefetchWindowStartLine(); prefetchWindowStartLine < index; prefetchWindowStartLine++) {
                    wt6Var.C2(prefetchWindowStartLine);
                }
                int i = index2 + 1;
                int prefetchWindowEndLine = h11Var.getPrefetchWindowEndLine();
                if (i <= prefetchWindowEndLine) {
                    while (true) {
                        wt6Var.C2(i);
                        if (i == prefetchWindowEndLine) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            Unit unit = Unit.a;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0132 A[PHI: r3
  0x0132: PHI (r3v20 int) = (r3v18 int), (r3v21 int) binds: [B:102:0x0130, B:98:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x0134  */
    /* JADX WARN: Code duplicated, block: B:107:0x0144  */
    /* JADX WARN: Code duplicated, block: B:109:0x014c  */
    /* JADX WARN: Code duplicated, block: B:112:0x016b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0090 A[PHI: r4
  0x0090: PHI (r4v23 com.google.android.tc$b) = (r4v21 com.google.android.tc$b), (r4v24 com.google.android.tc$b) binds: [B:44:0x008e, B:40:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac A[PHI: r9
  0x00ac: PHI (r9v13 com.google.android.tc$c) = (r9v10 com.google.android.tc$c), (r9v14 com.google.android.tc$c) binds: [B:54:0x00aa, B:50:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8 A[PHI: r12
  0x00c8: PHI (r12v11 float) = (r12v9 float), (r12v12 float) binds: [B:64:0x00c6, B:60:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e4 A[PHI: r13
  0x00e4: PHI (r13v11 androidx.compose.foundation.pager.f) = (r13v9 androidx.compose.foundation.pager.f), (r13v12 androidx.compose.foundation.pager.f) binds: [B:74:0x00e2, B:70:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe A[PHI: r14
  0x00fe: PHI (r14v11 androidx.compose.foundation.gestures.snapping.j) = (r14v8 androidx.compose.foundation.gestures.snapping.j), (r14v12 androidx.compose.foundation.gestures.snapping.j) binds: [B:84:0x00fc, B:80:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0122  */
    public static final vt6 c(Function0<az8> function0, PagerState pagerState, rx8 rx8Var, boolean z, Orientation orientation, int i, float f, f fVar, tc.b bVar, tc.c cVar, j jVar, ta2 ta2Var, Function0<Integer> function1, d dVar, int i2, int i3) {
        tc.b bVar2;
        boolean z2;
        tc.c cVar2;
        boolean z3;
        float f2;
        boolean z4;
        f fVar2;
        boolean z5;
        j jVar2;
        boolean z6;
        int i4;
        boolean z7;
        boolean zX;
        Object objR;
        if (e.k()) {
            e.o(-1294131537, i2, i3, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:61)");
        }
        boolean z8 = ((((i2 & 112) ^ 48) > 32 && dVar.x(pagerState)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && dVar.x(rx8Var)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && dVar.A(z)) || (i2 & 3072) == 2048) | ((((57344 & i2) ^ 24576) > 16384 && dVar.C(orientation.ordinal())) || (i2 & 24576) == 16384);
        if (((234881024 & i2) ^ 100663296) > 67108864) {
            bVar2 = bVar;
            if (dVar.x(bVar2)) {
                z2 = true;
            }
            boolean z9 = z8 | z2;
            if (((1879048192 & i2) ^ 805306368) > 536870912) {
                cVar2 = cVar;
                if (!dVar.x(cVar2)) {
                    z3 = true;
                }
                boolean z10 = z9 | z3;
                if (((3670016 & i2) ^ 1572864) > 1048576) {
                    f2 = f;
                    if (!dVar.B(f2)) {
                        z4 = true;
                    }
                    boolean z11 = z10 | z4;
                    if (((29360128 & i2) ^ 12582912) > 8388608) {
                        fVar2 = fVar;
                        if (!dVar.x(fVar2)) {
                            z5 = true;
                        }
                        boolean z12 = z11 | z5;
                        if (((i3 & 14) ^ 6) > 4) {
                            jVar2 = jVar;
                            if (!dVar.x(jVar2)) {
                                z6 = true;
                            }
                            boolean z13 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z12 | z6;
                            if (((458752 & i2) ^ 196608) > 131072) {
                                i4 = i;
                                if (!dVar.C(i4)) {
                                    z7 = true;
                                }
                                zX = z13 | z7 | dVar.x(ta2Var);
                                objR = dVar.R();
                                if (zX || objR == d.INSTANCE.a()) {
                                    a aVar = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                                    dVar.L(aVar);
                                    objR = aVar;
                                }
                                vt6 vt6Var = (vt6) objR;
                                if (e.k()) {
                                    e.n();
                                }
                                return vt6Var;
                            }
                            i4 = i;
                            if ((i2 & 196608) == 131072) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            zX = z13 | z7 | dVar.x(ta2Var);
                            objR = dVar.R();
                            if (zX) {
                                a aVar2 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                                dVar.L(aVar2);
                                objR = aVar2;
                            } else {
                                a aVar3 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                                dVar.L(aVar3);
                                objR = aVar3;
                            }
                            vt6 vt6Var2 = (vt6) objR;
                            if (e.k()) {
                                e.n();
                            }
                            return vt6Var2;
                        }
                        jVar2 = jVar;
                        if ((i3 & 6) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        boolean z14 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z12 | z6;
                        if (((458752 & i2) ^ 196608) > 131072) {
                            i4 = i;
                            if (!dVar.C(i4)) {
                                z7 = true;
                            }
                            zX = z14 | z7 | dVar.x(ta2Var);
                            objR = dVar.R();
                            if (zX) {
                                a aVar4 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                                dVar.L(aVar4);
                                objR = aVar4;
                            } else {
                                a aVar5 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                                dVar.L(aVar5);
                                objR = aVar5;
                            }
                            vt6 vt6Var3 = (vt6) objR;
                            if (e.k()) {
                                e.n();
                            }
                            return vt6Var3;
                        }
                        i4 = i;
                        if ((i2 & 196608) == 131072) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        zX = z14 | z7 | dVar.x(ta2Var);
                        objR = dVar.R();
                        if (zX) {
                            a aVar6 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar6);
                            objR = aVar6;
                        } else {
                            a aVar7 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar7);
                            objR = aVar7;
                        }
                        vt6 vt6Var4 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var4;
                    }
                    fVar2 = fVar;
                    if ((12582912 & i2) == 8388608) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z15 = z11 | z5;
                    if (((i3 & 14) ^ 6) > 4) {
                        jVar2 = jVar;
                        if (!dVar.x(jVar2)) {
                            z6 = true;
                        }
                        boolean z16 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z15 | z6;
                        if (((458752 & i2) ^ 196608) > 131072) {
                            i4 = i;
                            if (!dVar.C(i4)) {
                                z7 = true;
                            }
                            zX = z16 | z7 | dVar.x(ta2Var);
                            objR = dVar.R();
                            if (zX) {
                                a aVar8 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                                dVar.L(aVar8);
                                objR = aVar8;
                            } else {
                                a aVar9 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                                dVar.L(aVar9);
                                objR = aVar9;
                            }
                            vt6 vt6Var5 = (vt6) objR;
                            if (e.k()) {
                                e.n();
                            }
                            return vt6Var5;
                        }
                        i4 = i;
                        if ((i2 & 196608) == 131072) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        zX = z16 | z7 | dVar.x(ta2Var);
                        objR = dVar.R();
                        if (zX) {
                            a aVar10 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar10);
                            objR = aVar10;
                        } else {
                            a aVar11 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar11);
                            objR = aVar11;
                        }
                        vt6 vt6Var6 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var6;
                    }
                    jVar2 = jVar;
                    if ((i3 & 6) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z17 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z15 | z6;
                    if (((458752 & i2) ^ 196608) > 131072) {
                        i4 = i;
                        if (!dVar.C(i4)) {
                            z7 = true;
                        }
                        zX = z17 | z7 | dVar.x(ta2Var);
                        objR = dVar.R();
                        if (zX) {
                            a aVar12 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar12);
                            objR = aVar12;
                        } else {
                            a aVar13 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar13);
                            objR = aVar13;
                        }
                        vt6 vt6Var7 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var7;
                    }
                    i4 = i;
                    if ((i2 & 196608) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zX = z17 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar14 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar14);
                        objR = aVar14;
                    } else {
                        a aVar15 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar15);
                        objR = aVar15;
                    }
                    vt6 vt6Var8 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var8;
                }
                f2 = f;
                if ((1572864 & i2) == 1048576) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z18 = z10 | z4;
                if (((29360128 & i2) ^ 12582912) > 8388608) {
                    fVar2 = fVar;
                    if (!dVar.x(fVar2)) {
                        z5 = true;
                    }
                    boolean z19 = z18 | z5;
                    if (((i3 & 14) ^ 6) > 4) {
                        jVar2 = jVar;
                        if (!dVar.x(jVar2)) {
                            z6 = true;
                        }
                        boolean z110 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z19 | z6;
                        if (((458752 & i2) ^ 196608) > 131072) {
                            i4 = i;
                            if (!dVar.C(i4)) {
                                z7 = true;
                            }
                            zX = z110 | z7 | dVar.x(ta2Var);
                            objR = dVar.R();
                            if (zX) {
                                a aVar16 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                                dVar.L(aVar16);
                                objR = aVar16;
                            } else {
                                a aVar17 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                                dVar.L(aVar17);
                                objR = aVar17;
                            }
                            vt6 vt6Var9 = (vt6) objR;
                            if (e.k()) {
                                e.n();
                            }
                            return vt6Var9;
                        }
                        i4 = i;
                        if ((i2 & 196608) == 131072) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        zX = z110 | z7 | dVar.x(ta2Var);
                        objR = dVar.R();
                        if (zX) {
                            a aVar18 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar18);
                            objR = aVar18;
                        } else {
                            a aVar19 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar19);
                            objR = aVar19;
                        }
                        vt6 vt6Var10 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var10;
                    }
                    jVar2 = jVar;
                    if ((i3 & 6) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z111 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z19 | z6;
                    if (((458752 & i2) ^ 196608) > 131072) {
                        i4 = i;
                        if (!dVar.C(i4)) {
                            z7 = true;
                        }
                        zX = z111 | z7 | dVar.x(ta2Var);
                        objR = dVar.R();
                        if (zX) {
                            a aVar110 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar110);
                            objR = aVar110;
                        } else {
                            a aVar111 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar111);
                            objR = aVar111;
                        }
                        vt6 vt6Var11 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var11;
                    }
                    i4 = i;
                    if ((i2 & 196608) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zX = z111 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar112 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar112);
                        objR = aVar112;
                    } else {
                        a aVar113 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar113);
                        objR = aVar113;
                    }
                    vt6 vt6Var12 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var12;
                }
                fVar2 = fVar;
                if ((12582912 & i2) == 8388608) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z112 = z18 | z5;
                if (((i3 & 14) ^ 6) > 4) {
                    jVar2 = jVar;
                    if (!dVar.x(jVar2)) {
                        z6 = true;
                    }
                    boolean z113 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z112 | z6;
                    if (((458752 & i2) ^ 196608) > 131072) {
                        i4 = i;
                        if (!dVar.C(i4)) {
                            z7 = true;
                        }
                        zX = z113 | z7 | dVar.x(ta2Var);
                        objR = dVar.R();
                        if (zX) {
                            a aVar114 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar114);
                            objR = aVar114;
                        } else {
                            a aVar115 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar115);
                            objR = aVar115;
                        }
                        vt6 vt6Var13 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var13;
                    }
                    i4 = i;
                    if ((i2 & 196608) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zX = z113 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar116 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar116);
                        objR = aVar116;
                    } else {
                        a aVar117 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar117);
                        objR = aVar117;
                    }
                    vt6 vt6Var14 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var14;
                }
                jVar2 = jVar;
                if ((i3 & 6) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z114 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z112 | z6;
                if (((458752 & i2) ^ 196608) > 131072) {
                    i4 = i;
                    if (!dVar.C(i4)) {
                        z7 = true;
                    }
                    zX = z114 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar118 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar118);
                        objR = aVar118;
                    } else {
                        a aVar119 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar119);
                        objR = aVar119;
                    }
                    vt6 vt6Var15 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var15;
                }
                i4 = i;
                if ((i2 & 196608) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zX = z114 | z7 | dVar.x(ta2Var);
                objR = dVar.R();
                if (zX) {
                    a aVar1110 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar1110);
                    objR = aVar1110;
                } else {
                    a aVar1111 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar1111);
                    objR = aVar1111;
                }
                vt6 vt6Var16 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var16;
            }
            cVar2 = cVar;
            if ((805306368 & i2) == 536870912) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z115 = z9 | z3;
            if (((3670016 & i2) ^ 1572864) > 1048576) {
                f2 = f;
                if (!dVar.B(f2)) {
                    z4 = true;
                }
                boolean z116 = z115 | z4;
                if (((29360128 & i2) ^ 12582912) > 8388608) {
                    fVar2 = fVar;
                    if (!dVar.x(fVar2)) {
                        z5 = true;
                    }
                    boolean z117 = z116 | z5;
                    if (((i3 & 14) ^ 6) > 4) {
                        jVar2 = jVar;
                        if (!dVar.x(jVar2)) {
                            z6 = true;
                        }
                        boolean z118 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z117 | z6;
                        if (((458752 & i2) ^ 196608) > 131072) {
                            i4 = i;
                            if (!dVar.C(i4)) {
                                z7 = true;
                            }
                            zX = z118 | z7 | dVar.x(ta2Var);
                            objR = dVar.R();
                            if (zX) {
                                a aVar1112 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                                dVar.L(aVar1112);
                                objR = aVar1112;
                            } else {
                                a aVar1113 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                                dVar.L(aVar1113);
                                objR = aVar1113;
                            }
                            vt6 vt6Var17 = (vt6) objR;
                            if (e.k()) {
                                e.n();
                            }
                            return vt6Var17;
                        }
                        i4 = i;
                        if ((i2 & 196608) == 131072) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        zX = z118 | z7 | dVar.x(ta2Var);
                        objR = dVar.R();
                        if (zX) {
                            a aVar1114 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar1114);
                            objR = aVar1114;
                        } else {
                            a aVar1115 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar1115);
                            objR = aVar1115;
                        }
                        vt6 vt6Var18 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var18;
                    }
                    jVar2 = jVar;
                    if ((i3 & 6) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z119 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z117 | z6;
                    if (((458752 & i2) ^ 196608) > 131072) {
                        i4 = i;
                        if (!dVar.C(i4)) {
                            z7 = true;
                        }
                        zX = z119 | z7 | dVar.x(ta2Var);
                        objR = dVar.R();
                        if (zX) {
                            a aVar1116 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar1116);
                            objR = aVar1116;
                        } else {
                            a aVar1117 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar1117);
                            objR = aVar1117;
                        }
                        vt6 vt6Var19 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var19;
                    }
                    i4 = i;
                    if ((i2 & 196608) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zX = z119 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar1118 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar1118);
                        objR = aVar1118;
                    } else {
                        a aVar1119 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar1119);
                        objR = aVar1119;
                    }
                    vt6 vt6Var110 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var110;
                }
                fVar2 = fVar;
                if ((12582912 & i2) == 8388608) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z1110 = z116 | z5;
                if (((i3 & 14) ^ 6) > 4) {
                    jVar2 = jVar;
                    if (!dVar.x(jVar2)) {
                        z6 = true;
                    }
                    boolean z1111 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z1110 | z6;
                    if (((458752 & i2) ^ 196608) > 131072) {
                        i4 = i;
                        if (!dVar.C(i4)) {
                            z7 = true;
                        }
                        zX = z1111 | z7 | dVar.x(ta2Var);
                        objR = dVar.R();
                        if (zX) {
                            a aVar11110 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar11110);
                            objR = aVar11110;
                        } else {
                            a aVar11111 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar11111);
                            objR = aVar11111;
                        }
                        vt6 vt6Var111 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var111;
                    }
                    i4 = i;
                    if ((i2 & 196608) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zX = z1111 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar11112 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar11112);
                        objR = aVar11112;
                    } else {
                        a aVar11113 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar11113);
                        objR = aVar11113;
                    }
                    vt6 vt6Var112 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var112;
                }
                jVar2 = jVar;
                if ((i3 & 6) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z1112 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z1110 | z6;
                if (((458752 & i2) ^ 196608) > 131072) {
                    i4 = i;
                    if (!dVar.C(i4)) {
                        z7 = true;
                    }
                    zX = z1112 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar11114 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar11114);
                        objR = aVar11114;
                    } else {
                        a aVar11115 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar11115);
                        objR = aVar11115;
                    }
                    vt6 vt6Var113 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var113;
                }
                i4 = i;
                if ((i2 & 196608) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zX = z1112 | z7 | dVar.x(ta2Var);
                objR = dVar.R();
                if (zX) {
                    a aVar11116 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar11116);
                    objR = aVar11116;
                } else {
                    a aVar11117 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar11117);
                    objR = aVar11117;
                }
                vt6 vt6Var114 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var114;
            }
            f2 = f;
            if ((1572864 & i2) == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z1113 = z115 | z4;
            if (((29360128 & i2) ^ 12582912) > 8388608) {
                fVar2 = fVar;
                if (!dVar.x(fVar2)) {
                    z5 = true;
                }
                boolean z1114 = z1113 | z5;
                if (((i3 & 14) ^ 6) > 4) {
                    jVar2 = jVar;
                    if (!dVar.x(jVar2)) {
                        z6 = true;
                    }
                    boolean z1115 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z1114 | z6;
                    if (((458752 & i2) ^ 196608) > 131072) {
                        i4 = i;
                        if (!dVar.C(i4)) {
                            z7 = true;
                        }
                        zX = z1115 | z7 | dVar.x(ta2Var);
                        objR = dVar.R();
                        if (zX) {
                            a aVar11118 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar11118);
                            objR = aVar11118;
                        } else {
                            a aVar11119 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar11119);
                            objR = aVar11119;
                        }
                        vt6 vt6Var115 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var115;
                    }
                    i4 = i;
                    if ((i2 & 196608) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zX = z1115 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar111110 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar111110);
                        objR = aVar111110;
                    } else {
                        a aVar111111 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar111111);
                        objR = aVar111111;
                    }
                    vt6 vt6Var116 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var116;
                }
                jVar2 = jVar;
                if ((i3 & 6) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z1116 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z1114 | z6;
                if (((458752 & i2) ^ 196608) > 131072) {
                    i4 = i;
                    if (!dVar.C(i4)) {
                        z7 = true;
                    }
                    zX = z1116 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar111112 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar111112);
                        objR = aVar111112;
                    } else {
                        a aVar111113 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar111113);
                        objR = aVar111113;
                    }
                    vt6 vt6Var117 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var117;
                }
                i4 = i;
                if ((i2 & 196608) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zX = z1116 | z7 | dVar.x(ta2Var);
                objR = dVar.R();
                if (zX) {
                    a aVar111114 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar111114);
                    objR = aVar111114;
                } else {
                    a aVar111115 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar111115);
                    objR = aVar111115;
                }
                vt6 vt6Var118 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var118;
            }
            fVar2 = fVar;
            if ((12582912 & i2) == 8388608) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z1117 = z1113 | z5;
            if (((i3 & 14) ^ 6) > 4) {
                jVar2 = jVar;
                if (!dVar.x(jVar2)) {
                    z6 = true;
                }
                boolean z1118 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z1117 | z6;
                if (((458752 & i2) ^ 196608) > 131072) {
                    i4 = i;
                    if (!dVar.C(i4)) {
                        z7 = true;
                    }
                    zX = z1118 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar111116 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar111116);
                        objR = aVar111116;
                    } else {
                        a aVar111117 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar111117);
                        objR = aVar111117;
                    }
                    vt6 vt6Var119 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var119;
                }
                i4 = i;
                if ((i2 & 196608) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zX = z1118 | z7 | dVar.x(ta2Var);
                objR = dVar.R();
                if (zX) {
                    a aVar111118 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar111118);
                    objR = aVar111118;
                } else {
                    a aVar111119 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar111119);
                    objR = aVar111119;
                }
                vt6 vt6Var1110 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var1110;
            }
            jVar2 = jVar;
            if ((i3 & 6) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z1119 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z1117 | z6;
            if (((458752 & i2) ^ 196608) > 131072) {
                i4 = i;
                if (!dVar.C(i4)) {
                    z7 = true;
                }
                zX = z1119 | z7 | dVar.x(ta2Var);
                objR = dVar.R();
                if (zX) {
                    a aVar1111110 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar1111110);
                    objR = aVar1111110;
                } else {
                    a aVar1111111 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar1111111);
                    objR = aVar1111111;
                }
                vt6 vt6Var1111 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var1111;
            }
            i4 = i;
            if ((i2 & 196608) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            zX = z1119 | z7 | dVar.x(ta2Var);
            objR = dVar.R();
            if (zX) {
                a aVar1111112 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                dVar.L(aVar1111112);
                objR = aVar1111112;
            } else {
                a aVar1111113 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                dVar.L(aVar1111113);
                objR = aVar1111113;
            }
            vt6 vt6Var1112 = (vt6) objR;
            if (e.k()) {
                e.n();
            }
            return vt6Var1112;
        }
        bVar2 = bVar;
        if ((100663296 & i2) == 67108864) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z20 = z8 | z2;
        if (((1879048192 & i2) ^ 805306368) > 536870912) {
            cVar2 = cVar;
            if (!dVar.x(cVar2)) {
                z3 = true;
            }
            boolean z1120 = z20 | z3;
            if (((3670016 & i2) ^ 1572864) > 1048576) {
                f2 = f;
                if (!dVar.B(f2)) {
                    z4 = true;
                }
                boolean z11110 = z1120 | z4;
                if (((29360128 & i2) ^ 12582912) > 8388608) {
                    fVar2 = fVar;
                    if (!dVar.x(fVar2)) {
                        z5 = true;
                    }
                    boolean z11111 = z11110 | z5;
                    if (((i3 & 14) ^ 6) > 4) {
                        jVar2 = jVar;
                        if (!dVar.x(jVar2)) {
                            z6 = true;
                        }
                        boolean z11112 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z11111 | z6;
                        if (((458752 & i2) ^ 196608) > 131072) {
                            i4 = i;
                            if (!dVar.C(i4)) {
                                z7 = true;
                            }
                            zX = z11112 | z7 | dVar.x(ta2Var);
                            objR = dVar.R();
                            if (zX) {
                                a aVar1111114 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                                dVar.L(aVar1111114);
                                objR = aVar1111114;
                            } else {
                                a aVar1111115 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                                dVar.L(aVar1111115);
                                objR = aVar1111115;
                            }
                            vt6 vt6Var1113 = (vt6) objR;
                            if (e.k()) {
                                e.n();
                            }
                            return vt6Var1113;
                        }
                        i4 = i;
                        if ((i2 & 196608) == 131072) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        zX = z11112 | z7 | dVar.x(ta2Var);
                        objR = dVar.R();
                        if (zX) {
                            a aVar1111116 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar1111116);
                            objR = aVar1111116;
                        } else {
                            a aVar1111117 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar1111117);
                            objR = aVar1111117;
                        }
                        vt6 vt6Var1114 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var1114;
                    }
                    jVar2 = jVar;
                    if ((i3 & 6) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z11113 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z11111 | z6;
                    if (((458752 & i2) ^ 196608) > 131072) {
                        i4 = i;
                        if (!dVar.C(i4)) {
                            z7 = true;
                        }
                        zX = z11113 | z7 | dVar.x(ta2Var);
                        objR = dVar.R();
                        if (zX) {
                            a aVar1111118 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar1111118);
                            objR = aVar1111118;
                        } else {
                            a aVar1111119 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar1111119);
                            objR = aVar1111119;
                        }
                        vt6 vt6Var1115 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var1115;
                    }
                    i4 = i;
                    if ((i2 & 196608) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zX = z11113 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar11111110 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar11111110);
                        objR = aVar11111110;
                    } else {
                        a aVar11111111 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar11111111);
                        objR = aVar11111111;
                    }
                    vt6 vt6Var1116 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var1116;
                }
                fVar2 = fVar;
                if ((12582912 & i2) == 8388608) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z11114 = z11110 | z5;
                if (((i3 & 14) ^ 6) > 4) {
                    jVar2 = jVar;
                    if (!dVar.x(jVar2)) {
                        z6 = true;
                    }
                    boolean z11115 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z11114 | z6;
                    if (((458752 & i2) ^ 196608) > 131072) {
                        i4 = i;
                        if (!dVar.C(i4)) {
                            z7 = true;
                        }
                        zX = z11115 | z7 | dVar.x(ta2Var);
                        objR = dVar.R();
                        if (zX) {
                            a aVar11111112 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar11111112);
                            objR = aVar11111112;
                        } else {
                            a aVar11111113 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar11111113);
                            objR = aVar11111113;
                        }
                        vt6 vt6Var1117 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var1117;
                    }
                    i4 = i;
                    if ((i2 & 196608) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zX = z11115 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar11111114 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar11111114);
                        objR = aVar11111114;
                    } else {
                        a aVar11111115 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar11111115);
                        objR = aVar11111115;
                    }
                    vt6 vt6Var1118 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var1118;
                }
                jVar2 = jVar;
                if ((i3 & 6) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z11116 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z11114 | z6;
                if (((458752 & i2) ^ 196608) > 131072) {
                    i4 = i;
                    if (!dVar.C(i4)) {
                        z7 = true;
                    }
                    zX = z11116 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar11111116 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar11111116);
                        objR = aVar11111116;
                    } else {
                        a aVar11111117 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar11111117);
                        objR = aVar11111117;
                    }
                    vt6 vt6Var1119 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var1119;
                }
                i4 = i;
                if ((i2 & 196608) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zX = z11116 | z7 | dVar.x(ta2Var);
                objR = dVar.R();
                if (zX) {
                    a aVar11111118 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar11111118);
                    objR = aVar11111118;
                } else {
                    a aVar11111119 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar11111119);
                    objR = aVar11111119;
                }
                vt6 vt6Var11110 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var11110;
            }
            f2 = f;
            if ((1572864 & i2) == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z11117 = z1120 | z4;
            if (((29360128 & i2) ^ 12582912) > 8388608) {
                fVar2 = fVar;
                if (!dVar.x(fVar2)) {
                    z5 = true;
                }
                boolean z11118 = z11117 | z5;
                if (((i3 & 14) ^ 6) > 4) {
                    jVar2 = jVar;
                    if (!dVar.x(jVar2)) {
                        z6 = true;
                    }
                    boolean z11119 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z11118 | z6;
                    if (((458752 & i2) ^ 196608) > 131072) {
                        i4 = i;
                        if (!dVar.C(i4)) {
                            z7 = true;
                        }
                        zX = z11119 | z7 | dVar.x(ta2Var);
                        objR = dVar.R();
                        if (zX) {
                            a aVar111111110 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar111111110);
                            objR = aVar111111110;
                        } else {
                            a aVar111111111 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar111111111);
                            objR = aVar111111111;
                        }
                        vt6 vt6Var11111 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var11111;
                    }
                    i4 = i;
                    if ((i2 & 196608) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zX = z11119 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar111111112 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar111111112);
                        objR = aVar111111112;
                    } else {
                        a aVar111111113 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar111111113);
                        objR = aVar111111113;
                    }
                    vt6 vt6Var11112 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var11112;
                }
                jVar2 = jVar;
                if ((i3 & 6) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z111110 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z11118 | z6;
                if (((458752 & i2) ^ 196608) > 131072) {
                    i4 = i;
                    if (!dVar.C(i4)) {
                        z7 = true;
                    }
                    zX = z111110 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar111111114 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar111111114);
                        objR = aVar111111114;
                    } else {
                        a aVar111111115 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar111111115);
                        objR = aVar111111115;
                    }
                    vt6 vt6Var11113 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var11113;
                }
                i4 = i;
                if ((i2 & 196608) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zX = z111110 | z7 | dVar.x(ta2Var);
                objR = dVar.R();
                if (zX) {
                    a aVar111111116 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar111111116);
                    objR = aVar111111116;
                } else {
                    a aVar111111117 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar111111117);
                    objR = aVar111111117;
                }
                vt6 vt6Var11114 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var11114;
            }
            fVar2 = fVar;
            if ((12582912 & i2) == 8388608) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z111111 = z11117 | z5;
            if (((i3 & 14) ^ 6) > 4) {
                jVar2 = jVar;
                if (!dVar.x(jVar2)) {
                    z6 = true;
                }
                boolean z111112 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z111111 | z6;
                if (((458752 & i2) ^ 196608) > 131072) {
                    i4 = i;
                    if (!dVar.C(i4)) {
                        z7 = true;
                    }
                    zX = z111112 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar111111118 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar111111118);
                        objR = aVar111111118;
                    } else {
                        a aVar111111119 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar111111119);
                        objR = aVar111111119;
                    }
                    vt6 vt6Var11115 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var11115;
                }
                i4 = i;
                if ((i2 & 196608) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zX = z111112 | z7 | dVar.x(ta2Var);
                objR = dVar.R();
                if (zX) {
                    a aVar1111111110 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar1111111110);
                    objR = aVar1111111110;
                } else {
                    a aVar1111111111 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar1111111111);
                    objR = aVar1111111111;
                }
                vt6 vt6Var11116 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var11116;
            }
            jVar2 = jVar;
            if ((i3 & 6) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z111113 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z111111 | z6;
            if (((458752 & i2) ^ 196608) > 131072) {
                i4 = i;
                if (!dVar.C(i4)) {
                    z7 = true;
                }
                zX = z111113 | z7 | dVar.x(ta2Var);
                objR = dVar.R();
                if (zX) {
                    a aVar1111111112 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar1111111112);
                    objR = aVar1111111112;
                } else {
                    a aVar1111111113 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar1111111113);
                    objR = aVar1111111113;
                }
                vt6 vt6Var11117 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var11117;
            }
            i4 = i;
            if ((i2 & 196608) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            zX = z111113 | z7 | dVar.x(ta2Var);
            objR = dVar.R();
            if (zX) {
                a aVar1111111114 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                dVar.L(aVar1111111114);
                objR = aVar1111111114;
            } else {
                a aVar1111111115 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                dVar.L(aVar1111111115);
                objR = aVar1111111115;
            }
            vt6 vt6Var11118 = (vt6) objR;
            if (e.k()) {
                e.n();
            }
            return vt6Var11118;
        }
        cVar2 = cVar;
        if ((805306368 & i2) == 536870912) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z1121 = z20 | z3;
        if (((3670016 & i2) ^ 1572864) > 1048576) {
            f2 = f;
            if (!dVar.B(f2)) {
                z4 = true;
            }
            boolean z111114 = z1121 | z4;
            if (((29360128 & i2) ^ 12582912) > 8388608) {
                fVar2 = fVar;
                if (!dVar.x(fVar2)) {
                    z5 = true;
                }
                boolean z111115 = z111114 | z5;
                if (((i3 & 14) ^ 6) > 4) {
                    jVar2 = jVar;
                    if (!dVar.x(jVar2)) {
                        z6 = true;
                    }
                    boolean z111116 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z111115 | z6;
                    if (((458752 & i2) ^ 196608) > 131072) {
                        i4 = i;
                        if (!dVar.C(i4)) {
                            z7 = true;
                        }
                        zX = z111116 | z7 | dVar.x(ta2Var);
                        objR = dVar.R();
                        if (zX) {
                            a aVar1111111116 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar1111111116);
                            objR = aVar1111111116;
                        } else {
                            a aVar1111111117 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                            dVar.L(aVar1111111117);
                            objR = aVar1111111117;
                        }
                        vt6 vt6Var11119 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var11119;
                    }
                    i4 = i;
                    if ((i2 & 196608) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zX = z111116 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar1111111118 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar1111111118);
                        objR = aVar1111111118;
                    } else {
                        a aVar1111111119 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar1111111119);
                        objR = aVar1111111119;
                    }
                    vt6 vt6Var111110 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var111110;
                }
                jVar2 = jVar;
                if ((i3 & 6) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z111117 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z111115 | z6;
                if (((458752 & i2) ^ 196608) > 131072) {
                    i4 = i;
                    if (!dVar.C(i4)) {
                        z7 = true;
                    }
                    zX = z111117 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar11111111110 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar11111111110);
                        objR = aVar11111111110;
                    } else {
                        a aVar11111111111 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar11111111111);
                        objR = aVar11111111111;
                    }
                    vt6 vt6Var111111 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var111111;
                }
                i4 = i;
                if ((i2 & 196608) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zX = z111117 | z7 | dVar.x(ta2Var);
                objR = dVar.R();
                if (zX) {
                    a aVar11111111112 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar11111111112);
                    objR = aVar11111111112;
                } else {
                    a aVar11111111113 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar11111111113);
                    objR = aVar11111111113;
                }
                vt6 vt6Var111112 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var111112;
            }
            fVar2 = fVar;
            if ((12582912 & i2) == 8388608) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z111118 = z111114 | z5;
            if (((i3 & 14) ^ 6) > 4) {
                jVar2 = jVar;
                if (!dVar.x(jVar2)) {
                    z6 = true;
                }
                boolean z111119 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z111118 | z6;
                if (((458752 & i2) ^ 196608) > 131072) {
                    i4 = i;
                    if (!dVar.C(i4)) {
                        z7 = true;
                    }
                    zX = z111119 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar11111111114 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar11111111114);
                        objR = aVar11111111114;
                    } else {
                        a aVar11111111115 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar11111111115);
                        objR = aVar11111111115;
                    }
                    vt6 vt6Var111113 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var111113;
                }
                i4 = i;
                if ((i2 & 196608) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zX = z111119 | z7 | dVar.x(ta2Var);
                objR = dVar.R();
                if (zX) {
                    a aVar11111111116 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar11111111116);
                    objR = aVar11111111116;
                } else {
                    a aVar11111111117 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar11111111117);
                    objR = aVar11111111117;
                }
                vt6 vt6Var111114 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var111114;
            }
            jVar2 = jVar;
            if ((i3 & 6) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z1111110 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z111118 | z6;
            if (((458752 & i2) ^ 196608) > 131072) {
                i4 = i;
                if (!dVar.C(i4)) {
                    z7 = true;
                }
                zX = z1111110 | z7 | dVar.x(ta2Var);
                objR = dVar.R();
                if (zX) {
                    a aVar11111111118 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar11111111118);
                    objR = aVar11111111118;
                } else {
                    a aVar11111111119 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar11111111119);
                    objR = aVar11111111119;
                }
                vt6 vt6Var111115 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var111115;
            }
            i4 = i;
            if ((i2 & 196608) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            zX = z1111110 | z7 | dVar.x(ta2Var);
            objR = dVar.R();
            if (zX) {
                a aVar111111111110 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                dVar.L(aVar111111111110);
                objR = aVar111111111110;
            } else {
                a aVar111111111111 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                dVar.L(aVar111111111111);
                objR = aVar111111111111;
            }
            vt6 vt6Var111116 = (vt6) objR;
            if (e.k()) {
                e.n();
            }
            return vt6Var111116;
        }
        f2 = f;
        if ((1572864 & i2) == 1048576) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z1111111 = z1121 | z4;
        if (((29360128 & i2) ^ 12582912) > 8388608) {
            fVar2 = fVar;
            if (!dVar.x(fVar2)) {
                z5 = true;
            }
            boolean z1111112 = z1111111 | z5;
            if (((i3 & 14) ^ 6) > 4) {
                jVar2 = jVar;
                if (!dVar.x(jVar2)) {
                    z6 = true;
                }
                boolean z1111113 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z1111112 | z6;
                if (((458752 & i2) ^ 196608) > 131072) {
                    i4 = i;
                    if (!dVar.C(i4)) {
                        z7 = true;
                    }
                    zX = z1111113 | z7 | dVar.x(ta2Var);
                    objR = dVar.R();
                    if (zX) {
                        a aVar111111111112 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar111111111112);
                        objR = aVar111111111112;
                    } else {
                        a aVar111111111113 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                        dVar.L(aVar111111111113);
                        objR = aVar111111111113;
                    }
                    vt6 vt6Var111117 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var111117;
                }
                i4 = i;
                if ((i2 & 196608) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zX = z1111113 | z7 | dVar.x(ta2Var);
                objR = dVar.R();
                if (zX) {
                    a aVar111111111114 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar111111111114);
                    objR = aVar111111111114;
                } else {
                    a aVar111111111115 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar111111111115);
                    objR = aVar111111111115;
                }
                vt6 vt6Var111118 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var111118;
            }
            jVar2 = jVar;
            if ((i3 & 6) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z1111114 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z1111112 | z6;
            if (((458752 & i2) ^ 196608) > 131072) {
                i4 = i;
                if (!dVar.C(i4)) {
                    z7 = true;
                }
                zX = z1111114 | z7 | dVar.x(ta2Var);
                objR = dVar.R();
                if (zX) {
                    a aVar111111111116 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar111111111116);
                    objR = aVar111111111116;
                } else {
                    a aVar111111111117 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar111111111117);
                    objR = aVar111111111117;
                }
                vt6 vt6Var111119 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var111119;
            }
            i4 = i;
            if ((i2 & 196608) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            zX = z1111114 | z7 | dVar.x(ta2Var);
            objR = dVar.R();
            if (zX) {
                a aVar111111111118 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                dVar.L(aVar111111111118);
                objR = aVar111111111118;
            } else {
                a aVar111111111119 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                dVar.L(aVar111111111119);
                objR = aVar111111111119;
            }
            vt6 vt6Var1111110 = (vt6) objR;
            if (e.k()) {
                e.n();
            }
            return vt6Var1111110;
        }
        fVar2 = fVar;
        if ((12582912 & i2) == 8388608) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z1111115 = z1111111 | z5;
        if (((i3 & 14) ^ 6) > 4) {
            jVar2 = jVar;
            if (!dVar.x(jVar2)) {
                z6 = true;
            }
            boolean z1111116 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z1111115 | z6;
            if (((458752 & i2) ^ 196608) > 131072) {
                i4 = i;
                if (!dVar.C(i4)) {
                    z7 = true;
                }
                zX = z1111116 | z7 | dVar.x(ta2Var);
                objR = dVar.R();
                if (zX) {
                    a aVar1111111111110 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar1111111111110);
                    objR = aVar1111111111110;
                } else {
                    a aVar1111111111111 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                    dVar.L(aVar1111111111111);
                    objR = aVar1111111111111;
                }
                vt6 vt6Var1111111 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var1111111;
            }
            i4 = i;
            if ((i2 & 196608) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            zX = z1111116 | z7 | dVar.x(ta2Var);
            objR = dVar.R();
            if (zX) {
                a aVar1111111111112 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                dVar.L(aVar1111111111112);
                objR = aVar1111111111112;
            } else {
                a aVar1111111111113 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                dVar.L(aVar1111111111113);
                objR = aVar1111111111113;
            }
            vt6 vt6Var1111112 = (vt6) objR;
            if (e.k()) {
                e.n();
            }
            return vt6Var1111112;
        }
        jVar2 = jVar;
        if ((i3 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z1111117 = ((((i3 & 896) ^ 384) <= 256 && dVar.x(function1)) || (i3 & 384) == 256) | z1111115 | z6;
        if (((458752 & i2) ^ 196608) > 131072) {
            i4 = i;
            if (!dVar.C(i4)) {
                z7 = true;
            }
            zX = z1111117 | z7 | dVar.x(ta2Var);
            objR = dVar.R();
            if (zX) {
                a aVar1111111111114 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                dVar.L(aVar1111111111114);
                objR = aVar1111111111114;
            } else {
                a aVar1111111111115 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
                dVar.L(aVar1111111111115);
                objR = aVar1111111111115;
            }
            vt6 vt6Var1111113 = (vt6) objR;
            if (e.k()) {
                e.n();
            }
            return vt6Var1111113;
        }
        i4 = i;
        if ((i2 & 196608) == 131072) {
            z7 = true;
        } else {
            z7 = false;
        }
        zX = z1111117 | z7 | dVar.x(ta2Var);
        objR = dVar.R();
        if (zX) {
            a aVar1111111111116 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
            dVar.L(aVar1111111111116);
            objR = aVar1111111111116;
        } else {
            a aVar1111111111117 = new a(pagerState, orientation, rx8Var, z, f2, fVar2, function0, function1, cVar2, bVar2, i4, jVar2, ta2Var);
            dVar.L(aVar1111111111117);
            objR = aVar1111111111117;
        }
        vt6 vt6Var1111114 = (vt6) objR;
        if (e.k()) {
            e.n();
        }
        return vt6Var1111114;
    }
}
