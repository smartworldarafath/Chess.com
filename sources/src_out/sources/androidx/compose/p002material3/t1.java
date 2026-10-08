package androidx.compose.p002material3;

import androidx.compose.p001foundation.BackgroundKt;
import androidx.compose.p001foundation.IndicationKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p002material3.t1;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.inputmethod.c9d;
import com.google.inputmethod.cz1;
import com.google.inputmethod.d08;
import com.google.inputmethod.dud;
import com.google.inputmethod.dwb;
import com.google.inputmethod.ei1;
import com.google.inputmethod.ej7;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fs1;
import com.google.inputmethod.gr0;
import com.google.inputmethod.gs1;
import com.google.inputmethod.hpa;
import com.google.inputmethod.j26;
import com.google.inputmethod.k26;
import com.google.inputmethod.os9;
import com.google.inputmethod.pp1;
import com.google.inputmethod.r48;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.shc;
import com.google.inputmethod.tc;
import com.google.inputmethod.thc;
import com.google.inputmethod.ulb;
import com.google.inputmethod.whc;
import com.google.inputmethod.xkb;
import com.google.inputmethod.xoa;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001ai\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aO\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001d\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0014\u0010\u001e\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017\"\u0014\u0010 \u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017\"\u0014\u0010!\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017\"\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/b;", "modifier", "Lkotlin/Function0;", "thumbContent", "enabled", "Lcom/google/android/shc;", "colors", "Lcom/google/android/r48;", "interactionSource", "c", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;ZLcom/google/android/shc;Lcom/google/android/r48;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/j26;", "Lcom/google/android/xkb;", "thumbShape", "e", "(Landroidx/compose/ui/b;ZZLcom/google/android/shc;Lkotlin/jvm/functions/Function2;Lcom/google/android/j26;Lcom/google/android/xkb;Landroidx/compose/runtime/d;I)V", "Lcom/google/android/ff3;", "a", "F", "k", "()F", "ThumbDiameter", "b", "l", "UncheckedThumbDiameter", "SwitchWidth", "d", "SwitchHeight", "ThumbPadding", "Lcom/google/android/dwb;", "", "f", "Lcom/google/android/dwb;", "SnapSpec", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class t1 {
    private static final float a;
    private static final float b;
    private static final float c;
    private static final float d;
    private static final float e;
    private static final dwb<Float> f;

    static {
        whc whcVar = whc.a;
        float fP = whcVar.p();
        a = fP;
        b = whcVar.z();
        c = whcVar.w();
        float fT = whcVar.t();
        d = fT;
        e = ff3.i(ff3.i(fT - fP) / 2);
        f = new dwb<>(0, 1, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:102:0x011a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0125  */
    /* JADX WARN: Code duplicated, block: B:106:0x012d  */
    /* JADX WARN: Code duplicated, block: B:109:0x013c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0147  */
    /* JADX WARN: Code duplicated, block: B:113:0x0159  */
    /* JADX WARN: Code duplicated, block: B:115:0x0167  */
    /* JADX WARN: Code duplicated, block: B:117:0x0174  */
    /* JADX WARN: Code duplicated, block: B:118:0x0191  */
    /* JADX WARN: Code duplicated, block: B:121:0x01da  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0111  */
    /* JADX WARN: Code duplicated, block: B:99:0x0114  */
    public static final void c(final boolean z, final Function1<? super Boolean, Unit> function1, b bVar, Function2<? super d, ? super Integer, Unit> function2, boolean z2, shc shcVar, r48 r48Var, d dVar, final int i, final int i2) throws NoWhenBranchMatchedException {
        boolean z3;
        int i3;
        b bVar2;
        int i4;
        Function2<? super d, ? super Integer, Unit> function3;
        int i5;
        int i6;
        boolean z4;
        int i7;
        shc shcVarA;
        int i8;
        r48 r48Var2;
        int i9;
        boolean z5;
        d dVar2;
        final b bVar3;
        final Function2<? super d, ? super Integer, Unit> function4;
        final boolean z6;
        final shc shcVar2;
        final r48 r48Var3;
        s6b s6bVarH;
        b bVar4;
        r48 r48Var4;
        Function2<? super d, ? super Integer, Unit> function5;
        b bVar5;
        r48 r48Var5;
        boolean z7;
        boolean z8;
        b bVarA;
        Object objR;
        d dVarF = dVar.F(-263339167);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else if ((i & 6) == 0) {
            z3 = z;
            i3 = (dVarF.A(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dVarF.T(function1) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function3 = function2;
                    if (dVarF.T(function3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        z4 = z2;
                        if (dVarF.A(z4)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            shcVarA = shcVar;
                            int i11 = dVarF.x(shcVarA) ? 131072 : 65536;
                            i3 |= i11;
                        } else {
                            shcVarA = shcVar;
                        }
                        i3 |= i11;
                    } else {
                        shcVarA = shcVar;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((1572864 & i) == 0) {
                            r48Var2 = r48Var;
                            if (dVarF.x(r48Var2)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        if ((i3 & 599187) != 599186) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (dVarF.g(z5, i3 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0 || dVarF.t()) {
                                if (i10 != 0) {
                                    bVar4 = b.INSTANCE;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if (i4 != 0) {
                                    function3 = null;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    shcVarA = thc.a.a(dVarF, 6);
                                }
                                if (i8 != 0) {
                                    r48Var4 = null;
                                } else {
                                    r48Var4 = r48Var2;
                                }
                                function5 = function3;
                                bVar5 = bVar4;
                            } else {
                                dVarF.q();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                i3 = i3;
                                z4 = z4;
                                shcVarA = shcVarA;
                                r48Var4 = r48Var2;
                                function5 = function3;
                                bVar5 = bVar2;
                            }
                            dVarF.M();
                            if (e.k()) {
                                e.o(-263339167, i3, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                            }
                            if (r48Var4 == null) {
                                dVarF.y(1768604058);
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = k26.a();
                                    dVarF.L(objR);
                                }
                                dVarF.u();
                                r48Var5 = (r48) objR;
                            } else {
                                dVarF.y(334145757);
                                dVarF.u();
                                r48Var5 = r48Var4;
                            }
                            if (function1 != null) {
                                z7 = z4;
                                z8 = false;
                                bVarA = c9d.a(InteractiveComponentSizeKt.h(b.INSTANCE), z3, r48Var5, null, z7, hpa.j(hpa.INSTANCE.g()), function1);
                            } else {
                                z7 = z4;
                                z8 = false;
                                bVarA = b.INSTANCE;
                            }
                            int i12 = i3 << 3;
                            int i13 = i3 >> 6;
                            dVar2 = dVarF;
                            b bVar6 = bVar5;
                            e(SizeKt.n(SizeKt.E(bVar5.then(bVarA), tc.INSTANCE.e(), z8, 2, null), c, d), z, z7, shcVarA, function5, r48Var5, ulb.i(whc.a.m(), dVarF, 6), dVar2, (i12 & 112) | (i13 & 896) | (i13 & 7168) | (i12 & 57344));
                            if (e.k()) {
                                e.n();
                            }
                            bVar3 = bVar6;
                            z6 = z7;
                            shcVar2 = shcVarA;
                            function4 = function5;
                            r48Var3 = r48Var4;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            bVar3 = bVar2;
                            function4 = function3;
                            z6 = z4;
                            shcVar2 = shcVarA;
                            r48Var3 = r48Var2;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.uhc
                                public final Object invoke(Object obj, Object obj2) {
                                    return t1.d(z, function1, bVar3, function4, z6, shcVar2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 1572864;
                    r48Var2 = r48Var;
                    if ((i3 & 599187) != 599186) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                function3 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                shcVarA = thc.a.a(dVarF, 6);
                            }
                            if (i8 != 0) {
                                r48Var4 = null;
                            } else {
                                r48Var4 = r48Var2;
                            }
                            function5 = function3;
                            bVar5 = bVar4;
                        } else {
                            if (i10 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                function3 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                shcVarA = thc.a.a(dVarF, 6);
                            }
                            if (i8 != 0) {
                                r48Var4 = null;
                            } else {
                                r48Var4 = r48Var2;
                            }
                            function5 = function3;
                            bVar5 = bVar4;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(-263339167, i3, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                        }
                        if (r48Var4 == null) {
                            dVarF.y(1768604058);
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = k26.a();
                                dVarF.L(objR);
                            }
                            dVarF.u();
                            r48Var5 = (r48) objR;
                        } else {
                            dVarF.y(334145757);
                            dVarF.u();
                            r48Var5 = r48Var4;
                        }
                        if (function1 != null) {
                            z7 = z4;
                            z8 = false;
                            bVarA = c9d.a(InteractiveComponentSizeKt.h(b.INSTANCE), z3, r48Var5, null, z7, hpa.j(hpa.INSTANCE.g()), function1);
                        } else {
                            z7 = z4;
                            z8 = false;
                            bVarA = b.INSTANCE;
                        }
                        int i14 = i3 << 3;
                        int i15 = i3 >> 6;
                        dVar2 = dVarF;
                        b bVar7 = bVar5;
                        e(SizeKt.n(SizeKt.E(bVar5.then(bVarA), tc.INSTANCE.e(), z8, 2, null), c, d), z, z7, shcVarA, function5, r48Var5, ulb.i(whc.a.m(), dVarF, 6), dVar2, (i14 & 112) | (i15 & 896) | (i15 & 7168) | (i14 & 57344));
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar7;
                        z6 = z7;
                        shcVar2 = shcVarA;
                        function4 = function5;
                        r48Var3 = r48Var4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar3 = bVar2;
                        function4 = function3;
                        z6 = z4;
                        shcVar2 = shcVarA;
                        r48Var3 = r48Var2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.uhc
                            public final Object invoke(Object obj, Object obj2) {
                                return t1.d(z, function1, bVar3, function4, z6, shcVar2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                z4 = z2;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        shcVarA = shcVar;
                        if (dVarF.x(shcVarA)) {
                        }
                        i3 |= i11;
                    } else {
                        shcVarA = shcVar;
                    }
                    i3 |= i11;
                } else {
                    shcVarA = shcVar;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        r48Var2 = r48Var;
                        if (dVarF.x(r48Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 599187) != 599186) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                function3 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                shcVarA = thc.a.a(dVarF, 6);
                            }
                            if (i8 != 0) {
                                r48Var4 = null;
                            } else {
                                r48Var4 = r48Var2;
                            }
                            function5 = function3;
                            bVar5 = bVar4;
                        } else {
                            if (i10 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                function3 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                shcVarA = thc.a.a(dVarF, 6);
                            }
                            if (i8 != 0) {
                                r48Var4 = null;
                            } else {
                                r48Var4 = r48Var2;
                            }
                            function5 = function3;
                            bVar5 = bVar4;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(-263339167, i3, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                        }
                        if (r48Var4 == null) {
                            dVarF.y(1768604058);
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = k26.a();
                                dVarF.L(objR);
                            }
                            dVarF.u();
                            r48Var5 = (r48) objR;
                        } else {
                            dVarF.y(334145757);
                            dVarF.u();
                            r48Var5 = r48Var4;
                        }
                        if (function1 != null) {
                            z7 = z4;
                            z8 = false;
                            bVarA = c9d.a(InteractiveComponentSizeKt.h(b.INSTANCE), z3, r48Var5, null, z7, hpa.j(hpa.INSTANCE.g()), function1);
                        } else {
                            z7 = z4;
                            z8 = false;
                            bVarA = b.INSTANCE;
                        }
                        int i16 = i3 << 3;
                        int i17 = i3 >> 6;
                        dVar2 = dVarF;
                        b bVar8 = bVar5;
                        e(SizeKt.n(SizeKt.E(bVar5.then(bVarA), tc.INSTANCE.e(), z8, 2, null), c, d), z, z7, shcVarA, function5, r48Var5, ulb.i(whc.a.m(), dVarF, 6), dVar2, (i16 & 112) | (i17 & 896) | (i17 & 7168) | (i16 & 57344));
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar8;
                        z6 = z7;
                        shcVar2 = shcVarA;
                        function4 = function5;
                        r48Var3 = r48Var4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar3 = bVar2;
                        function4 = function3;
                        z6 = z4;
                        shcVar2 = shcVarA;
                        r48Var3 = r48Var2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.uhc
                            public final Object invoke(Object obj, Object obj2) {
                                return t1.d(z, function1, bVar3, function4, z6, shcVar2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 1572864;
                r48Var2 = r48Var;
                if ((i3 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            shcVarA = thc.a.a(dVarF, 6);
                        }
                        if (i8 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        function5 = function3;
                        bVar5 = bVar4;
                    } else {
                        if (i10 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            shcVarA = thc.a.a(dVarF, 6);
                        }
                        if (i8 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        function5 = function3;
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-263339167, i3, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (r48Var4 == null) {
                        dVarF.y(1768604058);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = k26.a();
                            dVarF.L(objR);
                        }
                        dVarF.u();
                        r48Var5 = (r48) objR;
                    } else {
                        dVarF.y(334145757);
                        dVarF.u();
                        r48Var5 = r48Var4;
                    }
                    if (function1 != null) {
                        z7 = z4;
                        z8 = false;
                        bVarA = c9d.a(InteractiveComponentSizeKt.h(b.INSTANCE), z3, r48Var5, null, z7, hpa.j(hpa.INSTANCE.g()), function1);
                    } else {
                        z7 = z4;
                        z8 = false;
                        bVarA = b.INSTANCE;
                    }
                    int i18 = i3 << 3;
                    int i19 = i3 >> 6;
                    dVar2 = dVarF;
                    b bVar9 = bVar5;
                    e(SizeKt.n(SizeKt.E(bVar5.then(bVarA), tc.INSTANCE.e(), z8, 2, null), c, d), z, z7, shcVarA, function5, r48Var5, ulb.i(whc.a.m(), dVarF, 6), dVar2, (i18 & 112) | (i19 & 896) | (i19 & 7168) | (i18 & 57344));
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar9;
                    z6 = z7;
                    shcVar2 = shcVarA;
                    function4 = function5;
                    r48Var3 = r48Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    function4 = function3;
                    z6 = z4;
                    shcVar2 = shcVarA;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.uhc
                        public final Object invoke(Object obj, Object obj2) {
                            return t1.d(z, function1, bVar3, function4, z6, shcVar2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            function3 = function2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    z4 = z2;
                    if (dVarF.A(z4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        shcVarA = shcVar;
                        if (dVarF.x(shcVarA)) {
                        }
                        i3 |= i11;
                    } else {
                        shcVarA = shcVar;
                    }
                    i3 |= i11;
                } else {
                    shcVarA = shcVar;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        r48Var2 = r48Var;
                        if (dVarF.x(r48Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 599187) != 599186) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                function3 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                shcVarA = thc.a.a(dVarF, 6);
                            }
                            if (i8 != 0) {
                                r48Var4 = null;
                            } else {
                                r48Var4 = r48Var2;
                            }
                            function5 = function3;
                            bVar5 = bVar4;
                        } else {
                            if (i10 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                function3 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                shcVarA = thc.a.a(dVarF, 6);
                            }
                            if (i8 != 0) {
                                r48Var4 = null;
                            } else {
                                r48Var4 = r48Var2;
                            }
                            function5 = function3;
                            bVar5 = bVar4;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(-263339167, i3, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                        }
                        if (r48Var4 == null) {
                            dVarF.y(1768604058);
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = k26.a();
                                dVarF.L(objR);
                            }
                            dVarF.u();
                            r48Var5 = (r48) objR;
                        } else {
                            dVarF.y(334145757);
                            dVarF.u();
                            r48Var5 = r48Var4;
                        }
                        if (function1 != null) {
                            z7 = z4;
                            z8 = false;
                            bVarA = c9d.a(InteractiveComponentSizeKt.h(b.INSTANCE), z3, r48Var5, null, z7, hpa.j(hpa.INSTANCE.g()), function1);
                        } else {
                            z7 = z4;
                            z8 = false;
                            bVarA = b.INSTANCE;
                        }
                        int i110 = i3 << 3;
                        int i111 = i3 >> 6;
                        dVar2 = dVarF;
                        b bVar10 = bVar5;
                        e(SizeKt.n(SizeKt.E(bVar5.then(bVarA), tc.INSTANCE.e(), z8, 2, null), c, d), z, z7, shcVarA, function5, r48Var5, ulb.i(whc.a.m(), dVarF, 6), dVar2, (i110 & 112) | (i111 & 896) | (i111 & 7168) | (i110 & 57344));
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar10;
                        z6 = z7;
                        shcVar2 = shcVarA;
                        function4 = function5;
                        r48Var3 = r48Var4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar3 = bVar2;
                        function4 = function3;
                        z6 = z4;
                        shcVar2 = shcVarA;
                        r48Var3 = r48Var2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.uhc
                            public final Object invoke(Object obj, Object obj2) {
                                return t1.d(z, function1, bVar3, function4, z6, shcVar2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 1572864;
                r48Var2 = r48Var;
                if ((i3 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            shcVarA = thc.a.a(dVarF, 6);
                        }
                        if (i8 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        function5 = function3;
                        bVar5 = bVar4;
                    } else {
                        if (i10 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            shcVarA = thc.a.a(dVarF, 6);
                        }
                        if (i8 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        function5 = function3;
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-263339167, i3, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (r48Var4 == null) {
                        dVarF.y(1768604058);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = k26.a();
                            dVarF.L(objR);
                        }
                        dVarF.u();
                        r48Var5 = (r48) objR;
                    } else {
                        dVarF.y(334145757);
                        dVarF.u();
                        r48Var5 = r48Var4;
                    }
                    if (function1 != null) {
                        z7 = z4;
                        z8 = false;
                        bVarA = c9d.a(InteractiveComponentSizeKt.h(b.INSTANCE), z3, r48Var5, null, z7, hpa.j(hpa.INSTANCE.g()), function1);
                    } else {
                        z7 = z4;
                        z8 = false;
                        bVarA = b.INSTANCE;
                    }
                    int i112 = i3 << 3;
                    int i113 = i3 >> 6;
                    dVar2 = dVarF;
                    b bVar11 = bVar5;
                    e(SizeKt.n(SizeKt.E(bVar5.then(bVarA), tc.INSTANCE.e(), z8, 2, null), c, d), z, z7, shcVarA, function5, r48Var5, ulb.i(whc.a.m(), dVarF, 6), dVar2, (i112 & 112) | (i113 & 896) | (i113 & 7168) | (i112 & 57344));
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar11;
                    z6 = z7;
                    shcVar2 = shcVarA;
                    function4 = function5;
                    r48Var3 = r48Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    function4 = function3;
                    z6 = z4;
                    shcVar2 = shcVarA;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.uhc
                        public final Object invoke(Object obj, Object obj2) {
                            return t1.d(z, function1, bVar3, function4, z6, shcVar2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            z4 = z2;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    shcVarA = shcVar;
                    if (dVarF.x(shcVarA)) {
                    }
                    i3 |= i11;
                } else {
                    shcVarA = shcVar;
                }
                i3 |= i11;
            } else {
                shcVarA = shcVar;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    r48Var2 = r48Var;
                    if (dVarF.x(r48Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i3 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            shcVarA = thc.a.a(dVarF, 6);
                        }
                        if (i8 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        function5 = function3;
                        bVar5 = bVar4;
                    } else {
                        if (i10 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            shcVarA = thc.a.a(dVarF, 6);
                        }
                        if (i8 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        function5 = function3;
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-263339167, i3, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (r48Var4 == null) {
                        dVarF.y(1768604058);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = k26.a();
                            dVarF.L(objR);
                        }
                        dVarF.u();
                        r48Var5 = (r48) objR;
                    } else {
                        dVarF.y(334145757);
                        dVarF.u();
                        r48Var5 = r48Var4;
                    }
                    if (function1 != null) {
                        z7 = z4;
                        z8 = false;
                        bVarA = c9d.a(InteractiveComponentSizeKt.h(b.INSTANCE), z3, r48Var5, null, z7, hpa.j(hpa.INSTANCE.g()), function1);
                    } else {
                        z7 = z4;
                        z8 = false;
                        bVarA = b.INSTANCE;
                    }
                    int i114 = i3 << 3;
                    int i115 = i3 >> 6;
                    dVar2 = dVarF;
                    b bVar12 = bVar5;
                    e(SizeKt.n(SizeKt.E(bVar5.then(bVarA), tc.INSTANCE.e(), z8, 2, null), c, d), z, z7, shcVarA, function5, r48Var5, ulb.i(whc.a.m(), dVarF, 6), dVar2, (i114 & 112) | (i115 & 896) | (i115 & 7168) | (i114 & 57344));
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar12;
                    z6 = z7;
                    shcVar2 = shcVarA;
                    function4 = function5;
                    r48Var3 = r48Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    function4 = function3;
                    z6 = z4;
                    shcVar2 = shcVarA;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.uhc
                        public final Object invoke(Object obj, Object obj2) {
                            return t1.d(z, function1, bVar3, function4, z6, shcVar2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 1572864;
            r48Var2 = r48Var;
            if ((i3 & 599187) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dVarF.g(z5, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        function3 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        shcVarA = thc.a.a(dVarF, 6);
                    }
                    if (i8 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    function5 = function3;
                    bVar5 = bVar4;
                } else {
                    if (i10 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        function3 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        shcVarA = thc.a.a(dVarF, 6);
                    }
                    if (i8 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    function5 = function3;
                    bVar5 = bVar4;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-263339167, i3, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                }
                if (r48Var4 == null) {
                    dVarF.y(1768604058);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = k26.a();
                        dVarF.L(objR);
                    }
                    dVarF.u();
                    r48Var5 = (r48) objR;
                } else {
                    dVarF.y(334145757);
                    dVarF.u();
                    r48Var5 = r48Var4;
                }
                if (function1 != null) {
                    z7 = z4;
                    z8 = false;
                    bVarA = c9d.a(InteractiveComponentSizeKt.h(b.INSTANCE), z3, r48Var5, null, z7, hpa.j(hpa.INSTANCE.g()), function1);
                } else {
                    z7 = z4;
                    z8 = false;
                    bVarA = b.INSTANCE;
                }
                int i116 = i3 << 3;
                int i117 = i3 >> 6;
                dVar2 = dVarF;
                b bVar13 = bVar5;
                e(SizeKt.n(SizeKt.E(bVar5.then(bVarA), tc.INSTANCE.e(), z8, 2, null), c, d), z, z7, shcVarA, function5, r48Var5, ulb.i(whc.a.m(), dVarF, 6), dVar2, (i116 & 112) | (i117 & 896) | (i117 & 7168) | (i116 & 57344));
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar13;
                z6 = z7;
                shcVar2 = shcVarA;
                function4 = function5;
                r48Var3 = r48Var4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                function4 = function3;
                z6 = z4;
                shcVar2 = shcVarA;
                r48Var3 = r48Var2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.uhc
                    public final Object invoke(Object obj, Object obj2) {
                        return t1.d(z, function1, bVar3, function4, z6, shcVar2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                function3 = function2;
                if (dVarF.T(function3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    z4 = z2;
                    if (dVarF.A(z4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        shcVarA = shcVar;
                        if (dVarF.x(shcVarA)) {
                        }
                        i3 |= i11;
                    } else {
                        shcVarA = shcVar;
                    }
                    i3 |= i11;
                } else {
                    shcVarA = shcVar;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        r48Var2 = r48Var;
                        if (dVarF.x(r48Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 599187) != 599186) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                function3 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                shcVarA = thc.a.a(dVarF, 6);
                            }
                            if (i8 != 0) {
                                r48Var4 = null;
                            } else {
                                r48Var4 = r48Var2;
                            }
                            function5 = function3;
                            bVar5 = bVar4;
                        } else {
                            if (i10 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                function3 = null;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                shcVarA = thc.a.a(dVarF, 6);
                            }
                            if (i8 != 0) {
                                r48Var4 = null;
                            } else {
                                r48Var4 = r48Var2;
                            }
                            function5 = function3;
                            bVar5 = bVar4;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(-263339167, i3, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                        }
                        if (r48Var4 == null) {
                            dVarF.y(1768604058);
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = k26.a();
                                dVarF.L(objR);
                            }
                            dVarF.u();
                            r48Var5 = (r48) objR;
                        } else {
                            dVarF.y(334145757);
                            dVarF.u();
                            r48Var5 = r48Var4;
                        }
                        if (function1 != null) {
                            z7 = z4;
                            z8 = false;
                            bVarA = c9d.a(InteractiveComponentSizeKt.h(b.INSTANCE), z3, r48Var5, null, z7, hpa.j(hpa.INSTANCE.g()), function1);
                        } else {
                            z7 = z4;
                            z8 = false;
                            bVarA = b.INSTANCE;
                        }
                        int i118 = i3 << 3;
                        int i119 = i3 >> 6;
                        dVar2 = dVarF;
                        b bVar14 = bVar5;
                        e(SizeKt.n(SizeKt.E(bVar5.then(bVarA), tc.INSTANCE.e(), z8, 2, null), c, d), z, z7, shcVarA, function5, r48Var5, ulb.i(whc.a.m(), dVarF, 6), dVar2, (i118 & 112) | (i119 & 896) | (i119 & 7168) | (i118 & 57344));
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar14;
                        z6 = z7;
                        shcVar2 = shcVarA;
                        function4 = function5;
                        r48Var3 = r48Var4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar3 = bVar2;
                        function4 = function3;
                        z6 = z4;
                        shcVar2 = shcVarA;
                        r48Var3 = r48Var2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.uhc
                            public final Object invoke(Object obj, Object obj2) {
                                return t1.d(z, function1, bVar3, function4, z6, shcVar2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 1572864;
                r48Var2 = r48Var;
                if ((i3 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            shcVarA = thc.a.a(dVarF, 6);
                        }
                        if (i8 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        function5 = function3;
                        bVar5 = bVar4;
                    } else {
                        if (i10 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            shcVarA = thc.a.a(dVarF, 6);
                        }
                        if (i8 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        function5 = function3;
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-263339167, i3, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (r48Var4 == null) {
                        dVarF.y(1768604058);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = k26.a();
                            dVarF.L(objR);
                        }
                        dVarF.u();
                        r48Var5 = (r48) objR;
                    } else {
                        dVarF.y(334145757);
                        dVarF.u();
                        r48Var5 = r48Var4;
                    }
                    if (function1 != null) {
                        z7 = z4;
                        z8 = false;
                        bVarA = c9d.a(InteractiveComponentSizeKt.h(b.INSTANCE), z3, r48Var5, null, z7, hpa.j(hpa.INSTANCE.g()), function1);
                    } else {
                        z7 = z4;
                        z8 = false;
                        bVarA = b.INSTANCE;
                    }
                    int i1110 = i3 << 3;
                    int i1111 = i3 >> 6;
                    dVar2 = dVarF;
                    b bVar15 = bVar5;
                    e(SizeKt.n(SizeKt.E(bVar5.then(bVarA), tc.INSTANCE.e(), z8, 2, null), c, d), z, z7, shcVarA, function5, r48Var5, ulb.i(whc.a.m(), dVarF, 6), dVar2, (i1110 & 112) | (i1111 & 896) | (i1111 & 7168) | (i1110 & 57344));
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar15;
                    z6 = z7;
                    shcVar2 = shcVarA;
                    function4 = function5;
                    r48Var3 = r48Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    function4 = function3;
                    z6 = z4;
                    shcVar2 = shcVarA;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.uhc
                        public final Object invoke(Object obj, Object obj2) {
                            return t1.d(z, function1, bVar3, function4, z6, shcVar2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            z4 = z2;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    shcVarA = shcVar;
                    if (dVarF.x(shcVarA)) {
                    }
                    i3 |= i11;
                } else {
                    shcVarA = shcVar;
                }
                i3 |= i11;
            } else {
                shcVarA = shcVar;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    r48Var2 = r48Var;
                    if (dVarF.x(r48Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i3 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            shcVarA = thc.a.a(dVarF, 6);
                        }
                        if (i8 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        function5 = function3;
                        bVar5 = bVar4;
                    } else {
                        if (i10 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            shcVarA = thc.a.a(dVarF, 6);
                        }
                        if (i8 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        function5 = function3;
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-263339167, i3, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (r48Var4 == null) {
                        dVarF.y(1768604058);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = k26.a();
                            dVarF.L(objR);
                        }
                        dVarF.u();
                        r48Var5 = (r48) objR;
                    } else {
                        dVarF.y(334145757);
                        dVarF.u();
                        r48Var5 = r48Var4;
                    }
                    if (function1 != null) {
                        z7 = z4;
                        z8 = false;
                        bVarA = c9d.a(InteractiveComponentSizeKt.h(b.INSTANCE), z3, r48Var5, null, z7, hpa.j(hpa.INSTANCE.g()), function1);
                    } else {
                        z7 = z4;
                        z8 = false;
                        bVarA = b.INSTANCE;
                    }
                    int i1112 = i3 << 3;
                    int i1113 = i3 >> 6;
                    dVar2 = dVarF;
                    b bVar16 = bVar5;
                    e(SizeKt.n(SizeKt.E(bVar5.then(bVarA), tc.INSTANCE.e(), z8, 2, null), c, d), z, z7, shcVarA, function5, r48Var5, ulb.i(whc.a.m(), dVarF, 6), dVar2, (i1112 & 112) | (i1113 & 896) | (i1113 & 7168) | (i1112 & 57344));
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar16;
                    z6 = z7;
                    shcVar2 = shcVarA;
                    function4 = function5;
                    r48Var3 = r48Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    function4 = function3;
                    z6 = z4;
                    shcVar2 = shcVarA;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.uhc
                        public final Object invoke(Object obj, Object obj2) {
                            return t1.d(z, function1, bVar3, function4, z6, shcVar2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 1572864;
            r48Var2 = r48Var;
            if ((i3 & 599187) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dVarF.g(z5, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        function3 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        shcVarA = thc.a.a(dVarF, 6);
                    }
                    if (i8 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    function5 = function3;
                    bVar5 = bVar4;
                } else {
                    if (i10 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        function3 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        shcVarA = thc.a.a(dVarF, 6);
                    }
                    if (i8 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    function5 = function3;
                    bVar5 = bVar4;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-263339167, i3, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                }
                if (r48Var4 == null) {
                    dVarF.y(1768604058);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = k26.a();
                        dVarF.L(objR);
                    }
                    dVarF.u();
                    r48Var5 = (r48) objR;
                } else {
                    dVarF.y(334145757);
                    dVarF.u();
                    r48Var5 = r48Var4;
                }
                if (function1 != null) {
                    z7 = z4;
                    z8 = false;
                    bVarA = c9d.a(InteractiveComponentSizeKt.h(b.INSTANCE), z3, r48Var5, null, z7, hpa.j(hpa.INSTANCE.g()), function1);
                } else {
                    z7 = z4;
                    z8 = false;
                    bVarA = b.INSTANCE;
                }
                int i1114 = i3 << 3;
                int i1115 = i3 >> 6;
                dVar2 = dVarF;
                b bVar17 = bVar5;
                e(SizeKt.n(SizeKt.E(bVar5.then(bVarA), tc.INSTANCE.e(), z8, 2, null), c, d), z, z7, shcVarA, function5, r48Var5, ulb.i(whc.a.m(), dVarF, 6), dVar2, (i1114 & 112) | (i1115 & 896) | (i1115 & 7168) | (i1114 & 57344));
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar17;
                z6 = z7;
                shcVar2 = shcVarA;
                function4 = function5;
                r48Var3 = r48Var4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                function4 = function3;
                z6 = z4;
                shcVar2 = shcVarA;
                r48Var3 = r48Var2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.uhc
                    public final Object invoke(Object obj, Object obj2) {
                        return t1.d(z, function1, bVar3, function4, z6, shcVar2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        function3 = function2;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                z4 = z2;
                if (dVarF.A(z4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    shcVarA = shcVar;
                    if (dVarF.x(shcVarA)) {
                    }
                    i3 |= i11;
                } else {
                    shcVarA = shcVar;
                }
                i3 |= i11;
            } else {
                shcVarA = shcVar;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    r48Var2 = r48Var;
                    if (dVarF.x(r48Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i3 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            shcVarA = thc.a.a(dVarF, 6);
                        }
                        if (i8 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        function5 = function3;
                        bVar5 = bVar4;
                    } else {
                        if (i10 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            function3 = null;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            shcVarA = thc.a.a(dVarF, 6);
                        }
                        if (i8 != 0) {
                            r48Var4 = null;
                        } else {
                            r48Var4 = r48Var2;
                        }
                        function5 = function3;
                        bVar5 = bVar4;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-263339167, i3, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (r48Var4 == null) {
                        dVarF.y(1768604058);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = k26.a();
                            dVarF.L(objR);
                        }
                        dVarF.u();
                        r48Var5 = (r48) objR;
                    } else {
                        dVarF.y(334145757);
                        dVarF.u();
                        r48Var5 = r48Var4;
                    }
                    if (function1 != null) {
                        z7 = z4;
                        z8 = false;
                        bVarA = c9d.a(InteractiveComponentSizeKt.h(b.INSTANCE), z3, r48Var5, null, z7, hpa.j(hpa.INSTANCE.g()), function1);
                    } else {
                        z7 = z4;
                        z8 = false;
                        bVarA = b.INSTANCE;
                    }
                    int i1116 = i3 << 3;
                    int i1117 = i3 >> 6;
                    dVar2 = dVarF;
                    b bVar18 = bVar5;
                    e(SizeKt.n(SizeKt.E(bVar5.then(bVarA), tc.INSTANCE.e(), z8, 2, null), c, d), z, z7, shcVarA, function5, r48Var5, ulb.i(whc.a.m(), dVarF, 6), dVar2, (i1116 & 112) | (i1117 & 896) | (i1117 & 7168) | (i1116 & 57344));
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar18;
                    z6 = z7;
                    shcVar2 = shcVarA;
                    function4 = function5;
                    r48Var3 = r48Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    function4 = function3;
                    z6 = z4;
                    shcVar2 = shcVarA;
                    r48Var3 = r48Var2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.uhc
                        public final Object invoke(Object obj, Object obj2) {
                            return t1.d(z, function1, bVar3, function4, z6, shcVar2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 1572864;
            r48Var2 = r48Var;
            if ((i3 & 599187) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dVarF.g(z5, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        function3 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        shcVarA = thc.a.a(dVarF, 6);
                    }
                    if (i8 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    function5 = function3;
                    bVar5 = bVar4;
                } else {
                    if (i10 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        function3 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        shcVarA = thc.a.a(dVarF, 6);
                    }
                    if (i8 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    function5 = function3;
                    bVar5 = bVar4;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-263339167, i3, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                }
                if (r48Var4 == null) {
                    dVarF.y(1768604058);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = k26.a();
                        dVarF.L(objR);
                    }
                    dVarF.u();
                    r48Var5 = (r48) objR;
                } else {
                    dVarF.y(334145757);
                    dVarF.u();
                    r48Var5 = r48Var4;
                }
                if (function1 != null) {
                    z7 = z4;
                    z8 = false;
                    bVarA = c9d.a(InteractiveComponentSizeKt.h(b.INSTANCE), z3, r48Var5, null, z7, hpa.j(hpa.INSTANCE.g()), function1);
                } else {
                    z7 = z4;
                    z8 = false;
                    bVarA = b.INSTANCE;
                }
                int i1118 = i3 << 3;
                int i1119 = i3 >> 6;
                dVar2 = dVarF;
                b bVar19 = bVar5;
                e(SizeKt.n(SizeKt.E(bVar5.then(bVarA), tc.INSTANCE.e(), z8, 2, null), c, d), z, z7, shcVarA, function5, r48Var5, ulb.i(whc.a.m(), dVarF, 6), dVar2, (i1118 & 112) | (i1119 & 896) | (i1119 & 7168) | (i1118 & 57344));
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar19;
                z6 = z7;
                shcVar2 = shcVarA;
                function4 = function5;
                r48Var3 = r48Var4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                function4 = function3;
                z6 = z4;
                shcVar2 = shcVarA;
                r48Var3 = r48Var2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.uhc
                    public final Object invoke(Object obj, Object obj2) {
                        return t1.d(z, function1, bVar3, function4, z6, shcVar2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        z4 = z2;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                shcVarA = shcVar;
                if (dVarF.x(shcVarA)) {
                }
                i3 |= i11;
            } else {
                shcVarA = shcVar;
            }
            i3 |= i11;
        } else {
            shcVarA = shcVar;
        }
        i8 = i2 & 64;
        if (i8 != 0) {
            if ((1572864 & i) == 0) {
                r48Var2 = r48Var;
                if (dVarF.x(r48Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((i3 & 599187) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dVarF.g(z5, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        function3 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        shcVarA = thc.a.a(dVarF, 6);
                    }
                    if (i8 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    function5 = function3;
                    bVar5 = bVar4;
                } else {
                    if (i10 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        function3 = null;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        shcVarA = thc.a.a(dVarF, 6);
                    }
                    if (i8 != 0) {
                        r48Var4 = null;
                    } else {
                        r48Var4 = r48Var2;
                    }
                    function5 = function3;
                    bVar5 = bVar4;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-263339167, i3, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                }
                if (r48Var4 == null) {
                    dVarF.y(1768604058);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = k26.a();
                        dVarF.L(objR);
                    }
                    dVarF.u();
                    r48Var5 = (r48) objR;
                } else {
                    dVarF.y(334145757);
                    dVarF.u();
                    r48Var5 = r48Var4;
                }
                if (function1 != null) {
                    z7 = z4;
                    z8 = false;
                    bVarA = c9d.a(InteractiveComponentSizeKt.h(b.INSTANCE), z3, r48Var5, null, z7, hpa.j(hpa.INSTANCE.g()), function1);
                } else {
                    z7 = z4;
                    z8 = false;
                    bVarA = b.INSTANCE;
                }
                int i11110 = i3 << 3;
                int i11111 = i3 >> 6;
                dVar2 = dVarF;
                b bVar110 = bVar5;
                e(SizeKt.n(SizeKt.E(bVar5.then(bVarA), tc.INSTANCE.e(), z8, 2, null), c, d), z, z7, shcVarA, function5, r48Var5, ulb.i(whc.a.m(), dVarF, 6), dVar2, (i11110 & 112) | (i11111 & 896) | (i11111 & 7168) | (i11110 & 57344));
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar110;
                z6 = z7;
                shcVar2 = shcVarA;
                function4 = function5;
                r48Var3 = r48Var4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                function4 = function3;
                z6 = z4;
                shcVar2 = shcVarA;
                r48Var3 = r48Var2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.uhc
                    public final Object invoke(Object obj, Object obj2) {
                        return t1.d(z, function1, bVar3, function4, z6, shcVar2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 1572864;
        r48Var2 = r48Var;
        if ((i3 & 599187) != 599186) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (dVarF.g(z5, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    function3 = null;
                }
                if (i6 != 0) {
                    z4 = true;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    shcVarA = thc.a.a(dVarF, 6);
                }
                if (i8 != 0) {
                    r48Var4 = null;
                } else {
                    r48Var4 = r48Var2;
                }
                function5 = function3;
                bVar5 = bVar4;
            } else {
                if (i10 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    function3 = null;
                }
                if (i6 != 0) {
                    z4 = true;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    shcVarA = thc.a.a(dVarF, 6);
                }
                if (i8 != 0) {
                    r48Var4 = null;
                } else {
                    r48Var4 = r48Var2;
                }
                function5 = function3;
                bVar5 = bVar4;
            }
            dVarF.M();
            if (e.k()) {
                e.o(-263339167, i3, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
            }
            if (r48Var4 == null) {
                dVarF.y(1768604058);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = k26.a();
                    dVarF.L(objR);
                }
                dVarF.u();
                r48Var5 = (r48) objR;
            } else {
                dVarF.y(334145757);
                dVarF.u();
                r48Var5 = r48Var4;
            }
            if (function1 != null) {
                z7 = z4;
                z8 = false;
                bVarA = c9d.a(InteractiveComponentSizeKt.h(b.INSTANCE), z3, r48Var5, null, z7, hpa.j(hpa.INSTANCE.g()), function1);
            } else {
                z7 = z4;
                z8 = false;
                bVarA = b.INSTANCE;
            }
            int i11112 = i3 << 3;
            int i11113 = i3 >> 6;
            dVar2 = dVarF;
            b bVar111 = bVar5;
            e(SizeKt.n(SizeKt.E(bVar5.then(bVarA), tc.INSTANCE.e(), z8, 2, null), c, d), z, z7, shcVarA, function5, r48Var5, ulb.i(whc.a.m(), dVarF, 6), dVar2, (i11112 & 112) | (i11113 & 896) | (i11113 & 7168) | (i11112 & 57344));
            if (e.k()) {
                e.n();
            }
            bVar3 = bVar111;
            z6 = z7;
            shcVar2 = shcVarA;
            function4 = function5;
            r48Var3 = r48Var4;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bVar3 = bVar2;
            function4 = function3;
            z6 = z4;
            shcVar2 = shcVarA;
            r48Var3 = r48Var2;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.uhc
                public final Object invoke(Object obj, Object obj2) {
                    return t1.d(z, function1, bVar3, function4, z6, shcVar2, r48Var3, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit d(boolean z, Function1 function1, b bVar, Function2 function2, boolean z2, shc shcVar, r48 r48Var, int i, int i2, d dVar, int i3) throws NoWhenBranchMatchedException {
        c(z, function1, bVar, function2, z2, shcVar, r48Var, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final void e(final b bVar, final boolean z, final boolean z2, final shc shcVar, final Function2<? super d, ? super Integer, Unit> function2, final j26 j26Var, xkb xkbVar, d dVar, final int i) throws NoWhenBranchMatchedException {
        int i2;
        final xkb xkbVar2 = xkbVar;
        d dVarF = dVar.F(-670917213);
        if ((i & 6) == 0) {
            i2 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.A(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.A(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dVarF.x(shcVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dVarF.T(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dVarF.x(j26Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= dVarF.x(xkbVar2) ? 1048576 : 524288;
        }
        if (dVarF.g((599187 & i2) != 599186, i2 & 1)) {
            if (e.k()) {
                e.o(-670917213, i2, -1, "androidx.compose.material3.SwitchImpl (Switch.kt:143)");
            }
            long jD = shcVar.d(z2, z);
            long jC = shcVar.c(z2, z);
            whc whcVar = whc.a;
            xkb xkbVarI = ulb.i(whcVar.v(), dVarF, 6);
            b bVarC = BackgroundKt.c(gr0.h(bVar, whcVar.u(), shcVar.a(z2, z), xkbVarI), jD, xkbVarI);
            tc.Companion companion = tc.INSTANCE;
            ej7 ej7VarI = j.i(companion.o(), false);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            b bVarE = ComposedModifierKt.e(dVarF, bVarC);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
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
            dud.i(dVarC, ej7VarI, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            b bVarE2 = IndicationKt.e(BoxScopeInstance.a.k(b.INSTANCE, companion.h()).then(new ThumbElement(j26Var, z, d08.b(MotionSchemeKeyTokens.FastSpatial, dVarF, 6))), j26Var, xoa.e(false, ff3.i(whcVar.s() / 2), 0L, 4, null));
            xkbVar2 = xkbVar;
            b bVarC2 = BackgroundKt.c(bVarE2, jC, xkbVar2);
            ej7 ej7VarI2 = j.i(companion.e(), false);
            int iA2 = pp1.a(dVarF, 0);
            gs1 gs1VarJ2 = dVarF.j();
            b bVarE3 = ComposedModifierKt.e(dVarF, bVarC2);
            Function0<ComposeUiNode> function0B2 = companion2.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B2);
            } else {
                dVarF.k();
            }
            d dVarC2 = dud.c(dVarF);
            dud.i(dVarC2, ej7VarI2, companion2.d());
            dud.i(dVarC2, gs1VarJ2, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C2 = companion2.c();
            if (dVarC2.getInserting() || !Intrinsics.e(dVarC2.R(), Integer.valueOf(iA2))) {
                dVarC2.L(Integer.valueOf(iA2));
                dVarC2.e(Integer.valueOf(iA2), function2C2);
            }
            dud.i(dVarC2, bVarE3, companion2.e());
            if (function2 != null) {
                dVarF.y(1235836927);
                fs1.c(cz1.a().d(ei1.l(shcVar.b(z2, z))), function2, dVarF, os9.i | ((i2 >> 9) & 112));
                dVarF.u();
            } else {
                dVarF.y(1236071411);
                dVarF.u();
            }
            dVarF.m();
            dVarF.m();
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.vhc
                public final Object invoke(Object obj, Object obj2) {
                    return t1.f(bVar, z, z2, shcVar, function2, j26Var, xkbVar2, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit f(b bVar, boolean z, boolean z2, shc shcVar, Function2 function2, j26 j26Var, xkb xkbVar, int i, d dVar, int i2) throws NoWhenBranchMatchedException {
        e(bVar, z, z2, shcVar, function2, j26Var, xkbVar, dVar, saa.a(i | 1));
        return Unit.a;
    }

    public static final float k() {
        return a;
    }

    public static final float l() {
        return b;
    }
}
