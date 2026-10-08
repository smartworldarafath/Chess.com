package com.google.inputmethod;

import androidx.compose.p000animation.core.e;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0095\u0001\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0083\u0001\u0010&\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b&\u0010'\"\u001a\u0010,\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"", "expanded", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/if3;", "offset", "Lcom/google/android/v9b;", "scrollState", "Lcom/google/android/sg9;", "properties", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/ei1;", "containerColor", "Lcom/google/android/ff3;", "tonalElevation", "shadowElevation", "Lcom/google/android/or0;", "border", "Lkotlin/Function1;", "Lcom/google/android/xj1;", "content", "d", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;JLcom/google/android/v9b;Lcom/google/android/sg9;Lcom/google/android/xkb;JFFLcom/google/android/or0;Lcom/google/android/ps4;Landroidx/compose/runtime/d;III)V", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "Lcom/google/android/jq7;", "colors", "Lcom/google/android/rx8;", "contentPadding", "Lcom/google/android/r48;", "interactionSource", "e", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLcom/google/android/jq7;Lcom/google/android/rx8;Lcom/google/android/r48;Landroidx/compose/runtime/d;II)V", "a", "Lcom/google/android/sg9;", "getDefaultMenuProperties", "()Lcom/google/android/sg9;", "DefaultMenuProperties", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class am {
    private static final sg9 a = new sg9(true, false, false, false, 14, (DefaultConstructorMarker) null);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<d, Integer, Unit> {
        final /* synthetic */ b a;
        final /* synthetic */ e<Boolean> b;
        final /* synthetic */ o58<t> c;
        final /* synthetic */ v9b d;
        final /* synthetic */ xkb e;
        final /* synthetic */ long f;
        final /* synthetic */ float g;
        final /* synthetic */ float h;
        final /* synthetic */ BorderStroke i;
        final /* synthetic */ ps4<xj1, d, Integer, Unit> j;

        /* JADX WARN: Multi-variable type inference failed */
        a(b bVar, e<Boolean> eVar, o58<t> o58Var, v9b v9bVar, xkb xkbVar, long j, float f, float f2, BorderStroke borderStroke, ps4<? super xj1, ? super d, ? super Integer, Unit> ps4Var) {
            this.a = bVar;
            this.b = eVar;
            this.c = o58Var;
            this.d = v9bVar;
            this.e = xkbVar;
            this.f = j;
            this.g = f;
            this.h = f2;
            this.i = borderStroke;
            this.j = ps4Var;
        }

        public final void a(d dVar, int i) throws Throwable {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-917492520, i, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:73)");
            }
            qq7.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, dVar, (e.d << 3) | 384);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            a((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:100:0x011d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0121  */
    /* JADX WARN: Code duplicated, block: B:104:0x012b  */
    /* JADX WARN: Code duplicated, block: B:105:0x012e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0136  */
    /* JADX WARN: Code duplicated, block: B:110:0x013d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0141  */
    /* JADX WARN: Code duplicated, block: B:114:0x014b  */
    /* JADX WARN: Code duplicated, block: B:115:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0153  */
    /* JADX WARN: Code duplicated, block: B:120:0x015d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0162  */
    /* JADX WARN: Code duplicated, block: B:124:0x0166  */
    /* JADX WARN: Code duplicated, block: B:126:0x016e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0171  */
    /* JADX WARN: Code duplicated, block: B:129:0x0176  */
    /* JADX WARN: Code duplicated, block: B:132:0x0186  */
    /* JADX WARN: Code duplicated, block: B:136:0x018f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0198  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:158:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:161:0x0202  */
    /* JADX WARN: Code duplicated, block: B:162:0x020a  */
    /* JADX WARN: Code duplicated, block: B:164:0x020f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0217  */
    /* JADX WARN: Code duplicated, block: B:168:0x0220  */
    /* JADX WARN: Code duplicated, block: B:171:0x0225  */
    /* JADX WARN: Code duplicated, block: B:172:0x0230  */
    /* JADX WARN: Code duplicated, block: B:174:0x0234  */
    /* JADX WARN: Code duplicated, block: B:175:0x023b  */
    /* JADX WARN: Code duplicated, block: B:177:0x023f  */
    /* JADX WARN: Code duplicated, block: B:178:0x0246  */
    /* JADX WARN: Code duplicated, block: B:180:0x024a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0259  */
    /* JADX WARN: Code duplicated, block: B:185:0x0265  */
    /* JADX WARN: Code duplicated, block: B:188:0x0279  */
    /* JADX WARN: Code duplicated, block: B:191:0x0298  */
    /* JADX WARN: Code duplicated, block: B:195:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:197:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:200:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:201:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:204:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:206:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:210:0x035b  */
    /* JADX WARN: Code duplicated, block: B:213:0x036f  */
    /* JADX WARN: Code duplicated, block: B:216:0x0387  */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    public static final void d(final boolean z, final Function0<Unit> function0, b bVar, long j, v9b v9bVar, sg9 sg9Var, xkb xkbVar, long j2, float f, float f2, BorderStroke borderStroke, final ps4<? super xj1, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i, final int i2, final int i3) throws NoWhenBranchMatchedException {
        int i4;
        Function0<Unit> function1;
        int i5;
        b bVar2;
        int i6;
        int i7;
        long jC;
        int i8;
        int i9;
        int i10;
        sg9 sg9Var2;
        int i11;
        xkb xkbVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z2;
        d dVar2;
        final v9b v9bVar2;
        final float f3;
        final long j3;
        final b bVar3;
        final xkb xkbVar3;
        final long j4;
        final float f4;
        final BorderStroke borderStroke2;
        final sg9 sg9Var3;
        s6b s6bVarH;
        b bVar4;
        v9b v9bVarD;
        xkb xkbVarE;
        long jA;
        float f5;
        float fD;
        BorderStroke borderStroke3;
        float f6;
        v9b v9bVar3;
        xkb xkbVar4;
        float f7;
        long j5;
        b bVar5;
        Object objR;
        d.Companion companion;
        e eVar;
        Object objR2;
        final o58 o58Var;
        f43 f43Var;
        boolean z3;
        boolean zX;
        Object objR3;
        int i21;
        int i22;
        d dVarF = dVar.F(1725609375);
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
                i7 = i3 & 8;
                if (i7 != 0) {
                    i4 |= 3072;
                    jC = j;
                    i8 = 32;
                } else {
                    jC = j;
                    i8 = 32;
                    if ((i & 3072) == 0) {
                        if (dVarF.D(jC)) {
                            i9 = 2048;
                        } else {
                            i9 = 1024;
                        }
                        i4 |= i9;
                    }
                }
                if ((i & 24576) != 0) {
                    i4 |= ((i3 & 16) == 0 || !dVarF.x(v9bVar)) ? 8192 : 16384;
                }
                i10 = i3 & 32;
                if (i10 != 0) {
                    i4 |= 196608;
                    sg9Var2 = sg9Var;
                } else {
                    sg9Var2 = sg9Var;
                    if ((i & 196608) == 0) {
                        if (dVarF.x(sg9Var2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    }
                }
                if ((i & 1572864) == 0) {
                    xkbVar2 = xkbVar;
                    if ((i3 & 64) == 0 || !dVarF.x(xkbVar2)) {
                        i22 = 524288;
                    } else {
                        i22 = 1048576;
                    }
                    i4 |= i22;
                } else {
                    xkbVar2 = xkbVar;
                }
                if ((i & 12582912) != 0) {
                    if ((i3 & 128) == 0 || !dVarF.D(j2)) {
                        i21 = 4194304;
                    } else {
                        i21 = 8388608;
                    }
                    i4 |= i21;
                }
                i12 = i3 & 256;
                if (i12 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.B(f)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i4 |= i13;
                }
                i14 = i3 & 512;
                if (i14 != 0) {
                    if ((i & 805306368) == 0) {
                        if (dVarF.B(f2)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i4 |= i15;
                    }
                    i16 = i3 & 1024;
                    if (i16 != 0) {
                        i17 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.x(borderStroke)) {
                            i18 = 4;
                        } else {
                            i18 = 2;
                        }
                        i17 = i2 | i18;
                    } else {
                        i17 = i2;
                    }
                    if ((i3 & 2048) != 0) {
                        i17 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (dVarF.T(ps4Var)) {
                            i19 = i8;
                        } else {
                            i19 = 16;
                        }
                        i17 |= i19;
                    }
                    i20 = i17;
                    if ((i4 & 306783379) == 306783378 || (i20 & 19) != 18) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dVarF.g(z2, i4 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0 || dVarF.t()) {
                            if (i5 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i7 != 0) {
                                float f8 = 0;
                                jC = if3.c((((long) Float.floatToRawIntBits(ff3.i(f8))) << i8) | (((long) Float.floatToRawIntBits(ff3.i(f8))) & 4294967295L));
                            }
                            if ((i3 & 16) != 0) {
                                v9bVarD = h9b.d(0, dVarF, 0, 1);
                                i4 &= -57345;
                            } else {
                                v9bVarD = v9bVar;
                            }
                            if (i10 != 0) {
                                sg9Var2 = a;
                            }
                            if ((i3 & 64) != 0) {
                                xkbVarE = eq7.a.e(dVarF, 6);
                                i4 &= -3670017;
                            } else {
                                xkbVarE = xkbVar2;
                            }
                            if ((i3 & 128) != 0) {
                                jA = eq7.a.a(dVarF, 6);
                                i4 &= -29360129;
                            } else {
                                jA = j2;
                            }
                            if (i12 != 0) {
                                f5 = eq7.a.f();
                            } else {
                                f5 = f;
                            }
                            if (i14 != 0) {
                                fD = eq7.a.d();
                            } else {
                                fD = f2;
                            }
                            if (i16 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            f6 = f5;
                            v9bVar3 = v9bVarD;
                            xkbVar4 = xkbVarE;
                            f7 = fD;
                            j5 = jA;
                            bVar5 = bVar4;
                        } else {
                            dVarF.q();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            v9bVar3 = v9bVar;
                            j5 = j2;
                            f6 = f;
                            f7 = f2;
                            borderStroke3 = borderStroke;
                            bVar5 = bVar2;
                            xkbVar4 = xkbVar2;
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(1725609375, i4, i20, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:54)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = new e(Boolean.FALSE);
                            dVarF.L(objR);
                        }
                        eVar = (e) objR;
                        eVar.i(Boolean.valueOf(z));
                        if (!((Boolean) eVar.a()).booleanValue() || ((Boolean) eVar.b()).booleanValue()) {
                            dVarF.y(1165905588);
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                                dVarF.L(objR2);
                            }
                            o58Var = (o58) objR2;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            if ((i4 & 7168) == 2048) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            zX = z3 | dVarF.x(f43Var);
                            objR3 = dVarF.R();
                            if (zX || objR3 == companion.a()) {
                                objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                                    public final Object invoke(Object obj, Object obj2) {
                                        return am.g(o58Var, (k16) obj, (k16) obj2);
                                    }
                                }, 4, null);
                                dVarF.L(objR3);
                            }
                            AndroidPopup_androidKt.a((DropdownMenuPositionProvider) objR3, function1, sg9Var2, ko1.e(-917492520, true, new a(bVar5, eVar, o58Var, v9bVar3, xkbVar4, j5, f6, f7, borderStroke3, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            dVar2 = dVarF;
                            dVar2.u();
                        } else {
                            dVarF.y(1166965571);
                            dVarF.u();
                            dVar2 = dVarF;
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        j3 = jC;
                        bVar3 = bVar5;
                        v9bVar2 = v9bVar3;
                        xkbVar3 = xkbVar4;
                        j4 = j5;
                        f4 = f6;
                        f3 = f7;
                        borderStroke2 = borderStroke3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        v9bVar2 = v9bVar;
                        f3 = f2;
                        j3 = jC;
                        bVar3 = bVar2;
                        xkbVar3 = xkbVar2;
                        j4 = j2;
                        f4 = f;
                        borderStroke2 = borderStroke;
                    }
                    sg9Var3 = sg9Var2;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.yl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.h(z, function0, bVar3, j3, v9bVar2, sg9Var3, xkbVar3, j4, f4, f3, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                i16 = i3 & 1024;
                if (i16 != 0) {
                    i17 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.x(borderStroke)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i17 = i2 | i18;
                } else {
                    i17 = i2;
                }
                if ((i3 & 2048) != 0) {
                    i17 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (dVarF.T(ps4Var)) {
                        i19 = i8;
                    } else {
                        i19 = 16;
                    }
                    i17 |= i19;
                }
                i20 = i17;
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (dVarF.g(z2, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i7 != 0) {
                            float f9 = 0;
                            jC = if3.c((((long) Float.floatToRawIntBits(ff3.i(f9))) << i8) | (((long) Float.floatToRawIntBits(ff3.i(f9))) & 4294967295L));
                        }
                        if ((i3 & 16) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -57345;
                        } else {
                            v9bVarD = v9bVar;
                        }
                        if (i10 != 0) {
                            sg9Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -3670017;
                        } else {
                            xkbVarE = xkbVar2;
                        }
                        if ((i3 & 128) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            jA = j2;
                        }
                        if (i12 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i14 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i16 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        f6 = f5;
                        v9bVar3 = v9bVarD;
                        xkbVar4 = xkbVarE;
                        f7 = fD;
                        j5 = jA;
                        bVar5 = bVar4;
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i7 != 0) {
                            float f10 = 0;
                            jC = if3.c((((long) Float.floatToRawIntBits(ff3.i(f10))) << i8) | (((long) Float.floatToRawIntBits(ff3.i(f10))) & 4294967295L));
                        }
                        if ((i3 & 16) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -57345;
                        } else {
                            v9bVarD = v9bVar;
                        }
                        if (i10 != 0) {
                            sg9Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -3670017;
                        } else {
                            xkbVarE = xkbVar2;
                        }
                        if ((i3 & 128) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            jA = j2;
                        }
                        if (i12 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i14 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i16 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        f6 = f5;
                        v9bVar3 = v9bVarD;
                        xkbVar4 = xkbVarE;
                        f7 = fD;
                        j5 = jA;
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1725609375, i4, i20, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:54)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = new e(Boolean.FALSE);
                        dVarF.L(objR);
                    }
                    eVar = (e) objR;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(1165905588);
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR2);
                        }
                        o58Var = (o58) objR2;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        if ((i4 & 7168) == 2048) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zX = z3 | dVarF.x(f43Var);
                        objR3 = dVarF.R();
                        if (zX) {
                            objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.g(o58Var, (k16) obj, (k16) obj2);
                                }
                            }, 4, null);
                            dVarF.L(objR3);
                        } else {
                            objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.g(o58Var, (k16) obj, (k16) obj2);
                                }
                            }, 4, null);
                            dVarF.L(objR3);
                        }
                        AndroidPopup_androidKt.a((DropdownMenuPositionProvider) objR3, function1, sg9Var2, ko1.e(-917492520, true, new a(bVar5, eVar, o58Var, v9bVar3, xkbVar4, j5, f6, f7, borderStroke3, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(1165905588);
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR2);
                        }
                        o58Var = (o58) objR2;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        if ((i4 & 7168) == 2048) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zX = z3 | dVarF.x(f43Var);
                        objR3 = dVarF.R();
                        if (zX) {
                            objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.g(o58Var, (k16) obj, (k16) obj2);
                                }
                            }, 4, null);
                            dVarF.L(objR3);
                        } else {
                            objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.g(o58Var, (k16) obj, (k16) obj2);
                                }
                            }, 4, null);
                            dVarF.L(objR3);
                        }
                        AndroidPopup_androidKt.a((DropdownMenuPositionProvider) objR3, function1, sg9Var2, ko1.e(-917492520, true, new a(bVar5, eVar, o58Var, v9bVar3, xkbVar4, j5, f6, f7, borderStroke3, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    j3 = jC;
                    bVar3 = bVar5;
                    v9bVar2 = v9bVar3;
                    xkbVar3 = xkbVar4;
                    j4 = j5;
                    f4 = f6;
                    f3 = f7;
                    borderStroke2 = borderStroke3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    v9bVar2 = v9bVar;
                    f3 = f2;
                    j3 = jC;
                    bVar3 = bVar2;
                    xkbVar3 = xkbVar2;
                    j4 = j2;
                    f4 = f;
                    borderStroke2 = borderStroke;
                }
                sg9Var3 = sg9Var2;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.yl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.h(z, function0, bVar3, j3, v9bVar2, sg9Var3, xkbVar3, j4, f4, f3, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 384;
            bVar2 = bVar;
            i7 = i3 & 8;
            if (i7 != 0) {
                i4 |= 3072;
                jC = j;
                i8 = 32;
            } else {
                jC = j;
                i8 = 32;
                if ((i & 3072) == 0) {
                    if (dVarF.D(jC)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i4 |= i9;
                }
            }
            if ((i & 24576) != 0) {
                i4 |= ((i3 & 16) == 0 || !dVarF.x(v9bVar)) ? 8192 : 16384;
            }
            i10 = i3 & 32;
            if (i10 != 0) {
                i4 |= 196608;
                sg9Var2 = sg9Var;
            } else {
                sg9Var2 = sg9Var;
                if ((i & 196608) == 0) {
                    if (dVarF.x(sg9Var2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                }
            }
            if ((i & 1572864) == 0) {
                xkbVar2 = xkbVar;
                if ((i3 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i4 |= i22;
            } else {
                xkbVar2 = xkbVar;
            }
            if ((i & 12582912) != 0) {
                if ((i3 & 128) == 0) {
                    i21 = 4194304;
                } else {
                    i21 = 4194304;
                }
                i4 |= i21;
            }
            i12 = i3 & 256;
            if (i12 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.B(f)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i4 |= i13;
            }
            i14 = i3 & 512;
            if (i14 != 0) {
                if ((i & 805306368) == 0) {
                    if (dVarF.B(f2)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i4 |= i15;
                }
                i16 = i3 & 1024;
                if (i16 != 0) {
                    i17 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.x(borderStroke)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i17 = i2 | i18;
                } else {
                    i17 = i2;
                }
                if ((i3 & 2048) != 0) {
                    i17 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (dVarF.T(ps4Var)) {
                        i19 = i8;
                    } else {
                        i19 = 16;
                    }
                    i17 |= i19;
                }
                i20 = i17;
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (dVarF.g(z2, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i7 != 0) {
                            float f11 = 0;
                            jC = if3.c((((long) Float.floatToRawIntBits(ff3.i(f11))) << i8) | (((long) Float.floatToRawIntBits(ff3.i(f11))) & 4294967295L));
                        }
                        if ((i3 & 16) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -57345;
                        } else {
                            v9bVarD = v9bVar;
                        }
                        if (i10 != 0) {
                            sg9Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -3670017;
                        } else {
                            xkbVarE = xkbVar2;
                        }
                        if ((i3 & 128) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            jA = j2;
                        }
                        if (i12 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i14 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i16 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        f6 = f5;
                        v9bVar3 = v9bVarD;
                        xkbVar4 = xkbVarE;
                        f7 = fD;
                        j5 = jA;
                        bVar5 = bVar4;
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i7 != 0) {
                            float f12 = 0;
                            jC = if3.c((((long) Float.floatToRawIntBits(ff3.i(f12))) << i8) | (((long) Float.floatToRawIntBits(ff3.i(f12))) & 4294967295L));
                        }
                        if ((i3 & 16) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -57345;
                        } else {
                            v9bVarD = v9bVar;
                        }
                        if (i10 != 0) {
                            sg9Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -3670017;
                        } else {
                            xkbVarE = xkbVar2;
                        }
                        if ((i3 & 128) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            jA = j2;
                        }
                        if (i12 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i14 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i16 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        f6 = f5;
                        v9bVar3 = v9bVarD;
                        xkbVar4 = xkbVarE;
                        f7 = fD;
                        j5 = jA;
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1725609375, i4, i20, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:54)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = new e(Boolean.FALSE);
                        dVarF.L(objR);
                    }
                    eVar = (e) objR;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(1165905588);
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR2);
                        }
                        o58Var = (o58) objR2;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        if ((i4 & 7168) == 2048) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zX = z3 | dVarF.x(f43Var);
                        objR3 = dVarF.R();
                        if (zX) {
                            objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.g(o58Var, (k16) obj, (k16) obj2);
                                }
                            }, 4, null);
                            dVarF.L(objR3);
                        } else {
                            objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.g(o58Var, (k16) obj, (k16) obj2);
                                }
                            }, 4, null);
                            dVarF.L(objR3);
                        }
                        AndroidPopup_androidKt.a((DropdownMenuPositionProvider) objR3, function1, sg9Var2, ko1.e(-917492520, true, new a(bVar5, eVar, o58Var, v9bVar3, xkbVar4, j5, f6, f7, borderStroke3, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(1165905588);
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR2);
                        }
                        o58Var = (o58) objR2;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        if ((i4 & 7168) == 2048) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zX = z3 | dVarF.x(f43Var);
                        objR3 = dVarF.R();
                        if (zX) {
                            objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.g(o58Var, (k16) obj, (k16) obj2);
                                }
                            }, 4, null);
                            dVarF.L(objR3);
                        } else {
                            objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.g(o58Var, (k16) obj, (k16) obj2);
                                }
                            }, 4, null);
                            dVarF.L(objR3);
                        }
                        AndroidPopup_androidKt.a((DropdownMenuPositionProvider) objR3, function1, sg9Var2, ko1.e(-917492520, true, new a(bVar5, eVar, o58Var, v9bVar3, xkbVar4, j5, f6, f7, borderStroke3, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    j3 = jC;
                    bVar3 = bVar5;
                    v9bVar2 = v9bVar3;
                    xkbVar3 = xkbVar4;
                    j4 = j5;
                    f4 = f6;
                    f3 = f7;
                    borderStroke2 = borderStroke3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    v9bVar2 = v9bVar;
                    f3 = f2;
                    j3 = jC;
                    bVar3 = bVar2;
                    xkbVar3 = xkbVar2;
                    j4 = j2;
                    f4 = f;
                    borderStroke2 = borderStroke;
                }
                sg9Var3 = sg9Var2;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.yl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.h(z, function0, bVar3, j3, v9bVar2, sg9Var3, xkbVar3, j4, f4, f3, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 805306368;
            i16 = i3 & 1024;
            if (i16 != 0) {
                i17 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.x(borderStroke)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i17 = i2 | i18;
            } else {
                i17 = i2;
            }
            if ((i3 & 2048) != 0) {
                i17 |= 48;
            } else if ((i2 & 48) != 0) {
                if (dVarF.T(ps4Var)) {
                    i19 = i8;
                } else {
                    i19 = 16;
                }
                i17 |= i19;
            }
            i20 = i17;
            if ((i4 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (dVarF.g(z2, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i7 != 0) {
                        float f13 = 0;
                        jC = if3.c((((long) Float.floatToRawIntBits(ff3.i(f13))) << i8) | (((long) Float.floatToRawIntBits(ff3.i(f13))) & 4294967295L));
                    }
                    if ((i3 & 16) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -57345;
                    } else {
                        v9bVarD = v9bVar;
                    }
                    if (i10 != 0) {
                        sg9Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -3670017;
                    } else {
                        xkbVarE = xkbVar2;
                    }
                    if ((i3 & 128) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        jA = j2;
                    }
                    if (i12 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i14 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i16 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    f6 = f5;
                    v9bVar3 = v9bVarD;
                    xkbVar4 = xkbVarE;
                    f7 = fD;
                    j5 = jA;
                    bVar5 = bVar4;
                } else {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i7 != 0) {
                        float f14 = 0;
                        jC = if3.c((((long) Float.floatToRawIntBits(ff3.i(f14))) << i8) | (((long) Float.floatToRawIntBits(ff3.i(f14))) & 4294967295L));
                    }
                    if ((i3 & 16) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -57345;
                    } else {
                        v9bVarD = v9bVar;
                    }
                    if (i10 != 0) {
                        sg9Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -3670017;
                    } else {
                        xkbVarE = xkbVar2;
                    }
                    if ((i3 & 128) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        jA = j2;
                    }
                    if (i12 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i14 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i16 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    f6 = f5;
                    v9bVar3 = v9bVarD;
                    xkbVar4 = xkbVarE;
                    f7 = fD;
                    j5 = jA;
                    bVar5 = bVar4;
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1725609375, i4, i20, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:54)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = new e(Boolean.FALSE);
                    dVarF.L(objR);
                }
                eVar = (e) objR;
                eVar.i(Boolean.valueOf(z));
                if (((Boolean) eVar.a()).booleanValue()) {
                    dVarF.y(1165905588);
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR2);
                    }
                    o58Var = (o58) objR2;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    if ((i4 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zX = z3 | dVarF.x(f43Var);
                    objR3 = dVarF.R();
                    if (zX) {
                        objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.g(o58Var, (k16) obj, (k16) obj2);
                            }
                        }, 4, null);
                        dVarF.L(objR3);
                    } else {
                        objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.g(o58Var, (k16) obj, (k16) obj2);
                            }
                        }, 4, null);
                        dVarF.L(objR3);
                    }
                    AndroidPopup_androidKt.a((DropdownMenuPositionProvider) objR3, function1, sg9Var2, ko1.e(-917492520, true, new a(bVar5, eVar, o58Var, v9bVar3, xkbVar4, j5, f6, f7, borderStroke3, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    dVar2 = dVarF;
                    dVar2.u();
                } else {
                    dVarF.y(1165905588);
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR2);
                    }
                    o58Var = (o58) objR2;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    if ((i4 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zX = z3 | dVarF.x(f43Var);
                    objR3 = dVarF.R();
                    if (zX) {
                        objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.g(o58Var, (k16) obj, (k16) obj2);
                            }
                        }, 4, null);
                        dVarF.L(objR3);
                    } else {
                        objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.g(o58Var, (k16) obj, (k16) obj2);
                            }
                        }, 4, null);
                        dVarF.L(objR3);
                    }
                    AndroidPopup_androidKt.a((DropdownMenuPositionProvider) objR3, function1, sg9Var2, ko1.e(-917492520, true, new a(bVar5, eVar, o58Var, v9bVar3, xkbVar4, j5, f6, f7, borderStroke3, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    dVar2 = dVarF;
                    dVar2.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                j3 = jC;
                bVar3 = bVar5;
                v9bVar2 = v9bVar3;
                xkbVar3 = xkbVar4;
                j4 = j5;
                f4 = f6;
                f3 = f7;
                borderStroke2 = borderStroke3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                v9bVar2 = v9bVar;
                f3 = f2;
                j3 = jC;
                bVar3 = bVar2;
                xkbVar3 = xkbVar2;
                j4 = j2;
                f4 = f;
                borderStroke2 = borderStroke;
            }
            sg9Var3 = sg9Var2;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.yl
                    public final Object invoke(Object obj, Object obj2) {
                        return am.h(z, function0, bVar3, j3, v9bVar2, sg9Var3, xkbVar3, j4, f4, f3, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
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
            i7 = i3 & 8;
            if (i7 != 0) {
                i4 |= 3072;
                jC = j;
                i8 = 32;
            } else {
                jC = j;
                i8 = 32;
                if ((i & 3072) == 0) {
                    if (dVarF.D(jC)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i4 |= i9;
                }
            }
            if ((i & 24576) != 0) {
                i4 |= ((i3 & 16) == 0 || !dVarF.x(v9bVar)) ? 8192 : 16384;
            }
            i10 = i3 & 32;
            if (i10 != 0) {
                i4 |= 196608;
                sg9Var2 = sg9Var;
            } else {
                sg9Var2 = sg9Var;
                if ((i & 196608) == 0) {
                    if (dVarF.x(sg9Var2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                }
            }
            if ((i & 1572864) == 0) {
                xkbVar2 = xkbVar;
                if ((i3 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i4 |= i22;
            } else {
                xkbVar2 = xkbVar;
            }
            if ((i & 12582912) != 0) {
                if ((i3 & 128) == 0) {
                    i21 = 4194304;
                } else {
                    i21 = 4194304;
                }
                i4 |= i21;
            }
            i12 = i3 & 256;
            if (i12 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.B(f)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i4 |= i13;
            }
            i14 = i3 & 512;
            if (i14 != 0) {
                if ((i & 805306368) == 0) {
                    if (dVarF.B(f2)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i4 |= i15;
                }
                i16 = i3 & 1024;
                if (i16 != 0) {
                    i17 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.x(borderStroke)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i17 = i2 | i18;
                } else {
                    i17 = i2;
                }
                if ((i3 & 2048) != 0) {
                    i17 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (dVarF.T(ps4Var)) {
                        i19 = i8;
                    } else {
                        i19 = 16;
                    }
                    i17 |= i19;
                }
                i20 = i17;
                if ((i4 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (dVarF.g(z2, i4 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i7 != 0) {
                            float f15 = 0;
                            jC = if3.c((((long) Float.floatToRawIntBits(ff3.i(f15))) << i8) | (((long) Float.floatToRawIntBits(ff3.i(f15))) & 4294967295L));
                        }
                        if ((i3 & 16) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -57345;
                        } else {
                            v9bVarD = v9bVar;
                        }
                        if (i10 != 0) {
                            sg9Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -3670017;
                        } else {
                            xkbVarE = xkbVar2;
                        }
                        if ((i3 & 128) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            jA = j2;
                        }
                        if (i12 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i14 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i16 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        f6 = f5;
                        v9bVar3 = v9bVarD;
                        xkbVar4 = xkbVarE;
                        f7 = fD;
                        j5 = jA;
                        bVar5 = bVar4;
                    } else {
                        if (i5 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i7 != 0) {
                            float f16 = 0;
                            jC = if3.c((((long) Float.floatToRawIntBits(ff3.i(f16))) << i8) | (((long) Float.floatToRawIntBits(ff3.i(f16))) & 4294967295L));
                        }
                        if ((i3 & 16) != 0) {
                            v9bVarD = h9b.d(0, dVarF, 0, 1);
                            i4 &= -57345;
                        } else {
                            v9bVarD = v9bVar;
                        }
                        if (i10 != 0) {
                            sg9Var2 = a;
                        }
                        if ((i3 & 64) != 0) {
                            xkbVarE = eq7.a.e(dVarF, 6);
                            i4 &= -3670017;
                        } else {
                            xkbVarE = xkbVar2;
                        }
                        if ((i3 & 128) != 0) {
                            jA = eq7.a.a(dVarF, 6);
                            i4 &= -29360129;
                        } else {
                            jA = j2;
                        }
                        if (i12 != 0) {
                            f5 = eq7.a.f();
                        } else {
                            f5 = f;
                        }
                        if (i14 != 0) {
                            fD = eq7.a.d();
                        } else {
                            fD = f2;
                        }
                        if (i16 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        f6 = f5;
                        v9bVar3 = v9bVarD;
                        xkbVar4 = xkbVarE;
                        f7 = fD;
                        j5 = jA;
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1725609375, i4, i20, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:54)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = new e(Boolean.FALSE);
                        dVarF.L(objR);
                    }
                    eVar = (e) objR;
                    eVar.i(Boolean.valueOf(z));
                    if (((Boolean) eVar.a()).booleanValue()) {
                        dVarF.y(1165905588);
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR2);
                        }
                        o58Var = (o58) objR2;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        if ((i4 & 7168) == 2048) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zX = z3 | dVarF.x(f43Var);
                        objR3 = dVarF.R();
                        if (zX) {
                            objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.g(o58Var, (k16) obj, (k16) obj2);
                                }
                            }, 4, null);
                            dVarF.L(objR3);
                        } else {
                            objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.g(o58Var, (k16) obj, (k16) obj2);
                                }
                            }, 4, null);
                            dVarF.L(objR3);
                        }
                        AndroidPopup_androidKt.a((DropdownMenuPositionProvider) objR3, function1, sg9Var2, ko1.e(-917492520, true, new a(bVar5, eVar, o58Var, v9bVar3, xkbVar4, j5, f6, f7, borderStroke3, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        dVarF.y(1165905588);
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                            dVarF.L(objR2);
                        }
                        o58Var = (o58) objR2;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        if ((i4 & 7168) == 2048) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zX = z3 | dVarF.x(f43Var);
                        objR3 = dVarF.R();
                        if (zX) {
                            objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.g(o58Var, (k16) obj, (k16) obj2);
                                }
                            }, 4, null);
                            dVarF.L(objR3);
                        } else {
                            objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.g(o58Var, (k16) obj, (k16) obj2);
                                }
                            }, 4, null);
                            dVarF.L(objR3);
                        }
                        AndroidPopup_androidKt.a((DropdownMenuPositionProvider) objR3, function1, sg9Var2, ko1.e(-917492520, true, new a(bVar5, eVar, o58Var, v9bVar3, xkbVar4, j5, f6, f7, borderStroke3, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    j3 = jC;
                    bVar3 = bVar5;
                    v9bVar2 = v9bVar3;
                    xkbVar3 = xkbVar4;
                    j4 = j5;
                    f4 = f6;
                    f3 = f7;
                    borderStroke2 = borderStroke3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    v9bVar2 = v9bVar;
                    f3 = f2;
                    j3 = jC;
                    bVar3 = bVar2;
                    xkbVar3 = xkbVar2;
                    j4 = j2;
                    f4 = f;
                    borderStroke2 = borderStroke;
                }
                sg9Var3 = sg9Var2;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.yl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.h(z, function0, bVar3, j3, v9bVar2, sg9Var3, xkbVar3, j4, f4, f3, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 805306368;
            i16 = i3 & 1024;
            if (i16 != 0) {
                i17 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.x(borderStroke)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i17 = i2 | i18;
            } else {
                i17 = i2;
            }
            if ((i3 & 2048) != 0) {
                i17 |= 48;
            } else if ((i2 & 48) != 0) {
                if (dVarF.T(ps4Var)) {
                    i19 = i8;
                } else {
                    i19 = 16;
                }
                i17 |= i19;
            }
            i20 = i17;
            if ((i4 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (dVarF.g(z2, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i7 != 0) {
                        float f17 = 0;
                        jC = if3.c((((long) Float.floatToRawIntBits(ff3.i(f17))) << i8) | (((long) Float.floatToRawIntBits(ff3.i(f17))) & 4294967295L));
                    }
                    if ((i3 & 16) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -57345;
                    } else {
                        v9bVarD = v9bVar;
                    }
                    if (i10 != 0) {
                        sg9Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -3670017;
                    } else {
                        xkbVarE = xkbVar2;
                    }
                    if ((i3 & 128) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        jA = j2;
                    }
                    if (i12 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i14 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i16 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    f6 = f5;
                    v9bVar3 = v9bVarD;
                    xkbVar4 = xkbVarE;
                    f7 = fD;
                    j5 = jA;
                    bVar5 = bVar4;
                } else {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i7 != 0) {
                        float f18 = 0;
                        jC = if3.c((((long) Float.floatToRawIntBits(ff3.i(f18))) << i8) | (((long) Float.floatToRawIntBits(ff3.i(f18))) & 4294967295L));
                    }
                    if ((i3 & 16) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -57345;
                    } else {
                        v9bVarD = v9bVar;
                    }
                    if (i10 != 0) {
                        sg9Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -3670017;
                    } else {
                        xkbVarE = xkbVar2;
                    }
                    if ((i3 & 128) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        jA = j2;
                    }
                    if (i12 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i14 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i16 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    f6 = f5;
                    v9bVar3 = v9bVarD;
                    xkbVar4 = xkbVarE;
                    f7 = fD;
                    j5 = jA;
                    bVar5 = bVar4;
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1725609375, i4, i20, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:54)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = new e(Boolean.FALSE);
                    dVarF.L(objR);
                }
                eVar = (e) objR;
                eVar.i(Boolean.valueOf(z));
                if (((Boolean) eVar.a()).booleanValue()) {
                    dVarF.y(1165905588);
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR2);
                    }
                    o58Var = (o58) objR2;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    if ((i4 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zX = z3 | dVarF.x(f43Var);
                    objR3 = dVarF.R();
                    if (zX) {
                        objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.g(o58Var, (k16) obj, (k16) obj2);
                            }
                        }, 4, null);
                        dVarF.L(objR3);
                    } else {
                        objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.g(o58Var, (k16) obj, (k16) obj2);
                            }
                        }, 4, null);
                        dVarF.L(objR3);
                    }
                    AndroidPopup_androidKt.a((DropdownMenuPositionProvider) objR3, function1, sg9Var2, ko1.e(-917492520, true, new a(bVar5, eVar, o58Var, v9bVar3, xkbVar4, j5, f6, f7, borderStroke3, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    dVar2 = dVarF;
                    dVar2.u();
                } else {
                    dVarF.y(1165905588);
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR2);
                    }
                    o58Var = (o58) objR2;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    if ((i4 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zX = z3 | dVarF.x(f43Var);
                    objR3 = dVarF.R();
                    if (zX) {
                        objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.g(o58Var, (k16) obj, (k16) obj2);
                            }
                        }, 4, null);
                        dVarF.L(objR3);
                    } else {
                        objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.g(o58Var, (k16) obj, (k16) obj2);
                            }
                        }, 4, null);
                        dVarF.L(objR3);
                    }
                    AndroidPopup_androidKt.a((DropdownMenuPositionProvider) objR3, function1, sg9Var2, ko1.e(-917492520, true, new a(bVar5, eVar, o58Var, v9bVar3, xkbVar4, j5, f6, f7, borderStroke3, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    dVar2 = dVarF;
                    dVar2.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                j3 = jC;
                bVar3 = bVar5;
                v9bVar2 = v9bVar3;
                xkbVar3 = xkbVar4;
                j4 = j5;
                f4 = f6;
                f3 = f7;
                borderStroke2 = borderStroke3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                v9bVar2 = v9bVar;
                f3 = f2;
                j3 = jC;
                bVar3 = bVar2;
                xkbVar3 = xkbVar2;
                j4 = j2;
                f4 = f;
                borderStroke2 = borderStroke;
            }
            sg9Var3 = sg9Var2;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.yl
                    public final Object invoke(Object obj, Object obj2) {
                        return am.h(z, function0, bVar3, j3, v9bVar2, sg9Var3, xkbVar3, j4, f4, f3, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 384;
        bVar2 = bVar;
        i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= 3072;
            jC = j;
            i8 = 32;
        } else {
            jC = j;
            i8 = 32;
            if ((i & 3072) == 0) {
                if (dVarF.D(jC)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i4 |= i9;
            }
        }
        if ((i & 24576) != 0) {
            i4 |= ((i3 & 16) == 0 || !dVarF.x(v9bVar)) ? 8192 : 16384;
        }
        i10 = i3 & 32;
        if (i10 != 0) {
            i4 |= 196608;
            sg9Var2 = sg9Var;
        } else {
            sg9Var2 = sg9Var;
            if ((i & 196608) == 0) {
                if (dVarF.x(sg9Var2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i4 |= i11;
            }
        }
        if ((i & 1572864) == 0) {
            xkbVar2 = xkbVar;
            if ((i3 & 64) == 0) {
                i22 = 524288;
            } else {
                i22 = 524288;
            }
            i4 |= i22;
        } else {
            xkbVar2 = xkbVar;
        }
        if ((i & 12582912) != 0) {
            if ((i3 & 128) == 0) {
                i21 = 4194304;
            } else {
                i21 = 4194304;
            }
            i4 |= i21;
        }
        i12 = i3 & 256;
        if (i12 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (dVarF.B(f)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i4 |= i13;
        }
        i14 = i3 & 512;
        if (i14 != 0) {
            if ((i & 805306368) == 0) {
                if (dVarF.B(f2)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i4 |= i15;
            }
            i16 = i3 & 1024;
            if (i16 != 0) {
                i17 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.x(borderStroke)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i17 = i2 | i18;
            } else {
                i17 = i2;
            }
            if ((i3 & 2048) != 0) {
                i17 |= 48;
            } else if ((i2 & 48) != 0) {
                if (dVarF.T(ps4Var)) {
                    i19 = i8;
                } else {
                    i19 = 16;
                }
                i17 |= i19;
            }
            i20 = i17;
            if ((i4 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (dVarF.g(z2, i4 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i7 != 0) {
                        float f19 = 0;
                        jC = if3.c((((long) Float.floatToRawIntBits(ff3.i(f19))) << i8) | (((long) Float.floatToRawIntBits(ff3.i(f19))) & 4294967295L));
                    }
                    if ((i3 & 16) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -57345;
                    } else {
                        v9bVarD = v9bVar;
                    }
                    if (i10 != 0) {
                        sg9Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -3670017;
                    } else {
                        xkbVarE = xkbVar2;
                    }
                    if ((i3 & 128) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        jA = j2;
                    }
                    if (i12 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i14 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i16 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    f6 = f5;
                    v9bVar3 = v9bVarD;
                    xkbVar4 = xkbVarE;
                    f7 = fD;
                    j5 = jA;
                    bVar5 = bVar4;
                } else {
                    if (i5 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i7 != 0) {
                        float f110 = 0;
                        jC = if3.c((((long) Float.floatToRawIntBits(ff3.i(f110))) << i8) | (((long) Float.floatToRawIntBits(ff3.i(f110))) & 4294967295L));
                    }
                    if ((i3 & 16) != 0) {
                        v9bVarD = h9b.d(0, dVarF, 0, 1);
                        i4 &= -57345;
                    } else {
                        v9bVarD = v9bVar;
                    }
                    if (i10 != 0) {
                        sg9Var2 = a;
                    }
                    if ((i3 & 64) != 0) {
                        xkbVarE = eq7.a.e(dVarF, 6);
                        i4 &= -3670017;
                    } else {
                        xkbVarE = xkbVar2;
                    }
                    if ((i3 & 128) != 0) {
                        jA = eq7.a.a(dVarF, 6);
                        i4 &= -29360129;
                    } else {
                        jA = j2;
                    }
                    if (i12 != 0) {
                        f5 = eq7.a.f();
                    } else {
                        f5 = f;
                    }
                    if (i14 != 0) {
                        fD = eq7.a.d();
                    } else {
                        fD = f2;
                    }
                    if (i16 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    f6 = f5;
                    v9bVar3 = v9bVarD;
                    xkbVar4 = xkbVarE;
                    f7 = fD;
                    j5 = jA;
                    bVar5 = bVar4;
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1725609375, i4, i20, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:54)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = new e(Boolean.FALSE);
                    dVarF.L(objR);
                }
                eVar = (e) objR;
                eVar.i(Boolean.valueOf(z));
                if (((Boolean) eVar.a()).booleanValue()) {
                    dVarF.y(1165905588);
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR2);
                    }
                    o58Var = (o58) objR2;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    if ((i4 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zX = z3 | dVarF.x(f43Var);
                    objR3 = dVarF.R();
                    if (zX) {
                        objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.g(o58Var, (k16) obj, (k16) obj2);
                            }
                        }, 4, null);
                        dVarF.L(objR3);
                    } else {
                        objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.g(o58Var, (k16) obj, (k16) obj2);
                            }
                        }, 4, null);
                        dVarF.L(objR3);
                    }
                    AndroidPopup_androidKt.a((DropdownMenuPositionProvider) objR3, function1, sg9Var2, ko1.e(-917492520, true, new a(bVar5, eVar, o58Var, v9bVar3, xkbVar4, j5, f6, f7, borderStroke3, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    dVar2 = dVarF;
                    dVar2.u();
                } else {
                    dVarF.y(1165905588);
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                        dVarF.L(objR2);
                    }
                    o58Var = (o58) objR2;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    if ((i4 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zX = z3 | dVarF.x(f43Var);
                    objR3 = dVarF.R();
                    if (zX) {
                        objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.g(o58Var, (k16) obj, (k16) obj2);
                            }
                        }, 4, null);
                        dVarF.L(objR3);
                    } else {
                        objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.g(o58Var, (k16) obj, (k16) obj2);
                            }
                        }, 4, null);
                        dVarF.L(objR3);
                    }
                    AndroidPopup_androidKt.a((DropdownMenuPositionProvider) objR3, function1, sg9Var2, ko1.e(-917492520, true, new a(bVar5, eVar, o58Var, v9bVar3, xkbVar4, j5, f6, f7, borderStroke3, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                    dVar2 = dVarF;
                    dVar2.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                j3 = jC;
                bVar3 = bVar5;
                v9bVar2 = v9bVar3;
                xkbVar3 = xkbVar4;
                j4 = j5;
                f4 = f6;
                f3 = f7;
                borderStroke2 = borderStroke3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                v9bVar2 = v9bVar;
                f3 = f2;
                j3 = jC;
                bVar3 = bVar2;
                xkbVar3 = xkbVar2;
                j4 = j2;
                f4 = f;
                borderStroke2 = borderStroke;
            }
            sg9Var3 = sg9Var2;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.yl
                    public final Object invoke(Object obj, Object obj2) {
                        return am.h(z, function0, bVar3, j3, v9bVar2, sg9Var3, xkbVar3, j4, f4, f3, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 805306368;
        i16 = i3 & 1024;
        if (i16 != 0) {
            i17 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (dVarF.x(borderStroke)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i17 = i2 | i18;
        } else {
            i17 = i2;
        }
        if ((i3 & 2048) != 0) {
            i17 |= 48;
        } else if ((i2 & 48) != 0) {
            if (dVarF.T(ps4Var)) {
                i19 = i8;
            } else {
                i19 = 16;
            }
            i17 |= i19;
        }
        i20 = i17;
        if ((i4 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (dVarF.g(z2, i4 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i7 != 0) {
                    float f111 = 0;
                    jC = if3.c((((long) Float.floatToRawIntBits(ff3.i(f111))) << i8) | (((long) Float.floatToRawIntBits(ff3.i(f111))) & 4294967295L));
                }
                if ((i3 & 16) != 0) {
                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                    i4 &= -57345;
                } else {
                    v9bVarD = v9bVar;
                }
                if (i10 != 0) {
                    sg9Var2 = a;
                }
                if ((i3 & 64) != 0) {
                    xkbVarE = eq7.a.e(dVarF, 6);
                    i4 &= -3670017;
                } else {
                    xkbVarE = xkbVar2;
                }
                if ((i3 & 128) != 0) {
                    jA = eq7.a.a(dVarF, 6);
                    i4 &= -29360129;
                } else {
                    jA = j2;
                }
                if (i12 != 0) {
                    f5 = eq7.a.f();
                } else {
                    f5 = f;
                }
                if (i14 != 0) {
                    fD = eq7.a.d();
                } else {
                    fD = f2;
                }
                if (i16 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                f6 = f5;
                v9bVar3 = v9bVarD;
                xkbVar4 = xkbVarE;
                f7 = fD;
                j5 = jA;
                bVar5 = bVar4;
            } else {
                if (i5 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i7 != 0) {
                    float f112 = 0;
                    jC = if3.c((((long) Float.floatToRawIntBits(ff3.i(f112))) << i8) | (((long) Float.floatToRawIntBits(ff3.i(f112))) & 4294967295L));
                }
                if ((i3 & 16) != 0) {
                    v9bVarD = h9b.d(0, dVarF, 0, 1);
                    i4 &= -57345;
                } else {
                    v9bVarD = v9bVar;
                }
                if (i10 != 0) {
                    sg9Var2 = a;
                }
                if ((i3 & 64) != 0) {
                    xkbVarE = eq7.a.e(dVarF, 6);
                    i4 &= -3670017;
                } else {
                    xkbVarE = xkbVar2;
                }
                if ((i3 & 128) != 0) {
                    jA = eq7.a.a(dVarF, 6);
                    i4 &= -29360129;
                } else {
                    jA = j2;
                }
                if (i12 != 0) {
                    f5 = eq7.a.f();
                } else {
                    f5 = f;
                }
                if (i14 != 0) {
                    fD = eq7.a.d();
                } else {
                    fD = f2;
                }
                if (i16 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                f6 = f5;
                v9bVar3 = v9bVarD;
                xkbVar4 = xkbVarE;
                f7 = fD;
                j5 = jA;
                bVar5 = bVar4;
            }
            dVarF.M();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1725609375, i4, i20, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:54)");
            }
            objR = dVarF.R();
            companion = d.INSTANCE;
            if (objR == companion.a()) {
                objR = new e(Boolean.FALSE);
                dVarF.L(objR);
            }
            eVar = (e) objR;
            eVar.i(Boolean.valueOf(z));
            if (((Boolean) eVar.a()).booleanValue()) {
                dVarF.y(1165905588);
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                    dVarF.L(objR2);
                }
                o58Var = (o58) objR2;
                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                if ((i4 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zX = z3 | dVarF.x(f43Var);
                objR3 = dVarF.R();
                if (zX) {
                    objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.g(o58Var, (k16) obj, (k16) obj2);
                        }
                    }, 4, null);
                    dVarF.L(objR3);
                } else {
                    objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.g(o58Var, (k16) obj, (k16) obj2);
                        }
                    }, 4, null);
                    dVarF.L(objR3);
                }
                AndroidPopup_androidKt.a((DropdownMenuPositionProvider) objR3, function1, sg9Var2, ko1.e(-917492520, true, new a(bVar5, eVar, o58Var, v9bVar3, xkbVar4, j5, f6, f7, borderStroke3, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                dVar2 = dVarF;
                dVar2.u();
            } else {
                dVarF.y(1165905588);
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = s0.e(t.b(t.INSTANCE.a()), null, 2, null);
                    dVarF.L(objR2);
                }
                o58Var = (o58) objR2;
                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                if ((i4 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zX = z3 | dVarF.x(f43Var);
                objR3 = dVarF.R();
                if (zX) {
                    objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.g(o58Var, (k16) obj, (k16) obj2);
                        }
                    }, 4, null);
                    dVarF.L(objR3);
                } else {
                    objR3 = new DropdownMenuPositionProvider(jC, f43Var, 0, new Function2() { // from class: com.google.android.xl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.g(o58Var, (k16) obj, (k16) obj2);
                        }
                    }, 4, null);
                    dVarF.L(objR3);
                }
                AndroidPopup_androidKt.a((DropdownMenuPositionProvider) objR3, function1, sg9Var2, ko1.e(-917492520, true, new a(bVar5, eVar, o58Var, v9bVar3, xkbVar4, j5, f6, f7, borderStroke3, ps4Var), dVarF, 54), dVarF, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                dVar2 = dVarF;
                dVar2.u();
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            j3 = jC;
            bVar3 = bVar5;
            v9bVar2 = v9bVar3;
            xkbVar3 = xkbVar4;
            j4 = j5;
            f4 = f6;
            f3 = f7;
            borderStroke2 = borderStroke3;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            v9bVar2 = v9bVar;
            f3 = f2;
            j3 = jC;
            bVar3 = bVar2;
            xkbVar3 = xkbVar2;
            j4 = j2;
            f4 = f;
            borderStroke2 = borderStroke;
        }
        sg9Var3 = sg9Var2;
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.yl
                public final Object invoke(Object obj, Object obj2) {
                    return am.h(z, function0, bVar3, j3, v9bVar2, sg9Var3, xkbVar3, j4, f4, f3, borderStroke2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0121  */
    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:116:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x015d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0163  */
    /* JADX WARN: Code duplicated, block: B:122:0x0166  */
    /* JADX WARN: Code duplicated, block: B:124:0x0169  */
    /* JADX WARN: Code duplicated, block: B:127:0x016f  */
    /* JADX WARN: Code duplicated, block: B:128:0x017a  */
    /* JADX WARN: Code duplicated, block: B:130:0x017e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0185  */
    /* JADX WARN: Code duplicated, block: B:133:0x0189  */
    /* JADX WARN: Code duplicated, block: B:135:0x018e  */
    /* JADX WARN: Code duplicated, block: B:138:0x019a  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x0109  */
    /* JADX WARN: Code duplicated, block: B:98:0x010c  */
    public static final void e(final Function2<? super d, ? super Integer, Unit> function2, final Function0<Unit> function0, b bVar, Function2<? super d, ? super Integer, Unit> function3, Function2<? super d, ? super Integer, Unit> function4, boolean z, jq7 jq7Var, rx8 rx8Var, r48 r48Var, d dVar, final int i, final int i2) {
        Function2<? super d, ? super Integer, Unit> function5;
        int i3;
        Function0<Unit> function1;
        b bVar2;
        int i4;
        Function2<? super d, ? super Integer, Unit> function6;
        int i5;
        int i6;
        Function2<? super d, ? super Integer, Unit> function7;
        int i7;
        int i8;
        boolean z2;
        int i9;
        jq7 jq7VarG;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z3;
        d dVar2;
        final r48 r48Var2;
        final b bVar3;
        final Function2<? super d, ? super Integer, Unit> function8;
        final Function2<? super d, ? super Integer, Unit> function9;
        final boolean z4;
        final jq7 jq7Var2;
        final rx8 rx8Var2;
        s6b s6bVarH;
        int i15;
        rx8 rx8VarC;
        r48 r48Var3;
        rx8 rx8Var3;
        d dVarF = dVar.F(-532959117);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function5 = function2;
        } else {
            function5 = function2;
            if ((i & 6) == 0) {
                i3 = (dVarF.T(function5) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i & 48) == 0) {
                i3 |= dVarF.T(function1) ? 32 : 16;
            }
        }
        int i16 = i2 & 4;
        if (i16 == 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function6 = function3;
                    if (dVarF.T(function6)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        function7 = function4;
                        if (dVarF.T(function7)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            z2 = z;
                            if (dVarF.A(z2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                jq7VarG = jq7Var;
                                int i17 = dVarF.x(jq7VarG) ? 1048576 : 524288;
                                i3 |= i17;
                            } else {
                                jq7VarG = jq7Var;
                            }
                            i3 |= i17;
                        } else {
                            jq7VarG = jq7Var;
                        }
                        i10 = i2 & 128;
                        if (i10 != 0) {
                            if ((i & 12582912) == 0) {
                                if (dVarF.x(rx8Var)) {
                                    i11 = 8388608;
                                } else {
                                    i11 = 4194304;
                                }
                                i3 |= i11;
                            }
                            i12 = i2 & 256;
                            if (i12 != 0) {
                                if ((i & 100663296) == 0) {
                                    if (dVarF.x(r48Var)) {
                                        i13 = 67108864;
                                    } else {
                                        i13 = 33554432;
                                    }
                                    i3 |= i13;
                                }
                                i14 = i3;
                                if ((i3 & 38347923) != 38347922) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (dVarF.g(z3, i14 & 1)) {
                                    dVarF.U();
                                    if ((i & 1) != 0 || dVarF.t()) {
                                        if (i16 != 0) {
                                            bVar2 = b.INSTANCE;
                                        }
                                        if (i4 != 0) {
                                            function6 = null;
                                        }
                                        if (i6 != 0) {
                                            function7 = null;
                                        }
                                        if (i8 != 0) {
                                            z2 = true;
                                        }
                                        if ((i2 & 64) != 0) {
                                            i15 = i14 & (-3670017);
                                            jq7VarG = eq7.a.g(dVarF, 6);
                                        } else {
                                            i15 = i14;
                                        }
                                        if (i10 != 0) {
                                            rx8VarC = eq7.a.c();
                                        } else {
                                            rx8VarC = rx8Var;
                                        }
                                        if (i12 != 0) {
                                            r48Var3 = null;
                                        } else {
                                            r48Var3 = r48Var;
                                        }
                                        rx8Var3 = rx8VarC;
                                    } else {
                                        dVarF.q();
                                        if ((i2 & 64) != 0) {
                                            i15 = i14 & (-3670017);
                                            rx8Var3 = rx8Var;
                                            r48Var3 = r48Var;
                                        } else {
                                            rx8Var3 = rx8Var;
                                            r48Var3 = r48Var;
                                            i15 = i14;
                                        }
                                    }
                                    Function2<? super d, ? super Integer, Unit> function10 = function7;
                                    boolean z5 = z2;
                                    jq7 jq7Var3 = jq7VarG;
                                    b bVar4 = bVar2;
                                    Function2<? super d, ? super Integer, Unit> function11 = function6;
                                    dVarF.M();
                                    if (androidx.compose.p004runtime.e.k()) {
                                        androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                                    }
                                    dVar2 = dVarF;
                                    qq7.i(function5, function1, bVar4, function11, function10, z5, jq7Var3, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                                    if (androidx.compose.p004runtime.e.k()) {
                                        androidx.compose.p004runtime.e.n();
                                    }
                                    bVar3 = bVar4;
                                    function8 = function11;
                                    function9 = function10;
                                    z4 = z5;
                                    jq7Var2 = jq7Var3;
                                    rx8Var2 = rx8Var3;
                                    r48Var2 = r48Var3;
                                } else {
                                    dVar2 = dVarF;
                                    dVar2.q();
                                    r48Var2 = r48Var;
                                    bVar3 = bVar2;
                                    function8 = function6;
                                    function9 = function7;
                                    z4 = z2;
                                    jq7Var2 = jq7VarG;
                                    rx8Var2 = rx8Var;
                                }
                                s6bVarH = dVar2.H();
                                if (s6bVarH != null) {
                                    s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                        public final Object invoke(Object obj, Object obj2) {
                                            return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                }
                            }
                            i3 |= 100663296;
                            i14 = i3;
                            if ((i3 & 38347923) != 38347922) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (dVarF.g(z3, i14 & 1)) {
                                dVarF.U();
                                if ((i & 1) != 0) {
                                    if (i16 != 0) {
                                        bVar2 = b.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        function6 = null;
                                    }
                                    if (i6 != 0) {
                                        function7 = null;
                                    }
                                    if (i8 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i15 = i14 & (-3670017);
                                        jq7VarG = eq7.a.g(dVarF, 6);
                                    } else {
                                        i15 = i14;
                                    }
                                    if (i10 != 0) {
                                        rx8VarC = eq7.a.c();
                                    } else {
                                        rx8VarC = rx8Var;
                                    }
                                    if (i12 != 0) {
                                        r48Var3 = null;
                                    } else {
                                        r48Var3 = r48Var;
                                    }
                                    rx8Var3 = rx8VarC;
                                } else {
                                    if (i16 != 0) {
                                        bVar2 = b.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        function6 = null;
                                    }
                                    if (i6 != 0) {
                                        function7 = null;
                                    }
                                    if (i8 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i15 = i14 & (-3670017);
                                        jq7VarG = eq7.a.g(dVarF, 6);
                                    } else {
                                        i15 = i14;
                                    }
                                    if (i10 != 0) {
                                        rx8VarC = eq7.a.c();
                                    } else {
                                        rx8VarC = rx8Var;
                                    }
                                    if (i12 != 0) {
                                        r48Var3 = null;
                                    } else {
                                        r48Var3 = r48Var;
                                    }
                                    rx8Var3 = rx8VarC;
                                }
                                Function2<? super d, ? super Integer, Unit> function12 = function7;
                                boolean z6 = z2;
                                jq7 jq7Var4 = jq7VarG;
                                b bVar5 = bVar2;
                                Function2<? super d, ? super Integer, Unit> function13 = function6;
                                dVarF.M();
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                                }
                                dVar2 = dVarF;
                                qq7.i(function5, function1, bVar5, function13, function12, z6, jq7Var4, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                                bVar3 = bVar5;
                                function8 = function13;
                                function9 = function12;
                                z4 = z6;
                                jq7Var2 = jq7Var4;
                                rx8Var2 = rx8Var3;
                                r48Var2 = r48Var3;
                            } else {
                                dVar2 = dVarF;
                                dVar2.q();
                                r48Var2 = r48Var;
                                bVar3 = bVar2;
                                function8 = function6;
                                function9 = function7;
                                z4 = z2;
                                jq7Var2 = jq7VarG;
                                rx8Var2 = rx8Var;
                            }
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                    public final Object invoke(Object obj, Object obj2) {
                                        return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i3 |= 12582912;
                        i12 = i2 & 256;
                        if (i12 != 0) {
                            if ((i & 100663296) == 0) {
                                if (dVarF.x(r48Var)) {
                                    i13 = 67108864;
                                } else {
                                    i13 = 33554432;
                                }
                                i3 |= i13;
                            }
                            i14 = i3;
                            if ((i3 & 38347923) != 38347922) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (dVarF.g(z3, i14 & 1)) {
                                dVarF.U();
                                if ((i & 1) != 0) {
                                    if (i16 != 0) {
                                        bVar2 = b.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        function6 = null;
                                    }
                                    if (i6 != 0) {
                                        function7 = null;
                                    }
                                    if (i8 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i15 = i14 & (-3670017);
                                        jq7VarG = eq7.a.g(dVarF, 6);
                                    } else {
                                        i15 = i14;
                                    }
                                    if (i10 != 0) {
                                        rx8VarC = eq7.a.c();
                                    } else {
                                        rx8VarC = rx8Var;
                                    }
                                    if (i12 != 0) {
                                        r48Var3 = null;
                                    } else {
                                        r48Var3 = r48Var;
                                    }
                                    rx8Var3 = rx8VarC;
                                } else {
                                    if (i16 != 0) {
                                        bVar2 = b.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        function6 = null;
                                    }
                                    if (i6 != 0) {
                                        function7 = null;
                                    }
                                    if (i8 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i15 = i14 & (-3670017);
                                        jq7VarG = eq7.a.g(dVarF, 6);
                                    } else {
                                        i15 = i14;
                                    }
                                    if (i10 != 0) {
                                        rx8VarC = eq7.a.c();
                                    } else {
                                        rx8VarC = rx8Var;
                                    }
                                    if (i12 != 0) {
                                        r48Var3 = null;
                                    } else {
                                        r48Var3 = r48Var;
                                    }
                                    rx8Var3 = rx8VarC;
                                }
                                Function2<? super d, ? super Integer, Unit> function14 = function7;
                                boolean z7 = z2;
                                jq7 jq7Var5 = jq7VarG;
                                b bVar6 = bVar2;
                                Function2<? super d, ? super Integer, Unit> function15 = function6;
                                dVarF.M();
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                                }
                                dVar2 = dVarF;
                                qq7.i(function5, function1, bVar6, function15, function14, z7, jq7Var5, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                                bVar3 = bVar6;
                                function8 = function15;
                                function9 = function14;
                                z4 = z7;
                                jq7Var2 = jq7Var5;
                                rx8Var2 = rx8Var3;
                                r48Var2 = r48Var3;
                            } else {
                                dVar2 = dVarF;
                                dVar2.q();
                                r48Var2 = r48Var;
                                bVar3 = bVar2;
                                function8 = function6;
                                function9 = function7;
                                z4 = z2;
                                jq7Var2 = jq7VarG;
                                rx8Var2 = rx8Var;
                            }
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                    public final Object invoke(Object obj, Object obj2) {
                                        return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i3 |= 100663296;
                        i14 = i3;
                        if ((i3 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i14 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            } else {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            }
                            Function2<? super d, ? super Integer, Unit> function16 = function7;
                            boolean z8 = z2;
                            jq7 jq7Var6 = jq7VarG;
                            b bVar7 = bVar2;
                            Function2<? super d, ? super Integer, Unit> function17 = function6;
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                            }
                            dVar2 = dVarF;
                            qq7.i(function5, function1, bVar7, function17, function16, z8, jq7Var6, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar7;
                            function8 = function17;
                            function9 = function16;
                            z4 = z8;
                            jq7Var2 = jq7Var6;
                            rx8Var2 = rx8Var3;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            function8 = function6;
                            function9 = function7;
                            z4 = z2;
                            jq7Var2 = jq7VarG;
                            rx8Var2 = rx8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 196608;
                    z2 = z;
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            jq7VarG = jq7Var;
                            if (dVarF.x(jq7VarG)) {
                            }
                            i3 |= i17;
                        } else {
                            jq7VarG = jq7Var;
                        }
                        i3 |= i17;
                    } else {
                        jq7VarG = jq7Var;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        if ((i & 12582912) == 0) {
                            if (dVarF.x(rx8Var)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & 256;
                        if (i12 != 0) {
                            if ((i & 100663296) == 0) {
                                if (dVarF.x(r48Var)) {
                                    i13 = 67108864;
                                } else {
                                    i13 = 33554432;
                                }
                                i3 |= i13;
                            }
                            i14 = i3;
                            if ((i3 & 38347923) != 38347922) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (dVarF.g(z3, i14 & 1)) {
                                dVarF.U();
                                if ((i & 1) != 0) {
                                    if (i16 != 0) {
                                        bVar2 = b.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        function6 = null;
                                    }
                                    if (i6 != 0) {
                                        function7 = null;
                                    }
                                    if (i8 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i15 = i14 & (-3670017);
                                        jq7VarG = eq7.a.g(dVarF, 6);
                                    } else {
                                        i15 = i14;
                                    }
                                    if (i10 != 0) {
                                        rx8VarC = eq7.a.c();
                                    } else {
                                        rx8VarC = rx8Var;
                                    }
                                    if (i12 != 0) {
                                        r48Var3 = null;
                                    } else {
                                        r48Var3 = r48Var;
                                    }
                                    rx8Var3 = rx8VarC;
                                } else {
                                    if (i16 != 0) {
                                        bVar2 = b.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        function6 = null;
                                    }
                                    if (i6 != 0) {
                                        function7 = null;
                                    }
                                    if (i8 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i15 = i14 & (-3670017);
                                        jq7VarG = eq7.a.g(dVarF, 6);
                                    } else {
                                        i15 = i14;
                                    }
                                    if (i10 != 0) {
                                        rx8VarC = eq7.a.c();
                                    } else {
                                        rx8VarC = rx8Var;
                                    }
                                    if (i12 != 0) {
                                        r48Var3 = null;
                                    } else {
                                        r48Var3 = r48Var;
                                    }
                                    rx8Var3 = rx8VarC;
                                }
                                Function2<? super d, ? super Integer, Unit> function18 = function7;
                                boolean z9 = z2;
                                jq7 jq7Var7 = jq7VarG;
                                b bVar8 = bVar2;
                                Function2<? super d, ? super Integer, Unit> function19 = function6;
                                dVarF.M();
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                                }
                                dVar2 = dVarF;
                                qq7.i(function5, function1, bVar8, function19, function18, z9, jq7Var7, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                                bVar3 = bVar8;
                                function8 = function19;
                                function9 = function18;
                                z4 = z9;
                                jq7Var2 = jq7Var7;
                                rx8Var2 = rx8Var3;
                                r48Var2 = r48Var3;
                            } else {
                                dVar2 = dVarF;
                                dVar2.q();
                                r48Var2 = r48Var;
                                bVar3 = bVar2;
                                function8 = function6;
                                function9 = function7;
                                z4 = z2;
                                jq7Var2 = jq7VarG;
                                rx8Var2 = rx8Var;
                            }
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                    public final Object invoke(Object obj, Object obj2) {
                                        return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i3 |= 100663296;
                        i14 = i3;
                        if ((i3 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i14 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            } else {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            }
                            Function2<? super d, ? super Integer, Unit> function110 = function7;
                            boolean z10 = z2;
                            jq7 jq7Var8 = jq7VarG;
                            b bVar9 = bVar2;
                            Function2<? super d, ? super Integer, Unit> function111 = function6;
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                            }
                            dVar2 = dVarF;
                            qq7.i(function5, function1, bVar9, function111, function110, z10, jq7Var8, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar9;
                            function8 = function111;
                            function9 = function110;
                            z4 = z10;
                            jq7Var2 = jq7Var8;
                            rx8Var2 = rx8Var3;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            function8 = function6;
                            function9 = function7;
                            z4 = z2;
                            jq7Var2 = jq7VarG;
                            rx8Var2 = rx8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 12582912;
                    i12 = i2 & 256;
                    if (i12 != 0) {
                        if ((i & 100663296) == 0) {
                            if (dVarF.x(r48Var)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        i14 = i3;
                        if ((i3 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i14 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            } else {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            }
                            Function2<? super d, ? super Integer, Unit> function112 = function7;
                            boolean z11 = z2;
                            jq7 jq7Var9 = jq7VarG;
                            b bVar10 = bVar2;
                            Function2<? super d, ? super Integer, Unit> function113 = function6;
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                            }
                            dVar2 = dVarF;
                            qq7.i(function5, function1, bVar10, function113, function112, z11, jq7Var9, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar10;
                            function8 = function113;
                            function9 = function112;
                            z4 = z11;
                            jq7Var2 = jq7Var9;
                            rx8Var2 = rx8Var3;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            function8 = function6;
                            function9 = function7;
                            z4 = z2;
                            jq7Var2 = jq7VarG;
                            rx8Var2 = rx8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 100663296;
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function114 = function7;
                        boolean z12 = z2;
                        jq7 jq7Var10 = jq7VarG;
                        b bVar11 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function115 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar11, function115, function114, z12, jq7Var10, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar11;
                        function8 = function115;
                        function9 = function114;
                        z4 = z12;
                        jq7Var2 = jq7Var10;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                function7 = function4;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (dVarF.A(z2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            jq7VarG = jq7Var;
                            if (dVarF.x(jq7VarG)) {
                            }
                            i3 |= i17;
                        } else {
                            jq7VarG = jq7Var;
                        }
                        i3 |= i17;
                    } else {
                        jq7VarG = jq7Var;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        if ((i & 12582912) == 0) {
                            if (dVarF.x(rx8Var)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & 256;
                        if (i12 != 0) {
                            if ((i & 100663296) == 0) {
                                if (dVarF.x(r48Var)) {
                                    i13 = 67108864;
                                } else {
                                    i13 = 33554432;
                                }
                                i3 |= i13;
                            }
                            i14 = i3;
                            if ((i3 & 38347923) != 38347922) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (dVarF.g(z3, i14 & 1)) {
                                dVarF.U();
                                if ((i & 1) != 0) {
                                    if (i16 != 0) {
                                        bVar2 = b.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        function6 = null;
                                    }
                                    if (i6 != 0) {
                                        function7 = null;
                                    }
                                    if (i8 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i15 = i14 & (-3670017);
                                        jq7VarG = eq7.a.g(dVarF, 6);
                                    } else {
                                        i15 = i14;
                                    }
                                    if (i10 != 0) {
                                        rx8VarC = eq7.a.c();
                                    } else {
                                        rx8VarC = rx8Var;
                                    }
                                    if (i12 != 0) {
                                        r48Var3 = null;
                                    } else {
                                        r48Var3 = r48Var;
                                    }
                                    rx8Var3 = rx8VarC;
                                } else {
                                    if (i16 != 0) {
                                        bVar2 = b.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        function6 = null;
                                    }
                                    if (i6 != 0) {
                                        function7 = null;
                                    }
                                    if (i8 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i15 = i14 & (-3670017);
                                        jq7VarG = eq7.a.g(dVarF, 6);
                                    } else {
                                        i15 = i14;
                                    }
                                    if (i10 != 0) {
                                        rx8VarC = eq7.a.c();
                                    } else {
                                        rx8VarC = rx8Var;
                                    }
                                    if (i12 != 0) {
                                        r48Var3 = null;
                                    } else {
                                        r48Var3 = r48Var;
                                    }
                                    rx8Var3 = rx8VarC;
                                }
                                Function2<? super d, ? super Integer, Unit> function116 = function7;
                                boolean z13 = z2;
                                jq7 jq7Var11 = jq7VarG;
                                b bVar12 = bVar2;
                                Function2<? super d, ? super Integer, Unit> function117 = function6;
                                dVarF.M();
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                                }
                                dVar2 = dVarF;
                                qq7.i(function5, function1, bVar12, function117, function116, z13, jq7Var11, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                                bVar3 = bVar12;
                                function8 = function117;
                                function9 = function116;
                                z4 = z13;
                                jq7Var2 = jq7Var11;
                                rx8Var2 = rx8Var3;
                                r48Var2 = r48Var3;
                            } else {
                                dVar2 = dVarF;
                                dVar2.q();
                                r48Var2 = r48Var;
                                bVar3 = bVar2;
                                function8 = function6;
                                function9 = function7;
                                z4 = z2;
                                jq7Var2 = jq7VarG;
                                rx8Var2 = rx8Var;
                            }
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                    public final Object invoke(Object obj, Object obj2) {
                                        return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i3 |= 100663296;
                        i14 = i3;
                        if ((i3 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i14 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            } else {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            }
                            Function2<? super d, ? super Integer, Unit> function118 = function7;
                            boolean z14 = z2;
                            jq7 jq7Var12 = jq7VarG;
                            b bVar13 = bVar2;
                            Function2<? super d, ? super Integer, Unit> function119 = function6;
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                            }
                            dVar2 = dVarF;
                            qq7.i(function5, function1, bVar13, function119, function118, z14, jq7Var12, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar13;
                            function8 = function119;
                            function9 = function118;
                            z4 = z14;
                            jq7Var2 = jq7Var12;
                            rx8Var2 = rx8Var3;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            function8 = function6;
                            function9 = function7;
                            z4 = z2;
                            jq7Var2 = jq7VarG;
                            rx8Var2 = rx8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 12582912;
                    i12 = i2 & 256;
                    if (i12 != 0) {
                        if ((i & 100663296) == 0) {
                            if (dVarF.x(r48Var)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        i14 = i3;
                        if ((i3 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i14 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            } else {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            }
                            Function2<? super d, ? super Integer, Unit> function1110 = function7;
                            boolean z15 = z2;
                            jq7 jq7Var13 = jq7VarG;
                            b bVar14 = bVar2;
                            Function2<? super d, ? super Integer, Unit> function1111 = function6;
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                            }
                            dVar2 = dVarF;
                            qq7.i(function5, function1, bVar14, function1111, function1110, z15, jq7Var13, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar14;
                            function8 = function1111;
                            function9 = function1110;
                            z4 = z15;
                            jq7Var2 = jq7Var13;
                            rx8Var2 = rx8Var3;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            function8 = function6;
                            function9 = function7;
                            z4 = z2;
                            jq7Var2 = jq7VarG;
                            rx8Var2 = rx8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 100663296;
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function1112 = function7;
                        boolean z16 = z2;
                        jq7 jq7Var14 = jq7VarG;
                        b bVar15 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function1113 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar15, function1113, function1112, z16, jq7Var14, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar15;
                        function8 = function1113;
                        function9 = function1112;
                        z4 = z16;
                        jq7Var2 = jq7Var14;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 196608;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        jq7VarG = jq7Var;
                        if (dVarF.x(jq7VarG)) {
                        }
                        i3 |= i17;
                    } else {
                        jq7VarG = jq7Var;
                    }
                    i3 |= i17;
                } else {
                    jq7VarG = jq7Var;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((i & 12582912) == 0) {
                        if (dVarF.x(rx8Var)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & 256;
                    if (i12 != 0) {
                        if ((i & 100663296) == 0) {
                            if (dVarF.x(r48Var)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        i14 = i3;
                        if ((i3 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i14 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            } else {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            }
                            Function2<? super d, ? super Integer, Unit> function1114 = function7;
                            boolean z17 = z2;
                            jq7 jq7Var15 = jq7VarG;
                            b bVar16 = bVar2;
                            Function2<? super d, ? super Integer, Unit> function1115 = function6;
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                            }
                            dVar2 = dVarF;
                            qq7.i(function5, function1, bVar16, function1115, function1114, z17, jq7Var15, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar16;
                            function8 = function1115;
                            function9 = function1114;
                            z4 = z17;
                            jq7Var2 = jq7Var15;
                            rx8Var2 = rx8Var3;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            function8 = function6;
                            function9 = function7;
                            z4 = z2;
                            jq7Var2 = jq7VarG;
                            rx8Var2 = rx8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 100663296;
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function1116 = function7;
                        boolean z18 = z2;
                        jq7 jq7Var16 = jq7VarG;
                        b bVar17 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function1117 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar17, function1117, function1116, z18, jq7Var16, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar17;
                        function8 = function1117;
                        function9 = function1116;
                        z4 = z18;
                        jq7Var2 = jq7Var16;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 12582912;
                i12 = i2 & 256;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.x(r48Var)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function1118 = function7;
                        boolean z19 = z2;
                        jq7 jq7Var17 = jq7VarG;
                        b bVar18 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function1119 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar18, function1119, function1118, z19, jq7Var17, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar18;
                        function8 = function1119;
                        function9 = function1118;
                        z4 = z19;
                        jq7Var2 = jq7Var17;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 100663296;
                i14 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    } else {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    }
                    Function2<? super d, ? super Integer, Unit> function11110 = function7;
                    boolean z110 = z2;
                    jq7 jq7Var18 = jq7VarG;
                    b bVar19 = bVar2;
                    Function2<? super d, ? super Integer, Unit> function11111 = function6;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                    }
                    dVar2 = dVarF;
                    qq7.i(function5, function1, bVar19, function11111, function11110, z110, jq7Var18, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar19;
                    function8 = function11111;
                    function9 = function11110;
                    z4 = z110;
                    jq7Var2 = jq7Var18;
                    rx8Var2 = rx8Var3;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    function8 = function6;
                    function9 = function7;
                    z4 = z2;
                    jq7Var2 = jq7VarG;
                    rx8Var2 = rx8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            function6 = function3;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function7 = function4;
                    if (dVarF.T(function7)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (dVarF.A(z2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            jq7VarG = jq7Var;
                            if (dVarF.x(jq7VarG)) {
                            }
                            i3 |= i17;
                        } else {
                            jq7VarG = jq7Var;
                        }
                        i3 |= i17;
                    } else {
                        jq7VarG = jq7Var;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        if ((i & 12582912) == 0) {
                            if (dVarF.x(rx8Var)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & 256;
                        if (i12 != 0) {
                            if ((i & 100663296) == 0) {
                                if (dVarF.x(r48Var)) {
                                    i13 = 67108864;
                                } else {
                                    i13 = 33554432;
                                }
                                i3 |= i13;
                            }
                            i14 = i3;
                            if ((i3 & 38347923) != 38347922) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (dVarF.g(z3, i14 & 1)) {
                                dVarF.U();
                                if ((i & 1) != 0) {
                                    if (i16 != 0) {
                                        bVar2 = b.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        function6 = null;
                                    }
                                    if (i6 != 0) {
                                        function7 = null;
                                    }
                                    if (i8 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i15 = i14 & (-3670017);
                                        jq7VarG = eq7.a.g(dVarF, 6);
                                    } else {
                                        i15 = i14;
                                    }
                                    if (i10 != 0) {
                                        rx8VarC = eq7.a.c();
                                    } else {
                                        rx8VarC = rx8Var;
                                    }
                                    if (i12 != 0) {
                                        r48Var3 = null;
                                    } else {
                                        r48Var3 = r48Var;
                                    }
                                    rx8Var3 = rx8VarC;
                                } else {
                                    if (i16 != 0) {
                                        bVar2 = b.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        function6 = null;
                                    }
                                    if (i6 != 0) {
                                        function7 = null;
                                    }
                                    if (i8 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i15 = i14 & (-3670017);
                                        jq7VarG = eq7.a.g(dVarF, 6);
                                    } else {
                                        i15 = i14;
                                    }
                                    if (i10 != 0) {
                                        rx8VarC = eq7.a.c();
                                    } else {
                                        rx8VarC = rx8Var;
                                    }
                                    if (i12 != 0) {
                                        r48Var3 = null;
                                    } else {
                                        r48Var3 = r48Var;
                                    }
                                    rx8Var3 = rx8VarC;
                                }
                                Function2<? super d, ? super Integer, Unit> function11112 = function7;
                                boolean z111 = z2;
                                jq7 jq7Var19 = jq7VarG;
                                b bVar110 = bVar2;
                                Function2<? super d, ? super Integer, Unit> function11113 = function6;
                                dVarF.M();
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                                }
                                dVar2 = dVarF;
                                qq7.i(function5, function1, bVar110, function11113, function11112, z111, jq7Var19, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                                bVar3 = bVar110;
                                function8 = function11113;
                                function9 = function11112;
                                z4 = z111;
                                jq7Var2 = jq7Var19;
                                rx8Var2 = rx8Var3;
                                r48Var2 = r48Var3;
                            } else {
                                dVar2 = dVarF;
                                dVar2.q();
                                r48Var2 = r48Var;
                                bVar3 = bVar2;
                                function8 = function6;
                                function9 = function7;
                                z4 = z2;
                                jq7Var2 = jq7VarG;
                                rx8Var2 = rx8Var;
                            }
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                    public final Object invoke(Object obj, Object obj2) {
                                        return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i3 |= 100663296;
                        i14 = i3;
                        if ((i3 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i14 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            } else {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            }
                            Function2<? super d, ? super Integer, Unit> function11114 = function7;
                            boolean z112 = z2;
                            jq7 jq7Var110 = jq7VarG;
                            b bVar111 = bVar2;
                            Function2<? super d, ? super Integer, Unit> function11115 = function6;
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                            }
                            dVar2 = dVarF;
                            qq7.i(function5, function1, bVar111, function11115, function11114, z112, jq7Var110, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar111;
                            function8 = function11115;
                            function9 = function11114;
                            z4 = z112;
                            jq7Var2 = jq7Var110;
                            rx8Var2 = rx8Var3;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            function8 = function6;
                            function9 = function7;
                            z4 = z2;
                            jq7Var2 = jq7VarG;
                            rx8Var2 = rx8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 12582912;
                    i12 = i2 & 256;
                    if (i12 != 0) {
                        if ((i & 100663296) == 0) {
                            if (dVarF.x(r48Var)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        i14 = i3;
                        if ((i3 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i14 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            } else {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            }
                            Function2<? super d, ? super Integer, Unit> function11116 = function7;
                            boolean z113 = z2;
                            jq7 jq7Var111 = jq7VarG;
                            b bVar112 = bVar2;
                            Function2<? super d, ? super Integer, Unit> function11117 = function6;
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                            }
                            dVar2 = dVarF;
                            qq7.i(function5, function1, bVar112, function11117, function11116, z113, jq7Var111, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar112;
                            function8 = function11117;
                            function9 = function11116;
                            z4 = z113;
                            jq7Var2 = jq7Var111;
                            rx8Var2 = rx8Var3;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            function8 = function6;
                            function9 = function7;
                            z4 = z2;
                            jq7Var2 = jq7VarG;
                            rx8Var2 = rx8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 100663296;
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function11118 = function7;
                        boolean z114 = z2;
                        jq7 jq7Var112 = jq7VarG;
                        b bVar113 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function11119 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar113, function11119, function11118, z114, jq7Var112, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar113;
                        function8 = function11119;
                        function9 = function11118;
                        z4 = z114;
                        jq7Var2 = jq7Var112;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 196608;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        jq7VarG = jq7Var;
                        if (dVarF.x(jq7VarG)) {
                        }
                        i3 |= i17;
                    } else {
                        jq7VarG = jq7Var;
                    }
                    i3 |= i17;
                } else {
                    jq7VarG = jq7Var;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((i & 12582912) == 0) {
                        if (dVarF.x(rx8Var)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & 256;
                    if (i12 != 0) {
                        if ((i & 100663296) == 0) {
                            if (dVarF.x(r48Var)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        i14 = i3;
                        if ((i3 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i14 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            } else {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            }
                            Function2<? super d, ? super Integer, Unit> function111110 = function7;
                            boolean z115 = z2;
                            jq7 jq7Var113 = jq7VarG;
                            b bVar114 = bVar2;
                            Function2<? super d, ? super Integer, Unit> function111111 = function6;
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                            }
                            dVar2 = dVarF;
                            qq7.i(function5, function1, bVar114, function111111, function111110, z115, jq7Var113, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar114;
                            function8 = function111111;
                            function9 = function111110;
                            z4 = z115;
                            jq7Var2 = jq7Var113;
                            rx8Var2 = rx8Var3;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            function8 = function6;
                            function9 = function7;
                            z4 = z2;
                            jq7Var2 = jq7VarG;
                            rx8Var2 = rx8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 100663296;
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function111112 = function7;
                        boolean z116 = z2;
                        jq7 jq7Var114 = jq7VarG;
                        b bVar115 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function111113 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar115, function111113, function111112, z116, jq7Var114, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar115;
                        function8 = function111113;
                        function9 = function111112;
                        z4 = z116;
                        jq7Var2 = jq7Var114;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 12582912;
                i12 = i2 & 256;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.x(r48Var)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function111114 = function7;
                        boolean z117 = z2;
                        jq7 jq7Var115 = jq7VarG;
                        b bVar116 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function111115 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar116, function111115, function111114, z117, jq7Var115, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar116;
                        function8 = function111115;
                        function9 = function111114;
                        z4 = z117;
                        jq7Var2 = jq7Var115;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 100663296;
                i14 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    } else {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    }
                    Function2<? super d, ? super Integer, Unit> function111116 = function7;
                    boolean z118 = z2;
                    jq7 jq7Var116 = jq7VarG;
                    b bVar117 = bVar2;
                    Function2<? super d, ? super Integer, Unit> function111117 = function6;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                    }
                    dVar2 = dVarF;
                    qq7.i(function5, function1, bVar117, function111117, function111116, z118, jq7Var116, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar117;
                    function8 = function111117;
                    function9 = function111116;
                    z4 = z118;
                    jq7Var2 = jq7Var116;
                    rx8Var2 = rx8Var3;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    function8 = function6;
                    function9 = function7;
                    z4 = z2;
                    jq7Var2 = jq7VarG;
                    rx8Var2 = rx8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            function7 = function4;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        jq7VarG = jq7Var;
                        if (dVarF.x(jq7VarG)) {
                        }
                        i3 |= i17;
                    } else {
                        jq7VarG = jq7Var;
                    }
                    i3 |= i17;
                } else {
                    jq7VarG = jq7Var;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((i & 12582912) == 0) {
                        if (dVarF.x(rx8Var)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & 256;
                    if (i12 != 0) {
                        if ((i & 100663296) == 0) {
                            if (dVarF.x(r48Var)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        i14 = i3;
                        if ((i3 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i14 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            } else {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            }
                            Function2<? super d, ? super Integer, Unit> function111118 = function7;
                            boolean z119 = z2;
                            jq7 jq7Var117 = jq7VarG;
                            b bVar118 = bVar2;
                            Function2<? super d, ? super Integer, Unit> function111119 = function6;
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                            }
                            dVar2 = dVarF;
                            qq7.i(function5, function1, bVar118, function111119, function111118, z119, jq7Var117, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar118;
                            function8 = function111119;
                            function9 = function111118;
                            z4 = z119;
                            jq7Var2 = jq7Var117;
                            rx8Var2 = rx8Var3;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            function8 = function6;
                            function9 = function7;
                            z4 = z2;
                            jq7Var2 = jq7VarG;
                            rx8Var2 = rx8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 100663296;
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function1111110 = function7;
                        boolean z1110 = z2;
                        jq7 jq7Var118 = jq7VarG;
                        b bVar119 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function1111111 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar119, function1111111, function1111110, z1110, jq7Var118, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar119;
                        function8 = function1111111;
                        function9 = function1111110;
                        z4 = z1110;
                        jq7Var2 = jq7Var118;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 12582912;
                i12 = i2 & 256;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.x(r48Var)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function1111112 = function7;
                        boolean z1111 = z2;
                        jq7 jq7Var119 = jq7VarG;
                        b bVar1110 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function1111113 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar1110, function1111113, function1111112, z1111, jq7Var119, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar1110;
                        function8 = function1111113;
                        function9 = function1111112;
                        z4 = z1111;
                        jq7Var2 = jq7Var119;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 100663296;
                i14 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    } else {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    }
                    Function2<? super d, ? super Integer, Unit> function1111114 = function7;
                    boolean z1112 = z2;
                    jq7 jq7Var1110 = jq7VarG;
                    b bVar1111 = bVar2;
                    Function2<? super d, ? super Integer, Unit> function1111115 = function6;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                    }
                    dVar2 = dVarF;
                    qq7.i(function5, function1, bVar1111, function1111115, function1111114, z1112, jq7Var1110, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar1111;
                    function8 = function1111115;
                    function9 = function1111114;
                    z4 = z1112;
                    jq7Var2 = jq7Var1110;
                    rx8Var2 = rx8Var3;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    function8 = function6;
                    function9 = function7;
                    z4 = z2;
                    jq7Var2 = jq7VarG;
                    rx8Var2 = rx8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    jq7VarG = jq7Var;
                    if (dVarF.x(jq7VarG)) {
                    }
                    i3 |= i17;
                } else {
                    jq7VarG = jq7Var;
                }
                i3 |= i17;
            } else {
                jq7VarG = jq7Var;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                if ((i & 12582912) == 0) {
                    if (dVarF.x(rx8Var)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 256;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.x(r48Var)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function1111116 = function7;
                        boolean z1113 = z2;
                        jq7 jq7Var1111 = jq7VarG;
                        b bVar1112 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function1111117 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar1112, function1111117, function1111116, z1113, jq7Var1111, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar1112;
                        function8 = function1111117;
                        function9 = function1111116;
                        z4 = z1113;
                        jq7Var2 = jq7Var1111;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 100663296;
                i14 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    } else {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    }
                    Function2<? super d, ? super Integer, Unit> function1111118 = function7;
                    boolean z1114 = z2;
                    jq7 jq7Var1112 = jq7VarG;
                    b bVar1113 = bVar2;
                    Function2<? super d, ? super Integer, Unit> function1111119 = function6;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                    }
                    dVar2 = dVarF;
                    qq7.i(function5, function1, bVar1113, function1111119, function1111118, z1114, jq7Var1112, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar1113;
                    function8 = function1111119;
                    function9 = function1111118;
                    z4 = z1114;
                    jq7Var2 = jq7Var1112;
                    rx8Var2 = rx8Var3;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    function8 = function6;
                    function9 = function7;
                    z4 = z2;
                    jq7Var2 = jq7VarG;
                    rx8Var2 = rx8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 12582912;
            i12 = i2 & 256;
            if (i12 != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.x(r48Var)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                i14 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    } else {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    }
                    Function2<? super d, ? super Integer, Unit> function11111110 = function7;
                    boolean z1115 = z2;
                    jq7 jq7Var1113 = jq7VarG;
                    b bVar1114 = bVar2;
                    Function2<? super d, ? super Integer, Unit> function11111111 = function6;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                    }
                    dVar2 = dVarF;
                    qq7.i(function5, function1, bVar1114, function11111111, function11111110, z1115, jq7Var1113, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar1114;
                    function8 = function11111111;
                    function9 = function11111110;
                    z4 = z1115;
                    jq7Var2 = jq7Var1113;
                    rx8Var2 = rx8Var3;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    function8 = function6;
                    function9 = function7;
                    z4 = z2;
                    jq7Var2 = jq7VarG;
                    rx8Var2 = rx8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 100663296;
            i14 = i3;
            if ((i3 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i14 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i15 = i14 & (-3670017);
                        jq7VarG = eq7.a.g(dVarF, 6);
                    } else {
                        i15 = i14;
                    }
                    if (i10 != 0) {
                        rx8VarC = eq7.a.c();
                    } else {
                        rx8VarC = rx8Var;
                    }
                    if (i12 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    rx8Var3 = rx8VarC;
                } else {
                    if (i16 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i15 = i14 & (-3670017);
                        jq7VarG = eq7.a.g(dVarF, 6);
                    } else {
                        i15 = i14;
                    }
                    if (i10 != 0) {
                        rx8VarC = eq7.a.c();
                    } else {
                        rx8VarC = rx8Var;
                    }
                    if (i12 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    rx8Var3 = rx8VarC;
                }
                Function2<? super d, ? super Integer, Unit> function11111112 = function7;
                boolean z1116 = z2;
                jq7 jq7Var1114 = jq7VarG;
                b bVar1115 = bVar2;
                Function2<? super d, ? super Integer, Unit> function11111113 = function6;
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                }
                dVar2 = dVarF;
                qq7.i(function5, function1, bVar1115, function11111113, function11111112, z1116, jq7Var1114, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar1115;
                function8 = function11111113;
                function9 = function11111112;
                z4 = z1116;
                jq7Var2 = jq7Var1114;
                rx8Var2 = rx8Var3;
                r48Var2 = r48Var3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                r48Var2 = r48Var;
                bVar3 = bVar2;
                function8 = function6;
                function9 = function7;
                z4 = z2;
                jq7Var2 = jq7VarG;
                rx8Var2 = rx8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.zl
                    public final Object invoke(Object obj, Object obj2) {
                        return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                function6 = function3;
                if (dVarF.T(function6)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function7 = function4;
                    if (dVarF.T(function7)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (dVarF.A(z2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            jq7VarG = jq7Var;
                            if (dVarF.x(jq7VarG)) {
                            }
                            i3 |= i17;
                        } else {
                            jq7VarG = jq7Var;
                        }
                        i3 |= i17;
                    } else {
                        jq7VarG = jq7Var;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        if ((i & 12582912) == 0) {
                            if (dVarF.x(rx8Var)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & 256;
                        if (i12 != 0) {
                            if ((i & 100663296) == 0) {
                                if (dVarF.x(r48Var)) {
                                    i13 = 67108864;
                                } else {
                                    i13 = 33554432;
                                }
                                i3 |= i13;
                            }
                            i14 = i3;
                            if ((i3 & 38347923) != 38347922) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (dVarF.g(z3, i14 & 1)) {
                                dVarF.U();
                                if ((i & 1) != 0) {
                                    if (i16 != 0) {
                                        bVar2 = b.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        function6 = null;
                                    }
                                    if (i6 != 0) {
                                        function7 = null;
                                    }
                                    if (i8 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i15 = i14 & (-3670017);
                                        jq7VarG = eq7.a.g(dVarF, 6);
                                    } else {
                                        i15 = i14;
                                    }
                                    if (i10 != 0) {
                                        rx8VarC = eq7.a.c();
                                    } else {
                                        rx8VarC = rx8Var;
                                    }
                                    if (i12 != 0) {
                                        r48Var3 = null;
                                    } else {
                                        r48Var3 = r48Var;
                                    }
                                    rx8Var3 = rx8VarC;
                                } else {
                                    if (i16 != 0) {
                                        bVar2 = b.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        function6 = null;
                                    }
                                    if (i6 != 0) {
                                        function7 = null;
                                    }
                                    if (i8 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i15 = i14 & (-3670017);
                                        jq7VarG = eq7.a.g(dVarF, 6);
                                    } else {
                                        i15 = i14;
                                    }
                                    if (i10 != 0) {
                                        rx8VarC = eq7.a.c();
                                    } else {
                                        rx8VarC = rx8Var;
                                    }
                                    if (i12 != 0) {
                                        r48Var3 = null;
                                    } else {
                                        r48Var3 = r48Var;
                                    }
                                    rx8Var3 = rx8VarC;
                                }
                                Function2<? super d, ? super Integer, Unit> function11111114 = function7;
                                boolean z1117 = z2;
                                jq7 jq7Var1115 = jq7VarG;
                                b bVar1116 = bVar2;
                                Function2<? super d, ? super Integer, Unit> function11111115 = function6;
                                dVarF.M();
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                                }
                                dVar2 = dVarF;
                                qq7.i(function5, function1, bVar1116, function11111115, function11111114, z1117, jq7Var1115, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                                bVar3 = bVar1116;
                                function8 = function11111115;
                                function9 = function11111114;
                                z4 = z1117;
                                jq7Var2 = jq7Var1115;
                                rx8Var2 = rx8Var3;
                                r48Var2 = r48Var3;
                            } else {
                                dVar2 = dVarF;
                                dVar2.q();
                                r48Var2 = r48Var;
                                bVar3 = bVar2;
                                function8 = function6;
                                function9 = function7;
                                z4 = z2;
                                jq7Var2 = jq7VarG;
                                rx8Var2 = rx8Var;
                            }
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                    public final Object invoke(Object obj, Object obj2) {
                                        return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i3 |= 100663296;
                        i14 = i3;
                        if ((i3 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i14 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            } else {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            }
                            Function2<? super d, ? super Integer, Unit> function11111116 = function7;
                            boolean z1118 = z2;
                            jq7 jq7Var1116 = jq7VarG;
                            b bVar1117 = bVar2;
                            Function2<? super d, ? super Integer, Unit> function11111117 = function6;
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                            }
                            dVar2 = dVarF;
                            qq7.i(function5, function1, bVar1117, function11111117, function11111116, z1118, jq7Var1116, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar1117;
                            function8 = function11111117;
                            function9 = function11111116;
                            z4 = z1118;
                            jq7Var2 = jq7Var1116;
                            rx8Var2 = rx8Var3;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            function8 = function6;
                            function9 = function7;
                            z4 = z2;
                            jq7Var2 = jq7VarG;
                            rx8Var2 = rx8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 12582912;
                    i12 = i2 & 256;
                    if (i12 != 0) {
                        if ((i & 100663296) == 0) {
                            if (dVarF.x(r48Var)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        i14 = i3;
                        if ((i3 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i14 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            } else {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            }
                            Function2<? super d, ? super Integer, Unit> function11111118 = function7;
                            boolean z1119 = z2;
                            jq7 jq7Var1117 = jq7VarG;
                            b bVar1118 = bVar2;
                            Function2<? super d, ? super Integer, Unit> function11111119 = function6;
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                            }
                            dVar2 = dVarF;
                            qq7.i(function5, function1, bVar1118, function11111119, function11111118, z1119, jq7Var1117, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar1118;
                            function8 = function11111119;
                            function9 = function11111118;
                            z4 = z1119;
                            jq7Var2 = jq7Var1117;
                            rx8Var2 = rx8Var3;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            function8 = function6;
                            function9 = function7;
                            z4 = z2;
                            jq7Var2 = jq7VarG;
                            rx8Var2 = rx8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 100663296;
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function111111110 = function7;
                        boolean z11110 = z2;
                        jq7 jq7Var1118 = jq7VarG;
                        b bVar1119 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function111111111 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar1119, function111111111, function111111110, z11110, jq7Var1118, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar1119;
                        function8 = function111111111;
                        function9 = function111111110;
                        z4 = z11110;
                        jq7Var2 = jq7Var1118;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 196608;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        jq7VarG = jq7Var;
                        if (dVarF.x(jq7VarG)) {
                        }
                        i3 |= i17;
                    } else {
                        jq7VarG = jq7Var;
                    }
                    i3 |= i17;
                } else {
                    jq7VarG = jq7Var;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((i & 12582912) == 0) {
                        if (dVarF.x(rx8Var)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & 256;
                    if (i12 != 0) {
                        if ((i & 100663296) == 0) {
                            if (dVarF.x(r48Var)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        i14 = i3;
                        if ((i3 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i14 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            } else {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            }
                            Function2<? super d, ? super Integer, Unit> function111111112 = function7;
                            boolean z11111 = z2;
                            jq7 jq7Var1119 = jq7VarG;
                            b bVar11110 = bVar2;
                            Function2<? super d, ? super Integer, Unit> function111111113 = function6;
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                            }
                            dVar2 = dVarF;
                            qq7.i(function5, function1, bVar11110, function111111113, function111111112, z11111, jq7Var1119, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar11110;
                            function8 = function111111113;
                            function9 = function111111112;
                            z4 = z11111;
                            jq7Var2 = jq7Var1119;
                            rx8Var2 = rx8Var3;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            function8 = function6;
                            function9 = function7;
                            z4 = z2;
                            jq7Var2 = jq7VarG;
                            rx8Var2 = rx8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 100663296;
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function111111114 = function7;
                        boolean z11112 = z2;
                        jq7 jq7Var11110 = jq7VarG;
                        b bVar11111 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function111111115 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar11111, function111111115, function111111114, z11112, jq7Var11110, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar11111;
                        function8 = function111111115;
                        function9 = function111111114;
                        z4 = z11112;
                        jq7Var2 = jq7Var11110;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 12582912;
                i12 = i2 & 256;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.x(r48Var)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function111111116 = function7;
                        boolean z11113 = z2;
                        jq7 jq7Var11111 = jq7VarG;
                        b bVar11112 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function111111117 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar11112, function111111117, function111111116, z11113, jq7Var11111, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar11112;
                        function8 = function111111117;
                        function9 = function111111116;
                        z4 = z11113;
                        jq7Var2 = jq7Var11111;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 100663296;
                i14 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    } else {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    }
                    Function2<? super d, ? super Integer, Unit> function111111118 = function7;
                    boolean z11114 = z2;
                    jq7 jq7Var11112 = jq7VarG;
                    b bVar11113 = bVar2;
                    Function2<? super d, ? super Integer, Unit> function111111119 = function6;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                    }
                    dVar2 = dVarF;
                    qq7.i(function5, function1, bVar11113, function111111119, function111111118, z11114, jq7Var11112, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar11113;
                    function8 = function111111119;
                    function9 = function111111118;
                    z4 = z11114;
                    jq7Var2 = jq7Var11112;
                    rx8Var2 = rx8Var3;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    function8 = function6;
                    function9 = function7;
                    z4 = z2;
                    jq7Var2 = jq7VarG;
                    rx8Var2 = rx8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            function7 = function4;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        jq7VarG = jq7Var;
                        if (dVarF.x(jq7VarG)) {
                        }
                        i3 |= i17;
                    } else {
                        jq7VarG = jq7Var;
                    }
                    i3 |= i17;
                } else {
                    jq7VarG = jq7Var;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((i & 12582912) == 0) {
                        if (dVarF.x(rx8Var)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & 256;
                    if (i12 != 0) {
                        if ((i & 100663296) == 0) {
                            if (dVarF.x(r48Var)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        i14 = i3;
                        if ((i3 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i14 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            } else {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            }
                            Function2<? super d, ? super Integer, Unit> function1111111110 = function7;
                            boolean z11115 = z2;
                            jq7 jq7Var11113 = jq7VarG;
                            b bVar11114 = bVar2;
                            Function2<? super d, ? super Integer, Unit> function1111111111 = function6;
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                            }
                            dVar2 = dVarF;
                            qq7.i(function5, function1, bVar11114, function1111111111, function1111111110, z11115, jq7Var11113, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar11114;
                            function8 = function1111111111;
                            function9 = function1111111110;
                            z4 = z11115;
                            jq7Var2 = jq7Var11113;
                            rx8Var2 = rx8Var3;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            function8 = function6;
                            function9 = function7;
                            z4 = z2;
                            jq7Var2 = jq7VarG;
                            rx8Var2 = rx8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 100663296;
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function1111111112 = function7;
                        boolean z11116 = z2;
                        jq7 jq7Var11114 = jq7VarG;
                        b bVar11115 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function1111111113 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar11115, function1111111113, function1111111112, z11116, jq7Var11114, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar11115;
                        function8 = function1111111113;
                        function9 = function1111111112;
                        z4 = z11116;
                        jq7Var2 = jq7Var11114;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 12582912;
                i12 = i2 & 256;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.x(r48Var)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function1111111114 = function7;
                        boolean z11117 = z2;
                        jq7 jq7Var11115 = jq7VarG;
                        b bVar11116 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function1111111115 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar11116, function1111111115, function1111111114, z11117, jq7Var11115, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar11116;
                        function8 = function1111111115;
                        function9 = function1111111114;
                        z4 = z11117;
                        jq7Var2 = jq7Var11115;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 100663296;
                i14 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    } else {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    }
                    Function2<? super d, ? super Integer, Unit> function1111111116 = function7;
                    boolean z11118 = z2;
                    jq7 jq7Var11116 = jq7VarG;
                    b bVar11117 = bVar2;
                    Function2<? super d, ? super Integer, Unit> function1111111117 = function6;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                    }
                    dVar2 = dVarF;
                    qq7.i(function5, function1, bVar11117, function1111111117, function1111111116, z11118, jq7Var11116, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar11117;
                    function8 = function1111111117;
                    function9 = function1111111116;
                    z4 = z11118;
                    jq7Var2 = jq7Var11116;
                    rx8Var2 = rx8Var3;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    function8 = function6;
                    function9 = function7;
                    z4 = z2;
                    jq7Var2 = jq7VarG;
                    rx8Var2 = rx8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    jq7VarG = jq7Var;
                    if (dVarF.x(jq7VarG)) {
                    }
                    i3 |= i17;
                } else {
                    jq7VarG = jq7Var;
                }
                i3 |= i17;
            } else {
                jq7VarG = jq7Var;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                if ((i & 12582912) == 0) {
                    if (dVarF.x(rx8Var)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 256;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.x(r48Var)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function1111111118 = function7;
                        boolean z11119 = z2;
                        jq7 jq7Var11117 = jq7VarG;
                        b bVar11118 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function1111111119 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar11118, function1111111119, function1111111118, z11119, jq7Var11117, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar11118;
                        function8 = function1111111119;
                        function9 = function1111111118;
                        z4 = z11119;
                        jq7Var2 = jq7Var11117;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 100663296;
                i14 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    } else {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    }
                    Function2<? super d, ? super Integer, Unit> function11111111110 = function7;
                    boolean z111110 = z2;
                    jq7 jq7Var11118 = jq7VarG;
                    b bVar11119 = bVar2;
                    Function2<? super d, ? super Integer, Unit> function11111111111 = function6;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                    }
                    dVar2 = dVarF;
                    qq7.i(function5, function1, bVar11119, function11111111111, function11111111110, z111110, jq7Var11118, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar11119;
                    function8 = function11111111111;
                    function9 = function11111111110;
                    z4 = z111110;
                    jq7Var2 = jq7Var11118;
                    rx8Var2 = rx8Var3;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    function8 = function6;
                    function9 = function7;
                    z4 = z2;
                    jq7Var2 = jq7VarG;
                    rx8Var2 = rx8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 12582912;
            i12 = i2 & 256;
            if (i12 != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.x(r48Var)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                i14 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    } else {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    }
                    Function2<? super d, ? super Integer, Unit> function11111111112 = function7;
                    boolean z111111 = z2;
                    jq7 jq7Var11119 = jq7VarG;
                    b bVar111110 = bVar2;
                    Function2<? super d, ? super Integer, Unit> function11111111113 = function6;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                    }
                    dVar2 = dVarF;
                    qq7.i(function5, function1, bVar111110, function11111111113, function11111111112, z111111, jq7Var11119, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar111110;
                    function8 = function11111111113;
                    function9 = function11111111112;
                    z4 = z111111;
                    jq7Var2 = jq7Var11119;
                    rx8Var2 = rx8Var3;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    function8 = function6;
                    function9 = function7;
                    z4 = z2;
                    jq7Var2 = jq7VarG;
                    rx8Var2 = rx8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 100663296;
            i14 = i3;
            if ((i3 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i14 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i15 = i14 & (-3670017);
                        jq7VarG = eq7.a.g(dVarF, 6);
                    } else {
                        i15 = i14;
                    }
                    if (i10 != 0) {
                        rx8VarC = eq7.a.c();
                    } else {
                        rx8VarC = rx8Var;
                    }
                    if (i12 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    rx8Var3 = rx8VarC;
                } else {
                    if (i16 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i15 = i14 & (-3670017);
                        jq7VarG = eq7.a.g(dVarF, 6);
                    } else {
                        i15 = i14;
                    }
                    if (i10 != 0) {
                        rx8VarC = eq7.a.c();
                    } else {
                        rx8VarC = rx8Var;
                    }
                    if (i12 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    rx8Var3 = rx8VarC;
                }
                Function2<? super d, ? super Integer, Unit> function11111111114 = function7;
                boolean z111112 = z2;
                jq7 jq7Var111110 = jq7VarG;
                b bVar111111 = bVar2;
                Function2<? super d, ? super Integer, Unit> function11111111115 = function6;
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                }
                dVar2 = dVarF;
                qq7.i(function5, function1, bVar111111, function11111111115, function11111111114, z111112, jq7Var111110, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar111111;
                function8 = function11111111115;
                function9 = function11111111114;
                z4 = z111112;
                jq7Var2 = jq7Var111110;
                rx8Var2 = rx8Var3;
                r48Var2 = r48Var3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                r48Var2 = r48Var;
                bVar3 = bVar2;
                function8 = function6;
                function9 = function7;
                z4 = z2;
                jq7Var2 = jq7VarG;
                rx8Var2 = rx8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.zl
                    public final Object invoke(Object obj, Object obj2) {
                        return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        function6 = function3;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                function7 = function4;
                if (dVarF.T(function7)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        jq7VarG = jq7Var;
                        if (dVarF.x(jq7VarG)) {
                        }
                        i3 |= i17;
                    } else {
                        jq7VarG = jq7Var;
                    }
                    i3 |= i17;
                } else {
                    jq7VarG = jq7Var;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((i & 12582912) == 0) {
                        if (dVarF.x(rx8Var)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & 256;
                    if (i12 != 0) {
                        if ((i & 100663296) == 0) {
                            if (dVarF.x(r48Var)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        i14 = i3;
                        if ((i3 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i14 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            } else {
                                if (i16 != 0) {
                                    bVar2 = b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function6 = null;
                                }
                                if (i6 != 0) {
                                    function7 = null;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i15 = i14 & (-3670017);
                                    jq7VarG = eq7.a.g(dVarF, 6);
                                } else {
                                    i15 = i14;
                                }
                                if (i10 != 0) {
                                    rx8VarC = eq7.a.c();
                                } else {
                                    rx8VarC = rx8Var;
                                }
                                if (i12 != 0) {
                                    r48Var3 = null;
                                } else {
                                    r48Var3 = r48Var;
                                }
                                rx8Var3 = rx8VarC;
                            }
                            Function2<? super d, ? super Integer, Unit> function11111111116 = function7;
                            boolean z111113 = z2;
                            jq7 jq7Var111111 = jq7VarG;
                            b bVar111112 = bVar2;
                            Function2<? super d, ? super Integer, Unit> function11111111117 = function6;
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                            }
                            dVar2 = dVarF;
                            qq7.i(function5, function1, bVar111112, function11111111117, function11111111116, z111113, jq7Var111111, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar111112;
                            function8 = function11111111117;
                            function9 = function11111111116;
                            z4 = z111113;
                            jq7Var2 = jq7Var111111;
                            rx8Var2 = rx8Var3;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            function8 = function6;
                            function9 = function7;
                            z4 = z2;
                            jq7Var2 = jq7VarG;
                            rx8Var2 = rx8Var;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.zl
                                public final Object invoke(Object obj, Object obj2) {
                                    return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 100663296;
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function11111111118 = function7;
                        boolean z111114 = z2;
                        jq7 jq7Var111112 = jq7VarG;
                        b bVar111113 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function11111111119 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar111113, function11111111119, function11111111118, z111114, jq7Var111112, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar111113;
                        function8 = function11111111119;
                        function9 = function11111111118;
                        z4 = z111114;
                        jq7Var2 = jq7Var111112;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 12582912;
                i12 = i2 & 256;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.x(r48Var)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function111111111110 = function7;
                        boolean z111115 = z2;
                        jq7 jq7Var111113 = jq7VarG;
                        b bVar111114 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function111111111111 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar111114, function111111111111, function111111111110, z111115, jq7Var111113, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar111114;
                        function8 = function111111111111;
                        function9 = function111111111110;
                        z4 = z111115;
                        jq7Var2 = jq7Var111113;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 100663296;
                i14 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    } else {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    }
                    Function2<? super d, ? super Integer, Unit> function111111111112 = function7;
                    boolean z111116 = z2;
                    jq7 jq7Var111114 = jq7VarG;
                    b bVar111115 = bVar2;
                    Function2<? super d, ? super Integer, Unit> function111111111113 = function6;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                    }
                    dVar2 = dVarF;
                    qq7.i(function5, function1, bVar111115, function111111111113, function111111111112, z111116, jq7Var111114, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar111115;
                    function8 = function111111111113;
                    function9 = function111111111112;
                    z4 = z111116;
                    jq7Var2 = jq7Var111114;
                    rx8Var2 = rx8Var3;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    function8 = function6;
                    function9 = function7;
                    z4 = z2;
                    jq7Var2 = jq7VarG;
                    rx8Var2 = rx8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    jq7VarG = jq7Var;
                    if (dVarF.x(jq7VarG)) {
                    }
                    i3 |= i17;
                } else {
                    jq7VarG = jq7Var;
                }
                i3 |= i17;
            } else {
                jq7VarG = jq7Var;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                if ((i & 12582912) == 0) {
                    if (dVarF.x(rx8Var)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 256;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.x(r48Var)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function111111111114 = function7;
                        boolean z111117 = z2;
                        jq7 jq7Var111115 = jq7VarG;
                        b bVar111116 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function111111111115 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar111116, function111111111115, function111111111114, z111117, jq7Var111115, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar111116;
                        function8 = function111111111115;
                        function9 = function111111111114;
                        z4 = z111117;
                        jq7Var2 = jq7Var111115;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 100663296;
                i14 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    } else {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    }
                    Function2<? super d, ? super Integer, Unit> function111111111116 = function7;
                    boolean z111118 = z2;
                    jq7 jq7Var111116 = jq7VarG;
                    b bVar111117 = bVar2;
                    Function2<? super d, ? super Integer, Unit> function111111111117 = function6;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                    }
                    dVar2 = dVarF;
                    qq7.i(function5, function1, bVar111117, function111111111117, function111111111116, z111118, jq7Var111116, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar111117;
                    function8 = function111111111117;
                    function9 = function111111111116;
                    z4 = z111118;
                    jq7Var2 = jq7Var111116;
                    rx8Var2 = rx8Var3;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    function8 = function6;
                    function9 = function7;
                    z4 = z2;
                    jq7Var2 = jq7VarG;
                    rx8Var2 = rx8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 12582912;
            i12 = i2 & 256;
            if (i12 != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.x(r48Var)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                i14 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    } else {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    }
                    Function2<? super d, ? super Integer, Unit> function111111111118 = function7;
                    boolean z111119 = z2;
                    jq7 jq7Var111117 = jq7VarG;
                    b bVar111118 = bVar2;
                    Function2<? super d, ? super Integer, Unit> function111111111119 = function6;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                    }
                    dVar2 = dVarF;
                    qq7.i(function5, function1, bVar111118, function111111111119, function111111111118, z111119, jq7Var111117, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar111118;
                    function8 = function111111111119;
                    function9 = function111111111118;
                    z4 = z111119;
                    jq7Var2 = jq7Var111117;
                    rx8Var2 = rx8Var3;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    function8 = function6;
                    function9 = function7;
                    z4 = z2;
                    jq7Var2 = jq7VarG;
                    rx8Var2 = rx8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 100663296;
            i14 = i3;
            if ((i3 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i14 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i15 = i14 & (-3670017);
                        jq7VarG = eq7.a.g(dVarF, 6);
                    } else {
                        i15 = i14;
                    }
                    if (i10 != 0) {
                        rx8VarC = eq7.a.c();
                    } else {
                        rx8VarC = rx8Var;
                    }
                    if (i12 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    rx8Var3 = rx8VarC;
                } else {
                    if (i16 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i15 = i14 & (-3670017);
                        jq7VarG = eq7.a.g(dVarF, 6);
                    } else {
                        i15 = i14;
                    }
                    if (i10 != 0) {
                        rx8VarC = eq7.a.c();
                    } else {
                        rx8VarC = rx8Var;
                    }
                    if (i12 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    rx8Var3 = rx8VarC;
                }
                Function2<? super d, ? super Integer, Unit> function1111111111110 = function7;
                boolean z1111110 = z2;
                jq7 jq7Var111118 = jq7VarG;
                b bVar111119 = bVar2;
                Function2<? super d, ? super Integer, Unit> function1111111111111 = function6;
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                }
                dVar2 = dVarF;
                qq7.i(function5, function1, bVar111119, function1111111111111, function1111111111110, z1111110, jq7Var111118, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar111119;
                function8 = function1111111111111;
                function9 = function1111111111110;
                z4 = z1111110;
                jq7Var2 = jq7Var111118;
                rx8Var2 = rx8Var3;
                r48Var2 = r48Var3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                r48Var2 = r48Var;
                bVar3 = bVar2;
                function8 = function6;
                function9 = function7;
                z4 = z2;
                jq7Var2 = jq7VarG;
                rx8Var2 = rx8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.zl
                    public final Object invoke(Object obj, Object obj2) {
                        return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        function7 = function4;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (dVarF.A(z2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    jq7VarG = jq7Var;
                    if (dVarF.x(jq7VarG)) {
                    }
                    i3 |= i17;
                } else {
                    jq7VarG = jq7Var;
                }
                i3 |= i17;
            } else {
                jq7VarG = jq7Var;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                if ((i & 12582912) == 0) {
                    if (dVarF.x(rx8Var)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 256;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.x(r48Var)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    i14 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        } else {
                            if (i16 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i15 = i14 & (-3670017);
                                jq7VarG = eq7.a.g(dVarF, 6);
                            } else {
                                i15 = i14;
                            }
                            if (i10 != 0) {
                                rx8VarC = eq7.a.c();
                            } else {
                                rx8VarC = rx8Var;
                            }
                            if (i12 != 0) {
                                r48Var3 = null;
                            } else {
                                r48Var3 = r48Var;
                            }
                            rx8Var3 = rx8VarC;
                        }
                        Function2<? super d, ? super Integer, Unit> function1111111111112 = function7;
                        boolean z1111111 = z2;
                        jq7 jq7Var111119 = jq7VarG;
                        b bVar1111110 = bVar2;
                        Function2<? super d, ? super Integer, Unit> function1111111111113 = function6;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                        }
                        dVar2 = dVarF;
                        qq7.i(function5, function1, bVar1111110, function1111111111113, function1111111111112, z1111111, jq7Var111119, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar1111110;
                        function8 = function1111111111113;
                        function9 = function1111111111112;
                        z4 = z1111111;
                        jq7Var2 = jq7Var111119;
                        rx8Var2 = rx8Var3;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        function8 = function6;
                        function9 = function7;
                        z4 = z2;
                        jq7Var2 = jq7VarG;
                        rx8Var2 = rx8Var;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.zl
                            public final Object invoke(Object obj, Object obj2) {
                                return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 100663296;
                i14 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    } else {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    }
                    Function2<? super d, ? super Integer, Unit> function1111111111114 = function7;
                    boolean z1111112 = z2;
                    jq7 jq7Var1111110 = jq7VarG;
                    b bVar1111111 = bVar2;
                    Function2<? super d, ? super Integer, Unit> function1111111111115 = function6;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                    }
                    dVar2 = dVarF;
                    qq7.i(function5, function1, bVar1111111, function1111111111115, function1111111111114, z1111112, jq7Var1111110, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar1111111;
                    function8 = function1111111111115;
                    function9 = function1111111111114;
                    z4 = z1111112;
                    jq7Var2 = jq7Var1111110;
                    rx8Var2 = rx8Var3;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    function8 = function6;
                    function9 = function7;
                    z4 = z2;
                    jq7Var2 = jq7VarG;
                    rx8Var2 = rx8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 12582912;
            i12 = i2 & 256;
            if (i12 != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.x(r48Var)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                i14 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    } else {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    }
                    Function2<? super d, ? super Integer, Unit> function1111111111116 = function7;
                    boolean z1111113 = z2;
                    jq7 jq7Var1111111 = jq7VarG;
                    b bVar1111112 = bVar2;
                    Function2<? super d, ? super Integer, Unit> function1111111111117 = function6;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                    }
                    dVar2 = dVarF;
                    qq7.i(function5, function1, bVar1111112, function1111111111117, function1111111111116, z1111113, jq7Var1111111, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar1111112;
                    function8 = function1111111111117;
                    function9 = function1111111111116;
                    z4 = z1111113;
                    jq7Var2 = jq7Var1111111;
                    rx8Var2 = rx8Var3;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    function8 = function6;
                    function9 = function7;
                    z4 = z2;
                    jq7Var2 = jq7VarG;
                    rx8Var2 = rx8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 100663296;
            i14 = i3;
            if ((i3 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i14 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i15 = i14 & (-3670017);
                        jq7VarG = eq7.a.g(dVarF, 6);
                    } else {
                        i15 = i14;
                    }
                    if (i10 != 0) {
                        rx8VarC = eq7.a.c();
                    } else {
                        rx8VarC = rx8Var;
                    }
                    if (i12 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    rx8Var3 = rx8VarC;
                } else {
                    if (i16 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i15 = i14 & (-3670017);
                        jq7VarG = eq7.a.g(dVarF, 6);
                    } else {
                        i15 = i14;
                    }
                    if (i10 != 0) {
                        rx8VarC = eq7.a.c();
                    } else {
                        rx8VarC = rx8Var;
                    }
                    if (i12 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    rx8Var3 = rx8VarC;
                }
                Function2<? super d, ? super Integer, Unit> function1111111111118 = function7;
                boolean z1111114 = z2;
                jq7 jq7Var1111112 = jq7VarG;
                b bVar1111113 = bVar2;
                Function2<? super d, ? super Integer, Unit> function1111111111119 = function6;
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                }
                dVar2 = dVarF;
                qq7.i(function5, function1, bVar1111113, function1111111111119, function1111111111118, z1111114, jq7Var1111112, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar1111113;
                function8 = function1111111111119;
                function9 = function1111111111118;
                z4 = z1111114;
                jq7Var2 = jq7Var1111112;
                rx8Var2 = rx8Var3;
                r48Var2 = r48Var3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                r48Var2 = r48Var;
                bVar3 = bVar2;
                function8 = function6;
                function9 = function7;
                z4 = z2;
                jq7Var2 = jq7VarG;
                rx8Var2 = rx8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.zl
                    public final Object invoke(Object obj, Object obj2) {
                        return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 196608;
        z2 = z;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                jq7VarG = jq7Var;
                if (dVarF.x(jq7VarG)) {
                }
                i3 |= i17;
            } else {
                jq7VarG = jq7Var;
            }
            i3 |= i17;
        } else {
            jq7VarG = jq7Var;
        }
        i10 = i2 & 128;
        if (i10 != 0) {
            if ((i & 12582912) == 0) {
                if (dVarF.x(rx8Var)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
            i12 = i2 & 256;
            if (i12 != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.x(r48Var)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                i14 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    } else {
                        if (i16 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i15 = i14 & (-3670017);
                            jq7VarG = eq7.a.g(dVarF, 6);
                        } else {
                            i15 = i14;
                        }
                        if (i10 != 0) {
                            rx8VarC = eq7.a.c();
                        } else {
                            rx8VarC = rx8Var;
                        }
                        if (i12 != 0) {
                            r48Var3 = null;
                        } else {
                            r48Var3 = r48Var;
                        }
                        rx8Var3 = rx8VarC;
                    }
                    Function2<? super d, ? super Integer, Unit> function11111111111110 = function7;
                    boolean z1111115 = z2;
                    jq7 jq7Var1111113 = jq7VarG;
                    b bVar1111114 = bVar2;
                    Function2<? super d, ? super Integer, Unit> function11111111111111 = function6;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                    }
                    dVar2 = dVarF;
                    qq7.i(function5, function1, bVar1111114, function11111111111111, function11111111111110, z1111115, jq7Var1111113, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar1111114;
                    function8 = function11111111111111;
                    function9 = function11111111111110;
                    z4 = z1111115;
                    jq7Var2 = jq7Var1111113;
                    rx8Var2 = rx8Var3;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    function8 = function6;
                    function9 = function7;
                    z4 = z2;
                    jq7Var2 = jq7VarG;
                    rx8Var2 = rx8Var;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.zl
                        public final Object invoke(Object obj, Object obj2) {
                            return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 100663296;
            i14 = i3;
            if ((i3 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i14 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i15 = i14 & (-3670017);
                        jq7VarG = eq7.a.g(dVarF, 6);
                    } else {
                        i15 = i14;
                    }
                    if (i10 != 0) {
                        rx8VarC = eq7.a.c();
                    } else {
                        rx8VarC = rx8Var;
                    }
                    if (i12 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    rx8Var3 = rx8VarC;
                } else {
                    if (i16 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i15 = i14 & (-3670017);
                        jq7VarG = eq7.a.g(dVarF, 6);
                    } else {
                        i15 = i14;
                    }
                    if (i10 != 0) {
                        rx8VarC = eq7.a.c();
                    } else {
                        rx8VarC = rx8Var;
                    }
                    if (i12 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    rx8Var3 = rx8VarC;
                }
                Function2<? super d, ? super Integer, Unit> function11111111111112 = function7;
                boolean z1111116 = z2;
                jq7 jq7Var1111114 = jq7VarG;
                b bVar1111115 = bVar2;
                Function2<? super d, ? super Integer, Unit> function11111111111113 = function6;
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                }
                dVar2 = dVarF;
                qq7.i(function5, function1, bVar1111115, function11111111111113, function11111111111112, z1111116, jq7Var1111114, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar1111115;
                function8 = function11111111111113;
                function9 = function11111111111112;
                z4 = z1111116;
                jq7Var2 = jq7Var1111114;
                rx8Var2 = rx8Var3;
                r48Var2 = r48Var3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                r48Var2 = r48Var;
                bVar3 = bVar2;
                function8 = function6;
                function9 = function7;
                z4 = z2;
                jq7Var2 = jq7VarG;
                rx8Var2 = rx8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.zl
                    public final Object invoke(Object obj, Object obj2) {
                        return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 12582912;
        i12 = i2 & 256;
        if (i12 != 0) {
            if ((i & 100663296) == 0) {
                if (dVarF.x(r48Var)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i3 |= i13;
            }
            i14 = i3;
            if ((i3 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i14 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i15 = i14 & (-3670017);
                        jq7VarG = eq7.a.g(dVarF, 6);
                    } else {
                        i15 = i14;
                    }
                    if (i10 != 0) {
                        rx8VarC = eq7.a.c();
                    } else {
                        rx8VarC = rx8Var;
                    }
                    if (i12 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    rx8Var3 = rx8VarC;
                } else {
                    if (i16 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i15 = i14 & (-3670017);
                        jq7VarG = eq7.a.g(dVarF, 6);
                    } else {
                        i15 = i14;
                    }
                    if (i10 != 0) {
                        rx8VarC = eq7.a.c();
                    } else {
                        rx8VarC = rx8Var;
                    }
                    if (i12 != 0) {
                        r48Var3 = null;
                    } else {
                        r48Var3 = r48Var;
                    }
                    rx8Var3 = rx8VarC;
                }
                Function2<? super d, ? super Integer, Unit> function11111111111114 = function7;
                boolean z1111117 = z2;
                jq7 jq7Var1111115 = jq7VarG;
                b bVar1111116 = bVar2;
                Function2<? super d, ? super Integer, Unit> function11111111111115 = function6;
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                }
                dVar2 = dVarF;
                qq7.i(function5, function1, bVar1111116, function11111111111115, function11111111111114, z1111117, jq7Var1111115, rx8Var3, r48Var3, dVar2, i15 & 268435454);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar1111116;
                function8 = function11111111111115;
                function9 = function11111111111114;
                z4 = z1111117;
                jq7Var2 = jq7Var1111115;
                rx8Var2 = rx8Var3;
                r48Var2 = r48Var3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                r48Var2 = r48Var;
                bVar3 = bVar2;
                function8 = function6;
                function9 = function7;
                z4 = z2;
                jq7Var2 = jq7VarG;
                rx8Var2 = rx8Var;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.zl
                    public final Object invoke(Object obj, Object obj2) {
                        return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 100663296;
        i14 = i3;
        if ((i3 & 38347923) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dVarF.g(z3, i14 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    bVar2 = b.INSTANCE;
                }
                if (i4 != 0) {
                    function6 = null;
                }
                if (i6 != 0) {
                    function7 = null;
                }
                if (i8 != 0) {
                    z2 = true;
                }
                if ((i2 & 64) != 0) {
                    i15 = i14 & (-3670017);
                    jq7VarG = eq7.a.g(dVarF, 6);
                } else {
                    i15 = i14;
                }
                if (i10 != 0) {
                    rx8VarC = eq7.a.c();
                } else {
                    rx8VarC = rx8Var;
                }
                if (i12 != 0) {
                    r48Var3 = null;
                } else {
                    r48Var3 = r48Var;
                }
                rx8Var3 = rx8VarC;
            } else {
                if (i16 != 0) {
                    bVar2 = b.INSTANCE;
                }
                if (i4 != 0) {
                    function6 = null;
                }
                if (i6 != 0) {
                    function7 = null;
                }
                if (i8 != 0) {
                    z2 = true;
                }
                if ((i2 & 64) != 0) {
                    i15 = i14 & (-3670017);
                    jq7VarG = eq7.a.g(dVarF, 6);
                } else {
                    i15 = i14;
                }
                if (i10 != 0) {
                    rx8VarC = eq7.a.c();
                } else {
                    rx8VarC = rx8Var;
                }
                if (i12 != 0) {
                    r48Var3 = null;
                } else {
                    r48Var3 = r48Var;
                }
                rx8Var3 = rx8VarC;
            }
            Function2<? super d, ? super Integer, Unit> function11111111111116 = function7;
            boolean z1111118 = z2;
            jq7 jq7Var1111116 = jq7VarG;
            b bVar1111117 = bVar2;
            Function2<? super d, ? super Integer, Unit> function11111111111117 = function6;
            dVarF.M();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-532959117, i15, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
            }
            dVar2 = dVarF;
            qq7.i(function5, function1, bVar1111117, function11111111111117, function11111111111116, z1111118, jq7Var1111116, rx8Var3, r48Var3, dVar2, i15 & 268435454);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            bVar3 = bVar1111117;
            function8 = function11111111111117;
            function9 = function11111111111116;
            z4 = z1111118;
            jq7Var2 = jq7Var1111116;
            rx8Var2 = rx8Var3;
            r48Var2 = r48Var3;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            r48Var2 = r48Var;
            bVar3 = bVar2;
            function8 = function6;
            function9 = function7;
            z4 = z2;
            jq7Var2 = jq7VarG;
            rx8Var2 = rx8Var;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.zl
                public final Object invoke(Object obj, Object obj2) {
                    return am.f(function2, function0, bVar3, function8, function9, z4, jq7Var2, rx8Var2, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function2 function2, Function0 function0, b bVar, Function2 function3, Function2 function4, boolean z, jq7 jq7Var, rx8 rx8Var, r48 r48Var, int i, int i2, d dVar, int i3) {
        e(function2, function0, bVar, function3, function4, z, jq7Var, rx8Var, r48Var, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(o58 o58Var, k16 k16Var, k16 k16Var2) {
        o58Var.setValue(t.b(qq7.l(k16Var, k16Var2)));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit h(boolean z, Function0 function0, b bVar, long j, v9b v9bVar, sg9 sg9Var, xkb xkbVar, long j2, float f, float f2, BorderStroke borderStroke, ps4 ps4Var, int i, int i2, int i3, d dVar, int i4) throws NoWhenBranchMatchedException {
        d(z, function0, bVar, j, v9bVar, sg9Var, xkbVar, j2, f, f2, borderStroke, ps4Var, dVar, saa.a(i | 1), saa.a(i2), i3);
        return Unit.a;
    }
}
