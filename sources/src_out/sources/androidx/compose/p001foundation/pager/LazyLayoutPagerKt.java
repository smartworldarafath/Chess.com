package androidx.compose.p001foundation.pager;

import androidx.compose.p001foundation.gestures.ForEachGestureKt;
import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.gestures.snapping.j;
import androidx.compose.p001foundation.lazy.layout.f;
import androidx.compose.p001foundation.pager.LazyLayoutPagerKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.qh6;
import com.google.android.rs4;
import com.google.android.ta2;
import com.google.inputmethod.az8;
import com.google.inputmethod.cc0;
import com.google.inputmethod.cx5;
import com.google.inputmethod.df9;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fu0;
import com.google.inputmethod.hu0;
import com.google.inputmethod.iy8;
import com.google.inputmethod.iz8;
import com.google.inputmethod.kz8;
import com.google.inputmethod.omc;
import com.google.inputmethod.pe8;
import com.google.inputmethod.pz8;
import com.google.inputmethod.q6c;
import com.google.inputmethod.re8;
import com.google.inputmethod.rx8;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.tc;
import com.google.inputmethod.tu6;
import com.google.inputmethod.ue8;
import com.google.inputmethod.ugc;
import com.google.inputmethod.up1;
import com.google.inputmethod.ut6;
import com.google.inputmethod.vn3;
import com.google.inputmethod.vt6;
import com.google.inputmethod.ws6;
import com.google.inputmethod.x9b;
import com.google.inputmethod.zv8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference0Impl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a½\u0001\u0010$\u001a\u00020\"2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\"0 H\u0001¢\u0006\u0004\b$\u0010%\u001a[\u0010)\u001a\b\u0012\u0004\u0012\u00020(0&2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\"0 2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0&H\u0003¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010+\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Landroidx/compose/foundation/pager/PagerState;", "state", "Lcom/google/android/rx8;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lcom/google/android/omc;", "flingBehavior", "userScrollEnabled", "Lcom/google/android/zv8;", "overscrollEffect", "", "beyondViewportPageCount", "Lcom/google/android/ff3;", "pageSpacing", "Landroidx/compose/foundation/pager/f;", "pageSize", "Lcom/google/android/re8;", "pageNestedScrollConnection", "Lkotlin/Function1;", "", "key", "Lcom/google/android/tc$b;", "horizontalAlignment", "Lcom/google/android/tc$c;", "verticalAlignment", "Landroidx/compose/foundation/gestures/snapping/j;", "snapPosition", "Lkotlin/Function2;", "Lcom/google/android/kz8;", "", "pageContent", "f", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/pager/PagerState;Lcom/google/android/rx8;ZLandroidx/compose/foundation/gestures/Orientation;Lcom/google/android/omc;ZLcom/google/android/zv8;IFLandroidx/compose/foundation/pager/f;Lcom/google/android/re8;Lkotlin/jvm/functions/Function1;Lcom/google/android/tc$b;Lcom/google/android/tc$c;Landroidx/compose/foundation/gestures/snapping/j;Lcom/google/android/rs4;Landroidx/compose/runtime/d;III)V", "Lkotlin/Function0;", "pageCount", "Lcom/google/android/az8;", "k", "(Landroidx/compose/foundation/pager/PagerState;Lcom/google/android/rs4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;I)Lkotlin/jvm/functions/Function0;", "j", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/pager/PagerState;)Landroidx/compose/ui/b;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LazyLayoutPagerKt {
    /* JADX WARN: Code duplicated, block: B:100:0x012f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0134  */
    /* JADX WARN: Code duplicated, block: B:105:0x013a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147  */
    /* JADX WARN: Code duplicated, block: B:112:0x014d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0155  */
    /* JADX WARN: Code duplicated, block: B:116:0x015a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0162  */
    /* JADX WARN: Code duplicated, block: B:121:0x0168  */
    /* JADX WARN: Code duplicated, block: B:122:0x016b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0177  */
    /* JADX WARN: Code duplicated, block: B:128:0x017d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0180  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:142:0x01af  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:156:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:162:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:165:0x0238  */
    /* JADX WARN: Code duplicated, block: B:168:0x0245  */
    /* JADX WARN: Code duplicated, block: B:169:0x0248  */
    /* JADX WARN: Code duplicated, block: B:174:0x0255  */
    /* JADX WARN: Code duplicated, block: B:177:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:178:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:181:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:182:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:185:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:186:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:193:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:196:0x0302  */
    /* JADX WARN: Code duplicated, block: B:198:0x030c  */
    /* JADX WARN: Code duplicated, block: B:199:0x030f  */
    /* JADX WARN: Code duplicated, block: B:204:0x032a  */
    /* JADX WARN: Code duplicated, block: B:207:0x0339  */
    /* JADX WARN: Code duplicated, block: B:209:0x0343  */
    /* JADX WARN: Code duplicated, block: B:210:0x0346  */
    /* JADX WARN: Code duplicated, block: B:215:0x0358  */
    /* JADX WARN: Code duplicated, block: B:218:0x0368  */
    /* JADX WARN: Code duplicated, block: B:219:0x0385  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:223:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:226:0x0405  */
    /* JADX WARN: Code duplicated, block: B:228:0x040b  */
    /* JADX WARN: Code duplicated, block: B:231:0x0419  */
    /* JADX WARN: Code duplicated, block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:83:0x0102  */
    /* JADX WARN: Code duplicated, block: B:85:0x0108  */
    /* JADX WARN: Code duplicated, block: B:86:0x010b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0110  */
    /* JADX WARN: Code duplicated, block: B:91:0x0116  */
    /* JADX WARN: Code duplicated, block: B:93:0x011c  */
    /* JADX WARN: Code duplicated, block: B:94:0x011f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0127  */
    /* JADX WARN: Instruction removed from duplicated block: B:153:0x01d1, please report this as an issue */
    public static final void f(final b bVar, PagerState pagerState, final rx8 rx8Var, final boolean z, final Orientation orientation, final omc omcVar, final boolean z2, final zv8 zv8Var, int i, float f, final f fVar, re8 re8Var, final Function1<? super Integer, ? extends Object> function1, final tc.b bVar2, final tc.c cVar, final j jVar, final rs4<? super kz8, ? super Integer, ? super d, ? super Integer, Unit> rs4Var, d dVar, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        boolean z3;
        final re8 re8Var2;
        d dVar2;
        final int i10;
        final float f3;
        s6b s6bVarH;
        int i11;
        float fI;
        boolean z4;
        int i12;
        boolean z5;
        Object objR;
        int i13;
        int i14;
        int i15;
        Object objR2;
        d.Companion companion;
        boolean z6;
        Object objR3;
        Orientation orientation2;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objR4;
        fu0 fu0Var;
        LayoutDirection layoutDirection;
        boolean z11;
        boolean zX;
        Object objR5;
        fu0 fu0Var2;
        b bVarB;
        boolean z12;
        boolean z13;
        boolean zX2;
        Object objR6;
        int i16;
        int i17;
        int i18;
        int i19;
        final PagerState pagerState2 = pagerState;
        d dVarF = dVar.F(-572816025);
        if ((i2 & 6) == 0) {
            i5 = (dVarF.x(bVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= dVarF.x(pagerState2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= dVarF.x(rx8Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= dVarF.A(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= dVarF.C(orientation.ordinal()) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= dVarF.x(omcVar) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= dVarF.A(z2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= dVarF.x(zv8Var) ? 8388608 : 4194304;
        }
        int i20 = i4 & 256;
        if (i20 == 0) {
            if ((i2 & 100663296) == 0) {
                i5 |= dVarF.C(i) ? 67108864 : 33554432;
            }
            i6 = i4 & 512;
            if (i6 != 0) {
                i5 |= 805306368;
                f2 = f;
            } else {
                f2 = f;
                if ((i2 & 805306368) == 0) {
                    if (dVarF.B(f2)) {
                        i7 = 536870912;
                    } else {
                        i7 = 268435456;
                    }
                    i5 |= i7;
                }
            }
            if ((i3 & 6) == 0) {
                if (dVarF.x(fVar)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i8 = i3 | i19;
            } else {
                i8 = i3;
            }
            if ((i3 & 48) == 0) {
                if (dVarF.T(re8Var)) {
                    i18 = 32;
                } else {
                    i18 = 16;
                }
                i8 |= i18;
            }
            if ((i3 & 384) != 0) {
                i8 |= dVarF.T(function1) ? 256 : 128;
            }
            if ((i3 & 3072) != 0) {
                i8 |= dVarF.x(bVar2) ? 2048 : 1024;
            }
            if ((i3 & 24576) != 0) {
                i8 |= dVarF.x(cVar) ? 16384 : 8192;
            }
            if ((i3 & 196608) == 0) {
                if (dVarF.x(jVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i8 |= i17;
            }
            if ((i3 & 1572864) == 0) {
                if (dVarF.T(rs4Var)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i8 |= i16;
            }
            i9 = i8;
            if ((i5 & 306783379) == 306783378 || (599187 & i9) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i5 & 1)) {
                if (i20 != 0) {
                    i11 = 0;
                } else {
                    i11 = i;
                }
                if (i6 != 0) {
                    fI = ff3.i(0);
                } else {
                    fI = f2;
                }
                if (e.k()) {
                    e.o(-572816025, i5, i9, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:106)");
                }
                if (i11 >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    cx5.a("beyondViewportPageCount should be greater than or equal to 0, you selected " + i11);
                }
                i12 = i5 & 112;
                if (i12 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objR = dVarF.R();
                if (z5 || objR == d.INSTANCE.a()) {
                    objR = new Function0() { // from class: com.google.android.du6
                        public final Object invoke() {
                            return Integer.valueOf(LazyLayoutPagerKt.g(pagerState2));
                        }
                    };
                    dVarF.L(objR);
                }
                Function0 function0 = (Function0) objR;
                int i21 = i5 >> 3;
                i13 = i21 & 14;
                int i22 = i9 >> 15;
                i14 = i5;
                i15 = i11;
                Function0<az8> function0K = k(pagerState2, rs4Var, function1, function0, dVarF, i13 | (i22 & 112) | (i9 & 896));
                objR2 = dVarF.R();
                companion = d.INSTANCE;
                if (objR2 == companion.a()) {
                    objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR2);
                }
                ta2 ta2Var = (ta2) objR2;
                if (i12 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objR3 = dVarF.R();
                if (z6 || objR3 == companion.a()) {
                    objR3 = new Function0() { // from class: com.google.android.eu6
                        public final Object invoke() {
                            return Integer.valueOf(LazyLayoutPagerKt.h(pagerState2));
                        }
                    };
                    dVarF.L(objR3);
                }
                int i23 = i14 >> 9;
                int i24 = i9 << 15;
                vt6 vt6VarC = iz8.c(function0K, pagerState2, rx8Var, z, orientation, i15, fI, fVar, bVar2, cVar, jVar, ta2Var, (Function0) objR3, dVarF, (i14 & 65520) | (i23 & 458752) | (i23 & 3670016) | ((i9 << 21) & 29360128) | (i24 & 234881024) | (i24 & 1879048192), i22 & 14);
                float f4 = fI;
                orientation2 = Orientation.Vertical;
                if (orientation == orientation2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                tu6 tu6VarA = pz8.a(pagerState2, z7, dVarF, i13);
                if (i12 == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((i14 & 458752) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z9 | z8;
                objR4 = dVarF.R();
                if (z10 || objR4 == companion.a()) {
                    objR4 = new PagerWrapperFlingBehavior(omcVar, pagerState2);
                    dVarF.L(objR4);
                }
                PagerWrapperFlingBehavior pagerWrapperFlingBehavior = (PagerWrapperFlingBehavior) objR4;
                fu0Var = (fu0) dVarF.v(hu0.c());
                layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                if (up1.isBringIntoViewRltBouncyBehaviorInPagerFixEnabled) {
                    dVarF.y(-853904960);
                    if (i12 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zX2 = z13 | dVarF.x(fu0Var) | dVarF.C(layoutDirection.ordinal());
                    objR6 = dVarF.R();
                    if (zX2 || objR6 == companion.a()) {
                        objR6 = new g(pagerState2, fu0Var, layoutDirection);
                        dVarF.L(objR6);
                    }
                    fu0Var2 = (g) objR6;
                    dVarF.u();
                } else {
                    dVarF.y(-853714372);
                    if (i12 == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zX = z11 | dVarF.x(fu0Var);
                    objR5 = dVarF.R();
                    if (zX || objR5 == companion.a()) {
                        objR5 = new e(pagerState2, fu0Var);
                        dVarF.L(objR5);
                    }
                    fu0Var2 = (e) objR5;
                    dVarF.u();
                }
                fu0 fu0Var3 = fu0Var2;
                if (z2) {
                    dVarF.y(-853484445);
                    bVarB = ws6.b(b.INSTANCE, iy8.a(pagerState2, i15, dVarF, i13 | ((i14 >> 21) & 112)), pagerState2.getBeyondBoundsInfo(), z, orientation);
                    dVarF.u();
                } else {
                    dVarF.y(-853054661);
                    dVarF.u();
                    bVarB = b.INSTANCE;
                }
                b bVarC = f.c(bVar.then(pagerState2.getRemeasurementModifier()).then(pagerState2.getAwaitLayoutModifier()), function0K, tu6VarA, orientation, z2, z, dVarF, (i21 & 7168) | ((i14 >> 6) & 57344) | ((i14 << 6) & 458752));
                if (orientation == orientation2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                b bVarA = x9b.a(PagerKt.j(bVarC, pagerState2, z12, ta2Var, z2).then(bVarB), pagerState2, orientation, zv8Var, z2, z, pagerWrapperFlingBehavior, pagerState2.getInternalInteractionSource(), fu0Var3);
                pagerState2 = pagerState2;
                re8Var2 = re8Var;
                ut6.f(function0K, ue8.b(j(bVarA, pagerState2), re8Var2, null, 2, null), pagerState2.getPrefetchState(), vt6VarC, dVarF, 0, 0);
                dVar2 = dVarF;
                if (e.k()) {
                    e.n();
                }
                f3 = f4;
                i10 = i15;
            } else {
                re8Var2 = re8Var;
                dVar2 = dVarF;
                dVar2.q();
                i10 = i;
                f3 = f2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.fu6
                    public final Object invoke(Object obj, Object obj2) {
                        return LazyLayoutPagerKt.i(bVar, pagerState2, rx8Var, z, orientation, omcVar, z2, zv8Var, i10, f3, fVar, re8Var2, function1, bVar2, cVar, jVar, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 100663296;
        i6 = i4 & 512;
        if (i6 != 0) {
            i5 |= 805306368;
            f2 = f;
        } else {
            f2 = f;
            if ((i2 & 805306368) == 0) {
                if (dVarF.B(f2)) {
                    i7 = 536870912;
                } else {
                    i7 = 268435456;
                }
                i5 |= i7;
            }
        }
        if ((i3 & 6) == 0) {
            if (dVarF.x(fVar)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i8 = i3 | i19;
        } else {
            i8 = i3;
        }
        if ((i3 & 48) == 0) {
            if (dVarF.T(re8Var)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i8 |= i18;
        }
        if ((i3 & 384) != 0) {
            i8 |= dVarF.T(function1) ? 256 : 128;
        }
        if ((i3 & 3072) != 0) {
            i8 |= dVarF.x(bVar2) ? 2048 : 1024;
        }
        if ((i3 & 24576) != 0) {
            i8 |= dVarF.x(cVar) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            if (dVarF.x(jVar)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i8 |= i17;
        }
        if ((i3 & 1572864) == 0) {
            if (dVarF.T(rs4Var)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i8 |= i16;
        }
        i9 = i8;
        if ((i5 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (dVarF.g(z3, i5 & 1)) {
            if (i20 != 0) {
                i11 = 0;
            } else {
                i11 = i;
            }
            if (i6 != 0) {
                fI = ff3.i(0);
            } else {
                fI = f2;
            }
            if (e.k()) {
                e.o(-572816025, i5, i9, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:106)");
            }
            if (i11 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                cx5.a("beyondViewportPageCount should be greater than or equal to 0, you selected " + i11);
            }
            i12 = i5 & 112;
            if (i12 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            objR = dVarF.R();
            if (z5) {
                objR = new Function0() { // from class: com.google.android.du6
                    public final Object invoke() {
                        return Integer.valueOf(LazyLayoutPagerKt.g(pagerState2));
                    }
                };
                dVarF.L(objR);
            } else {
                objR = new Function0() { // from class: com.google.android.du6
                    public final Object invoke() {
                        return Integer.valueOf(LazyLayoutPagerKt.g(pagerState2));
                    }
                };
                dVarF.L(objR);
            }
            Function0 function2 = (Function0) objR;
            int i25 = i5 >> 3;
            i13 = i25 & 14;
            int i26 = i9 >> 15;
            i14 = i5;
            i15 = i11;
            Function0<az8> function0K2 = k(pagerState2, rs4Var, function1, function2, dVarF, i13 | (i26 & 112) | (i9 & 896));
            objR2 = dVarF.R();
            companion = d.INSTANCE;
            if (objR2 == companion.a()) {
                objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                dVarF.L(objR2);
            }
            ta2 ta2Var2 = (ta2) objR2;
            if (i12 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            objR3 = dVarF.R();
            if (z6) {
                objR3 = new Function0() { // from class: com.google.android.eu6
                    public final Object invoke() {
                        return Integer.valueOf(LazyLayoutPagerKt.h(pagerState2));
                    }
                };
                dVarF.L(objR3);
            } else {
                objR3 = new Function0() { // from class: com.google.android.eu6
                    public final Object invoke() {
                        return Integer.valueOf(LazyLayoutPagerKt.h(pagerState2));
                    }
                };
                dVarF.L(objR3);
            }
            int i27 = i14 >> 9;
            int i28 = i9 << 15;
            vt6 vt6VarC2 = iz8.c(function0K2, pagerState2, rx8Var, z, orientation, i15, fI, fVar, bVar2, cVar, jVar, ta2Var2, (Function0) objR3, dVarF, (i14 & 65520) | (i27 & 458752) | (i27 & 3670016) | ((i9 << 21) & 29360128) | (i28 & 234881024) | (i28 & 1879048192), i26 & 14);
            float f5 = fI;
            orientation2 = Orientation.Vertical;
            if (orientation == orientation2) {
                z7 = true;
            } else {
                z7 = false;
            }
            tu6 tu6VarA2 = pz8.a(pagerState2, z7, dVarF, i13);
            if (i12 == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i14 & 458752) == 131072) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = z9 | z8;
            objR4 = dVarF.R();
            if (z10) {
                objR4 = new PagerWrapperFlingBehavior(omcVar, pagerState2);
                dVarF.L(objR4);
            } else {
                objR4 = new PagerWrapperFlingBehavior(omcVar, pagerState2);
                dVarF.L(objR4);
            }
            PagerWrapperFlingBehavior pagerWrapperFlingBehavior2 = (PagerWrapperFlingBehavior) objR4;
            fu0Var = (fu0) dVarF.v(hu0.c());
            layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
            if (up1.isBringIntoViewRltBouncyBehaviorInPagerFixEnabled) {
                dVarF.y(-853904960);
                if (i12 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zX2 = z13 | dVarF.x(fu0Var) | dVarF.C(layoutDirection.ordinal());
                objR6 = dVarF.R();
                if (zX2) {
                    objR6 = new g(pagerState2, fu0Var, layoutDirection);
                    dVarF.L(objR6);
                } else {
                    objR6 = new g(pagerState2, fu0Var, layoutDirection);
                    dVarF.L(objR6);
                }
                fu0Var2 = (g) objR6;
                dVarF.u();
            } else {
                dVarF.y(-853714372);
                if (i12 == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zX = z11 | dVarF.x(fu0Var);
                objR5 = dVarF.R();
                if (zX) {
                    objR5 = new e(pagerState2, fu0Var);
                    dVarF.L(objR5);
                } else {
                    objR5 = new e(pagerState2, fu0Var);
                    dVarF.L(objR5);
                }
                fu0Var2 = (e) objR5;
                dVarF.u();
            }
            fu0 fu0Var4 = fu0Var2;
            if (z2) {
                dVarF.y(-853484445);
                bVarB = ws6.b(b.INSTANCE, iy8.a(pagerState2, i15, dVarF, i13 | ((i14 >> 21) & 112)), pagerState2.getBeyondBoundsInfo(), z, orientation);
                dVarF.u();
            } else {
                dVarF.y(-853054661);
                dVarF.u();
                bVarB = b.INSTANCE;
            }
            b bVarC2 = f.c(bVar.then(pagerState2.getRemeasurementModifier()).then(pagerState2.getAwaitLayoutModifier()), function0K2, tu6VarA2, orientation, z2, z, dVarF, (i25 & 7168) | ((i14 >> 6) & 57344) | ((i14 << 6) & 458752));
            if (orientation == orientation2) {
                z12 = true;
            } else {
                z12 = false;
            }
            b bVarA2 = x9b.a(PagerKt.j(bVarC2, pagerState2, z12, ta2Var2, z2).then(bVarB), pagerState2, orientation, zv8Var, z2, z, pagerWrapperFlingBehavior2, pagerState2.getInternalInteractionSource(), fu0Var4);
            pagerState2 = pagerState2;
            re8Var2 = re8Var;
            ut6.f(function0K2, ue8.b(j(bVarA2, pagerState2), re8Var2, null, 2, null), pagerState2.getPrefetchState(), vt6VarC2, dVarF, 0, 0);
            dVar2 = dVarF;
            if (e.k()) {
                e.n();
            }
            f3 = f5;
            i10 = i15;
        } else {
            re8Var2 = re8Var;
            dVar2 = dVarF;
            dVar2.q();
            i10 = i;
            f3 = f2;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.fu6
                public final Object invoke(Object obj, Object obj2) {
                    return LazyLayoutPagerKt.i(bVar, pagerState2, rx8Var, z, orientation, omcVar, z2, zv8Var, i10, f3, fVar, re8Var2, function1, bVar2, cVar, jVar, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(PagerState pagerState) {
        return pagerState.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(PagerState pagerState) {
        return pagerState.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(b bVar, PagerState pagerState, rx8 rx8Var, boolean z, Orientation orientation, omc omcVar, boolean z2, zv8 zv8Var, int i, float f, f fVar, re8 re8Var, Function1 function1, tc.b bVar2, tc.c cVar, j jVar, rs4 rs4Var, int i2, int i3, int i4, d dVar, int i5) {
        f(bVar, pagerState, rx8Var, z, orientation, omcVar, z2, zv8Var, i, f, fVar, re8Var, function1, bVar2, cVar, jVar, rs4Var, dVar, saa.a(i2 | 1), saa.a(i3), i4);
        return Unit.a;
    }

    private static final b j(b bVar, final PagerState pagerState) {
        return bVar.then(ugc.c(b.INSTANCE, pagerState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1

            /* JADX INFO: renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
            @lq2(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", l = {296}, m = "invokeSuspend", v = 1)
            static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
                final /* synthetic */ PagerState $state;
                final /* synthetic */ df9 $this_pointerInput;
                int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "", "<anonymous>", "(Lcom/google/android/cc0;)V"}, k = 3, mv = {2, 1, 0})
                @lq2(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {298, 302}, m = "invokeSuspend", v = 1)
                static final class C00221 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super Unit>, Object> {
                    final /* synthetic */ PagerState $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00221(PagerState pagerState, q22<? super C00221> q22Var) {
                        super(2, q22Var);
                        this.$state = pagerState;
                    }

                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(cc0 cc0Var, q22<? super Unit> q22Var) {
                        return create(cc0Var, q22Var).invokeSuspend(Unit.a);
                    }

                    public final q22<Unit> create(Object obj, q22<?> q22Var) {
                        C00221 c00221 = new C00221(this.$state, q22Var);
                        c00221.L$0 = obj;
                        return c00221;
                    }

                    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
                    /* JADX WARN: Code duplicated, block: B:23:0x0082 A[LOOP:0: B:19:0x0073->B:23:0x0082, LOOP_END] */
                    /* JADX WARN: Code duplicated, block: B:27:0x0085 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[EDGE_INSN: B:28:0x0055->B:14:0x0055 BREAK  A[LOOP:0: B:19:0x0073->B:23:0x0082], SYNTHETIC] */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0065 -> B:18:0x0068). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                        /*
                            r10 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
                            int r1 = r10.label
                            r2 = 2
                            r3 = 0
                            r4 = 1
                            if (r1 == 0) goto L2f
                            if (r1 == r4) goto L27
                            if (r1 != r2) goto L1f
                            java.lang.Object r1 = r10.L$2
                            androidx.compose.ui.input.pointer.i r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                            java.lang.Object r4 = r10.L$1
                            androidx.compose.ui.input.pointer.i r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                            java.lang.Object r5 = r10.L$0
                            com.google.android.cc0 r5 = (com.google.inputmethod.cc0) r5
                            kotlin.f.b(r11)
                            goto L68
                        L1f:
                            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r11.<init>(r0)
                            throw r11
                        L27:
                            java.lang.Object r1 = r10.L$0
                            com.google.android.cc0 r1 = (com.google.inputmethod.cc0) r1
                            kotlin.f.b(r11)
                            goto L44
                        L2f:
                            kotlin.f.b(r11)
                            java.lang.Object r11 = r10.L$0
                            r1 = r11
                            com.google.android.cc0 r1 = (com.google.inputmethod.cc0) r1
                            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                            r10.L$0 = r1
                            r10.label = r4
                            java.lang.Object r11 = androidx.compose.p001foundation.gestures.TapGestureDetectorKt.c(r1, r3, r11, r10)
                            if (r11 != r0) goto L44
                            goto L67
                        L44:
                            androidx.compose.ui.input.pointer.i r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                            androidx.compose.foundation.pager.PagerState r4 = r10.$state
                            com.google.android.rn8$a r5 = com.google.inputmethod.rn8.INSTANCE
                            long r5 = r5.c()
                            r4.w0(r5)
                            r4 = 0
                            r5 = r1
                            r1 = r4
                            r4 = r11
                        L55:
                            if (r1 != 0) goto L91
                            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                            r10.L$0 = r5
                            r10.L$1 = r4
                            r10.L$2 = r1
                            r10.label = r2
                            java.lang.Object r11 = r5.f2(r11, r10)
                            if (r11 != r0) goto L68
                        L67:
                            return r0
                        L68:
                            androidx.compose.ui.input.pointer.e r11 = (androidx.compose.ui.input.pointer.e) r11
                            java.util.List r6 = r11.c()
                            int r7 = r6.size()
                            r8 = r3
                        L73:
                            if (r8 >= r7) goto L85
                            java.lang.Object r9 = r6.get(r8)
                            androidx.compose.ui.input.pointer.i r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
                            boolean r9 = androidx.compose.ui.input.pointer.f.c(r9)
                            if (r9 != 0) goto L82
                            goto L55
                        L82:
                            int r8 = r8 + 1
                            goto L73
                        L85:
                            java.util.List r11 = r11.c()
                            java.lang.Object r11 = r11.get(r3)
                            r1 = r11
                            androidx.compose.ui.input.pointer.i r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                            goto L55
                        L91:
                            androidx.compose.foundation.pager.PagerState r11 = r10.$state
                            long r0 = r1.getPosition()
                            long r2 = r4.getPosition()
                            long r0 = com.google.inputmethod.rn8.p(r0, r2)
                            r11.w0(r0)
                            kotlin.Unit r11 = kotlin.Unit.a
                            return r11
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1.AnonymousClass1.C00221.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(df9 df9Var, PagerState pagerState, q22<? super AnonymousClass1> q22Var) {
                    super(2, q22Var);
                    this.$this_pointerInput = df9Var;
                    this.$state = pagerState;
                }

                public final q22<Unit> create(Object obj, q22<?> q22Var) {
                    return new AnonymousClass1(this.$this_pointerInput, this.$state, q22Var);
                }

                public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                    return create(ta2Var, q22Var).invokeSuspend(Unit.a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object objG = a.g();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.f.b(obj);
                        df9 df9Var = this.$this_pointerInput;
                        C00221 c00221 = new C00221(this.$state, null);
                        this.label = 1;
                        if (ForEachGestureKt.d(df9Var, c00221, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.f.b(obj);
                    }
                    return Unit.a;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
                Object objG = kotlinx.coroutines.j.g(new AnonymousClass1(df9Var, pagerState, null), q22Var);
                return objG == a.g() ? objG : Unit.a;
            }
        }));
    }

    private static final Function0<az8> k(final PagerState pagerState, rs4<? super kz8, ? super Integer, ? super d, ? super Integer, Unit> rs4Var, Function1<? super Integer, ? extends Object> function1, final Function0<Integer> function0, d dVar, int i) {
        if (e.k()) {
            e.o(1052364153, i, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:268)");
        }
        final q6c q6cVarR = p0.r(rs4Var, dVar, (i >> 3) & 14);
        final q6c q6cVarR2 = p0.r(function1, dVar, (i >> 6) & 14);
        boolean zX = ((((i & 14) ^ 6) > 4 && dVar.x(pagerState)) || (i & 6) == 4) | dVar.x(q6cVarR) | dVar.x(q6cVarR2) | ((((i & 7168) ^ 3072) > 2048 && dVar.x(function0)) || (i & 3072) == 2048);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            final q6c q6cVarD = p0.d(p0.q(), new Function0() { // from class: com.google.android.gu6
                public final Object invoke() {
                    return LazyLayoutPagerKt.l(q6cVarR, q6cVarR2, function0);
                }
            });
            final q6c q6cVarD2 = p0.d(p0.q(), new Function0() { // from class: com.google.android.hu6
                public final Object invoke() {
                    return LazyLayoutPagerKt.m(q6cVarD, pagerState);
                }
            });
            objR = new PropertyReference0Impl(q6cVarD2) { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1
                public Object get() {
                    return ((q6c) ((CallableReference) this).receiver).getValue();
                }
            };
            dVar.L(objR);
        }
        qh6 qh6Var = (qh6) objR;
        if (e.k()) {
            e.n();
        }
        return qh6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h l(q6c q6cVar, q6c q6cVar2, Function0 function0) {
        return new h((rs4) q6cVar.getValue(), (Function1) q6cVar2.getValue(), ((Number) function0.invoke()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final az8 m(q6c q6cVar, PagerState pagerState) {
        h hVar = (h) q6cVar.getValue();
        return new az8(pagerState, hVar, new pe8(pagerState.N(), hVar));
    }
}
