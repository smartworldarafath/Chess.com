package androidx.compose.p001foundation.layout;

import androidx.compose.p001foundation.layout.b0;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.ps4;
import com.google.android.r43;
import com.google.inputmethod.RowColumnParentData;
import com.google.inputmethod.bu8;
import com.google.inputmethod.cra;
import com.google.inputmethod.dj7;
import com.google.inputmethod.dud;
import com.google.inputmethod.ej7;
import com.google.inputmethod.era;
import com.google.inputmethod.f16;
import com.google.inputmethod.f66;
import com.google.inputmethod.fj7;
import com.google.inputmethod.gj4;
import com.google.inputmethod.gs1;
import com.google.inputmethod.jj4;
import com.google.inputmethod.kj4;
import com.google.inputmethod.ko1;
import com.google.inputmethod.kx1;
import com.google.inputmethod.n22;
import com.google.inputmethod.n48;
import com.google.inputmethod.o48;
import com.google.inputmethod.p16;
import com.google.inputmethod.p48;
import com.google.inputmethod.pp1;
import com.google.inputmethod.r28;
import com.google.inputmethod.r58;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.t06;
import com.google.inputmethod.t28;
import com.google.inputmethod.tc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001ai\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a_\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a?\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a]\u0010%\u001a\u00020$2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&\u001aY\u00103\u001a\u000202*\u00020'2\u0006\u0010)\u001a\u00020(2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u00101\u001a\u0002002\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0016H\u0000¢\u0006\u0004\b3\u00104\u001a%\u00107\u001a\u0004\u0018\u00010+*\b\u0012\u0004\u0012\u00020+0*2\b\u00106\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b7\u00108\u001a#\u0010<\u001a\u00020\b*\u00020\u001c2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\bH\u0000¢\u0006\u0004\b<\u0010=\u001a#\u0010?\u001a\u00020\b*\u00020\u001c2\u0006\u0010:\u001a\u0002092\u0006\u0010>\u001a\u00020\bH\u0000¢\u0006\u0004\b?\u0010=\u001a9\u0010C\u001a\u00020$*\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u00101\u001a\u00020@2\u0014\u0010B\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010A\u0012\u0004\u0012\u00020\u000f0\rH\u0000¢\u0006\u0004\bC\u0010D\u001aQ\u0010K\u001a\u000202*\u00020'2\u0006\u00101\u001a\u0002002\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001e2\f\u0010H\u001a\b\u0012\u0004\u0012\u0002020G2\u0006\u0010I\u001a\u00020(2\u0006\u0010J\u001a\u00020\u001eH\u0000¢\u0006\u0004\bK\u0010L\"\u001a\u0010R\u001a\u00020M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u001a\u0010U\u001a\u00020M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010O\u001a\u0004\bT\u0010Q¨\u0006V"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Landroidx/compose/foundation/layout/c$e;", "horizontalArrangement", "Landroidx/compose/foundation/layout/c$n;", "verticalArrangement", "Lcom/google/android/tc$c;", "itemVerticalAlignment", "", "maxItemsInEachRow", "maxLines", "Landroidx/compose/foundation/layout/h0;", "overflow", "Lkotlin/Function1;", "Lcom/google/android/jj4;", "", "content", "g", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/layout/c$e;Landroidx/compose/foundation/layout/c$n;Lcom/google/android/tc$c;IILandroidx/compose/foundation/layout/h0;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "h", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/layout/c$e;Landroidx/compose/foundation/layout/c$n;Lcom/google/android/tc$c;IILcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "maxItemsInMainAxis", "Landroidx/compose/foundation/layout/c0;", "overflowState", "Lcom/google/android/r28;", "v", "(Landroidx/compose/foundation/layout/c$e;Landroidx/compose/foundation/layout/c$n;Lcom/google/android/tc$c;IILandroidx/compose/foundation/layout/c0;Landroidx/compose/runtime/d;I)Lcom/google/android/r28;", "", "Lcom/google/android/f66;", "children", "", "mainAxisSizes", "crossAxisSizes", "mainAxisAvailable", "mainAxisSpacing", "crossAxisSpacing", "Lcom/google/android/t06;", "q", "(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/c0;)J", "Landroidx/compose/ui/layout/j;", "Landroidx/compose/foundation/layout/d0;", "measurePolicy", "", "Lcom/google/android/dj7;", "measurablesIterator", "Lcom/google/android/ff3;", "mainAxisSpacingDp", "crossAxisSpacingDp", "Lcom/google/android/bu8;", "constraints", "Lcom/google/android/fj7;", "m", "(Landroidx/compose/ui/layout/j;Landroidx/compose/foundation/layout/d0;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/c0;)Lcom/google/android/fj7;", "Lcom/google/android/gj4;", "info", "w", "(Ljava/util/Iterator;Lcom/google/android/gj4;)Lcom/google/android/dj7;", "", "isHorizontal", "crossAxisSize", "r", "(Lcom/google/android/f66;ZI)I", "mainAxisSize", "p", "Lcom/google/android/kx1;", "Landroidx/compose/ui/layout/o;", "storePlaceable", "s", "(Lcom/google/android/dj7;Landroidx/compose/foundation/layout/d0;JLkotlin/jvm/functions/Function1;)J", "mainAxisTotalSize", "crossAxisTotalSize", "Lcom/google/android/r58;", "items", "measureHelper", "outPosition", "t", "(Landroidx/compose/ui/layout/j;JII[ILcom/google/android/r58;Landroidx/compose/foundation/layout/d0;[I)Lcom/google/android/fj7;", "Landroidx/compose/foundation/layout/s;", "a", "Landroidx/compose/foundation/layout/s;", "getCROSS_AXIS_ALIGNMENT_TOP", "()Landroidx/compose/foundation/layout/s;", "CROSS_AXIS_ALIGNMENT_TOP", "b", "getCROSS_AXIS_ALIGNMENT_START", "CROSS_AXIS_ALIGNMENT_START", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b0 {
    private static final s a;
    private static final s b;

    static {
        s.Companion companion = s.INSTANCE;
        tc.Companion companion2 = tc.INSTANCE;
        a = companion.b(companion2.l());
        b = companion.a(companion2.k());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x012e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0133  */
    /* JADX WARN: Code duplicated, block: B:107:0x0135  */
    /* JADX WARN: Code duplicated, block: B:109:0x0139  */
    /* JADX WARN: Code duplicated, block: B:110:0x0140  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148  */
    /* JADX WARN: Code duplicated, block: B:116:0x0158  */
    /* JADX WARN: Code duplicated, block: B:117:0x015a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0161  */
    /* JADX WARN: Code duplicated, block: B:122:0x0169  */
    /* JADX WARN: Code duplicated, block: B:125:0x0186  */
    /* JADX WARN: Code duplicated, block: B:126:0x0188  */
    /* JADX WARN: Code duplicated, block: B:129:0x0190  */
    /* JADX WARN: Code duplicated, block: B:130:0x0192  */
    /* JADX WARN: Code duplicated, block: B:133:0x019b  */
    /* JADX WARN: Code duplicated, block: B:134:0x019d  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:147:0x0208  */
    /* JADX WARN: Code duplicated, block: B:150:0x0214  */
    /* JADX WARN: Code duplicated, block: B:151:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x025a  */
    /* JADX WARN: Code duplicated, block: B:157:0x0268  */
    /* JADX WARN: Code duplicated, block: B:160:0x027f  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0111  */
    /* JADX WARN: Code duplicated, block: B:98:0x011d  */
    @r43
    public static final void g(b bVar, c.e eVar, c.n nVar, tc.c cVar, int i, int i2, h0 h0Var, final ps4<? super jj4, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i3, final int i4) {
        int i5;
        c.e eVar2;
        int i6;
        int i7;
        int i8;
        tc.c cVarL;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z;
        final b bVar2;
        final c.n nVar2;
        final c.e eVar3;
        d dVar2;
        final int i17;
        final int i18;
        final h0 h0Var2;
        final tc.c cVar2;
        s6b s6bVarH;
        b bVar3;
        c.e eVarJ;
        int i19;
        c.n nVarK;
        int i20;
        int i21;
        h0 h0VarA;
        int i22;
        boolean z2;
        Object objR;
        FlowLayoutOverflowState flowLayoutOverflowState;
        r28 r28VarV;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objR2;
        Object obj;
        boolean zX;
        Object objR3;
        Function0<ComposeUiNode> function0B;
        int i23;
        d dVarF = dVar.F(-1956591841);
        int i24 = i4 & 1;
        if (i24 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (dVarF.x(bVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i25 = i4 & 2;
        if (i25 == 0) {
            if ((i3 & 48) == 0) {
                eVar2 = eVar;
                i5 |= dVarF.x(eVar2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 384) == 0) {
                    if (dVarF.x(nVar)) {
                        i7 = 256;
                    } else {
                        i7 = 128;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                if (i8 != 0) {
                    if ((i3 & 3072) == 0) {
                        cVarL = cVar;
                        if (dVarF.x(cVarL)) {
                            i9 = 2048;
                        } else {
                            i9 = 1024;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 16;
                    if (i10 != 0) {
                        if ((i3 & 24576) == 0) {
                            i11 = i;
                            if (dVarF.C(i11)) {
                                i12 = 16384;
                            } else {
                                i12 = 8192;
                            }
                            i5 |= i12;
                        }
                        i13 = i4 & 32;
                        if (i13 != 0) {
                            i5 |= 196608;
                        } else if ((i3 & 196608) == 0) {
                            if (dVarF.C(i2)) {
                                i14 = 131072;
                            } else {
                                i14 = 65536;
                            }
                            i5 |= i14;
                        }
                        i15 = i4 & 64;
                        if (i15 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            if (dVarF.x(h0Var)) {
                                i16 = 1048576;
                            } else {
                                i16 = 524288;
                            }
                            i5 |= i16;
                        }
                        if ((i3 & 12582912) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i23 = 8388608;
                            } else {
                                i23 = 4194304;
                            }
                            i5 |= i23;
                        }
                        if ((i5 & 4793491) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i5 & 1)) {
                            if (i24 != 0) {
                                bVar3 = b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i25 != 0) {
                                eVarJ = c.a.j();
                            } else {
                                eVarJ = eVar2;
                            }
                            if (i6 != 0) {
                                nVarK = c.a.k();
                                i19 = i8;
                            } else {
                                i19 = i8;
                                nVarK = nVar;
                            }
                            if (i19 != 0) {
                                cVarL = tc.INSTANCE.l();
                            }
                            if (i10 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i11;
                            }
                            if (i13 != 0) {
                                i21 = Integer.MAX_VALUE;
                            } else {
                                i21 = i2;
                            }
                            if (i15 != 0) {
                                h0VarA = h0.INSTANCE.a();
                            } else {
                                h0VarA = h0Var;
                            }
                            if (e.k()) {
                                e.o(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                            }
                            i22 = 3670016 & i5;
                            if (i22 == 1048576) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR = dVarF.R();
                            if (z2 || objR == d.INSTANCE.a()) {
                                objR = h0VarA.b();
                                dVarF.L(objR);
                            }
                            flowLayoutOverflowState = (FlowLayoutOverflowState) objR;
                            r28VarV = v(eVarJ, nVarK, cVarL, i20, i21, flowLayoutOverflowState, dVarF, (i5 >> 3) & 65534);
                            if (i22 == 1048576) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if ((29360128 & i5) == 8388608) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            boolean z7 = z4 | z3;
                            if ((i5 & 458752) == 131072) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            z6 = z7 | z5;
                            objR2 = dVarF.R();
                            if (z6 || objR2 == d.INSTANCE.a()) {
                                obj = objR2;
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                                    public final Object invoke(Object obj2, Object obj3) {
                                        return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                                    }
                                }));
                                h0VarA.a(flowLayoutOverflowState, arrayList);
                                dVarF.L(arrayList);
                                obj = arrayList;
                            }
                            obj = objR2;
                            Function2<d, Integer, Unit> function2B = LayoutKt.b((List) obj);
                            zX = dVarF.x(r28VarV);
                            objR3 = dVarF.R();
                            if (zX || objR3 == d.INSTANCE.a()) {
                                objR3 = t28.a(r28VarV);
                                dVarF.L(objR3);
                            }
                            ej7 ej7Var = (ej7) objR3;
                            int iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                            gs1 gs1VarJ = dVarF.j();
                            b bVarE = ComposedModifierKt.e(dVarF, bVar3);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            b bVar4 = bVar3;
                            function0B = companion.b();
                            if (dVarF.G() == null) {
                                pp1.d();
                            }
                            dVarF.o();
                            if (dVarF.getInserting()) {
                                dVarF.W(function0B);
                            } else {
                                dVarF.k();
                            }
                            d dVarC = dud.c(dVarF);
                            dud.i(dVarC, ej7Var, companion.d());
                            dud.i(dVarC, gs1VarJ, companion.f());
                            dud.i(dVarC, Integer.valueOf(iHashCode), companion.c());
                            dud.g(dVarC, companion.a());
                            dud.i(dVarC, bVarE, companion.e());
                            function2B.invoke(dVarF, 0);
                            dVarF.m();
                            if (e.k()) {
                                e.n();
                            }
                            nVar2 = nVarK;
                            i17 = i20;
                            i18 = i21;
                            bVar2 = bVar4;
                            dVar2 = dVarF;
                            h0Var2 = h0VarA;
                            eVar3 = eVarJ;
                        } else {
                            dVarF.q();
                            bVar2 = bVar;
                            nVar2 = nVar;
                            eVar3 = eVar2;
                            dVar2 = dVarF;
                            i17 = i11;
                            i18 = i2;
                            h0Var2 = h0Var;
                        }
                        cVar2 = cVarL;
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.aj4
                                public final Object invoke(Object obj2, Object obj3) {
                                    return b0.j(bVar2, eVar3, nVar2, cVar2, i17, i18, h0Var2, ps4Var, i3, i4, (d) obj2, ((Integer) obj3).intValue());
                                }
                            });
                        }
                    }
                    i5 |= 24576;
                    i11 = i;
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (dVarF.C(i2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    i15 = i4 & 64;
                    if (i15 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (dVarF.x(h0Var)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                    if ((i3 & 12582912) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i5 |= i23;
                    }
                    if ((i5 & 4793491) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i5 & 1)) {
                        if (i24 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i25 != 0) {
                            eVarJ = c.a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if (i6 != 0) {
                            nVarK = c.a.k();
                            i19 = i8;
                        } else {
                            i19 = i8;
                            nVarK = nVar;
                        }
                        if (i19 != 0) {
                            cVarL = tc.INSTANCE.l();
                        }
                        if (i10 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i11;
                        }
                        if (i13 != 0) {
                            i21 = Integer.MAX_VALUE;
                        } else {
                            i21 = i2;
                        }
                        if (i15 != 0) {
                            h0VarA = h0.INSTANCE.a();
                        } else {
                            h0VarA = h0Var;
                        }
                        if (e.k()) {
                            e.o(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                        }
                        i22 = 3670016 & i5;
                        if (i22 == 1048576) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = h0VarA.b();
                            dVarF.L(objR);
                        } else {
                            objR = h0VarA.b();
                            dVarF.L(objR);
                        }
                        flowLayoutOverflowState = (FlowLayoutOverflowState) objR;
                        r28VarV = v(eVarJ, nVarK, cVarL, i20, i21, flowLayoutOverflowState, dVarF, (i5 >> 3) & 65534);
                        if (i22 == 1048576) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((29360128 & i5) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z8 = z4 | z3;
                        if ((i5 & 458752) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z8 | z5;
                        objR2 = dVarF.R();
                        if (z6) {
                            obj = objR2;
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                                public final Object invoke(Object obj2, Object obj3) {
                                    return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                                }
                            }));
                            h0VarA.a(flowLayoutOverflowState, arrayList2);
                            dVarF.L(arrayList2);
                            obj = arrayList2;
                        } else {
                            obj = objR2;
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                                public final Object invoke(Object obj2, Object obj3) {
                                    return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                                }
                            }));
                            h0VarA.a(flowLayoutOverflowState, arrayList3);
                            dVarF.L(arrayList3);
                            obj = arrayList3;
                        }
                        obj = objR2;
                        Function2<d, Integer, Unit> function2B2 = LayoutKt.b((List) obj);
                        zX = dVarF.x(r28VarV);
                        objR3 = dVarF.R();
                        if (zX) {
                            objR3 = t28.a(r28VarV);
                            dVarF.L(objR3);
                        } else {
                            objR3 = t28.a(r28VarV);
                            dVarF.L(objR3);
                        }
                        ej7 ej7Var2 = (ej7) objR3;
                        int iHashCode2 = Long.hashCode(pp1.b(dVarF, 0));
                        gs1 gs1VarJ2 = dVarF.j();
                        b bVarE2 = ComposedModifierKt.e(dVarF, bVar3);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        b bVar5 = bVar3;
                        function0B = companion2.b();
                        if (dVarF.G() == null) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0B);
                        } else {
                            dVarF.k();
                        }
                        d dVarC2 = dud.c(dVarF);
                        dud.i(dVarC2, ej7Var2, companion2.d());
                        dud.i(dVarC2, gs1VarJ2, companion2.f());
                        dud.i(dVarC2, Integer.valueOf(iHashCode2), companion2.c());
                        dud.g(dVarC2, companion2.a());
                        dud.i(dVarC2, bVarE2, companion2.e());
                        function2B2.invoke(dVarF, 0);
                        dVarF.m();
                        if (e.k()) {
                            e.n();
                        }
                        nVar2 = nVarK;
                        i17 = i20;
                        i18 = i21;
                        bVar2 = bVar5;
                        dVar2 = dVarF;
                        h0Var2 = h0VarA;
                        eVar3 = eVarJ;
                    } else {
                        dVarF.q();
                        bVar2 = bVar;
                        nVar2 = nVar;
                        eVar3 = eVar2;
                        dVar2 = dVarF;
                        i17 = i11;
                        i18 = i2;
                        h0Var2 = h0Var;
                    }
                    cVar2 = cVarL;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.aj4
                            public final Object invoke(Object obj2, Object obj3) {
                                return b0.j(bVar2, eVar3, nVar2, cVar2, i17, i18, h0Var2, ps4Var, i3, i4, (d) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i5 |= 3072;
                cVarL = cVar;
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (dVarF.C(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (dVarF.C(i2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    i15 = i4 & 64;
                    if (i15 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (dVarF.x(h0Var)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                    if ((i3 & 12582912) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i5 |= i23;
                    }
                    if ((i5 & 4793491) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i5 & 1)) {
                        if (i24 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i25 != 0) {
                            eVarJ = c.a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if (i6 != 0) {
                            nVarK = c.a.k();
                            i19 = i8;
                        } else {
                            i19 = i8;
                            nVarK = nVar;
                        }
                        if (i19 != 0) {
                            cVarL = tc.INSTANCE.l();
                        }
                        if (i10 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i11;
                        }
                        if (i13 != 0) {
                            i21 = Integer.MAX_VALUE;
                        } else {
                            i21 = i2;
                        }
                        if (i15 != 0) {
                            h0VarA = h0.INSTANCE.a();
                        } else {
                            h0VarA = h0Var;
                        }
                        if (e.k()) {
                            e.o(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                        }
                        i22 = 3670016 & i5;
                        if (i22 == 1048576) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = h0VarA.b();
                            dVarF.L(objR);
                        } else {
                            objR = h0VarA.b();
                            dVarF.L(objR);
                        }
                        flowLayoutOverflowState = (FlowLayoutOverflowState) objR;
                        r28VarV = v(eVarJ, nVarK, cVarL, i20, i21, flowLayoutOverflowState, dVarF, (i5 >> 3) & 65534);
                        if (i22 == 1048576) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((29360128 & i5) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z9 = z4 | z3;
                        if ((i5 & 458752) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z9 | z5;
                        objR2 = dVarF.R();
                        if (z6) {
                            obj = objR2;
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                                public final Object invoke(Object obj2, Object obj3) {
                                    return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                                }
                            }));
                            h0VarA.a(flowLayoutOverflowState, arrayList4);
                            dVarF.L(arrayList4);
                            obj = arrayList4;
                        } else {
                            obj = objR2;
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                                public final Object invoke(Object obj2, Object obj3) {
                                    return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                                }
                            }));
                            h0VarA.a(flowLayoutOverflowState, arrayList5);
                            dVarF.L(arrayList5);
                            obj = arrayList5;
                        }
                        obj = objR2;
                        Function2<d, Integer, Unit> function2B3 = LayoutKt.b((List) obj);
                        zX = dVarF.x(r28VarV);
                        objR3 = dVarF.R();
                        if (zX) {
                            objR3 = t28.a(r28VarV);
                            dVarF.L(objR3);
                        } else {
                            objR3 = t28.a(r28VarV);
                            dVarF.L(objR3);
                        }
                        ej7 ej7Var3 = (ej7) objR3;
                        int iHashCode3 = Long.hashCode(pp1.b(dVarF, 0));
                        gs1 gs1VarJ3 = dVarF.j();
                        b bVarE3 = ComposedModifierKt.e(dVarF, bVar3);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        b bVar6 = bVar3;
                        function0B = companion3.b();
                        if (dVarF.G() == null) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0B);
                        } else {
                            dVarF.k();
                        }
                        d dVarC3 = dud.c(dVarF);
                        dud.i(dVarC3, ej7Var3, companion3.d());
                        dud.i(dVarC3, gs1VarJ3, companion3.f());
                        dud.i(dVarC3, Integer.valueOf(iHashCode3), companion3.c());
                        dud.g(dVarC3, companion3.a());
                        dud.i(dVarC3, bVarE3, companion3.e());
                        function2B3.invoke(dVarF, 0);
                        dVarF.m();
                        if (e.k()) {
                            e.n();
                        }
                        nVar2 = nVarK;
                        i17 = i20;
                        i18 = i21;
                        bVar2 = bVar6;
                        dVar2 = dVarF;
                        h0Var2 = h0VarA;
                        eVar3 = eVarJ;
                    } else {
                        dVarF.q();
                        bVar2 = bVar;
                        nVar2 = nVar;
                        eVar3 = eVar2;
                        dVar2 = dVarF;
                        i17 = i11;
                        i18 = i2;
                        h0Var2 = h0Var;
                    }
                    cVar2 = cVarL;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.aj4
                            public final Object invoke(Object obj2, Object obj3) {
                                return b0.j(bVar2, eVar3, nVar2, cVar2, i17, i18, h0Var2, ps4Var, i3, i4, (d) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (dVarF.C(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (dVarF.x(h0Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i3 & 12582912) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i5 |= i23;
                }
                if ((i5 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i5 & 1)) {
                    if (i24 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i25 != 0) {
                        eVarJ = c.a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if (i6 != 0) {
                        nVarK = c.a.k();
                        i19 = i8;
                    } else {
                        i19 = i8;
                        nVarK = nVar;
                    }
                    if (i19 != 0) {
                        cVarL = tc.INSTANCE.l();
                    }
                    if (i10 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i11;
                    }
                    if (i13 != 0) {
                        i21 = Integer.MAX_VALUE;
                    } else {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        h0VarA = h0.INSTANCE.a();
                    } else {
                        h0VarA = h0Var;
                    }
                    if (e.k()) {
                        e.o(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                    }
                    i22 = 3670016 & i5;
                    if (i22 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = h0VarA.b();
                        dVarF.L(objR);
                    } else {
                        objR = h0VarA.b();
                        dVarF.L(objR);
                    }
                    flowLayoutOverflowState = (FlowLayoutOverflowState) objR;
                    r28VarV = v(eVarJ, nVarK, cVarL, i20, i21, flowLayoutOverflowState, dVarF, (i5 >> 3) & 65534);
                    if (i22 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((29360128 & i5) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z10 = z4 | z3;
                    if ((i5 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z10 | z5;
                    objR2 = dVarF.R();
                    if (z6) {
                        obj = objR2;
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                            public final Object invoke(Object obj2, Object obj3) {
                                return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                            }
                        }));
                        h0VarA.a(flowLayoutOverflowState, arrayList6);
                        dVarF.L(arrayList6);
                        obj = arrayList6;
                    } else {
                        obj = objR2;
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                            public final Object invoke(Object obj2, Object obj3) {
                                return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                            }
                        }));
                        h0VarA.a(flowLayoutOverflowState, arrayList7);
                        dVarF.L(arrayList7);
                        obj = arrayList7;
                    }
                    obj = objR2;
                    Function2<d, Integer, Unit> function2B4 = LayoutKt.b((List) obj);
                    zX = dVarF.x(r28VarV);
                    objR3 = dVarF.R();
                    if (zX) {
                        objR3 = t28.a(r28VarV);
                        dVarF.L(objR3);
                    } else {
                        objR3 = t28.a(r28VarV);
                        dVarF.L(objR3);
                    }
                    ej7 ej7Var4 = (ej7) objR3;
                    int iHashCode4 = Long.hashCode(pp1.b(dVarF, 0));
                    gs1 gs1VarJ4 = dVarF.j();
                    b bVarE4 = ComposedModifierKt.e(dVarF, bVar3);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    b bVar7 = bVar3;
                    function0B = companion4.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    d dVarC4 = dud.c(dVarF);
                    dud.i(dVarC4, ej7Var4, companion4.d());
                    dud.i(dVarC4, gs1VarJ4, companion4.f());
                    dud.i(dVarC4, Integer.valueOf(iHashCode4), companion4.c());
                    dud.g(dVarC4, companion4.a());
                    dud.i(dVarC4, bVarE4, companion4.e());
                    function2B4.invoke(dVarF, 0);
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    nVar2 = nVarK;
                    i17 = i20;
                    i18 = i21;
                    bVar2 = bVar7;
                    dVar2 = dVarF;
                    h0Var2 = h0VarA;
                    eVar3 = eVarJ;
                } else {
                    dVarF.q();
                    bVar2 = bVar;
                    nVar2 = nVar;
                    eVar3 = eVar2;
                    dVar2 = dVarF;
                    i17 = i11;
                    i18 = i2;
                    h0Var2 = h0Var;
                }
                cVar2 = cVarL;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.aj4
                        public final Object invoke(Object obj2, Object obj3) {
                            return b0.j(bVar2, eVar3, nVar2, cVar2, i17, i18, h0Var2, ps4Var, i3, i4, (d) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i5 |= 384;
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    cVarL = cVar;
                    if (dVarF.x(cVarL)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (dVarF.C(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (dVarF.C(i2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    i15 = i4 & 64;
                    if (i15 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (dVarF.x(h0Var)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                    if ((i3 & 12582912) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i5 |= i23;
                    }
                    if ((i5 & 4793491) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i5 & 1)) {
                        if (i24 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i25 != 0) {
                            eVarJ = c.a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if (i6 != 0) {
                            nVarK = c.a.k();
                            i19 = i8;
                        } else {
                            i19 = i8;
                            nVarK = nVar;
                        }
                        if (i19 != 0) {
                            cVarL = tc.INSTANCE.l();
                        }
                        if (i10 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i11;
                        }
                        if (i13 != 0) {
                            i21 = Integer.MAX_VALUE;
                        } else {
                            i21 = i2;
                        }
                        if (i15 != 0) {
                            h0VarA = h0.INSTANCE.a();
                        } else {
                            h0VarA = h0Var;
                        }
                        if (e.k()) {
                            e.o(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                        }
                        i22 = 3670016 & i5;
                        if (i22 == 1048576) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = h0VarA.b();
                            dVarF.L(objR);
                        } else {
                            objR = h0VarA.b();
                            dVarF.L(objR);
                        }
                        flowLayoutOverflowState = (FlowLayoutOverflowState) objR;
                        r28VarV = v(eVarJ, nVarK, cVarL, i20, i21, flowLayoutOverflowState, dVarF, (i5 >> 3) & 65534);
                        if (i22 == 1048576) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((29360128 & i5) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z11 = z4 | z3;
                        if ((i5 & 458752) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z11 | z5;
                        objR2 = dVarF.R();
                        if (z6) {
                            obj = objR2;
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                                public final Object invoke(Object obj2, Object obj3) {
                                    return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                                }
                            }));
                            h0VarA.a(flowLayoutOverflowState, arrayList8);
                            dVarF.L(arrayList8);
                            obj = arrayList8;
                        } else {
                            obj = objR2;
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                                public final Object invoke(Object obj2, Object obj3) {
                                    return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                                }
                            }));
                            h0VarA.a(flowLayoutOverflowState, arrayList9);
                            dVarF.L(arrayList9);
                            obj = arrayList9;
                        }
                        obj = objR2;
                        Function2<d, Integer, Unit> function2B5 = LayoutKt.b((List) obj);
                        zX = dVarF.x(r28VarV);
                        objR3 = dVarF.R();
                        if (zX) {
                            objR3 = t28.a(r28VarV);
                            dVarF.L(objR3);
                        } else {
                            objR3 = t28.a(r28VarV);
                            dVarF.L(objR3);
                        }
                        ej7 ej7Var5 = (ej7) objR3;
                        int iHashCode5 = Long.hashCode(pp1.b(dVarF, 0));
                        gs1 gs1VarJ5 = dVarF.j();
                        b bVarE5 = ComposedModifierKt.e(dVarF, bVar3);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        b bVar8 = bVar3;
                        function0B = companion5.b();
                        if (dVarF.G() == null) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0B);
                        } else {
                            dVarF.k();
                        }
                        d dVarC5 = dud.c(dVarF);
                        dud.i(dVarC5, ej7Var5, companion5.d());
                        dud.i(dVarC5, gs1VarJ5, companion5.f());
                        dud.i(dVarC5, Integer.valueOf(iHashCode5), companion5.c());
                        dud.g(dVarC5, companion5.a());
                        dud.i(dVarC5, bVarE5, companion5.e());
                        function2B5.invoke(dVarF, 0);
                        dVarF.m();
                        if (e.k()) {
                            e.n();
                        }
                        nVar2 = nVarK;
                        i17 = i20;
                        i18 = i21;
                        bVar2 = bVar8;
                        dVar2 = dVarF;
                        h0Var2 = h0VarA;
                        eVar3 = eVarJ;
                    } else {
                        dVarF.q();
                        bVar2 = bVar;
                        nVar2 = nVar;
                        eVar3 = eVar2;
                        dVar2 = dVarF;
                        i17 = i11;
                        i18 = i2;
                        h0Var2 = h0Var;
                    }
                    cVar2 = cVarL;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.aj4
                            public final Object invoke(Object obj2, Object obj3) {
                                return b0.j(bVar2, eVar3, nVar2, cVar2, i17, i18, h0Var2, ps4Var, i3, i4, (d) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (dVarF.C(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (dVarF.x(h0Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i3 & 12582912) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i5 |= i23;
                }
                if ((i5 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i5 & 1)) {
                    if (i24 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i25 != 0) {
                        eVarJ = c.a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if (i6 != 0) {
                        nVarK = c.a.k();
                        i19 = i8;
                    } else {
                        i19 = i8;
                        nVarK = nVar;
                    }
                    if (i19 != 0) {
                        cVarL = tc.INSTANCE.l();
                    }
                    if (i10 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i11;
                    }
                    if (i13 != 0) {
                        i21 = Integer.MAX_VALUE;
                    } else {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        h0VarA = h0.INSTANCE.a();
                    } else {
                        h0VarA = h0Var;
                    }
                    if (e.k()) {
                        e.o(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                    }
                    i22 = 3670016 & i5;
                    if (i22 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = h0VarA.b();
                        dVarF.L(objR);
                    } else {
                        objR = h0VarA.b();
                        dVarF.L(objR);
                    }
                    flowLayoutOverflowState = (FlowLayoutOverflowState) objR;
                    r28VarV = v(eVarJ, nVarK, cVarL, i20, i21, flowLayoutOverflowState, dVarF, (i5 >> 3) & 65534);
                    if (i22 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((29360128 & i5) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z12 = z4 | z3;
                    if ((i5 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z12 | z5;
                    objR2 = dVarF.R();
                    if (z6) {
                        obj = objR2;
                        ArrayList arrayList10 = new ArrayList();
                        arrayList10.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                            public final Object invoke(Object obj2, Object obj3) {
                                return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                            }
                        }));
                        h0VarA.a(flowLayoutOverflowState, arrayList10);
                        dVarF.L(arrayList10);
                        obj = arrayList10;
                    } else {
                        obj = objR2;
                        ArrayList arrayList11 = new ArrayList();
                        arrayList11.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                            public final Object invoke(Object obj2, Object obj3) {
                                return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                            }
                        }));
                        h0VarA.a(flowLayoutOverflowState, arrayList11);
                        dVarF.L(arrayList11);
                        obj = arrayList11;
                    }
                    obj = objR2;
                    Function2<d, Integer, Unit> function2B6 = LayoutKt.b((List) obj);
                    zX = dVarF.x(r28VarV);
                    objR3 = dVarF.R();
                    if (zX) {
                        objR3 = t28.a(r28VarV);
                        dVarF.L(objR3);
                    } else {
                        objR3 = t28.a(r28VarV);
                        dVarF.L(objR3);
                    }
                    ej7 ej7Var6 = (ej7) objR3;
                    int iHashCode6 = Long.hashCode(pp1.b(dVarF, 0));
                    gs1 gs1VarJ6 = dVarF.j();
                    b bVarE6 = ComposedModifierKt.e(dVarF, bVar3);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    b bVar9 = bVar3;
                    function0B = companion6.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    d dVarC6 = dud.c(dVarF);
                    dud.i(dVarC6, ej7Var6, companion6.d());
                    dud.i(dVarC6, gs1VarJ6, companion6.f());
                    dud.i(dVarC6, Integer.valueOf(iHashCode6), companion6.c());
                    dud.g(dVarC6, companion6.a());
                    dud.i(dVarC6, bVarE6, companion6.e());
                    function2B6.invoke(dVarF, 0);
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    nVar2 = nVarK;
                    i17 = i20;
                    i18 = i21;
                    bVar2 = bVar9;
                    dVar2 = dVarF;
                    h0Var2 = h0VarA;
                    eVar3 = eVarJ;
                } else {
                    dVarF.q();
                    bVar2 = bVar;
                    nVar2 = nVar;
                    eVar3 = eVar2;
                    dVar2 = dVarF;
                    i17 = i11;
                    i18 = i2;
                    h0Var2 = h0Var;
                }
                cVar2 = cVarL;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.aj4
                        public final Object invoke(Object obj2, Object obj3) {
                            return b0.j(bVar2, eVar3, nVar2, cVar2, i17, i18, h0Var2, ps4Var, i3, i4, (d) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i5 |= 3072;
            cVarL = cVar;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (dVarF.C(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (dVarF.C(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (dVarF.x(h0Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i3 & 12582912) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i5 |= i23;
                }
                if ((i5 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i5 & 1)) {
                    if (i24 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i25 != 0) {
                        eVarJ = c.a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if (i6 != 0) {
                        nVarK = c.a.k();
                        i19 = i8;
                    } else {
                        i19 = i8;
                        nVarK = nVar;
                    }
                    if (i19 != 0) {
                        cVarL = tc.INSTANCE.l();
                    }
                    if (i10 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i11;
                    }
                    if (i13 != 0) {
                        i21 = Integer.MAX_VALUE;
                    } else {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        h0VarA = h0.INSTANCE.a();
                    } else {
                        h0VarA = h0Var;
                    }
                    if (e.k()) {
                        e.o(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                    }
                    i22 = 3670016 & i5;
                    if (i22 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = h0VarA.b();
                        dVarF.L(objR);
                    } else {
                        objR = h0VarA.b();
                        dVarF.L(objR);
                    }
                    flowLayoutOverflowState = (FlowLayoutOverflowState) objR;
                    r28VarV = v(eVarJ, nVarK, cVarL, i20, i21, flowLayoutOverflowState, dVarF, (i5 >> 3) & 65534);
                    if (i22 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((29360128 & i5) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z13 = z4 | z3;
                    if ((i5 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z13 | z5;
                    objR2 = dVarF.R();
                    if (z6) {
                        obj = objR2;
                        ArrayList arrayList12 = new ArrayList();
                        arrayList12.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                            public final Object invoke(Object obj2, Object obj3) {
                                return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                            }
                        }));
                        h0VarA.a(flowLayoutOverflowState, arrayList12);
                        dVarF.L(arrayList12);
                        obj = arrayList12;
                    } else {
                        obj = objR2;
                        ArrayList arrayList13 = new ArrayList();
                        arrayList13.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                            public final Object invoke(Object obj2, Object obj3) {
                                return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                            }
                        }));
                        h0VarA.a(flowLayoutOverflowState, arrayList13);
                        dVarF.L(arrayList13);
                        obj = arrayList13;
                    }
                    obj = objR2;
                    Function2<d, Integer, Unit> function2B7 = LayoutKt.b((List) obj);
                    zX = dVarF.x(r28VarV);
                    objR3 = dVarF.R();
                    if (zX) {
                        objR3 = t28.a(r28VarV);
                        dVarF.L(objR3);
                    } else {
                        objR3 = t28.a(r28VarV);
                        dVarF.L(objR3);
                    }
                    ej7 ej7Var7 = (ej7) objR3;
                    int iHashCode7 = Long.hashCode(pp1.b(dVarF, 0));
                    gs1 gs1VarJ7 = dVarF.j();
                    b bVarE7 = ComposedModifierKt.e(dVarF, bVar3);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    b bVar10 = bVar3;
                    function0B = companion7.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    d dVarC7 = dud.c(dVarF);
                    dud.i(dVarC7, ej7Var7, companion7.d());
                    dud.i(dVarC7, gs1VarJ7, companion7.f());
                    dud.i(dVarC7, Integer.valueOf(iHashCode7), companion7.c());
                    dud.g(dVarC7, companion7.a());
                    dud.i(dVarC7, bVarE7, companion7.e());
                    function2B7.invoke(dVarF, 0);
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    nVar2 = nVarK;
                    i17 = i20;
                    i18 = i21;
                    bVar2 = bVar10;
                    dVar2 = dVarF;
                    h0Var2 = h0VarA;
                    eVar3 = eVarJ;
                } else {
                    dVarF.q();
                    bVar2 = bVar;
                    nVar2 = nVar;
                    eVar3 = eVar2;
                    dVar2 = dVarF;
                    i17 = i11;
                    i18 = i2;
                    h0Var2 = h0Var;
                }
                cVar2 = cVarL;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.aj4
                        public final Object invoke(Object obj2, Object obj3) {
                            return b0.j(bVar2, eVar3, nVar2, cVar2, i17, i18, h0Var2, ps4Var, i3, i4, (d) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (dVarF.C(i2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (dVarF.x(h0Var)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i5 |= i16;
            }
            if ((i3 & 12582912) == 0) {
                if (dVarF.T(ps4Var)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i5 |= i23;
            }
            if ((i5 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i5 & 1)) {
                if (i24 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar;
                }
                if (i25 != 0) {
                    eVarJ = c.a.j();
                } else {
                    eVarJ = eVar2;
                }
                if (i6 != 0) {
                    nVarK = c.a.k();
                    i19 = i8;
                } else {
                    i19 = i8;
                    nVarK = nVar;
                }
                if (i19 != 0) {
                    cVarL = tc.INSTANCE.l();
                }
                if (i10 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i11;
                }
                if (i13 != 0) {
                    i21 = Integer.MAX_VALUE;
                } else {
                    i21 = i2;
                }
                if (i15 != 0) {
                    h0VarA = h0.INSTANCE.a();
                } else {
                    h0VarA = h0Var;
                }
                if (e.k()) {
                    e.o(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                }
                i22 = 3670016 & i5;
                if (i22 == 1048576) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objR = dVarF.R();
                if (z2) {
                    objR = h0VarA.b();
                    dVarF.L(objR);
                } else {
                    objR = h0VarA.b();
                    dVarF.L(objR);
                }
                flowLayoutOverflowState = (FlowLayoutOverflowState) objR;
                r28VarV = v(eVarJ, nVarK, cVarL, i20, i21, flowLayoutOverflowState, dVarF, (i5 >> 3) & 65534);
                if (i22 == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((29360128 & i5) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z14 = z4 | z3;
                if ((i5 & 458752) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z14 | z5;
                objR2 = dVarF.R();
                if (z6) {
                    obj = objR2;
                    ArrayList arrayList14 = new ArrayList();
                    arrayList14.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                        public final Object invoke(Object obj2, Object obj3) {
                            return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                        }
                    }));
                    h0VarA.a(flowLayoutOverflowState, arrayList14);
                    dVarF.L(arrayList14);
                    obj = arrayList14;
                } else {
                    obj = objR2;
                    ArrayList arrayList15 = new ArrayList();
                    arrayList15.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                        public final Object invoke(Object obj2, Object obj3) {
                            return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                        }
                    }));
                    h0VarA.a(flowLayoutOverflowState, arrayList15);
                    dVarF.L(arrayList15);
                    obj = arrayList15;
                }
                obj = objR2;
                Function2<d, Integer, Unit> function2B8 = LayoutKt.b((List) obj);
                zX = dVarF.x(r28VarV);
                objR3 = dVarF.R();
                if (zX) {
                    objR3 = t28.a(r28VarV);
                    dVarF.L(objR3);
                } else {
                    objR3 = t28.a(r28VarV);
                    dVarF.L(objR3);
                }
                ej7 ej7Var8 = (ej7) objR3;
                int iHashCode8 = Long.hashCode(pp1.b(dVarF, 0));
                gs1 gs1VarJ8 = dVarF.j();
                b bVarE8 = ComposedModifierKt.e(dVarF, bVar3);
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                b bVar11 = bVar3;
                function0B = companion8.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC8 = dud.c(dVarF);
                dud.i(dVarC8, ej7Var8, companion8.d());
                dud.i(dVarC8, gs1VarJ8, companion8.f());
                dud.i(dVarC8, Integer.valueOf(iHashCode8), companion8.c());
                dud.g(dVarC8, companion8.a());
                dud.i(dVarC8, bVarE8, companion8.e());
                function2B8.invoke(dVarF, 0);
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                nVar2 = nVarK;
                i17 = i20;
                i18 = i21;
                bVar2 = bVar11;
                dVar2 = dVarF;
                h0Var2 = h0VarA;
                eVar3 = eVarJ;
            } else {
                dVarF.q();
                bVar2 = bVar;
                nVar2 = nVar;
                eVar3 = eVar2;
                dVar2 = dVarF;
                i17 = i11;
                i18 = i2;
                h0Var2 = h0Var;
            }
            cVar2 = cVarL;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.aj4
                    public final Object invoke(Object obj2, Object obj3) {
                        return b0.j(bVar2, eVar3, nVar2, cVar2, i17, i18, h0Var2, ps4Var, i3, i4, (d) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i5 |= 48;
        eVar2 = eVar;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 384) == 0) {
                if (dVarF.x(nVar)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    cVarL = cVar;
                    if (dVarF.x(cVarL)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (dVarF.C(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (dVarF.C(i2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    i15 = i4 & 64;
                    if (i15 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (dVarF.x(h0Var)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                    if ((i3 & 12582912) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i5 |= i23;
                    }
                    if ((i5 & 4793491) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i5 & 1)) {
                        if (i24 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i25 != 0) {
                            eVarJ = c.a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if (i6 != 0) {
                            nVarK = c.a.k();
                            i19 = i8;
                        } else {
                            i19 = i8;
                            nVarK = nVar;
                        }
                        if (i19 != 0) {
                            cVarL = tc.INSTANCE.l();
                        }
                        if (i10 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i11;
                        }
                        if (i13 != 0) {
                            i21 = Integer.MAX_VALUE;
                        } else {
                            i21 = i2;
                        }
                        if (i15 != 0) {
                            h0VarA = h0.INSTANCE.a();
                        } else {
                            h0VarA = h0Var;
                        }
                        if (e.k()) {
                            e.o(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                        }
                        i22 = 3670016 & i5;
                        if (i22 == 1048576) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = h0VarA.b();
                            dVarF.L(objR);
                        } else {
                            objR = h0VarA.b();
                            dVarF.L(objR);
                        }
                        flowLayoutOverflowState = (FlowLayoutOverflowState) objR;
                        r28VarV = v(eVarJ, nVarK, cVarL, i20, i21, flowLayoutOverflowState, dVarF, (i5 >> 3) & 65534);
                        if (i22 == 1048576) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((29360128 & i5) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z15 = z4 | z3;
                        if ((i5 & 458752) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z15 | z5;
                        objR2 = dVarF.R();
                        if (z6) {
                            obj = objR2;
                            ArrayList arrayList16 = new ArrayList();
                            arrayList16.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                                public final Object invoke(Object obj2, Object obj3) {
                                    return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                                }
                            }));
                            h0VarA.a(flowLayoutOverflowState, arrayList16);
                            dVarF.L(arrayList16);
                            obj = arrayList16;
                        } else {
                            obj = objR2;
                            ArrayList arrayList17 = new ArrayList();
                            arrayList17.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                                public final Object invoke(Object obj2, Object obj3) {
                                    return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                                }
                            }));
                            h0VarA.a(flowLayoutOverflowState, arrayList17);
                            dVarF.L(arrayList17);
                            obj = arrayList17;
                        }
                        obj = objR2;
                        Function2<d, Integer, Unit> function2B9 = LayoutKt.b((List) obj);
                        zX = dVarF.x(r28VarV);
                        objR3 = dVarF.R();
                        if (zX) {
                            objR3 = t28.a(r28VarV);
                            dVarF.L(objR3);
                        } else {
                            objR3 = t28.a(r28VarV);
                            dVarF.L(objR3);
                        }
                        ej7 ej7Var9 = (ej7) objR3;
                        int iHashCode9 = Long.hashCode(pp1.b(dVarF, 0));
                        gs1 gs1VarJ9 = dVarF.j();
                        b bVarE9 = ComposedModifierKt.e(dVarF, bVar3);
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        b bVar12 = bVar3;
                        function0B = companion9.b();
                        if (dVarF.G() == null) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0B);
                        } else {
                            dVarF.k();
                        }
                        d dVarC9 = dud.c(dVarF);
                        dud.i(dVarC9, ej7Var9, companion9.d());
                        dud.i(dVarC9, gs1VarJ9, companion9.f());
                        dud.i(dVarC9, Integer.valueOf(iHashCode9), companion9.c());
                        dud.g(dVarC9, companion9.a());
                        dud.i(dVarC9, bVarE9, companion9.e());
                        function2B9.invoke(dVarF, 0);
                        dVarF.m();
                        if (e.k()) {
                            e.n();
                        }
                        nVar2 = nVarK;
                        i17 = i20;
                        i18 = i21;
                        bVar2 = bVar12;
                        dVar2 = dVarF;
                        h0Var2 = h0VarA;
                        eVar3 = eVarJ;
                    } else {
                        dVarF.q();
                        bVar2 = bVar;
                        nVar2 = nVar;
                        eVar3 = eVar2;
                        dVar2 = dVarF;
                        i17 = i11;
                        i18 = i2;
                        h0Var2 = h0Var;
                    }
                    cVar2 = cVarL;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.aj4
                            public final Object invoke(Object obj2, Object obj3) {
                                return b0.j(bVar2, eVar3, nVar2, cVar2, i17, i18, h0Var2, ps4Var, i3, i4, (d) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (dVarF.C(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (dVarF.x(h0Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i3 & 12582912) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i5 |= i23;
                }
                if ((i5 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i5 & 1)) {
                    if (i24 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i25 != 0) {
                        eVarJ = c.a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if (i6 != 0) {
                        nVarK = c.a.k();
                        i19 = i8;
                    } else {
                        i19 = i8;
                        nVarK = nVar;
                    }
                    if (i19 != 0) {
                        cVarL = tc.INSTANCE.l();
                    }
                    if (i10 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i11;
                    }
                    if (i13 != 0) {
                        i21 = Integer.MAX_VALUE;
                    } else {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        h0VarA = h0.INSTANCE.a();
                    } else {
                        h0VarA = h0Var;
                    }
                    if (e.k()) {
                        e.o(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                    }
                    i22 = 3670016 & i5;
                    if (i22 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = h0VarA.b();
                        dVarF.L(objR);
                    } else {
                        objR = h0VarA.b();
                        dVarF.L(objR);
                    }
                    flowLayoutOverflowState = (FlowLayoutOverflowState) objR;
                    r28VarV = v(eVarJ, nVarK, cVarL, i20, i21, flowLayoutOverflowState, dVarF, (i5 >> 3) & 65534);
                    if (i22 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((29360128 & i5) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z16 = z4 | z3;
                    if ((i5 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z16 | z5;
                    objR2 = dVarF.R();
                    if (z6) {
                        obj = objR2;
                        ArrayList arrayList18 = new ArrayList();
                        arrayList18.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                            public final Object invoke(Object obj2, Object obj3) {
                                return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                            }
                        }));
                        h0VarA.a(flowLayoutOverflowState, arrayList18);
                        dVarF.L(arrayList18);
                        obj = arrayList18;
                    } else {
                        obj = objR2;
                        ArrayList arrayList19 = new ArrayList();
                        arrayList19.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                            public final Object invoke(Object obj2, Object obj3) {
                                return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                            }
                        }));
                        h0VarA.a(flowLayoutOverflowState, arrayList19);
                        dVarF.L(arrayList19);
                        obj = arrayList19;
                    }
                    obj = objR2;
                    Function2<d, Integer, Unit> function2B10 = LayoutKt.b((List) obj);
                    zX = dVarF.x(r28VarV);
                    objR3 = dVarF.R();
                    if (zX) {
                        objR3 = t28.a(r28VarV);
                        dVarF.L(objR3);
                    } else {
                        objR3 = t28.a(r28VarV);
                        dVarF.L(objR3);
                    }
                    ej7 ej7Var10 = (ej7) objR3;
                    int iHashCode10 = Long.hashCode(pp1.b(dVarF, 0));
                    gs1 gs1VarJ10 = dVarF.j();
                    b bVarE10 = ComposedModifierKt.e(dVarF, bVar3);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    b bVar13 = bVar3;
                    function0B = companion10.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    d dVarC10 = dud.c(dVarF);
                    dud.i(dVarC10, ej7Var10, companion10.d());
                    dud.i(dVarC10, gs1VarJ10, companion10.f());
                    dud.i(dVarC10, Integer.valueOf(iHashCode10), companion10.c());
                    dud.g(dVarC10, companion10.a());
                    dud.i(dVarC10, bVarE10, companion10.e());
                    function2B10.invoke(dVarF, 0);
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    nVar2 = nVarK;
                    i17 = i20;
                    i18 = i21;
                    bVar2 = bVar13;
                    dVar2 = dVarF;
                    h0Var2 = h0VarA;
                    eVar3 = eVarJ;
                } else {
                    dVarF.q();
                    bVar2 = bVar;
                    nVar2 = nVar;
                    eVar3 = eVar2;
                    dVar2 = dVarF;
                    i17 = i11;
                    i18 = i2;
                    h0Var2 = h0Var;
                }
                cVar2 = cVarL;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.aj4
                        public final Object invoke(Object obj2, Object obj3) {
                            return b0.j(bVar2, eVar3, nVar2, cVar2, i17, i18, h0Var2, ps4Var, i3, i4, (d) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i5 |= 3072;
            cVarL = cVar;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (dVarF.C(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (dVarF.C(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (dVarF.x(h0Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i3 & 12582912) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i5 |= i23;
                }
                if ((i5 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i5 & 1)) {
                    if (i24 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i25 != 0) {
                        eVarJ = c.a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if (i6 != 0) {
                        nVarK = c.a.k();
                        i19 = i8;
                    } else {
                        i19 = i8;
                        nVarK = nVar;
                    }
                    if (i19 != 0) {
                        cVarL = tc.INSTANCE.l();
                    }
                    if (i10 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i11;
                    }
                    if (i13 != 0) {
                        i21 = Integer.MAX_VALUE;
                    } else {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        h0VarA = h0.INSTANCE.a();
                    } else {
                        h0VarA = h0Var;
                    }
                    if (e.k()) {
                        e.o(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                    }
                    i22 = 3670016 & i5;
                    if (i22 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = h0VarA.b();
                        dVarF.L(objR);
                    } else {
                        objR = h0VarA.b();
                        dVarF.L(objR);
                    }
                    flowLayoutOverflowState = (FlowLayoutOverflowState) objR;
                    r28VarV = v(eVarJ, nVarK, cVarL, i20, i21, flowLayoutOverflowState, dVarF, (i5 >> 3) & 65534);
                    if (i22 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((29360128 & i5) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z17 = z4 | z3;
                    if ((i5 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z17 | z5;
                    objR2 = dVarF.R();
                    if (z6) {
                        obj = objR2;
                        ArrayList arrayList110 = new ArrayList();
                        arrayList110.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                            public final Object invoke(Object obj2, Object obj3) {
                                return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                            }
                        }));
                        h0VarA.a(flowLayoutOverflowState, arrayList110);
                        dVarF.L(arrayList110);
                        obj = arrayList110;
                    } else {
                        obj = objR2;
                        ArrayList arrayList111 = new ArrayList();
                        arrayList111.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                            public final Object invoke(Object obj2, Object obj3) {
                                return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                            }
                        }));
                        h0VarA.a(flowLayoutOverflowState, arrayList111);
                        dVarF.L(arrayList111);
                        obj = arrayList111;
                    }
                    obj = objR2;
                    Function2<d, Integer, Unit> function2B11 = LayoutKt.b((List) obj);
                    zX = dVarF.x(r28VarV);
                    objR3 = dVarF.R();
                    if (zX) {
                        objR3 = t28.a(r28VarV);
                        dVarF.L(objR3);
                    } else {
                        objR3 = t28.a(r28VarV);
                        dVarF.L(objR3);
                    }
                    ej7 ej7Var11 = (ej7) objR3;
                    int iHashCode11 = Long.hashCode(pp1.b(dVarF, 0));
                    gs1 gs1VarJ11 = dVarF.j();
                    b bVarE11 = ComposedModifierKt.e(dVarF, bVar3);
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    b bVar14 = bVar3;
                    function0B = companion11.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    d dVarC11 = dud.c(dVarF);
                    dud.i(dVarC11, ej7Var11, companion11.d());
                    dud.i(dVarC11, gs1VarJ11, companion11.f());
                    dud.i(dVarC11, Integer.valueOf(iHashCode11), companion11.c());
                    dud.g(dVarC11, companion11.a());
                    dud.i(dVarC11, bVarE11, companion11.e());
                    function2B11.invoke(dVarF, 0);
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    nVar2 = nVarK;
                    i17 = i20;
                    i18 = i21;
                    bVar2 = bVar14;
                    dVar2 = dVarF;
                    h0Var2 = h0VarA;
                    eVar3 = eVarJ;
                } else {
                    dVarF.q();
                    bVar2 = bVar;
                    nVar2 = nVar;
                    eVar3 = eVar2;
                    dVar2 = dVarF;
                    i17 = i11;
                    i18 = i2;
                    h0Var2 = h0Var;
                }
                cVar2 = cVarL;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.aj4
                        public final Object invoke(Object obj2, Object obj3) {
                            return b0.j(bVar2, eVar3, nVar2, cVar2, i17, i18, h0Var2, ps4Var, i3, i4, (d) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (dVarF.C(i2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (dVarF.x(h0Var)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i5 |= i16;
            }
            if ((i3 & 12582912) == 0) {
                if (dVarF.T(ps4Var)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i5 |= i23;
            }
            if ((i5 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i5 & 1)) {
                if (i24 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar;
                }
                if (i25 != 0) {
                    eVarJ = c.a.j();
                } else {
                    eVarJ = eVar2;
                }
                if (i6 != 0) {
                    nVarK = c.a.k();
                    i19 = i8;
                } else {
                    i19 = i8;
                    nVarK = nVar;
                }
                if (i19 != 0) {
                    cVarL = tc.INSTANCE.l();
                }
                if (i10 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i11;
                }
                if (i13 != 0) {
                    i21 = Integer.MAX_VALUE;
                } else {
                    i21 = i2;
                }
                if (i15 != 0) {
                    h0VarA = h0.INSTANCE.a();
                } else {
                    h0VarA = h0Var;
                }
                if (e.k()) {
                    e.o(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                }
                i22 = 3670016 & i5;
                if (i22 == 1048576) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objR = dVarF.R();
                if (z2) {
                    objR = h0VarA.b();
                    dVarF.L(objR);
                } else {
                    objR = h0VarA.b();
                    dVarF.L(objR);
                }
                flowLayoutOverflowState = (FlowLayoutOverflowState) objR;
                r28VarV = v(eVarJ, nVarK, cVarL, i20, i21, flowLayoutOverflowState, dVarF, (i5 >> 3) & 65534);
                if (i22 == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((29360128 & i5) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z18 = z4 | z3;
                if ((i5 & 458752) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z18 | z5;
                objR2 = dVarF.R();
                if (z6) {
                    obj = objR2;
                    ArrayList arrayList112 = new ArrayList();
                    arrayList112.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                        public final Object invoke(Object obj2, Object obj3) {
                            return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                        }
                    }));
                    h0VarA.a(flowLayoutOverflowState, arrayList112);
                    dVarF.L(arrayList112);
                    obj = arrayList112;
                } else {
                    obj = objR2;
                    ArrayList arrayList113 = new ArrayList();
                    arrayList113.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                        public final Object invoke(Object obj2, Object obj3) {
                            return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                        }
                    }));
                    h0VarA.a(flowLayoutOverflowState, arrayList113);
                    dVarF.L(arrayList113);
                    obj = arrayList113;
                }
                obj = objR2;
                Function2<d, Integer, Unit> function2B12 = LayoutKt.b((List) obj);
                zX = dVarF.x(r28VarV);
                objR3 = dVarF.R();
                if (zX) {
                    objR3 = t28.a(r28VarV);
                    dVarF.L(objR3);
                } else {
                    objR3 = t28.a(r28VarV);
                    dVarF.L(objR3);
                }
                ej7 ej7Var12 = (ej7) objR3;
                int iHashCode12 = Long.hashCode(pp1.b(dVarF, 0));
                gs1 gs1VarJ12 = dVarF.j();
                b bVarE12 = ComposedModifierKt.e(dVarF, bVar3);
                ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                b bVar15 = bVar3;
                function0B = companion12.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC12 = dud.c(dVarF);
                dud.i(dVarC12, ej7Var12, companion12.d());
                dud.i(dVarC12, gs1VarJ12, companion12.f());
                dud.i(dVarC12, Integer.valueOf(iHashCode12), companion12.c());
                dud.g(dVarC12, companion12.a());
                dud.i(dVarC12, bVarE12, companion12.e());
                function2B12.invoke(dVarF, 0);
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                nVar2 = nVarK;
                i17 = i20;
                i18 = i21;
                bVar2 = bVar15;
                dVar2 = dVarF;
                h0Var2 = h0VarA;
                eVar3 = eVarJ;
            } else {
                dVarF.q();
                bVar2 = bVar;
                nVar2 = nVar;
                eVar3 = eVar2;
                dVar2 = dVarF;
                i17 = i11;
                i18 = i2;
                h0Var2 = h0Var;
            }
            cVar2 = cVarL;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.aj4
                    public final Object invoke(Object obj2, Object obj3) {
                        return b0.j(bVar2, eVar3, nVar2, cVar2, i17, i18, h0Var2, ps4Var, i3, i4, (d) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i5 |= 384;
        i8 = i4 & 8;
        if (i8 != 0) {
            if ((i3 & 3072) == 0) {
                cVarL = cVar;
                if (dVarF.x(cVarL)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i5 |= i9;
            }
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (dVarF.C(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (dVarF.C(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (dVarF.x(h0Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i3 & 12582912) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i5 |= i23;
                }
                if ((i5 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i5 & 1)) {
                    if (i24 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i25 != 0) {
                        eVarJ = c.a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if (i6 != 0) {
                        nVarK = c.a.k();
                        i19 = i8;
                    } else {
                        i19 = i8;
                        nVarK = nVar;
                    }
                    if (i19 != 0) {
                        cVarL = tc.INSTANCE.l();
                    }
                    if (i10 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i11;
                    }
                    if (i13 != 0) {
                        i21 = Integer.MAX_VALUE;
                    } else {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        h0VarA = h0.INSTANCE.a();
                    } else {
                        h0VarA = h0Var;
                    }
                    if (e.k()) {
                        e.o(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                    }
                    i22 = 3670016 & i5;
                    if (i22 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = h0VarA.b();
                        dVarF.L(objR);
                    } else {
                        objR = h0VarA.b();
                        dVarF.L(objR);
                    }
                    flowLayoutOverflowState = (FlowLayoutOverflowState) objR;
                    r28VarV = v(eVarJ, nVarK, cVarL, i20, i21, flowLayoutOverflowState, dVarF, (i5 >> 3) & 65534);
                    if (i22 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((29360128 & i5) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z19 = z4 | z3;
                    if ((i5 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z19 | z5;
                    objR2 = dVarF.R();
                    if (z6) {
                        obj = objR2;
                        ArrayList arrayList114 = new ArrayList();
                        arrayList114.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                            public final Object invoke(Object obj2, Object obj3) {
                                return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                            }
                        }));
                        h0VarA.a(flowLayoutOverflowState, arrayList114);
                        dVarF.L(arrayList114);
                        obj = arrayList114;
                    } else {
                        obj = objR2;
                        ArrayList arrayList115 = new ArrayList();
                        arrayList115.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                            public final Object invoke(Object obj2, Object obj3) {
                                return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                            }
                        }));
                        h0VarA.a(flowLayoutOverflowState, arrayList115);
                        dVarF.L(arrayList115);
                        obj = arrayList115;
                    }
                    obj = objR2;
                    Function2<d, Integer, Unit> function2B13 = LayoutKt.b((List) obj);
                    zX = dVarF.x(r28VarV);
                    objR3 = dVarF.R();
                    if (zX) {
                        objR3 = t28.a(r28VarV);
                        dVarF.L(objR3);
                    } else {
                        objR3 = t28.a(r28VarV);
                        dVarF.L(objR3);
                    }
                    ej7 ej7Var13 = (ej7) objR3;
                    int iHashCode13 = Long.hashCode(pp1.b(dVarF, 0));
                    gs1 gs1VarJ13 = dVarF.j();
                    b bVarE13 = ComposedModifierKt.e(dVarF, bVar3);
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    b bVar16 = bVar3;
                    function0B = companion13.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    d dVarC13 = dud.c(dVarF);
                    dud.i(dVarC13, ej7Var13, companion13.d());
                    dud.i(dVarC13, gs1VarJ13, companion13.f());
                    dud.i(dVarC13, Integer.valueOf(iHashCode13), companion13.c());
                    dud.g(dVarC13, companion13.a());
                    dud.i(dVarC13, bVarE13, companion13.e());
                    function2B13.invoke(dVarF, 0);
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    nVar2 = nVarK;
                    i17 = i20;
                    i18 = i21;
                    bVar2 = bVar16;
                    dVar2 = dVarF;
                    h0Var2 = h0VarA;
                    eVar3 = eVarJ;
                } else {
                    dVarF.q();
                    bVar2 = bVar;
                    nVar2 = nVar;
                    eVar3 = eVar2;
                    dVar2 = dVarF;
                    i17 = i11;
                    i18 = i2;
                    h0Var2 = h0Var;
                }
                cVar2 = cVarL;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.aj4
                        public final Object invoke(Object obj2, Object obj3) {
                            return b0.j(bVar2, eVar3, nVar2, cVar2, i17, i18, h0Var2, ps4Var, i3, i4, (d) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (dVarF.C(i2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (dVarF.x(h0Var)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i5 |= i16;
            }
            if ((i3 & 12582912) == 0) {
                if (dVarF.T(ps4Var)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i5 |= i23;
            }
            if ((i5 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i5 & 1)) {
                if (i24 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar;
                }
                if (i25 != 0) {
                    eVarJ = c.a.j();
                } else {
                    eVarJ = eVar2;
                }
                if (i6 != 0) {
                    nVarK = c.a.k();
                    i19 = i8;
                } else {
                    i19 = i8;
                    nVarK = nVar;
                }
                if (i19 != 0) {
                    cVarL = tc.INSTANCE.l();
                }
                if (i10 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i11;
                }
                if (i13 != 0) {
                    i21 = Integer.MAX_VALUE;
                } else {
                    i21 = i2;
                }
                if (i15 != 0) {
                    h0VarA = h0.INSTANCE.a();
                } else {
                    h0VarA = h0Var;
                }
                if (e.k()) {
                    e.o(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                }
                i22 = 3670016 & i5;
                if (i22 == 1048576) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objR = dVarF.R();
                if (z2) {
                    objR = h0VarA.b();
                    dVarF.L(objR);
                } else {
                    objR = h0VarA.b();
                    dVarF.L(objR);
                }
                flowLayoutOverflowState = (FlowLayoutOverflowState) objR;
                r28VarV = v(eVarJ, nVarK, cVarL, i20, i21, flowLayoutOverflowState, dVarF, (i5 >> 3) & 65534);
                if (i22 == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((29360128 & i5) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z110 = z4 | z3;
                if ((i5 & 458752) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z110 | z5;
                objR2 = dVarF.R();
                if (z6) {
                    obj = objR2;
                    ArrayList arrayList116 = new ArrayList();
                    arrayList116.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                        public final Object invoke(Object obj2, Object obj3) {
                            return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                        }
                    }));
                    h0VarA.a(flowLayoutOverflowState, arrayList116);
                    dVarF.L(arrayList116);
                    obj = arrayList116;
                } else {
                    obj = objR2;
                    ArrayList arrayList117 = new ArrayList();
                    arrayList117.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                        public final Object invoke(Object obj2, Object obj3) {
                            return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                        }
                    }));
                    h0VarA.a(flowLayoutOverflowState, arrayList117);
                    dVarF.L(arrayList117);
                    obj = arrayList117;
                }
                obj = objR2;
                Function2<d, Integer, Unit> function2B14 = LayoutKt.b((List) obj);
                zX = dVarF.x(r28VarV);
                objR3 = dVarF.R();
                if (zX) {
                    objR3 = t28.a(r28VarV);
                    dVarF.L(objR3);
                } else {
                    objR3 = t28.a(r28VarV);
                    dVarF.L(objR3);
                }
                ej7 ej7Var14 = (ej7) objR3;
                int iHashCode14 = Long.hashCode(pp1.b(dVarF, 0));
                gs1 gs1VarJ14 = dVarF.j();
                b bVarE14 = ComposedModifierKt.e(dVarF, bVar3);
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                b bVar17 = bVar3;
                function0B = companion14.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC14 = dud.c(dVarF);
                dud.i(dVarC14, ej7Var14, companion14.d());
                dud.i(dVarC14, gs1VarJ14, companion14.f());
                dud.i(dVarC14, Integer.valueOf(iHashCode14), companion14.c());
                dud.g(dVarC14, companion14.a());
                dud.i(dVarC14, bVarE14, companion14.e());
                function2B14.invoke(dVarF, 0);
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                nVar2 = nVarK;
                i17 = i20;
                i18 = i21;
                bVar2 = bVar17;
                dVar2 = dVarF;
                h0Var2 = h0VarA;
                eVar3 = eVarJ;
            } else {
                dVarF.q();
                bVar2 = bVar;
                nVar2 = nVar;
                eVar3 = eVar2;
                dVar2 = dVarF;
                i17 = i11;
                i18 = i2;
                h0Var2 = h0Var;
            }
            cVar2 = cVarL;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.aj4
                    public final Object invoke(Object obj2, Object obj3) {
                        return b0.j(bVar2, eVar3, nVar2, cVar2, i17, i18, h0Var2, ps4Var, i3, i4, (d) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i5 |= 3072;
        cVarL = cVar;
        i10 = i4 & 16;
        if (i10 != 0) {
            if ((i3 & 24576) == 0) {
                i11 = i;
                if (dVarF.C(i11)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i5 |= i12;
            }
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (dVarF.C(i2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (dVarF.x(h0Var)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i5 |= i16;
            }
            if ((i3 & 12582912) == 0) {
                if (dVarF.T(ps4Var)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i5 |= i23;
            }
            if ((i5 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i5 & 1)) {
                if (i24 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar;
                }
                if (i25 != 0) {
                    eVarJ = c.a.j();
                } else {
                    eVarJ = eVar2;
                }
                if (i6 != 0) {
                    nVarK = c.a.k();
                    i19 = i8;
                } else {
                    i19 = i8;
                    nVarK = nVar;
                }
                if (i19 != 0) {
                    cVarL = tc.INSTANCE.l();
                }
                if (i10 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i11;
                }
                if (i13 != 0) {
                    i21 = Integer.MAX_VALUE;
                } else {
                    i21 = i2;
                }
                if (i15 != 0) {
                    h0VarA = h0.INSTANCE.a();
                } else {
                    h0VarA = h0Var;
                }
                if (e.k()) {
                    e.o(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                }
                i22 = 3670016 & i5;
                if (i22 == 1048576) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objR = dVarF.R();
                if (z2) {
                    objR = h0VarA.b();
                    dVarF.L(objR);
                } else {
                    objR = h0VarA.b();
                    dVarF.L(objR);
                }
                flowLayoutOverflowState = (FlowLayoutOverflowState) objR;
                r28VarV = v(eVarJ, nVarK, cVarL, i20, i21, flowLayoutOverflowState, dVarF, (i5 >> 3) & 65534);
                if (i22 == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((29360128 & i5) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z111 = z4 | z3;
                if ((i5 & 458752) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z111 | z5;
                objR2 = dVarF.R();
                if (z6) {
                    obj = objR2;
                    ArrayList arrayList118 = new ArrayList();
                    arrayList118.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                        public final Object invoke(Object obj2, Object obj3) {
                            return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                        }
                    }));
                    h0VarA.a(flowLayoutOverflowState, arrayList118);
                    dVarF.L(arrayList118);
                    obj = arrayList118;
                } else {
                    obj = objR2;
                    ArrayList arrayList119 = new ArrayList();
                    arrayList119.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                        public final Object invoke(Object obj2, Object obj3) {
                            return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                        }
                    }));
                    h0VarA.a(flowLayoutOverflowState, arrayList119);
                    dVarF.L(arrayList119);
                    obj = arrayList119;
                }
                obj = objR2;
                Function2<d, Integer, Unit> function2B15 = LayoutKt.b((List) obj);
                zX = dVarF.x(r28VarV);
                objR3 = dVarF.R();
                if (zX) {
                    objR3 = t28.a(r28VarV);
                    dVarF.L(objR3);
                } else {
                    objR3 = t28.a(r28VarV);
                    dVarF.L(objR3);
                }
                ej7 ej7Var15 = (ej7) objR3;
                int iHashCode15 = Long.hashCode(pp1.b(dVarF, 0));
                gs1 gs1VarJ15 = dVarF.j();
                b bVarE15 = ComposedModifierKt.e(dVarF, bVar3);
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                b bVar18 = bVar3;
                function0B = companion15.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC15 = dud.c(dVarF);
                dud.i(dVarC15, ej7Var15, companion15.d());
                dud.i(dVarC15, gs1VarJ15, companion15.f());
                dud.i(dVarC15, Integer.valueOf(iHashCode15), companion15.c());
                dud.g(dVarC15, companion15.a());
                dud.i(dVarC15, bVarE15, companion15.e());
                function2B15.invoke(dVarF, 0);
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                nVar2 = nVarK;
                i17 = i20;
                i18 = i21;
                bVar2 = bVar18;
                dVar2 = dVarF;
                h0Var2 = h0VarA;
                eVar3 = eVarJ;
            } else {
                dVarF.q();
                bVar2 = bVar;
                nVar2 = nVar;
                eVar3 = eVar2;
                dVar2 = dVarF;
                i17 = i11;
                i18 = i2;
                h0Var2 = h0Var;
            }
            cVar2 = cVarL;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.aj4
                    public final Object invoke(Object obj2, Object obj3) {
                        return b0.j(bVar2, eVar3, nVar2, cVar2, i17, i18, h0Var2, ps4Var, i3, i4, (d) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i5 |= 24576;
        i11 = i;
        i13 = i4 & 32;
        if (i13 != 0) {
            i5 |= 196608;
        } else if ((i3 & 196608) == 0) {
            if (dVarF.C(i2)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i5 |= i14;
        }
        i15 = i4 & 64;
        if (i15 != 0) {
            i5 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            if (dVarF.x(h0Var)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i5 |= i16;
        }
        if ((i3 & 12582912) == 0) {
            if (dVarF.T(ps4Var)) {
                i23 = 8388608;
            } else {
                i23 = 4194304;
            }
            i5 |= i23;
        }
        if ((i5 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i5 & 1)) {
            if (i24 != 0) {
                bVar3 = b.INSTANCE;
            } else {
                bVar3 = bVar;
            }
            if (i25 != 0) {
                eVarJ = c.a.j();
            } else {
                eVarJ = eVar2;
            }
            if (i6 != 0) {
                nVarK = c.a.k();
                i19 = i8;
            } else {
                i19 = i8;
                nVarK = nVar;
            }
            if (i19 != 0) {
                cVarL = tc.INSTANCE.l();
            }
            if (i10 != 0) {
                i20 = Integer.MAX_VALUE;
            } else {
                i20 = i11;
            }
            if (i13 != 0) {
                i21 = Integer.MAX_VALUE;
            } else {
                i21 = i2;
            }
            if (i15 != 0) {
                h0VarA = h0.INSTANCE.a();
            } else {
                h0VarA = h0Var;
            }
            if (e.k()) {
                e.o(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
            }
            i22 = 3670016 & i5;
            if (i22 == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            objR = dVarF.R();
            if (z2) {
                objR = h0VarA.b();
                dVarF.L(objR);
            } else {
                objR = h0VarA.b();
                dVarF.L(objR);
            }
            flowLayoutOverflowState = (FlowLayoutOverflowState) objR;
            r28VarV = v(eVarJ, nVarK, cVarL, i20, i21, flowLayoutOverflowState, dVarF, (i5 >> 3) & 65534);
            if (i22 == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((29360128 & i5) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z112 = z4 | z3;
            if ((i5 & 458752) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z112 | z5;
            objR2 = dVarF.R();
            if (z6) {
                obj = objR2;
                ArrayList arrayList1110 = new ArrayList();
                arrayList1110.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                    public final Object invoke(Object obj2, Object obj3) {
                        return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                    }
                }));
                h0VarA.a(flowLayoutOverflowState, arrayList1110);
                dVarF.L(arrayList1110);
                obj = arrayList1110;
            } else {
                obj = objR2;
                ArrayList arrayList1111 = new ArrayList();
                arrayList1111.add(ko1.c(-1192950673, true, new Function2() { // from class: com.google.android.zi4
                    public final Object invoke(Object obj2, Object obj3) {
                        return b0.i(ps4Var, (d) obj2, ((Integer) obj3).intValue());
                    }
                }));
                h0VarA.a(flowLayoutOverflowState, arrayList1111);
                dVarF.L(arrayList1111);
                obj = arrayList1111;
            }
            obj = objR2;
            Function2<d, Integer, Unit> function2B16 = LayoutKt.b((List) obj);
            zX = dVarF.x(r28VarV);
            objR3 = dVarF.R();
            if (zX) {
                objR3 = t28.a(r28VarV);
                dVarF.L(objR3);
            } else {
                objR3 = t28.a(r28VarV);
                dVarF.L(objR3);
            }
            ej7 ej7Var16 = (ej7) objR3;
            int iHashCode16 = Long.hashCode(pp1.b(dVarF, 0));
            gs1 gs1VarJ16 = dVarF.j();
            b bVarE16 = ComposedModifierKt.e(dVarF, bVar3);
            ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
            b bVar19 = bVar3;
            function0B = companion16.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            d dVarC16 = dud.c(dVarF);
            dud.i(dVarC16, ej7Var16, companion16.d());
            dud.i(dVarC16, gs1VarJ16, companion16.f());
            dud.i(dVarC16, Integer.valueOf(iHashCode16), companion16.c());
            dud.g(dVarC16, companion16.a());
            dud.i(dVarC16, bVarE16, companion16.e());
            function2B16.invoke(dVarF, 0);
            dVarF.m();
            if (e.k()) {
                e.n();
            }
            nVar2 = nVarK;
            i17 = i20;
            i18 = i21;
            bVar2 = bVar19;
            dVar2 = dVarF;
            h0Var2 = h0VarA;
            eVar3 = eVarJ;
        } else {
            dVarF.q();
            bVar2 = bVar;
            nVar2 = nVar;
            eVar3 = eVar2;
            dVar2 = dVarF;
            i17 = i11;
            i18 = i2;
            h0Var2 = h0Var;
        }
        cVar2 = cVarL;
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.aj4
                public final Object invoke(Object obj2, Object obj3) {
                    return b0.j(bVar2, eVar3, nVar2, cVar2, i17, i18, h0Var2, ps4Var, i3, i4, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:104:0x015d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0167  */
    /* JADX WARN: Code duplicated, block: B:110:0x017a  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x010e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
    public static final void h(b bVar, c.e eVar, c.n nVar, tc.c cVar, int i, int i2, final ps4<? super jj4, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i3, final int i4) {
        b bVar2;
        int i5;
        c.e eVar2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z;
        d dVar2;
        final tc.c cVar2;
        final b bVar3;
        final c.e eVar3;
        final int i16;
        final c.n nVar2;
        final int i17;
        s6b s6bVarH;
        b bVar4;
        int i18;
        c.e eVarJ;
        c.n nVarK;
        int i19;
        tc.c cVarL;
        int i20;
        int i21;
        d dVarF = dVar.F(-1303174015);
        int i22 = i4 & 1;
        if (i22 != 0) {
            i5 = i3 | 6;
            bVar2 = bVar;
        } else if ((i3 & 6) == 0) {
            bVar2 = bVar;
            i5 = (dVarF.x(bVar2) ? 4 : 2) | i3;
        } else {
            bVar2 = bVar;
            i5 = i3;
        }
        int i23 = i4 & 2;
        if (i23 == 0) {
            if ((i3 & 48) == 0) {
                eVar2 = eVar;
                i5 |= dVarF.x(eVar2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 384) == 0) {
                    if (dVarF.x(nVar)) {
                        i7 = 256;
                    } else {
                        i7 = 128;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                if (i8 != 0) {
                    if ((i3 & 3072) == 0) {
                        if (dVarF.x(cVar)) {
                            i9 = 2048;
                        } else {
                            i9 = 1024;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 16;
                    if (i10 != 0) {
                        if ((i3 & 24576) == 0) {
                            i11 = i;
                            if (dVarF.C(i11)) {
                                i12 = 16384;
                            } else {
                                i12 = 8192;
                            }
                            i5 |= i12;
                        }
                        i13 = i4 & 32;
                        if (i13 != 0) {
                            if ((196608 & i3) == 0) {
                                i14 = i2;
                                if (dVarF.C(i14)) {
                                    i15 = 131072;
                                } else {
                                    i15 = 65536;
                                }
                                i5 |= i15;
                            }
                            if ((i3 & 1572864) == 0) {
                                if (dVarF.T(ps4Var)) {
                                    i21 = 1048576;
                                } else {
                                    i21 = 524288;
                                }
                                i5 |= i21;
                            }
                            if ((i5 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (dVarF.g(z, i5 & 1)) {
                                if (i22 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if (i23 != 0) {
                                    eVarJ = c.a.j();
                                    i18 = i8;
                                } else {
                                    i18 = i8;
                                    eVarJ = eVar2;
                                }
                                if (i6 != 0) {
                                    nVarK = c.a.k();
                                } else {
                                    nVarK = nVar;
                                }
                                if (i18 != 0) {
                                    cVarL = tc.INSTANCE.l();
                                    i19 = i10;
                                } else {
                                    i19 = i10;
                                    cVarL = cVar;
                                }
                                if (i19 != 0) {
                                    i11 = Integer.MAX_VALUE;
                                }
                                if (i13 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                } else {
                                    i20 = i14;
                                }
                                if (e.k()) {
                                    e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                                }
                                dVar2 = dVarF;
                                g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                if (e.k()) {
                                    e.n();
                                }
                                bVar3 = bVar4;
                                eVar3 = eVarJ;
                                nVar2 = nVarK;
                                cVar2 = cVarL;
                                i16 = i20;
                            } else {
                                dVar2 = dVarF;
                                dVar2.q();
                                cVar2 = cVar;
                                bVar3 = bVar2;
                                eVar3 = eVar2;
                                i16 = i14;
                                nVar2 = nVar;
                            }
                            i17 = i11;
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                                    public final Object invoke(Object obj, Object obj2) {
                                        return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i5 |= 196608;
                        i14 = i2;
                        if ((i3 & 1572864) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i5 |= i21;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i5 & 1)) {
                            if (i22 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i23 != 0) {
                                eVarJ = c.a.j();
                                i18 = i8;
                            } else {
                                i18 = i8;
                                eVarJ = eVar2;
                            }
                            if (i6 != 0) {
                                nVarK = c.a.k();
                            } else {
                                nVarK = nVar;
                            }
                            if (i18 != 0) {
                                cVarL = tc.INSTANCE.l();
                                i19 = i10;
                            } else {
                                i19 = i10;
                                cVarL = cVar;
                            }
                            if (i19 != 0) {
                                i11 = Integer.MAX_VALUE;
                            }
                            if (i13 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i14;
                            }
                            if (e.k()) {
                                e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                            }
                            dVar2 = dVarF;
                            g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            if (e.k()) {
                                e.n();
                            }
                            bVar3 = bVar4;
                            eVar3 = eVarJ;
                            nVar2 = nVarK;
                            cVar2 = cVarL;
                            i16 = i20;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            cVar2 = cVar;
                            bVar3 = bVar2;
                            eVar3 = eVar2;
                            i16 = i14;
                            nVar2 = nVar;
                        }
                        i17 = i11;
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                                public final Object invoke(Object obj, Object obj2) {
                                    return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i5 |= 24576;
                    i11 = i;
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        if ((196608 & i3) == 0) {
                            i14 = i2;
                            if (dVarF.C(i14)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                            i5 |= i15;
                        }
                        if ((i3 & 1572864) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i5 |= i21;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i5 & 1)) {
                            if (i22 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i23 != 0) {
                                eVarJ = c.a.j();
                                i18 = i8;
                            } else {
                                i18 = i8;
                                eVarJ = eVar2;
                            }
                            if (i6 != 0) {
                                nVarK = c.a.k();
                            } else {
                                nVarK = nVar;
                            }
                            if (i18 != 0) {
                                cVarL = tc.INSTANCE.l();
                                i19 = i10;
                            } else {
                                i19 = i10;
                                cVarL = cVar;
                            }
                            if (i19 != 0) {
                                i11 = Integer.MAX_VALUE;
                            }
                            if (i13 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i14;
                            }
                            if (e.k()) {
                                e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                            }
                            dVar2 = dVarF;
                            g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            if (e.k()) {
                                e.n();
                            }
                            bVar3 = bVar4;
                            eVar3 = eVarJ;
                            nVar2 = nVarK;
                            cVar2 = cVarL;
                            i16 = i20;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            cVar2 = cVar;
                            bVar3 = bVar2;
                            eVar3 = eVar2;
                            i16 = i14;
                            nVar2 = nVar;
                        }
                        i17 = i11;
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                                public final Object invoke(Object obj, Object obj2) {
                                    return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i5 |= 196608;
                    i14 = i2;
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i5 |= i21;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i5 & 1)) {
                        if (i22 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i23 != 0) {
                            eVarJ = c.a.j();
                            i18 = i8;
                        } else {
                            i18 = i8;
                            eVarJ = eVar2;
                        }
                        if (i6 != 0) {
                            nVarK = c.a.k();
                        } else {
                            nVarK = nVar;
                        }
                        if (i18 != 0) {
                            cVarL = tc.INSTANCE.l();
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cVarL = cVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        if (e.k()) {
                            e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        dVar2 = dVarF;
                        g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                        eVar3 = eVarJ;
                        nVar2 = nVarK;
                        cVar2 = cVarL;
                        i16 = i20;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        cVar2 = cVar;
                        bVar3 = bVar2;
                        eVar3 = eVar2;
                        i16 = i14;
                        nVar2 = nVar;
                    }
                    i17 = i11;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                            public final Object invoke(Object obj, Object obj2) {
                                return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 3072;
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (dVarF.C(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        if ((196608 & i3) == 0) {
                            i14 = i2;
                            if (dVarF.C(i14)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                            i5 |= i15;
                        }
                        if ((i3 & 1572864) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i5 |= i21;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i5 & 1)) {
                            if (i22 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i23 != 0) {
                                eVarJ = c.a.j();
                                i18 = i8;
                            } else {
                                i18 = i8;
                                eVarJ = eVar2;
                            }
                            if (i6 != 0) {
                                nVarK = c.a.k();
                            } else {
                                nVarK = nVar;
                            }
                            if (i18 != 0) {
                                cVarL = tc.INSTANCE.l();
                                i19 = i10;
                            } else {
                                i19 = i10;
                                cVarL = cVar;
                            }
                            if (i19 != 0) {
                                i11 = Integer.MAX_VALUE;
                            }
                            if (i13 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i14;
                            }
                            if (e.k()) {
                                e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                            }
                            dVar2 = dVarF;
                            g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            if (e.k()) {
                                e.n();
                            }
                            bVar3 = bVar4;
                            eVar3 = eVarJ;
                            nVar2 = nVarK;
                            cVar2 = cVarL;
                            i16 = i20;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            cVar2 = cVar;
                            bVar3 = bVar2;
                            eVar3 = eVar2;
                            i16 = i14;
                            nVar2 = nVar;
                        }
                        i17 = i11;
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                                public final Object invoke(Object obj, Object obj2) {
                                    return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i5 |= 196608;
                    i14 = i2;
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i5 |= i21;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i5 & 1)) {
                        if (i22 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i23 != 0) {
                            eVarJ = c.a.j();
                            i18 = i8;
                        } else {
                            i18 = i8;
                            eVarJ = eVar2;
                        }
                        if (i6 != 0) {
                            nVarK = c.a.k();
                        } else {
                            nVarK = nVar;
                        }
                        if (i18 != 0) {
                            cVarL = tc.INSTANCE.l();
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cVarL = cVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        if (e.k()) {
                            e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        dVar2 = dVarF;
                        g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                        eVar3 = eVarJ;
                        nVar2 = nVarK;
                        cVar2 = cVarL;
                        i16 = i20;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        cVar2 = cVar;
                        bVar3 = bVar2;
                        eVar3 = eVar2;
                        i16 = i14;
                        nVar2 = nVar;
                    }
                    i17 = i11;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                            public final Object invoke(Object obj, Object obj2) {
                                return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (dVarF.C(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i5 |= i21;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i5 & 1)) {
                        if (i22 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i23 != 0) {
                            eVarJ = c.a.j();
                            i18 = i8;
                        } else {
                            i18 = i8;
                            eVarJ = eVar2;
                        }
                        if (i6 != 0) {
                            nVarK = c.a.k();
                        } else {
                            nVarK = nVar;
                        }
                        if (i18 != 0) {
                            cVarL = tc.INSTANCE.l();
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cVarL = cVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        if (e.k()) {
                            e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        dVar2 = dVarF;
                        g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                        eVar3 = eVarJ;
                        nVar2 = nVarK;
                        cVar2 = cVarL;
                        i16 = i20;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        cVar2 = cVar;
                        bVar3 = bVar2;
                        eVar3 = eVar2;
                        i16 = i14;
                        nVar2 = nVar;
                    }
                    i17 = i11;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                            public final Object invoke(Object obj, Object obj2) {
                                return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i5 |= i21;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i5 & 1)) {
                    if (i22 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i23 != 0) {
                        eVarJ = c.a.j();
                        i18 = i8;
                    } else {
                        i18 = i8;
                        eVarJ = eVar2;
                    }
                    if (i6 != 0) {
                        nVarK = c.a.k();
                    } else {
                        nVarK = nVar;
                    }
                    if (i18 != 0) {
                        cVarL = tc.INSTANCE.l();
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cVarL = cVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    if (e.k()) {
                        e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    dVar2 = dVarF;
                    g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    eVar3 = eVarJ;
                    nVar2 = nVarK;
                    cVar2 = cVarL;
                    i16 = i20;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    cVar2 = cVar;
                    bVar3 = bVar2;
                    eVar3 = eVar2;
                    i16 = i14;
                    nVar2 = nVar;
                }
                i17 = i11;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                        public final Object invoke(Object obj, Object obj2) {
                            return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 384;
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    if (dVarF.x(cVar)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (dVarF.C(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        if ((196608 & i3) == 0) {
                            i14 = i2;
                            if (dVarF.C(i14)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                            i5 |= i15;
                        }
                        if ((i3 & 1572864) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i5 |= i21;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i5 & 1)) {
                            if (i22 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i23 != 0) {
                                eVarJ = c.a.j();
                                i18 = i8;
                            } else {
                                i18 = i8;
                                eVarJ = eVar2;
                            }
                            if (i6 != 0) {
                                nVarK = c.a.k();
                            } else {
                                nVarK = nVar;
                            }
                            if (i18 != 0) {
                                cVarL = tc.INSTANCE.l();
                                i19 = i10;
                            } else {
                                i19 = i10;
                                cVarL = cVar;
                            }
                            if (i19 != 0) {
                                i11 = Integer.MAX_VALUE;
                            }
                            if (i13 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i14;
                            }
                            if (e.k()) {
                                e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                            }
                            dVar2 = dVarF;
                            g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            if (e.k()) {
                                e.n();
                            }
                            bVar3 = bVar4;
                            eVar3 = eVarJ;
                            nVar2 = nVarK;
                            cVar2 = cVarL;
                            i16 = i20;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            cVar2 = cVar;
                            bVar3 = bVar2;
                            eVar3 = eVar2;
                            i16 = i14;
                            nVar2 = nVar;
                        }
                        i17 = i11;
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                                public final Object invoke(Object obj, Object obj2) {
                                    return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i5 |= 196608;
                    i14 = i2;
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i5 |= i21;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i5 & 1)) {
                        if (i22 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i23 != 0) {
                            eVarJ = c.a.j();
                            i18 = i8;
                        } else {
                            i18 = i8;
                            eVarJ = eVar2;
                        }
                        if (i6 != 0) {
                            nVarK = c.a.k();
                        } else {
                            nVarK = nVar;
                        }
                        if (i18 != 0) {
                            cVarL = tc.INSTANCE.l();
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cVarL = cVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        if (e.k()) {
                            e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        dVar2 = dVarF;
                        g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                        eVar3 = eVarJ;
                        nVar2 = nVarK;
                        cVar2 = cVarL;
                        i16 = i20;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        cVar2 = cVar;
                        bVar3 = bVar2;
                        eVar3 = eVar2;
                        i16 = i14;
                        nVar2 = nVar;
                    }
                    i17 = i11;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                            public final Object invoke(Object obj, Object obj2) {
                                return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (dVarF.C(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i5 |= i21;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i5 & 1)) {
                        if (i22 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i23 != 0) {
                            eVarJ = c.a.j();
                            i18 = i8;
                        } else {
                            i18 = i8;
                            eVarJ = eVar2;
                        }
                        if (i6 != 0) {
                            nVarK = c.a.k();
                        } else {
                            nVarK = nVar;
                        }
                        if (i18 != 0) {
                            cVarL = tc.INSTANCE.l();
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cVarL = cVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        if (e.k()) {
                            e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        dVar2 = dVarF;
                        g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                        eVar3 = eVarJ;
                        nVar2 = nVarK;
                        cVar2 = cVarL;
                        i16 = i20;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        cVar2 = cVar;
                        bVar3 = bVar2;
                        eVar3 = eVar2;
                        i16 = i14;
                        nVar2 = nVar;
                    }
                    i17 = i11;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                            public final Object invoke(Object obj, Object obj2) {
                                return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i5 |= i21;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i5 & 1)) {
                    if (i22 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i23 != 0) {
                        eVarJ = c.a.j();
                        i18 = i8;
                    } else {
                        i18 = i8;
                        eVarJ = eVar2;
                    }
                    if (i6 != 0) {
                        nVarK = c.a.k();
                    } else {
                        nVarK = nVar;
                    }
                    if (i18 != 0) {
                        cVarL = tc.INSTANCE.l();
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cVarL = cVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    if (e.k()) {
                        e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    dVar2 = dVarF;
                    g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    eVar3 = eVarJ;
                    nVar2 = nVarK;
                    cVar2 = cVarL;
                    i16 = i20;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    cVar2 = cVar;
                    bVar3 = bVar2;
                    eVar3 = eVar2;
                    i16 = i14;
                    nVar2 = nVar;
                }
                i17 = i11;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                        public final Object invoke(Object obj, Object obj2) {
                            return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 3072;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (dVarF.C(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (dVarF.C(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i5 |= i21;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i5 & 1)) {
                        if (i22 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i23 != 0) {
                            eVarJ = c.a.j();
                            i18 = i8;
                        } else {
                            i18 = i8;
                            eVarJ = eVar2;
                        }
                        if (i6 != 0) {
                            nVarK = c.a.k();
                        } else {
                            nVarK = nVar;
                        }
                        if (i18 != 0) {
                            cVarL = tc.INSTANCE.l();
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cVarL = cVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        if (e.k()) {
                            e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        dVar2 = dVarF;
                        g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                        eVar3 = eVarJ;
                        nVar2 = nVarK;
                        cVar2 = cVarL;
                        i16 = i20;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        cVar2 = cVar;
                        bVar3 = bVar2;
                        eVar3 = eVar2;
                        i16 = i14;
                        nVar2 = nVar;
                    }
                    i17 = i11;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                            public final Object invoke(Object obj, Object obj2) {
                                return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i5 |= i21;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i5 & 1)) {
                    if (i22 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i23 != 0) {
                        eVarJ = c.a.j();
                        i18 = i8;
                    } else {
                        i18 = i8;
                        eVarJ = eVar2;
                    }
                    if (i6 != 0) {
                        nVarK = c.a.k();
                    } else {
                        nVarK = nVar;
                    }
                    if (i18 != 0) {
                        cVarL = tc.INSTANCE.l();
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cVarL = cVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    if (e.k()) {
                        e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    dVar2 = dVarF;
                    g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    eVar3 = eVarJ;
                    nVar2 = nVarK;
                    cVar2 = cVarL;
                    i16 = i20;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    cVar2 = cVar;
                    bVar3 = bVar2;
                    eVar3 = eVar2;
                    i16 = i14;
                    nVar2 = nVar;
                }
                i17 = i11;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                        public final Object invoke(Object obj, Object obj2) {
                            return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                if ((196608 & i3) == 0) {
                    i14 = i2;
                    if (dVarF.C(i14)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i5 |= i15;
                }
                if ((i3 & 1572864) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i5 |= i21;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i5 & 1)) {
                    if (i22 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i23 != 0) {
                        eVarJ = c.a.j();
                        i18 = i8;
                    } else {
                        i18 = i8;
                        eVarJ = eVar2;
                    }
                    if (i6 != 0) {
                        nVarK = c.a.k();
                    } else {
                        nVarK = nVar;
                    }
                    if (i18 != 0) {
                        cVarL = tc.INSTANCE.l();
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cVarL = cVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    if (e.k()) {
                        e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    dVar2 = dVarF;
                    g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    eVar3 = eVarJ;
                    nVar2 = nVarK;
                    cVar2 = cVarL;
                    i16 = i20;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    cVar2 = cVar;
                    bVar3 = bVar2;
                    eVar3 = eVar2;
                    i16 = i14;
                    nVar2 = nVar;
                }
                i17 = i11;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                        public final Object invoke(Object obj, Object obj2) {
                            return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 196608;
            i14 = i2;
            if ((i3 & 1572864) == 0) {
                if (dVarF.T(ps4Var)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i5 |= i21;
            }
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i5 & 1)) {
                if (i22 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i23 != 0) {
                    eVarJ = c.a.j();
                    i18 = i8;
                } else {
                    i18 = i8;
                    eVarJ = eVar2;
                }
                if (i6 != 0) {
                    nVarK = c.a.k();
                } else {
                    nVarK = nVar;
                }
                if (i18 != 0) {
                    cVarL = tc.INSTANCE.l();
                    i19 = i10;
                } else {
                    i19 = i10;
                    cVarL = cVar;
                }
                if (i19 != 0) {
                    i11 = Integer.MAX_VALUE;
                }
                if (i13 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i14;
                }
                if (e.k()) {
                    e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                }
                dVar2 = dVarF;
                g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
                eVar3 = eVarJ;
                nVar2 = nVarK;
                cVar2 = cVarL;
                i16 = i20;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                cVar2 = cVar;
                bVar3 = bVar2;
                eVar3 = eVar2;
                i16 = i14;
                nVar2 = nVar;
            }
            i17 = i11;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                    public final Object invoke(Object obj, Object obj2) {
                        return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 48;
        eVar2 = eVar;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 384) == 0) {
                if (dVarF.x(nVar)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    if (dVarF.x(cVar)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (dVarF.C(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        if ((196608 & i3) == 0) {
                            i14 = i2;
                            if (dVarF.C(i14)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                            i5 |= i15;
                        }
                        if ((i3 & 1572864) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i5 |= i21;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i5 & 1)) {
                            if (i22 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i23 != 0) {
                                eVarJ = c.a.j();
                                i18 = i8;
                            } else {
                                i18 = i8;
                                eVarJ = eVar2;
                            }
                            if (i6 != 0) {
                                nVarK = c.a.k();
                            } else {
                                nVarK = nVar;
                            }
                            if (i18 != 0) {
                                cVarL = tc.INSTANCE.l();
                                i19 = i10;
                            } else {
                                i19 = i10;
                                cVarL = cVar;
                            }
                            if (i19 != 0) {
                                i11 = Integer.MAX_VALUE;
                            }
                            if (i13 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i14;
                            }
                            if (e.k()) {
                                e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                            }
                            dVar2 = dVarF;
                            g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            if (e.k()) {
                                e.n();
                            }
                            bVar3 = bVar4;
                            eVar3 = eVarJ;
                            nVar2 = nVarK;
                            cVar2 = cVarL;
                            i16 = i20;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            cVar2 = cVar;
                            bVar3 = bVar2;
                            eVar3 = eVar2;
                            i16 = i14;
                            nVar2 = nVar;
                        }
                        i17 = i11;
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                                public final Object invoke(Object obj, Object obj2) {
                                    return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i5 |= 196608;
                    i14 = i2;
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i5 |= i21;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i5 & 1)) {
                        if (i22 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i23 != 0) {
                            eVarJ = c.a.j();
                            i18 = i8;
                        } else {
                            i18 = i8;
                            eVarJ = eVar2;
                        }
                        if (i6 != 0) {
                            nVarK = c.a.k();
                        } else {
                            nVarK = nVar;
                        }
                        if (i18 != 0) {
                            cVarL = tc.INSTANCE.l();
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cVarL = cVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        if (e.k()) {
                            e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        dVar2 = dVarF;
                        g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                        eVar3 = eVarJ;
                        nVar2 = nVarK;
                        cVar2 = cVarL;
                        i16 = i20;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        cVar2 = cVar;
                        bVar3 = bVar2;
                        eVar3 = eVar2;
                        i16 = i14;
                        nVar2 = nVar;
                    }
                    i17 = i11;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                            public final Object invoke(Object obj, Object obj2) {
                                return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (dVarF.C(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i5 |= i21;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i5 & 1)) {
                        if (i22 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i23 != 0) {
                            eVarJ = c.a.j();
                            i18 = i8;
                        } else {
                            i18 = i8;
                            eVarJ = eVar2;
                        }
                        if (i6 != 0) {
                            nVarK = c.a.k();
                        } else {
                            nVarK = nVar;
                        }
                        if (i18 != 0) {
                            cVarL = tc.INSTANCE.l();
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cVarL = cVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        if (e.k()) {
                            e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        dVar2 = dVarF;
                        g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                        eVar3 = eVarJ;
                        nVar2 = nVarK;
                        cVar2 = cVarL;
                        i16 = i20;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        cVar2 = cVar;
                        bVar3 = bVar2;
                        eVar3 = eVar2;
                        i16 = i14;
                        nVar2 = nVar;
                    }
                    i17 = i11;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                            public final Object invoke(Object obj, Object obj2) {
                                return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i5 |= i21;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i5 & 1)) {
                    if (i22 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i23 != 0) {
                        eVarJ = c.a.j();
                        i18 = i8;
                    } else {
                        i18 = i8;
                        eVarJ = eVar2;
                    }
                    if (i6 != 0) {
                        nVarK = c.a.k();
                    } else {
                        nVarK = nVar;
                    }
                    if (i18 != 0) {
                        cVarL = tc.INSTANCE.l();
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cVarL = cVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    if (e.k()) {
                        e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    dVar2 = dVarF;
                    g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    eVar3 = eVarJ;
                    nVar2 = nVarK;
                    cVar2 = cVarL;
                    i16 = i20;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    cVar2 = cVar;
                    bVar3 = bVar2;
                    eVar3 = eVar2;
                    i16 = i14;
                    nVar2 = nVar;
                }
                i17 = i11;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                        public final Object invoke(Object obj, Object obj2) {
                            return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 3072;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (dVarF.C(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (dVarF.C(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i5 |= i21;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i5 & 1)) {
                        if (i22 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i23 != 0) {
                            eVarJ = c.a.j();
                            i18 = i8;
                        } else {
                            i18 = i8;
                            eVarJ = eVar2;
                        }
                        if (i6 != 0) {
                            nVarK = c.a.k();
                        } else {
                            nVarK = nVar;
                        }
                        if (i18 != 0) {
                            cVarL = tc.INSTANCE.l();
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cVarL = cVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        if (e.k()) {
                            e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        dVar2 = dVarF;
                        g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                        eVar3 = eVarJ;
                        nVar2 = nVarK;
                        cVar2 = cVarL;
                        i16 = i20;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        cVar2 = cVar;
                        bVar3 = bVar2;
                        eVar3 = eVar2;
                        i16 = i14;
                        nVar2 = nVar;
                    }
                    i17 = i11;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                            public final Object invoke(Object obj, Object obj2) {
                                return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i5 |= i21;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i5 & 1)) {
                    if (i22 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i23 != 0) {
                        eVarJ = c.a.j();
                        i18 = i8;
                    } else {
                        i18 = i8;
                        eVarJ = eVar2;
                    }
                    if (i6 != 0) {
                        nVarK = c.a.k();
                    } else {
                        nVarK = nVar;
                    }
                    if (i18 != 0) {
                        cVarL = tc.INSTANCE.l();
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cVarL = cVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    if (e.k()) {
                        e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    dVar2 = dVarF;
                    g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    eVar3 = eVarJ;
                    nVar2 = nVarK;
                    cVar2 = cVarL;
                    i16 = i20;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    cVar2 = cVar;
                    bVar3 = bVar2;
                    eVar3 = eVar2;
                    i16 = i14;
                    nVar2 = nVar;
                }
                i17 = i11;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                        public final Object invoke(Object obj, Object obj2) {
                            return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                if ((196608 & i3) == 0) {
                    i14 = i2;
                    if (dVarF.C(i14)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i5 |= i15;
                }
                if ((i3 & 1572864) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i5 |= i21;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i5 & 1)) {
                    if (i22 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i23 != 0) {
                        eVarJ = c.a.j();
                        i18 = i8;
                    } else {
                        i18 = i8;
                        eVarJ = eVar2;
                    }
                    if (i6 != 0) {
                        nVarK = c.a.k();
                    } else {
                        nVarK = nVar;
                    }
                    if (i18 != 0) {
                        cVarL = tc.INSTANCE.l();
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cVarL = cVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    if (e.k()) {
                        e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    dVar2 = dVarF;
                    g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    eVar3 = eVarJ;
                    nVar2 = nVarK;
                    cVar2 = cVarL;
                    i16 = i20;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    cVar2 = cVar;
                    bVar3 = bVar2;
                    eVar3 = eVar2;
                    i16 = i14;
                    nVar2 = nVar;
                }
                i17 = i11;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                        public final Object invoke(Object obj, Object obj2) {
                            return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 196608;
            i14 = i2;
            if ((i3 & 1572864) == 0) {
                if (dVarF.T(ps4Var)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i5 |= i21;
            }
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i5 & 1)) {
                if (i22 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i23 != 0) {
                    eVarJ = c.a.j();
                    i18 = i8;
                } else {
                    i18 = i8;
                    eVarJ = eVar2;
                }
                if (i6 != 0) {
                    nVarK = c.a.k();
                } else {
                    nVarK = nVar;
                }
                if (i18 != 0) {
                    cVarL = tc.INSTANCE.l();
                    i19 = i10;
                } else {
                    i19 = i10;
                    cVarL = cVar;
                }
                if (i19 != 0) {
                    i11 = Integer.MAX_VALUE;
                }
                if (i13 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i14;
                }
                if (e.k()) {
                    e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                }
                dVar2 = dVarF;
                g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
                eVar3 = eVarJ;
                nVar2 = nVarK;
                cVar2 = cVarL;
                i16 = i20;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                cVar2 = cVar;
                bVar3 = bVar2;
                eVar3 = eVar2;
                i16 = i14;
                nVar2 = nVar;
            }
            i17 = i11;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                    public final Object invoke(Object obj, Object obj2) {
                        return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 384;
        i8 = i4 & 8;
        if (i8 != 0) {
            if ((i3 & 3072) == 0) {
                if (dVarF.x(cVar)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i5 |= i9;
            }
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (dVarF.C(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (dVarF.C(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i5 |= i21;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i5 & 1)) {
                        if (i22 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i23 != 0) {
                            eVarJ = c.a.j();
                            i18 = i8;
                        } else {
                            i18 = i8;
                            eVarJ = eVar2;
                        }
                        if (i6 != 0) {
                            nVarK = c.a.k();
                        } else {
                            nVarK = nVar;
                        }
                        if (i18 != 0) {
                            cVarL = tc.INSTANCE.l();
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cVarL = cVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        if (e.k()) {
                            e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        dVar2 = dVarF;
                        g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                        eVar3 = eVarJ;
                        nVar2 = nVarK;
                        cVar2 = cVarL;
                        i16 = i20;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        cVar2 = cVar;
                        bVar3 = bVar2;
                        eVar3 = eVar2;
                        i16 = i14;
                        nVar2 = nVar;
                    }
                    i17 = i11;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                            public final Object invoke(Object obj, Object obj2) {
                                return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i5 |= i21;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i5 & 1)) {
                    if (i22 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i23 != 0) {
                        eVarJ = c.a.j();
                        i18 = i8;
                    } else {
                        i18 = i8;
                        eVarJ = eVar2;
                    }
                    if (i6 != 0) {
                        nVarK = c.a.k();
                    } else {
                        nVarK = nVar;
                    }
                    if (i18 != 0) {
                        cVarL = tc.INSTANCE.l();
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cVarL = cVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    if (e.k()) {
                        e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    dVar2 = dVarF;
                    g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    eVar3 = eVarJ;
                    nVar2 = nVarK;
                    cVar2 = cVarL;
                    i16 = i20;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    cVar2 = cVar;
                    bVar3 = bVar2;
                    eVar3 = eVar2;
                    i16 = i14;
                    nVar2 = nVar;
                }
                i17 = i11;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                        public final Object invoke(Object obj, Object obj2) {
                            return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                if ((196608 & i3) == 0) {
                    i14 = i2;
                    if (dVarF.C(i14)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i5 |= i15;
                }
                if ((i3 & 1572864) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i5 |= i21;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i5 & 1)) {
                    if (i22 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i23 != 0) {
                        eVarJ = c.a.j();
                        i18 = i8;
                    } else {
                        i18 = i8;
                        eVarJ = eVar2;
                    }
                    if (i6 != 0) {
                        nVarK = c.a.k();
                    } else {
                        nVarK = nVar;
                    }
                    if (i18 != 0) {
                        cVarL = tc.INSTANCE.l();
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cVarL = cVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    if (e.k()) {
                        e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    dVar2 = dVarF;
                    g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    eVar3 = eVarJ;
                    nVar2 = nVarK;
                    cVar2 = cVarL;
                    i16 = i20;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    cVar2 = cVar;
                    bVar3 = bVar2;
                    eVar3 = eVar2;
                    i16 = i14;
                    nVar2 = nVar;
                }
                i17 = i11;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                        public final Object invoke(Object obj, Object obj2) {
                            return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 196608;
            i14 = i2;
            if ((i3 & 1572864) == 0) {
                if (dVarF.T(ps4Var)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i5 |= i21;
            }
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i5 & 1)) {
                if (i22 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i23 != 0) {
                    eVarJ = c.a.j();
                    i18 = i8;
                } else {
                    i18 = i8;
                    eVarJ = eVar2;
                }
                if (i6 != 0) {
                    nVarK = c.a.k();
                } else {
                    nVarK = nVar;
                }
                if (i18 != 0) {
                    cVarL = tc.INSTANCE.l();
                    i19 = i10;
                } else {
                    i19 = i10;
                    cVarL = cVar;
                }
                if (i19 != 0) {
                    i11 = Integer.MAX_VALUE;
                }
                if (i13 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i14;
                }
                if (e.k()) {
                    e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                }
                dVar2 = dVarF;
                g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
                eVar3 = eVarJ;
                nVar2 = nVarK;
                cVar2 = cVarL;
                i16 = i20;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                cVar2 = cVar;
                bVar3 = bVar2;
                eVar3 = eVar2;
                i16 = i14;
                nVar2 = nVar;
            }
            i17 = i11;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                    public final Object invoke(Object obj, Object obj2) {
                        return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 3072;
        i10 = i4 & 16;
        if (i10 != 0) {
            if ((i3 & 24576) == 0) {
                i11 = i;
                if (dVarF.C(i11)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i5 |= i12;
            }
            i13 = i4 & 32;
            if (i13 != 0) {
                if ((196608 & i3) == 0) {
                    i14 = i2;
                    if (dVarF.C(i14)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i5 |= i15;
                }
                if ((i3 & 1572864) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i5 |= i21;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i5 & 1)) {
                    if (i22 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i23 != 0) {
                        eVarJ = c.a.j();
                        i18 = i8;
                    } else {
                        i18 = i8;
                        eVarJ = eVar2;
                    }
                    if (i6 != 0) {
                        nVarK = c.a.k();
                    } else {
                        nVarK = nVar;
                    }
                    if (i18 != 0) {
                        cVarL = tc.INSTANCE.l();
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cVarL = cVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    if (e.k()) {
                        e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    dVar2 = dVarF;
                    g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    eVar3 = eVarJ;
                    nVar2 = nVarK;
                    cVar2 = cVarL;
                    i16 = i20;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    cVar2 = cVar;
                    bVar3 = bVar2;
                    eVar3 = eVar2;
                    i16 = i14;
                    nVar2 = nVar;
                }
                i17 = i11;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                        public final Object invoke(Object obj, Object obj2) {
                            return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 196608;
            i14 = i2;
            if ((i3 & 1572864) == 0) {
                if (dVarF.T(ps4Var)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i5 |= i21;
            }
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i5 & 1)) {
                if (i22 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i23 != 0) {
                    eVarJ = c.a.j();
                    i18 = i8;
                } else {
                    i18 = i8;
                    eVarJ = eVar2;
                }
                if (i6 != 0) {
                    nVarK = c.a.k();
                } else {
                    nVarK = nVar;
                }
                if (i18 != 0) {
                    cVarL = tc.INSTANCE.l();
                    i19 = i10;
                } else {
                    i19 = i10;
                    cVarL = cVar;
                }
                if (i19 != 0) {
                    i11 = Integer.MAX_VALUE;
                }
                if (i13 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i14;
                }
                if (e.k()) {
                    e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                }
                dVar2 = dVarF;
                g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
                eVar3 = eVarJ;
                nVar2 = nVarK;
                cVar2 = cVarL;
                i16 = i20;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                cVar2 = cVar;
                bVar3 = bVar2;
                eVar3 = eVar2;
                i16 = i14;
                nVar2 = nVar;
            }
            i17 = i11;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                    public final Object invoke(Object obj, Object obj2) {
                        return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 24576;
        i11 = i;
        i13 = i4 & 32;
        if (i13 != 0) {
            if ((196608 & i3) == 0) {
                i14 = i2;
                if (dVarF.C(i14)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i5 |= i15;
            }
            if ((i3 & 1572864) == 0) {
                if (dVarF.T(ps4Var)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i5 |= i21;
            }
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i5 & 1)) {
                if (i22 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i23 != 0) {
                    eVarJ = c.a.j();
                    i18 = i8;
                } else {
                    i18 = i8;
                    eVarJ = eVar2;
                }
                if (i6 != 0) {
                    nVarK = c.a.k();
                } else {
                    nVarK = nVar;
                }
                if (i18 != 0) {
                    cVarL = tc.INSTANCE.l();
                    i19 = i10;
                } else {
                    i19 = i10;
                    cVarL = cVar;
                }
                if (i19 != 0) {
                    i11 = Integer.MAX_VALUE;
                }
                if (i13 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i14;
                }
                if (e.k()) {
                    e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                }
                dVar2 = dVarF;
                g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
                eVar3 = eVarJ;
                nVar2 = nVarK;
                cVar2 = cVarL;
                i16 = i20;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                cVar2 = cVar;
                bVar3 = bVar2;
                eVar3 = eVar2;
                i16 = i14;
                nVar2 = nVar;
            }
            i17 = i11;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                    public final Object invoke(Object obj, Object obj2) {
                        return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 196608;
        i14 = i2;
        if ((i3 & 1572864) == 0) {
            if (dVarF.T(ps4Var)) {
                i21 = 1048576;
            } else {
                i21 = 524288;
            }
            i5 |= i21;
        }
        if ((i5 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i5 & 1)) {
            if (i22 != 0) {
                bVar4 = b.INSTANCE;
            } else {
                bVar4 = bVar2;
            }
            if (i23 != 0) {
                eVarJ = c.a.j();
                i18 = i8;
            } else {
                i18 = i8;
                eVarJ = eVar2;
            }
            if (i6 != 0) {
                nVarK = c.a.k();
            } else {
                nVarK = nVar;
            }
            if (i18 != 0) {
                cVarL = tc.INSTANCE.l();
                i19 = i10;
            } else {
                i19 = i10;
                cVarL = cVar;
            }
            if (i19 != 0) {
                i11 = Integer.MAX_VALUE;
            }
            if (i13 != 0) {
                i20 = Integer.MAX_VALUE;
            } else {
                i20 = i14;
            }
            if (e.k()) {
                e.o(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
            }
            dVar2 = dVarF;
            g(bVar4, eVarJ, nVarK, cVarL, i11, i20, h0.INSTANCE.a(), ps4Var, dVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
            if (e.k()) {
                e.n();
            }
            bVar3 = bVar4;
            eVar3 = eVarJ;
            nVar2 = nVarK;
            cVar2 = cVarL;
            i16 = i20;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            cVar2 = cVar;
            bVar3 = bVar2;
            eVar3 = eVar2;
            i16 = i14;
            nVar2 = nVar;
        }
        i17 = i11;
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.yi4
                public final Object invoke(Object obj, Object obj2) {
                    return b0.k(bVar3, eVar3, nVar2, cVar2, i17, i16, ps4Var, i3, i4, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(ps4 ps4Var, d dVar, int i) {
        if (dVar.g((i & 3) != 2, i & 1)) {
            if (e.k()) {
                e.o(-1192950673, i, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:113)");
            }
            ps4Var.invoke(kj4.b, dVar, 6);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(b bVar, c.e eVar, c.n nVar, tc.c cVar, int i, int i2, h0 h0Var, ps4 ps4Var, int i3, int i4, d dVar, int i5) {
        g(bVar, eVar, nVar, cVar, i, i2, h0Var, ps4Var, dVar, saa.a(i3 | 1), i4);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(b bVar, c.e eVar, c.n nVar, tc.c cVar, int i, int i2, ps4 ps4Var, int i3, int i4, d dVar, int i5) {
        h(bVar, eVar, nVar, cVar, i, i2, ps4Var, dVar, saa.a(i3 | 1), i4);
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final fj7 m(j jVar, d0 d0Var, Iterator<? extends dj7> it, float f, float f2, long j, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i3;
        a0.a aVarA;
        o48 o48Var;
        int i4;
        int i5;
        int height;
        int width;
        o48 o48Var2;
        t06 t06VarA;
        int i6;
        n48 n48Var;
        n48 n48Var2;
        a0.a aVar;
        int i7;
        int i8;
        j jVar2 = jVar;
        d0 d0Var2 = d0Var;
        Iterator<? extends dj7> it2 = it;
        r58 r58Var = new r58(new fj7[16], 0);
        int iL = kx1.l(j);
        int iN = kx1.n(j);
        int iK = kx1.k(j);
        o48 o48VarC = f16.c();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(jVar2.x2(f));
        int iCeil2 = (int) Math.ceil(jVar2.x2(f2));
        long jA = bu8.a(0, iL, 0, iK);
        long jF = bu8.f(bu8.e(jA, 0, 0, 0, 0, 14, null), d0Var2.getIsHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        gj4 gj4Var = it2 instanceof n22 ? new gj4(0, 0, jVar2.O0(iL), jVar2.O0(iK), null) : null;
        dj7 dj7VarW = !it2.hasNext() ? null : w(it2, gj4Var);
        t06 t06VarA2 = dj7VarW != null ? t06.a(s(dj7VarW, d0Var2, jF, new Function1() { // from class: com.google.android.bj4
            public final Object invoke(Object obj) {
                return b0.n(objectRef, (o) obj);
            }
        })) : null;
        Integer numValueOf = t06VarA2 != null ? Integer.valueOf(t06.e(t06VarA2.getPackedValue())) : null;
        Integer numValueOf2 = t06VarA2 != null ? Integer.valueOf(t06.f(t06VarA2.getPackedValue())) : null;
        Integer num = numValueOf;
        dj7 dj7Var = dj7VarW;
        n48 n48Var3 = new n48(0, 1, null);
        n48 n48Var4 = new n48(0, 1, null);
        p48 p48VarB = p16.b();
        gj4 gj4Var2 = gj4Var;
        a0 a0Var = new a0(i, flowLayoutOverflowState, j, i2, iCeil, iCeil2, null);
        int i9 = iCeil;
        a0.b bVarB = a0Var.b(it2.hasNext(), 0, t06.b(iL, iK), t06VarA2, 0, 0, 0, false, false);
        if (bVarB.getIsLastItemInContainer()) {
            aVarA = a0Var.a(bVarB, t06VarA2 != null, -1, 0, iL, 0);
            i3 = iL;
        } else {
            i3 = iL;
            aVarA = null;
        }
        Integer numValueOf3 = num;
        a0.a aVar2 = aVarA;
        n48 n48Var5 = n48Var3;
        int i10 = 0;
        int i11 = 0;
        boolean z = false;
        int i12 = 0;
        a0.b bVar = bVarB;
        dj7 dj7VarW2 = dj7Var;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = i3;
        int i17 = iN;
        p48 p48Var = p48VarB;
        int i18 = iK;
        while (!bVar.getIsLastItemInContainer() && dj7VarW2 != null) {
            Intrinsics.g(numValueOf3);
            int iIntValue = numValueOf3.intValue();
            Intrinsics.g(numValueOf2);
            n48 n48Var6 = n48Var4;
            int i19 = i3;
            int i20 = i11 + iIntValue;
            int iMax = Math.max(i14, numValueOf2.intValue());
            int i21 = i16 - iIntValue;
            int i22 = i10 + 1;
            int i23 = i17;
            flowLayoutOverflowState.i(i22);
            arrayList.add(dj7VarW2);
            o48VarC.r(i10, objectRef.element);
            Object objF = dj7VarW2.getParentData();
            RowColumnParentData rowColumnParentData = objF instanceof RowColumnParentData ? (RowColumnParentData) objF : null;
            if (rowColumnParentData != null) {
                rowColumnParentData.c();
            }
            int i24 = i22 - i15;
            boolean z2 = i24 < i;
            if (gj4Var2 != null) {
                int i25 = z2 ? i13 : i13 + 1;
                int i26 = z2 ? i24 : 0;
                if (z2) {
                    int i27 = i21 - i9;
                    i7 = i27 < 0 ? 0 : i27;
                } else {
                    i7 = i19;
                }
                float fO0 = jVar2.O0(i7);
                if (z2) {
                    o48Var2 = o48VarC;
                    i8 = i18;
                } else {
                    int i28 = (i18 - iMax) - iCeil2;
                    o48Var2 = o48VarC;
                    i8 = i28 < 0 ? 0 : i28;
                }
                gj4Var2.a(i25, i26, fO0, jVar2.O0(i8));
                Unit unit = Unit.a;
            } else {
                i24 = i24;
                o48Var2 = o48VarC;
            }
            dj7VarW2 = !it2.hasNext() ? null : w(it2, gj4Var2);
            objectRef.element = null;
            t06 t06VarA3 = dj7VarW2 != null ? t06.a(s(dj7VarW2, d0Var2, jF, new Function1() { // from class: com.google.android.cj4
                public final Object invoke(Object obj) {
                    return b0.o(objectRef, (o) obj);
                }
            })) : null;
            Integer numValueOf4 = t06VarA3 != null ? Integer.valueOf(t06.e(t06VarA3.getPackedValue()) + i9) : null;
            numValueOf2 = t06VarA3 != null ? Integer.valueOf(t06.f(t06VarA3.getPackedValue())) : null;
            boolean zHasNext = it2.hasNext();
            int i29 = i13;
            long jB = t06.b(i21, i18);
            if (t06VarA3 == null) {
                t06VarA = null;
            } else {
                Intrinsics.g(numValueOf4);
                int iIntValue2 = numValueOf4.intValue();
                Intrinsics.g(numValueOf2);
                t06VarA = t06.a(t06.b(iIntValue2, numValueOf2.intValue()));
            }
            a0.b bVarB2 = a0Var.b(zHasNext, i24, jB, t06VarA, i29, i12, iMax, false, false);
            if (bVarB2.getIsLastItemInLine()) {
                int iMin = Math.min(Math.max(i23, i20), i19);
                int i30 = i12 + iMax;
                a0.a aVarA2 = a0Var.a(bVarB2, t06VarA3 != null, i29, i30, i21, i24);
                n48Var = n48Var6;
                n48Var.k(iMax);
                p48 p48Var2 = p48Var;
                if (z) {
                    p48Var2.r(i29);
                }
                int i31 = (iK - i30) - iCeil2;
                p48Var = p48Var2;
                n48Var2 = n48Var5;
                n48Var2.k(i22);
                i13 = i29 + 1;
                i12 = i30 + iCeil2;
                i19 = i19;
                i15 = i22;
                numValueOf3 = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - i9) : null;
                i20 = 0;
                z = false;
                i6 = 0;
                i17 = iMin;
                aVar = aVarA2;
                i18 = i31;
                i16 = i19;
            } else {
                i6 = iMax;
                n48Var = n48Var6;
                n48Var2 = n48Var5;
                numValueOf3 = numValueOf4;
                i16 = i21;
                i13 = i29;
                i17 = i23;
                aVar = aVar2;
            }
            n48Var5 = n48Var2;
            aVar2 = aVar;
            p48Var = p48Var;
            i10 = i22;
            bVar = bVarB2;
            i14 = i6;
            it2 = it;
            n48Var4 = n48Var;
            o48VarC = o48Var2;
            i11 = i20;
            i3 = i19;
        }
        o48 o48Var3 = o48VarC;
        n48 n48Var7 = n48Var4;
        int i32 = i17;
        n48 n48Var8 = n48Var5;
        p48 p48Var3 = p48Var;
        if (aVar2 != null) {
            arrayList.add(aVar2.getEllipsis());
            o48Var = o48Var3;
            o48Var.r(arrayList.size() - 1, aVar2.getPlaceable());
            int i33 = n48Var8._size - 1;
            if (aVar2.getPlaceEllipsisOnLastContentLine()) {
                int i34 = n48Var8._size - 1;
                n48Var7.r(i33, Math.max(n48Var7.e(i33), t06.f(aVar2.getEllipsisSize())));
                n48Var8.r(i34, n48Var8.i() + 1);
                Unit unit2 = Unit.a;
            } else {
                n48Var7.k(t06.f(aVar2.getEllipsisSize()));
                n48Var8.k(n48Var8.i() + 1);
            }
        } else {
            o48Var = o48Var3;
        }
        int size = arrayList.size();
        o[] oVarArr = new o[size];
        for (int i35 = 0; i35 < size; i35++) {
            oVarArr[i35] = o48Var.b(i35);
        }
        int i36 = n48Var8._size;
        int[] iArr = new int[i36];
        int[] iArr2 = new int[i36];
        int[] iArr3 = n48Var8.content;
        int iMax2 = i32;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        while (i38 < i36) {
            int i40 = iArr3[i38];
            int iE = n48Var7.e(i38);
            if (!p48Var3.a(i38)) {
                iE = kx1.k(jA) == Integer.MAX_VALUE ? Integer.MAX_VALUE : kx1.k(jA) - i39;
            }
            p48 p48Var4 = p48Var3;
            n48 n48Var9 = n48Var7;
            int i41 = iE;
            d0 d0Var3 = d0Var2;
            ArrayList arrayList2 = arrayList;
            int i42 = i9;
            fj7 fj7VarA = era.a(d0Var3, iMax2, kx1.m(jA), kx1.l(jA), i41, i42, jVar2, arrayList2, oVarArr, i37, i40, iArr, i38);
            if (d0Var.getIsHorizontal()) {
                height = fj7VarA.getWidth();
                width = fj7VarA.getHeight();
            } else {
                height = fj7VarA.getHeight();
                width = fj7VarA.getWidth();
            }
            iArr2[i38] = width;
            i39 += width;
            iMax2 = Math.max(iMax2, height);
            r58Var.c(fj7VarA);
            i38++;
            arrayList = arrayList2;
            i37 = i40;
            n48Var7 = n48Var9;
            i9 = i42;
            p48Var3 = p48Var4;
            jVar2 = jVar;
            d0Var2 = d0Var;
        }
        if (r58Var.getSize() == 0) {
            i4 = 0;
            i5 = 0;
        } else {
            i4 = iMax2;
            i5 = i39;
        }
        return t(jVar, j, i4, i5, iArr2, r58Var, d0Var, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Ref.ObjectRef objectRef, o oVar) {
        objectRef.element = oVar;
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Ref.ObjectRef objectRef, o oVar) {
        objectRef.element = oVar;
        return Unit.a;
    }

    public static final int p(f66 f66Var, boolean z, int i) {
        return z ? f66Var.d0(i) : f66Var.o0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final long q(List<? extends f66> list, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, FlowLayoutOverflowState flowLayoutOverflowState) throws NoWhenBranchMatchedException {
        if (list.isEmpty()) {
            return t06.b(0, 0);
        }
        a0 a0Var = new a0(i4, flowLayoutOverflowState, bu8.a(0, i, 0, Integer.MAX_VALUE), i5, i2, i3, null);
        f66 f66Var = (f66) m.C0(list, 0);
        int i6 = f66Var != null ? iArr2[0] : 0;
        int i7 = f66Var != null ? iArr[0] : 0;
        int i8 = 0;
        if (a0Var.b(list.size() > 1, 0, t06.b(i, Integer.MAX_VALUE), f66Var == null ? null : t06.a(t06.b(i7, i6)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
            t06 t06VarD = flowLayoutOverflowState.d(f66Var != null, 0, 0);
            return t06.b(t06VarD != null ? t06.f(t06VarD.getPackedValue()) : 0, 0);
        }
        int size = list.size();
        int i9 = i;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i10 < size) {
            int i15 = i9 - i7;
            int i16 = i10 + 1;
            int iMax = Math.max(i14, i6);
            f66 f66Var2 = (f66) m.C0(list, i16);
            int i17 = f66Var2 != null ? iArr2[i16] : 0;
            int i18 = f66Var2 != null ? iArr[i16] + i2 : 0;
            int i19 = i16 - i12;
            int i20 = i13;
            int i21 = i17;
            int i22 = i18;
            a0.b bVarB = a0Var.b(i10 + 2 < list.size(), i19, t06.b(i15, Integer.MAX_VALUE), f66Var2 == null ? null : t06.a(t06.b(i18, i17)), i20, i8, iMax, false, false);
            if (bVarB.getIsLastItemInLine()) {
                int iF = i8 + iMax + i3;
                a0.a aVarA = a0Var.a(bVarB, f66Var2 != null, i20, iF, i15, i19);
                int i23 = i22 - i2;
                i13 = i20 + 1;
                if (bVarB.getIsLastItemInContainer()) {
                    if (aVarA != null) {
                        long ellipsisSize = aVarA.getEllipsisSize();
                        if (!aVarA.getPlaceEllipsisOnLastContentLine()) {
                            iF += t06.f(ellipsisSize) + i3;
                        }
                    }
                    i8 = iF;
                    i11 = i16;
                    break;
                }
                i14 = 0;
                i8 = iF;
                i7 = i23;
                i12 = i16;
                i9 = i;
            } else {
                i9 = i15;
                i13 = i20;
                i14 = iMax;
                i7 = i22;
            }
            i10 = i16;
            i11 = i10;
            i6 = i21;
        }
        return t06.b(i8 - i3, i11);
    }

    public static final int r(f66 f66Var, boolean z, int i) {
        return z ? f66Var.o0(i) : f66Var.d0(i);
    }

    public static final long s(dj7 dj7Var, d0 d0Var, long j, Function1<? super o, Unit> function1) {
        if (cra.e(cra.d(dj7Var)) != 0.0f) {
            int iR = r(dj7Var, d0Var.getIsHorizontal(), Integer.MAX_VALUE);
            return t06.b(iR, p(dj7Var, d0Var.getIsHorizontal(), iR));
        }
        RowColumnParentData rowColumnParentDataD = cra.d(dj7Var);
        if (rowColumnParentDataD != null) {
            rowColumnParentDataD.c();
        }
        o oVarR0 = dj7Var.r0(j);
        function1.invoke(oVarR0);
        return t06.b(d0Var.f(oVarR0), d0Var.c(oVarR0));
    }

    public static final fj7 t(j jVar, long j, int i, int i2, int[] iArr, final r58<fj7> r58Var, d0 d0Var, int[] iArr2) {
        int iK;
        int i3;
        int i4;
        boolean zD = d0Var.getIsHorizontal();
        c.n nVarL = d0Var.getVerticalArrangement();
        c.e eVarQ = d0Var.getHorizontalArrangement();
        if (zD) {
            int iO1 = i2 + (jVar.O1(nVarL.getSpacing()) * (r58Var.getSize() - 1));
            int iM = kx1.m(j);
            iK = kx1.k(j);
            if (iO1 < iM) {
                iO1 = iM;
            }
            if (iO1 <= iK) {
                iK = iO1;
            }
            nVarL.arrange(jVar, iK, iArr, iArr2);
        } else {
            int iO2 = i2 + (jVar.O1(eVarQ.getSpacing()) * (r58Var.getSize() - 1));
            int iM2 = kx1.m(j);
            int iK2 = kx1.k(j);
            if (iO2 < iM2) {
                iO2 = iM2;
            }
            int i5 = iO2 > iK2 ? iK2 : iO2;
            eVarQ.a(jVar, i5, iArr, jVar.getLayoutDirection(), iArr2);
            iK = i5;
        }
        int iN = kx1.n(j);
        int iL = kx1.l(j);
        if (i < iN) {
            i = iN;
        }
        if (i <= iL) {
            iL = i;
        }
        if (zD) {
            i4 = iL;
            i3 = iK;
        } else {
            i3 = iL;
            i4 = iK;
        }
        return j.Q1(jVar, i4, i3, null, new Function1() { // from class: com.google.android.dj4
            public final Object invoke(Object obj) {
                return b0.u(r58Var, (o.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(r58 r58Var, o.a aVar) {
        Object[] objArr = r58Var.content;
        int size = r58Var.getSize();
        for (int i = 0; i < size; i++) {
            ((fj7) objArr[i]).l();
        }
        return Unit.a;
    }

    public static final r28 v(c.e eVar, c.n nVar, tc.c cVar, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, d dVar, int i3) {
        if (e.k()) {
            e.o(-2010142641, i3, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:470)");
        }
        boolean zX = ((((i3 & 14) ^ 6) > 4 && dVar.x(eVar)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && dVar.x(nVar)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) > 256 && dVar.x(cVar)) || (i3 & 384) == 256) | ((((i3 & 7168) ^ 3072) > 2048 && dVar.C(i)) || (i3 & 3072) == 2048) | ((((57344 & i3) ^ 24576) > 16384 && dVar.C(i2)) || (i3 & 24576) == 16384) | dVar.x(flowLayoutOverflowState);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            FlowMeasurePolicy g0Var = new FlowMeasurePolicy(true, eVar, nVar, eVar.getSpacing(), s.INSTANCE.b(cVar), nVar.getSpacing(), i, i2, flowLayoutOverflowState, null);
            dVar.L(g0Var);
            objR = g0Var;
        }
        FlowMeasurePolicy g0Var2 = (FlowMeasurePolicy) objR;
        if (e.k()) {
            e.n();
        }
        return g0Var2;
    }

    private static final dj7 w(Iterator<? extends dj7> it, gj4 gj4Var) {
        try {
            if (!(it instanceof n22)) {
                return it.next();
            }
            Intrinsics.g(gj4Var);
            return ((n22) it).a(gj4Var);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }
}
