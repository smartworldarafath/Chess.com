package com.google.inputmethod;

import android.os.Trace;
import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.layout.c;
import androidx.compose.p001foundation.lazy.LazyListItemProviderKt;
import androidx.compose.p001foundation.lazy.LazyListState;
import androidx.compose.p001foundation.lazy.layout.f;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.google.android.ps4;
import com.google.android.ta2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.collections.m;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u009f\u0001\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0087\u0001\u0010(\u001a\u00020'2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0003¢\u0006\u0004\b(\u0010)\u001a)\u00100\u001a\u00020\u001a*\u00020*2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Lcom/google/android/rx8;", "contentPadding", "", "reverseLayout", "isVertical", "Lcom/google/android/qg4;", "flingBehavior", "userScrollEnabled", "Lcom/google/android/zv8;", "overscrollEffect", "", "beyondBoundsItemCount", "Lcom/google/android/tc$b;", "horizontalAlignment", "Landroidx/compose/foundation/layout/c$n;", "verticalArrangement", "Lcom/google/android/tc$c;", "verticalAlignment", "Landroidx/compose/foundation/layout/c$e;", "horizontalArrangement", "Lkotlin/Function1;", "Lcom/google/android/cw6;", "", "content", "b", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/lazy/LazyListState;Lcom/google/android/rx8;ZZLcom/google/android/qg4;ZLcom/google/android/zv8;ILcom/google/android/tc$b;Landroidx/compose/foundation/layout/c$n;Lcom/google/android/tc$c;Landroidx/compose/foundation/layout/c$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;III)V", "Lkotlin/Function0;", "Lcom/google/android/hv6;", "itemProviderLambda", "Lcom/google/android/ta2;", "coroutineScope", "Lcom/google/android/i05;", "graphicsContext", "Lcom/google/android/d9c;", "stickyItemsPlacement", "Lcom/google/android/vt6;", "f", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Lcom/google/android/rx8;ZZILcom/google/android/tc$b;Lcom/google/android/tc$c;Landroidx/compose/foundation/layout/c$e;Landroidx/compose/foundation/layout/c$n;Lcom/google/android/ta2;Lcom/google/android/i05;Lcom/google/android/d9c;Landroidx/compose/runtime/d;II)Lcom/google/android/vt6;", "Lcom/google/android/h11;", "", "Lcom/google/android/vv6;", "visibleItemsList", "Lcom/google/android/wv6;", "measuredItemProvider", "e", "(Lcom/google/android/h11;Ljava/util/List;Lcom/google/android/wv6;)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class mv6 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements vt6 {
        final /* synthetic */ LazyListState a;
        final /* synthetic */ boolean b;
        final /* synthetic */ rx8 c;
        final /* synthetic */ boolean d;
        final /* synthetic */ Function0<hv6> e;
        final /* synthetic */ c.n f;
        final /* synthetic */ c.e g;
        final /* synthetic */ int h;
        final /* synthetic */ ta2 i;
        final /* synthetic */ i05 j;
        final /* synthetic */ d9c k;
        final /* synthetic */ tc.b l;
        final /* synthetic */ tc.c m;

        /* JADX INFO: renamed from: com.google.android.mv6$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J?\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/google/android/mv6$a$a", "Lcom/google/android/wv6;", "", "index", "", "key", "contentType", "", "Landroidx/compose/ui/layout/o;", "placeables", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/vv6;", "c", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Lcom/google/android/vv6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0116a extends wv6 {
            final /* synthetic */ boolean e;
            final /* synthetic */ wt6 f;
            final /* synthetic */ int g;
            final /* synthetic */ int h;
            final /* synthetic */ tc.b i;
            final /* synthetic */ tc.c j;
            final /* synthetic */ boolean k;
            final /* synthetic */ int l;
            final /* synthetic */ int m;
            final /* synthetic */ long n;
            final /* synthetic */ LazyListState o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0116a(long j, boolean z, hv6 hv6Var, wt6 wt6Var, int i, int i2, tc.b bVar, tc.c cVar, boolean z2, int i3, int i4, long j2, LazyListState lazyListState) {
                super(j, z, hv6Var, wt6Var, null);
                this.e = z;
                this.f = wt6Var;
                this.g = i;
                this.h = i2;
                this.i = bVar;
                this.j = cVar;
                this.k = z2;
                this.l = i3;
                this.m = i4;
                this.n = j2;
                this.o = lazyListState;
            }

            @Override // com.google.inputmethod.wv6
            public vv6 c(int index, Object key, Object contentType, List<? extends o> placeables, long constraints) {
                return new vv6(index, placeables, this.e, this.i, this.j, this.f.getLayoutDirection(), this.k, this.l, this.m, index == this.g + (-1) ? 0 : this.h, this.n, key, contentType, this.o.B(), constraints, null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LazyListState lazyListState, boolean z, rx8 rx8Var, boolean z2, Function0<? extends hv6> function0, c.n nVar, c.e eVar, int i, ta2 ta2Var, i05 i05Var, d9c d9cVar, tc.b bVar, tc.c cVar) {
            this.a = lazyListState;
            this.b = z;
            this.c = rx8Var;
            this.d = z2;
            this.e = function0;
            this.f = nVar;
            this.g = eVar;
            this.h = i;
            this.i = ta2Var;
            this.j = i05Var;
            this.k = d9cVar;
            this.l = bVar;
            this.m = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fj7 c(wt6 wt6Var, long j, int i, int i2, int i3, int i4, Function1 function1) {
            return wt6Var.h2(nx1.g(j, i3 + i), nx1.f(j, i4 + i2), b0.j(), function1);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        @Override // com.google.inputmethod.vt6
        public final fj7 a(final wt6 wt6Var, final long j) throws KotlinNothingValueException {
            int i;
            float spacing;
            long jF;
            gn8.a(this.a.D());
            boolean z = this.a.getHasLookaheadOccurred() || wt6Var.G1();
            fa1.a(j, this.b ? Orientation.Vertical : Orientation.Horizontal);
            int iO1 = this.b ? wt6Var.O1(this.c.b(wt6Var.getLayoutDirection())) : wt6Var.O1(nx8.k(this.c, wt6Var.getLayoutDirection()));
            int iO2 = this.b ? wt6Var.O1(this.c.c(wt6Var.getLayoutDirection())) : wt6Var.O1(nx8.j(this.c, wt6Var.getLayoutDirection()));
            int iO3 = wt6Var.O1(this.c.getTop());
            int iO4 = wt6Var.O1(this.c.getBottom());
            final int i2 = iO3 + iO4;
            final int i3 = iO1 + iO2;
            boolean z2 = this.b;
            int i4 = z2 ? i2 : i3;
            if (z2 && !this.d) {
                i = iO3;
            } else if (z2 && this.d) {
                i = iO4;
            } else {
                i = (z2 || this.d) ? iO2 : iO1;
            }
            int i5 = i4 - i;
            long jI = nx1.i(j, -i3, -i2);
            hv6 hv6Var = (hv6) this.e.invoke();
            hv6Var.getItemScope().g(kx1.l(jI), kx1.k(jI));
            if (this.b) {
                c.n nVar = this.f;
                if (nVar == null) {
                    cx5.b("null verticalArrangement when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                spacing = nVar.getSpacing();
            } else {
                c.e eVar = this.g;
                if (eVar == null) {
                    cx5.b("null horizontalAlignment when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                spacing = eVar.getSpacing();
            }
            int iO5 = wt6Var.O1(spacing);
            int iA = hv6Var.a();
            int iK = this.b ? kx1.k(j) - i2 : kx1.l(j) - i3;
            if (!this.d || iK > 0) {
                jF = g16.f((((long) iO1) << 32) | (((long) iO3) & 4294967295L));
            } else {
                boolean z3 = this.b;
                if (!z3) {
                    iO1 += iK;
                }
                if (z3) {
                    iO3 += iK;
                }
                jF = g16.f((((long) iO1) << 32) | (((long) iO3) & 4294967295L));
            }
            C0116a c0116a = new C0116a(jI, this.b, hv6Var, wt6Var, iA, iO5, this.l, this.m, this.d, i, i5, jF, this.a);
            g.Companion companion = g.INSTANCE;
            LazyListState lazyListState = this.a;
            g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            g gVarE = companion.e(gVarD);
            try {
                int iY = lazyListState.Y(hv6Var, lazyListState.x());
                int iY2 = lazyListState.y();
                Unit unit = Unit.a;
                companion.l(gVarD, gVarE, function1G);
                uv6 uv6VarI = tv6.i(iA, c0116a, iK, i, i5, iO5, iY, iY2, (wt6Var.G1() || !z) ? this.a.getScrollToBeConsumed() : this.a.K(), jI, this.b, this.f, this.g, this.d, wt6Var, this.a.B(), this.h, at6.a(hv6Var, this.a.getPinnedItems(), this.a.getBeyondBoundsInfo()), z, wt6Var.G1(), this.i, this.a.G(), this.j, this.k, !this.a.getSkipItemPlacementAnimation(), new ps4() { // from class: com.google.android.lv6
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return mv6.a.c(wt6Var, j, i3, i2, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (Function1) obj3);
                    }
                });
                LazyListState.t(this.a, uv6VarI, wt6Var.G1(), false, 4, null);
                Object prefetchStrategy = this.a.getPrefetchStrategy();
                h11 h11Var = prefetchStrategy instanceof h11 ? (h11) prefetchStrategy : null;
                if (h11Var != null) {
                    mv6.e(h11Var, uv6VarI.h(), c0116a);
                }
                return uv6VarI;
            } catch (Throwable th) {
                companion.l(gVarD, gVarE, function1G);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x0168  */
    /* JADX WARN: Code duplicated, block: B:127:0x0184  */
    /* JADX WARN: Code duplicated, block: B:130:0x018d  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b0 A[PHI: r4 r7 r8 r9 r11
  0x01b0: PHI (r4v19 int) = (r4v11 int), (r4v22 int) binds: [B:154:0x01d8, B:138:0x01a8] A[DONT_GENERATE, DONT_INLINE]
  0x01b0: PHI (r7v11 int) = (r7v5 int), (r7v12 int) binds: [B:154:0x01d8, B:138:0x01a8] A[DONT_GENERATE, DONT_INLINE]
  0x01b0: PHI (r8v7 com.google.android.tc$b) = (r8v2 com.google.android.tc$b), (r8v8 com.google.android.tc$b) binds: [B:154:0x01d8, B:138:0x01a8] A[DONT_GENERATE, DONT_INLINE]
  0x01b0: PHI (r9v9 com.google.android.tc$c) = (r9v4 com.google.android.tc$c), (r9v10 com.google.android.tc$c) binds: [B:154:0x01d8, B:138:0x01a8] A[DONT_GENERATE, DONT_INLINE]
  0x01b0: PHI (r11v12 androidx.compose.foundation.layout.c$n) = (r11v7 androidx.compose.foundation.layout.c$n), (r11v13 androidx.compose.foundation.layout.c$n) binds: [B:154:0x01d8, B:138:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:140:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:155:0x01da  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:161:0x0213  */
    /* JADX WARN: Code duplicated, block: B:164:0x023a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0283  */
    /* JADX WARN: Code duplicated, block: B:169:0x0287  */
    /* JADX WARN: Code duplicated, block: B:171:0x028c  */
    /* JADX WARN: Code duplicated, block: B:173:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:176:0x031b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0328  */
    /* JADX WARN: Code duplicated, block: B:181:0x033a  */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:130:0x018d, please report this as an issue */
    public static final void b(final b bVar, final LazyListState lazyListState, final rx8 rx8Var, final boolean z, final boolean z2, final qg4 qg4Var, final boolean z3, final zv8 zv8Var, int i, tc.b bVar2, c.n nVar, tc.c cVar, c.e eVar, final Function1<? super cw6, Unit> function1, d dVar, final int i2, final int i3, final int i4) {
        int i5;
        rx8 rx8Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z4;
        final tc.b bVar3;
        final c.n nVar2;
        final c.e eVar2;
        final int i10;
        final tc.c cVar2;
        s6b s6bVarH;
        int iA;
        tc.b bVar4;
        c.n nVar3;
        tc.c cVar3;
        tc.b bVar5;
        c.n nVar4;
        tc.c cVar4;
        int i11;
        int i12;
        c.e eVar3;
        int i13;
        Object objR;
        int i14;
        int i15;
        Orientation orientation;
        Orientation orientation2;
        b bVarB;
        d dVarF = dVar.F(924924659);
        if ((i2 & 6) == 0) {
            i5 = (dVarF.x(bVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= dVarF.x(lazyListState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            rx8Var2 = rx8Var;
            i5 |= dVarF.x(rx8Var2) ? 256 : 128;
        } else {
            rx8Var2 = rx8Var;
        }
        if ((i2 & 3072) == 0) {
            i5 |= dVarF.A(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= dVarF.A(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= dVarF.x(qg4Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= dVarF.A(z3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= dVarF.x(zv8Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            if ((i4 & 256) == 0) {
                i6 = i;
                int i16 = dVarF.C(i6) ? 67108864 : 33554432;
                i5 |= i16;
            } else {
                i6 = i;
            }
            i5 |= i16;
        } else {
            i6 = i;
        }
        int i17 = i4 & 512;
        if (i17 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i5 |= dVarF.x(bVar2) ? 536870912 : 268435456;
        }
        int i18 = i4 & 1024;
        if (i18 != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = i3 | (dVarF.x(nVar) ? 4 : 2);
        } else {
            i7 = i3;
        }
        int i19 = i4 & 2048;
        if (i19 != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= dVarF.x(cVar) ? 32 : 16;
        }
        int i20 = i7;
        int i21 = i4 & 4096;
        if (i21 == 0) {
            i8 = i20;
            if ((i3 & 384) == 0) {
                i8 |= dVarF.x(eVar) ? 256 : 128;
            }
            if ((i3 & 3072) == 0) {
                i8 |= dVarF.T(function1) ? 2048 : 1024;
            }
            i9 = i8;
            if ((i5 & 306783379) == 306783378 || (i9 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i5 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0 || dVarF.t()) {
                    if ((i4 & 256) != 0) {
                        iA = nw6.a(dVarF, 0);
                        i5 &= -234881025;
                    } else {
                        iA = i6;
                    }
                    if (i17 != 0) {
                        bVar4 = null;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i18 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i19 != 0) {
                        cVar3 = null;
                    } else {
                        cVar3 = cVar;
                    }
                    bVar5 = bVar4;
                    nVar4 = nVar3;
                    cVar4 = cVar3;
                    i11 = iA;
                    i12 = i5;
                    if (i21 != 0) {
                        eVar3 = null;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(924924659, i12, i9, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
                    }
                    i13 = (i12 >> 3) & 14;
                    Function0<hv6> function0C = LazyListItemProviderKt.c(lazyListState, function1, dVarF, i13 | ((i9 >> 6) & 112));
                    int i22 = i12 >> 9;
                    tu6 tu6VarA = fw6.a(lazyListState, z2, dVarF, i13 | (i22 & 112));
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR);
                    }
                    int i23 = (65520 & i12) | (i22 & 458752) | (i22 & 3670016);
                    int i24 = i9 << 18;
                    int i25 = i23 | (i24 & 29360128) | (i24 & 234881024) | ((i9 << 27) & 1879048192);
                    i14 = i12;
                    vt6 vt6VarF = f(function0C, lazyListState, rx8Var2, z, z2, i11, bVar5, cVar4, eVar3, nVar4, (ta2) objR, (i05) dVarF.v(CompositionLocalsKt.j()), ((Boolean) dVarF.v(CompositionLocalsKt.q())).booleanValue() ? null : d9c.INSTANCE.a(), dVarF, i25, 0);
                    i15 = i11;
                    tc.b bVar6 = bVar5;
                    tc.c cVar5 = cVar4;
                    c.e eVar4 = eVar3;
                    c.n nVar5 = nVar4;
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    orientation2 = orientation;
                    if (z3) {
                        dVarF.y(-2077147368);
                        bVarB = ws6.b(b.INSTANCE, yu6.a(lazyListState, i15, dVarF, i13 | ((i14 >> 21) & 112)), lazyListState.getBeyondBoundsInfo(), z, orientation2);
                        dVarF.u();
                    } else {
                        dVarF.y(-2076718545);
                        dVarF.u();
                        bVarB = b.INSTANCE;
                    }
                    ut6.f(function0C, x9b.c(f.c(bVar.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0C, tu6VarA, orientation2, z3, z, dVarF, ((i14 >> 6) & 57344) | ((i14 << 6) & 458752)).then(bVarB).then(lazyListState.B().getModifier()), lazyListState, orientation2, zv8Var, z3, z, qg4Var, lazyListState.getInternalInteractionSource(), null, 128, null), lazyListState.getPrefetchState(), vt6VarF, dVarF, 0, 0);
                    if (e.k()) {
                        e.n();
                    }
                    i10 = i15;
                    bVar3 = bVar6;
                    cVar2 = cVar5;
                    eVar2 = eVar4;
                    nVar2 = nVar5;
                } else {
                    dVarF.q();
                    if ((i4 & 256) != 0) {
                        i5 &= -234881025;
                    }
                    bVar5 = bVar2;
                    nVar4 = nVar;
                    cVar4 = cVar;
                    i12 = i5;
                    i11 = i6;
                }
                eVar3 = eVar;
                dVarF.M();
                if (e.k()) {
                    e.o(924924659, i12, i9, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
                }
                i13 = (i12 >> 3) & 14;
                Function0<hv6> function0C2 = LazyListItemProviderKt.c(lazyListState, function1, dVarF, i13 | ((i9 >> 6) & 112));
                int i26 = i12 >> 9;
                tu6 tu6VarA2 = fw6.a(lazyListState, z2, dVarF, i13 | (i26 & 112));
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR);
                }
                int i27 = (65520 & i12) | (i26 & 458752) | (i26 & 3670016);
                int i28 = i9 << 18;
                int i29 = i27 | (i28 & 29360128) | (i28 & 234881024) | ((i9 << 27) & 1879048192);
                i14 = i12;
                vt6 vt6VarF2 = f(function0C2, lazyListState, rx8Var2, z, z2, i11, bVar5, cVar4, eVar3, nVar4, (ta2) objR, (i05) dVarF.v(CompositionLocalsKt.j()), ((Boolean) dVarF.v(CompositionLocalsKt.q())).booleanValue() ? null : d9c.INSTANCE.a(), dVarF, i29, 0);
                i15 = i11;
                tc.b bVar7 = bVar5;
                tc.c cVar6 = cVar4;
                c.e eVar5 = eVar3;
                c.n nVar6 = nVar4;
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                orientation2 = orientation;
                if (z3) {
                    dVarF.y(-2077147368);
                    bVarB = ws6.b(b.INSTANCE, yu6.a(lazyListState, i15, dVarF, i13 | ((i14 >> 21) & 112)), lazyListState.getBeyondBoundsInfo(), z, orientation2);
                    dVarF.u();
                } else {
                    dVarF.y(-2076718545);
                    dVarF.u();
                    bVarB = b.INSTANCE;
                }
                ut6.f(function0C2, x9b.c(f.c(bVar.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0C2, tu6VarA2, orientation2, z3, z, dVarF, ((i14 >> 6) & 57344) | ((i14 << 6) & 458752)).then(bVarB).then(lazyListState.B().getModifier()), lazyListState, orientation2, zv8Var, z3, z, qg4Var, lazyListState.getInternalInteractionSource(), null, 128, null), lazyListState.getPrefetchState(), vt6VarF2, dVarF, 0, 0);
                if (e.k()) {
                    e.n();
                }
                i10 = i15;
                bVar3 = bVar7;
                cVar2 = cVar6;
                eVar2 = eVar5;
                nVar2 = nVar6;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                nVar2 = nVar;
                eVar2 = eVar;
                i10 = i6;
                cVar2 = cVar;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.kv6
                    public final Object invoke(Object obj, Object obj2) {
                        return mv6.c(bVar, lazyListState, rx8Var, z, z2, qg4Var, z3, zv8Var, i10, bVar3, nVar2, cVar2, eVar2, function1, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i8 = i20 | 384;
        if ((i3 & 3072) == 0) {
            i8 |= dVarF.T(function1) ? 2048 : 1024;
        }
        i9 = i8;
        if ((i5 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (dVarF.g(z4, i5 & 1)) {
            dVarF.U();
            if ((i2 & 1) != 0) {
                if ((i4 & 256) != 0) {
                    iA = nw6.a(dVarF, 0);
                    i5 &= -234881025;
                } else {
                    iA = i6;
                }
                if (i17 != 0) {
                    bVar4 = null;
                } else {
                    bVar4 = bVar2;
                }
                if (i18 != 0) {
                    nVar3 = null;
                } else {
                    nVar3 = nVar;
                }
                if (i19 != 0) {
                    cVar3 = null;
                } else {
                    cVar3 = cVar;
                }
                bVar5 = bVar4;
                nVar4 = nVar3;
                cVar4 = cVar3;
                i11 = iA;
                i12 = i5;
                if (i21 != 0) {
                    eVar3 = null;
                } else {
                    eVar3 = eVar;
                }
            } else {
                if ((i4 & 256) != 0) {
                    iA = nw6.a(dVarF, 0);
                    i5 &= -234881025;
                } else {
                    iA = i6;
                }
                if (i17 != 0) {
                    bVar4 = null;
                } else {
                    bVar4 = bVar2;
                }
                if (i18 != 0) {
                    nVar3 = null;
                } else {
                    nVar3 = nVar;
                }
                if (i19 != 0) {
                    cVar3 = null;
                } else {
                    cVar3 = cVar;
                }
                bVar5 = bVar4;
                nVar4 = nVar3;
                cVar4 = cVar3;
                i11 = iA;
                i12 = i5;
                if (i21 != 0) {
                    eVar3 = null;
                } else {
                    eVar3 = eVar;
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(924924659, i12, i9, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
            }
            i13 = (i12 >> 3) & 14;
            Function0<hv6> function0C3 = LazyListItemProviderKt.c(lazyListState, function1, dVarF, i13 | ((i9 >> 6) & 112));
            int i210 = i12 >> 9;
            tu6 tu6VarA3 = fw6.a(lazyListState, z2, dVarF, i13 | (i210 & 112));
            objR = dVarF.R();
            if (objR == d.INSTANCE.a()) {
                objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                dVarF.L(objR);
            }
            int i211 = (65520 & i12) | (i210 & 458752) | (i210 & 3670016);
            int i212 = i9 << 18;
            int i213 = i211 | (i212 & 29360128) | (i212 & 234881024) | ((i9 << 27) & 1879048192);
            i14 = i12;
            vt6 vt6VarF3 = f(function0C3, lazyListState, rx8Var2, z, z2, i11, bVar5, cVar4, eVar3, nVar4, (ta2) objR, (i05) dVarF.v(CompositionLocalsKt.j()), ((Boolean) dVarF.v(CompositionLocalsKt.q())).booleanValue() ? null : d9c.INSTANCE.a(), dVarF, i213, 0);
            i15 = i11;
            tc.b bVar8 = bVar5;
            tc.c cVar7 = cVar4;
            c.e eVar6 = eVar3;
            c.n nVar7 = nVar4;
            if (z2) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            orientation2 = orientation;
            if (z3) {
                dVarF.y(-2077147368);
                bVarB = ws6.b(b.INSTANCE, yu6.a(lazyListState, i15, dVarF, i13 | ((i14 >> 21) & 112)), lazyListState.getBeyondBoundsInfo(), z, orientation2);
                dVarF.u();
            } else {
                dVarF.y(-2076718545);
                dVarF.u();
                bVarB = b.INSTANCE;
            }
            ut6.f(function0C3, x9b.c(f.c(bVar.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0C3, tu6VarA3, orientation2, z3, z, dVarF, ((i14 >> 6) & 57344) | ((i14 << 6) & 458752)).then(bVarB).then(lazyListState.B().getModifier()), lazyListState, orientation2, zv8Var, z3, z, qg4Var, lazyListState.getInternalInteractionSource(), null, 128, null), lazyListState.getPrefetchState(), vt6VarF3, dVarF, 0, 0);
            if (e.k()) {
                e.n();
            }
            i10 = i15;
            bVar3 = bVar8;
            cVar2 = cVar7;
            eVar2 = eVar6;
            nVar2 = nVar7;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            nVar2 = nVar;
            eVar2 = eVar;
            i10 = i6;
            cVar2 = cVar;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.kv6
                public final Object invoke(Object obj, Object obj2) {
                    return mv6.c(bVar, lazyListState, rx8Var, z, z2, qg4Var, z3, zv8Var, i10, bVar3, nVar2, cVar2, eVar2, function1, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(b bVar, LazyListState lazyListState, rx8 rx8Var, boolean z, boolean z2, qg4 qg4Var, boolean z3, zv8 zv8Var, int i, tc.b bVar2, c.n nVar, tc.c cVar, c.e eVar, Function1 function1, int i2, int i3, int i4, d dVar, int i5) {
        b(bVar, lazyListState, rx8Var, z, z2, qg4Var, z3, zv8Var, i, bVar2, nVar, cVar, eVar, function1, dVar, saa.a(i2 | 1), saa.a(i3), i4);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(h11 h11Var, List<vv6> list, wv6 wv6Var) {
        Trace.beginSection("compose:lazy:cache_window:keepAroundItems");
        try {
            if (h11Var.n() && !list.isEmpty()) {
                int index = ((vv6) m.z0(list)).getIndex();
                int index2 = ((vv6) m.L0(list)).getIndex();
                for (int prefetchWindowStartLine = h11Var.getPrefetchWindowStartLine(); prefetchWindowStartLine < index; prefetchWindowStartLine++) {
                    wv6Var.j(prefetchWindowStartLine);
                }
                int i = index2 + 1;
                int prefetchWindowEndLine = h11Var.getPrefetchWindowEndLine();
                if (i <= prefetchWindowEndLine) {
                    while (true) {
                        wv6Var.j(i);
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

    /* JADX WARN: Code duplicated, block: B:101:0x0133  */
    /* JADX WARN: Code duplicated, block: B:104:0x0153  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074 A[PHI: r4
  0x0074: PHI (r4v17 boolean) = (r4v15 boolean), (r4v18 boolean) binds: [B:36:0x0072, B:32:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa A[PHI: r9
  0x00aa: PHI (r9v17 com.google.android.tc$b) = (r9v14 com.google.android.tc$b), (r9v18 com.google.android.tc$b) binds: [B:54:0x00a8, B:50:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6 A[PHI: r12
  0x00c6: PHI (r12v13 com.google.android.tc$c) = (r12v10 com.google.android.tc$c), (r12v14 com.google.android.tc$c) binds: [B:64:0x00c4, B:60:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e2 A[PHI: r13
  0x00e2: PHI (r13v13 androidx.compose.foundation.layout.c$e) = (r13v10 androidx.compose.foundation.layout.c$e), (r13v14 androidx.compose.foundation.layout.c$e) binds: [B:74:0x00e0, B:70:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe A[PHI: r5
  0x00fe: PHI (r5v9 androidx.compose.foundation.layout.c$n) = (r5v7 androidx.compose.foundation.layout.c$n), (r5v10 androidx.compose.foundation.layout.c$n) binds: [B:84:0x00fc, B:80:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x011e A[PHI: r6
  0x011e: PHI (r6v7 com.google.android.d9c) = (r6v5 com.google.android.d9c), (r6v8 com.google.android.d9c) binds: [B:94:0x011c, B:90:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0121  */
    /* JADX WARN: Code duplicated, block: B:99:0x012b  */
    private static final vt6 f(Function0<? extends hv6> function0, LazyListState lazyListState, rx8 rx8Var, boolean z, boolean z2, int i, tc.b bVar, tc.c cVar, c.e eVar, c.n nVar, ta2 ta2Var, i05 i05Var, d9c d9cVar, d dVar, int i2, int i3) {
        boolean z3;
        boolean z4;
        tc.b bVar2;
        boolean z5;
        tc.c cVar2;
        boolean z6;
        c.e eVar2;
        boolean z7;
        c.n nVar2;
        boolean z8;
        d9c d9cVar2;
        boolean z9;
        boolean z10;
        Object objR;
        if (e.k()) {
            e.o(406165748, i2, i3, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:187)");
        }
        boolean z11 = ((((i2 & 112) ^ 48) > 32 && dVar.x(lazyListState)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && dVar.x(rx8Var)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && dVar.A(z)) || (i2 & 3072) == 2048);
        if (((57344 & i2) ^ 24576) > 16384) {
            z3 = z2;
            if (dVar.A(z3)) {
                z4 = true;
            }
            boolean z12 = z11 | z4 | ((((458752 & i2) ^ 196608) <= 131072 && dVar.C(i)) || (i2 & 196608) == 131072);
            if (((3670016 & i2) ^ 1572864) > 1048576) {
                bVar2 = bVar;
                if (!dVar.x(bVar2)) {
                    z5 = true;
                }
                boolean z13 = z12 | z5;
                if (((29360128 & i2) ^ 12582912) > 8388608) {
                    cVar2 = cVar;
                    if (!dVar.x(cVar2)) {
                        z6 = true;
                    }
                    boolean z14 = z13 | z6;
                    if (((234881024 & i2) ^ 100663296) > 67108864) {
                        eVar2 = eVar;
                        if (!dVar.x(eVar2)) {
                            z7 = true;
                        }
                        boolean z15 = z14 | z7;
                        if (((1879048192 & i2) ^ 805306368) > 536870912) {
                            nVar2 = nVar;
                            if (!dVar.x(nVar2)) {
                                z8 = true;
                            }
                            boolean zX = z8 | z15 | dVar.x(i05Var);
                            if (((i3 & 896) ^ 384) > 256) {
                                d9cVar2 = d9cVar;
                                if (!dVar.x(d9cVar2)) {
                                    z9 = true;
                                }
                                z10 = zX | z9;
                                objR = dVar.R();
                                if (z10 || objR == d.INSTANCE.a()) {
                                    a aVar = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                                    dVar.L(aVar);
                                    objR = aVar;
                                }
                                vt6 vt6Var = (vt6) objR;
                                if (e.k()) {
                                    e.n();
                                }
                                return vt6Var;
                            }
                            d9cVar2 = d9cVar;
                            if ((i3 & 384) == 256) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            z10 = zX | z9;
                            objR = dVar.R();
                            if (z10) {
                                a aVar2 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                                dVar.L(aVar2);
                                objR = aVar2;
                            } else {
                                a aVar3 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                                dVar.L(aVar3);
                                objR = aVar3;
                            }
                            vt6 vt6Var2 = (vt6) objR;
                            if (e.k()) {
                                e.n();
                            }
                            return vt6Var2;
                        }
                        nVar2 = nVar;
                        if ((i2 & 805306368) == 536870912) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        boolean zX2 = z8 | z15 | dVar.x(i05Var);
                        if (((i3 & 896) ^ 384) > 256) {
                            d9cVar2 = d9cVar;
                            if (!dVar.x(d9cVar2)) {
                                z9 = true;
                            }
                            z10 = zX2 | z9;
                            objR = dVar.R();
                            if (z10) {
                                a aVar4 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                                dVar.L(aVar4);
                                objR = aVar4;
                            } else {
                                a aVar5 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                                dVar.L(aVar5);
                                objR = aVar5;
                            }
                            vt6 vt6Var3 = (vt6) objR;
                            if (e.k()) {
                                e.n();
                            }
                            return vt6Var3;
                        }
                        d9cVar2 = d9cVar;
                        if ((i3 & 384) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = zX2 | z9;
                        objR = dVar.R();
                        if (z10) {
                            a aVar6 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar6);
                            objR = aVar6;
                        } else {
                            a aVar7 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar7);
                            objR = aVar7;
                        }
                        vt6 vt6Var4 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var4;
                    }
                    eVar2 = eVar;
                    if ((100663296 & i2) == 67108864) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z16 = z14 | z7;
                    if (((1879048192 & i2) ^ 805306368) > 536870912) {
                        nVar2 = nVar;
                        if (!dVar.x(nVar2)) {
                            z8 = true;
                        }
                        boolean zX3 = z8 | z16 | dVar.x(i05Var);
                        if (((i3 & 896) ^ 384) > 256) {
                            d9cVar2 = d9cVar;
                            if (!dVar.x(d9cVar2)) {
                                z9 = true;
                            }
                            z10 = zX3 | z9;
                            objR = dVar.R();
                            if (z10) {
                                a aVar8 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                                dVar.L(aVar8);
                                objR = aVar8;
                            } else {
                                a aVar9 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                                dVar.L(aVar9);
                                objR = aVar9;
                            }
                            vt6 vt6Var5 = (vt6) objR;
                            if (e.k()) {
                                e.n();
                            }
                            return vt6Var5;
                        }
                        d9cVar2 = d9cVar;
                        if ((i3 & 384) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = zX3 | z9;
                        objR = dVar.R();
                        if (z10) {
                            a aVar10 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar10);
                            objR = aVar10;
                        } else {
                            a aVar11 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar11);
                            objR = aVar11;
                        }
                        vt6 vt6Var6 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var6;
                    }
                    nVar2 = nVar;
                    if ((i2 & 805306368) == 536870912) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean zX4 = z8 | z16 | dVar.x(i05Var);
                    if (((i3 & 896) ^ 384) > 256) {
                        d9cVar2 = d9cVar;
                        if (!dVar.x(d9cVar2)) {
                            z9 = true;
                        }
                        z10 = zX4 | z9;
                        objR = dVar.R();
                        if (z10) {
                            a aVar12 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar12);
                            objR = aVar12;
                        } else {
                            a aVar13 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar13);
                            objR = aVar13;
                        }
                        vt6 vt6Var7 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var7;
                    }
                    d9cVar2 = d9cVar;
                    if ((i3 & 384) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = zX4 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar14 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar14);
                        objR = aVar14;
                    } else {
                        a aVar15 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar15);
                        objR = aVar15;
                    }
                    vt6 vt6Var8 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var8;
                }
                cVar2 = cVar;
                if ((12582912 & i2) == 8388608) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z17 = z13 | z6;
                if (((234881024 & i2) ^ 100663296) > 67108864) {
                    eVar2 = eVar;
                    if (!dVar.x(eVar2)) {
                        z7 = true;
                    }
                    boolean z18 = z17 | z7;
                    if (((1879048192 & i2) ^ 805306368) > 536870912) {
                        nVar2 = nVar;
                        if (!dVar.x(nVar2)) {
                            z8 = true;
                        }
                        boolean zX5 = z8 | z18 | dVar.x(i05Var);
                        if (((i3 & 896) ^ 384) > 256) {
                            d9cVar2 = d9cVar;
                            if (!dVar.x(d9cVar2)) {
                                z9 = true;
                            }
                            z10 = zX5 | z9;
                            objR = dVar.R();
                            if (z10) {
                                a aVar16 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                                dVar.L(aVar16);
                                objR = aVar16;
                            } else {
                                a aVar17 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                                dVar.L(aVar17);
                                objR = aVar17;
                            }
                            vt6 vt6Var9 = (vt6) objR;
                            if (e.k()) {
                                e.n();
                            }
                            return vt6Var9;
                        }
                        d9cVar2 = d9cVar;
                        if ((i3 & 384) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = zX5 | z9;
                        objR = dVar.R();
                        if (z10) {
                            a aVar18 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar18);
                            objR = aVar18;
                        } else {
                            a aVar19 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar19);
                            objR = aVar19;
                        }
                        vt6 vt6Var10 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var10;
                    }
                    nVar2 = nVar;
                    if ((i2 & 805306368) == 536870912) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean zX6 = z8 | z18 | dVar.x(i05Var);
                    if (((i3 & 896) ^ 384) > 256) {
                        d9cVar2 = d9cVar;
                        if (!dVar.x(d9cVar2)) {
                            z9 = true;
                        }
                        z10 = zX6 | z9;
                        objR = dVar.R();
                        if (z10) {
                            a aVar110 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar110);
                            objR = aVar110;
                        } else {
                            a aVar111 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar111);
                            objR = aVar111;
                        }
                        vt6 vt6Var11 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var11;
                    }
                    d9cVar2 = d9cVar;
                    if ((i3 & 384) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = zX6 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar112 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar112);
                        objR = aVar112;
                    } else {
                        a aVar113 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar113);
                        objR = aVar113;
                    }
                    vt6 vt6Var12 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var12;
                }
                eVar2 = eVar;
                if ((100663296 & i2) == 67108864) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z19 = z17 | z7;
                if (((1879048192 & i2) ^ 805306368) > 536870912) {
                    nVar2 = nVar;
                    if (!dVar.x(nVar2)) {
                        z8 = true;
                    }
                    boolean zX7 = z8 | z19 | dVar.x(i05Var);
                    if (((i3 & 896) ^ 384) > 256) {
                        d9cVar2 = d9cVar;
                        if (!dVar.x(d9cVar2)) {
                            z9 = true;
                        }
                        z10 = zX7 | z9;
                        objR = dVar.R();
                        if (z10) {
                            a aVar114 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar114);
                            objR = aVar114;
                        } else {
                            a aVar115 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar115);
                            objR = aVar115;
                        }
                        vt6 vt6Var13 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var13;
                    }
                    d9cVar2 = d9cVar;
                    if ((i3 & 384) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = zX7 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar116 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar116);
                        objR = aVar116;
                    } else {
                        a aVar117 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar117);
                        objR = aVar117;
                    }
                    vt6 vt6Var14 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var14;
                }
                nVar2 = nVar;
                if ((i2 & 805306368) == 536870912) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean zX8 = z8 | z19 | dVar.x(i05Var);
                if (((i3 & 896) ^ 384) > 256) {
                    d9cVar2 = d9cVar;
                    if (!dVar.x(d9cVar2)) {
                        z9 = true;
                    }
                    z10 = zX8 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar118 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar118);
                        objR = aVar118;
                    } else {
                        a aVar119 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar119);
                        objR = aVar119;
                    }
                    vt6 vt6Var15 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var15;
                }
                d9cVar2 = d9cVar;
                if ((i3 & 384) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = zX8 | z9;
                objR = dVar.R();
                if (z10) {
                    a aVar1110 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar1110);
                    objR = aVar1110;
                } else {
                    a aVar1111 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar1111);
                    objR = aVar1111;
                }
                vt6 vt6Var16 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var16;
            }
            bVar2 = bVar;
            if ((1572864 & i2) == 1048576) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z110 = z12 | z5;
            if (((29360128 & i2) ^ 12582912) > 8388608) {
                cVar2 = cVar;
                if (!dVar.x(cVar2)) {
                    z6 = true;
                }
                boolean z111 = z110 | z6;
                if (((234881024 & i2) ^ 100663296) > 67108864) {
                    eVar2 = eVar;
                    if (!dVar.x(eVar2)) {
                        z7 = true;
                    }
                    boolean z112 = z111 | z7;
                    if (((1879048192 & i2) ^ 805306368) > 536870912) {
                        nVar2 = nVar;
                        if (!dVar.x(nVar2)) {
                            z8 = true;
                        }
                        boolean zX9 = z8 | z112 | dVar.x(i05Var);
                        if (((i3 & 896) ^ 384) > 256) {
                            d9cVar2 = d9cVar;
                            if (!dVar.x(d9cVar2)) {
                                z9 = true;
                            }
                            z10 = zX9 | z9;
                            objR = dVar.R();
                            if (z10) {
                                a aVar1112 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                                dVar.L(aVar1112);
                                objR = aVar1112;
                            } else {
                                a aVar1113 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                                dVar.L(aVar1113);
                                objR = aVar1113;
                            }
                            vt6 vt6Var17 = (vt6) objR;
                            if (e.k()) {
                                e.n();
                            }
                            return vt6Var17;
                        }
                        d9cVar2 = d9cVar;
                        if ((i3 & 384) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = zX9 | z9;
                        objR = dVar.R();
                        if (z10) {
                            a aVar1114 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar1114);
                            objR = aVar1114;
                        } else {
                            a aVar1115 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar1115);
                            objR = aVar1115;
                        }
                        vt6 vt6Var18 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var18;
                    }
                    nVar2 = nVar;
                    if ((i2 & 805306368) == 536870912) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean zX10 = z8 | z112 | dVar.x(i05Var);
                    if (((i3 & 896) ^ 384) > 256) {
                        d9cVar2 = d9cVar;
                        if (!dVar.x(d9cVar2)) {
                            z9 = true;
                        }
                        z10 = zX10 | z9;
                        objR = dVar.R();
                        if (z10) {
                            a aVar1116 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar1116);
                            objR = aVar1116;
                        } else {
                            a aVar1117 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar1117);
                            objR = aVar1117;
                        }
                        vt6 vt6Var19 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var19;
                    }
                    d9cVar2 = d9cVar;
                    if ((i3 & 384) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = zX10 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar1118 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar1118);
                        objR = aVar1118;
                    } else {
                        a aVar1119 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar1119);
                        objR = aVar1119;
                    }
                    vt6 vt6Var110 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var110;
                }
                eVar2 = eVar;
                if ((100663296 & i2) == 67108864) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z113 = z111 | z7;
                if (((1879048192 & i2) ^ 805306368) > 536870912) {
                    nVar2 = nVar;
                    if (!dVar.x(nVar2)) {
                        z8 = true;
                    }
                    boolean zX11 = z8 | z113 | dVar.x(i05Var);
                    if (((i3 & 896) ^ 384) > 256) {
                        d9cVar2 = d9cVar;
                        if (!dVar.x(d9cVar2)) {
                            z9 = true;
                        }
                        z10 = zX11 | z9;
                        objR = dVar.R();
                        if (z10) {
                            a aVar11110 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar11110);
                            objR = aVar11110;
                        } else {
                            a aVar11111 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar11111);
                            objR = aVar11111;
                        }
                        vt6 vt6Var111 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var111;
                    }
                    d9cVar2 = d9cVar;
                    if ((i3 & 384) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = zX11 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar11112 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar11112);
                        objR = aVar11112;
                    } else {
                        a aVar11113 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar11113);
                        objR = aVar11113;
                    }
                    vt6 vt6Var112 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var112;
                }
                nVar2 = nVar;
                if ((i2 & 805306368) == 536870912) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean zX12 = z8 | z113 | dVar.x(i05Var);
                if (((i3 & 896) ^ 384) > 256) {
                    d9cVar2 = d9cVar;
                    if (!dVar.x(d9cVar2)) {
                        z9 = true;
                    }
                    z10 = zX12 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar11114 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar11114);
                        objR = aVar11114;
                    } else {
                        a aVar11115 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar11115);
                        objR = aVar11115;
                    }
                    vt6 vt6Var113 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var113;
                }
                d9cVar2 = d9cVar;
                if ((i3 & 384) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = zX12 | z9;
                objR = dVar.R();
                if (z10) {
                    a aVar11116 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar11116);
                    objR = aVar11116;
                } else {
                    a aVar11117 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar11117);
                    objR = aVar11117;
                }
                vt6 vt6Var114 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var114;
            }
            cVar2 = cVar;
            if ((12582912 & i2) == 8388608) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z114 = z110 | z6;
            if (((234881024 & i2) ^ 100663296) > 67108864) {
                eVar2 = eVar;
                if (!dVar.x(eVar2)) {
                    z7 = true;
                }
                boolean z115 = z114 | z7;
                if (((1879048192 & i2) ^ 805306368) > 536870912) {
                    nVar2 = nVar;
                    if (!dVar.x(nVar2)) {
                        z8 = true;
                    }
                    boolean zX13 = z8 | z115 | dVar.x(i05Var);
                    if (((i3 & 896) ^ 384) > 256) {
                        d9cVar2 = d9cVar;
                        if (!dVar.x(d9cVar2)) {
                            z9 = true;
                        }
                        z10 = zX13 | z9;
                        objR = dVar.R();
                        if (z10) {
                            a aVar11118 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar11118);
                            objR = aVar11118;
                        } else {
                            a aVar11119 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar11119);
                            objR = aVar11119;
                        }
                        vt6 vt6Var115 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var115;
                    }
                    d9cVar2 = d9cVar;
                    if ((i3 & 384) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = zX13 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar111110 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar111110);
                        objR = aVar111110;
                    } else {
                        a aVar111111 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar111111);
                        objR = aVar111111;
                    }
                    vt6 vt6Var116 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var116;
                }
                nVar2 = nVar;
                if ((i2 & 805306368) == 536870912) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean zX14 = z8 | z115 | dVar.x(i05Var);
                if (((i3 & 896) ^ 384) > 256) {
                    d9cVar2 = d9cVar;
                    if (!dVar.x(d9cVar2)) {
                        z9 = true;
                    }
                    z10 = zX14 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar111112 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar111112);
                        objR = aVar111112;
                    } else {
                        a aVar111113 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar111113);
                        objR = aVar111113;
                    }
                    vt6 vt6Var117 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var117;
                }
                d9cVar2 = d9cVar;
                if ((i3 & 384) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = zX14 | z9;
                objR = dVar.R();
                if (z10) {
                    a aVar111114 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar111114);
                    objR = aVar111114;
                } else {
                    a aVar111115 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar111115);
                    objR = aVar111115;
                }
                vt6 vt6Var118 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var118;
            }
            eVar2 = eVar;
            if ((100663296 & i2) == 67108864) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z116 = z114 | z7;
            if (((1879048192 & i2) ^ 805306368) > 536870912) {
                nVar2 = nVar;
                if (!dVar.x(nVar2)) {
                    z8 = true;
                }
                boolean zX15 = z8 | z116 | dVar.x(i05Var);
                if (((i3 & 896) ^ 384) > 256) {
                    d9cVar2 = d9cVar;
                    if (!dVar.x(d9cVar2)) {
                        z9 = true;
                    }
                    z10 = zX15 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar111116 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar111116);
                        objR = aVar111116;
                    } else {
                        a aVar111117 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar111117);
                        objR = aVar111117;
                    }
                    vt6 vt6Var119 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var119;
                }
                d9cVar2 = d9cVar;
                if ((i3 & 384) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = zX15 | z9;
                objR = dVar.R();
                if (z10) {
                    a aVar111118 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar111118);
                    objR = aVar111118;
                } else {
                    a aVar111119 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar111119);
                    objR = aVar111119;
                }
                vt6 vt6Var1110 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var1110;
            }
            nVar2 = nVar;
            if ((i2 & 805306368) == 536870912) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean zX16 = z8 | z116 | dVar.x(i05Var);
            if (((i3 & 896) ^ 384) > 256) {
                d9cVar2 = d9cVar;
                if (!dVar.x(d9cVar2)) {
                    z9 = true;
                }
                z10 = zX16 | z9;
                objR = dVar.R();
                if (z10) {
                    a aVar1111110 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar1111110);
                    objR = aVar1111110;
                } else {
                    a aVar1111111 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar1111111);
                    objR = aVar1111111;
                }
                vt6 vt6Var1111 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var1111;
            }
            d9cVar2 = d9cVar;
            if ((i3 & 384) == 256) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = zX16 | z9;
            objR = dVar.R();
            if (z10) {
                a aVar1111112 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                dVar.L(aVar1111112);
                objR = aVar1111112;
            } else {
                a aVar1111113 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                dVar.L(aVar1111113);
                objR = aVar1111113;
            }
            vt6 vt6Var1112 = (vt6) objR;
            if (e.k()) {
                e.n();
            }
            return vt6Var1112;
        }
        z3 = z2;
        if ((i2 & 24576) == 16384) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z117 = z11 | z4 | ((((458752 & i2) ^ 196608) <= 131072 && dVar.C(i)) || (i2 & 196608) == 131072);
        if (((3670016 & i2) ^ 1572864) > 1048576) {
            bVar2 = bVar;
            if (!dVar.x(bVar2)) {
                z5 = true;
            }
            boolean z118 = z117 | z5;
            if (((29360128 & i2) ^ 12582912) > 8388608) {
                cVar2 = cVar;
                if (!dVar.x(cVar2)) {
                    z6 = true;
                }
                boolean z119 = z118 | z6;
                if (((234881024 & i2) ^ 100663296) > 67108864) {
                    eVar2 = eVar;
                    if (!dVar.x(eVar2)) {
                        z7 = true;
                    }
                    boolean z1110 = z119 | z7;
                    if (((1879048192 & i2) ^ 805306368) > 536870912) {
                        nVar2 = nVar;
                        if (!dVar.x(nVar2)) {
                            z8 = true;
                        }
                        boolean zX17 = z8 | z1110 | dVar.x(i05Var);
                        if (((i3 & 896) ^ 384) > 256) {
                            d9cVar2 = d9cVar;
                            if (!dVar.x(d9cVar2)) {
                                z9 = true;
                            }
                            z10 = zX17 | z9;
                            objR = dVar.R();
                            if (z10) {
                                a aVar1111114 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                                dVar.L(aVar1111114);
                                objR = aVar1111114;
                            } else {
                                a aVar1111115 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                                dVar.L(aVar1111115);
                                objR = aVar1111115;
                            }
                            vt6 vt6Var1113 = (vt6) objR;
                            if (e.k()) {
                                e.n();
                            }
                            return vt6Var1113;
                        }
                        d9cVar2 = d9cVar;
                        if ((i3 & 384) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = zX17 | z9;
                        objR = dVar.R();
                        if (z10) {
                            a aVar1111116 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar1111116);
                            objR = aVar1111116;
                        } else {
                            a aVar1111117 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar1111117);
                            objR = aVar1111117;
                        }
                        vt6 vt6Var1114 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var1114;
                    }
                    nVar2 = nVar;
                    if ((i2 & 805306368) == 536870912) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean zX18 = z8 | z1110 | dVar.x(i05Var);
                    if (((i3 & 896) ^ 384) > 256) {
                        d9cVar2 = d9cVar;
                        if (!dVar.x(d9cVar2)) {
                            z9 = true;
                        }
                        z10 = zX18 | z9;
                        objR = dVar.R();
                        if (z10) {
                            a aVar1111118 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar1111118);
                            objR = aVar1111118;
                        } else {
                            a aVar1111119 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar1111119);
                            objR = aVar1111119;
                        }
                        vt6 vt6Var1115 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var1115;
                    }
                    d9cVar2 = d9cVar;
                    if ((i3 & 384) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = zX18 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar11111110 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar11111110);
                        objR = aVar11111110;
                    } else {
                        a aVar11111111 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar11111111);
                        objR = aVar11111111;
                    }
                    vt6 vt6Var1116 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var1116;
                }
                eVar2 = eVar;
                if ((100663296 & i2) == 67108864) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z1111 = z119 | z7;
                if (((1879048192 & i2) ^ 805306368) > 536870912) {
                    nVar2 = nVar;
                    if (!dVar.x(nVar2)) {
                        z8 = true;
                    }
                    boolean zX19 = z8 | z1111 | dVar.x(i05Var);
                    if (((i3 & 896) ^ 384) > 256) {
                        d9cVar2 = d9cVar;
                        if (!dVar.x(d9cVar2)) {
                            z9 = true;
                        }
                        z10 = zX19 | z9;
                        objR = dVar.R();
                        if (z10) {
                            a aVar11111112 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar11111112);
                            objR = aVar11111112;
                        } else {
                            a aVar11111113 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar11111113);
                            objR = aVar11111113;
                        }
                        vt6 vt6Var1117 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var1117;
                    }
                    d9cVar2 = d9cVar;
                    if ((i3 & 384) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = zX19 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar11111114 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar11111114);
                        objR = aVar11111114;
                    } else {
                        a aVar11111115 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar11111115);
                        objR = aVar11111115;
                    }
                    vt6 vt6Var1118 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var1118;
                }
                nVar2 = nVar;
                if ((i2 & 805306368) == 536870912) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean zX110 = z8 | z1111 | dVar.x(i05Var);
                if (((i3 & 896) ^ 384) > 256) {
                    d9cVar2 = d9cVar;
                    if (!dVar.x(d9cVar2)) {
                        z9 = true;
                    }
                    z10 = zX110 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar11111116 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar11111116);
                        objR = aVar11111116;
                    } else {
                        a aVar11111117 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar11111117);
                        objR = aVar11111117;
                    }
                    vt6 vt6Var1119 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var1119;
                }
                d9cVar2 = d9cVar;
                if ((i3 & 384) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = zX110 | z9;
                objR = dVar.R();
                if (z10) {
                    a aVar11111118 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar11111118);
                    objR = aVar11111118;
                } else {
                    a aVar11111119 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar11111119);
                    objR = aVar11111119;
                }
                vt6 vt6Var11110 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var11110;
            }
            cVar2 = cVar;
            if ((12582912 & i2) == 8388608) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z1112 = z118 | z6;
            if (((234881024 & i2) ^ 100663296) > 67108864) {
                eVar2 = eVar;
                if (!dVar.x(eVar2)) {
                    z7 = true;
                }
                boolean z1113 = z1112 | z7;
                if (((1879048192 & i2) ^ 805306368) > 536870912) {
                    nVar2 = nVar;
                    if (!dVar.x(nVar2)) {
                        z8 = true;
                    }
                    boolean zX111 = z8 | z1113 | dVar.x(i05Var);
                    if (((i3 & 896) ^ 384) > 256) {
                        d9cVar2 = d9cVar;
                        if (!dVar.x(d9cVar2)) {
                            z9 = true;
                        }
                        z10 = zX111 | z9;
                        objR = dVar.R();
                        if (z10) {
                            a aVar111111110 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar111111110);
                            objR = aVar111111110;
                        } else {
                            a aVar111111111 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar111111111);
                            objR = aVar111111111;
                        }
                        vt6 vt6Var11111 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var11111;
                    }
                    d9cVar2 = d9cVar;
                    if ((i3 & 384) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = zX111 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar111111112 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar111111112);
                        objR = aVar111111112;
                    } else {
                        a aVar111111113 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar111111113);
                        objR = aVar111111113;
                    }
                    vt6 vt6Var11112 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var11112;
                }
                nVar2 = nVar;
                if ((i2 & 805306368) == 536870912) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean zX112 = z8 | z1113 | dVar.x(i05Var);
                if (((i3 & 896) ^ 384) > 256) {
                    d9cVar2 = d9cVar;
                    if (!dVar.x(d9cVar2)) {
                        z9 = true;
                    }
                    z10 = zX112 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar111111114 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar111111114);
                        objR = aVar111111114;
                    } else {
                        a aVar111111115 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar111111115);
                        objR = aVar111111115;
                    }
                    vt6 vt6Var11113 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var11113;
                }
                d9cVar2 = d9cVar;
                if ((i3 & 384) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = zX112 | z9;
                objR = dVar.R();
                if (z10) {
                    a aVar111111116 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar111111116);
                    objR = aVar111111116;
                } else {
                    a aVar111111117 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar111111117);
                    objR = aVar111111117;
                }
                vt6 vt6Var11114 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var11114;
            }
            eVar2 = eVar;
            if ((100663296 & i2) == 67108864) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z1114 = z1112 | z7;
            if (((1879048192 & i2) ^ 805306368) > 536870912) {
                nVar2 = nVar;
                if (!dVar.x(nVar2)) {
                    z8 = true;
                }
                boolean zX113 = z8 | z1114 | dVar.x(i05Var);
                if (((i3 & 896) ^ 384) > 256) {
                    d9cVar2 = d9cVar;
                    if (!dVar.x(d9cVar2)) {
                        z9 = true;
                    }
                    z10 = zX113 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar111111118 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar111111118);
                        objR = aVar111111118;
                    } else {
                        a aVar111111119 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar111111119);
                        objR = aVar111111119;
                    }
                    vt6 vt6Var11115 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var11115;
                }
                d9cVar2 = d9cVar;
                if ((i3 & 384) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = zX113 | z9;
                objR = dVar.R();
                if (z10) {
                    a aVar1111111110 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar1111111110);
                    objR = aVar1111111110;
                } else {
                    a aVar1111111111 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar1111111111);
                    objR = aVar1111111111;
                }
                vt6 vt6Var11116 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var11116;
            }
            nVar2 = nVar;
            if ((i2 & 805306368) == 536870912) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean zX114 = z8 | z1114 | dVar.x(i05Var);
            if (((i3 & 896) ^ 384) > 256) {
                d9cVar2 = d9cVar;
                if (!dVar.x(d9cVar2)) {
                    z9 = true;
                }
                z10 = zX114 | z9;
                objR = dVar.R();
                if (z10) {
                    a aVar1111111112 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar1111111112);
                    objR = aVar1111111112;
                } else {
                    a aVar1111111113 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar1111111113);
                    objR = aVar1111111113;
                }
                vt6 vt6Var11117 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var11117;
            }
            d9cVar2 = d9cVar;
            if ((i3 & 384) == 256) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = zX114 | z9;
            objR = dVar.R();
            if (z10) {
                a aVar1111111114 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                dVar.L(aVar1111111114);
                objR = aVar1111111114;
            } else {
                a aVar1111111115 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                dVar.L(aVar1111111115);
                objR = aVar1111111115;
            }
            vt6 vt6Var11118 = (vt6) objR;
            if (e.k()) {
                e.n();
            }
            return vt6Var11118;
        }
        bVar2 = bVar;
        if ((1572864 & i2) == 1048576) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z1115 = z117 | z5;
        if (((29360128 & i2) ^ 12582912) > 8388608) {
            cVar2 = cVar;
            if (!dVar.x(cVar2)) {
                z6 = true;
            }
            boolean z1116 = z1115 | z6;
            if (((234881024 & i2) ^ 100663296) > 67108864) {
                eVar2 = eVar;
                if (!dVar.x(eVar2)) {
                    z7 = true;
                }
                boolean z1117 = z1116 | z7;
                if (((1879048192 & i2) ^ 805306368) > 536870912) {
                    nVar2 = nVar;
                    if (!dVar.x(nVar2)) {
                        z8 = true;
                    }
                    boolean zX115 = z8 | z1117 | dVar.x(i05Var);
                    if (((i3 & 896) ^ 384) > 256) {
                        d9cVar2 = d9cVar;
                        if (!dVar.x(d9cVar2)) {
                            z9 = true;
                        }
                        z10 = zX115 | z9;
                        objR = dVar.R();
                        if (z10) {
                            a aVar1111111116 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar1111111116);
                            objR = aVar1111111116;
                        } else {
                            a aVar1111111117 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                            dVar.L(aVar1111111117);
                            objR = aVar1111111117;
                        }
                        vt6 vt6Var11119 = (vt6) objR;
                        if (e.k()) {
                            e.n();
                        }
                        return vt6Var11119;
                    }
                    d9cVar2 = d9cVar;
                    if ((i3 & 384) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = zX115 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar1111111118 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar1111111118);
                        objR = aVar1111111118;
                    } else {
                        a aVar1111111119 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar1111111119);
                        objR = aVar1111111119;
                    }
                    vt6 vt6Var111110 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var111110;
                }
                nVar2 = nVar;
                if ((i2 & 805306368) == 536870912) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean zX116 = z8 | z1117 | dVar.x(i05Var);
                if (((i3 & 896) ^ 384) > 256) {
                    d9cVar2 = d9cVar;
                    if (!dVar.x(d9cVar2)) {
                        z9 = true;
                    }
                    z10 = zX116 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar11111111110 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar11111111110);
                        objR = aVar11111111110;
                    } else {
                        a aVar11111111111 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar11111111111);
                        objR = aVar11111111111;
                    }
                    vt6 vt6Var111111 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var111111;
                }
                d9cVar2 = d9cVar;
                if ((i3 & 384) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = zX116 | z9;
                objR = dVar.R();
                if (z10) {
                    a aVar11111111112 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar11111111112);
                    objR = aVar11111111112;
                } else {
                    a aVar11111111113 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar11111111113);
                    objR = aVar11111111113;
                }
                vt6 vt6Var111112 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var111112;
            }
            eVar2 = eVar;
            if ((100663296 & i2) == 67108864) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z1118 = z1116 | z7;
            if (((1879048192 & i2) ^ 805306368) > 536870912) {
                nVar2 = nVar;
                if (!dVar.x(nVar2)) {
                    z8 = true;
                }
                boolean zX117 = z8 | z1118 | dVar.x(i05Var);
                if (((i3 & 896) ^ 384) > 256) {
                    d9cVar2 = d9cVar;
                    if (!dVar.x(d9cVar2)) {
                        z9 = true;
                    }
                    z10 = zX117 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar11111111114 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar11111111114);
                        objR = aVar11111111114;
                    } else {
                        a aVar11111111115 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar11111111115);
                        objR = aVar11111111115;
                    }
                    vt6 vt6Var111113 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var111113;
                }
                d9cVar2 = d9cVar;
                if ((i3 & 384) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = zX117 | z9;
                objR = dVar.R();
                if (z10) {
                    a aVar11111111116 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar11111111116);
                    objR = aVar11111111116;
                } else {
                    a aVar11111111117 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar11111111117);
                    objR = aVar11111111117;
                }
                vt6 vt6Var111114 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var111114;
            }
            nVar2 = nVar;
            if ((i2 & 805306368) == 536870912) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean zX118 = z8 | z1118 | dVar.x(i05Var);
            if (((i3 & 896) ^ 384) > 256) {
                d9cVar2 = d9cVar;
                if (!dVar.x(d9cVar2)) {
                    z9 = true;
                }
                z10 = zX118 | z9;
                objR = dVar.R();
                if (z10) {
                    a aVar11111111118 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar11111111118);
                    objR = aVar11111111118;
                } else {
                    a aVar11111111119 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar11111111119);
                    objR = aVar11111111119;
                }
                vt6 vt6Var111115 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var111115;
            }
            d9cVar2 = d9cVar;
            if ((i3 & 384) == 256) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = zX118 | z9;
            objR = dVar.R();
            if (z10) {
                a aVar111111111110 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                dVar.L(aVar111111111110);
                objR = aVar111111111110;
            } else {
                a aVar111111111111 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                dVar.L(aVar111111111111);
                objR = aVar111111111111;
            }
            vt6 vt6Var111116 = (vt6) objR;
            if (e.k()) {
                e.n();
            }
            return vt6Var111116;
        }
        cVar2 = cVar;
        if ((12582912 & i2) == 8388608) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z1119 = z1115 | z6;
        if (((234881024 & i2) ^ 100663296) > 67108864) {
            eVar2 = eVar;
            if (!dVar.x(eVar2)) {
                z7 = true;
            }
            boolean z11110 = z1119 | z7;
            if (((1879048192 & i2) ^ 805306368) > 536870912) {
                nVar2 = nVar;
                if (!dVar.x(nVar2)) {
                    z8 = true;
                }
                boolean zX119 = z8 | z11110 | dVar.x(i05Var);
                if (((i3 & 896) ^ 384) > 256) {
                    d9cVar2 = d9cVar;
                    if (!dVar.x(d9cVar2)) {
                        z9 = true;
                    }
                    z10 = zX119 | z9;
                    objR = dVar.R();
                    if (z10) {
                        a aVar111111111112 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar111111111112);
                        objR = aVar111111111112;
                    } else {
                        a aVar111111111113 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                        dVar.L(aVar111111111113);
                        objR = aVar111111111113;
                    }
                    vt6 vt6Var111117 = (vt6) objR;
                    if (e.k()) {
                        e.n();
                    }
                    return vt6Var111117;
                }
                d9cVar2 = d9cVar;
                if ((i3 & 384) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = zX119 | z9;
                objR = dVar.R();
                if (z10) {
                    a aVar111111111114 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar111111111114);
                    objR = aVar111111111114;
                } else {
                    a aVar111111111115 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar111111111115);
                    objR = aVar111111111115;
                }
                vt6 vt6Var111118 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var111118;
            }
            nVar2 = nVar;
            if ((i2 & 805306368) == 536870912) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean zX1110 = z8 | z11110 | dVar.x(i05Var);
            if (((i3 & 896) ^ 384) > 256) {
                d9cVar2 = d9cVar;
                if (!dVar.x(d9cVar2)) {
                    z9 = true;
                }
                z10 = zX1110 | z9;
                objR = dVar.R();
                if (z10) {
                    a aVar111111111116 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar111111111116);
                    objR = aVar111111111116;
                } else {
                    a aVar111111111117 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar111111111117);
                    objR = aVar111111111117;
                }
                vt6 vt6Var111119 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var111119;
            }
            d9cVar2 = d9cVar;
            if ((i3 & 384) == 256) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = zX1110 | z9;
            objR = dVar.R();
            if (z10) {
                a aVar111111111118 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                dVar.L(aVar111111111118);
                objR = aVar111111111118;
            } else {
                a aVar111111111119 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                dVar.L(aVar111111111119);
                objR = aVar111111111119;
            }
            vt6 vt6Var1111110 = (vt6) objR;
            if (e.k()) {
                e.n();
            }
            return vt6Var1111110;
        }
        eVar2 = eVar;
        if ((100663296 & i2) == 67108864) {
            z7 = true;
        } else {
            z7 = false;
        }
        boolean z11111 = z1119 | z7;
        if (((1879048192 & i2) ^ 805306368) > 536870912) {
            nVar2 = nVar;
            if (!dVar.x(nVar2)) {
                z8 = true;
            }
            boolean zX1111 = z8 | z11111 | dVar.x(i05Var);
            if (((i3 & 896) ^ 384) > 256) {
                d9cVar2 = d9cVar;
                if (!dVar.x(d9cVar2)) {
                    z9 = true;
                }
                z10 = zX1111 | z9;
                objR = dVar.R();
                if (z10) {
                    a aVar1111111111110 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar1111111111110);
                    objR = aVar1111111111110;
                } else {
                    a aVar1111111111111 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                    dVar.L(aVar1111111111111);
                    objR = aVar1111111111111;
                }
                vt6 vt6Var1111111 = (vt6) objR;
                if (e.k()) {
                    e.n();
                }
                return vt6Var1111111;
            }
            d9cVar2 = d9cVar;
            if ((i3 & 384) == 256) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = zX1111 | z9;
            objR = dVar.R();
            if (z10) {
                a aVar1111111111112 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                dVar.L(aVar1111111111112);
                objR = aVar1111111111112;
            } else {
                a aVar1111111111113 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                dVar.L(aVar1111111111113);
                objR = aVar1111111111113;
            }
            vt6 vt6Var1111112 = (vt6) objR;
            if (e.k()) {
                e.n();
            }
            return vt6Var1111112;
        }
        nVar2 = nVar;
        if ((i2 & 805306368) == 536870912) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean zX1112 = z8 | z11111 | dVar.x(i05Var);
        if (((i3 & 896) ^ 384) > 256) {
            d9cVar2 = d9cVar;
            if (!dVar.x(d9cVar2)) {
                z9 = true;
            }
            z10 = zX1112 | z9;
            objR = dVar.R();
            if (z10) {
                a aVar1111111111114 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                dVar.L(aVar1111111111114);
                objR = aVar1111111111114;
            } else {
                a aVar1111111111115 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
                dVar.L(aVar1111111111115);
                objR = aVar1111111111115;
            }
            vt6 vt6Var1111113 = (vt6) objR;
            if (e.k()) {
                e.n();
            }
            return vt6Var1111113;
        }
        d9cVar2 = d9cVar;
        if ((i3 & 384) == 256) {
            z9 = true;
        } else {
            z9 = false;
        }
        z10 = zX1112 | z9;
        objR = dVar.R();
        if (z10) {
            a aVar1111111111116 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
            dVar.L(aVar1111111111116);
            objR = aVar1111111111116;
        } else {
            a aVar1111111111117 = new a(lazyListState, z3, rx8Var, z, function0, nVar2, eVar2, i, ta2Var, i05Var, d9cVar2, bVar2, cVar2);
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
