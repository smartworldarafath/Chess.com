package androidx.compose.p002material3;

import androidx.compose.p001foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.p001foundation.gestures.snapping.f;
import androidx.compose.p001foundation.lazy.LazyListState;
import androidx.compose.p002material3.h;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.google.inputmethod.ColorScheme;
import com.google.inputmethod.afb;
import com.google.inputmethod.b21;
import com.google.inputmethod.bj1;
import com.google.inputmethod.bo2;
import com.google.inputmethod.bwb;
import com.google.inputmethod.d08;
import com.google.inputmethod.d57;
import com.google.inputmethod.ddb;
import com.google.inputmethod.de3;
import com.google.inputmethod.ei1;
import com.google.inputmethod.go3;
import com.google.inputmethod.jp2;
import com.google.inputmethod.kh7;
import com.google.inputmethod.nfb;
import com.google.inputmethod.omc;
import com.google.inputmethod.qg4;
import com.google.inputmethod.qxc;
import com.google.inputmethod.rbc;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.ulb;
import com.google.inputmethod.vbc;
import com.google.inputmethod.vn2;
import com.google.inputmethod.vq2;
import com.google.inputmethod.wz9;
import com.google.inputmethod.xa4;
import com.google.inputmethod.xkb;
import com.google.inputmethod.xq2;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u001a\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u00104\u001a\u0002008\u0006¢\u0006\f\n\u0004\b\u001a\u00101\u001a\u0004\b2\u00103R\u0018\u00108\u001a\u00020\u0004*\u0002058AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010<\u001a\u0002098G¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Landroidx/compose/material3/h;", "", "<init>", "()V", "Lcom/google/android/vn2;", "i", "(Landroidx/compose/runtime/d;I)Lcom/google/android/vn2;", "", "yearSelectionSkeleton", "selectedDateSkeleton", "selectedDateDescriptionSkeleton", "Lcom/google/android/bo2;", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/bo2;", "Landroidx/compose/material3/c0;", "displayMode", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/ei1;", "contentColor", "", "g", "(ILandroidx/compose/ui/b;JLandroidx/compose/runtime/d;II)V", "", "selectedDateMillis", "dateFormatter", "d", "(Ljava/lang/Long;ILcom/google/android/bo2;Landroidx/compose/ui/b;JLandroidx/compose/runtime/d;II)V", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Lcom/google/android/vq2;", "", "decayAnimationSpec", "Lcom/google/android/qg4;", "q", "(Landroidx/compose/foundation/lazy/LazyListState;Lcom/google/android/vq2;Landroidx/compose/runtime/d;II)Lcom/google/android/qg4;", "Lkotlin/ranges/IntRange;", "b", "Lkotlin/ranges/IntRange;", "p", "()Lkotlin/ranges/IntRange;", "YearRange", "Lcom/google/android/ff3;", "c", "F", "o", "()F", "TonalElevation", "Lcom/google/android/ddb;", "Lcom/google/android/ddb;", "l", "()Lcom/google/android/ddb;", "AllDates", "Lcom/google/android/yi1;", "m", "(Lcom/google/android/yi1;Landroidx/compose/runtime/d;I)Lcom/google/android/vn2;", "defaultDatePickerColors", "Lcom/google/android/xkb;", "n", "(Landroidx/compose/runtime/d;I)Lcom/google/android/xkb;", "shape", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {
    public static final h a = new h();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final IntRange YearRange = new IntRange(1900, 2100);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float TonalElevation = go3.a.a();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final ddb AllDates = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material3/h$a", "Lcom/google/android/ddb;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements ddb {
        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/material3/h$b", "Lcom/google/android/bwb;", "", "velocity", "decayOffset", "b", "(FF)F", "a", "(F)F", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements bwb {
        private final /* synthetic */ bwb a;

        b(bwb bwbVar) {
            this.a = bwbVar;
        }

        @Override // com.google.inputmethod.bwb
        public float a(float velocity) {
            return this.a.a(velocity);
        }

        @Override // com.google.inputmethod.bwb
        public float b(float velocity, float decayOffset) {
            return 0.0f;
        }
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(String str, nfb nfbVar) {
        SemanticsPropertiesKt.k0(nfbVar, d57.INSTANCE.b());
        SemanticsPropertiesKt.b0(nfbVar, str);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(h hVar, Long l, int i, bo2 bo2Var, androidx.compose.ui.b bVar, long j, int i2, int i3, d dVar, int i4) {
        hVar.d(l, i, bo2Var, bVar, j, dVar, saa.a(i2 | 1), i3);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(h hVar, int i, androidx.compose.ui.b bVar, long j, int i2, int i3, d dVar, int i4) {
        hVar.g(i, bVar, j, dVar, saa.a(i2 | 1), i3);
        return Unit.a;
    }

    public static /* synthetic */ bo2 k(h hVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "yMMMM";
        }
        if ((i & 2) != 0) {
            str2 = "yMMMd";
        }
        if ((i & 4) != 0) {
            str3 = "yMMMMEEEEd";
        }
        return hVar.j(str, str2, str3);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0159  */
    /* JADX WARN: Code duplicated, block: B:101:0x016f  */
    /* JADX WARN: Code duplicated, block: B:103:0x017d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0188  */
    /* JADX WARN: Code duplicated, block: B:107:0x019a  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01de  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:117:0x0209  */
    /* JADX WARN: Code duplicated, block: B:119:0x0213  */
    /* JADX WARN: Code duplicated, block: B:120:0x0229  */
    /* JADX WARN: Code duplicated, block: B:125:0x0256  */
    /* JADX WARN: Code duplicated, block: B:128:0x029c  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02af  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:95:0x0127  */
    /* JADX WARN: Code duplicated, block: B:97:0x0139  */
    /* JADX WARN: Code duplicated, block: B:98:0x014f  */
    public final void d(Long l, final int i, bo2 bo2Var, androidx.compose.ui.b bVar, long j, d dVar, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.b bVar2;
        long headlineContentColor;
        int i5;
        boolean z;
        d dVar2;
        final androidx.compose.ui.b bVar3;
        final long j2;
        s6b s6bVarH;
        androidx.compose.ui.b bVar4;
        int i6;
        long j3;
        androidx.compose.ui.b bVar5;
        String strB;
        String strC;
        String strB2;
        c0.Companion companion;
        final String str;
        boolean zX;
        Object objR;
        c0.Companion companion2;
        c0.Companion companion3;
        final Long l2 = l;
        final bo2 bo2Var2 = bo2Var;
        d dVarF = dVar.F(1913724796);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (dVarF.x(l2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= dVarF.C(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? dVarF.x(bo2Var2) : dVarF.T(bo2Var2) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 == 0) {
            if ((i2 & 3072) == 0) {
                bVar2 = bVar;
                i4 |= dVarF.x(bVar2) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    headlineContentColor = j;
                    int i8 = dVarF.D(headlineContentColor) ? 16384 : 8192;
                    i4 |= i8;
                } else {
                    headlineContentColor = j;
                }
                i4 |= i8;
            } else {
                headlineContentColor = j;
            }
            if ((i3 & 32) != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (dVarF.x(this)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i4 |= i5;
            }
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0 || dVarF.t()) {
                    if (i7 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 16) != 0) {
                        headlineContentColor = i(dVarF, (i4 >> 15) & 14).getHeadlineContentColor();
                        i4 &= -57345;
                    }
                    i6 = i4;
                    j3 = headlineContentColor;
                    bVar5 = bVar4;
                } else {
                    dVarF.q();
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    i6 = i4;
                    j3 = headlineContentColor;
                    bVar5 = bVar2;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(1913724796, i6, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:684)");
                }
                Locale localeA = b21.a(dVarF, 0);
                strB = bo2.b(bo2Var, l2, localeA, false, 4, null);
                bo2Var2 = bo2Var;
                l2 = l2;
                strC = bo2Var2.c(l2, localeA, true);
                strB2 = "";
                if (strC == null) {
                    dVarF.y(380185931);
                    companion3 = c0.INSTANCE;
                    if (c0.f(i, companion3.b())) {
                        dVarF.y(843549871);
                        rbc.Companion companion4 = rbc.INSTANCE;
                        strC = vbc.b(rbc.a(wz9.q), dVarF, 0);
                        dVarF.u();
                    } else if (c0.f(i, companion3.a())) {
                        dVarF.y(843552842);
                        rbc.Companion companion5 = rbc.INSTANCE;
                        strC = vbc.b(rbc.a(wz9.l), dVarF, 0);
                        dVarF.u();
                    } else {
                        dVarF.y(380407362);
                        dVarF.u();
                        strC = "";
                    }
                    dVarF.u();
                } else {
                    dVarF.y(843542258);
                    dVarF.u();
                }
                if (strB == null) {
                    dVarF.y(380507587);
                    companion2 = c0.INSTANCE;
                    if (c0.f(i, companion2.b())) {
                        dVarF.y(843560257);
                        rbc.Companion companion6 = rbc.INSTANCE;
                        strB = vbc.b(rbc.a(wz9.n), dVarF, 0);
                        dVarF.u();
                    } else if (c0.f(i, companion2.a())) {
                        dVarF.y(843562784);
                        rbc.Companion companion7 = rbc.INSTANCE;
                        strB = vbc.b(rbc.a(wz9.f), dVarF, 0);
                        dVarF.u();
                    } else {
                        dVarF.y(380705954);
                        dVarF.u();
                        strB = "";
                    }
                    dVarF.u();
                } else {
                    dVarF.y(843557408);
                    dVarF.u();
                }
                companion = c0.INSTANCE;
                if (c0.f(i, companion.b())) {
                    dVarF.y(843570444);
                    rbc.Companion companion8 = rbc.INSTANCE;
                    strB2 = vbc.b(rbc.a(wz9.o), dVarF, 0);
                    dVarF.u();
                } else if (c0.f(i, companion.a())) {
                    dVarF.y(843573323);
                    rbc.Companion companion9 = rbc.INSTANCE;
                    strB2 = vbc.b(rbc.a(wz9.g), dVarF, 0);
                    dVarF.u();
                } else {
                    dVarF.y(381043234);
                    dVarF.u();
                }
                str = String.format(strB2, Arrays.copyOf(new Object[]{strC}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                zX = dVarF.x(str);
                objR = dVarF.R();
                if (zX || objR == d.INSTANCE.a()) {
                    objR = new Function1() { // from class: com.google.android.wn2
                        public final Object invoke(Object obj) {
                            return h.e(str, (nfb) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                dVar2 = dVarF;
                androidx.compose.ui.b bVar6 = bVar5;
                qxc.j(strB, afb.d(bVar5, false, (Function1) objR, 1, null), j3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, dVar2, (i6 >> 6) & 896, 24576, 245752);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar6;
                j2 = j3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                j2 = headlineContentColor;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.xn2
                    public final Object invoke(Object obj, Object obj2) {
                        return h.f(this.a, l2, i, bo2Var2, bVar3, j2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 3072;
        bVar2 = bVar;
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                headlineContentColor = j;
                if (dVarF.D(headlineContentColor)) {
                }
                i4 |= i8;
            } else {
                headlineContentColor = j;
            }
            i4 |= i8;
        } else {
            headlineContentColor = j;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            if (dVarF.x(this)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i4 |= i5;
        }
        if ((74899 & i4) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i4 & 1)) {
            dVarF.U();
            if ((i2 & 1) != 0) {
                if (i7 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i3 & 16) != 0) {
                    headlineContentColor = i(dVarF, (i4 >> 15) & 14).getHeadlineContentColor();
                    i4 &= -57345;
                }
                i6 = i4;
                j3 = headlineContentColor;
                bVar5 = bVar4;
            } else {
                if (i7 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i3 & 16) != 0) {
                    headlineContentColor = i(dVarF, (i4 >> 15) & 14).getHeadlineContentColor();
                    i4 &= -57345;
                }
                i6 = i4;
                j3 = headlineContentColor;
                bVar5 = bVar4;
            }
            dVarF.M();
            if (e.k()) {
                e.o(1913724796, i6, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:684)");
            }
            Locale localeA2 = b21.a(dVarF, 0);
            strB = bo2.b(bo2Var, l2, localeA2, false, 4, null);
            bo2Var2 = bo2Var;
            l2 = l2;
            strC = bo2Var2.c(l2, localeA2, true);
            strB2 = "";
            if (strC == null) {
                dVarF.y(380185931);
                companion3 = c0.INSTANCE;
                if (c0.f(i, companion3.b())) {
                    dVarF.y(843549871);
                    rbc.Companion companion10 = rbc.INSTANCE;
                    strC = vbc.b(rbc.a(wz9.q), dVarF, 0);
                    dVarF.u();
                } else if (c0.f(i, companion3.a())) {
                    dVarF.y(843552842);
                    rbc.Companion companion11 = rbc.INSTANCE;
                    strC = vbc.b(rbc.a(wz9.l), dVarF, 0);
                    dVarF.u();
                } else {
                    dVarF.y(380407362);
                    dVarF.u();
                    strC = "";
                }
                dVarF.u();
            } else {
                dVarF.y(843542258);
                dVarF.u();
            }
            if (strB == null) {
                dVarF.y(380507587);
                companion2 = c0.INSTANCE;
                if (c0.f(i, companion2.b())) {
                    dVarF.y(843560257);
                    rbc.Companion companion12 = rbc.INSTANCE;
                    strB = vbc.b(rbc.a(wz9.n), dVarF, 0);
                    dVarF.u();
                } else if (c0.f(i, companion2.a())) {
                    dVarF.y(843562784);
                    rbc.Companion companion13 = rbc.INSTANCE;
                    strB = vbc.b(rbc.a(wz9.f), dVarF, 0);
                    dVarF.u();
                } else {
                    dVarF.y(380705954);
                    dVarF.u();
                    strB = "";
                }
                dVarF.u();
            } else {
                dVarF.y(843557408);
                dVarF.u();
            }
            companion = c0.INSTANCE;
            if (c0.f(i, companion.b())) {
                dVarF.y(843570444);
                rbc.Companion companion14 = rbc.INSTANCE;
                strB2 = vbc.b(rbc.a(wz9.o), dVarF, 0);
                dVarF.u();
            } else if (c0.f(i, companion.a())) {
                dVarF.y(843573323);
                rbc.Companion companion15 = rbc.INSTANCE;
                strB2 = vbc.b(rbc.a(wz9.g), dVarF, 0);
                dVarF.u();
            } else {
                dVarF.y(381043234);
                dVarF.u();
            }
            str = String.format(strB2, Arrays.copyOf(new Object[]{strC}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            zX = dVarF.x(str);
            objR = dVarF.R();
            if (zX) {
                objR = new Function1() { // from class: com.google.android.wn2
                    public final Object invoke(Object obj) {
                        return h.e(str, (nfb) obj);
                    }
                };
                dVarF.L(objR);
            } else {
                objR = new Function1() { // from class: com.google.android.wn2
                    public final Object invoke(Object obj) {
                        return h.e(str, (nfb) obj);
                    }
                };
                dVarF.L(objR);
            }
            dVar2 = dVarF;
            androidx.compose.ui.b bVar7 = bVar5;
            qxc.j(strB, afb.d(bVar5, false, (Function1) objR, 1, null), j3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, dVar2, (i6 >> 6) & 896, 24576, 245752);
            if (e.k()) {
                e.n();
            }
            bVar3 = bVar7;
            j2 = j3;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bVar3 = bVar2;
            j2 = headlineContentColor;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.xn2
                public final Object invoke(Object obj, Object obj2) {
                    return h.f(this.a, l2, i, bo2Var2, bVar3, j2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x0116  */
    /* JADX WARN: Code duplicated, block: B:76:0x0120  */
    /* JADX WARN: Code duplicated, block: B:77:0x015f  */
    /* JADX WARN: Code duplicated, block: B:80:0x016e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0173  */
    /* JADX WARN: Code duplicated, block: B:85:0x017e  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public final void g(final int i, androidx.compose.ui.b bVar, long j, d dVar, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.b bVar2;
        long j2;
        int i5;
        boolean z;
        final long j3;
        androidx.compose.ui.b bVar3;
        s6b s6bVarH;
        androidx.compose.ui.b bVar4;
        long j4;
        c0.Companion companion;
        d dVarF = dVar.F(-390880814);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (dVarF.C(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 == 0) {
            if ((i2 & 48) == 0) {
                bVar2 = bVar;
                i4 |= dVarF.x(bVar2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if ((i3 & 4) == 0) {
                    j2 = j;
                    int i7 = dVarF.D(j2) ? 256 : 128;
                    i4 |= i7;
                } else {
                    j2 = j;
                }
                i4 |= i7;
            } else {
                j2 = j;
            }
            if ((i3 & 8) != 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                if (dVarF.x(this)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i4 |= i5;
            }
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0 || dVarF.t()) {
                    if (i6 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        long titleContentColor = i(dVarF, (i4 >> 9) & 14).getTitleContentColor();
                        i4 &= -897;
                        j4 = titleContentColor;
                    } else {
                        j4 = j2;
                    }
                    bVar3 = bVar4;
                } else {
                    dVarF.q();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    j4 = j2;
                    bVar3 = bVar2;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-390880814, i4, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:649)");
                }
                companion = c0.INSTANCE;
                if (c0.f(i, companion.b())) {
                    dVarF.y(-1974299164);
                    rbc.Companion companion2 = rbc.INSTANCE;
                    qxc.j(vbc.b(rbc.a(wz9.x), dVarF, 0), bVar3, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, dVarF, i4 & 1008, 0, 262136);
                    dVarF.u();
                } else if (c0.f(i, companion.a())) {
                    dVarF.y(-1974291869);
                    rbc.Companion companion3 = rbc.INSTANCE;
                    qxc.j(vbc.b(rbc.a(wz9.m), dVarF, 0), bVar3, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, dVarF, i4 & 1008, 0, 262136);
                    dVarF.u();
                } else {
                    dVarF.y(-1073325776);
                    dVarF.u();
                }
                if (e.k()) {
                    e.n();
                }
                j3 = j4;
            } else {
                dVarF.q();
                j3 = j2;
                bVar3 = bVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final androidx.compose.ui.b bVar5 = bVar3;
                s6bVarH.a(new Function2() { // from class: com.google.android.yn2
                    public final Object invoke(Object obj, Object obj2) {
                        return h.h(this.a, i, bVar5, j3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 48;
        bVar2 = bVar;
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                j2 = j;
                if (dVarF.D(j2)) {
                }
                i4 |= i7;
            } else {
                j2 = j;
            }
            i4 |= i7;
        } else {
            j2 = j;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (dVarF.x(this)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i4 |= i5;
        }
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i4 & 1)) {
            dVarF.U();
            if ((i2 & 1) != 0) {
                if (i6 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i3 & 4) != 0) {
                    long titleContentColor2 = i(dVarF, (i4 >> 9) & 14).getTitleContentColor();
                    i4 &= -897;
                    j4 = titleContentColor2;
                } else {
                    j4 = j2;
                }
                bVar3 = bVar4;
            } else {
                if (i6 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i3 & 4) != 0) {
                    long titleContentColor3 = i(dVarF, (i4 >> 9) & 14).getTitleContentColor();
                    i4 &= -897;
                    j4 = titleContentColor3;
                } else {
                    j4 = j2;
                }
                bVar3 = bVar4;
            }
            dVarF.M();
            if (e.k()) {
                e.o(-390880814, i4, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:649)");
            }
            companion = c0.INSTANCE;
            if (c0.f(i, companion.b())) {
                dVarF.y(-1974299164);
                rbc.Companion companion4 = rbc.INSTANCE;
                qxc.j(vbc.b(rbc.a(wz9.x), dVarF, 0), bVar3, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, dVarF, i4 & 1008, 0, 262136);
                dVarF.u();
            } else if (c0.f(i, companion.a())) {
                dVarF.y(-1974291869);
                rbc.Companion companion5 = rbc.INSTANCE;
                qxc.j(vbc.b(rbc.a(wz9.m), dVarF, 0), bVar3, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, dVarF, i4 & 1008, 0, 262136);
                dVarF.u();
            } else {
                dVarF.y(-1073325776);
                dVarF.u();
            }
            if (e.k()) {
                e.n();
            }
            j3 = j4;
        } else {
            dVarF.q();
            j3 = j2;
            bVar3 = bVar2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            final androidx.compose.ui.b bVar6 = bVar3;
            s6bVarH.a(new Function2() { // from class: com.google.android.yn2
                public final Object invoke(Object obj, Object obj2) {
                    return h.h(this.a, i, bVar6, j3, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final vn2 i(d dVar, int i) throws NoWhenBranchMatchedException {
        if (e.k()) {
            e.o(-275219611, i, -1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:447)");
        }
        vn2 vn2VarM = m(kh7.a.a(dVar, 6), dVar, (i << 3) & 112);
        if (e.k()) {
            e.n();
        }
        return vn2VarM;
    }

    public final bo2 j(String yearSelectionSkeleton, String selectedDateSkeleton, String selectedDateDescriptionSkeleton) {
        return new i(yearSelectionSkeleton, selectedDateSkeleton, selectedDateDescriptionSkeleton);
    }

    public final ddb l() {
        return AllDates;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final vn2 m(ColorScheme colorScheme, d dVar, int i) throws NoWhenBranchMatchedException {
        if (e.k()) {
            e.o(1180555308, i, -1, "androidx.compose.material3.DatePickerDefaults.<get-defaultDatePickerColors> (DatePicker.kt:546)");
        }
        vn2 defaultDatePickerColorsCached = colorScheme.getDefaultDatePickerColorsCached();
        if (defaultDatePickerColorsCached == null) {
            dVar.y(642416503);
            jp2 jp2Var = jp2.a;
            vn2 vn2Var = new vn2(bj1.j(colorScheme, jp2Var.a()), bj1.j(colorScheme, jp2Var.r()), bj1.j(colorScheme, jp2Var.p()), bj1.j(colorScheme, jp2Var.D()), bj1.j(colorScheme, jp2Var.u()), colorScheme.getOnSurfaceVariant(), bj1.j(colorScheme, jp2Var.C()), ei1.p(bj1.j(colorScheme, jp2Var.C()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), bj1.j(colorScheme, jp2Var.m()), bj1.j(colorScheme, jp2Var.A()), ei1.p(bj1.j(colorScheme, jp2Var.A()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), bj1.j(colorScheme, jp2Var.z()), ei1.p(bj1.j(colorScheme, jp2Var.z()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), bj1.j(colorScheme, jp2Var.n()), ei1.p(bj1.j(colorScheme, jp2Var.n()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), bj1.j(colorScheme, jp2Var.j()), ei1.p(bj1.j(colorScheme, jp2Var.j()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), bj1.j(colorScheme, jp2Var.i()), ei1.p(bj1.j(colorScheme, jp2Var.i()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), bj1.j(colorScheme, jp2Var.m()), bj1.j(colorScheme, jp2Var.k()), bj1.j(colorScheme, jp2Var.t()), bj1.j(colorScheme, jp2Var.v()), bj1.j(colorScheme, de3.a.a()), OutlinedTextFieldDefaults.a.k(colorScheme, dVar, (i & 14) | 48), null);
            colorScheme.o0(vn2Var);
            dVar.u();
            defaultDatePickerColorsCached = vn2Var;
        } else {
            dVar.y(642290457);
            dVar.u();
        }
        if (e.k()) {
            e.n();
        }
        return defaultDatePickerColorsCached;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final xkb n(d dVar, int i) throws NoWhenBranchMatchedException {
        if (e.k()) {
            e.o(700927667, i, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:770)");
        }
        xkb xkbVarI = ulb.i(jp2.a.c(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return xkbVarI;
    }

    public final float o() {
        return TonalElevation;
    }

    public final IntRange p() {
        return YearRange;
    }

    public final qg4 q(LazyListState lazyListState, vq2<Float> vq2Var, d dVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            vq2Var = xq2.c(0.0f, 0.0f, 3, null);
        }
        if (e.k()) {
            e.o(-2036003494, i, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:741)");
        }
        xa4 xa4VarB = d08.b(MotionSchemeKeyTokens.DefaultEffects, dVar, 6);
        boolean zX = ((((i & 14) ^ 6) > 4 && dVar.x(lazyListState)) || (i & 6) == 4) | dVar.x(vq2Var);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = SnapFlingBehaviorKt.p(new b(f.b(lazyListState, null, 2, null)), vq2Var, xa4VarB);
            dVar.L(objR);
        }
        omc omcVar = (omc) objR;
        if (e.k()) {
            e.n();
        }
        return omcVar;
    }
}
