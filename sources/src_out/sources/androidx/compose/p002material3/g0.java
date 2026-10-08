package androidx.compose.p002material3;

import androidx.compose.p000animation.core.e;
import androidx.compose.p001foundation.layout.g1;
import androidx.compose.p001foundation.layout.i1;
import androidx.compose.p002material3.g0;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import com.google.android.ps4;
import com.google.inputmethod.BorderStroke;
import com.google.inputmethod.eq7;
import com.google.inputmethod.f43;
import com.google.inputmethod.h9b;
import com.google.inputmethod.j14;
import com.google.inputmethod.k16;
import com.google.inputmethod.ko1;
import com.google.inputmethod.o58;
import com.google.inputmethod.qq7;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.v9b;
import com.google.inputmethod.xj1;
import com.google.inputmethod.xkb;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rJ\u008b\u0001\u0010!\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00100\u001eH\u0007¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00058 X \u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00078 X \u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0001\u0001)¨\u0006*"}, d2 = {"Landroidx/compose/material3/g0;", "", "<init>", "()V", "Landroidx/compose/ui/b;", "Landroidx/compose/material3/f0;", "type", "", "enabled", "k", "(Landroidx/compose/ui/b;Ljava/lang/String;Z)Landroidx/compose/ui/b;", "matchAnchorWidth", "h", "(Landroidx/compose/ui/b;Z)Landroidx/compose/ui/b;", "expanded", "Lkotlin/Function0;", "", "onDismissRequest", "modifier", "Lcom/google/android/v9b;", "scrollState", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/ei1;", "containerColor", "Lcom/google/android/ff3;", "tonalElevation", "shadowElevation", "Lcom/google/android/or0;", "border", "Lkotlin/Function1;", "Lcom/google/android/xj1;", "content", "d", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;Lcom/google/android/v9b;ZLcom/google/android/xkb;JFFLcom/google/android/or0;Lcom/google/android/ps4;Landroidx/compose/runtime/d;III)V", "j", "()Ljava/lang/String;", "anchorType", "i", "()Z", "alwaysFocusable", "Landroidx/compose/material3/h0;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class g0 {
    public static final int a = 0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<d, Integer, Unit> {
        final /* synthetic */ b b;
        final /* synthetic */ boolean c;
        final /* synthetic */ e<Boolean> d;
        final /* synthetic */ o58<t> e;
        final /* synthetic */ v9b f;
        final /* synthetic */ xkb g;
        final /* synthetic */ long h;
        final /* synthetic */ float i;
        final /* synthetic */ float j;
        final /* synthetic */ BorderStroke k;
        final /* synthetic */ ps4<xj1, d, Integer, Unit> l;

        /* JADX WARN: Multi-variable type inference failed */
        a(b bVar, boolean z, e<Boolean> eVar, o58<t> o58Var, v9b v9bVar, xkb xkbVar, long j, float f, float f2, BorderStroke borderStroke, ps4<? super xj1, ? super d, ? super Integer, Unit> ps4Var) {
            this.b = bVar;
            this.c = z;
            this.d = eVar;
            this.e = o58Var;
            this.f = v9bVar;
            this.g = xkbVar;
            this.h = j;
            this.i = f;
            this.j = f2;
            this.k = borderStroke;
            this.l = ps4Var;
        }

        public final void a(d dVar, int i) throws Throwable {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(2063119149, i, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:355)");
            }
            qq7.d(g0.this.h(this.b, this.c), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, dVar, (e.d << 3) | 384);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            a((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    public /* synthetic */ g0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(o58 o58Var) {
        Unit unit = Unit.a;
        o58Var.setValue(unit);
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(o58 o58Var, k16 k16Var, k16 k16Var2) {
        o58Var.setValue(t.b(qq7.l(k16Var, k16Var2)));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit g(g0 g0Var, boolean z, Function0 function0, b bVar, v9b v9bVar, boolean z2, xkb xkbVar, long j, float f, float f2, BorderStroke borderStroke, ps4 ps4Var, int i, int i2, int i3, d dVar, int i4) throws NoWhenBranchMatchedException {
        g0Var.d(z, function0, bVar, v9bVar, z2, xkbVar, j, f, f2, borderStroke, ps4Var, dVar, saa.a(i | 1), saa.a(i2), i3);
        return Unit.a;
    }

    public static /* synthetic */ b l(g0 g0Var, b bVar, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: menuAnchor-2Hz36ac");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return g0Var.k(bVar, str, z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:100:0x0111  */
    /* JADX WARN: Code duplicated, block: B:102:0x0118  */
    /* JADX WARN: Code duplicated, block: B:104:0x011c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0126  */
    /* JADX WARN: Code duplicated, block: B:107:0x0129  */
    /* JADX WARN: Code duplicated, block: B:111:0x0131  */
    /* JADX WARN: Code duplicated, block: B:112:0x0138  */
    /* JADX WARN: Code duplicated, block: B:114:0x013c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0144  */
    /* JADX WARN: Code duplicated, block: B:117:0x0147  */
    /* JADX WARN: Code duplicated, block: B:119:0x014c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0154  */
    /* JADX WARN: Code duplicated, block: B:125:0x015b  */
    /* JADX WARN: Code duplicated, block: B:127:0x015f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0167  */
    /* JADX WARN: Code duplicated, block: B:130:0x016a  */
    /* JADX WARN: Code duplicated, block: B:134:0x017a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0183  */
    /* JADX WARN: Code duplicated, block: B:141:0x018c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0194  */
    /* JADX WARN: Code duplicated, block: B:157:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:159:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:163:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:165:0x01db  */
    /* JADX WARN: Code duplicated, block: B:168:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:169:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:172:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:174:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:175:0x0204  */
    /* JADX WARN: Code duplicated, block: B:177:0x0208  */
    /* JADX WARN: Code duplicated, block: B:178:0x020f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0213  */
    /* JADX WARN: Code duplicated, block: B:181:0x0224  */
    /* JADX WARN: Code duplicated, block: B:184:0x023c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0250  */
    /* JADX WARN: Code duplicated, block: B:190:0x0275  */
    /* JADX WARN: Code duplicated, block: B:192:0x0285  */
    /* JADX WARN: Code duplicated, block: B:194:0x0296  */
    /* JADX WARN: Code duplicated, block: B:197:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:200:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:204:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:206:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:209:0x0315  */
    /* JADX WARN: Code duplicated, block: B:211:0x031b  */
    /* JADX WARN: Code duplicated, block: B:215:0x0386  */
    /* JADX WARN: Code duplicated, block: B:217:0x039a  */
    /* JADX WARN: Code duplicated, block: B:220:0x03af  */
    /* JADX WARN: Code duplicated, block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:95:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x0107  */
    public final void d(final boolean z, final Function0<Unit> function0, b bVar, v9b v9bVar, boolean z2, xkb xkbVar, long j, float f, float f2, BorderStroke borderStroke, final ps4<? super xj1, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i, final int i2, final int i3) throws NoWhenBranchMatchedException {
        int i4;
        Function0<Unit> function1;
        int i5;
        b bVar2;
        int i6;
        v9b v9bVar2;
        int i7;
        boolean z3;
        int i8;
        final long jA;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z4;
        d dVar2;
        final xkb xkbVar2;
        final float f3;
        final b bVar3;
        final v9b v9bVar3;
        final boolean z5;
        final float f4;
        final BorderStroke borderStroke2;
        s6b s6bVarH;
        b bVar4;
        v9b v9bVarD;
        xkb xkbVarE;
        float f5;
        float fD;
        b bVar5;
        float f6;
        long j2;
        xkb xkbVar3;
        v9b v9bVar4;
        float f7;
        boolean z6;
        Object objR;
        d.Companion companion;
        final o58 o58Var;
        f43 f43Var;
        int iA;
        Object objR2;
        e eVar;
        Object objR3;
        final o58 o58Var2;
        boolean zX;
        Object objR4;
        Object objR5;
        int i19;
        int i20;
        d dVarF = dVar.F(-126848451);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (dVarF.A(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) == 0) {
            if ((i & 48) == 0) {
                function1 = function0;
                i4 |= dVarF.T(function1) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i & 384) == 0) {
                    bVar2 = bVar;
                    if (dVarF.x(bVar2)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                if ((i & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        v9bVar2 = v9bVar;
                        int i21 = dVarF.x(v9bVar2) ? 2048 : 1024;
                        i4 |= i21;
                    } else {
                        v9bVar2 = v9bVar;
                    }
                    i4 |= i21;
                } else {
                    v9bVar2 = v9bVar;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((i & 24576) == 0) {
                        z3 = z2;
                        if (dVarF.A(z3)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                    if ((i & 196608) != 0) {
                        if ((i3 & 32) == 0 || !dVarF.x(xkbVar)) {
                            i20 = 65536;
                        } else {
                            i20 = 131072;
                        }
                        i4 |= i20;
                    }
                    if ((i & 1572864) == 0) {
                        jA = j;
                        if ((i3 & 64) == 0 || !dVarF.D(jA)) {
                            i19 = 524288;
                        } else {
                            i19 = 1048576;
                        }
                        i4 |= i19;
                    } else {
                        jA = j;
                    }
                    i9 = i3 & 128;
                    if (i9 != 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (dVarF.B(f)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                        if ((i & 100663296) == 0) {
                            if (dVarF.B(f2)) {
                                i12 = 67108864;
                            } else {
                                i12 = 33554432;
                            }
                            i4 |= i12;
                        }
                        i13 = i3 & 512;
                        if (i13 != 0) {
                            if ((i & 805306368) == 0) {
                                if (dVarF.x(borderStroke)) {
                                    i14 = 536870912;
                                } else {
                                    i14 = 268435456;
                                }
                                i4 |= i14;
                            }
                            if ((i3 & 1024) != 0) {
                                i15 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                if (dVarF.T(ps4Var)) {
                                    i16 = 4;
                                } else {
                                    i16 = 2;
                                }
                                i15 = i2 | i16;
                            } else {
                                i15 = i2;
                            }
                            if ((i3 & 2048) != 0) {
                                if ((i2 & 48) == 0) {
                                    if (dVarF.x(this)) {
                                        i17 = 32;
                                    } else {
                                        i17 = 16;
                                    }
                                    i15 |= i17;
                                }
                                i18 = i15;
                                if ((i4 & 306783379) == 306783378 || (i18 & 19) != 18) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (dVarF.g(z4, i4 & 1)) {
                                    dVarF.U();
                                    if ((i & 1) != 0 || dVarF.t()) {
                                        if (i5 != 0) {
                                            bVar4 = b.INSTANCE;
                                        } else {
                                            bVar4 = bVar2;
                                        }
                                        if ((i3 & 8) != 0) {
                                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                                            i4 &= -7169;
                                        } else {
                                            v9bVarD = v9bVar2;
                                        }
                                        if (i7 != 0) {
                                            z3 = true;
                                        }
                                        if ((i3 & 32) != 0) {
                                            xkbVarE = eq7.a.e(dVarF, 6);
                                            i4 &= -458753;
                                        } else {
                                            xkbVarE = xkbVar;
                                        }
                                        if ((i3 & 64) != 0) {
                                            jA = eq7.a.a(dVarF, 6);
                                            i4 &= -3670017;
                                        }
                                        if (i9 != 0) {
                                            f5 = eq7.a.f();
                                        } else {
                                            f5 = f;
                                        }
                                        if (i11 != 0) {
                                            fD = eq7.a.d();
                                        } else {
                                            fD = f2;
                                        }
                                        if (i13 != 0) {
                                            bVar5 = bVar4;
                                            f6 = f5;
                                            j2 = jA;
                                            xkbVar3 = xkbVarE;
                                            v9bVar4 = v9bVarD;
                                            f7 = fD;
                                            z6 = z3;
                                            borderStroke = null;
                                        } else {
                                            bVar5 = bVar4;
                                            f6 = f5;
                                            j2 = jA;
                                            xkbVar3 = xkbVarE;
                                            v9bVar4 = v9bVarD;
                                            f7 = fD;
                                        }
                                        dVarF.M();
                                        if (androidx.compose.p004runtime.e.k()) {
                                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                                        }
                                        objR = dVarF.R();
                                        companion = d.INSTANCE;
                                        if (objR == companion.a()) {
                                            objR = p0.i(Unit.a, p0.k());
                                            dVarF.L(objR);
                                        }
                                        o58Var = (o58) objR;
                                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                                        if (z) {
                                            dVarF.y(629991660);
                                            objR5 = dVarF.R();
                                            if (objR5 == companion.a()) {
                                                objR5 = new Function0() { // from class: com.google.android.u04
                                                    public final Object invoke() {
                                                        return g0.e(o58Var);
                                                    }
                                                };
                                                dVarF.L(objR5);
                                            }
                                            i0.d((Function0) objR5, dVarF, 6);
                                            dVarF.u();
                                        } else {
                                            dVarF.y(630077189);
                                            dVarF.u();
                                        }
                                        objR2 = dVarF.R();
                                        if (objR2 == companion.a()) {
                                            objR2 = new e(Boolean.FALSE);
                                            dVarF.L(objR2);
                                        }
                                        eVar = (e) objR2;
                                        eVar.i(Boolean.valueOf(z));
                                        if (!((Boolean) eVar.a()).booleanValue() || ((Boolean) eVar.b()).booleanValue()) {
                                            dVarF.y(630396489);
                                            objR3 = dVarF.R();
                                            if (objR3 == companion.a()) {
                                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                                dVarF.L(objR3);
                                            }
                                            o58Var2 = (o58) objR3;
                                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                                            objR4 = dVarF.R();
                                            if (zX || objR4 == companion.a()) {
                                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                                    }
                                                }, 8, null);
                                                dVarF.L(objR4);
                                            }
                                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                            dVar2 = dVarF;
                                            dVar2.u();
                                        } else {
                                            dVarF.y(631807237);
                                            dVarF.u();
                                            dVar2 = dVarF;
                                        }
                                        if (androidx.compose.p004runtime.e.k()) {
                                            androidx.compose.p004runtime.e.n();
                                        }
                                        bVar3 = bVar5;
                                        z5 = z6;
                                        v9bVar3 = v9bVar4;
                                        xkbVar2 = xkbVar3;
                                        jA = j2;
                                        f3 = f6;
                                        f4 = f7;
                                        borderStroke2 = borderStroke;
                                    } else {
                                        dVarF.q();
                                        if ((i3 & 8) != 0) {
                                            i4 &= -7169;
                                        }
                                        if ((i3 & 32) != 0) {
                                            i4 &= -458753;
                                        }
                                        if ((i3 & 64) != 0) {
                                            i4 &= -3670017;
                                        }
                                        xkbVar3 = xkbVar;
                                        f6 = f;
                                        f7 = f2;
                                        j2 = jA;
                                        bVar5 = bVar2;
                                        v9bVar4 = v9bVar2;
                                    }
                                    z6 = z3;
                                    dVarF.M();
                                    if (androidx.compose.p004runtime.e.k()) {
                                        androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                                    }
                                    objR = dVarF.R();
                                    companion = d.INSTANCE;
                                    if (objR == companion.a()) {
                                        objR = p0.i(Unit.a, p0.k());
                                        dVarF.L(objR);
                                    }
                                    o58Var = (o58) objR;
                                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                                    iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                                    if (z) {
                                        dVarF.y(629991660);
                                        objR5 = dVarF.R();
                                        if (objR5 == companion.a()) {
                                            objR5 = new Function0() { // from class: com.google.android.u04
                                                public final Object invoke() {
                                                    return g0.e(o58Var);
                                                }
                                            };
                                            dVarF.L(objR5);
                                        }
                                        i0.d((Function0) objR5, dVarF, 6);
                                        dVarF.u();
                                    } else {
                                        dVarF.y(630077189);
                                        dVarF.u();
                                    }
                                    objR2 = dVarF.R();
                                    if (objR2 == companion.a()) {
                                        objR2 = new e(Boolean.FALSE);
                                        dVarF.L(objR2);
                                    }
                                    eVar = (e) objR2;
                                    eVar.i(Boolean.valueOf(z));
                                    if (((Boolean) eVar.a()).booleanValue()) {
                                        dVarF.y(630396489);
                                        objR3 = dVarF.R();
                                        if (objR3 == companion.a()) {
                                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                            dVarF.L(objR3);
                                        }
                                        o58Var2 = (o58) objR3;
                                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                                        objR4 = dVarF.R();
                                        if (zX) {
                                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                                }
                                            }, 8, null);
                                            dVarF.L(objR4);
                                        } else {
                                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                                }
                                            }, 8, null);
                                            dVarF.L(objR4);
                                        }
                                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                        dVar2 = dVarF;
                                        dVar2.u();
                                    } else {
                                        dVarF.y(630396489);
                                        objR3 = dVarF.R();
                                        if (objR3 == companion.a()) {
                                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                            dVarF.L(objR3);
                                        }
                                        o58Var2 = (o58) objR3;
                                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                                        objR4 = dVarF.R();
                                        if (zX) {
                                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                                }
                                            }, 8, null);
                                            dVarF.L(objR4);
                                        } else {
                                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                                }
                                            }, 8, null);
                                            dVarF.L(objR4);
                                        }
                                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                        dVar2 = dVarF;
                                        dVar2.u();
                                    }
                                    if (androidx.compose.p004runtime.e.k()) {
                                        androidx.compose.p004runtime.e.n();
                                    }
                                    bVar3 = bVar5;
                                    z5 = z6;
                                    v9bVar3 = v9bVar4;
                                    xkbVar2 = xkbVar3;
                                    jA = j2;
                                    f3 = f6;
                                    f4 = f7;
                                    borderStroke2 = borderStroke;
                                } else {
                                    dVar2 = dVarF;
                                    dVar2.q();
                                    xkbVar2 = xkbVar;
                                    f3 = f;
                                    bVar3 = bVar2;
                                    v9bVar3 = v9bVar2;
                                    z5 = z3;
                                    f4 = f2;
                                    borderStroke2 = borderStroke;
                                }
                                s6bVarH = dVar2.H();
                                if (s6bVarH != null) {
                                    s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                }
                            }
                            i15 |= 48;
                            i18 = i15;
                            if ((i4 & 306783379) == 306783378) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            if (dVarF.g(z4, i4 & 1)) {
                                dVarF.U();
                                if ((i & 1) != 0) {
                                    if (i5 != 0) {
                                        bVar4 = b.INSTANCE;
                                    } else {
                                        bVar4 = bVar2;
                                    }
                                    if ((i3 & 8) != 0) {
                                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                                        i4 &= -7169;
                                    } else {
                                        v9bVarD = v9bVar2;
                                    }
                                    if (i7 != 0) {
                                        z3 = true;
                                    }
                                    if ((i3 & 32) != 0) {
                                        xkbVarE = eq7.a.e(dVarF, 6);
                                        i4 &= -458753;
                                    } else {
                                        xkbVarE = xkbVar;
                                    }
                                    if ((i3 & 64) != 0) {
                                        jA = eq7.a.a(dVarF, 6);
                                        i4 &= -3670017;
                                    }
                                    if (i9 != 0) {
                                        f5 = eq7.a.f();
                                    } else {
                                        f5 = f;
                                    }
                                    if (i11 != 0) {
                                        fD = eq7.a.d();
                                    } else {
                                        fD = f2;
                                    }
                                    if (i13 != 0) {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                        borderStroke = null;
                                    } else {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                    }
                                } else {
                                    if (i5 != 0) {
                                        bVar4 = b.INSTANCE;
                                    } else {
                                        bVar4 = bVar2;
                                    }
                                    if ((i3 & 8) != 0) {
                                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                                        i4 &= -7169;
                                    } else {
                                        v9bVarD = v9bVar2;
                                    }
                                    if (i7 != 0) {
                                        z3 = true;
                                    }
                                    if ((i3 & 32) != 0) {
                                        xkbVarE = eq7.a.e(dVarF, 6);
                                        i4 &= -458753;
                                    } else {
                                        xkbVarE = xkbVar;
                                    }
                                    if ((i3 & 64) != 0) {
                                        jA = eq7.a.a(dVarF, 6);
                                        i4 &= -3670017;
                                    }
                                    if (i9 != 0) {
                                        f5 = eq7.a.f();
                                    } else {
                                        f5 = f;
                                    }
                                    if (i11 != 0) {
                                        fD = eq7.a.d();
                                    } else {
                                        fD = f2;
                                    }
                                    if (i13 != 0) {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                        borderStroke = null;
                                    } else {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                    }
                                }
                                dVarF.M();
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                                }
                                objR = dVarF.R();
                                companion = d.INSTANCE;
                                if (objR == companion.a()) {
                                    objR = p0.i(Unit.a, p0.k());
                                    dVarF.L(objR);
                                }
                                o58Var = (o58) objR;
                                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                                iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                                if (z) {
                                    dVarF.y(629991660);
                                    objR5 = dVarF.R();
                                    if (objR5 == companion.a()) {
                                        objR5 = new Function0() { // from class: com.google.android.u04
                                            public final Object invoke() {
                                                return g0.e(o58Var);
                                            }
                                        };
                                        dVarF.L(objR5);
                                    }
                                    i0.d((Function0) objR5, dVarF, 6);
                                    dVarF.u();
                                } else {
                                    dVarF.y(630077189);
                                    dVarF.u();
                                }
                                objR2 = dVarF.R();
                                if (objR2 == companion.a()) {
                                    objR2 = new e(Boolean.FALSE);
                                    dVarF.L(objR2);
                                }
                                eVar = (e) objR2;
                                eVar.i(Boolean.valueOf(z));
                                if (((Boolean) eVar.a()).booleanValue()) {
                                    dVarF.y(630396489);
                                    objR3 = dVarF.R();
                                    if (objR3 == companion.a()) {
                                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                        dVarF.L(objR3);
                                    }
                                    o58Var2 = (o58) objR3;
                                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                                    objR4 = dVarF.R();
                                    if (zX) {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    } else {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    }
                                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                    dVar2 = dVarF;
                                    dVar2.u();
                                } else {
                                    dVarF.y(630396489);
                                    objR3 = dVarF.R();
                                    if (objR3 == companion.a()) {
                                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                        dVarF.L(objR3);
                                    }
                                    o58Var2 = (o58) objR3;
                                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                                    objR4 = dVarF.R();
                                    if (zX) {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    } else {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    }
                                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                    dVar2 = dVarF;
                                    dVar2.u();
                                }
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                                bVar3 = bVar5;
                                z5 = z6;
                                v9bVar3 = v9bVar4;
                                xkbVar2 = xkbVar3;
                                jA = j2;
                                f3 = f6;
                                f4 = f7;
                                borderStroke2 = borderStroke;
                            } else {
                                dVar2 = dVarF;
                                dVar2.q();
                                xkbVar2 = xkbVar;
                                f3 = f;
                                bVar3 = bVar2;
                                v9bVar3 = v9bVar2;
                                z5 = z3;
                                f4 = f2;
                                borderStroke2 = borderStroke;
                            }
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i4 |= 805306368;
                        if ((i3 & 1024) != 0) {
                            i15 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i16 = 4;
                            } else {
                                i16 = 2;
                            }
                            i15 = i2 | i16;
                        } else {
                            i15 = i2;
                        }
                        if ((i3 & 2048) != 0) {
                            if ((i2 & 48) == 0) {
                                if (dVarF.x(this)) {
                                    i17 = 32;
                                } else {
                                    i17 = 16;
                                }
                                i15 |= i17;
                            }
                            i18 = i15;
                            if ((i4 & 306783379) == 306783378) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            if (dVarF.g(z4, i4 & 1)) {
                                dVarF.U();
                                if ((i & 1) != 0) {
                                    if (i5 != 0) {
                                        bVar4 = b.INSTANCE;
                                    } else {
                                        bVar4 = bVar2;
                                    }
                                    if ((i3 & 8) != 0) {
                                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                                        i4 &= -7169;
                                    } else {
                                        v9bVarD = v9bVar2;
                                    }
                                    if (i7 != 0) {
                                        z3 = true;
                                    }
                                    if ((i3 & 32) != 0) {
                                        xkbVarE = eq7.a.e(dVarF, 6);
                                        i4 &= -458753;
                                    } else {
                                        xkbVarE = xkbVar;
                                    }
                                    if ((i3 & 64) != 0) {
                                        jA = eq7.a.a(dVarF, 6);
                                        i4 &= -3670017;
                                    }
                                    if (i9 != 0) {
                                        f5 = eq7.a.f();
                                    } else {
                                        f5 = f;
                                    }
                                    if (i11 != 0) {
                                        fD = eq7.a.d();
                                    } else {
                                        fD = f2;
                                    }
                                    if (i13 != 0) {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                        borderStroke = null;
                                    } else {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                    }
                                } else {
                                    if (i5 != 0) {
                                        bVar4 = b.INSTANCE;
                                    } else {
                                        bVar4 = bVar2;
                                    }
                                    if ((i3 & 8) != 0) {
                                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                                        i4 &= -7169;
                                    } else {
                                        v9bVarD = v9bVar2;
                                    }
                                    if (i7 != 0) {
                                        z3 = true;
                                    }
                                    if ((i3 & 32) != 0) {
                                        xkbVarE = eq7.a.e(dVarF, 6);
                                        i4 &= -458753;
                                    } else {
                                        xkbVarE = xkbVar;
                                    }
                                    if ((i3 & 64) != 0) {
                                        jA = eq7.a.a(dVarF, 6);
                                        i4 &= -3670017;
                                    }
                                    if (i9 != 0) {
                                        f5 = eq7.a.f();
                                    } else {
                                        f5 = f;
                                    }
                                    if (i11 != 0) {
                                        fD = eq7.a.d();
                                    } else {
                                        fD = f2;
                                    }
                                    if (i13 != 0) {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                        borderStroke = null;
                                    } else {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                    }
                                }
                                dVarF.M();
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                                }
                                objR = dVarF.R();
                                companion = d.INSTANCE;
                                if (objR == companion.a()) {
                                    objR = p0.i(Unit.a, p0.k());
                                    dVarF.L(objR);
                                }
                                o58Var = (o58) objR;
                                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                                iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                                if (z) {
                                    dVarF.y(629991660);
                                    objR5 = dVarF.R();
                                    if (objR5 == companion.a()) {
                                        objR5 = new Function0() { // from class: com.google.android.u04
                                            public final Object invoke() {
                                                return g0.e(o58Var);
                                            }
                                        };
                                        dVarF.L(objR5);
                                    }
                                    i0.d((Function0) objR5, dVarF, 6);
                                    dVarF.u();
                                } else {
                                    dVarF.y(630077189);
                                    dVarF.u();
                                }
                                objR2 = dVarF.R();
                                if (objR2 == companion.a()) {
                                    objR2 = new e(Boolean.FALSE);
                                    dVarF.L(objR2);
                                }
                                eVar = (e) objR2;
                                eVar.i(Boolean.valueOf(z));
                                if (((Boolean) eVar.a()).booleanValue()) {
                                    dVarF.y(630396489);
                                    objR3 = dVarF.R();
                                    if (objR3 == companion.a()) {
                                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                        dVarF.L(objR3);
                                    }
                                    o58Var2 = (o58) objR3;
                                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                                    objR4 = dVarF.R();
                                    if (zX) {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    } else {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    }
                                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                    dVar2 = dVarF;
                                    dVar2.u();
                                } else {
                                    dVarF.y(630396489);
                                    objR3 = dVarF.R();
                                    if (objR3 == companion.a()) {
                                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                        dVarF.L(objR3);
                                    }
                                    o58Var2 = (o58) objR3;
                                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                                    objR4 = dVarF.R();
                                    if (zX) {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    } else {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    }
                                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                    dVar2 = dVarF;
                                    dVar2.u();
                                }
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                                bVar3 = bVar5;
                                z5 = z6;
                                v9bVar3 = v9bVar4;
                                xkbVar2 = xkbVar3;
                                jA = j2;
                                f3 = f6;
                                f4 = f7;
                                borderStroke2 = borderStroke;
                            } else {
                                dVar2 = dVarF;
                                dVar2.q();
                                xkbVar2 = xkbVar;
                                f3 = f;
                                bVar3 = bVar2;
                                v9bVar3 = v9bVar2;
                                z5 = z3;
                                f4 = f2;
                                borderStroke2 = borderStroke;
                            }
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i15 |= 48;
                        i18 = i15;
                        if ((i4 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            } else {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                            }
                            objR = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = p0.i(Unit.a, p0.k());
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                            if (z) {
                                dVarF.y(629991660);
                                objR5 = dVarF.R();
                                if (objR5 == companion.a()) {
                                    objR5 = new Function0() { // from class: com.google.android.u04
                                        public final Object invoke() {
                                            return g0.e(o58Var);
                                        }
                                    };
                                    dVarF.L(objR5);
                                }
                                i0.d((Function0) objR5, dVarF, 6);
                                dVarF.u();
                            } else {
                                dVarF.y(630077189);
                                dVarF.u();
                            }
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = new e(Boolean.FALSE);
                                dVarF.L(objR2);
                            }
                            eVar = (e) objR2;
                            eVar.i(Boolean.valueOf(z));
                            if (((Boolean) eVar.a()).booleanValue()) {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            } else {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar5;
                            z5 = z6;
                            v9bVar3 = v9bVar4;
                            xkbVar2 = xkbVar3;
                            jA = j2;
                            f3 = f6;
                            f4 = f7;
                            borderStroke2 = borderStroke;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            xkbVar2 = xkbVar;
                            f3 = f;
                            bVar3 = bVar2;
                            v9bVar3 = v9bVar2;
                            z5 = z3;
                            f4 = f2;
                            borderStroke2 = borderStroke;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 100663296;
                    i13 = i3 & 512;
                    if (i13 != 0) {
                        if ((i & 805306368) == 0) {
                            if (dVarF.x(borderStroke)) {
                                i14 = 536870912;
                            } else {
                                i14 = 268435456;
                            }
                            i4 |= i14;
                        }
                        if ((i3 & 1024) != 0) {
                            i15 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i16 = 4;
                            } else {
                                i16 = 2;
                            }
                            i15 = i2 | i16;
                        } else {
                            i15 = i2;
                        }
                        if ((i3 & 2048) != 0) {
                            if ((i2 & 48) == 0) {
                                if (dVarF.x(this)) {
                                    i17 = 32;
                                } else {
                                    i17 = 16;
                                }
                                i15 |= i17;
                            }
                            i18 = i15;
                            if ((i4 & 306783379) == 306783378) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            if (dVarF.g(z4, i4 & 1)) {
                                dVarF.U();
                                if ((i & 1) != 0) {
                                    if (i5 != 0) {
                                        bVar4 = b.INSTANCE;
                                    } else {
                                        bVar4 = bVar2;
                                    }
                                    if ((i3 & 8) != 0) {
                                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                                        i4 &= -7169;
                                    } else {
                                        v9bVarD = v9bVar2;
                                    }
                                    if (i7 != 0) {
                                        z3 = true;
                                    }
                                    if ((i3 & 32) != 0) {
                                        xkbVarE = eq7.a.e(dVarF, 6);
                                        i4 &= -458753;
                                    } else {
                                        xkbVarE = xkbVar;
                                    }
                                    if ((i3 & 64) != 0) {
                                        jA = eq7.a.a(dVarF, 6);
                                        i4 &= -3670017;
                                    }
                                    if (i9 != 0) {
                                        f5 = eq7.a.f();
                                    } else {
                                        f5 = f;
                                    }
                                    if (i11 != 0) {
                                        fD = eq7.a.d();
                                    } else {
                                        fD = f2;
                                    }
                                    if (i13 != 0) {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                        borderStroke = null;
                                    } else {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                    }
                                } else {
                                    if (i5 != 0) {
                                        bVar4 = b.INSTANCE;
                                    } else {
                                        bVar4 = bVar2;
                                    }
                                    if ((i3 & 8) != 0) {
                                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                                        i4 &= -7169;
                                    } else {
                                        v9bVarD = v9bVar2;
                                    }
                                    if (i7 != 0) {
                                        z3 = true;
                                    }
                                    if ((i3 & 32) != 0) {
                                        xkbVarE = eq7.a.e(dVarF, 6);
                                        i4 &= -458753;
                                    } else {
                                        xkbVarE = xkbVar;
                                    }
                                    if ((i3 & 64) != 0) {
                                        jA = eq7.a.a(dVarF, 6);
                                        i4 &= -3670017;
                                    }
                                    if (i9 != 0) {
                                        f5 = eq7.a.f();
                                    } else {
                                        f5 = f;
                                    }
                                    if (i11 != 0) {
                                        fD = eq7.a.d();
                                    } else {
                                        fD = f2;
                                    }
                                    if (i13 != 0) {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                        borderStroke = null;
                                    } else {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                    }
                                }
                                dVarF.M();
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                                }
                                objR = dVarF.R();
                                companion = d.INSTANCE;
                                if (objR == companion.a()) {
                                    objR = p0.i(Unit.a, p0.k());
                                    dVarF.L(objR);
                                }
                                o58Var = (o58) objR;
                                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                                iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                                if (z) {
                                    dVarF.y(629991660);
                                    objR5 = dVarF.R();
                                    if (objR5 == companion.a()) {
                                        objR5 = new Function0() { // from class: com.google.android.u04
                                            public final Object invoke() {
                                                return g0.e(o58Var);
                                            }
                                        };
                                        dVarF.L(objR5);
                                    }
                                    i0.d((Function0) objR5, dVarF, 6);
                                    dVarF.u();
                                } else {
                                    dVarF.y(630077189);
                                    dVarF.u();
                                }
                                objR2 = dVarF.R();
                                if (objR2 == companion.a()) {
                                    objR2 = new e(Boolean.FALSE);
                                    dVarF.L(objR2);
                                }
                                eVar = (e) objR2;
                                eVar.i(Boolean.valueOf(z));
                                if (((Boolean) eVar.a()).booleanValue()) {
                                    dVarF.y(630396489);
                                    objR3 = dVarF.R();
                                    if (objR3 == companion.a()) {
                                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                        dVarF.L(objR3);
                                    }
                                    o58Var2 = (o58) objR3;
                                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                                    objR4 = dVarF.R();
                                    if (zX) {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    } else {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    }
                                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                    dVar2 = dVarF;
                                    dVar2.u();
                                } else {
                                    dVarF.y(630396489);
                                    objR3 = dVarF.R();
                                    if (objR3 == companion.a()) {
                                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                        dVarF.L(objR3);
                                    }
                                    o58Var2 = (o58) objR3;
                                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                                    objR4 = dVarF.R();
                                    if (zX) {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    } else {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    }
                                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                    dVar2 = dVarF;
                                    dVar2.u();
                                }
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                                bVar3 = bVar5;
                                z5 = z6;
                                v9bVar3 = v9bVar4;
                                xkbVar2 = xkbVar3;
                                jA = j2;
                                f3 = f6;
                                f4 = f7;
                                borderStroke2 = borderStroke;
                            } else {
                                dVar2 = dVarF;
                                dVar2.q();
                                xkbVar2 = xkbVar;
                                f3 = f;
                                bVar3 = bVar2;
                                v9bVar3 = v9bVar2;
                                z5 = z3;
                                f4 = f2;
                                borderStroke2 = borderStroke;
                            }
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i15 |= 48;
                        i18 = i15;
                        if ((i4 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            } else {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                            }
                            objR = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = p0.i(Unit.a, p0.k());
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                            if (z) {
                                dVarF.y(629991660);
                                objR5 = dVarF.R();
                                if (objR5 == companion.a()) {
                                    objR5 = new Function0() { // from class: com.google.android.u04
                                        public final Object invoke() {
                                            return g0.e(o58Var);
                                        }
                                    };
                                    dVarF.L(objR5);
                                }
                                i0.d((Function0) objR5, dVarF, 6);
                                dVarF.u();
                            } else {
                                dVarF.y(630077189);
                                dVarF.u();
                            }
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = new e(Boolean.FALSE);
                                dVarF.L(objR2);
                            }
                            eVar = (e) objR2;
                            eVar.i(Boolean.valueOf(z));
                            if (((Boolean) eVar.a()).booleanValue()) {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            } else {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar5;
                            z5 = z6;
                            v9bVar3 = v9bVar4;
                            xkbVar2 = xkbVar3;
                            jA = j2;
                            f3 = f6;
                            f4 = f7;
                            borderStroke2 = borderStroke;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            xkbVar2 = xkbVar;
                            f3 = f;
                            bVar3 = bVar2;
                            v9bVar3 = v9bVar2;
                            z5 = z3;
                            f4 = f2;
                            borderStroke2 = borderStroke;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 805306368;
                    if ((i3 & 1024) != 0) {
                        i15 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
                    }
                    if ((i3 & 2048) != 0) {
                        if ((i2 & 48) == 0) {
                            if (dVarF.x(this)) {
                                i17 = 32;
                            } else {
                                i17 = 16;
                            }
                            i15 |= i17;
                        }
                        i18 = i15;
                        if ((i4 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            } else {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                            }
                            objR = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = p0.i(Unit.a, p0.k());
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                            if (z) {
                                dVarF.y(629991660);
                                objR5 = dVarF.R();
                                if (objR5 == companion.a()) {
                                    objR5 = new Function0() { // from class: com.google.android.u04
                                        public final Object invoke() {
                                            return g0.e(o58Var);
                                        }
                                    };
                                    dVarF.L(objR5);
                                }
                                i0.d((Function0) objR5, dVarF, 6);
                                dVarF.u();
                            } else {
                                dVarF.y(630077189);
                                dVarF.u();
                            }
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = new e(Boolean.FALSE);
                                dVarF.L(objR2);
                            }
                            eVar = (e) objR2;
                            eVar.i(Boolean.valueOf(z));
                            if (((Boolean) eVar.a()).booleanValue()) {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            } else {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar5;
                            z5 = z6;
                            v9bVar3 = v9bVar4;
                            xkbVar2 = xkbVar3;
                            jA = j2;
                            f3 = f6;
                            f4 = f7;
                            borderStroke2 = borderStroke;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            xkbVar2 = xkbVar;
                            f3 = f;
                            bVar3 = bVar2;
                            v9bVar3 = v9bVar2;
                            z5 = z3;
                            f4 = f2;
                            borderStroke2 = borderStroke;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i15 |= 48;
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 24576;
                z3 = z2;
                if ((i & 196608) != 0) {
                    if ((i3 & 32) == 0) {
                        i20 = 65536;
                    } else {
                        i20 = 65536;
                    }
                    i4 |= i20;
                }
                if ((i & 1572864) == 0) {
                    jA = j;
                    if ((i3 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i4 |= i19;
                } else {
                    jA = j;
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (dVarF.B(f)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.B(f2)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i4 |= i12;
                    }
                    i13 = i3 & 512;
                    if (i13 != 0) {
                        if ((i & 805306368) == 0) {
                            if (dVarF.x(borderStroke)) {
                                i14 = 536870912;
                            } else {
                                i14 = 268435456;
                            }
                            i4 |= i14;
                        }
                        if ((i3 & 1024) != 0) {
                            i15 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i16 = 4;
                            } else {
                                i16 = 2;
                            }
                            i15 = i2 | i16;
                        } else {
                            i15 = i2;
                        }
                        if ((i3 & 2048) != 0) {
                            if ((i2 & 48) == 0) {
                                if (dVarF.x(this)) {
                                    i17 = 32;
                                } else {
                                    i17 = 16;
                                }
                                i15 |= i17;
                            }
                            i18 = i15;
                            if ((i4 & 306783379) == 306783378) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            if (dVarF.g(z4, i4 & 1)) {
                                dVarF.U();
                                if ((i & 1) != 0) {
                                    if (i5 != 0) {
                                        bVar4 = b.INSTANCE;
                                    } else {
                                        bVar4 = bVar2;
                                    }
                                    if ((i3 & 8) != 0) {
                                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                                        i4 &= -7169;
                                    } else {
                                        v9bVarD = v9bVar2;
                                    }
                                    if (i7 != 0) {
                                        z3 = true;
                                    }
                                    if ((i3 & 32) != 0) {
                                        xkbVarE = eq7.a.e(dVarF, 6);
                                        i4 &= -458753;
                                    } else {
                                        xkbVarE = xkbVar;
                                    }
                                    if ((i3 & 64) != 0) {
                                        jA = eq7.a.a(dVarF, 6);
                                        i4 &= -3670017;
                                    }
                                    if (i9 != 0) {
                                        f5 = eq7.a.f();
                                    } else {
                                        f5 = f;
                                    }
                                    if (i11 != 0) {
                                        fD = eq7.a.d();
                                    } else {
                                        fD = f2;
                                    }
                                    if (i13 != 0) {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                        borderStroke = null;
                                    } else {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                    }
                                } else {
                                    if (i5 != 0) {
                                        bVar4 = b.INSTANCE;
                                    } else {
                                        bVar4 = bVar2;
                                    }
                                    if ((i3 & 8) != 0) {
                                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                                        i4 &= -7169;
                                    } else {
                                        v9bVarD = v9bVar2;
                                    }
                                    if (i7 != 0) {
                                        z3 = true;
                                    }
                                    if ((i3 & 32) != 0) {
                                        xkbVarE = eq7.a.e(dVarF, 6);
                                        i4 &= -458753;
                                    } else {
                                        xkbVarE = xkbVar;
                                    }
                                    if ((i3 & 64) != 0) {
                                        jA = eq7.a.a(dVarF, 6);
                                        i4 &= -3670017;
                                    }
                                    if (i9 != 0) {
                                        f5 = eq7.a.f();
                                    } else {
                                        f5 = f;
                                    }
                                    if (i11 != 0) {
                                        fD = eq7.a.d();
                                    } else {
                                        fD = f2;
                                    }
                                    if (i13 != 0) {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                        borderStroke = null;
                                    } else {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                    }
                                }
                                dVarF.M();
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                                }
                                objR = dVarF.R();
                                companion = d.INSTANCE;
                                if (objR == companion.a()) {
                                    objR = p0.i(Unit.a, p0.k());
                                    dVarF.L(objR);
                                }
                                o58Var = (o58) objR;
                                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                                iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                                if (z) {
                                    dVarF.y(629991660);
                                    objR5 = dVarF.R();
                                    if (objR5 == companion.a()) {
                                        objR5 = new Function0() { // from class: com.google.android.u04
                                            public final Object invoke() {
                                                return g0.e(o58Var);
                                            }
                                        };
                                        dVarF.L(objR5);
                                    }
                                    i0.d((Function0) objR5, dVarF, 6);
                                    dVarF.u();
                                } else {
                                    dVarF.y(630077189);
                                    dVarF.u();
                                }
                                objR2 = dVarF.R();
                                if (objR2 == companion.a()) {
                                    objR2 = new e(Boolean.FALSE);
                                    dVarF.L(objR2);
                                }
                                eVar = (e) objR2;
                                eVar.i(Boolean.valueOf(z));
                                if (((Boolean) eVar.a()).booleanValue()) {
                                    dVarF.y(630396489);
                                    objR3 = dVarF.R();
                                    if (objR3 == companion.a()) {
                                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                        dVarF.L(objR3);
                                    }
                                    o58Var2 = (o58) objR3;
                                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                                    objR4 = dVarF.R();
                                    if (zX) {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    } else {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    }
                                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                    dVar2 = dVarF;
                                    dVar2.u();
                                } else {
                                    dVarF.y(630396489);
                                    objR3 = dVarF.R();
                                    if (objR3 == companion.a()) {
                                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                        dVarF.L(objR3);
                                    }
                                    o58Var2 = (o58) objR3;
                                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                                    objR4 = dVarF.R();
                                    if (zX) {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    } else {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    }
                                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                    dVar2 = dVarF;
                                    dVar2.u();
                                }
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                                bVar3 = bVar5;
                                z5 = z6;
                                v9bVar3 = v9bVar4;
                                xkbVar2 = xkbVar3;
                                jA = j2;
                                f3 = f6;
                                f4 = f7;
                                borderStroke2 = borderStroke;
                            } else {
                                dVar2 = dVarF;
                                dVar2.q();
                                xkbVar2 = xkbVar;
                                f3 = f;
                                bVar3 = bVar2;
                                v9bVar3 = v9bVar2;
                                z5 = z3;
                                f4 = f2;
                                borderStroke2 = borderStroke;
                            }
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i15 |= 48;
                        i18 = i15;
                        if ((i4 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            } else {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                            }
                            objR = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = p0.i(Unit.a, p0.k());
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                            if (z) {
                                dVarF.y(629991660);
                                objR5 = dVarF.R();
                                if (objR5 == companion.a()) {
                                    objR5 = new Function0() { // from class: com.google.android.u04
                                        public final Object invoke() {
                                            return g0.e(o58Var);
                                        }
                                    };
                                    dVarF.L(objR5);
                                }
                                i0.d((Function0) objR5, dVarF, 6);
                                dVarF.u();
                            } else {
                                dVarF.y(630077189);
                                dVarF.u();
                            }
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = new e(Boolean.FALSE);
                                dVarF.L(objR2);
                            }
                            eVar = (e) objR2;
                            eVar.i(Boolean.valueOf(z));
                            if (((Boolean) eVar.a()).booleanValue()) {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            } else {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar5;
                            z5 = z6;
                            v9bVar3 = v9bVar4;
                            xkbVar2 = xkbVar3;
                            jA = j2;
                            f3 = f6;
                            f4 = f7;
                            borderStroke2 = borderStroke;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            xkbVar2 = xkbVar;
                            f3 = f;
                            bVar3 = bVar2;
                            v9bVar3 = v9bVar2;
                            z5 = z3;
                            f4 = f2;
                            borderStroke2 = borderStroke;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 805306368;
                    if ((i3 & 1024) != 0) {
                        i15 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
                    }
                    if ((i3 & 2048) != 0) {
                        if ((i2 & 48) == 0) {
                            if (dVarF.x(this)) {
                                i17 = 32;
                            } else {
                                i17 = 16;
                            }
                            i15 |= i17;
                        }
                        i18 = i15;
                        if ((i4 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            } else {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                            }
                            objR = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = p0.i(Unit.a, p0.k());
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                            if (z) {
                                dVarF.y(629991660);
                                objR5 = dVarF.R();
                                if (objR5 == companion.a()) {
                                    objR5 = new Function0() { // from class: com.google.android.u04
                                        public final Object invoke() {
                                            return g0.e(o58Var);
                                        }
                                    };
                                    dVarF.L(objR5);
                                }
                                i0.d((Function0) objR5, dVarF, 6);
                                dVarF.u();
                            } else {
                                dVarF.y(630077189);
                                dVarF.u();
                            }
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = new e(Boolean.FALSE);
                                dVarF.L(objR2);
                            }
                            eVar = (e) objR2;
                            eVar.i(Boolean.valueOf(z));
                            if (((Boolean) eVar.a()).booleanValue()) {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            } else {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar5;
                            z5 = z6;
                            v9bVar3 = v9bVar4;
                            xkbVar2 = xkbVar3;
                            jA = j2;
                            f3 = f6;
                            f4 = f7;
                            borderStroke2 = borderStroke;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            xkbVar2 = xkbVar;
                            f3 = f;
                            bVar3 = bVar2;
                            v9bVar3 = v9bVar2;
                            z5 = z3;
                            f4 = f2;
                            borderStroke2 = borderStroke;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i15 |= 48;
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 100663296;
                i13 = i3 & 512;
                if (i13 != 0) {
                    if ((i & 805306368) == 0) {
                        if (dVarF.x(borderStroke)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    if ((i3 & 1024) != 0) {
                        i15 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
                    }
                    if ((i3 & 2048) != 0) {
                        if ((i2 & 48) == 0) {
                            if (dVarF.x(this)) {
                                i17 = 32;
                            } else {
                                i17 = 16;
                            }
                            i15 |= i17;
                        }
                        i18 = i15;
                        if ((i4 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            } else {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                            }
                            objR = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = p0.i(Unit.a, p0.k());
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                            if (z) {
                                dVarF.y(629991660);
                                objR5 = dVarF.R();
                                if (objR5 == companion.a()) {
                                    objR5 = new Function0() { // from class: com.google.android.u04
                                        public final Object invoke() {
                                            return g0.e(o58Var);
                                        }
                                    };
                                    dVarF.L(objR5);
                                }
                                i0.d((Function0) objR5, dVarF, 6);
                                dVarF.u();
                            } else {
                                dVarF.y(630077189);
                                dVarF.u();
                            }
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = new e(Boolean.FALSE);
                                dVarF.L(objR2);
                            }
                            eVar = (e) objR2;
                            eVar.i(Boolean.valueOf(z));
                            if (((Boolean) eVar.a()).booleanValue()) {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            } else {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar5;
                            z5 = z6;
                            v9bVar3 = v9bVar4;
                            xkbVar2 = xkbVar3;
                            jA = j2;
                            f3 = f6;
                            f4 = f7;
                            borderStroke2 = borderStroke;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            xkbVar2 = xkbVar;
                            f3 = f;
                            bVar3 = bVar2;
                            v9bVar3 = v9bVar2;
                            z5 = z3;
                            f4 = f2;
                            borderStroke2 = borderStroke;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i15 |= 48;
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i3 & 1024) != 0) {
                    i15 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
                }
                if ((i3 & 2048) != 0) {
                    if ((i2 & 48) == 0) {
                        if (dVarF.x(this)) {
                            i17 = 32;
                        } else {
                            i17 = 16;
                        }
                        i15 |= i17;
                    }
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 |= 48;
                i18 = i15;
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = p0.i(Unit.a, p0.k());
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                    if (z) {
                        dVarF.y(629991660);
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = new Function0() { // from class: com.google.android.u04
                                public final Object invoke() {
                                    return g0.e(o58Var);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        i0.d((Function0) objR5, dVarF, 6);
                        dVarF.u();
                    } else {
                        dVarF.y(630077189);
                        dVarF.u();
                    }
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new e(Boolean.FALSE);
                        dVarF.L(objR2);
                    }
                    eVar = (e) objR2;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar5;
                    z5 = z6;
                    v9bVar3 = v9bVar4;
                    xkbVar2 = xkbVar3;
                    jA = j2;
                    f3 = f6;
                    f4 = f7;
                    borderStroke2 = borderStroke;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    xkbVar2 = xkbVar;
                    f3 = f;
                    bVar3 = bVar2;
                    v9bVar3 = v9bVar2;
                    z5 = z3;
                    f4 = f2;
                    borderStroke2 = borderStroke;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.w04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 384;
            bVar2 = bVar;
            if ((i & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    v9bVar2 = v9bVar;
                    if (dVarF.x(v9bVar2)) {
                    }
                    i4 |= i21;
                } else {
                    v9bVar2 = v9bVar;
                }
                i4 |= i21;
            } else {
                v9bVar2 = v9bVar;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    z3 = z2;
                    if (dVarF.A(z3)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i & 196608) != 0) {
                    if ((i3 & 32) == 0) {
                        i20 = 65536;
                    } else {
                        i20 = 65536;
                    }
                    i4 |= i20;
                }
                if ((i & 1572864) == 0) {
                    jA = j;
                    if ((i3 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i4 |= i19;
                } else {
                    jA = j;
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (dVarF.B(f)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.B(f2)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i4 |= i12;
                    }
                    i13 = i3 & 512;
                    if (i13 != 0) {
                        if ((i & 805306368) == 0) {
                            if (dVarF.x(borderStroke)) {
                                i14 = 536870912;
                            } else {
                                i14 = 268435456;
                            }
                            i4 |= i14;
                        }
                        if ((i3 & 1024) != 0) {
                            i15 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i16 = 4;
                            } else {
                                i16 = 2;
                            }
                            i15 = i2 | i16;
                        } else {
                            i15 = i2;
                        }
                        if ((i3 & 2048) != 0) {
                            if ((i2 & 48) == 0) {
                                if (dVarF.x(this)) {
                                    i17 = 32;
                                } else {
                                    i17 = 16;
                                }
                                i15 |= i17;
                            }
                            i18 = i15;
                            if ((i4 & 306783379) == 306783378) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            if (dVarF.g(z4, i4 & 1)) {
                                dVarF.U();
                                if ((i & 1) != 0) {
                                    if (i5 != 0) {
                                        bVar4 = b.INSTANCE;
                                    } else {
                                        bVar4 = bVar2;
                                    }
                                    if ((i3 & 8) != 0) {
                                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                                        i4 &= -7169;
                                    } else {
                                        v9bVarD = v9bVar2;
                                    }
                                    if (i7 != 0) {
                                        z3 = true;
                                    }
                                    if ((i3 & 32) != 0) {
                                        xkbVarE = eq7.a.e(dVarF, 6);
                                        i4 &= -458753;
                                    } else {
                                        xkbVarE = xkbVar;
                                    }
                                    if ((i3 & 64) != 0) {
                                        jA = eq7.a.a(dVarF, 6);
                                        i4 &= -3670017;
                                    }
                                    if (i9 != 0) {
                                        f5 = eq7.a.f();
                                    } else {
                                        f5 = f;
                                    }
                                    if (i11 != 0) {
                                        fD = eq7.a.d();
                                    } else {
                                        fD = f2;
                                    }
                                    if (i13 != 0) {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                        borderStroke = null;
                                    } else {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                    }
                                } else {
                                    if (i5 != 0) {
                                        bVar4 = b.INSTANCE;
                                    } else {
                                        bVar4 = bVar2;
                                    }
                                    if ((i3 & 8) != 0) {
                                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                                        i4 &= -7169;
                                    } else {
                                        v9bVarD = v9bVar2;
                                    }
                                    if (i7 != 0) {
                                        z3 = true;
                                    }
                                    if ((i3 & 32) != 0) {
                                        xkbVarE = eq7.a.e(dVarF, 6);
                                        i4 &= -458753;
                                    } else {
                                        xkbVarE = xkbVar;
                                    }
                                    if ((i3 & 64) != 0) {
                                        jA = eq7.a.a(dVarF, 6);
                                        i4 &= -3670017;
                                    }
                                    if (i9 != 0) {
                                        f5 = eq7.a.f();
                                    } else {
                                        f5 = f;
                                    }
                                    if (i11 != 0) {
                                        fD = eq7.a.d();
                                    } else {
                                        fD = f2;
                                    }
                                    if (i13 != 0) {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                        borderStroke = null;
                                    } else {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                    }
                                }
                                dVarF.M();
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                                }
                                objR = dVarF.R();
                                companion = d.INSTANCE;
                                if (objR == companion.a()) {
                                    objR = p0.i(Unit.a, p0.k());
                                    dVarF.L(objR);
                                }
                                o58Var = (o58) objR;
                                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                                iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                                if (z) {
                                    dVarF.y(629991660);
                                    objR5 = dVarF.R();
                                    if (objR5 == companion.a()) {
                                        objR5 = new Function0() { // from class: com.google.android.u04
                                            public final Object invoke() {
                                                return g0.e(o58Var);
                                            }
                                        };
                                        dVarF.L(objR5);
                                    }
                                    i0.d((Function0) objR5, dVarF, 6);
                                    dVarF.u();
                                } else {
                                    dVarF.y(630077189);
                                    dVarF.u();
                                }
                                objR2 = dVarF.R();
                                if (objR2 == companion.a()) {
                                    objR2 = new e(Boolean.FALSE);
                                    dVarF.L(objR2);
                                }
                                eVar = (e) objR2;
                                eVar.i(Boolean.valueOf(z));
                                if (((Boolean) eVar.a()).booleanValue()) {
                                    dVarF.y(630396489);
                                    objR3 = dVarF.R();
                                    if (objR3 == companion.a()) {
                                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                        dVarF.L(objR3);
                                    }
                                    o58Var2 = (o58) objR3;
                                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                                    objR4 = dVarF.R();
                                    if (zX) {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    } else {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    }
                                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                    dVar2 = dVarF;
                                    dVar2.u();
                                } else {
                                    dVarF.y(630396489);
                                    objR3 = dVarF.R();
                                    if (objR3 == companion.a()) {
                                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                        dVarF.L(objR3);
                                    }
                                    o58Var2 = (o58) objR3;
                                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                                    objR4 = dVarF.R();
                                    if (zX) {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    } else {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    }
                                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                    dVar2 = dVarF;
                                    dVar2.u();
                                }
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                                bVar3 = bVar5;
                                z5 = z6;
                                v9bVar3 = v9bVar4;
                                xkbVar2 = xkbVar3;
                                jA = j2;
                                f3 = f6;
                                f4 = f7;
                                borderStroke2 = borderStroke;
                            } else {
                                dVar2 = dVarF;
                                dVar2.q();
                                xkbVar2 = xkbVar;
                                f3 = f;
                                bVar3 = bVar2;
                                v9bVar3 = v9bVar2;
                                z5 = z3;
                                f4 = f2;
                                borderStroke2 = borderStroke;
                            }
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i15 |= 48;
                        i18 = i15;
                        if ((i4 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            } else {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                            }
                            objR = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = p0.i(Unit.a, p0.k());
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                            if (z) {
                                dVarF.y(629991660);
                                objR5 = dVarF.R();
                                if (objR5 == companion.a()) {
                                    objR5 = new Function0() { // from class: com.google.android.u04
                                        public final Object invoke() {
                                            return g0.e(o58Var);
                                        }
                                    };
                                    dVarF.L(objR5);
                                }
                                i0.d((Function0) objR5, dVarF, 6);
                                dVarF.u();
                            } else {
                                dVarF.y(630077189);
                                dVarF.u();
                            }
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = new e(Boolean.FALSE);
                                dVarF.L(objR2);
                            }
                            eVar = (e) objR2;
                            eVar.i(Boolean.valueOf(z));
                            if (((Boolean) eVar.a()).booleanValue()) {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            } else {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar5;
                            z5 = z6;
                            v9bVar3 = v9bVar4;
                            xkbVar2 = xkbVar3;
                            jA = j2;
                            f3 = f6;
                            f4 = f7;
                            borderStroke2 = borderStroke;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            xkbVar2 = xkbVar;
                            f3 = f;
                            bVar3 = bVar2;
                            v9bVar3 = v9bVar2;
                            z5 = z3;
                            f4 = f2;
                            borderStroke2 = borderStroke;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 805306368;
                    if ((i3 & 1024) != 0) {
                        i15 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
                    }
                    if ((i3 & 2048) != 0) {
                        if ((i2 & 48) == 0) {
                            if (dVarF.x(this)) {
                                i17 = 32;
                            } else {
                                i17 = 16;
                            }
                            i15 |= i17;
                        }
                        i18 = i15;
                        if ((i4 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            } else {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                            }
                            objR = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = p0.i(Unit.a, p0.k());
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                            if (z) {
                                dVarF.y(629991660);
                                objR5 = dVarF.R();
                                if (objR5 == companion.a()) {
                                    objR5 = new Function0() { // from class: com.google.android.u04
                                        public final Object invoke() {
                                            return g0.e(o58Var);
                                        }
                                    };
                                    dVarF.L(objR5);
                                }
                                i0.d((Function0) objR5, dVarF, 6);
                                dVarF.u();
                            } else {
                                dVarF.y(630077189);
                                dVarF.u();
                            }
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = new e(Boolean.FALSE);
                                dVarF.L(objR2);
                            }
                            eVar = (e) objR2;
                            eVar.i(Boolean.valueOf(z));
                            if (((Boolean) eVar.a()).booleanValue()) {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            } else {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar5;
                            z5 = z6;
                            v9bVar3 = v9bVar4;
                            xkbVar2 = xkbVar3;
                            jA = j2;
                            f3 = f6;
                            f4 = f7;
                            borderStroke2 = borderStroke;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            xkbVar2 = xkbVar;
                            f3 = f;
                            bVar3 = bVar2;
                            v9bVar3 = v9bVar2;
                            z5 = z3;
                            f4 = f2;
                            borderStroke2 = borderStroke;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i15 |= 48;
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 100663296;
                i13 = i3 & 512;
                if (i13 != 0) {
                    if ((i & 805306368) == 0) {
                        if (dVarF.x(borderStroke)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    if ((i3 & 1024) != 0) {
                        i15 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
                    }
                    if ((i3 & 2048) != 0) {
                        if ((i2 & 48) == 0) {
                            if (dVarF.x(this)) {
                                i17 = 32;
                            } else {
                                i17 = 16;
                            }
                            i15 |= i17;
                        }
                        i18 = i15;
                        if ((i4 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            } else {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                            }
                            objR = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = p0.i(Unit.a, p0.k());
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                            if (z) {
                                dVarF.y(629991660);
                                objR5 = dVarF.R();
                                if (objR5 == companion.a()) {
                                    objR5 = new Function0() { // from class: com.google.android.u04
                                        public final Object invoke() {
                                            return g0.e(o58Var);
                                        }
                                    };
                                    dVarF.L(objR5);
                                }
                                i0.d((Function0) objR5, dVarF, 6);
                                dVarF.u();
                            } else {
                                dVarF.y(630077189);
                                dVarF.u();
                            }
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = new e(Boolean.FALSE);
                                dVarF.L(objR2);
                            }
                            eVar = (e) objR2;
                            eVar.i(Boolean.valueOf(z));
                            if (((Boolean) eVar.a()).booleanValue()) {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            } else {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar5;
                            z5 = z6;
                            v9bVar3 = v9bVar4;
                            xkbVar2 = xkbVar3;
                            jA = j2;
                            f3 = f6;
                            f4 = f7;
                            borderStroke2 = borderStroke;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            xkbVar2 = xkbVar;
                            f3 = f;
                            bVar3 = bVar2;
                            v9bVar3 = v9bVar2;
                            z5 = z3;
                            f4 = f2;
                            borderStroke2 = borderStroke;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i15 |= 48;
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i3 & 1024) != 0) {
                    i15 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
                }
                if ((i3 & 2048) != 0) {
                    if ((i2 & 48) == 0) {
                        if (dVarF.x(this)) {
                            i17 = 32;
                        } else {
                            i17 = 16;
                        }
                        i15 |= i17;
                    }
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 |= 48;
                i18 = i15;
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = p0.i(Unit.a, p0.k());
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                    if (z) {
                        dVarF.y(629991660);
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = new Function0() { // from class: com.google.android.u04
                                public final Object invoke() {
                                    return g0.e(o58Var);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        i0.d((Function0) objR5, dVarF, 6);
                        dVarF.u();
                    } else {
                        dVarF.y(630077189);
                        dVarF.u();
                    }
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new e(Boolean.FALSE);
                        dVarF.L(objR2);
                    }
                    eVar = (e) objR2;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar5;
                    z5 = z6;
                    v9bVar3 = v9bVar4;
                    xkbVar2 = xkbVar3;
                    jA = j2;
                    f3 = f6;
                    f4 = f7;
                    borderStroke2 = borderStroke;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    xkbVar2 = xkbVar;
                    f3 = f;
                    bVar3 = bVar2;
                    v9bVar3 = v9bVar2;
                    z5 = z3;
                    f4 = f2;
                    borderStroke2 = borderStroke;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.w04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            z3 = z2;
            if ((i & 196608) != 0) {
                if ((i3 & 32) == 0) {
                    i20 = 65536;
                } else {
                    i20 = 65536;
                }
                i4 |= i20;
            }
            if ((i & 1572864) == 0) {
                jA = j;
                if ((i3 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i4 |= i19;
            } else {
                jA = j;
            }
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (dVarF.B(f)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            i11 = i3 & 256;
            if (i11 != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.B(f2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 512;
                if (i13 != 0) {
                    if ((i & 805306368) == 0) {
                        if (dVarF.x(borderStroke)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    if ((i3 & 1024) != 0) {
                        i15 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
                    }
                    if ((i3 & 2048) != 0) {
                        if ((i2 & 48) == 0) {
                            if (dVarF.x(this)) {
                                i17 = 32;
                            } else {
                                i17 = 16;
                            }
                            i15 |= i17;
                        }
                        i18 = i15;
                        if ((i4 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            } else {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                            }
                            objR = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = p0.i(Unit.a, p0.k());
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                            if (z) {
                                dVarF.y(629991660);
                                objR5 = dVarF.R();
                                if (objR5 == companion.a()) {
                                    objR5 = new Function0() { // from class: com.google.android.u04
                                        public final Object invoke() {
                                            return g0.e(o58Var);
                                        }
                                    };
                                    dVarF.L(objR5);
                                }
                                i0.d((Function0) objR5, dVarF, 6);
                                dVarF.u();
                            } else {
                                dVarF.y(630077189);
                                dVarF.u();
                            }
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = new e(Boolean.FALSE);
                                dVarF.L(objR2);
                            }
                            eVar = (e) objR2;
                            eVar.i(Boolean.valueOf(z));
                            if (((Boolean) eVar.a()).booleanValue()) {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            } else {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar5;
                            z5 = z6;
                            v9bVar3 = v9bVar4;
                            xkbVar2 = xkbVar3;
                            jA = j2;
                            f3 = f6;
                            f4 = f7;
                            borderStroke2 = borderStroke;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            xkbVar2 = xkbVar;
                            f3 = f;
                            bVar3 = bVar2;
                            v9bVar3 = v9bVar2;
                            z5 = z3;
                            f4 = f2;
                            borderStroke2 = borderStroke;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i15 |= 48;
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i3 & 1024) != 0) {
                    i15 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
                }
                if ((i3 & 2048) != 0) {
                    if ((i2 & 48) == 0) {
                        if (dVarF.x(this)) {
                            i17 = 32;
                        } else {
                            i17 = 16;
                        }
                        i15 |= i17;
                    }
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 |= 48;
                i18 = i15;
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = p0.i(Unit.a, p0.k());
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                    if (z) {
                        dVarF.y(629991660);
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = new Function0() { // from class: com.google.android.u04
                                public final Object invoke() {
                                    return g0.e(o58Var);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        i0.d((Function0) objR5, dVarF, 6);
                        dVarF.u();
                    } else {
                        dVarF.y(630077189);
                        dVarF.u();
                    }
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new e(Boolean.FALSE);
                        dVarF.L(objR2);
                    }
                    eVar = (e) objR2;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar5;
                    z5 = z6;
                    v9bVar3 = v9bVar4;
                    xkbVar2 = xkbVar3;
                    jA = j2;
                    f3 = f6;
                    f4 = f7;
                    borderStroke2 = borderStroke;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    xkbVar2 = xkbVar;
                    f3 = f;
                    bVar3 = bVar2;
                    v9bVar3 = v9bVar2;
                    z5 = z3;
                    f4 = f2;
                    borderStroke2 = borderStroke;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.w04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 100663296;
            i13 = i3 & 512;
            if (i13 != 0) {
                if ((i & 805306368) == 0) {
                    if (dVarF.x(borderStroke)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                if ((i3 & 1024) != 0) {
                    i15 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
                }
                if ((i3 & 2048) != 0) {
                    if ((i2 & 48) == 0) {
                        if (dVarF.x(this)) {
                            i17 = 32;
                        } else {
                            i17 = 16;
                        }
                        i15 |= i17;
                    }
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 |= 48;
                i18 = i15;
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = p0.i(Unit.a, p0.k());
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                    if (z) {
                        dVarF.y(629991660);
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = new Function0() { // from class: com.google.android.u04
                                public final Object invoke() {
                                    return g0.e(o58Var);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        i0.d((Function0) objR5, dVarF, 6);
                        dVarF.u();
                    } else {
                        dVarF.y(630077189);
                        dVarF.u();
                    }
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new e(Boolean.FALSE);
                        dVarF.L(objR2);
                    }
                    eVar = (e) objR2;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar5;
                    z5 = z6;
                    v9bVar3 = v9bVar4;
                    xkbVar2 = xkbVar3;
                    jA = j2;
                    f3 = f6;
                    f4 = f7;
                    borderStroke2 = borderStroke;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    xkbVar2 = xkbVar;
                    f3 = f;
                    bVar3 = bVar2;
                    v9bVar3 = v9bVar2;
                    z5 = z3;
                    f4 = f2;
                    borderStroke2 = borderStroke;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.w04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 805306368;
            if ((i3 & 1024) != 0) {
                i15 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.T(ps4Var)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i15 = i2 | i16;
            } else {
                i15 = i2;
            }
            if ((i3 & 2048) != 0) {
                if ((i2 & 48) == 0) {
                    if (dVarF.x(this)) {
                        i17 = 32;
                    } else {
                        i17 = 16;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = p0.i(Unit.a, p0.k());
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                    if (z) {
                        dVarF.y(629991660);
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = new Function0() { // from class: com.google.android.u04
                                public final Object invoke() {
                                    return g0.e(o58Var);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        i0.d((Function0) objR5, dVarF, 6);
                        dVarF.u();
                    } else {
                        dVarF.y(630077189);
                        dVarF.u();
                    }
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new e(Boolean.FALSE);
                        dVarF.L(objR2);
                    }
                    eVar = (e) objR2;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar5;
                    z5 = z6;
                    v9bVar3 = v9bVar4;
                    xkbVar2 = xkbVar3;
                    jA = j2;
                    f3 = f6;
                    f4 = f7;
                    borderStroke2 = borderStroke;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    xkbVar2 = xkbVar;
                    f3 = f;
                    bVar3 = bVar2;
                    v9bVar3 = v9bVar2;
                    z5 = z3;
                    f4 = f2;
                    borderStroke2 = borderStroke;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.w04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 48;
            i18 = i15;
            if ((i4 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (dVarF.g(z4, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 8) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -7169;
                    } else {
                        v9bVarD = v9bVar2;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -458753;
                    } else {
                        xkbVarE = xkbVar;
                    }
                    if ((i3 & 64) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -3670017;
                    }
                    if (i9 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i11 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i13 != 0) {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                        borderStroke = null;
                    } else {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                    }
                } else {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 8) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -7169;
                    } else {
                        v9bVarD = v9bVar2;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -458753;
                    } else {
                        xkbVarE = xkbVar;
                    }
                    if ((i3 & 64) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -3670017;
                    }
                    if (i9 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i11 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i13 != 0) {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                        borderStroke = null;
                    } else {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = p0.i(Unit.a, p0.k());
                    dVarF.L(objR);
                }
                o58Var = (o58) objR;
                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                if (z) {
                    dVarF.y(629991660);
                    objR5 = dVarF.R();
                    if (objR5 == companion.a()) {
                        objR5 = new Function0() { // from class: com.google.android.u04
                            public final Object invoke() {
                                return g0.e(o58Var);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    i0.d((Function0) objR5, dVarF, 6);
                    dVarF.u();
                } else {
                    dVarF.y(630077189);
                    dVarF.u();
                }
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = new e(Boolean.FALSE);
                    dVarF.L(objR2);
                }
                eVar = (e) objR2;
                eVar.i(Boolean.valueOf(z));
                if (((Boolean) eVar.a()).booleanValue()) {
                    dVarF.y(630396489);
                    objR3 = dVarF.R();
                    if (objR3 == companion.a()) {
                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR3);
                    }
                    o58Var2 = (o58) objR3;
                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    }
                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                    dVar2 = dVarF;
                    dVar2.u();
                } else {
                    dVarF.y(630396489);
                    objR3 = dVarF.R();
                    if (objR3 == companion.a()) {
                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR3);
                    }
                    o58Var2 = (o58) objR3;
                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    }
                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                    dVar2 = dVarF;
                    dVar2.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar5;
                z5 = z6;
                v9bVar3 = v9bVar4;
                xkbVar2 = xkbVar3;
                jA = j2;
                f3 = f6;
                f4 = f7;
                borderStroke2 = borderStroke;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                xkbVar2 = xkbVar;
                f3 = f;
                bVar3 = bVar2;
                v9bVar3 = v9bVar2;
                z5 = z3;
                f4 = f2;
                borderStroke2 = borderStroke;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.w04
                    public final Object invoke(Object obj, Object obj2) {
                        return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 48;
        function1 = function0;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                if (dVarF.x(bVar2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            if ((i & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    v9bVar2 = v9bVar;
                    if (dVarF.x(v9bVar2)) {
                    }
                    i4 |= i21;
                } else {
                    v9bVar2 = v9bVar;
                }
                i4 |= i21;
            } else {
                v9bVar2 = v9bVar;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    z3 = z2;
                    if (dVarF.A(z3)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i & 196608) != 0) {
                    if ((i3 & 32) == 0) {
                        i20 = 65536;
                    } else {
                        i20 = 65536;
                    }
                    i4 |= i20;
                }
                if ((i & 1572864) == 0) {
                    jA = j;
                    if ((i3 & 64) == 0) {
                        i19 = 524288;
                    } else {
                        i19 = 524288;
                    }
                    i4 |= i19;
                } else {
                    jA = j;
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (dVarF.B(f)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.B(f2)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i4 |= i12;
                    }
                    i13 = i3 & 512;
                    if (i13 != 0) {
                        if ((i & 805306368) == 0) {
                            if (dVarF.x(borderStroke)) {
                                i14 = 536870912;
                            } else {
                                i14 = 268435456;
                            }
                            i4 |= i14;
                        }
                        if ((i3 & 1024) != 0) {
                            i15 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i16 = 4;
                            } else {
                                i16 = 2;
                            }
                            i15 = i2 | i16;
                        } else {
                            i15 = i2;
                        }
                        if ((i3 & 2048) != 0) {
                            if ((i2 & 48) == 0) {
                                if (dVarF.x(this)) {
                                    i17 = 32;
                                } else {
                                    i17 = 16;
                                }
                                i15 |= i17;
                            }
                            i18 = i15;
                            if ((i4 & 306783379) == 306783378) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            if (dVarF.g(z4, i4 & 1)) {
                                dVarF.U();
                                if ((i & 1) != 0) {
                                    if (i5 != 0) {
                                        bVar4 = b.INSTANCE;
                                    } else {
                                        bVar4 = bVar2;
                                    }
                                    if ((i3 & 8) != 0) {
                                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                                        i4 &= -7169;
                                    } else {
                                        v9bVarD = v9bVar2;
                                    }
                                    if (i7 != 0) {
                                        z3 = true;
                                    }
                                    if ((i3 & 32) != 0) {
                                        xkbVarE = eq7.a.e(dVarF, 6);
                                        i4 &= -458753;
                                    } else {
                                        xkbVarE = xkbVar;
                                    }
                                    if ((i3 & 64) != 0) {
                                        jA = eq7.a.a(dVarF, 6);
                                        i4 &= -3670017;
                                    }
                                    if (i9 != 0) {
                                        f5 = eq7.a.f();
                                    } else {
                                        f5 = f;
                                    }
                                    if (i11 != 0) {
                                        fD = eq7.a.d();
                                    } else {
                                        fD = f2;
                                    }
                                    if (i13 != 0) {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                        borderStroke = null;
                                    } else {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                    }
                                } else {
                                    if (i5 != 0) {
                                        bVar4 = b.INSTANCE;
                                    } else {
                                        bVar4 = bVar2;
                                    }
                                    if ((i3 & 8) != 0) {
                                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                                        i4 &= -7169;
                                    } else {
                                        v9bVarD = v9bVar2;
                                    }
                                    if (i7 != 0) {
                                        z3 = true;
                                    }
                                    if ((i3 & 32) != 0) {
                                        xkbVarE = eq7.a.e(dVarF, 6);
                                        i4 &= -458753;
                                    } else {
                                        xkbVarE = xkbVar;
                                    }
                                    if ((i3 & 64) != 0) {
                                        jA = eq7.a.a(dVarF, 6);
                                        i4 &= -3670017;
                                    }
                                    if (i9 != 0) {
                                        f5 = eq7.a.f();
                                    } else {
                                        f5 = f;
                                    }
                                    if (i11 != 0) {
                                        fD = eq7.a.d();
                                    } else {
                                        fD = f2;
                                    }
                                    if (i13 != 0) {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                        borderStroke = null;
                                    } else {
                                        bVar5 = bVar4;
                                        f6 = f5;
                                        j2 = jA;
                                        xkbVar3 = xkbVarE;
                                        v9bVar4 = v9bVarD;
                                        f7 = fD;
                                        z6 = z3;
                                    }
                                }
                                dVarF.M();
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                                }
                                objR = dVarF.R();
                                companion = d.INSTANCE;
                                if (objR == companion.a()) {
                                    objR = p0.i(Unit.a, p0.k());
                                    dVarF.L(objR);
                                }
                                o58Var = (o58) objR;
                                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                                iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                                if (z) {
                                    dVarF.y(629991660);
                                    objR5 = dVarF.R();
                                    if (objR5 == companion.a()) {
                                        objR5 = new Function0() { // from class: com.google.android.u04
                                            public final Object invoke() {
                                                return g0.e(o58Var);
                                            }
                                        };
                                        dVarF.L(objR5);
                                    }
                                    i0.d((Function0) objR5, dVarF, 6);
                                    dVarF.u();
                                } else {
                                    dVarF.y(630077189);
                                    dVarF.u();
                                }
                                objR2 = dVarF.R();
                                if (objR2 == companion.a()) {
                                    objR2 = new e(Boolean.FALSE);
                                    dVarF.L(objR2);
                                }
                                eVar = (e) objR2;
                                eVar.i(Boolean.valueOf(z));
                                if (((Boolean) eVar.a()).booleanValue()) {
                                    dVarF.y(630396489);
                                    objR3 = dVarF.R();
                                    if (objR3 == companion.a()) {
                                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                        dVarF.L(objR3);
                                    }
                                    o58Var2 = (o58) objR3;
                                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                                    objR4 = dVarF.R();
                                    if (zX) {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    } else {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    }
                                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                    dVar2 = dVarF;
                                    dVar2.u();
                                } else {
                                    dVarF.y(630396489);
                                    objR3 = dVarF.R();
                                    if (objR3 == companion.a()) {
                                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                        dVarF.L(objR3);
                                    }
                                    o58Var2 = (o58) objR3;
                                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                                    objR4 = dVarF.R();
                                    if (zX) {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    } else {
                                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                            public final Object invoke(Object obj, Object obj2) {
                                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                            }
                                        }, 8, null);
                                        dVarF.L(objR4);
                                    }
                                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                    dVar2 = dVarF;
                                    dVar2.u();
                                }
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                                bVar3 = bVar5;
                                z5 = z6;
                                v9bVar3 = v9bVar4;
                                xkbVar2 = xkbVar3;
                                jA = j2;
                                f3 = f6;
                                f4 = f7;
                                borderStroke2 = borderStroke;
                            } else {
                                dVar2 = dVarF;
                                dVar2.q();
                                xkbVar2 = xkbVar;
                                f3 = f;
                                bVar3 = bVar2;
                                v9bVar3 = v9bVar2;
                                z5 = z3;
                                f4 = f2;
                                borderStroke2 = borderStroke;
                            }
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i15 |= 48;
                        i18 = i15;
                        if ((i4 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            } else {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                            }
                            objR = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = p0.i(Unit.a, p0.k());
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                            if (z) {
                                dVarF.y(629991660);
                                objR5 = dVarF.R();
                                if (objR5 == companion.a()) {
                                    objR5 = new Function0() { // from class: com.google.android.u04
                                        public final Object invoke() {
                                            return g0.e(o58Var);
                                        }
                                    };
                                    dVarF.L(objR5);
                                }
                                i0.d((Function0) objR5, dVarF, 6);
                                dVarF.u();
                            } else {
                                dVarF.y(630077189);
                                dVarF.u();
                            }
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = new e(Boolean.FALSE);
                                dVarF.L(objR2);
                            }
                            eVar = (e) objR2;
                            eVar.i(Boolean.valueOf(z));
                            if (((Boolean) eVar.a()).booleanValue()) {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            } else {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar5;
                            z5 = z6;
                            v9bVar3 = v9bVar4;
                            xkbVar2 = xkbVar3;
                            jA = j2;
                            f3 = f6;
                            f4 = f7;
                            borderStroke2 = borderStroke;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            xkbVar2 = xkbVar;
                            f3 = f;
                            bVar3 = bVar2;
                            v9bVar3 = v9bVar2;
                            z5 = z3;
                            f4 = f2;
                            borderStroke2 = borderStroke;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 805306368;
                    if ((i3 & 1024) != 0) {
                        i15 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
                    }
                    if ((i3 & 2048) != 0) {
                        if ((i2 & 48) == 0) {
                            if (dVarF.x(this)) {
                                i17 = 32;
                            } else {
                                i17 = 16;
                            }
                            i15 |= i17;
                        }
                        i18 = i15;
                        if ((i4 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            } else {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                            }
                            objR = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = p0.i(Unit.a, p0.k());
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                            if (z) {
                                dVarF.y(629991660);
                                objR5 = dVarF.R();
                                if (objR5 == companion.a()) {
                                    objR5 = new Function0() { // from class: com.google.android.u04
                                        public final Object invoke() {
                                            return g0.e(o58Var);
                                        }
                                    };
                                    dVarF.L(objR5);
                                }
                                i0.d((Function0) objR5, dVarF, 6);
                                dVarF.u();
                            } else {
                                dVarF.y(630077189);
                                dVarF.u();
                            }
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = new e(Boolean.FALSE);
                                dVarF.L(objR2);
                            }
                            eVar = (e) objR2;
                            eVar.i(Boolean.valueOf(z));
                            if (((Boolean) eVar.a()).booleanValue()) {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            } else {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar5;
                            z5 = z6;
                            v9bVar3 = v9bVar4;
                            xkbVar2 = xkbVar3;
                            jA = j2;
                            f3 = f6;
                            f4 = f7;
                            borderStroke2 = borderStroke;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            xkbVar2 = xkbVar;
                            f3 = f;
                            bVar3 = bVar2;
                            v9bVar3 = v9bVar2;
                            z5 = z3;
                            f4 = f2;
                            borderStroke2 = borderStroke;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i15 |= 48;
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 100663296;
                i13 = i3 & 512;
                if (i13 != 0) {
                    if ((i & 805306368) == 0) {
                        if (dVarF.x(borderStroke)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    if ((i3 & 1024) != 0) {
                        i15 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
                    }
                    if ((i3 & 2048) != 0) {
                        if ((i2 & 48) == 0) {
                            if (dVarF.x(this)) {
                                i17 = 32;
                            } else {
                                i17 = 16;
                            }
                            i15 |= i17;
                        }
                        i18 = i15;
                        if ((i4 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            } else {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                            }
                            objR = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = p0.i(Unit.a, p0.k());
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                            if (z) {
                                dVarF.y(629991660);
                                objR5 = dVarF.R();
                                if (objR5 == companion.a()) {
                                    objR5 = new Function0() { // from class: com.google.android.u04
                                        public final Object invoke() {
                                            return g0.e(o58Var);
                                        }
                                    };
                                    dVarF.L(objR5);
                                }
                                i0.d((Function0) objR5, dVarF, 6);
                                dVarF.u();
                            } else {
                                dVarF.y(630077189);
                                dVarF.u();
                            }
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = new e(Boolean.FALSE);
                                dVarF.L(objR2);
                            }
                            eVar = (e) objR2;
                            eVar.i(Boolean.valueOf(z));
                            if (((Boolean) eVar.a()).booleanValue()) {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            } else {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar5;
                            z5 = z6;
                            v9bVar3 = v9bVar4;
                            xkbVar2 = xkbVar3;
                            jA = j2;
                            f3 = f6;
                            f4 = f7;
                            borderStroke2 = borderStroke;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            xkbVar2 = xkbVar;
                            f3 = f;
                            bVar3 = bVar2;
                            v9bVar3 = v9bVar2;
                            z5 = z3;
                            f4 = f2;
                            borderStroke2 = borderStroke;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i15 |= 48;
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i3 & 1024) != 0) {
                    i15 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
                }
                if ((i3 & 2048) != 0) {
                    if ((i2 & 48) == 0) {
                        if (dVarF.x(this)) {
                            i17 = 32;
                        } else {
                            i17 = 16;
                        }
                        i15 |= i17;
                    }
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 |= 48;
                i18 = i15;
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = p0.i(Unit.a, p0.k());
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                    if (z) {
                        dVarF.y(629991660);
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = new Function0() { // from class: com.google.android.u04
                                public final Object invoke() {
                                    return g0.e(o58Var);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        i0.d((Function0) objR5, dVarF, 6);
                        dVarF.u();
                    } else {
                        dVarF.y(630077189);
                        dVarF.u();
                    }
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new e(Boolean.FALSE);
                        dVarF.L(objR2);
                    }
                    eVar = (e) objR2;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar5;
                    z5 = z6;
                    v9bVar3 = v9bVar4;
                    xkbVar2 = xkbVar3;
                    jA = j2;
                    f3 = f6;
                    f4 = f7;
                    borderStroke2 = borderStroke;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    xkbVar2 = xkbVar;
                    f3 = f;
                    bVar3 = bVar2;
                    v9bVar3 = v9bVar2;
                    z5 = z3;
                    f4 = f2;
                    borderStroke2 = borderStroke;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.w04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            z3 = z2;
            if ((i & 196608) != 0) {
                if ((i3 & 32) == 0) {
                    i20 = 65536;
                } else {
                    i20 = 65536;
                }
                i4 |= i20;
            }
            if ((i & 1572864) == 0) {
                jA = j;
                if ((i3 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i4 |= i19;
            } else {
                jA = j;
            }
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (dVarF.B(f)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            i11 = i3 & 256;
            if (i11 != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.B(f2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 512;
                if (i13 != 0) {
                    if ((i & 805306368) == 0) {
                        if (dVarF.x(borderStroke)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    if ((i3 & 1024) != 0) {
                        i15 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
                    }
                    if ((i3 & 2048) != 0) {
                        if ((i2 & 48) == 0) {
                            if (dVarF.x(this)) {
                                i17 = 32;
                            } else {
                                i17 = 16;
                            }
                            i15 |= i17;
                        }
                        i18 = i15;
                        if ((i4 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            } else {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                            }
                            objR = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = p0.i(Unit.a, p0.k());
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                            if (z) {
                                dVarF.y(629991660);
                                objR5 = dVarF.R();
                                if (objR5 == companion.a()) {
                                    objR5 = new Function0() { // from class: com.google.android.u04
                                        public final Object invoke() {
                                            return g0.e(o58Var);
                                        }
                                    };
                                    dVarF.L(objR5);
                                }
                                i0.d((Function0) objR5, dVarF, 6);
                                dVarF.u();
                            } else {
                                dVarF.y(630077189);
                                dVarF.u();
                            }
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = new e(Boolean.FALSE);
                                dVarF.L(objR2);
                            }
                            eVar = (e) objR2;
                            eVar.i(Boolean.valueOf(z));
                            if (((Boolean) eVar.a()).booleanValue()) {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            } else {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar5;
                            z5 = z6;
                            v9bVar3 = v9bVar4;
                            xkbVar2 = xkbVar3;
                            jA = j2;
                            f3 = f6;
                            f4 = f7;
                            borderStroke2 = borderStroke;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            xkbVar2 = xkbVar;
                            f3 = f;
                            bVar3 = bVar2;
                            v9bVar3 = v9bVar2;
                            z5 = z3;
                            f4 = f2;
                            borderStroke2 = borderStroke;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i15 |= 48;
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i3 & 1024) != 0) {
                    i15 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
                }
                if ((i3 & 2048) != 0) {
                    if ((i2 & 48) == 0) {
                        if (dVarF.x(this)) {
                            i17 = 32;
                        } else {
                            i17 = 16;
                        }
                        i15 |= i17;
                    }
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 |= 48;
                i18 = i15;
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = p0.i(Unit.a, p0.k());
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                    if (z) {
                        dVarF.y(629991660);
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = new Function0() { // from class: com.google.android.u04
                                public final Object invoke() {
                                    return g0.e(o58Var);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        i0.d((Function0) objR5, dVarF, 6);
                        dVarF.u();
                    } else {
                        dVarF.y(630077189);
                        dVarF.u();
                    }
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new e(Boolean.FALSE);
                        dVarF.L(objR2);
                    }
                    eVar = (e) objR2;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar5;
                    z5 = z6;
                    v9bVar3 = v9bVar4;
                    xkbVar2 = xkbVar3;
                    jA = j2;
                    f3 = f6;
                    f4 = f7;
                    borderStroke2 = borderStroke;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    xkbVar2 = xkbVar;
                    f3 = f;
                    bVar3 = bVar2;
                    v9bVar3 = v9bVar2;
                    z5 = z3;
                    f4 = f2;
                    borderStroke2 = borderStroke;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.w04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 100663296;
            i13 = i3 & 512;
            if (i13 != 0) {
                if ((i & 805306368) == 0) {
                    if (dVarF.x(borderStroke)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                if ((i3 & 1024) != 0) {
                    i15 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
                }
                if ((i3 & 2048) != 0) {
                    if ((i2 & 48) == 0) {
                        if (dVarF.x(this)) {
                            i17 = 32;
                        } else {
                            i17 = 16;
                        }
                        i15 |= i17;
                    }
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 |= 48;
                i18 = i15;
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = p0.i(Unit.a, p0.k());
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                    if (z) {
                        dVarF.y(629991660);
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = new Function0() { // from class: com.google.android.u04
                                public final Object invoke() {
                                    return g0.e(o58Var);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        i0.d((Function0) objR5, dVarF, 6);
                        dVarF.u();
                    } else {
                        dVarF.y(630077189);
                        dVarF.u();
                    }
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new e(Boolean.FALSE);
                        dVarF.L(objR2);
                    }
                    eVar = (e) objR2;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar5;
                    z5 = z6;
                    v9bVar3 = v9bVar4;
                    xkbVar2 = xkbVar3;
                    jA = j2;
                    f3 = f6;
                    f4 = f7;
                    borderStroke2 = borderStroke;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    xkbVar2 = xkbVar;
                    f3 = f;
                    bVar3 = bVar2;
                    v9bVar3 = v9bVar2;
                    z5 = z3;
                    f4 = f2;
                    borderStroke2 = borderStroke;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.w04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 805306368;
            if ((i3 & 1024) != 0) {
                i15 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.T(ps4Var)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i15 = i2 | i16;
            } else {
                i15 = i2;
            }
            if ((i3 & 2048) != 0) {
                if ((i2 & 48) == 0) {
                    if (dVarF.x(this)) {
                        i17 = 32;
                    } else {
                        i17 = 16;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = p0.i(Unit.a, p0.k());
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                    if (z) {
                        dVarF.y(629991660);
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = new Function0() { // from class: com.google.android.u04
                                public final Object invoke() {
                                    return g0.e(o58Var);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        i0.d((Function0) objR5, dVarF, 6);
                        dVarF.u();
                    } else {
                        dVarF.y(630077189);
                        dVarF.u();
                    }
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new e(Boolean.FALSE);
                        dVarF.L(objR2);
                    }
                    eVar = (e) objR2;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar5;
                    z5 = z6;
                    v9bVar3 = v9bVar4;
                    xkbVar2 = xkbVar3;
                    jA = j2;
                    f3 = f6;
                    f4 = f7;
                    borderStroke2 = borderStroke;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    xkbVar2 = xkbVar;
                    f3 = f;
                    bVar3 = bVar2;
                    v9bVar3 = v9bVar2;
                    z5 = z3;
                    f4 = f2;
                    borderStroke2 = borderStroke;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.w04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 48;
            i18 = i15;
            if ((i4 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (dVarF.g(z4, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 8) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -7169;
                    } else {
                        v9bVarD = v9bVar2;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -458753;
                    } else {
                        xkbVarE = xkbVar;
                    }
                    if ((i3 & 64) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -3670017;
                    }
                    if (i9 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i11 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i13 != 0) {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                        borderStroke = null;
                    } else {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                    }
                } else {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 8) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -7169;
                    } else {
                        v9bVarD = v9bVar2;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -458753;
                    } else {
                        xkbVarE = xkbVar;
                    }
                    if ((i3 & 64) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -3670017;
                    }
                    if (i9 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i11 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i13 != 0) {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                        borderStroke = null;
                    } else {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = p0.i(Unit.a, p0.k());
                    dVarF.L(objR);
                }
                o58Var = (o58) objR;
                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                if (z) {
                    dVarF.y(629991660);
                    objR5 = dVarF.R();
                    if (objR5 == companion.a()) {
                        objR5 = new Function0() { // from class: com.google.android.u04
                            public final Object invoke() {
                                return g0.e(o58Var);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    i0.d((Function0) objR5, dVarF, 6);
                    dVarF.u();
                } else {
                    dVarF.y(630077189);
                    dVarF.u();
                }
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = new e(Boolean.FALSE);
                    dVarF.L(objR2);
                }
                eVar = (e) objR2;
                eVar.i(Boolean.valueOf(z));
                if (((Boolean) eVar.a()).booleanValue()) {
                    dVarF.y(630396489);
                    objR3 = dVarF.R();
                    if (objR3 == companion.a()) {
                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR3);
                    }
                    o58Var2 = (o58) objR3;
                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    }
                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                    dVar2 = dVarF;
                    dVar2.u();
                } else {
                    dVarF.y(630396489);
                    objR3 = dVarF.R();
                    if (objR3 == companion.a()) {
                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR3);
                    }
                    o58Var2 = (o58) objR3;
                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    }
                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                    dVar2 = dVarF;
                    dVar2.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar5;
                z5 = z6;
                v9bVar3 = v9bVar4;
                xkbVar2 = xkbVar3;
                jA = j2;
                f3 = f6;
                f4 = f7;
                borderStroke2 = borderStroke;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                xkbVar2 = xkbVar;
                f3 = f;
                bVar3 = bVar2;
                v9bVar3 = v9bVar2;
                z5 = z3;
                f4 = f2;
                borderStroke2 = borderStroke;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.w04
                    public final Object invoke(Object obj, Object obj2) {
                        return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 384;
        bVar2 = bVar;
        if ((i & 3072) == 0) {
            if ((i3 & 8) == 0) {
                v9bVar2 = v9bVar;
                if (dVarF.x(v9bVar2)) {
                }
                i4 |= i21;
            } else {
                v9bVar2 = v9bVar;
            }
            i4 |= i21;
        } else {
            v9bVar2 = v9bVar;
        }
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                if (dVarF.A(z3)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((i & 196608) != 0) {
                if ((i3 & 32) == 0) {
                    i20 = 65536;
                } else {
                    i20 = 65536;
                }
                i4 |= i20;
            }
            if ((i & 1572864) == 0) {
                jA = j;
                if ((i3 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i4 |= i19;
            } else {
                jA = j;
            }
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (dVarF.B(f)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            i11 = i3 & 256;
            if (i11 != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.B(f2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 512;
                if (i13 != 0) {
                    if ((i & 805306368) == 0) {
                        if (dVarF.x(borderStroke)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    if ((i3 & 1024) != 0) {
                        i15 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i16 = 4;
                        } else {
                            i16 = 2;
                        }
                        i15 = i2 | i16;
                    } else {
                        i15 = i2;
                    }
                    if ((i3 & 2048) != 0) {
                        if ((i2 & 48) == 0) {
                            if (dVarF.x(this)) {
                                i17 = 32;
                            } else {
                                i17 = 16;
                            }
                            i15 |= i17;
                        }
                        i18 = i15;
                        if ((i4 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i4 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            } else {
                                if (i5 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i3 & 8) != 0) {
                                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    v9bVarD = v9bVar2;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    xkbVarE = eq7.a.e(dVarF, 6);
                                    i4 &= -458753;
                                } else {
                                    xkbVarE = xkbVar;
                                }
                                if ((i3 & 64) != 0) {
                                    jA = eq7.a.a(dVarF, 6);
                                    i4 &= -3670017;
                                }
                                if (i9 != 0) {
                                    f5 = eq7.a.f();
                                } else {
                                    f5 = f;
                                }
                                if (i11 != 0) {
                                    fD = eq7.a.d();
                                } else {
                                    fD = f2;
                                }
                                if (i13 != 0) {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                    borderStroke = null;
                                } else {
                                    bVar5 = bVar4;
                                    f6 = f5;
                                    j2 = jA;
                                    xkbVar3 = xkbVarE;
                                    v9bVar4 = v9bVarD;
                                    f7 = fD;
                                    z6 = z3;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                            }
                            objR = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = p0.i(Unit.a, p0.k());
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                            if (z) {
                                dVarF.y(629991660);
                                objR5 = dVarF.R();
                                if (objR5 == companion.a()) {
                                    objR5 = new Function0() { // from class: com.google.android.u04
                                        public final Object invoke() {
                                            return g0.e(o58Var);
                                        }
                                    };
                                    dVarF.L(objR5);
                                }
                                i0.d((Function0) objR5, dVarF, 6);
                                dVarF.u();
                            } else {
                                dVarF.y(630077189);
                                dVarF.u();
                            }
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = new e(Boolean.FALSE);
                                dVarF.L(objR2);
                            }
                            eVar = (e) objR2;
                            eVar.i(Boolean.valueOf(z));
                            if (((Boolean) eVar.a()).booleanValue()) {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            } else {
                                dVarF.y(630396489);
                                objR3 = dVarF.R();
                                if (objR3 == companion.a()) {
                                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                    dVarF.L(objR3);
                                }
                                o58Var2 = (o58) objR3;
                                zX = dVarF.x(f43Var) | dVarF.C(iA);
                                objR4 = dVarF.R();
                                if (zX) {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                } else {
                                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                        public final Object invoke(Object obj, Object obj2) {
                                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                        }
                                    }, 8, null);
                                    dVarF.L(objR4);
                                }
                                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                                dVar2 = dVarF;
                                dVar2.u();
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar5;
                            z5 = z6;
                            v9bVar3 = v9bVar4;
                            xkbVar2 = xkbVar3;
                            jA = j2;
                            f3 = f6;
                            f4 = f7;
                            borderStroke2 = borderStroke;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            xkbVar2 = xkbVar;
                            f3 = f;
                            bVar3 = bVar2;
                            v9bVar3 = v9bVar2;
                            z5 = z3;
                            f4 = f2;
                            borderStroke2 = borderStroke;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.w04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i15 |= 48;
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i3 & 1024) != 0) {
                    i15 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
                }
                if ((i3 & 2048) != 0) {
                    if ((i2 & 48) == 0) {
                        if (dVarF.x(this)) {
                            i17 = 32;
                        } else {
                            i17 = 16;
                        }
                        i15 |= i17;
                    }
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 |= 48;
                i18 = i15;
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = p0.i(Unit.a, p0.k());
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                    if (z) {
                        dVarF.y(629991660);
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = new Function0() { // from class: com.google.android.u04
                                public final Object invoke() {
                                    return g0.e(o58Var);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        i0.d((Function0) objR5, dVarF, 6);
                        dVarF.u();
                    } else {
                        dVarF.y(630077189);
                        dVarF.u();
                    }
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new e(Boolean.FALSE);
                        dVarF.L(objR2);
                    }
                    eVar = (e) objR2;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar5;
                    z5 = z6;
                    v9bVar3 = v9bVar4;
                    xkbVar2 = xkbVar3;
                    jA = j2;
                    f3 = f6;
                    f4 = f7;
                    borderStroke2 = borderStroke;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    xkbVar2 = xkbVar;
                    f3 = f;
                    bVar3 = bVar2;
                    v9bVar3 = v9bVar2;
                    z5 = z3;
                    f4 = f2;
                    borderStroke2 = borderStroke;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.w04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 100663296;
            i13 = i3 & 512;
            if (i13 != 0) {
                if ((i & 805306368) == 0) {
                    if (dVarF.x(borderStroke)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                if ((i3 & 1024) != 0) {
                    i15 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
                }
                if ((i3 & 2048) != 0) {
                    if ((i2 & 48) == 0) {
                        if (dVarF.x(this)) {
                            i17 = 32;
                        } else {
                            i17 = 16;
                        }
                        i15 |= i17;
                    }
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 |= 48;
                i18 = i15;
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = p0.i(Unit.a, p0.k());
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                    if (z) {
                        dVarF.y(629991660);
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = new Function0() { // from class: com.google.android.u04
                                public final Object invoke() {
                                    return g0.e(o58Var);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        i0.d((Function0) objR5, dVarF, 6);
                        dVarF.u();
                    } else {
                        dVarF.y(630077189);
                        dVarF.u();
                    }
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new e(Boolean.FALSE);
                        dVarF.L(objR2);
                    }
                    eVar = (e) objR2;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar5;
                    z5 = z6;
                    v9bVar3 = v9bVar4;
                    xkbVar2 = xkbVar3;
                    jA = j2;
                    f3 = f6;
                    f4 = f7;
                    borderStroke2 = borderStroke;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    xkbVar2 = xkbVar;
                    f3 = f;
                    bVar3 = bVar2;
                    v9bVar3 = v9bVar2;
                    z5 = z3;
                    f4 = f2;
                    borderStroke2 = borderStroke;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.w04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 805306368;
            if ((i3 & 1024) != 0) {
                i15 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.T(ps4Var)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i15 = i2 | i16;
            } else {
                i15 = i2;
            }
            if ((i3 & 2048) != 0) {
                if ((i2 & 48) == 0) {
                    if (dVarF.x(this)) {
                        i17 = 32;
                    } else {
                        i17 = 16;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = p0.i(Unit.a, p0.k());
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                    if (z) {
                        dVarF.y(629991660);
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = new Function0() { // from class: com.google.android.u04
                                public final Object invoke() {
                                    return g0.e(o58Var);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        i0.d((Function0) objR5, dVarF, 6);
                        dVarF.u();
                    } else {
                        dVarF.y(630077189);
                        dVarF.u();
                    }
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new e(Boolean.FALSE);
                        dVarF.L(objR2);
                    }
                    eVar = (e) objR2;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar5;
                    z5 = z6;
                    v9bVar3 = v9bVar4;
                    xkbVar2 = xkbVar3;
                    jA = j2;
                    f3 = f6;
                    f4 = f7;
                    borderStroke2 = borderStroke;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    xkbVar2 = xkbVar;
                    f3 = f;
                    bVar3 = bVar2;
                    v9bVar3 = v9bVar2;
                    z5 = z3;
                    f4 = f2;
                    borderStroke2 = borderStroke;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.w04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 48;
            i18 = i15;
            if ((i4 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (dVarF.g(z4, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 8) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -7169;
                    } else {
                        v9bVarD = v9bVar2;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -458753;
                    } else {
                        xkbVarE = xkbVar;
                    }
                    if ((i3 & 64) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -3670017;
                    }
                    if (i9 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i11 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i13 != 0) {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                        borderStroke = null;
                    } else {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                    }
                } else {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 8) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -7169;
                    } else {
                        v9bVarD = v9bVar2;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -458753;
                    } else {
                        xkbVarE = xkbVar;
                    }
                    if ((i3 & 64) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -3670017;
                    }
                    if (i9 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i11 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i13 != 0) {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                        borderStroke = null;
                    } else {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = p0.i(Unit.a, p0.k());
                    dVarF.L(objR);
                }
                o58Var = (o58) objR;
                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                if (z) {
                    dVarF.y(629991660);
                    objR5 = dVarF.R();
                    if (objR5 == companion.a()) {
                        objR5 = new Function0() { // from class: com.google.android.u04
                            public final Object invoke() {
                                return g0.e(o58Var);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    i0.d((Function0) objR5, dVarF, 6);
                    dVarF.u();
                } else {
                    dVarF.y(630077189);
                    dVarF.u();
                }
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = new e(Boolean.FALSE);
                    dVarF.L(objR2);
                }
                eVar = (e) objR2;
                eVar.i(Boolean.valueOf(z));
                if (((Boolean) eVar.a()).booleanValue()) {
                    dVarF.y(630396489);
                    objR3 = dVarF.R();
                    if (objR3 == companion.a()) {
                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR3);
                    }
                    o58Var2 = (o58) objR3;
                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    }
                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                    dVar2 = dVarF;
                    dVar2.u();
                } else {
                    dVarF.y(630396489);
                    objR3 = dVarF.R();
                    if (objR3 == companion.a()) {
                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR3);
                    }
                    o58Var2 = (o58) objR3;
                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    }
                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                    dVar2 = dVarF;
                    dVar2.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar5;
                z5 = z6;
                v9bVar3 = v9bVar4;
                xkbVar2 = xkbVar3;
                jA = j2;
                f3 = f6;
                f4 = f7;
                borderStroke2 = borderStroke;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                xkbVar2 = xkbVar;
                f3 = f;
                bVar3 = bVar2;
                v9bVar3 = v9bVar2;
                z5 = z3;
                f4 = f2;
                borderStroke2 = borderStroke;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.w04
                    public final Object invoke(Object obj, Object obj2) {
                        return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 24576;
        z3 = z2;
        if ((i & 196608) != 0) {
            if ((i3 & 32) == 0) {
                i20 = 65536;
            } else {
                i20 = 65536;
            }
            i4 |= i20;
        }
        if ((i & 1572864) == 0) {
            jA = j;
            if ((i3 & 64) == 0) {
                i19 = 524288;
            } else {
                i19 = 524288;
            }
            i4 |= i19;
        } else {
            jA = j;
        }
        i9 = i3 & 128;
        if (i9 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (dVarF.B(f)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i4 |= i10;
        }
        i11 = i3 & 256;
        if (i11 != 0) {
            if ((i & 100663296) == 0) {
                if (dVarF.B(f2)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i4 |= i12;
            }
            i13 = i3 & 512;
            if (i13 != 0) {
                if ((i & 805306368) == 0) {
                    if (dVarF.x(borderStroke)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                if ((i3 & 1024) != 0) {
                    i15 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
                }
                if ((i3 & 2048) != 0) {
                    if ((i2 & 48) == 0) {
                        if (dVarF.x(this)) {
                            i17 = 32;
                        } else {
                            i17 = 16;
                        }
                        i15 |= i17;
                    }
                    i18 = i15;
                    if ((i4 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        } else {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i3 & 8) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -7169;
                            } else {
                                v9bVarD = v9bVar2;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -458753;
                            } else {
                                xkbVarE = xkbVar;
                            }
                            if ((i3 & 64) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -3670017;
                            }
                            if (i9 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i11 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i13 != 0) {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                                borderStroke = null;
                            } else {
                                bVar5 = bVar4;
                                f6 = f5;
                                j2 = jA;
                                xkbVar3 = xkbVarE;
                                v9bVar4 = v9bVarD;
                                f7 = fD;
                                z6 = z3;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = p0.i(Unit.a, p0.k());
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                        if (z) {
                            dVarF.y(629991660);
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = new Function0() { // from class: com.google.android.u04
                                    public final Object invoke() {
                                        return g0.e(o58Var);
                                    }
                                };
                                dVarF.L(objR5);
                            }
                            i0.d((Function0) objR5, dVarF, 6);
                            dVarF.u();
                        } else {
                            dVarF.y(630077189);
                            dVarF.u();
                        }
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new e(Boolean.FALSE);
                            dVarF.L(objR2);
                        }
                        eVar = (e) objR2;
                        eVar.i(Boolean.valueOf(z));
                        if (((Boolean) eVar.a()).booleanValue()) {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(630396489);
                            objR3 = dVarF.R();
                            if (objR3 == companion.a()) {
                                objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR3);
                            }
                            o58Var2 = (o58) objR3;
                            zX = dVarF.x(f43Var) | dVarF.C(iA);
                            objR4 = dVarF.R();
                            if (zX) {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            } else {
                                objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                    }
                                }, 8, null);
                                dVarF.L(objR4);
                            }
                            AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z5 = z6;
                        v9bVar3 = v9bVar4;
                        xkbVar2 = xkbVar3;
                        jA = j2;
                        f3 = f6;
                        f4 = f7;
                        borderStroke2 = borderStroke;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        xkbVar2 = xkbVar;
                        f3 = f;
                        bVar3 = bVar2;
                        v9bVar3 = v9bVar2;
                        z5 = z3;
                        f4 = f2;
                        borderStroke2 = borderStroke;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.w04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 |= 48;
                i18 = i15;
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = p0.i(Unit.a, p0.k());
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                    if (z) {
                        dVarF.y(629991660);
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = new Function0() { // from class: com.google.android.u04
                                public final Object invoke() {
                                    return g0.e(o58Var);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        i0.d((Function0) objR5, dVarF, 6);
                        dVarF.u();
                    } else {
                        dVarF.y(630077189);
                        dVarF.u();
                    }
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new e(Boolean.FALSE);
                        dVarF.L(objR2);
                    }
                    eVar = (e) objR2;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar5;
                    z5 = z6;
                    v9bVar3 = v9bVar4;
                    xkbVar2 = xkbVar3;
                    jA = j2;
                    f3 = f6;
                    f4 = f7;
                    borderStroke2 = borderStroke;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    xkbVar2 = xkbVar;
                    f3 = f;
                    bVar3 = bVar2;
                    v9bVar3 = v9bVar2;
                    z5 = z3;
                    f4 = f2;
                    borderStroke2 = borderStroke;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.w04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 805306368;
            if ((i3 & 1024) != 0) {
                i15 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.T(ps4Var)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i15 = i2 | i16;
            } else {
                i15 = i2;
            }
            if ((i3 & 2048) != 0) {
                if ((i2 & 48) == 0) {
                    if (dVarF.x(this)) {
                        i17 = 32;
                    } else {
                        i17 = 16;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = p0.i(Unit.a, p0.k());
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                    if (z) {
                        dVarF.y(629991660);
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = new Function0() { // from class: com.google.android.u04
                                public final Object invoke() {
                                    return g0.e(o58Var);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        i0.d((Function0) objR5, dVarF, 6);
                        dVarF.u();
                    } else {
                        dVarF.y(630077189);
                        dVarF.u();
                    }
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new e(Boolean.FALSE);
                        dVarF.L(objR2);
                    }
                    eVar = (e) objR2;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar5;
                    z5 = z6;
                    v9bVar3 = v9bVar4;
                    xkbVar2 = xkbVar3;
                    jA = j2;
                    f3 = f6;
                    f4 = f7;
                    borderStroke2 = borderStroke;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    xkbVar2 = xkbVar;
                    f3 = f;
                    bVar3 = bVar2;
                    v9bVar3 = v9bVar2;
                    z5 = z3;
                    f4 = f2;
                    borderStroke2 = borderStroke;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.w04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 48;
            i18 = i15;
            if ((i4 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (dVarF.g(z4, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 8) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -7169;
                    } else {
                        v9bVarD = v9bVar2;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -458753;
                    } else {
                        xkbVarE = xkbVar;
                    }
                    if ((i3 & 64) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -3670017;
                    }
                    if (i9 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i11 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i13 != 0) {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                        borderStroke = null;
                    } else {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                    }
                } else {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 8) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -7169;
                    } else {
                        v9bVarD = v9bVar2;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -458753;
                    } else {
                        xkbVarE = xkbVar;
                    }
                    if ((i3 & 64) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -3670017;
                    }
                    if (i9 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i11 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i13 != 0) {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                        borderStroke = null;
                    } else {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = p0.i(Unit.a, p0.k());
                    dVarF.L(objR);
                }
                o58Var = (o58) objR;
                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                if (z) {
                    dVarF.y(629991660);
                    objR5 = dVarF.R();
                    if (objR5 == companion.a()) {
                        objR5 = new Function0() { // from class: com.google.android.u04
                            public final Object invoke() {
                                return g0.e(o58Var);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    i0.d((Function0) objR5, dVarF, 6);
                    dVarF.u();
                } else {
                    dVarF.y(630077189);
                    dVarF.u();
                }
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = new e(Boolean.FALSE);
                    dVarF.L(objR2);
                }
                eVar = (e) objR2;
                eVar.i(Boolean.valueOf(z));
                if (((Boolean) eVar.a()).booleanValue()) {
                    dVarF.y(630396489);
                    objR3 = dVarF.R();
                    if (objR3 == companion.a()) {
                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR3);
                    }
                    o58Var2 = (o58) objR3;
                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    }
                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                    dVar2 = dVarF;
                    dVar2.u();
                } else {
                    dVarF.y(630396489);
                    objR3 = dVarF.R();
                    if (objR3 == companion.a()) {
                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR3);
                    }
                    o58Var2 = (o58) objR3;
                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    }
                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                    dVar2 = dVarF;
                    dVar2.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar5;
                z5 = z6;
                v9bVar3 = v9bVar4;
                xkbVar2 = xkbVar3;
                jA = j2;
                f3 = f6;
                f4 = f7;
                borderStroke2 = borderStroke;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                xkbVar2 = xkbVar;
                f3 = f;
                bVar3 = bVar2;
                v9bVar3 = v9bVar2;
                z5 = z3;
                f4 = f2;
                borderStroke2 = borderStroke;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.w04
                    public final Object invoke(Object obj, Object obj2) {
                        return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 100663296;
        i13 = i3 & 512;
        if (i13 != 0) {
            if ((i & 805306368) == 0) {
                if (dVarF.x(borderStroke)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i4 |= i14;
            }
            if ((i3 & 1024) != 0) {
                i15 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.T(ps4Var)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i15 = i2 | i16;
            } else {
                i15 = i2;
            }
            if ((i3 & 2048) != 0) {
                if ((i2 & 48) == 0) {
                    if (dVarF.x(this)) {
                        i17 = 32;
                    } else {
                        i17 = 16;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i4 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 8) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -7169;
                        } else {
                            v9bVarD = v9bVar2;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -458753;
                        } else {
                            xkbVarE = xkbVar;
                        }
                        if ((i3 & 64) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i11 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i13 != 0) {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                            borderStroke = null;
                        } else {
                            bVar5 = bVar4;
                            f6 = f5;
                            j2 = jA;
                            xkbVar3 = xkbVarE;
                            v9bVar4 = v9bVarD;
                            f7 = fD;
                            z6 = z3;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = p0.i(Unit.a, p0.k());
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                    if (z) {
                        dVarF.y(629991660);
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = new Function0() { // from class: com.google.android.u04
                                public final Object invoke() {
                                    return g0.e(o58Var);
                                }
                            };
                            dVarF.L(objR5);
                        }
                        i0.d((Function0) objR5, dVarF, 6);
                        dVarF.u();
                    } else {
                        dVarF.y(630077189);
                        dVarF.u();
                    }
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new e(Boolean.FALSE);
                        dVarF.L(objR2);
                    }
                    eVar = (e) objR2;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(630396489);
                        objR3 = dVarF.R();
                        if (objR3 == companion.a()) {
                            objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR3);
                        }
                        o58Var2 = (o58) objR3;
                        zX = dVarF.x(f43Var) | dVarF.C(iA);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        } else {
                            objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                                public final Object invoke(Object obj, Object obj2) {
                                    return g0.f(o58Var2, (k16) obj, (k16) obj2);
                                }
                            }, 8, null);
                            dVarF.L(objR4);
                        }
                        AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar5;
                    z5 = z6;
                    v9bVar3 = v9bVar4;
                    xkbVar2 = xkbVar3;
                    jA = j2;
                    f3 = f6;
                    f4 = f7;
                    borderStroke2 = borderStroke;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    xkbVar2 = xkbVar;
                    f3 = f;
                    bVar3 = bVar2;
                    v9bVar3 = v9bVar2;
                    z5 = z3;
                    f4 = f2;
                    borderStroke2 = borderStroke;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.w04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 48;
            i18 = i15;
            if ((i4 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (dVarF.g(z4, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 8) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -7169;
                    } else {
                        v9bVarD = v9bVar2;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -458753;
                    } else {
                        xkbVarE = xkbVar;
                    }
                    if ((i3 & 64) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -3670017;
                    }
                    if (i9 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i11 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i13 != 0) {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                        borderStroke = null;
                    } else {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                    }
                } else {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 8) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -7169;
                    } else {
                        v9bVarD = v9bVar2;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -458753;
                    } else {
                        xkbVarE = xkbVar;
                    }
                    if ((i3 & 64) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -3670017;
                    }
                    if (i9 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i11 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i13 != 0) {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                        borderStroke = null;
                    } else {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = p0.i(Unit.a, p0.k());
                    dVarF.L(objR);
                }
                o58Var = (o58) objR;
                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                if (z) {
                    dVarF.y(629991660);
                    objR5 = dVarF.R();
                    if (objR5 == companion.a()) {
                        objR5 = new Function0() { // from class: com.google.android.u04
                            public final Object invoke() {
                                return g0.e(o58Var);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    i0.d((Function0) objR5, dVarF, 6);
                    dVarF.u();
                } else {
                    dVarF.y(630077189);
                    dVarF.u();
                }
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = new e(Boolean.FALSE);
                    dVarF.L(objR2);
                }
                eVar = (e) objR2;
                eVar.i(Boolean.valueOf(z));
                if (((Boolean) eVar.a()).booleanValue()) {
                    dVarF.y(630396489);
                    objR3 = dVarF.R();
                    if (objR3 == companion.a()) {
                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR3);
                    }
                    o58Var2 = (o58) objR3;
                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    }
                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                    dVar2 = dVarF;
                    dVar2.u();
                } else {
                    dVarF.y(630396489);
                    objR3 = dVarF.R();
                    if (objR3 == companion.a()) {
                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR3);
                    }
                    o58Var2 = (o58) objR3;
                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    }
                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                    dVar2 = dVarF;
                    dVar2.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar5;
                z5 = z6;
                v9bVar3 = v9bVar4;
                xkbVar2 = xkbVar3;
                jA = j2;
                f3 = f6;
                f4 = f7;
                borderStroke2 = borderStroke;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                xkbVar2 = xkbVar;
                f3 = f;
                bVar3 = bVar2;
                v9bVar3 = v9bVar2;
                z5 = z3;
                f4 = f2;
                borderStroke2 = borderStroke;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.w04
                    public final Object invoke(Object obj, Object obj2) {
                        return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 805306368;
        if ((i3 & 1024) != 0) {
            i15 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (dVarF.T(ps4Var)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i2 | i16;
        } else {
            i15 = i2;
        }
        if ((i3 & 2048) != 0) {
            if ((i2 & 48) == 0) {
                if (dVarF.x(this)) {
                    i17 = 32;
                } else {
                    i17 = 16;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i4 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (dVarF.g(z4, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 8) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -7169;
                    } else {
                        v9bVarD = v9bVar2;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -458753;
                    } else {
                        xkbVarE = xkbVar;
                    }
                    if ((i3 & 64) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -3670017;
                    }
                    if (i9 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i11 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i13 != 0) {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                        borderStroke = null;
                    } else {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                    }
                } else {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 8) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -7169;
                    } else {
                        v9bVarD = v9bVar2;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -458753;
                    } else {
                        xkbVarE = xkbVar;
                    }
                    if ((i3 & 64) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -3670017;
                    }
                    if (i9 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i11 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i13 != 0) {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                        borderStroke = null;
                    } else {
                        bVar5 = bVar4;
                        f6 = f5;
                        j2 = jA;
                        xkbVar3 = xkbVarE;
                        v9bVar4 = v9bVarD;
                        f7 = fD;
                        z6 = z3;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = p0.i(Unit.a, p0.k());
                    dVarF.L(objR);
                }
                o58Var = (o58) objR;
                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
                if (z) {
                    dVarF.y(629991660);
                    objR5 = dVarF.R();
                    if (objR5 == companion.a()) {
                        objR5 = new Function0() { // from class: com.google.android.u04
                            public final Object invoke() {
                                return g0.e(o58Var);
                            }
                        };
                        dVarF.L(objR5);
                    }
                    i0.d((Function0) objR5, dVarF, 6);
                    dVarF.u();
                } else {
                    dVarF.y(630077189);
                    dVarF.u();
                }
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = new e(Boolean.FALSE);
                    dVarF.L(objR2);
                }
                eVar = (e) objR2;
                eVar.i(Boolean.valueOf(z));
                if (((Boolean) eVar.a()).booleanValue()) {
                    dVarF.y(630396489);
                    objR3 = dVarF.R();
                    if (objR3 == companion.a()) {
                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR3);
                    }
                    o58Var2 = (o58) objR3;
                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    }
                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                    dVar2 = dVarF;
                    dVar2.u();
                } else {
                    dVarF.y(630396489);
                    objR3 = dVarF.R();
                    if (objR3 == companion.a()) {
                        objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR3);
                    }
                    o58Var2 = (o58) objR3;
                    zX = dVarF.x(f43Var) | dVarF.C(iA);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    } else {
                        objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.f(o58Var2, (k16) obj, (k16) obj2);
                            }
                        }, 8, null);
                        dVarF.L(objR4);
                    }
                    AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                    dVar2 = dVarF;
                    dVar2.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar5;
                z5 = z6;
                v9bVar3 = v9bVar4;
                xkbVar2 = xkbVar3;
                jA = j2;
                f3 = f6;
                f4 = f7;
                borderStroke2 = borderStroke;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                xkbVar2 = xkbVar;
                f3 = f;
                bVar3 = bVar2;
                v9bVar3 = v9bVar2;
                z5 = z3;
                f4 = f2;
                borderStroke2 = borderStroke;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.w04
                    public final Object invoke(Object obj, Object obj2) {
                        return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        i18 = i15;
        if ((i4 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (dVarF.g(z4, i4 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i3 & 8) != 0) {
                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                    i4 &= -7169;
                } else {
                    v9bVarD = v9bVar2;
                }
                if (i7 != 0) {
                    z3 = true;
                }
                if ((i3 & 32) != 0) {
                    xkbVarE = eq7.a.e(dVarF, 6);
                    i4 &= -458753;
                } else {
                    xkbVarE = xkbVar;
                }
                if ((i3 & 64) != 0) {
                    jA = eq7.a.a(dVarF, 6);
                    i4 &= -3670017;
                }
                if (i9 != 0) {
                    f5 = eq7.a.f();
                } else {
                    f5 = f;
                }
                if (i11 != 0) {
                    fD = eq7.a.d();
                } else {
                    fD = f2;
                }
                if (i13 != 0) {
                    bVar5 = bVar4;
                    f6 = f5;
                    j2 = jA;
                    xkbVar3 = xkbVarE;
                    v9bVar4 = v9bVarD;
                    f7 = fD;
                    z6 = z3;
                    borderStroke = null;
                } else {
                    bVar5 = bVar4;
                    f6 = f5;
                    j2 = jA;
                    xkbVar3 = xkbVarE;
                    v9bVar4 = v9bVarD;
                    f7 = fD;
                    z6 = z3;
                }
            } else {
                if (i5 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i3 & 8) != 0) {
                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                    i4 &= -7169;
                } else {
                    v9bVarD = v9bVar2;
                }
                if (i7 != 0) {
                    z3 = true;
                }
                if ((i3 & 32) != 0) {
                    xkbVarE = eq7.a.e(dVarF, 6);
                    i4 &= -458753;
                } else {
                    xkbVarE = xkbVar;
                }
                if ((i3 & 64) != 0) {
                    jA = eq7.a.a(dVarF, 6);
                    i4 &= -3670017;
                }
                if (i9 != 0) {
                    f5 = eq7.a.f();
                } else {
                    f5 = f;
                }
                if (i11 != 0) {
                    fD = eq7.a.d();
                } else {
                    fD = f2;
                }
                if (i13 != 0) {
                    bVar5 = bVar4;
                    f6 = f5;
                    j2 = jA;
                    xkbVar3 = xkbVarE;
                    v9bVar4 = v9bVarD;
                    f7 = fD;
                    z6 = z3;
                    borderStroke = null;
                } else {
                    bVar5 = bVar4;
                    f6 = f5;
                    j2 = jA;
                    xkbVar3 = xkbVarE;
                    v9bVar4 = v9bVarD;
                    f7 = fD;
                    z6 = z3;
                }
            }
            dVarF.M();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-126848451, i4, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
            }
            objR = dVarF.R();
            companion = d.INSTANCE;
            if (objR == companion.a()) {
                objR = p0.i(Unit.a, p0.k());
                dVarF.L(objR);
            }
            o58Var = (o58) objR;
            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
            iA = i1.i(g1.INSTANCE, dVarF, 6).a(f43Var);
            if (z) {
                dVarF.y(629991660);
                objR5 = dVarF.R();
                if (objR5 == companion.a()) {
                    objR5 = new Function0() { // from class: com.google.android.u04
                        public final Object invoke() {
                            return g0.e(o58Var);
                        }
                    };
                    dVarF.L(objR5);
                }
                i0.d((Function0) objR5, dVarF, 6);
                dVarF.u();
            } else {
                dVarF.y(630077189);
                dVarF.u();
            }
            objR2 = dVarF.R();
            if (objR2 == companion.a()) {
                objR2 = new e(Boolean.FALSE);
                dVarF.L(objR2);
            }
            eVar = (e) objR2;
            eVar.i(Boolean.valueOf(z));
            if (((Boolean) eVar.a()).booleanValue()) {
                dVarF.y(630396489);
                objR3 = dVarF.R();
                if (objR3 == companion.a()) {
                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                    dVarF.L(objR3);
                }
                o58Var2 = (o58) objR3;
                zX = dVarF.x(f43Var) | dVarF.C(iA);
                objR4 = dVarF.R();
                if (zX) {
                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                        }
                    }, 8, null);
                    dVarF.L(objR4);
                } else {
                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                        }
                    }, 8, null);
                    dVarF.L(objR4);
                }
                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                dVar2 = dVarF;
                dVar2.u();
            } else {
                dVarF.y(630396489);
                objR3 = dVarF.R();
                if (objR3 == companion.a()) {
                    objR3 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                    dVarF.L(objR3);
                }
                o58Var2 = (o58) objR3;
                zX = dVarF.x(f43Var) | dVarF.C(iA);
                objR4 = dVarF.R();
                if (zX) {
                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                        }
                    }, 8, null);
                    dVarF.L(objR4);
                } else {
                    objR4 = new j14(f43Var, iA, o58Var, 0, new Function2() { // from class: com.google.android.v04
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.f(o58Var2, (k16) obj, (k16) obj2);
                        }
                    }, 8, null);
                    dVarF.L(objR4);
                }
                AndroidPopup_androidKt.a((j14) objR4, function1, i0.l(j(), i(), dVarF, 0), ko1.e(2063119149, true, new a(bVar5, z6, eVar, o58Var2, v9bVar4, xkbVar3, j2, f6, f7, borderStroke, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072, 0);
                dVar2 = dVarF;
                dVar2.u();
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            bVar3 = bVar5;
            z5 = z6;
            v9bVar3 = v9bVar4;
            xkbVar2 = xkbVar3;
            jA = j2;
            f3 = f6;
            f4 = f7;
            borderStroke2 = borderStroke;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            xkbVar2 = xkbVar;
            f3 = f;
            bVar3 = bVar2;
            v9bVar3 = v9bVar2;
            z5 = z3;
            f4 = f2;
            borderStroke2 = borderStroke;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.w04
                public final Object invoke(Object obj, Object obj2) {
                    return g0.g(this.a, z, function0, bVar3, v9bVar3, z5, xkbVar2, jA, f3, f4, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public abstract b h(b bVar, boolean z);

    public abstract boolean i();

    public abstract String j();

    public abstract b k(b bVar, String str, boolean z);

    private g0() {
    }
}
