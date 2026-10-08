package androidx.compose.p001foundation.pager;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.gestures.snapping.j;
import androidx.compose.p001foundation.pager.PagerKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.b;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.google.android.rs4;
import com.google.android.rw0;
import com.google.android.sh7;
import com.google.android.ta2;
import com.google.inputmethod.afb;
import com.google.inputmethod.cw8;
import com.google.inputmethod.ff3;
import com.google.inputmethod.kz8;
import com.google.inputmethod.nfb;
import com.google.inputmethod.nx8;
import com.google.inputmethod.omc;
import com.google.inputmethod.oy8;
import com.google.inputmethod.re8;
import com.google.inputmethod.rx8;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.tc;
import com.google.inputmethod.zv8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÃ\u0001\u0010 \u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001e0\u001cH\u0007¢\u0006\u0004\b \u0010!\u001aS\u0010*\u001a\u00020\b*\u00020\u00182\u0006\u0010\"\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\bH\u0000¢\u0006\u0004\b*\u0010+\u001a3\u0010/\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/rx8;", "contentPadding", "Landroidx/compose/foundation/pager/f;", "pageSize", "", "beyondViewportPageCount", "Lcom/google/android/ff3;", "pageSpacing", "Lcom/google/android/tc$c;", "verticalAlignment", "Lcom/google/android/omc;", "flingBehavior", "", "userScrollEnabled", "reverseLayout", "Lkotlin/Function1;", "", "key", "Lcom/google/android/re8;", "pageNestedScrollConnection", "Landroidx/compose/foundation/gestures/snapping/j;", "snapPosition", "Lcom/google/android/zv8;", "overscrollEffect", "Lkotlin/Function2;", "Lcom/google/android/kz8;", "", "pageContent", "g", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/b;Lcom/google/android/rx8;Landroidx/compose/foundation/pager/f;IFLcom/google/android/tc$c;Lcom/google/android/omc;ZZLkotlin/jvm/functions/Function1;Lcom/google/android/re8;Landroidx/compose/foundation/gestures/snapping/j;Lcom/google/android/zv8;Lcom/google/android/rs4;Landroidx/compose/runtime/d;III)V", "layoutSize", "spaceBetweenPages", "beforeContentPadding", "afterContentPadding", "currentPage", "", "currentPageOffsetFraction", "pageCount", "i", "(Landroidx/compose/foundation/gestures/snapping/j;IIIIIIFI)I", "isVertical", "Lcom/google/android/ta2;", "scope", "j", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/pager/PagerState;ZLcom/google/android/ta2;Z)Landroidx/compose/ui/b;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PagerKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0123  */
    /* JADX WARN: Code duplicated, block: B:102:0x012d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0137  */
    /* JADX WARN: Code duplicated, block: B:109:0x0140  */
    /* JADX WARN: Code duplicated, block: B:110:0x0145  */
    /* JADX WARN: Code duplicated, block: B:112:0x014b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0151  */
    /* JADX WARN: Code duplicated, block: B:115:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x0159  */
    /* JADX WARN: Code duplicated, block: B:120:0x015f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0165  */
    /* JADX WARN: Code duplicated, block: B:125:0x0170 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x0179  */
    /* JADX WARN: Code duplicated, block: B:132:0x0182  */
    /* JADX WARN: Code duplicated, block: B:134:0x0189  */
    /* JADX WARN: Code duplicated, block: B:136:0x018f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0197  */
    /* JADX WARN: Code duplicated, block: B:139:0x019a  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:156:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:162:0x01de  */
    /* JADX WARN: Code duplicated, block: B:166:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:169:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:171:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:184:0x0234 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x0236  */
    /* JADX WARN: Code duplicated, block: B:186:0x023b  */
    /* JADX WARN: Code duplicated, block: B:188:0x023f  */
    /* JADX WARN: Code duplicated, block: B:189:0x024a  */
    /* JADX WARN: Code duplicated, block: B:191:0x024e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0253  */
    /* JADX WARN: Code duplicated, block: B:194:0x0257  */
    /* JADX WARN: Code duplicated, block: B:195:0x025a  */
    /* JADX WARN: Code duplicated, block: B:197:0x025e  */
    /* JADX WARN: Code duplicated, block: B:198:0x0266  */
    /* JADX WARN: Code duplicated, block: B:200:0x026a  */
    /* JADX WARN: Code duplicated, block: B:203:0x0275  */
    /* JADX WARN: Code duplicated, block: B:204:0x0297  */
    /* JADX WARN: Code duplicated, block: B:207:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:209:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:210:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:212:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:213:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:216:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:217:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:219:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:220:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:223:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:224:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:227:0x0311  */
    /* JADX WARN: Code duplicated, block: B:230:0x039a  */
    /* JADX WARN: Code duplicated, block: B:232:0x03af  */
    /* JADX WARN: Code duplicated, block: B:235:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:93:0x010c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x011f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final void g(final PagerState pagerState, b bVar, rx8 rx8Var, f fVar, int i, float f, tc.c cVar, omc omcVar, boolean z, boolean z2, Function1<? super Integer, ? extends Object> function1, re8 re8Var, j jVar, zv8 zv8Var, final rs4<? super kz8, ? super Integer, ? super d, ? super Integer, Unit> rs4Var, d dVar, final int i2, final int i3, final int i4) {
        int i5;
        b bVar2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final int i12;
        int i13;
        int i14;
        float f2;
        int i15;
        int i16;
        tc.c cVarI;
        int i17;
        omc omcVarB;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z3;
        final rx8 rx8Var2;
        final f fVar2;
        final boolean z4;
        final ?? r10;
        final Function1<? super Integer, ? extends Object> function2;
        final re8 re8Var2;
        final j jVar2;
        final float f3;
        final b bVar3;
        final tc.c cVar2;
        final omc omcVar2;
        final zv8 zv8Var2;
        s6b s6bVarH;
        b bVar4;
        rx8 rx8VarE;
        f fVar3;
        int i31;
        float fI;
        PagerState pagerState2;
        int i32;
        int i33;
        boolean z5;
        ?? r0;
        Function1<? super Integer, ? extends Object> function3;
        re8 re8VarD;
        int i34;
        j jVar3;
        Function1<? super Integer, ? extends Object> function4;
        re8 re8Var3;
        int i35;
        rx8 rx8Var3;
        omc omcVar3;
        f fVar4;
        boolean z6;
        int i36;
        float f4;
        int i37;
        ?? r3;
        j jVar4;
        b bVar5;
        zv8 zv8VarD;
        d dVarF = dVar.F(1860873769);
        if ((i2 & 6) == 0) {
            i5 = (dVarF.x(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i38 = i4 & 2;
        if (i38 == 0) {
            if ((i2 & 48) == 0) {
                bVar2 = bVar;
                i5 |= dVarF.x(bVar2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i2 & 384) == 0) {
                    if (dVarF.x(rx8Var)) {
                        i7 = 256;
                    } else {
                        i7 = 128;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                i9 = 1024;
                if (i8 != 0) {
                    if ((i2 & 3072) == 0) {
                        if (dVarF.x(fVar)) {
                            i10 = 2048;
                        } else {
                            i10 = 1024;
                        }
                        i5 |= i10;
                    }
                    i11 = i4 & 16;
                    if (i11 != 0) {
                        if ((i2 & 24576) == 0) {
                            i12 = i;
                            if (dVarF.C(i12)) {
                                i13 = 16384;
                            } else {
                                i13 = 8192;
                            }
                            i5 |= i13;
                        }
                        i14 = i4 & 32;
                        if (i14 != 0) {
                            i5 |= 196608;
                            f2 = f;
                        } else {
                            f2 = f;
                            if ((i2 & 196608) == 0) {
                                if (dVarF.B(f2)) {
                                    i15 = 131072;
                                } else {
                                    i15 = 65536;
                                }
                                i5 |= i15;
                            }
                        }
                        i16 = i4 & 64;
                        if (i16 != 0) {
                            i5 |= 1572864;
                            cVarI = cVar;
                        } else {
                            cVarI = cVar;
                            if ((i2 & 1572864) == 0) {
                                if (dVarF.x(cVarI)) {
                                    i17 = 1048576;
                                } else {
                                    i17 = 524288;
                                }
                                i5 |= i17;
                            }
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & 128) == 0) {
                                omcVarB = omcVar;
                                int i39 = dVarF.x(omcVarB) ? 8388608 : 4194304;
                                i5 |= i39;
                            } else {
                                omcVarB = omcVar;
                            }
                            i5 |= i39;
                        } else {
                            omcVarB = omcVar;
                        }
                        i18 = i4 & 256;
                        if (i18 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            if (dVarF.A(z)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i5 |= i19;
                        }
                        i20 = i4 & 512;
                        if (i20 != 0) {
                            i21 = i5 | 805306368;
                            i20 = i20;
                        } else {
                            if ((i2 & 805306368) != 0) {
                                if (dVarF.A(z2)) {
                                    i22 = 536870912;
                                } else {
                                    i22 = 268435456;
                                }
                                i5 |= i22;
                            }
                            i21 = i5;
                        }
                        i23 = i4 & 1024;
                        if (i23 != 0) {
                            i24 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            if (dVarF.T(function1)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i3 | i25;
                        } else {
                            i24 = i3;
                        }
                        if ((i3 & 48) != 0) {
                            i24 |= ((i4 & 2048) == 0 || !dVarF.T(re8Var)) ? 16 : 32;
                        }
                        i26 = i24;
                        i27 = i4 & 4096;
                        if (i27 != 0) {
                            i28 = i26;
                            if ((i3 & 384) == 0) {
                                if (dVarF.x(jVar)) {
                                    i29 = 256;
                                } else {
                                    i29 = 128;
                                }
                                i28 |= i29;
                            }
                            if ((i3 & 3072) != 0) {
                                if ((i4 & 8192) == 0 && dVarF.x(zv8Var)) {
                                    i9 = 2048;
                                }
                                i28 |= i9;
                            }
                            if ((i3 & 24576) != 0) {
                                i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                            }
                            i30 = i28;
                            if ((i21 & 306783379) == 306783378 || (i30 & 9363) != 9362) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (dVarF.g(z3, i21 & 1)) {
                                dVarF.U();
                                if ((i2 & 1) != 0 || dVarF.t()) {
                                    if (i38 != 0) {
                                        bVar4 = b.INSTANCE;
                                    } else {
                                        bVar4 = bVar2;
                                    }
                                    if (i6 != 0) {
                                        rx8VarE = nx8.e(ff3.i(0));
                                    } else {
                                        rx8VarE = rx8Var;
                                    }
                                    if (i8 != 0) {
                                        fVar3 = f.a.a;
                                    } else {
                                        fVar3 = fVar;
                                    }
                                    if (i11 != 0) {
                                        i31 = 0;
                                    } else {
                                        i31 = i12;
                                    }
                                    if (i14 != 0) {
                                        fI = ff3.i(0);
                                    } else {
                                        fI = f2;
                                    }
                                    if (i16 != 0) {
                                        cVarI = tc.INSTANCE.i();
                                    }
                                    if ((i4 & 128) != 0) {
                                        int i40 = (i21 & 14) | 196608;
                                        i33 = i30;
                                        pagerState2 = pagerState;
                                        i21 &= -29360129;
                                        i32 = 0;
                                        omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i40, 30);
                                    } else {
                                        pagerState2 = pagerState;
                                        i32 = 0;
                                        i33 = i30;
                                    }
                                    z5 = i18 == 0 ? z : true;
                                    if (i20 != 0) {
                                        r0 = i32;
                                    } else {
                                        r0 = z2;
                                    }
                                    if (i23 != 0) {
                                        function3 = null;
                                    } else {
                                        function3 = function1;
                                    }
                                    if ((i4 & 2048) != 0) {
                                        re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                        i34 = i33 & (-113);
                                    } else {
                                        re8VarD = re8Var;
                                        i34 = i33;
                                    }
                                    if (i27 != 0) {
                                        jVar3 = j.b.a;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i4 & 8192) != 0) {
                                        j jVar5 = jVar3;
                                        zv8VarD = cw8.d(dVarF, i32);
                                        i35 = i34 & (-7169);
                                        omcVar3 = omcVarB;
                                        jVar4 = jVar5;
                                        function4 = function3;
                                        re8Var3 = re8VarD;
                                        rx8Var3 = rx8VarE;
                                        fVar4 = fVar3;
                                        z6 = z5;
                                        i36 = i31;
                                        f4 = fI;
                                        i37 = i21;
                                        r3 = r0;
                                        bVar5 = bVar4;
                                    } else {
                                        function4 = function3;
                                        re8Var3 = re8VarD;
                                        i35 = i34;
                                        rx8Var3 = rx8VarE;
                                        omcVar3 = omcVarB;
                                        fVar4 = fVar3;
                                        z6 = z5;
                                        i36 = i31;
                                        f4 = fI;
                                        i37 = i21;
                                        r3 = r0;
                                        jVar4 = jVar3;
                                        bVar5 = bVar4;
                                        zv8VarD = zv8Var;
                                    }
                                } else {
                                    dVarF.q();
                                    if ((i4 & 128) != 0) {
                                        i21 &= -29360129;
                                    }
                                    if ((i4 & 2048) != 0) {
                                        i30 &= -113;
                                    }
                                    if ((i4 & 8192) != 0) {
                                        i30 &= -7169;
                                    }
                                    fVar4 = fVar;
                                    r3 = z2;
                                    function4 = function1;
                                    re8Var3 = re8Var;
                                    i35 = i30;
                                    f4 = f2;
                                    bVar5 = bVar2;
                                    i37 = i21;
                                    rx8Var3 = rx8Var;
                                    z6 = z;
                                    zv8VarD = zv8Var;
                                    i36 = i12;
                                    omcVar3 = omcVarB;
                                    jVar4 = jVar;
                                }
                                dVarF.M();
                                b bVar6 = bVar5;
                                if (e.k()) {
                                    e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                                }
                                int i41 = i35;
                                int i42 = i37 >> 6;
                                int i43 = i37 << 12;
                                int i44 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i42 & 458752) | (i42 & 3670016) | ((i41 << 12) & 29360128) | (i43 & 234881024) | (i43 & 1879048192);
                                int i45 = ((i37 >> 9) & 14) | 3072 | (i41 & 112);
                                int i46 = i41 << 6;
                                LazyLayoutPagerKt.f(bVar6, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i44, i45 | (i46 & 896) | (i42 & 57344) | ((i41 << 9) & 458752) | (i46 & 3670016), 0);
                                if (e.k()) {
                                    e.n();
                                }
                                int i47 = i36;
                                omcVar2 = omcVar3;
                                i12 = i47;
                                float f5 = f4;
                                z4 = z6;
                                f3 = f5;
                                tc.c cVar3 = cVarI;
                                zv8Var2 = zv8VarD;
                                cVar2 = cVar3;
                                Function1<? super Integer, ? extends Object> function5 = function4;
                                re8Var2 = re8Var3;
                                function2 = function5;
                                fVar2 = fVar4;
                                jVar2 = jVar4;
                                r10 = r3;
                                rx8Var2 = rx8Var3;
                                bVar3 = bVar6;
                            } else {
                                dVarF = dVarF;
                                dVarF.q();
                                rx8Var2 = rx8Var;
                                fVar2 = fVar;
                                z4 = z;
                                r10 = z2;
                                function2 = function1;
                                re8Var2 = re8Var;
                                jVar2 = jVar;
                                f3 = f2;
                                bVar3 = bVar2;
                                cVar2 = cVarI;
                                omcVar2 = omcVarB;
                                zv8Var2 = zv8Var;
                            }
                            s6bVarH = dVarF.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                                    public final Object invoke(Object obj, Object obj2) {
                                        return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i28 = i26 | 384;
                        if ((i3 & 3072) != 0) {
                            if ((i4 & 8192) == 0) {
                                i9 = 2048;
                            }
                            i28 |= i9;
                        }
                        if ((i3 & 24576) != 0) {
                            i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                        }
                        i30 = i28;
                        if ((i21 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (dVarF.g(z3, i21 & 1)) {
                            dVarF.U();
                            if ((i2 & 1) != 0) {
                                if (i38 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if (i6 != 0) {
                                    rx8VarE = nx8.e(ff3.i(0));
                                } else {
                                    rx8VarE = rx8Var;
                                }
                                if (i8 != 0) {
                                    fVar3 = f.a.a;
                                } else {
                                    fVar3 = fVar;
                                }
                                if (i11 != 0) {
                                    i31 = 0;
                                } else {
                                    i31 = i12;
                                }
                                if (i14 != 0) {
                                    fI = ff3.i(0);
                                } else {
                                    fI = f2;
                                }
                                if (i16 != 0) {
                                    cVarI = tc.INSTANCE.i();
                                }
                                if ((i4 & 128) != 0) {
                                    int i48 = (i21 & 14) | 196608;
                                    i33 = i30;
                                    pagerState2 = pagerState;
                                    i21 &= -29360129;
                                    i32 = 0;
                                    omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i48, 30);
                                } else {
                                    pagerState2 = pagerState;
                                    i32 = 0;
                                    i33 = i30;
                                }
                                if (i18 == 0) {
                                }
                                if (i20 != 0) {
                                    r0 = i32;
                                } else {
                                    r0 = z2;
                                }
                                if (i23 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function1;
                                }
                                if ((i4 & 2048) != 0) {
                                    re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                    i34 = i33 & (-113);
                                } else {
                                    re8VarD = re8Var;
                                    i34 = i33;
                                }
                                if (i27 != 0) {
                                    jVar3 = j.b.a;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i4 & 8192) != 0) {
                                    j jVar6 = jVar3;
                                    zv8VarD = cw8.d(dVarF, i32);
                                    i35 = i34 & (-7169);
                                    omcVar3 = omcVarB;
                                    jVar4 = jVar6;
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    rx8Var3 = rx8VarE;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    bVar5 = bVar4;
                                } else {
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    i35 = i34;
                                    rx8Var3 = rx8VarE;
                                    omcVar3 = omcVarB;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    jVar4 = jVar3;
                                    bVar5 = bVar4;
                                    zv8VarD = zv8Var;
                                }
                            } else {
                                if (i38 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if (i6 != 0) {
                                    rx8VarE = nx8.e(ff3.i(0));
                                } else {
                                    rx8VarE = rx8Var;
                                }
                                if (i8 != 0) {
                                    fVar3 = f.a.a;
                                } else {
                                    fVar3 = fVar;
                                }
                                if (i11 != 0) {
                                    i31 = 0;
                                } else {
                                    i31 = i12;
                                }
                                if (i14 != 0) {
                                    fI = ff3.i(0);
                                } else {
                                    fI = f2;
                                }
                                if (i16 != 0) {
                                    cVarI = tc.INSTANCE.i();
                                }
                                if ((i4 & 128) != 0) {
                                    int i49 = (i21 & 14) | 196608;
                                    i33 = i30;
                                    pagerState2 = pagerState;
                                    i21 &= -29360129;
                                    i32 = 0;
                                    omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i49, 30);
                                } else {
                                    pagerState2 = pagerState;
                                    i32 = 0;
                                    i33 = i30;
                                }
                                if (i18 == 0) {
                                }
                                if (i20 != 0) {
                                    r0 = i32;
                                } else {
                                    r0 = z2;
                                }
                                if (i23 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function1;
                                }
                                if ((i4 & 2048) != 0) {
                                    re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                    i34 = i33 & (-113);
                                } else {
                                    re8VarD = re8Var;
                                    i34 = i33;
                                }
                                if (i27 != 0) {
                                    jVar3 = j.b.a;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i4 & 8192) != 0) {
                                    j jVar7 = jVar3;
                                    zv8VarD = cw8.d(dVarF, i32);
                                    i35 = i34 & (-7169);
                                    omcVar3 = omcVarB;
                                    jVar4 = jVar7;
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    rx8Var3 = rx8VarE;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    bVar5 = bVar4;
                                } else {
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    i35 = i34;
                                    rx8Var3 = rx8VarE;
                                    omcVar3 = omcVarB;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    jVar4 = jVar3;
                                    bVar5 = bVar4;
                                    zv8VarD = zv8Var;
                                }
                            }
                            dVarF.M();
                            b bVar7 = bVar5;
                            if (e.k()) {
                                e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                            }
                            int i410 = i35;
                            int i411 = i37 >> 6;
                            int i412 = i37 << 12;
                            int i413 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i411 & 458752) | (i411 & 3670016) | ((i410 << 12) & 29360128) | (i412 & 234881024) | (i412 & 1879048192);
                            int i414 = ((i37 >> 9) & 14) | 3072 | (i410 & 112);
                            int i415 = i410 << 6;
                            LazyLayoutPagerKt.f(bVar7, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i413, i414 | (i415 & 896) | (i411 & 57344) | ((i410 << 9) & 458752) | (i415 & 3670016), 0);
                            if (e.k()) {
                                e.n();
                            }
                            int i416 = i36;
                            omcVar2 = omcVar3;
                            i12 = i416;
                            float f6 = f4;
                            z4 = z6;
                            f3 = f6;
                            tc.c cVar4 = cVarI;
                            zv8Var2 = zv8VarD;
                            cVar2 = cVar4;
                            Function1<? super Integer, ? extends Object> function6 = function4;
                            re8Var2 = re8Var3;
                            function2 = function6;
                            fVar2 = fVar4;
                            jVar2 = jVar4;
                            r10 = r3;
                            rx8Var2 = rx8Var3;
                            bVar3 = bVar7;
                        } else {
                            dVarF = dVarF;
                            dVarF.q();
                            rx8Var2 = rx8Var;
                            fVar2 = fVar;
                            z4 = z;
                            r10 = z2;
                            function2 = function1;
                            re8Var2 = re8Var;
                            jVar2 = jVar;
                            f3 = f2;
                            bVar3 = bVar2;
                            cVar2 = cVarI;
                            omcVar2 = omcVarB;
                            zv8Var2 = zv8Var;
                        }
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                                public final Object invoke(Object obj, Object obj2) {
                                    return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i5 |= 24576;
                    i12 = i;
                    i14 = i4 & 32;
                    if (i14 != 0) {
                        i5 |= 196608;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i2 & 196608) == 0) {
                            if (dVarF.B(f2)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                            i5 |= i15;
                        }
                    }
                    i16 = i4 & 64;
                    if (i16 != 0) {
                        i5 |= 1572864;
                        cVarI = cVar;
                    } else {
                        cVarI = cVar;
                        if ((i2 & 1572864) == 0) {
                            if (dVarF.x(cVarI)) {
                                i17 = 1048576;
                            } else {
                                i17 = 524288;
                            }
                            i5 |= i17;
                        }
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i4 & 128) == 0) {
                            omcVarB = omcVar;
                            if (dVarF.x(omcVarB)) {
                            }
                            i5 |= i39;
                        } else {
                            omcVarB = omcVar;
                        }
                        i5 |= i39;
                    } else {
                        omcVarB = omcVar;
                    }
                    i18 = i4 & 256;
                    if (i18 != 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.A(z)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i5 |= i19;
                    }
                    i20 = i4 & 512;
                    if (i20 != 0) {
                        i21 = i5 | 805306368;
                        i20 = i20;
                    } else {
                        if ((i2 & 805306368) != 0) {
                            if (dVarF.A(z2)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i5 |= i22;
                        }
                        i21 = i5;
                    }
                    i23 = i4 & 1024;
                    if (i23 != 0) {
                        i24 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (dVarF.T(function1)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i3 | i25;
                    } else {
                        i24 = i3;
                    }
                    if ((i3 & 48) != 0) {
                        i24 |= ((i4 & 2048) == 0 || !dVarF.T(re8Var)) ? 16 : 32;
                    }
                    i26 = i24;
                    i27 = i4 & 4096;
                    if (i27 != 0) {
                        i28 = i26;
                        if ((i3 & 384) == 0) {
                            if (dVarF.x(jVar)) {
                                i29 = 256;
                            } else {
                                i29 = 128;
                            }
                            i28 |= i29;
                        }
                        if ((i3 & 3072) != 0) {
                            if ((i4 & 8192) == 0) {
                                i9 = 2048;
                            }
                            i28 |= i9;
                        }
                        if ((i3 & 24576) != 0) {
                            i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                        }
                        i30 = i28;
                        if ((i21 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (dVarF.g(z3, i21 & 1)) {
                            dVarF.U();
                            if ((i2 & 1) != 0) {
                                if (i38 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if (i6 != 0) {
                                    rx8VarE = nx8.e(ff3.i(0));
                                } else {
                                    rx8VarE = rx8Var;
                                }
                                if (i8 != 0) {
                                    fVar3 = f.a.a;
                                } else {
                                    fVar3 = fVar;
                                }
                                if (i11 != 0) {
                                    i31 = 0;
                                } else {
                                    i31 = i12;
                                }
                                if (i14 != 0) {
                                    fI = ff3.i(0);
                                } else {
                                    fI = f2;
                                }
                                if (i16 != 0) {
                                    cVarI = tc.INSTANCE.i();
                                }
                                if ((i4 & 128) != 0) {
                                    int i417 = (i21 & 14) | 196608;
                                    i33 = i30;
                                    pagerState2 = pagerState;
                                    i21 &= -29360129;
                                    i32 = 0;
                                    omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i417, 30);
                                } else {
                                    pagerState2 = pagerState;
                                    i32 = 0;
                                    i33 = i30;
                                }
                                if (i18 == 0) {
                                }
                                if (i20 != 0) {
                                    r0 = i32;
                                } else {
                                    r0 = z2;
                                }
                                if (i23 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function1;
                                }
                                if ((i4 & 2048) != 0) {
                                    re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                    i34 = i33 & (-113);
                                } else {
                                    re8VarD = re8Var;
                                    i34 = i33;
                                }
                                if (i27 != 0) {
                                    jVar3 = j.b.a;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i4 & 8192) != 0) {
                                    j jVar8 = jVar3;
                                    zv8VarD = cw8.d(dVarF, i32);
                                    i35 = i34 & (-7169);
                                    omcVar3 = omcVarB;
                                    jVar4 = jVar8;
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    rx8Var3 = rx8VarE;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    bVar5 = bVar4;
                                } else {
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    i35 = i34;
                                    rx8Var3 = rx8VarE;
                                    omcVar3 = omcVarB;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    jVar4 = jVar3;
                                    bVar5 = bVar4;
                                    zv8VarD = zv8Var;
                                }
                            } else {
                                if (i38 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if (i6 != 0) {
                                    rx8VarE = nx8.e(ff3.i(0));
                                } else {
                                    rx8VarE = rx8Var;
                                }
                                if (i8 != 0) {
                                    fVar3 = f.a.a;
                                } else {
                                    fVar3 = fVar;
                                }
                                if (i11 != 0) {
                                    i31 = 0;
                                } else {
                                    i31 = i12;
                                }
                                if (i14 != 0) {
                                    fI = ff3.i(0);
                                } else {
                                    fI = f2;
                                }
                                if (i16 != 0) {
                                    cVarI = tc.INSTANCE.i();
                                }
                                if ((i4 & 128) != 0) {
                                    int i418 = (i21 & 14) | 196608;
                                    i33 = i30;
                                    pagerState2 = pagerState;
                                    i21 &= -29360129;
                                    i32 = 0;
                                    omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i418, 30);
                                } else {
                                    pagerState2 = pagerState;
                                    i32 = 0;
                                    i33 = i30;
                                }
                                if (i18 == 0) {
                                }
                                if (i20 != 0) {
                                    r0 = i32;
                                } else {
                                    r0 = z2;
                                }
                                if (i23 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function1;
                                }
                                if ((i4 & 2048) != 0) {
                                    re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                    i34 = i33 & (-113);
                                } else {
                                    re8VarD = re8Var;
                                    i34 = i33;
                                }
                                if (i27 != 0) {
                                    jVar3 = j.b.a;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i4 & 8192) != 0) {
                                    j jVar9 = jVar3;
                                    zv8VarD = cw8.d(dVarF, i32);
                                    i35 = i34 & (-7169);
                                    omcVar3 = omcVarB;
                                    jVar4 = jVar9;
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    rx8Var3 = rx8VarE;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    bVar5 = bVar4;
                                } else {
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    i35 = i34;
                                    rx8Var3 = rx8VarE;
                                    omcVar3 = omcVarB;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    jVar4 = jVar3;
                                    bVar5 = bVar4;
                                    zv8VarD = zv8Var;
                                }
                            }
                            dVarF.M();
                            b bVar8 = bVar5;
                            if (e.k()) {
                                e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                            }
                            int i419 = i35;
                            int i4110 = i37 >> 6;
                            int i4111 = i37 << 12;
                            int i4112 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i4110 & 458752) | (i4110 & 3670016) | ((i419 << 12) & 29360128) | (i4111 & 234881024) | (i4111 & 1879048192);
                            int i4113 = ((i37 >> 9) & 14) | 3072 | (i419 & 112);
                            int i4114 = i419 << 6;
                            LazyLayoutPagerKt.f(bVar8, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i4112, i4113 | (i4114 & 896) | (i4110 & 57344) | ((i419 << 9) & 458752) | (i4114 & 3670016), 0);
                            if (e.k()) {
                                e.n();
                            }
                            int i4115 = i36;
                            omcVar2 = omcVar3;
                            i12 = i4115;
                            float f7 = f4;
                            z4 = z6;
                            f3 = f7;
                            tc.c cVar5 = cVarI;
                            zv8Var2 = zv8VarD;
                            cVar2 = cVar5;
                            Function1<? super Integer, ? extends Object> function7 = function4;
                            re8Var2 = re8Var3;
                            function2 = function7;
                            fVar2 = fVar4;
                            jVar2 = jVar4;
                            r10 = r3;
                            rx8Var2 = rx8Var3;
                            bVar3 = bVar8;
                        } else {
                            dVarF = dVarF;
                            dVarF.q();
                            rx8Var2 = rx8Var;
                            fVar2 = fVar;
                            z4 = z;
                            r10 = z2;
                            function2 = function1;
                            re8Var2 = re8Var;
                            jVar2 = jVar;
                            f3 = f2;
                            bVar3 = bVar2;
                            cVar2 = cVarI;
                            omcVar2 = omcVarB;
                            zv8Var2 = zv8Var;
                        }
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                                public final Object invoke(Object obj, Object obj2) {
                                    return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i28 = i26 | 384;
                    if ((i3 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i9 = 2048;
                        }
                        i28 |= i9;
                    }
                    if ((i3 & 24576) != 0) {
                        i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                    }
                    i30 = i28;
                    if ((i21 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (dVarF.g(z3, i21 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i4116 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4116, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar10 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar10;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        } else {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i4117 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4117, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar11 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar11;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        }
                        dVarF.M();
                        b bVar9 = bVar5;
                        if (e.k()) {
                            e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                        }
                        int i4118 = i35;
                        int i4119 = i37 >> 6;
                        int i41110 = i37 << 12;
                        int i41111 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i4119 & 458752) | (i4119 & 3670016) | ((i4118 << 12) & 29360128) | (i41110 & 234881024) | (i41110 & 1879048192);
                        int i41112 = ((i37 >> 9) & 14) | 3072 | (i4118 & 112);
                        int i41113 = i4118 << 6;
                        LazyLayoutPagerKt.f(bVar9, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i41111, i41112 | (i41113 & 896) | (i4119 & 57344) | ((i4118 << 9) & 458752) | (i41113 & 3670016), 0);
                        if (e.k()) {
                            e.n();
                        }
                        int i41114 = i36;
                        omcVar2 = omcVar3;
                        i12 = i41114;
                        float f8 = f4;
                        z4 = z6;
                        f3 = f8;
                        tc.c cVar6 = cVarI;
                        zv8Var2 = zv8VarD;
                        cVar2 = cVar6;
                        Function1<? super Integer, ? extends Object> function8 = function4;
                        re8Var2 = re8Var3;
                        function2 = function8;
                        fVar2 = fVar4;
                        jVar2 = jVar4;
                        r10 = r3;
                        rx8Var2 = rx8Var3;
                        bVar3 = bVar9;
                    } else {
                        dVarF = dVarF;
                        dVarF.q();
                        rx8Var2 = rx8Var;
                        fVar2 = fVar;
                        z4 = z;
                        r10 = z2;
                        function2 = function1;
                        re8Var2 = re8Var;
                        jVar2 = jVar;
                        f3 = f2;
                        bVar3 = bVar2;
                        cVar2 = cVarI;
                        omcVar2 = omcVarB;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                            public final Object invoke(Object obj, Object obj2) {
                                return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 3072;
                i11 = i4 & 16;
                if (i11 != 0) {
                    if ((i2 & 24576) == 0) {
                        i12 = i;
                        if (dVarF.C(i12)) {
                            i13 = 16384;
                        } else {
                            i13 = 8192;
                        }
                        i5 |= i13;
                    }
                    i14 = i4 & 32;
                    if (i14 != 0) {
                        i5 |= 196608;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i2 & 196608) == 0) {
                            if (dVarF.B(f2)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                            i5 |= i15;
                        }
                    }
                    i16 = i4 & 64;
                    if (i16 != 0) {
                        i5 |= 1572864;
                        cVarI = cVar;
                    } else {
                        cVarI = cVar;
                        if ((i2 & 1572864) == 0) {
                            if (dVarF.x(cVarI)) {
                                i17 = 1048576;
                            } else {
                                i17 = 524288;
                            }
                            i5 |= i17;
                        }
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i4 & 128) == 0) {
                            omcVarB = omcVar;
                            if (dVarF.x(omcVarB)) {
                            }
                            i5 |= i39;
                        } else {
                            omcVarB = omcVar;
                        }
                        i5 |= i39;
                    } else {
                        omcVarB = omcVar;
                    }
                    i18 = i4 & 256;
                    if (i18 != 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.A(z)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i5 |= i19;
                    }
                    i20 = i4 & 512;
                    if (i20 != 0) {
                        i21 = i5 | 805306368;
                        i20 = i20;
                    } else {
                        if ((i2 & 805306368) != 0) {
                            if (dVarF.A(z2)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i5 |= i22;
                        }
                        i21 = i5;
                    }
                    i23 = i4 & 1024;
                    if (i23 != 0) {
                        i24 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (dVarF.T(function1)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i3 | i25;
                    } else {
                        i24 = i3;
                    }
                    if ((i3 & 48) != 0) {
                        i24 |= ((i4 & 2048) == 0 || !dVarF.T(re8Var)) ? 16 : 32;
                    }
                    i26 = i24;
                    i27 = i4 & 4096;
                    if (i27 != 0) {
                        i28 = i26;
                        if ((i3 & 384) == 0) {
                            if (dVarF.x(jVar)) {
                                i29 = 256;
                            } else {
                                i29 = 128;
                            }
                            i28 |= i29;
                        }
                        if ((i3 & 3072) != 0) {
                            if ((i4 & 8192) == 0) {
                                i9 = 2048;
                            }
                            i28 |= i9;
                        }
                        if ((i3 & 24576) != 0) {
                            i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                        }
                        i30 = i28;
                        if ((i21 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (dVarF.g(z3, i21 & 1)) {
                            dVarF.U();
                            if ((i2 & 1) != 0) {
                                if (i38 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if (i6 != 0) {
                                    rx8VarE = nx8.e(ff3.i(0));
                                } else {
                                    rx8VarE = rx8Var;
                                }
                                if (i8 != 0) {
                                    fVar3 = f.a.a;
                                } else {
                                    fVar3 = fVar;
                                }
                                if (i11 != 0) {
                                    i31 = 0;
                                } else {
                                    i31 = i12;
                                }
                                if (i14 != 0) {
                                    fI = ff3.i(0);
                                } else {
                                    fI = f2;
                                }
                                if (i16 != 0) {
                                    cVarI = tc.INSTANCE.i();
                                }
                                if ((i4 & 128) != 0) {
                                    int i41115 = (i21 & 14) | 196608;
                                    i33 = i30;
                                    pagerState2 = pagerState;
                                    i21 &= -29360129;
                                    i32 = 0;
                                    omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41115, 30);
                                } else {
                                    pagerState2 = pagerState;
                                    i32 = 0;
                                    i33 = i30;
                                }
                                if (i18 == 0) {
                                }
                                if (i20 != 0) {
                                    r0 = i32;
                                } else {
                                    r0 = z2;
                                }
                                if (i23 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function1;
                                }
                                if ((i4 & 2048) != 0) {
                                    re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                    i34 = i33 & (-113);
                                } else {
                                    re8VarD = re8Var;
                                    i34 = i33;
                                }
                                if (i27 != 0) {
                                    jVar3 = j.b.a;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i4 & 8192) != 0) {
                                    j jVar12 = jVar3;
                                    zv8VarD = cw8.d(dVarF, i32);
                                    i35 = i34 & (-7169);
                                    omcVar3 = omcVarB;
                                    jVar4 = jVar12;
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    rx8Var3 = rx8VarE;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    bVar5 = bVar4;
                                } else {
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    i35 = i34;
                                    rx8Var3 = rx8VarE;
                                    omcVar3 = omcVarB;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    jVar4 = jVar3;
                                    bVar5 = bVar4;
                                    zv8VarD = zv8Var;
                                }
                            } else {
                                if (i38 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if (i6 != 0) {
                                    rx8VarE = nx8.e(ff3.i(0));
                                } else {
                                    rx8VarE = rx8Var;
                                }
                                if (i8 != 0) {
                                    fVar3 = f.a.a;
                                } else {
                                    fVar3 = fVar;
                                }
                                if (i11 != 0) {
                                    i31 = 0;
                                } else {
                                    i31 = i12;
                                }
                                if (i14 != 0) {
                                    fI = ff3.i(0);
                                } else {
                                    fI = f2;
                                }
                                if (i16 != 0) {
                                    cVarI = tc.INSTANCE.i();
                                }
                                if ((i4 & 128) != 0) {
                                    int i41116 = (i21 & 14) | 196608;
                                    i33 = i30;
                                    pagerState2 = pagerState;
                                    i21 &= -29360129;
                                    i32 = 0;
                                    omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41116, 30);
                                } else {
                                    pagerState2 = pagerState;
                                    i32 = 0;
                                    i33 = i30;
                                }
                                if (i18 == 0) {
                                }
                                if (i20 != 0) {
                                    r0 = i32;
                                } else {
                                    r0 = z2;
                                }
                                if (i23 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function1;
                                }
                                if ((i4 & 2048) != 0) {
                                    re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                    i34 = i33 & (-113);
                                } else {
                                    re8VarD = re8Var;
                                    i34 = i33;
                                }
                                if (i27 != 0) {
                                    jVar3 = j.b.a;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i4 & 8192) != 0) {
                                    j jVar13 = jVar3;
                                    zv8VarD = cw8.d(dVarF, i32);
                                    i35 = i34 & (-7169);
                                    omcVar3 = omcVarB;
                                    jVar4 = jVar13;
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    rx8Var3 = rx8VarE;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    bVar5 = bVar4;
                                } else {
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    i35 = i34;
                                    rx8Var3 = rx8VarE;
                                    omcVar3 = omcVarB;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    jVar4 = jVar3;
                                    bVar5 = bVar4;
                                    zv8VarD = zv8Var;
                                }
                            }
                            dVarF.M();
                            b bVar10 = bVar5;
                            if (e.k()) {
                                e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                            }
                            int i41117 = i35;
                            int i41118 = i37 >> 6;
                            int i41119 = i37 << 12;
                            int i411110 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i41118 & 458752) | (i41118 & 3670016) | ((i41117 << 12) & 29360128) | (i41119 & 234881024) | (i41119 & 1879048192);
                            int i411111 = ((i37 >> 9) & 14) | 3072 | (i41117 & 112);
                            int i411112 = i41117 << 6;
                            LazyLayoutPagerKt.f(bVar10, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i411110, i411111 | (i411112 & 896) | (i41118 & 57344) | ((i41117 << 9) & 458752) | (i411112 & 3670016), 0);
                            if (e.k()) {
                                e.n();
                            }
                            int i411113 = i36;
                            omcVar2 = omcVar3;
                            i12 = i411113;
                            float f9 = f4;
                            z4 = z6;
                            f3 = f9;
                            tc.c cVar7 = cVarI;
                            zv8Var2 = zv8VarD;
                            cVar2 = cVar7;
                            Function1<? super Integer, ? extends Object> function9 = function4;
                            re8Var2 = re8Var3;
                            function2 = function9;
                            fVar2 = fVar4;
                            jVar2 = jVar4;
                            r10 = r3;
                            rx8Var2 = rx8Var3;
                            bVar3 = bVar10;
                        } else {
                            dVarF = dVarF;
                            dVarF.q();
                            rx8Var2 = rx8Var;
                            fVar2 = fVar;
                            z4 = z;
                            r10 = z2;
                            function2 = function1;
                            re8Var2 = re8Var;
                            jVar2 = jVar;
                            f3 = f2;
                            bVar3 = bVar2;
                            cVar2 = cVarI;
                            omcVar2 = omcVarB;
                            zv8Var2 = zv8Var;
                        }
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                                public final Object invoke(Object obj, Object obj2) {
                                    return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i28 = i26 | 384;
                    if ((i3 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i9 = 2048;
                        }
                        i28 |= i9;
                    }
                    if ((i3 & 24576) != 0) {
                        i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                    }
                    i30 = i28;
                    if ((i21 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (dVarF.g(z3, i21 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i411114 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i411114, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar14 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar14;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        } else {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i411115 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i411115, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar15 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar15;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        }
                        dVarF.M();
                        b bVar11 = bVar5;
                        if (e.k()) {
                            e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                        }
                        int i411116 = i35;
                        int i411117 = i37 >> 6;
                        int i411118 = i37 << 12;
                        int i411119 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i411117 & 458752) | (i411117 & 3670016) | ((i411116 << 12) & 29360128) | (i411118 & 234881024) | (i411118 & 1879048192);
                        int i4111110 = ((i37 >> 9) & 14) | 3072 | (i411116 & 112);
                        int i4111111 = i411116 << 6;
                        LazyLayoutPagerKt.f(bVar11, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i411119, i4111110 | (i4111111 & 896) | (i411117 & 57344) | ((i411116 << 9) & 458752) | (i4111111 & 3670016), 0);
                        if (e.k()) {
                            e.n();
                        }
                        int i4111112 = i36;
                        omcVar2 = omcVar3;
                        i12 = i4111112;
                        float f10 = f4;
                        z4 = z6;
                        f3 = f10;
                        tc.c cVar8 = cVarI;
                        zv8Var2 = zv8VarD;
                        cVar2 = cVar8;
                        Function1<? super Integer, ? extends Object> function10 = function4;
                        re8Var2 = re8Var3;
                        function2 = function10;
                        fVar2 = fVar4;
                        jVar2 = jVar4;
                        r10 = r3;
                        rx8Var2 = rx8Var3;
                        bVar3 = bVar11;
                    } else {
                        dVarF = dVarF;
                        dVarF.q();
                        rx8Var2 = rx8Var;
                        fVar2 = fVar;
                        z4 = z;
                        r10 = z2;
                        function2 = function1;
                        re8Var2 = re8Var;
                        jVar2 = jVar;
                        f3 = f2;
                        bVar3 = bVar2;
                        cVar2 = cVarI;
                        omcVar2 = omcVarB;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                            public final Object invoke(Object obj, Object obj2) {
                                return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 24576;
                i12 = i;
                i14 = i4 & 32;
                if (i14 != 0) {
                    i5 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i2 & 196608) == 0) {
                        if (dVarF.B(f2)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 64;
                if (i16 != 0) {
                    i5 |= 1572864;
                    cVarI = cVar;
                } else {
                    cVarI = cVar;
                    if ((i2 & 1572864) == 0) {
                        if (dVarF.x(cVarI)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i5 |= i17;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    if ((i4 & 128) == 0) {
                        omcVarB = omcVar;
                        if (dVarF.x(omcVarB)) {
                        }
                        i5 |= i39;
                    } else {
                        omcVarB = omcVar;
                    }
                    i5 |= i39;
                } else {
                    omcVarB = omcVar;
                }
                i18 = i4 & 256;
                if (i18 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.A(z)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i5 |= i19;
                }
                i20 = i4 & 512;
                if (i20 != 0) {
                    i21 = i5 | 805306368;
                    i20 = i20;
                } else {
                    if ((i2 & 805306368) != 0) {
                        if (dVarF.A(z2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i5 |= i22;
                    }
                    i21 = i5;
                }
                i23 = i4 & 1024;
                if (i23 != 0) {
                    i24 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i3 | i25;
                } else {
                    i24 = i3;
                }
                if ((i3 & 48) != 0) {
                    i24 |= ((i4 & 2048) == 0 || !dVarF.T(re8Var)) ? 16 : 32;
                }
                i26 = i24;
                i27 = i4 & 4096;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i3 & 384) == 0) {
                        if (dVarF.x(jVar)) {
                            i29 = 256;
                        } else {
                            i29 = 128;
                        }
                        i28 |= i29;
                    }
                    if ((i3 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i9 = 2048;
                        }
                        i28 |= i9;
                    }
                    if ((i3 & 24576) != 0) {
                        i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                    }
                    i30 = i28;
                    if ((i21 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (dVarF.g(z3, i21 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i4111113 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111113, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar16 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar16;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        } else {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i4111114 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111114, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar17 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar17;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        }
                        dVarF.M();
                        b bVar12 = bVar5;
                        if (e.k()) {
                            e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                        }
                        int i4111115 = i35;
                        int i4111116 = i37 >> 6;
                        int i4111117 = i37 << 12;
                        int i4111118 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i4111116 & 458752) | (i4111116 & 3670016) | ((i4111115 << 12) & 29360128) | (i4111117 & 234881024) | (i4111117 & 1879048192);
                        int i4111119 = ((i37 >> 9) & 14) | 3072 | (i4111115 & 112);
                        int i41111110 = i4111115 << 6;
                        LazyLayoutPagerKt.f(bVar12, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i4111118, i4111119 | (i41111110 & 896) | (i4111116 & 57344) | ((i4111115 << 9) & 458752) | (i41111110 & 3670016), 0);
                        if (e.k()) {
                            e.n();
                        }
                        int i41111111 = i36;
                        omcVar2 = omcVar3;
                        i12 = i41111111;
                        float f11 = f4;
                        z4 = z6;
                        f3 = f11;
                        tc.c cVar9 = cVarI;
                        zv8Var2 = zv8VarD;
                        cVar2 = cVar9;
                        Function1<? super Integer, ? extends Object> function11 = function4;
                        re8Var2 = re8Var3;
                        function2 = function11;
                        fVar2 = fVar4;
                        jVar2 = jVar4;
                        r10 = r3;
                        rx8Var2 = rx8Var3;
                        bVar3 = bVar12;
                    } else {
                        dVarF = dVarF;
                        dVarF.q();
                        rx8Var2 = rx8Var;
                        fVar2 = fVar;
                        z4 = z;
                        r10 = z2;
                        function2 = function1;
                        re8Var2 = re8Var;
                        jVar2 = jVar;
                        f3 = f2;
                        bVar3 = bVar2;
                        cVar2 = cVarI;
                        omcVar2 = omcVarB;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                            public final Object invoke(Object obj, Object obj2) {
                                return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i28 = i26 | 384;
                if ((i3 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i9 = 2048;
                    }
                    i28 |= i9;
                }
                if ((i3 & 24576) != 0) {
                    i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                }
                i30 = i28;
                if ((i21 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (dVarF.g(z3, i21 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i41111112 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111112, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar18 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar18;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    } else {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i41111113 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111113, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar19 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar19;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    }
                    dVarF.M();
                    b bVar13 = bVar5;
                    if (e.k()) {
                        e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                    }
                    int i41111114 = i35;
                    int i41111115 = i37 >> 6;
                    int i41111116 = i37 << 12;
                    int i41111117 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i41111115 & 458752) | (i41111115 & 3670016) | ((i41111114 << 12) & 29360128) | (i41111116 & 234881024) | (i41111116 & 1879048192);
                    int i41111118 = ((i37 >> 9) & 14) | 3072 | (i41111114 & 112);
                    int i41111119 = i41111114 << 6;
                    LazyLayoutPagerKt.f(bVar13, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i41111117, i41111118 | (i41111119 & 896) | (i41111115 & 57344) | ((i41111114 << 9) & 458752) | (i41111119 & 3670016), 0);
                    if (e.k()) {
                        e.n();
                    }
                    int i411111110 = i36;
                    omcVar2 = omcVar3;
                    i12 = i411111110;
                    float f12 = f4;
                    z4 = z6;
                    f3 = f12;
                    tc.c cVar10 = cVarI;
                    zv8Var2 = zv8VarD;
                    cVar2 = cVar10;
                    Function1<? super Integer, ? extends Object> function12 = function4;
                    re8Var2 = re8Var3;
                    function2 = function12;
                    fVar2 = fVar4;
                    jVar2 = jVar4;
                    r10 = r3;
                    rx8Var2 = rx8Var3;
                    bVar3 = bVar13;
                } else {
                    dVarF = dVarF;
                    dVarF.q();
                    rx8Var2 = rx8Var;
                    fVar2 = fVar;
                    z4 = z;
                    r10 = z2;
                    function2 = function1;
                    re8Var2 = re8Var;
                    jVar2 = jVar;
                    f3 = f2;
                    bVar3 = bVar2;
                    cVar2 = cVarI;
                    omcVar2 = omcVarB;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                        public final Object invoke(Object obj, Object obj2) {
                            return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 384;
            i8 = i4 & 8;
            i9 = 1024;
            if (i8 != 0) {
                if ((i2 & 3072) == 0) {
                    if (dVarF.x(fVar)) {
                        i10 = 2048;
                    } else {
                        i10 = 1024;
                    }
                    i5 |= i10;
                }
                i11 = i4 & 16;
                if (i11 != 0) {
                    if ((i2 & 24576) == 0) {
                        i12 = i;
                        if (dVarF.C(i12)) {
                            i13 = 16384;
                        } else {
                            i13 = 8192;
                        }
                        i5 |= i13;
                    }
                    i14 = i4 & 32;
                    if (i14 != 0) {
                        i5 |= 196608;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i2 & 196608) == 0) {
                            if (dVarF.B(f2)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                            i5 |= i15;
                        }
                    }
                    i16 = i4 & 64;
                    if (i16 != 0) {
                        i5 |= 1572864;
                        cVarI = cVar;
                    } else {
                        cVarI = cVar;
                        if ((i2 & 1572864) == 0) {
                            if (dVarF.x(cVarI)) {
                                i17 = 1048576;
                            } else {
                                i17 = 524288;
                            }
                            i5 |= i17;
                        }
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i4 & 128) == 0) {
                            omcVarB = omcVar;
                            if (dVarF.x(omcVarB)) {
                            }
                            i5 |= i39;
                        } else {
                            omcVarB = omcVar;
                        }
                        i5 |= i39;
                    } else {
                        omcVarB = omcVar;
                    }
                    i18 = i4 & 256;
                    if (i18 != 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.A(z)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i5 |= i19;
                    }
                    i20 = i4 & 512;
                    if (i20 != 0) {
                        i21 = i5 | 805306368;
                        i20 = i20;
                    } else {
                        if ((i2 & 805306368) != 0) {
                            if (dVarF.A(z2)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i5 |= i22;
                        }
                        i21 = i5;
                    }
                    i23 = i4 & 1024;
                    if (i23 != 0) {
                        i24 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (dVarF.T(function1)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i3 | i25;
                    } else {
                        i24 = i3;
                    }
                    if ((i3 & 48) != 0) {
                        i24 |= ((i4 & 2048) == 0 || !dVarF.T(re8Var)) ? 16 : 32;
                    }
                    i26 = i24;
                    i27 = i4 & 4096;
                    if (i27 != 0) {
                        i28 = i26;
                        if ((i3 & 384) == 0) {
                            if (dVarF.x(jVar)) {
                                i29 = 256;
                            } else {
                                i29 = 128;
                            }
                            i28 |= i29;
                        }
                        if ((i3 & 3072) != 0) {
                            if ((i4 & 8192) == 0) {
                                i9 = 2048;
                            }
                            i28 |= i9;
                        }
                        if ((i3 & 24576) != 0) {
                            i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                        }
                        i30 = i28;
                        if ((i21 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (dVarF.g(z3, i21 & 1)) {
                            dVarF.U();
                            if ((i2 & 1) != 0) {
                                if (i38 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if (i6 != 0) {
                                    rx8VarE = nx8.e(ff3.i(0));
                                } else {
                                    rx8VarE = rx8Var;
                                }
                                if (i8 != 0) {
                                    fVar3 = f.a.a;
                                } else {
                                    fVar3 = fVar;
                                }
                                if (i11 != 0) {
                                    i31 = 0;
                                } else {
                                    i31 = i12;
                                }
                                if (i14 != 0) {
                                    fI = ff3.i(0);
                                } else {
                                    fI = f2;
                                }
                                if (i16 != 0) {
                                    cVarI = tc.INSTANCE.i();
                                }
                                if ((i4 & 128) != 0) {
                                    int i411111111 = (i21 & 14) | 196608;
                                    i33 = i30;
                                    pagerState2 = pagerState;
                                    i21 &= -29360129;
                                    i32 = 0;
                                    omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i411111111, 30);
                                } else {
                                    pagerState2 = pagerState;
                                    i32 = 0;
                                    i33 = i30;
                                }
                                if (i18 == 0) {
                                }
                                if (i20 != 0) {
                                    r0 = i32;
                                } else {
                                    r0 = z2;
                                }
                                if (i23 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function1;
                                }
                                if ((i4 & 2048) != 0) {
                                    re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                    i34 = i33 & (-113);
                                } else {
                                    re8VarD = re8Var;
                                    i34 = i33;
                                }
                                if (i27 != 0) {
                                    jVar3 = j.b.a;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i4 & 8192) != 0) {
                                    j jVar110 = jVar3;
                                    zv8VarD = cw8.d(dVarF, i32);
                                    i35 = i34 & (-7169);
                                    omcVar3 = omcVarB;
                                    jVar4 = jVar110;
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    rx8Var3 = rx8VarE;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    bVar5 = bVar4;
                                } else {
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    i35 = i34;
                                    rx8Var3 = rx8VarE;
                                    omcVar3 = omcVarB;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    jVar4 = jVar3;
                                    bVar5 = bVar4;
                                    zv8VarD = zv8Var;
                                }
                            } else {
                                if (i38 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if (i6 != 0) {
                                    rx8VarE = nx8.e(ff3.i(0));
                                } else {
                                    rx8VarE = rx8Var;
                                }
                                if (i8 != 0) {
                                    fVar3 = f.a.a;
                                } else {
                                    fVar3 = fVar;
                                }
                                if (i11 != 0) {
                                    i31 = 0;
                                } else {
                                    i31 = i12;
                                }
                                if (i14 != 0) {
                                    fI = ff3.i(0);
                                } else {
                                    fI = f2;
                                }
                                if (i16 != 0) {
                                    cVarI = tc.INSTANCE.i();
                                }
                                if ((i4 & 128) != 0) {
                                    int i411111112 = (i21 & 14) | 196608;
                                    i33 = i30;
                                    pagerState2 = pagerState;
                                    i21 &= -29360129;
                                    i32 = 0;
                                    omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i411111112, 30);
                                } else {
                                    pagerState2 = pagerState;
                                    i32 = 0;
                                    i33 = i30;
                                }
                                if (i18 == 0) {
                                }
                                if (i20 != 0) {
                                    r0 = i32;
                                } else {
                                    r0 = z2;
                                }
                                if (i23 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function1;
                                }
                                if ((i4 & 2048) != 0) {
                                    re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                    i34 = i33 & (-113);
                                } else {
                                    re8VarD = re8Var;
                                    i34 = i33;
                                }
                                if (i27 != 0) {
                                    jVar3 = j.b.a;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i4 & 8192) != 0) {
                                    j jVar111 = jVar3;
                                    zv8VarD = cw8.d(dVarF, i32);
                                    i35 = i34 & (-7169);
                                    omcVar3 = omcVarB;
                                    jVar4 = jVar111;
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    rx8Var3 = rx8VarE;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    bVar5 = bVar4;
                                } else {
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    i35 = i34;
                                    rx8Var3 = rx8VarE;
                                    omcVar3 = omcVarB;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    jVar4 = jVar3;
                                    bVar5 = bVar4;
                                    zv8VarD = zv8Var;
                                }
                            }
                            dVarF.M();
                            b bVar14 = bVar5;
                            if (e.k()) {
                                e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                            }
                            int i411111113 = i35;
                            int i411111114 = i37 >> 6;
                            int i411111115 = i37 << 12;
                            int i411111116 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i411111114 & 458752) | (i411111114 & 3670016) | ((i411111113 << 12) & 29360128) | (i411111115 & 234881024) | (i411111115 & 1879048192);
                            int i411111117 = ((i37 >> 9) & 14) | 3072 | (i411111113 & 112);
                            int i411111118 = i411111113 << 6;
                            LazyLayoutPagerKt.f(bVar14, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i411111116, i411111117 | (i411111118 & 896) | (i411111114 & 57344) | ((i411111113 << 9) & 458752) | (i411111118 & 3670016), 0);
                            if (e.k()) {
                                e.n();
                            }
                            int i411111119 = i36;
                            omcVar2 = omcVar3;
                            i12 = i411111119;
                            float f13 = f4;
                            z4 = z6;
                            f3 = f13;
                            tc.c cVar11 = cVarI;
                            zv8Var2 = zv8VarD;
                            cVar2 = cVar11;
                            Function1<? super Integer, ? extends Object> function13 = function4;
                            re8Var2 = re8Var3;
                            function2 = function13;
                            fVar2 = fVar4;
                            jVar2 = jVar4;
                            r10 = r3;
                            rx8Var2 = rx8Var3;
                            bVar3 = bVar14;
                        } else {
                            dVarF = dVarF;
                            dVarF.q();
                            rx8Var2 = rx8Var;
                            fVar2 = fVar;
                            z4 = z;
                            r10 = z2;
                            function2 = function1;
                            re8Var2 = re8Var;
                            jVar2 = jVar;
                            f3 = f2;
                            bVar3 = bVar2;
                            cVar2 = cVarI;
                            omcVar2 = omcVarB;
                            zv8Var2 = zv8Var;
                        }
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                                public final Object invoke(Object obj, Object obj2) {
                                    return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i28 = i26 | 384;
                    if ((i3 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i9 = 2048;
                        }
                        i28 |= i9;
                    }
                    if ((i3 & 24576) != 0) {
                        i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                    }
                    i30 = i28;
                    if ((i21 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (dVarF.g(z3, i21 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i4111111110 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111111110, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar112 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar112;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        } else {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i4111111111 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111111111, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar113 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar113;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        }
                        dVarF.M();
                        b bVar15 = bVar5;
                        if (e.k()) {
                            e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                        }
                        int i4111111112 = i35;
                        int i4111111113 = i37 >> 6;
                        int i4111111114 = i37 << 12;
                        int i4111111115 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i4111111113 & 458752) | (i4111111113 & 3670016) | ((i4111111112 << 12) & 29360128) | (i4111111114 & 234881024) | (i4111111114 & 1879048192);
                        int i4111111116 = ((i37 >> 9) & 14) | 3072 | (i4111111112 & 112);
                        int i4111111117 = i4111111112 << 6;
                        LazyLayoutPagerKt.f(bVar15, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i4111111115, i4111111116 | (i4111111117 & 896) | (i4111111113 & 57344) | ((i4111111112 << 9) & 458752) | (i4111111117 & 3670016), 0);
                        if (e.k()) {
                            e.n();
                        }
                        int i4111111118 = i36;
                        omcVar2 = omcVar3;
                        i12 = i4111111118;
                        float f14 = f4;
                        z4 = z6;
                        f3 = f14;
                        tc.c cVar12 = cVarI;
                        zv8Var2 = zv8VarD;
                        cVar2 = cVar12;
                        Function1<? super Integer, ? extends Object> function14 = function4;
                        re8Var2 = re8Var3;
                        function2 = function14;
                        fVar2 = fVar4;
                        jVar2 = jVar4;
                        r10 = r3;
                        rx8Var2 = rx8Var3;
                        bVar3 = bVar15;
                    } else {
                        dVarF = dVarF;
                        dVarF.q();
                        rx8Var2 = rx8Var;
                        fVar2 = fVar;
                        z4 = z;
                        r10 = z2;
                        function2 = function1;
                        re8Var2 = re8Var;
                        jVar2 = jVar;
                        f3 = f2;
                        bVar3 = bVar2;
                        cVar2 = cVarI;
                        omcVar2 = omcVarB;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                            public final Object invoke(Object obj, Object obj2) {
                                return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 24576;
                i12 = i;
                i14 = i4 & 32;
                if (i14 != 0) {
                    i5 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i2 & 196608) == 0) {
                        if (dVarF.B(f2)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 64;
                if (i16 != 0) {
                    i5 |= 1572864;
                    cVarI = cVar;
                } else {
                    cVarI = cVar;
                    if ((i2 & 1572864) == 0) {
                        if (dVarF.x(cVarI)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i5 |= i17;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    if ((i4 & 128) == 0) {
                        omcVarB = omcVar;
                        if (dVarF.x(omcVarB)) {
                        }
                        i5 |= i39;
                    } else {
                        omcVarB = omcVar;
                    }
                    i5 |= i39;
                } else {
                    omcVarB = omcVar;
                }
                i18 = i4 & 256;
                if (i18 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.A(z)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i5 |= i19;
                }
                i20 = i4 & 512;
                if (i20 != 0) {
                    i21 = i5 | 805306368;
                    i20 = i20;
                } else {
                    if ((i2 & 805306368) != 0) {
                        if (dVarF.A(z2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i5 |= i22;
                    }
                    i21 = i5;
                }
                i23 = i4 & 1024;
                if (i23 != 0) {
                    i24 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i3 | i25;
                } else {
                    i24 = i3;
                }
                if ((i3 & 48) != 0) {
                    i24 |= ((i4 & 2048) == 0 || !dVarF.T(re8Var)) ? 16 : 32;
                }
                i26 = i24;
                i27 = i4 & 4096;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i3 & 384) == 0) {
                        if (dVarF.x(jVar)) {
                            i29 = 256;
                        } else {
                            i29 = 128;
                        }
                        i28 |= i29;
                    }
                    if ((i3 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i9 = 2048;
                        }
                        i28 |= i9;
                    }
                    if ((i3 & 24576) != 0) {
                        i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                    }
                    i30 = i28;
                    if ((i21 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (dVarF.g(z3, i21 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i4111111119 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111111119, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar114 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar114;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        } else {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i41111111110 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111111110, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar115 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar115;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        }
                        dVarF.M();
                        b bVar16 = bVar5;
                        if (e.k()) {
                            e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                        }
                        int i41111111111 = i35;
                        int i41111111112 = i37 >> 6;
                        int i41111111113 = i37 << 12;
                        int i41111111114 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i41111111112 & 458752) | (i41111111112 & 3670016) | ((i41111111111 << 12) & 29360128) | (i41111111113 & 234881024) | (i41111111113 & 1879048192);
                        int i41111111115 = ((i37 >> 9) & 14) | 3072 | (i41111111111 & 112);
                        int i41111111116 = i41111111111 << 6;
                        LazyLayoutPagerKt.f(bVar16, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i41111111114, i41111111115 | (i41111111116 & 896) | (i41111111112 & 57344) | ((i41111111111 << 9) & 458752) | (i41111111116 & 3670016), 0);
                        if (e.k()) {
                            e.n();
                        }
                        int i41111111117 = i36;
                        omcVar2 = omcVar3;
                        i12 = i41111111117;
                        float f15 = f4;
                        z4 = z6;
                        f3 = f15;
                        tc.c cVar13 = cVarI;
                        zv8Var2 = zv8VarD;
                        cVar2 = cVar13;
                        Function1<? super Integer, ? extends Object> function15 = function4;
                        re8Var2 = re8Var3;
                        function2 = function15;
                        fVar2 = fVar4;
                        jVar2 = jVar4;
                        r10 = r3;
                        rx8Var2 = rx8Var3;
                        bVar3 = bVar16;
                    } else {
                        dVarF = dVarF;
                        dVarF.q();
                        rx8Var2 = rx8Var;
                        fVar2 = fVar;
                        z4 = z;
                        r10 = z2;
                        function2 = function1;
                        re8Var2 = re8Var;
                        jVar2 = jVar;
                        f3 = f2;
                        bVar3 = bVar2;
                        cVar2 = cVarI;
                        omcVar2 = omcVarB;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                            public final Object invoke(Object obj, Object obj2) {
                                return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i28 = i26 | 384;
                if ((i3 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i9 = 2048;
                    }
                    i28 |= i9;
                }
                if ((i3 & 24576) != 0) {
                    i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                }
                i30 = i28;
                if ((i21 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (dVarF.g(z3, i21 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i41111111118 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111111118, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar116 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar116;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    } else {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i41111111119 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111111119, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar117 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar117;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    }
                    dVarF.M();
                    b bVar17 = bVar5;
                    if (e.k()) {
                        e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                    }
                    int i411111111110 = i35;
                    int i411111111111 = i37 >> 6;
                    int i411111111112 = i37 << 12;
                    int i411111111113 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i411111111111 & 458752) | (i411111111111 & 3670016) | ((i411111111110 << 12) & 29360128) | (i411111111112 & 234881024) | (i411111111112 & 1879048192);
                    int i411111111114 = ((i37 >> 9) & 14) | 3072 | (i411111111110 & 112);
                    int i411111111115 = i411111111110 << 6;
                    LazyLayoutPagerKt.f(bVar17, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i411111111113, i411111111114 | (i411111111115 & 896) | (i411111111111 & 57344) | ((i411111111110 << 9) & 458752) | (i411111111115 & 3670016), 0);
                    if (e.k()) {
                        e.n();
                    }
                    int i411111111116 = i36;
                    omcVar2 = omcVar3;
                    i12 = i411111111116;
                    float f16 = f4;
                    z4 = z6;
                    f3 = f16;
                    tc.c cVar14 = cVarI;
                    zv8Var2 = zv8VarD;
                    cVar2 = cVar14;
                    Function1<? super Integer, ? extends Object> function16 = function4;
                    re8Var2 = re8Var3;
                    function2 = function16;
                    fVar2 = fVar4;
                    jVar2 = jVar4;
                    r10 = r3;
                    rx8Var2 = rx8Var3;
                    bVar3 = bVar17;
                } else {
                    dVarF = dVarF;
                    dVarF.q();
                    rx8Var2 = rx8Var;
                    fVar2 = fVar;
                    z4 = z;
                    r10 = z2;
                    function2 = function1;
                    re8Var2 = re8Var;
                    jVar2 = jVar;
                    f3 = f2;
                    bVar3 = bVar2;
                    cVar2 = cVarI;
                    omcVar2 = omcVarB;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                        public final Object invoke(Object obj, Object obj2) {
                            return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 3072;
            i11 = i4 & 16;
            if (i11 != 0) {
                if ((i2 & 24576) == 0) {
                    i12 = i;
                    if (dVarF.C(i12)) {
                        i13 = 16384;
                    } else {
                        i13 = 8192;
                    }
                    i5 |= i13;
                }
                i14 = i4 & 32;
                if (i14 != 0) {
                    i5 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i2 & 196608) == 0) {
                        if (dVarF.B(f2)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 64;
                if (i16 != 0) {
                    i5 |= 1572864;
                    cVarI = cVar;
                } else {
                    cVarI = cVar;
                    if ((i2 & 1572864) == 0) {
                        if (dVarF.x(cVarI)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i5 |= i17;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    if ((i4 & 128) == 0) {
                        omcVarB = omcVar;
                        if (dVarF.x(omcVarB)) {
                        }
                        i5 |= i39;
                    } else {
                        omcVarB = omcVar;
                    }
                    i5 |= i39;
                } else {
                    omcVarB = omcVar;
                }
                i18 = i4 & 256;
                if (i18 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.A(z)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i5 |= i19;
                }
                i20 = i4 & 512;
                if (i20 != 0) {
                    i21 = i5 | 805306368;
                    i20 = i20;
                } else {
                    if ((i2 & 805306368) != 0) {
                        if (dVarF.A(z2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i5 |= i22;
                    }
                    i21 = i5;
                }
                i23 = i4 & 1024;
                if (i23 != 0) {
                    i24 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i3 | i25;
                } else {
                    i24 = i3;
                }
                if ((i3 & 48) != 0) {
                    i24 |= ((i4 & 2048) == 0 || !dVarF.T(re8Var)) ? 16 : 32;
                }
                i26 = i24;
                i27 = i4 & 4096;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i3 & 384) == 0) {
                        if (dVarF.x(jVar)) {
                            i29 = 256;
                        } else {
                            i29 = 128;
                        }
                        i28 |= i29;
                    }
                    if ((i3 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i9 = 2048;
                        }
                        i28 |= i9;
                    }
                    if ((i3 & 24576) != 0) {
                        i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                    }
                    i30 = i28;
                    if ((i21 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (dVarF.g(z3, i21 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i411111111117 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i411111111117, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar118 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar118;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        } else {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i411111111118 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i411111111118, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar119 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar119;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        }
                        dVarF.M();
                        b bVar18 = bVar5;
                        if (e.k()) {
                            e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                        }
                        int i411111111119 = i35;
                        int i4111111111110 = i37 >> 6;
                        int i4111111111111 = i37 << 12;
                        int i4111111111112 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i4111111111110 & 458752) | (i4111111111110 & 3670016) | ((i411111111119 << 12) & 29360128) | (i4111111111111 & 234881024) | (i4111111111111 & 1879048192);
                        int i4111111111113 = ((i37 >> 9) & 14) | 3072 | (i411111111119 & 112);
                        int i4111111111114 = i411111111119 << 6;
                        LazyLayoutPagerKt.f(bVar18, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i4111111111112, i4111111111113 | (i4111111111114 & 896) | (i4111111111110 & 57344) | ((i411111111119 << 9) & 458752) | (i4111111111114 & 3670016), 0);
                        if (e.k()) {
                            e.n();
                        }
                        int i4111111111115 = i36;
                        omcVar2 = omcVar3;
                        i12 = i4111111111115;
                        float f17 = f4;
                        z4 = z6;
                        f3 = f17;
                        tc.c cVar15 = cVarI;
                        zv8Var2 = zv8VarD;
                        cVar2 = cVar15;
                        Function1<? super Integer, ? extends Object> function17 = function4;
                        re8Var2 = re8Var3;
                        function2 = function17;
                        fVar2 = fVar4;
                        jVar2 = jVar4;
                        r10 = r3;
                        rx8Var2 = rx8Var3;
                        bVar3 = bVar18;
                    } else {
                        dVarF = dVarF;
                        dVarF.q();
                        rx8Var2 = rx8Var;
                        fVar2 = fVar;
                        z4 = z;
                        r10 = z2;
                        function2 = function1;
                        re8Var2 = re8Var;
                        jVar2 = jVar;
                        f3 = f2;
                        bVar3 = bVar2;
                        cVar2 = cVarI;
                        omcVar2 = omcVarB;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                            public final Object invoke(Object obj, Object obj2) {
                                return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i28 = i26 | 384;
                if ((i3 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i9 = 2048;
                    }
                    i28 |= i9;
                }
                if ((i3 & 24576) != 0) {
                    i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                }
                i30 = i28;
                if ((i21 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (dVarF.g(z3, i21 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i4111111111116 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111111111116, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar1110 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar1110;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    } else {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i4111111111117 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111111111117, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar1111 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar1111;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    }
                    dVarF.M();
                    b bVar19 = bVar5;
                    if (e.k()) {
                        e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                    }
                    int i4111111111118 = i35;
                    int i4111111111119 = i37 >> 6;
                    int i41111111111110 = i37 << 12;
                    int i41111111111111 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i4111111111119 & 458752) | (i4111111111119 & 3670016) | ((i4111111111118 << 12) & 29360128) | (i41111111111110 & 234881024) | (i41111111111110 & 1879048192);
                    int i41111111111112 = ((i37 >> 9) & 14) | 3072 | (i4111111111118 & 112);
                    int i41111111111113 = i4111111111118 << 6;
                    LazyLayoutPagerKt.f(bVar19, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i41111111111111, i41111111111112 | (i41111111111113 & 896) | (i4111111111119 & 57344) | ((i4111111111118 << 9) & 458752) | (i41111111111113 & 3670016), 0);
                    if (e.k()) {
                        e.n();
                    }
                    int i41111111111114 = i36;
                    omcVar2 = omcVar3;
                    i12 = i41111111111114;
                    float f18 = f4;
                    z4 = z6;
                    f3 = f18;
                    tc.c cVar16 = cVarI;
                    zv8Var2 = zv8VarD;
                    cVar2 = cVar16;
                    Function1<? super Integer, ? extends Object> function18 = function4;
                    re8Var2 = re8Var3;
                    function2 = function18;
                    fVar2 = fVar4;
                    jVar2 = jVar4;
                    r10 = r3;
                    rx8Var2 = rx8Var3;
                    bVar3 = bVar19;
                } else {
                    dVarF = dVarF;
                    dVarF.q();
                    rx8Var2 = rx8Var;
                    fVar2 = fVar;
                    z4 = z;
                    r10 = z2;
                    function2 = function1;
                    re8Var2 = re8Var;
                    jVar2 = jVar;
                    f3 = f2;
                    bVar3 = bVar2;
                    cVar2 = cVarI;
                    omcVar2 = omcVarB;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                        public final Object invoke(Object obj, Object obj2) {
                            return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 24576;
            i12 = i;
            i14 = i4 & 32;
            if (i14 != 0) {
                i5 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i2 & 196608) == 0) {
                    if (dVarF.B(f2)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i5 |= i15;
                }
            }
            i16 = i4 & 64;
            if (i16 != 0) {
                i5 |= 1572864;
                cVarI = cVar;
            } else {
                cVarI = cVar;
                if ((i2 & 1572864) == 0) {
                    if (dVarF.x(cVarI)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i5 |= i17;
                }
            }
            if ((i2 & 12582912) == 0) {
                if ((i4 & 128) == 0) {
                    omcVarB = omcVar;
                    if (dVarF.x(omcVarB)) {
                    }
                    i5 |= i39;
                } else {
                    omcVarB = omcVar;
                }
                i5 |= i39;
            } else {
                omcVarB = omcVar;
            }
            i18 = i4 & 256;
            if (i18 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (dVarF.A(z)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i5 |= i19;
            }
            i20 = i4 & 512;
            if (i20 != 0) {
                i21 = i5 | 805306368;
                i20 = i20;
            } else {
                if ((i2 & 805306368) != 0) {
                    if (dVarF.A(z2)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i5 |= i22;
                }
                i21 = i5;
            }
            i23 = i4 & 1024;
            if (i23 != 0) {
                i24 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (dVarF.T(function1)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i3 | i25;
            } else {
                i24 = i3;
            }
            if ((i3 & 48) != 0) {
                i24 |= ((i4 & 2048) == 0 || !dVarF.T(re8Var)) ? 16 : 32;
            }
            i26 = i24;
            i27 = i4 & 4096;
            if (i27 != 0) {
                i28 = i26;
                if ((i3 & 384) == 0) {
                    if (dVarF.x(jVar)) {
                        i29 = 256;
                    } else {
                        i29 = 128;
                    }
                    i28 |= i29;
                }
                if ((i3 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i9 = 2048;
                    }
                    i28 |= i9;
                }
                if ((i3 & 24576) != 0) {
                    i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                }
                i30 = i28;
                if ((i21 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (dVarF.g(z3, i21 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i41111111111115 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111111111115, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar1112 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar1112;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    } else {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i41111111111116 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111111111116, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar1113 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar1113;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    }
                    dVarF.M();
                    b bVar110 = bVar5;
                    if (e.k()) {
                        e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                    }
                    int i41111111111117 = i35;
                    int i41111111111118 = i37 >> 6;
                    int i41111111111119 = i37 << 12;
                    int i411111111111110 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i41111111111118 & 458752) | (i41111111111118 & 3670016) | ((i41111111111117 << 12) & 29360128) | (i41111111111119 & 234881024) | (i41111111111119 & 1879048192);
                    int i411111111111111 = ((i37 >> 9) & 14) | 3072 | (i41111111111117 & 112);
                    int i411111111111112 = i41111111111117 << 6;
                    LazyLayoutPagerKt.f(bVar110, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i411111111111110, i411111111111111 | (i411111111111112 & 896) | (i41111111111118 & 57344) | ((i41111111111117 << 9) & 458752) | (i411111111111112 & 3670016), 0);
                    if (e.k()) {
                        e.n();
                    }
                    int i411111111111113 = i36;
                    omcVar2 = omcVar3;
                    i12 = i411111111111113;
                    float f19 = f4;
                    z4 = z6;
                    f3 = f19;
                    tc.c cVar17 = cVarI;
                    zv8Var2 = zv8VarD;
                    cVar2 = cVar17;
                    Function1<? super Integer, ? extends Object> function19 = function4;
                    re8Var2 = re8Var3;
                    function2 = function19;
                    fVar2 = fVar4;
                    jVar2 = jVar4;
                    r10 = r3;
                    rx8Var2 = rx8Var3;
                    bVar3 = bVar110;
                } else {
                    dVarF = dVarF;
                    dVarF.q();
                    rx8Var2 = rx8Var;
                    fVar2 = fVar;
                    z4 = z;
                    r10 = z2;
                    function2 = function1;
                    re8Var2 = re8Var;
                    jVar2 = jVar;
                    f3 = f2;
                    bVar3 = bVar2;
                    cVar2 = cVarI;
                    omcVar2 = omcVarB;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                        public final Object invoke(Object obj, Object obj2) {
                            return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i28 = i26 | 384;
            if ((i3 & 3072) != 0) {
                if ((i4 & 8192) == 0) {
                    i9 = 2048;
                }
                i28 |= i9;
            }
            if ((i3 & 24576) != 0) {
                i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
            }
            i30 = i28;
            if ((i21 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (dVarF.g(z3, i21 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i38 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i6 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var;
                    }
                    if (i8 != 0) {
                        fVar3 = f.a.a;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i11 != 0) {
                        i31 = 0;
                    } else {
                        i31 = i12;
                    }
                    if (i14 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if (i16 != 0) {
                        cVarI = tc.INSTANCE.i();
                    }
                    if ((i4 & 128) != 0) {
                        int i411111111111114 = (i21 & 14) | 196608;
                        i33 = i30;
                        pagerState2 = pagerState;
                        i21 &= -29360129;
                        i32 = 0;
                        omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i411111111111114, 30);
                    } else {
                        pagerState2 = pagerState;
                        i32 = 0;
                        i33 = i30;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        r0 = i32;
                    } else {
                        r0 = z2;
                    }
                    if (i23 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if ((i4 & 2048) != 0) {
                        re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                        i34 = i33 & (-113);
                    } else {
                        re8VarD = re8Var;
                        i34 = i33;
                    }
                    if (i27 != 0) {
                        jVar3 = j.b.a;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i4 & 8192) != 0) {
                        j jVar1114 = jVar3;
                        zv8VarD = cw8.d(dVarF, i32);
                        i35 = i34 & (-7169);
                        omcVar3 = omcVarB;
                        jVar4 = jVar1114;
                        function4 = function3;
                        re8Var3 = re8VarD;
                        rx8Var3 = rx8VarE;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        bVar5 = bVar4;
                    } else {
                        function4 = function3;
                        re8Var3 = re8VarD;
                        i35 = i34;
                        rx8Var3 = rx8VarE;
                        omcVar3 = omcVarB;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        jVar4 = jVar3;
                        bVar5 = bVar4;
                        zv8VarD = zv8Var;
                    }
                } else {
                    if (i38 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i6 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var;
                    }
                    if (i8 != 0) {
                        fVar3 = f.a.a;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i11 != 0) {
                        i31 = 0;
                    } else {
                        i31 = i12;
                    }
                    if (i14 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if (i16 != 0) {
                        cVarI = tc.INSTANCE.i();
                    }
                    if ((i4 & 128) != 0) {
                        int i411111111111115 = (i21 & 14) | 196608;
                        i33 = i30;
                        pagerState2 = pagerState;
                        i21 &= -29360129;
                        i32 = 0;
                        omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i411111111111115, 30);
                    } else {
                        pagerState2 = pagerState;
                        i32 = 0;
                        i33 = i30;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        r0 = i32;
                    } else {
                        r0 = z2;
                    }
                    if (i23 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if ((i4 & 2048) != 0) {
                        re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                        i34 = i33 & (-113);
                    } else {
                        re8VarD = re8Var;
                        i34 = i33;
                    }
                    if (i27 != 0) {
                        jVar3 = j.b.a;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i4 & 8192) != 0) {
                        j jVar1115 = jVar3;
                        zv8VarD = cw8.d(dVarF, i32);
                        i35 = i34 & (-7169);
                        omcVar3 = omcVarB;
                        jVar4 = jVar1115;
                        function4 = function3;
                        re8Var3 = re8VarD;
                        rx8Var3 = rx8VarE;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        bVar5 = bVar4;
                    } else {
                        function4 = function3;
                        re8Var3 = re8VarD;
                        i35 = i34;
                        rx8Var3 = rx8VarE;
                        omcVar3 = omcVarB;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        jVar4 = jVar3;
                        bVar5 = bVar4;
                        zv8VarD = zv8Var;
                    }
                }
                dVarF.M();
                b bVar111 = bVar5;
                if (e.k()) {
                    e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                }
                int i411111111111116 = i35;
                int i411111111111117 = i37 >> 6;
                int i411111111111118 = i37 << 12;
                int i411111111111119 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i411111111111117 & 458752) | (i411111111111117 & 3670016) | ((i411111111111116 << 12) & 29360128) | (i411111111111118 & 234881024) | (i411111111111118 & 1879048192);
                int i4111111111111110 = ((i37 >> 9) & 14) | 3072 | (i411111111111116 & 112);
                int i4111111111111111 = i411111111111116 << 6;
                LazyLayoutPagerKt.f(bVar111, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i411111111111119, i4111111111111110 | (i4111111111111111 & 896) | (i411111111111117 & 57344) | ((i411111111111116 << 9) & 458752) | (i4111111111111111 & 3670016), 0);
                if (e.k()) {
                    e.n();
                }
                int i4111111111111112 = i36;
                omcVar2 = omcVar3;
                i12 = i4111111111111112;
                float f110 = f4;
                z4 = z6;
                f3 = f110;
                tc.c cVar18 = cVarI;
                zv8Var2 = zv8VarD;
                cVar2 = cVar18;
                Function1<? super Integer, ? extends Object> function110 = function4;
                re8Var2 = re8Var3;
                function2 = function110;
                fVar2 = fVar4;
                jVar2 = jVar4;
                r10 = r3;
                rx8Var2 = rx8Var3;
                bVar3 = bVar111;
            } else {
                dVarF = dVarF;
                dVarF.q();
                rx8Var2 = rx8Var;
                fVar2 = fVar;
                z4 = z;
                r10 = z2;
                function2 = function1;
                re8Var2 = re8Var;
                jVar2 = jVar;
                f3 = f2;
                bVar3 = bVar2;
                cVar2 = cVarI;
                omcVar2 = omcVarB;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                    public final Object invoke(Object obj, Object obj2) {
                        return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 48;
        bVar2 = bVar;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i2 & 384) == 0) {
                if (dVarF.x(rx8Var)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            i9 = 1024;
            if (i8 != 0) {
                if ((i2 & 3072) == 0) {
                    if (dVarF.x(fVar)) {
                        i10 = 2048;
                    } else {
                        i10 = 1024;
                    }
                    i5 |= i10;
                }
                i11 = i4 & 16;
                if (i11 != 0) {
                    if ((i2 & 24576) == 0) {
                        i12 = i;
                        if (dVarF.C(i12)) {
                            i13 = 16384;
                        } else {
                            i13 = 8192;
                        }
                        i5 |= i13;
                    }
                    i14 = i4 & 32;
                    if (i14 != 0) {
                        i5 |= 196608;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i2 & 196608) == 0) {
                            if (dVarF.B(f2)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                            i5 |= i15;
                        }
                    }
                    i16 = i4 & 64;
                    if (i16 != 0) {
                        i5 |= 1572864;
                        cVarI = cVar;
                    } else {
                        cVarI = cVar;
                        if ((i2 & 1572864) == 0) {
                            if (dVarF.x(cVarI)) {
                                i17 = 1048576;
                            } else {
                                i17 = 524288;
                            }
                            i5 |= i17;
                        }
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i4 & 128) == 0) {
                            omcVarB = omcVar;
                            if (dVarF.x(omcVarB)) {
                            }
                            i5 |= i39;
                        } else {
                            omcVarB = omcVar;
                        }
                        i5 |= i39;
                    } else {
                        omcVarB = omcVar;
                    }
                    i18 = i4 & 256;
                    if (i18 != 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.A(z)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i5 |= i19;
                    }
                    i20 = i4 & 512;
                    if (i20 != 0) {
                        i21 = i5 | 805306368;
                        i20 = i20;
                    } else {
                        if ((i2 & 805306368) != 0) {
                            if (dVarF.A(z2)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i5 |= i22;
                        }
                        i21 = i5;
                    }
                    i23 = i4 & 1024;
                    if (i23 != 0) {
                        i24 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (dVarF.T(function1)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i3 | i25;
                    } else {
                        i24 = i3;
                    }
                    if ((i3 & 48) != 0) {
                        i24 |= ((i4 & 2048) == 0 || !dVarF.T(re8Var)) ? 16 : 32;
                    }
                    i26 = i24;
                    i27 = i4 & 4096;
                    if (i27 != 0) {
                        i28 = i26;
                        if ((i3 & 384) == 0) {
                            if (dVarF.x(jVar)) {
                                i29 = 256;
                            } else {
                                i29 = 128;
                            }
                            i28 |= i29;
                        }
                        if ((i3 & 3072) != 0) {
                            if ((i4 & 8192) == 0) {
                                i9 = 2048;
                            }
                            i28 |= i9;
                        }
                        if ((i3 & 24576) != 0) {
                            i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                        }
                        i30 = i28;
                        if ((i21 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (dVarF.g(z3, i21 & 1)) {
                            dVarF.U();
                            if ((i2 & 1) != 0) {
                                if (i38 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if (i6 != 0) {
                                    rx8VarE = nx8.e(ff3.i(0));
                                } else {
                                    rx8VarE = rx8Var;
                                }
                                if (i8 != 0) {
                                    fVar3 = f.a.a;
                                } else {
                                    fVar3 = fVar;
                                }
                                if (i11 != 0) {
                                    i31 = 0;
                                } else {
                                    i31 = i12;
                                }
                                if (i14 != 0) {
                                    fI = ff3.i(0);
                                } else {
                                    fI = f2;
                                }
                                if (i16 != 0) {
                                    cVarI = tc.INSTANCE.i();
                                }
                                if ((i4 & 128) != 0) {
                                    int i4111111111111113 = (i21 & 14) | 196608;
                                    i33 = i30;
                                    pagerState2 = pagerState;
                                    i21 &= -29360129;
                                    i32 = 0;
                                    omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111111111111113, 30);
                                } else {
                                    pagerState2 = pagerState;
                                    i32 = 0;
                                    i33 = i30;
                                }
                                if (i18 == 0) {
                                }
                                if (i20 != 0) {
                                    r0 = i32;
                                } else {
                                    r0 = z2;
                                }
                                if (i23 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function1;
                                }
                                if ((i4 & 2048) != 0) {
                                    re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                    i34 = i33 & (-113);
                                } else {
                                    re8VarD = re8Var;
                                    i34 = i33;
                                }
                                if (i27 != 0) {
                                    jVar3 = j.b.a;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i4 & 8192) != 0) {
                                    j jVar1116 = jVar3;
                                    zv8VarD = cw8.d(dVarF, i32);
                                    i35 = i34 & (-7169);
                                    omcVar3 = omcVarB;
                                    jVar4 = jVar1116;
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    rx8Var3 = rx8VarE;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    bVar5 = bVar4;
                                } else {
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    i35 = i34;
                                    rx8Var3 = rx8VarE;
                                    omcVar3 = omcVarB;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    jVar4 = jVar3;
                                    bVar5 = bVar4;
                                    zv8VarD = zv8Var;
                                }
                            } else {
                                if (i38 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if (i6 != 0) {
                                    rx8VarE = nx8.e(ff3.i(0));
                                } else {
                                    rx8VarE = rx8Var;
                                }
                                if (i8 != 0) {
                                    fVar3 = f.a.a;
                                } else {
                                    fVar3 = fVar;
                                }
                                if (i11 != 0) {
                                    i31 = 0;
                                } else {
                                    i31 = i12;
                                }
                                if (i14 != 0) {
                                    fI = ff3.i(0);
                                } else {
                                    fI = f2;
                                }
                                if (i16 != 0) {
                                    cVarI = tc.INSTANCE.i();
                                }
                                if ((i4 & 128) != 0) {
                                    int i4111111111111114 = (i21 & 14) | 196608;
                                    i33 = i30;
                                    pagerState2 = pagerState;
                                    i21 &= -29360129;
                                    i32 = 0;
                                    omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111111111111114, 30);
                                } else {
                                    pagerState2 = pagerState;
                                    i32 = 0;
                                    i33 = i30;
                                }
                                if (i18 == 0) {
                                }
                                if (i20 != 0) {
                                    r0 = i32;
                                } else {
                                    r0 = z2;
                                }
                                if (i23 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function1;
                                }
                                if ((i4 & 2048) != 0) {
                                    re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                    i34 = i33 & (-113);
                                } else {
                                    re8VarD = re8Var;
                                    i34 = i33;
                                }
                                if (i27 != 0) {
                                    jVar3 = j.b.a;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i4 & 8192) != 0) {
                                    j jVar1117 = jVar3;
                                    zv8VarD = cw8.d(dVarF, i32);
                                    i35 = i34 & (-7169);
                                    omcVar3 = omcVarB;
                                    jVar4 = jVar1117;
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    rx8Var3 = rx8VarE;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    bVar5 = bVar4;
                                } else {
                                    function4 = function3;
                                    re8Var3 = re8VarD;
                                    i35 = i34;
                                    rx8Var3 = rx8VarE;
                                    omcVar3 = omcVarB;
                                    fVar4 = fVar3;
                                    z6 = z5;
                                    i36 = i31;
                                    f4 = fI;
                                    i37 = i21;
                                    r3 = r0;
                                    jVar4 = jVar3;
                                    bVar5 = bVar4;
                                    zv8VarD = zv8Var;
                                }
                            }
                            dVarF.M();
                            b bVar112 = bVar5;
                            if (e.k()) {
                                e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                            }
                            int i4111111111111115 = i35;
                            int i4111111111111116 = i37 >> 6;
                            int i4111111111111117 = i37 << 12;
                            int i4111111111111118 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i4111111111111116 & 458752) | (i4111111111111116 & 3670016) | ((i4111111111111115 << 12) & 29360128) | (i4111111111111117 & 234881024) | (i4111111111111117 & 1879048192);
                            int i4111111111111119 = ((i37 >> 9) & 14) | 3072 | (i4111111111111115 & 112);
                            int i41111111111111110 = i4111111111111115 << 6;
                            LazyLayoutPagerKt.f(bVar112, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i4111111111111118, i4111111111111119 | (i41111111111111110 & 896) | (i4111111111111116 & 57344) | ((i4111111111111115 << 9) & 458752) | (i41111111111111110 & 3670016), 0);
                            if (e.k()) {
                                e.n();
                            }
                            int i41111111111111111 = i36;
                            omcVar2 = omcVar3;
                            i12 = i41111111111111111;
                            float f111 = f4;
                            z4 = z6;
                            f3 = f111;
                            tc.c cVar19 = cVarI;
                            zv8Var2 = zv8VarD;
                            cVar2 = cVar19;
                            Function1<? super Integer, ? extends Object> function111 = function4;
                            re8Var2 = re8Var3;
                            function2 = function111;
                            fVar2 = fVar4;
                            jVar2 = jVar4;
                            r10 = r3;
                            rx8Var2 = rx8Var3;
                            bVar3 = bVar112;
                        } else {
                            dVarF = dVarF;
                            dVarF.q();
                            rx8Var2 = rx8Var;
                            fVar2 = fVar;
                            z4 = z;
                            r10 = z2;
                            function2 = function1;
                            re8Var2 = re8Var;
                            jVar2 = jVar;
                            f3 = f2;
                            bVar3 = bVar2;
                            cVar2 = cVarI;
                            omcVar2 = omcVarB;
                            zv8Var2 = zv8Var;
                        }
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                                public final Object invoke(Object obj, Object obj2) {
                                    return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i28 = i26 | 384;
                    if ((i3 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i9 = 2048;
                        }
                        i28 |= i9;
                    }
                    if ((i3 & 24576) != 0) {
                        i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                    }
                    i30 = i28;
                    if ((i21 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (dVarF.g(z3, i21 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i41111111111111112 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111111111111112, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar1118 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar1118;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        } else {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i41111111111111113 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111111111111113, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar1119 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar1119;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        }
                        dVarF.M();
                        b bVar113 = bVar5;
                        if (e.k()) {
                            e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                        }
                        int i41111111111111114 = i35;
                        int i41111111111111115 = i37 >> 6;
                        int i41111111111111116 = i37 << 12;
                        int i41111111111111117 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i41111111111111115 & 458752) | (i41111111111111115 & 3670016) | ((i41111111111111114 << 12) & 29360128) | (i41111111111111116 & 234881024) | (i41111111111111116 & 1879048192);
                        int i41111111111111118 = ((i37 >> 9) & 14) | 3072 | (i41111111111111114 & 112);
                        int i41111111111111119 = i41111111111111114 << 6;
                        LazyLayoutPagerKt.f(bVar113, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i41111111111111117, i41111111111111118 | (i41111111111111119 & 896) | (i41111111111111115 & 57344) | ((i41111111111111114 << 9) & 458752) | (i41111111111111119 & 3670016), 0);
                        if (e.k()) {
                            e.n();
                        }
                        int i411111111111111110 = i36;
                        omcVar2 = omcVar3;
                        i12 = i411111111111111110;
                        float f112 = f4;
                        z4 = z6;
                        f3 = f112;
                        tc.c cVar110 = cVarI;
                        zv8Var2 = zv8VarD;
                        cVar2 = cVar110;
                        Function1<? super Integer, ? extends Object> function112 = function4;
                        re8Var2 = re8Var3;
                        function2 = function112;
                        fVar2 = fVar4;
                        jVar2 = jVar4;
                        r10 = r3;
                        rx8Var2 = rx8Var3;
                        bVar3 = bVar113;
                    } else {
                        dVarF = dVarF;
                        dVarF.q();
                        rx8Var2 = rx8Var;
                        fVar2 = fVar;
                        z4 = z;
                        r10 = z2;
                        function2 = function1;
                        re8Var2 = re8Var;
                        jVar2 = jVar;
                        f3 = f2;
                        bVar3 = bVar2;
                        cVar2 = cVarI;
                        omcVar2 = omcVarB;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                            public final Object invoke(Object obj, Object obj2) {
                                return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 24576;
                i12 = i;
                i14 = i4 & 32;
                if (i14 != 0) {
                    i5 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i2 & 196608) == 0) {
                        if (dVarF.B(f2)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 64;
                if (i16 != 0) {
                    i5 |= 1572864;
                    cVarI = cVar;
                } else {
                    cVarI = cVar;
                    if ((i2 & 1572864) == 0) {
                        if (dVarF.x(cVarI)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i5 |= i17;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    if ((i4 & 128) == 0) {
                        omcVarB = omcVar;
                        if (dVarF.x(omcVarB)) {
                        }
                        i5 |= i39;
                    } else {
                        omcVarB = omcVar;
                    }
                    i5 |= i39;
                } else {
                    omcVarB = omcVar;
                }
                i18 = i4 & 256;
                if (i18 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.A(z)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i5 |= i19;
                }
                i20 = i4 & 512;
                if (i20 != 0) {
                    i21 = i5 | 805306368;
                    i20 = i20;
                } else {
                    if ((i2 & 805306368) != 0) {
                        if (dVarF.A(z2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i5 |= i22;
                    }
                    i21 = i5;
                }
                i23 = i4 & 1024;
                if (i23 != 0) {
                    i24 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i3 | i25;
                } else {
                    i24 = i3;
                }
                if ((i3 & 48) != 0) {
                    i24 |= ((i4 & 2048) == 0 || !dVarF.T(re8Var)) ? 16 : 32;
                }
                i26 = i24;
                i27 = i4 & 4096;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i3 & 384) == 0) {
                        if (dVarF.x(jVar)) {
                            i29 = 256;
                        } else {
                            i29 = 128;
                        }
                        i28 |= i29;
                    }
                    if ((i3 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i9 = 2048;
                        }
                        i28 |= i9;
                    }
                    if ((i3 & 24576) != 0) {
                        i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                    }
                    i30 = i28;
                    if ((i21 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (dVarF.g(z3, i21 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i411111111111111111 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i411111111111111111, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar11110 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar11110;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        } else {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i411111111111111112 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i411111111111111112, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar11111 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar11111;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        }
                        dVarF.M();
                        b bVar114 = bVar5;
                        if (e.k()) {
                            e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                        }
                        int i411111111111111113 = i35;
                        int i411111111111111114 = i37 >> 6;
                        int i411111111111111115 = i37 << 12;
                        int i411111111111111116 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i411111111111111114 & 458752) | (i411111111111111114 & 3670016) | ((i411111111111111113 << 12) & 29360128) | (i411111111111111115 & 234881024) | (i411111111111111115 & 1879048192);
                        int i411111111111111117 = ((i37 >> 9) & 14) | 3072 | (i411111111111111113 & 112);
                        int i411111111111111118 = i411111111111111113 << 6;
                        LazyLayoutPagerKt.f(bVar114, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i411111111111111116, i411111111111111117 | (i411111111111111118 & 896) | (i411111111111111114 & 57344) | ((i411111111111111113 << 9) & 458752) | (i411111111111111118 & 3670016), 0);
                        if (e.k()) {
                            e.n();
                        }
                        int i411111111111111119 = i36;
                        omcVar2 = omcVar3;
                        i12 = i411111111111111119;
                        float f113 = f4;
                        z4 = z6;
                        f3 = f113;
                        tc.c cVar111 = cVarI;
                        zv8Var2 = zv8VarD;
                        cVar2 = cVar111;
                        Function1<? super Integer, ? extends Object> function113 = function4;
                        re8Var2 = re8Var3;
                        function2 = function113;
                        fVar2 = fVar4;
                        jVar2 = jVar4;
                        r10 = r3;
                        rx8Var2 = rx8Var3;
                        bVar3 = bVar114;
                    } else {
                        dVarF = dVarF;
                        dVarF.q();
                        rx8Var2 = rx8Var;
                        fVar2 = fVar;
                        z4 = z;
                        r10 = z2;
                        function2 = function1;
                        re8Var2 = re8Var;
                        jVar2 = jVar;
                        f3 = f2;
                        bVar3 = bVar2;
                        cVar2 = cVarI;
                        omcVar2 = omcVarB;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                            public final Object invoke(Object obj, Object obj2) {
                                return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i28 = i26 | 384;
                if ((i3 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i9 = 2048;
                    }
                    i28 |= i9;
                }
                if ((i3 & 24576) != 0) {
                    i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                }
                i30 = i28;
                if ((i21 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (dVarF.g(z3, i21 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i4111111111111111110 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111111111111111110, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar11112 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar11112;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    } else {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i4111111111111111111 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111111111111111111, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar11113 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar11113;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    }
                    dVarF.M();
                    b bVar115 = bVar5;
                    if (e.k()) {
                        e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                    }
                    int i4111111111111111112 = i35;
                    int i4111111111111111113 = i37 >> 6;
                    int i4111111111111111114 = i37 << 12;
                    int i4111111111111111115 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i4111111111111111113 & 458752) | (i4111111111111111113 & 3670016) | ((i4111111111111111112 << 12) & 29360128) | (i4111111111111111114 & 234881024) | (i4111111111111111114 & 1879048192);
                    int i4111111111111111116 = ((i37 >> 9) & 14) | 3072 | (i4111111111111111112 & 112);
                    int i4111111111111111117 = i4111111111111111112 << 6;
                    LazyLayoutPagerKt.f(bVar115, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i4111111111111111115, i4111111111111111116 | (i4111111111111111117 & 896) | (i4111111111111111113 & 57344) | ((i4111111111111111112 << 9) & 458752) | (i4111111111111111117 & 3670016), 0);
                    if (e.k()) {
                        e.n();
                    }
                    int i4111111111111111118 = i36;
                    omcVar2 = omcVar3;
                    i12 = i4111111111111111118;
                    float f114 = f4;
                    z4 = z6;
                    f3 = f114;
                    tc.c cVar112 = cVarI;
                    zv8Var2 = zv8VarD;
                    cVar2 = cVar112;
                    Function1<? super Integer, ? extends Object> function114 = function4;
                    re8Var2 = re8Var3;
                    function2 = function114;
                    fVar2 = fVar4;
                    jVar2 = jVar4;
                    r10 = r3;
                    rx8Var2 = rx8Var3;
                    bVar3 = bVar115;
                } else {
                    dVarF = dVarF;
                    dVarF.q();
                    rx8Var2 = rx8Var;
                    fVar2 = fVar;
                    z4 = z;
                    r10 = z2;
                    function2 = function1;
                    re8Var2 = re8Var;
                    jVar2 = jVar;
                    f3 = f2;
                    bVar3 = bVar2;
                    cVar2 = cVarI;
                    omcVar2 = omcVarB;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                        public final Object invoke(Object obj, Object obj2) {
                            return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 3072;
            i11 = i4 & 16;
            if (i11 != 0) {
                if ((i2 & 24576) == 0) {
                    i12 = i;
                    if (dVarF.C(i12)) {
                        i13 = 16384;
                    } else {
                        i13 = 8192;
                    }
                    i5 |= i13;
                }
                i14 = i4 & 32;
                if (i14 != 0) {
                    i5 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i2 & 196608) == 0) {
                        if (dVarF.B(f2)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 64;
                if (i16 != 0) {
                    i5 |= 1572864;
                    cVarI = cVar;
                } else {
                    cVarI = cVar;
                    if ((i2 & 1572864) == 0) {
                        if (dVarF.x(cVarI)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i5 |= i17;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    if ((i4 & 128) == 0) {
                        omcVarB = omcVar;
                        if (dVarF.x(omcVarB)) {
                        }
                        i5 |= i39;
                    } else {
                        omcVarB = omcVar;
                    }
                    i5 |= i39;
                } else {
                    omcVarB = omcVar;
                }
                i18 = i4 & 256;
                if (i18 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.A(z)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i5 |= i19;
                }
                i20 = i4 & 512;
                if (i20 != 0) {
                    i21 = i5 | 805306368;
                    i20 = i20;
                } else {
                    if ((i2 & 805306368) != 0) {
                        if (dVarF.A(z2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i5 |= i22;
                    }
                    i21 = i5;
                }
                i23 = i4 & 1024;
                if (i23 != 0) {
                    i24 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i3 | i25;
                } else {
                    i24 = i3;
                }
                if ((i3 & 48) != 0) {
                    i24 |= ((i4 & 2048) == 0 || !dVarF.T(re8Var)) ? 16 : 32;
                }
                i26 = i24;
                i27 = i4 & 4096;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i3 & 384) == 0) {
                        if (dVarF.x(jVar)) {
                            i29 = 256;
                        } else {
                            i29 = 128;
                        }
                        i28 |= i29;
                    }
                    if ((i3 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i9 = 2048;
                        }
                        i28 |= i9;
                    }
                    if ((i3 & 24576) != 0) {
                        i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                    }
                    i30 = i28;
                    if ((i21 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (dVarF.g(z3, i21 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i4111111111111111119 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111111111111111119, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar11114 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar11114;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        } else {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i41111111111111111110 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111111111111111110, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar11115 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar11115;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        }
                        dVarF.M();
                        b bVar116 = bVar5;
                        if (e.k()) {
                            e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                        }
                        int i41111111111111111111 = i35;
                        int i41111111111111111112 = i37 >> 6;
                        int i41111111111111111113 = i37 << 12;
                        int i41111111111111111114 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i41111111111111111112 & 458752) | (i41111111111111111112 & 3670016) | ((i41111111111111111111 << 12) & 29360128) | (i41111111111111111113 & 234881024) | (i41111111111111111113 & 1879048192);
                        int i41111111111111111115 = ((i37 >> 9) & 14) | 3072 | (i41111111111111111111 & 112);
                        int i41111111111111111116 = i41111111111111111111 << 6;
                        LazyLayoutPagerKt.f(bVar116, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i41111111111111111114, i41111111111111111115 | (i41111111111111111116 & 896) | (i41111111111111111112 & 57344) | ((i41111111111111111111 << 9) & 458752) | (i41111111111111111116 & 3670016), 0);
                        if (e.k()) {
                            e.n();
                        }
                        int i41111111111111111117 = i36;
                        omcVar2 = omcVar3;
                        i12 = i41111111111111111117;
                        float f115 = f4;
                        z4 = z6;
                        f3 = f115;
                        tc.c cVar113 = cVarI;
                        zv8Var2 = zv8VarD;
                        cVar2 = cVar113;
                        Function1<? super Integer, ? extends Object> function115 = function4;
                        re8Var2 = re8Var3;
                        function2 = function115;
                        fVar2 = fVar4;
                        jVar2 = jVar4;
                        r10 = r3;
                        rx8Var2 = rx8Var3;
                        bVar3 = bVar116;
                    } else {
                        dVarF = dVarF;
                        dVarF.q();
                        rx8Var2 = rx8Var;
                        fVar2 = fVar;
                        z4 = z;
                        r10 = z2;
                        function2 = function1;
                        re8Var2 = re8Var;
                        jVar2 = jVar;
                        f3 = f2;
                        bVar3 = bVar2;
                        cVar2 = cVarI;
                        omcVar2 = omcVarB;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                            public final Object invoke(Object obj, Object obj2) {
                                return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i28 = i26 | 384;
                if ((i3 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i9 = 2048;
                    }
                    i28 |= i9;
                }
                if ((i3 & 24576) != 0) {
                    i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                }
                i30 = i28;
                if ((i21 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (dVarF.g(z3, i21 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i41111111111111111118 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111111111111111118, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar11116 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar11116;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    } else {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i41111111111111111119 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111111111111111119, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar11117 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar11117;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    }
                    dVarF.M();
                    b bVar117 = bVar5;
                    if (e.k()) {
                        e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                    }
                    int i411111111111111111110 = i35;
                    int i411111111111111111111 = i37 >> 6;
                    int i411111111111111111112 = i37 << 12;
                    int i411111111111111111113 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i411111111111111111111 & 458752) | (i411111111111111111111 & 3670016) | ((i411111111111111111110 << 12) & 29360128) | (i411111111111111111112 & 234881024) | (i411111111111111111112 & 1879048192);
                    int i411111111111111111114 = ((i37 >> 9) & 14) | 3072 | (i411111111111111111110 & 112);
                    int i411111111111111111115 = i411111111111111111110 << 6;
                    LazyLayoutPagerKt.f(bVar117, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i411111111111111111113, i411111111111111111114 | (i411111111111111111115 & 896) | (i411111111111111111111 & 57344) | ((i411111111111111111110 << 9) & 458752) | (i411111111111111111115 & 3670016), 0);
                    if (e.k()) {
                        e.n();
                    }
                    int i411111111111111111116 = i36;
                    omcVar2 = omcVar3;
                    i12 = i411111111111111111116;
                    float f116 = f4;
                    z4 = z6;
                    f3 = f116;
                    tc.c cVar114 = cVarI;
                    zv8Var2 = zv8VarD;
                    cVar2 = cVar114;
                    Function1<? super Integer, ? extends Object> function116 = function4;
                    re8Var2 = re8Var3;
                    function2 = function116;
                    fVar2 = fVar4;
                    jVar2 = jVar4;
                    r10 = r3;
                    rx8Var2 = rx8Var3;
                    bVar3 = bVar117;
                } else {
                    dVarF = dVarF;
                    dVarF.q();
                    rx8Var2 = rx8Var;
                    fVar2 = fVar;
                    z4 = z;
                    r10 = z2;
                    function2 = function1;
                    re8Var2 = re8Var;
                    jVar2 = jVar;
                    f3 = f2;
                    bVar3 = bVar2;
                    cVar2 = cVarI;
                    omcVar2 = omcVarB;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                        public final Object invoke(Object obj, Object obj2) {
                            return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 24576;
            i12 = i;
            i14 = i4 & 32;
            if (i14 != 0) {
                i5 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i2 & 196608) == 0) {
                    if (dVarF.B(f2)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i5 |= i15;
                }
            }
            i16 = i4 & 64;
            if (i16 != 0) {
                i5 |= 1572864;
                cVarI = cVar;
            } else {
                cVarI = cVar;
                if ((i2 & 1572864) == 0) {
                    if (dVarF.x(cVarI)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i5 |= i17;
                }
            }
            if ((i2 & 12582912) == 0) {
                if ((i4 & 128) == 0) {
                    omcVarB = omcVar;
                    if (dVarF.x(omcVarB)) {
                    }
                    i5 |= i39;
                } else {
                    omcVarB = omcVar;
                }
                i5 |= i39;
            } else {
                omcVarB = omcVar;
            }
            i18 = i4 & 256;
            if (i18 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (dVarF.A(z)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i5 |= i19;
            }
            i20 = i4 & 512;
            if (i20 != 0) {
                i21 = i5 | 805306368;
                i20 = i20;
            } else {
                if ((i2 & 805306368) != 0) {
                    if (dVarF.A(z2)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i5 |= i22;
                }
                i21 = i5;
            }
            i23 = i4 & 1024;
            if (i23 != 0) {
                i24 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (dVarF.T(function1)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i3 | i25;
            } else {
                i24 = i3;
            }
            if ((i3 & 48) != 0) {
                i24 |= ((i4 & 2048) == 0 || !dVarF.T(re8Var)) ? 16 : 32;
            }
            i26 = i24;
            i27 = i4 & 4096;
            if (i27 != 0) {
                i28 = i26;
                if ((i3 & 384) == 0) {
                    if (dVarF.x(jVar)) {
                        i29 = 256;
                    } else {
                        i29 = 128;
                    }
                    i28 |= i29;
                }
                if ((i3 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i9 = 2048;
                    }
                    i28 |= i9;
                }
                if ((i3 & 24576) != 0) {
                    i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                }
                i30 = i28;
                if ((i21 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (dVarF.g(z3, i21 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i411111111111111111117 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i411111111111111111117, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar11118 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar11118;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    } else {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i411111111111111111118 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i411111111111111111118, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar11119 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar11119;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    }
                    dVarF.M();
                    b bVar118 = bVar5;
                    if (e.k()) {
                        e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                    }
                    int i411111111111111111119 = i35;
                    int i4111111111111111111110 = i37 >> 6;
                    int i4111111111111111111111 = i37 << 12;
                    int i4111111111111111111112 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i4111111111111111111110 & 458752) | (i4111111111111111111110 & 3670016) | ((i411111111111111111119 << 12) & 29360128) | (i4111111111111111111111 & 234881024) | (i4111111111111111111111 & 1879048192);
                    int i4111111111111111111113 = ((i37 >> 9) & 14) | 3072 | (i411111111111111111119 & 112);
                    int i4111111111111111111114 = i411111111111111111119 << 6;
                    LazyLayoutPagerKt.f(bVar118, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i4111111111111111111112, i4111111111111111111113 | (i4111111111111111111114 & 896) | (i4111111111111111111110 & 57344) | ((i411111111111111111119 << 9) & 458752) | (i4111111111111111111114 & 3670016), 0);
                    if (e.k()) {
                        e.n();
                    }
                    int i4111111111111111111115 = i36;
                    omcVar2 = omcVar3;
                    i12 = i4111111111111111111115;
                    float f117 = f4;
                    z4 = z6;
                    f3 = f117;
                    tc.c cVar115 = cVarI;
                    zv8Var2 = zv8VarD;
                    cVar2 = cVar115;
                    Function1<? super Integer, ? extends Object> function117 = function4;
                    re8Var2 = re8Var3;
                    function2 = function117;
                    fVar2 = fVar4;
                    jVar2 = jVar4;
                    r10 = r3;
                    rx8Var2 = rx8Var3;
                    bVar3 = bVar118;
                } else {
                    dVarF = dVarF;
                    dVarF.q();
                    rx8Var2 = rx8Var;
                    fVar2 = fVar;
                    z4 = z;
                    r10 = z2;
                    function2 = function1;
                    re8Var2 = re8Var;
                    jVar2 = jVar;
                    f3 = f2;
                    bVar3 = bVar2;
                    cVar2 = cVarI;
                    omcVar2 = omcVarB;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                        public final Object invoke(Object obj, Object obj2) {
                            return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i28 = i26 | 384;
            if ((i3 & 3072) != 0) {
                if ((i4 & 8192) == 0) {
                    i9 = 2048;
                }
                i28 |= i9;
            }
            if ((i3 & 24576) != 0) {
                i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
            }
            i30 = i28;
            if ((i21 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (dVarF.g(z3, i21 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i38 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i6 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var;
                    }
                    if (i8 != 0) {
                        fVar3 = f.a.a;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i11 != 0) {
                        i31 = 0;
                    } else {
                        i31 = i12;
                    }
                    if (i14 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if (i16 != 0) {
                        cVarI = tc.INSTANCE.i();
                    }
                    if ((i4 & 128) != 0) {
                        int i4111111111111111111116 = (i21 & 14) | 196608;
                        i33 = i30;
                        pagerState2 = pagerState;
                        i21 &= -29360129;
                        i32 = 0;
                        omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111111111111111111116, 30);
                    } else {
                        pagerState2 = pagerState;
                        i32 = 0;
                        i33 = i30;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        r0 = i32;
                    } else {
                        r0 = z2;
                    }
                    if (i23 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if ((i4 & 2048) != 0) {
                        re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                        i34 = i33 & (-113);
                    } else {
                        re8VarD = re8Var;
                        i34 = i33;
                    }
                    if (i27 != 0) {
                        jVar3 = j.b.a;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i4 & 8192) != 0) {
                        j jVar111110 = jVar3;
                        zv8VarD = cw8.d(dVarF, i32);
                        i35 = i34 & (-7169);
                        omcVar3 = omcVarB;
                        jVar4 = jVar111110;
                        function4 = function3;
                        re8Var3 = re8VarD;
                        rx8Var3 = rx8VarE;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        bVar5 = bVar4;
                    } else {
                        function4 = function3;
                        re8Var3 = re8VarD;
                        i35 = i34;
                        rx8Var3 = rx8VarE;
                        omcVar3 = omcVarB;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        jVar4 = jVar3;
                        bVar5 = bVar4;
                        zv8VarD = zv8Var;
                    }
                } else {
                    if (i38 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i6 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var;
                    }
                    if (i8 != 0) {
                        fVar3 = f.a.a;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i11 != 0) {
                        i31 = 0;
                    } else {
                        i31 = i12;
                    }
                    if (i14 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if (i16 != 0) {
                        cVarI = tc.INSTANCE.i();
                    }
                    if ((i4 & 128) != 0) {
                        int i4111111111111111111117 = (i21 & 14) | 196608;
                        i33 = i30;
                        pagerState2 = pagerState;
                        i21 &= -29360129;
                        i32 = 0;
                        omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111111111111111111117, 30);
                    } else {
                        pagerState2 = pagerState;
                        i32 = 0;
                        i33 = i30;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        r0 = i32;
                    } else {
                        r0 = z2;
                    }
                    if (i23 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if ((i4 & 2048) != 0) {
                        re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                        i34 = i33 & (-113);
                    } else {
                        re8VarD = re8Var;
                        i34 = i33;
                    }
                    if (i27 != 0) {
                        jVar3 = j.b.a;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i4 & 8192) != 0) {
                        j jVar111111 = jVar3;
                        zv8VarD = cw8.d(dVarF, i32);
                        i35 = i34 & (-7169);
                        omcVar3 = omcVarB;
                        jVar4 = jVar111111;
                        function4 = function3;
                        re8Var3 = re8VarD;
                        rx8Var3 = rx8VarE;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        bVar5 = bVar4;
                    } else {
                        function4 = function3;
                        re8Var3 = re8VarD;
                        i35 = i34;
                        rx8Var3 = rx8VarE;
                        omcVar3 = omcVarB;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        jVar4 = jVar3;
                        bVar5 = bVar4;
                        zv8VarD = zv8Var;
                    }
                }
                dVarF.M();
                b bVar119 = bVar5;
                if (e.k()) {
                    e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                }
                int i4111111111111111111118 = i35;
                int i4111111111111111111119 = i37 >> 6;
                int i41111111111111111111110 = i37 << 12;
                int i41111111111111111111111 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i4111111111111111111119 & 458752) | (i4111111111111111111119 & 3670016) | ((i4111111111111111111118 << 12) & 29360128) | (i41111111111111111111110 & 234881024) | (i41111111111111111111110 & 1879048192);
                int i41111111111111111111112 = ((i37 >> 9) & 14) | 3072 | (i4111111111111111111118 & 112);
                int i41111111111111111111113 = i4111111111111111111118 << 6;
                LazyLayoutPagerKt.f(bVar119, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i41111111111111111111111, i41111111111111111111112 | (i41111111111111111111113 & 896) | (i4111111111111111111119 & 57344) | ((i4111111111111111111118 << 9) & 458752) | (i41111111111111111111113 & 3670016), 0);
                if (e.k()) {
                    e.n();
                }
                int i41111111111111111111114 = i36;
                omcVar2 = omcVar3;
                i12 = i41111111111111111111114;
                float f118 = f4;
                z4 = z6;
                f3 = f118;
                tc.c cVar116 = cVarI;
                zv8Var2 = zv8VarD;
                cVar2 = cVar116;
                Function1<? super Integer, ? extends Object> function118 = function4;
                re8Var2 = re8Var3;
                function2 = function118;
                fVar2 = fVar4;
                jVar2 = jVar4;
                r10 = r3;
                rx8Var2 = rx8Var3;
                bVar3 = bVar119;
            } else {
                dVarF = dVarF;
                dVarF.q();
                rx8Var2 = rx8Var;
                fVar2 = fVar;
                z4 = z;
                r10 = z2;
                function2 = function1;
                re8Var2 = re8Var;
                jVar2 = jVar;
                f3 = f2;
                bVar3 = bVar2;
                cVar2 = cVarI;
                omcVar2 = omcVarB;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                    public final Object invoke(Object obj, Object obj2) {
                        return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 384;
        i8 = i4 & 8;
        i9 = 1024;
        if (i8 != 0) {
            if ((i2 & 3072) == 0) {
                if (dVarF.x(fVar)) {
                    i10 = 2048;
                } else {
                    i10 = 1024;
                }
                i5 |= i10;
            }
            i11 = i4 & 16;
            if (i11 != 0) {
                if ((i2 & 24576) == 0) {
                    i12 = i;
                    if (dVarF.C(i12)) {
                        i13 = 16384;
                    } else {
                        i13 = 8192;
                    }
                    i5 |= i13;
                }
                i14 = i4 & 32;
                if (i14 != 0) {
                    i5 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i2 & 196608) == 0) {
                        if (dVarF.B(f2)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 64;
                if (i16 != 0) {
                    i5 |= 1572864;
                    cVarI = cVar;
                } else {
                    cVarI = cVar;
                    if ((i2 & 1572864) == 0) {
                        if (dVarF.x(cVarI)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i5 |= i17;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    if ((i4 & 128) == 0) {
                        omcVarB = omcVar;
                        if (dVarF.x(omcVarB)) {
                        }
                        i5 |= i39;
                    } else {
                        omcVarB = omcVar;
                    }
                    i5 |= i39;
                } else {
                    omcVarB = omcVar;
                }
                i18 = i4 & 256;
                if (i18 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.A(z)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i5 |= i19;
                }
                i20 = i4 & 512;
                if (i20 != 0) {
                    i21 = i5 | 805306368;
                    i20 = i20;
                } else {
                    if ((i2 & 805306368) != 0) {
                        if (dVarF.A(z2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i5 |= i22;
                    }
                    i21 = i5;
                }
                i23 = i4 & 1024;
                if (i23 != 0) {
                    i24 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (dVarF.T(function1)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i3 | i25;
                } else {
                    i24 = i3;
                }
                if ((i3 & 48) != 0) {
                    i24 |= ((i4 & 2048) == 0 || !dVarF.T(re8Var)) ? 16 : 32;
                }
                i26 = i24;
                i27 = i4 & 4096;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i3 & 384) == 0) {
                        if (dVarF.x(jVar)) {
                            i29 = 256;
                        } else {
                            i29 = 128;
                        }
                        i28 |= i29;
                    }
                    if ((i3 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i9 = 2048;
                        }
                        i28 |= i9;
                    }
                    if ((i3 & 24576) != 0) {
                        i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                    }
                    i30 = i28;
                    if ((i21 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (dVarF.g(z3, i21 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i41111111111111111111115 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111111111111111111115, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar111112 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar111112;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        } else {
                            if (i38 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i6 != 0) {
                                rx8VarE = nx8.e(ff3.i(0));
                            } else {
                                rx8VarE = rx8Var;
                            }
                            if (i8 != 0) {
                                fVar3 = f.a.a;
                            } else {
                                fVar3 = fVar;
                            }
                            if (i11 != 0) {
                                i31 = 0;
                            } else {
                                i31 = i12;
                            }
                            if (i14 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if (i16 != 0) {
                                cVarI = tc.INSTANCE.i();
                            }
                            if ((i4 & 128) != 0) {
                                int i41111111111111111111116 = (i21 & 14) | 196608;
                                i33 = i30;
                                pagerState2 = pagerState;
                                i21 &= -29360129;
                                i32 = 0;
                                omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111111111111111111116, 30);
                            } else {
                                pagerState2 = pagerState;
                                i32 = 0;
                                i33 = i30;
                            }
                            if (i18 == 0) {
                            }
                            if (i20 != 0) {
                                r0 = i32;
                            } else {
                                r0 = z2;
                            }
                            if (i23 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            if ((i4 & 2048) != 0) {
                                re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                                i34 = i33 & (-113);
                            } else {
                                re8VarD = re8Var;
                                i34 = i33;
                            }
                            if (i27 != 0) {
                                jVar3 = j.b.a;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i4 & 8192) != 0) {
                                j jVar111113 = jVar3;
                                zv8VarD = cw8.d(dVarF, i32);
                                i35 = i34 & (-7169);
                                omcVar3 = omcVarB;
                                jVar4 = jVar111113;
                                function4 = function3;
                                re8Var3 = re8VarD;
                                rx8Var3 = rx8VarE;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                bVar5 = bVar4;
                            } else {
                                function4 = function3;
                                re8Var3 = re8VarD;
                                i35 = i34;
                                rx8Var3 = rx8VarE;
                                omcVar3 = omcVarB;
                                fVar4 = fVar3;
                                z6 = z5;
                                i36 = i31;
                                f4 = fI;
                                i37 = i21;
                                r3 = r0;
                                jVar4 = jVar3;
                                bVar5 = bVar4;
                                zv8VarD = zv8Var;
                            }
                        }
                        dVarF.M();
                        b bVar1110 = bVar5;
                        if (e.k()) {
                            e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                        }
                        int i41111111111111111111117 = i35;
                        int i41111111111111111111118 = i37 >> 6;
                        int i41111111111111111111119 = i37 << 12;
                        int i411111111111111111111110 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i41111111111111111111118 & 458752) | (i41111111111111111111118 & 3670016) | ((i41111111111111111111117 << 12) & 29360128) | (i41111111111111111111119 & 234881024) | (i41111111111111111111119 & 1879048192);
                        int i411111111111111111111111 = ((i37 >> 9) & 14) | 3072 | (i41111111111111111111117 & 112);
                        int i411111111111111111111112 = i41111111111111111111117 << 6;
                        LazyLayoutPagerKt.f(bVar1110, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i411111111111111111111110, i411111111111111111111111 | (i411111111111111111111112 & 896) | (i41111111111111111111118 & 57344) | ((i41111111111111111111117 << 9) & 458752) | (i411111111111111111111112 & 3670016), 0);
                        if (e.k()) {
                            e.n();
                        }
                        int i411111111111111111111113 = i36;
                        omcVar2 = omcVar3;
                        i12 = i411111111111111111111113;
                        float f119 = f4;
                        z4 = z6;
                        f3 = f119;
                        tc.c cVar117 = cVarI;
                        zv8Var2 = zv8VarD;
                        cVar2 = cVar117;
                        Function1<? super Integer, ? extends Object> function119 = function4;
                        re8Var2 = re8Var3;
                        function2 = function119;
                        fVar2 = fVar4;
                        jVar2 = jVar4;
                        r10 = r3;
                        rx8Var2 = rx8Var3;
                        bVar3 = bVar1110;
                    } else {
                        dVarF = dVarF;
                        dVarF.q();
                        rx8Var2 = rx8Var;
                        fVar2 = fVar;
                        z4 = z;
                        r10 = z2;
                        function2 = function1;
                        re8Var2 = re8Var;
                        jVar2 = jVar;
                        f3 = f2;
                        bVar3 = bVar2;
                        cVar2 = cVarI;
                        omcVar2 = omcVarB;
                        zv8Var2 = zv8Var;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                            public final Object invoke(Object obj, Object obj2) {
                                return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i28 = i26 | 384;
                if ((i3 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i9 = 2048;
                    }
                    i28 |= i9;
                }
                if ((i3 & 24576) != 0) {
                    i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                }
                i30 = i28;
                if ((i21 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (dVarF.g(z3, i21 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i411111111111111111111114 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i411111111111111111111114, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar111114 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar111114;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    } else {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i411111111111111111111115 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i411111111111111111111115, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar111115 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar111115;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    }
                    dVarF.M();
                    b bVar1111 = bVar5;
                    if (e.k()) {
                        e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                    }
                    int i411111111111111111111116 = i35;
                    int i411111111111111111111117 = i37 >> 6;
                    int i411111111111111111111118 = i37 << 12;
                    int i411111111111111111111119 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i411111111111111111111117 & 458752) | (i411111111111111111111117 & 3670016) | ((i411111111111111111111116 << 12) & 29360128) | (i411111111111111111111118 & 234881024) | (i411111111111111111111118 & 1879048192);
                    int i4111111111111111111111110 = ((i37 >> 9) & 14) | 3072 | (i411111111111111111111116 & 112);
                    int i4111111111111111111111111 = i411111111111111111111116 << 6;
                    LazyLayoutPagerKt.f(bVar1111, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i411111111111111111111119, i4111111111111111111111110 | (i4111111111111111111111111 & 896) | (i411111111111111111111117 & 57344) | ((i411111111111111111111116 << 9) & 458752) | (i4111111111111111111111111 & 3670016), 0);
                    if (e.k()) {
                        e.n();
                    }
                    int i4111111111111111111111112 = i36;
                    omcVar2 = omcVar3;
                    i12 = i4111111111111111111111112;
                    float f1110 = f4;
                    z4 = z6;
                    f3 = f1110;
                    tc.c cVar118 = cVarI;
                    zv8Var2 = zv8VarD;
                    cVar2 = cVar118;
                    Function1<? super Integer, ? extends Object> function1110 = function4;
                    re8Var2 = re8Var3;
                    function2 = function1110;
                    fVar2 = fVar4;
                    jVar2 = jVar4;
                    r10 = r3;
                    rx8Var2 = rx8Var3;
                    bVar3 = bVar1111;
                } else {
                    dVarF = dVarF;
                    dVarF.q();
                    rx8Var2 = rx8Var;
                    fVar2 = fVar;
                    z4 = z;
                    r10 = z2;
                    function2 = function1;
                    re8Var2 = re8Var;
                    jVar2 = jVar;
                    f3 = f2;
                    bVar3 = bVar2;
                    cVar2 = cVarI;
                    omcVar2 = omcVarB;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                        public final Object invoke(Object obj, Object obj2) {
                            return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 24576;
            i12 = i;
            i14 = i4 & 32;
            if (i14 != 0) {
                i5 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i2 & 196608) == 0) {
                    if (dVarF.B(f2)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i5 |= i15;
                }
            }
            i16 = i4 & 64;
            if (i16 != 0) {
                i5 |= 1572864;
                cVarI = cVar;
            } else {
                cVarI = cVar;
                if ((i2 & 1572864) == 0) {
                    if (dVarF.x(cVarI)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i5 |= i17;
                }
            }
            if ((i2 & 12582912) == 0) {
                if ((i4 & 128) == 0) {
                    omcVarB = omcVar;
                    if (dVarF.x(omcVarB)) {
                    }
                    i5 |= i39;
                } else {
                    omcVarB = omcVar;
                }
                i5 |= i39;
            } else {
                omcVarB = omcVar;
            }
            i18 = i4 & 256;
            if (i18 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (dVarF.A(z)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i5 |= i19;
            }
            i20 = i4 & 512;
            if (i20 != 0) {
                i21 = i5 | 805306368;
                i20 = i20;
            } else {
                if ((i2 & 805306368) != 0) {
                    if (dVarF.A(z2)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i5 |= i22;
                }
                i21 = i5;
            }
            i23 = i4 & 1024;
            if (i23 != 0) {
                i24 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (dVarF.T(function1)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i3 | i25;
            } else {
                i24 = i3;
            }
            if ((i3 & 48) != 0) {
                i24 |= ((i4 & 2048) == 0 || !dVarF.T(re8Var)) ? 16 : 32;
            }
            i26 = i24;
            i27 = i4 & 4096;
            if (i27 != 0) {
                i28 = i26;
                if ((i3 & 384) == 0) {
                    if (dVarF.x(jVar)) {
                        i29 = 256;
                    } else {
                        i29 = 128;
                    }
                    i28 |= i29;
                }
                if ((i3 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i9 = 2048;
                    }
                    i28 |= i9;
                }
                if ((i3 & 24576) != 0) {
                    i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                }
                i30 = i28;
                if ((i21 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (dVarF.g(z3, i21 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i4111111111111111111111113 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111111111111111111111113, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar111116 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar111116;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    } else {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i4111111111111111111111114 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111111111111111111111114, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar111117 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar111117;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    }
                    dVarF.M();
                    b bVar1112 = bVar5;
                    if (e.k()) {
                        e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                    }
                    int i4111111111111111111111115 = i35;
                    int i4111111111111111111111116 = i37 >> 6;
                    int i4111111111111111111111117 = i37 << 12;
                    int i4111111111111111111111118 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i4111111111111111111111116 & 458752) | (i4111111111111111111111116 & 3670016) | ((i4111111111111111111111115 << 12) & 29360128) | (i4111111111111111111111117 & 234881024) | (i4111111111111111111111117 & 1879048192);
                    int i4111111111111111111111119 = ((i37 >> 9) & 14) | 3072 | (i4111111111111111111111115 & 112);
                    int i41111111111111111111111110 = i4111111111111111111111115 << 6;
                    LazyLayoutPagerKt.f(bVar1112, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i4111111111111111111111118, i4111111111111111111111119 | (i41111111111111111111111110 & 896) | (i4111111111111111111111116 & 57344) | ((i4111111111111111111111115 << 9) & 458752) | (i41111111111111111111111110 & 3670016), 0);
                    if (e.k()) {
                        e.n();
                    }
                    int i41111111111111111111111111 = i36;
                    omcVar2 = omcVar3;
                    i12 = i41111111111111111111111111;
                    float f1111 = f4;
                    z4 = z6;
                    f3 = f1111;
                    tc.c cVar119 = cVarI;
                    zv8Var2 = zv8VarD;
                    cVar2 = cVar119;
                    Function1<? super Integer, ? extends Object> function1111 = function4;
                    re8Var2 = re8Var3;
                    function2 = function1111;
                    fVar2 = fVar4;
                    jVar2 = jVar4;
                    r10 = r3;
                    rx8Var2 = rx8Var3;
                    bVar3 = bVar1112;
                } else {
                    dVarF = dVarF;
                    dVarF.q();
                    rx8Var2 = rx8Var;
                    fVar2 = fVar;
                    z4 = z;
                    r10 = z2;
                    function2 = function1;
                    re8Var2 = re8Var;
                    jVar2 = jVar;
                    f3 = f2;
                    bVar3 = bVar2;
                    cVar2 = cVarI;
                    omcVar2 = omcVarB;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                        public final Object invoke(Object obj, Object obj2) {
                            return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i28 = i26 | 384;
            if ((i3 & 3072) != 0) {
                if ((i4 & 8192) == 0) {
                    i9 = 2048;
                }
                i28 |= i9;
            }
            if ((i3 & 24576) != 0) {
                i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
            }
            i30 = i28;
            if ((i21 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (dVarF.g(z3, i21 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i38 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i6 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var;
                    }
                    if (i8 != 0) {
                        fVar3 = f.a.a;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i11 != 0) {
                        i31 = 0;
                    } else {
                        i31 = i12;
                    }
                    if (i14 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if (i16 != 0) {
                        cVarI = tc.INSTANCE.i();
                    }
                    if ((i4 & 128) != 0) {
                        int i41111111111111111111111112 = (i21 & 14) | 196608;
                        i33 = i30;
                        pagerState2 = pagerState;
                        i21 &= -29360129;
                        i32 = 0;
                        omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111111111111111111111112, 30);
                    } else {
                        pagerState2 = pagerState;
                        i32 = 0;
                        i33 = i30;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        r0 = i32;
                    } else {
                        r0 = z2;
                    }
                    if (i23 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if ((i4 & 2048) != 0) {
                        re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                        i34 = i33 & (-113);
                    } else {
                        re8VarD = re8Var;
                        i34 = i33;
                    }
                    if (i27 != 0) {
                        jVar3 = j.b.a;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i4 & 8192) != 0) {
                        j jVar111118 = jVar3;
                        zv8VarD = cw8.d(dVarF, i32);
                        i35 = i34 & (-7169);
                        omcVar3 = omcVarB;
                        jVar4 = jVar111118;
                        function4 = function3;
                        re8Var3 = re8VarD;
                        rx8Var3 = rx8VarE;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        bVar5 = bVar4;
                    } else {
                        function4 = function3;
                        re8Var3 = re8VarD;
                        i35 = i34;
                        rx8Var3 = rx8VarE;
                        omcVar3 = omcVarB;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        jVar4 = jVar3;
                        bVar5 = bVar4;
                        zv8VarD = zv8Var;
                    }
                } else {
                    if (i38 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i6 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var;
                    }
                    if (i8 != 0) {
                        fVar3 = f.a.a;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i11 != 0) {
                        i31 = 0;
                    } else {
                        i31 = i12;
                    }
                    if (i14 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if (i16 != 0) {
                        cVarI = tc.INSTANCE.i();
                    }
                    if ((i4 & 128) != 0) {
                        int i41111111111111111111111113 = (i21 & 14) | 196608;
                        i33 = i30;
                        pagerState2 = pagerState;
                        i21 &= -29360129;
                        i32 = 0;
                        omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111111111111111111111113, 30);
                    } else {
                        pagerState2 = pagerState;
                        i32 = 0;
                        i33 = i30;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        r0 = i32;
                    } else {
                        r0 = z2;
                    }
                    if (i23 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if ((i4 & 2048) != 0) {
                        re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                        i34 = i33 & (-113);
                    } else {
                        re8VarD = re8Var;
                        i34 = i33;
                    }
                    if (i27 != 0) {
                        jVar3 = j.b.a;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i4 & 8192) != 0) {
                        j jVar111119 = jVar3;
                        zv8VarD = cw8.d(dVarF, i32);
                        i35 = i34 & (-7169);
                        omcVar3 = omcVarB;
                        jVar4 = jVar111119;
                        function4 = function3;
                        re8Var3 = re8VarD;
                        rx8Var3 = rx8VarE;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        bVar5 = bVar4;
                    } else {
                        function4 = function3;
                        re8Var3 = re8VarD;
                        i35 = i34;
                        rx8Var3 = rx8VarE;
                        omcVar3 = omcVarB;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        jVar4 = jVar3;
                        bVar5 = bVar4;
                        zv8VarD = zv8Var;
                    }
                }
                dVarF.M();
                b bVar1113 = bVar5;
                if (e.k()) {
                    e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                }
                int i41111111111111111111111114 = i35;
                int i41111111111111111111111115 = i37 >> 6;
                int i41111111111111111111111116 = i37 << 12;
                int i41111111111111111111111117 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i41111111111111111111111115 & 458752) | (i41111111111111111111111115 & 3670016) | ((i41111111111111111111111114 << 12) & 29360128) | (i41111111111111111111111116 & 234881024) | (i41111111111111111111111116 & 1879048192);
                int i41111111111111111111111118 = ((i37 >> 9) & 14) | 3072 | (i41111111111111111111111114 & 112);
                int i41111111111111111111111119 = i41111111111111111111111114 << 6;
                LazyLayoutPagerKt.f(bVar1113, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i41111111111111111111111117, i41111111111111111111111118 | (i41111111111111111111111119 & 896) | (i41111111111111111111111115 & 57344) | ((i41111111111111111111111114 << 9) & 458752) | (i41111111111111111111111119 & 3670016), 0);
                if (e.k()) {
                    e.n();
                }
                int i411111111111111111111111110 = i36;
                omcVar2 = omcVar3;
                i12 = i411111111111111111111111110;
                float f1112 = f4;
                z4 = z6;
                f3 = f1112;
                tc.c cVar1110 = cVarI;
                zv8Var2 = zv8VarD;
                cVar2 = cVar1110;
                Function1<? super Integer, ? extends Object> function1112 = function4;
                re8Var2 = re8Var3;
                function2 = function1112;
                fVar2 = fVar4;
                jVar2 = jVar4;
                r10 = r3;
                rx8Var2 = rx8Var3;
                bVar3 = bVar1113;
            } else {
                dVarF = dVarF;
                dVarF.q();
                rx8Var2 = rx8Var;
                fVar2 = fVar;
                z4 = z;
                r10 = z2;
                function2 = function1;
                re8Var2 = re8Var;
                jVar2 = jVar;
                f3 = f2;
                bVar3 = bVar2;
                cVar2 = cVarI;
                omcVar2 = omcVarB;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                    public final Object invoke(Object obj, Object obj2) {
                        return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 3072;
        i11 = i4 & 16;
        if (i11 != 0) {
            if ((i2 & 24576) == 0) {
                i12 = i;
                if (dVarF.C(i12)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i5 |= i13;
            }
            i14 = i4 & 32;
            if (i14 != 0) {
                i5 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i2 & 196608) == 0) {
                    if (dVarF.B(f2)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i5 |= i15;
                }
            }
            i16 = i4 & 64;
            if (i16 != 0) {
                i5 |= 1572864;
                cVarI = cVar;
            } else {
                cVarI = cVar;
                if ((i2 & 1572864) == 0) {
                    if (dVarF.x(cVarI)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i5 |= i17;
                }
            }
            if ((i2 & 12582912) == 0) {
                if ((i4 & 128) == 0) {
                    omcVarB = omcVar;
                    if (dVarF.x(omcVarB)) {
                    }
                    i5 |= i39;
                } else {
                    omcVarB = omcVar;
                }
                i5 |= i39;
            } else {
                omcVarB = omcVar;
            }
            i18 = i4 & 256;
            if (i18 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (dVarF.A(z)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i5 |= i19;
            }
            i20 = i4 & 512;
            if (i20 != 0) {
                i21 = i5 | 805306368;
                i20 = i20;
            } else {
                if ((i2 & 805306368) != 0) {
                    if (dVarF.A(z2)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i5 |= i22;
                }
                i21 = i5;
            }
            i23 = i4 & 1024;
            if (i23 != 0) {
                i24 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (dVarF.T(function1)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i3 | i25;
            } else {
                i24 = i3;
            }
            if ((i3 & 48) != 0) {
                i24 |= ((i4 & 2048) == 0 || !dVarF.T(re8Var)) ? 16 : 32;
            }
            i26 = i24;
            i27 = i4 & 4096;
            if (i27 != 0) {
                i28 = i26;
                if ((i3 & 384) == 0) {
                    if (dVarF.x(jVar)) {
                        i29 = 256;
                    } else {
                        i29 = 128;
                    }
                    i28 |= i29;
                }
                if ((i3 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i9 = 2048;
                    }
                    i28 |= i9;
                }
                if ((i3 & 24576) != 0) {
                    i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
                }
                i30 = i28;
                if ((i21 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (dVarF.g(z3, i21 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i411111111111111111111111111 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i411111111111111111111111111, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar1111110 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar1111110;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    } else {
                        if (i38 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i6 != 0) {
                            rx8VarE = nx8.e(ff3.i(0));
                        } else {
                            rx8VarE = rx8Var;
                        }
                        if (i8 != 0) {
                            fVar3 = f.a.a;
                        } else {
                            fVar3 = fVar;
                        }
                        if (i11 != 0) {
                            i31 = 0;
                        } else {
                            i31 = i12;
                        }
                        if (i14 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if (i16 != 0) {
                            cVarI = tc.INSTANCE.i();
                        }
                        if ((i4 & 128) != 0) {
                            int i411111111111111111111111112 = (i21 & 14) | 196608;
                            i33 = i30;
                            pagerState2 = pagerState;
                            i21 &= -29360129;
                            i32 = 0;
                            omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i411111111111111111111111112, 30);
                        } else {
                            pagerState2 = pagerState;
                            i32 = 0;
                            i33 = i30;
                        }
                        if (i18 == 0) {
                        }
                        if (i20 != 0) {
                            r0 = i32;
                        } else {
                            r0 = z2;
                        }
                        if (i23 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if ((i4 & 2048) != 0) {
                            re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                            i34 = i33 & (-113);
                        } else {
                            re8VarD = re8Var;
                            i34 = i33;
                        }
                        if (i27 != 0) {
                            jVar3 = j.b.a;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i4 & 8192) != 0) {
                            j jVar1111111 = jVar3;
                            zv8VarD = cw8.d(dVarF, i32);
                            i35 = i34 & (-7169);
                            omcVar3 = omcVarB;
                            jVar4 = jVar1111111;
                            function4 = function3;
                            re8Var3 = re8VarD;
                            rx8Var3 = rx8VarE;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            bVar5 = bVar4;
                        } else {
                            function4 = function3;
                            re8Var3 = re8VarD;
                            i35 = i34;
                            rx8Var3 = rx8VarE;
                            omcVar3 = omcVarB;
                            fVar4 = fVar3;
                            z6 = z5;
                            i36 = i31;
                            f4 = fI;
                            i37 = i21;
                            r3 = r0;
                            jVar4 = jVar3;
                            bVar5 = bVar4;
                            zv8VarD = zv8Var;
                        }
                    }
                    dVarF.M();
                    b bVar1114 = bVar5;
                    if (e.k()) {
                        e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                    }
                    int i411111111111111111111111113 = i35;
                    int i411111111111111111111111114 = i37 >> 6;
                    int i411111111111111111111111115 = i37 << 12;
                    int i411111111111111111111111116 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i411111111111111111111111114 & 458752) | (i411111111111111111111111114 & 3670016) | ((i411111111111111111111111113 << 12) & 29360128) | (i411111111111111111111111115 & 234881024) | (i411111111111111111111111115 & 1879048192);
                    int i411111111111111111111111117 = ((i37 >> 9) & 14) | 3072 | (i411111111111111111111111113 & 112);
                    int i411111111111111111111111118 = i411111111111111111111111113 << 6;
                    LazyLayoutPagerKt.f(bVar1114, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i411111111111111111111111116, i411111111111111111111111117 | (i411111111111111111111111118 & 896) | (i411111111111111111111111114 & 57344) | ((i411111111111111111111111113 << 9) & 458752) | (i411111111111111111111111118 & 3670016), 0);
                    if (e.k()) {
                        e.n();
                    }
                    int i411111111111111111111111119 = i36;
                    omcVar2 = omcVar3;
                    i12 = i411111111111111111111111119;
                    float f1113 = f4;
                    z4 = z6;
                    f3 = f1113;
                    tc.c cVar1111 = cVarI;
                    zv8Var2 = zv8VarD;
                    cVar2 = cVar1111;
                    Function1<? super Integer, ? extends Object> function1113 = function4;
                    re8Var2 = re8Var3;
                    function2 = function1113;
                    fVar2 = fVar4;
                    jVar2 = jVar4;
                    r10 = r3;
                    rx8Var2 = rx8Var3;
                    bVar3 = bVar1114;
                } else {
                    dVarF = dVarF;
                    dVarF.q();
                    rx8Var2 = rx8Var;
                    fVar2 = fVar;
                    z4 = z;
                    r10 = z2;
                    function2 = function1;
                    re8Var2 = re8Var;
                    jVar2 = jVar;
                    f3 = f2;
                    bVar3 = bVar2;
                    cVar2 = cVarI;
                    omcVar2 = omcVarB;
                    zv8Var2 = zv8Var;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                        public final Object invoke(Object obj, Object obj2) {
                            return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i28 = i26 | 384;
            if ((i3 & 3072) != 0) {
                if ((i4 & 8192) == 0) {
                    i9 = 2048;
                }
                i28 |= i9;
            }
            if ((i3 & 24576) != 0) {
                i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
            }
            i30 = i28;
            if ((i21 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (dVarF.g(z3, i21 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i38 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i6 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var;
                    }
                    if (i8 != 0) {
                        fVar3 = f.a.a;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i11 != 0) {
                        i31 = 0;
                    } else {
                        i31 = i12;
                    }
                    if (i14 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if (i16 != 0) {
                        cVarI = tc.INSTANCE.i();
                    }
                    if ((i4 & 128) != 0) {
                        int i4111111111111111111111111110 = (i21 & 14) | 196608;
                        i33 = i30;
                        pagerState2 = pagerState;
                        i21 &= -29360129;
                        i32 = 0;
                        omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111111111111111111111111110, 30);
                    } else {
                        pagerState2 = pagerState;
                        i32 = 0;
                        i33 = i30;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        r0 = i32;
                    } else {
                        r0 = z2;
                    }
                    if (i23 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if ((i4 & 2048) != 0) {
                        re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                        i34 = i33 & (-113);
                    } else {
                        re8VarD = re8Var;
                        i34 = i33;
                    }
                    if (i27 != 0) {
                        jVar3 = j.b.a;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i4 & 8192) != 0) {
                        j jVar1111112 = jVar3;
                        zv8VarD = cw8.d(dVarF, i32);
                        i35 = i34 & (-7169);
                        omcVar3 = omcVarB;
                        jVar4 = jVar1111112;
                        function4 = function3;
                        re8Var3 = re8VarD;
                        rx8Var3 = rx8VarE;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        bVar5 = bVar4;
                    } else {
                        function4 = function3;
                        re8Var3 = re8VarD;
                        i35 = i34;
                        rx8Var3 = rx8VarE;
                        omcVar3 = omcVarB;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        jVar4 = jVar3;
                        bVar5 = bVar4;
                        zv8VarD = zv8Var;
                    }
                } else {
                    if (i38 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i6 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var;
                    }
                    if (i8 != 0) {
                        fVar3 = f.a.a;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i11 != 0) {
                        i31 = 0;
                    } else {
                        i31 = i12;
                    }
                    if (i14 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if (i16 != 0) {
                        cVarI = tc.INSTANCE.i();
                    }
                    if ((i4 & 128) != 0) {
                        int i4111111111111111111111111111 = (i21 & 14) | 196608;
                        i33 = i30;
                        pagerState2 = pagerState;
                        i21 &= -29360129;
                        i32 = 0;
                        omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111111111111111111111111111, 30);
                    } else {
                        pagerState2 = pagerState;
                        i32 = 0;
                        i33 = i30;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        r0 = i32;
                    } else {
                        r0 = z2;
                    }
                    if (i23 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if ((i4 & 2048) != 0) {
                        re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                        i34 = i33 & (-113);
                    } else {
                        re8VarD = re8Var;
                        i34 = i33;
                    }
                    if (i27 != 0) {
                        jVar3 = j.b.a;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i4 & 8192) != 0) {
                        j jVar1111113 = jVar3;
                        zv8VarD = cw8.d(dVarF, i32);
                        i35 = i34 & (-7169);
                        omcVar3 = omcVarB;
                        jVar4 = jVar1111113;
                        function4 = function3;
                        re8Var3 = re8VarD;
                        rx8Var3 = rx8VarE;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        bVar5 = bVar4;
                    } else {
                        function4 = function3;
                        re8Var3 = re8VarD;
                        i35 = i34;
                        rx8Var3 = rx8VarE;
                        omcVar3 = omcVarB;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        jVar4 = jVar3;
                        bVar5 = bVar4;
                        zv8VarD = zv8Var;
                    }
                }
                dVarF.M();
                b bVar1115 = bVar5;
                if (e.k()) {
                    e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                }
                int i4111111111111111111111111112 = i35;
                int i4111111111111111111111111113 = i37 >> 6;
                int i4111111111111111111111111114 = i37 << 12;
                int i4111111111111111111111111115 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i4111111111111111111111111113 & 458752) | (i4111111111111111111111111113 & 3670016) | ((i4111111111111111111111111112 << 12) & 29360128) | (i4111111111111111111111111114 & 234881024) | (i4111111111111111111111111114 & 1879048192);
                int i4111111111111111111111111116 = ((i37 >> 9) & 14) | 3072 | (i4111111111111111111111111112 & 112);
                int i4111111111111111111111111117 = i4111111111111111111111111112 << 6;
                LazyLayoutPagerKt.f(bVar1115, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i4111111111111111111111111115, i4111111111111111111111111116 | (i4111111111111111111111111117 & 896) | (i4111111111111111111111111113 & 57344) | ((i4111111111111111111111111112 << 9) & 458752) | (i4111111111111111111111111117 & 3670016), 0);
                if (e.k()) {
                    e.n();
                }
                int i4111111111111111111111111118 = i36;
                omcVar2 = omcVar3;
                i12 = i4111111111111111111111111118;
                float f1114 = f4;
                z4 = z6;
                f3 = f1114;
                tc.c cVar1112 = cVarI;
                zv8Var2 = zv8VarD;
                cVar2 = cVar1112;
                Function1<? super Integer, ? extends Object> function1114 = function4;
                re8Var2 = re8Var3;
                function2 = function1114;
                fVar2 = fVar4;
                jVar2 = jVar4;
                r10 = r3;
                rx8Var2 = rx8Var3;
                bVar3 = bVar1115;
            } else {
                dVarF = dVarF;
                dVarF.q();
                rx8Var2 = rx8Var;
                fVar2 = fVar;
                z4 = z;
                r10 = z2;
                function2 = function1;
                re8Var2 = re8Var;
                jVar2 = jVar;
                f3 = f2;
                bVar3 = bVar2;
                cVar2 = cVarI;
                omcVar2 = omcVarB;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                    public final Object invoke(Object obj, Object obj2) {
                        return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 24576;
        i12 = i;
        i14 = i4 & 32;
        if (i14 != 0) {
            i5 |= 196608;
            f2 = f;
        } else {
            f2 = f;
            if ((i2 & 196608) == 0) {
                if (dVarF.B(f2)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i5 |= i15;
            }
        }
        i16 = i4 & 64;
        if (i16 != 0) {
            i5 |= 1572864;
            cVarI = cVar;
        } else {
            cVarI = cVar;
            if ((i2 & 1572864) == 0) {
                if (dVarF.x(cVarI)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i5 |= i17;
            }
        }
        if ((i2 & 12582912) == 0) {
            if ((i4 & 128) == 0) {
                omcVarB = omcVar;
                if (dVarF.x(omcVarB)) {
                }
                i5 |= i39;
            } else {
                omcVarB = omcVar;
            }
            i5 |= i39;
        } else {
            omcVarB = omcVar;
        }
        i18 = i4 & 256;
        if (i18 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (dVarF.A(z)) {
                i19 = 67108864;
            } else {
                i19 = 33554432;
            }
            i5 |= i19;
        }
        i20 = i4 & 512;
        if (i20 != 0) {
            i21 = i5 | 805306368;
            i20 = i20;
        } else {
            if ((i2 & 805306368) != 0) {
                if (dVarF.A(z2)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i5 |= i22;
            }
            i21 = i5;
        }
        i23 = i4 & 1024;
        if (i23 != 0) {
            i24 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (dVarF.T(function1)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i24 = i3 | i25;
        } else {
            i24 = i3;
        }
        if ((i3 & 48) != 0) {
            i24 |= ((i4 & 2048) == 0 || !dVarF.T(re8Var)) ? 16 : 32;
        }
        i26 = i24;
        i27 = i4 & 4096;
        if (i27 != 0) {
            i28 = i26;
            if ((i3 & 384) == 0) {
                if (dVarF.x(jVar)) {
                    i29 = 256;
                } else {
                    i29 = 128;
                }
                i28 |= i29;
            }
            if ((i3 & 3072) != 0) {
                if ((i4 & 8192) == 0) {
                    i9 = 2048;
                }
                i28 |= i9;
            }
            if ((i3 & 24576) != 0) {
                i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
            }
            i30 = i28;
            if ((i21 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (dVarF.g(z3, i21 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i38 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i6 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var;
                    }
                    if (i8 != 0) {
                        fVar3 = f.a.a;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i11 != 0) {
                        i31 = 0;
                    } else {
                        i31 = i12;
                    }
                    if (i14 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if (i16 != 0) {
                        cVarI = tc.INSTANCE.i();
                    }
                    if ((i4 & 128) != 0) {
                        int i4111111111111111111111111119 = (i21 & 14) | 196608;
                        i33 = i30;
                        pagerState2 = pagerState;
                        i21 &= -29360129;
                        i32 = 0;
                        omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i4111111111111111111111111119, 30);
                    } else {
                        pagerState2 = pagerState;
                        i32 = 0;
                        i33 = i30;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        r0 = i32;
                    } else {
                        r0 = z2;
                    }
                    if (i23 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if ((i4 & 2048) != 0) {
                        re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                        i34 = i33 & (-113);
                    } else {
                        re8VarD = re8Var;
                        i34 = i33;
                    }
                    if (i27 != 0) {
                        jVar3 = j.b.a;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i4 & 8192) != 0) {
                        j jVar1111114 = jVar3;
                        zv8VarD = cw8.d(dVarF, i32);
                        i35 = i34 & (-7169);
                        omcVar3 = omcVarB;
                        jVar4 = jVar1111114;
                        function4 = function3;
                        re8Var3 = re8VarD;
                        rx8Var3 = rx8VarE;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        bVar5 = bVar4;
                    } else {
                        function4 = function3;
                        re8Var3 = re8VarD;
                        i35 = i34;
                        rx8Var3 = rx8VarE;
                        omcVar3 = omcVarB;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        jVar4 = jVar3;
                        bVar5 = bVar4;
                        zv8VarD = zv8Var;
                    }
                } else {
                    if (i38 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i6 != 0) {
                        rx8VarE = nx8.e(ff3.i(0));
                    } else {
                        rx8VarE = rx8Var;
                    }
                    if (i8 != 0) {
                        fVar3 = f.a.a;
                    } else {
                        fVar3 = fVar;
                    }
                    if (i11 != 0) {
                        i31 = 0;
                    } else {
                        i31 = i12;
                    }
                    if (i14 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if (i16 != 0) {
                        cVarI = tc.INSTANCE.i();
                    }
                    if ((i4 & 128) != 0) {
                        int i41111111111111111111111111110 = (i21 & 14) | 196608;
                        i33 = i30;
                        pagerState2 = pagerState;
                        i21 &= -29360129;
                        i32 = 0;
                        omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111111111111111111111111110, 30);
                    } else {
                        pagerState2 = pagerState;
                        i32 = 0;
                        i33 = i30;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        r0 = i32;
                    } else {
                        r0 = z2;
                    }
                    if (i23 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if ((i4 & 2048) != 0) {
                        re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                        i34 = i33 & (-113);
                    } else {
                        re8VarD = re8Var;
                        i34 = i33;
                    }
                    if (i27 != 0) {
                        jVar3 = j.b.a;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i4 & 8192) != 0) {
                        j jVar1111115 = jVar3;
                        zv8VarD = cw8.d(dVarF, i32);
                        i35 = i34 & (-7169);
                        omcVar3 = omcVarB;
                        jVar4 = jVar1111115;
                        function4 = function3;
                        re8Var3 = re8VarD;
                        rx8Var3 = rx8VarE;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        bVar5 = bVar4;
                    } else {
                        function4 = function3;
                        re8Var3 = re8VarD;
                        i35 = i34;
                        rx8Var3 = rx8VarE;
                        omcVar3 = omcVarB;
                        fVar4 = fVar3;
                        z6 = z5;
                        i36 = i31;
                        f4 = fI;
                        i37 = i21;
                        r3 = r0;
                        jVar4 = jVar3;
                        bVar5 = bVar4;
                        zv8VarD = zv8Var;
                    }
                }
                dVarF.M();
                b bVar1116 = bVar5;
                if (e.k()) {
                    e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
                }
                int i41111111111111111111111111111 = i35;
                int i41111111111111111111111111112 = i37 >> 6;
                int i41111111111111111111111111113 = i37 << 12;
                int i41111111111111111111111111114 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i41111111111111111111111111112 & 458752) | (i41111111111111111111111111112 & 3670016) | ((i41111111111111111111111111111 << 12) & 29360128) | (i41111111111111111111111111113 & 234881024) | (i41111111111111111111111111113 & 1879048192);
                int i41111111111111111111111111115 = ((i37 >> 9) & 14) | 3072 | (i41111111111111111111111111111 & 112);
                int i41111111111111111111111111116 = i41111111111111111111111111111 << 6;
                LazyLayoutPagerKt.f(bVar1116, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i41111111111111111111111111114, i41111111111111111111111111115 | (i41111111111111111111111111116 & 896) | (i41111111111111111111111111112 & 57344) | ((i41111111111111111111111111111 << 9) & 458752) | (i41111111111111111111111111116 & 3670016), 0);
                if (e.k()) {
                    e.n();
                }
                int i41111111111111111111111111117 = i36;
                omcVar2 = omcVar3;
                i12 = i41111111111111111111111111117;
                float f1115 = f4;
                z4 = z6;
                f3 = f1115;
                tc.c cVar1113 = cVarI;
                zv8Var2 = zv8VarD;
                cVar2 = cVar1113;
                Function1<? super Integer, ? extends Object> function1115 = function4;
                re8Var2 = re8Var3;
                function2 = function1115;
                fVar2 = fVar4;
                jVar2 = jVar4;
                r10 = r3;
                rx8Var2 = rx8Var3;
                bVar3 = bVar1116;
            } else {
                dVarF = dVarF;
                dVarF.q();
                rx8Var2 = rx8Var;
                fVar2 = fVar;
                z4 = z;
                r10 = z2;
                function2 = function1;
                re8Var2 = re8Var;
                jVar2 = jVar;
                f3 = f2;
                bVar3 = bVar2;
                cVar2 = cVarI;
                omcVar2 = omcVarB;
                zv8Var2 = zv8Var;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                    public final Object invoke(Object obj, Object obj2) {
                        return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i28 = i26 | 384;
        if ((i3 & 3072) != 0) {
            if ((i4 & 8192) == 0) {
                i9 = 2048;
            }
            i28 |= i9;
        }
        if ((i3 & 24576) != 0) {
            i28 |= dVarF.T(rs4Var) ? 16384 : 8192;
        }
        i30 = i28;
        if ((i21 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (dVarF.g(z3, i21 & 1)) {
            dVarF.U();
            if ((i2 & 1) != 0) {
                if (i38 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i6 != 0) {
                    rx8VarE = nx8.e(ff3.i(0));
                } else {
                    rx8VarE = rx8Var;
                }
                if (i8 != 0) {
                    fVar3 = f.a.a;
                } else {
                    fVar3 = fVar;
                }
                if (i11 != 0) {
                    i31 = 0;
                } else {
                    i31 = i12;
                }
                if (i14 != 0) {
                    fI = ff3.i(0);
                } else {
                    fI = f2;
                }
                if (i16 != 0) {
                    cVarI = tc.INSTANCE.i();
                }
                if ((i4 & 128) != 0) {
                    int i41111111111111111111111111118 = (i21 & 14) | 196608;
                    i33 = i30;
                    pagerState2 = pagerState;
                    i21 &= -29360129;
                    i32 = 0;
                    omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111111111111111111111111118, 30);
                } else {
                    pagerState2 = pagerState;
                    i32 = 0;
                    i33 = i30;
                }
                if (i18 == 0) {
                }
                if (i20 != 0) {
                    r0 = i32;
                } else {
                    r0 = z2;
                }
                if (i23 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if ((i4 & 2048) != 0) {
                    re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                    i34 = i33 & (-113);
                } else {
                    re8VarD = re8Var;
                    i34 = i33;
                }
                if (i27 != 0) {
                    jVar3 = j.b.a;
                } else {
                    jVar3 = jVar;
                }
                if ((i4 & 8192) != 0) {
                    j jVar1111116 = jVar3;
                    zv8VarD = cw8.d(dVarF, i32);
                    i35 = i34 & (-7169);
                    omcVar3 = omcVarB;
                    jVar4 = jVar1111116;
                    function4 = function3;
                    re8Var3 = re8VarD;
                    rx8Var3 = rx8VarE;
                    fVar4 = fVar3;
                    z6 = z5;
                    i36 = i31;
                    f4 = fI;
                    i37 = i21;
                    r3 = r0;
                    bVar5 = bVar4;
                } else {
                    function4 = function3;
                    re8Var3 = re8VarD;
                    i35 = i34;
                    rx8Var3 = rx8VarE;
                    omcVar3 = omcVarB;
                    fVar4 = fVar3;
                    z6 = z5;
                    i36 = i31;
                    f4 = fI;
                    i37 = i21;
                    r3 = r0;
                    jVar4 = jVar3;
                    bVar5 = bVar4;
                    zv8VarD = zv8Var;
                }
            } else {
                if (i38 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i6 != 0) {
                    rx8VarE = nx8.e(ff3.i(0));
                } else {
                    rx8VarE = rx8Var;
                }
                if (i8 != 0) {
                    fVar3 = f.a.a;
                } else {
                    fVar3 = fVar;
                }
                if (i11 != 0) {
                    i31 = 0;
                } else {
                    i31 = i12;
                }
                if (i14 != 0) {
                    fI = ff3.i(0);
                } else {
                    fI = f2;
                }
                if (i16 != 0) {
                    cVarI = tc.INSTANCE.i();
                }
                if ((i4 & 128) != 0) {
                    int i41111111111111111111111111119 = (i21 & 14) | 196608;
                    i33 = i30;
                    pagerState2 = pagerState;
                    i21 &= -29360129;
                    i32 = 0;
                    omcVarB = oy8.a.b(pagerState2, null, null, null, 0.0f, dVarF, i41111111111111111111111111119, 30);
                } else {
                    pagerState2 = pagerState;
                    i32 = 0;
                    i33 = i30;
                }
                if (i18 == 0) {
                }
                if (i20 != 0) {
                    r0 = i32;
                } else {
                    r0 = z2;
                }
                if (i23 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if ((i4 & 2048) != 0) {
                    re8VarD = oy8.a.d(pagerState2, Orientation.Horizontal, dVarF, (i21 & 14) | 432);
                    i34 = i33 & (-113);
                } else {
                    re8VarD = re8Var;
                    i34 = i33;
                }
                if (i27 != 0) {
                    jVar3 = j.b.a;
                } else {
                    jVar3 = jVar;
                }
                if ((i4 & 8192) != 0) {
                    j jVar1111117 = jVar3;
                    zv8VarD = cw8.d(dVarF, i32);
                    i35 = i34 & (-7169);
                    omcVar3 = omcVarB;
                    jVar4 = jVar1111117;
                    function4 = function3;
                    re8Var3 = re8VarD;
                    rx8Var3 = rx8VarE;
                    fVar4 = fVar3;
                    z6 = z5;
                    i36 = i31;
                    f4 = fI;
                    i37 = i21;
                    r3 = r0;
                    bVar5 = bVar4;
                } else {
                    function4 = function3;
                    re8Var3 = re8VarD;
                    i35 = i34;
                    rx8Var3 = rx8VarE;
                    omcVar3 = omcVarB;
                    fVar4 = fVar3;
                    z6 = z5;
                    i36 = i31;
                    f4 = fI;
                    i37 = i21;
                    r3 = r0;
                    jVar4 = jVar3;
                    bVar5 = bVar4;
                    zv8VarD = zv8Var;
                }
            }
            dVarF.M();
            b bVar1117 = bVar5;
            if (e.k()) {
                e.o(1860873769, i37, i35, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:132)");
            }
            int i411111111111111111111111111110 = i35;
            int i411111111111111111111111111111 = i37 >> 6;
            int i411111111111111111111111111112 = i37 << 12;
            int i411111111111111111111111111113 = ((i37 >> 3) & 14) | 24576 | ((i37 << 3) & 112) | (i37 & 896) | ((i37 >> 18) & 7168) | (i411111111111111111111111111111 & 458752) | (i411111111111111111111111111111 & 3670016) | ((i411111111111111111111111111110 << 12) & 29360128) | (i411111111111111111111111111112 & 234881024) | (i411111111111111111111111111112 & 1879048192);
            int i411111111111111111111111111114 = ((i37 >> 9) & 14) | 3072 | (i411111111111111111111111111110 & 112);
            int i411111111111111111111111111115 = i411111111111111111111111111110 << 6;
            LazyLayoutPagerKt.f(bVar1117, pagerState, rx8Var3, r3, Orientation.Horizontal, omcVar3, z6, zv8VarD, i36, f4, fVar4, re8Var3, function4, tc.INSTANCE.g(), cVarI, jVar4, rs4Var, dVarF, i411111111111111111111111111113, i411111111111111111111111111114 | (i411111111111111111111111111115 & 896) | (i411111111111111111111111111111 & 57344) | ((i411111111111111111111111111110 << 9) & 458752) | (i411111111111111111111111111115 & 3670016), 0);
            if (e.k()) {
                e.n();
            }
            int i411111111111111111111111111116 = i36;
            omcVar2 = omcVar3;
            i12 = i411111111111111111111111111116;
            float f1116 = f4;
            z4 = z6;
            f3 = f1116;
            tc.c cVar1114 = cVarI;
            zv8Var2 = zv8VarD;
            cVar2 = cVar1114;
            Function1<? super Integer, ? extends Object> function1116 = function4;
            re8Var2 = re8Var3;
            function2 = function1116;
            fVar2 = fVar4;
            jVar2 = jVar4;
            r10 = r3;
            rx8Var2 = rx8Var3;
            bVar3 = bVar1117;
        } else {
            dVarF = dVarF;
            dVarF.q();
            rx8Var2 = rx8Var;
            fVar2 = fVar;
            z4 = z;
            r10 = z2;
            function2 = function1;
            re8Var2 = re8Var;
            jVar2 = jVar;
            f3 = f2;
            bVar3 = bVar2;
            cVar2 = cVarI;
            omcVar2 = omcVarB;
            zv8Var2 = zv8Var;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.qy8
                public final Object invoke(Object obj, Object obj2) {
                    return PagerKt.h(pagerState, bVar3, rx8Var2, fVar2, i12, f3, cVar2, omcVar2, z4, r10, function2, re8Var2, jVar2, zv8Var2, rs4Var, i2, i3, i4, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(PagerState pagerState, b bVar, rx8 rx8Var, f fVar, int i, float f, tc.c cVar, omc omcVar, boolean z, boolean z2, Function1 function1, re8 re8Var, j jVar, zv8 zv8Var, rs4 rs4Var, int i2, int i3, int i4, d dVar, int i5) {
        g(pagerState, bVar, rx8Var, fVar, i, f, cVar, omcVar, z, z2, function1, re8Var, jVar, zv8Var, rs4Var, dVar, saa.a(i2 | 1), saa.a(i3), i4);
        return Unit.a;
    }

    public static final int i(j jVar, int i, int i2, int i3, int i4, int i5, int i6, float f, int i7) {
        return sh7.d(jVar.a(i, i2, i4, i5, i6, i7) - (f * (i2 + i3)));
    }

    public static final b j(b bVar, final PagerState pagerState, final boolean z, final ta2 ta2Var, boolean z2) {
        return z2 ? bVar.then(afb.d(b.INSTANCE, false, new Function1() { // from class: com.google.android.ry8
            public final Object invoke(Object obj) {
                return PagerKt.k(z, pagerState, ta2Var, (nfb) obj);
            }
        }, 1, null)) : bVar.then(b.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(boolean z, final PagerState pagerState, final ta2 ta2Var, nfb nfbVar) {
        if (z) {
            SemanticsPropertiesKt.L(nfbVar, null, new Function0() { // from class: com.google.android.sy8
                public final Object invoke() {
                    return Boolean.valueOf(PagerKt.l(pagerState, ta2Var));
                }
            }, 1, null);
            SemanticsPropertiesKt.F(nfbVar, null, new Function0() { // from class: com.google.android.ty8
                public final Object invoke() {
                    return Boolean.valueOf(PagerKt.m(pagerState, ta2Var));
                }
            }, 1, null);
        } else {
            SemanticsPropertiesKt.H(nfbVar, null, new Function0() { // from class: com.google.android.uy8
                public final Object invoke() {
                    return Boolean.valueOf(PagerKt.n(pagerState, ta2Var));
                }
            }, 1, null);
            SemanticsPropertiesKt.J(nfbVar, null, new Function0() { // from class: com.google.android.vy8
                public final Object invoke() {
                    return Boolean.valueOf(PagerKt.o(pagerState, ta2Var));
                }
            }, 1, null);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(PagerState pagerState, ta2 ta2Var) {
        return p(pagerState, ta2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(PagerState pagerState, ta2 ta2Var) {
        return q(pagerState, ta2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(PagerState pagerState, ta2 ta2Var) {
        return p(pagerState, ta2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(PagerState pagerState, ta2 ta2Var) {
        return q(pagerState, ta2Var);
    }

    private static final boolean p(PagerState pagerState, ta2 ta2Var) {
        if (!pagerState.f()) {
            return false;
        }
        rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3, (Object) null);
        return true;
    }

    private static final boolean q(PagerState pagerState, ta2 ta2Var) {
        if (!pagerState.c()) {
            return false;
        }
        rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3, (Object) null);
        return true;
    }
}
