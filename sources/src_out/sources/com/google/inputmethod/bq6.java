package com.google.inputmethod;

import android.os.Trace;
import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.layout.c;
import androidx.compose.p001foundation.lazy.grid.LazyGridItemProviderKt;
import androidx.compose.p001foundation.lazy.grid.LazyGridState;
import androidx.compose.p001foundation.lazy.layout.f;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.google.android.ps4;
import com.google.android.qjd;
import com.google.android.ta2;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0085\u0001\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001as\u0010$\u001a\u00020#2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0003¢\u0006\u0004\b$\u0010%\u001a1\u0010.\u001a\u00020\u0016*\u00020&2\u0006\u0010(\u001a\u00020'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Lcom/google/android/vq6;", "slots", "Lcom/google/android/rx8;", "contentPadding", "", "reverseLayout", "isVertical", "Lcom/google/android/qg4;", "flingBehavior", "userScrollEnabled", "Lcom/google/android/zv8;", "overscrollEffect", "Landroidx/compose/foundation/layout/c$n;", "verticalArrangement", "Landroidx/compose/foundation/layout/c$e;", "horizontalArrangement", "Lkotlin/Function1;", "Lcom/google/android/sq6;", "", "content", "b", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lcom/google/android/vq6;Lcom/google/android/rx8;ZZLcom/google/android/qg4;ZLcom/google/android/zv8;Landroidx/compose/foundation/layout/c$n;Landroidx/compose/foundation/layout/c$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;III)V", "Lkotlin/Function0;", "Lcom/google/android/rp6;", "itemProviderLambda", "Lcom/google/android/ta2;", "coroutineScope", "Lcom/google/android/i05;", "graphicsContext", "Lcom/google/android/d9c;", "stickyItemsScrollBehavior", "Lcom/google/android/vt6;", "f", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lcom/google/android/vq6;Lcom/google/android/rx8;ZZLandroidx/compose/foundation/layout/c$e;Landroidx/compose/foundation/layout/c$n;Lcom/google/android/ta2;Lcom/google/android/i05;Lcom/google/android/d9c;Landroidx/compose/runtime/d;II)Lcom/google/android/vt6;", "Lcom/google/android/h11;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "Lcom/google/android/kq6;", "visibleItemsList", "Lcom/google/android/nq6;", "measuredLineProvider", "e", "(Lcom/google/android/h11;Landroidx/compose/foundation/gestures/Orientation;Ljava/util/List;Lcom/google/android/nq6;)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class bq6 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements vt6 {
        final /* synthetic */ LazyGridState a;
        final /* synthetic */ boolean b;
        final /* synthetic */ rx8 c;
        final /* synthetic */ boolean d;
        final /* synthetic */ Function0<rp6> e;
        final /* synthetic */ vq6 f;
        final /* synthetic */ c.n g;
        final /* synthetic */ c.e h;
        final /* synthetic */ ta2 i;
        final /* synthetic */ i05 j;
        final /* synthetic */ d9c k;

        /* JADX INFO: renamed from: com.google.android.bq6$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J_\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"com/google/android/bq6$a$a", "Lcom/google/android/lq6;", "", "index", "", "key", "contentType", "crossAxisSize", "mainAxisSpacing", "", "Landroidx/compose/ui/layout/o;", "placeables", "Lcom/google/android/kx1;", "constraints", "lane", "span", "Lcom/google/android/kq6;", "c", "(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)Lcom/google/android/kq6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0101a extends lq6 {
            final /* synthetic */ wt6 e;
            final /* synthetic */ LazyGridState f;
            final /* synthetic */ boolean g;
            final /* synthetic */ boolean h;
            final /* synthetic */ int i;
            final /* synthetic */ int j;
            final /* synthetic */ long k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0101a(rp6 rp6Var, wt6 wt6Var, int i, LazyGridState lazyGridState, boolean z, boolean z2, int i2, int i3, long j) {
                super(rp6Var, wt6Var, i);
                this.e = wt6Var;
                this.f = lazyGridState;
                this.g = z;
                this.h = z2;
                this.i = i2;
                this.j = i3;
                this.k = j;
            }

            @Override // com.google.inputmethod.lq6
            public kq6 c(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends o> placeables, long constraints, int lane, int span) {
                return new kq6(index, key, this.g, crossAxisSize, mainAxisSpacing, this.h, this.e.getLayoutDirection(), this.i, this.j, placeables, this.k, contentType, this.f.z(), constraints, lane, span, null);
            }
        }

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/google/android/bq6$a$b", "Lcom/google/android/nq6;", "", "index", "", "Lcom/google/android/kq6;", "items", "", "Lcom/google/android/q15;", "spans", "mainAxisSpacing", "Lcom/google/android/mq6;", "b", "(I[Lcom/google/android/kq6;Ljava/util/List;I)Lcom/google/android/mq6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends nq6 {
            final /* synthetic */ boolean g;
            final /* synthetic */ uq6 h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z, uq6 uq6Var, int i, int i2, C0101a c0101a, yq6 yq6Var) {
                super(z, uq6Var, i, i2, c0101a, yq6Var);
                this.g = z;
                this.h = uq6Var;
            }

            @Override // com.google.inputmethod.nq6
            public mq6 b(int index, kq6[] items, List<q15> spans, int mainAxisSpacing) {
                return new mq6(index, items, this.h, spans, this.g, mainAxisSpacing);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LazyGridState lazyGridState, boolean z, rx8 rx8Var, boolean z2, Function0<? extends rp6> function0, vq6 vq6Var, c.n nVar, c.e eVar, ta2 ta2Var, i05 i05Var, d9c d9cVar) {
            this.a = lazyGridState;
            this.b = z;
            this.c = rx8Var;
            this.d = z2;
            this.e = function0;
            this.f = vq6Var;
            this.g = nVar;
            this.h = eVar;
            this.i = ta2Var;
            this.j = i05Var;
            this.k = d9cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ArrayList e(yq6 yq6Var, b bVar, int i) {
            yq6.c cVarD = yq6Var.d(i);
            int firstItemIndex = cVarD.getFirstItemIndex();
            ArrayList arrayList = new ArrayList(cVarD.b().size());
            List<q15> listB = cVarD.b();
            int size = listB.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iD = q15.d(listB.get(i3).getPackedValue());
                arrayList.add(qjd.a(Integer.valueOf(firstItemIndex), kx1.a(bVar.a(i2, iD))));
                firstItemIndex++;
                i2 += iD;
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int f(yq6 yq6Var, int i) {
            return yq6Var.e(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fj7 g(wt6 wt6Var, long j, int i, int i2, int i3, int i4, Function1 function1) {
            return wt6Var.h2(nx1.g(j, i3 + i), nx1.f(j, i4 + i2), b0.j(), function1);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX WARN: Type inference failed for: r5v9, types: [com.google.android.zp6] */
        @Override // com.google.inputmethod.vt6
        public final fj7 a(final wt6 wt6Var, final long j) throws KotlinNothingValueException {
            float spacing;
            long jF;
            int iE;
            int iW;
            gn8.a(this.a.B());
            boolean z = this.a.getHasLookaheadOccurred() || wt6Var.G1();
            fa1.a(j, this.b ? Orientation.Vertical : Orientation.Horizontal);
            int iO1 = this.b ? wt6Var.O1(this.c.b(wt6Var.getLayoutDirection())) : wt6Var.O1(nx8.k(this.c, wt6Var.getLayoutDirection()));
            int iO2 = this.b ? wt6Var.O1(this.c.c(wt6Var.getLayoutDirection())) : wt6Var.O1(nx8.j(this.c, wt6Var.getLayoutDirection()));
            int iO3 = wt6Var.O1(this.c.getTop());
            int iO4 = wt6Var.O1(this.c.getBottom());
            final int i = iO3 + iO4;
            final int i2 = iO1 + iO2;
            boolean z2 = this.b;
            int i3 = z2 ? i : i2;
            if (z2 && !this.d) {
                iO2 = iO3;
            } else if (z2 && this.d) {
                iO2 = iO4;
            } else if (!z2 && !this.d) {
                iO2 = iO1;
            }
            int i4 = i3 - iO2;
            long jI = nx1.i(j, -i2, -i);
            rp6 rp6Var = (rp6) this.e.invoke();
            final yq6 yq6VarJ = rp6Var.j();
            uq6 uq6VarA = this.f.a(wt6Var, jI);
            int length = uq6VarA.getSizes().length;
            yq6VarJ.j(length);
            if (this.b) {
                c.n nVar = this.g;
                if (nVar == null) {
                    cx5.b("null verticalArrangement when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                spacing = nVar.getSpacing();
            } else {
                c.e eVar = this.h;
                if (eVar == null) {
                    cx5.b("null horizontalArrangement when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                spacing = eVar.getSpacing();
            }
            int iO5 = wt6Var.O1(spacing);
            int iA = rp6Var.a();
            int iK = this.b ? kx1.k(j) - i : kx1.l(j) - i2;
            int i5 = iO2;
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
            C0101a c0101a = new C0101a(rp6Var, wt6Var, iO5, this.a, this.b, this.d, i5, i4, jF);
            final b bVar = new b(this.b, uq6VarA, iA, iO5, c0101a, yq6VarJ);
            Function1 function1 = new Function1() { // from class: com.google.android.yp6
                public final Object invoke(Object obj) {
                    return bq6.a.e(yq6VarJ, bVar, ((Integer) obj).intValue());
                }
            };
            ?? r5 = new Function1() { // from class: com.google.android.zp6
                public final Object invoke(Object obj) {
                    return Integer.valueOf(bq6.a.f(yq6VarJ, ((Integer) obj).intValue()));
                }
            };
            g.Companion companion = g.INSTANCE;
            LazyGridState lazyGridState = this.a;
            g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            g gVarE = companion.e(gVarD);
            try {
                int iT = lazyGridState.T(rp6Var, lazyGridState.v());
                if (iT < iA || iA <= 0) {
                    iE = yq6VarJ.e(iT);
                    iW = lazyGridState.w();
                } else {
                    iE = yq6VarJ.e(iA - 1);
                    iW = 0;
                }
                Unit unit = Unit.a;
                companion.l(gVarD, gVarE, function1G);
                jq6 jq6VarI = iq6.i(iA, bVar, c0101a, iK, i5, i4, iO5, iE, iW, (wt6Var.G1() || !z) ? this.a.getScrollToBeConsumed() : this.a.I(), jI, this.b, this.g, this.h, this.d, wt6Var, this.a.z(), length, at6.a(rp6Var, this.a.getPinnedItems(), this.a.getBeyondBoundsInfo()), z, wt6Var.G1(), this.a.getApproachLayoutInfo(), this.i, this.a.E(), this.j, function1, r5, this.k, new ps4() { // from class: com.google.android.aq6
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return bq6.a.g(wt6Var, j, i2, i, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (Function1) obj3);
                    }
                });
                LazyGridState.r(this.a, jq6VarI, wt6Var.G1(), false, 4, null);
                Object prefetchStrategy = this.a.getPrefetchStrategy();
                h11 h11Var = prefetchStrategy instanceof h11 ? (h11) prefetchStrategy : null;
                if (h11Var != null) {
                    bq6.e(h11Var, jq6VarI.getOrientation(), jq6VarI.h(), bVar);
                }
                return jq6VarI;
            } catch (Throwable th) {
                companion.l(gVarD, gVarE, function1G);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011a  */
    /* JADX WARN: Code duplicated, block: B:102:0x0120  */
    /* JADX WARN: Code duplicated, block: B:103:0x0123  */
    /* JADX WARN: Code duplicated, block: B:107:0x0136  */
    /* JADX WARN: Code duplicated, block: B:111:0x013f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0148  */
    /* JADX WARN: Code duplicated, block: B:116:0x0152  */
    /* JADX WARN: Code duplicated, block: B:124:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x016a  */
    /* JADX WARN: Code duplicated, block: B:126:0x016d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0170  */
    /* JADX WARN: Code duplicated, block: B:131:0x017c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0181  */
    /* JADX WARN: Code duplicated, block: B:135:0x018e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0199  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:148:0x0220  */
    /* JADX WARN: Code duplicated, block: B:150:0x0224  */
    /* JADX WARN: Code duplicated, block: B:152:0x0229  */
    /* JADX WARN: Code duplicated, block: B:154:0x0242  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0106  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:95:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0114  */
    public static final void b(b bVar, final LazyGridState lazyGridState, final vq6 vq6Var, rx8 rx8Var, boolean z, final boolean z2, qg4 qg4Var, final boolean z3, final zv8 zv8Var, final c.n nVar, final c.e eVar, final Function1<? super sq6, Unit> function1, d dVar, final int i, final int i2, final int i3) {
        b bVar2;
        int i4;
        rx8 rx8VarE;
        int i5;
        boolean z4;
        int i6;
        qg4 qg4Var2;
        int i7;
        int i8;
        boolean z5;
        final rx8 rx8Var2;
        final boolean z6;
        final b bVar3;
        final qg4 qg4Var3;
        s6b s6bVarH;
        b bVar4;
        boolean z7;
        rx8 rx8Var3;
        qg4 qg4VarA;
        int i9;
        int i10;
        Object objR;
        d9c d9cVarA;
        boolean z8;
        Orientation orientation;
        Orientation orientation2;
        b bVarB;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        d dVarF = dVar.F(708740370);
        int i18 = i3 & 1;
        if (i18 != 0) {
            i4 = i | 6;
            bVar2 = bVar;
        } else if ((i & 6) == 0) {
            bVar2 = bVar;
            i4 = (dVarF.x(bVar2) ? 4 : 2) | i;
        } else {
            bVar2 = bVar;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= dVarF.x(lazyGridState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? dVarF.x(vq6Var) : dVarF.T(vq6Var) ? 256 : 128;
        }
        int i19 = i3 & 8;
        if (i19 == 0) {
            if ((i & 3072) == 0) {
                rx8VarE = rx8Var;
                i4 |= dVarF.x(rx8VarE) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    z4 = z;
                    if (dVarF.A(z4)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                if ((i & 196608) == 0) {
                    if (dVarF.A(z2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i4 |= i17;
                }
                if ((i & 1572864) == 0) {
                    qg4Var2 = qg4Var;
                    if ((i3 & 64) == 0 || !dVarF.x(qg4Var2)) {
                        i16 = 524288;
                    } else {
                        i16 = 1048576;
                    }
                    i4 |= i16;
                } else {
                    qg4Var2 = qg4Var;
                }
                if ((i & 12582912) == 0) {
                    if (dVarF.A(z3)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i4 |= i15;
                }
                if ((i & 100663296) == 0) {
                    if (dVarF.x(zv8Var)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i4 |= i14;
                }
                if ((i & 805306368) == 0) {
                    if (dVarF.x(nVar)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i4 |= i13;
                }
                if ((i2 & 6) == 0) {
                    if (dVarF.x(eVar)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i7 = i2 | i12;
                } else {
                    i7 = i2;
                }
                if ((i2 & 48) == 0) {
                    if (dVarF.T(function1)) {
                        i11 = 32;
                    } else {
                        i11 = 16;
                    }
                    i7 |= i11;
                }
                i8 = i7;
                if ((i4 & 306783379) == 306783378 || (i8 & 19) != 18) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0 || dVarF.t()) {
                        if (i18 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i19 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        }
                        z7 = i5 == 0 ? z4 : false;
                        if ((i3 & 64) != 0) {
                            rx8Var3 = rx8VarE;
                            qg4VarA = cab.a.a(dVarF, 6);
                            i9 = i4 & (-3670017);
                        } else {
                            rx8Var3 = rx8VarE;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(708740370, i9, i8, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                        }
                        i10 = (i9 >> 3) & 14;
                        Function0<rp6> function0C = LazyGridItemProviderKt.c(lazyGridState, function1, dVarF, (i8 & 112) | i10);
                        int i20 = i9 >> 9;
                        tu6 tu6VarA = rx6.a(lazyGridState, z7, dVarF, (i20 & 112) | i10);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                            dVarF.L(objR);
                        }
                        ta2 ta2Var = (ta2) objR;
                        i05 i05Var = (i05) dVarF.v(CompositionLocalsKt.j());
                        if (((Boolean) dVarF.v(CompositionLocalsKt.q())).booleanValue()) {
                            d9cVarA = null;
                        } else {
                            d9cVarA = d9c.INSTANCE.a();
                        }
                        b bVar5 = bVar4;
                        int i21 = i9;
                        vt6 vt6VarF = f(function0C, lazyGridState, vq6Var, rx8Var3, z7, z2, eVar, nVar, ta2Var, i05Var, d9cVarA, dVarF, (i9 & 524272) | ((i8 << 18) & 3670016) | ((i9 >> 6) & 29360128), 0);
                        z8 = z7;
                        rx8 rx8Var4 = rx8Var3;
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        orientation2 = orientation;
                        if (z3) {
                            dVarF.y(27281635);
                            bVarB = ws6.b(b.INSTANCE, dp6.a(lazyGridState, dVarF, i10), lazyGridState.getBeyondBoundsInfo(), z8, orientation2);
                            dVarF.u();
                        } else {
                            dVarF.y(27577840);
                            dVarF.u();
                            bVarB = b.INSTANCE;
                        }
                        qg4 qg4Var4 = qg4VarA;
                        ut6.f(function0C, x9b.c(f.c(bVar5.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0C, tu6VarA, orientation2, z3, z8, dVarF, (i20 & 57344) | (458752 & (i21 << 3))).then(bVarB).then(lazyGridState.z().getModifier()), lazyGridState, orientation2, zv8Var, z3, z8, qg4Var4, lazyGridState.getInternalInteractionSource(), null, 128, null), lazyGridState.getPrefetchState(), vt6VarF, dVarF, 0, 0);
                        dVarF = dVarF;
                        if (e.k()) {
                            e.n();
                        }
                        z6 = z8;
                        qg4Var3 = qg4Var4;
                        rx8Var2 = rx8Var4;
                        bVar3 = bVar5;
                    } else {
                        dVarF.q();
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        rx8Var3 = rx8VarE;
                        z7 = z4;
                        bVar4 = bVar2;
                    }
                    i9 = i4;
                    qg4VarA = qg4Var2;
                    dVarF.M();
                    if (e.k()) {
                        e.o(708740370, i9, i8, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                    }
                    i10 = (i9 >> 3) & 14;
                    Function0<rp6> function0C2 = LazyGridItemProviderKt.c(lazyGridState, function1, dVarF, (i8 & 112) | i10);
                    int i22 = i9 >> 9;
                    tu6 tu6VarA2 = rx6.a(lazyGridState, z7, dVarF, (i22 & 112) | i10);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR);
                    }
                    ta2 ta2Var2 = (ta2) objR;
                    i05 i05Var2 = (i05) dVarF.v(CompositionLocalsKt.j());
                    if (((Boolean) dVarF.v(CompositionLocalsKt.q())).booleanValue()) {
                        d9cVarA = d9c.INSTANCE.a();
                    } else {
                        d9cVarA = null;
                    }
                    b bVar6 = bVar4;
                    int i23 = i9;
                    vt6 vt6VarF2 = f(function0C2, lazyGridState, vq6Var, rx8Var3, z7, z2, eVar, nVar, ta2Var2, i05Var2, d9cVarA, dVarF, (i9 & 524272) | ((i8 << 18) & 3670016) | ((i9 >> 6) & 29360128), 0);
                    z8 = z7;
                    rx8 rx8Var5 = rx8Var3;
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    orientation2 = orientation;
                    if (z3) {
                        dVarF.y(27281635);
                        bVarB = ws6.b(b.INSTANCE, dp6.a(lazyGridState, dVarF, i10), lazyGridState.getBeyondBoundsInfo(), z8, orientation2);
                        dVarF.u();
                    } else {
                        dVarF.y(27577840);
                        dVarF.u();
                        bVarB = b.INSTANCE;
                    }
                    qg4 qg4Var5 = qg4VarA;
                    ut6.f(function0C2, x9b.c(f.c(bVar6.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0C2, tu6VarA2, orientation2, z3, z8, dVarF, (i22 & 57344) | (458752 & (i23 << 3))).then(bVarB).then(lazyGridState.z().getModifier()), lazyGridState, orientation2, zv8Var, z3, z8, qg4Var5, lazyGridState.getInternalInteractionSource(), null, 128, null), lazyGridState.getPrefetchState(), vt6VarF2, dVarF, 0, 0);
                    dVarF = dVarF;
                    if (e.k()) {
                        e.n();
                    }
                    z6 = z8;
                    qg4Var3 = qg4Var5;
                    rx8Var2 = rx8Var5;
                    bVar3 = bVar6;
                } else {
                    dVarF.q();
                    rx8Var2 = rx8VarE;
                    z6 = z4;
                    bVar3 = bVar2;
                    qg4Var3 = qg4Var2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.xp6
                        public final Object invoke(Object obj, Object obj2) {
                            return bq6.c(bVar3, lazyGridState, vq6Var, rx8Var2, z6, z2, qg4Var3, z3, zv8Var, nVar, eVar, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            z4 = z;
            if ((i & 196608) == 0) {
                if (dVarF.A(z2)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i4 |= i17;
            }
            if ((i & 1572864) == 0) {
                qg4Var2 = qg4Var;
                if ((i3 & 64) == 0) {
                    i16 = 524288;
                } else {
                    i16 = 524288;
                }
                i4 |= i16;
            } else {
                qg4Var2 = qg4Var;
            }
            if ((i & 12582912) == 0) {
                if (dVarF.A(z3)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i4 |= i15;
            }
            if ((i & 100663296) == 0) {
                if (dVarF.x(zv8Var)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i4 |= i14;
            }
            if ((i & 805306368) == 0) {
                if (dVarF.x(nVar)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i4 |= i13;
            }
            if ((i2 & 6) == 0) {
                if (dVarF.x(eVar)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i7 = i2 | i12;
            } else {
                i7 = i2;
            }
            if ((i2 & 48) == 0) {
                if (dVarF.T(function1)) {
                    i11 = 32;
                } else {
                    i11 = 16;
                }
                i7 |= i11;
            }
            i8 = i7;
            if ((i4 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (dVarF.g(z5, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i19 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        rx8Var3 = rx8VarE;
                        qg4VarA = cab.a.a(dVarF, 6);
                        i9 = i4 & (-3670017);
                    } else {
                        rx8Var3 = rx8VarE;
                        i9 = i4;
                        qg4VarA = qg4Var2;
                    }
                } else {
                    if (i18 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i19 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        rx8Var3 = rx8VarE;
                        qg4VarA = cab.a.a(dVarF, 6);
                        i9 = i4 & (-3670017);
                    } else {
                        rx8Var3 = rx8VarE;
                        i9 = i4;
                        qg4VarA = qg4Var2;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(708740370, i9, i8, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                }
                i10 = (i9 >> 3) & 14;
                Function0<rp6> function0C3 = LazyGridItemProviderKt.c(lazyGridState, function1, dVarF, (i8 & 112) | i10);
                int i24 = i9 >> 9;
                tu6 tu6VarA3 = rx6.a(lazyGridState, z7, dVarF, (i24 & 112) | i10);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR);
                }
                ta2 ta2Var3 = (ta2) objR;
                i05 i05Var3 = (i05) dVarF.v(CompositionLocalsKt.j());
                if (((Boolean) dVarF.v(CompositionLocalsKt.q())).booleanValue()) {
                    d9cVarA = d9c.INSTANCE.a();
                } else {
                    d9cVarA = null;
                }
                b bVar7 = bVar4;
                int i25 = i9;
                vt6 vt6VarF3 = f(function0C3, lazyGridState, vq6Var, rx8Var3, z7, z2, eVar, nVar, ta2Var3, i05Var3, d9cVarA, dVarF, (i9 & 524272) | ((i8 << 18) & 3670016) | ((i9 >> 6) & 29360128), 0);
                z8 = z7;
                rx8 rx8Var6 = rx8Var3;
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                orientation2 = orientation;
                if (z3) {
                    dVarF.y(27281635);
                    bVarB = ws6.b(b.INSTANCE, dp6.a(lazyGridState, dVarF, i10), lazyGridState.getBeyondBoundsInfo(), z8, orientation2);
                    dVarF.u();
                } else {
                    dVarF.y(27577840);
                    dVarF.u();
                    bVarB = b.INSTANCE;
                }
                qg4 qg4Var6 = qg4VarA;
                ut6.f(function0C3, x9b.c(f.c(bVar7.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0C3, tu6VarA3, orientation2, z3, z8, dVarF, (i24 & 57344) | (458752 & (i25 << 3))).then(bVarB).then(lazyGridState.z().getModifier()), lazyGridState, orientation2, zv8Var, z3, z8, qg4Var6, lazyGridState.getInternalInteractionSource(), null, 128, null), lazyGridState.getPrefetchState(), vt6VarF3, dVarF, 0, 0);
                dVarF = dVarF;
                if (e.k()) {
                    e.n();
                }
                z6 = z8;
                qg4Var3 = qg4Var6;
                rx8Var2 = rx8Var6;
                bVar3 = bVar7;
            } else {
                dVarF.q();
                rx8Var2 = rx8VarE;
                z6 = z4;
                bVar3 = bVar2;
                qg4Var3 = qg4Var2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.xp6
                    public final Object invoke(Object obj, Object obj2) {
                        return bq6.c(bVar3, lazyGridState, vq6Var, rx8Var2, z6, z2, qg4Var3, z3, zv8Var, nVar, eVar, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 3072;
        rx8VarE = rx8Var;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                z4 = z;
                if (dVarF.A(z4)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            if ((i & 196608) == 0) {
                if (dVarF.A(z2)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i4 |= i17;
            }
            if ((i & 1572864) == 0) {
                qg4Var2 = qg4Var;
                if ((i3 & 64) == 0) {
                    i16 = 524288;
                } else {
                    i16 = 524288;
                }
                i4 |= i16;
            } else {
                qg4Var2 = qg4Var;
            }
            if ((i & 12582912) == 0) {
                if (dVarF.A(z3)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i4 |= i15;
            }
            if ((i & 100663296) == 0) {
                if (dVarF.x(zv8Var)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i4 |= i14;
            }
            if ((i & 805306368) == 0) {
                if (dVarF.x(nVar)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i4 |= i13;
            }
            if ((i2 & 6) == 0) {
                if (dVarF.x(eVar)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i7 = i2 | i12;
            } else {
                i7 = i2;
            }
            if ((i2 & 48) == 0) {
                if (dVarF.T(function1)) {
                    i11 = 32;
                } else {
                    i11 = 16;
                }
                i7 |= i11;
            }
            i8 = i7;
            if ((i4 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (dVarF.g(z5, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i19 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        rx8Var3 = rx8VarE;
                        qg4VarA = cab.a.a(dVarF, 6);
                        i9 = i4 & (-3670017);
                    } else {
                        rx8Var3 = rx8VarE;
                        i9 = i4;
                        qg4VarA = qg4Var2;
                    }
                } else {
                    if (i18 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i19 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        rx8Var3 = rx8VarE;
                        qg4VarA = cab.a.a(dVarF, 6);
                        i9 = i4 & (-3670017);
                    } else {
                        rx8Var3 = rx8VarE;
                        i9 = i4;
                        qg4VarA = qg4Var2;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(708740370, i9, i8, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                }
                i10 = (i9 >> 3) & 14;
                Function0<rp6> function0C4 = LazyGridItemProviderKt.c(lazyGridState, function1, dVarF, (i8 & 112) | i10);
                int i26 = i9 >> 9;
                tu6 tu6VarA4 = rx6.a(lazyGridState, z7, dVarF, (i26 & 112) | i10);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR);
                }
                ta2 ta2Var4 = (ta2) objR;
                i05 i05Var4 = (i05) dVarF.v(CompositionLocalsKt.j());
                if (((Boolean) dVarF.v(CompositionLocalsKt.q())).booleanValue()) {
                    d9cVarA = d9c.INSTANCE.a();
                } else {
                    d9cVarA = null;
                }
                b bVar8 = bVar4;
                int i27 = i9;
                vt6 vt6VarF4 = f(function0C4, lazyGridState, vq6Var, rx8Var3, z7, z2, eVar, nVar, ta2Var4, i05Var4, d9cVarA, dVarF, (i9 & 524272) | ((i8 << 18) & 3670016) | ((i9 >> 6) & 29360128), 0);
                z8 = z7;
                rx8 rx8Var7 = rx8Var3;
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                orientation2 = orientation;
                if (z3) {
                    dVarF.y(27281635);
                    bVarB = ws6.b(b.INSTANCE, dp6.a(lazyGridState, dVarF, i10), lazyGridState.getBeyondBoundsInfo(), z8, orientation2);
                    dVarF.u();
                } else {
                    dVarF.y(27577840);
                    dVarF.u();
                    bVarB = b.INSTANCE;
                }
                qg4 qg4Var7 = qg4VarA;
                ut6.f(function0C4, x9b.c(f.c(bVar8.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0C4, tu6VarA4, orientation2, z3, z8, dVarF, (i26 & 57344) | (458752 & (i27 << 3))).then(bVarB).then(lazyGridState.z().getModifier()), lazyGridState, orientation2, zv8Var, z3, z8, qg4Var7, lazyGridState.getInternalInteractionSource(), null, 128, null), lazyGridState.getPrefetchState(), vt6VarF4, dVarF, 0, 0);
                dVarF = dVarF;
                if (e.k()) {
                    e.n();
                }
                z6 = z8;
                qg4Var3 = qg4Var7;
                rx8Var2 = rx8Var7;
                bVar3 = bVar8;
            } else {
                dVarF.q();
                rx8Var2 = rx8VarE;
                z6 = z4;
                bVar3 = bVar2;
                qg4Var3 = qg4Var2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.xp6
                    public final Object invoke(Object obj, Object obj2) {
                        return bq6.c(bVar3, lazyGridState, vq6Var, rx8Var2, z6, z2, qg4Var3, z3, zv8Var, nVar, eVar, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 24576;
        z4 = z;
        if ((i & 196608) == 0) {
            if (dVarF.A(z2)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i4 |= i17;
        }
        if ((i & 1572864) == 0) {
            qg4Var2 = qg4Var;
            if ((i3 & 64) == 0) {
                i16 = 524288;
            } else {
                i16 = 524288;
            }
            i4 |= i16;
        } else {
            qg4Var2 = qg4Var;
        }
        if ((i & 12582912) == 0) {
            if (dVarF.A(z3)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i4 |= i15;
        }
        if ((i & 100663296) == 0) {
            if (dVarF.x(zv8Var)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i4 |= i14;
        }
        if ((i & 805306368) == 0) {
            if (dVarF.x(nVar)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i4 |= i13;
        }
        if ((i2 & 6) == 0) {
            if (dVarF.x(eVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i7 = i2 | i12;
        } else {
            i7 = i2;
        }
        if ((i2 & 48) == 0) {
            if (dVarF.T(function1)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i7 |= i11;
        }
        i8 = i7;
        if ((i4 & 306783379) == 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (dVarF.g(z5, i4 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i18 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i19 != 0) {
                    rx8VarE = nx8.e(ff3.i(0));
                }
                if (i5 == 0) {
                }
                if ((i3 & 64) != 0) {
                    rx8Var3 = rx8VarE;
                    qg4VarA = cab.a.a(dVarF, 6);
                    i9 = i4 & (-3670017);
                } else {
                    rx8Var3 = rx8VarE;
                    i9 = i4;
                    qg4VarA = qg4Var2;
                }
            } else {
                if (i18 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i19 != 0) {
                    rx8VarE = nx8.e(ff3.i(0));
                }
                if (i5 == 0) {
                }
                if ((i3 & 64) != 0) {
                    rx8Var3 = rx8VarE;
                    qg4VarA = cab.a.a(dVarF, 6);
                    i9 = i4 & (-3670017);
                } else {
                    rx8Var3 = rx8VarE;
                    i9 = i4;
                    qg4VarA = qg4Var2;
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(708740370, i9, i8, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
            }
            i10 = (i9 >> 3) & 14;
            Function0<rp6> function0C5 = LazyGridItemProviderKt.c(lazyGridState, function1, dVarF, (i8 & 112) | i10);
            int i28 = i9 >> 9;
            tu6 tu6VarA5 = rx6.a(lazyGridState, z7, dVarF, (i28 & 112) | i10);
            objR = dVarF.R();
            if (objR == d.INSTANCE.a()) {
                objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                dVarF.L(objR);
            }
            ta2 ta2Var5 = (ta2) objR;
            i05 i05Var5 = (i05) dVarF.v(CompositionLocalsKt.j());
            if (((Boolean) dVarF.v(CompositionLocalsKt.q())).booleanValue()) {
                d9cVarA = d9c.INSTANCE.a();
            } else {
                d9cVarA = null;
            }
            b bVar9 = bVar4;
            int i29 = i9;
            vt6 vt6VarF5 = f(function0C5, lazyGridState, vq6Var, rx8Var3, z7, z2, eVar, nVar, ta2Var5, i05Var5, d9cVarA, dVarF, (i9 & 524272) | ((i8 << 18) & 3670016) | ((i9 >> 6) & 29360128), 0);
            z8 = z7;
            rx8 rx8Var8 = rx8Var3;
            if (z2) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            orientation2 = orientation;
            if (z3) {
                dVarF.y(27281635);
                bVarB = ws6.b(b.INSTANCE, dp6.a(lazyGridState, dVarF, i10), lazyGridState.getBeyondBoundsInfo(), z8, orientation2);
                dVarF.u();
            } else {
                dVarF.y(27577840);
                dVarF.u();
                bVarB = b.INSTANCE;
            }
            qg4 qg4Var8 = qg4VarA;
            ut6.f(function0C5, x9b.c(f.c(bVar9.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0C5, tu6VarA5, orientation2, z3, z8, dVarF, (i28 & 57344) | (458752 & (i29 << 3))).then(bVarB).then(lazyGridState.z().getModifier()), lazyGridState, orientation2, zv8Var, z3, z8, qg4Var8, lazyGridState.getInternalInteractionSource(), null, 128, null), lazyGridState.getPrefetchState(), vt6VarF5, dVarF, 0, 0);
            dVarF = dVarF;
            if (e.k()) {
                e.n();
            }
            z6 = z8;
            qg4Var3 = qg4Var8;
            rx8Var2 = rx8Var8;
            bVar3 = bVar9;
        } else {
            dVarF.q();
            rx8Var2 = rx8VarE;
            z6 = z4;
            bVar3 = bVar2;
            qg4Var3 = qg4Var2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.xp6
                public final Object invoke(Object obj, Object obj2) {
                    return bq6.c(bVar3, lazyGridState, vq6Var, rx8Var2, z6, z2, qg4Var3, z3, zv8Var, nVar, eVar, function1, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(b bVar, LazyGridState lazyGridState, vq6 vq6Var, rx8 rx8Var, boolean z, boolean z2, qg4 qg4Var, boolean z3, zv8 zv8Var, c.n nVar, c.e eVar, Function1 function1, int i, int i2, int i3, d dVar, int i4) {
        b(bVar, lazyGridState, vq6Var, rx8Var, z, z2, qg4Var, z3, zv8Var, nVar, eVar, function1, dVar, saa.a(i | 1), saa.a(i2), i3);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(h11 h11Var, Orientation orientation, List<kq6> list, nq6 nq6Var) {
        Trace.beginSection("compose:lazy:cache_window:keepAroundItems");
        try {
            if (h11Var.n() && !list.isEmpty()) {
                int iA = qp6.a((pp6) m.z0(list), orientation);
                int iA2 = qp6.a((pp6) m.L0(list), orientation);
                for (int iM = h11Var.getPrefetchWindowStartLine(); iM < iA; iM++) {
                    nq6Var.d(iM);
                }
                int i = iA2 + 1;
                int iL = h11Var.getPrefetchWindowEndLine();
                if (i <= iL) {
                    while (true) {
                        nq6Var.d(i);
                        if (i == iL) {
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

    /* JADX WARN: Code duplicated, block: B:45:0x008f A[PHI: r3
  0x008f: PHI (r3v23 boolean) = (r3v21 boolean), (r3v24 boolean) binds: [B:44:0x008d, B:40:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f4  */
    private static final vt6 f(Function0<? extends rp6> function0, LazyGridState lazyGridState, vq6 vq6Var, rx8 rx8Var, boolean z, boolean z2, c.e eVar, c.n nVar, ta2 ta2Var, i05 i05Var, d9c d9cVar, d dVar, int i, int i2) {
        boolean z3;
        boolean z4;
        boolean zX;
        Object objR;
        if (e.k()) {
            e.o(-1030995717, i, i2, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:179)");
        }
        boolean z5 = ((((i & 112) ^ 48) > 32 && dVar.x(lazyGridState)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && dVar.x(vq6Var)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && dVar.x(rx8Var)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && dVar.A(z)) || (i & 24576) == 16384);
        if (((458752 & i) ^ 196608) > 131072) {
            z3 = z2;
            if (dVar.A(z3)) {
                z4 = true;
            }
            zX = z5 | z4 | ((((3670016 & i) ^ 1572864) <= 1048576 && dVar.x(eVar)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && dVar.x(nVar)) || (i & 12582912) == 8388608) | dVar.x(i05Var);
            objR = dVar.R();
            if (zX || objR == d.INSTANCE.a()) {
                a aVar = new a(lazyGridState, z3, rx8Var, z, function0, vq6Var, nVar, eVar, ta2Var, i05Var, d9cVar);
                dVar.L(aVar);
                objR = aVar;
            }
            vt6 vt6Var = (vt6) objR;
            if (e.k()) {
                e.n();
            }
            return vt6Var;
        }
        z3 = z2;
        if ((196608 & i) == 131072) {
            z4 = true;
        } else {
            z4 = false;
        }
        zX = z5 | z4 | ((((3670016 & i) ^ 1572864) <= 1048576 && dVar.x(eVar)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && dVar.x(nVar)) || (i & 12582912) == 8388608) | dVar.x(i05Var);
        objR = dVar.R();
        if (zX) {
            a aVar2 = new a(lazyGridState, z3, rx8Var, z, function0, vq6Var, nVar, eVar, ta2Var, i05Var, d9cVar);
            dVar.L(aVar2);
            objR = aVar2;
        } else {
            a aVar3 = new a(lazyGridState, z3, rx8Var, z, function0, vq6Var, nVar, eVar, ta2Var, i05Var, d9cVar);
            dVar.L(aVar3);
            objR = aVar3;
        }
        vt6 vt6Var2 = (vt6) objR;
        if (e.k()) {
            e.n();
        }
        return vt6Var2;
    }
}
